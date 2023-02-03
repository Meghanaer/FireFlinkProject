package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.bouncycastle.asn1.cms.MetaData;
import org.xml.sax.SAXException;

public class ReadPdf {

	public static void main(String[] args) throws IOException, SAXException, TikaException {
		// TODO Auto-generated method stub
		
		BodyContentHandler contentHandler=new BodyContentHandler();
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/Meghana.E.R.pdf");
		Metadata metaData=new Metadata();
		ParseContext parseContext=new ParseContext();
		PDFParser parser=new PDFParser();
		parser.parse(fis, contentHandler, metaData, parseContext);
		System.out.println(contentHandler.toString());
		

	}

}
