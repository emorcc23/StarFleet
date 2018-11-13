/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.methods;

import branches.fev2.dao.Singleton;
import static com.oracle.nio.BufferSecrets.instance;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Álvaro Santos
 */
public class Methods {

      private static Methods instance = null;

      public static Methods getInstance() throws SQLException {
            if (instance == null) {
                  instance = new Methods();
            }

            return instance;
      }

      public void designTables(JTable table, JScrollPane pane) {
            table.setBackground(new Color(0, 0, 0, 0));
            ((DefaultTableCellRenderer) table.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0, 0));
            table.setGridColor(Color.WHITE);
            table.setForeground(Color.WHITE);
            pane.setBackground(new Color(0, 0, 0, 0));
            pane.setOpaque(false);
            table.setOpaque(false);
            ((DefaultTableCellRenderer) table.getDefaultRenderer(Object.class)).setOpaque(false);
            pane.getViewport().setOpaque(false);

            JTableHeader Theader = table.getTableHeader();
            Theader.setBackground(Color.yellow);
            Theader.setForeground(Color.BLACK);
            Theader.setFont(new Font("Copperplate Gothic Bold", 0, 12));
      }

}
