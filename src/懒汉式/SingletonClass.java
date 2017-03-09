package 懒汉式;

public class SingletonClass {

	//保存唯一的实例
	private static SingletonClass ONLY;
	//屏蔽外部的new
	private SingletonClass(){
		
	}
	//提供一个全家的访问点
	public synchronized static SingletonClass getInstance(){
		if(ONLY==null){
			//...
			ONLY=new SingletonClass();
		}
		//...其他代码
		return ONLY;
	}
	
	public void f(){
		System.out.println("hahha");
	}
	
}
