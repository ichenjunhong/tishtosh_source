package com.etsy.android.grid;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class ClassLoaderSavedState implements Parcelable {
    public static final Creator<ClassLoaderSavedState> CREATOR = new Creator<ClassLoaderSavedState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ClassLoaderSavedState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return ClassLoaderSavedState.f35056a;
            }
            throw new IllegalStateException("superState must be null");
        }
    };

    /* renamed from: a */
    public static final ClassLoaderSavedState f35056a = new ClassLoaderSavedState() {
    };

    /* renamed from: b */
    public Parcelable f35057b;

    /* renamed from: c */
    private ClassLoader f35058c;

    public int describeContents() {
        return 0;
    }

    private ClassLoaderSavedState() {
        this.f35057b = f35056a;
        this.f35057b = null;
    }

    protected ClassLoaderSavedState(Parcel parcel) {
        this.f35057b = f35056a;
        Parcelable readParcelable = parcel.readParcelable(this.f35058c);
        if (readParcelable == null) {
            readParcelable = f35056a;
        }
        this.f35057b = readParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f35057b, i);
    }

    protected ClassLoaderSavedState(Parcelable parcelable, ClassLoader classLoader) {
        this.f35057b = f35056a;
        this.f35058c = classLoader;
        if (parcelable != null) {
            if (parcelable == f35056a) {
                parcelable = null;
            }
            this.f35057b = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
}
