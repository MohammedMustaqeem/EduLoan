Pre requisite for backend
1. Java 8
2. Maven
3. Command to build
	mvn clean package
4. Create "studentloan" DB and provide permission in Mysql. PORT - 3006


============================================================================================
mysql> create database studentloan; -- Creates the new database
mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
mysql> grant all on studentloan.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
============================================================================================


FLOW

1. Admin 
	a. Register Bank (includes providing bank representative credentials)

2. Admin
	a. Register College (includes details of college representative username/password)

3. Bank Representative
	a. Logins with credentials provided in step 1.a
	b. Add Education Loan record to system
	c. Can view list of Loan Applications submitted from students
		i. View LoanApplication. Verify application. Approve or Reject or move to PENDING status

4. College Representative
	a. Logins with credentials provided in step 2.a
	b. Add Student record to system (includs credential for student username/password)
	c. Can view list of Loan Applications submitted by Students of their college. 
	d. Can view list of students record. 

5. Student
	a. Logins with credentials provided in step 4.b
	b. View list of available loans
	c. Select any loan. Choose to apply. Fill Application details (Set of documents). Sumbit.
	d. View Loan Status
		