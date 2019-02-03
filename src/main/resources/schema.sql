CREATE TABLE IF NOT EXISTS person (
    id         INTEGER              COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT ,
    version    INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
    first_name VARCHAR(50) NOT NULL COMMENT 'Имя',
    second_name VARCHAR(50) NOT NULL COMMENT 'фамилия',
    birth      DATE  NOT NULL       COMMENT 'Дата рождения',
    email      VARCHAR(50) NOT NULL COMMENT 'почта пользователя',
    password   VARCHAR(50) NOT NULL COMMENT 'пароль пользователя'
);
