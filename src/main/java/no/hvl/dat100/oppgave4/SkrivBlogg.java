package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		throw new UnsupportedOperationException(TODO.method());
		String innhold = mappe + "/" + filnavn;
		
		try (PrintWriter leser = new PrintWriter(innhold)) {
			leser.print(samling.toString());
			return true;
		}
		catch(FileNotFoundException e){
			System.out.println("ukjent plassering");
			return false;
		}
	}
}
