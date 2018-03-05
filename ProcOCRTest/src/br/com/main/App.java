package br.com.main;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;

public class App {
	
	public static void main(String[] args) {
		
		Tesseract instance = Tesseract.getInstance();
		
		try {
			
			File file = new File("C:\\Users\\gfonseca\\Documents\\Git\\proc-ocr-test\\ProcOCRTest\\src\\br\\com\\main\\test.tiff");
			
			System.out.println(instance.doOCR(file));
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}
}
