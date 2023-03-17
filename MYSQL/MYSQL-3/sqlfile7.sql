SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;

SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;

-- INNER JOIN
-- Encontrar a que pais pertenecen
SELECT
students.idStudent AS 'ID',
students.name AS 'Nombre',
students.last_name AS 'Apellido',
countries.name AS 'Pais de origen',
countries.code AS 'Codigo del pais' -- como ya es el ultimo no necesito la coma
FROM students
INNER JOIN countries
ON students.nationality = countries.idCountries; -- de students. quiero nationality

-- Encontramos que tipo de ID tiene la raza
SELECT
students.idStudent AS 'ID',
students.name AS 'Nombre',
students.last_name AS 'Apellido',
idtypes.name AS 'Tipo de ID de registro'
FROM students
INNER JOIN idtypes
ON students.IdType_id = idtypes.id_idTypes;

-- Abreviaciones
SELECT
    t1.name,
    t2.name,
    t2.code
FROM students t1
INNER JOIN countries t2
ON t1.nationality = t2.id_Countries;

-- Estudiantes que esten registrades en un curso.
-- Nombre, id, apellido, curso al que estan registrades
-- *************AQUI VA UN EJERCICIO NO TE HAGAS WEY EHHH********************





-- ************************************************************************