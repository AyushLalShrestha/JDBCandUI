
package com.leapfrog.jdbcandui.ui;

import java.awt.FlowLayout;
import javax.swing.JFrame;


public class AddStudentUI extends JFrame {
    
    public AddStudentUI() {
        this.setTitle("Add a Student");
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
