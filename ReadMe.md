# GetHoldingTaskAutomation

A Selenium-based UI automation framework for the InMotion Hosting website, built with Java, TestNG, and the Page Object Model (POM) design pattern.

---

## 📁 Project Structure

```
GetHoldingTaskAutomation/
├── src/
│   ├── main/java/
│   │   ├── com/inmotion/pages/     # Page Object Model (POM) classes
│   │   │   ├── HomePage.java
│   │   │   ├── DomainSearchPage.java
│   │   │   └── CartPage.java
│   │   └── utils/                  # Utility classes
│   │       ├── DriverManager.java
│   │       ├── ConfigReader.java
│   │       └── WaitUtils.java
│   └── test/java/com/inmotion/tests/
│       ├── HomeTests.java
│       ├── DomainTests.java
│       └── CartPageTests.java
├── resources/
│   └── config.properties
└── pom.xml
```

---

## 🚀 Features

- Automates main e-commerce flows for domain search and hosting on [https://www.inmotionhosting.com](https://www.inmotionhosting.com)
- Modular Page Object Model structure
- TestNG for test execution and assertions
- Reusable WebDriver setup and fluent waits
- Externalized configuration through `config.properties`

---

## 🛠️ Prerequisites

- Java 11 or higher
- Maven
- Chrome browser and compatible ChromeDriver
- IntelliJ IDEA or similar IDE (recommended)

---

## ⚙️ Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/managy50/GetHoldingTaskAutomation.git
   cd GetHoldingTaskAutomation
   ```

2. **Update Configuration**
   Edit `resources/config.properties`:
   ```properties
   base.url=https://www.inmotionhosting.com/
   chrome.driver.path=drivers/chromedriver.exe
   wait.timeout=15
   search.domain=myautomationtest123.com
   ```

3. **Ensure WebDriver**
   Download the correct ChromeDriver version matching your browser and place it in the `drivers/` folder.

---

## ▶️ How to Run Tests

### Option 1: Using Maven (CLI)
```bash
mvn clean test
```

### Option 2: From IntelliJ (IDE)
- Right-click any test class (e.g., `DomainTests.java`)
- Choose: `Run 'DomainTests'`

---

## ✅ Test Scenarios

| Test Class         | Scenario                                                                 |
|--------------------|--------------------------------------------------------------------------|
| `HomeTests.java`   | Homepage loads successfully, title check, top navigation                 |
| `DomainTests.java` | Search for available domain, validate price, add domain to cart          |
| `CartPageTests.java`| Check domain presence in cart, remove domain, validate cart is empty    |

---

## 🧩 Technical Highlights

- **DriverManager**: Handles WebDriver setup and teardown.
- **WaitUtils**: Uses WebDriverWait instead of `Thread.sleep`.
- **ConfigReader**: Loads external properties file for better flexibility.
- **Assertions**: TestNG assertions validate correctness of outcomes.

---


## 🙋‍♂️ Author

Developed by [managy50](https://github.com/managy50)

---


