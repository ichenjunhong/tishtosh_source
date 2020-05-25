package com.p683ss.android.ugc.aweme.sticker.panel;

import android.arch.lifecycle.C0184k;
import android.support.p030v4.app.C0654k;
import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.C46159k;
import com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46248j;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.n */
public final class C46196n {

    /* renamed from: a */
    public static final C46196n f116548a = new C46196n();

    private C46196n() {
    }

    /* renamed from: a */
    public static final C46254o m100338a(AppCompatActivity appCompatActivity, FrameLayout frameLayout, C0184k kVar, C46354l lVar, C46255p pVar, C45814b bVar, C45889c cVar, C12361b bVar2, C0654k kVar2) {
        C12366c cVar2;
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(frameLayout, "rootContainer");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(pVar, "stickerViewConfigure");
        C52711k.m112240b(bVar, "stickerSelectedController");
        C52711k.m112240b(cVar, "stickerMobHelper");
        C52711k.m112240b(kVar2, "fragmentManager");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(pVar, "stickerViewConfigure");
        C52711k.m112240b(bVar, "stickerSelectedController");
        C52711k.m112240b(cVar, "stickerMobHelper");
        if (bVar2 != null) {
            cVar2 = new C12366c(bVar2);
        } else {
            cVar2 = new C12366c();
        }
        C52711k.m112236a((Object) cVar2.mo23380a(C46354l.class, (String) null, lVar), "this.registerInstance(T:…ass.java, null, instance)");
        C52711k.m112236a((Object) cVar2.mo23380a(C46255p.class, (String) null, pVar), "this.registerInstance(T:…ass.java, null, instance)");
        C52711k.m112236a((Object) cVar2.mo23380a(C45814b.class, (String) null, bVar), "this.registerInstance(T:…ass.java, null, instance)");
        C52711k.m112236a((Object) cVar2.mo23380a(C45889c.class, (String) null, cVar), "this.registerInstance(T:…ass.java, null, instance)");
        C12361b a = cVar2.mo23376a();
        C52711k.m112236a((Object) a, "builder.apply {\n        …Helper)\n        }.build()");
        if (pVar.f116706g) {
            C46248j jVar = new C46248j(appCompatActivity, frameLayout, kVar, a, kVar2);
            return jVar;
        }
        C46159k kVar3 = new C46159k(appCompatActivity, frameLayout, kVar, a, kVar2);
        return kVar3;
    }
}
