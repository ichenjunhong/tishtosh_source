package com.squareup.p1094a;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.squareup.p1094a.C18343aa.C18344a;
import com.squareup.p1094a.C18382l.C18383a;
import com.squareup.p1094a.C18396v.C18402d;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.a.t */
final class C18393t extends C18343aa {

    /* renamed from: a */
    private final C18382l f50791a;

    /* renamed from: b */
    private final C18346ac f50792b;

    /* renamed from: com.squareup.a.t$a */
    static class C18394a extends IOException {
        public C18394a(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo36786a() {
        return 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo36790b() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo36788a(C18409y yVar) {
        String scheme = yVar.f50842d.getScheme();
        if (WebKitApi.SCHEME_HTTP.equals(scheme) || WebKitApi.SCHEME_HTTPS.equals(scheme)) {
            return true;
        }
        return false;
    }

    public C18393t(C18382l lVar, C18346ac acVar) {
        this.f50791a = lVar;
        this.f50792b = acVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo36789a(boolean z, NetworkInfo networkInfo) {
        if (networkInfo == null || networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C18344a mo36787a(C18409y yVar, int i) throws IOException {
        C18402d dVar;
        C18383a a = this.f50791a.mo36800a(yVar.f50842d, yVar.f50841c);
        if (a.f50762c) {
            dVar = C18402d.DISK;
        } else {
            dVar = C18402d.NETWORK;
        }
        Bitmap bitmap = a.f50761b;
        if (bitmap != null) {
            return new C18344a(bitmap, dVar);
        }
        InputStream inputStream = a.f50760a;
        if (inputStream == null) {
            return null;
        }
        if (dVar == C18402d.DISK && a.f50763d == 0) {
            C18356aj.m44599a(inputStream);
            throw new C18394a("Received response with 0 content-length header.");
        }
        if (dVar == C18402d.NETWORK && a.f50763d > 0) {
            C18346ac acVar = this.f50792b;
            acVar.f50669c.sendMessage(acVar.f50669c.obtainMessage(4, Long.valueOf(a.f50763d)));
        }
        return new C18344a(inputStream, dVar);
    }
}
