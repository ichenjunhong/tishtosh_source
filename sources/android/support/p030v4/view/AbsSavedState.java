package android.support.p030v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.view.AbsSavedState */
public abstract class AbsSavedState implements Parcelable {
    public static final Creator<AbsSavedState> CREATOR = new ClassLoaderCreator<AbsSavedState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AbsSavedState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m2815a(parcel, null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m2815a(parcel, classLoader);
        }

        /* renamed from: a */
        private static AbsSavedState m2815a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f3118d;
            }
            throw new IllegalStateException("superState must be null");
        }
    };

    /* renamed from: d */
    public static final AbsSavedState f3118d = new AbsSavedState() {
    };

    /* renamed from: e */
    public final Parcelable f3119e;

    private AbsSavedState() {
    }

    public int describeContents() {
        return 0;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f3118d) {
                parcelable = null;
            }
            this.f3119e = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3119e, i);
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f3118d;
        }
        this.f3119e = readParcelable;
    }
}
