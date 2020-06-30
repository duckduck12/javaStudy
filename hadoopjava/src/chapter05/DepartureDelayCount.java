package chapter05;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class DepartureDelayCount {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		
		if(args.length != 2) {
			System.err.println("Usage : DepartureDelayCount <input> <input>");
			System.exit(2);
		}
		
		Job job = new Job(conf, "DepartureDelayCount");
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		// 잡클래스 설정 
		job.setJarByClass(DepartureDelayCount.class);
		
		// 매퍼 클래스 설정 
		job.setMapperClass(DepartureDelayCountMapper.class);
		
		// 리듀서 클래스 설정 
		job.setReducerClass(DelayCountReducer.class);
		
		// 입출력 포맷 설정 
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		// 출력키 출력값 유형 설정 
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		// 요청시작 
		job.waitForCompletion(true); 
	}

}
