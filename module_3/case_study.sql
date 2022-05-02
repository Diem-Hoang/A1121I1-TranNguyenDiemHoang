create database if not exists `case_study`;
 use `case_study`;
 
 -- drop database case_study;
 create table `vi_tri`(
 ma_vi_tri int primary key,
 ten_vi_tri varchar(45)
 );
 
create table `trinh_do`(
ma_trinh_do int primary key,
ten_trinh_do varchar(45)
);

create table `bo_phan`(
ma_bo_phan int primary key,
ten_bo_phan varchar(45)
);

create table `nhan_vien`(
ma_nhan_vien int primary key,
ho_ten varchar(45),
ngay_sinh date,
so_cmnd varchar(45),
luong double,
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
ma_vi_tri int, 
ma_trinh_do int,
ma_bo_phan int,
foreign key(ma_vi_tri) references vi_tri(ma_vi_tri),
foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key(ma_bo_phan) references bo_phan(ma_bo_phan)
);

create table loai_khach(
ma_loai_khach int primary key,
ten_loai_khach varchar(45)
);

create table `khach_hang`(
ma_khach_hang int primary key,
ma_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
gioi_tinh BIT(1),
so_cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(ma_loai_khach) references loai_khach(ma_loai_khach)
);

create table kieu_thue(
ma_kieu_thue int primary key,
ten_kieu_thue varchar(45)
);

create table loai_dich_vu(
ma_loai_dich_vu int primary key,
ten_loai_dich_vu varchar(45)
);

create table dich_vu(
ma_dich_vu int primary key,
ten_dich_vu varchar(45),
dien_tich int,
chi_phi_thue double,
so_nguoi_toi_da int,
tieu_chuan_phong varchar(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_ho_boi double,
so_tang int,
ma_kieu_thue int,
ma_loai_dich_vu int,
foreign key(ma_kieu_thue) references kieu_thue(ma_kieu_thue),
foreign key(ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
);

create table `hop_dong`(
ma_hop_dong int primary key,
ngay_lam_hop_dong datetime,
ngay_ket_thuc datetime,
tien_dat_coc double,
ma_nhan_vien int,
ma_khach_hang int,
ma_dich_vu int,
foreign key(ma_nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key(ma_khach_hang) references khach_hang(ma_khach_hang),
foreign key(ma_dich_vu) references dich_vu(ma_dich_vu)
);

create table dich_vu_di_kem(
ma_dich_vu_di_kem int primary key,
ten_dich_vu_di_kem varchar(45),
gia double,
don_vi varchar(10),
trang_thai varchar(45)
);

create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int primary key,
ma_hop_dong int,
ma_dich_vu_di_kem int,
so_luong int,
foreign key(ma_hop_dong) references hop_dong(ma_hop_dong),
foreign key(ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);

-- 2. hiển thị thông tin tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự
select * from nhan_vien
where (ho_ten like "h%" or ho_ten like "t%" or ho_ten like "k%") and char_length(ho_ten) <= 15;

-- 3. hiển thị thông tin tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”
select * from khach_hang
where (year(now()) - year(ngay_sinh) between 18 and 50) and (dia_chi like "%đà nẵng" or dia_chi like "%quảng trị");

-- 4. đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần
--    kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng 
--    chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”
select k.ma_khach_hang, k.ho_ten, count(h.ma_khach_hang) as so_lan_dat_phong from khach_hang k
inner join hop_dong h on k.ma_khach_hang = h.ma_khach_hang
where k.ma_loai_khach = 1
group by h.ma_khach_hang
order by so_lan_dat_phong;

-- 5. hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá) cho tất cả các khách hàng đã từng đặt phòng
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra)
select khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, hop_dong.ma_hop_dong, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, 
sum(dich_vu.chi_phi_thue + ifnull((dich_vu_di_kem.gia * hop_dong_chi_tiet.so_luong), 0)) as tong_tien from khach_hang
left join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
left join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
left join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by hop_dong.ma_hop_dong
order by khach_hang.ma_khach_hang;
 
-- 6. hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu 
-- tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3)
select dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.chi_phi_thue, `type`.ten_loai_dich_vu from dich_vu dv
left join loai_dich_vu `type` on dv.ma_loai_dich_vu = `type`.ma_loai_dich_vu
where dv.ma_dich_vu not in 
(select dv.ma_dich_vu from hop_dong hd
inner join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
where (month(hd.ngay_lam_hop_dong) between 1 and 3) and (year(hd.ngay_lam_hop_dong) = 2021))
order by dv.chi_phi_thue DESC;

-- 7. hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
-- tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021
select dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.so_nguoi_toi_da, dv.chi_phi_thue, `type`.ten_loai_dich_vu from dich_vu dv
join loai_dich_vu `type` on dv.ma_loai_dich_vu = `type`.ma_loai_dich_vu
where (dv.ma_dich_vu in (select hd.ma_dich_vu from hop_dong hd where (year(hd.ngay_lam_hop_dong) = 2020) )) 
and (dv.ma_dich_vu not in (select hd.ma_dich_vu from hop_dong hd where (year(hd.ngay_lam_hop_dong) = 2021) ));

-- 8. hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau
-- học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

-- cach 1
select kh.ho_ten from khach_hang kh
group by kh.ho_ten;

-- cach 2
select kh.ho_ten from khach_hang kh
where kh.ho_ten not in 
(select kh.ho_ten from khach_hang kh
group by kh.ho_ten 
having count(kh.ho_ten) > 1 );

-- cach 3
select distinct kh.ho_ten from khach_hang kh;

-- 9. thực hiện thống kê doanh thu theo tháng
-- nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng
select month(hd.ngay_lam_hop_dong) as thang, count(hd.ma_hop_dong) as so_luong_khach_hang from hop_dong hd
where year(hd.ngay_lam_hop_dong) = 2021
group by thang
order by thang; 

-- 10. hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm
-- kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem)
select hd.ma_hop_dong, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, hd.tien_dat_coc, sum(hdct.so_luong) as so_luong_dich_vu_di_kem from hop_dong hd
join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
group by hd.ma_hop_dong
order by hd.ma_hop_dong;

-- 11. hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”
select dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
join hop_dong hd on hdct.ma_hop_dong = hd.ma_hop_dong
join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
join loai_khach lk on kh.ma_loai_khach = lk.ma_loai_khach
where (lk.ten_loai_khach like "Diamond") and (kh.dia_chi like "%Vinh" or kh.dia_chi like "%Quảng Ngãi");

-- 12. hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem)
-- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021
select  hd.ma_hop_dong, nv.ho_ten as ho_ten_nhan_vien, kh.ho_ten as ho_ten_khach_hang, kh.so_dien_thoai as sdt_khach_hang, dv.ma_dich_vu, dv.ten_dich_vu, sum(hdct.so_luong) as so_luong_dich_vu_di_kem, hd.tien_dat_coc from hop_dong hd
left join nhan_vien nv on hd.ma_nhan_vien = nv.ma_nhan_vien
left join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
left join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
left join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
where hd.ngay_lam_hop_dong in(
select hd.ngay_lam_hop_dong from hop_dong hd
where (month(hd.ngay_lam_hop_dong) between 10 and 12) and (year(hd.ngay_lam_hop_dong) = 2020))
and hd.ngay_lam_hop_dong not in(
select hd.ngay_lam_hop_dong from hop_dong hd
where (month(hd.ngay_lam_hop_dong) between 1 and 6) and (year(hd.ngay_lam_hop_dong) = 2021))
group by hd.ma_hop_dong
order by hd.ma_hop_dong;

-- 13. hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng
-- lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau
select dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem, sum(hdct.so_luong) as so_luong_dich_vu_di_kem from dich_vu_di_kem dvdk
left join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
group by hdct.ma_dich_vu_di_kem
having sum(hdct.so_luong) >= all(select sum(hdct.so_luong) from hop_dong_chi_tiet hdct group by hdct.ma_dich_vu_di_kem);

-- 14. hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất
-- thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem)
select hd.ma_hop_dong, ldv.ten_loai_dich_vu, dvdk.ten_dich_vu_di_kem, count(hdct.ma_dich_vu_di_kem) as so_lan_su_dung from hop_dong hd
left join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
left join loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
left join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
left join dich_vu_di_kem dvdk on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
group by hdct.ma_dich_vu_di_kem
having so_lan_su_dung = 1
order by hd.ma_hop_dong;

-- 15. hiển thi thông tin tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021
select nv.ma_nhan_vien, nv.ho_ten, td.ten_trinh_do, bp.ten_bo_phan, nv.so_dien_thoai, nv.dia_chi from nhan_vien nv
left join trinh_do td on nv.ma_trinh_do = td.ma_trinh_do
left join bo_phan bp on nv.ma_bo_phan = bp.ma_bo_phan
left join hop_dong hd on nv. ma_nhan_vien = hd.ma_nhan_vien
where year(hd.ngay_lam_hop_dong) between 2020 and 2021
group by hd.ma_nhan_vien
having (count(hd.ma_hop_dong) <= 3)
order by nv.ma_nhan_vien;

-- 16. xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021
set sql_safe_updates = 0;
delete from nhan_vien nv
where nv.ma_nhan_vien not in
(select hd.ma_nhan_vien from hop_dong hd
where year(hd.ngay_lam_hop_dong) between 2019 and 2021);
set sql_safe_updates = 1;

-- 17. cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng 
-- với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ
update khach_hang kh
join loai_khach lk on kh.ma_loai_khach = lk.ma_loai_khach
join hop_dong hd on kh.ma_khach_hang = hd.ma_khach_hang
join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
join dich_vu_di_kem dvdk on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
set kh.ma_loai_khach = 1
where kh.ma_loai_khach = 2 and year(hd.ngay_lam_hop_dong) = 2021 and (dv.chi_phi_thue + hdct.so_luong * dvdk.gia) > 10000000;

-- 18. xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng)

