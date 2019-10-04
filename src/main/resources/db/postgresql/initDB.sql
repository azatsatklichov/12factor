
--ALTER TABLE book DROP CONSTRAINT pk_book;
--DROP TABLE book;


CREATE TABLE IF NOT EXISTS movie (
  id SERIAL,
   title varchar,
   year varchar,
   rating varchar,
  CONSTRAINT pk_book PRIMARY KEY (id)
);

--ALTER TABLE "user" DROP CONSTRAINT pk_user;
--DROP TABLE "user";

