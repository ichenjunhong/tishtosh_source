package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Iterator;

public final class zzad extends AbstractSafeParcelable implements Iterable<String> {
    public static final Creator<zzad> CREATOR = new C17116f();

    /* renamed from: a */
    final Bundle f48474a;

    zzad(Bundle bundle) {
        this.f48474a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32181a(parcel, 2, mo33384b(), false);
        C15469b.m32197c(parcel, a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo33383a(String str) {
        return this.f48474a.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Long mo33385b(String str) {
        return Long.valueOf(this.f48474a.getLong(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Double mo33386c(String str) {
        return Double.valueOf(this.f48474a.getDouble(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo33387d(String str) {
        return this.f48474a.getString(str);
    }

    /* renamed from: a */
    public final int mo33382a() {
        return this.f48474a.size();
    }

    public final String toString() {
        return this.f48474a.toString();
    }

    /* renamed from: b */
    public final Bundle mo33384b() {
        return new Bundle(this.f48474a);
    }

    public final Iterator<String> iterator() {
        return new C17088e(this);
    }
}
