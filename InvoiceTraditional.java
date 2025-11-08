import javax.swing.JOptionPane;
import java.util.Formatter;
import java.util.Date;

class  InvoiceTraditional
{
	public static void main(String[] args) 
	{
		String choice = "";
		String numberst,totalst,typest,oput;
		Date invoiceDate;
		int type =0;
		double total = 0;
		double dpt = 0;
		while (!choice.equalsIgnoreCase("x")) {
			numberst = JOptionPane.showInputDialog("Enter Invoice Number");
			totalst = JOptionPane.showInputDialog("Enter Invoice Total");
			total = Double.parseDouble(totalst);
			typest = JOptionPane.showInputDialog("Enter Invoice Type( 1 = Regular 2 = Discounted ) : ");
			type = Integer.parseInt(typest);
			invoiceDate = new Date();
			if(type == 2)
			{
				dpt = 0.1;
				total = total*(1-dpt);
			}
			else
			{
				dpt = 0;
			}
			oput = String.format
				("Invoice Number : %s\nInvoice Date : %tD\nInvoice Type : %d\n" + "Invoice Discount : %.2f\nInvoice Total : %.2f\n\n" + "Press Enter to Continue or 'x' to Exit" , numberst,invoiceDate,type,dpt*100,total);
			choice = JOptionPane.showInputDialog(null,oput, "Invoice Application", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
