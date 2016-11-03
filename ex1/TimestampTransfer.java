package No1;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 题目要求：
 * 0. 在个人仓库下，创建分支yourname_ex1
 * 1. 在个人分支下，修改Answers.md文件，里面填入当输入为'2016-11-11 11:11:11'时，输出的值是多少
 * 2. 对代码进行注释，说明每行代码的作用，把代码提交到个人分支下
 * 3. 创建pull request，与主仓库的master分支对比
 */
public class TimestampTransfer {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);//新建一个输入函数
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置输入的时间的格式
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//设置输出时间的格式
		while (scanner.hasNext()){
			String line = scanner.nextLine();//将输入的时间enter后传入line中
			Date lineDate = null;//定义一个空的lineDate
			long lineTimestamp;//lineTimestamp为长整形
			try {//异常处理
				lineDate = inputFormat.parse(line);//将输入的时间格式转换后输入linedate
				lineTimestamp = lineDate.getTime();//从1970年到输入的时间过了多少毫秒
				System.out.println(outputFormat.format(lineDate) + " to " + lineTimestamp);//输出格式+to+毫秒
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}