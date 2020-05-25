package com.p683ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct */
public class AVTextExtraStruct implements Parcelable, Serializable {
    public static final Creator<AVTextExtraStruct> CREATOR = new Creator<AVTextExtraStruct>() {
        public final AVTextExtraStruct[] newArray(int i) {
            return new AVTextExtraStruct[i];
        }

        public final AVTextExtraStruct createFromParcel(Parcel parcel) {
            return new AVTextExtraStruct(parcel);
        }
    };
    @C17952c(mo34828a = "at_user_type")
    String atUserType;
    @C17952c(mo34828a = "aweme_id")
    String awemeId;
    String cid;
    @C17952c(mo34828a = "end")
    int end;
    @C17952c(mo34828a = "hashtag_name")
    String hashTagName;
    boolean isStarAtlasTag;
    @C17952c(mo34828a = "start")
    int start;
    @C17952c(mo34828a = "sub_type")
    int subType;
    @C17952c(mo34828a = "type")
    int type;
    @C17952c(mo34828a = "user_id")
    String userId;

    public AVTextExtraStruct() {
    }

    public int describeContents() {
        return 0;
    }

    public String getAtUserType() {
        return this.atUserType;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getEnd() {
        return this.end;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public int getStart() {
        return this.start;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isStarAtlasTag() {
        return this.isStarAtlasTag;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.userId != null) {
            i = this.userId.hashCode();
        } else {
            i = 0;
        }
        int i4 = (((i + 0) * 31) + this.type + this.subType) * 31;
        if (this.atUserType != null) {
            i2 = this.atUserType.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (this.hashTagName != null) {
            i3 = this.hashTagName.hashCode();
        }
        return i5 + i3;
    }

    public void setAtUserType(String str) {
        this.atUserType = str;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setHashTagName(String str) {
        this.hashTagName = str;
    }

    public void setStarAtlasTag(boolean z) {
        this.isStarAtlasTag = z;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    protected AVTextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readString();
        this.type = parcel.readInt();
        this.atUserType = parcel.readString();
        this.hashTagName = parcel.readString();
        this.awemeId = parcel.readString();
        this.subType = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AVTextExtraStruct)) {
            return false;
        }
        AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
        if (this.type != aVTextExtraStruct.type || this.subType != aVTextExtraStruct.subType) {
            return false;
        }
        if (this.userId == null ? aVTextExtraStruct.userId != null : !this.userId.equals(aVTextExtraStruct.userId)) {
            return false;
        }
        if (!TextUtils.equals(this.hashTagName, aVTextExtraStruct.hashTagName)) {
            return false;
        }
        if (this.atUserType != null) {
            return this.atUserType.equals(aVTextExtraStruct.atUserType);
        }
        if (aVTextExtraStruct.atUserType == null) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeString(this.userId);
        parcel.writeInt(this.type);
        parcel.writeString(this.atUserType);
        parcel.writeString(this.hashTagName);
        parcel.writeString(this.awemeId);
        parcel.writeInt(this.subType);
    }
}
