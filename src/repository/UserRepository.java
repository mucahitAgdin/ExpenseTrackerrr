package repository;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String, User> users; // kullanıcıları isimlerine göre saklar

    //constructor
    public UserRepository(){
        users = new HashMap<>();
    }

    // yeni bir kullanıcı ekler
    public void addUser(User user) {
        users.put(user.getName(), user); // kullancıyı isim ile haritaya ekler
    }
    
    //isimle kullanıcı bulur 
    public User findUserByName(String name) {
        return users.get(name); // isimle kullanıcıyı arar
    }
}
