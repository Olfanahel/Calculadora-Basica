package Calculadora;
import javax.swing.*;
import java.awt.event.*;

public class Pantalla extends JFrame implements ActionListener{
    private int numero1 = 0,numero2 = 0,negativo =0;
    private double num1 = 0, num2 = 0,resu=0,neg = 0;
    private int resultado = 0;
    private int band = 0, negativoActivado = 0;
    private String op = "";
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAsterisco,bPunto;
    JButton bBorrar,bBorrarTodo,bSumar,bRestar,bMult,bDiv,bIgual;
    JTextField pantallaCalc;
    String texto = "";

    public Pantalla(){
        setLayout(null);
        pantallaCalc = new JTextField();
        pantallaCalc.setBounds(5,5,263,90);
        add(pantallaCalc);
        b1 = new JButton("1");
        b1.setBounds(5,100,50,30);
        add(b1);
        b1.addActionListener(this);
        b2 = new JButton("2");
        b2.setBounds(60,100,50,30);
        add(b2);
        b2.addActionListener(this);
        b3 = new JButton("3");
        b3.setBounds(115,100,50,30);
        add(b3);
        b3.addActionListener(this);
        b4 = new JButton("4");
        b4.setBounds(5,135,50,30);
        add(b4);
        b4.addActionListener(this);
        b5 = new JButton("5");
        b5.setBounds(60,135,50,30);
        add(b5);
        b5.addActionListener(this);
        b6 = new JButton("6");
        b6.setBounds(115,135,50,30);
        add(b6);
        b6.addActionListener(this);
        b7 = new JButton("7");
        b7.setBounds(5,170,50,30);
        add(b7);
        b7.addActionListener(this);
        b8 = new JButton("8");
        b8.setBounds(60,170,50,30);
        add(b8);
        b8.addActionListener(this);
        b9 = new JButton("9");
        b9.setBounds(115,170,50,30);
        add(b9);
        b9.addActionListener(this);
        bAsterisco = new JButton("+/-");
        bAsterisco.setBounds(5,205,50,30);
        add(bAsterisco);
        bAsterisco.addActionListener(this);
        b0 = new JButton("0");
        b0.setBounds(60,205,50,30);
        add(b0);
        b0.addActionListener(this);
        bPunto = new JButton(".");
        bPunto.setBounds(115,205,50,30);
        add(bPunto);
        bPunto.addActionListener(this);
        bBorrarTodo = new JButton("C");
        bBorrarTodo.setBounds(170,100,50,30);
        add(bBorrarTodo);
        bBorrarTodo.addActionListener(this);
        bBorrar = new JButton("<-");
        bBorrar.setBounds(225,100,50,30);
        add(bBorrar);
        bBorrar.addActionListener(this);
        bSumar = new JButton("+");
        bSumar.setBounds(170,135,50,30);
        add(bSumar);
        bSumar.addActionListener(this);
        bRestar = new JButton("-");
        bRestar.setBounds(225,135,50,30);
        add(bRestar);
        bRestar.addActionListener(this);
        bMult = new JButton("*");
        bMult.setBounds(170,170,50,30);
        add(bMult);
        bMult.addActionListener(this);
        bDiv = new JButton("/");
        bDiv.setBounds(225,170,50,30);
        add(bDiv);
        bDiv.addActionListener(this);
        bIgual = new JButton("=");
        bIgual.setBounds(170,205,105,30);
        add(bIgual);
        bIgual.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            texto += "1";
            pantallaCalc.setText(texto);
        }
        if(e.getSource() == b2){
            texto += "2";
            pantallaCalc.setText(texto);
        }
        if(e.getSource() == b3){
            texto += "3";
            pantallaCalc.setText(texto);
        }
        if(e.getSource() == b4){
            texto += "4";
            pantallaCalc.setText(texto);
        }
        if(e.getSource() == b5){
            texto += "5";
            pantallaCalc.setText(texto);
        }
        if(e.getSource() == b6){
            texto += "6";
            pantallaCalc.setText(texto);
        }
        if(e.getSource() == b7){
            texto += "7";
            pantallaCalc.setText(texto);
        }
        if(e.getSource() == b8){
            texto += "8";
            pantallaCalc.setText(texto);
        }
        if(e.getSource() == b9){
            texto += "9";
            pantallaCalc.setText(texto);
        }
        if(e.getSource() == b0){
            texto += "0";
            pantallaCalc.setText(texto);
        }
        if(e.getSource() == bPunto){
            texto += ".";
            pantallaCalc.setText(texto);
            band = 1;
        }
        if(e.getSource() == bAsterisco){
            if(band == 0){
                negativo = Integer.parseInt(pantallaCalc.getText());
                negativo *= -1;
            }else{
                neg = Double.parseDouble(pantallaCalc.getText());
                neg *= -1;
            }
            pantallaCalc.setText("- " + texto);
            negativoActivado = 1;
        }
        if(e.getSource() == bSumar){
            if(band == 0){
                if(negativoActivado == 1){
                    numero1 = negativo;
                }else{
                    numero1 = Integer.parseInt(pantallaCalc.getText());
                }
                texto = "";
                numero2 = numero1;
                numero1 = 0;
                op = "Suma";
            }else{
                if(negativoActivado == 1){
                    num1 = neg;
                }else{
                    num1 = Double.parseDouble(pantallaCalc.getText());
                }
                texto = "";
                num2 = num1;
                num1 = 0;
                op = "Suma";
            }
        }
        if(e.getSource() == bRestar){
            if(band == 0){
                if(negativoActivado == 1){
                    numero1 = negativo;
                }else{
                    numero1 = Integer.parseInt(pantallaCalc.getText());
                }
                texto = "";
                numero2 = numero1;
                numero1 = 0;
                op = "Restar";
            }else{
                if(negativoActivado == 1){
                    num1 = neg;
                }else{
                    num1 = Double.parseDouble(pantallaCalc.getText());
                }
                texto = "";
                num2 = num1;
                num1 = 0;
                op = "Restar";
            }
        }
        if(e.getSource() == bMult){
            if(band == 0){
                if(negativoActivado == 1){
                    numero1 = negativo;
                }else{
                    numero1 = Integer.parseInt(pantallaCalc.getText());
                }
                texto = "";
                numero2 = numero1;
                numero1 = 0;
                op = "Multiplicar";
            }else{
                if(negativoActivado == 1){
                    num1 = neg;
                }else{
                    num1 = Double.parseDouble(pantallaCalc.getText());
                }
                texto = "";
                num2 = num1;
                num1 = 0;
                op = "Multiplicar";
            }
        }
        if(e.getSource() == bDiv){
            if(band == 0){
                if(negativoActivado == 1){
                    numero1 = negativo;
                }else{
                    numero1 = Integer.parseInt(pantallaCalc.getText());
                }
                texto = "";
                numero2 = numero1;
                numero1 = 0;
                op = "Dividir";
            }else{
                if(negativoActivado == 1){
                    num1 = neg;
                }else{
                    num1 = Double.parseDouble(pantallaCalc.getText());
                }
                texto = "";
                num2 = num1;
                num1 = 0;
                op = "Dividir";
            }
        }
        if(e.getSource() == bBorrarTodo){
            texto = "";
            pantallaCalc.setText(texto);
            band = 0;
        }
        if(e.getSource() == bBorrar){
            if(texto.equals("")){
                texto = "";
                pantallaCalc.setText(texto);
            }else{
                texto = texto.replaceFirst(".$","");
                pantallaCalc.setText(texto);
            }
        }
        if(e.getSource() == bIgual){
            if(band == 0){
                if(op.equals("Suma")){
                    if(negativoActivado == 1){
                        numero1 = negativo;
                    }else{
                        numero1 = Integer.parseInt(pantallaCalc.getText());
                    }
                    resultado = numero2 + numero1;
                    pantallaCalc.setText(String.valueOf(resultado));
                }else if(op.equals("Restar")){
                    if(negativoActivado == 1){
                        numero1 = negativo;
                    }else{
                        numero1 = Integer.parseInt(pantallaCalc.getText());
                    }
                    resultado = numero2 - numero1;
                    pantallaCalc.setText(String.valueOf(resultado));
                }else if(op.equals("Multiplicar")){
                    if(negativoActivado == 1){
                        numero1 = negativo;
                    }else{
                        numero1 = Integer.parseInt(pantallaCalc.getText());
                    }
                    resultado = numero2 * numero1;
                    pantallaCalc.setText(String.valueOf(resultado));
                }else if(op.equals("Dividir")){
                    if(negativoActivado == 1){
                        numero1 = negativo;
                    }else{
                        numero1 = Integer.parseInt(pantallaCalc.getText());
                    }
                    if(numero1 == 0){
                        pantallaCalc.setText("Error");
                    }else{
                        resultado = numero2 / numero1;
                        pantallaCalc.setText(String.valueOf(resultado));
                    }
                }
            }else{
                if(op.equals("Suma")){
                    if(negativoActivado == 1){
                        num1 = negativo;
                    }else{
                        num1 = Integer.parseInt(pantallaCalc.getText());
                    }
                    resu = num2 + num1;
                    pantallaCalc.setText(String.valueOf(resu));
                }else if(op.equals("Restar")){
                    if(negativoActivado == 1){
                        num1 = negativo;
                    }else{
                        num1 = Integer.parseInt(pantallaCalc.getText());
                    }
                    resu = num2 - num1;
                    pantallaCalc.setText(String.valueOf(resu));
                }else if(op.equals("Multiplicar")){
                    if(negativoActivado == 1){
                        num1 = negativo;
                    }else{
                        num1 = Integer.parseInt(pantallaCalc.getText());
                    }
                    resu = num2 * num1;
                    pantallaCalc.setText(String.valueOf(resu));
                }else if(op.equals("Dividir")){
                    if(negativoActivado == 1){
                        num1 = negativo;
                    }else{
                        num1 = Integer.parseInt(pantallaCalc.getText());
                    }
                    if(num1 == 0){
                        pantallaCalc.setText("Error");
                    }else{
                        resu = num2 / num1;
                        pantallaCalc.setText(String.valueOf(resu));
                    }
                }
            }
        }
    }

}
