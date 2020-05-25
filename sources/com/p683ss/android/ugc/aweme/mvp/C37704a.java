package com.p683ss.android.ugc.aweme.mvp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.C2756a;
import com.bytedance.als.C2757b;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.als.ext.C2761a;
import com.bytedance.als.ext.OCAdapterViewModel;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import com.bytedance.p780m.C12366c.C12369a;
import com.bytedance.p780m.C12372e;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.aweme.p2345t.C46776g;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43860b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.gamora.recorder.p2474h.C49822a;
import com.p683ss.android.ugc.gamora.recorder.p2474h.C49823b;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49862b;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.C50071e;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.RecordStickerPanelViewModel;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mvp.a */
public final class C37704a extends C12896b {

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$a */
    public static final class C37705a extends C12372e<C43859a> {

        /* renamed from: a */
        final /* synthetic */ Class f96114a;

        public C37705a(Class cls) {
            this.f96114a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f96114a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$b */
    public static final class C37706b extends C12372e<C49822a> {

        /* renamed from: a */
        final /* synthetic */ Class f96115a;

        public C37706b(Class cls) {
            this.f96115a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f96115a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$c */
    public static final class C37707c extends C12372e<C37723c> {
        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C37723c(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$d */
    public static final class C37708d extends C12372e<C37720b> {

        /* renamed from: a */
        final /* synthetic */ Class f96116a;

        public C37708d(Class cls) {
            this.f96116a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f96116a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$e */
    public static final class C37709e extends C12372e<C49860a> {

        /* renamed from: a */
        final /* synthetic */ Class f96117a;

        public C37709e(Class cls) {
            this.f96117a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f96117a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$f */
    public static final class C37710f extends C12372e<RecordStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ Class f96118a;

        public C37710f(Class cls) {
            this.f96118a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f96118a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$g */
    public static final class C37711g extends C12372e<C43860b> {
        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C43860b(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$h */
    public static final class C37712h extends C12372e<C46255p> {
        /* renamed from: a */
        public final C46255p mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            Object a = bVar.mo23372a(C45004a.class);
            C52711k.m112236a(a, "it.get(CameraApiComponent::class.java)");
            return C46776g.m101582a((C45004a) a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$i */
    public static final class C37713i extends C12372e<C49823b> {

        /* renamed from: a */
        final /* synthetic */ C37704a f96119a;

        public C37713i(C37704a aVar) {
            this.f96119a = aVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49823b(this.f96119a, bVar, R.id.akh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$j */
    public static final class C37714j extends C12372e<C49862b> {

        /* renamed from: a */
        final /* synthetic */ C37704a f96120a;

        public C37714j(C37704a aVar) {
            this.f96120a = aVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49862b(bVar, this.f96120a, R.id.erk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.a$k */
    public static final class C37715k extends C12372e<C50071e> {

        /* renamed from: a */
        final /* synthetic */ C37704a f96121a;

        public C37715k(C37704a aVar) {
            this.f96121a = aVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C50071e(bVar, this.f96121a, R.id.erk);
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        OCAdapterViewModel a = C2761a.m7860a((C12924i) this);
        C12366c cVar = a.f8323a;
        C52711k.m112236a((Object) cVar.mo23380a(C12896b.class, (String) null, this), "this.registerInstance(T:…ass.java, null, instance)");
        C52711k.m112236a((Object) cVar.mo23378a(C46255p.class, (String) null, (C12372e<T>) new C37712h<T>()), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        a.mo7346a();
        if (a.mo7347b() == null) {
            C52711k.m112234a();
        }
        C2757b bVar = new C2757b(C2756a.m7853a((C12896b) this));
        AlsLogicContainer alsLogicContainer = bVar.f8321a;
        Class<C49822a> cls = C49822a.class;
        Class<C49823b> cls2 = C49823b.class;
        alsLogicContainer.f8308c.mo23377a(cls2, (C12372e<T>) new C37713i<T>(this));
        C12369a a2 = alsLogicContainer.f8308c.mo23377a(cls, (C12372e<T>) new C37706b<T>(cls2));
        Class[] interfaces = cls.getInterfaces();
        C52711k.m112236a((Object) interfaces, "apiComponentClazz.interfaces");
        for (Class cls3 : interfaces) {
            if (!C52711k.m112239a((Object) cls3, (Object) C2759d.class)) {
                Class[] clsArr = new Class[1];
                if (cls3 != null) {
                    clsArr[0] = cls3;
                    a2.mo23383a(clsArr);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer.f8310e.add(cls2);
        AlsLogicContainer alsLogicContainer2 = bVar.f8321a;
        Class<C37720b> cls4 = C37720b.class;
        Class<C37723c> cls5 = C37723c.class;
        alsLogicContainer2.f8308c.mo23377a(cls5, (C12372e<T>) new C37707c<T>());
        C12369a a3 = alsLogicContainer2.f8308c.mo23377a(cls4, (C12372e<T>) new C37708d<T>(cls5));
        Class[] interfaces2 = cls4.getInterfaces();
        C52711k.m112236a((Object) interfaces2, "apiComponentClazz.interfaces");
        for (Class cls6 : interfaces2) {
            if (!C52711k.m112239a((Object) cls6, (Object) C2759d.class)) {
                Class[] clsArr2 = new Class[1];
                if (cls6 != null) {
                    clsArr2[0] = cls6;
                    a3.mo23383a(clsArr2);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer2.f8310e.add(cls5);
        AlsLogicContainer alsLogicContainer3 = bVar.f8321a;
        Class<C49860a> cls7 = C49860a.class;
        Class<C49862b> cls8 = C49862b.class;
        alsLogicContainer3.f8308c.mo23377a(cls8, (C12372e<T>) new C37714j<T>(this));
        C12369a a4 = alsLogicContainer3.f8308c.mo23377a(cls7, (C12372e<T>) new C37709e<T>(cls8));
        Class[] interfaces3 = cls7.getInterfaces();
        C52711k.m112236a((Object) interfaces3, "apiComponentClazz.interfaces");
        for (Class cls9 : interfaces3) {
            if (!C52711k.m112239a((Object) cls9, (Object) C2759d.class)) {
                Class[] clsArr3 = new Class[1];
                if (cls9 != null) {
                    clsArr3[0] = cls9;
                    a4.mo23383a(clsArr3);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer3.f8310e.add(cls8);
        AlsLogicContainer alsLogicContainer4 = bVar.f8321a;
        Class<RecordStickerPanelViewModel> cls10 = RecordStickerPanelViewModel.class;
        Class<C50071e> cls11 = C50071e.class;
        alsLogicContainer4.f8308c.mo23377a(cls11, (C12372e<T>) new C37715k<T>(this));
        C12369a a5 = alsLogicContainer4.f8308c.mo23377a(cls10, (C12372e<T>) new C37710f<T>(cls11));
        Class[] interfaces4 = cls10.getInterfaces();
        C52711k.m112236a((Object) interfaces4, "apiComponentClazz.interfaces");
        for (Class cls12 : interfaces4) {
            if (!C52711k.m112239a((Object) cls12, (Object) C2759d.class)) {
                Class[] clsArr4 = new Class[1];
                if (cls12 != null) {
                    clsArr4[0] = cls12;
                    a5.mo23383a(clsArr4);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer4.f8310e.add(cls11);
        AlsLogicContainer alsLogicContainer5 = bVar.f8321a;
        Class<C43859a> cls13 = C43859a.class;
        Class<C43860b> cls14 = C43860b.class;
        alsLogicContainer5.f8308c.mo23377a(cls14, (C12372e<T>) new C37711g<T>());
        C12369a a6 = alsLogicContainer5.f8308c.mo23377a(cls13, (C12372e<T>) new C37705a<T>(cls14));
        Class[] interfaces5 = cls13.getInterfaces();
        C52711k.m112236a((Object) interfaces5, "apiComponentClazz.interfaces");
        for (Class cls15 : interfaces5) {
            if (!C52711k.m112239a((Object) cls15, (Object) C2759d.class)) {
                Class[] clsArr5 = new Class[1];
                if (cls15 != null) {
                    clsArr5[0] = cls15;
                    a6.mo23383a(clsArr5);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer5.f8310e.add(cls14);
        bVar.mo7344a();
    }

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.brg, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
