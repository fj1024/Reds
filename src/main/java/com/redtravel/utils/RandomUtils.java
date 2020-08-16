package com.redtravel.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class RandomUtils {
	//生成激活码
	public static String createActive() {


		return Integer.toString(( new Random().nextInt(900000) + 100000));

	}
	//生成订单号
	public static String createOrderId() {
		return getTime() + UUID.randomUUID().toString();
	}

	//设置时间格式
	public static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return sdf.format(Calendar.getInstance().getTime());
	}
}
