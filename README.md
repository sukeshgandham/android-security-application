# android-security-application

WebView is a system component that lets android apps render web content inside them without opening a browser. WebView allows application developers/hackers to embed HTML/JavaScript within it that can be displayed by in-app browsers regardless of device with Android versions 4.2 and below. Furthermore, using JavaScript, anyone can invoke the code of an Android application, and Java Methods are public by default. As a result, it provides an attacker with a massive attack vector through which an attacker can easily play and trick a user into clicking on a link where the webpage has already been injected by JavaScript, resulting in sensitive data leakage to the malicious webpage.

To secure the android application from the below attacks:

Restrict access to the local file resource attacks:

Implemented functionality that checks any URL being accessed in the app, should always start with “https”. This would help the application to be secure and doesn’t allow the attackers to gain access to the local file resource. Hackers pass a URL that starts with “file://  to gain or inject malicious code into the local file resource or the SD card, this helps the attacker to gain access and steal the user’s personal data. 
 
 Restrict XSS (Cross-Site Scripting) attacks:

Android packages often comprise complicated and difficult code for producing dynamic content; this technique is susceptible to omission errors (lacking validation).A data source or input may accept the input from the application that data store may accept input from a source that does not perform adequate input validation. As a result, the application cannot rely on the safety of this or any other data implicitly. This means that the best way to prevent XSS vulnerabilities is to validate everything that enters and leaves the application that is intended for the user. Hackers insert JavaScript into the body of the content, which begins with <script>/script>. 
 
To secure the application, the initial step is to create a whitelist of safe characters that are accepted as input and then validate the characters from the approved set. The Coordination Center at the Software Engineering Institute at Carnegie Mellon University gave details of special characters in the content at block level. 
“<” a special character introduces a script tag in JavaScript. 
“&” This introduces a character entity. 
“>” a special character because few browsers would assume this as the starting of the page as the author intended an opening, but is always omitted in error.
