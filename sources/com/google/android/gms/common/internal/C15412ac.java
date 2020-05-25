package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.common.internal.ac */
final class C15412ac implements Creator<BinderWrapper> {
    C15412ac() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, null);
    }
}
