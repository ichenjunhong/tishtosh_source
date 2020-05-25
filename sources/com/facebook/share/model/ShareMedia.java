package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

public abstract class ShareMedia implements ShareModel {

    /* renamed from: a */
    final Bundle f37969a;

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class C14639a<M extends ShareMedia, B extends C14639a> {

        /* renamed from: a */
        public Bundle f37970a = new Bundle();

        /* renamed from: a */
        public B mo26883a(M m) {
            if (m == null) {
                return this;
            }
            this.f37970a.putAll(new Bundle(m.f37969a));
            return this;
        }
    }

    /* renamed from: com.facebook.share.model.ShareMedia$b */
    public enum C14640b {
        PHOTO,
        VIDEO
    }

    /* renamed from: a */
    public abstract C14640b mo26880a();

    public int describeContents() {
        return 0;
    }

    ShareMedia(Parcel parcel) {
        this.f37969a = parcel.readBundle();
    }

    protected ShareMedia(C14639a aVar) {
        this.f37969a = new Bundle(aVar.f37970a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f37969a);
    }
}
