### Bài tập

Câu 1: Tạo Bảng

````sql
CREATE TABLE post (
    title VARCHAR(250),
    content TEXT,
    created DATETIME,
    author VARCHAR(100),
    category SET('Sport', 'Politics', 'Health', 'Tourism', 'Economy', 'Education', 'Technproductology', 'Science'),
    is_published BOOLEAN
);

CREATE TABLE product (
	name VARCHAR(300),
    descriprion TEXT,
    manufacturer VARCHAR(250),
    madein VARCHAR(100),
    utin_price INT,
    category SET('Quần áo', 'Mỹ phẩm', 'Đồ chơi', 'Dụng cụ học tập', 'Máy tính', 'Di động', 'Điện tự dân dụng', 'Văn phòng')
);