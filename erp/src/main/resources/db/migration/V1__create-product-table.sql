CREATE TABLE product (
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    name TEXT NOT NULL,
    cost DECIMAL(10,2),
    expense INTEGER,
    margin INTEGER,
    price DECIMAL(10,2) NOT NULL
);