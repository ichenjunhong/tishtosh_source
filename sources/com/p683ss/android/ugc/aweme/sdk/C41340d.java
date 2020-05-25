package com.p683ss.android.ugc.aweme.sdk;

import com.p683ss.android.ugc.aweme.sdk.bean.C41336a;

/* renamed from: com.ss.android.ugc.aweme.sdk.d */
public class C41340d {

    /* renamed from: b */
    private static C41340d f104816b;

    /* renamed from: a */
    public C41336a f104817a = new C41336a();

    private C41340d() {
    }

    /* renamed from: a */
    public static C41340d m91109a() {
        if (f104816b == null) {
            synchronized (C41340d.class) {
                if (f104816b == null) {
                    f104816b = new C41340d();
                }
            }
        }
        return f104816b;
    }
}
