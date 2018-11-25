-- Queries de la base de datos

 1. Usuarios que menos usan el sistema.
  SELECT nombre,ap_paterno,usuario,logins FROM s_usuarios_ajustadores RIGHT JOIN s_ajustadores USING(id_ajustador) having logins = (SELECT logins FROM s_usuarios_ajustadores RIGHT JOIN s_ajustadores USING(id_ajustador)ORDER BY logins DESC LIMIT 1);

  2. Ajustadores que más siniestros atienden.
  SELECT nombre,ap_paterno,COUNT(id_ajustador)AS siniestros_atendidos FROM s_siniestros RIGHT JOIN s_ajustadores USING(id_ajustador) group by (id_ajustador) HAVING siniestros_atendidos = (SELECT COUNT(id_ajustador)AS siniestros_atendidos FROM s_siniestros RIGHT JOIN s_ajustadores USING(id_ajustador) GROUP BY(id_ajustador) ORDER BY siniestros_atendidos DESC LIMIT 1);

  3. Ajustadores que menos siniestros han atendido.
  SELECT nombre,ap_paterno,COUNT(id_ajustador)AS siniestros_atendidos FROM s_siniestros RIGHT JOIN s_ajustadores USING(id_ajustador)GROUP BY(id_ajustador) having siniestros_atendidos = (SELECT COUNT(id_ajustador)AS siniestros_atendidos FROM s_siniestros RIGHT JOIN s_ajustadores USING(id_ajustador)GROUP BY(id_ajustador)ORDER BY siniestros_atendidos LIMIT 1);

  4. Lista de todos los ajustadores que están registrados en el sistema.
  SELECT DISTINCT nombre,ap_paterno, ap_materno FROM s_ajustadores;

  5. Lista de los siniestros de un ajustador en particular.
  SELECT id_ajustador, nombre, id_siniestro, id_poliza, fecha_hora, calle, estado, delegacion, colonia, num_calle FROM s_siniestros RIGHT JOIN s_ajustadores USING(id_ajustador) where id_ajustador = #;
  ó
  SELECT id_ajustador, nombre, id_siniestro, id_poliza, fecha_hora, calle, estado, delegacion, colonia, num_calle FROM s_siniestros RIGHT JOIN s_ajustadores USING(id_ajustador) where nombre = 'Nombre del ajustador';

  6. Lista de todos los ajustadores que manejaron un vehículo en un periodo de tiempo determinado.
  SELECT id_ajustador, fecha_inicio, fecha_fin FROM s_periodos_autos_ajustadores WHERE fecha_inicio = '2018-03-11 ' AND fecha_fin = '2018-03-12 ';

  7. Lista de las colonias en donde más siniestros ocurren.
  SELECT colonia, COUNT(id_siniestro) AS numero_de_siniestros FROM s_siniestros GROUP BY colonia having numero_de_siniestros = (SELECT COUNT(id_siniestro) AS numero_de_siniestros FROM s_siniestros GROUP BY colonia ORDER BY numero_de_siniestros DESC LIMIT 1);

  8. Periodo del día (mañana, tarde o noche) en donde más siniestros ocurren.
  SELECT COUNT(HOUR(fecha_hora)) as numero, HOUR(fecha_hora) as hora from s_siniestros GROUP BY hora HAVING hora BETWEEN 6 AND 12 ORDER BY numero DESC LIMIT 1;
  SELECT COUNT(HOUR(fecha_hora)) as numero, HOUR(fecha_hora) as hora from s_siniestros GROUP BY hora HAVING hora BETWEEN 13 AND 19 ORDER BY numero DESC LIMIT 1;
  SELECT COUNT(HOUR(fecha_hora)) as numero, HOUR(fecha_hora) as hora from s_siniestros GROUP BY hora HAVING hora BETWEEN 20 AND 23 ORDER BY numero DESC LIMIT 1;
  SELECT COUNT(HOUR(fecha_hora)) as numero, HOUR(fecha_hora) as hora from s_siniestros GROUP BY hora HAVING hora BETWEEN 0 AND 5 ORDER BY numero DESC LIMIT 1;

 9. Número de siniestros en un periodo de tiempo determinado.
  SELECT COUNT(id_siniestro) AS numero_de_siniestros FROM s_siniestros WHERE fecha_hora BETWEEN 'AAAA-MM-DD HH:MM:SS' AND  'AAAA-MM-DD HH:MM:SS';
  ó
  SELECT COUNT(id_siniestro) AS numero_de_siniestros FROM s_siniestros WHERE fecha_hora BETWEEN '2018-03-12 17:15:10' AND  '2018-04-26 02:27:48';

  10. Nombre del ajustador que manejó un vehículo en un periodo de tiempo determinado.
  SELECT nombre,ap_paterno,fecha_inicio,fecha_fin FROM s_periodos_autos_ajustadores RIGH JOIN s_ajustadores USING(id_ajustador)WHERE fecha_inicio >= '2018-01-01' AND fecha_fin <= '2018-12-02';

  11. La última posición de un ajustador en particular.
  SELECT nombre, posicion FROM s_ajustadores RIGHT JOIN s_periodos_autos_ajustadores USING(id_ajustador) WHERE nombre = 'nombre de ajustador a buscar';
  ó
  SELECT nombre, posicion FROM s_ajustadores RIGHT JOIN s_periodos_autos_ajustadores USING(id_ajustador) WHERE id_ajustador = #;

  12. Lista de todos los vehículos que manejó un ajustador en un periodo de tiempo determinado.
  SELECT id_vehiculo_ajustadores, id_ajustador, fecha_inicio, fecha_fin FROM s_periodos_autos_ajustadores WHERE fecha_inicio = '2018-03-11' AND fecha_fin = '2018-03-12' AND id_ajustador = 1;
