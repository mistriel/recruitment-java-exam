# Hello Dear Candidate
This is a "working" Demo application that intentionally implements malpractices and caveats that are embedded within its code.
Our goal today is to walk through those pinpoints discuss & fix them during an online screen sharing session.

> The session might be recorded for evaluation purpose only.
> Recording will not be shared with external parties and will be kept internally during the recruitment process only

## Requirements

1. IntelliJ IDE
2. JDK 8 or above

## Instructions
1. Open IntelliJ IDE
2. Start new project from existing sources in `https://github.com/mistriel/recruitment-java-exam`
3. Enable annotation processing (IntelliJ will hint you for that)   
4. Run `DemoApplication` Server

## Database
H2 in-memory DB. Initial content provided by `data.sql`, where `schema.sql` allows DB migrations and manipulations on the DB structure.

[H2 Console](http://localhost:8080/h2-console) provides DB console to the in memory DB

## API
There are several APIs exposed by this application server, for your convenience they are gathered in `APIs.http` file.  
You can run all APIs directly from IntelliJ if you have ultimate version or use Postman instead.

# For Reviewer
The instructions, guidelines and potential solutions can be provided by access to
[Avi Mistriel](https://gist.github.com/mistriel) secret Gist link.  

Reach me for access. 
