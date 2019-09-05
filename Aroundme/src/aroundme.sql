create database aroundme;
use aroundme;
create table automobiles(Name varchar(20),Address varchar(30),standard varchar(20),description varchar(100),state varchar(20));
create table banquets(Name varchar(20),Address varchar(30),standard varchar(20),description varchar(100),state varchar(20));
create table medicalstores(Name varchar(20),Address varchar(30),standard varchar(20),description varchar(100),state varchar(20));
insert into banquets values ('Gardenia','Sector 10 Sonipat','Low','Remote location-Veg and Non veg food-High capacity farm','Haryana'),
('Manali Palace','Manali','High -->4/5','Best loaction and sight seeing - Good and traditional food','Himachal'),
('Manglam palace','Sector 32 Peeragri','Medium-->2/5 star','Knwon for veg food - has a low capacity-ac rooms avilable to stay','Delhi'),
('Royal Pepper','Sector 8 Rohini','High --5/5','Near Metro-Veg and Non veg -Ac rooms avilable to stay','Delhi');
insert into medicalstores values('Appolo Pharmacy','Rohini sector 16 - Delhi','High--->5/5','Medicines easily avilable-Good discout rates','Delhi'),
('Helth care','Sector 24 kharar -Punjab','Medium-->3/5','Alternative for many exp medicines','Punjab'),
('Jackson','Peeragri sector 10- Delhi','Medium-->4/5','Home deleviery avilable above order of 250','Delhi'),
('Medi Care','Sector 10 Fazilpur-Sonipat','Medium-->3/5','Lack rare medicines','Hariyana'),
('We Care','Mall Road Manali- Manali','High-->5/5','If living near one can schedule medicines and take memberships','Himachal');
insert into automobiles values ('Car Doctors','Sector 12 -chandni chowk','Medium-->3/5','Have less spare parts','Old Delhi'),
('Highway workers','G-T Karnal road','Low-->2/5','Have unprofessional workers-good for urgent works','Haryana'),
('Kavya Motors','secotr 18-Mohali-Chand','Medium-->4/5','Trained mechanics - They lack on call service','Chandigarh'),
('Mounatin Rideres','Kullu Valley-Manali','High-->5/5','only located automobile repair in span of 50kms','Himachal'),
('Santro Services','Dc Chowk -Rohini-Delhi','High-->5/5','Good wrokers','Delhi');