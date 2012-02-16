

import java.io.*;
import java.net.*;


public class URLDownloader
{
    final static int size = 1024;
    
    /**
     * No proxy 
     * @param fAddress
     * @param localFileName
     * @param destinationDir
     * @return
     */
    public String fileUrl(String fAddress, String localFileName, String destinationDir)
    {      
    	
            URL Url = null;
            try
            {
                Url = new URL(fAddress );
            }
            catch (MalformedURLException e)
            {
                
            }
            return Initiate(Url, localFileName,destinationDir);
    }
/**
 * proxy needed
 * @param fAddress
 * @param localFileName
 * @param destinationDir
 * @param settings
 * @return
 */
    public String fileUrl(String fAddress, String localFileName, String destinationDir,String protocl,String host,int port)
    {

        URL Url = null;  
            try
            {
                Url = new URL(protocl, host, port,fAddress );
            }
            catch (MalformedURLException e)
            {
            e.printStackTrace();
            }
            
            return Initiate(Url, localFileName, destinationDir);
    }
    @SuppressWarnings("finally")
    public String Initiate(URL url, String localFileName, String destinationDir)
    {
        StringBuilder output = new StringBuilder();
        OutputStream outStream = null;
        URLConnection uCon = null;

        InputStream is = null;
        
            
            byte[] buf;
            int ByteRead, ByteWritten = 0;
//            if(!destinationDir.endsWith("\\")&&!destinationDir.endsWith("/"))
//            {
//                destinationDir=destinationDir+"/";
//            }
        try
        {
            if(!(new File(destinationDir)).exists())
            {
                (new File(destinationDir)).mkdirs();
            }
        outStream = new BufferedOutputStream(new FileOutputStream(destinationDir +  localFileName));
            
//            if(!(new File(destinationDir)).exists())
//            {
//                (new File(destinationDir)).mkdirs();
//            }
//            
//            String filedest = destinationDir+localFileName;
//            new File(filedest);
//        outStream = new BufferedOutputStream(new FileOutputStream(filedest));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try
        {
        uCon = url.openConnection();
//        if(cookies.getCookieEnabled())
//        {
//        	uCon.setRequestProperty("COOKIE", this.cookies.getCookieID()+";"+this.cookies.getCookiePassword());
//        }
//        downloaderLogger.debug("cookie settings for download : "+ this.cookies.getCookieID()+" "+this.cookies.getCookiePassword());
        is = uCon.getInputStream();
        buf = new byte[size];
        while ((ByteRead = is.read(buf)) != -1)
        {
            outStream.write(buf, 0, ByteRead);
            ByteWritten += ByteRead;
        }
        output.append("Downloaded Successfully.\n");
        output.append("File downloaded to:\"").append(destinationDir).append(localFileName).append("\"\nNo ofbytes :").append(ByteWritten);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    finally
    {
        try
        {
            is.close();
            outStream.close();
        }
        catch (IOException e)
        {
        }
        return output.toString();
    }
    }

}