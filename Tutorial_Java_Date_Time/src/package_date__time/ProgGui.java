package package_date__time;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProgGui {
	
	static long start_time;
	static long end_time;
	static long time_difference;
	
	
	public ProgGui() {
		
		JFrame window = new JFrame();
		window.setLayout(null);
		window.setSize(600,500);
		
		JLabel lb_starttime = new JLabel("Start time: ");
		lb_starttime.setBounds(10, 10, 100, 25);
		JLabel lb_endtime = new JLabel("End time: ");
		lb_endtime.setBounds(10, 50, 100, 25);

		JTextField tf_starttime = new JTextField();
		tf_starttime.setBounds(130, 10, 200, 25);
		tf_starttime.setEditable(false);
		JTextField tf_endtime = new JTextField();
		tf_endtime.setBounds(130, 50, 200, 25);
		tf_endtime.setEditable(false);

		JButton btn_setstarttime = new JButton("Set Start Time");
		btn_setstarttime.setBounds(350, 10, 150, 25);
		JButton btn_setendtime = new JButton("Set End Time");
		btn_setendtime.setBounds(350, 50, 150, 25);
		JButton btn_calctimediff = new JButton("Calc Time Diff");
		btn_calctimediff.setBounds(350, 90, 150, 25);
		
		btn_setstarttime.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/*LocalDate obj_date = LocalDate.now();
				System.out.println(obj_date);
				
				LocalTime obj_time = LocalTime.now();
				System.out.println(obj_time);
				
				LocalDateTime obj_datetime = LocalDateTime.now();
				System.out.println(obj_datetime);
				
				
				DateTimeFormatter format_datetime = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss:ns");
				System.out.println(obj_datetime.format(format_datetime));
				*/
				start_time = System.currentTimeMillis();
			
				System.out.println(start_time);
				tf_starttime.setText(String.valueOf(start_time));
				
			}
		});
		
		btn_setendtime.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				end_time = System.currentTimeMillis();
				tf_endtime.setText(String.valueOf(end_time));
				
			}
		});
		
		btn_calctimediff.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				time_difference = end_time - start_time;
				System.out.println(time_difference);
				System.out.println(new SimpleDateFormat("HH:mm:ss").format(time_difference));
				
			}
		});
		
		window.add(lb_starttime);
		window.add(lb_endtime);
		window.add(tf_starttime);
		window.add(tf_endtime);
		window.add(btn_setstarttime);
		window.add(btn_setendtime);
		window.add(btn_calctimediff);
		


		
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
}