package com.javatpoint.Spring_boot_example_sts;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\dell\\Desktop\\testfiles\\resume.txt");
		//if(f.exists())
			//f.delete();
		//System.out.println(f.createNewFile());
		//System.out.println(f.exists());
		//f.delete();
		//System.out.println(f.delete());
		//f.createNewFile();
		//System.out.println(f.isHidden());
		System.out.println(f.canWrite());
		f.setWritable(true);
		System.out.println(f.canWrite());
		
       
		
	}

	}


