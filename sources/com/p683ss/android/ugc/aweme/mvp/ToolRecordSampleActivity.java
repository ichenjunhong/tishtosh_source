package com.p683ss.android.ugc.aweme.mvp;

import android.app.Activity;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.C2756a;
import com.bytedance.als.C2757b;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2767k;
import com.bytedance.als.ext.C2761a;
import com.bytedance.als.ext.OCAdapterViewModel;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import com.bytedance.p780m.C12366c.C12369a;
import com.bytedance.p780m.C12366c.C12370b;
import com.bytedance.p780m.C12372e;
import com.bytedance.scene.C12921h;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12930k;
import com.bytedance.scene.C12935m;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23524d;
import com.p683ss.android.ugc.aweme.p2345t.C46776g;
import com.p683ss.android.ugc.aweme.shortvideo.C43309ec;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42453c;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43878g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b;
import com.p683ss.android.ugc.aweme.sticker.C45805a;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45887a;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49685c;
import com.p683ss.android.ugc.gamora.recorder.filter.p2472c.C49717b;
import com.p683ss.android.ugc.gamora.recorder.filter.p2472c.C49718c;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50012k;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity */
public final class ToolRecordSampleActivity extends AppCompatActivity implements C23441t {

    /* renamed from: a */
    C12935m f96100a;

    /* renamed from: b */
    private final List<C23423b> f96101b = new ArrayList();

    /* renamed from: c */
    private final List<C23422a> f96102c = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$a */
    public static final class C37687a extends C12372e<C45017b> {
        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C45017b(bVar, C37701o.f96111a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$b */
    public static final class C37688b extends C12372e<C50048n> {

        /* renamed from: a */
        final /* synthetic */ Class f96103a;

        public C37688b(Class cls) {
            this.f96103a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f96103a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$c */
    public static final class C37689c extends C12372e<C45004a> {

        /* renamed from: a */
        final /* synthetic */ Class f96104a;

        public C37689c(Class cls) {
            this.f96104a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f96104a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$d */
    public static final class C37690d extends C12372e<C49685c> {
        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49685c(bVar, (AppCompatActivity) bVar.mo23373a(AppCompatActivity.class, (String) null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$e */
    public static final class C37691e extends C12372e<C49683a> {

        /* renamed from: a */
        final /* synthetic */ Class f96105a;

        public C37691e(Class cls) {
            this.f96105a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f96105a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$f */
    public static final class C37692f extends C12372e<C49718c> {
        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49718c(bVar, C37702p.f96112a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$g */
    public static final class C37693g extends C12372e<C49717b> {

        /* renamed from: a */
        final /* synthetic */ Class f96106a;

        public C37693g(Class cls) {
            this.f96106a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f96106a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$h */
    public static final class C37694h extends C12372e<C42453c> {
        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C42453c(bVar, C43878g.m96385a(), false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$i */
    public static final class C37695i extends C12372e<C42451a> {

        /* renamed from: a */
        final /* synthetic */ Class f96107a;

        public C37695i(Class cls) {
            this.f96107a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f96107a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$j */
    public static final class C37696j extends C12372e<C50012k> {
        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            C50012k kVar = new C50012k(bVar, null, null, null, 14, null);
            return kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$k */
    public static final class C37697k extends C12372e<C45805a> {
        /* renamed from: a */
        public final C45805a mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return C46776g.m101581a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$l */
    static final class C37698l implements C12930k {

        /* renamed from: a */
        final /* synthetic */ C37704a f96108a;

        C37698l(C37704a aVar) {
            this.f96108a = aVar;
        }

        /* renamed from: a */
        public final C12924i mo24488a(ClassLoader classLoader, String str, Bundle bundle) {
            if (TextUtils.equals(C37704a.class.getName(), str)) {
                return this.f96108a;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$m */
    public static final class C37699m extends C12372e<ShortVideoContext> {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f96109a;

        public C37699m(ShortVideoContext shortVideoContext) {
            this.f96109a = shortVideoContext;
        }

        /* renamed from: a */
        public final ShortVideoContext mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return this.f96109a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$n */
    public static final class C37700n extends C12372e<C45889c> {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f96110a;

        public C37700n(ShortVideoContext shortVideoContext) {
            this.f96110a = shortVideoContext;
        }

        /* renamed from: a */
        public final C45889c mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            Object a = bVar.mo23372a(AppCompatActivity.class);
            C52711k.m112236a(a, "it.get(AppCompatActivity::class.java)");
            return new C45887a((AppCompatActivity) a, this.f96110a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$o */
    static final class C37701o<T> implements C23524d<JSONObject> {

        /* renamed from: a */
        public static final C37701o f96111a = new C37701o();

        C37701o() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo48684a() {
            return new JSONObject();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$p */
    static final class C37702p<T> implements C17432q<JSONObject> {

        /* renamed from: a */
        public static final C37702p f96112a = new C37702p();

        C37702p() {
        }

        public final /* synthetic */ Object get() {
            return new JSONObject();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.ToolRecordSampleActivity$q */
    static final class C37703q<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ToolRecordSampleActivity f96113a;

        C37703q(ToolRecordSampleActivity toolRecordSampleActivity) {
            this.f96113a = toolRecordSampleActivity;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                ToolRecordSampleActivity toolRecordSampleActivity = this.f96113a;
                toolRecordSampleActivity.f96100a = C12921h.m25903a((Activity) toolRecordSampleActivity, C37704a.class).mo24452a(false).mo24451a((C12930k) new C37698l(new C37704a())).mo24454b(false).mo24455c(false).mo24450a((int) R.id.c_v).mo24456d(false).mo24453a();
            }
        }
    }

    public final void onBackPressed() {
        C12935m mVar = this.f96100a;
        if (mVar == null || !mVar.mo24327a()) {
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    public final void mo48605a(C23422a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f96102c.add(aVar);
    }

    /* renamed from: b */
    public final void mo48606b(C23422a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f96102c.remove(aVar);
    }

    public final void onCreate(Bundle bundle) {
        ShortVideoContext a = C43309ec.m95000a(getIntent());
        C52711k.m112236a((Object) a, "ShortVideoContextFactory.createFromIntent(intent)");
        C0209x a2 = C0214z.m440a((FragmentActivity) this).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(th…extViewModel::class.java]");
        ((ShortVideoContextViewModel) a2).f107134a = a;
        OCAdapterViewModel a3 = C2761a.m7859a((AppCompatActivity) this);
        C12366c cVar = a3.f8323a;
        C12370b a4 = cVar.mo23380a(AppCompatActivity.class, (String) null, this);
        C52711k.m112236a((Object) a4, "this.registerInstance(T:…ass.java, null, instance)");
        a4.mo23383a(FragmentActivity.class).mo23383a(Activity.class);
        C52711k.m112236a((Object) cVar.mo23380a(Context.class, (String) null, this), "this.registerInstance(T:…ass.java, null, instance)");
        Context applicationContext = getApplicationContext();
        C52711k.m112236a((Object) applicationContext, "applicationContext");
        C52711k.m112236a((Object) cVar.mo23380a(Context.class, "applicationContext", applicationContext), "this.registerInstance(T:…ass.java, name, instance)");
        C52711k.m112236a((Object) cVar.mo23378a(ShortVideoContext.class, (String) null, (C12372e<T>) new C37699m<T>(a)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(C45889c.class, (String) null, (C12372e<T>) new C37700n<T>(a)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(C45805a.class, (String) null, (C12372e<T>) new C37697k<T>()), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        a3.mo7346a();
        if (a3.mo7347b() == null) {
            C52711k.m112234a();
        }
        C2757b bVar = new C2757b(C2756a.m7852a((AppCompatActivity) this));
        AlsLogicContainer alsLogicContainer = bVar.f8321a;
        Class<C45004a> cls = C45004a.class;
        Class<C45017b> cls2 = C45017b.class;
        alsLogicContainer.f8308c.mo23377a(cls2, (C12372e<T>) new C37687a<T>());
        C12369a a5 = alsLogicContainer.f8308c.mo23377a(cls, (C12372e<T>) new C37689c<T>(cls2));
        Class[] interfaces = cls.getInterfaces();
        C52711k.m112236a((Object) interfaces, "apiComponentClazz.interfaces");
        for (Class cls3 : interfaces) {
            if (!C52711k.m112239a((Object) cls3, (Object) C2759d.class)) {
                Class[] clsArr = new Class[1];
                if (cls3 != null) {
                    clsArr[0] = cls3;
                    a5.mo23383a(clsArr);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer.f8310e.add(cls2);
        AlsLogicContainer alsLogicContainer2 = bVar.f8321a;
        Class<C49683a> cls4 = C49683a.class;
        Class<C49685c> cls5 = C49685c.class;
        alsLogicContainer2.f8308c.mo23377a(cls5, (C12372e<T>) new C37690d<T>());
        C12369a a6 = alsLogicContainer2.f8308c.mo23377a(cls4, (C12372e<T>) new C37691e<T>(cls5));
        Class[] interfaces2 = cls4.getInterfaces();
        C52711k.m112236a((Object) interfaces2, "apiComponentClazz.interfaces");
        for (Class cls6 : interfaces2) {
            if (!C52711k.m112239a((Object) cls6, (Object) C2759d.class)) {
                Class[] clsArr2 = new Class[1];
                if (cls6 != null) {
                    clsArr2[0] = cls6;
                    a6.mo23383a(clsArr2);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer2.f8310e.add(cls5);
        AlsLogicContainer alsLogicContainer3 = bVar.f8321a;
        Class<C49717b> cls7 = C49717b.class;
        Class<C49718c> cls8 = C49718c.class;
        alsLogicContainer3.f8308c.mo23377a(cls8, (C12372e<T>) new C37692f<T>());
        C12369a a7 = alsLogicContainer3.f8308c.mo23377a(cls7, (C12372e<T>) new C37693g<T>(cls8));
        Class[] interfaces3 = cls7.getInterfaces();
        C52711k.m112236a((Object) interfaces3, "apiComponentClazz.interfaces");
        for (Class cls9 : interfaces3) {
            if (!C52711k.m112239a((Object) cls9, (Object) C2759d.class)) {
                Class[] clsArr3 = new Class[1];
                if (cls9 != null) {
                    clsArr3[0] = cls9;
                    a7.mo23383a(clsArr3);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer3.f8310e.add(cls8);
        AlsLogicContainer alsLogicContainer4 = bVar.f8321a;
        Class<C42451a> cls10 = C42451a.class;
        Class<C42453c> cls11 = C42453c.class;
        alsLogicContainer4.f8308c.mo23377a(cls11, (C12372e<T>) new C37694h<T>());
        C12369a a8 = alsLogicContainer4.f8308c.mo23377a(cls10, (C12372e<T>) new C37695i<T>(cls11));
        Class[] interfaces4 = cls10.getInterfaces();
        C52711k.m112236a((Object) interfaces4, "apiComponentClazz.interfaces");
        for (Class cls12 : interfaces4) {
            if (!C52711k.m112239a((Object) cls12, (Object) C2759d.class)) {
                Class[] clsArr4 = new Class[1];
                if (cls12 != null) {
                    clsArr4[0] = cls12;
                    a8.mo23383a(clsArr4);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer4.f8310e.add(cls11);
        AlsLogicContainer alsLogicContainer5 = bVar.f8321a;
        Class<C50048n> cls13 = C50048n.class;
        Class<C50012k> cls14 = C50012k.class;
        alsLogicContainer5.f8308c.mo23377a(cls14, (C12372e<T>) new C37696j<T>());
        C12369a a9 = alsLogicContainer5.f8308c.mo23377a(cls13, (C12372e<T>) new C37688b<T>(cls14));
        Class[] interfaces5 = cls13.getInterfaces();
        C52711k.m112236a((Object) interfaces5, "apiComponentClazz.interfaces");
        for (Class cls15 : interfaces5) {
            if (!C52711k.m112239a((Object) cls15, (Object) C2759d.class)) {
                Class[] clsArr5 = new Class[1];
                if (cls15 != null) {
                    clsArr5[0] = cls15;
                    a9.mo23383a(clsArr5);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer5.f8310e.add(cls14);
        bVar.mo7344a();
        super.onCreate(bundle);
        setContentView((int) R.layout.axl);
        View findViewById = findViewById(R.id.b_7);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.layout_surface_size)");
        C45004a aVar = (C45004a) C2756a.m7854b(this).mo23372a(C45004a.class);
        ((FrameLayout) findViewById).addView(aVar.mo91307M());
        aVar.mo91362h().mo7352a(this, new C37703q(this));
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        Iterable iterable = this.f96102c;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C23422a) it.next()).onKeyDown(i, keyEvent)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        Iterable iterable = this.f96101b;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C23423b) it.next()).mo48596a(i, i2, intent)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            super.onActivityResult(i, i2, intent);
        }
    }
}
