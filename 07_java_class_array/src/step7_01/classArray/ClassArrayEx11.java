package step7_01.classArray;

/*

	# 제네릭(Generic)
	
	- 클래스 내부에서 사용하는 데이터의 타입(Type)을 
	  클래스의 인스턴스를 생성할 때 결정하는 것을 의미한다.
	  
	- 객체의 타입을 컴파일 시점에 체크하기 때문에 
	  타입 안정성을 높이고 형 변환의 번거로움을 줄일 수 있다.

*/

class Employee {}
class Manager {}
class Supervisor {}

class GenericEx<T> {
	
	Object[] arr = new Object[3];
	int cnt = 0;
	
	void add(T data) {
		arr[cnt++] = data;
	}
	
	T get(int index) {
		return (T)arr[index];
	}
	
}

public class ClassArrayEx11 {

	public static void main(String[] args) {
		
		// 예시 1) ArrayList<E>
		// 예시 2) HashMap<K,V>
		
		GenericEx<Employee> emplyeeList = new GenericEx<Employee>();
		GenericEx<Manager> managerList = new GenericEx<Manager>();
		GenericEx<Supervisor> supervisorList = new GenericEx<Supervisor>();
		
		emplyeeList.add(new Employee());
		emplyeeList.add(new Employee());
		emplyeeList.add(new Employee());
		
		managerList.add(new Manager());
		managerList.add(new Manager());
		managerList.add(new Manager());
		
		supervisorList.add(new Supervisor());
		supervisorList.add(new Supervisor());
		supervisorList.add(new Supervisor());
		
		System.out.println(emplyeeList.get(0));
		System.out.println(emplyeeList.get(1));
		System.out.println(emplyeeList.get(2));
		System.out.println();
		
		System.out.println(managerList.get(0));
		System.out.println(managerList.get(1));
		System.out.println(managerList.get(2));
		System.out.println();
		
		System.out.println(supervisorList.get(0));
		System.out.println(supervisorList.get(1));
		System.out.println(supervisorList.get(2));
		System.out.println();
		
	}

}
