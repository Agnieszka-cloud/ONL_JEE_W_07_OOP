package pl.coderslab.oop.workshop2.user;
import pl.coderslab.oop.workshop2.user.User;
import pl.coderslab.oop.workshop2.user.UserDao;

public class MainDao {

    private static final UserDao userDao = new UserDao();

    public static void main(String[] args) {

        //creating
        //User user2 = new User();
        User user = new User( "ikdda", "ikdda@icloud.com","4272347" );
        User user1 = new User("Ola","olllkregeagglkjgyula@icloud.com","3555656yge3566238");

        //User userCreate = userDao.create(user1);
        //System.out.println("create: " + userCreate);

        userDao.create(user);
        System.out.println("create: " + user);
        //System.out.println("create: " + userDao.create(user1));

        //reading
        User userToRead = userDao.read(1);
        System.out.println("read: " + userToRead);

        //userDao.read(4);
        //System.out.println("read: " + userDao.read(10));

        // find all
        User[] allUse = userDao.findAll();
        for(User uu : allUse){
            System.out.println("find all: " + uu);
        }

        // remove
        userDao.delete(6);


        // update
        User updated  = userDao.read(13);
        System.out.println(updated);

        updated.setUsername("ted");
        updated.setEmail("atd@icloud.com");
        updated.setPassword("88");

        userDao.update(updated);
        System.out.println("updated" + updated);
    }
}






