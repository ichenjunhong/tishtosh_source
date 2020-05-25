package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

import android.arch.lifecycle.C0184k;
import android.support.p030v4.app.C0654k;
import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import com.p683ss.android.ugc.aweme.sticker.panel.C46080a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46191k;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46086b;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46087c;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46089e;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.j */
public final class C46248j extends C46080a {

    /* renamed from: j */
    private final C46255p f116684j = ((C46255p) mo23370j().mo23373a(C46255p.class, (String) null));

    /* renamed from: k */
    private final C12361b f116685k;

    /* renamed from: f */
    public final C46255p mo92851f() {
        return this.f116684j;
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f116685k;
    }

    /* renamed from: a */
    public final C46191k mo92770a() {
        C12366c cVar = new C12366c(mo23370j());
        C52711k.m112236a((Object) cVar.mo23380a(C46086b.class, (String) null, mo92775b()), "this.registerInstance(T:…ass.java, null, instance)");
        C12361b a = cVar.mo23376a();
        C52711k.m112236a((Object) a, "ObjectContainerBuilder(d…roller)\n        }.build()");
        return new ScrollerEffectStickerViewImpl(a);
    }

    public C46248j(AppCompatActivity appCompatActivity, FrameLayout frameLayout, C0184k kVar, C12361b bVar, C0654k kVar2) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(frameLayout, "rootContainer");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(bVar, "diContainer");
        C52711k.m112240b(kVar2, "fragmentManager");
        super(appCompatActivity, frameLayout, kVar, (C46354l) bVar.mo23373a(C46354l.class, (String) null), kVar2);
        this.f116685k = bVar;
        mo92775b().mo92785a(new C46087c(this.f116297i, 0, 2, null));
        C46086b b = mo92775b();
        C46089e eVar = new C46089e(this.f116297i, 0, 0, 6, null);
        b.mo92785a(eVar);
    }
}
