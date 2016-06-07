package com.imooc.util;

import java.util.Arrays;


public class CheckUtiil {

	private static final String TOKEN = "imooc";
	public static boolean checkSignature(String signature,String timestamp,String nonce){
		String[] arr = new String[]{TOKEN,timestamp,nonce};
		//����
		Arrays.sort(arr);
		
		//�����ַ���
		StringBuffer content = new StringBuffer();
		for(int i=0;i<arr.length;i++){
			content.append(arr[i]);
		}
		
		//sha1����
		String temp = Encode.hex_sha1(content.toString());
		return temp.equals(signature);
	}
}
