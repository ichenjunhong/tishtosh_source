package com.p683ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.draft.model.VideoCategoryParam */
public final class VideoCategoryParam implements Parcelable, Serializable {
    public static final Creator CREATOR = new C29056a();
    @C17952c(mo34828a = "categoryName")

    /* renamed from: a */
    private final String f76026a;
    @C17952c(mo34828a = "categoryIndex")

    /* renamed from: b */
    private final int f76027b;

    /* renamed from: com.ss.android.ugc.aweme.draft.model.VideoCategoryParam$a */
    public static class C29056a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            return new VideoCategoryParam(parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new VideoCategoryParam[i];
        }
    }

    public VideoCategoryParam() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ VideoCategoryParam copy$default(VideoCategoryParam videoCategoryParam, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = videoCategoryParam.f76026a;
        }
        if ((i2 & 2) != 0) {
            i = videoCategoryParam.f76027b;
        }
        return videoCategoryParam.copy(str, i);
    }

    public final String component1() {
        return this.f76026a;
    }

    public final int component2() {
        return this.f76027b;
    }

    public final VideoCategoryParam copy(String str, int i) {
        return new VideoCategoryParam(str, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final int getCategoryIndex() {
        return this.f76027b;
    }

    public final String getCategoryName() {
        return this.f76026a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCategoryParam(categoryName=");
        sb.append(this.f76026a);
        sb.append(", categoryIndex=");
        sb.append(this.f76027b);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f76026a);
        parcel.writeInt(this.f76027b);
    }

    public final int hashCode() {
        String str = this.f76026a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        String str = this.f76026a;
        String str2 = null;
        if (!(obj instanceof VideoCategoryParam)) {
            obj = null;
        }
        VideoCategoryParam videoCategoryParam = (VideoCategoryParam) obj;
        if (videoCategoryParam != null) {
            str2 = videoCategoryParam.f76026a;
        }
        return C52711k.m112239a((Object) str, (Object) str2);
    }

    public VideoCategoryParam(String str, int i) {
        this.f76026a = str;
        this.f76027b = i;
    }

    public /* synthetic */ VideoCategoryParam(String str, int i, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        this(str, i);
    }
}
