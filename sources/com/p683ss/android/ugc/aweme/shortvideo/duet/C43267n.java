package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43261l.C43264b;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.n */
public final class C43267n extends C1322a<C1352v> implements C43264b {

    /* renamed from: a */
    List<? extends StickerWrapper> f109405a = new ArrayList();

    /* renamed from: b */
    public int f109406b;

    /* renamed from: c */
    private final AppCompatActivity f109407c;

    /* renamed from: d */
    private final ShortVideoContext f109408d;

    /* renamed from: e */
    private final C29252f f109409e;

    /* renamed from: f */
    private final DuetLayoutModeViewModel f109410f;

    public final int getItemCount() {
        return this.f109405a.size();
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "viewGroup");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C52711k.m112236a((Object) from, "LayoutInflater.from(viewGroup.context)");
        C52711k.m112240b(from, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = from.inflate(R.layout.axs, viewGroup, false);
        if (inflate != null) {
            return new C43261l((FrameLayout) inflate, this.f109409e, this);
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        C52711k.m112240b(vVar, "viewHolder");
        C43261l lVar = (C43261l) vVar;
        StickerWrapper stickerWrapper = (StickerWrapper) this.f109405a.get(i);
        if (i == this.f109406b) {
            z = true;
        } else {
            z = false;
        }
        C52711k.m112240b(stickerWrapper, "stickerWrapper");
        lVar.f109397b = stickerWrapper;
        if (stickerWrapper.f115779a != null) {
            StickerWrapper.m99616b(stickerWrapper, lVar.f109399d);
            lVar.mo87938a(stickerWrapper);
            if (z) {
                lVar.mo87939a(false);
            }
            Effect effect = stickerWrapper.f115779a;
            C52711k.m112236a((Object) effect, "stickerWrapper.effect");
            UrlModel iconUrl = effect.getIconUrl();
            C52711k.m112236a((Object) iconUrl, "stickerWrapper.effect.iconUrl");
            List urlList = iconUrl.getUrlList();
            if (urlList != null) {
                String str = (String) urlList.get(0);
                if (str != null) {
                    lVar.f109396a.mo93969a(str);
                }
            }
            AVDmtImageTextView aVDmtImageTextView = lVar.f109396a;
            Effect effect2 = stickerWrapper.f115779a;
            C52711k.m112236a((Object) effect2, "stickerWrapper.effect");
            aVDmtImageTextView.setText(effect2.getName());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        if (r0.f109356b == 2) goto L_0x00b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87942a(int r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.f109406b
            r1 = 0
            if (r6 == r0) goto L_0x0010
            int r0 = r5.f109406b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r5.notifyItemChanged(r0, r2)
            r5.f109406b = r6
        L_0x0010:
            if (r7 == 0) goto L_0x0060
            com.ss.android.ugc.aweme.shortvideo.duet.m r7 = com.p683ss.android.ugc.aweme.shortvideo.duet.C43266m.f109404a
            java.util.List<? extends com.ss.android.ugc.aweme.sticker.StickerWrapper> r0 = r5.f109405a
            java.lang.Object r0 = r0.get(r6)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f115779a
            java.lang.String r2 = "duetLayoutList[position].effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r2 = "effect"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.duet.e r7 = r7.mo87943a(r0)
            if (r7 != 0) goto L_0x0031
            java.lang.String r7 = ""
            goto L_0x0033
        L_0x0031:
            java.lang.String r7 = r7.f109355a
        L_0x0033:
            java.lang.String r0 = "select_duet_layout"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r5.f109408d
            java.lang.String r4 = r4.f107131x
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r5.f109408d
            java.lang.String r4 = r4.f107132y
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "video_shoot_page"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "to_status"
            com.ss.android.ugc.aweme.app.f.d r7 = r2.mo47829a(r3, r7)
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r7)
        L_0x0060:
            com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel r7 = r5.f109410f
            java.util.List<? extends com.ss.android.ugc.aweme.sticker.StickerWrapper> r0 = r5.f109405a
            java.lang.Object r0 = r0.get(r6)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f115779a
            java.lang.String r2 = "duetLayoutList[position].effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r0.getIconUrl()
            if (r0 != 0) goto L_0x0079
            r0 = 0
            goto L_0x0087
        L_0x0079:
            com.ss.android.ugc.aweme.base.k r2 = new com.ss.android.ugc.aweme.base.k
            java.lang.String r3 = r0.getUri()
            java.util.List r0 = r0.getUrlList()
            r2.<init>(r3, r0)
            r0 = r2
        L_0x0087:
            com.bytedance.als.i<com.ss.android.ugc.aweme.base.k> r2 = r7.f109332f
            r2.mo7350a(r0)
            java.util.List<? extends com.ss.android.ugc.aweme.sticker.StickerWrapper> r0 = r5.f109405a
            java.lang.Object r0 = r0.get(r6)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f115779a
            if (r0 != 0) goto L_0x009a
        L_0x0098:
            r2 = 0
            goto L_0x00b0
        L_0x009a:
            com.ss.android.ugc.aweme.shortvideo.duet.m r2 = com.p683ss.android.ugc.aweme.shortvideo.duet.C43266m.f109404a
            com.ss.android.ugc.aweme.shortvideo.duet.e r0 = r2.mo87943a(r0)
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x00aa
            int r4 = r0.f109356b
            if (r4 != r3) goto L_0x00aa
            r2 = 1
            goto L_0x00b0
        L_0x00aa:
            if (r0 == 0) goto L_0x0098
            int r0 = r0.f109356b
            if (r0 != r2) goto L_0x0098
        L_0x00b0:
            java.util.List<? extends com.ss.android.ugc.aweme.sticker.StickerWrapper> r0 = r5.f109405a
            java.lang.Object r0 = r0.get(r6)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f115779a
            if (r0 != 0) goto L_0x00bd
            goto L_0x00c1
        L_0x00bd:
            boolean r1 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100096t(r0)
        L_0x00c1:
            com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel$a r0 = new com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel$a
            r0.<init>(r2, r1, r6)
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            r7.mo22530c(r0)
            android.support.v7.app.AppCompatActivity r7 = r5.f109407c
            android.support.v4.app.FragmentActivity r7 = (android.support.p030v4.app.FragmentActivity) r7
            com.ss.android.ugc.gamora.b.c r7 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r7)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel> r0 = com.p683ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel.class
            com.bytedance.jedi.arch.JediViewModel r7 = r7.mo96760a(r0)
            com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel r7 = (com.p683ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel) r7
            java.util.List<? extends com.ss.android.ugc.aweme.sticker.StickerWrapper> r0 = r5.f109405a
            java.lang.Object r6 = r0.get(r6)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r6 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r6
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r6.f115779a
            java.lang.String r0 = "duetLayoutList[position].effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            r7.mo87897a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.duet.C43267n.mo87942a(int, boolean):void");
    }

    public final void onBindViewHolder(C1352v vVar, int i, List<Object> list) {
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(vVar, i);
            return;
        }
        C43261l lVar = (C43261l) vVar;
        Object obj = list.get(0);
        if (obj != null) {
            lVar.mo87941c(((Boolean) obj).booleanValue());
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
    }

    public C43267n(AppCompatActivity appCompatActivity, ShortVideoContext shortVideoContext, C29252f fVar, DuetLayoutModeViewModel duetLayoutModeViewModel) {
        C52711k.m112240b(appCompatActivity, "context");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        C52711k.m112240b(fVar, "effectPlatform");
        C52711k.m112240b(duetLayoutModeViewModel, "duetLayoutModeViewModel");
        this.f109407c = appCompatActivity;
        this.f109408d = shortVideoContext;
        this.f109409e = fVar;
        this.f109410f = duetLayoutModeViewModel;
    }
}
