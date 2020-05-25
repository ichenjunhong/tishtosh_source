package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.p030v4.content.C0732g;
import com.facebook.internal.C14283ab;

/* renamed from: com.facebook.e */
public abstract class C13850e {

    /* renamed from: a */
    public static final String f36135a = "e";

    /* renamed from: b */
    public final BroadcastReceiver f36136b = new C13852a();

    /* renamed from: c */
    public final C0732g f36137c = C0732g.m2130a(C14533n.m29773g());

    /* renamed from: d */
    public boolean f36138d;

    /* renamed from: com.facebook.e$a */
    class C13852a extends BroadcastReceiver {
        private C13852a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                C13850e.this.mo25988a((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25988a(AccessToken accessToken, AccessToken accessToken2);

    /* renamed from: a */
    public final void mo25987a() {
        if (!this.f36138d) {
            m28169b();
            this.f36138d = true;
        }
    }

    public C13850e() {
        C14283ab.m29303a();
        mo25987a();
    }

    /* renamed from: b */
    private void m28169b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f36137c.mo2403a(this.f36136b, intentFilter);
    }
}
