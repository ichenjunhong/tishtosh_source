package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bm */
final class C15727bm extends C15726bl<Boolean> {
    C15727bm(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30319a(Bundle bundle) {
        String str = "com.google.android.gms.ads.flag.";
        String valueOf = String.valueOf(this.f42833b);
        if (!bundle.containsKey(valueOf.length() != 0 ? str.concat(valueOf) : new String(str))) {
            return (Boolean) this.f42834c;
        }
        String str2 = "com.google.android.gms.ads.flag.";
        String valueOf2 = String.valueOf(this.f42833b);
        return Boolean.valueOf(bundle.getBoolean(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2)));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo30321a(Editor editor, Object obj) {
        editor.putBoolean(this.f42833b, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30320a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.f42833b, ((Boolean) this.f42834c).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30318a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f42833b, ((Boolean) this.f42834c).booleanValue()));
    }
}
