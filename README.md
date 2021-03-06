# OOPJAVA
-class, object, attribute, method.

*Phạm vi truy cập: 
Truy cập bên trong class | Truy cập bên trong package | Truy cập bên ngoài package bởi class con | Truy cập bên ngoài class và không thuộc class con
- private: Y | N | N | N
~ default: Y | Y | N | N
# protected: Y | Y | Y | N
+ public: Y | Y | Y | Y

*Constructor: hàm tạo
- Nếu không khai báo Constructor thì chương trình tự tạo ra lớp Constructor mặc định
- Constructor có tham số, hoặc không tham số
- NOTE: Nếu dùng từ khóa private để khai báo thì sẽ không khởi tạo được đối tượng của lớp
- NOTE: một lớp khai báo constructor rồi thì chương trình không tự sinh ra constructor mặc định nữa

*Sơ đồ lớp:
- private
~ default
# protected
+ public

*từ khóa this:
-truy xuất thuộc tính

*Biến static:
- có thể sử dụng mà không cần khởi tạo đối tượng
- được chia sẻ bởi tất cả đối tượng trong chương trình(giống PI trong lớp Math)
- không được coi là thuộc tình vì không thuộc đối tượng nào

*Phương thức static:
- sử dụng mà không cần khởi tạo đối tượng
- Trong cùng một lớp, phương thức static chỉ thể gọi tới phương thức static, không thể gọi non-static
- Trong cùng một lớp, phương thức static không thể gọi tới các thuộc tính không phải static

*Nạp chồng phương thức:
- Một lớp có nhiều phương thưc cùng tên nhưng khác nhau về kiểu dữ liệu hoặc các tham số

*Tính đóng gói (Encapsulation):
- Che dấu thông tin
- Truy xuất thuộc tính thông qua getter và setter

*Tính kế thừa (Inheritance):
- Tái sử dụng code
- Tăng khả năng mở rộng chương trình
- Java không hỗ trợ đa kế thừa
- sử dụng từ khóa "extends"

- Lớp con không thể truy cập thuộc tính private của lớp cha mà phải thông qua các getter và setter
- Constructor của lớp con luôn gói tới Constructor mặc định của lớp cha
- Dùng "super" để gọi tới constructor của lớp cha
- "super" tham chiếu lớp cha, "this" tham chiếu lớp hiện tại

- Ghi đè phương thức sử dụng "@Override" để kiểm tra xem thực sự có ghi đè lên phương thức của lớp cha không nếu sai tên hàm sẽ báo lỗi
- "@Override" giúp người đọc hiểu được đây là phương thức ghi đề từ phương thức cha
- Phương thức static sẽ không thể bị ghi đè, với các phương thức non-static thêm từ khóa final để không bị ghi đề
- Để ghi đè phương thức của lớp cha thì lớp con phải có phạm vi truy cập rộng hơn: private -> default -> protected -> public 

*Tính đa hình (Polymorphism):
- Đa hình với nạp chồng phương thức
- Đa hình với ghi đè phương thức
- Đa hình thông qua các đối tượng đa hình

- Variabel hiking: là thuộc tính giống nhau ở cả lớp con và lớp cha
	+ a.x (truy xuất thuộc tính lớp cha)
	+ ((ChildClass)a).x (truy xuất thuộc tính lớp con)

*Tính trừu tượng (Abstract):
- Là một tính chất mà chỉ tập trung vào những tính năng của đối tượng và ẩn đi những thông tin không cần thiết.
- Tập trung vào tính năng thay vì quan tâm vào cách thực hiện

- khai báo từ khóa "abstract" để khai báo lớp trừu tượng
- Lớp trừu tượng có thể có các phương thức trừu tượng (chỉ có phần khai báo không có phần thân)
- Nếu một lớp được kế thừa từ lớp trừu tượng thì lớp đó phải ghi đè tất cả các phương thức trừu tượng
- Abstract là trừu tượng không hoàn toàn (vẫn có thể khai báo thuộc tính, phương thức có phần thân)

*Interface: trừu tượng hoàn toàn
- Được dùng để lưu trữ các phương thức trừu tượng và các biến hằng số:
	+không thể khởi tạo được đối tượng của interface mà chỉ khởi tạo đối tượng của lớp kế thừa từ interface
	+Tất cả phương thức trong interface được trình biên dịch hiểu là phương thức trừu tượng, biến được hiểu là hằng số
	+Một lớp có thể kế thừa nhiều interface 
	+Kế thừa interface bằng từ khóa "implements"
