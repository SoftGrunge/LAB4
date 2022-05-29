package university;

public class Main {

    public static void main(String[] args) {
	booleanArr array = new booleanArr();
	biteArr bArray = new biteArr();
	array.set(9);
		System.out.println(array.get(10));
		System.out.println(array.get(9));
	array.invert(4);
	array.drop(3);
	array.set(5, true);
		System.out.println("33"+ array.get(1));

        System.out.println(array.count());
		System.out.println(array.toString());
		bArray.set(3);
		bArray.invert(2);
		bArray.drop(3);
		bArray.set(6, true);
		System.out.println("33333 "+ bArray.count());
		System.out.println(bArray.toString());
    }
}
