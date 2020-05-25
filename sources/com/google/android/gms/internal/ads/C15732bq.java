package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bq */
final class C15732bq extends C15726bl<Float> {
    C15732bq(int i, String str, Float f) {
        super(i, str, f, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30319a(Bundle bundle) {
        String str = "com.google.android.gms.ads.flag.";
        String valueOf = String.valueOf(this.f42833b);
        if (!bundle.containsKey(valueOf.length() != 0 ? str.concat(valueOf) : new String(str))) {
            return (Float) this.f42834c;
        }
        String str2 = "com.google.android.gms.ads.flag.";
        String valueOf2 = String.valueOf(this.f42833b);
        return Float.valueOf(bundle.getFloat(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2)));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo30321a(Editor editor, Object obj) {
        editor.putFloat(this.f42833b, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30320a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.f42833b, (double) ((Float) this.f42834c).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30318a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.f42833b, ((Float) this.f42834c).floatValue()));
    }
}
