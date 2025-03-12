import java.io.*;    


public class KMCoin{


public static int mode;


synchronized public void waitMethod() throws IOException, InterruptedException, Exception{

while(true)
{

try
{
wait(500);
copyLatestSync copyLatestSync = new copyLatestSync();
copyLatestSync = null;
copyLatest copyLatest = new copyLatest();
copyLatest = null;
getChat getChat = new getChat();
getChat = null;
getBlocks getBlocks = new getBlocks();
getBlocks = null;
getPlayers getPlayers = new getPlayers();
getPlayers = null;
blockLedger blockLedger = new blockLedger();
blockLedger = null;
playerLedger playerLedger = new playerLedger();
playerLedger = null;
whoIs whoIs = new whoIs();
whoIs = null;
reFormatLedger reFormatLedger = new reFormatLedger();
reFormatLedger = null;

try
{
File file79c = new File("Program_Files/mode.log");

if (file79c.exists() && file79c.length() !=0)
{
getTxs getTxs = new getTxs();
getTxs = null;
}
file79c = null;
}
catch (Exception e1790c){}

try
{
File file79b = new File("Program_Files/mode.log");

if (file79b.exists() && file79b.length() ==0)
{

new PrintWriter("Program_Files/lastblock.log").close();
}
file79b = null;
}
catch (Exception e1790b){}
new PrintWriter("Program_Files/otherplayerhash3.log").close();
break;
}
catch (Exception e9){
e9.printStackTrace();
}
}
}


synchronized public void waitMethod2() throws IOException, InterruptedException, Exception{

wait(500);

try
{

while(true)
{

try
{
File file79 = new File("Program_Files/latestTxs.log");

if (file79.exists() && file79.length() !=0)
{
System.out.println("");
System.out.println("found a tx!");
processTxs processTxs = new processTxs();
processTxs = null;
}
file79 = null;
}
catch (Exception e1790){}

try
{
File file73 = new File("Program_Files/txPanel.log");

if (file73.exists() && file73.length() !=0)
{


new txPanel();



new PrintWriter("Program_Files/txPanel.log").close();
}
file73 = null;
}
catch (Exception e1790){}

try
{
File file731 = new File("Program_Files/lastblock.log");

if (file731.exists() && file731.length() !=0)
{
updateBlockBal updateBlockBal = new updateBlockBal();
updateBlockBal = null;
makeLedger makeLedger = new makeLedger();
makeLedger = null;
top100 top100 = new top100();
top100 = null;
new PrintWriter("ledger_KMC/ledger_current_HASH.log").close();
hashLC hashLC = new hashLC();
hashLC = null;
reformatPI reformatPI = new reformatPI();
reformatPI = null;
new PrintWriter("ledger_KMC/player_info_HASH.log").close();
hashPI hashPI = new hashPI();
hashPI = null;
File ledgerCurrent = new File("ledger_KMC/ledger_current.log");
long ledgerCurrentLength = ledgerCurrent.length();

if (ledgerCurrent.exists() && ledgerCurrentLength>=100000000)
{
appendLHash appendLHash = new appendLHash();
appendLHash = null;
buildLedger buildLedger = new buildLedger();
buildLedger = null;
new PrintWriter("ledger_KMC/ledger_current.log").close();
ledgerCurrent = null;
}
new PrintWriter("ledger_KMC/ledgerhashes_HASH.log").close();
hashLH hashLH = new hashLH();
hashLH = null;
new PrintWriter("ledger_KMC/consensus_HASH.log").close();
hashC hashC = new hashC();
hashC = null;
appendCHash appendCHash = new appendCHash();
appendCHash = null;
file731 = null;
new PrintWriter("Program_Files/lastblock.log").close();
new PrintWriter("Program_Files/latestTxs4.log").close();
}
}
catch (Exception e117){}
new PrintWriter("Program_Files/latestTxs.log").close();
new PrintWriter("Program_Files/latestTxs2.log").close();
new PrintWriter("Program_Files/latestTxs3.log").close();
break;
}
}
catch (Exception e9119){e9119.printStackTrace();}
}


synchronized public void waitMethod3() throws IOException, InterruptedException, Exception{

while(true)
{

try
{
copySync copySync = new copySync();
copySync = null;
break;
}
catch (Exception e9119ab){e9119ab.printStackTrace();}
}
}


public static void main(String[] args)throws FileNotFoundException {

mode=0;
String folderPath = "Program_Files";
File newFolder = new File(folderPath);

String folderPath2 = "ledger_KMC";
File newFolder2 = new File(folderPath2);

try
{
newFolder.mkdir();
newFolder2.mkdir();

     File file = new File("privatekey.txt");
     File file2 = new File("latestcopy.log");
     File file3 = new File("localplayer.txt");
     File file4 = new File("Program_Files/latestchat.log");
     File file6 = new File("Program_Files/latestblocks.log");
     File file7 = new File("Program_Files/latestplayers.log");
     File file8 = new File("Program_Files/lastblock.log");
     File file9 = new File("Program_Files/lastblockledger.log");
     File file10 = new File("Program_Files/ledger_final.log");
     File file11 = new File("Program_Files/lastplayer.log");
     File file12 = new File("Program_Files/lastplayerledger.log");
     File file13 = new File("Program_Files/lastblockhash.log");
     File file14 = new File("Program_Files/otherplayerhash.log");
     File file15 = new File("Program_Files/otherplayerhash2.log");
     File file16 = new File("Program_Files/otherplayerhash3.log");
     File file17 = new File("Program_Files/latestcopy2.log");
     File file18 = new File("Program_Files/latestcopy3.log");
     File file19 = new File("Program_Files/lastledgerhash.log");
     File file20 = new File("Program_Files/ledger_formatted.log");
     File file21 = new File("Program_Files/hash.log");
     File file22 = new File("Program_Files/hash2.log");
     File file23 = new File("Program_Files/mode.log");
     File file24 = new File("ledger_KMC/ledger_current.log");
     File file24a = new File("Program_Files/latest_block.log");
     File file24b = new File("latestcopyA.log");
     File file24c = new File("nextBlockLines.log");
     File file24d = new File("Program_Files/startloop.log");
     File file24e = new File("Program_Files/syncCopy.log");
     File file24f = new File("Program_Files/syncCopy2.log");

file.createNewFile();
file2.createNewFile();
file3.createNewFile();
file4.createNewFile();
file6.createNewFile();
file7.createNewFile();
file8.createNewFile();
file9.createNewFile();
file10.createNewFile();
file11.createNewFile();
file12.createNewFile();
file13.createNewFile();
file14.createNewFile();
file15.createNewFile();
file16.createNewFile();
file17.createNewFile();
file18.createNewFile();
file19.createNewFile();
file20.createNewFile();
file21.createNewFile();
file22.createNewFile();
file23.createNewFile();
file24.createNewFile();
file24a.createNewFile();
file24b.createNewFile();
file24c.createNewFile();
file24d.createNewFile();
file24e.createNewFile();
file24f.createNewFile();
}
catch (IOException ex) {System.out.print("Invalid Path");}

    System.out.println("        ");
    System.out.println("~Welcome to TheKittyMine 0.3.1~");
    System.out.println("        ");
    System.out.println("       /\\             /\\       ");
    System.out.println("      /#^\\           / ^\\      ");
    System.out.println("     /#/ \\\\_________/ /*\\\\     ");
    System.out.println("    /#/   \\  ~~~~~~~~    \\\\     ");
    System.out.println("   (#           ~~~~       )    ");
    System.out.println("  (#   \\ -[(0)] --- [(0)]-\\ )   ");
    System.out.println(" (#                          )        ");
    System.out.println("(##    -------  \\`/   ----   )      PoW meets PoG");
    System.out.println(" (##  ---------      -------)     *   Bees cats dogs");
    System.out.println("  ###    ---   \\___   --- )    *       Kitties my fav");
    System.out.println("    ###                 )   *             But i luv em all");
    System.out.println("       ####          )          ");
    System.out.println("           ########            ");
    System.out.println("        ");

new KMCoin2();

new PrintWriter("wallet_address.log").close();
new PrintWriter("player_balance.log").close();
new PrintWriter("player_blocks_mined.log").close();
new PrintWriter("player_txs.log").close();
new PrintWriter("Program_Files/mode.log").close();
new PrintWriter("Program_Files/startloop.log").close();
new PrintWriter("Program_Files/lastblock.log").close();
new PrintWriter("Program_Files/lastblockhash.log").close();
new PrintWriter("Program_Files/lastblockledger.log").close();
new PrintWriter("Program_Files/lastledgerhash.log").close();
new PrintWriter("Program_Files/lastplayer.log").close();
new PrintWriter("Program_Files/lastplayerledger.log").close();
new PrintWriter("Program_Files/latest_block.log").close();
new PrintWriter("Program_Files/latestblock.log").close();
new PrintWriter("Program_Files/latestblocks.log").close();
new PrintWriter("Program_Files/latestchat.log").close();
new PrintWriter("Program_Files/latestplayers.log").close();
new PrintWriter("Program_Files/ledger_final.log").close();
new PrintWriter("Program_Files/ledger_formatted.log").close();
new PrintWriter("Program_Files/syncCopy.log").close();
new PrintWriter("Program_Files/syncCopy2.log").close();

mode=1;

while(mode==1)
{

while(true)
{

for(int i = 1; i <= 2; i++)
{

for (int j = 1; j <= 3000; j++) 
{

while(true)
{

try
{
File file691ab = new File("Program_Files/startloop.log");

if (file691ab.exists() && file691ab.length() !=0)
{

try
{
KMCoin object = new KMCoin();
object.waitMethod();object=null;
System.gc();
}
catch (InterruptedException e79){e79.printStackTrace();}
catch (IOException e80){}
catch (Exception e81){}

try
{
File file691 = new File("Program_Files/mode.log");

if (file691.exists() && file691.length() !=0)
{
KMCoin object2 = new KMCoin();
object2.waitMethod2();object2=null;
System.gc();
}
file691 = null;
}
catch (Exception e1101){}
}

else
{
KMCoin object3 = new KMCoin();
object3.waitMethod3();object3=null;
Thread.sleep(500);
System.gc();
}
file691ab = null;
}
catch (Exception e1101ab){}
}
}
}
}
}
}
}
//certutil -hashfile KMCoin.java SHA256
//253f5ac9686e17f55651dd76ea2f1762f5044e670f97ee2d3f48fb91eb2220c7