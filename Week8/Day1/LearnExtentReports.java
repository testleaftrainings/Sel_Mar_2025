package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		
		//set up the reportPath
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		
		//maintain the history
		reporter.setAppendExisting(true);
		
		//use ExtentReports
		ExtentReports extent=new ExtentReports();
		
		//i have to attach the report so attach the data with the file
		
		extent.attachReporter(reporter);
		
		//create a testcase and assign all the testcasedetails
		ExtentTest test=extent.createTest("createLead","details required for createlead");
		
		//assign testcase category
		
		test.assignAuthor("saranya");
		test.assignCategory("smoke");
		
		//attach the steplevel status
		test.pass("uname entered sucessfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/homepage.png").build());
		test.pass("pwd entered sucessfully");
		
		//mandatry
		extent.flush();//reports will be saved in reports folder
		System.out.println("completed");
	}

}
