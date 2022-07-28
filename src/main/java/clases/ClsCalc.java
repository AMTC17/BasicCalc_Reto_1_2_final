/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class ClsCalc {
    
    //atributos
    private double numero1;
    private double numero2;
    
        
    //constructores
    public ClsCalc(){
    }

    public ClsCalc(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
        
    //method
    /*public double sumar(){
        double suma = this.numero1 + this.numero2;
        return suma;
    }
    
    public double restar(){
        double resta = this.numero1 - this.numero2;
        return resta;
    }
    
    public double multiplicar(){
        double multiplicacion = this.numero1 * this.numero2;
        return multiplicacion;
    }
    
    public double dividir(){
        double division = this.numero1 / this.numero2;
        return division;
    }
    
    public double raizc(){
        double raiz = Math.sqrt(this.numero1);
        return raiz;
    }
    */
    
    
    
    //metodo para el UI
    public void Inicio(){
        
        String menu = """
                      Por favor elija una opcion: 
                      
                      1. Operaciones
                      2. Salir
                      """;
        
        String option = "";//importante declarar antes
        
        
        do{
            option = JOptionPane.showInputDialog(menu);
            
            //aqui poner lo que debe pasar si la opcion es 1
            if(option.equals("1")){
                
                String [] operaciones = {"Suma", "Resta", "Multiplicacion", 
                    "Division","Potencia", "Raiz cuadrada","Regresar al inicio"};
            
                String operacion = (String) JOptionPane.showInputDialog(null, "Selecciona una operacion","operaciones",
                        JOptionPane.QUESTION_MESSAGE,null,operaciones,operaciones[0]);
                
                try{
                
                switch (operacion){
                    
                    case "Suma":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
                        
                        double suma = numero1 + numero2;
                        double resu = Math.round(suma * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado  es: " + resu);
                        break;
                                                
                    case "Resta":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
                        double resta = numero1 - numero2;
                        double resu2 = Math.round(resta * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado  es: " + resu2);
                        break;
                        
                    case "Multiplicacion":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
                        double mult = numero1 * numero2;
                        double resu3 = Math.round(mult * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado  es: " + resu3);
                        break;   
                        
                    case "Division":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
                        if(numero2 == 0){
                            JOptionPane.showMessageDialog(null, "No es posible dividir por cero ");
                            break;
                        }
                        double div = numero1 / numero2;
                        double resu4 = Math.round(div * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado  es: " + resu4);
                        break;
                        
                    case "Raiz cuadrada":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero"));
                        double sqr = Math.sqrt(numero1);
                        double resu5 = Math.round(sqr * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado  es: " + resu5);
                        break;
                        
                    case "Potencia":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
                        double pot = Math.pow(numero1,numero2);
                        double resu6 = Math.round(pot * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado  es: " + resu6);
                        break; 
                        
                }
                }catch(Exception e){JOptionPane.showMessageDialog(null,"El valor ingresado no es numerico");}
            }
        }while(!option.equals("2"));
  

    }

    /**
     * @return the numero1
     */
    public double getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return the numero2
     */
    public double getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}