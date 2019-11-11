import java.io.*;
import java.lang.*;
class employees {
public static void main (String args[]) throws IOException {
int i = 1;
//double pay = 0; 
//double tpay = 0;
String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("employees.txt");
BufferedReader bin = new BufferedReader (fin);
FileOutputStream fout = new FileOutputStream("employees.htm");
BufferedOutputStream bout = new BufferedOutputStream(fout);
PrintStream pout = new PrintStream(bout);
pout.println("<body bgcolor=A7EEFF><table border=1 width=1080 align=center>");
pout.println("<tr bgcolor=gray align=center><td>NO</td><td>employeeid</td><td>firstname</td><td>lastname</td><td>title</td><td>birthdate</td></tr>");
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);
if(i%2 == 0)
pout.println("<tr bgcolor=FF7DB4>");
else
pout.println("<tr bgcolor=FF5675>");
pout.println("<td align=center>"+i+"</td>");
pout.println("<td align=right>"+fields[0]+"</td>");
pout.println("<td align=center>"+fields[1]+"</td>");
pout.println("<td align=center>"+fields[2]+"</td>");
pout.println("<td align=center>"+fields[3]+"</td>");
pout.println("<td align=right>"+fields[4]+"</td>");
/*pay = Integer.parseInt(fields[5]) * Integer.parseInt(fields[4]);
pout.println("<td align=right>"+ pay+"</td>");
pout.println("</tr>");
tpay = tpay + pay;*/
i = i + 1;
}

//pout.println("<tr bgcolor=#dddddd><td colspan=5>Total pay</td><td align=right>"+tpay+"</td></tr>");
pout.println("</table></body>");
fin.close();
pout.close();
}
}
