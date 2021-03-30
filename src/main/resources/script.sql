drop database players;
create schema players;
use players;
create table  if not exists players_list
(
    id       INT(2) NOT NULL primary key,
    name     VARCHAR(45),
    team     VARCHAR(45),
    no       INT(2),
    position varchar(5)
    );
INSERT INTO players_list
VALUES (1, 'Cristiano Ronaldo','Juventus',7,'CF');
INSERT INTO players_list
VALUES (2, 'Steven Gerard', 'Liverpool FC',8,'CM');
INSERT INTO players_list
VALUES (30, 'Paulo Dybala', 'Juventus',10,'CAM');
INSERT INTO players_list
VALUES (4, 'Cristi Tanase', 'Steaua Bucuresti',10,'CAM');