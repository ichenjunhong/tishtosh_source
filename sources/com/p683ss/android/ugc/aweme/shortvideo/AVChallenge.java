package com.p683ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.C23460b;
import com.p683ss.android.ugc.aweme.discover.model.TaskAnchorInfo;
import com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.AVChallenge */
public class AVChallenge implements Parcelable, Serializable {
    public static final Creator<AVChallenge> CREATOR = new Creator<AVChallenge>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AVChallenge[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AVChallenge(parcel);
        }
    };
    @C17952c(mo34828a = "anchor")
    public TaskAnchorInfo anchor;
    @C17952c(mo34828a = "cha_name")
    public String challengeName;
    @C23460b
    @C17952c(mo34828a = "cid")
    public String cid;
    @C17952c(mo34828a = "group_id")
    public String groupId;
    @C17952c(mo34828a = "is_commerce")
    public boolean isCommerce;
    @C17952c(mo34828a = "mentioned_users")
    public List<TaskMentionedUser> mentionedUsers;
    @C17952c(mo34828a = "sticker_id")
    public String stickerId;
    @C17952c(mo34828a = "type")
    public int type;
    @C17952c(mo34828a = "user_count")
    public int userCount;
    @C17952c(mo34828a = "view_count")
    public long viewCount = -1;

    public int describeContents() {
        return 0;
    }

    public TaskAnchorInfo getAnchor() {
        return this.anchor;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getCid() {
        return this.cid;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public List<TaskMentionedUser> getMentionedUsers() {
        return this.mentionedUsers;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public AVChallenge() {
    }

    public int hashCode() {
        return this.cid.hashCode();
    }

    public long getDisplayCount() {
        long viewCount2 = getViewCount();
        if (viewCount2 >= 0) {
            return viewCount2;
        }
        return (long) getUserCount();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AVChallenge) || !TextUtils.equals(((AVChallenge) obj).cid, this.cid)) {
            return false;
        }
        return true;
    }

    protected AVChallenge(Parcel parcel) {
        boolean z;
        this.cid = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isCommerce = z;
        this.challengeName = parcel.readString();
        this.type = parcel.readInt();
        this.stickerId = parcel.readString();
        this.viewCount = parcel.readLong();
        this.userCount = parcel.readInt();
        this.mentionedUsers = parcel.createTypedArrayList(TaskMentionedUser.CREATOR);
        this.anchor = (TaskAnchorInfo) parcel.readSerializable();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cid);
        parcel.writeByte(this.isCommerce ? (byte) 1 : 0);
        parcel.writeString(this.challengeName);
        parcel.writeInt(this.type);
        parcel.writeString(this.stickerId);
        parcel.writeLong(this.viewCount);
        parcel.writeInt(this.userCount);
        parcel.writeTypedList(this.mentionedUsers);
        parcel.writeSerializable(this.anchor);
    }
}
