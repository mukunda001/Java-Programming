class Box {
int length, breadth, height;
// Constructor
Box(int l, int b, int h) {
length = l; breadth = b; height = h;
}
int getVolume() {
return length * breadth * height;
}}
class BoxWeight extends Box {
int weight;
// Constructor using super
BoxWeight(int l, int b, int h, int w) {
super(l, b, h);
weight = w;
}
void display() {
System.out.println("Volume = " + getVolume());
System.out.println("Weight = " + weight);
}
}
public class BoxDemo {
public static void main(String[] args) {
BoxWeight b1 = new BoxWeight(2, 3, 4, 10);
BoxWeight b2 = new BoxWeight(5, 6, 7, 20);
System.out.println("Megh: 79010198");
b1.display();
b2.display();
}
}