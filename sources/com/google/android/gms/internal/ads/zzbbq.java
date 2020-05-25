package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class zzbbq extends AbstractSafeParcelable {
    public static final Creator<zzbbq> CREATOR = new C16440zw();

    /* renamed from: a */
    public final String f46228a;

    /* renamed from: b */
    public final String f46229b;

    /* renamed from: c */
    public final boolean f46230c;

    /* renamed from: d */
    public final boolean f46231d;

    /* renamed from: e */
    public final List<String> f46232e;

    /* renamed from: f */
    public final boolean f46233f;

    /* renamed from: g */
    public final boolean f46234g;

    /* renamed from: h */
    public final List<String> f46235h;

    public zzbbq(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f46228a = str;
        this.f46229b = str2;
        this.f46230c = z;
        this.f46231d = z2;
        this.f46232e = list;
        this.f46233f = z3;
        this.f46234g = z4;
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        this.f46235h = list2;
    }

    /* renamed from: a */
    public static zzbbq m39277a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        zzbbq zzbbq = new zzbbq(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), aeb.m32723a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), aeb.m32723a(jSONObject.optJSONArray("webview_permissions"), null));
        return zzbbq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f46228a, false);
        C15469b.m32187a(parcel, 3, this.f46229b, false);
        C15469b.m32189a(parcel, 4, this.f46230c);
        C15469b.m32189a(parcel, 5, this.f46231d);
        C15469b.m32188a(parcel, 6, this.f46232e, false);
        C15469b.m32189a(parcel, 7, this.f46233f);
        C15469b.m32189a(parcel, 8, this.f46234g);
        C15469b.m32188a(parcel, 9, this.f46235h, false);
        C15469b.m32197c(parcel, a);
    }
}
