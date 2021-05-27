
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     * @throws java.sql.SQLException
     */
    public ventana() throws SQLException {
        initComponents();
        //Nos centra la pantalla al centro.
        this.setLocationRelativeTo(null);
        //Creamos un constructor para que cuando se ejecute la pantalla se vea el contenido de la base de datos.
        ejecutarTabla ();
    }

   //Nos da la conexion con MySQL.
   Connection Con = null;
   //Procesa la sentencia SQL.
   Statement stat = null;
   //Nos da los resultados de la consulta.
   ResultSet res = null;
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botonBorrar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonInsertar = new javax.swing.JButton();
        SetPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SetApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SetNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SetHabitacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SetTabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        txtCambiarAdmin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        jButton3.setText("jButton3");

        jButton2.setText("jButton2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1183, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(182, 136, 16));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        botonBorrar.setBackground(new java.awt.Color(182, 136, 16));
        botonBorrar.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        botonBorrar.setText("Borrar");
        botonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBorrarMouseClicked(evt);
            }
        });
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonModificar.setBackground(new java.awt.Color(182, 136, 16));
        botonModificar.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setText("Modificar");
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarMouseClicked(evt);
            }
        });

        botonInsertar.setBackground(new java.awt.Color(182, 136, 16));
        botonInsertar.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonInsertar.setForeground(new java.awt.Color(255, 255, 255));
        botonInsertar.setText("Insertar");
        botonInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInsertarMouseClicked(evt);
            }
        });
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");

        SetApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetApellidosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido");

        SetNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetNombreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        SetHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetHabitacionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Habitacion");

        SetTabla.setBackground(new java.awt.Color(255, 255, 255));
        SetTabla.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        SetTabla.setForeground(new java.awt.Color(0, 0, 0));
        SetTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Habitacion", "Nombre", "Apellido", "Precio"
            }
        ));
        SetTabla.setIntercellSpacing(new java.awt.Dimension(0, 0));
        SetTabla.setRowHeight(25);
        SetTabla.setSelectionBackground(new java.awt.Color(255, 255, 204));
        SetTabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        SetTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetTablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(SetTabla);

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ABADES BENACAZON");

        botonLimpiar.setBackground(new java.awt.Color(182, 136, 16));
        botonLimpiar.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonLimpiarMouseClicked(evt);
            }
        });
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SetHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SetNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(SetPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SetApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(575, 575, 575)
                        .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(SetHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(SetPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SetNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(SetApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
        );

        BotonSalir.setBackground(new java.awt.Color(255, 255, 255));
        BotonSalir.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(0, 0, 0));
        BotonSalir.setText("Salir");
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
        });

        txtCambiarAdmin.setBackground(new java.awt.Color(255, 255, 255));
        txtCambiarAdmin.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txtCambiarAdmin.setForeground(new java.awt.Color(0, 0, 0));
        txtCambiarAdmin.setText("Admin.Usuarios");
        txtCambiarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCambiarAdminMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuaderno (2).png"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCambiarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCambiarAdmin)
                        .addGap(38, 38, 38)
                        .addComponent(BotonSalir)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetApellidosActionPerformed

    private void SetHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetHabitacionActionPerformed

    private void SetNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetNombreActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarActionPerformed

    //Este metodo nos sirve para ver lo que tenemos en la BD reflejado en nuestra tabla.
    public void ejecutarTabla () throws SQLException{
    
    Con = DriverManager.getConnection("jdbc:mysql://localhost/53278379y?serverTimezone=UTC", "root", "");
    stat = Con.createStatement();
    res = stat.executeQuery("Select * from 53278379y.acceso");
    
    //DbUtils es una libreria que nos permite capturar lo que tenemos en la BD y mostrarlo en la tabla. JAR rs2xml.
    SetTabla.setModel(DbUtils.resultSetToTableModel(res));
    }
    
    private void botonInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInsertarMouseClicked
        
        //Si introducimos una linea en la tambla sin uno de estos datos nos salta un mensaje.
        if (SetHabitacion.getText().isEmpty()|| SetNombre.getText().isEmpty()|| SetApellidos.getText().isEmpty()|| SetPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Para completar rellena todos los datos");
       
        //Si la habitacion (PK) esta ocupada salta este mensaje.
       // } else if(SetHabitacion.getText() == "SetHabitacion"){
         //     JOptionPane.showMessageDialog(this, "Esa habitacion esta ocupada");
              
        } else{
        try {
            //Conectamos el boton de insertar con la base de datos de MySQL                                                                     NombreBD      Contraseña
            Con = DriverManager.getConnection("jdbc:mysql://localhost/53278379y?serverTimezone=UTC", "root", "");
           
            //Hacemos la inserccion de datos dentro de la tabla con un INSERT INTO.
            PreparedStatement insertar = Con.prepareStatement("INSERT into acceso values(?,?,?,?)");
                insertar.setInt(1, Integer.valueOf(SetHabitacion.getText()));
                insertar.setString(2, SetNombre.getText());
                insertar.setString(3, SetApellidos.getText());
                insertar.setInt(4, Integer.valueOf(SetPrecio.getText()));
                
                //Ejecutamos la inserccion de la fila.
                int row = insertar.executeUpdate();
                
                //Mostramos un mensaje de que se a insertado correctamente.
                JOptionPane.showMessageDialog(this, "Se ha insertado correctamente el cliente de la habitacion");
                Con.close();
                ejecutarTabla();

        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
     
    }//GEN-LAST:event_botonInsertarMouseClicked
    //Este metodo nos devuelve en las casillas la fila que hemos señalado.
    
    private void SetTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetTablaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel)SetTabla.getModel();
        //Señala la fila.
        int filaElegida = SetTabla.getSelectedRow();
        //Las introduce en el casillero señalado (0,1,2,3).
        SetHabitacion.setText(modelo.getValueAt(filaElegida, 0).toString());
        SetNombre.setText(modelo.getValueAt(filaElegida, 1).toString());
        SetApellidos.setText(modelo.getValueAt(filaElegida, 2).toString());
        SetPrecio.setText(modelo.getValueAt(filaElegida, 3).toString());
    }//GEN-LAST:event_SetTablaMouseClicked

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarActionPerformed
    //Este metodo borra las reservas de la BD.
    private void botonBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMouseClicked
        //Si alguno de los parametros esta vacio nos salta un mensaje.
        if(SetHabitacion.getText().isEmpty()|| SetNombre.getText().isEmpty()|| SetApellidos.getText().isEmpty()|| SetPrecio.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Introduzca la reserva que desea borrar");
    }else{      
            try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost/53278379y?serverTimezone=UTC", "root", "");
            //Cojemos como parametro de la BD la habitacion ya que sera la PK.
            String habitacion = SetHabitacion.getText();
            //Hacemos el DELETE de la base de datos buscado por la PK.
            String borrarBD = "DELETE FROM 53278379y.acceso where SetHabitacion ="+habitacion;
            Statement agregar = Con.createStatement();
            agregar.executeUpdate(borrarBD);
            Con.close();
            ejecutarTabla();
            JOptionPane.showMessageDialog(this, "La reserva se a borrado correctamente");
            

} catch (Exception e) {e.printStackTrace();}
            }
    
    }//GEN-LAST:event_botonBorrarMouseClicked

    private void botonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMouseClicked
      SetHabitacion.setText("");
      SetPrecio.setText("");
      SetNombre.setText("");
      SetApellidos.setText("");
    }//GEN-LAST:event_botonLimpiarMouseClicked

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLimpiarActionPerformed
        
    //Boton de modificar.
    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
        //Si alguna de las casillas esta en blanco nos devuelve el mensaje.

        if (SetHabitacion.getText().isEmpty()|| SetNombre.getText().isEmpty()|| SetApellidos.getText().isEmpty()|| SetPrecio.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Para completar rellena todos los datos");
        }  else {
            try {
                //Hacemos un UPDATE de la BD preguntando por la habitacion que es la PK.
                Con = DriverManager.getConnection("jdbc:mysql://localhost/53278379y?serverTimezone=UTC", "root", "");
                String consulta = "Update 53278379y.acceso set SetHabitacion ='"+SetHabitacion.getText()+"'"+ ",SetNombre ='" +SetNombre.getText()+ "'" + ",SetApellidos ='"+SetApellidos.getText()+"'"+",SetPrecio ='"+SetPrecio.getText() + "'" + "where SetHabitacion ="+SetHabitacion.getText();
                Statement agregar = Con.createStatement();
                agregar.executeUpdate(consulta);
                JOptionPane.showMessageDialog(this, "Datos de rerva modificados");
                Con.close();
                ejecutarTabla();
            } catch (SQLException e) {
            }
            
        }
    }//GEN-LAST:event_botonModificarMouseClicked
    //Boton de salir.
    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void txtCambiarAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCambiarAdminMouseClicked
        new administrador().setVisible(true);
        
    }//GEN-LAST:event_txtCambiarAdminMouseClicked
    

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ventana().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField SetApellidos;
    private javax.swing.JTextField SetHabitacion;
    private javax.swing.JTextField SetNombre;
    private javax.swing.JTextField SetPrecio;
    private javax.swing.JTable SetTabla;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton txtCambiarAdmin;
    // End of variables declaration//GEN-END:variables

    private void If(boolean empty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
