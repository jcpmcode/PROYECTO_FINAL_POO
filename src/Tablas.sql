-- Script para generar y llenar tablas de la base de datos

CREATE TABLE `ic16jpm`.`s_admin` ( `usuario` VARCHAR(15) NOT NULL , `clave` VARCHAR(15) NOT NULL );
CREATE TABLE s_ajustadores(id_ajustador int primary key auto_increment not null, nombre varchar(25) not null, ap_paterno varchar(25) not null, ap_materno varchar(25) not null, genero enum('m', 'f') not null, fecha_nacimiento date not null, direccion varchar(100) not null, telefono_personal int not null, telefono_trabajo int not null, mail varchar(50)not null );
CREATE TABLE s_operadores_telefonicos(id_operador int primary key auto_increment not null, nombre varchar(25) not null, ap_paterno varchar(25) not null, ap_materno varchar(25) not null, genero enum('m', 'f') not null, fecha_nacimiento date not null, direccion varchar(100) not null, telefono_personal int not null, linea_asignada int not null );
CREATE TABLE s_usuarios_ajustadores(id_ajustador int references s_ajustadores(id_ajustador) on delete cascade, usuario varchar(25) not null, contrasenia varchar(25) not null, logins int not null );
CREATE TABLE s_polizas(id_poliza int primary key auto_increment not null, fecha_inicio date not null, fecha_fin date not null);
CREATE TABLE s_vehiculos_ajustadores(id_vehiculo_ajustadores int primary key auto_increment not null, marca varchar(25) not null, modelo varchar(25) not null, anio date not null, kilometraje decimal (10,2)not null, placas varchar(10) not null);
CREATE TABLE s_usuarios_operadores(id_operador int references s_operadores_telefonicos(id_operador) on delete cascade, usuario varchar(25) not null, contrasenia varchar(25) not null, logins int not null);
CREATE TABLE s_siniestros(id_siniestro int primary key auto_increment not null, id_poliza int references s_polizas (id_poliza) on delete cascade, fecha_hora datetime not null, calle varchar(25) not null, num_calle int not null, colonia varchar(25) not null, delegacion varchar(25) not null, estado varchar(25) not null, id_ajustador int references s_ajustadores (id_ajustador) on delete cascade );
CREATE TABLE s_periodos_autos_ajustadores(id_vehiculo_ajustadores int primary key auto_increment not null,id_ajustador int references s_ajustadores (id_ajustador) on delete cascade, fecha_inicio date not null,fecha_fin date not null, posicion varchar(50) not null );

-- Tabla administradores del sistema
INSERT INTO s_admin (`usuario`, `clave`) VALUES ('ic16jpm', '199104'), ('avilesdiana', '123456');

-- Tabla ajustadores:
INSERT INTO s_ajustadores (nombre,ap_paterno,ap_materno,genero,fecha_nacimiento,direccion,telefono_personal,telefono_trabajo,mail) VALUES ('arturo','arriaga','soria','m','1997-08-12','heroes 87','55809315','55904598','arturo@gmail.com');
INSERT INTO s_ajustadores (nombre,ap_paterno,ap_materno,genero,fecha_nacimiento,direccion,telefono_personal,telefono_trabajo,mail) VALUES ('jose','paniagua','lopez','m','1998-09-03','tlatelolco 202','55548723','55475498','paniagua@gmail.com');
INSERT INTO s_ajustadores (nombre,ap_paterno,ap_materno,genero,fecha_nacimiento,direccion,telefono_personal,telefono_trabajo,mail) VALUES ('yessica','hipolito','moran','f','1999-09-13','santa maria 43','55348743','55374946','yessica@gmail.com');
INSERT INTO s_ajustadores (nombre,ap_paterno,ap_materno,genero,fecha_nacimiento,direccion,telefono_personal,telefono_trabajo,mail) VALUES ('lizeth','juarez','medina','f','1990-04-11','iztapalapa 93','55481735','55486037','lizeth@gmail.com');
INSERT INTO s_ajustadores (nombre,ap_paterno,ap_materno,genero,fecha_nacimiento,direccion,telefono_personal,telefono_trabajo,mail) VALUES ('jesus','guzman','martinez','m','1988-10-26','xochimilco 29','55937483','55467357','jesus@gmail.com');
INSERT INTO s_ajustadores (nombre,ap_paterno,ap_materno,genero,fecha_nacimiento,direccion,telefono_personal,telefono_trabajo,mail) VALUES ('elias','romero','flores','m','1984-03-30','cuajimalpa 63','55850899','55947502','elias@gmail.com');
INSERT INTO s_ajustadores (nombre,ap_paterno,ap_materno,genero,fecha_nacimiento,direccion,telefono_personal,telefono_trabajo,mail) VALUES ('claudia','perez','rojo','f','1977-12-02','ecatepec 45','55746475','55300984','claudia@gmail.com');
INSERT INTO s_ajustadores (nombre,ap_paterno,ap_materno,genero,fecha_nacimiento,direccion,telefono_personal,telefono_trabajo,mail) VALUES ('david','jimenez','sanchez','m','1992-11-09','alvaro obregon 38','55847594','55875423','david@gmail.com');
INSERT INTO s_ajustadores (nombre,ap_paterno,ap_materno,genero,fecha_nacimiento,direccion,telefono_personal,telefono_trabajo,mail) VALUES ('danae','rivera','fonseca','f','1985-04-11','teotihuacan 76','55869809','55347612','danae@gmail.com');
INSERT INTO s_ajustadores (nombre,ap_paterno,ap_materno,genero,fecha_nacimiento,direccion,telefono_personal,telefono_trabajo,mail) VALUES ('luis','rosas','villeda','m','1978-07-16','tlalpan 98','55876543','55264869','luis@gmail.com');

-- Tabla operadores_telefonicos:
INSERT INTO s_operadores_telefonicos(nombre,ap_paterno,ap_materno,genero, fecha_nacimiento,direccion,telefono_personal,linea_asignada)VALUES ('rosario','rendon','fernandez','f','1998-08-17','santa fe 202','55974573','55556680');
INSERT INTO s_operadores_telefonicos(nombre,ap_paterno,ap_materno,genero, fecha_nacimiento,direccion,telefono_personal,linea_asignada)VALUES ('daniela','rodriguez','molina','f','1987-04-24','reforma 343','55759823','55556681');
INSERT INTO s_operadores_telefonicos(nombre,ap_paterno,ap_materno,genero, fecha_nacimiento,direccion,telefono_personal,linea_asignada)VALUES ('francisco','garcia','moreno','m','1987-10-09','ixtapaluca 74','55759745','55556682');
INSERT INTO s_operadores_telefonicos(nombre,ap_paterno,ap_materno,genero, fecha_nacimiento,direccion,telefono_personal,linea_asignada)VALUES ('santiago','chicho','morales','m','1975-11-27','acolman 91','55865098','55556683');
INSERT INTO s_operadores_telefonicos(nombre,ap_paterno,ap_materno,genero, fecha_nacimiento,direccion,telefono_personal,linea_asignada)VALUES ('victor','gutierrez','diaz','f','1978-01-28','chimalhuacan 30','55856213','55556684');
INSERT INTO s_operadores_telefonicos(nombre,ap_paterno,ap_materno,genero, fecha_nacimiento,direccion,telefono_personal,linea_asignada)VALUES ('fernanda','ramos','mujica','f','1979-11-12','atizapan 32','55909764','55556685');
INSERT INTO s_operadores_telefonicos(nombre,ap_paterno,ap_materno,genero, fecha_nacimiento,direccion,telefono_personal,linea_asignada)VALUES ('adolfo','montiel','kant','m','1982-03-16','quiroga 55','55539765','55556686');
INSERT INTO s_operadores_telefonicos(nombre,ap_paterno,ap_materno,genero, fecha_nacimiento,direccion,telefono_personal,linea_asignada)VALUES ('fernando','gomez','ballesteros','m','1985-08-27','hidalgo 28','55986732','55556687');
INSERT INTO s_operadores_telefonicos(nombre,ap_paterno,ap_materno,genero, fecha_nacimiento,direccion,telefono_personal,linea_asignada)VALUES ('carlos','hernandez','tagle','f','1994-04-07','zaragoza 46','55875678','55556688');
INSERT INTO s_operadores_telefonicos(nombre,ap_paterno,ap_materno,genero, fecha_nacimiento,direccion,telefono_personal,linea_asignada)VALUES ('laura','moreno','vazquez','f','1983-05-13','coyoacan 441','55675646','55556689');


-- Tabla usuarios_ajustadores:
INSERT INTO s_usuarios_ajustadores(id_ajustador,usuario,contrasenia,logins) VALUES ('1','arturo123','hola123','3');
INSERT INTO s_usuarios_ajustadores(id_ajustador,usuario,contrasenia,logins) VALUES ('2','jose123','password','2');
INSERT INTO s_usuarios_ajustadores(id_ajustador,usuario,contrasenia,logins) VALUES ('3','yessi123','nomelase','6');
INSERT INTO s_usuarios_ajustadores(id_ajustador,usuario,contrasenia,logins) VALUES ('4','liz123','qwerty','8');
INSERT INTO s_usuarios_ajustadores(id_ajustador,usuario,contrasenia,logins) VALUES ('5','jesus123','asdfg','1');
INSERT INTO s_usuarios_ajustadores(id_ajustador,usuario,contrasenia,logins) VALUES ('6','elias123','zxcvb','4');
INSERT INTO s_usuarios_ajustadores(id_ajustador,usuario,contrasenia,logins) VALUES ('7','clau123','pass123','5');
INSERT INTO s_usuarios_ajustadores(id_ajustador,usuario,contrasenia,logins) VALUES ('8','david123','contra','7');
INSERT INTO s_usuarios_ajustadores(id_ajustador,usuario,contrasenia,logins) VALUES ('9','dana123','123456','4');
INSERT INTO s_usuarios_ajustadores(id_ajustador,usuario,contrasenia,logins) VALUES ('10','luis123','1q2w3e','9');

-- Tabla usuarios_operadores:
INSERT INTO s_usuarios_operadores(id_operador,usuario,contrasenia,logins)VALUES ('1','rosa123','123456','5');
INSERT INTO s_usuarios_operadores(id_operador,usuario,contrasenia,logins)VALUES ('2','dani123','1q2w3e4r','3');
INSERT INTO s_usuarios_operadores(id_operador,usuario,contrasenia,logins)VALUES ('3','fran123','poiuy','2');
INSERT INTO s_usuarios_operadores(id_operador,usuario,contrasenia,logins)VALUES ('4','santi123','lkjhg','6');
INSERT INTO s_usuarios_operadores(id_operador,usuario,contrasenia,logins)VALUES ('5','vic123','mnbvc','7');
INSERT INTO s_usuarios_operadores(id_operador,usuario,contrasenia,logins)VALUES ('6','fer123','pass1234','8');
INSERT INTO s_usuarios_operadores(id_operador,usuario,contrasenia,logins)VALUES ('7','adolf123','123456','2');
INSERT INTO s_usuarios_operadores(id_operador,usuario,contrasenia,logins)VALUES ('8','fer123','qazwsx','4');
INSERT INTO s_usuarios_operadores(id_operador,usuario,contrasenia,logins)VALUES ('9','carl123','edcrfv','6');
INSERT INTO s_usuarios_operadores(id_operador,usuario,contrasenia,logins)VALUES ('10','lau123','tgbyhn','7');

-- Tabla vehiculos_ajustadores:
INSERT INTO s_vehiculos_ajustadores(marca,modelo,anio,kilometraje,placas)VALUES ('nissan','versa','2015-01-01','122.3','xyw843');
INSERT INTO s_vehiculos_ajustadores(marca,modelo,anio,kilometraje,placas)VALUES ('toyota','yaris','2016-01-01','345.6','sdf987');
INSERT INTO s_vehiculos_ajustadores(marca,modelo,anio,kilometraje,placas)VALUES ('nissan','tsuru','2015-01-01','345.8','jsu387');
INSERT INTO s_vehiculos_ajustadores(marca,modelo,anio,kilometraje,placas)VALUES ('volkswagen','polo','2017-01-01','645.9','kip987');
INSERT INTO s_vehiculos_ajustadores(marca,modelo,anio,kilometraje,placas)VALUES ('nissan','kicks','2016-01-01','453.5','wut873');
INSERT INTO s_vehiculos_ajustadores(marca,modelo,anio,kilometraje,placas)VALUES ('volkswagen','vento','2015-01-01','984.3','djh984');
INSERT INTO s_vehiculos_ajustadores(marca,modelo,anio,kilometraje,placas)VALUES ('toyota','yaris','2014-01-01','234.7','dfe456');
INSERT INTO s_vehiculos_ajustadores(marca,modelo,anio,kilometraje,placas)VALUES ('nissan','versa','2018-01-01','778.2','pld984');
INSERT INTO s_vehiculos_ajustadores(marca,modelo,anio,kilometraje,placas)VALUES ('volkswagen','golf','2016-01-01','238.4','cos984');

-- Tabla siniestros:
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('1','heroes','88','buenavista','cuauhtemoc','cdmx','1','2018-03-12 17:15:10');
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('2','mina','27','arboleda','azcapotzalco','cdmx','2','2018-03-16 11:23:15');
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('3','zaragoza','46','arcos','coyoacan','cdmx','3','2018-03-17 20:22:24');
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('4','meneses','222','avandaro','alvaro obregon','cdmx','4','2018-03-21 08:45:00');
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('5','eje de guerrero','94','guerrero','xochimilco','cdmx','5','2018-03-24 23:34:45');
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('6','constituyentes','56','chapultepec','cuauhtemoc','cdmx','6','2018-03-26 16:37:35');
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('7','magnolia','24','doctores','g a madero','cdmx','7','2018-03-15 08:28:48');
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('8','circuito','78','ferrrocarrilera','cuajimalpa','cdmx','8','2018-03-11 19:52:35');
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('9','reforma','91','palmas','iztapalapa','cdmx','9','2018-03-18 13:54:34');
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('10','insurgentes','53','tabacalera','iztacalco','cdmx','10','2018-04-26 02:27:48');
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('3','alzate','23','buenavista','cuauhtemoc','cdmx','4','2018-05-17 14:23:48')
INSERT INTO s_siniestros(id_poliza,calle,num_calle,colonia,delegacion,estado,id_ajustador,fecha_hora) VALUES ('11','eje central','430','centro','cuauhtemoc','cdmx','2','2018-05-20 06:31:00');

-- Tabla polizas:
INSERT INTO s_polizas(fecha_inicio, fecha_fin) VALUES ('2018-03-12','2019-03-12');
INSERT INTO s_polizas(fecha_inicio, fecha_fin) VALUES ('2016-08-23','2017-08-23');
INSERT INTO s_polizas(fecha_inicio, fecha_fin) VALUES ('2017-09-16','2018-09-16');
INSERT INTO s_polizas(fecha_inicio, fecha_fin) VALUES ('2018-10-19','2019-10-19');
INSERT INTO s_polizas(fecha_inicio, fecha_fin) VALUES ('2018-12-14','2019-12-14');
INSERT INTO s_polizas(fecha_inicio, fecha_fin) VALUES ('2017-07-24','2018-07-24');
INSERT INTO s_polizas(fecha_inicio, fecha_fin) VALUES ('2015-05-28','2016-05-28');
INSERT INTO s_polizas(fecha_inicio, fecha_fin) VALUES ('2016-03-11','2017-03-11');
INSERT INTO s_polizas(fecha_inicio, fecha_fin) VALUES ('2017-04-02','2018-04-02');
INSERT INTO s_polizas(fecha_inicio, fecha_fin) VALUES ('2018-01-11','2019-01-11');

-- Tabla periodos_autos_ajustadores:
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion) VALUES ('1','2018-03-11','2018-03-12','cuauhtemoc 35');
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion) VALUES ('2','2018-03-01','2018-03-02','coyoacan 84');
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion) VALUES ('3','2018-03-05','2018-03-06','benito juarez 46');
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion) VALUES ('4','2018-01-11','2019-01-11','xochimilco 22');
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion) VALUES ('5','2018-01-14','2018-01-15','santa fe 64');
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion) VALUES ('6','2018-02-18','2018-02-19','buenavista 81');
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion) VALUES ('7','2018-04-12','2018-04-13','cuauhtitlan 23');
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion)VALUES ('8','2018-01-05','2018-01-06','ecatepec 50');
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion) VALUES ('9','2018-02-23','2018-02-24','cuajimalpa 77');
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion) VALUES ('10','2018-03-24','2018-03-25','tultepec 62');
INSERT INTO s_periodos_autos_ajustadores(id_ajustador,fecha_inicio,fecha_fin,posicion) VALUES ('9','2018-03-11','2018-03-12','guerrero 395');
