CREATE TABLE movie_details (
    movie_id INT AUTO_INCREMENT PRIMARY KEY,
    movie_title VARCHAR(255) NOT NULL,
    movie_language VARCHAR(255) NOT NULL,
    movie_release_date DATE NOT NULL,
    movie_image_url VARCHAR(255)
);
