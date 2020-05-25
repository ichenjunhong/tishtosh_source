package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14956aq;
import com.google.android.gms.ads.internal.C14986bt;

@C16299uq
public final class amg {
    /* renamed from: a */
    public static ama m33346a(Context context, anp anp, String str, boolean z, boolean z2, beh beh, zzbgz zzbgz, C15806ck ckVar, C14956aq aqVar, C14986bt btVar, byc byc) throws amk {
        C15740bx.m36941a(context);
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44259at)).booleanValue()) {
            return anw.m33718a(context, anp, str, z, z2, beh, zzbgz, ckVar, aqVar, btVar, byc);
        }
        try {
            ami ami = new ami(context, anp, str, z, z2, beh, zzbgz, ckVar, aqVar, btVar, byc);
            return (ama) aek.m32732a(ami);
        } catch (Throwable th) {
            throw new amk("Webview initialization failed.", th);
        }
    }
}
