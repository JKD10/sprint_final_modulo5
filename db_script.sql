CREATE DATABASE prevencion_riesgos;
USE prevencion_riesgos;

-- Tabla "Usuarios"
CREATE TABLE usuarios (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  apellido VARCHAR (100) NOT NULL,
  user VARCHAR (30) NOT NULL UNIQUE,
  pass VARCHAR (30) NOT NULL,
  tipo_usuario INT NOT NULL,
  empresa VARCHAR (50) NOT NULL,
  cargo VARCHAR (50) NOT NULL,
  correo VARCHAR (50)
);

insert into usuarios(nombre, apellido, user, pass, tipo_usuario, empresa, cargo) values('Pato', 'Aliaga', 'admin', 'admin', 1, 'Prevención S.A', 'Administrador');
insert into usuarios(nombre, apellido, user, pass, tipo_usuario, empresa, cargo) values('Juan', 'Perez', 'cliente', 'cliente', 2, 'Forestal acme', 'Gerente');
insert into usuarios(nombre, apellido, user, pass, tipo_usuario, empresa, cargo) values('Jose', 'Ramirez', 'cliente01', 'cliente01', 2, 'Botilleria acme', 'Bodeguero');
insert into usuarios(nombre, apellido, user, pass, tipo_usuario, empresa, cargo) values('jocelyn', 'Reyes', 'cliente02', 'cliente02', 2, 'Carniceria acme', 'Cajera');
insert into usuarios(nombre, apellido, user, pass, tipo_usuario, empresa, cargo) values('Alan', 'Brito', 'profesional', 'profesional', 3, 'Prevención S.A', 'Relator');
insert into usuarios(nombre, apellido, user, pass, tipo_usuario, empresa, cargo) values('Armando', 'Casas', 'profesional01', 'profesional01', 3, 'Prevención S.A', 'Relator');
insert into usuarios(nombre, apellido, user, pass, tipo_usuario, empresa, cargo) values('Esteban', 'Quito', 'profesional02', 'profesional02', 3, 'Prevención S.A', 'Relator');