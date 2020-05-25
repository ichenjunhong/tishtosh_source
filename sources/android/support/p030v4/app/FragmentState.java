package android.support.p030v4.app;

import android.arch.lifecycle.C0159aa;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.FragmentState */
final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new Creator<FragmentState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FragmentState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }
    };

    /* renamed from: a */
    final String f2116a;

    /* renamed from: b */
    final int f2117b;

    /* renamed from: c */
    final boolean f2118c;

    /* renamed from: d */
    final int f2119d;

    /* renamed from: e */
    final int f2120e;

    /* renamed from: f */
    final String f2121f;

    /* renamed from: g */
    final boolean f2122g;

    /* renamed from: h */
    final boolean f2123h;

    /* renamed from: i */
    final Bundle f2124i;

    /* renamed from: j */
    final boolean f2125j;

    /* renamed from: k */
    Bundle f2126k;

    /* renamed from: l */
    Fragment f2127l;

    public final int describeContents() {
        return 0;
    }

    FragmentState(Fragment fragment) {
        this.f2116a = fragment.getClass().getName();
        this.f2117b = fragment.mIndex;
        this.f2118c = fragment.mFromLayout;
        this.f2119d = fragment.mFragmentId;
        this.f2120e = fragment.mContainerId;
        this.f2121f = fragment.mTag;
        this.f2122g = fragment.mRetainInstance;
        this.f2123h = fragment.mDetached;
        this.f2124i = fragment.mArguments;
        this.f2125j = fragment.mHidden;
    }

    FragmentState(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f2116a = parcel.readString();
        this.f2117b = parcel.readInt();
        boolean z4 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2118c = z;
        this.f2119d = parcel.readInt();
        this.f2120e = parcel.readInt();
        this.f2121f = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f2122g = z2;
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f2123h = z3;
        this.f2124i = parcel.readBundle();
        if (parcel.readInt() != 0) {
            z4 = true;
        }
        this.f2125j = z4;
        this.f2126k = parcel.readBundle();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2116a);
        parcel.writeInt(this.f2117b);
        parcel.writeInt(this.f2118c ? 1 : 0);
        parcel.writeInt(this.f2119d);
        parcel.writeInt(this.f2120e);
        parcel.writeString(this.f2121f);
        parcel.writeInt(this.f2122g ? 1 : 0);
        parcel.writeInt(this.f2123h ? 1 : 0);
        parcel.writeBundle(this.f2124i);
        parcel.writeInt(this.f2125j ? 1 : 0);
        parcel.writeBundle(this.f2126k);
    }

    /* renamed from: a */
    public final Fragment mo2042a(C0653j jVar, C0651h hVar, Fragment fragment, C0676o oVar, C0159aa aaVar) {
        if (this.f2127l == null) {
            Context context = jVar.f2344c;
            if (this.f2124i != null) {
                this.f2124i.setClassLoader(context.getClassLoader());
            }
            if (hVar != null) {
                this.f2127l = hVar.mo1967a(context, this.f2116a, this.f2124i);
            } else {
                this.f2127l = Fragment.instantiate(context, this.f2116a, this.f2124i);
            }
            if (this.f2126k != null) {
                this.f2126k.setClassLoader(context.getClassLoader());
                this.f2127l.mSavedFragmentState = this.f2126k;
            }
            this.f2127l.setIndex(this.f2117b, fragment);
            this.f2127l.mFromLayout = this.f2118c;
            this.f2127l.mRestored = true;
            this.f2127l.mFragmentId = this.f2119d;
            this.f2127l.mContainerId = this.f2120e;
            this.f2127l.mTag = this.f2121f;
            this.f2127l.mRetainInstance = this.f2122g;
            this.f2127l.mDetached = this.f2123h;
            this.f2127l.mHidden = this.f2125j;
            this.f2127l.mFragmentManager = jVar.f2346e;
        }
        this.f2127l.mChildNonConfig = oVar;
        this.f2127l.mViewModelStore = aaVar;
        return this.f2127l;
    }
}
