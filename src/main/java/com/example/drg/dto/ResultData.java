package com.example.drg.dto;

import com.example.drg.util.Util;
import lombok.Data;

import java.util.Map;

@Data
public class ResultData {

	private String resultCode;
	private String msg;
	private Map<String, Object> body;

	public ResultData(String resultCode, String msg, Object... args) {
		this.resultCode = resultCode;
		this.msg = msg;
		this.body = Util.mapOf(args);
	}

	public ResultData(String resultCode, String msg, Map<String, Object> args) {
		this.resultCode = resultCode;
		this.msg = msg;
		this.body = args;
	}

	public boolean isSuccess() {
		return resultCode.startsWith("S-");
	}

	public boolean isFail() {
		return isSuccess() == false;
	}

}
