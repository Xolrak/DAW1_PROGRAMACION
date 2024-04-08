-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS sistema_reservas_vuelos;

-- Usar la base de datos creada
USE sistema_reservas_vuelos;

-- Crear tabla Vuelos
CREATE TABLE IF NOT EXISTS Vuelos (
    id_vuelo INT AUTO_INCREMENT PRIMARY KEY,
    numero_vuelo VARCHAR(20),
    origen VARCHAR(50),
    destino VARCHAR(50),
    fecha DATE,
    capacidad INT
);

-- Crear tabla Pasajeros
CREATE TABLE IF NOT EXISTS Pasajeros (
    id_pasajero INT AUTO_INCREMENT PRIMARY KEY,
    numero_pasaporte VARCHAR(20),
    nombre_pasajero VARCHAR(100)
);

-- Crear tabla Vuelos_Pasajeros
CREATE TABLE IF NOT EXISTS Vuelos_Pasajeros (
    id_vuelo INT,
    id_pasajero INT,
    n_asiento INT,
    PRIMARY KEY (id_vuelo, id_pasajero),
    FOREIGN KEY (id_vuelo) REFERENCES Vuelos(id_vuelo),
    FOREIGN KEY (id_pasajero) REFERENCES Pasajeros(id_pasajero)
);
