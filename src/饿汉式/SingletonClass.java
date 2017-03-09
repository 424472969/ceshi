package 饿汉式;

public class SingletonClass {
	//创建唯一的实例
	private static final SingletonClass ONLY=new SingletonClass();
	//屏蔽外部的new
	private SingletonClass(){
		
	}
	//提供一个全家的访问点
	public static SingletonClass getInstance(){
		//...其他代码
		return ONLY;
	}
	
	public void f(){
		System.out.println("hahha");
	}
}
