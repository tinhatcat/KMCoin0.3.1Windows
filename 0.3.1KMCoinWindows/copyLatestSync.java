import java.io.IOException;
import java.io.*;


public class copyLatestSync{


public copyLatestSync() throws IOException{

try
{
cLS();
new PrintWriter("Program_Files/syncCopy2.log").close();
}
catch (IOException e79){e79.printStackTrace();}
}


public void cLS() throws IOException{

new PrintWriter("latestcopyA.log").close();
Reader readerS = new InputStreamReader(new FileInputStream("Program_Files/syncCopy2.log"),"UTF-8");
BufferedReader finS = new BufferedReader (readerS);
Writer writerS = new OutputStreamWriter(new FileOutputStream("latestcopyA.log"),"UTF-8");
BufferedWriter foutS = new BufferedWriter(writerS);

try
{
String sS;

while((sS=finS.readLine())!=null)
{
foutS.write(sS.replaceAll("\\ufffd",""));foutS.newLine();
}
finS.close();
foutS.close();
}
catch (IOException eS) {};
}
}//certutil -hashfile copyLatestSync.java SHA256
//6dce7633bf7e1c7b5f51730720143122dd249314fcfab3b25e22a2e9f52c7f0c