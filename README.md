# Tutorials Ninja Test Automation with Cucumber Selenium Framework

This project automates smoke tests for the Tutorials Ninja web application using a custom Cucumber-Selenium hybrid framework. Built for test engineers and developers, it simplifies the process of validating core features of an e-commerce application like user registration, login and checkout ensuring that key functionalities work as expected. This framework is designed to be scalable, maintainable, and easy to extend, making it a reliable foundation for quality assurance in dynamic web applications.

## Key Technologies

Java: Core language for building this automation framework, enabling robust and scalable tests.

Selenium WebDriver: Used for browser automation to interact with web elements and simulate user behaviors.

Cucumber: Facilitates Behavior-Driven Development (BDD) by enabling easy collaboration between technical and non-technical team members.

JUnit: Integrates with Cucumber, providing test runner capabilities and easy reporting.

Maven: Manages dependencies, build, and execution of the project.

## Framework Highlights
Page Object Model (POM): Each page is represented by a dedicated Java class, encapsulating page elements and actions, improving test maintenance and readability.

BDD Scenarios: Uses Gherkin syntax in .feature files, making test cases easy to understand and collaborative for all team members.

Test Reports: Cucumber HTML reports are generated and saved in the target directory for easy review.

Failure Handling: Screenshots are automatically attached for failed test cases, ensuring better debugging and bug identification.

## Setup and Execution
### clone the repository
1. To set up the project, first clone the repository to your local machine using Git:

  `git clone https://github.com/VirtueNaza/E-Commerce-CucumberHybridFramework.git`

### Import into IntelliJ
1. Open IntelliJ IDEA.
2. Navigate to File > Open, and select the directory where you cloned the repository.
3. Select the pom.xml file to import the project as a Maven project.
   If prompted, enable auto-import to resolve Maven dependencies automatically.

### Configure Maven and Build the project
1. Open the Maven Tool Window (usually on the right sidebar in IntelliJ).
2. Click the Reload All Maven Projects icon to ensure all dependencies are downloaded and resolved.
3. Wait for IntelliJ to build the project and confirm there are no unresolved dependencies.

### Run the Tests
1. Navigate to the test runner file located at:
src/test/java/TestRunner/TestRunner.java.
2. Right-click on TestRunner.java and select Run 'TestRunner' to execute the test suite.

### View Execution Results
1. Execution Logs: Real-time logs are displayed in IntelliJ's Run tab for debugging purposes.
2. Screenshots: For failed test cases, screenshots are saved automatically in the target/screenshots directory.
3. Cucumber HTML Reports: Generated automatically after execution in the target/cucumber-reports directory.

### Access Test Reports
1. Navigate to the target/cucumber-reports directory.
2. Open the HTML report in any browser for a detailed view of Passed, failed, and skipped scenarios.
