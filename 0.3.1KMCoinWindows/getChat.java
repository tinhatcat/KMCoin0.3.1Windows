import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.stream.Stream;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;


public class getChat{


public getChat() throws FileNotFoundException,IOException{

try
{
gC();
}
catch (IOException e78){e78.printStackTrace();}
}


public void gC() throws FileNotFoundException,IOException{	 

Path path11 = Paths.get("latestcopy.log");
String outputFile = "Program_Files/latestchat.log";
   		
try (Stream<String> lines = Files.lines(path11, StandardCharsets.UTF_8).map(String::trim))
{
lines.filter(line->Character.isWhitespace(line.charAt(32))
&Character.isUpperCase(line.charAt(35))
&Character.isUpperCase(line.charAt(36))
&Character.isUpperCase(line.charAt(37))).forEach(line -> 
{

try
{
Files.write(Paths.get(outputFile),(line + System.lineSeparator()).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
} 
catch (IOException e) {e.printStackTrace();}
catch (StringIndexOutOfBoundsException e2) {}
});
}
catch (StringIndexOutOfBoundsException e2) {}
path11 = null;
}
}
//certutil -hashfile getChat.java SHA256
//5c825d067cb853ce1434e12c58b441a5aa08fe1a48cf99da63b8e49f44d26a71