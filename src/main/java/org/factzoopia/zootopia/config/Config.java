package org.factzoopia.zootopia.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity

public class Config {

    @Value("${api-endpoint}" ) //api/v1
    String endpoint;


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .cors(Customizer.withDefaults())
            .csrf(csrf -> csrf.disable())
            .formLogin(form -> form.disable())
            .logout(out -> out
                .logoutUrl(endpoint + "/logout")
                .deleteCookies("Cookie_1")
                )
            .authorizeHttpRequests(auth -> auth
            .requestMatchers("api/v1/animals").permitAll()
                .anyRequest().authenticated())
            .httpBasic(Customizer.withDefaults());

            return http.build();
    }
    
   @Bean
CorsConfigurationSource corsConfigurationSource() {
	CorsConfiguration configuration = new CorsConfiguration();
    configuration.setAllowCredentials(true);
	configuration.setAllowedOrigins(Arrays.asList("localhost:5173"));
	configuration.setAllowedMethods(Arrays.asList("GET","POST", "PUT", "DELETE"));
	UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	source.registerCorsConfiguration("/**", configuration);
	return source;
}
}
