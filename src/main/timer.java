package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class timer {

	
	private Timer leftHold = null;
	private class LeftTimerListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
	        //increment your rotation value
	        //repaint your JPanel
	       if ( !val[0] ){
	            leftHold.stop();
	       }
	    }
	}
//
//	//in the key listener
//	case VK_LEFT:
//	     val[0] = true;
//	     leftHold = new Timer(60, new LeftTimerListener());//fires every 60ms
//	     leftHold.start();
}
