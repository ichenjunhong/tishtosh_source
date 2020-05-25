package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel;

import android.arch.lifecycle.C0184k;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.panel.C46080a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46188h;
import com.p683ss.android.ugc.aweme.sticker.panel.C46189i;
import com.p683ss.android.ugc.aweme.sticker.panel.C46191k;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46086b;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46087c;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.k */
public final class C46159k extends C46080a implements C46189i<AVDmtTabItemView, Fragment> {

    /* renamed from: j */
    static final /* synthetic */ C52767h[] f116481j = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46159k.class), "customCategoryViewMap", "getCustomCategoryViewMap()Ljava/util/Map;"))};

    /* renamed from: k */
    public final C45814b f116482k = ((C45814b) mo23370j().mo23373a(C45814b.class, (String) null));

    /* renamed from: l */
    private final C52668f f116483l = C52732g.m112285a(C46160a.f116486a);

    /* renamed from: m */
    private final C46255p f116484m;

    /* renamed from: n */
    private final C12361b f116485n;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.k$a */
    static final class C46160a extends C52712l implements C52670a<Map<String, C46188h<AVDmtTabItemView, Fragment>>> {

        /* renamed from: a */
        public static final C46160a f116486a = new C46160a();

        C46160a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: f */
    public final C46255p mo92851f() {
        return this.f116484m;
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f116485n;
    }

    /* renamed from: a */
    public final C46191k mo92770a() {
        C12366c cVar = new C12366c(mo23370j());
        cVar.mo23379a(C46189i.class, this);
        C52711k.m112236a((Object) cVar.mo23380a(C46086b.class, (String) null, mo92775b()), "this.registerInstance(T:…ass.java, null, instance)");
        C12361b a = cVar.mo23376a();
        C52711k.m112236a((Object) a, "ObjectContainerBuilder(d…roller)\n        }.build()");
        return new DefaultEffectStickerViewImpl(a);
    }

    /* renamed from: a */
    public final C46188h<AVDmtTabItemView, Fragment> mo92850a(String str) {
        if (str != null) {
            return (C46188h) ((Map) this.f116483l.getValue()).get(str);
        }
        return null;
    }

    public C46159k(AppCompatActivity appCompatActivity, FrameLayout frameLayout, C0184k kVar, C12361b bVar, C0654k kVar2) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(frameLayout, "rootContainer");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(bVar, "diContainer");
        C52711k.m112240b(kVar2, "fragmentManager");
        super(appCompatActivity, frameLayout, kVar, (C46354l) bVar.mo23373a(C46354l.class, (String) null), kVar2);
        this.f116485n = bVar;
        mo92775b().mo92785a(new C46087c(this.f116297i, 0, 2, null));
        this.f116484m = (C46255p) mo23370j().mo23373a(C46255p.class, (String) null);
    }
}
