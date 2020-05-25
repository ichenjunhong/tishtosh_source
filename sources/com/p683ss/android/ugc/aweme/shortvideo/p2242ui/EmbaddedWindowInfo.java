package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo */
public final class EmbaddedWindowInfo implements Parcelable {
    public static final C44902a CREATOR = new C44902a(null);
    @C17952c(mo34828a = "w")

    /* renamed from: a */
    public int f113634a;
    @C17952c(mo34828a = "h")

    /* renamed from: b */
    public int f113635b;
    @C17952c(mo34828a = "x")

    /* renamed from: c */
    public int f113636c;
    @C17952c(mo34828a = "y")

    /* renamed from: d */
    public int f113637d;
    @C17952c(mo34828a = "s")

    /* renamed from: e */
    public int f113638e;
    @C17952c(mo34828a = "e")

    /* renamed from: f */
    public int f113639f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo$a */
    public static final class C44902a implements Creator<EmbaddedWindowInfo> {
        private C44902a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new EmbaddedWindowInfo[i];
        }

        public /* synthetic */ C44902a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new EmbaddedWindowInfo(parcel);
        }
    }

    public EmbaddedWindowInfo() {
    }

    public final int describeContents() {
        return 0;
    }

    public EmbaddedWindowInfo(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        this.f113634a = parcel.readInt();
        this.f113635b = parcel.readInt();
        this.f113636c = parcel.readInt();
        this.f113637d = parcel.readInt();
        this.f113638e = parcel.readInt();
        this.f113639f = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.f113634a);
        parcel.writeInt(this.f113635b);
        parcel.writeInt(this.f113636c);
        parcel.writeInt(this.f113637d);
        parcel.writeInt(this.f113638e);
        parcel.writeInt(this.f113639f);
    }
}
