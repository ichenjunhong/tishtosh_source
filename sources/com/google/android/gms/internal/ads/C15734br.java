package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.br */
final class C15734br extends C15726bl<String> {
    C15734br(int i, String str, String str2) {
        super(i, str, str2, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30319a(Bundle bundle) {
        String str = "com.google.android.gms.ads.flag.";
        String valueOf = String.valueOf(this.f42833b);
        if (!bundle.containsKey(valueOf.length() != 0 ? str.concat(valueOf) : new String(str))) {
            return (String) this.f42834c;
        }
        String str2 = "com.google.android.gms.ads.flag.";
        String valueOf2 = String.valueOf(this.f42833b);
        return bundle.getString(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo30321a(Editor editor, Object obj) {
        editor.putString(this.f42833b, (String) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30320a(JSONObject jSONObject) {
        return jSONObject.optString(this.f42833b, (String) this.f42834c);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30318a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f42833b, (String) this.f42834c);
    }
}
