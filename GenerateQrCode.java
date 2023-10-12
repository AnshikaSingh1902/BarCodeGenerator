package qrcode;

import java.nio.file.Paths;

//import java.awt.Rectangle;
//import java.nio.file.Paths;

//import javax.swing.text.Document;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class GenerateQrCode {
	 
    public static void main(String[] args) throws Exception {
         
        String content = "https://simplifyingtechcode.wordpress.com/";
        //String content1="C:\\Users\\anshi\\Downloads\\Java-Interview-Questions.pdf";
        String pathToStore = "C:\\Users\\anshi\\OneDrive\\Desktop\\QRdemo\\Q1.png";
         
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, 500, 500);
        MatrixToImageWriter.writeToPath(bitMatrix, "jpg", Paths.get(pathToStore));
         
        System.out.println("QR Code Generated Successfully");
        
    	
    	
      
 
    }
 
}


