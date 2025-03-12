import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.lang.String;


public class verifyTx{

File file11a = new File("ledger_KMC/player_info.log");
Path LocalPlayer1a = Paths.get("localplayer.txt");


public void verifyTx()throws IOException, UnsupportedEncodingException, FileNotFoundException{

String f1String = Files.readString(LocalPlayer1a);
String f1String2= f1String.substring(1);
String cL2;
String aWallet;
String aBalance;
String aTxs;
String aBlocksMined;
String aPublicKey;
String aSendAmount;
BufferedReader buff2 = new BufferedReader(new FileReader(file11a));

while((cL2 = buff2.readLine()) != null) 
{

if(cL2.equals(f1String2))
{
aWallet = buff2.readLine();
aBalance = buff2.readLine();
aTxs = buff2.readLine();
aBlocksMined = buff2.readLine();
aPublicKey = buff2.readLine();
buff2.close();
break;
}

else
{
break;
}
}
file11a=null;
LocalPlayer1a=null;
f1String=null;
f1String2=null;
cL2=null;
aWallet=null;
aBalance=null;
aTxs=null;
aBlocksMined=null;
aPublicKey=null;
aSendAmount=null;
}
}
//certutil -hashfile verifyTx.java SHA256
//181e34b8098b633277b94ed2f12f5c60a38356395113be457737353f11591020