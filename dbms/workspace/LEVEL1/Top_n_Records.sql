SELECT NAME from ANIMAL_INS
WHERE DATETIME = (
    SELECT MIN(DATETIME) from ANIMAL_INS
);