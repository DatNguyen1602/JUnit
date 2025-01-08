JUnitTest Nguyễn Tiến Đạt 22IT-SE1.

Đề bài: Kiểm thử đơn vị cho lớp Calculator

Yêu cầu:
Tạo lớp Calculator với các phương thức:

+ int add(int a, int b): Tính tổng của hai số.

+ int subtract(int a, int b): Tính hiệu của hai số.

+ int multiply(int a, int b): Tính tích của hai số.

+ int divide(int a, int b): Tính thương của hai số (nếu b = 0, ném ra ArithmeticException).

Viết các test case sử dụng JUnit để kiểm thử các phương thức trên. Đảm bảo:

+ Test các trường hợp cơ bản.

+ Xử lý ngoại lệ khi b = 0 trong phương thức divide.
 

## Mục tiêu của dự án
Dự án này nhằm cung cấp một lớp Java đơn giản, `Calculator`, để thực hiện các phép tính cơ bản như cộng, trừ, nhân, và chia. Nó phục vụ như một bài học thực hành về lập trình hướng đối tượng và kiểm thử đơn vị với JUnit trong Java.

---

## Cách sử dụng

Dưới đây là ví dụ minh họa cách sử dụng các phương thức trong lớp `Calculator`:

### Mã ví dụ:
```java
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("5 - 3 = " + calculator.subtract(5, 3));
        System.out.println("4 * 2 = " + calculator.multiply(4, 2));

        try {
            System.out.println("8 / 2 = " + calculator.divide(8, 2));
            System.out.println("8 / 0 = " + calculator.divide(8, 0));
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
```

### Kết quả đầu ra:
```
2 + 3 = 5
5 - 3 = 2
4 * 2 = 8
8 / 2 = 4
Lỗi: Cannot divide by zero
```

---

## Hướng dẫn cài đặt

### Yêu cầu:
- **Java**: Phiên bản 8 trở lên
- **Maven**: Quản lý dependencies
- IDE như **IntelliJ IDEA**, **Eclipse**, hoặc **NetBeans**

### Các bước cài đặt:
1. Clone hoặc tải mã nguồn từ kho lưu trữ:
   ```bash
   git clone <repository-url>
   cd CalculatorProject
   ```

2. Thêm thư viện **JUnit 5** vào dự án:
   - **Với Maven**: Thêm vào file `pom.xml`:
     ```xml
     <dependencies>
         <dependency>
             <groupId>org.junit.jupiter</groupId>
             <artifactId>junit-jupiter</artifactId>
             <version>5.9.0</version>
             <scope>test</scope>
         </dependency>
     </dependencies>
     ```
  

3. Biên dịch và chạy dự án:
   - Maven: `mvn compile`

---

## Kiểm thử

### Hướng dẫn chạy kiểm thử
Các bài kiểm thử được viết bằng **JUnit 5** và đặt trong thư mục `src/test/java`. Để chạy kiểm thử:

- **Sử dụng IDE**:
  1. Nhấp chuột phải vào file `CalculatorTest.java`.
  2. Chọn "Run Tests" hoặc tương đương.

- **Sử dụng Maven**:
  ```bash
  mvn test
  ```

### Ý nghĩa của các bài kiểm thử
1. Đảm bảo các phép tính cơ bản (`add`, `subtract`, `multiply`, `divide`) hoạt động chính xác.
2. Kiểm tra xử lý ngoại lệ khi chia cho 0, đảm bảo chương trình không bị lỗi nghiêm trọng.

---

## Contributing Guide

Nếu bạn muốn đóng góp vào dự án (mã nguồn mở):
1. Fork dự án trên GitHub.
2. Tạo một nhánh mới cho tính năng hoặc sửa lỗi của bạn:
   ```bash
   git checkout -b feature/new-feature
   ```
3. Thực hiện các thay đổi và commit chúng:
   ```bash
   git commit -m "Add new feature"
   ```
4. Gửi pull request (PR) đến nhánh chính của dự án.

### Quy tắc đóng góp
- Viết mã sạch, tuân thủ theo các quy tắc coding standards.
- Viết test case cho tất cả các tính năng mới.
- Cung cấp mô tả chi tiết khi tạo pull request.

---

Cảm ơn bạn đã quan tâm đến dự án!

![Screenshot 2025-01-07 102107](https://github.com/user-attachments/assets/9bc97448-2cd2-4372-b9d6-a122094f0bd3)
