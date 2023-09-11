INSERT INTO public."Flight"("flightID", "flightNum", "company", "departCity", "arriveCity", "departDate", "arriveDate", "departTime", "arriveTime")
VALUES
    -- New York as departure city
    (1, 1001, 'American', 'New York', 'Chicago', '2023-09-07', '2023-09-07', '08:00:00', '12:00:00'),
    (2, 1002, 'United', 'New York', 'San Francisco', '2023-09-07', '2023-09-07', '09:30:00', '13:30:00'),
    (3, 1003, 'Delta', 'New York', 'Houston', '2023-09-07', '2023-09-07', '11:00:00', '15:00:00'),
    (4, 1004, 'Southwest', 'New York', 'Boston', '2023-09-07', '2023-09-07', '13:30:00', '16:00:00'),
    (5, 1005, 'JetBlue', 'New York', 'Seattle', '2023-09-07', '2023-09-07', '15:45:00', '19:30:00'),
    (6, 1006, 'Alaska', 'New York', 'Denver', '2023-09-07', '2023-09-07', '17:15:00', '20:45:00'),
    (7, 1007, 'Frontier', 'New York', 'Las Vegas', '2023-09-07', '2023-09-07', '18:45:00', '22:15:00'),
    (8, 1008, 'Spirit', 'New York', 'Honolulu', '2023-09-07', '2023-09-07', '20:00:00', '23:45:00'),
    (9, 1009, 'Hawaiian', 'New York', 'Dallas', '2023-09-08', '2023-09-08', '07:30:00', '11:30:00'),
    (10, 1010, 'Southwest', 'New York', 'Miami', '2023-09-08', '2023-09-08', '09:00:00', '13:00:00'),
    (11, 1011, 'American', 'New York', 'Los Angeles', '2023-09-08', '2023-09-08', '10:30:00', '14:30:00'),
    (12, 1012, 'Delta', 'New York', 'Orlando', '2023-09-08', '2023-09-08', '12:00:00', '16:00:00'),
    (13, 1013, 'United', 'New York', 'Phoenix', '2023-09-08', '2023-09-08', '13:30:00', '17:30:00'),

    -- Continue with combinations for New York as departure city

    -- Chicago as departure city
    (30, 1030, 'American', 'Chicago', 'New York', '2023-09-15', '2023-09-15', '08:00:00', '12:00:00'),
    (31, 1031, 'United', 'Chicago', 'San Francisco', '2023-09-15', '2023-09-15', '09:30:00', '13:30:00'),
    (32, 1032, 'Delta', 'Chicago', 'Houston', '2023-09-15', '2023-09-15', '11:00:00', '15:00:00'),
    (33, 1033, 'Southwest', 'Chicago', 'Boston', '2023-09-15', '2023-09-15', '13:30:00', '16:00:00'),
    (34, 1034, 'JetBlue', 'Chicago', 'Seattle', '2023-09-15', '2023-09-15', '15:45:00', '19:30:00'),
    (35, 1035, 'Alaska', 'Chicago', 'Denver', '2023-09-15', '2023-09-15', '17:15:00', '20:45:00'),
    (36, 1036, 'Frontier', 'Chicago', 'Las Vegas', '2023-09-15', '2023-09-15', '18:45:00', '22:15:00'),
    (37, 1037, 'Spirit', 'Chicago', 'Honolulu', '2023-09-15', '2023-09-15', '20:00:00', '23:45:00'),
    (38, 1038, 'Hawaiian', 'Chicago', 'Dallas', '2023-09-16', '2023-09-16', '07:30:00', '11:30:00'),
    (39, 1039, 'Southwest', 'Chicago', 'Miami', '2023-09-16', '2023-09-16', '09:00:00', '13:00:00'),
    (40, 1040, 'American', 'Chicago', 'Los Angeles', '2023-09-16', '2023-09-16', '10:30:00', '14:30:00'),
    (41, 1041, 'Delta', 'Chicago', 'Orlando', '2023-09-16', '2023-09-16', '12:00:00', '16:00:00'),
    (42, 1042, 'United', 'Chicago', 'Phoenix', '2023-09-16', '2023-09-16', '13:30:00', '17:30:00'),

    -- Continue with combinations for Chicago as departure city

    -- San Francisco as departure city
    (59, 1059, 'American', 'San Francisco', 'New York', '2023-09-17', '2023-09-17', '08:00:00', '12:00:00'),
    (60, 1060, 'United', 'San Francisco', 'Chicago', '2023-09-17', '2023-09-17', '09:30:00', '13:30:00'),
    (61, 1061, 'Delta', 'San Francisco', 'Houston', '2023-09-17', '2023-09-17', '11:00:00', '15:00:00'),
    (62, 1062, 'Southwest', 'San Francisco', 'Boston', '2023-09-17', '2023-09-17', '13:30:00', '16:00:00'),
    (63, 1063, 'JetBlue', 'San Francisco', 'Seattle', '2023-09-17', '2023-09-17', '15:45:00', '19:30:00'),
    (64, 1064, 'Alaska', 'San Francisco', 'Denver', '2023-09-17', '2023-09-17', '17:15:00', '20:45:00'),
    (65, 1065, 'Frontier', 'San Francisco', 'Las Vegas', '2023-09-17', '2023-09-17', '18:45:00', '22:15:00'),
    (66, 1066, 'Spirit', 'San Francisco', 'Honolulu', '2023-09-17', '2023-09-17', '20:00:00', '23:45:00'),
    (67, 1067, 'Hawaiian', 'San Francisco', 'Dallas', '2023-09-18', '2023-09-18', '07:30:00', '11:30:00'),
    (68, 1068, 'Southwest', 'San Francisco', 'Miami', '2023-09-18', '2023-09-18', '09:00:00', '13:00:00'),
    (69, 1069, 'American', 'San Francisco', 'Los Angeles', '2023-09-18', '2023-09-18', '10:30:00', '14:30:00'),
    (70, 1070, 'Delta', 'San Francisco', 'Orlando', '2023-09-18', '2023-09-18', '12:00:00', '16:00:00'),
    (71, 1071, 'United', 'San Francisco', 'Phoenix', '2023-09-18', '2023-09-18', '13:30:00', '17:30:00'),

    -- Continue with combinations for San Francisco as departure city

    -- Houston as departure city
    (43, 1043, 'American', 'Houston', 'Boston', '2023-09-16', '2023-09-16', '08:00:00', '12:00:00'),
    (44, 1044, 'United', 'Houston', 'Seattle', '2023-09-16', '2023-09-16', '09:30:00', '13:30:00'),
    (45, 1045, 'Delta', 'Houston', 'Denver', '2023-09-16', '2023-09-16', '11:00:00', '15:00:00'),
    (46, 1046, 'Southwest', 'Houston', 'Las Vegas', '2023-09-16', '2023-09-16', '13:30:00', '16:00:00'),
    (47, 1047, 'JetBlue', 'Houston', 'Honolulu', '2023-09-16', '2023-09-16', '15:45:00', '19:30:00'),
    (48, 1048, 'Alaska', 'Houston', 'Dallas', '2023-09-16', '2023-09-16', '17:15:00', '20:45:00'),
    (49, 1049, 'Frontier', 'Houston', 'Miami', '2023-09-16', '2023-09-16', '18:45:00', '22:15:00'),
    (50, 1050, 'Spirit', 'Houston', 'Los Angeles', '2023-09-16', '2023-09-16', '20:00:00', '23:45:00'),
    (51, 1051, 'Hawaiian', 'Houston', 'Orlando', '2023-09-17', '2023-09-17', '07:30:00', '11:30:00'),
    (52, 1052, 'Southwest', 'Houston', 'Phoenix', '2023-09-17', '2023-09-17', '09:00:00', '13:00:00'),

    -- Continue with combinations for Houston as departure city

    -- Boston as departure city
    (72, 1072, 'American', 'Boston', 'Seattle', '2023-09-18', '2023-09-18', '08:00:00', '12:00:00'),
    (73, 1073, 'United', 'Boston', 'Denver', '2023-09-18', '2023-09-18', '09:30:00', '13:30:00'),
    (74, 1074, 'Delta', 'Boston', 'Las Vegas', '2023-09-18', '2023-09-18', '11:00:00', '15:00:00'),
    (75, 1075, 'Southwest', 'Boston', 'Honolulu', '2023-09-18', '2023-09-18', '13:30:00', '16:00:00'),
    (76, 1076, 'JetBlue', 'Boston', 'Dallas', '2023-09-18', '2023-09-18', '15:45:00', '19:30:00'),
    (77, 1077, 'Alaska', 'Boston', 'Miami', '2023-09-18', '2023-09-18', '17:15:00', '20:45:00'),
    (78, 1078, 'Frontier', 'Boston', 'Los Angeles', '2023-09-18', '2023-09-18', '18:45:00', '22:15:00'),
    (79, 1079, 'Spirit', 'Boston', 'Orlando', '2023-09-19', '2023-09-19', '20:00:00', '23:45:00'),
    (80, 1080, 'Hawaiian', 'Boston', 'Phoenix', '2023-09-19', '2023-09-19', '07:30:00', '11:30:00'),

    -- Continue with combinations for Boston as departure city

    -- Seattle as departure city
    (83, 1083, 'American', 'Seattle', 'Denver', '2023-09-20', '2023-09-20', '08:00:00', '12:00:00'),
    (84, 1084, 'United', 'Seattle', 'Las Vegas', '2023-09-20', '2023-09-20', '09:30:00', '13:30:00'),
    (85, 1085, 'Delta', 'Seattle', 'Honolulu', '2023-09-20', '2023-09-20', '11:00:00', '15:00:00'),
    (86, 1086, 'Southwest', 'Seattle', 'Dallas', '2023-09-20', '2023-09-20', '13:30:00', '16:00:00'),
    (87, 1087, 'JetBlue', 'Seattle', 'Miami', '2023-09-20', '2023-09-20', '15:45:00', '19:30:00'),
    (88, 1088, 'Alaska', 'Seattle', 'Los Angeles', '2023-09-20', '2023-09-20', '17:15:00', '20:45:00'),
    (89, 1089, 'Frontier', 'Seattle', 'Orlando', '2023-09-20', '2023-09-20', '18:45:00', '22:15:00'),
    (90, 1090, 'Spirit', 'Seattle', 'Phoenix', '2023-09-20', '2023-09-20', '20:00:00', '23:45:00'),

    -- Continue with combinations for Seattle as departure city

    -- Denver as departure city
    (93, 1093, 'American', 'Denver', 'Las Vegas', '2023-09-21', '2023-09-21', '08:00:00', '12:00:00'),
    (94, 1094, 'United', 'Denver', 'Honolulu', '2023-09-21', '2023-09-21', '09:30:00', '13:30:00'),
    (95, 1095, 'Delta', 'Denver', 'Dallas', '2023-09-21', '2023-09-21', '11:00:00', '15:00:00'),
    (96, 1096, 'Southwest', 'Denver', 'Miami', '2023-09-21', '2023-09-21', '13:30:00', '16:00:00'),
    (97, 1097, 'JetBlue', 'Denver', 'Los Angeles', '2023-09-21', '2023-09-21', '15:45:00', '19:30:00'),
    (98, 1098, 'Alaska', 'Denver', 'Orlando', '2023-09-21', '2023-09-21', '17:15:00', '20:45:00'),
    (99, 1099, 'Frontier', 'Denver', 'Phoenix', '2023-09-21', '2023-09-21', '18:45:00', '22:15:00'),

    -- Continue with combinations for Denver as departure city

    -- Las Vegas as departure city
    (103, 1103, 'American', 'Las Vegas', 'Honolulu', '2023-09-22', '2023-09-22', '08:00:00', '12:00:00'),
    (104, 1104, 'United', 'Las Vegas', 'Dallas', '2023-09-22', '2023-09-22', '09:30:00', '13:30:00'),
    (105, 1105, 'Delta', 'Las Vegas', 'Miami', '2023-09-22', '2023-09-22', '11:00:00', '15:00:00'),
    (106, 1106, 'Southwest', 'Las Vegas', 'Los Angeles', '2023-09-22', '2023-09-22', '13:30:00', '16:00:00'),
    (107, 1107, 'JetBlue', 'Las Vegas', 'Orlando', '2023-09-22', '2023-09-22', '15:45:00', '19:30:00'),
    (108, 1108, 'Alaska', 'Las Vegas', 'Phoenix', '2023-09-22', '2023-09-22', '17:15:00', '20:45:00'),

    -- Continue with combinations for Las Vegas as departure city

        -- Honolulu as departure city
    (111, 1111, 'American', 'Honolulu', 'Dallas', '2023-09-23', '2023-09-23', '08:00:00', '12:00:00'),
    (112, 1112, 'United', 'Honolulu', 'Miami', '2023-09-23', '2023-09-23', '09:30:00', '13:30:00'),
    (113, 1113, 'Delta', 'Honolulu', 'Los Angeles', '2023-09-23', '2023-09-23', '11:00:00', '15:00:00'),
    (114, 1114, 'Southwest', 'Honolulu', 'Orlando', '2023-09-23', '2023-09-23', '13:30:00', '16:00:00'),
    (115, 1115, 'JetBlue', 'Honolulu', 'Phoenix', '2023-09-23', '2023-09-23', '15:45:00', '19:30:00'),

    -- Continue with combinations for Honolulu as departure city

    -- Dallas as departure city
    (116, 1116, 'American', 'Dallas', 'Miami', '2023-09-24', '2023-09-24', '08:00:00', '12:00:00'),
    (117, 1117, 'United', 'Dallas', 'Los Angeles', '2023-09-24', '2023-09-24', '09:30:00', '13:30:00'),
    (118, 1118, 'Delta', 'Dallas', 'Orlando', '2023-09-24', '2023-09-24', '11:00:00', '15:00:00'),
    (119, 1119, 'Southwest', 'Dallas', 'Phoenix', '2023-09-24', '2023-09-24', '13:30:00', '16:00:00'),

    -- Continue with combinations for Dallas as departure city

    -- Miami as departure city
    (123, 1123, 'American', 'Miami', 'Los Angeles', '2023-09-25', '2023-09-25', '08:00:00', '12:00:00'),
    (124, 1124, 'United', 'Miami', 'Orlando', '2023-09-25', '2023-09-25', '09:30:00', '13:30:00'),
    (125, 1125, 'Delta', 'Miami', 'Phoenix', '2023-09-25', '2023-09-25', '11:00:00', '15:00:00'),

    -- Continue with combinations for Miami as departure city

    -- Los Angeles as departure city
    (128, 1128, 'American', 'Los Angeles', 'Orlando', '2023-09-26', '2023-09-26', '08:00:00', '12:00:00'),
    (129, 1129, 'United', 'Los Angeles', 'Phoenix', '2023-09-26', '2023-09-26', '09:30:00', '13:30:00'),

    -- Continue with combinations for Los Angeles as departure city

    -- Orlando as departure city
    (131, 1131, 'American', 'Orlando', 'Phoenix', '2023-09-27', '2023-09-27', '08:00:00', '12:00:00');

    -- Continue with combinations for Orlando as departure city












