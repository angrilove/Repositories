package org.anshen.mdb;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBAddress;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class Demo {

	public static final String driver = "";
	public static final String url = "";
	public static final String user = "";
	public static final String pwd = "";
	
	public static void main(String[] args) {
		try {
			Mongo server = new Mongo(new DBAddress("localhost:27017/test"));
			DB db =server.getDB("test");
			db.authenticate("admin", new char[]{'1', '2', '3', '4', '5', '6'});
			System.out.println(db.isAuthenticated());
			DBCollection unicorns = db.getCollection("unicorns");
			List<DBObject> list = new ArrayList<DBObject>();
			for (int i = 0; i < 100000; i++) {
				DBObject o = new BasicDBObject();
				o.put("name", "Horny");
				o.put("dob", new Date());
				o.put("loves", new String[]{"carrot", "papaya"});
				o.put("weight", 600);
				o.put("gender", "m");
				o.put("vampires", 63);
				list.add(o);
			}
			Date start = new Date();
			unicorns.insert(list);
			Date end = new Date();
			System.err.println("INSERT===============================================::"
					+ (end.getTime() - start.getTime())
					+ "===========::COUNT:::" + unicorns.count());
			
			/*start = new Date();
			long count = 0;
			DBCursor cursor = unicorns.find();
			while(cursor.hasNext()) {
				//System.out.println(cursor.next());
				cursor.next();
				count++;
			}*/
			/*
			end = new Date();
			
			System.err.println("FIND===============================================::" + (end.getTime() - start.getTime()) 
					+ "======:::COUNT::" + count);
			DBObject o = new BasicDBObject();
			o.put("json", "");
			start = new Date();
			o = unicorns.findOne(o);
			end = new Date();
			System.err.println("FIND_ONE===============================================::" + (end.getTime() - start.getTime()) );
			start = new Date();
			unicorns.remove(o);
			end = new Date();
			System.err.println("REMOVE===============================================::" + (end.getTime() - start.getTime()) );
			*/
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
