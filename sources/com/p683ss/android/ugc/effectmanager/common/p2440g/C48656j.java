package com.p683ss.android.ugc.effectmanager.common.p2440g;

import android.os.Handler;
import android.os.Message;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.g.j */
public abstract class C48656j implements C48651f {

    /* renamed from: c */
    public boolean f122291c;

    /* renamed from: d */
    public final Handler f122292d;

    /* renamed from: e */
    protected String f122293e;

    public C48656j(Handler handler, String str) {
        this.f122292d = handler;
        this.f122293e = str;
    }

    /* renamed from: a */
    public final void mo96238a(int i, C48648c cVar) {
        Message message;
        C52711k.m112240b(cVar, "result");
        cVar.f122278a = this.f122293e;
        Handler handler = this.f122292d;
        if (handler != null) {
            message = handler.obtainMessage(i);
        } else {
            message = null;
        }
        if (message != null) {
            message.obj = cVar;
        }
        if (message != null) {
            message.sendToTarget();
        }
    }
}
