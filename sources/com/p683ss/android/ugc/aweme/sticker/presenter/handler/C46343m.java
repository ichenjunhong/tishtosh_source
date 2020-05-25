package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45890d;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k.C46341a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c;
import java.util.Map;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.m */
public final class C46343m implements C46340k {

    /* renamed from: a */
    public final ShortVideoContext f116931a;

    public C46343m(ShortVideoContext shortVideoContext) {
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        this.f116931a = shortVideoContext;
    }

    /* renamed from: a */
    public final C46316b mo93033a(C46317c cVar, C46341a aVar) {
        boolean z;
        C52711k.m112240b(cVar, "session");
        C52711k.m112240b(aVar, "chain");
        if (cVar instanceof C46315a) {
            C46315a aVar2 = (C46315a) cVar;
            CharSequence effectId = aVar2.f116852a.getEffectId();
            if (effectId == null || effectId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C45890d.m99781a("prop_try", (Map<String, String>) C52550ab.m112057c(C52856t.m112465a("creation_id", this.f116931a.f107131x), C52856t.m112465a("shoot_way", this.f116931a.f107132y), C52856t.m112465a("content_source", this.f116931a.mo86370k().getContentSource()), C52856t.m112465a("content_type", this.f116931a.mo86370k().getContentType()), C52856t.m112465a("enter_from", "video_shoot_page"), C52856t.m112465a("prop_id", aVar2.f116852a.getEffectId())));
            }
        }
        return aVar.mo93036a(cVar);
    }
}
