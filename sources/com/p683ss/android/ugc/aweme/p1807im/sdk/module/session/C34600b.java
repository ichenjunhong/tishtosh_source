package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34582d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.C34015a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34041l;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import org.greenrobot.eventbus.C53755c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.b */
final /* synthetic */ class C34600b implements C34015a {

    /* renamed from: a */
    private final C34582d f89146a;

    /* renamed from: b */
    private final BaseContent f89147b;

    /* renamed from: c */
    private final C11207p f89148c;

    C34600b(C34582d dVar, BaseContent baseContent, C11207p pVar) {
        this.f89146a = dVar;
        this.f89147b = baseContent;
        this.f89148c = pVar;
    }

    /* renamed from: a */
    public final void mo71969a(IMUser iMUser) {
        C34582d dVar = this.f89146a;
        BaseContent baseContent = this.f89147b;
        C11207p pVar = this.f89148c;
        if (iMUser != null) {
            String a = C34566a.m78503a(dVar, baseContent, pVar);
            dVar.f91117h = a;
            C53755c.m114319a().mo112960d(new C34041l(dVar.bm_(), a));
        }
    }
}
