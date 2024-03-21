INSERT INTO `jwt_auth_db`.`users`
(`id`,
`password`,
`username`)
VALUES
(1,
'$2a$10$r1bTQpMAch0A.ccx2jaHMOpBtMXN5kj6DUofArJnHO1utPtLlBTjW',
'tej');

INSERT INTO `jwt_auth_db`.`users`
(`id`,
`password`,
`username`)
VALUES
(2,
'$2a$10$r1bTQpMAch0A.ccx2jaHMOpBtMXN5kj6DUofArJnHO1utPtLlBTjW',
'tejpratap');

INSERT INTO `jwt_auth_db`.`users`
(`id`,
`password`,
`username`)
VALUES
(3,
'$2a$10$r1bTQpMAch0A.ccx2jaHMOpBtMXN5kj6DUofArJnHO1utPtLlBTjW',
'tejpratapk');

INSERT INTO `jwt_auth_db`.`roles`
(`id`,
`name`)
VALUES
(1,
'ADMIN');

INSERT INTO `jwt_auth_db`.`roles`
(`id`,
`name`)
VALUES
(2,
'USER');

INSERT INTO `jwt_auth_db`.`users_roles`
(`roles_id`,
`user_info_id`)
VALUES
(1, 1);

INSERT INTO `jwt_auth_db`.`users_roles`
(`roles_id`,
`user_info_id`)
VALUES
(2, 2);

INSERT INTO `jwt_auth_db`.`users_roles`
(`roles_id`,
`user_info_id`)
VALUES
(2, 3);


