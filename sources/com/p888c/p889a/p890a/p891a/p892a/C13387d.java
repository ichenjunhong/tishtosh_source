package com.p888c.p889a.p890a.p891a.p892a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings.System;

/* renamed from: com.c.a.a.a.a.d */
public final class C13387d extends ContentObserver {

    /* renamed from: a */
    public final Context f34894a;

    /* renamed from: b */
    private final AudioManager f34895b;

    /* renamed from: c */
    private final C13384a f34896c;

    /* renamed from: d */
    private final C13386c f34897d;

    /* renamed from: e */
    private float f34898e;

    public C13387d(Handler handler, Context context, C13384a aVar, C13386c cVar) {
        super(handler);
        this.f34894a = context;
        this.f34895b = (AudioManager) context.getSystemService("audio");
        this.f34896c = aVar;
        this.f34897d = cVar;
    }

    /* renamed from: b */
    private float m26985b() {
        return C13384a.m26983a(this.f34895b.getStreamVolume(3), this.f34895b.getStreamMaxVolume(3));
    }

    /* renamed from: c */
    private void m26986c() {
        this.f34897d.mo25077a(this.f34898e);
    }

    /* renamed from: a */
    public final void mo25078a() {
        this.f34898e = m26985b();
        m26986c();
        this.f34894a.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float b = m26985b();
        if (b != this.f34898e) {
            this.f34898e = b;
            m26986c();
        }
    }
}
