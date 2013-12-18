

import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class ParameterizedTypeTest {
	public Map<Integer, String> map;
	public List<Integer> list;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws SecurityException, NoSuchFieldException {
		ParameterizedType pt = (ParameterizedType) GenericTest.class.getField("map").getGenericType();
		System.out.println(pt.getActualTypeArguments().length);
		System.out.println(pt.getActualTypeArguments()[0]+","+pt.getActualTypeArguments()[1]);
		ParameterizedType pt2 = (ParameterizedType) GenericTest.class.getField("list").getGenericType();
		System.out.println(pt2.getActualTypeArguments().length);
		System.out.println(pt2.getActualTypeArguments()[0]);
		
		System.out.println(new Date().getYear());
	}

}
