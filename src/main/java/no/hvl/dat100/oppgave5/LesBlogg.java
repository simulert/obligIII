package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		
		throw new UnsupportedOperationException(TODO.method());
		Blogg blogg = null;
        String filepath = mappe + "/" + filnavn;

        try (Scanner leser = new Scanner(new File(filepath))) {

            int antall = Integer.parseInt(leser.nextLine());
            blogg = new Blogg(antall);

            for (int i = 0; i < antall; i++) {
                String type = leser.nextLine();

                int id = Integer.parseInt(leser.nextLine());
                String bruker = leser.nextLine();
                String dato = leser.nextLine();
                int likes = Integer.parseInt(leser.nextLine());

                if (type.equals(TEKST)) {
                    String tekst = leser.nextLine();
                    Tekst innlegg = new Tekst(id, bruker, dato, likes, tekst);
                    blogg.leggTil(innlegg);
                } 
                else if (type.equals(BILDE)) {
                    String tekst = leser.nextLine();
                    String url = leser.nextLine();
                    Bilde innlegg = new Bilde(id, bruker, dato, likes, tekst, url);
                    blogg.leggTil(innlegg);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Filen ble ikke funnet: " + filepath);
        } catch (Exception e) {
            System.out.println("Noe gikk galt ved lesing: " + e.getMessage());
        }

        return blogg;
		
	}
}