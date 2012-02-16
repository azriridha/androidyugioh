import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.Vector;



public class reader
{

public static void main(String[] args)
{
    reader r = new reader();
    Vector<String> v = new Vector<String>();
    v.add("http://yugioh.wikia.com/wiki/Ultimate_Offering");
    r.pageReader(v);
}


public void pageReader(Vector<String> pages)
{
    
    System.setProperty("http.proxyHost", "tmgsrv");
    System.setProperty("http.proxyPort", "8080");

for(String pageUrl : pages)
{
    URLConnection connection;   
        Scanner in;
        
        try
        {
            connection = (new URL(pageUrl)).openConnection();
            in = new Scanner(new InputStreamReader(connection.getInputStream()));
//            in = new Scanner(new File("new.txt"));
            String imgUrl ="";
            boolean nectLine =false;
            while(in.hasNext())
            {
                String line = in.nextLine();
                line = line.trim();
                if(line.startsWith("<meta property=\"og:image\""))
                {
                    imgUrl = line.substring(35,line.length()-4);
                    imgUrl =imgUrl.replace("69px", "230px");
                    break;
                }
            } 
            System.out.println(imgUrl);
        }
        catch (MalformedURLException e)
        {
        }
        catch (IOException e)
        {
        }
        
}
    
//    URLDownloader u = new URLDownloader();
//    u.fileUrl(link+packs.get(0).cardList.get(0).imgUrl, packs.get(0).cardList.get(0).imgUrl, "C:", "HTTP", "tmgsrv", 8080);
      
}


}
