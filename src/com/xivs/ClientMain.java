package com.xivs;

import com.xivs.client.Application;
import com.xivs.client.data.*;
import com.xivs.client.gui.components.FilteringForm;
import com.xivs.client.gui.components.SortingForm;
import com.xivs.client.gui.components.WorkersTable;
import com.xivs.client.gui.visualization.VisualPanel;
import com.xivs.client.gui.windows.CreateUpdateObjectWindow;
import com.xivs.client.gui.windows.LoginWindow;
import com.xivs.client.gui.windows.MainWindow;
import com.xivs.client.gui.windows.RemoveAllByPositionWindow;
import com.xivs.client.interpreter.Interpreter;
import com.xivs.common.Utils.WorkerContainer;
import com.xivs.common.io.CommandLineInputManager;
import com.xivs.common.io.CommandLineOutManager;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;

import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

public class ClientMain {

    public static void main(String[] args) throws Exception {
        // write your code here
        int port;
        if (args.length == 0) {
            port = 13337;
        } else {
            port = Integer.parseInt(args[0]);
        }


        //Application.APP.client.connect(new byte[]{127,0,0,1}, 13337);
        //(new Interpreter(new CommandLineInputManager(), new CommandLineOutManager(), Application.APP.client)).run();
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        //
        //
        Locale l = Locale.getDefault();
        Application.APP.setLocale(l);
        new LoginWindow(new Dimension(500, 300), l);//Locale.getDefault());
        //JFrame temp = new JFrame();
        //temp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //temp.setVisible(true);
        //temp.setPreferredSize(new Dimension(1200, 700));
        //temp.add(new VisualPanel(null, new Dimension(1200, 700)));
        //temp.pack();






    }
}
