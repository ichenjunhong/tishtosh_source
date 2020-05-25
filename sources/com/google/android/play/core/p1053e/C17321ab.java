package com.google.android.play.core.p1053e;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.p1052d.C17316b;
import com.google.android.play.core.splitcompat.C17384b;

/* renamed from: com.google.android.play.core.e.ab */
public final class C17321ab extends C17316b<C17342g> {

    /* renamed from: b */
    private static C17321ab f48794b;

    /* renamed from: c */
    private final Handler f48795c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final C17352q f48796d;

    private C17321ab(Context context, C17352q qVar) {
        super(new C17384b("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f48796d = qVar;
    }

    /* renamed from: a */
    public static synchronized C17321ab m42403a(Context context) {
        C17321ab abVar;
        synchronized (C17321ab.class) {
            if (f48794b == null) {
                f48794b = new C17321ab(context, C17356u.INSTANCE);
            }
            abVar = f48794b;
        }
        return abVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m42406a(C17342g gVar, int i, int i2) {
        this.f48795c.post(new C17320aa(this, gVar, i, i2));
    }

    /* renamed from: a */
    public final void mo33506a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra != null) {
            C17342g a = C17342g.m42463a(bundleExtra);
            this.f48780a.mo33687b("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
            C17344i a2 = this.f48796d.mo33649a();
            if (a.mo33634b() != 3 || a2 == null) {
                mo33609a(a);
            } else {
                a2.mo33592a(a.mo33643k(), new C17354s(this, a, intent, context));
            }
        }
    }
}
