USE quanlynhansu;
SELECT*FROM PHONGBAN;
SELECT*FROM BANGLUONG;
SELECT*FROM NHANVIEN;
SELECT*FROM HOPDONGLAODONG;

-- 1. Lập danh sách nhân viên vào làm việc tại công ty từ ngày 8/3/2021.Danh sách sẽ bao gồm: Mã nhân viên, Họ tên, Ngày sinh, Quê quán, Số điện thoại, Chức vụ, Ngày vào công ty, Tên bộ phận (nếu có) --

SELECT MaNV AS 'Mã nhân viên', HoTen AS 'Họ tên', Ngaysinh AS 'Ngày sinh', QueQuan AS 'Quê quán', NHANVIEN.SoDienThoai AS 'Số điện thoại;', ChucVu AS 'Chức vụ', NgayVao AS 'Ngày bắt đầu', TenPB AS 'Phòng ban' 
FROM NHANVIEN,PHONGBAN
WHERE NgayVao >= '2021/03/08' AND NHANVIEN.MaPB=PHONGBAN.MaPB;

-- 2. Danh sách thông tin nhân viên kí hợp đồng chính thức sau ngày 01/03/2018.Danh sách sẽ bao gồm: Mã nhân viên, Họ tên, Ngày sinh, Quê quán, Số điện thoại, Chức vụ, Ngày vào công ty, Tên bộ phận (nếu có), Ngày kí hợp đồng chính thức.--

SELECT NHANVIEN.MaNV AS 'Mã nhân viên', HoTen AS 'Họ tên', Ngaysinh AS 'Ngày sinh', QueQuan AS 'Quê quán', NHANVIEN.SoDienThoai AS 'Số điện thoại;', ChucVu AS 'Chức vụ', NgayVao AS 'Ngày bắt đầu', TenPB AS 'Phòng ban', TuNgay AS 'Ngày ký hợp đồng chính thức'
FROM NHANVIEN,PHONGBAN,HOPDONGLAODONG
WHERE TuNgay>'2021/03/01' AND LoaiHD='Chính thức' AND NHANVIEN.MaPB=PHONGBAN.MaPB;

-- 3. Ai là trưởng phòng của phòng Hành chính? Thông tin gồm có: Mã nhân viên, Họ tên, Ngày sinh, Quê quán, Số điện thoại, Chức vụ, Ngày vào công ty, Lương cơ bản, Phụ cấp.--

SELECT NHANVIEN.MaNV AS 'Mã nhân viên', NHANVIEN.HoTen AS 'Họ tên', NHANVIEN.Ngaysinh AS 'Ngày sinh', NHANVIEN.QueQuan AS 'Quê quán', NHANVIEN.SoDienThoai AS 'Số điện thoại', NHANVIEN.ChucVu AS 'Chức vụ', NHANVIEN.NgayVao AS 'Ngày bắt đầu', BANGLUONG.LuongCoBan AS 'Lương cơ bản', BANGLUONG.PhuCap AS 'Phụ cấp'
FROM NHANVIEN
INNER JOIN PHONGBAN ON PHONGBAN.MaPB=NHANVIEN.MaPB AND PHONGBAN.TenPB='Phòng Hành Chính'
INNER JOIN BANGLUONG ON BANGLUONG.MaBangLuong=NHANVIEN.MaBangLuong AND NHANVIEN.ChucVu='Trưởng Phòng';

-- 4. Tính tổng số nhân viên hiện nay của phòng kế hoạch. Thông tin hiển thị gồm: Tên phòng ban và số lượng nhân viên của phòng ban.--

SELECT PHONGBAN.TenPB AS ' Tên Phòng Ban', COUNT(NHANVIEN.MaNV) AS 'Số Lượng Nhân Viên'
FROM PHONGBAN,NHANVIEN
WHERE PHONGBAN.TenPB='Phòng Kế Hoạch' AND NHANVIEN.MaPB=PHONGBAN.MaPB;

-- 5. Liệt kê danh sách nhân viên đã làm việc trên 4 năm. Thông tin hiển thị gồm: Mã nhân viên, Họ tên, Ngày sinh, Quê quán, Số điện thoại, Chức vụ, Ngày vào công ty, Tên bộ phận (nếu có), số năm làm việc tính đến thời điểm hiện tại.

SELECT MaNV AS 'Mã nhân viên', HoTen AS 'Họ tên', Ngaysinh AS 'Ngày sinh', QueQuan AS 'Quê quán', NHANVIEN.SoDienThoai AS 'Số điện thoại;', ChucVu AS 'Chức vụ', NgayVao AS 'Ngày bắt đầu', TenPB AS 'Phòng ban'
FROM NHANVIEN,PHONGBAN
WHERE NHANVIEN.MaPB=PHONGBAN.MaPB AND (YEAR(CURDATE())-(YEAR(NHANVIEN.NgayVao))>4);

-- 6. Sửa thông tin ngày sinh của nhân viên có mã nhân viên là 31019  thành 15/3/1988. Thông tin hiển thị gồm: Mã nhân viên, Họ tên, Ngày sinh, Quê quán, Số điện thoại, Chức vụ, Ngày vào công ty, Tên bộ phận (nếu có).--

UPDATE NHANVIEN
SET NgaySinh='1988/03/15'
WHERE MaNV='31019';
SELECT MaNV AS 'Mã nhân viên', HoTen AS 'Họ tên', Ngaysinh AS 'Ngày sinh', QueQuan AS 'Quê quán', NHANVIEN.SoDienThoai AS 'Số điện thoại;', ChucVu AS 'Chức vụ', NgayVao AS 'Ngày bắt đầu', TenPB AS 'Phòng ban' 
FROM NHANVIEN,PHONGBAN
WHERE MaNV='31019' AND NHANVIEN.MaPB=PHONGBAN.MaPB;

-- 7. Tìm kiếm tất cả nhân viên có tên là Nam. Thông tin hiển thị gồm: Mã nhân viên, Họ tên, Ngày sinh, Quê quán, Số điện thoại, Chức vụ, Ngày vào công ty, Tên bộ phận (nếu có).--
SELECT MaNV AS 'Mã nhân viên', HoTen AS 'Họ tên', Ngaysinh AS 'Ngày sinh', QueQuan AS 'Quê quán', NHANVIEN.SoDienThoai AS 'Số điện thoại;', ChucVu AS 'Chức vụ', NgayVao AS 'Ngày bắt đầu', TenPB AS 'Phòng ban' 
FROM NHANVIEN,PHONGBAN
WHERE RIGHT(NHANVIEN.HoTen,3)='Nam' AND NHANVIEN.MaPB=PHONGBAN.MaPB;

-- 8. Xóa nhân viên có mã nhân viên là 31030 ra khỏi cơ sở dữ liệu--
DELETE FROM NHANVIEN
WHERE MaNV='31030';
SELECT*FROM NHANVIEN
WHERE MaNV='31030';

-- 9. Lập danh sách thống kê tổng số nhân viên theo quê quán của mỗi phòng ban.Thông tin danh sách sẽ bao gồm: Tên phòng ban, Tỉnh thành, Số lượng nhân viên.

SELECT PHONGBAN.TenPB AS 'Phòng ban', QueQuan AS 'Tỉnh thành',COUNT(NHANVIEN.MaNV) AS 'Số lượng nhân viên'
FROM NHANVIEN,PHONGBAN
WHERE NHANVIEN.MaPB=PHONGBAN.MaPB
GROUP BY PHONGBAN.TenPB,NHANVIEN.QueQuan
ORDER BY COUNT(NHANVIEN.MaNV) ASC;

-- 10. Tính trung bình mức lương (lương cơ bản + phụ cấp) của mỗi phòng ban trong công ty. Thông tin sẽ bao gồm: Tên phòng ban, mức lương trung bình.--

SELECT PHONGBAN.TenPB AS 'Tên bộ phận', AVG(BANGLUONG.LuongCoBan + BANGLUONG.PhuCap) AS 'Lương trung bình'
FROM PHONGBAN
INNER JOIN NHANVIEN ON PHONGBAN.MaPB = NHANVIEN.MaPB
INNER JOIN BANGLUONG ON BANGLUONG.MaBangLuong = NHANVIEN.MaBangLuong
GROUP BY PHONGBAN.TenPB;