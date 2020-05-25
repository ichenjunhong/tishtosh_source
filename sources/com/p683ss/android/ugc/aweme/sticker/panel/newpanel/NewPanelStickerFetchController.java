package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerFetchController */
public final class NewPanelStickerFetchController implements C0183j {

    /* renamed from: l */
    public static final C46197a f116549l = new C46197a(null);

    /* renamed from: a */
    final ConcurrentHashMap<String, Integer> f116550a = new ConcurrentHashMap<>();

    /* renamed from: b */
    final ConcurrentLinkedQueue<String> f116551b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    AtomicInteger f116552c;

    /* renamed from: d */
    boolean f116553d;

    /* renamed from: e */
    PanelInfoModel f116554e;

    /* renamed from: f */
    boolean f116555f;

    /* renamed from: g */
    public C52670a<C52860x> f116556g;

    /* renamed from: h */
    public C52670a<C52860x> f116557h;

    /* renamed from: i */
    public C52670a<C52860x> f116558i;

    /* renamed from: j */
    final C46354l f116559j;

    /* renamed from: k */
    final C0184k f116560k;

    /* renamed from: m */
    private int f116561m = 2;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerFetchController$a */
    public static final class C46197a {
        private C46197a() {
        }

        public /* synthetic */ C46197a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerFetchController$b */
    static final class C46198b<T> implements C0199s<C37721a<CategoryEffectModel>> {

        /* renamed from: a */
        final /* synthetic */ NewPanelStickerFetchController f116562a;

        /* renamed from: b */
        final /* synthetic */ String f116563b;

        C46198b(NewPanelStickerFetchController newPanelStickerFetchController, String str) {
            this.f116562a = newPanelStickerFetchController;
            this.f116563b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r4) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.mvp.b.a r4 = (com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a) r4
                if (r4 == 0) goto L_0x002d
                com.ss.android.ugc.aweme.mvp.b.a$a r0 = r4.f96126b
                if (r0 != 0) goto L_0x0009
                goto L_0x002d
            L_0x0009:
                int[] r1 = com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46243e.f116667b
                int r0 = r0.ordinal()
                r0 = r1[r0]
                switch(r0) {
                    case 1: goto L_0x001f;
                    case 2: goto L_0x0015;
                    default: goto L_0x0014;
                }
            L_0x0014:
                goto L_0x002c
            L_0x0015:
                com.ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerFetchController r4 = r3.f116562a
                java.lang.String r0 = r3.f116563b
                r1 = 0
                r2 = 0
                r4.mo92906a(r0, r1, r2)
                goto L_0x002c
            L_0x001f:
                com.ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerFetchController r0 = r3.f116562a
                java.lang.String r1 = r3.f116563b
                r2 = 1
                M r4 = r4.f96125a
                com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r4 = (com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel) r4
                r0.mo92906a(r1, r2, r4)
                goto L_0x002d
            L_0x002c:
                return
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerFetchController.C46198b.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerFetchController$c */
    static final class C46199c<T> implements C0199s<C37721a<PanelInfoModel>> {

        /* renamed from: a */
        final /* synthetic */ NewPanelStickerFetchController f116564a;

        C46199c(NewPanelStickerFetchController newPanelStickerFetchController) {
            this.f116564a = newPanelStickerFetchController;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C37722a aVar;
            C37721a aVar2 = (C37721a) obj;
            List list = null;
            if (aVar2 != null) {
                aVar = aVar2.f96126b;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                switch (C46243e.f116666a[aVar.ordinal()]) {
                    case 1:
                        PanelInfoModel panelInfoModel = (PanelInfoModel) aVar2.f96125a;
                        if (panelInfoModel != null) {
                            NewPanelStickerFetchController newPanelStickerFetchController = this.f116564a;
                            if (panelInfoModel != null) {
                                list = panelInfoModel.getCategoryList();
                            }
                            if (list != null && !panelInfoModel.getCategoryList().isEmpty()) {
                                newPanelStickerFetchController.f116554e = panelInfoModel;
                                newPanelStickerFetchController.f116552c = new AtomicInteger(0);
                                List categoryList = panelInfoModel.getCategoryList();
                                C52711k.m112236a((Object) categoryList, "categories.categoryList");
                                newPanelStickerFetchController.mo92907a(C52575l.m112128b((Iterable<? extends T>) categoryList));
                                newPanelStickerFetchController.mo92905a();
                                break;
                            } else {
                                newPanelStickerFetchController.mo92908b();
                            }
                        }
                        return;
                    case 2:
                        this.f116564a.mo92908b();
                        break;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo92908b() {
        this.f116555f = false;
        C52670a<C52860x> aVar = this.f116558i;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: c */
    private final void m100339c() {
        this.f116555f = false;
        this.f116559j.mo92973a().mo92537i().mo92547h();
        C52670a<C52860x> aVar = this.f116557h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo92905a() {
        while (!this.f116551b.isEmpty()) {
            String str = (String) this.f116551b.poll();
            C52711k.m112236a((Object) str, "categoryKey");
            this.f116559j.mo92973a().mo92537i().mo92538a(str, true).observe(this.f116560k, new C46198b(this, str));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo92907a(List<? extends EffectCategoryModel> list) {
        for (EffectCategoryModel key : list) {
            this.f116551b.offer(key.getKey());
        }
    }

    public NewPanelStickerFetchController(C46354l lVar, C0184k kVar) {
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f116559j = lVar;
        this.f116560k = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92906a(java.lang.String r6, boolean r7, com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x0032
            if (r8 == 0) goto L_0x0032
            r5.f116553d = r0
            java.util.concurrent.atomic.AtomicInteger r6 = r5.f116552c
            if (r6 == 0) goto L_0x0015
            int r6 = r6.incrementAndGet()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0016
        L_0x0015:
            r6 = r1
        L_0x0016:
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r7 = r5.f116554e
            if (r7 == 0) goto L_0x0028
            java.util.List r7 = r7.getCategoryList()
            if (r7 == 0) goto L_0x0028
            int r7 = r7.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
        L_0x0028:
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)
            if (r6 == 0) goto L_0x00ea
            r5.m100339c()
            return
        L_0x0032:
            com.ss.android.ugc.aweme.port.in.u r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r7 = r7.mo58567E()
            java.lang.String r8 = "AWEStudio_new_effect_tab_category_load_failed"
            com.ss.android.ugc.aweme.shortvideo.ay r2 = new com.ss.android.ugc.aweme.shortvideo.ay
            r2.<init>()
            java.lang.String r3 = "panel"
            java.lang.String r4 = "default"
            com.ss.android.ugc.aweme.shortvideo.ay r2 = r2.mo86521a(r3, r4)
            java.lang.String r3 = "category"
            com.ss.android.ugc.aweme.shortvideo.ay r2 = r2.mo86521a(r3, r6)
            org.json.JSONObject r2 = r2.mo86522b()
            r3 = 0
            r7.mo49426a(r8, r3, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r7 = r5.f116550a
            boolean r7 = r7.containsKey(r6)
            if (r7 == 0) goto L_0x007f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r7 = r5.f116550a
            java.lang.Object r7 = r7.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L_0x0070
            r7 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L_0x0070:
            java.lang.String r8 = "mRetryCounter[categoryKey] ?: Int.MAX_VALUE"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            int r7 = r7.intValue()
            int r8 = r5.f116561m
            if (r7 < r8) goto L_0x008a
            r7 = 1
            goto L_0x008b
        L_0x007f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r7 = r5.f116550a
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r7.put(r6, r8)
        L_0x008a:
            r7 = 0
        L_0x008b:
            if (r7 == 0) goto L_0x00bf
            java.util.concurrent.atomic.AtomicInteger r6 = r5.f116552c
            if (r6 == 0) goto L_0x009a
            int r6 = r6.incrementAndGet()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x009b
        L_0x009a:
            r6 = r1
        L_0x009b:
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r7 = r5.f116554e
            if (r7 == 0) goto L_0x00ad
            java.util.List r7 = r7.getCategoryList()
            if (r7 == 0) goto L_0x00ad
            int r7 = r7.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
        L_0x00ad:
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)
            if (r6 == 0) goto L_0x00ea
            boolean r6 = r5.f116553d
            if (r6 == 0) goto L_0x00bb
            r5.m100339c()
            return
        L_0x00bb:
            r5.mo92908b()
            return
        L_0x00bf:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r7 = r5.f116550a
            java.lang.Object r7 = r7.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L_0x00cd
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
        L_0x00cd:
            java.lang.String r8 = "mRetryCounter[categoryKey] ?: 0"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            int r7 = r7.intValue()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r8 = r5.f116550a
            java.util.Map r8 = (java.util.Map) r8
            int r7 = r7 + r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.put(r6, r7)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r7 = r5.f116551b
            r7.offer(r6)
            r5.mo92905a()
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerFetchController.mo92906a(java.lang.String, boolean, com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel):void");
    }
}
