package myjava.eight.features.encodedecode;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeDecodeExp {

	public static void main(String[] args) {
		Encoder encoder1 = Base64.getEncoder();
		Decoder decoder1 = Base64.getDecoder();
		String encodedStr = encoder1.encodeToString("Pankaj".getBytes());
		
		System.out.println(encodedStr);
		
		
	    System.out.println(new String(decoder1.decode(encodedStr)));
	    
	    ///////////////////
	    
	    Encoder urlEncoder = Base64.getUrlEncoder();
	    Decoder urlDecoder = Base64.getUrlDecoder();
	    
	    System.out.println(urlEncoder.encodeToString("www.google.co.in".getBytes()));
	    System.out.println(new String (urlDecoder.decode("d3d3Lmdvb2dsZS5jby5pbg==".getBytes())));
	}

}
