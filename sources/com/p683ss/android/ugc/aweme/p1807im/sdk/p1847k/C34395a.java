package com.p683ss.android.ugc.aweme.p1807im.sdk.p1847k;

import com.bytedance.p702im.core.p706c.C11207p;
import java.util.List;
import java.util.Vector;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.k.a */
public class C34395a {

    /* renamed from: c */
    private static volatile C34395a f88763c;

    /* renamed from: a */
    public volatile boolean f88764a;

    /* renamed from: b */
    public List<C11207p> f88765b = new Vector();

    private C34395a() {
    }

    /* renamed from: a */
    public static C34395a m78323a() {
        if (f88763c == null) {
            synchronized (C34395a.class) {
                if (f88763c == null) {
                    f88763c = new C34395a();
                }
            }
        }
        return f88763c;
    }
}
