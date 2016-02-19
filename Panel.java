package colegio;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

 
public class Panel implements ActionListener{//implementando el listener de eventos
 
    JPanel jp1, jp2, jp3;
    JButton jb1, jb2, jb3, jbP1, jbP2, jbP3;   
    JPanel panel = new JPanel(new FlowLayout());
    public Panel(){
 
        JFrame jfM = new JFrame("JPanel En Java");  
        jfM.setLayout(null);
 
 
        gridJP(); bordJP(); flowJP(); //invocamos los metodos que contienen los paneles 
 
        jbP1 = new JButton("Panel 1"); jbP2 = new JButton("Panel 2"); jbP3 = new JButton("Panel 3");
        JPanel panel = new JPanel(new FlowLayout());
        jp1.setBounds(10, 10, 650, 450); jp2.setBounds(240, 10, 400, 250); jp3.setBounds(10, 270, 400, 150);
 
        jbP1.setBounds(10, 500, 90, 20); jbP2.setBounds(105, 500, 90, 20); jbP3.setBounds(200, 500, 90, 20);
 
        jfM.add(jp1); jfM.add(jp2); jfM.add(jp3); //agrega los paneles configurados
        jfM.add(jbP1); jfM.add(jbP2); jfM.add(jbP3); // apregra los botones a los paneles
        
        jbP1.addActionListener(this); jbP2.addActionListener(this); jbP3.addActionListener(this);
 ////////////////////////////
        
    	Vector columnas = new Vector();
    	columnas.add("Alumno");
    	columnas.add("Codigo");
    	columnas.add("Grado");
    	columnas.add("EstPANELXado");
    	columnas.add("completar");

    	Vector filas = new Vector();
    	Vector fila = new Vector();

    	fila.add("victor :scrollV");
    	fila.add(":V");
    	fila.add("6to ");
    	fila.add("DENUNCIADO PAPU");
    	filas.add(fila);
    	JTable tbl = new JTable(filas,columnas);
    	JScrollPane tableContainer =new JScrollPane(tbl);
    	jp1.add(tableContainer, BorderLayout.CENTER);
        jfM.getContentPane().add(panel);

        jfM.pack();
        jfM.setVisible(true);
        CampoTexto alumno = new CampoTexto();
      //  jp1.add(alumno, BorderLayout.NORTH);
    	
////////////////////////////////
        
        jfM.setLocation(100, 50);// en que lado de la pantalla se mostrara
        jfM.setResizable(false);// no se puede cvambiar el tamaño de ventana
        jfM.setVisible(true); // lo muestra
        jfM.setSize(800, 600); //tamaño de ventana
        jfM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public void gridJP(){
 
        jp1 = new JPanel(new GridLayout(1, 2, 5, 7));//filas, columnas, espacio entre filas, espacio entre columnas
 
        jb1= new JButton("B1"); jb2= new JButton("B2"); jb3= new JButton("B3");//creamos los objetos para el panel
        JPanel panel = new JPanel(new FlowLayout());
        //jp1.add(jb1); jp1.add(jb2); jp1.add(jb3);//añadimos los objetos al jpanel
 
        jb1.addActionListener(this); jb2.addActionListener(this); jb3.addActionListener(this);
 
        jp1.setVisible(true);
    }
 
    public void bordJP(){
        jp2 = new JPanel(new BorderLayout(2, 3));//espacio entre las regiones, horizontal y vertical
 
        jb1= new JButton("B1"); jb2= new JButton("B2"); jb3= new JButton("B3");//añadiendo objetos al jpanel
 
        jp2.add(jb1, BorderLayout.NORTH);//boton al panel norte
        jp2.add(jb2, BorderLayout.WEST); //boton a la region oeste
        jp2.add(jb3, BorderLayout.CENTER); //boton a la region centro    
 
        jb1.addActionListener(this); jb2.addActionListener(this); jb3.addActionListener(this);
 
        jp2.setVisible(false);
    }
 
    public void flowJP(){
        jp3 = new JPanel(new FlowLayout());
 
        jb1= new JButton("B1"); jb2= new JButton("B2"); jb3= new JButton("B3");//añadiendo objetos al jpanel
 
        jp3.add(jb1); jp3.add(jb2); jp3.add(jb3);//añadimos los objetos al jpanel
 
        jb1.addActionListener(this); jb2.addActionListener(this); jb3.addActionListener(this);
 
        jp3.setVisible(false);
    }
    public void Tabla(String panelx){
    	    }


	public static void main(String[] args) {        
    	Panel gj = new Panel();//uso de constructor para la ventana
 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
 
        if(e.getSource() == jbP1){
            if(!jp1.isVisible()){
            	jp1.setVisible(true);
            	jp3.setVisible(false);
                jp2.setVisible(false);
            }
        }else if(e.getSource() == jbP2){
            if(!jp2.isVisible()){
            	jp1.setVisible(false);
            	jp3.setVisible(false);
                jp2.setVisible(true);
            }
        }else if(e.getSource() == jbP3){
            if(!jp3.isVisible()){
            	jp1.setVisible(false);
            	jp3.setVisible(true);
                jp2.setVisible(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, e.getActionCommand());
        }
    }
}
