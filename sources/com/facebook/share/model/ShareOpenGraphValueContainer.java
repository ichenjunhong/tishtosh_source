package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.C14654a;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends C14654a> implements ShareModel {

    /* renamed from: a */
    final Bundle f37998a;

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    public static abstract class C14654a<P extends ShareOpenGraphValueContainer, E extends C14654a> {

        /* renamed from: a */
        public Bundle f37999a = new Bundle();

        /* renamed from: a */
        public E mo26904a(P p) {
            if (p != null) {
                this.f37999a.putAll((Bundle) p.f37998a.clone());
            }
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public final Set<String> mo26911b() {
        return this.f37998a.keySet();
    }

    /* renamed from: a */
    public final Object mo26909a(String str) {
        return this.f37998a.get(str);
    }

    /* renamed from: b */
    public final String mo26910b(String str) {
        return this.f37998a.getString(str);
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f37998a = parcel.readBundle(C14654a.class.getClassLoader());
    }

    protected ShareOpenGraphValueContainer(C14654a<P, E> aVar) {
        this.f37998a = (Bundle) aVar.f37999a.clone();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f37998a);
    }
}
