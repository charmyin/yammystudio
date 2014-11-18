package com.charmyin.cmstudio.common.utils;

public class CheckInspectResult {
	public static String checkValue(String str) {

		if (str == null || str.equals("null")) {
			return "";
		} else {
			if (str.equals("0")) {
				return "不正常";
			} else if (str.equals("1")) {
				return "正常";
			} else {
				return str;
			}
		}
	}

	public static String checkValue(String str, int i) {

		if (str == null) {
			return "";
		} else {
			if (i == 1) {
				if (str.equals("0")) {
					return "不正常";
				} else if (str.equals("1")) {
					return "正常";
				} else {
					return str;
				}
			}
			else if (i == 2) {
				if (str.equals("0")) {
					return "有";
				} else if (str.equals("1")) {
					return "无";
				} else {
					return str;
				}
			}else{
				return "";
			}
		}
	}
}
