package com.example.MultiplePDFs;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.MultiplePDFs.CustomerService;

@RestController
@RequestMapping("/pdf")
public class CustomerController {
    @Autowired
    private CustomerService pdfGeneratorService;

    @GetMapping("/generate")
    public ResponseEntity<String> generatePdf() {
        try {
            pdfGeneratorService.generateAllPdfs();
            return ResponseEntity.ok("PDF generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("PDF generation failed.");
        }
    }
}