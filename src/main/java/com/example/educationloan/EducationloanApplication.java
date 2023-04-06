package com.example.educationloan;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.educationloan.entity.Admin;
import com.example.educationloan.entity.Bank;
import com.example.educationloan.entity.College;
import com.example.educationloan.entity.EducationLoan;
import com.example.educationloan.entity.LoanApplication;
import com.example.educationloan.entity.Student;
import com.example.educationloan.repository.BankRepository;
import com.example.educationloan.repository.CollegeRepository;
import com.example.educationloan.repository.EducationLoanRepository;
import com.example.educationloan.repository.LoanApplicationRepository;
import com.example.educationloan.repository.StudentRepository;
import com.example.educationloan.service.AdminService;
import com.example.educationloan.service.LoanApplicationService;

@SpringBootApplication
public class EducationloanApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducationloanApplication.class, args);
	}

	/* This is temporary code. To be deleted later */
	@Bean
	public CommandLineRunner demo(BankRepository bankrepository, CollegeRepository clgRepo, StudentRepository stdRepo,
			EducationLoanRepository loanrepo, LoanApplicationRepository apprepo, LoanApplicationService appService,
			AdminService adminService) {
		return (args) -> {
			// save a few customers
//	    	Bank bank = new Bank();
//	        bank.setName("hdfc");
//	        bank.setBranch("hebbal");
//	        bank.setCity("mys");
//	        
//	        bankrepository.save(bank);
//	        
//	        EducationLoan loan1 = new EducationLoan();
//	        loan1.setName("eduloan1");
//	        loan1.setInterest((float)8.0);
//	        
//	        EducationLoan loan2 = new EducationLoan();
//	        loan2.setName("eduloan1");
//	        loan2.setInterest((float)9.0);
//	        
//	        loan1.setBank(bank);
//	        loan2.setBank(bank);
//	        
//	        loanrepo.save(loan1);
//	        loanrepo.save(loan2);
//	        
//	        College clg = new College();
//	        clg.setName("sjc");
//	        clg.setCity("mys");
//	        
//	        clgRepo.save(clg);
//	        
//	        Student s1 = new Student();
//	        s1.setName("s1");
//	        s1.setReg("100");
//	        s1.setClg(clg);
//	        
//	        Student s2 = new Student();
//	        s2.setName("s2");
//	        s2.setReg("101");
//	        s2.setClg(clg);
//	        
//	        stdRepo.save(s1);
//	        stdRepo.save(s2);

//			Bank bank = new Bank();
//	        bank.setName("sbi");
//	        bank.setBranch("vijaynagar");
//	        bank.setCity("mys");
//	        
//	        bankrepository.save(bank);
//	        
//	        EducationLoan loan1 = new EducationLoan();
//	        loan1.setName("eduloan1");
//	        loan1.setInterest((float)7.5);
//	        
//	        EducationLoan loan2 = new EducationLoan();
//	        loan2.setName("eduloan2");
//	        loan2.setInterest((float)10.25);
//	        
//	        loan1.setBank(bank);
//	        loan2.setBank(bank);
//	        
//	        loanrepo.save(loan1);
//	        loanrepo.save(loan2);
//	        
//	        College clg = new College();
//	        clg.setName("nie");
//	        clg.setCity("mys");
//	        
//	        clgRepo.save(clg);
//	        
//	        Student s1 = new Student();
//	        s1.setName("s1");
//	        s1.setReg("200");
//	        s1.setClg(clg);
//	        
//	        Student s2 = new Student();
//	        s2.setName("s2");
//	        s2.setReg("201");
//	        s2.setClg(clg);
//	        
//	        stdRepo.save(s1);
//	        stdRepo.save(s2);
//
//			LoanApplication application = new LoanApplication();
//			application.setStatus("NEW");
//			application.setTenure(3);
//
//			Optional<Student> student = stdRepo.findById(13);
//			Student std = student.get();
//			application.setStudent(std);
//
//			Optional<EducationLoan> loanOp = loanrepo.findById(10);
//			EducationLoan loan = loanOp.get();
//			application.setLoan(loan);
//
//			apprepo.save(application);

//			List<LoanApplication> list1 = appService.findAllByCollegeId(12);
//			for (LoanApplication a : list1) {
//				System.out.println("App record by college id " + a.toString());
//			}
//			
//			List<LoanApplication> list2 = appService.findAllByBankId(2);
//			for (LoanApplication a : list2) {
//				System.out.println("App record by bankid" + a.toString());
//			}
			
//			Admin admin = new Admin();
//			admin.setUsername("admin");
//			admin.setPassword("admin123");
//			adminService.save(admin);

			System.out.println("+++++++++++ done +++++++++++++");
		};
	}
}
