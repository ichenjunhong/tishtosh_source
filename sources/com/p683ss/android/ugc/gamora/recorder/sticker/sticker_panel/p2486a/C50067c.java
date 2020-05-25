package com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.p2486a;

import android.arch.lifecycle.C0184k;
import android.support.p030v4.app.C0654k;
import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.panel.C46196n;
import com.p683ss.android.ugc.aweme.sticker.panel.C46254o;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.C50070d;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.c */
public final class C50067c implements C50070d {

    /* renamed from: a */
    private final AppCompatActivity f125415a;

    /* renamed from: b */
    private final C0184k f125416b;

    /* renamed from: c */
    private final C0654k f125417c;

    private C50067c(AppCompatActivity appCompatActivity, C0184k kVar, C0654k kVar2) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(kVar2, "fragmentManager");
        this.f125415a = appCompatActivity;
        this.f125416b = kVar;
        this.f125417c = kVar2;
    }

    public /* synthetic */ C50067c(AppCompatActivity appCompatActivity, C0184k kVar, C0654k kVar2, int i, C52707g gVar) {
        C0654k supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        C52711k.m112236a((Object) supportFragmentManager, "activity.supportFragmentManager");
        this(appCompatActivity, kVar, supportFragmentManager);
    }

    /* renamed from: a */
    public final C46254o mo97847a(FrameLayout frameLayout, C46354l lVar, C46255p pVar, C45814b bVar, C45889c cVar, C12361b bVar2) {
        FrameLayout frameLayout2 = frameLayout;
        C52711k.m112240b(frameLayout, "rootContainer");
        C46354l lVar2 = lVar;
        C52711k.m112240b(lVar, "stickerDataManager");
        C46255p pVar2 = pVar;
        C52711k.m112240b(pVar, "stickerViewConfigure");
        C45814b bVar3 = bVar;
        C52711k.m112240b(bVar, "stickerSelectedController");
        C45889c cVar2 = cVar;
        C52711k.m112240b(cVar2, "stickerMobHelper");
        C12361b bVar4 = bVar2;
        C52711k.m112240b(bVar4, "parentContainer");
        return C46196n.m100338a(this.f125415a, frameLayout2, this.f125416b, lVar2, pVar2, bVar3, cVar2, bVar4, this.f125417c);
    }
}
