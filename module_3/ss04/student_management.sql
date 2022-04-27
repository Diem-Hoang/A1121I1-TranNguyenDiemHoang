CREATE DATABASE quan_ly_sinh_vien;
USE quan_ly_sinh_vien;
CREATE TABLE Class
(
    ClassID   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ClassName VARCHAR(60) NOT NULL,
    StartDate DATETIME    NOT NULL,
    `Status`    BIT
);
CREATE TABLE Student
(
    StudentId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    StudentName VARCHAR(30) NOT NULL,
    Address     VARCHAR(50),
    Phone       VARCHAR(20),
    `Status`      BIT,
    ClassId     INT         NOT NULL,
    FOREIGN KEY (ClassId) REFERENCES Class (ClassID)
);
CREATE TABLE `Subject`
(
    SubId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubName VARCHAR(30) NOT NULL,
    Credit  TINYINT     NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
    Status  BIT                  DEFAULT 1
);

CREATE TABLE Mark
(
    MarkId    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubId     INT NOT NULL,
    StudentId INT NOT NULL,
    Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE (SubId, StudentId),
    FOREIGN KEY (SubId) REFERENCES Subject (SubId),
    FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);

-- hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from student where StudentName like "h%";

-- hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12
select * from class where month(StartDate) = 12;

-- hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5
select * from `subject` where credit between 3 and 5;

-- thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2
update `student` set ClassID = 2 where StudentName = 'Hung' and StudentID = 1;

-- hiển thị các thông tin: StudentName, SubName, Mark
-- dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần

select StudentName, SubName, Mark from student
inner join mark on student.StudentId = mark.StudentId
inner join `subject`on `subject`.SubId = mark.SubId
order by mark DESC, StudentName ASC;

-- hiển thị số lượng sinh viên ở từng nơi
select address as "Địa chỉ", count(studentid) as "Số lượng sinh viên" from student
group by address;

-- tính điểm trung bình các môn học của mỗi học viên
select s.StudentId, s.StudentName, avg(mark) as "Avg Mark" from student s
inner join mark m on s.StudentId = m.StudentId
group by s.StudentId, s.StudentName;

-- hiển thị những bạn học viên có điểm trung bình các môn học lớn hơn 15
select s.studentid, s.studentname, avg(mark) from student s
inner join mark m on s.studentid = m.studentid
group by s.studentid, s.studentname
having avg(mark) > 15;

-- hiển thị thông tin các học viên có điểm trung bình lớn nhất
select s.studentid, s.studentname, avg(mark) from student s
inner join mark m on s.studentid = m.studentid
group by s.studentid, s.studentname
having avg(mark) >= all(select avg(mark) from mark group by studentid);

-- hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất
select s.*, max(credit) as "Max Credit" from subject s
group by s.SubId
having max(credit) >= all(select max(credit) from `subject` group by s.SubId);

-- hiển thị các thông tin môn học có điểm thi lớn nhất
select s.subname, max(mark) as Max from `subject` s
inner join mark m on s.SubId = m.SubId
group by s.SubId
having max(mark) >= all(select max(mark) from mark group by s.SubId);

-- hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.*, avg(mark) as "Point Average" from student s
inner join mark m on s.StudentId = m.StudentId
group by s.StudentId
order by avg(mark) DESC;
