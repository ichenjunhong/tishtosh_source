package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a;

import android.content.Context;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2765i;
import com.bytedance.common.utility.C9414h;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.base.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43909b;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43909b.C43910a;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46297f;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46602a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C49997c;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.C50077f;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.e */
public final class C49982e implements C49997c {

    /* renamed from: a */
    public final SafeHandler f125231a = new SafeHandler(this.f125233c);

    /* renamed from: b */
    final C52670a<C49983a> f125232b;

    /* renamed from: c */
    public final AppCompatActivity f125233c;

    /* renamed from: d */
    public final C50048n f125234d;

    /* renamed from: e */
    public final ShortVideoContext f125235e;

    /* renamed from: f */
    private final C2765i<Effect> f125236f = new C2765i<>();

    /* renamed from: g */
    private final C43909b f125237g;

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.e$a */
    public static final class C49983a {

        /* renamed from: a */
        public final String f125238a;

        /* renamed from: b */
        public final String f125239b;

        /* renamed from: c */
        public final Effect f125240c;

        /* renamed from: d */
        public final List<String> f125241d;

        /* renamed from: e */
        public final boolean f125242e;

        public C49983a(String str, String str2, Effect effect, List<String> list, boolean z) {
            this.f125238a = str;
            this.f125239b = str2;
            this.f125240c = effect;
            this.f125241d = list;
            this.f125242e = z;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.e$b */
    public static final class C49984b implements C48703h {

        /* renamed from: a */
        final /* synthetic */ C49982e f125243a;

        /* renamed from: b */
        final /* synthetic */ List f125244b;

        /* renamed from: c */
        final /* synthetic */ Map f125245c;

        /* renamed from: d */
        final /* synthetic */ StringBuilder f125246d;

        /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.e$b$a */
        public static final class C49985a implements C48704i {

            /* renamed from: a */
            final /* synthetic */ C49984b f125247a;

            /* renamed from: b */
            final /* synthetic */ EffectListResponse f125248b;

            /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.e$b$a$a */
            static final class C49986a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C49985a f125249a;

                C49986a(C49985a aVar) {
                    this.f125249a = aVar;
                }

                public final void run() {
                    this.f125249a.f125247a.f125243a.mo97782a(this.f125249a.f125248b, this.f125249a.f125247a.f125246d);
                }
            }

            /* renamed from: a */
            public final void mo77143a(C48649d dVar) {
                C52711k.m112240b(dVar, "e");
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                C52711k.m112240b((List) obj, "effectList");
                if (!((C49983a) this.f125247a.f125243a.f125232b.invoke()).f125242e) {
                    this.f125247a.f125243a.f125231a.postDelayed(new C49986a(this), 2000);
                } else {
                    this.f125247a.f125243a.mo97782a(this.f125248b, this.f125247a.f125246d);
                }
            }

            C49985a(C49984b bVar, EffectListResponse effectListResponse) {
                this.f125247a = bVar;
                this.f125248b = effectListResponse;
            }
        }

        /* renamed from: a */
        public final void mo89462a(C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            Exception exc = dVar.f122281c;
            if (exc != null) {
                C17840a.m43754b(exc);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectListResponse effectListResponse = (EffectListResponse) obj;
            C52711k.m112240b(effectListResponse, "response");
            C46297f fVar = this.f125243a.f125234d;
            String str = (String) this.f125244b.get(0);
            Map map = this.f125245c;
            C48704i aVar = new C49985a(this, effectListResponse);
            C52711k.m112240b(fVar, "$this$fetchEffect");
            C52711k.m112240b(str, "effectId");
            fVar.mo93023h().mo92982a(C52575l.m112092a(str), map, true, aVar);
        }

        C49984b(C49982e eVar, List list, Map map, StringBuilder sb) {
            this.f125243a = eVar;
            this.f125244b = list;
            this.f125245c = map;
            this.f125246d = sb;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.e$c */
    public static final class C49987c implements C48703h {

        /* renamed from: a */
        final /* synthetic */ C49982e f125250a;

        /* renamed from: b */
        final /* synthetic */ Map f125251b;

        /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.e$c$a */
        public static final class C49988a implements C45874b {

            /* renamed from: a */
            final /* synthetic */ C49987c f125252a;

            /* renamed from: a */
            public final void mo92251a(Effect effect) {
            }

            /* renamed from: a */
            public final void mo92252a(Effect effect, int i) {
            }

            /* renamed from: b */
            public final void mo92254b(Effect effect) {
            }

            C49988a(C49987c cVar) {
                this.f125252a = cVar;
            }

            /* renamed from: a */
            public final void mo92253a(Effect effect, C48649d dVar) {
                if (dVar != null) {
                    Exception exc = dVar.f122281c;
                    if (exc != null) {
                        C17840a.m43754b(exc);
                    }
                }
                C50275d.m108538b((Context) this.f125252a.f125250a.f125233c, (int) R.string.drg).mo98174a();
                C50077f fVar = (C50077f) C2755a.m7851a(this.f125252a.f125250a.f125233c).mo7341b(C50077f.class);
                if (fVar != null) {
                    fVar.mo97832a(true);
                }
            }
        }

        /* renamed from: a */
        public final void mo89462a(C48649d dVar) {
            int i;
            C52711k.m112240b(dVar, "e");
            switch (dVar.f122279a) {
                case 2002:
                case 2004:
                    i = R.string.awm;
                    break;
                case 2003:
                    i = R.string.ap7;
                    break;
                case 2006:
                    i = R.string.f7_;
                    break;
                default:
                    i = R.string.b04;
                    break;
            }
            C50275d.m108538b((Context) this.f125250a.f125233c, i).mo98174a();
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            C49988a aVar;
            EffectListResponse effectListResponse = (EffectListResponse) obj;
            C52711k.m112240b(effectListResponse, "response");
            this.f125250a.f125234d.mo97797B().mo97787a(effectListResponse.getUrlPrefix());
            List data = effectListResponse.getData();
            if (!C9414h.m18630a(data)) {
                Effect effect = (Effect) data.get(0);
                C46297f fVar = this.f125250a.f125234d;
                C52711k.m112236a((Object) data, "effectList");
                boolean z = this.f125250a.f125235e.f107075aa;
                Map map = this.f125251b;
                if (C46059g.m100069a(effect)) {
                    aVar = null;
                } else {
                    aVar = new C49988a(this);
                }
                C45861d.m99709a(fVar, data, z, true, map, aVar, 0, 32, null);
                C49982e eVar = this.f125250a;
                C52711k.m112236a((Object) effect, "effect");
                eVar.mo97781a(effect);
            }
        }

        C49987c(C49982e eVar, Map map) {
            this.f125250a = eVar;
            this.f125251b = map;
        }
    }

    /* renamed from: a */
    public final C2762f<Effect> mo97772a() {
        return this.f125236f;
    }

    /* renamed from: d */
    private final String m107846d() {
        String str = ((C49983a) this.f125232b.invoke()).f125238a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: e */
    private final String m107847e() {
        String str = ((C49983a) this.f125232b.invoke()).f125239b;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: f */
    private final List<String> m107848f() {
        return ((C49983a) this.f125232b.invoke()).f125241d;
    }

    /* renamed from: g */
    private final Map<String, String> m107849g() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("scene", m107846d());
        String e = m107847e();
        if (!TextUtils.isEmpty(e)) {
            hashMap.put("grade_key", e);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void mo97774b() {
        boolean z;
        List f = m107848f();
        Collection collection = f;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) f.get(0));
            int size = f.size();
            for (int i = 1; i < size; i++) {
                sb.append(",");
                sb.append((String) f.get(i));
            }
            Map g = m107849g();
            C45861d.m99708a(this.f125234d, f, g, new C49984b(this, f, g, sb));
        }
    }

    /* renamed from: c */
    public final String mo97775c() {
        boolean z;
        List f = m107848f();
        Collection collection = f;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        Iterator it = f.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo97781a(Effect effect) {
        if (C46059g.m100086j(effect)) {
            C46602a.m101158a().mo93411a(effect);
            this.f125236f.mo7350a(effect);
        }
    }

    /* renamed from: a */
    public final void mo97773a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List c = C52575l.m112101c(str);
            Map g = m107849g();
            C46297f fVar = this.f125234d;
            C43909b bVar = this.f125237g;
            C48703h cVar = new C49987c(this, g);
            C52711k.m112240b(cVar, "originFetchListListener");
            C45861d.m99708a(fVar, c, g, new C43910a(bVar, cVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0154, code lost:
        if (r12 == null) goto L_0x0156;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97782a(com.p683ss.android.ugc.effectmanager.effect.model.net.EffectListResponse r11, java.lang.StringBuilder r12) {
        /*
            r10 = this;
            com.ss.android.ugc.gamora.recorder.sticker.a.n r0 = r10.f125234d
            com.ss.android.ugc.gamora.recorder.sticker.a.e r0 = r0.mo97797B()
            java.util.List r1 = r11.getUrlPrefix()
            r0.mo97787a(r1)
            d.f.a.a<com.ss.android.ugc.gamora.recorder.sticker.a.a.e$a> r0 = r10.f125232b
            java.lang.Object r0 = r0.invoke()
            com.ss.android.ugc.gamora.recorder.sticker.a.a.e$a r0 = (com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49982e.C49983a) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f125240c
            java.util.List r2 = r11.getData()
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002b
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r5 = 0
            goto L_0x002c
        L_0x002b:
            r5 = 1
        L_0x002c:
            if (r5 != 0) goto L_0x0059
            java.lang.String r5 = r10.m107846d()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r6 = "qrcode"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L_0x0059
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112137e(r2)
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r5
            boolean r5 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100086j(r5)
            if (r5 == 0) goto L_0x0059
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112137e(r2)
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r5
            boolean r5 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100093q(r5)
            if (r5 != 0) goto L_0x0059
            r2.remove(r4)
        L_0x0059:
            if (r1 == 0) goto L_0x0064
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r5 = 0
            goto L_0x0065
        L_0x0064:
            r5 = 1
        L_0x0065:
            if (r5 != 0) goto L_0x0076
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112137e(r2)
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r5
            boolean r5 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100099w(r5)
            if (r5 == 0) goto L_0x0076
            r2.remove(r4)
        L_0x0076:
            if (r1 == 0) goto L_0x0081
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r1 = 0
            goto L_0x0082
        L_0x0081:
            r1 = 1
        L_0x0082:
            if (r1 == 0) goto L_0x0085
            return
        L_0x0085:
            java.util.List r1 = r11.getCollection()
            boolean r1 = com.bytedance.common.utility.C9414h.m18631b(r1)
            if (r1 == 0) goto L_0x00ad
            com.ss.android.ugc.gamora.recorder.sticker.a.n r1 = r10.f125234d
            com.ss.android.ugc.aweme.sticker.presenter.f r1 = (com.p683ss.android.ugc.aweme.sticker.presenter.C46297f) r1
            java.util.List r11 = r11.getCollection()
            java.lang.String r5 = "$this$setCollectEffects"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r5)
            if (r11 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.sticker.presenter.l r1 = r1.mo93023h()
            com.ss.android.ugc.aweme.sticker.i.a.p r1 = r1.mo92973a()
            com.ss.android.ugc.aweme.sticker.i.a.q r1 = r1.mo92537i()
            r1.mo92540a(r11)
        L_0x00ad:
            java.util.Iterator r11 = r2.iterator()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L_0x00b6:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x00de
            java.lang.Object r5 = r11.next()
            java.lang.String r6 = "iterator.next()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r5
            java.lang.String r5 = r5.getParentId()
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x00b6
            boolean r5 = r1.add(r5)
            if (r5 != 0) goto L_0x00b6
            r11.remove()
            goto L_0x00b6
        L_0x00de:
            java.lang.String r11 = r12.toString()
            java.lang.String r12 = "stickers.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            android.support.v7.app.AppCompatActivity r12 = r10.f125233c
            android.content.Intent r12 = r12.getIntent()
            java.lang.String r1 = "event_shoot_event_track"
            java.lang.String r12 = r12.getStringExtra(r1)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x011f
            java.lang.String r12 = "auto_prop_show"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "prop_id"
            com.ss.android.ugc.aweme.app.f.d r11 = r1.mo47829a(r5, r11)
            java.lang.String r1 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r10.f125235e
            java.lang.String r5 = r5.f107131x
            com.ss.android.ugc.aweme.app.f.d r11 = r11.mo47829a(r1, r5)
            java.lang.String r1 = "shoot_way"
            java.lang.String r5 = "direct_shoot"
            com.ss.android.ugc.aweme.app.f.d r11 = r11.mo47829a(r1, r5)
            java.util.Map<java.lang.String, java.lang.String> r11 = r11.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r12, r11)
            goto L_0x0130
        L_0x011f:
            java.lang.String r12 = "reuse_prop_release"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "prop_id"
            com.ss.android.ugc.aweme.app.f.d r11 = r1.mo47829a(r5, r11)
            java.util.Map<java.lang.String, java.lang.String> r11 = r11.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r12, r11)
        L_0x0130:
            java.lang.Object r11 = p2628d.p2629a.C52575l.m112137e(r2)
            com.ss.android.ugc.effectmanager.effect.model.Effect r11 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r11
            com.ss.android.ugc.gamora.recorder.sticker.a.n r12 = r10.f125234d
            r1 = r12
            com.ss.android.ugc.aweme.sticker.presenter.f r1 = (com.p683ss.android.ugc.aweme.sticker.presenter.C46297f) r1
            r12 = 1
            if (r0 == 0) goto L_0x013f
            r4 = 1
        L_0x013f:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 56
            r9 = 0
            r3 = r12
            com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d.m99709a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r12 = "firstEffect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            if (r0 == 0) goto L_0x0156
            java.lang.String r12 = r0.getUnzipPath()
            if (r12 != 0) goto L_0x0158
        L_0x0156:
            java.lang.String r12 = ""
        L_0x0158:
            r11.setUnzipPath(r12)
            r10.mo97781a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49982e.mo97782a(com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse, java.lang.StringBuilder):void");
    }

    public C49982e(C52670a<C49983a> aVar, AppCompatActivity appCompatActivity, C50048n nVar, ShortVideoContext shortVideoContext, C43909b bVar) {
        C52711k.m112240b(aVar, "stateSupplier");
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(nVar, "stickerApiComponent");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        C52711k.m112240b(bVar, "challengeStickerListener");
        this.f125232b = aVar;
        this.f125233c = appCompatActivity;
        this.f125234d = nVar;
        this.f125235e = shortVideoContext;
        this.f125237g = bVar;
    }
}
