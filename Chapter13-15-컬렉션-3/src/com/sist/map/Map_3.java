package com.sist.map;

import java.util.HashMap;
import java.util.Map;

// 클래스 관리
interface I {
	
	public void execute();
}
class A implements I {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("A : execute() Call...");
	}
	
}
class B implements I {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("B : execute() Call...");
	}
	
}
class C implements I {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("C : execute() Call...");
	}
	
}
class D implements I {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("D : execute() Call...");
	}
	
}
// Spring
class Container {
	
	Map<String, I> map = new HashMap<String, I>();
	// XML => class, id
	public Container() {
		
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		map.put("d ", new D());
	}
	public I getBean(String key) {
		
		return map.get(key);
	}
}
public class Map_3 {
	
	public static void main(String[] args) {
		
		Container c = new Container();
		
		I i = c.getBean("a");
		i.execute();

		i = c.getBean("b");
		i.execute();

		i = c.getBean("c");
		i.execute();
		
		i = c.getBean("d");
		i.execute();
		
	}

}
