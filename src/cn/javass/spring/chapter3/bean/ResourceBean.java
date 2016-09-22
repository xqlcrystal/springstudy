package cn.javass.spring.chapter3.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResourceBean {

	private FileOutputStream fos;
	private File file;
	
	public void init(){
        System.out.println("ResourceBean:========��ʼ��");
        //������Դ,�ڴ�ֻ����ʾ
        System.out.println("ResourceBean:========������Դ��ִ��һЩԤ����");

        try {
        	this.fos=new FileOutputStream(file);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public void destroy(){
		
        System.out.println("ResourceBean:========����");
        //�ͷ���Դ
        System.out.println("ResourceBean:========�ͷ���Դ��ִ��һЩ�������");

        
        try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public FileOutputStream getFos() {
		return fos;
	}
	
	public void setFile(File file) {
		this.file = file;
	}
}
