import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 컴퓨터 가장 느린 작업(IO 파일에 대한 read.write) : disk를 건드리는 작업
1. File 작업 (disk를 직접 쓰고 읽어서 느리다) >> byte 단위 >> byte를 묶어 보내면 되겠네..!

 문제해결)
 Buffer메모리(쌓아두고 한번에 ) 적절한 크기가 중요
 
 
 2. 고민하지마 그냥 Buffer 써!
 3. File I/O 성능을 개선해준다.
 4. Line단위의 처리가 가능해진다.(엔터기반)
 5. JAVA API
 //보조 스트림: 독자적으로 new를 할수 없다. (Parameter 강제)
 BufferedInputStream buffer = new BufferedInputStream();
 default 생성자를 구현하지 않다.. overloading만 구현
 BufferedOutputStream
 
 BufferedInputStream*InputStream in) > InputStream 을 상속 구현한 객체의 주소
 
 */

public class Ex04_Stream_file_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt"); //파일생성기능을 가지고 있다.
			bos = new BufferedOutputStream(fos);
			
			for(int i=0; i<10; i++) {
				bos.write('A');
			}
			
			//궁굼한점
			//buffer 도대체 언제 파일에 write합니까
			//java buffer : 8kbyte -> 8192byte
			
			//1.buffer 안에 내용이 채워지면 자동으로 비운다. (꽉차면)
			//2.buffer를 강제로 비우는 방법 : flush() : 강제로 비우는 함수,
			//3. bos.close() : close하면 내부적으로 flush를 호출한다.
			// 즉: flush만 된다는 것..
			
			bos.flush();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			try {
				bos.close(); //flush호출한 다음 자원해제
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
