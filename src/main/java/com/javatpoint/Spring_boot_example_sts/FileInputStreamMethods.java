package com.javatpoint.Spring_boot_example_sts;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

public class FileInputStreamMethods {

	public static void main(String[] args) throws IOException {
		
	File f = new File("C:\\Users\\kalya\\OneDrive\\Desktop\\java photos\\stream.txt");
	//System.out.println(f.getName());//cheak the path
	//System.out.println(f.getAbsolutePath());//full path
	
	//System.out.println(f.getParent());
	//File f5= new File(f.getParent()+"/stream5.txt");//sam flour to creat new file
	//System.out.println(f5.createNewFile());//print new flour
	
	//System.out.println(Arrays.toString(f.list()));//floure into file name
	
	
	//  System.out.println(Arrays.toString(f.listFiles()));//floure into file name and full path 
	
	
	
	
	//File f = new File("./stream.txt");
	//File f = new File("./kalyanm/");//creat folder 
	//System.out.println(f.mkdir());//make directery  create one folder
	
	//File f = new File("./kalyan/stream.txt");//creat folder 
	//System.out.println(f.mkdirs());//make directery  create one folder
	//if(f.exists());//file cheack 
	//f.delete();// file delete
	//System.out.println(f.createNewFile());//create new file print
	//System.out.println(f.exists());//file cheack
		//System.out.println(f.delete());//file delete
		//System.out.println(f.createNewFile()); //creat new file
		//System.out.println(f.isHidden());// hide the file
		//System.out.println(f.canWrite());//write permisions 
          //f.setWritable(false);//cheack the permisions
          //System.out.println(f.canWrite());//write permisions
	
	//if (f.exists()) {
	//	long totalSpace = f.getTotalSpace();//total space
		//System.out.println("Total Space: " + totalSpace + " bytes");//total space byte
		//System.out.println("Total Space: " + totalSpace + " KB ");//total space KB
		//System.out.println("Total Space: " + totalSpace + " MB ");//total space MB
		//System.out.println("Total Space: " + totalSpace + " GB ");//total space GB
		
	
	
	//System.out.println(f.getTotalSpace());//total space
//	System.out.println(f.lastModified());//last modified
	//System.out.println(new Date(f.lastModified()));//last modified date
	
	//System.out.println(f.isDirectory());to cheack the file are Directory
	//System.out.println(f.isFile());//to cheack the file are Directory
	
	//System.out.println(f.hashCode());//hashcode
       //  System.out.println(f.toURI());//URL print
	
         
	
	}
}