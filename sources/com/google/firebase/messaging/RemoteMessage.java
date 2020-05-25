package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Creator<RemoteMessage> CREATOR = new C17948e();

    /* renamed from: a */
    public Bundle f49831a;

    /* renamed from: b */
    public Map<String, String> f49832b;

    public RemoteMessage(Bundle bundle) {
        this.f49831a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32181a(parcel, 2, this.f49831a, false);
        C15469b.m32197c(parcel, a);
    }
}
