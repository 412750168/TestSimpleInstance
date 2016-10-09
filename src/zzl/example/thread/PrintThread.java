package zzl.example.thread;

import java.util.List;

import android.content.Intent;
import zzl.example.activity.FirstActivity;
import zzl.example.application.MainApplication;
import zzl.example.db.Child;
import zzl.example.db.DBManager;
import zzl.example.db.Person;
import zzl.example.util.LogUtil;
import zzl.example.util.StringUtil;

public class PrintThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i< 10;i++)
			System.out.println(StringUtil.getIntance().getHelloWorld());
		/*Intent intent = new Intent(MainApplication.getInstance(), FirstActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		MainApplication.getInstance().startActivity(intent);*/
		
		operateDb();
	}
	
	private void operateDb(){
		  DBManager dbManager = new DBManager(MainApplication.getInstance());
	        Person person = new Person("zi", 28, "user");
	        Person person2 = new Person("yu", 18, "wife");
	        Person person3 = new Person("wu", 30, "doctor");

	        dbManager.add(person);
	        dbManager.add(person2);
	        dbManager.add(person3);

	        Child child = new Child("yi", 12, "男");
	        Child child2 = new Child("hang", 13, "女");
	        dbManager.addChild(child);
	        dbManager.addChild(child2);

	        //dbManager.updateAge(person2);

	        List<Person> persons = dbManager.query();
	        List<Child> childs = dbManager.queryChild();

	        //  List<Person> persons = dbManager.queryTest(null,"28","name","sum(age)>80",null);
	        // DESC/ASC: limit:start,count

	        // List<Person> persons = dbManager.queryTest(null,"28","name","sum(age)> 50","_id asc","1,1");

	        for (Person per : persons) {
	            LogUtil.LogDebug(MainApplication.class, per.toString());
	        }
	        for (Child ch : childs)
	            LogUtil.LogDebug(MainApplication.class, ch.toString());
	}
}
