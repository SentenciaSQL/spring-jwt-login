INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$6cs2MtG2zdCCz/X2zbkC9.sGUbqtI8jDM7SzqYGllOMcIBLBE13vW', 1, 'Andres', 'Frias', 'inf512.andres.frias@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$y7sGl5c06ZKpOxMRFX31XucXPNUGzWdopeu.bDROO35uxkhKM9qQy', 1, 'John', 'Doe', 'john.doe@mail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('subscriber', '$2a$10$RaKPDEMGsSYcHSxHjdgu0.za5D3R0DaKpg9rcJ0z.3SMorddOkeve', 1, 'Jose', 'Gomez', 'subscriber@mail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');
INSERT INTO roles (nombre) VALUES ('ROLE_SUBSCRIBER');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (3, 3);