package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.api.model.LifeStory;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.StoryNotice */
public class StoryNotice {
    @C17952c(mo34828a = "comment")
    Comment comment;
    @C17952c(mo34828a = "content")
    String content;
    @C17952c(mo34828a = "is_expired")
    boolean isExpired;
    @C17952c(mo34828a = "story")
    LifeStory lifeStory;
    @C17952c(mo34828a = "merge_count")
    int mergeCount;
    @C17952c(mo34828a = "from_user")
    List<User> users;

    public Comment getComment() {
        return this.comment;
    }

    public String getContent() {
        return this.content;
    }

    public LifeStory getLifeStory() {
        return this.lifeStory;
    }

    public int getMergeCount() {
        return this.mergeCount;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public boolean isExpired() {
        return this.isExpired;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setExpired(boolean z) {
        this.isExpired = z;
    }

    public void setLifeStory(LifeStory lifeStory2) {
        this.lifeStory = lifeStory2;
    }

    public void setMergeCount(int i) {
        this.mergeCount = i;
    }

    public void setUsers(List<User> list) {
        this.users = list;
    }
}
