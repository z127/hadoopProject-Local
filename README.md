# hadoopProject-Local
1.解压hadoop-2.7.3文件包
2.https://github.com/z127/hadoop-common-2.7.1-bin中的winutils.exe和winutils.lib文件放入D:\hadoop-2.7.3\hadoop-2.7.3\bin文件中
3.将https://github.com/z127/hadoop-common-2.7.1-bin文件中的hadoop.dll放入C:\Windows\System32中
4.设置hadoop_home为D:\hadoop-2.7.3\hadoop-2.7.3
5.在代码main中设置本地模式
         System.setProperty( "hadoop.home.dir", "D:\\hadoop-2.7.3\\hadoop-2.7.3");
            Configuration conf = new Configuration();
            conf.set("fs.defaultFS","file:///");
