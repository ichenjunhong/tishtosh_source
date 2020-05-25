package com.google.android.gms.internal.ads;

import android.content.Context;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.concurrent.Callable;

final /* synthetic */ class acf implements Callable {

    /* renamed from: a */
    private final acd f40253a;

    /* renamed from: b */
    private final Context f40254b;

    acf(acd acd, Context context) {
        this.f40253a = acd;
        this.f40254b = context;
    }

    public final Object call() {
        Context context = this.f40254b;
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44399da)).booleanValue()) {
            return "";
        }
        return C35807d.m80935a(context, "mobileads_consent", 0).getString("consent_string", "");
    }
}
