/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : designbuild

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 03/07/2021 12:29:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator`  (
  `adminid` int NOT NULL,
  `adminname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`adminid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES (1, 'admin', 'admin');
INSERT INTO `administrator` VALUES (2, 'Davis', '244545083');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `categoryid` int NOT NULL,
  `categoryname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`categoryid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, 'Humidity Sensor');
INSERT INTO `category` VALUES (2, 'Temperature Sensor');
INSERT INTO `category` VALUES (3, 'Door/ Window Sensor');

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company`  (
  `companyid` int NOT NULL,
  `companyname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`companyid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES (1, 'Mi Institute', '195216361');
INSERT INTO `company` VALUES (2, 'Elit Elit Fermentum Ltd', '972728752');
INSERT INTO `company` VALUES (3, 'Est Ac Company', '170139208');
INSERT INTO `company` VALUES (4, 'Ullamcorper Eu Euismod Corp.', '154394019');
INSERT INTO `company` VALUES (5, 'Dui Incorporated', '944498906');

-- ----------------------------
-- Table structure for data
-- ----------------------------
DROP TABLE IF EXISTS `data`;
CREATE TABLE `data`  (
  `dataid` int NOT NULL,
  `dataname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `value` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `time` datetime NOT NULL,
  `deviceid` int NOT NULL,
  PRIMARY KEY (`dataid`) USING BTREE,
  INDEX `fk_data_device_1`(`deviceid`) USING BTREE,
  CONSTRAINT `fk_data_device_1` FOREIGN KEY (`deviceid`) REFERENCES `device` (`deviceid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of data
-- ----------------------------

-- ----------------------------
-- Table structure for device
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device`  (
  `deviceid` int NOT NULL,
  `devicename` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `categoryid` int NOT NULL,
  `familyid` int NOT NULL,
  `companyid` int NOT NULL,
  PRIMARY KEY (`deviceid`) USING BTREE,
  INDEX `fk_device_category_1`(`categoryid`) USING BTREE,
  INDEX `fk_device_family_1`(`familyid`) USING BTREE,
  INDEX `fk_device_company_1`(`companyid`) USING BTREE,
  CONSTRAINT `fk_device_category_1` FOREIGN KEY (`categoryid`) REFERENCES `category` (`categoryid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_device_company_1` FOREIGN KEY (`companyid`) REFERENCES `company` (`companyid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_device_family_1` FOREIGN KEY (`familyid`) REFERENCES `family` (`familyid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of device
-- ----------------------------
INSERT INTO `device` VALUES (5713560, 'lorem', 'eros', 2, 16, 5);
INSERT INTO `device` VALUES (5896180, 'consequat', 'orci', 1, 11, 3);
INSERT INTO `device` VALUES (6076215, 'nec', 'felis.', 3, 22, 3);
INSERT INTO `device` VALUES (6508714, 'mauris', 'vitae', 1, 28, 1);
INSERT INTO `device` VALUES (6974001, 'velit', 'ut', 3, 10, 1);
INSERT INTO `device` VALUES (7148443, 'at', 'luctus', 2, 17, 5);
INSERT INTO `device` VALUES (7463841, 'Lorem', 'erat', 3, 12, 2);
INSERT INTO `device` VALUES (7957838, 'non,', 'ipsum', 1, 3, 2);
INSERT INTO `device` VALUES (8229801, 'egestas', 'habitant', 2, 13, 3);
INSERT INTO `device` VALUES (8319428, 'libero', 'elit', 2, 7, 4);
INSERT INTO `device` VALUES (8508655, 'nisi', 'id', 2, 10, 4);
INSERT INTO `device` VALUES (9929129, 'nibh.', 'sit', 1, 18, 5);
INSERT INTO `device` VALUES (10084147, 'Aenean', 'lorem.', 3, 27, 2);
INSERT INTO `device` VALUES (10507559, 'lorem,', 'felis,', 3, 18, 1);
INSERT INTO `device` VALUES (11184378, 'tempus', 'Proin', 2, 11, 2);
INSERT INTO `device` VALUES (11799511, 'risus', 'non', 2, 30, 1);
INSERT INTO `device` VALUES (11866320, 'enim', 'sagittis', 1, 24, 5);
INSERT INTO `device` VALUES (11946866, 'Sed', 'et', 3, 3, 5);
INSERT INTO `device` VALUES (15862900, 'nulla.', 'Aliquam', 1, 1, 5);
INSERT INTO `device` VALUES (16104780, 'semper', 'nulla', 3, 16, 4);
INSERT INTO `device` VALUES (16355739, 'Phasellus', 'sagittis', 3, 30, 1);
INSERT INTO `device` VALUES (16467298, 'et,', 'ornare', 1, 10, 5);
INSERT INTO `device` VALUES (16904025, 'arcu', 'Aliquam', 2, 14, 1);
INSERT INTO `device` VALUES (17016898, 'amet', 'nunc', 1, 5, 5);
INSERT INTO `device` VALUES (17020936, 'Proin', 'tempus', 3, 27, 1);
INSERT INTO `device` VALUES (17193632, 'Aenean', 'purus', 2, 18, 5);
INSERT INTO `device` VALUES (17958348, 'scelerisque', 'Vivamus', 1, 24, 4);
INSERT INTO `device` VALUES (19440746, 'Integer', 'risus.', 3, 29, 2);
INSERT INTO `device` VALUES (19687513, 'tristique', 'eget', 2, 22, 1);
INSERT INTO `device` VALUES (20760666, 'at,', 'sem', 1, 19, 5);
INSERT INTO `device` VALUES (20925594, 'vel,', 'dictum', 1, 29, 4);
INSERT INTO `device` VALUES (21772370, 'Vivamus', 'ut', 2, 30, 5);
INSERT INTO `device` VALUES (21809457, 'Nulla', 'diam', 3, 16, 1);
INSERT INTO `device` VALUES (21952461, 'pede', 'a,', 3, 1, 5);
INSERT INTO `device` VALUES (22997086, 'Nullam', 'risus.', 2, 3, 3);
INSERT INTO `device` VALUES (23017624, 'velit', 'arcu', 1, 16, 1);
INSERT INTO `device` VALUES (23468769, 'adipiscing.', 'augue', 2, 15, 1);
INSERT INTO `device` VALUES (23510343, 'nunc', 'Pellentesque', 1, 14, 4);
INSERT INTO `device` VALUES (24029644, 'at,', 'lobortis', 3, 16, 3);
INSERT INTO `device` VALUES (24388854, 'tortor.', 'pharetra', 1, 29, 2);
INSERT INTO `device` VALUES (24734658, 'mi.', 'dis', 2, 22, 4);
INSERT INTO `device` VALUES (25715140, 'non', 'mus.', 3, 25, 1);
INSERT INTO `device` VALUES (25733444, 'a', 'enim', 3, 15, 3);
INSERT INTO `device` VALUES (25760431, 'vestibulum.', 'ornare.', 3, 24, 3);
INSERT INTO `device` VALUES (25940382, 'rutrum', 'Nunc', 2, 23, 1);
INSERT INTO `device` VALUES (26324424, 'elit.', 'Duis', 1, 17, 4);
INSERT INTO `device` VALUES (26363092, 'non,', 'non,', 3, 4, 4);
INSERT INTO `device` VALUES (26643304, 'cursus', 'tincidunt', 2, 24, 1);
INSERT INTO `device` VALUES (27823880, 'Fusce', 'lacinia', 2, 18, 2);
INSERT INTO `device` VALUES (28430941, 'lacus', 'iaculis', 2, 30, 4);
INSERT INTO `device` VALUES (29173776, 'ligula', 'eros.', 3, 9, 5);
INSERT INTO `device` VALUES (29206813, 'sit', 'sociosqu', 2, 23, 2);
INSERT INTO `device` VALUES (31214603, 'neque', 'eu', 2, 1, 2);
INSERT INTO `device` VALUES (31414152, 'sagittis', 'lobortis', 2, 16, 4);
INSERT INTO `device` VALUES (32432046, 'at', 'sit', 1, 16, 4);
INSERT INTO `device` VALUES (33113574, 'non,', 'amet,', 2, 11, 2);
INSERT INTO `device` VALUES (33398104, 'neque', 'in', 1, 16, 4);
INSERT INTO `device` VALUES (33804113, 'non', 'magna.', 2, 4, 2);
INSERT INTO `device` VALUES (34511840, 'Integer', 'Nulla', 3, 30, 4);
INSERT INTO `device` VALUES (34588290, 'nostra,', 'sollicitudin', 2, 6, 5);
INSERT INTO `device` VALUES (34829436, 'Aliquam', 'rutrum', 2, 25, 3);
INSERT INTO `device` VALUES (35631555, 'dui,', 'diam.', 3, 18, 1);
INSERT INTO `device` VALUES (36031035, 'egestas', 'dui,', 3, 9, 1);
INSERT INTO `device` VALUES (36213504, 'semper,', 'Quisque', 3, 15, 5);
INSERT INTO `device` VALUES (36305580, 'semper', 'mauris', 1, 26, 2);
INSERT INTO `device` VALUES (36680919, 'Fusce', 'senectus', 1, 28, 3);
INSERT INTO `device` VALUES (37231093, 'dolor', 'justo.', 1, 18, 4);
INSERT INTO `device` VALUES (37626367, 'est', 'ultricies', 2, 15, 2);
INSERT INTO `device` VALUES (37943647, 'Vivamus', 'aliquam,', 3, 23, 4);
INSERT INTO `device` VALUES (38187816, 'lectus', 'facilisis', 2, 27, 5);
INSERT INTO `device` VALUES (38684277, 'aptent', 'eget', 1, 14, 5);
INSERT INTO `device` VALUES (38744480, 'molestie', 'ut', 1, 8, 4);
INSERT INTO `device` VALUES (38772062, 'mi', 'Nulla', 2, 24, 5);
INSERT INTO `device` VALUES (39170228, 'fringilla', 'magna,', 2, 28, 4);
INSERT INTO `device` VALUES (39231292, 'vel', 'enim.', 2, 11, 5);
INSERT INTO `device` VALUES (39304173, 'cursus', 'sagittis.', 3, 22, 2);
INSERT INTO `device` VALUES (39552651, 'Suspendisse', 'mollis', 1, 4, 1);
INSERT INTO `device` VALUES (39925603, 'vitae', 'id', 3, 20, 5);
INSERT INTO `device` VALUES (39957502, 'sagittis.', 'Duis', 2, 8, 3);
INSERT INTO `device` VALUES (40015847, 'eu,', 'et,', 1, 26, 1);
INSERT INTO `device` VALUES (40296893, 'eu', 'pulvinar', 1, 27, 4);
INSERT INTO `device` VALUES (40342751, 'fringilla', 'sed,', 2, 9, 3);
INSERT INTO `device` VALUES (40667601, 'Etiam', 'Nam', 1, 23, 5);
INSERT INTO `device` VALUES (40715319, 'conubia', 'nibh', 1, 11, 3);
INSERT INTO `device` VALUES (41495353, 'nisi', 'at,', 1, 15, 5);
INSERT INTO `device` VALUES (41774142, 'ac', 'libero.', 1, 15, 5);
INSERT INTO `device` VALUES (42176303, 'sit', 'et', 2, 15, 5);
INSERT INTO `device` VALUES (42547310, 'in,', 'Aliquam', 1, 28, 3);
INSERT INTO `device` VALUES (42723981, 'justo', 'aliquam', 3, 24, 1);
INSERT INTO `device` VALUES (43648652, 'ac', 'eleifend,', 2, 16, 4);
INSERT INTO `device` VALUES (43701413, 'ut', 'massa.', 3, 8, 5);
INSERT INTO `device` VALUES (44221540, 'Morbi', 'arcu.', 3, 26, 3);
INSERT INTO `device` VALUES (45536188, 'Aliquam', 'Pellentesque', 1, 27, 1);
INSERT INTO `device` VALUES (46630516, 'cubilia', 'adipiscing', 3, 26, 4);
INSERT INTO `device` VALUES (47678635, 'dictum', 'orci', 2, 3, 3);
INSERT INTO `device` VALUES (47875143, 'iaculis', 'Sed', 2, 18, 3);
INSERT INTO `device` VALUES (48031097, 'enim', 'Sed', 3, 16, 1);
INSERT INTO `device` VALUES (49549934, 'sem,', 'aliquet', 3, 16, 5);
INSERT INTO `device` VALUES (50787718, 'aliquam,', 'Suspendisse', 2, 22, 4);
INSERT INTO `device` VALUES (50964287, 'porttitor', 'facilisis.', 2, 23, 3);

-- ----------------------------
-- Table structure for family
-- ----------------------------
DROP TABLE IF EXISTS `family`;
CREATE TABLE `family`  (
  `familyid` int NOT NULL,
  `familyname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`familyid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of family
-- ----------------------------
INSERT INTO `family` VALUES (1, 'Pitts');
INSERT INTO `family` VALUES (2, 'Lindsey');
INSERT INTO `family` VALUES (3, 'Buckner');
INSERT INTO `family` VALUES (4, 'Fisher');
INSERT INTO `family` VALUES (5, 'Wynn');
INSERT INTO `family` VALUES (6, 'Blackburn');
INSERT INTO `family` VALUES (7, 'Fernandez');
INSERT INTO `family` VALUES (8, 'Sawyer');
INSERT INTO `family` VALUES (9, 'Carrillo');
INSERT INTO `family` VALUES (10, 'Pace');
INSERT INTO `family` VALUES (11, 'Holman');
INSERT INTO `family` VALUES (12, 'Barrera');
INSERT INTO `family` VALUES (13, 'Stevenson');
INSERT INTO `family` VALUES (14, 'Quinn');
INSERT INTO `family` VALUES (15, 'Baldwin');
INSERT INTO `family` VALUES (16, 'Phelps');
INSERT INTO `family` VALUES (17, 'Sherman');
INSERT INTO `family` VALUES (18, 'Mcleod');
INSERT INTO `family` VALUES (19, 'Flowers');
INSERT INTO `family` VALUES (20, 'Crawford');
INSERT INTO `family` VALUES (21, 'Riley');
INSERT INTO `family` VALUES (22, 'Hampton');
INSERT INTO `family` VALUES (23, 'Rosa');
INSERT INTO `family` VALUES (24, 'Morris');
INSERT INTO `family` VALUES (25, 'Lynch');
INSERT INTO `family` VALUES (26, 'Newman');
INSERT INTO `family` VALUES (27, 'Graham');
INSERT INTO `family` VALUES (28, 'Wise');
INSERT INTO `family` VALUES (29, 'Foreman');
INSERT INTO `family` VALUES (30, 'Henson');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userid` int NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `familyid` int NOT NULL,
  PRIMARY KEY (`userid`) USING BTREE,
  INDEX `fk_user_family_1`(`familyid`) USING BTREE,
  CONSTRAINT `fk_user_family_1` FOREIGN KEY (`familyid`) REFERENCES `family` (`familyid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (5870468, 'Chadwick', '943022442', 11);
INSERT INTO `user` VALUES (6665403, 'Rhona', '597021658', 10);
INSERT INTO `user` VALUES (6983450, 'Caesar', '365634112', 23);
INSERT INTO `user` VALUES (7314765, 'Brynne', '497482703', 29);
INSERT INTO `user` VALUES (7351819, 'Melodie', '248065732', 28);
INSERT INTO `user` VALUES (8238591, 'Caesar', '666830633', 29);
INSERT INTO `user` VALUES (8384241, 'Kaye', '927782797', 3);
INSERT INTO `user` VALUES (9039620, 'Blossom', '421865882', 11);
INSERT INTO `user` VALUES (9433686, 'Griffin', '200119980', 22);
INSERT INTO `user` VALUES (9693232, 'Stephen', '791081763', 1);
INSERT INTO `user` VALUES (9903499, 'Serena', '897822839', 11);
INSERT INTO `user` VALUES (11222053, 'Christen', '713419737', 22);
INSERT INTO `user` VALUES (11259741, 'Abra', '535770895', 9);
INSERT INTO `user` VALUES (11449920, 'Jerry', '297821472', 10);
INSERT INTO `user` VALUES (11459060, 'Chancellor', '146020664', 3);
INSERT INTO `user` VALUES (11542088, 'Samantha', '092974864', 10);
INSERT INTO `user` VALUES (11651724, 'Ina', '311370647', 23);
INSERT INTO `user` VALUES (13307034, 'Kirk', '228697660', 10);
INSERT INTO `user` VALUES (13677229, 'Olympia', '269092417', 18);
INSERT INTO `user` VALUES (13695339, 'Noelani', '584142921', 27);
INSERT INTO `user` VALUES (13806190, 'Amery', '433575685', 9);
INSERT INTO `user` VALUES (15267679, 'Elmo', '688341205', 9);
INSERT INTO `user` VALUES (15897644, 'Lacey', '239013006', 13);
INSERT INTO `user` VALUES (16265583, 'Xanthus', '818350944', 2);
INSERT INTO `user` VALUES (16366834, 'Preston', '927397216', 18);
INSERT INTO `user` VALUES (16440877, 'Lana', '216127670', 30);
INSERT INTO `user` VALUES (17517236, 'Shelly', '755162690', 29);
INSERT INTO `user` VALUES (17741758, 'Caldwell', '714111994', 28);
INSERT INTO `user` VALUES (18028531, 'Elliott', '523191229', 30);
INSERT INTO `user` VALUES (18787967, 'Keelie', '552181125', 10);
INSERT INTO `user` VALUES (18970392, 'Aladdin', '910181684', 21);
INSERT INTO `user` VALUES (19808288, 'Amos', '840349047', 4);
INSERT INTO `user` VALUES (20262126, 'Bell', '955471206', 11);
INSERT INTO `user` VALUES (21509822, 'Shaeleigh', '301716577', 25);
INSERT INTO `user` VALUES (21570402, 'Fatima', '813324555', 13);
INSERT INTO `user` VALUES (21576986, 'Jeanette', '046581641', 26);
INSERT INTO `user` VALUES (22610379, 'Acton', '986283075', 12);
INSERT INTO `user` VALUES (22729885, 'Rogan', '321260085', 2);
INSERT INTO `user` VALUES (22988128, 'Ramona', '592180020', 15);
INSERT INTO `user` VALUES (23363766, 'Nasim', '988000774', 29);
INSERT INTO `user` VALUES (23538347, 'Roth', '125197889', 13);
INSERT INTO `user` VALUES (23774999, 'Ross', '265157792', 3);
INSERT INTO `user` VALUES (23901677, 'Burton', '467804530', 30);
INSERT INTO `user` VALUES (24061836, 'Carson', '800186140', 7);
INSERT INTO `user` VALUES (26022079, 'Naida', '137614798', 21);
INSERT INTO `user` VALUES (26440969, 'Mara', '109195909', 30);
INSERT INTO `user` VALUES (26539240, 'Calista', '806829891', 3);
INSERT INTO `user` VALUES (26617446, 'Petra', '886476712', 24);
INSERT INTO `user` VALUES (26886947, 'Kibo', '136576824', 13);
INSERT INTO `user` VALUES (26897737, 'Jillian', '873919401', 13);
INSERT INTO `user` VALUES (27083575, 'Carter', '881500003', 17);
INSERT INTO `user` VALUES (27318476, 'Joelle', '536378441', 27);
INSERT INTO `user` VALUES (27799608, 'Brielle', '613198597', 22);
INSERT INTO `user` VALUES (28343512, 'Camille', '324092253', 29);
INSERT INTO `user` VALUES (29532770, 'Fritz', '208988253', 23);
INSERT INTO `user` VALUES (29854653, 'Maya', '901682492', 27);
INSERT INTO `user` VALUES (30687546, 'Adele', '133481176', 21);
INSERT INTO `user` VALUES (31072026, 'Jeanette', '980065080', 21);
INSERT INTO `user` VALUES (31203878, 'Jemima', '858188832', 30);
INSERT INTO `user` VALUES (31723137, 'Xander', '147158455', 24);
INSERT INTO `user` VALUES (32102127, 'Dalton', '488507039', 13);
INSERT INTO `user` VALUES (32490602, 'Urielle', '996520813', 2);
INSERT INTO `user` VALUES (33080456, 'Tara', '730048493', 4);
INSERT INTO `user` VALUES (33426774, 'Jordan', '804710556', 25);
INSERT INTO `user` VALUES (33482429, 'Grace', '980082937', 6);
INSERT INTO `user` VALUES (33531470, 'Xanthus', '246573547', 6);
INSERT INTO `user` VALUES (33604058, 'Baker', '608233086', 15);
INSERT INTO `user` VALUES (34679875, 'Adrian', '098372832', 14);
INSERT INTO `user` VALUES (34832157, 'Gray', '026632844', 4);
INSERT INTO `user` VALUES (35227723, 'Hillary', '837611003', 5);
INSERT INTO `user` VALUES (35741221, 'Reagan', '228178224', 21);
INSERT INTO `user` VALUES (35863996, 'Mara', '346154578', 22);
INSERT INTO `user` VALUES (36263470, 'Claire', '725285829', 24);
INSERT INTO `user` VALUES (36284501, 'Salvador', '701544082', 9);
INSERT INTO `user` VALUES (37008288, 'Joel', '378840318', 22);
INSERT INTO `user` VALUES (37640808, 'Octavia', '008020307', 5);
INSERT INTO `user` VALUES (38232551, 'Madaline', '727003816', 28);
INSERT INTO `user` VALUES (38939391, 'Scott', '680182748', 19);
INSERT INTO `user` VALUES (38971976, 'Galvin', '321273161', 11);
INSERT INTO `user` VALUES (39725373, 'Lacota', '330862814', 14);
INSERT INTO `user` VALUES (40344254, 'Regina', '807120290', 7);
INSERT INTO `user` VALUES (40542558, 'Isaac', '773089032', 8);
INSERT INTO `user` VALUES (40980822, 'Wynter', '973722515', 24);
INSERT INTO `user` VALUES (41119438, 'Rebecca', '266945948', 17);
INSERT INTO `user` VALUES (42090903, 'Curran', '344578711', 23);
INSERT INTO `user` VALUES (42116489, 'Isabella', '593453764', 27);
INSERT INTO `user` VALUES (42302717, 'Kendall', '688809862', 2);
INSERT INTO `user` VALUES (42674061, 'Kai', '498544089', 18);
INSERT INTO `user` VALUES (43485334, 'Kay', '578365306', 8);
INSERT INTO `user` VALUES (45675331, 'Leandra', '645984063', 6);
INSERT INTO `user` VALUES (45755463, 'Jamalia', '695979211', 7);
INSERT INTO `user` VALUES (45975123, 'Dora', '831468020', 25);
INSERT INTO `user` VALUES (46170790, 'Emerson', '757821210', 16);
INSERT INTO `user` VALUES (46924417, 'Victor', '385396783', 4);
INSERT INTO `user` VALUES (47844690, 'Macaulay', '834402414', 14);
INSERT INTO `user` VALUES (48130535, 'Jamalia', '799711924', 17);
INSERT INTO `user` VALUES (48675214, 'Janna', '628618076', 22);
INSERT INTO `user` VALUES (49510206, 'Idola', '482271475', 16);
INSERT INTO `user` VALUES (50128004, 'Vera', '386149496', 4);
INSERT INTO `user` VALUES (50222898, 'Otto', '119758829', 22);

SET FOREIGN_KEY_CHECKS = 1;
