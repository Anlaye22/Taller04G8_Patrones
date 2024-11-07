/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller04_patrones_g8;

/**
 *
 * @author GENERATION 10
 */
public class ExcelReport implements Report{
    
     @Override
    public void generate(String content) {
        System.out.println("Generating Excel report with content: " + content);
        // Lógica específica para Excel
    }
    
}
