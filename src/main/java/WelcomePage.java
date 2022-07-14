import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();
    JButton logoutButton = new JButton("Logout");
    WelcomePage(String userID){

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Hello "+ userID);

        logoutButton.setBounds(50,100,100,35);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(this);

        frame.add(welcomeLabel);
        frame.add(logoutButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==logoutButton) {
            frame.dispose();
            IDandPasswords idandPasswords = new IDandPasswords();
            new LoginPage(idandPasswords.getLoginInfo());
        }
    }
}
