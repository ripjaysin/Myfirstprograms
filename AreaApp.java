package component;

import javax.swing.JOptionPane;

public class AreaApp
{
	public static void main (String args[])
	{                  String sno, result= "";
                              String result1= "";
                              String result2= "";
                              String result3= "";
                           double no, area1,area2,area3;			
		
                     sno = JOptionPane.showInputDialog("Enter a number");
                     no = Double.parseDouble(sno);

                   area1=Math.pow(no,2);
                   area2=Math.PI*Math.pow(no,2);
                   area3=(Math.sqrt(3)/4)*Math.pow(no,2);

result1= "The Area of the square is"+"\t" +area1;
result2= "The Area of the circle is"+"\t" +area2;
result3= "The Area of the equilateral triangle is"+"\t" +area3;
result=result1+"\n"+result2+"\n"+result3+"\n";

JOptionPane.showMessageDialog(null, result, "Area program", JOptionPane.INFORMATION_MESSAGE);

         }
}
