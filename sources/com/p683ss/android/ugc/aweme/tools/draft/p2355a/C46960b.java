package com.p683ss.android.ugc.aweme.tools.draft.p2355a;

import android.app.Application;
import android.arch.lifecycle.C0184k;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.effect.p1676e.C29176a;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29189a;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29194d;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C43854fw;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlinx.coroutines.C53199ae;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52635g;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52614b;
import p2628d.p2631c.p2633b.p2634a.C52620h;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.a.b */
public final class C46960b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f118652a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46960b.class), "effectPlatform", "getEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/IEffectPlatform;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46960b.class), "downloadScheduler", "getDownloadScheduler()Lcom/ss/android/ugc/aweme/effect/persistence/PrioritySerialTaskScheduler;"))};

    /* renamed from: c */
    public static final C46961a f118653c = new C46961a(null);

    /* renamed from: b */
    public final C53199ae f118654b;

    /* renamed from: d */
    private final C52668f f118655d;

    /* renamed from: e */
    private final C52668f f118656e = C52732g.m112285a(C46963c.f118662a);

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a.b$a */
    public static final class C46961a {
        private C46961a() {
        }

        /* renamed from: a */
        public static boolean m102012a() {
            if (C39618d.f101152P.mo83104b(C40790a.EffectSDKInfoStickerUseAmazing) == 1) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C46961a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a.b$b */
    public static final class C46962b implements C29189a<Effect, Void> {

        /* renamed from: a */
        final /* synthetic */ HashMap f118657a;

        /* renamed from: b */
        final /* synthetic */ C52625c f118658b;

        /* renamed from: c */
        final /* synthetic */ C46960b f118659c;

        /* renamed from: d */
        final /* synthetic */ C52847n f118660d;

        /* renamed from: e */
        final /* synthetic */ boolean f118661e;

        /* renamed from: a */
        public final /* synthetic */ void mo59076a(Object obj) {
            C52711k.m112240b((Effect) obj, "param");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo59078a(Object obj, Object obj2) {
            Effect effect = (Effect) obj;
            Void voidR = (Void) obj2;
            C52711k.m112240b(effect, "param");
            this.f118657a.put(effect, Boolean.valueOf(true));
            Map map = this.f118657a;
            Map linkedHashMap = new LinkedHashMap();
            for (Entry entry : map.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                this.f118658b.resumeWith(C52848o.m114620constructorimpl(C52856t.m112465a(this.f118660d.getFirst(), Boolean.valueOf(true))));
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo59077a(Object obj, Integer num, String str, Exception exc) {
            C52711k.m112240b((Effect) obj, "param");
            this.f118658b.resumeWith(C52848o.m114620constructorimpl(C52856t.m112465a(this.f118660d.getFirst(), Boolean.valueOf(false))));
        }

        C46962b(HashMap hashMap, C52625c cVar, C46960b bVar, C52847n nVar, boolean z) {
            this.f118657a = hashMap;
            this.f118658b = cVar;
            this.f118659c = bVar;
            this.f118660d = nVar;
            this.f118661e = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a.b$c */
    static final class C46963c extends C52712l implements C52670a<C29176a<Effect, Void>> {

        /* renamed from: a */
        public static final C46963c f118662a = new C46963c();

        C46963c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C29176a aVar = new C29176a(3, new C46959a());
            aVar.f76456b = 0;
            aVar.f76458d = true;
            aVar.f76457c = true;
            aVar.f76459e = new C29194d() {
                /* renamed from: a */
                public final void mo59088a(Exception exc) {
                    C52711k.m112240b(exc, "exception");
                    C45407ay.m98969a((Throwable) exc);
                }
            };
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a.b$d */
    static final class C46965d extends C52712l implements C52670a<C29252f> {

        /* renamed from: a */
        final /* synthetic */ C0184k f118663a;

        C46965d(C0184k kVar) {
            this.f118663a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Application b = C39629l.m88233b();
            C52711k.m112236a((Object) b, "CameraClient.getApplication()");
            C29252f a = C29242c.m68869a(b, null);
            a.mo59122a(this.f118663a);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a.b$e */
    public static final class C46966e implements C48704i {

        /* renamed from: a */
        final /* synthetic */ List f118664a;

        /* renamed from: b */
        final /* synthetic */ C52625c f118665b;

        /* renamed from: c */
        final /* synthetic */ C46960b f118666c;

        /* renamed from: d */
        final /* synthetic */ Map f118667d;

        /* renamed from: com.ss.android.ugc.aweme.tools.draft.a.b$e$1 */
        static final class C469671 extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

            /* renamed from: a */
            int f118668a;

            /* renamed from: b */
            final /* synthetic */ C46966e f118669b;

            /* renamed from: d */
            private C53199ae f118671d;

            {
                this.f118669b = r1;
            }

            public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
                C52711k.m112240b(cVar, "completion");
                C469671 r0 = new C469671(this.f118669b, list, cVar);
                r0.f118671d = (C53199ae) obj;
                return r0;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C469671) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
            }

            public final Object invokeSuspend(Object obj) {
                if (this.f118668a == 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Effect effect : list) {
                        for (Entry entry : this.f118669b.f118667d.entrySet()) {
                            Iterable<StickerItemModel> iterable = (Iterable) entry.getValue();
                            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                            for (StickerItemModel stickerItemModel : iterable) {
                                arrayList.add(stickerItemModel.stickerId);
                            }
                            if (((List) arrayList).contains(effect.getEffectId())) {
                                List list = (List) linkedHashMap.get(entry.getKey());
                                if (list == null) {
                                    list = new ArrayList();
                                    linkedHashMap.put(entry.getKey(), list);
                                }
                                list.add(effect);
                            }
                        }
                    }
                    this.f118669b.f118665b.resumeWith(C52848o.m114620constructorimpl(linkedHashMap));
                    return C52860x.f131107a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            final List list = (List) obj;
            C52711k.m112240b(list, "effectList");
            C53301g.m113291a(this.f118666c.f118654b, null, null, new C469671(this, null), 3, null);
        }

        /* renamed from: a */
        public final void mo77143a(C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            StringBuilder sb = new StringBuilder("DraftBoxFragment : updateEffect , effectIdList --- : ");
            sb.append(this.f118664a);
            C45407ay.m98971b(sb.toString());
            C52625c cVar = this.f118665b;
            Exception exc = dVar.f122281c;
            C52711k.m112236a((Object) exc, "e.exception");
            cVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(exc)));
        }

        C46966e(List list, C52625c cVar, C46960b bVar, Map map) {
            this.f118664a = list;
            this.f118665b = cVar;
            this.f118666c = bVar;
            this.f118667d = map;
        }
    }

    /* renamed from: a */
    private C29252f m102007a() {
        return (C29252f) this.f118655d.getValue();
    }

    /* renamed from: b */
    private C29176a<Effect, Void> m102009b() {
        return (C29176a) this.f118656e.getValue();
    }

    public C46960b(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        new C43854fw();
        C39618d.m88210a(C43854fw.m96287a());
        this.f118655d = C52732g.m112285a(new C46965d(kVar));
        m102009b().mo59066b();
        this.f118654b = C46968c.m102019a();
    }

    /* renamed from: a */
    public static boolean m102008a(Effect effect) {
        File file = new File(effect.getUnzipPath());
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            C52711k.m112236a((Object) listFiles, "listFiles()");
            for (File file2 : listFiles) {
                CharSequence charSequence = FilterModel.CONFIG_FILE;
                C52711k.m112236a((Object) file2, "it");
                if (TextUtils.equals(charSequence, file2.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Object mo94266a(Map<C29059c, ? extends List<? extends StickerItemModel>> map, C52625c<? super Map<C29059c, ? extends List<? extends Effect>>> cVar) {
        C52635g gVar = new C52635g(C52601b.m112154a(cVar));
        C52625c cVar2 = gVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (List addAll : map.values()) {
            linkedHashSet.addAll(addAll);
        }
        Iterable<StickerItemModel> iterable = linkedHashSet;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (StickerItemModel stickerItemModel : iterable) {
            arrayList.add(stickerItemModel.stickerId);
        }
        List list = (List) arrayList;
        m102007a().mo59141a(list, null, false, (C48704i) new C46966e(list, cVar2, this, map));
        Object a = gVar.mo110263a();
        if (a == C52601b.m112157a()) {
            C52620h.m112171b(cVar);
        }
        return a;
    }

    /* renamed from: a */
    public final Object mo94265a(C52847n<? extends C29059c, ? extends List<? extends Effect>> nVar, boolean z, C52625c<? super C52847n<? extends C29059c, Boolean>> cVar) {
        C52635g gVar = new C52635g(C52601b.m112154a(cVar));
        C52625c cVar2 = gVar;
        HashMap hashMap = new HashMap();
        C46962b bVar = new C46962b(hashMap, cVar2, this, nVar, z);
        for (Effect put : (Iterable) nVar.getSecond()) {
            hashMap.put(put, C52614b.m112161a(false));
        }
        for (Effect effect : (Iterable) nVar.getSecond()) {
            if (z) {
                m102009b().mo59069b(effect, null);
                m102009b().m68708a(effect, bVar, null);
            } else {
                m102009b().mo59064a(effect, bVar);
            }
        }
        Object a = gVar.mo110263a();
        if (a == C52601b.m112157a()) {
            C52620h.m112171b(cVar);
        }
        return a;
    }
}
