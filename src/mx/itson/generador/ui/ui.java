/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.generador.ui;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mx.itson.generador.entidades.data;

/**
 *
 * @author luism
 */
public class ui extends javax.swing.JFrame {

    /**
     * Creates new form ui
     */
    public ui() {
        initComponents();
        getContentPane().setBackground(Color.white);

    }
    
    // Metodo que busca la vocal interna del primer apellido
    public char VocalInternaApellido(String apellido) {
        String vocales = "AEIOU";
        for (int i = 1; i < apellido.length() - 1; i++) {
            String toUpperCase = apellido.toUpperCase();
            char caracterActual = toUpperCase.charAt(i);

            // Verificar si el caracter actual es una vocal
            if (vocales.indexOf(caracterActual) != -1) {
                return caracterActual; // Encontramos la primera vocal interna
            }
        }
        return ' ';
    }
    // Metodo que busca la primera letra del apellido materno, si no tiene nada se pone una x
    public char PrimerLetraApellidoMaterno(String apellido){
        char letra;
        if("".equals(apellido)){
           return letra = 'X';
        }else{
            char[] apellidoMaternoPrimera = apellido.toUpperCase().toCharArray();
            return letra = apellidoMaternoPrimera[0];
        }
        
    }
    // Metodo que junta fecha de nacimiento
    public String FechaDeNacimiento(String dia, String mes, String año){
        if(año.length() > 2 ){
           String añoUltimosDigitos = año.substring(año.length() - 2);
           año = añoUltimosDigitos;
        }
        String FechaFinal = año + mes + dia;
        return FechaFinal;
    }
    
    public static String sexo(String sexo){
            if(sexo == "Hombre"){
                sexo = "H";
            }else if(sexo == "Mujer"){
                sexo = "M";
            }
            return sexo;
        }
    
    public String EntidadesAsiglas(){
        
        data entidad = new data();
      entidad.setEntidad((String) cbEntidad.getSelectedItem());  
       if (entidad.getEntidad()=="Aguascalientes"){
        	entidad.setEntidad("AS"); 
        }
       if (entidad.getEntidad()=="Baja California"){
        	entidad.setEntidad("BC"); 
        }
       if (entidad.getEntidad()=="Baja California Sur"){
        	entidad.setEntidad("BS"); 
        }
       if (entidad.getEntidad()=="Campeche"){
        	entidad.setEntidad("CC"); 
        }
       if (entidad.getEntidad()=="Coahuila de Zaragoza"){
        	entidad.setEntidad("CL");
        }
       if (entidad.getEntidad()=="Colima"){
        	entidad.setEntidad("CM"); 
        }
       if (entidad.getEntidad()=="Chiapas"){
        	entidad.setEntidad("CS"); 
        }
       if (entidad.getEntidad()=="Chihuahua"){
        	entidad.setEntidad("CH");
        }
       if (entidad.getEntidad()=="Ciudad de Mexico"){
        	entidad.setEntidad("DF"); 
        }
       if (entidad.getEntidad()=="Durango"){
        	entidad.setEntidad("DG"); 
        }
        if (entidad.getEntidad()=="Guanajuato"){
        	entidad.setEntidad("GT");
        }
        if (entidad.getEntidad()=="Guerrero"){
        	entidad.setEntidad("GR"); 
        }
        if (entidad.getEntidad()=="Hidalgo"){
        	entidad.setEntidad("HG");
        }
        if (entidad.getEntidad()=="Jalisco"){
        	entidad.setEntidad("JC"); 
        }
        if (entidad.getEntidad()=="Mexico"){
        	entidad.setEntidad("MC"); 
        }
        if (entidad.getEntidad()=="Michoacan de Ocampo"){
        	entidad.setEntidad("MN"); 
        }
        if (entidad.getEntidad()=="Morelos"){
        	entidad.setEntidad("MS");
        }
        if (entidad.getEntidad()=="Nayarit"){
        	entidad.setEntidad("NT");
        }
        if (entidad.getEntidad()=="NuevoLeon"){
        	entidad.setEntidad("NL");
        }
      	if (entidad.getEntidad()=="Oaxaca"){
        	entidad.setEntidad("OC");
        }
        if (entidad.getEntidad()=="Puebla"){
        	entidad.setEntidad("PL"); 
        }
       	if (entidad.getEntidad()=="Queretaro"){
        	entidad.setEntidad("QT"); 
        }
        if (entidad.getEntidad()=="QuintanaRoo"){
        	entidad.setEntidad("QR"); 
        }
        if (entidad.getEntidad()=="SanLuisPotosi"){
        	entidad.setEntidad("SP"); 
        }
        if (entidad.getEntidad()=="Sinaloa"){
        	entidad.setEntidad("SL");
        }
        if (entidad.getEntidad()=="Sonora"){
        	entidad.setEntidad("SR"); 
        }
        if (entidad.getEntidad()=="Tabasco"){
        	entidad.setEntidad("TC");
        }
        if (entidad.getEntidad()=="Tamaulipas"){
        	entidad.setEntidad("TS");
        }
        if (entidad.getEntidad()=="Tlaxcala"){
        	entidad.setEntidad("TL");
        }
        if (entidad.getEntidad()=="Veracruz de Ignacio de la Llave"){
        	entidad.setEntidad("VZ");
        }
        if (entidad.getEntidad()=="Yucatan"){
        	entidad.setEntidad("YN"); 
        }
        if (entidad.getEntidad()=="Zacatecas"){
        	entidad.setEntidad("ZS");
        }
        if (entidad.getEntidad()=="Nacido en el Extranjero"){
                entidad.setEntidad("NE");
        }
       
    
        return entidad.getEntidad();
    }
    // Metodo para comprobar si el char actual es vocal.
    public static boolean EsVocal(char letra) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char letraUpperCase = Character.toUpperCase(letra);
        for (char vocal : vocales) {
            if (letraUpperCase == vocal) {
                return true;
            }
        }
        return false;
    }
    
    // Metodo que busca la primera consonate no inicial en el primer apellido
    public static char EncontrarPrimeraConsonanteInterna(String apellido) {
        char primeraConsonante = '\0';

        for (int i = 1; i < apellido.length(); i++) {
            char letra = Character.toUpperCase(apellido.charAt(i));
            if (Character.isLetter(letra) && !EsVocal(letra)) {
                primeraConsonante = letra;
                break;
            }
        }

        return primeraConsonante;
    }
    // Metodo que busca la primera consonate no inicial en el segundo apellido
    public static char EncontrarPrimeraConsonanteInterna2(String segundoApellido) {
        char primeraConsonante = '\0';

        if (segundoApellido.isEmpty()) {
            return 'X';
        }

        for (int i = 1; i < segundoApellido.length(); i++) {
            char letra = Character.toUpperCase(segundoApellido.charAt(i));
            if (Character.isLetter(letra) && !EsVocal(letra)) {
                primeraConsonante = letra;
                break;
            }
        }

        return primeraConsonante;
    }
    // Metodo que busca la primera consonate no inicial en el nombre
    public static char EncontrarPrimeraConsonanteInternaNombre(String nombre){
        char primeraConsonante = '\0';

        if (nombre.isEmpty()) {
            return 'X';
        }

        for (int i = 1; i < nombre.length(); i++) {
            char letra = Character.toUpperCase(nombre.charAt(i));
            if (Character.isLetter(letra) && !EsVocal(letra)) {
                primeraConsonante = letra;
                break;
            }
        }

        return primeraConsonante;
    }
    // Metodo en que determina que digito final tendra dependiendo del año en el que se nacio
    public static char DigitosFinales(int año){
        char digitoFinal;
        if(año <= 1999){
            digitoFinal = '0';
        } else{
            digitoFinal = 'A';
        } 
        return digitoFinal;
    }
    
    // Metodo que genera la curp
    public void curp() {
        data entidad = new data();
        entidad.setNombre((txtNombre.getText().trim()));
        entidad.setApellidoPaterno(txtApellidoP.getText().trim());
        entidad.setApellidoMaterno(txtApellidoM.getText().trim());
        entidad.setSexo((String) cbSexo.getSelectedItem());
        entidad.setDia(txtDia.getText().trim());
        entidad.setMes(txtMes.getText().trim());
        entidad.setAño(txtAño.getText().trim());
        entidad.setAño2(Integer.parseInt(txtAño.getText()));
        entidad.setEntidad((String) cbEntidad.getSelectedItem());

        //Primera letra primer apellido.
        char[] apellidoPaternoPrimera = entidad.getApellidoPaterno().toUpperCase().toCharArray();
        char primero = apellidoPaternoPrimera[0];
        
        //Primera vocal interna apellido
        char segundo = VocalInternaApellido(entidad.getApellidoPaterno());
        
        //Primera letra segundo apellido.
        char tercero = PrimerLetraApellidoMaterno(entidad.getApellidoMaterno());
        
        //Primera letra del Nombre de pila
        char[] nombrePrimera = entidad.getNombre().toUpperCase().toCharArray();
        char cuarto = nombrePrimera[0];
        
        //Fecha de nacimiento
        String quinto = FechaDeNacimiento(entidad.getDia(), entidad.getMes(), entidad.getAño());
        
        //Letra del sexo
        String sexto = sexo(entidad.getSexo());
        
        //Entidades
        String septimo = EntidadesAsiglas();
        
        //Primera Consonante interna no inicial del primer apellido
        char octavo = EncontrarPrimeraConsonanteInterna(entidad.getApellidoPaterno());
        
        //Primera Consonante interna no inicial del segundo apellido
        char noveno = EncontrarPrimeraConsonanteInterna2(entidad.getApellidoMaterno());
        
        //Primera consonante interna no incial del nombre
        char decimo = EncontrarPrimeraConsonanteInternaNombre(entidad.getNombre());
        
        //Digitos
        char onceavo = DigitosFinales(entidad.getAño2());
        
        //TESTEO!!!!
        //JOptionPane.showMessageDialog(null, DigitosFinales(entidad.getAño2()));
        
        lblResultado.setText("Resultado: " + primero + segundo + tercero + cuarto + quinto + sexto + septimo + octavo + noveno + decimo + onceavo + 1);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelArriba = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoP = new javax.swing.JLabel();
        lblApellidoM = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEntidad = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        cbEntidad = new javax.swing.JComboBox<>();
        btnAccion = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelArriba.setBackground(new java.awt.Color(0, 51, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Generador");

        javax.swing.GroupLayout panelArribaLayout = new javax.swing.GroupLayout(panelArriba);
        panelArriba.setLayout(panelArribaLayout);
        panelArribaLayout.setHorizontalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArribaLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelArribaLayout.setVerticalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArribaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap())
        );

        lblNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");

        lblApellidoP.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblApellidoP.setText("Apellido Paterno:");

        lblApellidoM.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblApellidoM.setText("Apellido Materno:");

        lblDia.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblDia.setText("Dia:");

        lblAño.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblAño.setText("Año:");

        lblMes.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblMes.setText("Mes:");

        lblSexo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblSexo.setText("Sexo:");

        lblEntidad.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblEntidad.setText("Entidad:");

        cbSexo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        cbEntidad.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cbEntidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja Califronia Sur", "Campeche", "Coahuila de Zaragoza", "Colima", "Chiapas", "Chihuahua", "Ciudad de Mexico", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Mexico", "Michoacan de Ocampo", "Morelos", "Nayarit", "Nuevo Leon", "Oaxaca", "Puebla", "Queretaro", "Quinatana Roo", "San Luis Potosi", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz de Ignacio de la Llave", "Yucatan", "Zacatecas" }));
        cbEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEntidadActionPerformed(evt);
            }
        });

        btnAccion.setBackground(new java.awt.Color(255, 255, 255));
        btnAccion.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnAccion.setForeground(new java.awt.Color(255, 153, 153));
        btnAccion.setText("GENERAR");
        btnAccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellidoP.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtApellidoM.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtDia.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtMes.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtAño.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        lblResultado.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblResultado.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellidoP)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoM)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSexo))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEntidad)
                                    .addComponent(cbEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDia)
                                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMes)
                                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAño)
                                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)))
                .addGap(0, 85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAño, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDia)
                                .addComponent(lblMes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEntidad)
                            .addComponent(lblSexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblApellidoM)
                        .addGap(16, 16, 16)
                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(lblResultado)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void cbEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEntidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEntidadActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        curp();
    }//GEN-LAST:event_btnAccionActionPerformed

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
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion;
    private javax.swing.JComboBox<String> cbEntidad;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblEntidad;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelArriba;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
