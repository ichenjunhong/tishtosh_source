package com.p683ss.android.ugc.aweme.miniapp_api.model.net;

import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.net.d */
public class C36981d {

    /* renamed from: b */
    public int f94436b = -1;

    /* renamed from: c */
    public String f94437c;

    /* renamed from: d */
    public String f94438d;

    /* renamed from: e */
    public byte[] f94439e;

    /* renamed from: f */
    public ArrayList<MicroAppHttpHeader> f94440f;

    /* renamed from: g */
    public Throwable f94441g;

    /* renamed from: a */
    public final byte[] mo76274a() {
        if (this.f94439e != null) {
            return this.f94439e;
        }
        if (this.f94438d != null) {
            return this.f94438d.getBytes();
        }
        return null;
    }
}
