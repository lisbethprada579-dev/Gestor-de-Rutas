
/* Llenado de Paradas */
INSERT INTO parada (id_parada, ubicacion) VALUES (1, 'Av Bucaros Cl 60');
INSERT INTO parada (id_parada, ubicacion) VALUES (2, 'C.C Acropolis Cl 56 D 14');
INSERT INTO parada (id_parada, ubicacion) VALUES (3, 'Cl 56 Cra 14 Macaregua');
INSERT INTO parada (id_parada, ubicacion) VALUES (4, 'Cl 60 Cra 15');
INSERT INTO parada (id_parada, ubicacion) VALUES (5, 'Cl 57 Cra 7');
INSERT INTO parada (id_parada, ubicacion) VALUES (6, 'Cl 55 Cra 6');
INSERT INTO parada (id_parada, ubicacion) VALUES (7, 'Cl 57 Cra 7');
INSERT INTO parada (id_parada, ubicacion) VALUES (8, 'Cl 57 Cra 3');
INSERT INTO parada (id_parada, ubicacion) VALUES (9, 'Cl 55 Cra 3');
INSERT INTO parada (id_parada, ubicacion) VALUES (10, 'Cl 57 Cra 7');
INSERT INTO parada (id_parada, ubicacion) VALUES (11, 'Cl. 61 #121 a 12-127');


/* Llenado de frecuencias */
INSERT INTO frecuencia (id, descripcion) VALUES (1, '5 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (2, '10 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (3, '15 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (4, '20 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (5, '25 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (6, '30 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (7, '35 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (8, '40 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (9, '45 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (10, '50 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (11, '55 Minutos');
INSERT INTO frecuencia (id, descripcion) VALUES (12, '1 Hora');


/* Llenado de rutas */
INSERT INTO ruta (id, nombre, recorrido, tipo) VALUES (1, 'Ciudad Norte', 'PABLON – COLORADOS – KENNEDY – HOSPITAL DEL NORTE – 
MIRAMAR – VÍA BUCARAMANGA – CALLE 12 – CARRERA 17 – CALLE 8 – CARRERA 30 – AVENIDA QUEBRADASECA – CARRERA 33 – CALLE 56 – PLAZA MAYOR – 
CALLE 55 – MARSELLA – CARRERA 2W – CALLE 55', 'Bus');
 
INSERT INTO ruta (id, nombre, recorrido, tipo) VALUES (2, 'Estoraques', 'ESTORAQUES – CALLE 60 – CARRERA 8W – CALLE 62 – CARRERA 2W – 
CALLE 63A – CARRERA 3 – NARANJOS – CALLE 55 – MARSELLA – PLAZA MAYOR -CALLE 56 – CARRERA 15 – CALLE 55 – CARRERA 17 – CALLE 37 – CARRERA 19 – 
CALLE 33 – CARRERA 31 – CALLE 32 – CARRERA 33 – LOS PINOS', 'Bus');
 
INSERT INTO ruta (id, nombre, recorrido, tipo) VALUES (3, 'Real de Minas', 'DON BOSCO – CARRERA 5 – CALLE 28 – CARRERA 10 – 
GLORIETA DE LA CARRERA 9 CON AVENIDA QUEBRADASECA – CARRERA 11 – CALLE 33 – CARRERA 19 – BOUEVARD SANTANDER – CALLE 14 – CARRERA 30 – 
AVENIDA QUEBRADASECA – MEGAMALL – CIUDAD BOLIVAR' ,'Bus');
   
INSERT INTO ruta (id, nombre, recorrido, tipo) VALUES (4, 'T2', 'LAGOS – PAYADOR – PROVENZA – DIAMANTE - LA ISLA – LA ROSITA – 
CHORRERAS – SAN MATEO – QUEBRADASECA' ,'Transporte Masivo');
 
 INSERT INTO ruta (id, nombre, recorrido, tipo) VALUES (5, 'P10', 'UIS - COLEGIO BETHLEMITAS - CARRERA 15 CALLE 13
  – QUEBRADASECA - LA ROSITA – MACAREGUA – UTS – RECREAR DEL MUTIS – CANCHA EL BUENO – COLEGIO DIVINO NIÑO – MERCOMFENALCO' ,'Transporte Masivo');
   
   
/* Llenado de paradas rutas */
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (1, 1);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (1, 11);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (1, 7);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (1, 6);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (2, 2);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (2, 9);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (2, 4);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (2, 5);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (3, 2);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (3, 8);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (3, 10);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (3, 11);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (4, 7);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (4, 3);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (4, 1);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (4, 4);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (5, 3);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (5, 8);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (5, 10);
INSERT INTO parada_ruta (id_ruta, id_parada) VALUES (5, 6);


/* Llenado de frecuencias rutas */
INSERT INTO frecuencia_ruta (id_ruta, id_frecuencia) VALUES (1, 7);
INSERT INTO frecuencia_ruta (id_ruta, id_frecuencia) VALUES (2, 5);
INSERT INTO frecuencia_ruta (id_ruta, id_frecuencia) VALUES (3, 6);
INSERT INTO frecuencia_ruta (id_ruta, id_frecuencia) VALUES (4, 4);
INSERT INTO frecuencia_ruta (id_ruta, id_frecuencia) VALUES (5, 5);


/* Llenado de puntos de recarga */
INSERT INTO punto_de_recarga (id, ubicacion) VALUES (1, 'Marsella Real, Local Av Buc Oeste #3-145 L12');
INSERT INTO punto_de_recarga (id, ubicacion) VALUES (2, 'a 14-63, Cl. 56 #14-1');
INSERT INTO punto_de_recarga (id, ubicacion) VALUES (3, 'Ciudadela Real de Minas, en el Conjunto Residencial Plaza Mayor entrada 5 local 105, establecimiento comercial llamado Ciber Plaza Internet');
INSERT INTO punto_de_recarga (id, ubicacion) VALUES (4, 'Cl. Real ## 6-74');
INSERT INTO punto_de_recarga (id, ubicacion) VALUES (5, 'Punto de Coopenessa en el Centro Comercial Acrópolis, local 204 A');


/* Llenado de usuarios */
INSERT INTO usuario (id, username, password) VALUES (1, 'admin', '$2a$10$clUzxo6.SOG5xC0CXoWIKOFUbEBF1UXX23G0Z3W4Uu4FwC3gscdv2');





