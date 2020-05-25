package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a;

import android.graphics.Point;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a.C43867a;
import com.p683ss.android.ugc.aweme.shortvideo.p2185d.p2186a.C43204a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.record.p2223a.C44442a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44563e;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46352j;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50002h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.a */
public final class C49975a implements C46352j {

    /* renamed from: a */
    private final FragmentActivity f125200a;

    /* renamed from: b */
    private final C45004a f125201b;

    /* renamed from: c */
    private final C50002h f125202c;

    /* renamed from: d */
    private final C46352j f125203d;

    /* renamed from: a */
    private final C20489b m107831a() {
        return this.f125201b.mo91307M().getEffectController();
    }

    /* renamed from: a */
    public final void mo93073a(FaceStickerBean faceStickerBean) {
        C52711k.m112240b(faceStickerBean, "sticker");
        C46352j jVar = this.f125203d;
        if (jVar != null) {
            jVar.mo93073a(faceStickerBean);
        }
    }

    /* renamed from: b */
    public final void mo93074b(FaceStickerBean faceStickerBean) {
        C52711k.m112240b(faceStickerBean, "sticker");
        Point H = this.f125201b.mo91302H();
        this.f125202c.mo97791a().mo7350a(new C43204a(m107831a()).mo87815a(H.x, H.y));
        C46352j jVar = this.f125203d;
        if (jVar != null) {
            jVar.mo93074b(faceStickerBean);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93076d(com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean r3) {
        /*
            r2 = this;
            java.lang.String r0 = "sticker"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.util.List r0 = r3.getTags()
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.shortvideo.ui.b.a r0 = r2.f125201b
            com.ss.android.ugc.aweme.shortvideo.record.a.a r0 = r0.mo91304J()
            if (r0 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.shortvideo.gesture.a r0 = r0.f112434g
            if (r0 != 0) goto L_0x001e
        L_0x0017:
            com.ss.android.ugc.aweme.shortvideo.gesture.a$a r0 = new com.ss.android.ugc.aweme.shortvideo.gesture.a$a
            r0.<init>()
            com.ss.android.ugc.aweme.shortvideo.gesture.a r0 = (com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a) r0
        L_0x001e:
            com.ss.android.ugc.gamora.recorder.sticker.a.h r1 = r2.f125202c
            com.bytedance.als.i r1 = r1.mo97791a()
            r1.mo7350a(r0)
        L_0x0027:
            com.ss.android.ugc.aweme.sticker.presenter.j r0 = r2.f125203d
            if (r0 == 0) goto L_0x002f
            r0.mo93076d(r3)
            return
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49975a.mo93076d(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean):void");
    }

    /* renamed from: e */
    public final void mo93077e(FaceStickerBean faceStickerBean) {
        C52711k.m112240b(faceStickerBean, "sticker");
        this.f125202c.mo97791a().mo7350a(new C44563e(this.f125200a, m107831a()));
        C46352j jVar = this.f125203d;
        if (jVar != null) {
            jVar.mo93077e(faceStickerBean);
        }
    }

    /* renamed from: c */
    public final void mo93075c(FaceStickerBean faceStickerBean) {
        C43866a aVar;
        C52711k.m112240b(faceStickerBean, "sticker");
        C44442a J = this.f125201b.mo91304J();
        if (J != null && !C46059g.m100067a(faceStickerBean)) {
            aVar = J.f112434g;
        } else if (faceStickerBean.getTypes().contains("TouchGes")) {
            Point H = this.f125201b.mo91302H();
            aVar = new C43204a(m107831a()).mo87815a(H.x, H.y);
        } else {
            aVar = new C43867a();
        }
        this.f125202c.mo97791a().mo7350a(aVar);
        C46352j jVar = this.f125203d;
        if (jVar != null) {
            jVar.mo93075c(faceStickerBean);
        }
    }

    public C49975a(FragmentActivity fragmentActivity, C45004a aVar, C50002h hVar, C46352j jVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(aVar, "cameraApiComponent");
        C52711k.m112240b(hVar, "stickerHandledEventState");
        this.f125200a = fragmentActivity;
        this.f125201b = aVar;
        this.f125202c = hVar;
        this.f125203d = jVar;
    }
}
