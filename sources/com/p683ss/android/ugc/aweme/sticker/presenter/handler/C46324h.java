package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.google.gson.p1078c.C17958a;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29193c;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45098a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45101d;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45821a;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45829e;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45830f;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45831g;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45832h;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45841j;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46294c;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46313c;
import com.p683ss.android.ugc.aweme.sticker.presenter.p2308a.C46291c;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46564a;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46578b;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46579c;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46580d;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46581e;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a.C46567b;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a.C46568c;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a.C46573f;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.scanface.C46587a;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.scanface.C46588b;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.scanface.ScanFaceViewModel;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48709n;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h */
public final class C46324h implements C46256q, C46294c, C46340k, C46578b, C46579c, C46580d, C46587a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f116882a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46324h.class), "mHandler", "getMHandler()Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46324h.class), "mEffectPlatform", "getMEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/IEffectPlatform;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46324h.class), "scanFaceModule", "getScanFaceModule()Lcom/ss/android/ugc/aweme/sticker/types/mimoji/scanface/ScanFaceModule;"))};

    /* renamed from: o */
    public static final C46326a f116883o = new C46326a(null);

    /* renamed from: b */
    public final Map<String, List<StickerWrapper>> f116884b = new LinkedHashMap();

    /* renamed from: c */
    public String f116885c;

    /* renamed from: d */
    public boolean f116886d;

    /* renamed from: e */
    public List<StickerWrapper> f116887e = new ArrayList();

    /* renamed from: f */
    public Effect f116888f;

    /* renamed from: g */
    public int f116889g = -1;

    /* renamed from: h */
    public String f116890h = "add";

    /* renamed from: i */
    public StickerWrapper f116891i;

    /* renamed from: j */
    public final AppCompatActivity f116892j;

    /* renamed from: k */
    public final String f116893k;

    /* renamed from: l */
    public final List<StickerWrapper> f116894l;

    /* renamed from: m */
    public final FrameLayout f116895m;

    /* renamed from: n */
    public final C46291c f116896n;

    /* renamed from: p */
    private boolean f116897p;

    /* renamed from: q */
    private String[] f116898q;

    /* renamed from: r */
    private C46573f f116899r;

    /* renamed from: s */
    private StickerWrapper f116900s;

    /* renamed from: t */
    private final C52668f f116901t = C52732g.m112285a(new C46331f(this));

    /* renamed from: u */
    private final C52668f f116902u = C52732g.m112285a(new C46330e(this));

    /* renamed from: v */
    private final C52668f f116903v = C52732g.m112285a(new C46334i(this));

    /* renamed from: w */
    private final C46354l f116904w;

    /* renamed from: x */
    private final String f116905x;

    /* renamed from: y */
    private final C20489b f116906y;

    /* renamed from: z */
    private final C46313c f116907z;

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$a */
    public static final class C46326a {
        private C46326a() {
        }

        public /* synthetic */ C46326a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$b */
    public static final class C46327b extends C46568c {

        /* renamed from: a */
        final /* synthetic */ C46324h f116909a;

        /* renamed from: b */
        final /* synthetic */ C46564a f116910b;

        C46327b(C46324h hVar, C46564a aVar) {
            this.f116909a = hVar;
            this.f116910b = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo91738a(java.lang.String r3, java.util.List<com.p683ss.android.ugc.aweme.sticker.StickerWrapper> r4, com.p683ss.android.ugc.aweme.sticker.StickerWrapper r5, java.lang.Exception r6) {
            /*
                r2 = this;
                java.lang.String r4 = "id"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
                com.ss.android.ugc.aweme.sticker.presenter.handler.h r4 = r2.f116909a
                boolean r4 = r4.mo93063b()
                r0 = 0
                if (r4 != 0) goto L_0x0026
                com.ss.android.ugc.aweme.sticker.presenter.handler.h r4 = r2.f116909a
                java.lang.String r4 = r4.f116890h
                if (r5 == 0) goto L_0x001d
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r5.f115779a
                if (r1 == 0) goto L_0x001d
                java.lang.String r1 = r1.getEffectId()
                goto L_0x001e
            L_0x001d:
                r1 = r0
            L_0x001e:
                boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r1)
                if (r4 == 0) goto L_0x0026
                r4 = 1
                goto L_0x0027
            L_0x0026:
                r4 = 0
            L_0x0027:
                if (r5 == 0) goto L_0x002f
                com.ss.android.ugc.aweme.sticker.types.mimoji.a r6 = r2.f116910b
                r6.mo93366a(r3, r5, r4)
                goto L_0x0034
            L_0x002f:
                com.ss.android.ugc.aweme.sticker.types.mimoji.a r3 = r2.f116910b
                r3.mo93365a(r6)
            L_0x0034:
                com.ss.android.ugc.aweme.sticker.presenter.handler.h r3 = r2.f116909a
                r3.f116890h = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46324h.C46327b.mo91738a(java.lang.String, java.util.List, com.ss.android.ugc.aweme.sticker.StickerWrapper, java.lang.Exception):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$c */
    static final class C46328c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46324h f116911a;

        C46328c(C46324h hVar) {
            this.f116911a = hVar;
        }

        public final void run() {
            this.f116911a.f116896n.mo93009a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$d */
    static final class C46329d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C46324h f116912a;

        C46329d(C46324h hVar) {
            this.f116912a = hVar;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            for (Entry entry : C45841j.m99677b().entrySet()) {
                String str = (String) entry.getKey();
                List<String> list = (List) entry.getValue();
                CharSequence charSequence = this.f116912a.f116893k;
                boolean z2 = false;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && C52711k.m112239a((Object) str, (Object) this.f116912a.f116893k)) {
                    Collection collection = this.f116912a.f116894l;
                    if (collection == null || collection.isEmpty()) {
                        z2 = true;
                    }
                    if (!z2) {
                        this.f116912a.f116884b.put(str, this.f116912a.f116894l);
                    }
                }
                List arrayList = new ArrayList();
                for (String fileInputStream : list) {
                    try {
                        C17958a aVar = new C17958a(new InputStreamReader(new FileInputStream(fileInputStream)));
                        Effect effect = (Effect) C39629l.m88232a().mo58566D().mo34880a(aVar, (Type) Effect.class);
                        aVar.close();
                        if (effect != null) {
                            StickerWrapper a = StickerWrapper.m99610a(effect, null, null);
                            C52711k.m112236a((Object) a, "stickerWrapper");
                            a.f115781c = 1;
                            arrayList.add(a);
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f116912a.f116884b.put(str, arrayList);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$e */
    static final class C46330e extends C52712l implements C52670a<C29252f> {

        /* renamed from: a */
        final /* synthetic */ C46324h f116913a;

        C46330e(C46324h hVar) {
            this.f116913a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C29242c.m68869a(this.f116913a.f116892j, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$f */
    static final class C46331f extends C52712l implements C52670a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C46324h f116914a;

        C46331f(C46324h hVar) {
            this.f116914a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SafeHandler(this.f116914a.f116892j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$g */
    public static final class C46332g implements C48709n {

        /* renamed from: a */
        final /* synthetic */ C46324h f116915a;

        C46332g(C46324h hVar) {
            this.f116915a = hVar;
        }

        /* renamed from: a */
        public final void mo92994a(C48649d dVar) {
            C50275d.m108531a((Context) this.f116915a.f116892j, (int) R.string.akm, 0).mo98174a();
            this.f116915a.mo93064c().mo93382a(false, false);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Object obj2;
            ResourceListModel resourceListModel = (ResourceListModel) obj;
            if (resourceListModel != null) {
                C46324h hVar = this.f116915a;
                Effect effect = hVar.f116888f;
                String str = null;
                if (effect != null) {
                    obj2 = effect.getEffectId();
                } else {
                    obj2 = null;
                }
                if (!(!C52711k.m112239a(obj2, (Object) hVar.f116885c))) {
                    if (effect != null) {
                        str = effect.getId();
                    }
                    String str2 = str;
                    if (str2 == null) {
                        C52711k.m112234a();
                    }
                    String a = C45841j.m99670a(str2);
                    File file = new File(a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    List a2 = C46059g.m100062a(a, resourceListModel);
                    C29193c gVar = new C45831g();
                    C46335j jVar = new C46335j(hVar, resourceListModel, a2, a, str2, effect);
                    C45832h hVar2 = new C45832h(gVar, jVar, new C46336k());
                    C52711k.m112236a((Object) a2, "resourceBeans");
                    hVar2.mo92267a(a2);
                    hVar2.mo92265a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$h */
    public static final class C46333h implements C46567b {

        /* renamed from: a */
        final /* synthetic */ List f116916a;

        /* renamed from: b */
        final /* synthetic */ C46324h f116917b;

        /* renamed from: c */
        final /* synthetic */ FaceStickerBean f116918c;

        /* renamed from: d */
        final /* synthetic */ C48709n f116919d;

        /* renamed from: a */
        public final void mo91736a(C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            this.f116919d.mo92994a(null);
            this.f116917b.f116886d = false;
        }

        /* renamed from: a */
        public final void mo91739a(List<StickerWrapper> list, ResourceListModel resourceListModel) {
            C52711k.m112240b(list, "stickerWrapper");
            C52711k.m112240b(resourceListModel, "model");
            this.f116919d.mo8638a(resourceListModel);
            this.f116917b.f116886d = false;
        }

        /* renamed from: a */
        public final void mo91737a(String str, Effect effect, ResourceListModel resourceListModel) {
            C52711k.m112240b(str, "id");
            C52711k.m112240b(effect, "oldEffect");
            C52711k.m112240b(resourceListModel, "model");
            this.f116917b.f116889g = 0;
            String id = this.f116918c.getId();
            C52711k.m112236a((Object) id, "faceSticker.id");
            C46582f.m101117a(id, effect, this.f116916a, this.f116917b.f116889g, resourceListModel, (C46567b) this);
        }

        C46333h(List list, C46324h hVar, FaceStickerBean faceStickerBean, C48709n nVar) {
            this.f116916a = list;
            this.f116917b = hVar;
            this.f116918c = faceStickerBean;
            this.f116919d = nVar;
        }

        /* renamed from: a */
        public final void mo91738a(String str, List<StickerWrapper> list, StickerWrapper stickerWrapper, Exception exc) {
            C52711k.m112240b(str, "id");
            this.f116919d.mo8638a(null);
            this.f116917b.f116886d = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$i */
    static final class C46334i extends C52712l implements C52670a<C46588b> {

        /* renamed from: a */
        final /* synthetic */ C46324h f116920a;

        C46334i(C46324h hVar) {
            this.f116920a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46588b(this.f116920a.f116892j, this.f116920a.f116895m, this.f116920a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$j */
    public static final class C46335j implements C45829e<C45830f, Void> {

        /* renamed from: a */
        public long f116921a;

        /* renamed from: b */
        final /* synthetic */ C46324h f116922b;

        /* renamed from: c */
        final /* synthetic */ ResourceListModel f116923c;

        /* renamed from: d */
        final /* synthetic */ List f116924d;

        /* renamed from: e */
        final /* synthetic */ String f116925e;

        /* renamed from: f */
        final /* synthetic */ String f116926f;

        /* renamed from: g */
        final /* synthetic */ Effect f116927g;

        /* renamed from: a */
        public final /* synthetic */ void mo92263a(Object obj) {
            Object obj2;
            int i;
            String str;
            Effect effect = this.f116922b.f116888f;
            if (effect != null) {
                obj2 = effect.getEffectId();
            } else {
                obj2 = null;
            }
            if (!(!C52711k.m112239a(obj2, (Object) this.f116922b.f116885c))) {
                ResourceListModel resourceListModel = this.f116923c;
                List list = this.f116924d;
                C52711k.m112236a((Object) list, "resourceBeans");
                C52711k.m112240b(resourceListModel, "model");
                C52711k.m112240b(list, "resourceList");
                Effect effect2 = new Effect();
                UUID randomUUID = UUID.randomUUID();
                effect2.setEffectId(randomUUID.toString());
                effect2.setId(randomUUID.toString());
                effect2.setExtra(resourceListModel.getParam());
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(C46059g.m100063a(resourceListModel.getIconUri(), resourceListModel.getUrlPrefix()));
                effect2.setIconUrl(urlModel);
                effect2.setComposerPath(C45841j.m99671a(list));
                effect2.setResourceId(C39629l.m88232a().mo58566D().mo34889b(resourceListModel));
                this.f116922b.f116891i = StickerWrapper.m99611a(effect2, true);
                if (this.f116922b.f116889g != -1) {
                    C45841j.m99672a(this.f116922b.f116889g, this.f116922b.f116891i, this.f116922b.f116887e, this.f116925e);
                } else {
                    List<StickerWrapper> list2 = this.f116922b.f116887e;
                    StickerWrapper stickerWrapper = this.f116922b.f116891i;
                    if (stickerWrapper == null) {
                        C52711k.m112234a();
                    }
                    list2.add(stickerWrapper);
                }
                C45841j.m99675a(this.f116926f, this.f116925e, this.f116922b.f116887e, this.f116922b.f116891i);
                this.f116922b.f116884b.put(this.f116926f, this.f116922b.f116887e);
                C46324h hVar = this.f116922b;
                StickerWrapper stickerWrapper2 = this.f116922b.f116891i;
                if (stickerWrapper2 == null) {
                    C52711k.m112234a();
                }
                hVar.mo93062b(stickerWrapper2);
                ((ScanFaceViewModel) C0214z.m440a((FragmentActivity) this.f116922b.f116892j).mo359a(ScanFaceViewModel.class)).mo93380a().postValue(new Pair(Integer.valueOf(16), null));
                C46324h hVar2 = this.f116922b;
                Effect effect3 = this.f116927g;
                long j = this.f116921a;
                if (hVar2.f116889g == -1) {
                    i = hVar2.f116887e.size() - 1;
                    str = "add";
                } else {
                    i = hVar2.f116889g;
                    str = "modify";
                }
                String str2 = str;
                String id = effect3.getId();
                C52711k.m112236a((Object) id, "faceStickerBean.id");
                if (i < 0) {
                    i = 0;
                }
                C46581e.m101111a(id, effect2, str2, Integer.valueOf(i), j);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo92264a(Object obj, Integer num, String str, Exception exc) {
            int i;
            String str2;
            Effect effect;
            C45830f fVar = (C45830f) obj;
            C52711k.m112240b(fVar, "param");
            int i2 = 0;
            C50275d.m108531a((Context) this.f116922b.f116892j, (int) R.string.akm, 0).mo98174a();
            this.f116922b.mo93064c().mo93382a(false, false);
            C46581e.m101110a(fVar, num, str);
            C46324h hVar = this.f116922b;
            Effect effect2 = this.f116927g;
            if (num == null) {
                C52711k.m112234a();
            }
            int intValue = num.intValue();
            if (str == null) {
                C52711k.m112234a();
            }
            if (hVar.f116889g == -1) {
                i = hVar.f116887e.size() - 1;
                str2 = "add";
            } else {
                i = hVar.f116889g;
                str2 = "modify";
            }
            String str3 = str2;
            StickerWrapper stickerWrapper = hVar.f116891i;
            if (stickerWrapper != null) {
                effect = stickerWrapper.f115779a;
            } else {
                effect = null;
            }
            Effect effect3 = effect;
            String id = effect2.getId();
            C52711k.m112236a((Object) id, "faceStickerBean.id");
            if (i >= 0) {
                i2 = i;
            }
            C46581e.m101112a(id, effect3, str3, Integer.valueOf(i2), Integer.valueOf(intValue), str);
        }

        C46335j(C46324h hVar, ResourceListModel resourceListModel, List list, String str, String str2, Effect effect) {
            this.f116922b = hVar;
            this.f116923c = resourceListModel;
            this.f116924d = list;
            this.f116925e = str;
            this.f116926f = str2;
            this.f116927g = effect;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$k */
    public static final class C46336k extends C45821a<C45830f, Void> {
        C46336k() {
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

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.h$l */
    static final class C46337l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46324h f116928a;

        C46337l(C46324h hVar) {
            this.f116928a = hVar;
        }

        public final void run() {
            Effect effect = this.f116928a.f116888f;
            if (effect != null) {
                this.f116928a.f116896n.mo93010a(effect, false);
            }
        }
    }

    /* renamed from: e */
    private final SafeHandler m100639e() {
        return (SafeHandler) this.f116901t.getValue();
    }

    /* renamed from: f */
    private final C29252f m100640f() {
        return (C29252f) this.f116902u.getValue();
    }

    /* renamed from: b */
    public final void mo92781b(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
    }

    /* renamed from: c */
    public final C46588b mo93064c() {
        return (C46588b) this.f116903v.getValue();
    }

    public final void cl_() {
    }

    /* renamed from: a */
    public final void mo92780a(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
        if (this.f116888f != null) {
            C46573f fVar = this.f116899r;
            if (fVar != null && !fVar.mo92899b() && !this.f116897p && (!this.f116887e.isEmpty())) {
                C46573f fVar2 = this.f116899r;
                if (fVar2 != null) {
                    fVar2.mo92900c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo93060a(String str) {
        C52711k.m112240b(str, "faceId");
        m100640f().mo59128a(str, (C48709n) new C46332g(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r8 == null) goto L_0x007c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93061a(boolean r8, boolean r9) {
        /*
            r7 = this;
            r0 = 0
            r7.f116897p = r0
            if (r9 != 0) goto L_0x00bb
            com.ss.android.ugc.effectmanager.effect.model.Effect r9 = r7.f116888f
            r0 = 0
            if (r9 == 0) goto L_0x000f
            java.lang.String r9 = r9.getEffectId()
            goto L_0x0010
        L_0x000f:
            r9 = r0
        L_0x0010:
            java.lang.String r1 = r7.f116885c
            boolean r9 = p2628d.p2639f.p2641b.C52711k.m112239a(r9, r1)
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x001c
            goto L_0x00bb
        L_0x001c:
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r9 = r7.m100639e()
            com.ss.android.ugc.aweme.sticker.presenter.handler.h$c r1 = new com.ss.android.ugc.aweme.sticker.presenter.handler.h$c
            r1.<init>(r7)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r9.post(r1)
            r9 = -1
            if (r8 == 0) goto L_0x0082
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r7.f116888f
            if (r2 == 0) goto L_0x0082
            android.support.v7.app.AppCompatActivity r8 = r7.f116892j
            android.support.v4.app.FragmentActivity r8 = (android.support.p030v4.app.FragmentActivity) r8
            android.arch.lifecycle.y r8 = android.arch.lifecycle.C0214z.m440a(r8)
            java.lang.Class<com.ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel> r1 = com.p683ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel.class
            android.arch.lifecycle.x r8 = r8.mo359a(r1)
            com.ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel r8 = (com.p683ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel) r8
            java.lang.String r1 = r2.getPanel()
            android.arch.lifecycle.r r8 = r8.mo93421b(r1)
            com.ss.android.ugc.aweme.sticker.presenter.handler.b.c r1 = r7.f116907z
            java.lang.String r3 = "curTab"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r3)
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x005a
            java.lang.String r8 = ""
        L_0x005a:
            r3 = r8
            java.lang.String r4 = "click_banner"
            int r8 = r7.f116889g
            if (r8 != r9) goto L_0x006b
            java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper> r8 = r7.f116887e
            int r8 = r8.size()
            int r8 = r8 + -1
        L_0x0069:
            r5 = r8
            goto L_0x006e
        L_0x006b:
            int r8 = r7.f116889g
            goto L_0x0069
        L_0x006e:
            com.ss.android.ugc.aweme.sticker.StickerWrapper r8 = r7.f116891i
            if (r8 == 0) goto L_0x007c
            com.ss.android.ugc.effectmanager.effect.model.Effect r8 = r8.f115779a
            if (r8 == 0) goto L_0x007c
            java.lang.String r8 = r8.getExtra()
            if (r8 != 0) goto L_0x007e
        L_0x007c:
            java.lang.String r8 = ""
        L_0x007e:
            r6 = r8
            r1.mo93043a(r2, r3, r4, r5, r6)
        L_0x0082:
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper>> r8 = r7.f116884b
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r7.f116888f
            if (r1 == 0) goto L_0x008c
            java.lang.String r0 = r1.getId()
        L_0x008c:
            java.lang.Object r8 = r8.get(r0)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L_0x009b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r8 = (java.util.List) r8
        L_0x009b:
            r7.f116887e = r8
            java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper> r8 = r7.f116887e
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00a6
            return
        L_0x00a6:
            java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper> r8 = r7.f116887e
            int r0 = r7.f116889g
            if (r0 != r9) goto L_0x00b5
            java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper> r9 = r7.f116887e
            int r9 = r9.size()
            int r9 = r9 + -1
            goto L_0x00b7
        L_0x00b5:
            int r9 = r7.f116889g
        L_0x00b7:
            r7.m100638a(r8, r9)
            return
        L_0x00bb:
            com.ss.android.ugc.aweme.sticker.types.mimoji.a.f r8 = r7.f116899r
            if (r8 == 0) goto L_0x00c3
            r8.mo93371a()
            return
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46324h.mo93061a(boolean, boolean):void");
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    private final void onDestroy() {
        C1690c cVar = mo93064c().f117537b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: d */
    public final void mo93065d() {
        this.f116889g = -1;
        this.f116890h = "add";
        m100641g();
    }

    /* renamed from: h */
    private final void m100642h() {
        if (this.f116898q != null) {
            this.f116906y.mo43518e().mo43550a(20000).mo43557a();
            this.f116898q = null;
        }
    }

    /* renamed from: b */
    public final boolean mo93063b() {
        if (C52711k.m112239a((Object) "modify", (Object) this.f116890h) || C52711k.m112239a((Object) "add", (Object) this.f116890h)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private final void m100641g() {
        this.f116897p = true;
        m100642h();
        m100639e().post(new C46337l(this));
        C46573f fVar = this.f116899r;
        if (fVar != null) {
            fVar.mo93371a();
        }
        mo93064c().mo93381a();
    }

    /* renamed from: a */
    public final void mo93056a(int i) {
        this.f116889g = i;
        this.f116890h = "modify";
        m100641g();
    }

    /* renamed from: a */
    private final void m100637a(List<ComposerInfo> list) {
        if (!list.isEmpty()) {
            Iterable<ComposerInfo> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (ComposerInfo composerInfo : iterable) {
                arrayList.add(composerInfo.f56151a);
            }
            Object[] array = ((List) arrayList).toArray(new String[0]);
            if (array != null) {
                this.f116898q = (String[]) array;
                this.f116906y.mo43518e().mo43550a(20000).mo43556a(list, 20000).mo43557a();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        if (r3 == null) goto L_0x009b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93062b(com.p683ss.android.ugc.aweme.sticker.StickerWrapper r10) {
        /*
            r9 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r10.f115779a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r1 = r9.mo93063b()
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r9.f116890h
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = r9.f116890h
            java.lang.String r2 = r0.getEffectId()
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x001e
            return
        L_0x001e:
            r9.f116900s = r10
            java.util.List r10 = r0.getComposerPath()
            if (r10 == 0) goto L_0x005f
            java.util.Iterator r10 = r10.iterator()
        L_0x002a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r10.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "memoji: current Effect composer Path"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r2)
            boolean r2 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r1)
            if (r2 != 0) goto L_0x002a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "memoji: current path not exist: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.p683ss.android.ugc.tools.utils.C50203g.m108361b(r1)
            goto L_0x002a
        L_0x005f:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r9.f116888f
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r2 = com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean.NONE
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00a9
            java.util.List r1 = r0.getComposerPath()
            if (r1 == 0) goto L_0x00a9
            java.util.Iterator r1 = r1.iterator()
        L_0x007a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo r2 = new com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo
            java.lang.String r3 = "path"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r3)
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r9.f116888f
            if (r3 == 0) goto L_0x009b
            java.lang.String r3 = r3.getExtra()
            if (r3 != 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r5 = r3
            goto L_0x009e
        L_0x009b:
            java.lang.String r3 = ""
            goto L_0x0099
        L_0x009e:
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r10.add(r2)
            goto L_0x007a
        L_0x00a9:
            java.util.List r10 = (java.util.List) r10
            r9.m100637a(r10)
            java.lang.String r10 = r0.getExtra()
            if (r10 != 0) goto L_0x00b6
            java.lang.String r10 = ""
        L_0x00b6:
            com.ss.android.ugc.asve.recorder.effect.b r0 = r9.f116906y
            java.lang.String r1 = "MemojiMatchScanResult"
            r0.mo43472a(r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46324h.mo93062b(com.ss.android.ugc.aweme.sticker.StickerWrapper):void");
    }

    /* renamed from: a */
    public final void mo92779a(View view) {
        C52711k.m112240b(view, "stickerView");
        if (this.f116899r == null) {
            C46573f fVar = new C46573f(this.f116892j, this.f116907z, this.f116904w, this.f116905x, view, this, this);
            this.f116899r = fVar;
        }
    }

    /* renamed from: a */
    public final void mo93057a(StickerWrapper stickerWrapper) {
        C52711k.m112240b(stickerWrapper, "stickerWrapper");
        mo93062b(stickerWrapper);
    }

    /* renamed from: a */
    private final void m100638a(List<? extends StickerWrapper> list, int i) {
        C46573f fVar = this.f116899r;
        if (fVar != null) {
            if (list != null) {
                fVar.mo93373a(list);
            }
            fVar.mo93372a(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r12 == null) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b mo93033a(com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c r12, com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k.C46341a r13) {
        /*
            r11 = this;
            java.lang.String r0 = "session"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = "chain"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008f
            r3 = r12
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.a r3 = (com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a) r3
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.f116852a
            boolean r0 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100092p(r0)
            if (r0 == 0) goto L_0x008f
            com.ss.android.ugc.effectmanager.effect.model.Effect r12 = r3.f116852a
            r11.f116888f = r12
            com.ss.android.ugc.effectmanager.effect.model.Effect r12 = r11.f116888f
            if (r12 == 0) goto L_0x0029
            java.lang.String r12 = r12.getEffectId()
            if (r12 != 0) goto L_0x002b
        L_0x0029:
            java.lang.String r12 = ""
        L_0x002b:
            r11.f116885c = r12
            r12 = -1
            r11.f116889g = r12
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper>> r0 = r11.f116884b
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r3.f116852a
            java.lang.String r4 = r4.getId()
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0047
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x0047:
            r11.f116887e = r0
            java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper> r0 = r11.f116887e
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0081
            java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper> r0 = r11.f116887e
            com.ss.android.ugc.aweme.sticker.StickerWrapper r1 = r11.f116900s
            int r0 = p2628d.p2629a.C52575l.m112114a(r0, r1)
            if (r0 != r12) goto L_0x005f
            r0 = 0
        L_0x005f:
            com.ss.android.ugc.aweme.sticker.presenter.a.c r12 = r11.f116896n
            r12.mo93009a()
            java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper> r12 = r11.f116887e
            r11.m100638a(r12, r0)
            java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper> r12 = r11.f116887e
            java.lang.Object r12 = r12.get(r0)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r12 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r12
            r11.mo93062b(r12)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 23
            r10 = 0
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.a r3 = com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a.m100611a(r3.f116852a, r3.f116853b, r3.f116854c, true, r3.f116856e)
            goto L_0x0088
        L_0x0081:
            com.ss.android.ugc.aweme.sticker.types.mimoji.scanface.b r12 = r11.mo93064c()
            r12.mo93381a()
        L_0x0088:
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.c r3 = (com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c) r3
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.b r12 = r13.mo93036a(r3)
            return r12
        L_0x008f:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r11.f116888f
            if (r0 == 0) goto L_0x00a9
            r0 = 0
            r11.f116888f = r0
            r11.f116900s = r0
            com.ss.android.ugc.aweme.sticker.types.mimoji.scanface.b r0 = r11.mo93064c()
            r0.mo93382a(r2, r1)
            com.ss.android.ugc.aweme.sticker.types.mimoji.a.f r0 = r11.f116899r
            if (r0 == 0) goto L_0x00a6
            r0.mo93371a()
        L_0x00a6:
            r11.m100642h()
        L_0x00a9:
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.b r12 = r13.mo93036a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46324h.mo93033a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.c, com.ss.android.ugc.aweme.sticker.presenter.handler.k$a):com.ss.android.ugc.aweme.sticker.presenter.handler.c.b");
    }

    /* renamed from: a */
    public final void mo93059a(FaceStickerBean faceStickerBean, C48709n nVar) {
        C52711k.m112240b(faceStickerBean, "faceSticker");
        C52711k.m112240b(nVar, "iFetchResourceListener");
        List list = (List) this.f116884b.get(faceStickerBean.getId());
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                if (!this.f116886d) {
                    C46333h hVar = new C46333h(list, this, faceStickerBean, nVar);
                    this.f116886d = true;
                    C46582f.m101114a();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C29252f f = m100640f();
                        String id = faceStickerBean.getId();
                        C52711k.m112236a((Object) id, "faceSticker.id");
                        C46582f.m101115a(f, id, (StickerWrapper) list.get(i), i, list, (C46567b) hVar);
                    }
                    return;
                }
                return;
            }
        }
        nVar.mo92994a(null);
    }

    /* renamed from: a */
    public final void mo93021a(int i, int i2, int i3, String str) {
        if (i == 8192) {
            ((ScanFaceViewModel) C0214z.m440a((FragmentActivity) this.f116892j).mo359a(ScanFaceViewModel.class)).mo93380a().postValue(new Pair(Integer.valueOf(i2), str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r0 == null) goto L_0x002b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93058a(com.p683ss.android.ugc.aweme.sticker.StickerWrapper r8, com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel r9, int r10, com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46564a r11) {
        /*
            r7 = this;
            java.lang.String r0 = "stickerWrapper"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "listener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            r7.f116889g = r10
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r8.f115779a
            java.lang.String r1 = "stickerWrapper.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r0 = r0.getEffectId()
            r7.f116890h = r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r7.f116888f
            if (r0 != 0) goto L_0x001e
            return
        L_0x001e:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r7.f116888f
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r0.getId()
            if (r0 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r1 = r0
            goto L_0x002e
        L_0x002b:
            java.lang.String r0 = ""
            goto L_0x0029
        L_0x002e:
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r8.f115779a
            java.util.List<com.ss.android.ugc.aweme.sticker.StickerWrapper> r3 = r7.f116887e
            com.ss.android.ugc.aweme.sticker.presenter.handler.h$b r8 = new com.ss.android.ugc.aweme.sticker.presenter.handler.h$b
            r8.<init>(r7, r11)
            r6 = r8
            com.ss.android.ugc.aweme.sticker.types.mimoji.a.b r6 = (com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a.C46567b) r6
            r4 = r10
            r5 = r9
            com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f.m101117a(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46324h.mo93058a(com.ss.android.ugc.aweme.sticker.StickerWrapper, com.ss.android.ugc.effectmanager.effect.model.ResourceListModel, int, com.ss.android.ugc.aweme.sticker.types.mimoji.a):void");
    }

    public C46324h(AppCompatActivity appCompatActivity, C46354l lVar, String str, String str2, List<StickerWrapper> list, FrameLayout frameLayout, C20489b bVar, C46291c cVar, C46313c cVar2) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(frameLayout, "containerView");
        C52711k.m112240b(bVar, "effectController");
        C52711k.m112240b(cVar, "stickerLoader");
        C52711k.m112240b(cVar2, "mobHelper");
        this.f116892j = appCompatActivity;
        this.f116904w = lVar;
        this.f116905x = str;
        this.f116893k = str2;
        this.f116894l = list;
        this.f116895m = frameLayout;
        this.f116906y = bVar;
        this.f116896n = cVar;
        this.f116907z = cVar2;
        C45101d.m98616a((C45098a) new C45098a(this) {

            /* renamed from: a */
            final /* synthetic */ C46324h f116908a;

            /* renamed from: a */
            public final void mo91293a() {
                C0013i.m16a((Callable<TResult>) new C46329d<TResult>(this.f116908a));
            }

            {
                this.f116908a = r1;
            }
        });
    }
}
