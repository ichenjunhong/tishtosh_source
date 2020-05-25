package android.support.p030v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.BackStackState */
final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new Creator<BackStackState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BackStackState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }
    };

    /* renamed from: a */
    final int[] f2071a;

    /* renamed from: b */
    final int f2072b;

    /* renamed from: c */
    final int f2073c;

    /* renamed from: d */
    final String f2074d;

    /* renamed from: e */
    final int f2075e;

    /* renamed from: f */
    final int f2076f;

    /* renamed from: g */
    final CharSequence f2077g;

    /* renamed from: h */
    final int f2078h;

    /* renamed from: i */
    final CharSequence f2079i;

    /* renamed from: j */
    final ArrayList<String> f2080j;

    /* renamed from: k */
    final ArrayList<String> f2081k;

    /* renamed from: l */
    final boolean f2082l;

    public final int describeContents() {
        return 0;
    }

    public BackStackState(Parcel parcel) {
        boolean z;
        this.f2071a = parcel.createIntArray();
        this.f2072b = parcel.readInt();
        this.f2073c = parcel.readInt();
        this.f2074d = parcel.readString();
        this.f2075e = parcel.readInt();
        this.f2076f = parcel.readInt();
        this.f2077g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2078h = parcel.readInt();
        this.f2079i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2080j = parcel.createStringArrayList();
        this.f2081k = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2082l = z;
    }

    public BackStackState(C0645d dVar) {
        int i;
        int size = dVar.f2311b.size();
        this.f2071a = new int[(size * 6)];
        if (dVar.f2318i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                C0646a aVar = (C0646a) dVar.f2311b.get(i2);
                int i4 = i3 + 1;
                this.f2071a[i3] = aVar.f2331a;
                int[] iArr = this.f2071a;
                int i5 = i4 + 1;
                if (aVar.f2332b != null) {
                    i = aVar.f2332b.mIndex;
                } else {
                    i = -1;
                }
                iArr[i4] = i;
                int i6 = i5 + 1;
                this.f2071a[i5] = aVar.f2333c;
                int i7 = i6 + 1;
                this.f2071a[i6] = aVar.f2334d;
                int i8 = i7 + 1;
                this.f2071a[i7] = aVar.f2335e;
                int i9 = i8 + 1;
                this.f2071a[i8] = aVar.f2336f;
                i2++;
                i3 = i9;
            }
            this.f2072b = dVar.f2316g;
            this.f2073c = dVar.f2317h;
            this.f2074d = dVar.f2320k;
            this.f2075e = dVar.f2322m;
            this.f2076f = dVar.f2323n;
            this.f2077g = dVar.f2324o;
            this.f2078h = dVar.f2325p;
            this.f2079i = dVar.f2326q;
            this.f2080j = dVar.f2327r;
            this.f2081k = dVar.f2328s;
            this.f2082l = dVar.f2329t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public final C0645d mo1799a(C0658m mVar) {
        C0645d dVar = new C0645d(mVar);
        int i = 0;
        while (i < this.f2071a.length) {
            C0646a aVar = new C0646a();
            int i2 = i + 1;
            aVar.f2331a = this.f2071a[i];
            int i3 = i2 + 1;
            int i4 = this.f2071a[i2];
            if (i4 >= 0) {
                aVar.f2332b = (Fragment) mVar.f2363f.get(i4);
            } else {
                aVar.f2332b = null;
            }
            int i5 = i3 + 1;
            aVar.f2333c = this.f2071a[i3];
            int i6 = i5 + 1;
            aVar.f2334d = this.f2071a[i5];
            int i7 = i6 + 1;
            aVar.f2335e = this.f2071a[i6];
            int i8 = i7 + 1;
            aVar.f2336f = this.f2071a[i7];
            dVar.f2312c = aVar.f2333c;
            dVar.f2313d = aVar.f2334d;
            dVar.f2314e = aVar.f2335e;
            dVar.f2315f = aVar.f2336f;
            dVar.mo2183a(aVar);
            i = i8;
        }
        dVar.f2316g = this.f2072b;
        dVar.f2317h = this.f2073c;
        dVar.f2320k = this.f2074d;
        dVar.f2322m = this.f2075e;
        dVar.f2318i = true;
        dVar.f2323n = this.f2076f;
        dVar.f2324o = this.f2077g;
        dVar.f2325p = this.f2078h;
        dVar.f2326q = this.f2079i;
        dVar.f2327r = this.f2080j;
        dVar.f2328s = this.f2081k;
        dVar.f2329t = this.f2082l;
        dVar.mo2181a(1);
        return dVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2071a);
        parcel.writeInt(this.f2072b);
        parcel.writeInt(this.f2073c);
        parcel.writeString(this.f2074d);
        parcel.writeInt(this.f2075e);
        parcel.writeInt(this.f2076f);
        TextUtils.writeToParcel(this.f2077g, parcel, 0);
        parcel.writeInt(this.f2078h);
        TextUtils.writeToParcel(this.f2079i, parcel, 0);
        parcel.writeStringList(this.f2080j);
        parcel.writeStringList(this.f2081k);
        parcel.writeInt(this.f2082l ? 1 : 0);
    }
}
