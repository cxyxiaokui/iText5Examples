package cn.zhuoqianmingyue.chapter_1;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
/**
 *  创建最大页面的pdf
 */
public class HelloWorldMaximum {
	/** Path to the resulting PDF file. */
    public static final String RESULT = "D:/results/part1/chapter01/hello_maximum.pdf";
 
    /**
     * Creates a PDF file: hello_maximum.pdf
     * Important notice: the PDF is valid (in conformance with
     * ISO-32000), but some PDF viewers won't be able to render
     * the PDF correctly due to their own limitations.
     * @param    args    no arguments needed
     */
    public static void main(String[] args)
        throws DocumentException, IOException {
        // 第一步
    	//最大页面尺寸
        Document document = new Document(new Rectangle(14400, 14400));
        // 第二步
        PdfWriter writer =PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        // 改变用户单位 使用此方法设置用户单位。UserUnit是定义默认用户空间单位的值。最小UserUnit为1（1个单位= 1/72英寸）。最大UserUnit为75,000。请注意，此用户单元仅适用于从PDF1.6开始！
        writer.setUserunit(75000f);
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph("Hello World"));
        // step 5
        document.close();
    }
}
