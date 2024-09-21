package org.language;

public class State {
	private void southIndia() {
		System.out.println("Chennai");
		
	}
	private void northIndia() {
		System.out.println("Delhi");
		
	}
	public static void main(String[]args) {
		Language l = new Language();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		State s = new State();
		s.southIndia();
		s.northIndia();
	}
}
