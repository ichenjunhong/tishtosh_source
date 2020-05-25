package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.p1037d.C15377d;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.by */
final class C15741by implements Callable<Void> {

    /* renamed from: a */
    private final /* synthetic */ Context f44539a;

    C15741by(Context context) {
        this.f44539a = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        C15737bu d = caf.m37099d();
        Context context = this.f44539a;
        if (!d.f43895c) {
            synchronized (d.f43893a) {
                if (!d.f43895c) {
                    if (!d.f43896d) {
                        d.f43896d = true;
                    }
                    d.f43899g = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        d.f43898f = C15377d.m31951a(d.f43899g).mo28318a(d.f43899g.getPackageName(), 128).metaData;
                    } catch (NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context c = C15384g.m31963c(context);
                        if (c == null && context != null) {
                            c = context.getApplicationContext();
                            if (c == null) {
                                c = context;
                            }
                        }
                        if (c != null) {
                            d.f43897e = C35807d.m80935a(c, "google_ads_flags", 0);
                            if (d.f43897e != null) {
                                d.f43897e.registerOnSharedPreferenceChangeListener(d);
                            }
                            d.mo30718a();
                            d.f43895c = true;
                            d.f43896d = false;
                            d.f43894b.open();
                        }
                    } finally {
                        d.f43896d = false;
                        d.f43894b.open();
                    }
                }
            }
        }
        return null;
    }
}
