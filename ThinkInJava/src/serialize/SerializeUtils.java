package serialize;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeUtils {

	public static String SerializeObjectToString(Object o) {
		String ret = null;
		try {
			// 序列化后数据流给ByteArrayOutputStream 来保存。
			// ByteArrayOutputStream 可转成字符串或字节数组
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(o);
			byte[] bytes = baos.toByteArray();
			/*
			 * 由于byte[]数组是从ObjectOutputStream之后得来的，那么是不可以new String(buff)的
			 * ，因为其中包含了不可见字符，根本不是一个字符串
			 */
			// 转换成字符串
			ret = new sun.misc.BASE64Encoder().encode(bytes);
			baos.close();
			oos.close();
		} catch (Exception e) {
		}
		return ret;
	}

	public static Object DeSerializeObjectFromString(String str) {
		Object o = null;
		try {
			byte[] bytes = new sun.misc.BASE64Decoder().decodeBuffer(str);
			ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			o = ois.readObject();
			ois.close();
			bais.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return o;
	}

	public static void main(String args[]) {
	}

}
