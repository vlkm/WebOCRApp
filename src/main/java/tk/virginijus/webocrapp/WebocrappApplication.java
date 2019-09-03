package tk.virginijus.webocrapp;

import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;

@SpringBootApplication
public class WebocrappApplication {

    public static void main(String[] args) {
        String inputPath  =  "target/classes/";
        String inputFilePath = inputPath + "files/OA.png";
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setDatapath(inputPath + "lib");
         // tesseract.setLanguage("eng");
         // tesseract.setLanguage("lit");
            String fullText  = tesseract.doOCR(new File(inputFilePath));
            System.out.println(fullText);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
       // SpringApplication.run(WebocrappApplication.class, args);
    }

}
