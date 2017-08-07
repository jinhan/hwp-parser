/**
 * 
 */

/**
 * @author jinhan
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import rcc.h2tlib.parser.H2TParser;
import rcc.h2tlib.parser.HWPVER;
import rcc.h2tlib.parser.HWPMeta;

public class HwpParserExample {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String path = "/Volumes/Macintosh SD/detox/접수면접진단지/Sampled100/";
		File dirFile = new File(path);
		File []fileList = dirFile.listFiles();
		for (File tempFile : fileList) {
			if(tempFile.isFile()) {
				String tempPath = tempFile.getParent();
				String tempFileName = tempFile.getName();
				String fi = tempPath + "/" + tempFileName;
				System.out.println(fi);
				System.out.println(tempFileName);
				
				String tempFileNameOut;
				tempFileNameOut = tempFileName.replace("hwp", "txt");
				
			    String fo = "/Volumes/Macintosh SD/detox/접수면접진단지/outSampled/" + tempFileNameOut;
			    System.out.println(fo);
				HWPMeta meta = new HWPMeta();
				H2TParser parser = new H2TParser();	
				boolean flg = parser.GetText(fi, meta, fo);
	
			    if (flg)
			    {
			        System.out.println("HWP 파일입니다.");
			    }
			    else
			        System.out.println("HWP 파일이 아닙니다.");
				
			}
		}
	}
}
		
//		String fi = "/Volumes/Macintosh SD/detox/접수면접진단지/Sampled100/CNSHOME_201203231023183190_null_null_null.hwp";
//	    String fo = "/Volumes/Macintosh SD/detox/접수면접진단지/out2.txt";





