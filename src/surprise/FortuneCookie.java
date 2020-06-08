package surprise;

import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise {

	private static Random randomNumberGenerator = new Random();
	private String joyMessage;

	FortuneCookie(String message) {
		this.joyMessage = message;
	}

	@Override
	public void enjoy() {
		System.out.println("I have received a fortune cookie with the following message: " + this.joyMessage);
	}

	@Override
	public String toString() {
		return "Message from fortune cookie is: " + joyMessage + "";
	}

	public static FortuneCookie generate() {
		ArrayList<String> proverbe = new ArrayList<>();
		proverbe.add("Bate apa-n piua");
		proverbe.add("La mancare inainte, la razboi inapoi.");
		proverbe.add("Bate fierul cat e cald.");
		proverbe.add("Bine faci, bine gasesti.");
		proverbe.add("Cu rabdarea treci si marea.");
		proverbe.add("Boii batrani fac brazda dreapta");
		proverbe.add("Are si el omenie ca cateaua lui Ilie.");
		proverbe.add("Scoala este locul unde iti tesi norocul.");
		proverbe.add("Din talpa casei nu poti face doage, nici din coada de caine sita de matase.");
		proverbe.add("Cine se scuza, se acuza.");
		proverbe.add("Nu da binelui cu piciorul, ca pe urma ii duci dorul.");
		proverbe.add("Apa trece, pietrele raman.");
		proverbe.add("Mincinosu' roade osu'.");
		proverbe.add("Prin muncă și stăruință, vei ajunge la dorință.");
		proverbe.add("Are un car cu boi și o sută de nevoi.");
		proverbe.add("Baba n-aude, dar le potrivește.");
		proverbe.add("A fi domn nu-i lucru mare, a fi om e de mirare.");
		proverbe.add("Bunul gospodar își face vara sanie și iarna car");
		proverbe.add("Buturuga mică răstoarnă carul mare.");
		proverbe.add("Cine se aseamana, se aduna.");

		return new FortuneCookie(proverbe.get(FortuneCookie.randomNumberGenerator.nextInt(20)));
	}

}
