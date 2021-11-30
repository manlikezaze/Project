Feature: Contact Us Feature

  Background:
      Given the homepage is opened.
      When the contactus button is clicked.

    Scenario:
      Then the "Webmaster" subject heading is selected
      And the email field is filled with "zaze19@icloud.com"
      And the order reference field is filled with "QJVBPWPJU-11/20/2021"
      And the message field is filled with "Hello Zaze"
      When the Send button is clicked
      Then a "Your message has been successfully sent to our team." success message should be shown

    Scenario:
      Then the "Customer service" subject heading is selected
      And the email field is filled with "zaze19@icloud.com"
      And the order reference field is filled with "QJVBPWPJU-11/20/2021"
      And the message field is filled with ""
      When the Send button is clicked
      Then a "The message cannot be blank." error message should be shown