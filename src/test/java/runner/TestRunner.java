package runner;

import java.io.File;

import org.junit.AfterClass;
import cucumber.api.java.Before; 
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import Utilities.ReportManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.model.Scenario;


@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"stepDefinition"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
)

public class TestRunner {

	
		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File(ReportManager.getReportConfigPath()));
			Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		    Reporter.setSystemInfo("Selenium", "3.7.0");
		    Reporter.setSystemInfo("Maven", "3.5.2");
		    Reporter.setSystemInfo("Java Version", "1.8.0_151");
		}

}
