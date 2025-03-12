import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class KMCoin2 extends JFrame implements ActionListener {


public static int mode;
int r = 0;
String PNameSync2;
String PNameSync3;
File tempFile12345h = new File("player_balance.log");
File tempFile12345j = new File("player_txs.log");
File tempFile12345n = new File("wallet_address.log");
private JPanel panel;
private JLabel userLabel, passwordLabel, messageLabel;
private JTextField usernameField;
private JPasswordField passwordField;
private JButton loginButtonMining, loginButtonSyncing, cancelButton,Help;
JMenu menu, submenu;  
JMenuItem i1, i2, i3, i4, i5, i6, i7;  


public KMCoin2(){

userLabel = new JLabel("Player Name:");
passwordLabel = new JLabel("Password:");
messageLabel = new JLabel();
usernameField = new JTextField(15);
passwordField = new JPasswordField(15);
loginButtonMining = new JButton("Mining Only");
loginButtonSyncing = new JButton("Sync with Chain");
cancelButton = new JButton("Cancel");
Help = new JButton("Help");
loginButtonMining.addActionListener(this);
loginButtonSyncing.addActionListener(this);
cancelButton.addActionListener(this);
Help.addActionListener(this);
panel = new JPanel(new GridLayout(4, 2));
panel.add(userLabel);
panel.add(usernameField);
panel.add(passwordLabel);
panel.add(passwordField);
panel.add(loginButtonMining);
panel.add(loginButtonSyncing);
panel.add(cancelButton);
panel.add(Help);
add(panel, BorderLayout.CENTER);
setTitle("KittyMineCoin Login");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(350, 200);
setVisible(true);
}


public void actionPerformed(ActionEvent e){

String username = usernameField.getText();
String password = new String(passwordField.getPassword());  
     
if (e.getSource() == loginButtonSyncing)
{
System.out.print("*****************************************************************************");
System.out.print("\n");
System.out.print("******To sync:*********https://discord.gg/thekittymine***********************");
System.out.print("\n");
System.out.print("*****************************************************************************");
System.out.print("\n");
System.out.print("***1. Log into the Minecraft server at play.thekittymine.com*****************");
System.out.print("\n");
System.out.print("*****************************************************************************");
System.out.print("\n");
System.out.print("***2. Wait for a block to be mined...****************************************");
System.out.print("\n");
System.out.print("*****************************************************************************");
System.out.print("\n");
System.out.print("***3. Do command '!sync' in 'kmcbot-chat' discord channel********************");
System.out.print("\n");
System.out.print("*****************************************************************************");
System.out.print("\n");
System.out.print("***4. Place the three files in 'ledger_KMC' folder (select 'replace All')****");
System.out.print("\n");
System.out.print("*****************************************************************************");
System.out.print("\n");
System.out.print("***5. When complete, press any key (on this command prompt) to continue.*****");
System.out.print("\n");
System.out.print("*****************************************************************************");
System.out.print("\n");
System.out.print("***Currently this must be done between blocks.*******************************");
System.out.print("\n");
System.out.print("*****************************************************************************");
System.out.print("\n");

try(FileWriter writer = new FileWriter("Program_Files/mode.log"))
{
char character = 'S';
writer.write(character);
}
catch (IOException e69){System.out.println("An error occurred: " + e69.getMessage());}

try
{
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
     File file23 = new File("wallet_address.log");
     File file31 = new File("Program_Files/mode.log");
     File file32 = new File("ledger_KMC/ledgerhashes.log");
     File file33 = new File("ledger_KMC/player_info.log");
     File file34 = new File("Program_Files/ledgertemp.log");
     File file35 = new File("Program_Files/ledgertempformatted.log");
     File file36 = new File("ledger_KMC/player_info_temp.log");
     File file37 = new File("Program_Files/ledgertempformattedNotx.log");
     File file38 = new File("Program_Files/ledgertempnotx.log");
     File file39 = new File("Program_Files/ledgertx_total.log");
     File file40 = new File("player_balance.log");
     File file41 = new File("player_txs.log");
     File file42 = new File("player_blocks_mined.log");
     File file43 = new File("Program_Files/ledgertx.log");
     File file44 = new File("Program_Files/latestTxs.log");
     File file45 = new File("Program_Files/latestTxs2.log");
     File file46 = new File("publickey.log");
     File file47 = new File("first_block_mined.log");
     File file48 = new File("Program_Files/latestTxs3.log");
     File file49 = new File("Program_Files/latestTxs4.log");
     File file50 = new File("Program_Files/latestTxs5.log");
     File file51 = new File("ledger_KMC/ledger_current_HASH.log");
     File file52 = new File("ledger_KMC/player_info_HASH.log");
     File file53 = new File("ledger_KMC/player_info_unformatted.log");
     File file54 = new File("ledger_KMC/ledgerhashes_HASH.log");
     File file55 = new File("ledger_KMC/consensus_HASH.log");
     File file56 = new File("Program_Files/txPanel.log");

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
file31.createNewFile();
file32.createNewFile();
file33.createNewFile();
file34.createNewFile();
file35.createNewFile();
file36.createNewFile();
file37.createNewFile();
file38.createNewFile();
file39.createNewFile();
file40.createNewFile();
file41.createNewFile();
file42.createNewFile();
file43.createNewFile();
file44.createNewFile();
file45.createNewFile();
file46.createNewFile();
file47.createNewFile();
file48.createNewFile();
file49.createNewFile();
file50.createNewFile();
file51.createNewFile();
file52.createNewFile();
file53.createNewFile();
file54.createNewFile();
file55.createNewFile();
file56.createNewFile();
}
catch (IOException g) {System.out.println("An error occurred: " + g.getMessage());}
Path path
= Paths.get("privatekey.txt");
Path path2
= Paths.get("localplayer.txt");

try
{
Files.writeString(path, password,StandardCharsets.UTF_8);
Files.writeString(path2," "+username,StandardCharsets.UTF_8);
}
catch (IOException ex) {System.out.print("Invalid Path");}
new printHash();
System.out.println("");

try
{
new Scanner(System.in).nextLine();
System.in.close();
}
catch (IOException exex) {System.out.print("Invalid stuff");}

try(FileWriter writer2ab = new FileWriter("Program_Files/startloop.log"))
{
char character2ab = 'S';
writer2ab.write(character2ab);
}
catch (IOException e69ab){System.out.println("An error occurred: " + e69ab.getMessage());}
Path PNameSync = Paths.get("localplayer.txt");

try
{
PNameSync2 = Files.readString(PNameSync);
PNameSync3 = PNameSync2.substring(1);
System.out.println("You claim to be "+ PNameSync3 + ". Welcome to TheKittyMine!");
PNameSync2 = null;
}
catch (IOException ioe2) {System.out.println("Exception thrown for IO: " + ioe2);}

try
{
getPlayersInfo();
}
catch(IOException ioexc1){}

try(FileWriter writer2abc = new FileWriter("Program_Files/txPanel.log"))
{
char character2abc = 'x';
writer2abc.write(character2abc);
}
catch (IOException e69abc){System.out.println("An error occurred: " + e69abc.getMessage());}
dispose();
}

if (e.getSource() == loginButtonMining)
{
System.out.print("");
System.out.print("Only mining, set!");

try(FileWriter writer2ab2 = new FileWriter("Program_Files/startloop.log"))
{
char character2ab2 = 'S';
writer2ab2.write(character2ab2);
}
catch (IOException e69ab2){System.out.println("An error occurred: " + e69ab2.getMessage());}

try
{
Path path = Paths.get("privatekey.txt");
Path path2 = Paths.get("localplayer.txt");
Files.writeString(path, password,StandardCharsets.UTF_8);
Files.writeString(path2," "+username,StandardCharsets.UTF_8);
}
catch (IOException ex) {System.out.print("Invalid Path");}

new printHash();
dispose();
}

else 
if (e.getSource() == cancelButton)
{
System.exit(0);
dispose();
}

if (e.getSource() == Help)
{

    System.out.println("Use Minecraft playername as seen in game");
    System.out.println("");
    System.out.println("      privatekey.txt  = sha256(sha256(Password)) = sha256^2(Password)");
    System.out.println("");
    System.out.println("      Block hash      = sha256^2002(MChash+PrivateKey)");
    System.out.println("");
    System.out.println("                        Wallet address is first block mined");
    System.out.println("");
    System.out.println("IMPORTANT NOTICES: If you find a block, then do not use keyboard until process is complete.");
    System.out.println("                   The hash is calculated locally and input through Minecraft chat automatically by KMCoin.");
    System.out.println("");
    System.out.println("                   Once a player finds their first block and their hash is successfully entered into Minecraft chat...");
    System.out.println("                   they never have to run KMCoin again to mine blocks. But any blocks found before will not be counted.");
    System.out.println("");
    System.out.println("                   Private Key may never be changed as its minted into the first block mined by the player.");
    System.out.println("");
    System.out.println("                   All txs and public keys are calculated from 'first_block_mined' file.");
    System.out.println("                   The info is retrievable from the ledger but much easier to save once found.");
    System.out.println("");
    System.out.println("SPECIAL NOTICES:   Feel free to prod around the server and program. Report bugs to thekittymine@proton.me");
    System.out.println("                   Decentralized finance forever, regardless of CPU/GPU/Power!");
    System.out.println("");
    System.out.println("");
    System.out.println("                                  Power to All People... Never to government.");         
}
}


public void getPlayersInfo() throws IOException, FileNotFoundException{

File iFile102 = new File("ledger_KMC/player_info.log");
BufferedReader reader102 = new BufferedReader(new FileReader(iFile102));
String cL102;
String WalletSyncAt;
String WalletSync;
String BalanceSync;
String TxsSync;

while((cL102 = reader102.readLine()) != null)
{

if(cL102.equals(PNameSync3))
{
r++;
System.out.println("");
System.out.println("Your player name is present on player_info!");
System.out.println("");
System.out.println("If your private key is correct, then your transactions will be processed!");
System.out.println("");
WalletSyncAt = reader102.readLine();
WalletSync = WalletSyncAt;
System.out.println("Your wallet is = "+WalletSync);
BalanceSync = reader102.readLine();
System.out.println("Your balance is = "+BalanceSync);
TxsSync = reader102.readLine();
System.out.println("Your tx number is = "+TxsSync);
Path p123n = Paths.get("wallet_address.log");
Path p123h = Paths.get("player_balance.log");
Path p123j = Paths.get("player_txs.log");

try
{
Files.writeString(p123n,WalletSync,StandardCharsets.UTF_8);
Files.writeString(p123h,BalanceSync,StandardCharsets.UTF_8);
Files.writeString(p123j,TxsSync,StandardCharsets.UTF_8);
}
catch (IOException ex) {System.out.print("Invalid Path");}
reader102.close();
}
}

if(r==0)
{
System.out.println("Player must mine a block to obtain a wallet address and then be placed on player_info");
}
}
}
//certutil -hashfile KMCoin2.java SHA256
//12dff380628aebca2641f727d9e56f7ecea257a55dfea40d9afc5768aa7b64ad