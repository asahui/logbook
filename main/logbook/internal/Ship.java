package logbook.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import logbook.dto.ShipInfoDto;

/**
 * 艦娘
 *
 */
public class Ship {

    /**
     * 艦娘プリセット値
     */
    private static final Map<String, ShipInfoDto> SHIP = new ConcurrentHashMap<String, ShipInfoDto>() {
        {
            this.put("1", new ShipInfoDto("睦月", "駆逐艦"));
            this.put("2", new ShipInfoDto("如月", "駆逐艦"));
            this.put("3", ShipInfoDto.EMPTY);
            this.put("4", ShipInfoDto.EMPTY);
            this.put("5", ShipInfoDto.EMPTY);
            this.put("6", new ShipInfoDto("長月", "駆逐艦"));
            this.put("7", new ShipInfoDto("三日月", "駆逐艦"));
            this.put("8", ShipInfoDto.EMPTY);
            this.put("9", new ShipInfoDto("吹雪", "駆逐艦"));
            this.put("10", new ShipInfoDto("白雪", "駆逐艦"));
            this.put("11", new ShipInfoDto("深雪", "駆逐艦"));
            this.put("12", new ShipInfoDto("磯波", "駆逐艦"));
            this.put("13", new ShipInfoDto("綾波", "駆逐艦"));
            this.put("14", new ShipInfoDto("敷波", "駆逐艦"));
            this.put("15", new ShipInfoDto("曙", "駆逐艦"));
            this.put("16", new ShipInfoDto("潮", "駆逐艦"));
            this.put("17", new ShipInfoDto("陽炎", "駆逐艦"));
            this.put("18", new ShipInfoDto("不知火", "駆逐艦"));
            this.put("19", new ShipInfoDto("黒潮", "駆逐艦"));
            this.put("20", new ShipInfoDto("雪風", "駆逐艦"));
            this.put("21", new ShipInfoDto("長良", "軽巡洋艦"));
            this.put("22", new ShipInfoDto("五十鈴", "軽巡洋艦"));
            this.put("23", new ShipInfoDto("由良", "軽巡洋艦"));
            this.put("24", new ShipInfoDto("大井", "軽巡洋艦"));
            this.put("25", new ShipInfoDto("北上", "軽巡洋艦"));
            this.put("26", new ShipInfoDto("扶桑", "戦艦"));
            this.put("27", new ShipInfoDto("山城", "戦艦"));
            this.put("28", new ShipInfoDto("皐月", "駆逐艦"));
            this.put("29", new ShipInfoDto("文月", "駆逐艦"));
            this.put("30", new ShipInfoDto("菊月", "駆逐艦"));
            this.put("31", new ShipInfoDto("望月", "駆逐艦"));
            this.put("32", new ShipInfoDto("初雪", "駆逐艦"));
            this.put("33", new ShipInfoDto("叢雲", "駆逐艦"));
            this.put("34", new ShipInfoDto("暁", "駆逐艦"));
            this.put("35", new ShipInfoDto("響", "駆逐艦"));
            this.put("36", new ShipInfoDto("雷", "駆逐艦"));
            this.put("37", new ShipInfoDto("電", "駆逐艦"));
            this.put("38", new ShipInfoDto("初春", "駆逐艦"));
            this.put("39", new ShipInfoDto("子日", "駆逐艦"));
            this.put("40", new ShipInfoDto("若葉", "駆逐艦"));
            this.put("41", new ShipInfoDto("初霜", "駆逐艦"));
            this.put("42", new ShipInfoDto("白露", "駆逐艦"));
            this.put("43", new ShipInfoDto("時雨", "駆逐艦"));
            this.put("44", new ShipInfoDto("村雨", "駆逐艦"));
            this.put("45", new ShipInfoDto("夕立", "駆逐艦"));
            this.put("46", new ShipInfoDto("五月雨", "駆逐艦"));
            this.put("47", new ShipInfoDto("涼風", "駆逐艦"));
            this.put("48", new ShipInfoDto("霰", "駆逐艦"));
            this.put("49", new ShipInfoDto("霞", "駆逐艦"));
            this.put("50", new ShipInfoDto("島風", "駆逐艦"));
            this.put("51", new ShipInfoDto("天龍", "軽巡洋艦"));
            this.put("52", new ShipInfoDto("龍田", "軽巡洋艦"));
            this.put("53", new ShipInfoDto("名取", "軽巡洋艦"));
            this.put("54", new ShipInfoDto("川内", "軽巡洋艦"));
            this.put("55", new ShipInfoDto("神通", "軽巡洋艦"));
            this.put("56", new ShipInfoDto("那珂", "軽巡洋艦"));
            this.put("57", new ShipInfoDto("大井改", "重雷装巡洋艦"));
            this.put("58", new ShipInfoDto("北上改", "重雷装巡洋艦"));
            this.put("59", new ShipInfoDto("古鷹", "重巡洋艦"));
            this.put("60", new ShipInfoDto("加古", "重巡洋艦"));
            this.put("61", new ShipInfoDto("青葉", "重巡洋艦"));
            this.put("62", new ShipInfoDto("妙高", "重巡洋艦"));
            this.put("63", new ShipInfoDto("那智", "重巡洋艦"));
            this.put("64", new ShipInfoDto("足柄", "重巡洋艦"));
            this.put("65", new ShipInfoDto("羽黒", "重巡洋艦"));
            this.put("66", new ShipInfoDto("高雄", "重巡洋艦"));
            this.put("67", new ShipInfoDto("愛宕", "重巡洋艦"));
            this.put("68", new ShipInfoDto("摩耶", "重巡洋艦"));
            this.put("69", new ShipInfoDto("鳥海", "重巡洋艦"));
            this.put("70", new ShipInfoDto("最上", "重巡洋艦"));
            this.put("71", new ShipInfoDto("利根", "重巡洋艦"));
            this.put("72", new ShipInfoDto("筑摩", "重巡洋艦"));
            this.put("73", new ShipInfoDto("最上改", "航空巡洋艦"));
            this.put("74", new ShipInfoDto("祥鳳", "軽空母"));
            this.put("75", new ShipInfoDto("飛鷹", "軽空母"));
            this.put("76", new ShipInfoDto("龍驤", "軽空母"));
            this.put("77", new ShipInfoDto("伊勢", "戦艦"));
            this.put("78", new ShipInfoDto("金剛", "戦艦"));
            this.put("79", new ShipInfoDto("榛名", "戦艦"));
            this.put("80", new ShipInfoDto("長門", "戦艦"));
            this.put("81", new ShipInfoDto("陸奥", "戦艦"));
            this.put("82", new ShipInfoDto("伊勢改", "航空戦艦"));
            this.put("83", new ShipInfoDto("赤城", "正規空母"));
            this.put("84", new ShipInfoDto("加賀", "正規空母"));
            this.put("85", new ShipInfoDto("霧島", "戦艦"));
            this.put("86", new ShipInfoDto("比叡", "戦艦"));
            this.put("87", new ShipInfoDto("日向", "戦艦"));
            this.put("88", new ShipInfoDto("日向改", "航空戦艦"));
            this.put("89", new ShipInfoDto("鳳翔", "軽空母"));
            this.put("90", new ShipInfoDto("蒼龍", "正規空母"));
            this.put("91", new ShipInfoDto("飛龍", "正規空母"));
            this.put("92", new ShipInfoDto("隼鷹", "軽空母"));
            this.put("93", new ShipInfoDto("朧", "駆逐艦"));
            this.put("94", new ShipInfoDto("漣", "駆逐艦"));
            this.put("95", new ShipInfoDto("朝潮", "駆逐艦"));
            this.put("96", new ShipInfoDto("大潮", "駆逐艦"));
            this.put("97", new ShipInfoDto("満潮", "駆逐艦"));
            this.put("98", new ShipInfoDto("荒潮", "駆逐艦"));
            this.put("99", new ShipInfoDto("球磨", "軽巡洋艦"));
            this.put("100", new ShipInfoDto("多摩", "軽巡洋艦"));
            this.put("101", new ShipInfoDto("木曾", "軽巡洋艦"));
            this.put("102", new ShipInfoDto("千歳", "水上機母艦"));
            this.put("103", new ShipInfoDto("千代田", "水上機母艦"));
            this.put("104", new ShipInfoDto("千歳改", "水上機母艦"));
            this.put("105", new ShipInfoDto("千代田改", "水上機母艦"));
            this.put("106", new ShipInfoDto("千歳甲", "水上機母艦"));
            this.put("107", new ShipInfoDto("千代田甲", "水上機母艦"));
            this.put("108", new ShipInfoDto("千歳航", "軽空母"));
            this.put("109", new ShipInfoDto("千代田航", "軽空母"));
            this.put("110", new ShipInfoDto("翔鶴", "正規空母"));
            this.put("111", new ShipInfoDto("瑞鶴", "正規空母"));
            this.put("112", new ShipInfoDto("瑞鶴改", "正規空母"));
            this.put("113", new ShipInfoDto("鬼怒", "軽巡洋艦"));
            this.put("114", new ShipInfoDto("阿武隈", "軽巡洋艦"));
            this.put("115", new ShipInfoDto("夕張", "軽巡洋艦"));
            this.put("116", new ShipInfoDto("瑞鳳", "軽空母"));
            this.put("117", new ShipInfoDto("瑞鳳改", "軽空母"));
            this.put("118", new ShipInfoDto("大井改二", "重雷装巡洋艦"));
            this.put("119", new ShipInfoDto("北上改二", "重雷装巡洋艦"));
            this.put("120", new ShipInfoDto("三隈", "重巡洋艦"));
            this.put("121", new ShipInfoDto("三隈改", "航空巡洋艦"));
            this.put("122", new ShipInfoDto("舞風", "駆逐艦"));
            this.put("123", new ShipInfoDto("衣笠", "重巡洋艦"));
            this.put("124", new ShipInfoDto("鈴谷", "重巡洋艦"));
            this.put("125", new ShipInfoDto("熊野", "重巡洋艦"));
            this.put("126", new ShipInfoDto("伊168", "潜水艦"));
            this.put("127", new ShipInfoDto("伊58", "潜水艦"));
            this.put("128", ShipInfoDto.EMPTY);
            this.put("129", new ShipInfoDto("鈴谷改", "航空巡洋艦"));
            this.put("130", new ShipInfoDto("熊野改", "航空巡洋艦"));
            this.put("131", new ShipInfoDto("大和", "戦艦"));
            this.put("132", new ShipInfoDto("秋雲", "駆逐艦"));
            this.put("133", new ShipInfoDto("夕雲", "駆逐艦"));
            this.put("134", ShipInfoDto.EMPTY);
            this.put("135", ShipInfoDto.EMPTY);
            this.put("136", new ShipInfoDto("大和改", "戦艦"));
            this.put("137", ShipInfoDto.EMPTY);
            this.put("138", ShipInfoDto.EMPTY);
            this.put("139", ShipInfoDto.EMPTY);
            this.put("140", ShipInfoDto.EMPTY);
            this.put("141", new ShipInfoDto("五十鈴改二", "軽巡洋艦"));
            this.put("142", ShipInfoDto.EMPTY);
            this.put("143", ShipInfoDto.EMPTY);
            this.put("144", new ShipInfoDto("夕立改二", "駆逐艦"));
            this.put("145", ShipInfoDto.EMPTY);
            this.put("146", ShipInfoDto.EMPTY);
            this.put("147", new ShipInfoDto("Верный", "駆逐艦"));
            this.put("148", ShipInfoDto.EMPTY);
            this.put("149", ShipInfoDto.EMPTY);
            this.put("150", ShipInfoDto.EMPTY);
            this.put("151", ShipInfoDto.EMPTY);
            this.put("152", ShipInfoDto.EMPTY);
            this.put("153", ShipInfoDto.EMPTY);
            this.put("154", ShipInfoDto.EMPTY);
            this.put("155", ShipInfoDto.EMPTY);
            this.put("156", ShipInfoDto.EMPTY);
            this.put("157", ShipInfoDto.EMPTY);
            this.put("158", ShipInfoDto.EMPTY);
            this.put("159", ShipInfoDto.EMPTY);
            this.put("160", ShipInfoDto.EMPTY);
            this.put("161", ShipInfoDto.EMPTY);
            this.put("162", ShipInfoDto.EMPTY);
            this.put("163", ShipInfoDto.EMPTY);
            this.put("164", ShipInfoDto.EMPTY);
            this.put("165", ShipInfoDto.EMPTY);
            this.put("166", ShipInfoDto.EMPTY);
            this.put("167", ShipInfoDto.EMPTY);
            this.put("168", ShipInfoDto.EMPTY);
            this.put("169", ShipInfoDto.EMPTY);
            this.put("170", ShipInfoDto.EMPTY);
            this.put("171", ShipInfoDto.EMPTY);
            this.put("172", ShipInfoDto.EMPTY);
            this.put("173", ShipInfoDto.EMPTY);
            this.put("174", ShipInfoDto.EMPTY);
            this.put("175", ShipInfoDto.EMPTY);
            this.put("176", ShipInfoDto.EMPTY);
            this.put("177", ShipInfoDto.EMPTY);
            this.put("178", ShipInfoDto.EMPTY);
            this.put("179", ShipInfoDto.EMPTY);
            this.put("180", ShipInfoDto.EMPTY);
            this.put("181", ShipInfoDto.EMPTY);
            this.put("182", ShipInfoDto.EMPTY);
            this.put("183", ShipInfoDto.EMPTY);
            this.put("184", ShipInfoDto.EMPTY);
            this.put("185", ShipInfoDto.EMPTY);
            this.put("186", ShipInfoDto.EMPTY);
            this.put("187", ShipInfoDto.EMPTY);
            this.put("188", ShipInfoDto.EMPTY);
            this.put("189", ShipInfoDto.EMPTY);
            this.put("190", new ShipInfoDto("初風", "駆逐艦"));
            this.put("191", ShipInfoDto.EMPTY);
            this.put("192", ShipInfoDto.EMPTY);
            this.put("193", ShipInfoDto.EMPTY);
            this.put("194", ShipInfoDto.EMPTY);
            this.put("195", ShipInfoDto.EMPTY);
            this.put("196", ShipInfoDto.EMPTY);
            this.put("197", ShipInfoDto.EMPTY);
            this.put("198", ShipInfoDto.EMPTY);
            this.put("199", ShipInfoDto.EMPTY);
            this.put("200", ShipInfoDto.EMPTY);
            this.put("201", new ShipInfoDto("吹雪改", "駆逐艦"));
            this.put("202", new ShipInfoDto("白雪改", "駆逐艦"));
            this.put("203", new ShipInfoDto("初雪改", "駆逐艦"));
            this.put("204", new ShipInfoDto("深雪改", "駆逐艦"));
            this.put("205", new ShipInfoDto("叢雲改", "駆逐艦"));
            this.put("206", new ShipInfoDto("磯波改", "駆逐艦"));
            this.put("207", new ShipInfoDto("綾波改", "駆逐艦"));
            this.put("208", new ShipInfoDto("敷波改", "駆逐艦"));
            this.put("209", new ShipInfoDto("金剛改", "戦艦"));
            this.put("210", new ShipInfoDto("比叡改", "戦艦"));
            this.put("211", new ShipInfoDto("榛名改", "戦艦"));
            this.put("212", new ShipInfoDto("霧島改", "戦艦"));
            this.put("213", new ShipInfoDto("天龍改", "軽巡洋艦"));
            this.put("214", new ShipInfoDto("龍田改", "軽巡洋艦"));
            this.put("215", new ShipInfoDto("球磨改", "軽巡洋艦"));
            this.put("216", new ShipInfoDto("多摩改", "軽巡洋艦"));
            this.put("217", new ShipInfoDto("木曾改", "軽巡洋艦"));
            this.put("218", new ShipInfoDto("長良改", "軽巡洋艦"));
            this.put("219", new ShipInfoDto("五十鈴改", "軽巡洋艦"));
            this.put("220", new ShipInfoDto("由良改", "軽巡洋艦"));
            this.put("221", new ShipInfoDto("名取改", "軽巡洋艦"));
            this.put("222", new ShipInfoDto("川内改", "軽巡洋艦"));
            this.put("223", new ShipInfoDto("神通改", "軽巡洋艦"));
            this.put("224", new ShipInfoDto("那珂改", "軽巡洋艦"));
            this.put("225", new ShipInfoDto("陽炎改", "駆逐艦"));
            this.put("226", new ShipInfoDto("不知火改", "駆逐艦"));
            this.put("227", new ShipInfoDto("黒潮改", "駆逐艦"));
            this.put("228", new ShipInfoDto("雪風改", "駆逐艦"));
            this.put("229", new ShipInfoDto("島風改", "駆逐艦"));
            this.put("230", new ShipInfoDto("朧改", "駆逐艦"));
            this.put("231", new ShipInfoDto("曙改", "駆逐艦"));
            this.put("232", new ShipInfoDto("漣改", "駆逐艦"));
            this.put("233", new ShipInfoDto("潮改", "駆逐艦"));
            this.put("234", new ShipInfoDto("暁改", "駆逐艦"));
            this.put("235", new ShipInfoDto("響改", "駆逐艦"));
            this.put("236", new ShipInfoDto("雷改", "駆逐艦"));
            this.put("237", new ShipInfoDto("電改", "駆逐艦"));
            this.put("238", new ShipInfoDto("初春改", "駆逐艦"));
            this.put("239", new ShipInfoDto("子日改", "駆逐艦"));
            this.put("240", new ShipInfoDto("若葉改", "駆逐艦"));
            this.put("241", new ShipInfoDto("初霜改", "駆逐艦"));
            this.put("242", new ShipInfoDto("白露改", "駆逐艦"));
            this.put("243", new ShipInfoDto("時雨改", "駆逐艦"));
            this.put("244", new ShipInfoDto("村雨改", "駆逐艦"));
            this.put("245", new ShipInfoDto("夕立改", "駆逐艦"));
            this.put("246", new ShipInfoDto("五月雨改", "駆逐艦"));
            this.put("247", new ShipInfoDto("涼風改", "駆逐艦"));
            this.put("248", new ShipInfoDto("朝潮改", "駆逐艦"));
            this.put("249", new ShipInfoDto("大潮改", "駆逐艦"));
            this.put("250", new ShipInfoDto("満潮改", "駆逐艦"));
            this.put("251", new ShipInfoDto("荒潮改", "駆逐艦"));
            this.put("252", new ShipInfoDto("霰改", "駆逐艦"));
            this.put("253", new ShipInfoDto("霞改", "駆逐艦"));
            this.put("254", new ShipInfoDto("睦月改", "駆逐艦"));
            this.put("255", new ShipInfoDto("如月改", "駆逐艦"));
            this.put("256", new ShipInfoDto("皐月改", "駆逐艦"));
            this.put("257", new ShipInfoDto("文月改", "駆逐艦"));
            this.put("258", new ShipInfoDto("長月改", "駆逐艦"));
            this.put("259", new ShipInfoDto("菊月改", "駆逐艦"));
            this.put("260", new ShipInfoDto("三日月改", "駆逐艦"));
            this.put("261", new ShipInfoDto("望月改", "駆逐艦"));
            this.put("262", new ShipInfoDto("古鷹改", "重巡洋艦"));
            this.put("263", new ShipInfoDto("加古改", "重巡洋艦"));
            this.put("264", new ShipInfoDto("青葉改", "重巡洋艦"));
            this.put("265", new ShipInfoDto("妙高改", "重巡洋艦"));
            this.put("266", new ShipInfoDto("那智改", "重巡洋艦"));
            this.put("267", new ShipInfoDto("足柄改", "重巡洋艦"));
            this.put("268", new ShipInfoDto("羽黒改", "重巡洋艦"));
            this.put("269", new ShipInfoDto("高雄改", "重巡洋艦"));
            this.put("270", new ShipInfoDto("愛宕改", "重巡洋艦"));
            this.put("271", new ShipInfoDto("摩耶改", "重巡洋艦"));
            this.put("272", new ShipInfoDto("鳥海改", "重巡洋艦"));
            this.put("273", new ShipInfoDto("利根改", "重巡洋艦"));
            this.put("274", new ShipInfoDto("筑摩改", "重巡洋艦"));
            this.put("275", new ShipInfoDto("長門改", "戦艦"));
            this.put("276", new ShipInfoDto("陸奥改", "戦艦"));
            this.put("277", new ShipInfoDto("赤城改", "正規空母"));
            this.put("278", new ShipInfoDto("加賀改", "正規空母"));
            this.put("279", new ShipInfoDto("蒼龍改", "正規空母"));
            this.put("280", new ShipInfoDto("飛龍改", "正規空母"));
            this.put("281", new ShipInfoDto("龍驤改", "軽空母"));
            this.put("282", new ShipInfoDto("祥鳳改", "軽空母"));
            this.put("283", new ShipInfoDto("飛鷹改", "軽空母"));
            this.put("284", new ShipInfoDto("隼鷹改", "軽空母"));
            this.put("285", new ShipInfoDto("鳳翔改", "軽空母"));
            this.put("286", new ShipInfoDto("扶桑改", "航空戦艦"));
            this.put("287", new ShipInfoDto("山城改", "航空戦艦"));
            this.put("288", new ShipInfoDto("翔鶴改", "正規空母"));
            this.put("289", new ShipInfoDto("鬼怒改", "軽巡洋艦"));
            this.put("290", new ShipInfoDto("阿武隈改", "軽巡洋艦"));
            this.put("291", new ShipInfoDto("千歳航改", "軽空母"));
            this.put("292", new ShipInfoDto("千代田航改", "軽空母"));
            this.put("293", new ShipInfoDto("夕張改", "軽巡洋艦"));
            this.put("294", new ShipInfoDto("舞風改", "駆逐艦"));
            this.put("295", new ShipInfoDto("衣笠改", "重巡洋艦"));
            this.put("296", new ShipInfoDto("千歳航改二", "軽空母"));
            this.put("297", new ShipInfoDto("千代田航改二", "軽空母"));
            this.put("298", ShipInfoDto.EMPTY);
            this.put("299", ShipInfoDto.EMPTY);
            this.put("300", new ShipInfoDto("初風改", "駆逐艦"));
            this.put("301", new ShipInfoDto("秋雲改", "駆逐艦"));
            this.put("302", new ShipInfoDto("夕雲改", "駆逐艦"));
            this.put("303", ShipInfoDto.EMPTY);
            this.put("304", ShipInfoDto.EMPTY);
            this.put("305", ShipInfoDto.EMPTY);
            this.put("306", ShipInfoDto.EMPTY);
            this.put("307", ShipInfoDto.EMPTY);
            this.put("308", ShipInfoDto.EMPTY);
            this.put("309", ShipInfoDto.EMPTY);
            this.put("310", ShipInfoDto.EMPTY);
            this.put("311", ShipInfoDto.EMPTY);
            this.put("312", ShipInfoDto.EMPTY);
            this.put("313", ShipInfoDto.EMPTY);
            this.put("314", ShipInfoDto.EMPTY);
            this.put("315", ShipInfoDto.EMPTY);
            this.put("316", ShipInfoDto.EMPTY);
            this.put("317", ShipInfoDto.EMPTY);
            this.put("318", ShipInfoDto.EMPTY);
            this.put("319", ShipInfoDto.EMPTY);
            this.put("320", ShipInfoDto.EMPTY);
            this.put("321", ShipInfoDto.EMPTY);
            this.put("322", ShipInfoDto.EMPTY);
            this.put("323", ShipInfoDto.EMPTY);
            this.put("324", ShipInfoDto.EMPTY);
            this.put("325", ShipInfoDto.EMPTY);
            this.put("326", ShipInfoDto.EMPTY);
            this.put("327", ShipInfoDto.EMPTY);
            this.put("328", ShipInfoDto.EMPTY);
            this.put("329", ShipInfoDto.EMPTY);
            this.put("330", ShipInfoDto.EMPTY);
            this.put("331", ShipInfoDto.EMPTY);
            this.put("332", ShipInfoDto.EMPTY);
            this.put("333", ShipInfoDto.EMPTY);
            this.put("334", ShipInfoDto.EMPTY);
            this.put("335", ShipInfoDto.EMPTY);
            this.put("336", ShipInfoDto.EMPTY);
            this.put("337", ShipInfoDto.EMPTY);
            this.put("338", ShipInfoDto.EMPTY);
            this.put("339", ShipInfoDto.EMPTY);
            this.put("340", ShipInfoDto.EMPTY);
            this.put("341", ShipInfoDto.EMPTY);
            this.put("342", ShipInfoDto.EMPTY);
            this.put("343", ShipInfoDto.EMPTY);
            this.put("344", ShipInfoDto.EMPTY);
            this.put("345", ShipInfoDto.EMPTY);
            this.put("346", ShipInfoDto.EMPTY);
            this.put("347", ShipInfoDto.EMPTY);
            this.put("348", ShipInfoDto.EMPTY);
            this.put("349", ShipInfoDto.EMPTY);
            this.put("350", ShipInfoDto.EMPTY);
            this.put("351", ShipInfoDto.EMPTY);
            this.put("352", ShipInfoDto.EMPTY);
            this.put("353", ShipInfoDto.EMPTY);
            this.put("354", ShipInfoDto.EMPTY);
            this.put("355", ShipInfoDto.EMPTY);
            this.put("356", ShipInfoDto.EMPTY);
            this.put("357", ShipInfoDto.EMPTY);
            this.put("358", ShipInfoDto.EMPTY);
            this.put("359", ShipInfoDto.EMPTY);
            this.put("360", ShipInfoDto.EMPTY);
            this.put("361", ShipInfoDto.EMPTY);
            this.put("362", ShipInfoDto.EMPTY);
            this.put("363", ShipInfoDto.EMPTY);
            this.put("364", ShipInfoDto.EMPTY);
            this.put("365", ShipInfoDto.EMPTY);
            this.put("366", ShipInfoDto.EMPTY);
            this.put("367", ShipInfoDto.EMPTY);
            this.put("368", ShipInfoDto.EMPTY);
            this.put("369", ShipInfoDto.EMPTY);
            this.put("370", ShipInfoDto.EMPTY);
            this.put("371", ShipInfoDto.EMPTY);
            this.put("372", ShipInfoDto.EMPTY);
            this.put("373", ShipInfoDto.EMPTY);
            this.put("374", ShipInfoDto.EMPTY);
            this.put("375", ShipInfoDto.EMPTY);
            this.put("376", ShipInfoDto.EMPTY);
            this.put("377", ShipInfoDto.EMPTY);
            this.put("378", ShipInfoDto.EMPTY);
            this.put("379", ShipInfoDto.EMPTY);
            this.put("380", ShipInfoDto.EMPTY);
            this.put("381", ShipInfoDto.EMPTY);
            this.put("382", ShipInfoDto.EMPTY);
            this.put("383", ShipInfoDto.EMPTY);
            this.put("384", ShipInfoDto.EMPTY);
            this.put("385", ShipInfoDto.EMPTY);
            this.put("386", ShipInfoDto.EMPTY);
            this.put("387", ShipInfoDto.EMPTY);
            this.put("388", ShipInfoDto.EMPTY);
            this.put("389", ShipInfoDto.EMPTY);
            this.put("390", ShipInfoDto.EMPTY);
            this.put("391", ShipInfoDto.EMPTY);
            this.put("392", ShipInfoDto.EMPTY);
            this.put("393", ShipInfoDto.EMPTY);
            this.put("394", ShipInfoDto.EMPTY);
            this.put("395", ShipInfoDto.EMPTY);
            this.put("396", ShipInfoDto.EMPTY);
            this.put("397", ShipInfoDto.EMPTY);
            this.put("398", new ShipInfoDto("伊168改", "潜水艦"));
            this.put("399", new ShipInfoDto("伊58改", "潜水空母"));
            this.put("400", ShipInfoDto.EMPTY);
            this.put("401", ShipInfoDto.EMPTY);
            this.put("402", ShipInfoDto.EMPTY);
            this.put("403", ShipInfoDto.EMPTY);
            this.put("404", ShipInfoDto.EMPTY);
            this.put("405", ShipInfoDto.EMPTY);
            this.put("406", ShipInfoDto.EMPTY);
            this.put("407", ShipInfoDto.EMPTY);
            this.put("408", ShipInfoDto.EMPTY);
            this.put("409", ShipInfoDto.EMPTY);
            this.put("410", ShipInfoDto.EMPTY);
            this.put("411", ShipInfoDto.EMPTY);
            this.put("412", ShipInfoDto.EMPTY);
            this.put("413", ShipInfoDto.EMPTY);
            this.put("414", ShipInfoDto.EMPTY);
            this.put("415", ShipInfoDto.EMPTY);
            this.put("416", ShipInfoDto.EMPTY);
            this.put("417", ShipInfoDto.EMPTY);
            this.put("418", ShipInfoDto.EMPTY);
            this.put("419", ShipInfoDto.EMPTY);
            this.put("420", ShipInfoDto.EMPTY);
            this.put("421", ShipInfoDto.EMPTY);
            this.put("422", ShipInfoDto.EMPTY);
            this.put("423", ShipInfoDto.EMPTY);
            this.put("424", ShipInfoDto.EMPTY);
            this.put("425", ShipInfoDto.EMPTY);
            this.put("426", ShipInfoDto.EMPTY);
            this.put("427", ShipInfoDto.EMPTY);
            this.put("428", ShipInfoDto.EMPTY);
            this.put("429", ShipInfoDto.EMPTY);
            this.put("430", ShipInfoDto.EMPTY);
            this.put("431", ShipInfoDto.EMPTY);
            this.put("432", ShipInfoDto.EMPTY);
            this.put("433", ShipInfoDto.EMPTY);
            this.put("434", ShipInfoDto.EMPTY);
            this.put("435", ShipInfoDto.EMPTY);
            this.put("436", ShipInfoDto.EMPTY);
            this.put("437", ShipInfoDto.EMPTY);
            this.put("438", ShipInfoDto.EMPTY);
            this.put("439", ShipInfoDto.EMPTY);
            this.put("440", ShipInfoDto.EMPTY);
            this.put("441", ShipInfoDto.EMPTY);
            this.put("442", ShipInfoDto.EMPTY);
            this.put("443", ShipInfoDto.EMPTY);
            this.put("444", ShipInfoDto.EMPTY);
            this.put("445", ShipInfoDto.EMPTY);
            this.put("446", ShipInfoDto.EMPTY);
            this.put("447", ShipInfoDto.EMPTY);
            this.put("448", ShipInfoDto.EMPTY);
            this.put("449", ShipInfoDto.EMPTY);
            this.put("450", ShipInfoDto.EMPTY);
            this.put("451", ShipInfoDto.EMPTY);
            this.put("452", ShipInfoDto.EMPTY);
            this.put("453", ShipInfoDto.EMPTY);
            this.put("454", ShipInfoDto.EMPTY);
            this.put("455", ShipInfoDto.EMPTY);
            this.put("456", ShipInfoDto.EMPTY);
            this.put("457", ShipInfoDto.EMPTY);
            this.put("458", ShipInfoDto.EMPTY);
            this.put("459", ShipInfoDto.EMPTY);
            this.put("460", ShipInfoDto.EMPTY);
            this.put("461", ShipInfoDto.EMPTY);
            this.put("462", ShipInfoDto.EMPTY);
            this.put("463", ShipInfoDto.EMPTY);
            this.put("464", ShipInfoDto.EMPTY);
            this.put("465", ShipInfoDto.EMPTY);
            this.put("466", ShipInfoDto.EMPTY);
            this.put("467", ShipInfoDto.EMPTY);
            this.put("468", ShipInfoDto.EMPTY);
            this.put("469", ShipInfoDto.EMPTY);
            this.put("470", ShipInfoDto.EMPTY);
            this.put("471", ShipInfoDto.EMPTY);
            this.put("472", ShipInfoDto.EMPTY);
            this.put("473", ShipInfoDto.EMPTY);
            this.put("474", ShipInfoDto.EMPTY);
            this.put("475", ShipInfoDto.EMPTY);
            this.put("476", ShipInfoDto.EMPTY);
            this.put("477", ShipInfoDto.EMPTY);
            this.put("478", ShipInfoDto.EMPTY);
            this.put("479", ShipInfoDto.EMPTY);
            this.put("480", ShipInfoDto.EMPTY);
            this.put("481", ShipInfoDto.EMPTY);
            this.put("482", ShipInfoDto.EMPTY);
            this.put("483", ShipInfoDto.EMPTY);
            this.put("484", ShipInfoDto.EMPTY);
            this.put("485", ShipInfoDto.EMPTY);
            this.put("486", ShipInfoDto.EMPTY);
            this.put("487", ShipInfoDto.EMPTY);
            this.put("488", ShipInfoDto.EMPTY);
            this.put("489", ShipInfoDto.EMPTY);
            this.put("490", ShipInfoDto.EMPTY);
            this.put("491", ShipInfoDto.EMPTY);
            this.put("492", ShipInfoDto.EMPTY);
            this.put("493", ShipInfoDto.EMPTY);
            this.put("494", ShipInfoDto.EMPTY);
            this.put("495", ShipInfoDto.EMPTY);
            this.put("496", ShipInfoDto.EMPTY);
            this.put("497", ShipInfoDto.EMPTY);
            this.put("498", ShipInfoDto.EMPTY);
            this.put("499", ShipInfoDto.EMPTY);
            this.put("500", ShipInfoDto.EMPTY);
            this.put("501", new ShipInfoDto("駆逐イ級", "駆逐艦", ""));
            this.put("502", new ShipInfoDto("駆逐ロ級", "駆逐艦", ""));
            this.put("503", new ShipInfoDto("駆逐ハ級", "駆逐艦", ""));
            this.put("504", new ShipInfoDto("駆逐ニ級", "駆逐艦", ""));
            this.put("505", new ShipInfoDto("軽巡ホ級", "軽巡洋艦", ""));
            this.put("506", new ShipInfoDto("軽巡ヘ級", "軽巡洋艦", ""));
            this.put("507", new ShipInfoDto("軽巡ト級", "軽巡洋艦", ""));
            this.put("508", new ShipInfoDto("雷巡チ級", "重雷装巡洋艦", ""));
            this.put("509", new ShipInfoDto("重巡リ級", "重巡洋艦", ""));
            this.put("510", new ShipInfoDto("軽母ヌ級", "軽空母", ""));
            this.put("511", new ShipInfoDto("戦艦ル級", "戦艦", ""));
            this.put("512", new ShipInfoDto("空母ヲ級", "正規空母", ""));
            this.put("513", new ShipInfoDto("輸送ワ級", "補給艦", ""));
            this.put("514", new ShipInfoDto("駆逐イ級", "駆逐艦", "elite"));
            this.put("515", new ShipInfoDto("駆逐ロ級", "駆逐艦", "elite"));
            this.put("516", new ShipInfoDto("駆逐ハ級", "駆逐艦", "elite"));
            this.put("517", new ShipInfoDto("駆逐ニ級", "駆逐艦", "elite"));
            this.put("518", new ShipInfoDto("軽巡ホ級", "軽巡洋艦", "elite"));
            this.put("519", new ShipInfoDto("軽巡ヘ級", "軽巡洋艦", "elite"));
            this.put("520", new ShipInfoDto("軽巡ト級", "軽巡洋艦", "elite"));
            this.put("521", new ShipInfoDto("雷巡チ級", "重雷装巡洋艦", "elite"));
            this.put("522", new ShipInfoDto("重巡リ級", "重巡洋艦", "elite"));
            this.put("523", new ShipInfoDto("軽母ヌ級", "軽空母", "elite"));
            this.put("524", new ShipInfoDto("戦艦ル級", "戦艦", "elite"));
            this.put("525", new ShipInfoDto("空母ヲ級", "正規空母", "elite"));
            this.put("526", new ShipInfoDto("輸送ワ級", "補給艦", "elite"));
            this.put("527", new ShipInfoDto("重巡リ級", "重巡洋艦", "flagship"));
            this.put("528", new ShipInfoDto("空母ヲ級", "正規空母", "flagship"));
            this.put("529", new ShipInfoDto("戦艦ル級", "戦艦", "flagship"));
            this.put("530", new ShipInfoDto("潜水カ級", "潜水艦", ""));
            this.put("531", new ShipInfoDto("潜水ヨ級", "潜水艦", ""));
            this.put("532", new ShipInfoDto("潜水カ級", "潜水艦", "elite"));
            this.put("533", new ShipInfoDto("潜水ヨ級", "潜水艦", "elite"));
            this.put("534", new ShipInfoDto("潜水カ級", "潜水艦", "flagship"));
            this.put("535", new ShipInfoDto("潜水ヨ級", "潜水艦", "flagship"));
            this.put("536", new ShipInfoDto("浮遊要塞", "航空戦艦", ""));
            this.put("537", new ShipInfoDto("浮遊要塞", "航空戦艦", ""));
            this.put("538", new ShipInfoDto("浮遊要塞", "航空戦艦", ""));
            this.put("539", new ShipInfoDto("泊地棲鬼", "航空戦艦", ""));
            this.put("540", new ShipInfoDto("泊地棲姫", "航空戦艦", ""));
            this.put("541", new ShipInfoDto("戦艦タ級", "戦艦", ""));
            this.put("542", new ShipInfoDto("戦艦タ級", "戦艦", "elite"));
            this.put("543", new ShipInfoDto("戦艦タ級", "戦艦", "flagship"));
            this.put("544", new ShipInfoDto("装甲空母鬼", "航空戦艦", ""));
            this.put("545", new ShipInfoDto("装甲空母姫", "航空戦艦", ""));
            this.put("546", new ShipInfoDto("南方棲鬼", "航空戦艦", ""));
            this.put("547", new ShipInfoDto("南方棲戦鬼", "航空戦艦", ""));
            this.put("548", new ShipInfoDto("南方棲戦姫", "航空戦艦", ""));
            this.put("549", new ShipInfoDto("護衛要塞", "航空戦艦", ""));
            this.put("550", new ShipInfoDto("護衛要塞", "航空戦艦", ""));
            this.put("551", new ShipInfoDto("護衛要塞", "航空戦艦", ""));
            this.put("552", new ShipInfoDto("駆逐ロ級", "駆逐艦", "flagship"));
            this.put("553", new ShipInfoDto("駆逐ハ級", "駆逐艦", "flagship"));
            this.put("554", new ShipInfoDto("軽巡ホ級", "軽巡洋艦", "flagship"));
            this.put("555", new ShipInfoDto("軽巡ヘ級", "軽巡洋艦", "flagship"));
            this.put("556", ShipInfoDto.EMPTY);
            this.put("557", ShipInfoDto.EMPTY);
            this.put("558", ShipInfoDto.EMPTY);
            this.put("559", ShipInfoDto.EMPTY);
            this.put("560", ShipInfoDto.EMPTY);
            this.put("561", ShipInfoDto.EMPTY);
            this.put("562", ShipInfoDto.EMPTY);
            this.put("563", ShipInfoDto.EMPTY);
            this.put("564", ShipInfoDto.EMPTY);
            this.put("565", ShipInfoDto.EMPTY);
            this.put("566", ShipInfoDto.EMPTY);
            this.put("567", ShipInfoDto.EMPTY);
            this.put("568", ShipInfoDto.EMPTY);
            this.put("569", ShipInfoDto.EMPTY);
            this.put("570", ShipInfoDto.EMPTY);
            this.put("571", ShipInfoDto.EMPTY);
            this.put("572", ShipInfoDto.EMPTY);
            this.put("573", ShipInfoDto.EMPTY);
            this.put("574", ShipInfoDto.EMPTY);
            this.put("575", ShipInfoDto.EMPTY);
            this.put("576", ShipInfoDto.EMPTY);
            this.put("577", ShipInfoDto.EMPTY);
            this.put("578", ShipInfoDto.EMPTY);
            this.put("579", ShipInfoDto.EMPTY);
            this.put("580", ShipInfoDto.EMPTY);
            this.put("581", ShipInfoDto.EMPTY);
            this.put("582", ShipInfoDto.EMPTY);
            this.put("583", ShipInfoDto.EMPTY);
            this.put("584", ShipInfoDto.EMPTY);
            this.put("585", ShipInfoDto.EMPTY);
            this.put("586", ShipInfoDto.EMPTY);
            this.put("587", ShipInfoDto.EMPTY);
            this.put("588", ShipInfoDto.EMPTY);
            this.put("589", ShipInfoDto.EMPTY);
            this.put("590", ShipInfoDto.EMPTY);
            this.put("591", ShipInfoDto.EMPTY);
            this.put("592", ShipInfoDto.EMPTY);
            this.put("593", ShipInfoDto.EMPTY);
            this.put("594", ShipInfoDto.EMPTY);
            this.put("595", ShipInfoDto.EMPTY);
            this.put("596", ShipInfoDto.EMPTY);
            this.put("597", ShipInfoDto.EMPTY);
            this.put("598", ShipInfoDto.EMPTY);
            this.put("599", ShipInfoDto.EMPTY);
            this.put("600", ShipInfoDto.EMPTY);
        }
    };

    /**
     * 艦娘を取得します
     * 
     * @param id ID
     * @return 艦娘
     */
    public static ShipInfoDto get(String id) {
        return SHIP.get(id);
    }
}