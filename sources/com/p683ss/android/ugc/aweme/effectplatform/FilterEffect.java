package com.p683ss.android.ugc.aweme.effectplatform;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.FilterEffect */
public final class FilterEffect extends Effect implements Parcelable {
    public static final Creator<FilterEffect> CREATOR = new C29239b();
    public static final C29238a Companion = new C29238a(null);
    @C17952c(mo34828a = "is_checked")

    /* renamed from: a */
    private boolean f76574a;
    @C17952c(mo34828a = "is_buildin")

    /* renamed from: b */
    private boolean f76575b;

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.FilterEffect$a */
    public static final class C29238a {
        private C29238a() {
        }

        public /* synthetic */ C29238a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.FilterEffect$b */
    public static final class C29239b implements Creator<FilterEffect> {
        C29239b() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FilterEffect[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "source");
            return new FilterEffect(parcel);
        }
    }

    public FilterEffect() {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean getBuildIn() {
        return this.f76575b;
    }

    public final boolean getChecked() {
        return this.f76574a;
    }

    public final int getInt(boolean z) {
        return z ? 1 : 0;
    }

    public final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public final void setBuildIn(boolean z) {
        this.f76575b = z;
    }

    public final void setChecked(boolean z) {
        this.f76574a = z;
    }

    public FilterEffect(Parcel parcel) {
        boolean z;
        C52711k.m112240b(parcel, "source");
        super(parcel);
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f76574a = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f76575b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeByte((byte) getInt(this.f76574a));
        parcel.writeByte((byte) getInt(this.f76574a));
    }
}
