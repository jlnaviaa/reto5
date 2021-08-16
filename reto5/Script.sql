--Lider por salario
SELECT ID_Lider, Nombre, Primer_Apellido, Salario FROM Lider l WHERE Salario <= 500000 ORDER BY Salario;


-- Lider por nombre
SELECT ID_Lider , Nombre , Primer_Apellido FROM Lider l WHERE Primer_Apellido LIKE '%z' ORDER BY Nombre ASC;


-- Proyectos por tipo
SELECT p.ID_Proyecto, p.Constructora, p.Ciudad, t.Estrato FROM Tipo t INNER JOIN Proyecto p ON t.ID_Tipo = p.ID_Tipo WHERE p.Ciudad = 'Cartagena' ORDER BY Estrato ASC;