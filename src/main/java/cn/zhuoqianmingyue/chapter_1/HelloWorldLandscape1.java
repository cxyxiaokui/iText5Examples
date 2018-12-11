package cn.zhuoqianmingyue.chapter_1;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorldLandscape1 {
	 /** 生成的PDF文件的路径 */
    public static final String RESULT = "D:/results/part1/chapter01/hello_landscape1.pdf";
 
    /**
     *   创建一个PDF文件: hello_landscape1.pdf
     * @param args no arguments needed
     */
    public static void main(String[] args)
        throws DocumentException, IOException {
    	 // 第一步
    	//横向的格式通过 rotate() 方法
        Document document = new Document(PageSize.LETTER.rotate());
        // 第二步
        PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        // 第三步
        document.open();
        // 第四步
        document.add(new Paragraph("Hello World"));
        // 第五步
        document.close();
    }
}
