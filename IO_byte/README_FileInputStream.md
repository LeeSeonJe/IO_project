# byteDAO
> ## - IO_byte Summary

>> - ����Ʈ ��� ��Ʈ��

>>> - �Է� ��Ʈ�� 

>>>> - �ֻ��� Ŭ���� : InputStream
>>>> - ���� Ŭ���� : XXXInputStream

>>> - ��� ��Ʈ��

>>>> - �ֻ��� Ŭ���� : OutputStream
>>>> - ���� Ŭ���� : XXXOutputStream


>> #### FileInputStream // ������ �޾ƿ���.
>> ```
public void fileOpen() {
		FileInputStream fis = new FileInputStream("exam02_byte.txt");
	}

>> 
- �Ű������� ������ �о�´�
- IO�� ����ϱ� ���ؼ��� **����ó��**�� �� ������Ѵ�.

>>
- FileInputStream �ڵ带 ���캸��
- (Ctrl + Ŭ��)�� ����ؼ� Ȯ�����ش�.

>> ``` 
public FileInputStream(String name) throws FileNotFoundException

>>
- throws FileNotFoundException ����ó���� ������ �ִ�.
- try~catch���� ����Ͽ� ����ó���� ������.
 
>> ```
public class ByteDAO {
	public void fileOpen() {
		try {
			FileInputStream fis = new FileInputStream("exam02_byte");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


>>
- ���콺�� ȣ���ϸ� �ڵ����� try~catch���� �ۼ����ش�.





