package one;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {

	String str = "abc=";
	
	String[] strArr = str.split("=");
	
	String str1= strArr[0];
	String str2 = "";
	
	try {
		str2 = strArr[1];
	}
	catch (Exception e) {
		System.out.println("in excwption");
	}
	
	String str3 = str2;
	
	System.out.println("--- _"+str3);
	
	
	
	
	}
	
}
