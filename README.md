# hadoopProject-Local
# 本地运行mapreduce方法
- 解压hadoop-2.7.3.tar.gz文件包
- 将https://github.com/z127/hadoop-common-2.7.1-bin 中的winutils.exe和winutils.lib文件放入D:\hadoop-2.7.3\hadoop-2.7.3\bin文件中
- 将https://github.com/z127/hadoop-common-2.7.1-bin 文件中的hadoop.dll放入C:\Windows\System32中
- 设置HADOOP_HOME为D:\hadoop-2.7.3\hadoop-2.7.3
- 在代码main中设置本地模式
         System.setProperty( "hadoop.home.dir", "D:\\hadoop-2.7.3\\hadoop-2.7.3");
            Configuration conf = new Configuration();
            conf.set("fs.defaultFS","file:///");
