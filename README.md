JUnit - Nguyễn Tiến Đạt 22IT-SE1.
# Student Management Project

## Mục tiêu của dự án
Dự án **Student Management** nhằm cung cấp một hệ thống quản lý sinh viên đơn giản với các tính năng cơ bản như quản lý thông tin sinh viên, tính toán điểm trung bình, và kiểm tra dữ liệu. Đây là một bài tập thực hành để nâng cao kỹ năng lập trình với Java, JUnit, và các công cụ kiểm thử khác. 

## Cách sử dụng
Dưới đây là ví dụ minh họa cách chạy các tính năng chính:

### 1. Tạo đối tượng sinh viên và xem thông tin:
```java
Student student = new Student("123", "John Doe", 3.5);
System.out.println(student.toString());
```
**Output:**
```
Student{id='123', name='John Doe', gpa=3.5}
```

### 2. Kiểm tra thông tin sinh viên:
Sử dụng test cases:
```bash
mvn test
```

### 3. Đo mức độ bao phủ mã nguồn:
```bash
mvn jacoco:report
```
Báo cáo sẽ được tạo tại `target/site/jacoco/index.html`.

---

## Hướng dẫn cài đặt

### Yêu cầu hệ thống:
- **Java**: Phiên bản 17 hoặc cao hơn
- **Maven**: Phiên bản 3.8 hoặc cao hơn
- IDE: IntelliJ IDEA


### Các bước cài đặt:
1. Clone dự án từ repository:
   ```bash
   git clone https://github.com/your-repo/student-management.git
   ```
2. Điều hướng đến thư mục dự án:
   ```bash
   cd student-management
   ```
3. Biên dịch và xây dựng dự án:
   ```bash
   mvn clean install
   ```
4. Chạy ứng dụng:
   ```bash
   mvn exec:java -Dexec.mainClass=com.example.Main
   ```

---

## Kiểm thử

### Chạy test cases:
1. Đảm bảo bạn đã cài đặt Maven.
2. Thực thi lệnh kiểm thử:
   ```bash
   mvn test
   ```
3. Xem kết quả kiểm thử trực tiếp trong terminal hoặc IDE.

### Đo mức độ bao phủ kiểm thử:
1. Chạy kiểm thử và tạo báo cáo JaCoCo:
   ```bash
   mvn jacoco:report
   ```
2. Mở file `target/site/jacoco/index.html` bằng trình duyệt để xem chi tiết.

**Ý nghĩa:**
- Các test cases kiểm tra tính đúng đắn của từng phương thức trong ứng dụng.
- Báo cáo coverage giúp xác định các phần mã nguồn chưa được kiểm thử.

---

## Contributing Guide

Nếu bạn muốn đóng góp cho dự án, hãy làm theo các bước sau:

1. **Fork repository:**
   - Nhấn nút Fork trên GitHub để tạo bản sao của repository về tài khoản của bạn.

2. **Clone repository:**
   - Tải dự án về máy của bạn:
     ```bash
     git clone https://github.com/your-username/student-management.git
     ```

3. **Tạo nhánh mới:**
   - Tạo một nhánh cho tính năng hoặc sửa lỗi mới:
     ```bash
     git checkout -b feature/your-feature-name
     ```

4. **Commit thay đổi:**
   - Ghi lại các thay đổi:
     ```bash
     git add .
     git commit -m "Mô tả thay đổi"
     ```

5. **Gửi Pull Request (PR):**
   - Push nhánh lên GitHub và tạo PR từ repository của bạn về repository chính.

6. **Review:**
   - Chờ phản hồi và hoàn thiện PR theo yêu cầu.

**Lưu ý:**
- Sử dụng JUnit để viết test cases cho các tính năng mới.
- Đảm bảo code của bạn đạt ít nhất 85% coverage trước khi gửi PR.

  ![Screenshot 2025-01-13 075608](https://github.com/user-attachments/assets/a1a7803f-8c2a-4503-ab38-e4a1c29806b9)

