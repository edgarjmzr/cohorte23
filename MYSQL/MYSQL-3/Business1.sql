USE business;

-- Revisar employee
SELECT * FROM employee;

-- ALIAS
SELECT last_name AS 'Apellido' FROM employee;

-- ALIAS ++
SELECT
    employee_id AS 'ID',
    first_name AS 'Nombre',
    last_name AS 'Apellido',
    department AS 'Departamento'
FROM employee;

-- Filtrar por nombre
-- BUSCAR a Monika
SELECT * FROM employee
WHERE first_name = 'Monika';

-- Filtrar doble
SELECT * FROM 	employee
WHERE salary = 500000 AND first_name = 'Vivek';

-- Filtrar por NOT
SELECT * FROM employee
WHERE NOT first_name = 'Barrack';

-- Filtrar por doble negacion
SELECT * FROM employee
WHERE NOT first_name = 'Santiago' AND NOT first_name = 'Ian';


-- Ordenamiento
-- ORDER BY
-- Default puede ser orden Ascendente o no, depende la config
SELECT * FROM employee
ORDER BY department ASC;

-- Desc
SELECT * FROM employee
ORDER BY department DESC;
-- DOuBLE order by
SELECT * FROM employee
ORDER BY department ASC, last_name DESC;

-- GROUP BY. Agrupar significa que se coloquen enuna misma fila
SELECT * FROM employee
GROUP BY salary;

-- IN
SELECT * FROM employee
WHERE employee_id IN (1, 3, 7, 8, 5);

--  BETWEEN
SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

--  BETWEEN NOT
SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;
-- hace lo que te imaginas que hace, son rangos inclusivos

-- LIMIT
SELECT * FROM employee
LIMIT 3;

-- LIMIT + OFFSET
    SELECT * FROM employee
    LIMIT 3 OFFSET 5;

-- LIKE busca los que empiecen por B no es cap sensitive
    SELECT * FROM employee
    WHERE last_name LIKE 'B%';
    -- Los signos de porcentaje te dicen donde van más letras o caracteres diferentes al que
    -- queremos checar! 
	-- Naturalmente LIKE no es case-sensitive
    
-- Busca los que terminan con A forzar mayusculas con BINARY
-- Case sensitive
SELECT * FROM employee
WHERE last_name LIKE BINARY '%A';
-- Si hay apellidos que terminen en 'a' pero con BINARY se hace case-sensitive el filtro
 -- no hay apellidos que terminen con A mayúscula en la tabla

-- Otro ejemplo acá abajo de los porcentajes
-- LIKE ++
SELECT * FROM employee
WHERE join_date LIKE '%2014-02%';
-- UPDATE INFO
UPDATE employee
    SET salary = 300000
WHERE employee_id = 5;

-- ***********INSTRUCCION: CAMBIAR LOS SALARIOS DE TODO MUNDO, SUS ANTIGUEDADES, Y ANADIR UNA NUEVA FILA**********
-- aqui va el nueva fila