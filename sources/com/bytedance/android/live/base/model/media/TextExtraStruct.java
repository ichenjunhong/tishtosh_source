package com.bytedance.android.live.base.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;

public class TextExtraStruct implements Parcelable {
    public static final Creator<TextExtraStruct> CREATOR = new Creator<TextExtraStruct>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TextExtraStruct[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TextExtraStruct(parcel);
        }
    };
    @C17952c(mo34828a = "end")
    private int end;
    private transient boolean isAddPosition;
    @C17952c(mo34828a = "start")
    private int start;
    @C17952c(mo34828a = "user_id")
    private long userId;

    public TextExtraStruct() {
    }

    public int describeContents() {
        return 0;
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public long getUserId() {
        return this.userId;
    }

    public boolean isAddPosition() {
        return this.isAddPosition;
    }

    public void setAddPosition(boolean z) {
        this.isAddPosition = z;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setUserId(long j) {
        this.userId = j;
    }

    protected TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeLong(this.userId);
    }
}
