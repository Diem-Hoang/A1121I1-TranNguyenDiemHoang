create database convert_erd;
use convert_erd;

create table phieu_xuat(
so_px int primary key auto_increment,
ngay_xuat date
);

create table phieu_nhap(
so_pn int primary key auto_increment,
ngay_nhap date
);

create table vat_tu(
ma_vat_tu int primary key auto_increment,
ten_van_tu varchar(45)
);

create table nhacc(
ma_ncc int primary key auto_increment,
ten_ncc varchar(45),
dia_chi varchar(45),
sdt varchar(45)
);

create table dondh(
so_dh int primary key auto_increment,
ngay_dh date,
ma_ncc int,
foreign key(ma_ncc) references nhacc(ma_ncc)
);

create table sdt(
ma_sdt int primary key auto_increment,
sdt varchar(45),
ma_ncc int,
foreign key(ma_ncc) references nhacc(ma_ncc)
);

create table phieu_xuat_vat_tu(
don_gia_xuat varchar(45),
so_luong_xuat int,
so_px int,
ma_vat_tu int,
primary key(so_px,ma_vat_tu),
foreign key(so_px) references phieu_xuat(so_px),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table vat_tu_don_dh(
ma_vat_tu int,
so_dh int,
primary key(ma_vat_tu,so_dh),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_dh) references dondh(so_dh)
);

create table vat_tu_phieu_nhap(
don_gia_nhap varchar(45),
so_luong_nhap int,
ma_vat_tu int,
so_pn int,
primary key(ma_vat_tu,so_pn),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_pn) references phieu_nhap(so_pn)
);

