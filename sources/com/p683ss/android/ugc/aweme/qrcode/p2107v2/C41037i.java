package com.p683ss.android.ugc.aweme.qrcode.p2107v2;

import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.qrcode.p2107v2.ScanQRCodeActivityV2.C41026b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.i */
final /* synthetic */ class C41037i implements C41026b {

    /* renamed from: a */
    private final ScanQRCodeActivityV2 f104352a;

    /* renamed from: b */
    private final String f104353b;

    C41037i(ScanQRCodeActivityV2 scanQRCodeActivityV2, String str) {
        this.f104352a = scanQRCodeActivityV2;
        this.f104353b = str;
    }

    /* renamed from: a */
    public final void mo83536a() {
        C0013i.m18a((Callable<TResult>) new C41038j<TResult>(this.f104352a, this.f104353b), (Executor) C23551l.f62672a);
    }
}
