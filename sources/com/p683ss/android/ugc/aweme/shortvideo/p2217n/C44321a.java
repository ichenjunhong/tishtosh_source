package com.p683ss.android.ugc.aweme.shortvideo.p2217n;

import android.app.Application;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.bytedance.p582g.p583a.p585b.p590e.C9979b;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.utils.C47685au;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.n.a */
public final class C44321a {

    /* renamed from: d */
    public static final C44321a f112186d = new C44321a();

    /* renamed from: e */
    public static final C44322a f112187e = new C44322a(null);

    /* renamed from: a */
    public C29252f f112188a;

    /* renamed from: b */
    public Effect f112189b;

    /* renamed from: c */
    public int f112190c = -1;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.a$a */
    public static final class C44322a {
        private C44322a() {
        }

        /* renamed from: b */
        private static C44321a m97078b() {
            return C44321a.f112186d;
        }

        /* renamed from: a */
        public final C44321a mo90200a() {
            return m97078b();
        }

        public /* synthetic */ C44322a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.a$b */
    public static final class C44323b implements C48701f {

        /* renamed from: a */
        final /* synthetic */ C44321a f112191a;

        /* renamed from: b */
        final /* synthetic */ C0198r f112192b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.a$b$a */
        public static final class C44324a implements C48705j {
            C44324a() {
            }

            /* renamed from: a */
            public final void mo8643a(Effect effect) {
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                C52711k.m112240b(dVar, "e");
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
            }
        }

        /* renamed from: a */
        public final void mo59186a(C48649d dVar) {
            String str;
            StringBuilder sb = new StringBuilder("fetchLiveEffectcategory onFail ");
            if (dVar != null) {
                str = dVar.f122280b;
            } else {
                str = null;
            }
            sb.append(str);
            this.f112192b.setValue(C37721a.m84218a(C37722a.ERROR, null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo8638a(java.lang.Object r5) {
            /*
                r4 = this;
                com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r5 = (com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r5
                r0 = 0
                if (r5 == 0) goto L_0x0010
                com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r5 = r5.getCategoryEffects()
                if (r5 == 0) goto L_0x0010
                java.util.List r5 = r5.getEffects()
                goto L_0x0011
            L_0x0010:
                r5 = r0
            L_0x0011:
                boolean r1 = com.bytedance.common.utility.C9414h.m18630a(r5)
                if (r1 == 0) goto L_0x0023
                android.arch.lifecycle.r r5 = r4.f112192b
                com.ss.android.ugc.aweme.mvp.b.a$a r1 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.ERROR
                com.ss.android.ugc.aweme.mvp.b.a r0 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.m84218a(r1, r0)
                r5.setValue(r0)
                return
            L_0x0023:
                com.ss.android.ugc.aweme.shortvideo.n.a r1 = r4.f112191a
                com.ss.android.ugc.aweme.shortvideo.n.a r2 = r4.f112191a
                com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.mo90199a(r5)
                r1.f112189b = r2
                com.ss.android.ugc.aweme.shortvideo.n.a r1 = r4.f112191a
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f112189b
                if (r1 != 0) goto L_0x0051
                com.ss.android.ugc.aweme.shortvideo.n.a r1 = r4.f112191a
                if (r5 != 0) goto L_0x003a
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x003a:
                r2 = r5
                java.util.Collection r2 = (java.util.Collection) r2
                d.j.c r2 = p2628d.p2629a.C52575l.m112095a(r2)
                d.i.c$b r3 = p2628d.p2645i.C52744c.f130992c
                d.i.c r3 = (p2628d.p2645i.C52744c) r3
                int r2 = p2628d.p2647j.C52753d.m112316a(r2, r3)
                java.lang.Object r5 = r5.get(r2)
                com.ss.android.ugc.effectmanager.effect.model.Effect r5 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r5
                r1.f112189b = r5
            L_0x0051:
                com.ss.android.ugc.aweme.shortvideo.n.a r5 = r4.f112191a
                r1 = 1
                r5.f112190c = r1
                d.n r5 = new d.n
                com.ss.android.ugc.aweme.shortvideo.n.a r2 = r4.f112191a
                com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f112189b
                if (r2 == 0) goto L_0x0060
                r2 = 1
                goto L_0x0061
            L_0x0060:
                r2 = 0
            L_0x0061:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                r5.<init>(r2, r3)
                android.arch.lifecycle.r r2 = r4.f112192b
                com.ss.android.ugc.aweme.mvp.b.a$a r3 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.SUCCESS
                com.ss.android.ugc.aweme.mvp.b.a r5 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.m84218a(r3, r5)
                r2.setValue(r5)
                com.ss.android.ugc.aweme.shortvideo.n.a r5 = r4.f112191a
                com.ss.android.ugc.aweme.effectplatform.f r5 = com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a.m97072a(r5, r0, r1, r0)
                com.ss.android.ugc.aweme.shortvideo.n.a r0 = r4.f112191a
                com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f112189b
                com.ss.android.ugc.aweme.shortvideo.n.a$b$a r1 = new com.ss.android.ugc.aweme.shortvideo.n.a$b$a
                r1.<init>()
                com.ss.android.ugc.effectmanager.effect.c.j r1 = (com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j) r1
                r5.mo59123a(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a.C44323b.mo8638a(java.lang.Object):void");
        }

        C44323b(C44321a aVar, C0198r rVar) {
            this.f112191a = aVar;
            this.f112192b = rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.a$c */
    public static final class C44325c implements C48707l {

        /* renamed from: a */
        final /* synthetic */ C44321a f112193a;

        /* renamed from: b */
        final /* synthetic */ C0198r f112194b;

        /* renamed from: a */
        public final void mo59192a(C48649d dVar) {
            this.f112194b.setValue(C37721a.m84218a(C37722a.ERROR, null));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            PanelInfoModel panelInfoModel = (PanelInfoModel) obj;
            if (panelInfoModel == null || C9414h.m18630a(panelInfoModel.getCategoryList())) {
                this.f112194b.setValue(C37721a.m84218a(C37722a.ERROR, null));
                return;
            }
            for (EffectCategoryModel effectCategoryModel : panelInfoModel.getCategoryList()) {
                if (C44321a.m97075a(effectCategoryModel)) {
                    C44321a aVar = this.f112193a;
                    String key = effectCategoryModel.getKey();
                    C0198r rVar = this.f112194b;
                    if (TextUtils.isEmpty(key) || rVar == null) {
                        C0198r rVar2 = new C0198r();
                        rVar2.setValue(C37721a.m84218a(C37722a.ERROR, null));
                        LiveData liveData = rVar2;
                    } else {
                        C44321a.m97072a(aVar, null, 1, null).mo59129a("livestreaming", key, 10, 0, 0, "0", new C44323b(aVar, rVar));
                        LiveData liveData2 = rVar;
                    }
                    return;
                }
            }
        }

        public C44325c(C44321a aVar, C0198r rVar) {
            this.f112193a = aVar;
            this.f112194b = rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.a$d */
    public static final class C44326d implements C48704i {

        /* renamed from: a */
        final /* synthetic */ C44321a f112195a;

        /* renamed from: b */
        final /* synthetic */ C0198r f112196b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.a$d$a */
        public static final class C44327a implements C48705j {
            C44327a() {
            }

            /* renamed from: a */
            public final void mo8643a(Effect effect) {
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                C52711k.m112240b(dVar, "e");
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
            }
        }

        /* renamed from: a */
        public final void mo77143a(C48649d dVar) {
            this.f112196b.setValue(C37721a.m84218a(C37722a.ERROR, null));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            List list = (List) obj;
            if (C9979b.m20068a(list)) {
                this.f112196b.setValue(C37721a.m84218a(C37722a.ERROR, null));
                return;
            }
            if (list == null) {
                C52711k.m112234a();
            }
            boolean z = false;
            if (list.get(0) == null) {
                this.f112196b.setValue(C37721a.m84218a(C37722a.ERROR, null));
                return;
            }
            this.f112195a.f112189b = (Effect) list.get(0);
            this.f112195a.f112190c = 2;
            if (this.f112195a.f112189b != null) {
                z = true;
            }
            this.f112196b.setValue(C37721a.m84218a(C37722a.SUCCESS, new C52847n(Boolean.valueOf(z), Integer.valueOf(2))));
            C44321a.m97072a(this.f112195a, null, 1, null).mo59123a(this.f112195a.f112189b, (C48705j) new C44327a());
        }

        public C44326d(C44321a aVar, C0198r rVar) {
            this.f112195a = aVar;
            this.f112196b = rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.a$e */
    public static final class C44328e implements C48703h {

        /* renamed from: a */
        final /* synthetic */ C44321a f112197a;

        /* renamed from: b */
        final /* synthetic */ C0198r f112198b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.a$e$a */
        public static final class C44329a implements C48705j {
            C44329a() {
            }

            /* renamed from: a */
            public final void mo8643a(Effect effect) {
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                C52711k.m112240b(dVar, "e");
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
            }
        }

        /* renamed from: a */
        public final void mo89462a(C48649d dVar) {
            this.f112198b.setValue(C37721a.m84218a(C37722a.ERROR, null));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            List list;
            EffectListResponse effectListResponse = (EffectListResponse) obj;
            if (effectListResponse != null) {
                list = effectListResponse.getData();
            } else {
                list = null;
            }
            if (C9979b.m20068a(list)) {
                this.f112198b.setValue(C37721a.m84218a(C37722a.ERROR, null));
                return;
            }
            if (list == null) {
                C52711k.m112234a();
            }
            boolean z = false;
            if (list.get(0) == null) {
                this.f112198b.setValue(C37721a.m84218a(C37722a.ERROR, null));
                return;
            }
            this.f112197a.f112189b = (Effect) list.get(0);
            this.f112197a.f112190c = 2;
            if (this.f112197a.f112189b != null) {
                z = true;
            }
            this.f112198b.setValue(C37721a.m84218a(C37722a.SUCCESS, new C52847n(Boolean.valueOf(z), Integer.valueOf(2))));
            C44321a.m97072a(this.f112197a, null, 1, null).mo59123a(this.f112197a.f112189b, (C48705j) new C44329a());
        }

        public C44328e(C44321a aVar, C0198r rVar) {
            this.f112197a = aVar;
            this.f112198b = rVar;
        }
    }

    /* renamed from: a */
    public static final C44321a m97073a() {
        return f112187e.mo90200a();
    }

    /* renamed from: a */
    public static boolean m97076a(boolean z, boolean z2) {
        return false;
    }

    /* renamed from: a */
    public static String m97074a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str).optString("map_to_live_sticker_id");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m97075a(EffectCategoryModel effectCategoryModel) {
        if (effectCategoryModel == null || TextUtils.isEmpty(effectCategoryModel.getExtra())) {
            return false;
        }
        try {
            return new JSONObject(effectCategoryModel.getExtra()).optBoolean("icon_random", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final Effect mo90199a(List<? extends Effect> list) {
        boolean z;
        if (C9979b.m20068a(list)) {
            return null;
        }
        long b = ((C39666o) C26888e.m65000a(C39629l.m88233b(), C39666o.class)).mo48453b(0);
        if (b == 0 || !C47685au.m103202a(b)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (list == null) {
            C52711k.m112234a();
        }
        for (Effect effect : list) {
            if (!TextUtils.isEmpty(effect.getExtra())) {
                try {
                    if (new JSONObject(effect.getExtra()).optBoolean("icon_insert", false)) {
                        ((C39666o) C26888e.m65000a(C39629l.m88233b(), C39666o.class)).mo48451a(System.currentTimeMillis());
                        return effect;
                    }
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ C29252f m97072a(C44321a aVar, Context context, int i, Object obj) {
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        Context context2 = b;
        if (aVar.f112188a == null) {
            aVar.f112188a = C29242c.m68869a(context2, null);
        }
        C29252f fVar = aVar.f112188a;
        if (fVar != null) {
            return fVar;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.IEffectPlatform");
    }
}
