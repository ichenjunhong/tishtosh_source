package com.bytedance.android.livesdk.feed.drawerfeed;

import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.dislike.DislikeApi;
import com.bytedance.android.livesdk.feed.services.C7104d;
import com.bytedance.android.livesdk.feed.tab.p349b.C7128p;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.live.C8649h;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.bytedance.android.livesdkapi.p450h.C8759i;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.c */
public final class C6880c {

    /* renamed from: a */
    C6890l f18838a;

    /* renamed from: b */
    C6957i f18839b = C7104d.m14774a();

    /* renamed from: c */
    C7023m f18840c = C7128p.m14812d();

    /* renamed from: d */
    C8757g f18841d = C8759i.m17243b();

    /* renamed from: e */
    C8649h f18842e;

    /* renamed from: f */
    C6861a f18843f = new C6861a((DislikeApi) C4157e.m10322a().mo9550a(DislikeApi.class));

    public C6880c(C6890l lVar) {
        if (C8830k.m17330d() != null) {
            this.f18842e = C8830k.m17330d().mo15051d();
        }
        this.f18838a = lVar;
    }
}
