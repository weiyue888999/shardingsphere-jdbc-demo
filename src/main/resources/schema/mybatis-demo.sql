CREATE TABLE `t_user_0` (
  `id` bigint(11) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_user_1` (
  `id` bigint(11) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `t_user_2` (
  `id` bigint(11) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `t_user_3` (
  `id` bigint(11) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_0` (
`id`  bigint(11) UNSIGNED NOT NULL ,
`uid`  bigint(11) UNSIGNED NOT NULL ,
`pid`  bigint(11) UNSIGNED NOT NULL ,
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_1` (
`id`  bigint(11) UNSIGNED NOT NULL ,
`uid`  bigint(11) UNSIGNED NOT NULL ,
`pid`  bigint(11) UNSIGNED NOT NULL ,
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `t_order_2` (
`id`  bigint(11) UNSIGNED NOT NULL ,
`uid`  bigint(11) UNSIGNED NOT NULL ,
`pid`  bigint(11) UNSIGNED NOT NULL ,
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `t_order_3` (
`id`  bigint(11) UNSIGNED NOT NULL ,
`uid`  bigint(11) UNSIGNED NOT NULL ,
`pid`  bigint(11) UNSIGNED NOT NULL ,
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_dict` (
  `id` BIGINT(20) UNSIGNED NOT NULL,
  `type` VARCHAR(45) NULL,
  `key` VARCHAR(45) NULL,
  `val` VARCHAR(45) NULL,
  PRIMARY KEY (`id`)
);
