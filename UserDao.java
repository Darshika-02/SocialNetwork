package Com.SocialNetworkBE.Dao;

import org.springframework.stereotype.Service;

//import java.util.List;

import Com.SocialNetworkBE.Model.User;

@Service
public interface UserDao {

     public boolean addUser(User user);
     public boolean updateOnlineStatus(String status,User user);
	 //boolean saveUser(User user);
}