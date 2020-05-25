package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a;

import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.C43603a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C49999e;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.g */
public final class C49990g implements C49999e {

    /* renamed from: a */
    private List<String> f125256a;

    /* renamed from: b */
    private C43603a f125257b;

    /* renamed from: c */
    private final ShortVideoContext f125258c;

    /* renamed from: d */
    private final C50048n f125259d;

    /* renamed from: a */
    public final void mo97784a() {
        if (this.f125257b == null) {
            C43603a aVar = new C43603a();
            if (this.f125258c.mo86365f() || this.f125258c.mo86366g() || this.f125258c.mo86362d()) {
                aVar.f110345b = false;
            }
            if (!C9431p.m18664a(this.f125258c.f107098ax)) {
                aVar.mo88852a(this.f125258c.f107098ax, (int) this.f125258c.f107120m);
            }
            this.f125257b = aVar;
        }
    }

    /* renamed from: a */
    public final void mo97787a(List<String> list) {
        this.f125256a = list;
    }

    /* renamed from: a */
    public final void mo97786a(ShortVideoContext shortVideoContext) {
        C52711k.m112240b(shortVideoContext, "context");
        C43603a aVar = this.f125257b;
        if (aVar != null) {
            aVar.mo88851a(shortVideoContext);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (p2628d.p2650m.C52830p.m112411b(r3, com.bytedance.ies.bullet.kit.web.WebKitApi.SCHEME_HTTP, false, 2, null) == false) goto L_0x0050;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97785a(int r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a r0 = r8.f125257b
            if (r0 == 0) goto L_0x0082
            com.ss.android.ugc.gamora.recorder.sticker.a.n r1 = r8.f125259d
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r1 = r1.mo97798C()
            if (r1 != 0) goto L_0x000d
            return
        L_0x000d:
            boolean r1 = r0.mo88853a(r9)
            if (r1 == 0) goto L_0x0081
            com.ss.android.ugc.gamora.recorder.sticker.a.n r1 = r8.f125259d
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r1 = r1.mo97798C()
            if (r1 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.port.in.ax r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101139C
            com.google.gson.f r2 = r2.getRetrofitFactoryGson()
            java.lang.String r3 = r1.getExtra()
            java.lang.Class<com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams> r4 = com.p683ss.android.ugc.aweme.sticker.panel.guide.ExtraParams.class
            java.lang.Object r2 = r2.mo34884a(r3, r4)
            com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams r2 = (com.p683ss.android.ugc.aweme.sticker.panel.guide.ExtraParams) r2
            if (r2 == 0) goto L_0x0080
            boolean r3 = r2.isUrlInteractionStickerValid()
            if (r3 != 0) goto L_0x0036
            goto L_0x0080
        L_0x0036:
            java.lang.String r3 = r2.getInteractionIcon()
            if (r3 == 0) goto L_0x0050
            java.lang.String r3 = r2.getInteractionIcon()
            java.lang.String r4 = "extraParams.interactionIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r4 = "http"
            r5 = 0
            r6 = 2
            r7 = 0
            boolean r3 = p2628d.p2650m.C52830p.m112411b(r3, r4, r5, r6, r7)
            if (r3 != 0) goto L_0x0072
        L_0x0050:
            java.util.List<java.lang.String> r3 = r8.f125256a
            if (r3 == 0) goto L_0x0072
            java.lang.Object r3 = p2628d.p2629a.C52575l.m112140f(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0072
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = r2.getInteractionIcon()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.setInteractionIcon(r3)
        L_0x0072:
            long r3 = r1.getStickerId()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0.f110344a = r1
            r0.mo88850a(r9, r2)
            goto L_0x0081
        L_0x0080:
            return
        L_0x0081:
            return
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49990g.mo97785a(int):void");
    }

    public C49990g(ShortVideoContext shortVideoContext, C50048n nVar) {
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        C52711k.m112240b(nVar, "stickerApiComponent");
        this.f125258c = shortVideoContext;
        this.f125259d = nVar;
    }
}
