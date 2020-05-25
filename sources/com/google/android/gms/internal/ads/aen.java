package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.concurrent.Callable;

final class aen implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ Context f40359a;

    /* renamed from: b */
    private final /* synthetic */ Context f40360b;

    aen(aem aem, Context context, Context context2) {
        this.f40359a = context;
        this.f40360b = context2;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f40359a != null) {
            abv.m32494a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = C35807d.m80935a(this.f40359a, "admob_user_agent", 0);
        } else {
            abv.m32494a("Attempting to read user agent from local cache.");
            sharedPreferences = C35807d.m80935a(this.f40360b, "admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            abv.m32494a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f40360b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                abv.m32494a("Persisting user agent.");
            }
        }
        return string;
    }
}
