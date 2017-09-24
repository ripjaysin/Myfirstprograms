import javax.swing.JOptionPane;

public class quadraticapp
{
	public static void main (String args[])
	{                   String    sa, sb, sc, message1="";
       String message2="", root1="", root2="", result="";
       double  a,  b, c, x1=0,x2=0, disc;
      
      sa = JOptionPane.showInputDialog("Enter the coefficient a ");
      a = Double.parseDouble(sa);
            
      sb = JOptionPane.showInputDialog("Enter the coefficient b ");
      b = Double.parseDouble(sb);
     
      sc = JOptionPane.showInputDialog("Enter the coefficient c ");
      c = Double.parseDouble(sc);
     
      disc=Math.sqrt((b*b)-4*a*c);
      
      message1= message1 + "The roots are imaginary";
      message2= message2 + "The roots exist and they are given below";
      
      
      if(disc<0)
      { JOptionPane.showMessageDialog(null ,message1);
      
      }
      
      else
      {  JOptionPane.showMessageDialog(null, message2);
      x1= ((-b)+ disc)/(2*a);
      x2= ((-b)- disc)/(2*a);
      }
      
      root1= root1+ "The first root of the equation is" + x1;
      root2= root2+ "The second root of the equation is" + x2;
      result= root1+root2;

JOptionPane.showMessageDialog(null, result, "quadratic program", JOptionPane.INFORMATION_MESSAGE);
      }
}
      
         

