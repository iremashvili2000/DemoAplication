import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;






import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.w3c.dom.Document;

public class DemoAplication {
	
	DemoAplication(LinkedList<String> ans){
		JFrame frame=new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("OUR GUI");
		frame.setSize(500, 500);
		
		JPanel p = new JPanel();
		p.setBackground(Color.YELLOW);
		
		JLabel lab=null;
	//	Document doc; // tu html tebisgan mocileba gvinda 
		
		for(String text:ans) {
			
		//	doc=Jsoup.parse(text); //tu html tegebisgan gasuftaveba mogvindeba
		// lab=new JLabel(doc.totitle());
		
		
		//	frame.setTitle(text);
			 lab=new JLabel(text);
			 p.add(lab);
			 frame.add(p);
		}
		
		
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url=null;
		try {
			url = new URL("http://www.nbg.ge/rss.php");
		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		BufferedReader in=null;
		try {
			in = new BufferedReader(new InputStreamReader(url.openStream(),StandardCharsets.UTF_8.toString()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LinkedList<String> lines = new LinkedList();
		String readLine;

		try {
			while ((readLine = in.readLine()) != null) {
			    lines.add(readLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
/*
		for (String line : lines) {
		    System.out.println(line);
		}
		
		*/
		new DemoAplication(lines);
		

	}
	

}
