import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.util.*;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.Console;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Thread;
import java.lang.InterruptedException;
import java.util.regex.Pattern;
import java.util.stream.*;
import java.nio.file.StandardCopyOption;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class txPanel extends JFrame implements ActionListener {

String txHash;
String sBothHash;
String txHasha;
String sBothHasha;
String sBoth;
String ssBoth;
String transHash;
String NewPublicKey;
Path p1 = Paths.get("first_block_mined.log");
Path p2 = Paths.get("privatekey.txt");
Path PlayerBalance = Paths.get("player_balance.log");
Path PlayerBlocksMined = Paths.get("player_blocks_mined.log");
Path PlayerTxSent = Paths.get("player_txs.log");
Path PlayerWallet = Paths.get("wallet_address.log");
Path LocalPlayer = Paths.get("localplayer.txt");
File file1 = new File("ledger_KMC/player_info.log");
File file2 = new File("wallet_address.log");
File file3 = new File("player_balance.log");
File file4 = new File("player_txs.log");
File file5 = new File("publickey.log");
File file6 = new File("localplayer.txt");
    private JPanel panel;
    private JLabel Label1,Label2,Label3,userLabela,userLabelb,userLabel, userLabel2, userLabel3,userLabel4,userLabel5, passwordLabel, messageLabel;
    private JTextField Amount,RWallet,Gas,txNoHash;
    private JButton getTxHash, loginButtonSyncing, cancelButton,cancelButton2,refreshButton;
    private JTextArea Balance,TxSent,Wallet;
JMenu menu, submenu;  
JMenuItem i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14;  


public txPanel() {

        userLabela = new JLabel("   *Player Info*");
        userLabelb = new JLabel("");
        userLabel = new JLabel("             Wallet address");
        Wallet = new JTextArea();
        userLabel2 = new JLabel("             Balance");
        Balance = new JTextArea();
        userLabel3 = new JLabel("             Tx's Sent");
        TxSent = new JTextArea();
        userLabel4 = new JLabel("   *Tx Panel*");
        userLabel5 = new JLabel("Copy output tx to Minecraft chat");
        Amount = new JTextField();
        RWallet = new JTextField();
        Gas = new JTextField();
        Label1 = new JLabel("             Amount to send");
        Label2 = new JLabel("             Receiving wallet");
        Label3 = new JLabel("             Gas (1KMC min)");
        messageLabel = new JLabel();
        txNoHash = new JTextField(15);
        getTxHash = new JButton("Generate tx");
        cancelButton = new JButton("Cancel");
        refreshButton = new JButton("Refresh");
        getTxHash.addActionListener(this);
        cancelButton.addActionListener(this);
        refreshButton.addActionListener(this);
        panel = new JPanel(new GridLayout(10, 2));
        panel.add(userLabela);
        panel.add(userLabelb);
        panel.add(userLabel);
        panel.add(Wallet);
        panel.add(userLabel2);
        panel.add(Balance);
        panel.add(userLabel3);
        panel.add(TxSent);
        panel.add(userLabel4);
        panel.add(userLabel5);
        panel.add(Label1);
        panel.add(Amount);
        panel.add(Label2);
        panel.add(RWallet);
        panel.add(Label3);
        panel.add(Gas);
        panel.add(getTxHash);
        panel.add(txNoHash);
        panel.add(refreshButton);
        panel.add(cancelButton);
        add(panel, BorderLayout.CENTER);
        setTitle("KittyMineCoin 0.0.1");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);

try
{
String PlayerBalanceS = Files.readString(PlayerBalance);
Balance.setText(PlayerBalanceS);
String TxSentS = Files.readString(PlayerTxSent);
TxSent.setText(TxSentS);
String PlayerWalletS = Files.readString(PlayerWallet);
Wallet.setText(PlayerWalletS);
}
catch (IOException ex3456qq) {System.out.println("Exception thrown for IO: " + ex3456qq);}
}


public void refreshPanel(){

try
{
String PlayerBalanceS = Files.readString(PlayerBalance);
Balance.setText(PlayerBalanceS);
Balance.repaint();
String TxSentS = Files.readString(PlayerTxSent);
TxSent.setText(TxSentS);
TxSent.repaint();
String PlayerWalletS = Files.readString(PlayerWallet);
Wallet.setText(PlayerWalletS);
Wallet.repaint();
}
catch (IOException ex3456qq) {System.out.println("Exception thrown for IO: " + ex3456qq);}
}


public void actionPerformed(ActionEvent e) {

if (e.getSource() == refreshButton)
{
dispose();

try(FileWriter writer2abcd3 = new FileWriter("Program_Files/txPanel.log"))
{
char character2abcd3 = 'x';
writer2abcd3.write(character2abcd3);
}
catch (IOException e69abcd3){System.out.println("An error occurred: " + e69abcd3.getMessage());}
}
String username = txNoHash.getText();  

if (e.getSource() == getTxHash)
{

try
{
generateTxHash();
getTxStuff();
}
catch(IOException exc1){}
}

else 
if (e.getSource() == cancelButton)
{
System.exit(0);
dispose();
}
}


public void generateTxHash()throws IOException, UnsupportedEncodingException, FileNotFoundException{

String fString = Files.readString(LocalPlayer);
String fString2= fString.substring(1);
String cL1;
String aWallet;
String aBalance;
String aTxs;
String aBlocksMined;
String aPublicKey;
String aSendAmount;
BufferedReader buff1 = new BufferedReader(new FileReader(file1));

while((cL1 = buff1.readLine()) != null) 
{

if(cL1.equals(fString2))
{
aWallet = buff1.readLine();
aBalance = buff1.readLine();
aTxs = buff1.readLine();
aBlocksMined = buff1.readLine();
aPublicKey = buff1.readLine();
int txs = Integer.parseInt(aTxs);
int rem = txs % 1000;

if(rem != 0)
{
rem++;
int iteration = 2002 - rem;

try
{
int batch = txs / 1000;

if(batch==0)
{
String s1 = Files.readString(p1);
String s2 = Files.readString(p2);
sBoth = s1 + s2;

for (int h = 1; h <= iteration; h++)
{
sBothHash = toHexString(getSHA(sBoth));
sBoth = sBothHash;
}
s1 = null;
s2 = null;
fString=null;
fString2=null;
cL1=null;
aWallet=null;
aBalance=null;
aTxs=null;
aBlocksMined=null;
aPublicKey=null;
aSendAmount=null;
}

else
{
String s1 = Files.readString(p1);
String s2 = Files.readString(p2);
String sBoth = s1 + s2 + batch;

for (int g = 1; g <= iteration; g++)
{
sBothHash = toHexString(getSHA(sBoth));
sBoth = sBothHash;
}
s1 = null;
s2 = null;
}
txHash = sBothHash;
sBothHash = null;
}
catch (NoSuchAlgorithmException e) {System.out.println("Exception thrown for incorrect algorithm: " + e);}
catch (IOException ex) {System.out.println("Exception thrown for IO: " + ex);}
fString=null;
fString2=null;
cL1=null;
aWallet=null;
aBalance=null;
aTxs=null;
aBlocksMined=null;
aPublicKey=null;
aSendAmount=null;
}

if(rem == 0 && txs != 0)
{
int batch = txs / 1000;
int lastBatch = batch - 1;

try
{
String s3 = Files.readString(p1);
String s4 = Files.readString(p2);

if(lastBatch==0)
{
String sBotha = s3 + s4;

for (int e = 1; e <= 1001; e++)
{
sBothHasha = toHexString(getSHA(sBotha));
sBotha = sBothHasha;
}
transHash = sBothHasha;
s3 = null;
s4 = null;
fString=null;
fString2=null;
cL1=null;
aWallet=null;
aBalance=null;
aTxs=null;
aBlocksMined=null;
aPublicKey=null;
aSendAmount=null;
}

else
{
String sBotha = s3 + s4 + lastBatch;

for (int f = 1; f <= 1001; f++)
{
sBothHasha = toHexString(getSHA(sBotha));
sBotha = sBothHasha;
}
transHash = sBothHasha;
s3 = null;
s4 = null;
fString=null;
fString2=null;
cL1=null;
aWallet=null;
aBalance=null;
aTxs=null;
aBlocksMined=null;
aPublicKey=null;
aSendAmount=null;
}
String s5 = Files.readString(p1);
String s6 = Files.readString(p2);
String ssBoth = s5 + s6 + batch;

for (int m = 1; m <= 2002; m++)
{
sBothHash = toHexString(getSHA(ssBoth));
ssBoth = sBothHash;
}
NewPublicKey = sBothHash;
s5 = null;
s4 = null;
String s7 = Files.readString(p1);
String s8 = Files.readString(p2);
ssBoth = s7 + s8 + batch;

for (int n = 1; n <= 2001; n++)
{
sBothHash = toHexString(getSHA(ssBoth));
ssBoth = sBothHash;
}
txHash = ssBoth;
s7 = null;
s8 = null;
}
catch (NoSuchAlgorithmException ea) {System.out.println("Exception thrown for incorrect algorithm: " + ea);}
catch (IOException exa) {System.out.println("Exception thrown for IO: " + exa);}
}

if(rem == 0 && txs == 0)
{

try
{
String s9 = Files.readString(p1);
String s10 = Files.readString(p2);
ssBoth = s9 + s10;

for (int p = 1; p <= 2001; p++)
{
sBothHash = toHexString(getSHA(ssBoth));
ssBoth = sBothHash;
}
txHash = ssBoth;
System.out.println("Your first transaction hash is: " + txHash);
s9 = null;
s10 = null;
}
catch (NoSuchAlgorithmException eb) {System.out.println("Exception thrown for incorrect algorithm: " + eb);}
catch (IOException exb) {System.out.println("Exception thrown for IO: " + exb);}
sBothHash=null;
ssBoth=null;
fString=null;
fString2=null;
cL1=null;
aWallet=null;
aBalance=null;
aTxs=null;
aBlocksMined=null;
aPublicKey=null;
aSendAmount=null;
}
}

else
{

}
}
}


public void getTxStuff()throws IOException{

System.out.println("");
System.out.println("Here is your tx info...");
System.out.println("");
String SAmount = Amount.getText();
System.out.println("Send Amount = " + SAmount);
String SRWallet = RWallet.getText();
System.out.println("Receiving Wallet = " + SRWallet);
String SGas = Gas.getText();
System.out.println("Gas = " + SGas);
String SSWallet = Files.readString(PlayerWallet).substring(1);
txNoHash.setText(SSWallet + "&" + SAmount + "_" + SRWallet + "," + SGas + "`" + txHash + "~" + transHash + "%" + NewPublicKey + ";");
System.out.println("tx Hash = " + txHash);
System.out.println("transHash = " + transHash);
System.out.println("NewPublicKey = " + NewPublicKey);
txHash = null;
transHash = null;
NewPublicKey = null;
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
//certutil -hashfile txPanel.java SHA256
//f6d1252a706c04e97e9c16b954ed50c7a9454ccdb40fee86d61edf435f2ea2ec