package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class CameraEffectArguments implements ShareModel {
    public static final Creator<CameraEffectArguments> CREATOR = new Creator<CameraEffectArguments>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CameraEffectArguments[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }
    };

    /* renamed from: a */
    public final Bundle f37929a;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    public static class C14627a {

        /* renamed from: a */
        public Bundle f37930a = new Bundle();
    }

    public int describeContents() {
        return 0;
    }

    private CameraEffectArguments(C14627a aVar) {
        this.f37929a = aVar.f37930a;
    }

    CameraEffectArguments(Parcel parcel) {
        this.f37929a = parcel.readBundle(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f37929a);
    }
}
