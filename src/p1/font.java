package p1;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class font {
	Font pixelMplus;
	
	public font() {
	try {
		 InputStream font = getClass().getResourceAsStream("/Font/PixelMplus10-Regular.ttf");//Imports the font file
		 pixelMplus = Font.createFont(Font.TRUETYPE_FONT, font);
		}catch(FontFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
		System.out.println("Font error");
			e.printStackTrace();
		}
		
	}
	
	
}
