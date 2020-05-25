package com.p683ss.android.ugc.aweme.greenscreen;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17950a;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenImage */
public final class GreenScreenImage implements Parcelable, Serializable {
    public static final C32858a CREATOR = new C32858a(null);
    @C17952c(mo34828a = "background_id")

    /* renamed from: a */
    private final String f85462a;
    @C17950a(mo34824a = false, mo34825b = false)

    /* renamed from: b */
    private String f85463b;
    @C17950a(mo34824a = false, mo34825b = false)

    /* renamed from: c */
    private String f85464c;
    @C17952c(mo34828a = "background_type")

    /* renamed from: d */
    private String f85465d;

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenImage$a */
    public static final class C32858a implements Creator<GreenScreenImage> {
        private C32858a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GreenScreenImage[i];
        }

        public /* synthetic */ C32858a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new GreenScreenImage(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String getBackgroundType() {
        return this.f85465d;
    }

    public final String getCoverLarge() {
        return this.f85464c;
    }

    public final String getCoverThumb() {
        return this.f85463b;
    }

    public final String getImageId() {
        return this.f85462a;
    }

    public final void setBackgroundType(String str) {
        this.f85465d = str;
    }

    public final void setCoverLarge(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f85464c = str;
    }

    public final void setCoverThumb(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f85463b = str;
    }

    public GreenScreenImage(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this(parcel.readString(), null, null, parcel.readString(), 6, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f85462a);
        parcel.writeString(this.f85465d);
    }

    public GreenScreenImage(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str2, "coverThumb");
        C52711k.m112240b(str3, "coverLarge");
        this.f85462a = str;
        this.f85463b = str2;
        this.f85464c = str3;
        this.f85465d = str4;
    }

    public /* synthetic */ GreenScreenImage(String str, String str2, String str3, String str4, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "library";
        }
        this(str, str2, str3, str4);
    }
}
