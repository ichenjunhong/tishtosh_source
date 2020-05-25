package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.C15081b;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import org.json.JSONArray;
import org.json.JSONException;

@C16299uq
public final class zzbaz extends AbstractSafeParcelable {
    public static final Creator<zzbaz> CREATOR = new C16426zi();

    /* renamed from: a */
    public final String f46226a;

    /* renamed from: b */
    public final int f46227b;

    public zzbaz(C15081b bVar) {
        this(bVar.mo27793a(), bVar.mo27794b());
    }

    public zzbaz(String str, int i) {
        this.f46226a = str;
        this.f46227b = i;
    }

    /* renamed from: a */
    public static zzbaz m39276a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbaz(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    /* renamed from: a */
    public static zzbaz m39275a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m39276a(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f46226a, false);
        C15469b.m32195b(parcel, 3, this.f46227b);
        C15469b.m32197c(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzbaz)) {
            return false;
        }
        zzbaz zzbaz = (zzbaz) obj;
        if (!C15462p.m32120a(this.f46226a, zzbaz.f46226a) || !C15462p.m32120a(Integer.valueOf(this.f46227b), Integer.valueOf(zzbaz.f46227b))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C15462p.m32118a(this.f46226a, Integer.valueOf(this.f46227b));
    }
}
