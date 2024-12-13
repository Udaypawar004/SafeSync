# SafeSync

SafeSync is a secure file management system built with Java Swing, Hibernate, and PostgreSQL. It allows users to encrypt and store their files securely in categorized folders. This application supports user authentication, file encryption, and organized storage.

## Features

- **User Authentication**: Sign up and log in securely.
- **File Management**:
  - View all uploaded files.
  - Add new files with encryption.
  - Organize files into folders.
- **Encryption**: Automatically encrypts files before saving them to the database.
- **Database Integration**: Uses PostgreSQL to store user and file data.

## Technologies Used

- **Frontend**: Java Swing for GUI.
- **Backend**: Hibernate ORM for database operations.
- **Database**: PostgreSQL.
- **Build Tool**: Maven.


## Database Schema

1. **Users Table**:
    - `id` (Primary Key)
    - `username` (Unique)
    - `password` (Hashed)

2. **Files Table**:
    - `id` (Primary Key)
    - `file_name`
    - `file_path`
    - `encryption_key`
    - `folder_name`
    - `user_id` (Foreign Key referencing Users table)
   

## Prerequisites

- Java JDK 11 or higher
- Maven
- PostgreSQL database

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/udaypawar004/SafeSync.git
   cd SafeSync

2. **Configure the Database**:

Create a PostgreSQL database named safesync.
Update the hibernate.cfg.xml file in the resources folder with your database credentials:
xml
```
<property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/safesync</property>
<property name="hibernate.connection.username">your-username</property>
<property name="hibernate.connection.password">your-password</property>
```
3. **Build the Project**:

bash
```
mvn clean install
```
4. **Run the Application**:

bash
```
java -jar target/SafeSync-1.0-SNAPSHOT.jar
```

Enjoy using SafeSync! Secure your files with ease.
