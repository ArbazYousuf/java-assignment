class A {
    public String salary = "123";
    public String designation = "Job";
}

 class B extends A {
    public String salary = "123";
    public String designation = "Job";
}

 class C extends B {
    public static void main(String args[]){
        B obj1 = new B();
        C obj2 = new C();

        System.out.println(obj1.salary);
        System.out.println(obj2.salary);
    }
}