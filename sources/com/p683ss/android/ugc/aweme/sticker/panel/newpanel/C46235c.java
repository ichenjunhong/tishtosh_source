package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1337j;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46054d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.c */
public final class C46235c extends C1340m implements C1337j, OnAttachStateChangeListener {

    /* renamed from: a */
    final RecyclerView f116645a;

    /* renamed from: b */
    private final Map<String, Boolean> f116646b = new LinkedHashMap();

    /* renamed from: c */
    private final List<String> f116647c = new ArrayList();

    /* renamed from: d */
    private final C46210a f116648d;

    /* renamed from: e */
    private final C46236d f116649e;

    /* renamed from: f */
    private final C46054d f116650f;

    /* renamed from: b */
    public final void mo5077b(View view) {
        C52711k.m112240b(view, "view");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r5 == null) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m100396a() {
        /*
            r7 = this;
            android.support.v7.widget.RecyclerView r0 = r7.f116645a
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            boolean r1 = r0 instanceof android.support.p043v7.widget.LinearLayoutManager
            r2 = 0
            if (r1 != 0) goto L_0x000c
            r0 = r2
        L_0x000c:
            android.support.v7.widget.LinearLayoutManager r0 = (android.support.p043v7.widget.LinearLayoutManager) r0
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            int r1 = r0.mo4749j()
            int r0 = r0.mo4751l()
            java.util.List<java.lang.String> r3 = r7.f116647c
            r3.clear()
        L_0x001e:
            r3 = 0
            if (r1 >= r0) goto L_0x0074
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r4 = r7.f116649e
            java.util.List r4 = r4.mo92825b()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r4.get(r1)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r4 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r4
            goto L_0x0031
        L_0x0030:
            r4 = r2
        L_0x0031:
            boolean r5 = m100397a(r4)
            if (r5 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0043
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r4.f115779a
            if (r5 == 0) goto L_0x0043
            java.lang.String r5 = r5.getEffectId()
            if (r5 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r5 = ""
        L_0x0045:
            java.util.Map<java.lang.String, java.lang.Boolean> r6 = r7.f116646b
            java.lang.Object r6 = r6.get(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0053
            boolean r3 = r6.booleanValue()
        L_0x0053:
            if (r3 != 0) goto L_0x0062
            com.ss.android.ugc.aweme.sticker.k.d r3 = r7.f116650f
            if (r3 == 0) goto L_0x0062
            if (r4 == 0) goto L_0x005e
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.f115779a
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r3.mo92602b(r4)
        L_0x0062:
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r7.f116646b
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.put(r5, r4)
            java.util.List<java.lang.String> r3 = r7.f116647c
            r3.add(r5)
        L_0x0071:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x0074:
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r7.f116646b
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x007e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x009c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.List<java.lang.String> r2 = r7.f116647c
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L_0x007e
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r7.f116646b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.put(r1, r4)
            goto L_0x007e
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46235c.m100396a():void");
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.f116648d.f116676k) {
            m100396a();
        }
    }

    /* renamed from: a */
    private static boolean m100397a(StickerWrapper stickerWrapper) {
        if (!(stickerWrapper == null || stickerWrapper.f115779a == null)) {
            Effect effect = stickerWrapper.f115779a;
            C52711k.m112236a((Object) effect, "stickerWrapper.effect");
            if (!TextUtils.isEmpty(effect.getAdRawData())) {
                return true;
            }
        }
        return false;
    }

    public final void onViewDetachedFromWindow(View view) {
        for (String put : this.f116646b.keySet()) {
            this.f116646b.put(put, Boolean.valueOf(false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 == null) goto L_0x0033;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5076a(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            com.ss.android.ugc.aweme.sticker.panel.newpanel.a r0 = r4.f116648d
            boolean r0 = r0.f116676k
            if (r0 == 0) goto L_0x005b
            int r5 = android.support.p043v7.widget.RecyclerView.m4275f(r5)
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r0 = r4.f116649e
            java.util.List r0 = r0.mo92825b()
            r1 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r5 = r0.get(r5)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r5 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r5
            goto L_0x0020
        L_0x001f:
            r5 = r1
        L_0x0020:
            boolean r0 = m100397a(r5)
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            if (r5 == 0) goto L_0x0033
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r5.f115779a
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r0.getEffectId()
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r0 = ""
        L_0x0035:
            r2 = 0
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r4.f116646b
            java.lang.Object r3 = r3.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x0044
            boolean r2 = r3.booleanValue()
        L_0x0044:
            if (r2 != 0) goto L_0x0051
            com.ss.android.ugc.aweme.sticker.k.d r2 = r4.f116650f
            if (r2 == 0) goto L_0x0051
            if (r5 == 0) goto L_0x004e
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r5.f115779a
        L_0x004e:
            r2.mo92602b(r1)
        L_0x0051:
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r4.f116646b
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.put(r0, r1)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46235c.mo5076a(android.view.View):void");
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C52711k.m112240b(recyclerView, "recyclerView");
        this.f116645a.mo4816b((C1337j) this);
        if (i == 0) {
            m100396a();
        }
    }

    public C46235c(C46210a aVar, RecyclerView recyclerView, C46236d dVar, C46054d dVar2) {
        C52711k.m112240b(aVar, "mHost");
        C52711k.m112240b(recyclerView, "mRecyclerView");
        C52711k.m112240b(dVar, "mStickerAdapter");
        this.f116648d = aVar;
        this.f116645a = recyclerView;
        this.f116649e = dVar;
        this.f116650f = dVar2;
    }
}
