package com.test;

import java.text.ParseException;

public class Test {
	public static void main(String[] args) throws ParseException {
		//Calendar cal=Calendar.getInstance();
		/* cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		  //����һ�����ڣ����������й������ı����յ�����
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
		  
		  System.out.println(new SimpleDateFormat("YYYY��MM��dd��").format(weekEndDate));*/
		 /*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //����ʱ���ʽ  
         Calendar cal = Calendar.getInstance();  
         Date time=sdf.parse("2016-12-25 23:20:47");
         cal.setTime(time);  
         System.out.println("Ҫ��������Ϊ:"+sdf.format(cal.getTime())); //���Ҫ��������  
         
         //�ж�Ҫ����������Ƿ������գ���������һ����������ģ����������⣬���㵽��һ��ȥ��  
         int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//��õ�ǰ������һ�����ڵĵڼ���  
         if(1 == dayWeek) {  
            cal.add(Calendar.DAY_OF_MONTH, -1);  
         }  
         
        cal.setFirstDayOfWeek(Calendar.MONDAY);//����һ�����ڵĵ�һ�죬���й���ϰ��һ�����ڵĵ�һ��������һ  
        
        int day = cal.get(Calendar.DAY_OF_WEEK);//��õ�ǰ������һ�����ڵĵڼ���  
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//���������Ĺ��򣬸���ǰ���ڼ�ȥ���ڼ���һ�����ڵ�һ��Ĳ�ֵ   
        System.out.println("����������һ�����ڣ�"+sdf.format(cal.getTime()));
        
        cal.add(Calendar.DATE, 6);
        System.out.println("�����������յ����ڣ������޸�"+sdf.format(cal.getTime()));  */
		System.out.println("���ɺͷ�֧1�޸��Լ���֧2�޸�");
        
	}
}
