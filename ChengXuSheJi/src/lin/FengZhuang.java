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
	return "�ҽУ�"+name+"\n"+"���꣺"+age+"��"+"\n"+"ס�ڣ�"+address+"\n"+"��Ȥ�ǣ�"+hobby;

}
public static void  main(String[] args) {
	FengZhuang fengZhuang=new FengZhuang();
	fengZhuang.setName("Сǿ");
	fengZhuang.setAge(20);
	fengZhuang.setAddress("�㶫");
	fengZhuang.setHobby("��Ӿ");
	System.out.println(fengZhuang.introduceSelf());
}




}
