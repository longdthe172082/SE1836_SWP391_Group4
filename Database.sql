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

CREATE TABLE Staff (
    Id INT PRIMARY KEY IDENTITY(1,1),
    UserName NVARCHAR(50),
    PassWord NVARCHAR(50),
    RoleId INT FOREIGN KEY REFERENCES [Role](RoleId)
);
CREATE TABLE Mentor (
    MentorId int PRIMARY KEY IDENTITY(1,1),
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    Address VARCHAR(255),
    PhoneNumber VARCHAR(255),
    Email VARCHAR(255),
    Avatar VARCHAR(255),
    RoleId INT FOREIGN KEY REFERENCES [Role](RoleId)
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
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    Address VARCHAR(255),
    PhoneNumber VARCHAR(255),
    Email VARCHAR(255),
    Avatar VARCHAR(255),
    RoleId INT FOREIGN KEY REFERENCES [Role](RoleId),
	Total VARCHAR(255)
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
    FullName VARCHAR(255),
	Dob varchar(255),
    PhoneNumber VARCHAR(255),
    Email VARCHAR(255),
    Avatar VARCHAR(255),
	Intro text,
	Experiences text,
	Education text,
	FOREIGN KEY (MentorId) REFERENCES Mentor(MentorId)
);

Create table Payment(
	Id INT PRIMARY KEY IDENTITY(1,1),
	MethodPayment varchar(255),
	Date varchar(255),
	Price varchar(255),
	MenteeId int foreign key references Mentee(Id)
);
