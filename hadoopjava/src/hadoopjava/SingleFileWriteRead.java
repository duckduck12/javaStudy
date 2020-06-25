package hadoopjava;



import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class SingleFileWriteRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length!=2) {
			System.err.println("Usage : SingleFileWriteRead <filename> <contents>");
			System.exit(2);
			// 상수 인자로 프로그램 종료 
		}
		
		try {
			// 파일 시스템 제어 객체 생성 
			Configuration conf = new Configuration();
			FileSystem hdfs = FileSystem.get(conf);
			
			// 경로 체크 
			Path path = new Path(args[0]);
			if(hdfs.exists(path)) {
				hdfs.delete(path, true);
			}
			
			// 파일 저장 
			FSDataOutputStream outStream = hdfs.create(path);
			outStream.writeUTF(args[1]);
			outStream.close();
			
			// 파일 출력 
			FSDataInputStream inputStream = hdfs.open(path);
			String inputString = inputStream.readUTF();
			inputStream.close();
			
			System.out.println("## inputString : " + inputString);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
