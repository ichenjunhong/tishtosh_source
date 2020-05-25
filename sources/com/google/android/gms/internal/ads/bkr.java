package com.google.android.gms.internal.ads;

import android.content.Context;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.io.IOException;

public final class bkr implements ble {

    /* renamed from: a */
    private final ble f42813a;

    /* renamed from: b */
    private final ble f42814b;

    /* renamed from: c */
    private final ble f42815c;

    /* renamed from: d */
    private ble f42816d;

    public bkr(Context context, String str) {
        this(context, null, str, false);
    }

    private bkr(Context context, bld bld, String str, boolean z) {
        bkp bkp = new bkp(str, null, null, 8000, 8000, false);
        this(context, null, bkp);
    }

    private bkr(Context context, bld bld, ble ble) {
        this.f42813a = (ble) blg.m35998a(ble);
        this.f42814b = new bkt(null);
        this.f42815c = new bkj(context, null);
    }

    /* renamed from: a */
    public final long mo29003a(bkn bkn) throws IOException {
        blg.m36001b(this.f42816d == null);
        String scheme = bkn.f42786a.getScheme();
        if (WebKitApi.SCHEME_HTTP.equals(scheme) || WebKitApi.SCHEME_HTTPS.equals(scheme)) {
            this.f42816d = this.f42813a;
        } else if ("file".equals(scheme)) {
            if (bkn.f42786a.getPath().startsWith("/android_asset/")) {
                this.f42816d = this.f42815c;
            } else {
                this.f42816d = this.f42814b;
            }
        } else if ("asset".equals(scheme)) {
            this.f42816d = this.f42815c;
        } else {
            throw new bks(scheme);
        }
        return this.f42816d.mo29003a(bkn);
    }

    /* renamed from: a */
    public final int mo29002a(byte[] bArr, int i, int i2) throws IOException {
        return this.f42816d.mo29002a(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo29004a() throws IOException {
        if (this.f42816d != null) {
            try {
                this.f42816d.mo29004a();
            } finally {
                this.f42816d = null;
            }
        }
    }
}
