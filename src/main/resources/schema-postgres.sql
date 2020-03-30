CREATE SEQUENCE teacher_seq START WITH 1 INCREMENT BY 1 NO CYCLE;

CREATE TABLE TEACHER (
   ID BIGINT PRIMARY KEY,
   SCHOOL_ID BIGINT NOT NULL,
   FIRST_NAME VARCHAR(256) NOT NULL,
   LAST_NAME VARCHAR(256) NOT NULL
);
COMMIT;