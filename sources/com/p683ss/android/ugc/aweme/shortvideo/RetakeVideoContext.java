package com.p683ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.vesdk.VERecordData;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext */
public final class RetakeVideoContext implements Parcelable {
    public static final C42372a CREATOR = new C42372a(null);

    /* renamed from: a */
    public long f107012a;

    /* renamed from: b */
    public long f107013b;

    /* renamed from: c */
    public int f107014c;

    /* renamed from: d */
    public VERecordData f107015d;

    /* renamed from: e */
    public MultiEditVideoStatusRecordData f107016e;

    /* renamed from: f */
    public String f107017f;

    /* renamed from: g */
    public StitchParams f107018g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext$a */
    public static final class C42372a implements Creator<RetakeVideoContext> {
        private C42372a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RetakeVideoContext[i];
        }

        public /* synthetic */ C42372a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new RetakeVideoContext(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public RetakeVideoContext() {
        String str = C43308eb.f109492e;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sTmpDir");
        this.f107017f = str;
    }

    public RetakeVideoContext(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        this.f107012a = parcel.readLong();
        this.f107013b = parcel.readLong();
        this.f107014c = parcel.readInt();
        this.f107015d = (VERecordData) parcel.readParcelable(VERecordData.class.getClassLoader());
        String readString = parcel.readString();
        if (readString == null) {
            readString = C43308eb.f109492e;
            C52711k.m112236a((Object) readString, "ShortVideoConfig2.sTmpDir");
        }
        this.f107017f = readString;
        this.f107016e = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
        this.f107018g = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeLong(this.f107012a);
        parcel.writeLong(this.f107013b);
        parcel.writeInt(this.f107014c);
        parcel.writeParcelable(this.f107015d, i);
        parcel.writeString(this.f107017f);
        parcel.writeParcelable(this.f107016e, i);
        parcel.writeParcelable(this.f107018g, i);
    }
}
