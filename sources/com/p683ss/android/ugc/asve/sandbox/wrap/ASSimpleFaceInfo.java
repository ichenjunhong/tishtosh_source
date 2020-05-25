package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo */
public final class ASSimpleFaceInfo implements Parcelable {
    public static final C20811a CREATOR = new C20811a(null);

    /* renamed from: a */
    public float f56706a;

    /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo$a */
    public static final class C20811a implements Creator<ASSimpleFaceInfo> {
        private C20811a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ASSimpleFaceInfo[i];
        }

        public /* synthetic */ C20811a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new ASSimpleFaceInfo(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public ASSimpleFaceInfo(float f) {
        this.f56706a = f;
    }

    public ASSimpleFaceInfo(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this(parcel.readFloat());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeFloat(this.f56706a);
    }
}
