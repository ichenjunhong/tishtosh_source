package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice */
public class UserTextNotice {
    @C17952c(mo34828a = "content")
    String content;
    @C17952c(mo34828a = "image_url")
    UrlModel imageUrl;
    @C17952c(mo34828a = "object_id")
    String objectId;
    @C17952c(mo34828a = "schema_url")
    String schemaUrl;
    @C17952c(mo34828a = "sub_type")
    int subType;
    @C17952c(mo34828a = "task_id")
    long taskId;
    @C17952c(mo34828a = "title")
    String title;
    @C17952c(mo34828a = "user_info")
    User user;

    public String getContent() {
        return this.content;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getSubType() {
        return this.subType;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setObjectId(String str) {
        this.objectId = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
