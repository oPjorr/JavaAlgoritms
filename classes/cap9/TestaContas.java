package classes.cap9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestaContas {
    private JButton NovaConta;
    private JButton salvarDadosButton;
    private JPanel panelMain;
    private JButton contasButton;
    private JButton segurosDeVidaButton;
    private JButton relatórioButton;
    private JTextField noContentInTableTextField;

    public TestaContas() {
      NovaConta.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(null, "Hello World");
          }
      });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Testa Contas");
        frame.setContentPane(new TestaContas().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
