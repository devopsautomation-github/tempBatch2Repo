package exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Read_PDFDocument {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis =  new FileInputStream("C:\\Users\\91995\\Desktop\\notebook.pdf");
		
		PDDocument pdfDoc = PDDocument.load(fis);
		
		
		int pageCount = pdfDoc.getPages().getCount();

		System.out.println("Page Count: " + pageCount);
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		
		String pdfCompleteText = pdfText.getText(pdfDoc);
		
		
		System.out.println(pdfCompleteText);
		
		
	}

}
