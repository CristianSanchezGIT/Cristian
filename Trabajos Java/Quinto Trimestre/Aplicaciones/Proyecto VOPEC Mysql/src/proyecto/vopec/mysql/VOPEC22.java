/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.vopec.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USUARIO
 */
public class VOPEC22 extends javax.swing.JFrame {

          ProyectoVOPECMysql cc= new ProyectoVOPECMysql();
      Connection cn= cc.ProyectoVOPECMysql();
    /**
     * Creates new form VOPEC22
     */
    public VOPEC22() {
        initComponents();
        int resp2;
        String resp=JOptionPane.showInputDialog("Por Favor Ingrese Su Id");
        
        if(resp==null){
        
JOptionPane.showMessageDialog(null,"..CANCELADO..");

this.show();
    jButton1.setEnabled(false);
    jButton12.setEnabled(false);
    jButton4.setEnabled(false);
    jButton7.setEnabled(false);
    jButton8.setEnabled(false);
    jButton9.setEnabled(false);
    jComboBox1.enable(false);
    jComboBoxGenero.enable(false);
    jFileChooser1.enable(false);
    jLabel1.enable(false);
    jLabel10.enable(false);
    jLabel11.enable(false);
    jLabel12.enable(false);
    jLabel13.enable(false);
    jLabel14.enable(false);
    jLabel15.enable(false);
    jLabel2.enable(false);
    jLabel3.enable(false);
    jLabel4.enable(false);
    jLabel5.enable(false);
    jLabel6.enable(false);
    jLabel7.enable(false);
    jLabel8.enable(false);
    jLabel9.enable(false);
    jPanel1.enable(false);
    jPanel2.enable(false);
    jPanel3.enable(false);
    jPanel4.enable(false);
    jScrollPane2.enable(false);
    jTable1.enable(false);
    jTextField1.enable(false);
    txtCodigoCurso.enable(false);
    txtCodigoResultados.enable(false);
    txtEMail.enable(false);
    txtEdad.enable(false);
    txtIdUsuario.enable(false);
    txtJornada.enable(false);
    txtNombresYApellidos.enable(false);
    JOptionPane.showMessageDialog(null,"POR FAVOR VUELVA ATRAS E INTENTELO DE NUEVO");

        }else{
            
            resp2=Integer.parseInt(resp);
            jTextField1.setText(Integer.toString(resp2));
            
             try{

            PreparedStatement pst = cn.prepareStatement("INSERT INTO estudiante(Id_Estudiante, Id_Usuario, Codigo_Resultados, Codigo_Curso, Genero_Estudiante, Nombre_Estudiante, Edad_Estudiante, Jornada_Estudiante, Correo_Estudiante) VALUES(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField1.getText());
            pst.setString(3, jTextField1.getText());
            pst.setString(4, jTextField1.getText());
            pst.setString(5, jTextField1.getText());
            pst.setString(6, jTextField1.getText());
            pst.setString(7, jTextField1.getText());
            pst.setString(8, jTextField1.getText());
            pst.setString(9, jTextField1.getText());
           
            pst.executeUpdate();
            
                   
           PreparedStatement pst2 = cn.prepareStatement("delete from estudiante where Id_Estudiante="+jTextField1.getText()+"");
           pst2.executeUpdate();
          mostrardatos("");
       
            
            
          JOptionPane.showMessageDialog(null,"CONTRASEÑA INCORRECTA");
     this.show();
    jButton1.setEnabled(false);
    jButton12.setEnabled(false);
    jButton4.setEnabled(false);
    jButton7.setEnabled(false);
    jButton8.setEnabled(false);
    jButton9.setEnabled(false);
    jComboBox1.enable(false);
    jComboBoxGenero.enable(false);
    jFileChooser1.enable(false);
    jLabel1.enable(false);
    jLabel10.enable(false);
    jLabel11.enable(false);
    jLabel12.enable(false);
    jLabel13.enable(false);
    jLabel14.enable(false);
    jLabel15.enable(false);
    jLabel2.enable(false);
    jLabel3.enable(false);
    jLabel4.enable(false);
    jLabel5.enable(false);
    jLabel6.enable(false);
    jLabel7.enable(false);
    jLabel8.enable(false);
    jLabel9.enable(false);
    jPanel1.enable(false);
    jPanel2.enable(false);
    jPanel3.enable(false);
    jPanel4.enable(false);
    jScrollPane2.enable(false);
    jTable1.enable(false);
    jTextField1.enable(false);
    txtCodigoCurso.enable(false);
    txtCodigoResultados.enable(false);
    txtEMail.enable(false);
    txtEdad.enable(false);
    txtIdUsuario.enable(false);
    txtJornada.enable(false);
    txtNombresYApellidos.enable(false);
                    
    JOptionPane.showMessageDialog(null,"POR FAVOR VUELVA ATRAS E INTENTELO DE NUEVO");
                    } catch (Exception e){
                   int ccc=resp2;
        txtIdEstudiante.setText(Integer.toString(ccc));   
        String sqlco="";
        sqlco="Select 	Id_Usuario, Codigo_Resultados, Codigo_Curso, Genero_Estudiante, Nombre_Estudiante, Edad_Estudiante, Jornada_Estudiante, Correo_Estudiante From Estudiante where Id_Estudiante="+ccc+"";
         
         try{
         Statement st = cn.createStatement();
         ResultSet re = st.executeQuery(sqlco);

         while(re.next()){
             
        txtIdUsuario.setText(re.getString(1));
        txtCodigoResultados.setText(re.getString(2));
        txtCodigoCurso.setText(re.getString(3));
        jComboBoxGenero.setSelectedItem(re.getString(3));
        txtNombresYApellidos.setText(re.getString(5));
        txtEdad.setText(re.getString(6));
        txtJornada.setText(re.getString(7));
        txtEMail.setText(re.getString(8));   
          
        }
  
    }catch (SQLException ex) {
         Logger.getLogger(VOPEC.class.getName()).log(Level.SEVERE, null, ex);
    }
          }
        }   
    }

    
     void mostrardatos(String valor){
     
     DefaultTableModel modelo = new DefaultTableModel();
     
     modelo.addColumn("Id Estudiante");
     modelo.addColumn("Id Usuario");
     modelo.addColumn("Codigo Resiultado");
     modelo.addColumn("Codigo Curso");
     modelo.addColumn("Genero");
     modelo.addColumn("Nombre Y Apellido");
     modelo.addColumn("Edad");
     modelo.addColumn("Jornada");
     modelo.addColumn("Correo");
     
             jTable1.setModel(modelo);
            String sql="";
            
                 if (jComboBox1.getSelectedItem() == "ID") {
                      sql="Select * From Estudiante where Id_Estudiante="+valor+"";
                 }else{
                         if (jComboBox1.getSelectedItem() == "Curso") {
                             sql="Select * From Estudiante where Codigo_Curso="+valor+"";
                          }else{
                               if (jComboBox1.getSelectedItem() == "Jornada") {
                                  sql="Select * From Estudiante where Jornada_Estudiante="+valor+"";
                               }else{
 
                              }
                           }
                 }
 
            
                 

            
            Object []datos= new Object [9];
         try{
         Statement st = cn.createStatement();
         ResultSet re = st.executeQuery(sql);

         while(re.next()){
             datos[0]=re.getString(1);
           
             datos[1]=re.getString(2);
             datos[2]=re.getString(3);
             datos[3]=re.getString(4);
             datos[4]=re.getString(5);
             datos[5]=re.getString(6);
             datos[6]=re.getString(7);
             datos[7]=re.getString(8);
             datos[8]=re.getString(9);
          
             modelo.addRow(datos);
        }
        jTable1.setModel(modelo);
    }catch (SQLException ex) {
         Logger.getLogger(VOPEC.class.getName()).log(Level.SEVERE, null, ex);
    }
              
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdEstudiante = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        txtCodigoResultados = new javax.swing.JTextField();
        txtCodigoCurso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombresYApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtJornada = new javax.swing.JTextField();
        txtEMail = new javax.swing.JTextField();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel9.setFont(new java.awt.Font("Vani", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bienvenido Al Sistema De Votaciones VOPEC");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sistema De Votaciones Para Personero Y Contralor");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/escudo.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/escudocol.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Id Estudiante :");

        jLabel2.setText("Id Usuario :");

        jLabel3.setText("Codigo Resultados :");

        jLabel4.setText("Codigo Curso :");

        jLabel5.setText("Genero :");

        txtIdEstudiante.setEnabled(false);
        txtIdEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEstudianteActionPerformed(evt);
            }
        });
        txtIdEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdEstudianteKeyReleased(evt);
            }
        });

        txtIdUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdUsuarioKeyReleased(evt);
            }
        });

        txtCodigoResultados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoResultadosKeyReleased(evt);
            }
        });

        txtCodigoCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoCursoKeyReleased(evt);
            }
        });

        jLabel6.setText("Nombres Y Apellidos :");

        jLabel7.setText("Edad :");

        jLabel8.setText("Jornada :");

        jLabel10.setText("E-Mail :");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEdadKeyReleased(evt);
            }
        });

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indefinido", "Masculino", "Femenino" }));

        jButton7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton7.setText("Limpiar Campos");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/informacion.jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setText("Abrir Foto");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jButton9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton9.setText("Modificar");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton8.setText("Mostrar Datos");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Atras");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 102, 204));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("CERRAR SESION");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoResultados)
                            .addComponent(txtIdEstudiante)
                            .addComponent(jComboBoxGenero, 0, 164, Short.MAX_VALUE))))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNombresYApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtIdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(txtCodigoResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(txtNombresYApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(txtJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar  Datos"));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Curso", "Jornada" }));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton4.setText("Buscar");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setText("Dato A Buscar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel15)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEstudianteActionPerformed

    private void txtIdEstudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEstudianteKeyReleased
        // TODO add your handling code here:
        if (!txtIdEstudiante.getText().matches("[0-9]*")) {
            txtIdEstudiante.setText("");//Limpia el campo
            //emite mensje
            JOptionPane.showMessageDialog(null, "Sólo puede ingresar caracteres numéricos!!", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtIdEstudianteKeyReleased

    private void txtIdUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdUsuarioKeyReleased
        // TODO add your handling code here:
        if (!txtIdUsuario.getText().matches("[0-9]*")) {
            txtIdUsuario.setText("");//Limpia el campo
            //emite mensje
            JOptionPane.showMessageDialog(null, "Sólo puede ingresar caracteres numéricos!!", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtIdUsuarioKeyReleased

    private void txtCodigoResultadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoResultadosKeyReleased
        // TODO add your handling code here:
        if (!txtCodigoResultados.getText().matches("[0-9]*")) {
            txtCodigoResultados.setText("");//Limpia el campo
            //emite mensje
            JOptionPane.showMessageDialog(null, "Sólo puede ingresar caracteres numéricos!!", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoResultadosKeyReleased

    private void txtCodigoCursoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoCursoKeyReleased
        // TODO add your handling code here:
        if (!txtCodigoCurso.getText().matches("[0-9]*")) {
            txtCodigoCurso.setText("");//Limpia el campo
            //emite mensje
            JOptionPane.showMessageDialog(null, "Sólo puede ingresar caracteres numéricos!!", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoCursoKeyReleased

    private void txtEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyReleased
        // TODO add your handling code here:
        if (!txtEdad.getText().matches("[0-9]*")) {
            txtEdad.setText("");//Limpia el campo
            //emite mensje
            JOptionPane.showMessageDialog(null, "Sólo puede ingresar caracteres numéricos!!", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtEdadKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        txtIdUsuario.setText("");
        txtCodigoResultados.setText("");
        txtCodigoCurso.setText("");
        jComboBoxGenero.setSelectedIndex(0);
        txtNombresYApellidos.setText("");
        txtEdad.setText("");
        txtJornada.setText("");
        txtEMail.setText("");
        jTextField1.setText("");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        int resp;
           resp=jFileChooser1.showOpenDialog(this);
           //resp=jFileChooser1.showSaveDialog(this);
           if (resp==JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null,jFileChooser1.getSelectedFile().toString());
                ImageIcon icono = new ImageIcon(jFileChooser1.getSelectedFile().toString());
                       // this.jLabel7.setIcon(icono);
                       // si tiene un tamaño mayor de alto y ancho la acomoda
              if(icono.getIconHeight()>200 || icono.getIconWidth()>200){
                    ImageIcon imageScalada = new
                    ImageIcon(icono.getImage().getScaledInstance(350, 400, 400));
                    this.jLabel11.setIcon(imageScalada);
             }else{
                 this.jLabel11.setIcon(icono);
             }
                try { // permite abrir el archivo
                     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " +
                     jFileChooser1.getSelectedFile().toString());
                } catch (Exception e) {
                     JOptionPane.showMessageDialog(rootPane, e , "Error",
                     JOptionPane.ERROR_MESSAGE);
                }
         } else if (resp==JFileChooser.CANCEL_OPTION)
       {
         JOptionPane.showMessageDialog(null,"Se pulsó la opción Cancelar");
       }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if((txtIdEstudiante.getText().equals("")) || (txtIdUsuario.getText().equals("")) || (txtCodigoResultados.getText().equals("")) || (txtCodigoCurso.getText().equals("")) || (jComboBoxGenero.getSelectedItem().toString().equals("")) || (txtNombresYApellidos.getText().equals("")) || (txtEdad.getText().equals("")) || (txtJornada.getText().equals("")) || (txtEMail.getText().equals(""))){
             
            JOptionPane.showMessageDialog(null,"Faltan Datos");
            
        }else{
            
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE estudiante SET Id_Usuario="+txtIdUsuario.getText()+",Codigo_Resultados="+txtCodigoResultados.getText()+",Codigo_Curso="+txtCodigoCurso.getText()+",Genero_Estudiante='"+jComboBoxGenero.getSelectedItem().toString()+"',Nombre_Estudiante='"+txtNombresYApellidos.getText()+"',Edad_Estudiante="+txtEdad.getText()+",Jornada_Estudiante='"+txtJornada.getText()+"',Correo_Estudiante='"+txtEMail.getText()+"'  where Id_Estudiante="+txtIdEstudiante.getText()+"");
            pst.executeUpdate();
            mostrardatos("");
            JOptionPane.showMessageDialog(null,"Sus Datos Han Sido Modificados Con Exito");
        }catch (Exception e){
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error Sus Datos No Se Han Podido Modificar");
        }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:ç

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id Estudiante");
        modelo.addColumn("Id Usuario");
        modelo.addColumn("Codigo Resiultado");
        modelo.addColumn("Codigo Curso");
        modelo.addColumn("Genero");
        modelo.addColumn("Nombre Y Apellido");
        modelo.addColumn("Edad");
        modelo.addColumn("Jornada");
        modelo.addColumn("Correo");

        jTable1.setModel(modelo);
        String sql="";

        sql="Select * From Estudiante";

        Object []datos= new Object [9];
        try{
            Statement st = cn.createStatement();
            ResultSet re = st.executeQuery(sql);

            while(re.next()){
                datos[0]=re.getString(1);

                datos[1]=re.getString(2);
                datos[2]=re.getString(3);
                datos[3]=re.getString(4);
                datos[4]=re.getString(5);
                datos[5]=re.getString(6);
                datos[6]=re.getString(7);
                datos[7]=re.getString(8);
                datos[8]=re.getString(9);

                modelo.addRow(datos);
            }
            jTable1.setModel(modelo);
        }catch (SQLException ex) {
            Logger.getLogger(VOPEC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Estudiante ay =new Estudiante();
        ay.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:

        inicio ay =new inicio();
        ay.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int num;
        num =Integer.parseInt(jTextField1.getText());

        String valor;
        valor=Integer.toString(num);
        mostrardatos(valor);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VOPEC22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VOPEC22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VOPEC22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VOPEC22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VOPEC22().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCodigoResultados;
    private javax.swing.JTextField txtEMail;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdEstudiante;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtJornada;
    private javax.swing.JTextField txtNombresYApellidos;
    // End of variables declaration//GEN-END:variables
}