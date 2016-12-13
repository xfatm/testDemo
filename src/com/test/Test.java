package com.test;

import java.text.ParseException;

public class Test {
	public static void main(String[] args) throws ParseException {
		//Calendar cal=Calendar.getInstance();
		/* cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		  //增加一个星期，才是我们中国人理解的本周日的日期
		  cal.add(Calendar.WEEK_OF_YEAR, 1);*/
		/*Date startTime=new Date();
		startTime.setYear(2016);
		startTime.setMonth(11);
		startTime.setDate(25);
		Calendar cal=Calendar.getInstance();
		cal.setTime(startTime);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		cal.add(Calendar.WEEK_OF_YEAR, 1);
		Date weekEndDate=cal.getTime();
		weekEndDate.setHours(23);
		weekEndDate.setMinutes(59);
		cal=Calendar.getInstance();
		cal.setTime(startTime);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		Date weekStartDate=cal.getTime();
		  
		  System.out.println(new SimpleDateFormat("YYYY年MM月dd日").format(weekEndDate));*/
		 /*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //设置时间格式  
         Calendar cal = Calendar.getInstance();  
         Date time=sdf.parse("2016-12-25 23:20:47");
         cal.setTime(time);  
         System.out.println("要计算日期为:"+sdf.format(cal.getTime())); //输出要计算日期  
         
         //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了  
         int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
         if(1 == dayWeek) {  
            cal.add(Calendar.DAY_OF_MONTH, -1);  
         }  
         
        cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一  
        
        int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值   
        System.out.println("所在周星期一的日期："+sdf.format(cal.getTime()));
        
        cal.add(Calendar.DATE, 6);
        System.out.println("所在周星期日的日期：主干修改"+sdf.format(cal.getTime()));  */
		System.out.println("主干和分支1修改以及分支2修改");
        
	}
}
