package tinhtruutuong;

abstract class Shape {
    String color;
//    Shape (String color){
//        this.color = color;
//    }
    abstract double area(); // phương thức abstract
    String getColor(){
        return this.color;
    }
}
