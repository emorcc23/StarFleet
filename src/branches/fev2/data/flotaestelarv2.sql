/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Álvaro Santos
 * Created: 10-nov-2018
 */

DROP DATABASE IF EXISTS starfleetv2;
CREATE DATABASE starfleetv2;
USE starfleetv2;

CREATE TABLE ship (
id_ship INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
captain VARCHAR (100) NOT NULL,
alias VARCHAR (100) NOT NULL,
licenceplate VARCHAR (100) NOT NULL,
kind VARCHAR (100) NOT NULL,
image VARCHAR (100) NOT NULL);

CREATE TABLE tripulant (
id_tripulant INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
alias VARCHAR (100) NOT NULL,
charge VARCHAR (100) NOT NULL,
gender VARCHAR (100) NOT NULL,
experience INT NOT NULL,
origin VARCHAR (100) NOT NULL,
race VARCHAR (100) NOT NULL,
age INT NOT NULL,
image VARCHAR (100) NOT NULL,
id_ship INT NOT NULL,
CONSTRAINT fk_tripulant_ship
FOREIGN KEY (id_ship)
REFERENCES ship (id_ship));

CREATE TABLE mission (
id_mission INT NOT NULL PRIMARY KEY AUTO_INCREMENT, 
alias VARCHAR (100) NOT NULL,
id_ship INT NOT NULL,
CONSTRAINT fk_mission_ship
FOREIGN KEY (id_ship)
REFERENCES ship (id_ship),
description VARCHAR (100) NOT NULL);

CREATE TABLE logbook (
id_logbook INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_ship INT NOT NULL,
CONSTRAINT fk_logbook_ship
FOREIGN KEY (id_ship)
REFERENCES ship (id_ship),
datee DATE NOT NULL,
description VARCHAR (100) NOT NULL,
audio VARCHAR (100) NOT NULL);

START TRANSACTION;
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain1","alias1","licenceplate1","kind1","image1");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain2","alias2","licenceplate2","kind2","image2");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain3","alias3","licenceplate3","kind3","image3");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain4","alias4","licenceplate4","kind4","image4");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain5","alias5","licenceplate5","kind5","image5");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain6","alias6","licenceplate6","kind6","image6");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain7","alias7","licenceplate7","kind7","image7");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain8","alias8","licenceplate8","kind8","image8");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain9","alias9","licenceplate9","kind9","image9");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain10","alias10","licenceplate10","kind2","image10");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain11","alias11","licenceplate11","kind1","image11");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain12","alias12","licenceplate12","kind2","image12");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain13","alias13","licenceplate13","kind1","image13");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain14","alias14","licenceplate14","kind2","image14");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain15","alias15","licenceplate15","kind1","image15");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain16","alias16","licenceplate16","kind2","image16");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain17","alias17","licenceplate17","kind1","image17");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain18","alias18","licenceplate18","kind2","image18");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain19","alias19","licenceplate19","kind1","image19");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain20","alias20","licenceplate20","kind2","image20");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain21","alias21","licenceplate21","kind1","image21");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain22","alias22","licenceplate22","kind2","image22");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain23","alias23","licenceplate23","kind2","image23");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain24","alias24","licenceplate24","kind2","image24");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain25","alias25","licenceplate25","kind1","image25");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain26","alias26","licenceplate26","kind2","image26");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain27","alias27","licenceplate27","kind1","image27");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain28","alias28","licenceplate28","kind2","image28");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain29","alias29","licenceplate29","kind1","image29");
INSERT INTO ship(captain,alias,licenceplate,kind,image)VALUES("captain30","alias30","licenceplate30","kind2","image30");
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias1","charge1","gender1",1,"origin1","race1",18,"image1",30);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias2","charge2","gender2",2,"origin2","race2",19,"image2",29);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias3","charge3","gender3",3,"origin3","race3",20,"image3",28);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias4","charge4","gender4",4,"origin4","race4",21,"image4",27);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias5","charge5","gender5",5,"origin5","race5",22,"image5",26);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias6","charge6","gender6",6,"origin6","race6",23,"image6",25);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias7","charge7","gender7",7,"origin7","race7",24,"image7",24);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias8","charge8","gender8",8,"origin8","race8",25,"image8",23);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias9","charge9","gender9",9,"origin9","race9",26,"image9",22);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias10","charge10","gender10",10,"origin10","race10",27,"image10",21);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias11","charge11","gender11",11,"origin11","race11",28,"image11",20);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias12","charge12","gender12",12,"origin12","race12",29,"image12",19);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias13","charge13","gender13",13,"origin13","race13",30,"image13",18);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias14","charge14","gender14",14,"origin14","race14",31,"image14",17);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias15","charge15","gender15",15,"origin15","race15",20,"image15",16);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias16","charge16","gender16",16,"origin16","race16",21,"image16",15);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias17","charge17","gender17",17,"origin17","race17",22,"image17",14);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias18","charge18","gender18",18,"origin18","race18",23,"image18",13);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias19","charge19","gender19",19,"origin19","race19",24,"image19",12);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias20","charge20","gender20",20,"origin20","race20",25,"image20",11);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias21","charge21","gender21",21,"origin21","race21",23,"image21",10);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias22","charge22","gender22",22,"origin22","race22",30,"image22",9);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias23","charge23","gender23",23,"origin23","race23",32,"image23",8);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias24","charge24","gender24",24,"origin24","race24",35,"image24",7);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias25","charge25","gender25",25,"origin25","race25",28,"image25",6);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias26","charge26","gender26",26,"origin26","race26",30,"image26",5);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias27","charge27","gender27",27,"origin27","race27",19,"image27",4);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias28","charge28","gender28",28,"origin28","race28",20,"image28",3);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias29","charge29","gender29",29,"origin29","race29",22,"image29",2);
INSERT INTO tripulant(alias,charge,gender,experience,origin,race,age,image,id_ship)VALUES("alias30","charge30","gender30",30,"origin30","race30",25,"image30",1);
INSERT INTO mission (alias,id_ship,description) VALUES ("alias1",1,"description1");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias2",2,"description2");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias3",3,"description3");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias4",4,"description4");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias5",5,"description5");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias6",6,"description6");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias7",7,"description7");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias8",8,"description8");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias9",9,"description9");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias10",10,"description10");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias11",11,"description11");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias12",12,"description12");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias13",13,"description13");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias14",14,"description14");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias15",15,"description15");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias16",16,"description16");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias17",17,"description17");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias18",18,"description18");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias19",19,"description19");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias20",20,"description20");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias21",21,"description21");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias22",22,"description22");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias23",23,"description23");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias24",24,"description24");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias25",25,"description25");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias26",26,"description26");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias27",27,"description27");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias28",28,"description28");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias29",29,"description29");
INSERT INTO mission (alias,id_ship,description) VALUES ("alias30",30,"description30");
INSERT INTO logbook (id_ship,datee,description,audio)VALUES(1, "2020/05/07","description1","audio1");
INSERT INTO logbook (id_ship,datee,description,audio)VALUES(2, "2030/05/07","description2","audio2");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(3, "2020/05/07","description3","audio3");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(4, "2040/05/07","description4","audio4");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(5, "2020/05/07","description5","audio5");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(6, "2020/05/07","description6","audio6");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(7, "2020/05/07","description7","audio7");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(8, "2020/05/07","description8","audio8");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(9, "2020/05/07","description9","audio9");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(10, "2020/05/07","description10","audio10");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(11, "2021/05/07","description11","audio11");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(12, "2025/05/07","description12","audio12");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(13, "2023/05/07","description13","audio13");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(14, "2021/05/07","description14","audio14");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(15, "2020/05/07","description15","audio15");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(16, "2020/05/07","description16","audio16");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(17, "2027/05/07","description17","audio17");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(18, "2020/05/07","description18","audio18");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(19, "2020/05/07","description19","audio19");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(20, "2020/05/07","description20","audio20");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(21, "2020/05/07","description21","audio21");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(22, "2020/05/07","description22","audio22");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(23, "2020/05/07","description23","audio23");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(24, "2020/05/07","description24","audio24");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(25, "2020/05/07","description25","audio25");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(26, "2020/05/07","description26","audio26");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(27, "2020/05/07","description27","audio27");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(28, "2020/05/07","description28","audio28");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(29, "2020/05/07","description29","audio29");
INSERT INTO logbook(id_ship,datee,description,audio)VALUES(30, "2020/05/07","description30","audio30");
COMMIT; 

SELECT * FROM ship;
SELECT * FROM tripulant;
SELECT * FROM mission;
SELECT * FROM logbook;