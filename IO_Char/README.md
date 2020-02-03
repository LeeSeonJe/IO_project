# charDAO
### - IO_Char Summary

+ ���� ��� ��Ʈ��
	+ �Է� ��Ʈ��
		+ �ֻ��� Ŭ���� : Reader
		+ ���� Ŭ���� : XXXReader
	+ ��� ��Ʈ��
		+ �ֻ��� Ŭ���� : Writer
		+ ���� Ŭ���� : XXXWriter
		
### FileReader // ������ ���� �� ��������.

```
public void fileSave() {
		FileWriter fr = new FileWriter("exam03.txt");	
	}
```

+
	+ �Ű������� ���Ͽ� ���� ����(���)�Ѵ�. **��, ������ ���� �� ������Ų��.**
	+ IO�� ����ϱ� ���ؼ��� **����ó��**�� �� ������Ѵ�.
	+ FileWriter �ڵ带 ���캸��.
	+ (Ctrl + Ŭ��)�� ����ؼ� Ȯ�����ش�.

```
public FileWriter(String fileName) throws IOException
```
+	
	+ throws IOException ����ó���� ������ �ִ�.
	+ try~catch���� ����Ͽ� ����ó���� ������.
	+ ���ݺ��ʹ� try~catch���� �ڵ����� ����� �ְ� try-with-resource���� ����� ���̴�.
	+ try-with-resource�� try**()** ��ȣ�ȿ� ��Ʈ���� ������ �ִ� ������ �츮�� �׻� �������� finally�� ��Ʈ���� close() ���ִ� �κ��� �ڵ����� ó�����ش�.
	+ �ؿ� �ҽ��� ���ؼ� Ȯ������.
	
```
public void fileSave() {
		try (FileWriter fr = new FileWriter("exam03.txt");) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
```

+
	+ API - FileWriter - Constructors �κ��� ���� **FileWriter(File file, boolean append)** �ڿ� boolean append�� ���� Constructors�� Ȯ���� �� �ִ�.
	+ **FileOutputStream �� ���� �ڵ����� ����� ���� ���� �ʰ� �̾ �� �� �ְ� ���ִ� Constructors�̴�.

>

+
	+ ����ϱ� ���켭�� FileOutputStream�� ���� write()�� ������ش�.
	+ write()�޼ҵ嵵 IOException�� ����ó�� ������ϴµ� �̹� FileWriter ������ ó������� ������ ����ó�� ������ ���� �ʴ´�.

>

+
	+ write()�� ����غ���.
		+ write(char[] cbuf) : char �迭 ��ü�� �����Ѵ�.
		+ write(char[] cbuf, int off, int len) : char �迭 �ε��� ������ŭ �����Ѵ�. **������ ������ �׻� �������� �ʴ´�.**
		+ write(int c) : ���� �� �ϳ��� �����Ѵ�.
		+ write(String str) : ���ڿ��� �����Ѵ�.
		+ write(String str, int off, int len) : ���ڿ��� �ε��� ������ŭ �����Ѵ�. **������ ������ �׻� �������� �ʴ´�.**
	
```
public void fileSave() {
		try (FileWriter fr = new FileWriter("exam03.txt");) {
			char[] ch = { 'a', 'b', 'c', 'd', 'e' };
			// write(char[] cbuf)
			fr.write(ch);
			// write(char[] cbuf, int off, int len)
			fr.write(ch, 2, 4);
			// write(int c)
			fr.write(97);
			String str = "Test";
			// write(String str)
			fr.write(str);
			// write(String str, int off, int len)
			fr.write(str, 0, 2);
			// write(String str)
			fr.write("FileReader:::");
			// write(String str)
			fr.write("�ѱ��� �������:::");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fileOpen() {
		try (FileReader fr = new FileReader("exam03.txt");) {
			while (fr.read() != -1) {
				System.out.println((char) fr.read());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
```

+
	+ �����غ��� **exam03.txt** ������ ��������� ���� �� �� �ִ�.
	+ ������ �������� �ʱ� ������ �ڵ����� ���������.

>

+
	+ **exam03.txt** ������ �����.
	+ abcdebcdaTestTeFileReader:::�ѱ��� �������::: �̷��� ������� ����� �� �� �ִ�.
		+ abcde �κ� : write(char[] cbuf)
		+ bcd �κ� : // write(char[] cbuf, int off, int len)
		+ a �κ� : write(int c)
		+ Test �κ� : // write(String str)
		+ Te �κ� : // write(String str, int off, int len)
		+ FileReader::: �κ� : write(String str)
		+ �ѱ��� �������::: �κ� : write(String str)
	+ ���� �� ������ �Ǿ���. **������ ������ �о����**
	