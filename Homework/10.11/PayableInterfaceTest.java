
public class PayableInterfaceTest 
{
	public static void main(String[] args) 
	{
		Payable payableObjects[] = new Payable[4];
		payableObjects[0] = new Invoice("01234", "seat", 2,400.00);
		payableObjects[1] = new Invoice("5678", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("Gregory", "Miles", "486-74-6442", 1000.00);
		payableObjects[3] = new SalariedEmployee("Denise", "Miles", "222-22-2222", 1100.00);
		
		System.out.println("Invoices and Employees processed polymorphically:\n");
		
		for(Payable currentPayable : payableObjects)
		{
			System.out.printf("%s \n", currentPayable.toString());
			{
			}
			System.out.printf("%s: $%,.2f\n\n",
					"payment due", currentPayable.getPaymentAmount());			}
		}
}

