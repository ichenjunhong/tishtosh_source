package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.api.BanUserInfoApi;
import com.bytedance.android.live.broadcast.api.BroadcastConfigRetrofitApi;
import com.bytedance.android.live.broadcast.api.BroadcastRoomApi;
import com.bytedance.android.live.broadcast.api.BroadcastUserApi;
import com.bytedance.android.live.broadcast.api.CoverApi;
import com.bytedance.android.live.broadcast.api.DutyGiftAPi;
import com.bytedance.android.live.broadcast.api.StatusApi;
import com.bytedance.android.live.broadcast.api.StickerReportApi;
import com.bytedance.android.live.broadcast.p211f.C3388d.C3391b;
import com.bytedance.android.live.broadcast.p211f.C3388d.C3391b.C3392a;
import com.bytedance.android.live.network.C4157e;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.android.live.broadcast.utils.d */
public final class C3634d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10362a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3634d.class), "services", "getServices()Ljava/util/concurrent/ConcurrentHashMap;"))};

    /* renamed from: b */
    private final C52668f f10363b;

    /* renamed from: com.bytedance.android.live.broadcast.utils.d$a */
    public static final class C3635a implements C3391b<C3634d> {
        /* renamed from: a */
        public final C3392a<C3634d> mo8221a(C3392a<C3634d> aVar) {
            C52711k.m112240b(aVar, "config");
            C3392a<C3634d> a = aVar.mo8748a(new C3634d(null)).mo8747a();
            C52711k.m112236a((Object) a, "config\n                 …           .asSingleton()");
            return a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.d$b */
    static final class C3636b extends C52712l implements C52670a<ConcurrentHashMap<Class<?>, Object>> {

        /* renamed from: a */
        public static final C3636b f10364a = new C3636b();

        C3636b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: i */
    private final ConcurrentHashMap<Class<?>, Object> m9465i() {
        return (ConcurrentHashMap) this.f10363b.getValue();
    }

    private C3634d() {
        this.f10363b = C52732g.m112285a(C3636b.f10364a);
    }

    /* renamed from: a */
    public final BanUserInfoApi mo9017a() {
        return (BanUserInfoApi) mo9018a(BanUserInfoApi.class);
    }

    /* renamed from: b */
    public final BroadcastConfigRetrofitApi mo9019b() {
        return (BroadcastConfigRetrofitApi) mo9018a(BroadcastConfigRetrofitApi.class);
    }

    /* renamed from: c */
    public final BroadcastRoomApi mo9020c() {
        return (BroadcastRoomApi) mo9018a(BroadcastRoomApi.class);
    }

    /* renamed from: d */
    public final BroadcastUserApi mo9021d() {
        return (BroadcastUserApi) mo9018a(BroadcastUserApi.class);
    }

    /* renamed from: e */
    public final CoverApi mo9022e() {
        return (CoverApi) mo9018a(CoverApi.class);
    }

    /* renamed from: f */
    public final DutyGiftAPi mo9023f() {
        return (DutyGiftAPi) mo9018a(DutyGiftAPi.class);
    }

    /* renamed from: g */
    public final StatusApi mo9024g() {
        return (StatusApi) mo9018a(StatusApi.class);
    }

    /* renamed from: h */
    public final StickerReportApi mo9025h() {
        return (StickerReportApi) mo9018a(StickerReportApi.class);
    }

    public /* synthetic */ C3634d(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final <T> T mo9018a(Class<T> cls) {
        if (!m9465i().contains(cls)) {
            ConcurrentHashMap i = m9465i();
            Object a = C4157e.m10322a().mo9550a(cls);
            if (a == null) {
                C52711k.m112234a();
            }
            i.putIfAbsent(cls, a);
        }
        return m9465i().get(cls);
    }
}
