# IO_project
- IO_file Summary

```
public class FileController {
	public void method() {
//		���� �����ϱ� file1
		File file1 = new File("exam01.txt");
//		File(URI uri)
//			Creates a new File instance by converting the given 
//			file: URI into an abstract pathname.
//		�Ű������� URL�� �Է��ϸ� ��� �̸����� ������ �����ȴ�.

//		���͸� �����ϱ� file2
		File file2 = new File("C:\\Users\\JE\\Desktop\\mkdir");
		file2.mkdir();
//		���� ��ο� mkdir�̶�� ������ �����Ȱ� �� �� �ִ�.
//		try ~ catch���� ���� �ʿ����.

//		��ο� ���� �� ���� ���� �����ϱ�
		File file3 = new File("C:\\Users\\JE\\Desktop\\mkdir\\mkdir.txt");
//		��� and ���� ����
//		���� file1ó�� @@.txt ó�� ���ϸ� ���������� ��ΰ� ���� �ڹ�������Ʈ �ȿ� �����ȴ�
//		��θ� �������ְ� @@.txt ������ �����ϸ� ��ο� ������ �����ȴ�.
//		�� ���������. :)

//		���ϻ����ϱ�
		File file4 = new File("C:\\Users\\JE\\Desktop\\mkdir\\mkdir.txt");
		try {
//			���� ����
			file1.createNewFile();
			file3.createNewFile();
//			���� ����
			file4.delete();
//			������ ������ ���� Ȯ�� �� �� �ִ�.

//			���� ���翩�� Ȯ���ϱ�
			System.out.println(file1.exists()); // true
			System.out.println(file2.exists()); // true
			System.out.println(file3.exists()); // false
			System.out.println(file4.exists()); // false
//			[boolean : exists()] �޼ҵ�� �Ű������� ������ ��ο� ���� or ���͸��� �����ϴ��� Ȯ���մϴ�.
			System.out.println(file1.isFile()); // true
			System.out.println(file2.isFile()); // false
			System.out.println(file3.isFile()); // false
			System.out.println(file4.isFile()); // false
//			[boolean : isFile()] �޼ҵ�� �Ű������� ������ ����� ������ �Ϲ� �������� Ȯ���մϴ�.

			System.out.println(file1.getName()); // exam01.txt
			System.out.println(file2.getName()); // mkdir
//			[String : getName()] �޼ҵ�� ���ϰ� ���͸��� �̸��� �����ɴϴ�.
			System.out.println(file1.getAbsoluteFile()); // E:\SJ_workspace\git\IO_project\exam01.txt
//			[File : getAbsoluteFile()] �޼ҵ�� �����θ� ��ȯ�մϴ�.
			System.out.println(file1.length()); // 0
//			[long : length()] �޼ҵ�� ������ �뷮�� �����ɴϴ�.
			System.out.println(file1.getParent());
			System.out.println(file2.getParent());
//			[String : getParent()] �޼ҵ�� file�� ���� ������ �����´�. ���������� �������� ������쿡�� null�� ��ȯ�Ѵ�.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		public boolean createNewFile() throws IOException
//		createNEwFile�� IOExceptio�� ���� �޼ҵ�� �����ϹǷ� try ~ catch���� ����������.
	}
}