Create database SE1430_PRJ321

Use SE1430_PRJ321
GO

Create table HE141488_account(
	id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	account nvarchar(30) NOT NULL,
	pass nvarchar(30) NOT NULL,
	admin bit NOT NULL,
)
GO

Create table HE141488_user(
	id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	accountId int NOT NULL FOREIGN KEY REFERENCES HE141488_account(id),
	firstName nvarchar(100) NOT NULL,
	lastName nvarchar(100) NOT NULL,
	email nvarchar(100),
	address nvarchar(100),
	phone nvarchar(15),
)
GO

Create table HE141488_category(
	catID int NOT NULL PRIMARY KEY,
	info nvarchar(50) NOT NULL,
)
GO

Create table HE141488_product(
	id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	name nvarchar(100) NOT NULL,
	image nvarchar(100),
	price int CHECK(price > 0),
	size int CHECK(size >0),
	amount int CHECK(amount >=0),
	description nvarchar(MAX),
	title nvarchar(100),
	color nvarchar(30),
	gender bit,
	catID int FOREIGN KEY REFERENCES HE141488_category(catID),
)
GO

Create table HE141488_Cart(
	id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	accountId int NOT NULL FOREIGN KEY REFERENCES HE141488_account(id),
	productId int NOT NULL FOREIGN KEY REFERENCES HE141488_product(id),
	amount int Not Null CHECK (amount>0),
)
GO

Create table HE141488_checkOut(
	id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	accountId int NOT NULL,
	productId int NOT NULL FOREIGN KEY REFERENCES HE141488_product(id),
	amount int Not Null CHECK (amount>0),
	firstName nvarchar(100) NOT NULL,
	lastName nvarchar(100) NOT NULL,
	email nvarchar(100),
	address nvarchar(100),
	phone nvarchar(15),
	cardType nvarchar(20),
	cardNumber nvarchar(20),
	date DATE,
	time TIME
)
GO

INSERT INTO HE141488_account VALUES
('admin','admin1234','1'),
('namnthe141488','loginfun1','0'),
('khongten','khongpass1','0')
GO

INSERT INTO HE141488_user VALUES
(1, 'Nguyen Thanh','Nam','namnthe141488@gmail.com','Viet Tri-Phu Tho',0974485920),
(2, 'Nguyen Thanh','Nam','dungkhond@gmail.com','Viet Tri-Phu Tho',0123456789),
(3, 'Chu Trieu', 'Tung','chuTung@gamil.com','Ha Noi',09887456321)
GO

INSERT INTO HE141488_category VALUES
(1,'Best Seller'),
(2,'Sale Off'),
(3,'Limited'),
(4,'New Arrival')
GO

INSERT INTO HE141488_product VALUES
('Basas Mono-Black - Slip On','image/Basas_Mono-Black_Slip_On.jpg',450000,43,4,N'Vẻ ngoài cổ điển. Chất màu đơn giản cùng phần đế tiệp màu, "ton-sur-ton" với upper. Basas "Mono" Pack hứa hẹn sẽ là một điểm nhấn đầy thú vị cho tủ giày của bạn.','Basas','Black',1,1),
('Air Mag Sneakers','image/Nike-Air_Mag_Sneaker_1000.jpg',616397616,40,1,N'Gần 50 năm sau khi được thành lập vào năm 1971, biểu tượng Swoosh mang tính biểu tượng của Nike vẫn không thay đổi, thể hiện một biểu tượng thịnh hành và tiên phong cho thương hiệu. Có lẽ là đôi giày thể thao được tìm kiếm nhiều nhất mọi thời đại, Nike Mag from Back to the Future Part II được phát hành vào năm 2011 thông qua các cuộc đấu giá giới hạn trên eBay để ủng hộ Quỹ Michael J. Fox. Đôi giày này có mũi giày tròn, đế cao su phẳng, dấu ngoặc kép đặc trưng của Nike, chiều dài ngang bắp chân, dây đeo mắt cá có thương hiệu và chi tiết bắt sáng. Những phong cách này được cung cấp bởi một thị trường giày thể thao và quần áo dạo phố cao cấp. Chỉ dự trữ giày dép và quần áo được tìm kiếm nhiều nhất, họ cung cấp và tuyển chọn một số mặt hàng khó tìm nhất từ khắp nơi trên thế giới.','Sneaker','White',1,1),
('ANANAS X DORAEMON 50 YEARS PATTAS','image/AnanasXDoraemon50.jpg',950000,38,6,N'Ananas x Doraemon 50 Years Pattas thể hiện chân thật nét vẽ nguyên bản của bộ truyện từ cái nhìn đầu tiên. Sử dụng chất liệu Action Leather (da) phủ khắp thân giày, pha trộn cùng các chi tiết đắt giá được sắp đặt hợp lí. Ra mắt với số lượng đặc biệt giới hạn, phiên bản này phát hành với mục đích kỉ niệm, tôn vinh giá trị mà bộ truyện Doraemon đã mang lại suốt 50 năm qua.','Pattas','Yellow',1,1),
(N'SNEAKER NỮ - GYY08',N'image/GYY08-Nữ.jpg',680000,38,2,N'Giày sneaker nữ Zucia GYY08 sở hữu thiết kế đặc trưng của một đôi giày sneaker cột dây hiện đại với phần phom đế Junky trẻ trung. Giày được chế tác trên nền chất liệu da tổng hợp cao cấp được pha phối màu sắc cá tính, dây thắt hiện đại với hai phong cách khác nhau kết hợp một cách trẻ trung. Đế cao su đúc chất lượng bắt mắt, cùng họa tiết nổi bắt mắt và các rãnh chống trơn trượt hiệu quả, đảm bảo an toàn cho bạn khi di chuyển.','Sneaker','Blue',0,1),
('URBAS INVERSION - HIGH TOP - N-GOLD FLAME','image/pro_urbas_A61063_1-1.jpg',370000,39,3,N'Phá cách bằng những phối màu đảo nghịch đầy độc đáo, tươi vui, Urbas "Inversion" là một pack giày đầy thú vị cho những ai muốn có thêm sắc màu cho cuộc sống, và tất nhiên, là cho cả những bộ outfit của riêng mình nữa.','Canvas','Orange',0,2),
('URBAS BLOODY - LOW TOP - HAUTE RED','image/pro_urbas_A61054_1.jpg',440000,39,1,N'Urbas "Bloody" - đôi giày có chất liệu Upper hoàn toàn bằng da lộn dành cho những tâm hồn mong muốn nổi bật một cách nổi loạn, sáng tạo một cách sáng chói.','Pattas','Red',0,2),
('CREAS FLIP-FLAP - HIGH TOP - MAGENTA-SNORKEL BLUE','image/pro_creas_A61084_1.jpg',690000,38,3,N'Ananas Creas Flip-Flap được sản xuất với số lượng giới hạn. Ngẫu hứng, đảo nghịch và truyền tải "bí quyết" của sự hạnh phúc. Xem kĩ hình để rõ hơn các chi tiết thiết kế đặc biệt trên sản phẩm','Canvas','Pink',0,3),
('TRACK 6 UNNAMED NO.1 IN C MINOR','image/pro_A6T011_1.jpg',1090000,42,6,N'Việc sử dụng phương pháp ứng tấu (improvise) với đề bài sử dụng 5 chất liệu da khác loại, khác màu trên cùng một thiết kế là chìa khoá để tạo nên đôi giày Track 6 không tên số thứ 1 (đầu tiên). Vẻ ngoài toát lên hơi hướng đượm buồn trong màu giọng Đô thứ (Cm), Track 6 Unnamed No.1 in C Minor sẽ thật sự gây bất ngờ cho những ai yêu thích việc tìm thấy sự tích cực trong những giai đoạn nhiều cảm xúc lẫn lộn đan xen.','Basas','Black',1,3),
('GTTN-66','image/955d67ada5bb972a861fc50db3303b5e.jpg',199000,41,7,N'Những năm gần đây, giày thể thao đã trở thành một item không thể thiếu trong tủ đồ của các tín đồ thời trang và các bạn trẻ trên toàn thể giới. Mỗi năm, ta đều chứng kiến sự đổ bộ của những mẫu sneaker mới đến từ các nhà sản xuất khác nhau. Đây chính là 1 trong số các mẫu giày mới nhất, trendy nhất. Vừa đơn giản vừa thú vị, đôi giày thể thao này thật hiện đại mang sự đặc trưng của xu hướng tối giản. Với thiết kế gọn gàng và tinh tế và màu sắc đẹp mát, không có gì ngạc nhiên khi đôi giày này lại được giới thời trang yêu mến đến vậy.','Sneaker','Black',1,2),
('Sneaker OEM','image/b388bcbd1b0c22172a9d1a34b5c5d12a.jpg',180000,38,3,N'Kiểu dáng thời trang, mẫu mã đa dạng. Vải lỗ thoáng giúp bay mùi của giày. Chất liệu mềm mại. Càng đi càng thoải mái - càng đi càng êm. Kiểu dáng trẻ trung, năng động, dễ phối đồ. Đường may tỉ mỉ','Sneaker','White',0,2),
('BASAS NEW SIMPLE LIFE - LOW TOP','image/stu_basas_A61003_1.jpg',420000,41,1,N'Thuộc dòng Basas với nét tối giản đặc trưng cùng khả năng kết hợp mọi outfit thường ngày, Basas "New Simple Life" dành cho những con người đơn giản nhưng không đơn điệu, bình thường mà chẳng tầm thường. Dáng Low Top cổ điển, không bao giờ lỗi thời chính là sự lựa chọn dễ chịu cho những ngày vô lo, vô nghĩ.','Canvas','Grey',1,4),
('ANANAS TRACK 6 SUEDE MOONPHASE','image/pro_A6T007_1.jpg',990000,42,5,N'Dựa trên cảm hứng từ việc tái hiện những sắc xám (Grey) khác nhau hoà cùng những trạng thái ánh sáng trên bề mặt mặt trăng, Ananas Track 6 Suede Moonphase Pack sử dụng chất liệu da lộn (suede) đặc trưng, được phủ toàn bộ thân giày với tông màu sáng tối sắp xếp hài hoà hợp lý. Đây chắc chắn là một sản phẩm must have với những ai yêu thích chất suede và những gam màu Grey trung tính','Pattas','Grey',1,4),
('VINTAS TEMPERATE - HIGH TOP','image/pro_A61111_1.jpg',770000,39,2,N'Má ngoài Suede (da lộn), má trong phủ vải canvas kèm theo các chi tiết phối trộn chất da Nappa nâu trầm điềm đạm là ý đồ sắp xếp làm nên Vintas Temperate Pack. Với tông màu cảm hứng từ cỏ cây cùng khí hậu dịu mát rõ nét của vùng Ôn Đới. Điểm chốt hạ thuyết phục cho những con người sâu sắc, mang tâm hồn yêu thiên nhiên vô bờ bến.','Canvas','Grey',0,4)
GO

