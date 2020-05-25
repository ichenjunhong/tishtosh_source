package com.p683ss.android.ugc.aweme.p2271sp;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;

/* renamed from: com.ss.android.ugc.aweme.sp.f */
public class C45673f extends ContextWrapper {
    public C45673f(Context context) {
        super(context);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        return SharedPreferencesManager.getInstance().getSharedPreferences(this, str);
    }
}
