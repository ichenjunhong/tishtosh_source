package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class zzaxk extends AbstractSafeParcelable {
    public static final Creator<zzaxk> CREATOR = new C16328vs();

    /* renamed from: a */
    public final boolean f46209a;

    /* renamed from: b */
    public final List<String> f46210b;

    public zzaxk() {
        this(false, Collections.emptyList());
    }

    public zzaxk(boolean z, List<String> list) {
        this.f46209a = z;
        this.f46210b = list;
    }

    /* renamed from: a */
    public static zzaxk m39271a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzaxk();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    abv.m32795c("Error grabbing url from json.", e);
                }
            }
        }
        return new zzaxk(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32189a(parcel, 2, this.f46209a);
        C15469b.m32188a(parcel, 3, this.f46210b, false);
        C15469b.m32197c(parcel, a);
    }
}
