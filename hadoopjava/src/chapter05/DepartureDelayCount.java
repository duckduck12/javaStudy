package chapter05;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Job;

public class DepartureDelayCount {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		
		if(args.length != 2) {
			System.err.println("Usage : DepartureDelayCount <input> <input>");
			System.exit(2);
		}
		
		Job job = new Job(conf, "DepartureDelayCount");
	}

}
