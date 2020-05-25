package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import com.google.android.gms.common.C15373d;
import com.google.android.gms.common.C15382e;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.am */
public final class C26387am {

    /* renamed from: a */
    public static boolean f69611a = true;

    /* renamed from: b */
    public static boolean f69612b;

    /* renamed from: c */
    public static final AtomicBoolean f69613c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final AtomicBoolean f69614d = new AtomicBoolean(false);

    /* renamed from: e */
    public static final C26387am f69615e = new C26387am();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.am$a */
    public static final class C26388a<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C26388a f69616a = new C26388a();

        C26388a() {
        }

        public final /* synthetic */ Object call() {
            boolean z;
            try {
                C26387am amVar = C26387am.f69615e;
                C14903a a = C14902a.m30575a(C11010c.m22280a());
                if (a != null) {
                    z = a.f38443b;
                } else {
                    z = true;
                }
                C26387am.f69611a = z;
            } catch (C15373d | C15382e | IOException | IllegalStateException unused) {
            } catch (Throwable th) {
                C26387am.f69613c.set(false);
                throw th;
            }
            C26387am.f69613c.set(false);
            return C52860x.f131107a;
        }
    }

    private C26387am() {
    }
}
