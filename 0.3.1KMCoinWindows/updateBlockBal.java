import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 
import java.io.FileNotFoundException; 
import java.io.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;


public class updateBlockBal{

BigInteger Reward1  = new BigInteger("100000000000000");
BigInteger Reward2  = new BigInteger("50000000000000");
BigInteger Reward3  = new BigInteger("25000000000000");
BigInteger Reward4  = new BigInteger("12500000000000");
BigInteger Reward5  = new BigInteger("6250000000000");
BigInteger Reward6  = new BigInteger("3125000000000");
BigInteger Reward7  = new BigInteger("1562500000000");
BigInteger Reward8  = new BigInteger("781250000000");
BigInteger Reward9  = new BigInteger("390625000000");
BigInteger Reward10 = new BigInteger("195312500000");
int c;
String hashedBlock;
Path theBlockPath = Paths.get("Program_Files/lastblockledger.log");


public updateBlockBal()throws IOException{

updateBlockBal2();
}


public void updateBlockBal2()throws IOException, FileNotFoundException{

File theFile = new File("ledger_KMC/player_info.log");
Path thePath = Paths.get("ledger_KMC/player_info.log");
Path thePlayerPath = Paths.get("Program_Files/lastplayerledger.log");
Path theHashPath = Paths.get("Program_Files/lastblockhash.log");
BufferedReader theReader = new BufferedReader(new FileReader(theFile));
BufferedWriter theWriter = new BufferedWriter(new FileWriter(theFile, true));
String thePlayerInfo = Files.readString(thePath);
String theHashPlayerS = Files.readString(thePlayerPath);
String theHashPlayer = theHashPlayerS.substring(1);
String theBlock = Files.readString(theBlockPath);
char dotChar = '.';
int theBlockIndex = theBlock.indexOf(dotChar);
hashedBlock = theBlock.substring(0, theBlockIndex);
int hashedBlocki = Integer.parseInt(hashedBlock);
String theHash = Files.readString(theHashPath);

if(theHash.equals(""))
{
System.out.println("No hash input. Are they already on player info? If so, blocks will be rewarded!");
System.out.println("");
}

String theCL;
String thePlayer;

while((theCL = theReader.readLine()) != null) 
{

if(theCL.equals(theHashPlayer.trim()))
{
String theirWallet = theReader.readLine();
String theirBalance = theReader.readLine();
BigInteger theirBalanceBi = new BigInteger(theirBalance);

if(hashedBlocki<2100001){theirBalanceBi = theirBalanceBi.add(Reward1);}
if(2100001<=hashedBlocki&&hashedBlocki<4200001){theirBalanceBi = theirBalanceBi.add(Reward2);}
if(4200001<=hashedBlocki&&hashedBlocki<6300001){theirBalanceBi = theirBalanceBi.add(Reward3);}
if(6300001<=hashedBlocki&&hashedBlocki<8400001){theirBalanceBi = theirBalanceBi.add(Reward4);}
if(8400001<=hashedBlocki&&hashedBlocki<10500001){theirBalanceBi = theirBalanceBi.add(Reward5);}
if(10500001<=hashedBlocki&&hashedBlocki<12600001){theirBalanceBi = theirBalanceBi.add(Reward6);}
if(12600001<=hashedBlocki&&hashedBlocki<14700001){theirBalanceBi = theirBalanceBi.add(Reward7);}
if(14700001<=hashedBlocki&&hashedBlocki<16800001){theirBalanceBi = theirBalanceBi.add(Reward8);}
if(16800001<=hashedBlocki&&hashedBlocki<18900001){theirBalanceBi = theirBalanceBi.add(Reward9);}
if(18900001<=hashedBlocki&&hashedBlocki<21000001){theirBalanceBi = theirBalanceBi.add(Reward10);}

try
{
Files.writeString(thePath, thePlayerInfo.replace(theHashPlayer + "\n" + theirWallet + "\n" + theirBalance,theHashPlayer + "\n" + theirWallet + "\n" + theirBalanceBi),StandardCharsets.UTF_8);
thePath = null;
}
catch (IOException theExc) {System.out.println("Exception thrown for IO: " + theExc);}
c++;
theReader.close();
theWriter.close();
break;
}

else
{

}

}

if(c==0)
{

if(theHash.equals(""))
{
theWriter.close();
}

else
{
BigInteger theirReward = new BigInteger("0");
if(hashedBlocki<2100001){theirReward = Reward1;}
if(2100001<=hashedBlocki&&hashedBlocki<4200001){theirReward = Reward2;}
if(4200001<=hashedBlocki&&hashedBlocki<6300001){theirReward = Reward3;}
if(6300001<=hashedBlocki&&hashedBlocki<8400001){theirReward = Reward4;}
if(8400001<=hashedBlocki&&hashedBlocki<10500001){theirReward = Reward5;}
if(10500001<=hashedBlocki&&hashedBlocki<12600001){theirReward = Reward6;}
if(12600001<=hashedBlocki&&hashedBlocki<14700001){theirReward = Reward7;}
if(14700001<=hashedBlocki&&hashedBlocki<16800001){theirReward = Reward8;}
if(16800001<=hashedBlocki&&hashedBlocki<18900001){theirReward = Reward9;}
if(18900001<=hashedBlocki&&hashedBlocki<21000001){theirReward = Reward10;}
theWriter.write(theHashPlayer + "\n");
theWriter.write("@" + hashedBlock + "\n");
theWriter.write(theirReward + "\n");
theWriter.write("0" + "\n");
theWriter.write("0" + "\n");
theWriter.write(theHash.replaceAll(" ", "") + "\n");
theWriter.close();
writeFirstBlock();
}
theFile=null;
thePath=null;
thePlayerPath=null;
theBlockPath=null;
theHashPath=null;
thePlayerInfo=null;
theHashPlayerS=null;
theHashPlayer=null;
theBlock=null;
hashedBlock=null;
theHash=null;
theCL=null;
thePlayer=null;
}
}


public void writeFirstBlock() throws IOException
{
Path thePath7 = Paths.get("first_block_mined.log");
String theBlock2 = Files.readString(theBlockPath);
Files.writeString(thePath7, theBlock2, StandardCharsets.UTF_8);
thePath7 = null;
}
}
//certutil -hashfile updateBlockBal.java SHA256
//6a394934812adc901be862eb41acf12583ce707501c9e020c26241a03555bbf7