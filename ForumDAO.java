package Com.SocialNetworkBE.Dao;

import java.util.List;

import Com.SocialNetworkBE.Model.Forum;

public interface ForumDAO {
	
		public boolean addForum(Forum forum);
		public boolean updateForum(Forum forum);
		public boolean deleteForum(Forum forum);
		public Forum getForum(int forumId);
		public List <Forum> getAllForums();
		public boolean approveForum(Forum forum);
		public boolean rejectForum(Forum forum);

	}




