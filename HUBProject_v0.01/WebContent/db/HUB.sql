--DROP TABLE USER_TB;
--DROP TABLE BUCKETLIST_TB;
--DROP TABLE FRIEND_TB;
--DROP TABLE GROUP_TB;
--DROP TABLE COOPER_TB;
--DROP TABLE POST_TB;
--DROP TABLE CONNCHAIN_TB;
--DROP TABLE USERCONN_TB;
--DROP TABLE BUCKETCONN_TB;
--DROP TABLE GROUPCONN_TB;
--DROP TABLE USERGROUP_TB;
--DROP TABLE COCONN_TB;
--DROP TABLE USERPOST;
--COMMIT;




CREATE TABLE USER_TB(
PRIMARY KEY(USERID),
USERID VARCHAR2(20),
PW VARCHAR2(30),
EMAIL VARCHAR2(50),
LISTOPTION NUMBER,
PICTURE VARCHAR2(50),
INTRODUCE VARCHAR2(2000),
ADMIN CHAR(1)
);

CREATE TABLE BUCKETLIST_TB(
PRIMARY KEY(BUCKETID),
BUCKETID NUMBER,
BUCKETNAME VARCHAR2(100),
GOALDAY VARCHAR2(20),
STARGRADE NUMBER,
MEMO VARCHAR2(500),
SOS VARCHAR2(200),
LOCKER CHAR(1),
USERID VARCHAR2(20)
);

CREATE TABLE FRIEND_TB(
PRIMARY KEY(USERID, FRIENDID),
USERID VARCHAR2(20),
FRIENDID VARCHAR2(20),
RELATION CHAR(4)
);


CREATE TABLE GROUP_TB(
PRIMARY KEY(GROUPID),
GROUPID NUMBER,
TITLE VARCHAR2(100),
USERID VARCHAR2(20),
DEADLINE DATE,
LOCAL CHAR(4),
INTRODUCE VARCHAR2(4000),
MAXPEOPLE NUMBER
);

CREATE TABLE COOPER_TB(
PRIMARY KEY(COID),
COID NUMBER,
CONMAE VARCHAR2(20),
BANNER VARCHAR2(50),
STARTDAY DATE,
LASTDAY DATE
);

CREATE TABLE POST_TB(
PRIMARY KEY(POSTID),
POSTID NUMBER,
SENDERID VARCHAR2(20),
RECIEVERID VARCHAR2(20),
DAYTIME DATE,
CONTENT VARCHAR2(1000)
);

CREATE TABLE CONNCHAIN_TB(
PRIMARY KEY(CONNCHAIN),
CONNCHAIN VARCHAR2(10)
);

CREATE TABLE USERCONN_TB(
PRIMARY KEY(USERID, CONNCHAIN),
USERID VARCHAR2(20),
CONNCHAIN VARCHAR2(10)
);

CREATE TABLE BUCKETCONN_TB(
PRIMARY KEY(BUCKETID, CONNCHAIN),
BUCKETID NUMBER,
CONNCHAIN VARCHAR2(10)
);

CREATE TABLE GROUPCONN_TB(
PRIMARY KEY(GRUOPID, CONNCHAIN),
GRUOPID NUMBER,
CONNCHAIN VARCHAR2(10)
);

CREATE TABLE USERGROUP_TB(
PRIMARY KEY(USERID, GROUPID),
USERID VARCHAR2(20),
GROUPID NUMBER
);

CREATE TABLE COCONN_TB(
PRIMARY KEY(COID, CONNCHAIN),
COID NUMBER,
CONNCHAIN VARCHAR2(10)
);

CREATE TABLE USERPOST(
PRIMARY KEY(USERID, POSTID),
USERID VARCHAR2(20),
POSTID NUMBER
);

insert into USER_TB values('admin', 'admin', null, null, null, null, 1);
insert into USER_TB values('hub', 'hub', 'hub@hub.com', 3, null, '안녕하세요 HUB입니다.', null);
insert into USER_TB values('111', '111', '111@hub.com', 3, null, '안녕하세요 111입니다.', null);
insert into Userconn values('hub', '운동');
insert into Userconn values('111', '여행');
insert into Bucketlist_tb values(1, '세계일주 하기', '죽기전에', 2, '꼭 가야지', '돈이 없음', 0, 'hub');
insert into Bucketlist_tb values(2, '호날두 따라잡기', '내일까지', 5, '가능할까?', '축구화가 없음', 0, '111');
insert into bucketconn_tb values(1, '여행');
insert into bucketconn_tb values(2, '운동');
insert into connchain_tb values('여행');
insert into connchain_tb values('운동');



COMMIT;