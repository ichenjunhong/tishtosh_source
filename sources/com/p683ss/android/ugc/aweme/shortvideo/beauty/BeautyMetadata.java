package com.p683ss.android.ugc.aweme.shortvideo.beauty;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata */
public final class BeautyMetadata implements Parcelable, Serializable {
    public static final C42450a CREATOR = new C42450a(null);
    @C17952c(mo34828a = "te_record_beauty_name")

    /* renamed from: a */
    private String f107351a;
    @C17952c(mo34828a = "te_record_beauty_strength")

    /* renamed from: b */
    private String f107352b;
    @C17952c(mo34828a = "te_record_beauty_id")

    /* renamed from: c */
    private String f107353c;
    @C17952c(mo34828a = "te_record_beauty_res")

    /* renamed from: d */
    private String f107354d;
    @C17952c(mo34828a = "te_record_beauty_res_valid")

    /* renamed from: e */
    private String f107355e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata$a */
    public static final class C42450a implements Creator<BeautyMetadata> {
        private C42450a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BeautyMetadata[i];
        }

        public /* synthetic */ C42450a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new BeautyMetadata(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String getBeautyId() {
        return this.f107353c;
    }

    public final String getBeautyName() {
        return this.f107351a;
    }

    public final String getBeautyRes() {
        return this.f107354d;
    }

    public final String getBeautyStrength() {
        return this.f107352b;
    }

    public final String getBeautyValid() {
        return this.f107355e;
    }

    public BeautyMetadata() {
        this.f107351a = "";
        this.f107352b = "";
        this.f107353c = "";
        this.f107354d = "";
        this.f107355e = "";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeautyMetadata:id=");
        sb.append(this.f107353c);
        sb.append(",name=");
        sb.append(this.f107351a);
        sb.append(",strength=");
        sb.append(this.f107352b);
        sb.append(",res=");
        sb.append(this.f107354d);
        sb.append(",valid=");
        sb.append(this.f107355e);
        return sb.toString();
    }

    public final void setBeautyId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f107353c = str;
    }

    public final void setBeautyName(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f107351a = str;
    }

    public final void setBeautyRes(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f107354d = str;
    }

    public final void setBeautyStrength(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f107352b = str;
    }

    public final void setBeautyValid(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f107355e = str;
    }

    public BeautyMetadata(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        String readString = parcel.readString();
        C52711k.m112236a((Object) readString, "parcel.readString()");
        this.f107351a = readString;
        String readString2 = parcel.readString();
        C52711k.m112236a((Object) readString2, "parcel.readString()");
        this.f107352b = readString2;
        String readString3 = parcel.readString();
        C52711k.m112236a((Object) readString3, "parcel.readString()");
        this.f107353c = readString3;
        String readString4 = parcel.readString();
        C52711k.m112236a((Object) readString4, "parcel.readString()");
        this.f107354d = readString4;
        String readString5 = parcel.readString();
        C52711k.m112236a((Object) readString5, "parcel.readString()");
        this.f107355e = readString5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f107351a);
            parcel.writeString(this.f107352b);
            parcel.writeString(this.f107353c);
            parcel.writeString(this.f107354d);
            parcel.writeString(this.f107355e);
        }
    }
}
