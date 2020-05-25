package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1337j;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45924b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.HashSet;
import java.util.List;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.g */
public abstract class C46245g {

    /* renamed from: a */
    private final AppCompatActivity f116669a;

    /* renamed from: b */
    private final C46354l f116670b;

    /* renamed from: c */
    private final C45889c f116671c;

    /* renamed from: g */
    public int f116672g;

    /* renamed from: h */
    public C37722a f116673h = C37722a.INIT;

    /* renamed from: i */
    public boolean f116674i;

    /* renamed from: j */
    public boolean f116675j;

    /* renamed from: k */
    public boolean f116676k;

    /* renamed from: l */
    public AVDmtPanelRecyleView f116677l;

    /* renamed from: m */
    public C46236d f116678m;

    /* renamed from: n */
    public LinearLayoutManager f116679n;

    /* renamed from: o */
    public C1337j f116680o;

    /* renamed from: a */
    public abstract void mo92918a(String str, C52671b<? super String, ? extends Object> bVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo92920b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo92921c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo92922d() {
    }

    /* renamed from: e */
    public void mo92923e() {
        this.f116676k = true;
        mo92943h();
    }

    /* renamed from: g */
    public final void mo92942g() {
        this.f116676k = false;
        mo92945j();
    }

    /* renamed from: k */
    private final void m100409k() {
        boolean z;
        if (this.f116674i) {
            mo92922d();
            z = false;
        } else {
            z = true;
        }
        this.f116675j = z;
    }

    /* renamed from: l */
    private final void m100410l() {
        boolean z;
        if (this.f116674i) {
            mo92921c();
            z = false;
        } else {
            z = true;
        }
        this.f116675j = z;
    }

    /* renamed from: m */
    private final void m100411m() {
        boolean z;
        if (this.f116674i) {
            mo92920b();
            z = false;
        } else {
            z = true;
        }
        this.f116675j = z;
    }

    /* renamed from: f */
    public void mo92924f() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116677l;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.mo4832d();
        }
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f116677l;
        if (aVDmtPanelRecyleView2 != null) {
            aVDmtPanelRecyleView2.mo4823c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo92945j() {
        HashSet hashSet = (HashSet) this.f116670b.mo92973a().mo92537i().mo92539a().get(mo92944i());
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    /* renamed from: a */
    private final void mo92914a() {
        switch (C46246h.f116681a[this.f116673h.ordinal()]) {
            case 1:
                m100409k();
                return;
            case 2:
                m100410l();
                return;
            case 3:
                m100411m();
                break;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo92944i() {
        int i = this.f116672g;
        List a = C45924b.m99852a(this.f116670b.mo92973a().mo92537i());
        int size = a.size();
        if (i < 0 || size <= i) {
            return "";
        }
        String name = ((EffectCategoryModel) a.get(i)).getName();
        C52711k.m112236a((Object) name, "categoryList[categoryIndex].name");
        return name;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if (r5 == null) goto L_0x0099;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92943h() {
        /*
            r9 = this;
            android.support.v7.widget.LinearLayoutManager r0 = r9.f116679n
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r0 = r9.f116678m
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r0 = r9.mo92944i()
            android.support.v7.widget.LinearLayoutManager r1 = r9.f116679n
            r2 = 0
            if (r1 == 0) goto L_0x0018
            int r1 = r1.mo4749j()
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            android.support.v7.widget.LinearLayoutManager r3 = r9.f116679n
            if (r3 == 0) goto L_0x0022
            int r3 = r3.mo4751l()
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            com.ss.android.ugc.aweme.sticker.presenter.l r4 = r9.f116670b
            com.ss.android.ugc.aweme.sticker.i.a.p r4 = r4.mo92973a()
            com.ss.android.ugc.aweme.sticker.i.a.q r4 = r4.mo92537i()
            java.util.Map r4 = r4.mo92539a()
            java.lang.Object r4 = r4.get(r0)
            java.util.HashSet r4 = (java.util.HashSet) r4
            if (r4 != 0) goto L_0x004f
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            com.ss.android.ugc.aweme.sticker.presenter.l r5 = r9.f116670b
            com.ss.android.ugc.aweme.sticker.i.a.p r5 = r5.mo92973a()
            com.ss.android.ugc.aweme.sticker.i.a.q r5 = r5.mo92537i()
            java.util.Map r5 = r5.mo92539a()
            r5.put(r0, r4)
        L_0x004f:
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r5 = r9.f116678m
            if (r5 == 0) goto L_0x00b1
            java.util.List r5 = r5.mo92825b()
            if (r5 == 0) goto L_0x00b1
            int r5 = r5.size()
            int r1 = r1 + 1
            int r1 = java.lang.Math.max(r1, r2)
            int r3 = r3 + 1
            int r2 = java.lang.Math.min(r3, r5)
        L_0x0069:
            if (r1 >= r2) goto L_0x00b0
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r3 = r9.f116678m
            if (r3 == 0) goto L_0x00ad
            java.util.List r3 = r3.mo92825b()
            if (r3 == 0) goto L_0x00ad
            java.lang.Object r3 = r3.get(r1)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r3 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r3
            if (r3 != 0) goto L_0x007e
            goto L_0x00ad
        L_0x007e:
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r3.f115779a
            java.lang.String r6 = "stickerWrapper.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r5 = r5.getEffectId()
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x00ad
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r3.f115779a
            if (r5 == 0) goto L_0x0099
            java.lang.String r5 = r5.getEffectId()
            if (r5 != 0) goto L_0x009b
        L_0x0099:
            java.lang.String r5 = ""
        L_0x009b:
            com.ss.android.ugc.aweme.sticker.g.c r6 = r9.f116671c
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f115779a
            java.lang.String r7 = "stickerWrapper.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
            java.lang.String r7 = "click_main_panel"
            r8 = -1
            r6.mo92481a(r3, r0, r7, r8)
            r4.add(r5)
        L_0x00ad:
            int r1 = r1 + 1
            goto L_0x0069
        L_0x00b0:
            return
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46245g.mo92943h():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92940a(C37722a aVar) {
        C52711k.m112240b(aVar, "newStatus");
        this.f116673h = aVar;
        mo92914a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo92941b(String str) {
        if (str != null && !this.f116670b.mo92973a().mo92537i().mo92539a().containsKey(str)) {
            this.f116670b.mo92973a().mo92537i().mo92539a().put(str, new HashSet());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92939a(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.mo92944i()
            com.ss.android.ugc.aweme.sticker.presenter.l r1 = r6.f116670b
            com.ss.android.ugc.aweme.sticker.i.a.p r1 = r1.mo92973a()
            com.ss.android.ugc.aweme.sticker.i.a.q r1 = r1.mo92537i()
            java.util.Map r1 = r1.mo92539a()
            java.lang.Object r1 = r1.get(r0)
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 != 0) goto L_0x0030
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.ss.android.ugc.aweme.sticker.presenter.l r2 = r6.f116670b
            com.ss.android.ugc.aweme.sticker.i.a.p r2 = r2.mo92973a()
            com.ss.android.ugc.aweme.sticker.i.a.q r2 = r2.mo92537i()
            java.util.Map r2 = r2.mo92539a()
            r2.put(r0, r1)
        L_0x0030:
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r2 = r6.f116678m
            if (r2 == 0) goto L_0x003f
            java.util.List r2 = r2.mo92825b()
            if (r2 == 0) goto L_0x003f
            int r2 = r2.size()
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            int r3 = r7 + 1
            if (r3 < 0) goto L_0x0089
            if (r2 > r3) goto L_0x0047
            return
        L_0x0047:
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r2 = r6.f116678m
            if (r2 == 0) goto L_0x0058
            java.util.List r2 = r2.mo92825b()
            if (r2 == 0) goto L_0x0058
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r2 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r2
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            if (r2 == 0) goto L_0x0088
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r2.f115779a
            java.lang.String r4 = "stickerWrapper.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r3 = r3.getEffectId()
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L_0x0088
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r2.f115779a
            java.lang.String r4 = "stickerWrapper.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r3 = r3.getEffectId()
            com.ss.android.ugc.aweme.sticker.g.c r4 = r6.f116671c
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f115779a
            java.lang.String r5 = "stickerWrapper.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            java.lang.String r5 = "click_main_panel"
            r4.mo92481a(r2, r0, r5, r7)
            r1.add(r3)
        L_0x0088:
            return
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46245g.mo92939a(int):void");
    }

    public C46245g(AppCompatActivity appCompatActivity, C46354l lVar, C45889c cVar) {
        C52711k.m112240b(appCompatActivity, "mActivity");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(cVar, "stickerMobHelper");
        this.f116669a = appCompatActivity;
        this.f116670b = lVar;
        this.f116671c = cVar;
    }
}
