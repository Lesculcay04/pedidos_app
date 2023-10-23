CREATE TABLE IF NOT EXISTS cliente(
    id INT PRIMARY KEY,
    nombre VARCHAR(255),
    direccion VARCHAR(255),
    telefono VARCHAR(20)
);
CREATE TABLE IF NOT EXISTS pedido(
    id_pedido INT PRIMARY KEY,
    fechaPedido DATE,
    total DECIMAL(10, 2),
    id INT,
    FOREIGN KEY (id) REFERENCES cliente(id)
    );
