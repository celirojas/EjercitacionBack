DROP TABLE IF EXISTS domicilios;
CREATE TABLE domicilios (ID INT AUTO_INCREMENT PRIMARY KEY,
CALLE varchar(200),
NUMERO INT,
LOCALIDAD varchar(200),
PROVINCIA varchar(200)
);

DROP TABLE IF EXISTS pacientes;
CREATE TABLE pacientes (ID INT AUTO_INCREMENT PRIMARY KEY,
NOMBRE varchar(200),
APELLIDO varchar(200),
DNI int,
FECHA_INGRESO DATE,
DOMICILIO_ID INT
);


INSERT INTO domicilios (calle, numero, localidad, provincia) VALUES ('CalleA', 567, 'localidad1', 'Buenos Aires');
INSERT INTO domicilios (calle, numero, localidad, provincia) VALUES ('CalleB', 789, 'localidad2', 'Salta');

INSERT INTO  pacientes (nombre, apellido, dni, fecha_ingreso, domicilio_id) VALUES ('Juana', 'Perez', 43566788, '2022-06-01', 1);
INSERT INTO  pacientes (nombre, apellido, dni, fecha_ingreso, domicilio_id) VALUES ('Ramon', 'Gomez', 40346788, '2022-06-02', 2);