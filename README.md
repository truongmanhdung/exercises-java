# exercises-java


# Sự khác nhau giữa Abstract class và Interface

Abstract class và interface đều được sử dụng để có được sự trừu tượng mà ở đó chúng ta có thể khai báo các phương thức trừu tượng. 


* Abstract class

1) Abstract class có phương thức abstract (không có thân hàm) và phương thức non-abstract (có thân hàm).
2) Abstract class không hỗ trợ đa kế thừa.
3) Abstract class có các biến final, non-final, static and non-static.
4) Abstract class có thể cung cấp nội dung cài đặt cho phương thức của interface.
5) Từ khóa abstract được sử dụng để khai báo abstract class.
6) Ví dụ:
public abstract class Shape {
public abstract void draw();
}

* Interface

1) Interface chỉ có phương thức abstract. Từ java 8, nó có thêm các phương thức default và static.
2) Interface có hỗ trợ đa kế thừa
3) Interface chỉ có các biến static và final.
4) Interface không thể cung cấp nội dung cài đặt cho phương thức của abstract class.
5) Từ khóa interface được sử dụng để khai báo interface.
6) Ví dụ:
public interface Drawable {
void draw();
}
