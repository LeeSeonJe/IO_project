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
	+ 
	