package exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_PDFExample {
	
	
	@Test
	public void verifyPDFContent() throws Exception {
		
		new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\Desktop\\notebook.pdf");
		PDDocument pdfDoc = PDDocument.load(fis);
		
		
		int pagesCount = pdfDoc.getPages().getCount();
		System.out.println("Page count are: "+ pagesCount);
		
		Assert.assertEquals(3, pagesCount);
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		
		pdfText.setStartPage(1);
		pdfText.setEndPage(3);				//inclusive
		
		
		
		
		String pdfContent = pdfText.getText(pdfDoc);
		System.out.println("===============================================");
		System.out.println(pdfContent);
		System.out.println("===============================================");

		
		Assert.assertTrue(pdfContent.contains("As the final interpreter of the Constitution"));
		
		
	}

}
