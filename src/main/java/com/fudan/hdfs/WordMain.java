package com.fudan.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
public class WordMain {
    public static void main(String[] args) throws Exception {

        System.setProperty( "hadoop.home.dir", "D:\\hadoop-2.7.3\\hadoop-2.7.3");
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","file:///");
        String[] otherArgs = new GenericOptionsParser(conf, args)
                .getRemainingArgs();
        Job job = new Job(conf, "word count");
        job.setJarByClass(WordMain.class);
        job.setMapperClass(WordMapper.class);
        job.setCombinerClass(WordReducer.class);
        job.setReducerClass(WordReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, new Path("file:///D:/TestDemo///words.txt "));
        FileOutputFormat.setOutputPath(job, new Path("file:///D:/TestDemo///output.txt"));
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
