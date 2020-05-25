package com.p683ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.StoryBoomModel */
public final class StoryBoomModel implements Parcelable, Serializable {
    public static final C42379a CREATOR = new C42379a(null);

    /* renamed from: a */
    private int f107162a;

    /* renamed from: b */
    private int f107163b;

    /* renamed from: c */
    private int f107164c;

    /* renamed from: d */
    private int f107165d;

    /* renamed from: e */
    private String f107166e;

    /* renamed from: f */
    private String f107167f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.StoryBoomModel$a */
    public static final class C42379a implements Creator<StoryBoomModel> {
        private C42379a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StoryBoomModel[i];
        }

        public /* synthetic */ C42379a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new StoryBoomModel(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getFps() {
        return this.f107163b;
    }

    public final String getOriginVideoPath() {
        return this.f107166e;
    }

    public final int getReplayTime() {
        return this.f107162a;
    }

    public final String getReverseVideoPath() {
        return this.f107167f;
    }

    public final int getSingleDuration() {
        return this.f107164c;
    }

    public final int getTotalDuration() {
        return this.f107165d;
    }

    public StoryBoomModel() {
        this.f107162a = 3;
        this.f107163b = 20;
    }

    public final String[] getVideoList() {
        List arrayList = new ArrayList();
        int i = this.f107162a;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.f107167f;
            if (str != null) {
                arrayList.add(str);
            }
            String str2 = this.f107166e;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void setFps(int i) {
        this.f107163b = i;
    }

    public final void setOriginVideoPath(String str) {
        this.f107166e = str;
    }

    public final void setReplayTime(int i) {
        this.f107162a = i;
    }

    public final void setReverseVideoPath(String str) {
        this.f107167f = str;
    }

    public final void setSingleDuration(int i) {
        this.f107164c = i;
    }

    public final void setTotalDuration(int i) {
        this.f107165d = i;
    }

    public StoryBoomModel(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        this.f107162a = parcel.readInt();
        this.f107163b = parcel.readInt();
        this.f107164c = parcel.readInt();
        this.f107165d = parcel.readInt();
        this.f107166e = parcel.readString();
        this.f107167f = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.f107162a);
        parcel.writeInt(this.f107163b);
        parcel.writeInt(this.f107164c);
        parcel.writeInt(this.f107165d);
        parcel.writeString(this.f107166e);
        parcel.writeString(this.f107167f);
    }
}
