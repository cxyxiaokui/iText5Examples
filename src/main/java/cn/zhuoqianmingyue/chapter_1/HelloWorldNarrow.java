package cn.zhuoqianmingyue.chapter_1;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
/**
 * 1.2 Document 构造函数
 */
public class HelloWorldNarrow {
	 /** 生成的PDF文件的路径。 */
    public static final String RESULT= "D:/results/part1/chapter01/hello_narrow.pdf";
 
    /**
     *   创建一个PDF文件： hello_narrow.pdf
     * @param args no arguments needed
     */
    public static void main(String[] args)throws DocumentException, IOException {
        // step 1
    	// 自定义页面大小使用
        Rectangle pagesize = new Rectangle(216f, 720f);
        Document document = new Document(pagesize, 36f, 72f, 108f, 180f);
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph(
            "Hello World! Hello People! " +
            "Hello Sky! Hello Sun! Hello Moon! Hello Stars!"));
        // step 5
        document.close();
    }
}
