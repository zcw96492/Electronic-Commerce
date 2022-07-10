/*
 Navicat Premium Data Transfer

 Source Server         : tencent_mysql
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : 118.25.236.128:3306
 Source Schema         : market-service

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001
 Table Name            : 地区字典表

 Date: 20/01/2020 14:32:23
*/

BEGIN;

-- 北京市
INSERT INTO `REGION_DICT` VALUES (1,   0, '北京市',   0,    '100000', 116.3956450378786700, 39.9299857780802400, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (2,   1, '东城区',   2,    '100010', 116.4218847012644600, 39.9385740129861200, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (3,   1, '西城区',   2,    '100032', 116.3731901040180200, 39.9342801437085100, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (4,   1, '崇文区',   2,    '100061', 116.4246362896199000, 39.8892918067842600, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (5,   1, '宣武区',   2,    '100054', 116.3693520077974300, 39.8915308751234700, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (6,   1, '朝阳区',   2,    '100020', 116.5216948910808400, 39.9589531664066800, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (7,   1, '丰台区',   2,    '100071', 116.2583703354677000, 39.8419378522047400, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (8,   1, '石景山区',  2,    '100043', 116.1845558103674600, 39.9388665446455300, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (9,   1, '海淀区',   2,    '100089', 116.2396778010215100, 40.0331620450779100, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (10,  1, '门头沟区',  2,    '102300', 115.7957953812509700, 40.0008930314764940, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (11,  1, '房山区',   2,    '102488', 115.8628363129044200, 39.7267526207963400, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (12,  1, '通州区',   2,    '101149', 116.7400791806762600, 39.8098148838513100, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (13,  1, '顺义区',   2,    '101300', 116.7282290452813800, 40.1549514704413540, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (14,  1, '昌平区',   2,    '102200', 116.2164563568941400, 40.2217235498323000, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (15,  1, '大兴区',   2,    '102600', 116.4251945973791300, 39.6527901183644640, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (16,  1, '怀柔区',   2,    '101400', 116.5934083564343100, 40.6381393403109200, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (17,  1, '平谷区',   2,    '101200', 117.1504334481917300, 40.2159254538956900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (18,  1, '密云县',   2,    '101500', 117.0012005350146500, 40.5328433610050000, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (19,  1, '延庆县',   2,    '102100', 116.1697352862955800, 40.5451564697420750, current_timestamp, current_timestamp);

-- 天津市
INSERT INTO `REGION_DICT` VALUES (20,   0, '天津市',   0, '300000', 117.2108130915525700, 39.1439299033100740, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (21,   20, '和平区',  2, '300041', 117.2028136540262700, 39.1248088447028300, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (22,   20, '河东区',  2, '300171', 117.2616931652718000, 39.1266256846662600, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (23,   20, '河西区',  2, '300202', 117.2361654506184600, 39.0844937396152200, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (24,   20, '南开区',  2, '300110', 117.1627279494520900, 39.1169872855221900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (25,   20, '河北区',  2, '300143', 117.2202967650772000, 39.1731489339241900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (26,   20, '红桥区',  2, '300131', 117.1622168079198600, 39.1706213312250400, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (27,   20, '塘沽区',  2, '300450', 117.6490814471782300, 39.0079361426823750, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (28,   20, '汉沽区',  2, '300480', 117.8735301253379000, 39.2477731804825700, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (29,   20, '大港区',  2, '300270', 117.3807943932141900, 38.7295728748186500, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (30,   20, '东丽区',  2, '300300', 117.4147823432451500, 39.1396046427746900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (31,   20, '西青区',  2, '300380', 117.1262013466470100, 39.0350646114846800, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (32,   20, '津南区',  2, '300350', 117.3929099597181200, 38.9697905327252700, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (33,   20, '北辰区',  2, '300400', 117.1806060982812900, 39.2591306259789300, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (34,   20, '武清区',  2, '301700', 117.0345779137272000, 39.4570425754940150, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (35,   20, '宝坻区',  2, '301800', 117.4114205907803800, 39.6155440041329900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (36,   20, '滨海新区',2, '300450', 117.6462862705744900, 39.0591766380348400, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (37,   20, '宁河县',  2, '301500', 117.6894240250713900, 39.3815609960173500, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (38,   20, '静海县',  2, '301600', 116.9727722616221100, 38.8612621443451050, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (39,   20, '蓟县',    2, '301900', 117.4411592214582400, 40.0096136606244600, current_timestamp, current_timestamp);

-- 上海市
INSERT INTO `REGION_DICT` VALUES (40,   0, '上海市',   0, '200000', 121.4878994856947300, 31.2272034407688680, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (41,   40, '黄浦区',   2, '200001', 121.4960720640344500, 31.2133483795550820, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (42,   40, '卢湾区',   2, '200020', 121.4812379784769500, 31.1691520895921950, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (43,   40, '徐汇区',   2, '200030', 121.4462350047293700, 31.2133014968136170, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (44,   40, '长宁区',   2, '200050', 121.3876161086648000, 31.2353808034878900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (45,   40, '静安区',   2, '200040', 121.4547555570020400, 31.2637429290755340, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (46,   40, '普陀区',   2, '200333', 121.3984429437495600, 31.2880444659261380, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (47,   40, '闸北区',   2, '200070', 121.4577688102147000, 31.2824972289865700, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (48,   40, '虹口区',   2, '200080', 121.4919185407947900, 31.3045104795419040, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (49,   40, '杨浦区',   2, '200082', 121.5357165996346000, 31.0935375403821230, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (50,   40, '闵行区',   2, '201100', 121.4250242809346500, 31.3986226944667770, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (51,   40, '宝山区',   2, '201900', 121.4090412184494200, 31.3643380554336300, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (52,   40, '嘉定区',   2, '201800', 121.2510135375559200, 31.2308953491339500, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (53,   40, '浦东新区',  2, '200120', 121.6384813140922000, 30.8350807770823200, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (54,   40, '金山区',   2, '201500', 121.2484081797515400, 31.0212446280985860, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (55,   40, '松江区',   2, '201600', 121.2267905014211500, 31.1308623979969670, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (56,   40, '青浦区',   2, '201799', 121.0914252428220100, 31.0518979768205060, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (57,   40, '南汇区',   2, '201300', 121.7699041751199000, 30.9151224526058680, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (58,   40, '奉贤区',   2, '201499', 121.5606416796334500, 31.2675421915164370, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (59,   40, '川沙区',   2, '201200', 121.6851919892568500, 31.6335649308020450, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (60,   40, '崇明区',   2, '202150', 121.5353975435439000, 31.2491617100151400, current_timestamp, current_timestamp);

-- 重庆市
INSERT INTO `REGION_DICT` VALUES (61,   0, '重庆市',   0, '400000', 108.4134386366985200, 29.5446061088861500, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (62,   61, '万州区',   2, '404100', 107.3407997380269400, 29.6646705405596900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (63,   61, '涪陵区',   2, '408000', 106.5469667848291800, 29.5552361943950400, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (64,   61, '渝中区',   2, '400010', 106.4653218146466400, 29.4241397869462670, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (65,   61, '大渡口区',  2, '400000', 106.7136147309424400, 29.6193177440640100, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (66,   61, '江北区',   2, '400000', 106.3748048926506000, 29.6305481366287900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (67,   61, '沙坪坝区',  2, '400000', 106.3705948843948300, 29.4345661549581900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (68,   61, '九龙坡区',  2, '400000', 106.6671784990354600, 29.5415146189025070, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (69,   61, '南岸区',   2, '400000', 106.5203424543244800, 29.8665960668651530, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (70,   61, '北碚区',   2, '400700', 106.9237205188773900, 28.9164886006379940, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (71,   61, '万盛区',   2, '400800', 105.7934248897598200, 29.5028336499692330, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (72,   61, '双桥区',   2, '400900', 106.7537985311953600, 29.8162640824264930, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (73,   61, '渝北区',   2, '401120', 106.7582741592033700, 29.3780279688894980, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (74,   61, '巴南区',   2, '401320', 108.7148079640174700, 29.4409810335843900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (75,   61, '黔江区',   2, '409000', 107.1466153713222000, 29.9604913550302680, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (76,   61, '长寿区',   2, '401220', 106.6792374459643500, 28.8761398352796980, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (77,   61, '綦江区',   2, '401420', 105.8196788451625400, 30.1499329659584840, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (78,   61, '潼南县',   2, '402660', 106.0392429397872100, 29.8183228251234280, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (79,   61, '铜梁区',   2, '402560', 105.7476264046132100, 29.6607085183678300, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (80,   61, '大足区',   2, '402360', 105.5126564552425500, 29.4711958856533620, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (81,   61, '荣昌县',   2, '402460', 106.1987265851975800, 29.5675015090615570, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (82,   61, '璧山区',   2, '402760', 107.7254281719287800, 30.6643634352897700, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (83,   61, '梁平县',   2, '405200', 108.7418551651707300, 31.8881313922089440, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (84,   61, '城口县',   2, '405900', 107.8375173642987000, 29.8905957176820680, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (85,   61, '丰都县',   2, '408200', 107.4444445416609600, 30.2594984458874770, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (86,   61, '垫江县',   2, '408300', 107.7161057033877300, 29.3792709635992900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (87,   61, '武隆县',   2, '408500', 107.9217381408966100, 30.3420032583736500, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (88,   61, '忠县',   2, '404300',  108.3892604663884200, 31.2771006607653600, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (89,   61, '开县',   2, '405400',  108.8631857567507500, 31.0424092672367960, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (90,   61, '云阳县',   2, '404500', 109.3556667016750900, 30.9585527971557330, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (91,   61, '奉节县',   2, '404600', 109.9086112226810600, 31.1211517202683000, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (92,   61, '巫山县',   2, '404700', 109.3605314706629600, 31.5091613763208540, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (93,   61, '巫溪县',   2, '巫溪县', 108.304890427927500, 30.0996369441545900, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (94,   61, '石柱土家族自治县', 2, '409100', 109.0253212536775300, 28.4983153984052960, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (95,   61, '秀山土家族苗族自治县', 2, '409900', 108.8068082373250400, 28.9052776623913500, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (96,   61, '酉阳土家族苗族自治县', 2, '409800', 108.2728677341920500, 29.3596282648936760, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (97,   61, '彭水苗族土家族自治县', 2, '409600', 106.269281856386300, 29.0353511906682830, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (98,   61, '江津区', 2, '402260', 106.3180287544918800, 30.1187082601341200, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (99,   61, '合川区', 2, '401520', 105.8803576036757300, 29.2964876469907100, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (100,  61, '永川区', 2, '402160', 107.1778882795445500, 29.1416857695272460, current_timestamp, current_timestamp);
INSERT INTO `REGION_DICT` VALUES (101,  61, '南川区', 2, '408400', 106.530635013412960, 29.544606108886150, current_timestamp, current_timestamp);

COMMIT;