package com.p683ss.android.ugc.aweme.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ugc.aweme.feedback.FeedbackItem */
public class FeedbackItem implements Parcelable {
    public static final Creator<FeedbackItem> CREATOR = new Creator<FeedbackItem>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FeedbackItem[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FeedbackItem(parcel);
        }
    };

    /* renamed from: a */
    public String f81886a;

    /* renamed from: b */
    public String f81887b;

    /* renamed from: c */
    public String f81888c;

    /* renamed from: d */
    public String f81889d;

    /* renamed from: e */
    public String f81890e;

    /* renamed from: f */
    public int f81891f;

    public FeedbackItem() {
    }

    public int describeContents() {
        return 0;
    }

    protected FeedbackItem(Parcel parcel) {
        this.f81886a = parcel.readString();
        this.f81887b = parcel.readString();
        this.f81888c = parcel.readString();
        this.f81889d = parcel.readString();
        this.f81890e = parcel.readString();
        this.f81891f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f81886a);
        parcel.writeString(this.f81887b);
        parcel.writeString(this.f81888c);
        parcel.writeString(this.f81889d);
        parcel.writeString(this.f81890e);
        parcel.writeInt(this.f81891f);
    }
}
