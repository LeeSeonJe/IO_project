package com.sj.exam02_byte.model.vo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		try {
			FileInputStream fis = new FileInputStream("exam02_byte.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fileSave() {
		try {
			FileOutputStream fos = new FileOutputStream("exam02_byte.txt");
			// int �� ����
			fos.write(97);
			
			// byte �迭 ����
			byte[] b = new byte[] { 'a', 'b', 'c', 'd', 'e' };
			// �迭 ��ü ����
			fos.write(b);
			
			// �迭 �ε��� ���� ����
			fos.write(b, 1, 3);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
