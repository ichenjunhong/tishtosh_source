package com.p683ss.android.ugc.aweme.sticker.types.mimoji;

import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29193c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45821a;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45829e;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45830f;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45831g;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45832h;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45841j;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a.C46567b;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48709n;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.f */
public final class C46582f {

    /* renamed from: a */
    public static final C46582f f117515a = new C46582f();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f117516b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ArrayList<Integer> f117517c = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.f$a */
    public static final class C46583a implements C48709n {

        /* renamed from: a */
        final /* synthetic */ int f117518a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f117519b;

        /* renamed from: c */
        final /* synthetic */ C46567b f117520c;

        /* renamed from: d */
        final /* synthetic */ String f117521d;

        /* renamed from: e */
        final /* synthetic */ List f117522e;

        /* renamed from: f */
        final /* synthetic */ String f117523f;

        /* renamed from: a */
        public final void mo92994a(C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            if (this.f117518a == 0) {
                C46582f.f117516b = true;
            }
            C46582f.f117517c.add(Integer.valueOf(this.f117518a));
            if (C46582f.f117516b && C46582f.m101118a(this.f117522e)) {
                C46567b bVar = this.f117520c;
                if (bVar != null) {
                    bVar.mo91736a(dVar);
                }
                C46582f.m101114a();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0129  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo8638a(java.lang.Object r14) {
            /*
                r13 = this;
                com.ss.android.ugc.effectmanager.effect.model.ResourceListModel r14 = (com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel) r14
                java.lang.String r0 = "response"
                p2628d.p2639f.p2641b.C52711k.m112240b(r14, r0)
                com.ss.android.ugc.aweme.sticker.types.mimoji.f r0 = com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f.f117515a
                java.util.ArrayList r0 = com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f.f117517c
                int r1 = r13.f117518a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.add(r1)
                com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.google.gson.f r0 = r0.mo58566D()
                com.ss.android.ugc.aweme.sticker.StickerWrapper r1 = r13.f117519b
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f115779a
                r2 = 0
                if (r1 == 0) goto L_0x002a
                java.util.List r3 = r1.getComposerPath()
                goto L_0x002b
            L_0x002a:
                r3 = r2
            L_0x002b:
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x00df
                java.util.List r3 = r1.getComposerPath()
                if (r3 != 0) goto L_0x0037
                goto L_0x00df
            L_0x0037:
                java.util.List r1 = r1.getComposerPath()
                if (r1 != 0) goto L_0x0040
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0040:
                java.lang.String r3 = "composerPathList"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x004e:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x0084
                java.lang.Object r6 = r1.next()
                java.lang.String r6 = (java.lang.String) r6
                r7 = r6
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                java.lang.String r8 = java.io.File.separator
                java.lang.String r9 = "File.separator"
                p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                int r7 = p2628d.p2650m.C52830p.m112446b(r7, r8, r9, r10, r11, r12)
                int r7 = r7 + r5
                if (r6 == 0) goto L_0x007c
                java.lang.String r6 = r6.substring(r7)
                java.lang.String r7 = "(this as java.lang.String).substring(startIndex)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
                r3.add(r6)
                goto L_0x004e
            L_0x007c:
                d.u r14 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r14.<init>(r0)
                throw r14
            L_0x0084:
                java.util.List r3 = (java.util.List) r3
                boolean r1 = r3.isEmpty()
                if (r1 == 0) goto L_0x008d
                goto L_0x00df
            L_0x008d:
                if (r14 == 0) goto L_0x0093
                java.util.List r2 = r14.getResourceList()
            L_0x0093:
                if (r2 != 0) goto L_0x0096
                goto L_0x00e0
            L_0x0096:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r2 = r14.getResourceList()
                java.lang.String r6 = "model.resourceList"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
            L_0x00aa:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x00cf
                java.lang.Object r6 = r2.next()
                com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$ResourceListBean r6 = (com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel.ResourceListBean) r6
                java.lang.String r7 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
                java.lang.String r7 = r6.getResourceUrl()
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 != 0) goto L_0x00aa
                java.lang.String r6 = r6.getResourceUrl()
                r1.add(r6)
                goto L_0x00aa
            L_0x00cf:
                boolean r2 = r1.isEmpty()
                if (r2 == 0) goto L_0x00d6
                goto L_0x00e0
            L_0x00d6:
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r3.containsAll(r1)
                r4 = r1 ^ 1
                goto L_0x00e0
            L_0x00df:
                r4 = 1
            L_0x00e0:
                if (r4 == 0) goto L_0x0129
                int r1 = r13.f117518a
                if (r1 != 0) goto L_0x00f9
                com.ss.android.ugc.aweme.sticker.types.mimoji.a.b r0 = r13.f117520c
                if (r0 == 0) goto L_0x0151
                java.lang.String r1 = r13.f117521d
                com.ss.android.ugc.aweme.sticker.StickerWrapper r2 = r13.f117519b
                com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f115779a
                java.lang.String r3 = "stickerWrapper.effect"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                r0.mo91737a(r1, r2, r14)
                goto L_0x0151
            L_0x00f9:
                com.ss.android.ugc.aweme.sticker.StickerWrapper r1 = r13.f117519b
                r2 = 3
                r1.f115781c = r2
                com.ss.android.ugc.aweme.sticker.StickerWrapper r1 = r13.f117519b
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f115779a
                java.lang.String r2 = "stickerWrapper.effect"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.String r0 = r0.mo34889b(r14)
                r1.setResourceId(r0)
                int r0 = r13.f117518a
                if (r0 < 0) goto L_0x011d
                int r0 = r13.f117518a
                com.ss.android.ugc.aweme.sticker.StickerWrapper r1 = r13.f117519b
                java.util.List r2 = r13.f117522e
                java.lang.String r3 = r13.f117523f
                com.p683ss.android.ugc.aweme.sticker.p2278b.C45841j.m99672a(r0, r1, r2, r3)
            L_0x011d:
                java.lang.String r0 = r13.f117521d
                java.lang.String r1 = r13.f117523f
                java.util.List r2 = r13.f117522e
                com.ss.android.ugc.aweme.sticker.StickerWrapper r3 = r13.f117519b
                com.p683ss.android.ugc.aweme.sticker.p2278b.C45841j.m99675a(r0, r1, r2, r3)
                goto L_0x0151
            L_0x0129:
                int r1 = r13.f117518a
                if (r1 != 0) goto L_0x0132
                com.ss.android.ugc.aweme.sticker.types.mimoji.f r1 = com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f.f117515a
                com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f.f117516b = true
            L_0x0132:
                com.ss.android.ugc.aweme.sticker.StickerWrapper r1 = r13.f117519b
                r1.f115781c = r5
                com.ss.android.ugc.aweme.sticker.StickerWrapper r1 = r13.f117519b
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f115779a
                java.lang.String r2 = "stickerWrapper.effect"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.String r0 = r0.mo34889b(r14)
                r1.setResourceId(r0)
                java.lang.String r0 = r13.f117521d
                java.lang.String r1 = r13.f117523f
                java.util.List r2 = r13.f117522e
                com.ss.android.ugc.aweme.sticker.StickerWrapper r3 = r13.f117519b
                com.p683ss.android.ugc.aweme.sticker.p2278b.C45841j.m99675a(r0, r1, r2, r3)
            L_0x0151:
                com.ss.android.ugc.aweme.sticker.types.mimoji.f r0 = com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f.f117515a
                boolean r0 = com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f.f117516b
                if (r0 == 0) goto L_0x016d
                java.util.List r0 = r13.f117522e
                boolean r0 = com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f.m101118a(r0)
                if (r0 == 0) goto L_0x016d
                com.ss.android.ugc.aweme.sticker.types.mimoji.a.b r0 = r13.f117520c
                if (r0 == 0) goto L_0x016a
                java.util.List r1 = r13.f117522e
                r0.mo91739a(r1, r14)
            L_0x016a:
                com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f.m101114a()
            L_0x016d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f.C46583a.mo8638a(java.lang.Object):void");
        }

        C46583a(int i, StickerWrapper stickerWrapper, C46567b bVar, String str, List list, String str2) {
            this.f117518a = i;
            this.f117519b = stickerWrapper;
            this.f117520c = bVar;
            this.f117521d = str;
            this.f117522e = list;
            this.f117523f = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.f$b */
    public static final class C46584b implements C45829e<C45830f, Void> {

        /* renamed from: a */
        public long f117524a;

        /* renamed from: b */
        final /* synthetic */ Effect f117525b;

        /* renamed from: c */
        final /* synthetic */ ResourceListModel f117526c;

        /* renamed from: d */
        final /* synthetic */ List f117527d;

        /* renamed from: e */
        final /* synthetic */ int f117528e;

        /* renamed from: f */
        final /* synthetic */ List f117529f;

        /* renamed from: g */
        final /* synthetic */ String f117530g;

        /* renamed from: h */
        final /* synthetic */ String f117531h;

        /* renamed from: i */
        final /* synthetic */ C46567b f117532i;

        /* renamed from: a */
        public final /* synthetic */ void mo92263a(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            List list;
            Effect effect = this.f117525b;
            ResourceListModel resourceListModel = this.f117526c;
            List list2 = this.f117527d;
            C52711k.m112236a((Object) list2, "resourceBeans");
            C52711k.m112240b(list2, "resourceList");
            Effect effect2 = new Effect();
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            effect2.setEffectId(str);
            if (effect != null) {
                str2 = effect.getId();
            } else {
                str2 = null;
            }
            effect2.setId(str2);
            if (resourceListModel != null) {
                str3 = resourceListModel.getParam();
            } else {
                str3 = null;
            }
            effect2.setExtra(str3);
            UrlModel urlModel = new UrlModel();
            if (resourceListModel != null) {
                str4 = resourceListModel.getIconUri();
            } else {
                str4 = null;
            }
            if (resourceListModel != null) {
                list = resourceListModel.getUrlPrefix();
            } else {
                list = null;
            }
            urlModel.setUrlList(C46059g.m100063a(str4, list));
            effect2.setIconUrl(urlModel);
            effect2.setComposerPath(C45841j.m99671a(list2));
            effect2.setResourceId(C39629l.m88232a().mo58566D().mo34889b(resourceListModel));
            StickerWrapper a = StickerWrapper.m99611a(effect2, true);
            if (this.f117528e >= 0) {
                C45841j.m99672a(this.f117528e, a, this.f117529f, this.f117530g);
            }
            C45841j.m99675a(this.f117531h, this.f117530g, this.f117529f, a);
            C46582f.m101119b();
            if (C46582f.m101118a(this.f117529f) || this.f117528e > 0) {
                C46567b bVar = this.f117532i;
                if (bVar != null) {
                    bVar.mo91738a(this.f117531h, this.f117529f, a, null);
                }
                C46582f.m101114a();
            }
            C46581e.m101111a(this.f117531h, effect2, "update", Integer.valueOf(this.f117528e), this.f117524a);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo92264a(Object obj, Integer num, String str, Exception exc) {
            C45830f fVar = (C45830f) obj;
            C52711k.m112240b(fVar, "param");
            C46581e.m101112a(this.f117531h, this.f117525b, "update", Integer.valueOf(this.f117528e), num, str);
            C46581e.m101110a(fVar, num, str);
            C46582f.m101119b();
            if (C46582f.m101118a(this.f117529f) || this.f117528e > 0) {
                C46567b bVar = this.f117532i;
                if (bVar != null) {
                    bVar.mo91738a(this.f117531h, this.f117529f, null, exc);
                }
                C46582f.m101114a();
            }
        }

        C46584b(Effect effect, ResourceListModel resourceListModel, List list, int i, List list2, String str, String str2, C46567b bVar) {
            this.f117525b = effect;
            this.f117526c = resourceListModel;
            this.f117527d = list;
            this.f117528e = i;
            this.f117529f = list2;
            this.f117530g = str;
            this.f117531h = str2;
            this.f117532i = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.f$c */
    public static final class C46585c extends C45821a<C45830f, Void> {
        C46585c() {
        }

        /* renamed from: b */
        public final void mo59067b(C29192b<C45830f, Void> bVar) {
            C52711k.m112240b(bVar, "task");
            C46581e.m101109a((C45830f) bVar.f76498g);
            if (!C45841j.m99680c((C45830f) bVar.f76498g)) {
                C45841j.m99674a((C45830f) bVar.f76498g);
            }
        }
    }

    private C46582f() {
    }

    /* renamed from: b */
    public static void m101119b() {
        f117516b = true;
    }

    /* renamed from: a */
    public static final void m101114a() {
        f117516b = false;
        f117517c.clear();
    }

    /* renamed from: a */
    public static boolean m101118a(List<? extends StickerWrapper> list) {
        if (f117517c.size() == list.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m101115a(C29252f fVar, String str, StickerWrapper stickerWrapper, int i, List<StickerWrapper> list, C46567b bVar) {
        C52711k.m112240b(str, "id");
        C52711k.m112240b(list, "wrapperList");
        if (stickerWrapper == null || fVar == null || stickerWrapper.f115779a == null) {
            bVar.mo91736a(new C48649d(-1));
            return;
        }
        String a = C45841j.m99670a(str);
        C45841j.m99679c(a);
        Effect effect = stickerWrapper.f115779a;
        C52711k.m112236a((Object) effect, "stickerWrapper.effect");
        String extra = effect.getExtra();
        C46583a aVar = new C46583a(i, stickerWrapper, bVar, str, list, a);
        fVar.mo59128a(extra, (C48709n) aVar);
    }

    /* renamed from: a */
    public static final void m101117a(String str, Effect effect, List<StickerWrapper> list, int i, ResourceListModel resourceListModel, C46567b bVar) {
        String str2 = str;
        List<StickerWrapper> list2 = list;
        C52711k.m112240b(str, "id");
        C52711k.m112240b(list, "wrapperList");
        if (C9414h.m18630a(list)) {
            m101119b();
            bVar.mo91738a(str, list, null, null);
            return;
        }
        C46567b bVar2 = bVar;
        String a = C45841j.m99670a(str);
        C45841j.m99679c(a);
        ResourceListModel resourceListModel2 = resourceListModel;
        List a2 = C46059g.m100062a(a, resourceListModel2);
        C29193c gVar = new C45831g();
        C46584b bVar3 = new C46584b(effect, resourceListModel2, a2, i, list, a, str, bVar2);
        C45832h hVar = new C45832h(gVar, bVar3, new C46585c());
        C52711k.m112236a((Object) a2, "resourceBeans");
        hVar.mo92267a(a2);
        hVar.mo92265a();
    }
}
