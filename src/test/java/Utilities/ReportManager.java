package Utilities;

public class ReportManager {
	
	public static String getReportConfigPath(){
		String reportConfigPath ="C:\\Users\\asus\\eclipse-workspace\\MavenCucumberJenkins\\src\\test\\java\\configuration\\extent-Config.xml";
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}

}
