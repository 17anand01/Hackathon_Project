***************************************************** PROJECT DESCRIPTION *****************************************************************

Problem Statement : Find the insurance plans

1.Open PolicyBazaar and display three lowest international  travel insurance plan with amount and insurance provider company for any European country.
2.In car insurance capture the error message.
3.In health insurance display all the menu items.

Detailed Description: Hackathon Project

1.Open PolicyBazaar website and select travel insurance.
2.In travel insurance select the location -> choose travel date -> choose no.of travellers and their age -> pass mobile number.
3.Select student plan and sort them.
4.Display first three travel plans for students and store the same in excel.
5.In car insurance click view palns without entering car number and capture the error message
6.Enter the car number and click on to the view price
7.Fill the details like name, mobile number and pass invalid email.
8.Capture the error message.
9.In health insurance display all the menu items and store the same in excel.

Key Automation Scope:

1.Handling alerts, search option
2.Validation of date controls
3.Filling simple form, Capture warning message
4.Extract menu items & store in collections
5.Navigating back to home page



********************************************************** STEPS TO EXECUTE *************************************************************

-unzip the folder
-On eclipse, go to file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the TestNG.xml file and run as TestNGSuite.
-Now the file will Execute in TestNG and we get the expected output as shown below.
-Now go to TestRunner.java file and run as JUnit test.
-Now the file will Execute in Cucumber and we get the expected output as shown below.


******************************************************* FILES DESCRIPTION **************************************************************

1.src/test/java - There are seven packages present in this folder.

->  Factory	  : In this package we have CucumberBaseClass.java file in which we invoke the browser initialization, we also added logger and properties method to include logs and access config.properties file.
  	
->  PageObjects   : In this Package there are four files
    	1) BasePage     : In this file we have implemeted pagefactory which has a Factory class to make using Page Objects simpler and easier and also used WebDriver constructor.
  	2) carInsurance  : In this file we extends basePage.java where the constructor is intiated from basePage and we have some elements and methods to perform required actions in car insurance page.
  	3) healthInsurance : In this file we extends basePage.java and we included required action methods and Webelements to get the desired result.
  	4) travelInsurance : In this file we extends basePage.java where the constructor is intiated from basePage and we have some elements and methods to perform required actions in travel insurance page. 

-> StepDefinitions   : In this package there are four files
  	1) Car	: In this file we have included required methods which are implemented by cucumber feature files to perform required actions in car insurance page
  	2) Health  : In this file we have included required methods which are implemented by cucumber feature files to perform required actions in health insurance page
  	3) Hooks  :  In this file we have invoked browser setup, closing the browser and also included the screenshot method.
  	4) Travel  :  In this file we have included required methods which are implemented by cucumber feature files to perform required actions in travel insurance page

->  TestBase  : In this Package we have BaseClass.java file in which we Firstly invoke the selected browser and we add steps like Opening the PolicyBazaar page (https://www.policybazaar.com/) and closing the browser ,We also added screenshot method
     
->  TestCases  : In this package we have three files 
  	1) TC_01_TRAVELINSURANCE.java which extends BaseClass.java where the methods are present which will choose location, select travel date, choose no.of travellers, fill mobile number, print first three travel plans and store in excel.
  	2) TC_02_CARINSURANCE.java which extends BaseClass.java where the methods will choose city, vehicle number, brand, model, fuel, fill the required details and capture the error message.
  	3) TC_03_HEALTHINSURANCE.java which extends BaseClass.java where the methods will select health insurance, display all the menu items and store in excel. 

->  TestRunner  : In this package we have TestRunner.java file where we include features file path and add cucumber plugins to generate cucumber report.	  

->  Utilities   : In this package we have ExcelUtils.java and ExtendreportManager.java file.

2.src/test/resources- In this folder, there are three files 

->  config.properties  : This file is used to store the reusable values such as apprl,browser name and os name.

->  log4j2.xml  : This file is used to generate log informations about the execution of test cases.

->  extent.properties  : This file is used to generate the extentReport for the execution in cucumber framework.

3.JRE System Library: In this File we have all dependencies of JAR.files.         

4.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. When a Maven build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

5.Feature Files : In this folder we have all the feature files with .feature extension which needs to be invoked while excuting the project in cucumber framework.

6.Logs : In this folder logs are present which is generated while executing the project.

7.Reports : In this folder the Test-Report-YYYY.MM.DD.html and CucumberReport.html are present which is the reports of the project

8.ScreenShot: In this folder all the screenshots are captured while executing the project.

9.src: In this, there are two folders
	-main:It is an empty folder
	-test:It is an empty folder

10.target: It is an empty folder

11.TestData : In this folder we have two files

-> Read  : In this excel file all the data which need to be passed to required WebElements are stored.

-> Write  : After the execution of project the result will be stored. 

12. pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies, build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.

 
****************************************************** OUTPUT ON CONSOLE *********************************************************************************

****************************************************** TESTNG OUTPUT *************************************************************************************



11:39:56.587 [main] INFO  factory.BaseClass - ************Object for travelInsurance Page got created************
11:40:29.583 [main] INFO  factory.BaseClass - ************TravelInsurance got clicked************
11:40:29.722 [main] INFO  factory.BaseClass - ************TravelInsurance Page title got verified************
11:40:34.002 [main] INFO  factory.BaseClass - ************Date got selected************
11:40:36.904 [main] INFO  factory.BaseClass - ************Selected two travellers************
11:40:38.201 [main] INFO  factory.BaseClass - ************Selected No for Medical history************
11:40:41.081 [main] INFO  factory.BaseClass - ************Mobile number entered sucessfully************
11:40:48.480 [main] INFO  factory.BaseClass - ************Students Plans got Selected************
11:40:50.300 [main] INFO  factory.BaseClass - ************Travellers got Selected************
Reliance
₹1,514
Bajaj Allianz
₹1,628
Niva Bupa (formerly known as Max Bupa)
₹2,089
11:40:59.381 [main] INFO  factory.BaseClass - ************Low to High filter got selected************
11:41:00.176 [main] INFO  factory.BaseClass - ************Object for carInsurance Page got created************
11:41:03.560 [main] INFO  factory.BaseClass - ************carlInsurance got clicked************
11:41:03.581 [main] INFO  factory.BaseClass - ************carlInsurance Page title got verified************
Please enter a valid car number
11:41:04.752 [main] INFO  factory.BaseClass - ************Captured the error message for car************
11:41:05.861 [main] INFO  factory.BaseClass - ************Entered the car number************
Please enter a valid e-mail ID.
11:41:10.346 [main] INFO  factory.BaseClass - ************Captured the error message for email************
11:41:17.311 [main] INFO  factory.BaseClass - ************Object for healthInsurance Page got created************
Family Health Insurance
Senior Citizen Health Insurance
Health Insurance for Parents
Best Health Insurance Plans
Maternity Insurance
Health Insurance Portability
Mediclaim Policy
Critical Illness Insurance
Health Insurance Calculator
Health Insurance Companies
Health Insurance for NRIs


11:41:21.440 [main] INFO  factory.BaseClass - ************Captured all the menu items in helath insurance************
11:41:21.441 [main] INFO  factory.BaseClass - ************Sucessfuly completed all the testCases************

****************************************************** CUCUMBER OUTPUT *************************************************************************************


@sanity @regression
Scenario: Capture the error message                                      # Features/carInsurance.feature:4
Feb 29, 2024 11:50:25 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
11:50:38.473 [main] INFO  factory.BaseClass - ************Object for carInsurance Page got created************
  Given User navigate to the car insurance page                          # stepDefinitions.carInsuranceStep.user_navigate_to_the_car_insurance_page()

    Embedding Capture the error message [image/png 287130 bytes]

11:50:41.364 [main] INFO  factory.BaseClass - ************carlInsurance got clicked************
11:50:42.078 [main] INFO  factory.BaseClass - ************carlInsurance Page title got verified************
  When User clicks on to the car insurance                               # stepDefinitions.carInsuranceStep.user_clicks_on_to_the_car_insurance()

    Embedding Capture the error message [image/png 194881 bytes]

Please enter a valid car number
11:50:43.414 [main] INFO  factory.BaseClass - ************Captured the error message for car************
  Then User captures the error message                                   # stepDefinitions.carInsuranceStep.user_captures_the_error_message()

    Embedding Capture the error message [image/png 196831 bytes]

11:50:44.637 [main] INFO  factory.BaseClass - ************Entered the car number************
  When User enters the car number and clicks on to the view price button # stepDefinitions.carInsuranceStep.user_enters_the_car_number_and_clicks_on_to_the_view_price_button()

    Embedding Capture the error message [image/png 194081 bytes]

Please enter a valid e-mail ID.
11:50:57.383 [main] INFO  factory.BaseClass - ************Captured the error message for email************
  Then User captures the email error message                             # stepDefinitions.carInsuranceStep.user_captures_the_email_error_message()

    Embedding Capture the error message [image/png 300185 bytes]


@sanity @regression
Scenario: Displaying the health insurance submenus # Features/healthInsurance.feature:4
Feb 29, 2024 11:51:06 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
11:51:23.083 [main] INFO  factory.BaseClass - ************Object for healthInsurance Page got created************
  Given User navigates to the home page            # stepDefinitions.healthInsuranceStep.user_navigates_to_the_home_page()

    Embedding Displaying the health insurance submenus [image/png 8212 bytes]

11:53:17.068 [main] INFO  factory.BaseClass - ************Moved to health insurance************
  When User hover to the health insurance          # stepDefinitions.healthInsuranceStep.user_hover_to_the_health_insurance()

    Embedding Displaying the health insurance submenus [image/png 156404 bytes]

Family Health Insurance
Senior Citizen Health Insurance
Health Insurance for Parents
Best Health Insurance Plans
Maternity Insurance
Health Insurance Portability
Mediclaim Policy
Critical Illness Insurance
Health Insurance Calculator
Health Insurance Companies
Health Insurance for NRIs


11:53:20.891 [main] INFO  factory.BaseClass - ************Captured all the menu items in helath insurance************
  Then User displays submenus of health insurance  # stepDefinitions.healthInsuranceStep.user_displays_submenus_of_health_insurance()

    Embedding Displaying the health insurance submenus [image/png 156404 bytes]


@sanity @regression
Scenario: Displaying the travel insurance for students   # Features/travelInsurance.feature:4
Feb 29, 2024 11:53:29 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
11:54:00.293 [main] INFO  factory.BaseClass - ************Object for travelInsurance Page got created************
  Given User navigates to the travel insurance page      # stepDefinitions.travelInsuranceStep.user_navigates_to_the_travel_insurance_page()

    Embedding Displaying the travel insurance for students [image/png 287130 bytes]

11:54:38.699 [main] INFO  factory.BaseClass - ************TravelInsurance got clicked************
11:54:38.729 [main] INFO  factory.BaseClass - ************TravelInsurance Page title got verified************
11:54:42.985 [main] INFO  factory.BaseClass - ************Date got selected************
  When User selects the location and select the date     # stepDefinitions.travelInsuranceStep.user_selects_the_location_and_select_the_date()

    Embedding Displaying the travel insurance for students [image/png 127431 bytes]

11:54:45.464 [main] INFO  factory.BaseClass - ************Selected two travellers************
11:54:46.156 [main] INFO  factory.BaseClass - ************Selected No for Medical history************
  And User selects two travellers and selects no button  # stepDefinitions.travelInsuranceStep.user_selects_two_travellers_and_selects_no_button()

    Embedding Displaying the travel insurance for students [image/png 255870 bytes]

11:54:48.616 [main] INFO  factory.BaseClass - ************Mobile number entered sucessfully************
  And User enters the mobile number                      # stepDefinitions.travelInsuranceStep.user_enters_the_mobile_number()

    Embedding Displaying the travel insurance for students [image/png 225340 bytes]

11:54:59.190 [main] INFO  factory.BaseClass - ************Students Plans got Selected************
11:55:00.837 [main] INFO  factory.BaseClass - ************Travellers got Selected************
  And User selects the student and selects the traveller # stepDefinitions.travelInsuranceStep.user_selects_the_student_and_selects_the_traveller()

    Embedding Displaying the travel insurance for students [image/png 146124 bytes]

Reliance
₹1,514
Bajaj Allianz
₹1,628
Niva Bupa (formerly known as Max Bupa)
₹2,089
11:55:11.425 [main] INFO  factory.BaseClass - ************Low to High filter got selected************
  Then Displays the first three travel insurance plan    # stepDefinitions.travelInsuranceStep.displays_the_first_three_travel_insurance_plan()

    Embedding Displaying the travel insurance for students [image/png 287130 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/7f1cb9ed-d2ef-4ad4-8c4e-ca0194f80de2 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘