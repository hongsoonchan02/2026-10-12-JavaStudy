package com.sist.io2;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	File file=new File("c:\\java_data\\genie.txt");
        	if(!file.exists())
        	{
        		file.createNewFile();
        	}
        	Genie_DataCollection genie=
        			   new Genie_DataCollection();
        	genie.dataCollection();
        	FileWriter fw=
        			 new FileWriter(file,true);
        	for(Music m:Genie_DataCollection.list)
        	{
        		String data=m.getMno()+"|"
        				  +m.getTitle()+"|"
        				  +m.getSinger()+"|"
        				  +m.getAlbum()+"|"
        				  +m.getPoster()+"\r\n";
        		fw.write(data);
        	}
        	fw.close();
        	System.out.println("데이터 수집 완료!!");
        }catch(Exception ex) 
        {
        	ex.printStackTrace();
        }
	}

}