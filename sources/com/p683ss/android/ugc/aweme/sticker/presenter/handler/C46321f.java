package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.support.p030v4.p038f.C0781c;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39547ag;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.f */
public final class C46321f extends C46306b {

    /* renamed from: a */
    public AVChallenge f116878a;

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.f$a */
    static final class C46322a<T> implements C0781c<AVChallenge> {

        /* renamed from: a */
        final /* synthetic */ C46321f f116879a;

        C46322a(C46321f fVar) {
            this.f116879a = fVar;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.f116879a.f116878a = (AVChallenge) obj;
        }
    }

    /* renamed from: a */
    public final void mo93028a() {
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return true;
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        Effect effect = aVar.f116852a;
        String str = null;
        this.f116878a = null;
        List tags = effect.getTags();
        if (!C9414h.m18630a(tags)) {
            Iterator it = tags.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                C52711k.m112236a((Object) str2, "tag");
                if (C52830p.m112411b(str2, "challenge:", false, 2, null)) {
                    str = str2.substring(10);
                    C52711k.m112236a((Object) str, "(this as java.lang.String).substring(startIndex)");
                    break;
                }
            }
        }
        String str3 = str;
        if (str3 != null) {
            C39547ag t = C39629l.m88232a().mo58589t();
            if (t != null) {
                t.mo74186a(str3, null, 0, 0, new C46322a(this));
            }
        }
    }
}
