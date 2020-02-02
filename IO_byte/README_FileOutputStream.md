# byteDAO
> ## - IO_byte Summary

>> - ����Ʈ ��� ��Ʈ��

>>> - �Է� ��Ʈ�� 

>>>> - �ֻ��� Ŭ���� : InputStream
>>>> - ���� Ŭ���� : XXXInputStream

>>> - ��� ��Ʈ��

>>>> - �ֻ��� Ŭ���� : OutputStream
>>>> - ���� Ŭ���� : XXXOutputStream

>> #### FileOutputStream // ������ ���� �� ��������.
>> ```
public void fileSave() {
		FileOutputStream fos = new FileOutputStream("exam02_byte.txt");
	}

>>
- �Ű������� ���Ͽ� ���� �����Ѵ�. **��, ������ ���� �� ������Ų��.**
- IO�� ����ϱ� ���ؼ��� **����ó��** �� �� ������Ѵ�.

>>
- FileOutputStream �ڵ带 ���캸��
- (Ctrl + Ŭ��)�� ����ؼ� Ȯ�����ش�.

>> ```
public FileOutputStream(String name) throws FileNotFoundException

>>
- throws FileNotFoundException ����ó���� ������ �ִ�.
- try~catch���� ����Ͽ� ����ó���� ������.

>> ```
public void fileSave() {
		try {
			FileOutputStream fos = new FileOutputStream("exam02_byte.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
>> 
- ���콺�� ȣ���ϸ� �ڵ����� try~catch���� �ۼ����ش�.
- API - FileOutputStream - Constructors �κ��� ���� **FileOutputStream(File file, boolean append)** �ڿ� boolean append�� �ٴ� Constructors�� �����Ѵ�.
- �̴� ������ �����ϰų� ���鶧 **�ڵ����� �����**�� �Ǵ� ���� ����� �ʰ� �̾ �� �ְ� ���ִ� Constructors�̴�.

>>
- ������ ���� ���ؼ��� write()�޼ҵ带 ����� �� �ִ�.
- API�� ���캸�� 

>>> 
- **write(byte[] b)** : ����Ʈ �迭�� ����� ���� �����Ѵ�.
- **write(byte[] b, int off, int len)** : ����Ʈ �迭�� �ε��� �����̴�. **������ ������ �׻� �������� �ʴ´�**
- **write(int b)** : ���� �� �ϳ��� �����Ѵ�.
- �ϳ��� �����غ���.

>> ```
public void fileSave() {
		try {
			FileOutputStream fos = new FileOutputStream("exam02_byte.txt");
			// int �� ����
			fos.write(97);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
>>
- write(int b) : ���� �־��� �� Unhandled exception type IOException ����ó���� ���ֶ�� �޼����� ���´�.
- write() �ȿ� ���� �ҽ��� ���캸��

>>```
public void write(int b) throws IOException {

>>
- IOException ����ó���� ������ ���� �� �� �ִ�.
- ���콺�� ȣ���Ͽ� try~catch���� ó������ ���� FileNotFoundException �ؿ��� ���� �Ἥ ������. ��ø try���� �ǹǷ� �׷���.

>>```
public void fileSave() {
		try {
			FileOutputStream fos = new FileOutputStream("exam02_byte.txt");
			// int �� ����
			fos.write(97);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
>>
- ������ byte �迭�� �ϳ� �����ؼ� �����غ����� ����.

>>```
public void fileSave() {
		try {
			FileOutputStream fos = new FileOutputStream("exam02_byte.txt");	
			fos.write(97); // int �� ����	
			byte[] b = new byte[] { 'a', 'b', 'c', 'd', 'e' }; // byte �迭 ����		
			fos.write(b); // �迭 ��ü ����
			fos.write(b, 1, 3); // �迭 �ε��� ���� ����	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
>>
- ����� ���� Ȯ���� ����. 
- ������Ʈ ��Ŭ�� > refresh�� ���ָ� ������ �����Ǿ� ���� ���̴�.
- ������ �����ϸ� ����⶧���� ����ؼ� ���� ���� ���̸� *���ϸ� �ڿ� true�� �ٿ��ָ� �̾ �ٿ��� ��*�̴�.

>>
- ������ ������ ����.
- aabcdebcd �̷��� ������ �Ǿ� ���� ���̴�.

>>> 
- a : ù��° int 97��
- abcde : �迭 ��ü�� ���� ��
- bcd : �迭 �ε��� ������ ���� ��

>>
- �� ����Ǵ� ���� Ȯ���ߴ�. ���� ������ �����.
