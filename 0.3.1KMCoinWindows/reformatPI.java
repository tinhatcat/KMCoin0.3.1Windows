import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;


public class reformatPI{

Path path = Paths.get("localplayer.txt");


public reformatPI() throws FileNotFoundException,IOException{

try
{
rPI();
}
catch (Exception e11){}
}


public void eND(){}


public void rPI() throws FileNotFoundException,IOException{

File iF133 = new File("ledger_KMC/player_info.log");
File tF133 = new File("ledger_KMC/player_info_unformatted.log");
BufferedReader r133 = new BufferedReader(new FileReader(iF133));
BufferedWriter w133 = new BufferedWriter(new FileWriter(tF133));
String c133;

while((c133 = r133.readLine()) != null)
{
String t133 = c133;
w133.write(c133.replace("\n", " "));
t133 = null;
}
c133 = null;
tF133 = null;
iF133 = null;
w133.close(); 
r133.close(); 
}
}
//certutil -hashfile reFormatPI.java SHA256
//273e8c4340932f655c2b66bd389ad668a2378549058fa71299186288c3cf3b7f