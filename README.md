# UI_Automation_Framework_Selenium_webdriver_BDD
Note: Test Cases will be run with headerless browser hence browser will not visible as explicitly.
If you want run test cases with browser then BrowserLuncher class >> getDriver >> remove parameter Option from line 24 >> save it the run.
Make sure Test cases will run and you will able to show test cases running activity. 
1- Clone API Automation project from github
as $ git clone https://github.com/paxcelshiv/UI_Automation_Framework_Selenium_webdriver_BDD.git
2- Open cmd commad from UI_Automation_Framework_Selenium_webdriver_BDD this folder
3- run command as per given below
>mvn clean
> mvn test
After sometimes you will get build success like 
...
..

9 Scenarios (9 passed)
25 Steps (25 passed)
0m42.937s

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 44.391 sec - in TestSuite

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  47.114 s
[INFO] Finished at: 2021-01-10T23:08:06+05:30

4- Analysis Test report 
 * open target >> surefire-reportsfolder from under UI_Automation_Framework_Selenium_webdriver_BDD project
 * Open emailable-report.html file using any browser 
 Test report will be displayed.
 
 5- You can review Activities log in logfile.log file.
 
 --------------- Code Review -----------
I have devloped basic level UI_Automation_Framework_Selenium_webdriver_BDD and you will find everything like ( abstraction, encapsulation, inheritance, polymorphism, Collection ...)with focus below points
o Working solution
o Structure
o Maintainability
o Re-usability
o Code quality
o Reliability
o Logging and evidences management
