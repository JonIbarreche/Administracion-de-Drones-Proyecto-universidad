BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "usuarios" (
	"id"	INTEGER NOT NULL,
	"user"	TEXT NOT NULL,
	"password"	INTEGER NOT NULL,
	"idUsuario"	INTEGER,
	PRIMARY KEY("id")
);
INSERT INTO "usuarios" ("id","user","password","idUsuario") VALUES (1,'root','4813494d137e1631bba301d5acab6e7bb7aa74ce1185d456565ef51d737677b2',1111);
COMMIT;
