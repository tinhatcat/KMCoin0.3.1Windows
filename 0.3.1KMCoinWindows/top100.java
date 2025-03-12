import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;


public class top100{

Path path = Paths.get("latestTxs4.log");
int d;
Path pPIw = Paths.get("ledger_KMC/player_info.log");
BigInteger TotalDeduction = new BigInteger("0");
BigInteger NewBalancePI = new BigInteger("0");


public top100() throws FileNotFoundException,IOException{

tHund();
}


public void tHund() throws FileNotFoundException,IOException{

String endOfName = "> ";
String hamp = "&";
String und  = "_";
String comm = ",";
String apos = "`";
String tild = "~";
String perc = "%";
String semi = ";";
String SAmount;
String SWallet;
String RWallet;
String SGas;
String SName;
String TxHash;
String TransHash;
String NewPublicKey;
File input44 = new File("Program_Files/latestTxs4.log");
File tempFile44 = new File("ledger_KMC/ledger_current.log");
BufferedReader reader44 = new BufferedReader(new FileReader(input44));
BufferedWriter writer44 = new BufferedWriter(new FileWriter(tempFile44, true));
String cL44;

while((cL44 = reader44.readLine()) != null)
{
int iend = cL44.indexOf(endOfName);
int ihamp = cL44.indexOf(hamp);
int iund  = cL44.indexOf(und);
int icomm = cL44.indexOf(comm);
int iapos = cL44.indexOf(apos);
int itild = cL44.indexOf(tild);
int iperc = cL44.indexOf(perc);
int isemi = cL44.indexOf(semi);
SName = cL44.substring(41,iend);
SWallet = cL44.substring(iend+2,ihamp);
SAmount = cL44.substring(ihamp+1,iund);
RWallet = cL44.substring(iund+1,icomm);
SGas = cL44.substring(icomm+1,iapos);
TxHash = cL44.substring(iapos+1,itild);
TransHash = cL44.substring(itild+1,iperc);
NewPublicKey = cL44.substring(iperc+1,isemi);
String string44 = "> ";
int iWriteTx = cL44.indexOf(string44);

if(TransHash.equals("null")&&d<=100)
{
d++;
String WriteTx = cL44.substring(iWriteTx+2,isemi+1);
writer44.write(WriteTx + " ");
File iFile100 = new File("ledger_KMC/player_info.log");
BufferedReader reader100 = new BufferedReader(new FileReader(iFile100));
String cL100;
String SWalletPI;
String BalancePI;
String SPNamePI;
String SWalletPIat;

while((cL100 = reader100.readLine()) != null)
{

if(cL100.equals(SName))
{
SWalletPIat = reader100.readLine();
SWalletPI = SWalletPIat.substring(1);
BalancePI = reader100.readLine();
BigInteger BalancePIb = new BigInteger(BalancePI);
BigInteger AmountSent = new BigInteger(SAmount);
BigInteger GasBurned = new BigInteger(SGas);
TotalDeduction = AmountSent.add(GasBurned);
NewBalancePI = BalancePIb.subtract(TotalDeduction);

try
{
String pPIw100 = Files.readString(pPIw);
Files.writeString(pPIw, pPIw100.replace(SName + "\n" + SWalletPIat + "\n" + BalancePI,SName + "\n" + SWalletPIat + "\n" + NewBalancePI),StandardCharsets.UTF_8);
pPIw100 = null;
}
catch (IOException ioe) {System.out.println("Exception thrown for IO: " + ioe);}
}
}
reader100.close();
File iFile101 = new File("ledger_KMC/player_info.log");
BufferedReader reader101 = new BufferedReader(new FileReader(iFile101));
String cL101;
String BalanceRx;
String RWalletAt = "@"+RWallet;

while((cL101 = reader101.readLine()) != null)
{

if(cL101.equals(RWalletAt))
{
BalanceRx = reader101.readLine();
BigInteger BalanceRxBi = new BigInteger(BalanceRx);
BigInteger AmountRxBi = new BigInteger(SAmount);
BigInteger NewBalanceRx = new BigInteger("0");
NewBalanceRx = BalanceRxBi.add(AmountRxBi);

try
{
String pPIw101 = Files.readString(pPIw);
Files.writeString(pPIw, pPIw101.replace("\n" + RWalletAt + "\n" + BalanceRx,"\n" + RWalletAt + "\n" + NewBalanceRx),StandardCharsets.UTF_8);
pPIw101 = null;
}
catch (IOException ioe2) {System.out.println("Exception thrown for IO: " + ioe2);}
}
}
reader101.close();
}


if(TransHash.equals("null")&&d>=100)
{

}

if(!TransHash.equals("null"))
{
String WriteTx = cL44.substring(iWriteTx+2,isemi+1);
writer44.write(WriteTx + " ");
File iFile100 = new File("ledger_KMC/player_info.log");
BufferedReader reader100 = new BufferedReader(new FileReader(iFile100));
String cL100;
String SWalletPI;
String BalancePI;
String SPNamePI;
String SWalletPIat;

while((cL100 = reader100.readLine()) != null)
{

if(cL100.equals(SName))
{
SWalletPIat = reader100.readLine();
SWalletPI = SWalletPIat.substring(1);
BalancePI = reader100.readLine();
BigInteger BalancePIb = new BigInteger(BalancePI);
BigInteger AmountSent = new BigInteger(SAmount);
BigInteger GasBurned = new BigInteger(SGas);
TotalDeduction = AmountSent.add(GasBurned);
NewBalancePI = BalancePIb.subtract(TotalDeduction);

try
{
String pPIw100 = Files.readString(pPIw);
Files.writeString(pPIw, pPIw100.replace(SName + "\n" + SWalletPIat + "\n" + BalancePI,SName + "\n" + SWalletPIat + "\n" + NewBalancePI),StandardCharsets.UTF_8);
pPIw100 = null;
}
catch (IOException ioe) {System.out.println("Exception thrown for IO: " + ioe);}
}
}
reader100.close();
SWalletPIat = null;
SWalletPI = null;
BalancePI = null;
SWalletPIat = null;
cL100=null;
File iFile101 = new File("ledger_KMC/player_info.log");
BufferedReader reader101 = new BufferedReader(new FileReader(iFile101));
String cL101;
String BalanceRx;
String RWalletAt = "@"+RWallet;

while((cL101 = reader101.readLine()) != null)
{

if(cL101.equals(RWalletAt))
{
BalanceRx = reader101.readLine();
BigInteger BalanceRxBi = new BigInteger(BalanceRx);
BigInteger AmountRxBi = new BigInteger(SAmount);
BigInteger NewBalanceRx = new BigInteger("0");
NewBalanceRx = BalanceRxBi.add(AmountRxBi);

try
{
String pPIw101 = Files.readString(pPIw);
Files.writeString(pPIw, pPIw101.replace("\n" + RWalletAt + "\n" + BalanceRx,"\n" + RWalletAt + "\n" + NewBalanceRx),StandardCharsets.UTF_8);

pPIw101 = null;
}
catch (IOException ioe2) {System.out.println("Exception thrown for IO: " + ioe2);}
}
}
reader101.close();
RWalletAt = null;
BalanceRx = null;
cL101 = null;
}
}
cL44 = null;
tempFile44 = null;
input44 = null;
writer44.close(); 
reader44.close(); 
pPIw=null;
TransHash=null;
SAmount=null;
SWallet=null;
RWallet=null;
SGas=null;
SName=null;
TxHash=null;
TransHash=null;
NewPublicKey=null;
updateTxPanelFiles();
}


public void updateTxPanelFiles() throws IOException, FileNotFoundException{

Path upPI = Paths.get("localplayer.txt");
String PNameUp = Files.readString(upPI);
String PNameUpS = PNameUp.substring(1);
File iFile103 = new File("ledger_KMC/player_info.log");
BufferedReader reader103 = new BufferedReader(new FileReader(iFile103));
String cL103;
String WalletUp;
String BalanceUp;
String TxsUp;

while((cL103 = reader103.readLine()) != null)
{

if(cL103.equals(PNameUpS))
{

WalletUp = reader103.readLine();
BalanceUp = reader103.readLine();
TxsUp = reader103.readLine();
Path p1234n = Paths.get("wallet_address.log");
Path p1234h = Paths.get("player_balance.log");
Path p1234j = Paths.get("player_txs.log");

try
{
Files.writeString(p1234n,WalletUp,StandardCharsets.UTF_8);
Files.writeString(p1234h,BalanceUp,StandardCharsets.UTF_8);
Files.writeString(p1234j,TxsUp,StandardCharsets.UTF_8);
}
catch (IOException ex234) {System.out.print("Invalid Path");}
}
}
reader103.close();
cL103 = null;
WalletUp = null;
BalanceUp = null;
TxsUp = null;
PNameUpS = null;
PNameUp = null;
upPI = null;
iFile103 = null;
}
}
//certutil -hashfile top100.java SHA256
//30b428b0e6520f053e07457d7f3fd9a34b46e86898a6b9dc15481331a88eb08a