package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class CameraEffectTextures implements ShareModel {
    public static final Creator<CameraEffectTextures> CREATOR = new Creator<CameraEffectTextures>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CameraEffectTextures[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }
    };

    /* renamed from: a */
    public final Bundle f37931a;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    public static class C14629a {

        /* renamed from: a */
        public Bundle f37932a = new Bundle();
    }

    public int describeContents() {
        return 0;
    }

    private CameraEffectTextures(C14629a aVar) {
        this.f37931a = aVar.f37932a;
    }

    CameraEffectTextures(Parcel parcel) {
        this.f37931a = parcel.readBundle(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f37931a);
    }
}
