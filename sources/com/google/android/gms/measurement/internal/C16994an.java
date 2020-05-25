package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C15497a;
import com.google.android.gms.internal.measurement.C16719go;

/* renamed from: com.google.android.gms.measurement.internal.an */
final class C16994an implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16719go f47915a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnection f47916b;

    /* renamed from: c */
    private final /* synthetic */ C16993am f47917c;

    C16994an(C16993am amVar, C16719go goVar, ServiceConnection serviceConnection) {
        this.f47917c = amVar;
        this.f47915a = goVar;
        this.f47916b = serviceConnection;
    }

    public final void run() {
        C16992al alVar = this.f47917c.f47914b;
        String str = this.f47917c.f47913a;
        C16719go goVar = this.f47915a;
        ServiceConnection serviceConnection = this.f47916b;
        Bundle a = alVar.mo32887a(str, goVar);
        alVar.f47912a.mo32853p().mo32840c();
        if (a != null) {
            long j = a.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                alVar.f47912a.mo32854q().f48445b.mo33376a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    alVar.f47912a.mo32854q().f48445b.mo33376a("No referrer defined in install referrer response");
                } else {
                    alVar.f47912a.mo32854q().f48453j.mo33377a("InstallReferrer API result", string);
                    C17102em e = alVar.f47912a.mo32926e();
                    String str2 = "?";
                    String valueOf = String.valueOf(string);
                    Bundle a2 = e.mo33137a(Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)));
                    if (a2 == null) {
                        alVar.f47912a.mo32854q().f48445b.mo33376a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = a2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                alVar.f47912a.mo32854q().f48445b.mo33376a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == alVar.f47912a.mo32923b().f47881j.mo32882a()) {
                            alVar.f47912a.mo32854q().f48453j.mo33376a("Campaign has already been logged");
                        } else {
                            alVar.f47912a.mo32923b().f47881j.mo32883a(j);
                            alVar.f47912a.mo32854q().f48453j.mo33377a("Logging Install Referrer campaign from sdk with ", "referrer API");
                            a2.putString("_cis", "referrer API");
                            alVar.f47912a.mo32925d().mo32991a("auto", "_cmp", a2);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            C15497a.m32246a();
            C15497a.m32247a(alVar.f47912a.mo32850m(), serviceConnection);
        }
    }
}
