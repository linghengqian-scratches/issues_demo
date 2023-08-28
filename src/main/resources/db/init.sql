DROP TABLE IF EXISTS `oauth_user`;

CREATE TABLE `oauth_user`
(
    `id`   BIGINT PRIMARY KEY,
    `identifyId` VARCHAR(255),
    `deleteStatus`  INT
);