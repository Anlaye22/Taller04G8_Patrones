/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author GENERATION 10
 */
public class PdfReport implements Report {
    
    @Override
    public void generate(String content) {
        
         System.out.println("Generating PDF report with content: " + content);
        // Lógica específica para PDF
    }
        
    }
    

