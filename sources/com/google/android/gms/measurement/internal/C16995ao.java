package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.ao */
public final class C16995ao {

    /* renamed from: a */
    private final C16998ar f47918a;

    public C16995ao(C16998ar arVar) {
        C15464q.m32123a(arVar);
        this.f47918a = arVar;
    }

    /* renamed from: a */
    public static boolean m41192a(Context context) {
        C15464q.m32123a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final void mo32892a(Context context, Intent intent) {
        C17005ay a = C17005ay.m41256a(context, (C17128m) null);
        C17133r q = a.mo32854q();
        if (intent == null) {
            q.f48448e.mo33376a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        q.f48453j.mo33377a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            q.f48453j.mo33376a("Starting wakeful intent.");
            this.f47918a.mo32816a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a.mo32853p().mo32912a((Runnable) new C16996ap(this, a, q));
            } catch (Exception e) {
                q.f48448e.mo33377a("Install Referrer Reporter encountered a problem", e);
            }
            PendingResult a2 = this.f47918a.mo32815a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                q.f48453j.mo33376a("Install referrer extras are null");
                if (a2 != null) {
                    a2.finish();
                }
                return;
            }
            q.f48451h.mo33377a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String str = "?";
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            }
            Bundle a3 = a.mo32926e().mo33137a(Uri.parse(stringExtra));
            if (a3 == null) {
                q.f48453j.mo33376a("No campaign defined in install referrer broadcast");
                if (a2 != null) {
                    a2.finish();
                }
            } else {
                long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
                if (longExtra == 0) {
                    q.f48448e.mo33376a("Install referrer is missing timestamp");
                }
                C17000at p = a.mo32853p();
                C16997aq aqVar = new C16997aq(this, a, longExtra, a3, context, q, a2);
                p.mo32912a((Runnable) aqVar);
            }
        }
    }
}
