package com.bytedance.android.live.core.paging.p237b;

import android.arch.lifecycle.C0198r;
import android.arch.p010b.C0082h.C0088d;
import android.arch.p010b.C0082h.C0088d.C0089a;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.core.p222a.C3809a;
import com.bytedance.android.live.core.p222a.C3810b;
import com.bytedance.android.live.core.p226e.C3842b;
import com.bytedance.android.live.core.paging.p238c.C3952b;
import java.util.concurrent.atomic.AtomicLong;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.live.core.paging.b.c */
public final class C3948c<CacheKey, V> implements C3946a<V> {

    /* renamed from: j */
    private static final C0088d f10983j = new C0089a().mo141a(false).mo140a(12).mo143b(12).mo142a();

    /* renamed from: a */
    public C0198r<Boolean> f10984a = new C0198r<>();

    /* renamed from: b */
    public C0198r<Boolean> f10985b = new C0198r<>();

    /* renamed from: c */
    public volatile boolean f10986c = false;

    /* renamed from: d */
    public AtomicLong f10987d = new AtomicLong(0);

    /* renamed from: e */
    public CacheKey f10988e;

    /* renamed from: f */
    public C3810b<CacheKey, V> f10989f;

    /* renamed from: g */
    public C3809a<CacheKey, C2974a> f10990g;

    /* renamed from: h */
    public C0088d f10991h = f10983j;

    /* renamed from: i */
    public C3952b<V> f10992i;

    /* renamed from: k */
    private C0198r<C3842b> f10993k = new C0198r<>();

    /* renamed from: l */
    private C0198r<C3842b> f10994l = new C0198r<>();

    /* renamed from: m */
    private C2180b<Object> f10995m = C2180b.m6534l();

    /* renamed from: n */
    private C2180b<Object> f10996n = C2180b.m6534l();

    /* renamed from: o */
    private C2180b<Object> f10997o = C2180b.m6534l();

    /* renamed from: p */
    private volatile boolean f10998p = false;

    /* renamed from: q */
    private C0198r<Integer> f10999q = new C0198r<>();

    /* renamed from: a */
    public final C0198r<C3842b> mo9330a() {
        return this.f10993k;
    }

    /* renamed from: b */
    public final C0198r<C3842b> mo9331b() {
        return this.f10994l;
    }

    /* renamed from: c */
    public final C0198r<Boolean> mo9332c() {
        return this.f10984a;
    }

    /* renamed from: d */
    public final C0198r<Boolean> mo9333d() {
        return this.f10985b;
    }

    /* renamed from: e */
    public final C2180b<Object> mo9334e() {
        return this.f10995m;
    }

    /* renamed from: f */
    public final C2180b<Object> mo9335f() {
        return this.f10996n;
    }

    /* renamed from: g */
    public final C2180b<Object> mo9336g() {
        return this.f10997o;
    }

    /* renamed from: h */
    public final C0198r<Integer> mo9337h() {
        return this.f10999q;
    }

    /* renamed from: i */
    public final boolean mo9340i() {
        return this.f10998p;
    }

    /* renamed from: a */
    public final void mo9338a(boolean z) {
        this.f10998p = z;
    }

    /* renamed from: b */
    public final void mo9339b(boolean z) {
        this.f10986c = z;
    }
}
