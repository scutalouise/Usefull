package com.scutalouise.compress;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class CompressUtil {

/*	public static void main(String[] args) throws Exception {
		try {
			readZipFile("D:\\ztree.zip");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	*//**
	 * 此接口过于简单，具体使用会有问题；
	 * @param file
	 * @throws Exception
	 *//*
	@SuppressWarnings("resource")
	public static void readZipFile(String file) throws Exception {
		ZipFile zf = new ZipFile(file);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ZipInputStream zin = new ZipInputStream(in);
		ZipEntry ze;
		while ((ze = zin.getNextEntry()) != null) {
			if (ze.isDirectory()) {

			} else {
				System.err.println("file - " + ze.getName() + " : "
						+ ze.getSize() + " bytes");
				long size = ze.getSize();
				if (size > 0) {
					BufferedReader br = new BufferedReader(
							new InputStreamReader(zf.getInputStream(ze)));
					String line;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
					br.close();
				}
				System.out.println();
			}
		}
		zin.closeEntry();
	}

	*//**
	 * 支持对于rar、zip的解压缩并读取压缩文件内容；
	 * @param zipPath
	 * @return
	 * @throws IOException
	 *//*
	public static List<File> getFilesOfZipAndRar(String zipPath) throws IOException
    {
     String destPath = zipPath.substring(0,zipPath.lastIndexOf(".")) + "/";
     //先将该压缩文件解压
     if(zipPath.contains(".zip"))
      unZipFile(new File(zipPath),destPath);
     if(zipPath.contains(".rar"))
      unRarFile(new File(zipPath),destPath);
     //进入解压目录，将该目录的所有zip都解压
     recursiveCompressedFile(new File(destPath));
     //得到该目录下的所有文件
     Iterator iterator = Directory.walk(destPath).iterator();
        List<File> files = new ArrayList<File>();
        File file = null;
        while(iterator.hasNext())
        {
         file = (File)iterator.next();
         if(file.getName().contains(".rar"))
          continue;
         files.add(file);
        }
        return files;
    }
    
    public static void recursiveCompressedFile(File file) throws IOException
    {
     //广度优先遍历
     for(File e:file.listFiles())
     {
      String filePath = e.getAbsolutePath().replace("\\\\","/");
      //深度优先遍历
      if(e.getName().contains(".zip"))
      {
       String desString = filePath.substring(0,filePath.lastIndexOf("."))+"/";
       unZipFile(e,desString);
       e.delete();
       recursiveCompressedFile(new File(desString));
      }
      if(e.getName().contains(".rar"))
      {
       String desString = filePath.substring(0,filePath.lastIndexOf("."))+"/";
       unRarFile(e,desString);
       e.delete();
       recursiveCompressedFile(new File(desString)); 
      }
      if(e.isDirectory())
       recursiveCompressedFile(e);
     }
    }
*/




}