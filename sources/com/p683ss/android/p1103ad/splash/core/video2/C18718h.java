package com.p683ss.android.p1103ad.splash.core.video2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.p683ss.android.p1103ad.splash.p1110b.C18550a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.core.video2.h */
public final class C18718h {

    /* renamed from: a */
    public C18720b f51788a;

    /* renamed from: b */
    private C18719a f51789b;

    /* renamed from: c */
    private Context f51790c;

    /* renamed from: d */
    private AudioManager f51791d;

    /* renamed from: e */
    private boolean f51792e;

    /* renamed from: com.ss.android.ad.splash.core.video2.h$a */
    static class C18719a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C18718h> f51793a;

        public C18719a(C18718h hVar) {
            this.f51793a = new WeakReference<>(hVar);
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                C18718h hVar = (C18718h) this.f51793a.get();
                if (hVar != null) {
                    C18720b bVar = hVar.f51788a;
                    if (bVar != null) {
                        int a = hVar.mo38329a();
                        if (a >= 0) {
                            bVar.mo38327a(a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.h$b */
    public interface C18720b {
        /* renamed from: a */
        void mo38327a(int i);
    }

    /* renamed from: b */
    public final int mo38330b() {
        if (this.f51791d != null) {
            return this.f51791d.getStreamMaxVolume(3);
        }
        return 15;
    }

    /* renamed from: a */
    public final int mo38329a() {
        try {
            if (this.f51791d != null) {
                return this.f51791d.getStreamVolume(3);
            }
            return -1;
        } catch (Exception e) {
            C18550a.m44899a().mo37842a(e, "key_exception_volume_npe");
            return -1;
        }
    }

    /* renamed from: c */
    public final void mo38331c() {
        this.f51789b = new C18719a(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        this.f51790c.registerReceiver(this.f51789b, intentFilter);
        this.f51792e = true;
    }

    /* renamed from: d */
    public final void mo38332d() {
        if (this.f51792e) {
            try {
                this.f51790c.unregisterReceiver(this.f51789b);
                this.f51788a = null;
                this.f51792e = false;
            } catch (Exception unused) {
            }
        }
    }

    public C18718h(Context context) {
        this.f51790c = context;
        this.f51791d = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }
}
