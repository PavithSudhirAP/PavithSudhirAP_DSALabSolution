package com.gl.javafsd.ds4.bracketBalance;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketsManager {
	
	private static Set<Bracket> predefinedBrackets;

	static {
		
		predefinedBrackets = new LinkedHashSet<Bracket>();
		
		predefinedBrackets.add(new Bracket ('(',')'));
		
		predefinedBrackets.add(new Bracket ('[',']'));
		
		predefinedBrackets.add(new Bracket ('{','}'));
		
		predefinedBrackets.add(new Bracket ('<','>'));
		
	}
	
	public static Set<Character> getOpenBrackets(){
		Set<Character> result = new LinkedHashSet<Character>();
		Iterator<Bracket> iter = predefinedBrackets.iterator();
		while(iter.hasNext()) {
			Bracket bracket = iter.next();
			result.add(bracket.getOpenBracket());
		}
		return result;
	}
	
	public static Set<Character> getCloseBrackets(){
		Set<Character> result = new LinkedHashSet<Character>();
		Iterator<Bracket> iter = predefinedBrackets.iterator();
		while(iter.hasNext()) {
			Bracket bracket = iter.next();
			result.add(bracket.getCloseBracket());
		}
		return result;
	}
	
	public static Bracket getBracket(Character closeBracket) {
		for(Bracket predefinedBracket : predefinedBrackets) {
			if (predefinedBracket.getCloseBracket().equals(closeBracket)) {
				return predefinedBracket;
			}
		}
		return null;
	}
	
	
	
	
}
