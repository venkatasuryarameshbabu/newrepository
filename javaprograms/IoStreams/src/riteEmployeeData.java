import java.io.*;
public class riteEmployeeData {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("D://emp.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream out=new DataOutputStream(bos);
		out.writeInt(1);
		out.writeUTF("Surya");
	    out.writeDouble(5000.00);
	    out.writeInt(2);
		out.writeUTF("Ramesh");
	    out.writeDouble(3500.00);
	    out.writeInt(3);
		out.writeUTF("VENKATA");
	    out.writeDouble(5500.00	); 
	    out.writeInt(4);
		out.writeUTF("BABU");
	    out.writeDouble(4500.00); 
	    out.writeInt(5);;
		out.writeUTF("KAJA");
	    out.writeDouble(50000.00);
	System.out.println("values are inserted sucessfully");
	fos.close();
	}
}
