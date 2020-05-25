package com.bytedance.android.livesdk.commerce;

import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.commerce.c */
public final class C6707c {

    /* renamed from: a */
    public static C4097p<String> f18293a = new C4097p<>("live_shop_edit_url", "https://hotsoon.snssdk.com/falcon/live_inapp/page/live_manage_goods/index.html");

    /* renamed from: b */
    public static final C6708a f18294b = new C6708a(null);

    /* renamed from: com.bytedance.android.livesdk.commerce.c$a */
    public static final class C6708a {

        /* renamed from: com.bytedance.android.livesdk.commerce.c$a$a */
        public static final class C6709a<T, R> implements C1711f<T, R> {

            /* renamed from: a */
            public static final C6709a f18295a = new C6709a();

            C6709a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                boolean z;
                C4177d dVar = (C4177d) obj;
                C52711k.m112240b(dVar, "liveGoodsListResponse");
                C6712e eVar = (C6712e) dVar.data;
                if (eVar != null) {
                    z = eVar.f18300b;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.commerce.c$a$b */
        public static final class C6710b<T, R> implements C1711f<T, R> {

            /* renamed from: a */
            public static final C6710b f18296a = new C6710b();

            C6710b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                int i;
                C4177d dVar = (C4177d) obj;
                C52711k.m112240b(dVar, "liveGoodsListResponse");
                C6712e eVar = (C6712e) dVar.data;
                boolean z = false;
                if (eVar != null) {
                    i = eVar.f18299a;
                } else {
                    i = 0;
                }
                if (i > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        private C6708a() {
        }

        public /* synthetic */ C6708a(C52707g gVar) {
            this();
        }
    }
}
