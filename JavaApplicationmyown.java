package component;

import javax.swing.JOptionPane;

public class Balanceapp
{
	public static void main (String args[])
	{
	 	String accountnum,sbegin, sdeposit, swithdrawals, results ="";
		double begin, deposit, withdrawals;
		double endingbalance;
			
		accountnum =JOptionPane.showInputDialog("Enter account number ");
		
                            sbegin = JOptionPane.showInputDialog("Enter beginning balance ");
	             begin = Double.parseDouble(sbegin);

                           sdeposit = JOptionPane.showInputDialog("Enter deposit ");
	            deposit = Double.parseDouble(sdeposit);

                          swithdrawals = JOptionPane.showInputDialog("Enter withdrawals ");
	           withdrawals = Double.parseDouble(swithdrawals);

	           endingbalance = begin + deposit - withdrawals;

	          results= "The ending balance is " + endingbalance;

	          JOptionPane.showMessageDialog(null, results, "Banking Program", JOptionPane.INFORMATION_MESSAGE);

         }
}
