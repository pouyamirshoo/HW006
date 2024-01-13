CREATE TABLE IF NOT EXISTS writers(
    writer_id SERIAL PRIMARY KEY ,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    age INT
);

CREATE TABLE IF NOT EXISTS books(
    book_id SERIAL PRIMARY KEY ,
    book_name VARCHAR(255),
    year_of_publish DATE,
    writer_id_fk INT REFERENCES writers(writer_id)
);