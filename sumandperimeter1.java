package component;

import javax.swing.JOptionPane;

public class sumandperimeter1
{
	public static void main (String args[])
	{                  String sgallons, shours, result= "";
                       double gallons , hours , gallonsperhour;			
		
             sgallons=JOptionPane.showInputDialog ("Enter the number of gallons",JOptionPane.QUESTION_MESSAGE);        
             gallons=Double.parseDouble(sgallons);
             
             shours=JOptionPane.showInputDialog ("Enter the number of hours",JOptionPane.QUESTION_MESSAGE);        
             hours=Double.parseDouble(shours);
             
             gallonsperhour= (gallons)/(hours);
             
             result= "The gallons per hour is" + "\n" + gallonsperhour;

JOptionPane.showMessageDialog(null, result, "GallonsPerHours program", JOptionPane.INFORMATION_MESSAGE);

         }
}
