package com.p683ss.android.ugc.aweme.message.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28214a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.message.model.SimpleUser */
public class SimpleUser implements Serializable {
    static final long serialVersionUID = 42;
    @C17952c(mo34828a = "avatar_thumb")
    UrlModel avatarThumb;
    @C17952c(mo34828a = "follow_status")
    int followStatus;
    @C17952c(mo34828a = "nickname")
    String nickName;
    @C17952c(mo34828a = "signature")
    String signature;
    @C17952c(mo34828a = "hit_task_info")
    C28214a taskInfo;
    private int type;
    @C17952c(mo34828a = "uid")
    String uid;

    public SimpleUser() {
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public int getFollowStatus() {
        return this.followStatus;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getSignature() {
        return this.signature;
    }

    public C28214a getTaskInfo() {
        return this.taskInfo;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public int hashCode() {
        if (getUid() != null) {
            return getUid().hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SimpleUser{uid='");
        sb.append(this.uid);
        sb.append('\'');
        sb.append(", nickName='");
        sb.append(this.nickName);
        sb.append('\'');
        sb.append(", signature='");
        sb.append(this.signature);
        sb.append('\'');
        sb.append(", avatarThumb=");
        sb.append(this.avatarThumb);
        sb.append('}');
        return sb.toString();
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public SimpleUser setTaskInfo(C28214a aVar) {
        this.taskInfo = aVar;
        return this;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setFollowStatus(Integer num) {
        this.followStatus = num.intValue();
    }

    public static SimpleUser fromUser(User user) {
        SimpleUser simpleUser = new SimpleUser();
        simpleUser.setNickName(user.getNickname());
        simpleUser.setAvatarThumb(user.getAvatarThumb());
        simpleUser.setSignature(user.getSignature());
        simpleUser.setUid(user.getUid());
        simpleUser.setFollowStatus(user.getFollowStatus());
        return simpleUser;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleUser)) {
            return false;
        }
        SimpleUser simpleUser = (SimpleUser) obj;
        if (getUid() != null) {
            return getUid().equals(simpleUser.getUid());
        }
        if (simpleUser.getUid() == null) {
            return true;
        }
        return false;
    }

    public SimpleUser(String str, String str2, String str3, UrlModel urlModel, int i) {
        this.uid = str;
        this.nickName = str2;
        this.signature = str3;
        this.avatarThumb = urlModel;
        this.followStatus = i;
    }
}
