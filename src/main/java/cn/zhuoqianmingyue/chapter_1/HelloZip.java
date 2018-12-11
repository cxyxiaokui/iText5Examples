package cn.zhuoqianmingyue.chapter_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloZip {
	  /** Path to the resulting PDF file. */
    public static final String RESULT = "D:/results/part1/chapter01/hello.zip";
 
    /**
     * Creates a zip file with five PDF documents:
     * hello1.pdf to hello5.pdf
     * @param    args    no arguments needed
     */
    public static void main(String[] args)
        throws DocumentException, IOException {
    	// creating a zip file with different PDF documents
        ZipOutputStream zip =
            new ZipOutputStream(new FileOutputStream(RESULT));
        for (int i = 1; i <= 3; i++) {
            ZipEntry entry = new ZipEntry("hello_" + i + ".pdf");
            zip.putNextEntry(entry);
 
            // step 1
            Document document = new Document();
            // step 2
            PdfWriter writer = PdfWriter.getInstance(document, zip);
            writer.setCloseStream(false);
            // step 3
            document.open();
            // step 4
            document.add(new Paragraph("Hello " + i));
            // step 5
            document.close();
 
            zip.closeEntry();
        }
        zip.close();
    }
}
