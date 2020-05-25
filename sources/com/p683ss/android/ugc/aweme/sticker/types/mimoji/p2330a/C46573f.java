package com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a;

import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.panel.C46190j;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46313c;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46579c;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46580d;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.a.f */
public final class C46573f implements C46190j {

    /* renamed from: a */
    private C46574g f117495a;

    /* renamed from: b */
    private boolean f117496b;

    /* renamed from: b */
    public final boolean mo92899b() {
        return this.f117496b;
    }

    /* renamed from: d */
    public final void mo92901d() {
        mo93371a();
    }

    /* renamed from: a */
    public final void mo93371a() {
        this.f117496b = false;
        this.f117495a.mo93377b();
    }

    /* renamed from: c */
    public final void mo92900c() {
        this.f117496b = true;
        this.f117495a.mo93374a();
    }

    /* renamed from: a */
    public final void mo93372a(int i) {
        this.f117496b = true;
        this.f117495a.mo93375a(i);
    }

    /* renamed from: a */
    public final void mo93373a(List<? extends StickerWrapper> list) {
        C52711k.m112240b(list, "list");
        this.f117495a.mo93376a(list);
    }

    public C46573f(AppCompatActivity appCompatActivity, C46313c cVar, C46354l lVar, String str, View view, C46580d dVar, C46579c cVar2) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        C52711k.m112240b(appCompatActivity, "activity");
        C46313c cVar3 = cVar;
        C52711k.m112240b(cVar, "mobHelper");
        C46354l lVar2 = lVar;
        C52711k.m112240b(lVar, "stickerDataManager");
        String str2 = str;
        C52711k.m112240b(str, "panel");
        View view2 = view;
        C52711k.m112240b(view, "rootView");
        C46574g gVar = new C46574g(appCompatActivity2, str2, cVar3, lVar2, view2, dVar, cVar2);
        this.f117495a = gVar;
    }
}
