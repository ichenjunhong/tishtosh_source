package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.security.NetworkSecurityPolicy;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class abz implements Runnable {

    /* renamed from: a */
    private final aby f40236a;

    /* renamed from: b */
    private final Context f40237b;

    /* renamed from: c */
    private final String f40238c;

    abz(aby aby, Context context, String str) {
        this.f40236a = aby;
        this.f40237b = context;
        this.f40238c = str;
    }

    public final void run() {
        aby aby = this.f40236a;
        boolean z = false;
        SharedPreferences a = C35807d.m80935a(this.f40237b, this.f40238c, 0);
        Editor edit = a.edit();
        synchronized (aby.f40213a) {
            aby.f40214b = a;
            aby.f40215c = edit;
            if ((VERSION.SDK_INT >= 23) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            aby.f40216d = z;
            aby.f40217e = aby.f40214b.getBoolean("use_https", aby.f40217e);
            aby.f40229q = aby.f40214b.getBoolean("content_url_opted_out", aby.f40229q);
            aby.f40218f = aby.f40214b.getString("content_url_hashes", aby.f40218f);
            aby.f40220h = aby.f40214b.getBoolean("auto_collect_location", aby.f40220h);
            aby.f40230r = aby.f40214b.getBoolean("content_vertical_opted_out", aby.f40230r);
            aby.f40219g = aby.f40214b.getString("content_vertical_hashes", aby.f40219g);
            aby.f40226n = aby.f40214b.getInt("version_code", aby.f40226n);
            aby.f40221i = aby.f40214b.getString("app_settings_json", aby.f40221i);
            aby.f40222j = aby.f40214b.getLong("app_settings_last_update_ms", aby.f40222j);
            aby.f40223k = aby.f40214b.getLong("app_last_background_time_ms", aby.f40223k);
            aby.f40225m = aby.f40214b.getInt("request_in_session_count", aby.f40225m);
            aby.f40224l = aby.f40214b.getLong("first_ad_req_time_ms", aby.f40224l);
            aby.f40227o = aby.f40214b.getStringSet("never_pool_slots", aby.f40227o);
            aby.f40231s = aby.f40214b.getString("display_cutout", aby.f40231s);
            try {
                aby.f40228p = new JSONObject(aby.f40214b.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                abv.m32795c("Could not convert native advanced settings to json object", e);
            }
            aby.mo28655a(aby.mo28656p());
        }
    }
}
