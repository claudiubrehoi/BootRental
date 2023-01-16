CREATE SEQUENCE client_id_seq START 1;
CREATE SEQUENCE product_id_seq START 1;
CREATE SEQUENCE rental_id_seq START 1;

CREATE TABLE IF NOT EXISTS client
(
    id bigint NOT NULL DEFAULT nextval('client_id_seq'::regclass),
    address character varying(100) COLLATE pg_catalog."default" NOT NULL,
    client_type character varying(30) COLLATE pg_catalog."default" NOT NULL,
    first_name character varying(30) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(30) COLLATE pg_catalog."default" NOT NULL,
    phone character varying(30) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT client_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS product
(
    id bigint NOT NULL DEFAULT nextval('product_id_seq'::regclass),
    comments character varying(150) COLLATE pg_catalog."default",
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    product_type character varying(20) COLLATE pg_catalog."default" NOT NULL,
    size character varying(10) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT product_pkey PRIMARY KEY (id),
    CONSTRAINT uk_jmivyxk9rmgysrmsqw15lqr5b UNIQUE (name)
);

CREATE TABLE IF NOT EXISTS rental
(
    id bigint NOT NULL DEFAULT nextval('rental_id_seq'::regclass),
    end_date timestamp(6) without time zone,
    price numeric(38,2),
    start_date timestamp(6) without time zone,
    client_id bigint,
    product_id bigint,
    CONSTRAINT rental_pkey PRIMARY KEY (id),
    CONSTRAINT fkfurpp295i3dhumquorur054dw FOREIGN KEY (client_id)
        REFERENCES client (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fks9g0xujsstw853392pqi2mjgk FOREIGN KEY (product_id)
        REFERENCES product (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);