/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores_Vista;

import Clases_Modulo_Carga.*;
import Clases_Modulo_Cliente.Establecimiento;
import Clases_Modulo_Viaje.*;
import Hibernate.GestorHibernate;
import java.awt.Color;
import java.util.Iterator;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ale
 */
public class gestorRegistrarViaje extends GestorHibernate {
    
     public void ActualizarDatos(String seleccion, JPanel panelPuerto, JPanel panelEstablecimiento, JLabel labelPuerto, JLabel labelEstablecimiento, JLabel labelProvincia, JLabel labelDepartamento,
                                   JTable tblEstablecimiento, JScrollPane scpEstablecimiento, JTable tblRetiro, int banderaE, int banderaP){
        
       
       
        if (seleccion.equalsIgnoreCase("Traslado a Puerto")){
        panelPuerto.setVisible(true);
        panelEstablecimiento.setVisible(false);
        labelDepartamento.setVisible(false);
        labelProvincia.setVisible(true);
        labelEstablecimiento.setVisible(false);
        labelPuerto.setVisible(true);
        tblEstablecimiento.setVisible(true);
        DefaultTableModel modelo= (DefaultTableModel) tblEstablecimiento.getModel();
        modelo.setRowCount(0);
        if(banderaP != 0){
        Iterator ite = this.listarClase(PuertoPorSolicitud.class).iterator();
        while(ite.hasNext()){
            PuertoPorSolicitud p = (PuertoPorSolicitud) ite.next();
            if(p.getSolicitud().getEstado().equalsIgnoreCase("Pendiente")){
            Object fila[]= {p.getSolicitud().getNumeroSolicitud(), p.getSolicitud().getProductor(), p.getSolicitud().getProductor().getNumeroDocumento()};
            modelo.addRow(fila);
            tblEstablecimiento.setModel(modelo);
            }
        }
//        scpEstablecimiento.setVisible(true);
        }
        
        }
        
        if(seleccion.equalsIgnoreCase("Retiro de Establecimiento")){
        panelPuerto.setVisible(false);
        panelEstablecimiento.setVisible(true);
          DefaultTableModel modelo= (DefaultTableModel) tblRetiro.getModel();
           modelo.setRowCount(0);
            Iterator ite = this.listarClase(SolicitudRetiro.class).iterator();
            while(ite.hasNext()){
            SolicitudRetiro sol = (SolicitudRetiro) ite.next();
            if(sol.getTipoSolicitud().getIdTipoSolicitud()==1 && sol.getEstado().equalsIgnoreCase("Pendiente")){
            Object fila[]= {sol.getNumeroSolicitud(), sol.getProductor(), sol.getProductor().getNumeroDocumento()};
            modelo.addRow(fila);
            tblEstablecimiento.setModel(modelo);
            }
        }
       }
        
        if(seleccion.equalsIgnoreCase("Traslado a Establecimiento")){
        panelPuerto.setVisible(true);
        panelEstablecimiento.setVisible(false);
        labelDepartamento.setVisible(true);
        labelProvincia.setVisible(false);
        labelEstablecimiento.setVisible(true);
        labelPuerto.setVisible(false);
        tblEstablecimiento.setVisible(true);
        DefaultTableModel modelo= (DefaultTableModel) tblEstablecimiento.getModel();
         modelo.setRowCount(0);
        if(banderaE != 0){
        Iterator ite = this.listarClase(EstablecimientoPorSolicitud.class).iterator();
        while(ite.hasNext()){
            EstablecimientoPorSolicitud est = (EstablecimientoPorSolicitud) ite.next();
            if(est.getSolicitud().getEstado().equalsIgnoreCase("Pendiente") && est.getSolicitud().getTipoSolicitud().getIdTipoSolicitud() == 2){
            Object fila[]= {est.getSolicitud().getNumeroSolicitud(), est.getSolicitud().getProductor(), est.getSolicitud().getProductor().getNumeroDocumento()};
            modelo.addRow(fila);
            tblEstablecimiento.setModel(modelo);
            }
        }
        }
        }
       }
       
     public DefaultComboBoxModel AgregarProductor(String productor){
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         Iterator ite = this.listarClase(Establecimiento.class).iterator();
         while(ite.hasNext()){
             Establecimiento establecimiento = (Establecimiento) ite.next();
             if(establecimiento.getProductor().toString() == productor){
                 modelo.addElement(establecimiento);
             }
         }
         return modelo;
     }
     
     public DefaultComboBoxModel AgregarTipoViaje(){
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         Iterator ite = this.listarClase(TipoViaje.class).iterator();
         while(ite.hasNext()){
             TipoViaje tviaje = (TipoViaje) ite.next();
             modelo.addElement(tviaje);
         }
         return modelo;
     }
     
     public int ContarPuerto(){
     int banderaP=0;
        Iterator iteP = this.listarClase(PuertoPorSolicitud.class).iterator();
        while(iteP.hasNext()){
            PuertoPorSolicitud p = (PuertoPorSolicitud) iteP.next();
            banderaP++;
        }
     return banderaP;  
     }
     
     public int ContarEst(){
     int banderaE = 0;
        Iterator iteE= this.listarClase(EstablecimientoPorSolicitud.class).iterator();
        while(iteE.hasNext()){
            EstablecimientoPorSolicitud e = (EstablecimientoPorSolicitud) iteE.next();
            banderaE++;
        }
        return banderaE;
     }
     
     public DefaultComboBoxModel CargaSilos(String TipoCereal){
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         Iterator ite = this.listarClase(Silo.class).iterator();
         while(ite.hasNext()){
             Silo silo = (Silo) ite.next();
             if(silo.getTipoCereal().getNombreCereal().equalsIgnoreCase(TipoCereal)){
                 modelo.addElement(silo);
             }
         }
         return modelo;     
     }
     
     public void cargaTabla(JTable tblEstablecimiento){
         DefaultTableModel modeloT = (DefaultTableModel) tblEstablecimiento.getModel();
         Iterator ite = this.listarClase(Viaje.class).iterator();
         while(ite.hasNext()){
             Viaje viaje = (Viaje) ite.next();
             if(viaje.getEstado().equalsIgnoreCase("Pendiente")){
                 Object fila[] = {viaje.getIdViaje(),viaje.getTipoViaje()};
                 modeloT.addRow(fila);
                 tblEstablecimiento.setModel(modeloT);
             }
         }
     }
     
      public int campoObligatorio(JTextField texto1, JTextField texto2){
         int campo = 0;   
         if(texto1.getText().equalsIgnoreCase("") || texto2.getText().equalsIgnoreCase("")){
                texto1.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                texto2.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                campo=1;
            }
          return campo;
     }  
     
        }
    
