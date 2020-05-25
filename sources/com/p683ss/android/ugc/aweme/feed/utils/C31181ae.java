package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.ae */
public final class C31181ae {

    /* renamed from: a */
    public static Boolean f81600a;

    /* renamed from: b */
    public static Boolean f81601b;

    /* renamed from: c */
    public static final C31181ae f81602c = new C31181ae();

    /* renamed from: com.ss.android.ugc.aweme.feed.utils.ae$a */
    public static final class C31182a<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C31182a f81603a = new C31182a();

        C31182a() {
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(TimeLockRuler.isTeenModeON());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.utils.ae$b */
    public static final class C31183b<TTaskResult, TContinuationResult> implements C0011g<Boolean, Object> {

        /* renamed from: a */
        public static final C31183b f81604a = new C31183b();

        C31183b() {
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C31181ae aeVar = C31181ae.f81602c;
            C52711k.m112236a((Object) iVar, "it");
            C31181ae.f81600a = (Boolean) iVar.mo34e();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.utils.ae$c */
    public static final class C31184c<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C31184c f81605a = new C31184c();

        C31184c() {
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.utils.ae$d */
    public static final class C31185d<TTaskResult, TContinuationResult> implements C0011g<Boolean, Object> {

        /* renamed from: a */
        public static final C31185d f81606a = new C31185d();

        C31185d() {
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C31181ae aeVar = C31181ae.f81602c;
            C52711k.m112236a((Object) iVar, "it");
            C31181ae.f81601b = (Boolean) iVar.mo34e();
            return null;
        }
    }

    private C31181ae() {
    }

    /* renamed from: a */
    public static boolean m72810a() {
        if (f81601b == null) {
            return false;
        }
        Boolean bool = f81601b;
        if (bool == null) {
            C52711k.m112234a();
        }
        return bool.booleanValue();
    }
}
