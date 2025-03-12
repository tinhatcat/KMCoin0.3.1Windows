import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.stream.Stream;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;


public class playerLedger{


public playerLedger() throws FileNotFoundException,IOException{

try
{
pL();
}
catch (IOException e78){e78.printStackTrace();}
}
	

public void pL() throws FileNotFoundException,IOException{

File file = new File("Program_Files/lastplayer.log");

if (file.exists() && file.length() == 0) 
{
file = null;
} 

else 
{

try
{
new PrintWriter("Program_Files/lastplayerledger.log").close();file = null;
pLF();
}
catch (IOException e78){e78.printStackTrace();}
}
}


public void pLF() throws FileNotFoundException,IOException{
 
Path path13 = Paths.get("Program_Files/lastplayer.log");
String outputFile5 = "Program_Files/lastplayerledger.log";
String outputFile6 = "Program_Files/ledger_final.log";

try (Stream<String> lines = Files.lines(path13, StandardCharsets.UTF_8).map(String->String.substring(49)))
{
lines.filter(line->Character.isWhitespace(line.charAt(0))).forEach(line -> 
{

try
{
Files.write(Paths.get(outputFile5),(line).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
File file = new File("Program_Files/ledger_final.log");
Files.write(Paths.get(outputFile6),(line).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
} 
catch (IOException e) {e.printStackTrace();
}
catch (StringIndexOutOfBoundsException e9) {}
});
}
catch (StringIndexOutOfBoundsException e9) {}
path13 = null;
}
}
//certutil -hashfile playerLedger.java SHA256
//b972e8649032248ea1e6f325b0dcf828601669659c620f6e6b1ad5ed5330f85c