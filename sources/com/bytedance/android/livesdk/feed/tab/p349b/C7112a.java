package com.bytedance.android.livesdk.feed.tab.p349b;

import android.text.TextUtils;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdkapi.C8830k;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.a */
public class C7112a implements C7023m {

    /* renamed from: a */
    public C7129q f19332a;

    /* renamed from: b */
    public C7130r f19333b;

    /* renamed from: a */
    public final C2201v<List<C6945f>> mo13181a() {
        return C2201v.m6602a((C2206z<? extends T>) C2201v.m6601a((C2205y<T>) new C7113b<T>(this)), (C2206z<? extends T>) C2201v.m6601a((C2205y<T>) new C7114c<T>(this)));
    }

    /* renamed from: b */
    public final C2201v<List<C6945f>> mo13183b() {
        if (this.f19333b == null) {
            this.f19333b = new C7132t((FeedTabApi) C4157e.m10322a().mo9550a(FeedTabApi.class));
        }
        return this.f19333b.mo13253a().mo6541d((C1711f<? super T, ? extends R>) new C7117f<Object,Object>(this)).mo6540d((C1710e<? super T>) new C7118g<Object>(this));
    }

    /* renamed from: c */
    public final List<C6945f> mo13185c() {
        if (TextUtils.equals("homepage_hot", C8830k.m17330d().mo15060m().mo10874f())) {
            return this.f19332a.mo13252d();
        }
        return this.f19332a.mo13247b();
    }

    /* renamed from: a */
    public final C6945f mo13182a(long j) {
        return this.f19332a.mo13245a(j);
    }

    /* renamed from: b */
    public final boolean mo13184b(long j) {
        C6945f a = mo13182a(j);
        if (a == null || a.f19018j <= 0) {
            return false;
        }
        return true;
    }

    public C7112a(C7129q qVar, C7130r rVar) {
        this.f19332a = qVar;
        this.f19333b = rVar;
    }
}
