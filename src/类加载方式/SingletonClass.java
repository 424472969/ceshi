package 类加载方式;

import java.io.ObjectStreamException;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SingletonClass implements Serializable,Cloneable{
	
	
	//屏蔽外部的new
	private SingletonClass(){
		
	}
	//静态内部类,用于持有唯一的SingletonClass的示例
	private static class OnlyInstanceHolder{
		
		static private SingletonClass ONLY=new SingletonClass();
	}
	//公开的唯一访问点
	public static SingletonClass getInstance(){
		return OnlyInstanceHolder.ONLY;
	}
	//自定义反序列化返回的对象
	private Object readResolve() throws ObjectStreamException{
		return getInstance();
	}
	//自定义克隆返回的对象
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	}
}
