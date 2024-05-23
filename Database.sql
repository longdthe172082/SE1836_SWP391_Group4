CREATE DATABASE HappyProgramming;
GO
--Drop database HappyProgramming
USE HappyProgramming;
GO
CREATE TABLE Blog (
    Id INT PRIMARY KEY IDENTITY(1,1),
    Title VARCHAR(255),
    Description VARCHAR(255),
    Author VARCHAR(255),
    Status VARCHAR(255),
    Intro VARCHAR(255),
	Image VARCHAR(255),
    Update_Time VARCHAR(255)
);

CREATE TABLE [Role] (
    RoleId INT PRIMARY KEY IDENTITY(1,1),
    RoleName NVARCHAR(255)
);

Create Table Account(
	AccId int primary key identity(1,1),
	UserName varchar(255),
	Password varchar(255),
	AccName VARCHAR(255),
    Fullname VARCHAR(255),
	DOB VARCHAR(255),
	Sex VARCHAR(255),
    Address VARCHAR(255),
    PhoneNumber VARCHAR(255),
    Email VARCHAR(255),
	RoleId INT FOREIGN KEY REFERENCES [Role](RoleId)
);

CREATE TABLE Staff (
    Id INT PRIMARY KEY IDENTITY(1,1),
    UserName NVARCHAR(50),
    PassWord NVARCHAR(50),
	AccId int FOREIGN KEY REFERENCES Account(AccId),
    RoleId INT FOREIGN KEY REFERENCES [Role](RoleId)
);

CREATE TABLE Mentor (
    MentorId int PRIMARY KEY IDENTITY(1,1),
	AccName VARCHAR(255),
    Fullname VARCHAR(255),
    PhoneNumber VARCHAR(255),
    Email VARCHAR(255),
    Avatar VARCHAR(255),
	AccId int FOREIGN KEY REFERENCES Account(AccId)
);

CREATE TABLE Schedule (
    Id INT PRIMARY KEY IDENTITY(1,1),
    StartDate VARCHAR(255),
    EndDate VARCHAR(255),
    Status VARCHAR(255),
	MentorId int foreign key references Mentor(MentorId)
);

CREATE TABLE Skill (
    SkillId VARCHAR(255) PRIMARY KEY,
    SkillName VARCHAR(255),
	Price Varchar(255),
	ScheduleId int foreign key references Schedule(Id),
    Image VARCHAR(255)
);

CREATE TABLE Skill_Mentor (
    SkillId VARCHAR(255),
    MentorId int,
    PRIMARY KEY (SkillId, MentorId),
    FOREIGN KEY (SkillId) REFERENCES Skill(SkillId),
    FOREIGN KEY (MentorId) REFERENCES Mentor(MentorId)
);

CREATE TABLE Mentee (
    Id int PRIMARY KEY IDENTITY(1,1),
    AccName VARCHAR(255),
    FullName VARCHAR(255),
    PhoneNumber VARCHAR(255),
    Email VARCHAR(255),
    Avatar VARCHAR(255),
	Total VARCHAR(255),
	AccId int FOREIGN KEY REFERENCES Account(AccId)
);

CREATE TABLE Request (
    Id INT PRIMARY KEY IDENTITY(1,1),
    Title VARCHAR(255),
    Content VARCHAR(255),
    DeadlineDate VARCHAR(255),
    DatelineHour VARCHAR(255),
    SkillId VARCHAR(255),
    Status VARCHAR(255),
    MenteeId int,
    MentorId int,
    FOREIGN KEY (SkillId) REFERENCES Skill(SkillId),
    FOREIGN KEY (MenteeId) REFERENCES Mentee(Id),
    FOREIGN KEY (MentorId) REFERENCES Mentor(MentorId)
);

CREATE TABLE Feedback (
    Id INT PRIMARY KEY IDENTITY(1,1),
    Rating VARCHAR(255),
	comment VARCHAR(255),
    MenteeId int,
    MenteeName VARCHAR(255),
    MentorId int,
    MentorName VARCHAR(255),
    FOREIGN KEY (MenteeId) REFERENCES Mentee(Id),
    FOREIGN KEY (MentorId) REFERENCES Mentor(MentorId)
);

CREATE TABLE Roadmap (
    Id VARCHAR(255) PRIMARY KEY,
    SkillId VARCHAR(255) foreign key references Skill(SkillId),
RoadmapName VARCHAR(255),
	Image VARCHAR(255)
);

Create table CV (
	MentorId int,
	AccName VARCHAR(255),
    FullName VARCHAR(255),
	Dob varchar(255),
    PhoneNumber VARCHAR(255),
    Email VARCHAR(255),
    Avatar VARCHAR(255),
	Job VARCHAR(255),
	Job_Intro text,
	Skill VARCHAR(255),
	[Service] text,
	Archivement text,
	FOREIGN KEY (MentorId) REFERENCES Mentor(MentorId)
);

Create table Payment(
	Id INT PRIMARY KEY IDENTITY(1,1),
	MethodPayment varchar(255),
	Date varchar(255),
	Price varchar(255),
	MenteeId int foreign key references Mentee(Id)
);

-- Chèn dữ liệu vào bảng Role
INSERT INTO [Role] (RoleName) VALUES 
('admin'),
('manager'),
('mentor'),
('mentee');

-- Chèn dữ liệu vào bảng Account
INSERT INTO Account (UserName, Password, AccName, Fullname, DOB, Sex, Address, PhoneNumber, Email, RoleId) VALUES
-- Tài khoản admin
('admin_user1', 'admin_password1', 'Admin', 'Admin User 1', '1990-01-01', 'Male', '123 Admin St', '123456789', 'admin1@example.com', 1),
('admin_user2', 'admin_password2', 'Admin', 'Admin User 2', '1990-01-02', 'Female', '456 Admin St', '987654321', 'admin2@example.com', 1),
-- Tài khoản manager
('manager_user1', 'manager_password1', 'Manager', 'Manager User 1', '1990-01-03', 'Male', '123 Manager St', '111222333', 'manager1@example.com', 2),
('manager_user2', 'manager_password2', 'Manager', 'Manager User 2', '1990-01-04', 'Female', '456 Manager St', '444555666', 'manager2@example.com', 2),
-- Tài khoản mentor
('mentor_user1', 'mentor_password1', 'Mentor', 'Mentor User 1', '1990-01-05', 'Male', '123 Mentor St', '777888999', 'mentor1@example.com', 3),
('mentor_user2', 'mentor_password2', 'Mentor', 'Mentor User 2', '1990-01-06', 'Female', '456 Mentor St', '111222333', 'mentor2@example.com', 3),
-- Tài khoản mentee
('mentee_user1', 'mentee_password1', 'Mentee', 'Mentee User 1', '1990-01-07', 'Male', '123 Mentee St', '444555666', 'mentee1@example.com', 4),
('mentee_user2', 'mentee_password2', 'Mentee', 'Mentee User 2', '1990-01-08', 'Female', '456 Mentee St', '777888999', 'mentee2@example.com', 4);


-- Chèn dữ liệu vào bảng Mentor
INSERT INTO Mentor (AccName, Fullname, PhoneNumber, Email, Avatar, AccId) VALUES
('mentor_user1', 'Mentor User 1', '777888999', 'mentor1@example.com', 'mentor_avatar1.jpg', 5),
('mentor_user2', 'Mentor User 2', '111222333', 'mentor2@example.com', 'mentor_avatar2.jpg', 6);

-- Chèn dữ liệu vào bảng Mentee
INSERT INTO Mentee (AccName, FullName, PhoneNumber, Email, Avatar, Total, AccId) VALUES
('mentee_user1', 'Mentee User 1', '444555666', 'mentee1@example.com', 'mentee_avatar1.jpg', 'Beginner', 7),
('mentee_user2', 'Mentee User 2', '777888999', 'mentee2@example.com', 'mentee_avatar2.jpg', 'Intermediate', 8);

-- Chèn dữ liệu vào bảng Staff
INSERT INTO Staff (UserName, PassWord, AccId, RoleId) VALUES
('staff_user1', 'staff_password1', 3, 2),
('staff_user2', 'staff_password2', 4, 2);

-- Chèn dữ liệu vào bảng Schedule
INSERT INTO Schedule (StartDate, EndDate, Status, MentorId) VALUES
('2024-06-01', '2024-06-30', 'Active', 1),
('2024-07-01', '2024-07-31', 'Active', 2);

-- Chèn dữ liệu vào bảng Skill
INSERT INTO Skill (SkillId, SkillName, Price, ScheduleId, Image) VALUES
('skill1', 'Programming', '100', 1, 'programming.jpg'),
('skill2', 'Web Development', '120', 2, 'web_development.jpg');

-- Chèn dữ liệu vào bảng Skill_Mentor
INSERT INTO Skill_Mentor (SkillId, MentorId) VALUES
('skill1', 1),
('skill2', 2);

-- Chèn dữ liệu vào bảng Request
INSERT INTO Request (Title, Content, DeadlineDate, DatelineHour, SkillId, Status, MenteeId, MentorId) VALUES
('Project Request 1', 'Description of project request 1', '2024-06-15', '10:00', 'skill1', 'Pending', 1, 1),
('Project Request 2', 'Description of project request 2', '2024-07-15', '11:00', 'skill2', 'Pending', 2, 2);

-- Chèn dữ liệu vào bảng Feedback
INSERT INTO Feedback (Rating, comment, MenteeId, MenteeName, MentorId, MentorName) VALUES
('5', 'Great mentor!', 1, 'Mentee User 1', 1, 'Mentor User 1'),
('4', 'Good mentor!', 2, 'Mentee User 2', 2, 'Mentor User 2');

-- Chèn dữ liệu vào bảng Roadmap
INSERT INTO Roadmap (Id, SkillId, RoadmapName, Image) VALUES
('roadmap1', 'skill1', 'Programming Roadmap', 'roadmap1_image.jpg'),
('roadmap2', 'skill2', 'Web Development Roadmap', 'roadmap2_image.jpg');

-- Chèn dữ liệu vào bảng CV (cho Staff)
INSERT INTO CV (MentorId, AccName, FullName, Dob, PhoneNumber, Email, Avatar, Job, Job_Intro, Skill, [Service], Archivement) VALUES
(1, 'staff_user1', 'Staff User 1', '1990-01-09', '123123123', 'staff1@example.com', 'staff_avatar1.jpg', 'Manager', 'Experienced manager specializing in team leadership.', NULL, NULL, NULL),
(2, 'staff_user2', 'Staff User 2', '1990-01-10', '456456456', 'staff2@example.com', 'staff_avatar2.jpg', 'Manager', 'Experienced manager specializing in team leadership.', NULL, NULL, NULL);

-- Chèn dữ liệu vào bảng Payment
INSERT INTO Payment (MethodPayment, Date, Price, MenteeId) VALUES
('Credit Card', '2024-06-01', '100', 1),
('PayPal', '2024-07-01', '120', 2);