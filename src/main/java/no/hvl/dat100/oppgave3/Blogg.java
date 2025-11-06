package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	private int nesteledig;
	
	public Blogg() {
		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		innleggtabell = new Innlegg[lengde];
		this.nesteledig = lengde;
	}

	public int getAntall() {
		throw new UnsupportedOperationException(TODO.method());
		return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
		throw new UnsupportedOperationException(TODO.method());
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		throw new UnsupportedOperationException(TODO.method());
		return nesteledig < innleggtabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		if (ledigPlass() && !finnes(innlegg)) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
		String string = nesteledig + "\n";
		for (int i = 0; i < nesteledig; i++) {
			string += innleggtabell[i].toString();
		}
		return string;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}