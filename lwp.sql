/*
 Navicat Premium Data Transfer

 Source Server         : LEP101
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : lwp

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 14/12/2021 21:09:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `course_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程编号',
  `course_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程名',
  `course_teacher` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任课教师',
  `course_credit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学分',
  `course_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程时间',
  PRIMARY KEY (`course_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('001', 'C++程序设计', '王建林', '3', '72');
INSERT INTO `course` VALUES ('002', 'JAVA程序设计', '周兵', '3', '72');
INSERT INTO `course` VALUES ('003', '数据结构', '袁彩虹', '3', '68');
INSERT INTO `course` VALUES ('004', '计算机组成原理', '郭拯危', '4', '68');
INSERT INTO `course` VALUES ('005', '计算机网络', '沈夏炯', '4', '72');
INSERT INTO `course` VALUES ('006', '操作系统', '张帆', '4', '72');
INSERT INTO `course` VALUES ('007', 'JavaWeb程序设计', '陈小潘', '3', '68');
INSERT INTO `course` VALUES ('008', '文献阅读与写作', '曹莹', '2', '36');
INSERT INTO `course` VALUES ('009', '数字图像处理', '杨会巾', '2', '72');
INSERT INTO `course` VALUES ('010', '算法设计与分析', '沈亚田', '3', '72');
INSERT INTO `course` VALUES ('011', '数据库系统概论', '梁文娟', '3', '72');
INSERT INTO `course` VALUES ('012', '软件工程', '刘春', '2', '54');
INSERT INTO `course` VALUES ('013', '机器学习', '罗慧敏', '4', '72');
INSERT INTO `course` VALUES ('014', '职业生涯规划', '孙洁', '2', '36');
INSERT INTO `course` VALUES ('015', '虚拟校园', '阎朝坤', '2', '36');
INSERT INTO `course` VALUES ('016', 'IT职业道德', '苗茹', '1', '18');
INSERT INTO `course` VALUES ('017', '编译原理', '杜莹', '3', '72');
INSERT INTO `course` VALUES ('018', '工程伦理', '许涛', '1', '18');
INSERT INTO `course` VALUES ('019', '计算机图形学', '姜保庆', '3', '72');
INSERT INTO `course` VALUES ('020', '逻辑设计', '周素芳', '3', '72');
INSERT INTO `course` VALUES ('021', '离散数学', '姜保庆', '3', '36');
INSERT INTO `course` VALUES ('022', '汇编语言与接口技术', '周柯', '3', '54');
INSERT INTO `course` VALUES ('023', '高等数学(上)', '杨学志', '4', '72');
INSERT INTO `course` VALUES ('024', '高等数学(下)', '杨学志', '4', '72');
INSERT INTO `course` VALUES ('025', '中国近代史', '陈珂', '2', '36');
INSERT INTO `course` VALUES ('026', '毛概(上)', '吴淼', '2', '36');
INSERT INTO `course` VALUES ('027', '形势与政策', '张涛', '2', '36');
INSERT INTO `course` VALUES ('028', '大数据分析数学基础', '周素芳', '3', '54');
INSERT INTO `course` VALUES ('029', '大学体育(一)', '张博', '2', '36');
INSERT INTO `course` VALUES ('030', '大学体育(二)', '张博', '2', '36');
INSERT INTO `course` VALUES ('031', '大学体育(三)', '张博', '2', '36');
INSERT INTO `course` VALUES ('032', '大学体育(四)', '张博', '2', '36');
INSERT INTO `course` VALUES ('033', '秦汉考古(在线慕课)', '张玲', '2', '36');
INSERT INTO `course` VALUES ('034', '基本电路与电子学', '李会萍', '4', '72');
INSERT INTO `course` VALUES ('035', '概率论与数理统计', '陈蕾', '3', '36');
INSERT INTO `course` VALUES ('036', '大数据平台技术', '刘春', '4', '90');
INSERT INTO `course` VALUES ('037', '数据分析与可视化', '周黎鸣', '4', '72');
INSERT INTO `course` VALUES ('038', '翻译概论', '侯健', '2', '36');
INSERT INTO `course` VALUES ('039', '英语听力(三)', '段煜', '2', '36');
INSERT INTO `course` VALUES ('040', '综合英语(三)', '白玉杰', '4', '144');
INSERT INTO `course` VALUES ('041', '英汉翻译(一)', '姜玲', '2', '36');
INSERT INTO `course` VALUES ('042', '英语会话(三)', '英语外教外语1', '2', '36');
INSERT INTO `course` VALUES ('043', '英语写作(二)', '杨书霞', '2', '36');
INSERT INTO `course` VALUES ('044', '高级英语1', '王运河', '3', '72');
INSERT INTO `course` VALUES ('045', '大学英语读写译(三)', '刘秀芬', '2', '36');
INSERT INTO `course` VALUES ('046', '大学物理B', '康渺', '3', '108');
INSERT INTO `course` VALUES ('047', '马克思主义基本原理概论', '朱荣英', '2', '36');
INSERT INTO `course` VALUES ('048', '大数据分析数学基础', '周素芳', '2', '36');
INSERT INTO `course` VALUES ('049', '中外名歌赏析', '张馨', '2', '36');
INSERT INTO `course` VALUES ('050', '减肥与体重控制', '丁勇', '2', '36');
INSERT INTO `course` VALUES ('051', 'C#程序设计', '王强', '2', '36');
INSERT INTO `course` VALUES ('052', '数字逻辑', '胡萍', '2', '36');
INSERT INTO `course` VALUES ('053', '基础德语(一)', '顾尚可', '4', '180');
INSERT INTO `course` VALUES ('054', '德语听力(一)', '张文艳', '3', '72');
INSERT INTO `course` VALUES ('055', '第二外语(一)', '朱太印', '3', '72');
INSERT INTO `course` VALUES ('056', '思想道德修养与法律基础', '任东景', '2', '36');
INSERT INTO `course` VALUES ('057', '中国文学经典导读', '程贵荣', '2', '36');
INSERT INTO `course` VALUES ('112', '12', '122', '312', '312');

-- ----------------------------
-- Table structure for course_stu
-- ----------------------------
DROP TABLE IF EXISTS `course_stu`;
CREATE TABLE `course_stu`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `stu_id` int(0) NOT NULL COMMENT '学生id',
  `course_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程id',
  `score` int(0) NOT NULL COMMENT '学生成绩',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_stu
-- ----------------------------
INSERT INTO `course_stu` VALUES (1, 1912020080, '012', 100);
INSERT INTO `course_stu` VALUES (2, 1912020080, '005', 100);
INSERT INTO `course_stu` VALUES (3, 1912020080, '006', 100);
INSERT INTO `course_stu` VALUES (4, 1912020080, '007', 100);
INSERT INTO `course_stu` VALUES (5, 1912020080, '008', 100);
INSERT INTO `course_stu` VALUES (6, 1912020080, '009', 100);
INSERT INTO `course_stu` VALUES (7, 1912020080, '015', 100);
INSERT INTO `course_stu` VALUES (8, 1912020064, '012', 100);
INSERT INTO `course_stu` VALUES (9, 1912020064, '005', 100);
INSERT INTO `course_stu` VALUES (10, 1901001, '012', 80);
INSERT INTO `course_stu` VALUES (11, 1901001, '007', 100);

-- ----------------------------
-- Table structure for studentinfo
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo`  (
  `stu_id` bigint(0) NOT NULL COMMENT '学号',
  `stu_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生用户名',
  `stu_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生性别',
  `stu_courseNumber` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生选修课程数',
  `stu_class` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生隶属班级',
  `stu_realName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生真实姓名',
  `stu_tele` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生联系方式',
  `stu_nation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生民族',
  `stu_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生住址',
  `stu_political_outlook` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生政治面貌',
  `stu_department` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生系别',
  PRIMARY KEY (`stu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of studentinfo
-- ----------------------------
INSERT INTO `studentinfo` VALUES (3, '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `studentinfo` VALUES (4, '4', '4', '4', '4', '4', '4', '4', '4', '4', '4');
INSERT INTO `studentinfo` VALUES (5, '5', '5', '5', '5', '5', '5', '5', '5', '5', '5');
INSERT INTO `studentinfo` VALUES (6, '6', '6', '6', '6', '6', '6', '6', '6', '6', '6');
INSERT INTO `studentinfo` VALUES (1901001, 'Weiho2', '男', '2', '软工3班', '赖小浩', '13222666789', '汉', '佛山高明', '团员', '软件工程');
INSERT INTO `studentinfo` VALUES (191202064, 'weiyuexin', '男', '14', '19-1', '韦月鑫', '3214569870', '维吾尔', '河北张家界', '党员', '计算机科学与技术');
INSERT INTO `studentinfo` VALUES (1912020064, 'WeiYueXin', '男', '15', '19-1', '韦月鑫', '3215489783', '苗', '河北张家界', '党员', '计算机科学与技术');
INSERT INTO `studentinfo` VALUES (1912020080, '骆伟培', '男', '15', '19-1', '骆伟培', '13226968149', '汉', '河南开封', '团员', '计算机科学与技术');
INSERT INTO `studentinfo` VALUES (1912020090, '张三', '男', '30', '19-3', '张三', '1336768911', '汉', '佛山顺德', '团员', '计算机科学与技术');

-- ----------------------------
-- Table structure for teacherinfo
-- ----------------------------
DROP TABLE IF EXISTS `teacherinfo`;
CREATE TABLE `teacherinfo`  (
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '教师编号',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '教师姓名',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '教师性别',
  `tele` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '教师联系方式'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacherinfo
-- ----------------------------
INSERT INTO `teacherinfo` VALUES ('LiuChun', '001', '刘春', '男', '16678793692');
INSERT INTO `teacherinfo` VALUES ('4', '4', '5', '44', '4');
INSERT INTO `teacherinfo` VALUES ('5', '5', '5', '5', '6');
INSERT INTO `teacherinfo` VALUES ('6', '6', '6', '6', '6');
INSERT INTO `teacherinfo` VALUES ('1', '1', '1', '1', '1');
INSERT INTO `teacherinfo` VALUES ('2', '2', '2', '2', '2');
INSERT INTO `teacherinfo` VALUES ('3', '3', '3', '3', '3');
INSERT INTO `teacherinfo` VALUES ('ShenXiaJiong', '002', '沈夏炯', '男', '17728322801');
INSERT INTO `teacherinfo` VALUES ('ZhangFan', '003', '张帆', '男', '18976653120');
INSERT INTO `teacherinfo` VALUES ('CaoYing', '004', '曹莹', '女', '1880903031');
INSERT INTO `teacherinfo` VALUES ('YangHuiJin', '005', '杨会巾', '女', '1331631630');
INSERT INTO `teacherinfo` VALUES ('YanChaoKun', '006', '闫朝坤', '男', '17650081027');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `username` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `shenfen` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', 'Golang123456', 1, 'admin', '系统管理员');
INSERT INTO `user` VALUES ('LuoWeiPei', 'php123456', 2, 'LWP13226968149@163.com', '学生');
INSERT INTO `user` VALUES ('lwp', '13728520943', 3, 'LWP13226968149@163.com', '学生');
INSERT INTO `user` VALUES ('weiyuexin', 'luoweipeidage', 4, '2625879810@qq.com', '学生');
INSERT INTO `user` VALUES ('Weiho2', '123456', 6, '2625879810@qq.com', '学生');
INSERT INTO `user` VALUES ('WYX', '123456', 7, 'LWP13226968149@163.com', '学生');
INSERT INTO `user` VALUES ('LWP123456', 'php123456', 9, '13226968149@gmail.com', '教师');
INSERT INTO `user` VALUES ('骆伟培', 'Golang123456', 10, 'LWP13226968149@163.com', '学生');
INSERT INTO `user` VALUES ('LWP123', '123456789', 11, '2625879810@qq.com', '教师');
INSERT INTO `user` VALUES ('LiuChun', '123456', 13, 'LiuChun@163.com', '教师');
INSERT INTO `user` VALUES ('ShenXiaJiong', '123456', 14, 'ShenXiaJiong@163.com', '教师');
INSERT INTO `user` VALUES ('ZhangFan', '123456', 15, 'ZhangFan@163.com', '教师');
INSERT INTO `user` VALUES ('CaoYing', '123456', 16, 'CaoYing@163.com', '教师');
INSERT INTO `user` VALUES ('YangHuiJin', '123456', 17, 'YangHuiJin@163.com', '教师');
INSERT INTO `user` VALUES ('YanChaoKun', '123456', 18, 'YanChaoKun@163.com', '教师');

SET FOREIGN_KEY_CHECKS = 1;
