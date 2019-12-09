package InstagramV01.Interface;

import InstagramV01.WorkClasses.User;
import InstagramV01.WorkClasses.UserPost;

public interface ResourceWriter {
    void saveNewUser(User user);

    void saveNewPost(UserPost userPost);
}
