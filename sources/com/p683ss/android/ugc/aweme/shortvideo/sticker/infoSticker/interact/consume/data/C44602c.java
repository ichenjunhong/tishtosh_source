package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c */
public final class C44602c {

    /* renamed from: a */
    public List<User> f112830a;

    /* renamed from: b */
    public C44601b f112831b;

    /* renamed from: c */
    public List<User> f112832c;

    /* renamed from: d */
    public C44601b f112833d;

    public C44602c() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: a */
    public final void mo90549a(C44601b bVar) {
        C52711k.m112240b(bVar, "<set-?>");
        this.f112831b = bVar;
    }

    /* renamed from: b */
    public final void mo90550b(C44601b bVar) {
        C52711k.m112240b(bVar, "<set-?>");
        this.f112833d = bVar;
    }

    private C44602c(List<User> list, C44601b bVar, List<User> list2, C44601b bVar2) {
        C52711k.m112240b(bVar, "loadMoreParamsLeft");
        C52711k.m112240b(bVar2, "loadMoreParamsRight");
        this.f112830a = list;
        this.f112831b = bVar;
        this.f112832c = list2;
        this.f112833d = bVar2;
    }

    public /* synthetic */ C44602c(List list, C44601b bVar, List list2, C44601b bVar2, int i, C52707g gVar) {
        this(null, new C44601b(0, false), null, new C44601b(0, false));
    }
}
