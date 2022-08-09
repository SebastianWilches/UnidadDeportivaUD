--Tabla TipoEspacio
INSERT INTO TipoEspacio VALUES ('1','Unidad');
INSERT INTO TipoEspacio VALUES ('2','Sede');
INSERT INTO TipoEspacio VALUES ('3','Campo');
INSERT INTO TipoEspacio VALUES ('4','Pista');
INSERT INTO TipoEspacio VALUES ('5','Salon');
INSERT INTO TipoEspacio VALUES ('6','Piscina');
INSERT INTO TipoEspacio VALUES ('7','Sala Maquinas');
INSERT INTO TipoEspacio VALUES ('8','Muro Escalar');

--Deporte
INSERT INTO Deporte VALUES ('1','Atletismo');
INSERT INTO Deporte VALUES ('2','Tenis');
INSERT INTO Deporte VALUES ('3','Tenis Mesa');
INSERT INTO Deporte VALUES ('4','Natacion');
INSERT INTO Deporte VALUES ('5','Voleivol');
INSERT INTO Deporte VALUES ('6','Futbol');
INSERT INTO Deporte VALUES ('7','Futbol sala');
INSERT INTO Deporte VALUES ('8','Badminton');
INSERT INTO Deporte VALUES ('9','Aerobicos');
INSERT INTO Deporte VALUES ('10','Boxeo');
INSERT INTO Deporte VALUES ('11','Artes Marciales');
INSERT INTO Deporte VALUES ('12','Gimnasia Olimpica');

--Estado
INSERT INTO Estado VALUES ('1','Activo');
INSERT INTO Estado VALUES ('2','Prestado');
INSERT INTO Estado VALUES ('3','Dañado');
INSERT INTO Estado VALUES ('4','Perdido');
INSERT INTO Estado VALUES ('5','De baja');

--Periodo
INSERT INTO Periodo VALUES ('20191');
INSERT INTO Periodo VALUES ('20192');
INSERT INTO Periodo VALUES ('20193');
INSERT INTO Periodo VALUES ('20201');
INSERT INTO Periodo VALUES ('20202');
INSERT INTO Periodo VALUES ('20203');
INSERT INTO Periodo VALUES ('20211');
INSERT INTO Periodo VALUES ('20212');
INSERT INTO Periodo VALUES ('20213');
INSERT INTO Periodo VALUES ('20221');

--TipoElemento
INSERT INTO TipoElemento VALUES ('1', 'Balon Baloncesto');
INSERT INTO TipoElemento VALUES ('2', 'Balon Futbol');
INSERT INTO TipoElemento VALUES ('3', 'Balon Voleibol');
INSERT INTO TipoElemento VALUES ('4', 'Pelota Tenis mesa');
INSERT INTO TipoElemento VALUES ('5', 'Pelota Tenis campo');
INSERT INTO TipoElemento VALUES ('6', 'Colchoneta');
INSERT INTO TipoElemento VALUES ('7', 'Lazo salto');
INSERT INTO TipoElemento VALUES ('8', 'Guantes Box');
INSERT INTO TipoElemento VALUES ('9', 'Malla Volibol');
INSERT INTO TipoElemento VALUES ('10', 'Saco Boxeo');
INSERT INTO TipoElemento VALUES ('11', 'Aros hula-hula');
INSERT INTO TipoElemento VALUES ('12', 'Chaleco Boxeo');
INSERT INTO TipoElemento VALUES ('13', 'Malla Pimpon');

--Actividad
INSERT INTO Actividad VALUES ('CU', 'Curso');
INSERT INTO Actividad VALUES ('PR', 'Practica');
INSERT INTO Actividad VALUES ('EN', 'Entrenamiento');

--Hora
INSERT INTO Hora VALUES ('06');
INSERT INTO Hora VALUES ('07');
INSERT INTO Hora VALUES ('08');
INSERT INTO Hora VALUES ('09');
INSERT INTO Hora VALUES ('10');
INSERT INTO Hora VALUES ('11');
INSERT INTO Hora VALUES ('12');
INSERT INTO Hora VALUES ('13');
INSERT INTO Hora VALUES ('14');
INSERT INTO Hora VALUES ('15');
INSERT INTO Hora VALUES ('16');
INSERT INTO Hora VALUES ('17');
INSERT INTO Hora VALUES ('18');
INSERT INTO Hora VALUES ('19');
INSERT INTO Hora VALUES ('20');
INSERT INTO Hora VALUES ('21');
INSERT INTO Hora VALUES ('22');

--Marca
INSERT INTO Marca VALUES ('1','Nike');
INSERT INTO Marca VALUES ('2','Adidas');
INSERT INTO Marca VALUES ('3','Puma');
INSERT INTO Marca VALUES ('4','Reebok');
INSERT INTO Marca VALUES ('5','Fila');
INSERT INTO Marca VALUES ('6','Asics');
INSERT INTO Marca VALUES ('7','Kappa');
INSERT INTO Marca VALUES ('8','The North Face');
INSERT INTO Marca VALUES ('9','Under Armour');
INSERT INTO Marca VALUES ('10','Under Armour');
INSERT INTO Marca VALUES ('11','Converse');
INSERT INTO Marca VALUES ('12','TI Colombia');

--Rol
INSERT INTO Rol VALUES ('1','Director Deportivo');
INSERT INTO Rol VALUES ('2','Docente');
INSERT INTO Rol VALUES ('3','Entrenador');

--Cargo
INSERT INTO Cargo VALUES ('1','Auxiliar');
INSERT INTO Cargo VALUES ('2','Docente');
INSERT INTO Cargo VALUES ('3','Director Deportivo');
INSERT INTO Cargo VALUES ('4','Administrador Deportivo');
INSERT INTO Cargo VALUES ('5','Fisioterapeuta');
INSERT INTO Cargo VALUES ('6','Entrenador');





--INCLUIR ESPACIOS (CodEspacio, TipoEspacio, EspacioCiclico, NomEspacio)

--UNIDAD
INSERT INTO Espacio VALUES ('1', '1', NULL, 'Universidad Distrital');

--SEDES
INSERT INTO Espacio VALUES ('2', '2', '1', 'FacultadIngenieria');
INSERT INTO Espacio VALUES ('3', '2', '1', 'Macaerna');
INSERT INTO Espacio VALUES ('4', '2', '1', 'ASAB');


--                          SEDE_Ingenieria
--Campo
INSERT INTO Espacio VALUES ('5', '3', '2', 'Campo1Ingenieria');
--Pista
INSERT INTO Espacio VALUES ('6', '4', '2', 'Pista1Ingenieria');
--Piscina
INSERT INTO Espacio VALUES ('7', '6', '2', 'Piscina1Ingenieria');
--10salones
INSERT INTO Espacio VALUES ('8', '5', '2', 'Salon1Ingenieria');
INSERT INTO Espacio VALUES ('9', '5', '2', 'Salon2Ingenieria');
INSERT INTO Espacio VALUES ('10', '5', '2', 'Salon3Ingenieria');
INSERT INTO Espacio VALUES ('11', '5', '2', 'Salon4Ingenieria');
INSERT INTO Espacio VALUES ('12', '5', '2', 'Salon5Ingenieria');
INSERT INTO Espacio VALUES ('13', '5', '2', 'Salon6Ingenieria');
INSERT INTO Espacio VALUES ('14', '5', '2', 'Salon7Ingenieria');
INSERT INTO Espacio VALUES ('15', '5', '2', 'Salon8Ingenieria');
INSERT INTO Espacio VALUES ('16', '5', '2', 'Salon9Ingenieria');
INSERT INTO Espacio VALUES ('17', '5', '2', 'Salon10Ingenieria');
--SalaMaquinas
INSERT INTO Espacio VALUES ('18', '7', '2', 'SalaMaquinasIngenieria');



--                          SEDE_Macarena
--Campo
INSERT INTO Espacio VALUES ('19', '3', '3', 'Campo1Macarena');
--Pista
INSERT INTO Espacio VALUES ('20', '4', '3', 'Pista1Macarena');
--Piscina
INSERT INTO Espacio VALUES ('21', '6', '3', 'Piscina1Macarena');
--10salones
INSERT INTO Espacio VALUES ('22', '5', '3', 'Salon1Macarena');
INSERT INTO Espacio VALUES ('23', '5', '3', 'Salon3Macarena');
INSERT INTO Espacio VALUES ('24', '5', '3', 'Salon3Macarena');
INSERT INTO Espacio VALUES ('25', '5', '3', 'Salon4Macarena');
INSERT INTO Espacio VALUES ('26', '5', '3', 'Salon5Macarena');
INSERT INTO Espacio VALUES ('27', '5', '3', 'Salon6Macarena');
INSERT INTO Espacio VALUES ('28', '5', '3', 'Salon7Macarena');
INSERT INTO Espacio VALUES ('29', '5', '3', 'Salon8Macarena');
INSERT INTO Espacio VALUES ('30', '5', '3', 'Salon9Macarena');
INSERT INTO Espacio VALUES ('31', '5', '3', 'Salon10Macarena');
--SalaMaquinas
INSERT INTO Espacio VALUES ('32', '7', '3', 'SalaMaquinasMacarena');


--                          SEDE_ASAB
--Campo
INSERT INTO Espacio VALUES ('33', '3', '4', 'Campo1ASAB');
--Pista
INSERT INTO Espacio VALUES ('34', '4', '4', 'Pista1ASAB');
--Piscina
INSERT INTO Espacio VALUES ('35', '6', '4', 'Piscina1ASAB');
--10salones
INSERT INTO Espacio VALUES ('36', '5', '4', 'Salon1ASAB');
INSERT INTO Espacio VALUES ('37', '5', '4', 'Salon3ASAB');
INSERT INTO Espacio VALUES ('38', '5', '4', 'Salon3ASAB');
INSERT INTO Espacio VALUES ('39', '5', '4', 'Salon4ASAB');
INSERT INTO Espacio VALUES ('40', '5', '4', 'Salon5ASAB');
INSERT INTO Espacio VALUES ('41', '5', '4', 'Salon6ASAB');
INSERT INTO Espacio VALUES ('42', '5', '4', 'Salon7ASAB');
INSERT INTO Espacio VALUES ('43', '5', '4', 'Salon8ASAB');
INSERT INTO Espacio VALUES ('44', '5', '4', 'Salon9ASAB');
INSERT INTO Espacio VALUES ('45', '5', '4', 'Salon10ASAB');
--SalaMaquinas
INSERT INTO Espacio VALUES ('46', '7', '4', 'SalaMaquinasASAB');







--INCLUIR EMPLEADOS(CodEmpleado, NomEmpleado, ApellidoEmpleado, FechaRegistro, CorreoUD)
--DirectorDeportivo
INSERT INTO Empleado VALUES ('1', 'Dani', 'Ochoa', sysdate, 'DOchoa@udistrital.edu'); 
--DirectorDeportivo
INSERT INTO Empleado VALUES ('2', 'Dorita', 'Gras', sysdate, 'DGras@udistrital.edu'); 
--DocenteIngenieria
INSERT INTO Empleado VALUES ('3', 'Pepe', 'Zurita', sysdate, 'PZurita@udistrital.edu'); 
--DocenteMacarena
INSERT INTO Empleado VALUES ('4', 'Marcos', 'Fulgencio', sysdate, 'MFulgencio@udistrital.edu'); 
--DocenteASAB
INSERT INTO Empleado VALUES ('5', 'Daniela', 'Pozuelo', sysdate, 'DPozuelo@udistrital.edu'); 
--DocenteASAB
INSERT INTO Empleado VALUES ('6', 'Clementina', 'Santamaria', sysdate, 'CSantamaria@udistrital.edu'); 
--Auxiliares
INSERT INTO Empleado VALUES ('7', 'Vanesa', 'Cid', sysdate, 'VCid@udistrital.edu'); 
--Auxiliares
INSERT INTO Empleado VALUES ('8', 'Jesus', 'Castell', sysdate, 'JCastell@udistrital.edu'); 
--Entrenador
INSERT INTO Empleado VALUES ('9', 'Dan', 'Marquez', sysdate, 'DMarquez@udistrital.edu'); 
--Entrenador
INSERT INTO Empleado VALUES ('10', 'Lidia', 'Parejo', sysdate, 'LParejo@udistrital.edu'); 
--Entrenador
INSERT INTO Empleado VALUES ('11', 'Prudencia', 'Lasa', sysdate, 'PLasa@udistrital.edu'); 



--Equipo (Despues asociar la FK del entrenador que dirige el equipo)
INSERT INTO Equipo VALUES (1,'9' ,'1', sysdate);
INSERT INTO Equipo VALUES (2,'9' ,'3', sysdate);
INSERT INTO Equipo VALUES (3,'9' ,'4', sysdate);
INSERT INTO Equipo VALUES (4,'10' ,'5', sysdate);
INSERT INTO Equipo VALUES (5,'10' ,'6', sysdate);
INSERT INTO Equipo VALUES (6,'10' ,'7', sysdate);
INSERT INTO Equipo VALUES (7,'10' ,'9', sysdate);
INSERT INTO Equipo VALUES (8,'11' ,'10', sysdate);
INSERT INTO Equipo VALUES (9,'11' ,'11', sysdate);
INSERT INTO Equipo VALUES (10,'11' ,'12', sysdate);





--      Asociar Empleado_Cargo(CodEmpleado_Cargo, EspacioDirige, CodCargo, CodEmpleado, sysdate, NULL)
--DirectoresDeportivos (Se encargan de la sede)
INSERT INTO Empleado_Cargo VALUES (1, '2', '3','1', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (2, '2', '3','1', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (3, '3', '3','2', sysdate, NULL);

--Docentes (Se encargan de los salones)
--PrimerDocente - Ingenieria
INSERT INTO Empleado_Cargo VALUES (5, '8', '2','3', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (6, '9', '2','3', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (7, '10', '2','3', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (8, '11', '2','3', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (4, '12', '2','3', sysdate, NULL);

--SegundoDocente - Macarena
INSERT INTO Empleado_Cargo VALUES (10, '22', '2','4', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (11, '23', '2','4', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (12, '24', '2','4', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (13, '25', '2','4', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (9, '26', '2','4', sysdate, NULL);

--TercerDocente - ASAB
INSERT INTO Empleado_Cargo VALUES (15, '36', '2','5', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (16, '37', '2','5', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (17, '38', '2','5', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (18, '39', '2','5', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (14, '40', '2','5', sysdate, NULL);

--CuartoDocente - ASAB
INSERT INTO Empleado_Cargo VALUES (19, '40', '2','6', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (20, '41', '2','6', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (21, '42', '2','6', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (22, '43', '2','6', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (23, '44', '2','6', sysdate, NULL);


--Auxiliar (Se encargan de una sede)
--Primer Auxiliar - Ingenieria
INSERT INTO Empleado_Cargo VALUES (24, '2', '1','7', sysdate, NULL);
--Segundo auxiliar - Macarena
INSERT INTO Empleado_Cargo VALUES (25, '3', '1','8', sysdate, NULL);


--Entrenadores (Se encargan de un campo en cada sede)
INSERT INTO Empleado_Cargo VALUES (26, '5', '6','9', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (27, '18', '6','10', sysdate, NULL);
INSERT INTO Empleado_Cargo VALUES (28, '32', '6','11', sysdate, NULL);






--Estudiante (CodEstudiante, CodEspacio(sede), Nom, Apell, FechaRegistro, CorreoUD, FechaNacimiento)
--Estudiantes Ingenieria
INSERT INTO Estudiante VALUES ('1', '2', 'Chucho', 'Tenorio', sysdate, 'CTenorio@udistrital.edu', '20/04/2001');
INSERT INTO Estudiante VALUES ('2', '2', 'Hugo', 'Olivera', sysdate, 'HOlivera@udistrital.edu', '20/04/2001');
INSERT INTO Estudiante VALUES ('3', '2', 'Rocio', 'Fonseca', sysdate, 'RFonseca@udistrital.edu', '20/04/2001');
INSERT INTO Estudiante VALUES ('4', '2', 'Valeria', 'Amador', sysdate, 'VAmador@udistrital.edu', '20/04/2001');
INSERT INTO Estudiante VALUES ('5', '2', 'Sebastian', 'Domingo', sysdate, 'SDomingo@udistrital.edu', '20/04/2001');
--Estudiantes Macarena
INSERT INTO Estudiante VALUES ('6', '3', 'Juan', 'Pedrosa', sysdate, 'JPedrosa@udistrital.edu', '20/04/2001');
INSERT INTO Estudiante VALUES ('7', '3', 'Nacho', 'Crespi', sysdate, 'NCrespi@udistrital.edu', '20/04/2001');
INSERT INTO Estudiante VALUES ('8', '3', 'Candelaria', 'Caballero', sysdate, 'CCaballero@udistrital.edu', '20/04/2001');
--Estudiantes ASAB
INSERT INTO Estudiante VALUES ('9', '4', 'Jose', 'Font', sysdate, 'JFont@udistrital.edu', '20/04/2001');
INSERT INTO Estudiante VALUES ('10', '4', 'Vidal', 'Juarez', sysdate, 'VJuarez@udistrital.edu', '20/04/2001');

















--DIA
INSERT INTO Dia VALUES ('1','Lunes');
INSERT INTO Dia VALUES ('2','Martes');
INSERT INTO Dia VALUES ('3','Miercoles');
INSERT INTO Dia VALUES ('4','Jueves');
INSERT INTO Dia VALUES ('5','Viernes');
INSERT INTO Dia VALUES ('6','Sabado');
INSERT INTO Dia VALUES ('7','Domingo');




--PROGRAMACIoN
--4 CURSOS
INSERT INTO Programacion VALUES (1, '5', '6', '20221', 'CU', '06', '08', '1', 30, 15); 
INSERT INTO Programacion VALUES (2, '20', '4', '20221', 'CU', '08', '10', '1', 30, 12);
INSERT INTO Programacion VALUES (3, '5', '5', '20221', 'CU', '10', '12', '1', 30, 3); 
INSERT INTO Programacion VALUES (4, '8', '3', '20221', 'CU', '12', '14', '1', 30, 29); 

--4 Equipos de entrenamiento
INSERT INTO Programacion VALUES (5, '5', '7', '20221', 'EN', '06', '08', '2', 30, 22);
INSERT INTO Programacion VALUES (6, '5', '7', '20221', 'EN', '08', '10', '2', 30, 21);
INSERT INTO Programacion VALUES (7, '5', '7', '20221', 'EN', '10', '12', '2', 30, 19);
INSERT INTO Programacion VALUES (8, '5', '7', '20221', 'EN', '12', '14', '2', 30, 7);

--4 practicas libre
INSERT INTO Programacion VALUES (9, '6', '1', '20221', 'PR', '06', '08', '3', 30, 2);
INSERT INTO Programacion VALUES (10, '6', '1', '20221', 'PR', '08', '10', '3', 30, 8);
INSERT INTO Programacion VALUES (11, '6', '1', '20221', 'PR', '10', '12', '3', 30, 7);
INSERT INTO Programacion VALUES (12, '6', '1', '20221', 'PR', '12', '14', '3', 30, 6);



--Espacio-Deporte
INSERT INTO Espacio_Deporte VALUES ('6','5');
INSERT INTO Espacio_Deporte VALUES ('4','20');
INSERT INTO Espacio_Deporte VALUES ('5','5');
INSERT INTO Espacio_Deporte VALUES ('3','7');
INSERT INTO Espacio_Deporte VALUES ('7','5');
INSERT INTO Espacio_Deporte VALUES ('1','6');



--ElemenDeportivo
--Sede ingenieria
INSERT INTO ElemenDeportivo VALUES (1, '1', '1', '2', '10', sysdate);
INSERT INTO ElemenDeportivo VALUES (2, '2', '1', '2', '10', sysdate);
INSERT INTO ElemenDeportivo VALUES (3, '3', '2', '2', '10', sysdate);
INSERT INTO ElemenDeportivo VALUES (4, '4', '2', '2', '10', sysdate);
INSERT INTO ElemenDeportivo VALUES (5, '5', '2', '2', '10', sysdate);

--Sede macarena
INSERT INTO ElemenDeportivo VALUES (6, '6', '1', '3', '10', sysdate);
INSERT INTO ElemenDeportivo VALUES (7, '7', '1', '3', '10', sysdate);
INSERT INTO ElemenDeportivo VALUES (8, '8', '2', '3', '10', sysdate);
INSERT INTO ElemenDeportivo VALUES (9, '9', '2', '3', '10', sysdate);
INSERT INTO ElemenDeportivo VALUES (10, '10', '2', '3', '10', sysdate);






--Tabla de responsable
INSERT INTO RESPONSABLE VALUES (1,1,'2','3','1','03/05/2022','04/05/2022');
--Tabla deporte_TipoElemento

INSERT INTO deporte_tipoelemento VALUES ('2','6');
INSERT INTO deporte_tipoelemento VALUES ('3','5');
INSERT INTO deporte_tipoelemento VALUES ('4','3');
INSERT INTO deporte_tipoelemento VALUES ('6','9');
INSERT INTO deporte_tipoelemento VALUES ('8','10');

commit;