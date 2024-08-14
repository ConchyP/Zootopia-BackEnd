/* Animals Table
 */
INSERT INTO animals (animal_type, specie, name, gender, date)
VALUES ('Feline', 'Lion', 'Simba', 'M', '2023-08-09');
INSERT INTO animals (animal_type, specie, name, gender, date)
VALUES ('Reptile', 'Caiman', 'Wally', 'M', '2024-08-11');
INSERT INTO animals (animal_type, specie, name, gender, date)
VALUES ('Feline', 'Lion', 'Bad', 'M', '2023-08-09');

/* ADMIN TABLE */

INSERT INTO admins (email, password, role) VALUES ('flash@gmail.com', '{bcrypt}$2a$12$CpLpmTSK3LqKcVcD/wJaj.URGybXR0fCtLnNynPvwlNQDJT8NGH.O', 'ROLE_ADMIN');

