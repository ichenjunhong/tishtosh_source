package com.p683ss.android.ugc.aweme.longvideo.feature;

import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.feed.C30303h;
import com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32492a;
import com.p683ss.android.ugc.aweme.longvideo.C36348a;
import com.p683ss.android.ugc.aweme.longvideo.C36366c;
import com.p683ss.android.ugc.aweme.video.C48121w;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.a */
public final class C36378a implements C36366c {

    /* renamed from: a */
    public final C30303h f93142a;

    /* renamed from: b */
    public final C36348a f93143b;

    /* renamed from: c */
    public final C48121w f93144c;

    /* renamed from: a */
    public final boolean mo75277a() {
        if (C23718g.m58207b().mo49152c()) {
            return true;
        }
        String str = "";
        if (this.f93142a != null) {
            str = this.f93142a.mo60476k();
            C52711k.m112236a((Object) str, "dialogController.eventType");
        }
        C32492a.m75236a().mo65806a(str);
        return true;
    }

    public C36378a(C30303h hVar, C36348a aVar, C48121w wVar) {
        C52711k.m112240b(aVar, "longVideoPlayView");
        C52711k.m112240b(wVar, "mPlayManger");
        this.f93142a = hVar;
        this.f93143b = aVar;
        this.f93144c = wVar;
    }
}
