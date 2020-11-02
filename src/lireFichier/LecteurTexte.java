package lireFichier;

import java.io.*;

public class LecteurTexte implements LecteurFichier{

	@Override
	public void lireFichier(String filename) {
		FileInputStream in = null;
		File f = new File(filename);
		try {
			in = new FileInputStream(f);
			int content=0;
			String result ="";
			do {
				try {
					content = in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (content != -1) {
					result += (char)content;
				
				}
			} while (content != -1);
			System.out.println(result);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void lireFichierPalindrome(String filename) {
		FileInputStream in = null;
		File f = new File(filename);
		try {
			in = new FileInputStream(f);
			int content=0;
			String result = "";
			do {
				try {
					content = in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (content != -1) {
					result += (char)content;
				}
			} while (content != -1);
			StringBuffer sb = (new StringBuffer(result)).reverse();
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
