INSERT INTO users (id, user_name, email, password, status) VALUES 
('1', 'Robert Baratheon', 'Robert@example.com', 'secured1', 'ACTIVE'),
('2', 'Petyr Baelish', 'Petyr@example.com', 'secured1', 'ACTIVE'),
('3', 'Tyrion Lannister', 'Tyrion@example.com', 'secured1', 'ACTIVE'),
('4', 'Jaime Lannister', 'Jaime@example.com', 'secured1', 'ACTIVE'),
('5', 'Cersei Lannister', 'Cersei@example.com', 'secured1', 'ACTIVE'),
('6', 'Catelyn Stark', 'Catelyn@example.com', 'secured1', 'ACTIVE'),
('7', 'Daenerys Targaryen', 'Daenerys@example.com', 'secured1', 'ACTIVE'),
('8', 'Jorah Mormont', 'Jorah@example.com', 'secured1', 'ACTIVE'),
('9', 'Viserys Targaryen', 'Viserys@example.com', 'secured1', 'ACTIVE'),
('10', 'Ned Stark', 'Ned@example.com', 'secured1', 'ACTIVE'),
('12', 'Jon Snow', 'jon@example.com', 'secured1', 'ACTIVE'),
('13', 'Robb Stark', 'Robb@example.com', 'secured2', 'INACTIVE'),
('14', 'Sansa Stark', 'Sansa@example.com', 'secured2', 'INACTIVE'),
('15', 'Arya Stark', 'Arya@example.com', 'secured2', 'INACTIVE'),
('16', 'Bran Stark', 'Bran@example.com', 'secured2', 'INACTIVE'),
('17', 'Theon Greyjoy', 'Theon@example.com', 'secured2', 'INACTIVE');

INSERT INTO artists (artist_id, name, Legal_name) VALUES
('1', 'The Beatles', 'The Beatles' ),
('2', 'THE WEEKEND', 'Abel Makkonen Tesfaye' ),
('3', 'COLDPLAY', 'Tim Bergling' ),
('4', 'Michael Jackson', 'Michael Jackson' ),
('5', 'THE ROLLING STONES', 'THE ROLLING STONES' );

INSERT INTO albums (album_id, name, genre, release_date) VALUES
('1', 'Abbey Road', 'ROCK', '2021-06-01 18:13:15' ),
('2', 'After Hours', 'POP', '2021-06-01 18:13:15' ),
('3', 'A head full of dreams', 'POP', '2021-06-01 18:13:15' ),
('4', 'Bad', 'POP', '2021-06-01 18:13:15' ),
('5', 'aftermath', 'POP', '2021-06-01 18:13:15' );

INSERT INTO songs (song_id, name, duration) VALUES
('1', 'come together', 251.4 ),
('2', 'here comes the sun', 4.03 ),
('3', 'because', 4.03 ),
('4', 'oh darling', 4.03 ),
('5', 'something', 4.03 ),

('6', 'save your tears', 4.03 ),
('7', 'blinding lights', 4.03 ),
('8', 'faith', 4.03),
('9', 'alone again', 4.03 ),

('10', 'hymn for the weekend', 4.0 ),
('11', 'adventure of a lifetime', 4.0 ),
('12', 'up&up', 4.0 ),
('13', 'birds', 4.0 ),
('14', 'a head full of dreams', 4.0 ),

('15', 'I just cant stop loving you', 4.0 ),
('16', 'Bad', 4.0 ),
('17', 'the way you make me feel', 4.0 ),
('18', 'Man in the mirror', 4.0 ),
('19', 'smooth criminal', 4.0 ),
('20', 'dirty diana', 4.0 ),

('21', 'paint it black', 4.0 ),
('22', 'stupid girl', 4.0 ),
('23', 'lady jane', 4.0 ),
('24', 'think', 4.0 ),
('25', 'its not easy', 4.0 );


INSERT INTO rel_artist_album (artist_id, album_id) VALUES
(1, 1 ),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

INSERT INTO rel_album_songs (album_id, song_id) VALUES
(1, 1 ),
(1, 2 ),
(1, 3 ),
(1, 4 ),
(1, 5 ),

(2, 6 ),
(2, 7 ),
(2, 8 ),
(2, 9 ),

(3, 10 ),
(3, 11 ),
(3, 12 ),
(3, 13 ),
(3, 14 ),

(4, 15 ),
(4, 16 ),
(4, 17 ),
(4, 18 ),
(4, 19 ),
(4, 20 ),

(5, 21 ),
(5, 22 ),
(5, 23 ),
(5, 24 ),
(5, 25 );

