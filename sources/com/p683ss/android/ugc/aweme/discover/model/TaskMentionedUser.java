package com.p683ss.android.ugc.aweme.discover.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.TaskMentionedUser */
public class TaskMentionedUser implements Parcelable, Serializable {
    public static final Creator<TaskMentionedUser> CREATOR = new Creator<TaskMentionedUser>() {
        public final TaskMentionedUser[] newArray(int i) {
            return new TaskMentionedUser[i];
        }

        public final TaskMentionedUser createFromParcel(Parcel parcel) {
            return new TaskMentionedUser(parcel);
        }
    };
    @C17952c(mo34828a = "nickname")
    private String nickname;
    @C17952c(mo34828a = "uid")
    private String userId;

    public int describeContents() {
        return 0;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    protected TaskMentionedUser(Parcel parcel) {
        this.userId = parcel.readString();
        this.nickname = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.nickname);
    }
}
