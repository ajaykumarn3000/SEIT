interface printable {
    void print();
}
class Interface implements printable {
    public void print() {
        System.out.println("Hello");
    }
    public static void main(String args[]){
         Interface obj = new Interface();
        obj.print();
    }
}