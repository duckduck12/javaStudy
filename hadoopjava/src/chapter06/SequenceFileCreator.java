package chapter06;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.SequenceFileOutputFormat;

import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import common.AirlinePerformanceParser;

public class SequenceFileCreator extends Configured implements Tool {

	static class DistanceMapper extends MapReduceBase implements Mapper<LongWritable, Text, IntWritable, Text>{

		private IntWritable outputKey = new IntWritable();
		
		@Override
		public void map(LongWritable key, Text value, OutputCollector<IntWritable, Text> output, Reporter reporter)
				throws IOException {
			// TODO Auto-generated method stub
			try {
				AirlinePerformanceParser parser = new AirlinePerformanceParser(value);
				if(parser.isDistanceAvailable()) {
					outputKey.set(parser.getDistance());
					output.collect(outputKey, value);
				}
			}
			catch (ArrayIndexOutOfBoundsException ae) {
				// TODO: handle exception
				outputKey.set(0);
				output.collect(outputKey, value);
				ae.printStackTrace();
			}
			catch (Exception e) {
				// TODO: handle exception
				outputKey.set(0);
				output.collect(outputKey, value);
				e.printStackTrace();
			}
			
		}
		
	}
	
	@Override
	public int run(String[] arg0) throws Exception {
		// TODO Auto-generated method stub
		JobConf conf = new JobConf(SequenceFileCreator.class);
		conf.setJobName("SequenceFileCreator");
		
		conf.setMapperClass(DistanceMapper.class);
		conf.setNumReduceTasks(0);
		
		// 여기까지 했다. 
		FileInputFormat.setInputPaths(conf, new Path(arg0[0]));
		FileOutputFormat.setOutputPath(conf, new Path(arg0[1]));
		
		conf.setOutputFormat(SequenceFileOutputFormat.class);
		
		conf.setOutputKeyClass(IntWritable.class);
		
		conf.setOutputValueClass(Text.class);
		
		JobClient.runJob(conf);
		
		return 0;
	}
	
	public static void main(String[] args) throws Exception {
		int res = ToolRunner.run(new Configuration(), new SequenceFileCreator(), args);
		System.err.println("MR-Job Result : " + res);
	}
	

}
