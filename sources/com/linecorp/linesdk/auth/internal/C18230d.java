package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.linecorp.linesdk.p1086a.C18216f;

/* renamed from: com.linecorp.linesdk.auth.internal.d */
final class C18230d implements Parcelable {
    public static final Creator<C18230d> CREATOR = new Creator<C18230d>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C18230d[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C18230d(parcel, 0);
        }
    };

    /* renamed from: a */
    C18216f f50329a;

    /* renamed from: b */
    String f50330b;

    /* renamed from: c */
    String f50331c;

    /* renamed from: d */
    int f50332d;

    /* renamed from: com.linecorp.linesdk.auth.internal.d$a */
    enum C18232a {
        ;

        /* renamed from: a */
        public static int[] m44424a() {
            return (int[]) f50337e.clone();
        }

        static {
            f50337e = new int[]{f50333a, f50334b, f50335c, f50336d};
        }
    }

    public final int describeContents() {
        return 0;
    }

    C18230d() {
        this.f50332d = C18232a.f50333a;
    }

    private C18230d(Parcel parcel) {
        C18216f fVar;
        this.f50332d = C18232a.f50333a;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (TextUtils.isEmpty(readString) || TextUtils.isEmpty(readString2)) {
            fVar = null;
        } else {
            fVar = new C18216f(readString, readString2);
        }
        this.f50329a = fVar;
        this.f50330b = parcel.readString();
        this.f50332d = C18232a.m44424a()[parcel.readByte()];
        this.f50331c = parcel.readString();
    }

    /* synthetic */ C18230d(Parcel parcel, byte b) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2 = null;
        if (this.f50329a == null) {
            str = null;
        } else {
            str = this.f50329a.f50277a;
        }
        parcel.writeString(str);
        if (this.f50329a != null) {
            str2 = this.f50329a.f50278b;
        }
        parcel.writeString(str2);
        parcel.writeString(this.f50330b);
        parcel.writeByte((byte) (this.f50332d - 1));
        parcel.writeString(this.f50331c);
    }
}
