-- SQLite
CREATE TABLE customers (
    id          BIGINT      NOT NULL,
    name        VARCAHR(20) NOT NULL,
    age         INT,
    rank        VARCHAR(10) NOT NULL,
    occupation  VARCHAR(50),
    savings     INT         DEFAULT 0,

    PRIMARY KEY(id),
    CHECK(age >= 0)
);