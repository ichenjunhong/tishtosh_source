package com.p683ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam */
public final class ClientCherEffectParam implements Parcelable, Serializable {
    public static final C42367a CREATOR = new C42367a(null);
    @C17952c(mo34828a = "matrix")

    /* renamed from: a */
    private String[] f106990a;
    @C17952c(mo34828a = "duration")

    /* renamed from: b */
    private double[] f106991b;
    @C17952c(mo34828a = "segUseCher")

    /* renamed from: c */
    private boolean[] f106992c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam$a */
    public static final class C42367a implements Creator<ClientCherEffectParam> {
        private C42367a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ClientCherEffectParam[i];
        }

        public /* synthetic */ C42367a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new ClientCherEffectParam(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final double[] getDuration() {
        return this.f106991b;
    }

    public final String[] getMatrix() {
        return this.f106990a;
    }

    public final boolean[] getSegUseCher() {
        return this.f106992c;
    }

    public final void setDuration(double[] dArr) {
        this.f106991b = dArr;
    }

    public final void setMatrix(String[] strArr) {
        this.f106990a = strArr;
    }

    public final void setSegUseCher(boolean[] zArr) {
        this.f106992c = zArr;
    }

    public ClientCherEffectParam(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this(parcel.createStringArray(), parcel.createDoubleArray(), parcel.createBooleanArray());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeStringArray(this.f106990a);
        parcel.writeDoubleArray(this.f106991b);
        parcel.writeBooleanArray(this.f106992c);
    }

    public ClientCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f106990a = strArr;
        this.f106991b = dArr;
        this.f106992c = zArr;
    }
}
