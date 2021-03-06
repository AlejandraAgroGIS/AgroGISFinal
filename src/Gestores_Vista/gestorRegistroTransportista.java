/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores_Vista;

import Clases_Modulo_Transporte.*;
import Hibernate.GestorHibernate;
import datechooser.beans.DateChooserCombo;
import java.awt.Color;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Charito
 */
public class gestorRegistroTransportista extends GestorHibernate{
    
   
     public DefaultComboBoxModel rellenaCombo(String seleccion){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(Provincia.class).iterator();
       while(ite.hasNext()){
           Provincia provincia =(Provincia) ite.next();
           Pais pais = provincia.getPais();
           if (pais.getNombrePais().equals(seleccion)){
               modelo.addElement(provincia);
           }
       }
       
       return modelo;
   }
     
    public DefaultComboBoxModel rellenaComboDepartamento(String seleccion){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(Departamento.class).iterator();
       while(ite.hasNext()){
           Departamento departamento =(Departamento) ite.next();
           Provincia provincia = departamento.getProvincia();
           if (provincia.getNombreProvincia().equals(seleccion)){
               modelo.addElement(departamento);
           }
       }
       
       return modelo;
   }  
    
    public DefaultComboBoxModel rellenaComboLocalidad(String seleccion){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(Localidad.class).iterator();
       while(ite.hasNext()){
           Localidad localidad =(Localidad) ite.next();
           Departamento departamento = localidad.getDepartamento();
           if (departamento.getNombreDepartamento().equals(seleccion)){
               modelo.addElement(localidad);
           }
       }
       
       return modelo;
   } 
    
    public DefaultComboBoxModel rellenaComboBarrio(String seleccion){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(Barrio.class).iterator();
       while(ite.hasNext()){
           Barrio barrio =(Barrio) ite.next();
           Localidad localidad = barrio.getLocalidad();
           if (localidad.getNombreLocalidad().equals(seleccion)){
               modelo.addElement(barrio);
           }
       }
       
       return modelo;
   } 
    
//   public DefaultTableModel rellenaTablaVehiculo (String documento, JTable tabla){
//       DefaultTableModel modeloT = new DefaultTableModel();
//       Iterator ite = this.listarClase(Vehiculo.class).iterator();
//       while(ite.hasNext()){
//           Vehiculo vehiculo =(Vehiculo) ite.next();
//           Transportista transportista = vehiculo.getTransportista();
//           if (transportista.getNumeroDocumento().equals(documento)){
//               Iterator ite2= this.listarClase(Modelo.class).iterator();
//               while(ite.hasNext()){
//               Modelo modelo = (Modelo) ite2.next();
//               Marca marca = modelo.getMarca();
//               if(marca.equals(vehiculo.getMarca())){
//                    Object fila[]={vehiculo.getDominio(), vehiculo.getMarca(),modelo};
//                    modeloT.addRow(fila);
//                    tabla.setModel(modeloT);
//               }
//              }
//           }
//       }
//       
//       return modeloT;
//   }  
    
      public void deshabilitarCalendario(String seleccion, DateChooserCombo calendario){
      if(seleccion.equalsIgnoreCase("Estable")){
          calendario.setEnabled(false);
      }
      else{
          calendario.setEnabled(true);
      }
       
   } 
    
    public void deshabilitarCombo(JComboBox combo1, JComboBox combo2, JComboBox combo3, 
            JComboBox combo4, JComboBox combo5, JComboBox combo6){
        combo1.setEnabled(false);
        combo2.setEnabled(false);
        combo3.setEnabled(false);
        combo4.setEnabled(false);
        combo5.setEnabled(false);
        combo6.setEnabled(false);   
//        boton.setEnabled(false);
    }
    
    public void deshabilitarTxt(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5,
                                JTextField txt6, JTextField txt7, JTextField txt8, JTextField txt9, JTextField txt10){
        
        txt1.setEnabled(false);
        txt2.setEnabled(false);
        txt3.setEnabled(false);
        txt4.setEnabled(false);
        txt5.setEnabled(false);
        txt6.setEnabled(false);
        txt7.setEnabled(false);
        txt8.setEnabled(false);
        txt9.setEnabled(false);
        txt10.setEnabled(false);
        
    }
    
    public void habilitar(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5,
                           JComboBox combo1, JComboBox combo2, JComboBox combo3){
        txt1.setEnabled(true);
        txt2.setEnabled(true);
        txt3.setEnabled(true);
        txt4.setEnabled(true);
        txt5.setEnabled(true);
        combo1.setEnabled(true);
        combo2.setEnabled(true);
        combo3.setEnabled(true);    
    }
    
    public void deshabilitar(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5,
                           JComboBox combo1, JComboBox combo2, JComboBox combo3){
        txt1.setEnabled(false);
        txt2.setEnabled(false);
        txt3.setEnabled(false);
        txt4.setEnabled(false);
        txt5.setEnabled(false);
        combo1.setEnabled(false);
        combo2.setEnabled(false);
        combo3.setEnabled(false);

    }
    
       public Vehiculo editar(String dominio){
       Iterator ite = this.listarClase(Vehiculo.class).iterator();
       Vehiculo vehiculo = new Vehiculo();
       while(ite.hasNext()){
           vehiculo = (Vehiculo) ite.next();
           if(vehiculo.getDominio().equals(dominio)){
                break;
           }
           }
       return vehiculo;
    }
    
       public Modelo buscarModelo(Marca marca){
        Iterator ite = this.listarClase(Modelo.class).iterator();
        Modelo modelo = new Modelo();
        while(ite.hasNext()){
            modelo = (Modelo) ite.next();
            if(modelo.getMarca().equals(marca)){
                break;
            }
        }
        return modelo;
    }
       
       public DefaultComboBoxModel rellenaComboTipoDoc(){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(TipoDocumento.class).iterator();
       while(ite.hasNext()){
           TipoDocumento tipoDoc =(TipoDocumento) ite.next();
               modelo.addElement(tipoDoc);
           }

       return modelo;
   }
       
       
        public DefaultComboBoxModel rellenaComboModelo(String seleccion){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(Modelo.class).iterator();
       while(ite.hasNext()){
           Modelo mod =(Modelo) ite.next();
           Marca marca = mod.getMarca();
           if (marca.getNombreMarca().equals(seleccion)){
               modelo.addElement(mod);
           }
       }

       return modelo;
   }
        
      public DefaultComboBoxModel rellenaComboMarca(){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(Marca.class).iterator();
       while(ite.hasNext()){
           Marca marca =(Marca) ite.next();
               modelo.addElement(marca);
           }

       return modelo;
   }
      
      public DefaultComboBoxModel rellenaComboAnio(){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(AnioCompra.class).iterator();
       while(ite.hasNext()){
           AnioCompra anio =(AnioCompra) ite.next();
               modelo.addElement(anio);
           }

       return modelo;
   }
      
      public DefaultComboBoxModel rellenaComboTipoTel(){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(TipoTelefono.class).iterator();
       while(ite.hasNext()){
           TipoTelefono tipoTel =(TipoTelefono) ite.next();
               modelo.addElement(tipoTel);
           }

       return modelo;
   } 
      
      public DefaultComboBoxModel rellenaComboTipoContratacion(){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(CondicionContratacion.class).iterator();
       while(ite.hasNext()){
           CondicionContratacion condicion =(CondicionContratacion) ite.next();
               modelo.addElement(condicion);
           }

       return modelo;
   }    
      
      public DefaultComboBoxModel rellenaComboTransportista(){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(Transportista.class).iterator();
       while(ite.hasNext()){
           Transportista transportista =(Transportista) ite.next();
               modelo.addElement(transportista);
           }

       return modelo;
   }    
      
  public boolean validarCuit(String numCUIT) {
        String coef = "5432765432"; //coeficiente

        //método para determinar el CUIT
            try {
            int su = 0;
            int lCuit = numCUIT.length();
            if (lCuit < 9) {
                numCUIT = "00000000000";
            return false;
                }
            for(int i = 1; i < 11; i++) {
            String Cd1 = coef.substring(i-1, i);
            String Cd2 = numCUIT.substring(i-1, i);
            int cf = Integer.parseInt(Cd1); //casteo...
            int ct = Integer.parseInt(Cd2); //casteo...
            su += (cf * ct);
                }
            int md = su / 11;
            int re = su - (md * 11);
            if(re > 1) {
            re = 11 - re;
            }
            String CdDv = numCUIT.substring(lCuit - 1, lCuit);
            int dv = Integer.parseInt(CdDv); //casteo...
            if(dv == re) {
            return true;
            } else {
            return false;
            }
            }
            catch (Exception e) {
            return false;
           }
}    
     
     
     public boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;        
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }        
    }
     
     public int campoObligatorio(JTextField texto1, JTextField texto2, JTextField texto3, JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7, JTextField texto8){
         int campo = 0;   
         if(texto1.getText().equalsIgnoreCase("")){
                texto1.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
          if(texto2.getText().equalsIgnoreCase("")){
                texto2.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
           if(texto3.getText().equalsIgnoreCase("")){
                texto3.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
            if(texto4.getText().equalsIgnoreCase("")){
                texto4.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
             if(texto5.getText().equalsIgnoreCase("")){
                texto5.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
             if(texto6.getText().equalsIgnoreCase("")){
                texto6.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
             if(texto7.getText().equalsIgnoreCase("")){
                texto7.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
              if(texto8.getText().equalsIgnoreCase("")){
                texto8.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
         if(campo == 1){
            JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
         }
         return campo;
     }
 
     
     public int campoObligatorioCA(JTextField texto1, JTextField texto2, JTextField texto3, JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7, JTextField texto8, JTextField texto9, JTextField texto10){
         int campo = 0;   
         if(texto1.getText().equalsIgnoreCase("")){
                texto1.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
          if(texto2.getText().equalsIgnoreCase("")){
                texto2.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
           if(texto3.getText().equalsIgnoreCase("")){
                texto3.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
            if(texto4.getText().equalsIgnoreCase("")){
                texto4.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
             if(texto5.getText().equalsIgnoreCase("")){
                texto5.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
             if(texto6.getText().equalsIgnoreCase("")){
                texto6.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
             if(texto7.getText().equalsIgnoreCase("")){
                texto7.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
              if(texto8.getText().equalsIgnoreCase("")){
                texto8.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
              if(texto9.getText().equalsIgnoreCase("")){
                texto9.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
              if(texto10.getText().equalsIgnoreCase("")){
                texto10.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
         if(campo == 1){
            JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
         }
         return campo;
     }
     
      public int campoObligatorioCOA(JTextField texto1, JTextField texto2, JTextField texto3, JTextField texto4, JTextField texto5){
         int campo = 0;   
         if(texto1.getText().equalsIgnoreCase("")){
                texto1.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
          if(texto2.getText().equalsIgnoreCase("")){
                texto2.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
           if(texto3.getText().equalsIgnoreCase("")){
                texto3.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
            if(texto4.getText().equalsIgnoreCase("")){
                texto4.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
             if(texto5.getText().equalsIgnoreCase("")){
                texto5.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
          
         if(campo == 1){
            JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
         }
         return campo;
     }
}
