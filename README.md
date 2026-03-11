# selenium-challenging-dom
Practice project focused on Selenium locator strategies using the Challenging DOM testing page. Includes Page Object Model structure and TestNG tests.

# Selenium Challenging DOM Practice

This project is a practice automation project using **Selenium WebDriver**, **Java**, and **TestNG**.

The goal is to improve locator strategies and practice building tests using the **Page Object Model (POM)** design pattern.

The project uses the Challenging DOM page from *The Internet* testing website.

https://the-internet.herokuapp.com/challenging_dom

---

# Project Objectives

This project was created to practice:

- Selenium WebDriver
- CSS Selectors
- XPath locators
- Page Object Model (POM)
- TestNG test structure
- Interaction with dynamic DOM elements

---

# Page Tested

The tested page contains elements designed to challenge locator strategies:

- Buttons with dynamic attributes
- Tables with multiple rows
- Edit/Delete row actions
- Canvas element

---

# Project Structure
src
├─ main
│ └─ java
│ └─ pages
│ └─ ChallengingDomPage.java
│
└─ test
└─ java
└─ tests
└─ ChallengingDomTest.java

### BaseTest
Responsible for:
- WebDriver initialization
- Browser configuration
- Opening the test page
- Closing the browser after tests

### Page Object

`ChallengingDomPage`

Contains:
- Page locators
- Page actions
- Helper methods to interact with elements

### Tests

`ChallengingDomTest`

Test cases cover:

- Button interactions
- Table data extraction
- Row edit/delete actions
- Canvas interaction attempt

---

# Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Visual Studio Code

