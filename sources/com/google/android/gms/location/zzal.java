package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Collections;
import java.util.List;

public final class zzal extends AbstractSafeParcelable {
    public static final Creator<zzal> CREATOR = new C16897p();

    /* renamed from: a */
    private final List<String> f47671a;

    /* renamed from: b */
    private final PendingIntent f47672b;

    /* renamed from: c */
    private final String f47673c;

    zzal(List<String> list, PendingIntent pendingIntent, String str) {
        this.f47671a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f47672b = pendingIntent;
        this.f47673c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32188a(parcel, 1, this.f47671a, false);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f47672b, i, false);
        C15469b.m32187a(parcel, 3, this.f47673c, false);
        C15469b.m32197c(parcel, a);
    }
}
