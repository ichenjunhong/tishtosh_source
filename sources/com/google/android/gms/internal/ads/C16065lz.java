package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14963ax;

/* renamed from: com.google.android.gms.internal.ads.lz */
final /* synthetic */ class C16065lz implements Runnable {

    /* renamed from: a */
    private final C16064ly f45194a;

    /* renamed from: b */
    private final beh f45195b;

    /* renamed from: c */
    private final C16085ms f45196c;

    C16065lz(C16064ly lyVar, beh beh, C16085ms msVar) {
        this.f45194a = lyVar;
        this.f45195b = beh;
        this.f45196c = msVar;
    }

    public final void run() {
        C16053ln lnVar;
        C16064ly lyVar = this.f45194a;
        beh beh = this.f45195b;
        C16085ms msVar = this.f45196c;
        try {
            Context context = lyVar.f45187b;
            zzbgz zzbgz = lyVar.f45189d;
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44260au)).booleanValue()) {
                lnVar = new C16038kz(context, zzbgz);
            } else {
                lnVar = new C16055lp(context, zzbgz, beh, null);
            }
            lnVar.mo31148a((C16054lo) new C16069mc(lyVar, msVar, lnVar));
            lnVar.mo31166a("/jsLoaded", new C16072mf(lyVar, msVar, lnVar));
            aej aej = new aej();
            T mgVar = new C16073mg(lyVar, beh, lnVar, aej);
            aej.f40356a = mgVar;
            lnVar.mo31166a("/requestReload", mgVar);
            if (lyVar.f45188c.endsWith(".js")) {
                lnVar.mo31149a(lyVar.f45188c);
            } else if (lyVar.f45188c.startsWith("<html>")) {
                lnVar.mo31150b(lyVar.f45188c);
            } else {
                lnVar.mo31153c(lyVar.f45188c);
            }
            acd.f40245a.postDelayed(new C16074mh(lyVar, msVar, lnVar), (long) C16078ml.f45221a);
        } catch (Throwable th) {
            abv.m32793b("Error creating webview.", th);
            C14963ax.m30834d().mo28588a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            msVar.mo28833d();
        }
    }
}
