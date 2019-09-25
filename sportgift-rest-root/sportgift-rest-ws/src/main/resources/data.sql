INSERT INTO country (name) VALUES
  ('Cuba'),
  ('Ecuador'),
  ('Venezuela');

  INSERT INTO city (country_id, name) VALUES
  (1,'Habana'),
  (1,'Santiago de Cuba'),
  (1,'Holguin'),
  (2, 'Quito'),
  (2, 'Manta'),
  (2, 'Guayaquil'),
  (3, 'Caracas'),
  (3, 'Sucre'),
  (3, 'Bolivar');

  INSERT INTO competitor (name, city_id, username, password, avatar, weight, height, gender, date_birth, address, facebook, instagram, twitter, registration, status) VALUES
  ('Julian Perez Perez', 2, 'julian', 'Password01', 'Drax', 70.2, 1.73, 'M', '1966-03-23','District', 'facexx', 'instagranxxx', 'twitterxxx', CURRENT_TIMESTAMP, 1),
  ('Joseito Leon', 2, 'jose', 'Password02', 'Junx', 45.2, 1.73, 'M', '1985-11-11','District', 'facexx', 'instagranxxx', 'twitterxxx', CURRENT_TIMESTAMP, 1);

