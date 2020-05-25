package android.support.p030v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.FragmentManagerState */
final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new Creator<FragmentManagerState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FragmentManagerState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }
    };

    /* renamed from: a */
    FragmentState[] f2111a;

    /* renamed from: b */
    int[] f2112b;

    /* renamed from: c */
    BackStackState[] f2113c;

    /* renamed from: d */
    int f2114d = -1;

    /* renamed from: e */
    int f2115e;

    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2111a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f2112b = parcel.createIntArray();
        this.f2113c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f2114d = parcel.readInt();
        this.f2115e = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f2111a, i);
        parcel.writeIntArray(this.f2112b);
        parcel.writeTypedArray(this.f2113c, i);
        parcel.writeInt(this.f2114d);
        parcel.writeInt(this.f2115e);
    }
}
