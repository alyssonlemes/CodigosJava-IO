package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "C";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + " , windows-1252");
		String snovo = new String(bytes, "windows-1252");
		System.out.println(snovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + " , UTF-16,   ");
		snovo = new String(bytes, "UTF-16");
		System.out.println(snovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + " , US_ASCII,    ");
		snovo = new String(bytes, "US_ACSII");
		System.out.println(snovo);
		
	
		//TESTANDO
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
