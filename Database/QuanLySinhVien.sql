CREATE DATABASE IF NOT EXISTS QuanLySinhVien
CHARACTER SET utf8mb4
COLLATE utf8mb4_general_ci;

use QuanLySinhVien;

CREATE TABLE sinhvien (
    id int NOT NULL AUTO_INCREMENT,
    ho_dem varchar(45) DEFAULT NULL,
    ten varchar(45) DEFAULT NULL,
    email varchar(45) DEFAULT NULL,
    PRIMARY KEY (id)
)
ENGINE=InnoDB
AUTO_INCREMENT=1
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

INSERT INTO sinhvien  (ho_dem, ten, email)
VALUES 
	(N'Nguyễn', N'Văn A', 'vana@gmail.com'),
    (N'Trần', N'Thị B', 'thib@gmail.com'),
    (N'Lê', N'Văn C', 'vanc@gmail.com'),
    (N'Phạm', N'Thị D', 'thid@gmail.com'),
    (N'Huỳnh', N'Văn E', 'vane@gmail.com'),
    (N'Nguyễn', N'Thị F', 'thif@gmail.com'),
    (N'Trần', N'Văn G', 'vang@gmail.com'),
    (N'Lê', N'Thị H', 'thih@gmail.com'),
    (N'Phạm', N'Văn I', 'vani@gmail.com'),
    (N'Huỳnh', N'Thị K', 'thik@gmail.com');
    
select * from sinhvien
where ho_dem like N'Nguyễn%';

select count(id) as SL_SinhVien
from sinhvien
where email like '%@gmail.com';

select * from sinhvien
order by ten desc, ho_dem desc;

SET SQL_SAFE_UPDATES = 0;
UPDATE sinhvien
SET email = 'ivan@gmail.com'
WHERE email = 'vani@gmail.com';

DELETE FROM sinhvien
WHERE id = (
    SELECT MAX(id)
    FROM sinhvien
);

CREATE TABLE users (
	username varchar(50) primary key,
    password varchar(100) not null,
	enabled tinyint not null
);

create table authorities(
	username varchar(50) not null,
    authority varchar(50) not null,
    unique key (username, authority),
    constraint fk_username foreign key (username) references users(username)
);

-- DELETE FROM users;
insert into users values 
	('tung', '{bcrypt}$2a$12$qPw38qNo2/OlQh56vLxwtO/9iEyWnu4aTVaJhtMU6PmQQUQQTFA4O', 1),
    ('quoc', '{bcrypt}$2a$12$EEEmfCSWNXwn8KZqaccsm.7UEmWrroVM.0YsLG0cIuEJzfujnoBl2', 1),
    ('kiet', '{bcrypt}$2a$12$duxVEtgxU/O37RCiE5zMM.wUufQ7uVgGeiAdP/pYlJQveKmzWWAB2', 1);

-- DELETE FROM authorities;
insert into authorities values 
	('tung', 'ROLE_TEACHER'),
    ('quoc', 'ROLE_MANAGER'),
    ('kiet', 'ROLE_ADMIN');























































