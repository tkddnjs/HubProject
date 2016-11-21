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
	ADMIN CHAR(3)
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
	RELATION NUMBER,
	CONFIRM CHAR(2)
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
	CONNCHAIN VARCHAR2(20)
);

CREATE TABLE USERCONN_TB(
PRIMARY KEY(USERID, CONNCHAIN),
	USERID VARCHAR2(20),
	CONNCHAIN VARCHAR2(20)
);

CREATE TABLE BUCKETCONN_TB(
	PRIMARY KEY(BUCKETID, CONNCHAIN),
	BUCKETID NUMBER,
	CONNCHAIN VARCHAR2(20)
);

CREATE TABLE GROUPCONN_TB(
	PRIMARY KEY(GROUPID, CONNCHAIN),
	GROUPID NUMBER,
	CONNCHAIN VARCHAR2(20)
);

CREATE TABLE USERGROUP_TB(
PRIMARY KEY(USERID, GROUPID),
	USERID VARCHAR2(20),
	GROUPID NUMBER
);

CREATE TABLE COCONN_TB(
PRIMARY KEY(COID, CONNCHAIN),
	COID NUMBER,
	CONNCHAIN VARCHAR2(20)
);

CREATE TABLE USERPOST(
PRIMARY KEY(USERID, POSTID),
	USERID VARCHAR2(20),
	POSTID NUMBER
);

create sequence bucketlist_seq start with 1 increment by 1;
create sequence cooper_seq start with 1 increment by 1;
create sequence group_seq start with 1 increment by 1;
create sequence post_seq start with 1 increment by 1;