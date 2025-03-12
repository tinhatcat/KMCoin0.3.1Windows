import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardCopyOption;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class processTxs{

String SPName;
BigInteger Zeroo = new BigInteger("0");
Path pPI = Paths.get("ledger_KMC/player_info.log");


public processTxs() throws FileNotFoundException,IOException{

copyManyTx();
new PrintWriter("Program_Files/latestTxs.log").close();
copyOneTx();

try
{
removeFakeTx();
}
catch(Exception z){}

try
{
File file79bc = new File("Program_Files/latestTxs3.log");

if (file79bc.exists() && file79bc.length() !=0)
{
orderTxByGas();
}
file79bc = null;
}
catch (Exception e1790bc){}

try
{
File file79bd = new File("Program_Files/latestTxs5.log");

if (file79bd.exists() && file79bd.length() !=0)
{
cL5();
}
file79bd = null;
}
catch (Exception e1790bd){}
removeFirstTx();

try
{
File file79bcb = new File("Program_Files/latestTxsB.log");

while(file79bcb.length()!=0)
{

if (file79bcb.exists() && file79bcb.length() !=0)
{
System.out.println("more txs found");

new PrintWriter("Program_Files/latestTxs.log").close();
new PrintWriter("Program_Files/latestTxs2.log").close();
new PrintWriter("Program_Files/latestTxs3.log").close();
copyManyTxB();
new PrintWriter("Program_Files/latestTxsB.log").close();
new PrintWriter("Program_Files/latestTxs.log").close();
copyOneTxAgain();

try
{
removeFakeTx();
}
catch(Exception z1){}

try
{
File file79bc1 = new File("Program_Files/latestTxs3.log");

if (file79bc1.exists() && file79bc1.length() !=0)
{
orderTxByGas();
}
file79bc1 = null;
}
catch (Exception e1790bc1){}

try
{
File file79bd1 = new File("Program_Files/latestTxs5.log");

if (file79bd1.exists() && file79bd1.length() !=0)
{
cL5();
}
file79bd1 = null;
}
catch (Exception e1790bd1){}
removeFirstTx();

}

else
{
//System.out.println("end of txs");
}
}
file79bcb = null;
}
catch (Exception e1790bda){}
}


public void copyManyTxB() throws FileNotFoundException,IOException{

Path sourceb = Paths.get("Program_Files/latestTxsB.log");
Path destinationb = Paths.get("Program_Files/latestTxsA.log");
try 
{
Files.copy(sourceb, destinationb, StandardCopyOption.REPLACE_EXISTING);
}
catch (IOException bceb) {bceb.printStackTrace();}
sourceb=null;
destinationb=null;
}


public void copyManyTx() throws FileNotFoundException,IOException{

Path source = Paths.get("Program_Files/latestTxs.log");
Path destination = Paths.get("Program_Files/latestTxsA.log");
try 
{
Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
}
catch (IOException bce) {bce.printStackTrace();}
source=null;
destination=null;
}


public void removeFirstTx() throws FileNotFoundException,IOException{

File myFile = new File("Program_Files/latestTxsA.log");
Scanner fileScanner = new Scanner(myFile);
fileScanner.nextLine();
FileWriter fileStream = new FileWriter("Program_Files/latestTxsB.log");
BufferedWriter out = new BufferedWriter(fileStream);

while(fileScanner.hasNextLine())
{
String next = fileScanner.nextLine();

if(next.equals("\n")) 
{
out.newLine();
}

else 
{
out.write(next);
out.newLine();   
}
}
out.close();
fileScanner.close();
}


public void copyOneTxAgain() throws FileNotFoundException,IOException{

File inputFile6a = new File("Program_Files/latestTxsA.log");
File tempFile6a = new File("Program_Files/latestTxs.log");

try
{
BufferedReader reader6a = new BufferedReader(new FileReader(inputFile6a));
BufferedWriter writer6a = new BufferedWriter(new FileWriter(tempFile6a, true));
String currentLine6a;
currentLine6a = reader6a.readLine();
writer6a.write(currentLine6a + System.getProperty("line.separator"));
reader6a.close();
writer6a.close();
}
catch (IOException e1bce){}
}


public void copyOneTx() throws FileNotFoundException,IOException{

File inputFile6933a = new File("Program_Files/latestTxsA.log");
File tempFile6933a = new File("Program_Files/latestTxs.log");

try
{
BufferedReader reader6933a = new BufferedReader(new FileReader(inputFile6933a));
BufferedWriter writer6933a = new BufferedWriter(new FileWriter(tempFile6933a, true));
String currentLine6933a;
currentLine6933a = reader6933a.readLine();
writer6933a.write(currentLine6933a + System.getProperty("line.separator"));
reader6933a.close();
writer6933a.close();
}
catch (IOException e1790bce){}
}


public void removeFakeTx() throws FileNotFoundException,IOException{

File inputFile6933 = new File("Program_Files/latestTxs.log");
File tempFile6933 = new File("Program_Files/latestTxs2.log");
BufferedReader reader6933 = new BufferedReader(new FileReader(inputFile6933));
BufferedWriter writer6933 = new BufferedWriter(new FileWriter(tempFile6933, true));
String currentLine6933;


while((currentLine6933 = reader6933.readLine()) != null) 
{
String trimmedLine6933 = currentLine6933.trim();
int count = trimmedLine6933.length() - trimmedLine6933.replace(">", "").length();

if(count > 1) 
{

}

else
{
writer6933.write(currentLine6933 + System.getProperty("line.separator"));
String endOfName2 = ">";
int iSPName = currentLine6933.indexOf(endOfName2);
SPName = currentLine6933.substring(41,iSPName);
currentLine6933 = null;trimmedLine6933 = null;
}
}
writer6933.close(); 
reader6933.close(); 
inputFile6933 = null;
tempFile6933 = null;
ensureInts();
}


public void ensureInts() throws FileNotFoundException,IOException{

File inputFile6933d = new File("Program_Files/latestTxs2.log");
File tempFile6933d = new File("Program_Files/latestTxs3.log");
BufferedReader reader6933d = new BufferedReader(new FileReader(inputFile6933d));
BufferedWriter writer6933d = new BufferedWriter(new FileWriter(tempFile6933d, true));
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
String TxHash;
String TransHash;
String NewPublicKey;
String currentLine6933d;

while((currentLine6933d = reader6933d.readLine()) != null)
{
int iend = currentLine6933d.indexOf(endOfName);
int ihamp = currentLine6933d.indexOf(hamp);
int iund  = currentLine6933d.indexOf(und);
int icomm = currentLine6933d.indexOf(comm);
int iapos = currentLine6933d.indexOf(apos);
int itild = currentLine6933d.indexOf(tild);
int iperc = currentLine6933d.indexOf(perc);
int isemi = currentLine6933d.indexOf(semi);
SWallet = currentLine6933d.substring(iend+2,ihamp);
SAmount = currentLine6933d.substring(ihamp+1,iund);
RWallet = currentLine6933d.substring(iund+1,icomm);
SGas = currentLine6933d.substring(icomm+1,iapos);
TxHash = currentLine6933d.substring(iapos+1,itild);
TransHash = currentLine6933d.substring(itild+1,iperc);
NewPublicKey = currentLine6933d.substring(iperc+1,isemi);
System.out.println("             Sending wallet = "+SWallet);
System.out.println("             Sending amount = "+SAmount);
System.out.println("             Receiving wallet = "+RWallet);
System.out.println("             Gas = "+SGas);
BigInteger SWalletC = new BigInteger(SWallet);
BigInteger SAmountC = new BigInteger(SAmount);
BigInteger RWalletC = new BigInteger(RWallet);
BigInteger SGasC = new BigInteger(SGas);

if(SWallet.startsWith("0"))
{
System.out.println("SWallet cant begin with zero");
continue;
}

if(SAmount.startsWith("0"))
{
System.out.println("SAmount cant begin with zero");
continue;
}

if(RWallet.startsWith("0"))
{
System.out.println("RWallet cant begin with zero");
continue;
}

if(SGas.startsWith("0"))
{
System.out.println("SGas cant begin with zero");
continue;
}

if(SWalletC.equals(Zeroo))
{
System.out.println("They dont have wallet number zero");
continue;
}

if(SAmountC.equals(Zeroo))
{
System.out.println("Dont let them spam the chain with nothing");
continue;
}

if(RWalletC.equals(Zeroo))
{
System.out.println("RWallet cannot begin with zero.");
}

if(SGasC.equals(Zeroo))
{
System.out.println("At least 1KMC gas per tx.");
}

Pattern patt = Pattern.compile("[0-9]*");
Matcher matchSW = patt.matcher(SWallet);
Matcher matchSA = patt.matcher(SAmount);
Matcher matchRW = patt.matcher(RWallet);
Matcher matchSG = patt.matcher(SGas);

if (matchSW.matches()&&matchSA.matches()&&matchRW.matches()&&matchSG.matches())
{
File iFile6 = new File("ledger_KMC/player_info.log");
BufferedReader reader6 = new BufferedReader(new FileReader(iFile6));
String cL6;
String SWalletPI;
String BalancePI;
String SPNamePI;
String SWalletPIat;

while((cL6 = reader6.readLine()) != null)
{

if(cL6.equals(SPName))
{
SPNamePI = SPName;
SWalletPIat = reader6.readLine();
SWalletPI = SWalletPIat.substring(1);

if(SWallet.equals(SWalletPI))
{
BalancePI = reader6.readLine();
BigInteger BalancePIb = new BigInteger(BalancePI);
BigInteger SAmountb = new BigInteger(SAmount);
BigInteger SGasb = new BigInteger(SGas);
BigInteger TotalTx = new BigInteger("0");
TotalTx = SAmountb.add(SGasb);

if(TotalTx.compareTo(BalancePIb)==-1)
{
String TxNum;
String MinedBs;
String PublicKey;
TxNum = reader6.readLine();
MinedBs = reader6.readLine();
PublicKey = reader6.readLine();
BigInteger Zero = new BigInteger("0");
BigInteger TxNumBi = new BigInteger(TxNum);
int TxNumP = Integer.parseInt(TxNum);

if(TxNumBi.equals(Zero))
{
System.out.println("Player's first transaction since TxNumBi = "+TxNumBi);
System.out.println("sha256^1(Tx Hash) = Tx Player's Public Key?");

try
{
String CalcHash;
CalcHash = toHexString(getSHA(TxHash));
System.out.println("CalcHash = "+CalcHash);
System.out.println("PublicKey = "+PublicKey);

if(PublicKey.equals(CalcHash))
{
writer6933d.write(currentLine6933d + System.getProperty("line.separator"));
int TxNumP1 = TxNumP + 1;

try
{
String sPI = Files.readString(pPI);
Files.writeString(pPI, sPI.replace(SPNamePI + "\n" + SWalletPIat + "\n" + BalancePIb + "\n" + TxNum,SPNamePI + "\n" + SWalletPIat + "\n" + BalancePIb + "\n" + TxNumP1),StandardCharsets.UTF_8);
sPI = null;
}
catch (IOException ioe) {System.out.println("Exception thrown for IO: " + ioe);}
CalcHash = null;
}
}
catch(NoSuchAlgorithmException nae){}
}

BigInteger TripNine = new BigInteger("999");
BigInteger Thousand = new BigInteger("1000");
BigInteger result = TxNumBi.mod(Thousand);

if(result.compareTo(Zero)!=0&&result.compareTo(TripNine)!=0)
{
int TxNumP2 = TxNumP + 1;
int TxIt = TxNumP2 % 1000;
String CalcHash2;
String CalcHash2a = TxHash;

for (int x = 1; x <= TxIt; x++)
{

try
{
CalcHash2 = toHexString(getSHA(CalcHash2a));
CalcHash2a = CalcHash2;
}
catch(NoSuchAlgorithmException nae2){}
}

if(PublicKey.equals(CalcHash2a))
{
writer6933d.write(currentLine6933d + System.getProperty("line.separator"));

try
{
String sPI2 = Files.readString(pPI);
Files.writeString(pPI, sPI2.replace(SPNamePI + "\n" + SWalletPIat + "\n" + BalancePIb + "\n" + TxNum,SPNamePI + "\n" + SWalletPIat + "\n" + BalancePIb + "\n" + TxNumP2),StandardCharsets.UTF_8);
sPI2 = null;
}
catch (IOException ioe) {System.out.println("Exception thrown for IO: " + ioe);}
}
CalcHash2 = null;
CalcHash2a = null;
}

if(result.compareTo(TripNine)==0)
{
String CalcHash3;
String CalcHash3a = TxHash;

for (int y = 1; y <= 1000; y++)
{

try
{
CalcHash3 = toHexString(getSHA(CalcHash3a));
CalcHash3a = CalcHash3;
}
catch(NoSuchAlgorithmException nae3){}
}

//System.out.println("PublicKey = " + PublicKey);

if(PublicKey.equals(CalcHash3a))
{
int TxNumP3 = TxNumP + 1;

try
{
String sPI3 = Files.readString(pPI);
Files.writeString(pPI, sPI3.replace(SPNamePI + "\n" + SWalletPIat + "\n" + BalancePIb + "\n" + TxNum,SPNamePI + "\n" + SWalletPIat + "\n" + BalancePIb + "\n" + TxNumP3),StandardCharsets.UTF_8);
sPI3 = null;
}
catch (IOException ioe) {System.out.println("Exception thrown for IO: " + ioe);}
writer6933d.write(currentLine6933d + System.getProperty("line.separator"));
}
}

if(result.compareTo(Zero)==0&&TxNumBi.compareTo(Zero)!=0)
{
String CalcHash4;
String CalcHash4a = TransHash;
System.out.println("CalcHash4a = " + CalcHash4a);

for (int z = 1; z <= 1001; z++)
{

try
{
CalcHash4 = toHexString(getSHA(CalcHash4a));
CalcHash4a = CalcHash4;
System.out.println("CalcHash4 = " + CalcHash4);
System.out.println("CalcHash4a = " + CalcHash4a);
}
catch(NoSuchAlgorithmException nae4){}
}
System.out.println("PublicKey = " + PublicKey);

if(PublicKey.equals(CalcHash4a))
{
int TxNumP4 = TxNumP + 1;

try
{
String sPI4 = Files.readString(pPI);
Files.writeString(pPI, sPI4.replace(SPNamePI + "\n" + SWalletPIat + "\n" + BalancePIb + "\n" + TxNum + "\n" + MinedBs + "\n" + PublicKey,SPNamePI + "\n" + SWalletPIat + "\n" + BalancePIb + "\n" + TxNumP4 + "\n" + MinedBs + "\n" + NewPublicKey),StandardCharsets.UTF_8);
sPI4 = null;
}
catch (IOException ioe4) {System.out.println("Exception thrown for IO: " + ioe4);}
writer6933d.write(currentLine6933d + System.getProperty("line.separator"));
}
}
break;
}

else
{
System.out.println("Player does not have enuf coinz to do the tx");
System.out.println("Player must maintain at least 1KMC coin in wallet");
break;
}
}

else
{
System.out.println("Sending player does not have the claimed wallet (bad kitty!!!)");
continue;
}
}

else
{
continue;
}
}
reader6.close();
}

else
{
System.out.println("Some wallet or amount is empty or malformed...");
}
}
writer6933d.close(); 
reader6933d.close(); 
inputFile6933d = null;
tempFile6933d = null;
}


public void orderTxByGas() throws FileNotFoundException,IOException{

File iFile3 = new File("Program_Files/latestTxs3.log");
File iFile4 = new File("Program_Files/latestTxs4.log");
File iFile5 = new File("Program_Files/latestTxs5.log");
BufferedReader reader3 = new BufferedReader(new FileReader(iFile3));
BufferedReader reader4 = new BufferedReader(new FileReader(iFile4));
BufferedWriter writer4 = new BufferedWriter(new FileWriter(iFile4, true));
BufferedWriter writer5 = new BufferedWriter(new FileWriter(iFile5, true));
String Gask;
String sGask;
String comm = ",";
String apos = "`";

while((Gask = reader3.readLine()) != null)
{
int iGask = Gask.indexOf(comm);
int iGask2 = Gask.indexOf(apos);
sGask = Gask.substring(iGask+1,iGask2);
String Gasi;
String sGasi;
int a = 0;

while((Gasi = reader4.readLine()) != null)
{
int iGasi = Gasi.indexOf(comm);
int iGasi2 = Gasi.indexOf(apos);
sGasi = Gasi.substring(iGasi+1,iGasi2);
int intGasi = Integer.parseInt(sGasi);
int intGask = Integer.parseInt(sGask);

if(intGasi>=intGask&&a==0)
{
writer5.write(Gasi + System.getProperty("line.separator"));
}

if(intGask>intGasi&&a==0)
{
writer5.write(Gask + System.getProperty("line.separator"));
a=1;
}

if(a==1)
{
writer5.write(Gasi + System.getProperty("line.separator"));
}
}

if(Gasi==null&&a==0)
{
writer5.write(Gask + System.getProperty("line.separator"));
a=1;
}
reader3.close();
reader4.close();
writer4.close();
writer5.close();
}
}


public void cL5() throws IOException{

Reader readercL5 = new InputStreamReader(new FileInputStream("Program_Files/latestTxs5.log"),"UTF-8");
BufferedReader fincL5 = new BufferedReader (readercL5);
Writer writercL5 = new OutputStreamWriter(new FileOutputStream("Program_Files/latestTxs4.log"),"UTF-8");
BufferedWriter foutcL5 = new BufferedWriter(writercL5);

try
{
String scL5;

while((scL5=fincL5.readLine())!=null)
{
foutcL5.write(scL5.replaceAll("\\ufffd",""));
foutcL5.newLine();
}
fincL5.close();
foutcL5.close();
}
catch (IOException e) {};
new PrintWriter("Program_Files/latestTxs5.log").close();
}


public static byte[] getSHA(String input) throws NoSuchAlgorithmException, IOException{
MessageDigest md = MessageDigest.getInstance("SHA-256");
return md.digest(input.getBytes(StandardCharsets.UTF_8));}

public static String toHexString(byte[] hash){
BigInteger number = new BigInteger(1, hash);
StringBuilder hexString = new StringBuilder(number.toString(16));
while (hexString.length() < 64)
{hexString.insert(0, '0');}
return hexString.toString();}
}
//certutil -hashfile processTxs.java SHA256
//9adb1e2fa968bf8de22b0004b5717a066f5a4d72be3d9bf930641b4d4200a861