# IO_Assist_Buffer

### ������Ʈ��

> ��Ʈ���� ����� ����Ű�ų� ���ο� ����� �߰��ϱ� ���� ���
���� ��Ʈ���� ���� �����͸� �ְ� �޴� ��Ʈ���� �ƴϱ� ������
����� ó�� �Ұ���
��� ��Ʈ���� ���� ������ �� �̸� �̿��Ͽ� ���� ��Ʈ�� ����

+ ���� ��Ʈ�� ����
	+ ���ں�ȯ ������Ʈ��
		+ �ҽ� ��Ʈ���� ����Ʈ ��� ��Ʈ�������� �����Ͱ� ������ ��� ���
		+ Reader�� Writer�� ���� ������ ������� �ϱ� ������ �����Ͱ� ������ ��� ����Ʈ ��� ��Ʈ������ ���ϰ� ��� ����
		+ ����Ʈ��� ��Ʈ���� �����͸� ������ ���ڵ��� ���ڵ����ͷ� ��ȯ���ش�.
		+ InputStreamReader / OutputStreamWriter
	+ ������� ������Ʈ��
		+ ���� �ӵ��� ���� ����� ���ɿ� ������ ��ġ�� ����� �ҽ��� �̿��ϴ� ��� ���
		+ ����� �ҽ��� ���� �۾����� �ʰ� ���ۿ� �����͸� ��� �Ѳ����� �۾��� �Ͽ� ���� ���� ���
		+ ���۶�? :���� ���� ������� ��Ƽ� �Ѳ����� ���� �� �� �ֵ��� ���ִ� �ӽ� �����
		+ BufferedInputStream / BufferedOutputStream / BufferedReader / BufferedWriter
	+ �⺻Ÿ�� ����� ������Ʈ��
		+ �⺻ �ڷ��� �� ������ �а� ���Ⱑ �����ϵ��� ��� ����
		+ ��, �Էµ� �ڷ����� ������ ��µ� �ڷ����� ���� ��ġ
		+ DataInputStream / DataOutputStream
	+ ��ü �����
		+ ��ü�� ���� �Ǵ� ��Ʈ��ũ�� ����� �� �� �ִ� ��� ����
		+ ��, ��ü�� ���ڰ� �ƴϹǷ� ����Ʈ ��� ��Ʈ������ �����͸� �������ִ� ����ȭ �ʼ�
		+ ObjectInputStream / ObjectOutputStream
		
		
### ����ȭ�� ������ȭ
+ ����ȭ(Seralization)
	+ Serializable �������̽��� implements �Ͽ� ����
	+ ��ü ����ȭ �� private  �ʵ带 ������ ��� �ʵ带 ����Ʈ�� ��ȯ
	+ transientŰ���带 ����� �ʵ�� ����ȭ���� ����
	
+ ������ȭ(Deserialization)
	+ ����ȭ�� ��ü�� ������ȭ�� ���� ����ȭ ���� ���� ���� Ŭ���� ���
	+ ��, Ŭ���� �̸��� ������ Ŭ���� ������ ����� ��� ������ȭ ����
	
	
	
# ������Ʈ���� �������!!

### ���ں�ȯ ������Ʈ��
> ## OutputStreamWriter

+ 
	+ ���� ������Ʈ���� ����ϴ� ����� �˾ƺ���.
	+ �켱 ��ݽ�Ʈ���� �����Ͽ� ������ �޾ƿ´�. 
	+ �׸��� ��ݽ�Ʈ���� �Ű������� �ϴ� ������Ʈ���� �����Ѵ�.
	+ API�� ���캸�� 
		+ Characters written to it are encoded into bytes using a specified charset. ==> ������ ���� ��Ʈ�� ����Ͽ� ����Ʈ�� ���ڵ��ȴٰ� �Ѵ�.
	+ UTF-8�� ���ڵ����Ѽ� ��½�������.
	
```JAVA
	public void byteStringSave() {
		try {
			FileOutputStream fos = new FileOutputStream("byteString.txt");
			OutputStreamWriter osr = new OutputStreamWriter(fos, "UTF-8");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
```

+
	+ ��� ��Ʈ���� �����ϰ� ������Ʈ���� �����Ͽ���.
	+ try-with-resource������ �ٲٰ� ������Ʈ���� �Ű������� ��ݽ�Ʈ���� �ٷ� �־�����.
	
```JAVA
	public void byteStringSave() {
		try (OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("byteString.txt"), "UTF-8");) {
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
```

+
	+ isr�� ������ ����.
	+ ������ ���������� close()�� ���� ����ó���� ���־���Ѵ�.
	
```JAVA
	public void byteStringSave() {
		try (OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("byteString.txt"), "UTF-8");) {
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
```

+
	+ ������Ʈ���� �̿��Ͽ� ������ ������ ����(���) �غ���.
	+ ��¿��� write()�޼ҵ带 ������ָ� �ȴ�.
	+ write()�޼ҵ�� ���������� �����ε��� �Ǿ������� �̹����� String �����θ� ������� ���̴�.
	
```JAVA
	public void byteStringSave() {
		try (OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("byteString.txt"),"UTF-8");) {
			osr.write("�ȳ��ϼ���\n");
			osr.write("�ݰ����ϴ�\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
```
+
	+ �����ϰ� ��µǴ� ������ Ȯ���غ���. 
	+ �� ������ �Ǿ���. ���� ������ �о�ͺ���
	
> ## InputStreamReader

+
	+ InputStreamReader�� ����ؼ� ������ �о��.

```JAVA
	public void byteStringOpen() {
		FileInputStream fis = new FileInputStream("byteString.txt");
		InputStreamReader isr = new InputStreamReader(fis);
	}
```
+
	+ try-with-resource���� ����ϰ� ����ó���� ��� ������.
	
```JAVA
	public void byteStringOpen() {
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("byteString.txt"), "UTF-8");) {
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
```
+
	+ FileInputStream�� ���������� ���� �о�� ����.
	
```JAVA
	public void byteStringOpen() {
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("byteString.txt"), "UTF-8");) {
			int value = 0;
			while ((value = isr.read()) != -1) {
				System.out.print((char) value + " ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
```
	
+
	+ int value�� �������ִ� ������ read()�� ��ȯ ���� int���̰� **��ȸ��**�̱� ������ �ѹ� �о�� ���� ����������Ѵ�.
	+ char������ **Casting** ���־� �о�´�.
	+ ��������� �� �� �� �� �� (����) �� �� �� �� �� 
	+ �� �о���� ���� Ȯ�� �� �� �ִ�.

### ������� ������Ʈ��
> ## BufferedWriter

+
	+ ������� ��������� ���� ������Ʈ���� ����� ������ ����غ���.
	+ BufferedOutputStream�� ����� �� ������ �츮�� ���ڿ��� ����ϱ� ���ؼ� writer�� ����غ���
	+ BufferedOutputStream�� ����Ͽ� ������ ����غ���.
	
```
	public void bufferedSave() {
		FileWriter fw = new FileWriter("buffered.txt");
		BufferedWriter bw = new BufferedWriter(fw);
	}

```

+
	+ try-with-resource���� ����ϰ� ����ó���� ��� ������.
	
```
	public void bufferedSave() {
		FileWriter fw;
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"));) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
```
	
+ 
	+ ������ ����ϱ� ���� write()�� ����Ѵ�
	+ API�� ���� BufferedOutputStream�� String�� �Ű������� �ϴ� write()�� �������� �ʴ´�.
	+ 