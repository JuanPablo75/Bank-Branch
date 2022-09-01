package bank_branch.pkg3.pkg1;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Pablo
 */
public class Interface extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID_TextField = new javax.swing.JTextField();
        button1_Search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Name_TextField = new javax.swing.JTextField();
        button2_Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Accounts_Table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Import_Button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Path_TextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AddUser_Menu = new javax.swing.JMenuItem();
        ChangeName_Menu = new javax.swing.JMenuItem();
        Deposit_Menu = new javax.swing.JMenuItem();
        Withdraw_Menu = new javax.swing.JMenuItem();
        Transfer_Menu = new javax.swing.JMenuItem();
        DelUser_Menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search User");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setLabelFor(ID_TextField);
        jLabel2.setText("IDNumber:");

        button1_Search.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        button1_Search.setText("Search");
        button1_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1_SearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setLabelFor(Name_TextField);
        jLabel3.setText("Name:");

        button2_Search.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        button2_Search.setText("Search");
        button2_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2_SearchActionPerformed(evt);
            }
        });

        Accounts_Table.setAutoCreateRowSorter(true);
        Accounts_Table.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Accounts_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Accounts_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Accounts_Table);

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Import DataBase");

        Import_Button.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Import_Button.setText("Import");
        Import_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Import_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Import_ButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("File Path:");

        Path_TextField.setFont(new java.awt.Font("Roboto", 2, 10)); // NOI18N
        Path_TextField.setText("ifp.db");
        Path_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_TextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Remember to use double slashes \"//\"");

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        AddUser_Menu.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        AddUser_Menu.setText("Add User");
        AddUser_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUser_MenuActionPerformed(evt);
            }
        });
        jMenu1.add(AddUser_Menu);

        ChangeName_Menu.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        ChangeName_Menu.setText("Change User Name");
        ChangeName_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeName_MenuActionPerformed(evt);
            }
        });
        jMenu1.add(ChangeName_Menu);

        Deposit_Menu.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Deposit_Menu.setText("Deposit");
        Deposit_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deposit_MenuActionPerformed(evt);
            }
        });
        jMenu1.add(Deposit_Menu);

        Withdraw_Menu.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Withdraw_Menu.setText("Withdraw");
        Withdraw_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Withdraw_MenuActionPerformed(evt);
            }
        });
        jMenu1.add(Withdraw_Menu);

        Transfer_Menu.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Transfer_Menu.setText("Transfer");
        Transfer_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Transfer_MenuActionPerformed(evt);
            }
        });
        jMenu1.add(Transfer_Menu);

        DelUser_Menu.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        DelUser_Menu.setText("Delete User");
        DelUser_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelUser_MenuActionPerformed(evt);
            }
        });
        jMenu1.add(DelUser_Menu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Path_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Import_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Name_TextField)
                        .addGap(18, 18, 18)
                        .addComponent(button2_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ID_TextField)
                        .addGap(18, 18, 18)
                        .addComponent(button1_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1_Search))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2_Search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Path_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Import_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static Bank Bank;
    
    public Interface() {
        initComponents();
        this.setLocationRelativeTo(null);
        Bank = new Bank("My Bank");
        RefreshTable();
    }
    
    private void RefreshTable(){
        DefaultTableModel Account_Table = (DefaultTableModel)Accounts_Table.getModel();
        Account_Table.setRowCount(0);
        
        List<Account> Accounts = Bank.getListDB();  //IMPORTO MI BASE DE DATOS "PRINCIPAL"
        
        for(Account c : Accounts){
            String ID = c.getID();
            String Name = c.getName();
            double Balance = c.getBalance();
            LocalDate Date = c.getDate();
            
            Account_Table.addRow(new Object[]{ID,Name,Date,Balance});
            }
    }
    
    public void Import_DB(String path){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
            Statement stm = connection.createStatement();
            
            ResultSet rs = stm.executeQuery ("select * from accounts");
            
            while(rs.next()){       //CREO CUENTAS POR CADA FILA DE LA BASE DE DATOS
                String ID = rs.getString("id");
                String Name = rs.getString("name");
                LocalDate Date = rs.getDate("creation_date").toLocalDate();
                float Balance = rs.getFloat("balance");

                Account c = Bank.CreateAccount(ID, Name);   //AL CREAR LAS CUENTAS LAS ESTOY EMPUJANDO A MI BASE DE DATOS "PRIVADA"
                
                if(c != null){          //UTILIZO CONDICION PARA NO SALIR DEL LOOP EN CASO DE CUENTA DUPLICADA
                    c.setDate(Date);
                    c.setBalance(Balance);
                    }
                }
            
            stm.close();
            connection.close();
            }
        catch(ClassNotFoundException ex){
            System.out.println("Error" + ex);
            }
        catch(SQLException ex){
            System.out.println("Error" + ex);
            }
    }
    private void Import_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Import_ButtonActionPerformed

        String path = Path_TextField.getText();
        Import_DB(path);
        RefreshTable();
    }//GEN-LAST:event_Import_ButtonActionPerformed

    private void Path_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Path_TextFieldActionPerformed
    
    //Search on table Button
    private void button1_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1_SearchActionPerformed
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:ifp.db");
            Statement stm = conexion.createStatement();
            String query = "";
            
            if (getID_FIeld().equals("")){             //SI NO INTRODUCE NADA MUESTRA TODAS LAS FILAS
                query = "select * from accounts";
                }
            else{
                query = "select * from accounts where id like '%" + getID_FIeld()+"%'"; //MUESTRAS FILAS FILTRANDO POR MUESTRA DE DNI
                }
            
            ResultSet rs = stm.executeQuery(query);
            
            DefaultTableModel table = (DefaultTableModel)Accounts_Table.getModel();
            table.setRowCount(0);
            
            while(rs.next()){

                String id = rs.getString("id");
                String name = rs.getString("name");
                java.sql.Date SQL_Date = rs.getDate("creation_date");
                LocalDate LD_Date = SQL_Date.toLocalDate();
                float Balance = rs.getFloat("balance");
                
                table.addRow(new Object[]{id,name,LD_Date,Balance});
                }
            
            stm.close();
            conexion.close();
            }
         
        catch(ClassNotFoundException ex){
            
            System.out.println("error" + ex);
            }
         
        catch(SQLException ex){
            
            System.out.println("error" + ex);
            }
    }//GEN-LAST:event_button1_SearchActionPerformed

    private void button2_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2_SearchActionPerformed
        
        try{
            Class.forName("org.sqlite.JDBC");
            java.sql.Connection Connection = DriverManager.getConnection("jdbc:sqlite:ifp.db");
            java.sql.Statement stm = Connection.createStatement();
            String query = "";
            
            if (getName_Field().equals("")){            //SI NO INTRODUCE NADA MUESTRA TODAS LAS FILAS
                query = "select * from Accounts";
                }
            else{                                       //FILTRA NOMBRES POR MUESTRA
                query = "select * from accounts where Name like '%" + getName_Field()+ "%'";
                }
            ResultSet rs = stm.executeQuery (query);
            
            DefaultTableModel tabla = (DefaultTableModel)Accounts_Table.getModel();
            tabla.setRowCount(0);
            
            while(rs.next()){

                String ID = rs.getString("ID");
                String Name = rs.getString("Name");
                java.sql.Date SQL_Date = rs.getDate("Creation_date");
                LocalDate LD_Date = SQL_Date.toLocalDate();
                float Balance = rs.getFloat("Balance");
                
                tabla.addRow(new Object[]{ID,Name,LD_Date,Balance});
                }
            
            stm.close();
            Connection.close();
            }
        catch(ClassNotFoundException ex){
            System.out.println("error" + ex);
            }
        catch(SQLException ex){
            System.out.println("error" + ex);
            }
    }//GEN-LAST:event_button2_SearchActionPerformed

    //Menu Buttons
    private void AddUser_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUser_MenuActionPerformed
        CreateAccount_JPanel Panel_CA = new CreateAccount_JPanel();

        int result = JOptionPane.showConfirmDialog(null, Panel_CA,"Create New Account",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        String ID = Panel_CA.getID();
        String Name = Panel_CA.getName();
        
        if(result == JOptionPane.OK_OPTION){
            
            if(Bank.CreateAccount(ID,Name)!= null){    //COMPRUEBO QUE PUEDO CREAR LA CUENTA Y LA CREO. LA FUNCION CrearCuenta() COMPRUEBA DUPLICADOS CON SearchAccount()
                JOptionPane.showInternalMessageDialog(null, "Account correctly created.",
                    "Confirmation.", JOptionPane.INFORMATION_MESSAGE);
                RefreshTable();
                }
            else{
                JOptionPane.showMessageDialog(null, "Check ID.", "Error.", JOptionPane.ERROR_MESSAGE);
                }
            }                                         

    }//GEN-LAST:event_AddUser_MenuActionPerformed

    private void ChangeName_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeName_MenuActionPerformed
        NameChanging_JPanel ChangeName_Panel = new NameChanging_JPanel();
        
        int result = JOptionPane.showConfirmDialog(null, ChangeName_Panel, "Change user name.",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        String ID = ChangeName_Panel.getID();
        String NewName = ChangeName_Panel.getNewName();
        
        if(result == JOptionPane.OK_OPTION){
            
            if(Bank.ChangeName(ID, NewName)){   //CambiarNombre() EVALUA A FALSE SI EL DNI NO EXISTE
                JOptionPane.showInternalMessageDialog(null, "Name correctly changed.",
                    "Confirmation.", JOptionPane.INFORMATION_MESSAGE);
                RefreshTable();
                }
            else{
                JOptionPane.showMessageDialog(null, "Check ID.", "Error.", JOptionPane.ERROR_MESSAGE);
                }
            }    
    }//GEN-LAST:event_ChangeName_MenuActionPerformed

    private void Deposit_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deposit_MenuActionPerformed
        BalanceMovements_JPanel Deposit_Panel = new BalanceMovements_JPanel();
        
        int result = JOptionPane.showConfirmDialog(null, Deposit_Panel ,"Deposit",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        String ID = Deposit_Panel.getID();
        Float Amount = Deposit_Panel.getAmount();
        
        if (result == JOptionPane.OK_OPTION){
            
            if(Bank.Deposit(ID,Amount)){     //Ingresar() EVALUA A FALSE SI EL DNI NO EXISTE
                JOptionPane.showInternalMessageDialog(null, "Income correctly generated.",
                    "Confirmation.", JOptionPane.INFORMATION_MESSAGE);
                RefreshTable();
                }
            else{
                JOptionPane.showMessageDialog(null, "Check ID.", "Error.", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_Deposit_MenuActionPerformed

    private void Withdraw_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Withdraw_MenuActionPerformed
        BalanceMovements_JPanel Withdraw_Panel = new BalanceMovements_JPanel();
        
        int result = JOptionPane.showConfirmDialog(null, Withdraw_Panel ,"Withdraw",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        String ID = Withdraw_Panel.getID();
        Float Amount = Withdraw_Panel.getAmount();
        
        if (result == JOptionPane.OK_OPTION){
            
            if(Bank.Withdraw(ID, Amount)){       //Extraer() EVALUA A FALSE SI EL DNI NO EXISTE O SI LA CUENTA ORIGEN NO TIENE SUFICIENTE SALDO
                JOptionPane.showInternalMessageDialog(null, "withdrawal correctly performed.",
                "Confirmation.", JOptionPane.INFORMATION_MESSAGE);
                RefreshTable();
                }
            else{
                JOptionPane.showMessageDialog(null, "Check funds or ID.", "Error.", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_Withdraw_MenuActionPerformed

    private void Transfer_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Transfer_MenuActionPerformed
        BalanceTransfer_JPanel Transfer_Panel = new BalanceTransfer_JPanel();
        int result = JOptionPane.showConfirmDialog(null, Transfer_Panel ,"Transferencia",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        String Origin_ID = Transfer_Panel.getOriginID();
        String Destination_ID = Transfer_Panel.getTargetID();
        float amount = Transfer_Panel.getAmount();
        
        if (result == JOptionPane.OK_OPTION){

            if(Bank.Transfer(Origin_ID, Destination_ID, amount)){ //Transferencia() UTILIZA Extraer() + Ingresar() Y EVALUA A FALSE CON Extraer()
                JOptionPane.showInternalMessageDialog(null, "Successful transfer.",
                "Confirmation.", JOptionPane.INFORMATION_MESSAGE);
                }
            else{
                JOptionPane.showMessageDialog(null, "Check funds or ID.", "Error.", JOptionPane.ERROR_MESSAGE);
                }
            }
        RefreshTable();
    }//GEN-LAST:event_Transfer_MenuActionPerformed

    private void DelUser_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelUser_MenuActionPerformed
        DeleteAccount_JPanel DeleteAccount_Panel = new DeleteAccount_JPanel();
        int result = JOptionPane.showConfirmDialog(null, DeleteAccount_Panel ,"Delete account",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        String ID = DeleteAccount_Panel.getID();
        
        if (result == JOptionPane.OK_OPTION){
            
            if(Bank.DeleteAccount(ID)){    //EliminarCuenta() EVALUA A FALSE SI NO ENCUENTRA EL DNI
                JOptionPane.showInternalMessageDialog(null, "Account successfully deleted.",
                        "Confirmation.", JOptionPane.INFORMATION_MESSAGE);
                RefreshTable();
                }
            else{
                JOptionPane.showMessageDialog(null, "Check ID.", "Error.", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_DelUser_MenuActionPerformed

    
    private String getID_FIeld(){
        
       return ID_TextField.getText();
    }
    
    private String getName_Field(){
        return Name_TextField.getText();
    }
    
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Accounts_Table;
    private javax.swing.JMenuItem AddUser_Menu;
    private javax.swing.JMenuItem ChangeName_Menu;
    private javax.swing.JMenuItem DelUser_Menu;
    private javax.swing.JMenuItem Deposit_Menu;
    private javax.swing.JTextField ID_TextField;
    private javax.swing.JButton Import_Button;
    private javax.swing.JTextField Name_TextField;
    private javax.swing.JTextField Path_TextField;
    private javax.swing.JMenuItem Transfer_Menu;
    private javax.swing.JMenuItem Withdraw_Menu;
    private javax.swing.JButton button1_Search;
    private javax.swing.JButton button2_Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
