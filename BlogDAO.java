package Com.SocialNetworkBE.Dao;

import java.util.List;

import Com.SocialNetworkBE.Model.Blog;

public interface BlogDAO {
	public boolean addBlog(Blog blog);
	public boolean updateBlog(Blog blog);
	public boolean deleteBlog(Blog blog);
	public Blog getBlog(int blogId);
	public List <Blog> getAllBlogs();
	public boolean approveBlog(Blog blog);
public boolean rejectBlog(Blog blog);
}
