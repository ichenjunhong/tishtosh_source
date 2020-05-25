package com.p683ss.android.ugc.aweme.shortvideo.reaction;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams */
public class ReactionParams implements Parcelable, Serializable {
    public static final Creator<ReactionParams> CREATOR = new Creator<ReactionParams>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ReactionParams[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ReactionParams(parcel);
        }
    };
    @C17952c(mo34828a = "non_reacted_video")
    public boolean nonReacted;
    @C17952c(mo34828a = "reaction_from_author")
    public User reactionFromAuthor;
    @C17952c(mo34828a = "reaction_from_id")
    public String reactionFromId;
    @C17952c(mo34828a = "reaction_origin_id")
    public String reactionOriginId;
    @C17952c(mo34828a = "reaction_view_id")
    public String reactionViewId;
    @C17952c(mo34828a = "video_height")
    public int videoHeight;
    @C17952c(mo34828a = "video_path")
    public String videoPath;
    @C17952c(mo34828a = "video_width")
    public int videoWidth;
    @C17952c(mo34828a = "wav_path")
    public String wavPath;
    @C17952c(mo34828a = "react_shape_list")
    public List<CopiedReactionWindowInfo> windowInfoList = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public ReactionParams() {
    }

    public boolean removeReactionWindowInfo() {
        if (this.windowInfoList.size() <= 0) {
            return false;
        }
        this.windowInfoList.remove(this.windowInfoList.size() - 1);
        return true;
    }

    public void addReactionWindowInfo(CopiedReactionWindowInfo copiedReactionWindowInfo) {
        this.windowInfoList.add(copiedReactionWindowInfo);
    }

    protected ReactionParams(Parcel parcel) {
        boolean z;
        this.videoPath = parcel.readString();
        this.wavPath = parcel.readString();
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.reactionViewId = parcel.readString();
        this.reactionOriginId = parcel.readString();
        this.reactionFromId = parcel.readString();
        this.reactionFromAuthor = (User) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.nonReacted = z;
        this.windowInfoList = parcel.createTypedArrayList(CopiedReactionWindowInfo.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.wavPath);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeString(this.reactionViewId);
        parcel.writeString(this.reactionOriginId);
        parcel.writeString(this.reactionFromId);
        parcel.writeSerializable(this.reactionFromAuthor);
        parcel.writeByte(this.nonReacted ? (byte) 1 : 0);
        parcel.writeTypedList(this.windowInfoList);
    }
}
