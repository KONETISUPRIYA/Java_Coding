package OOps;

interface User
{
	void sendrequest(String userId);
	void acceptconnection(String userId);
	void sendmessage(String userId,String message);
	void deletemessage(String userId);
	void postinfo(String info);
	void likepost(String postId);
	void commentpost(String postId,String comment);
	void sendpost(String postId,String userId);
	void block(String userId);
	void searchaccount(String userId);

	
}
  abstract class LinkedIn implements User
{
	protected String name;

  LinkedIn(String name)
  {
	  this.name=name;
  }

  public abstract  void displayLinkedInprofile();
}
  
   class UserProfile extends LinkedIn
  {
	 public UserProfile(String name)
	 {
		 super(name);
	 }
	 
	 @Override
	 public void sendrequest(String userId)
	 {
		 System.out.println("Received a connection request > " + userId);
	 }
	 
	 @Override
	 public void acceptconnection(String userId)
	 {
		 System.out.println("connection request accepted > " + userId);
		 
	 }
	 
	 @Override
	 public void sendmessage(String userId,String message)
	 {
		 System.out.println("A message from " + userId + " the message is > " + message);
	 }
	 
	 @Override
	 public void deletemessage(String userId)
	 {
		 System.out.println("A message deleted by > "+userId);
	 }
	 
	 @Override
	 public void postinfo(String info)
	 {
		 System.out.println("Content message > " +  info);
		 
	 }
	 
	 @Override
	 public void likepost(String postId)
	 {
		 System.out.println("Content liked !! ");
	 }
	 
	 @Override
	 public void commentpost(String postId,String comment)
	 {
		 System.out.println("A comment on " + postId + " is " + comment);
	 } 
	 
	 @Override
	 public void sendpost(String postId,String userId)
	 {
		 System.out.println("post sent to > " + userId);
	 }
	 
	 @Override
	 public void block(String userId)
	 {
		 System.out.println("User blocked > "+userId );
	 }
	 @Override
	 public void searchaccount(String userId)
	 {
		 System.out.println("results of given > "+userId);
	 }
	 @Override
	 public void displayLinkedInprofile()
	 {
		 System.out.println("Username : " +name);
	 }
	 
  }
  
public class Abstraction {

	public static void main(String[] args) {
		UserProfile up=new UserProfile("Supriya");
		up.displayLinkedInprofile();
		up.sendrequest("Jspiders");
		up.acceptconnection("junnu");
		up.sendmessage("junnu", "Hi I am Supriya");
		up.deletemessage("junnu");
		up.block("sredipsj");
		up.likepost("Jspiders placed students");
		up.sendpost("Jspiders placed students", "junnu");
		up.commentpost("Jpsiders placed students", "Congrats!");
		up.searchaccount("junnu");
		up.postinfo("Welcome!");		
				
	}
}
