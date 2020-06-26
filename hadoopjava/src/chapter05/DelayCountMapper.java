package chapter05;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import common.AirlinePerformanceParser;

public class DelayCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

	private String workType;
	
	private final static IntWritable outputValue = new IntWritable(1);
	
	private Text outputKey = new Text();
	
	@Override
	public void setup(Context context) {
		workType = context.getConfiguration().get("workType");
	}
	
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		AirlinePerformanceParser parser = new AirlinePerformanceParser(value);
		
		if(parser.getDepartureDelayTime() > 0) {
			outputKey.set(parser.getYear() + "," + parser.getMonth());
			context.write(outputKey, outputValue);
		}
		else if(workType.equals("arrival")) {
			if(parser.getArriveDelayTime()>0) {
				outputKey.set(parser.getYear()+","+parser.getMonth());
				context.write(outputKey, outputValue);
			}
		}
	}
}
