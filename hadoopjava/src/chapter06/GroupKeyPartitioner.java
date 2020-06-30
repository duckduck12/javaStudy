package chapter06;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Partitioner;

public class GroupKeyPartitioner extends Partitioner<DateKey, IntWritable>{

	@Override
	public int getPartition(DateKey key, IntWritable val, int numParitions) {
		
		int hash = key.getYear().hashCode();
		int partition = hash % numParitions;
		return partition;
		
	}
}
