package lin;

public class FengZhuang {
private String name;
private int age;
private String address;
private String hobby;
public String getName() {
	return name;
}
public void  setName(String name ) {
	this.name=name;
}
public int getAge(){
return age;

}
public void setAge(int age) {
	this.age=age;
}
public String getAddress(){
	return address;
}
public void setAddress(String address){
	this.address=address;
}
public String getHobby(){
	return hobby;
}
public void setHobby(String hobby){
	this.hobby=hobby;
}
public String  introduceSelf(){
	return "我叫："+name+"\n"+"今年："+age+"岁"+"\n"+"住在："+address+"\n"+"兴趣是："+hobby;

}
public static void  main(String[] args) {
	FengZhuang fengZhuang=new FengZhuang();
	fengZhuang.setName("小强");
	fengZhuang.setAge(20);
	fengZhuang.setAddress("广东");
	fengZhuang.setHobby("游泳");
	System.out.println(fengZhuang.introduceSelf());
}




}
