package com.SafeSync;
import com.SafeSync.dao.FileDAO;
import com.SafeSync.dao.UserDAO;
import com.SafeSync.modules.File;
import com.SafeSync.modules.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        try {
            UserDAO userDAO = new UserDAO();
            FileDAO fileDAO = new FileDAO();

            // Create a new user
            User user = new User();
            user.setUsername("john_doe");
            user.setUsername("john@example.com");
            user.setPassword("hashed_password");
            userDAO.saveUser(user);

            // Add a file for the user
            File file = new File();
            file.setUser(user);
            file.setFolderName("Documents");
            file.setFilePath("/path/to/file");
            file.setEncryption_key("encryptionKey".getBytes());
            fileDAO.saveFile(file);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}