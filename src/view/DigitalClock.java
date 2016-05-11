package view;
/**
 * Clock view
 * @author Capa
 */
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.SwingConstants;
import java.util.*;
import java.text.*;

public class DigitalClock extends javax.swing.JPanel{

	public DigitalClock(){
		initComponents();
	}
	private void initComponents(){

	ClockLabel dateLable = new ClockLabel("date");
	ClockLabel timeLable = new ClockLabel("time");
	ClockLabel dayLable = new ClockLabel("day");

	this.setSize(100,50);
	this.setLayout(new GridLayout(1, 3));

	this.add(dateLable);
	this.add(timeLable);
	this.add(dayLable);

	this.setVisible(true);
	}
}

class ClockLabel extends JLabel implements ActionListener {

	String type;
	SimpleDateFormat sdf;

	public ClockLabel(String type) {
		this.type = type;
		setForeground(Color.black);

		switch (type) {
			case "date" :
				sdf = new SimpleDateFormat("  MMMM dd yyyy");
				setFont(new Font("sans-serif", Font.PLAIN, 12));
				setHorizontalAlignment(SwingConstants.LEFT);
				break;
			case "time" :
				sdf = new SimpleDateFormat("hh:mm:ss a");
				setFont(new Font("sans-serif", Font.PLAIN, 12));
				setHorizontalAlignment(SwingConstants.CENTER);
	                    break;
			case "day"  :
				sdf = new SimpleDateFormat("EEEE  ");
				setFont(new Font("sans-serif", Font.PLAIN, 12));
				setHorizontalAlignment(SwingConstants.RIGHT);
				break;
			default     :
				sdf = new SimpleDateFormat();
				break;
		}

		Timer t = new Timer(1000, this);
		t.start();
	}

	public void actionPerformed(ActionEvent ae) {
		Date d = new Date();
		setText(sdf.format(d));
	}
}
