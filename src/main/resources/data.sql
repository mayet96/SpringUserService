INSERT INTO Person (id, version, first_name, second_name, birth, email, password)
    VALUES (1, 0, 'Пётр', 'Петров', CAST('1986-01-02' AS DATE), 'pp@post.com', '123456');
INSERT INTO Person (id, version, first_name, second_name, birth, email, password)
    VALUES (2, 0, 'Иван', 'Иванов', CAST('1991-05-10' AS DATE), 'ii@post.com', 'qwerty');
