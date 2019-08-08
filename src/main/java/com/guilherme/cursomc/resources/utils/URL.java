package com.guilherme.cursomc.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class URL {

	public static String decodeParam(String s) {
		try {
			return URLDecoder.decode(s, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
	public static List<Integer> decodeIntList(String s){
		String[] vet = s.split(","); //o Split é uma função que pega a String e recorta ele em pedacinho basiando no caractere que eu passei.
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<vet.length; i++) {
			list.add(Integer.parseInt(vet[i]));
		}
		return list;
		//return Arrays.asList(s.split(",")).stream().map(x -> Integer.parInt(x)).collect(Collectors.toList());
	}
}
