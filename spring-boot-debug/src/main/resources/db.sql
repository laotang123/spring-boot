Create Database If Not Exists test Character Set UTF8;
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
                            `id` int(11) NOT NULL COMMENT '主键',
                            `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
                            `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
                            PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
INSERT INTO `student` VALUES (1, '张三', 18);
INSERT INTO `student` VALUES (2, '李四', 19);
INSERT INTO `student` VALUES (3, '王五', 20);