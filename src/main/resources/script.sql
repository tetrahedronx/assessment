CREATE TABLE IF NOT EXISTS movie (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    category VARCHAR(100),
    rating VARCHAR(10)
);

INSERT INTO movie(title,category,rating) VALUES ('The Dark Knight','Action','9.0');
INSERT INTO movie(title,category,rating) VALUES ('The Lord of the Rings: The Return of the King','Action','8.0');
INSERT INTO movie(title,category,rating) VALUES ('The Matrix','Action','8.5');