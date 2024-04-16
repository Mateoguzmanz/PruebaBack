CREATE DATABASE Datos_Registro;
USE Datos_Registro; 

CREATE TABLE usuarios (
    id BIGINT IDENTITY(1,1) PRIMARY KEY,
    nombre_usuario NVARCHAR(255) NOT NULL UNIQUE,
    correo_electronico NVARCHAR(255) NOT NULL UNIQUE,
    contrasena NVARCHAR(255) NOT NULL
);

INSERT INTO usuarios (nombre_usuario, correo_electronico, contrasena) VALUES
('usuario1', 'usuario1@example.com', 'contraseña1'),
('usuario2', 'usuario2@example.com', 'contraseña2'),
('usuario3', 'usuario3@example.com', 'contraseña3'),
('usuario4', 'usuario4@example.com', 'contraseña4'),
('usuario5', 'usuario5@example.com', 'contraseña5');

UPDATE usuarios
SET contrasena = HASHBYTES('SHA2_256', contrasena);


SELECT * FROM usuarios;




