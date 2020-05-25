package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bn */
final class C15728bn extends C15726bl<Integer> {
    C15728bn(int i, String str, Integer num) {
        super(i, str, num, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30319a(Bundle bundle) {
        String str = "com.google.android.gms.ads.flag.";
        String valueOf = String.valueOf(this.f42833b);
        if (!bundle.containsKey(valueOf.length() != 0 ? str.concat(valueOf) : new String(str))) {
            return (Integer) this.f42834c;
        }
        String str2 = "com.google.android.gms.ads.flag.";
        String valueOf2 = String.valueOf(this.f42833b);
        return Integer.valueOf(bundle.getInt(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2)));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo30321a(Editor editor, Object obj) {
        editor.putInt(this.f42833b, ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30320a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.f42833b, ((Integer) this.f42834c).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30318a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f42833b, ((Integer) this.f42834c).intValue()));
    }
}
