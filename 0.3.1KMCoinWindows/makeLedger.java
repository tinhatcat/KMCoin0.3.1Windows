import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
 

public class makeLedger{


Path lbl = Paths.get("Program_Files/lastblockledger.log");
Path lpl = Paths.get("Program_Files/lastplayerledger.log");
Path lbh = Paths.get("Program_Files/lastblockhash.log");
Path lc = Paths.get("ledger_KMC/ledger_current.log");


public makeLedger() throws FileNotFoundException,IOException{

mL();
}


public void mL() throws FileNotFoundException,IOException{

String lblS = Files.readString(lbl);
String lplS = Files.readString(lpl);
String lplSs = lplS.substring(1);
String lbhS = Files.readString(lbh).replaceAll(" ", "");
Files.writeString(lc, lblS+" "+lplSs+" "+lbhS+" ",StandardOpenOption.APPEND);
lblS = null;
lplS = null;
lbhS = null; 
}
}
//certutil -hashfile makeLedger.java SHA256
//d10e794ff561f6a903978a30a2dd3e7e74de67e82eebf034879965652d3c74ef