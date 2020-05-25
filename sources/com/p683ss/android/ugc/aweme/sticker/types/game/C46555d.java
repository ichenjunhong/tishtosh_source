package com.p683ss.android.ugc.aweme.sticker.types.game;

import android.arch.lifecycle.C0199s;
import android.util.Pair;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.d */
final /* synthetic */ class C46555d implements C0199s {

    /* renamed from: a */
    private final C46552b f117462a;

    /* renamed from: b */
    private final C46561j f117463b;

    C46555d(C46552b bVar, C46561j jVar) {
        this.f117462a = bVar;
        this.f117463b = jVar;
    }

    public final void onChanged(Object obj) {
        C46552b bVar = this.f117462a;
        C46561j jVar = this.f117463b;
        Pair pair = (Pair) obj;
        if (pair != null && ((Boolean) pair.first).booleanValue()) {
            ShortVideoContext g = bVar.mo93356g();
            long a = C43307ea.m94995a();
            if (g.mo86365f() && g.f107095au != 1) {
                a = g.f107110c;
            } else if (g.mo86362d()) {
                a = 3000;
            }
            if (!(TimeSpeedModelExtension.calculateRealTime(bVar.f117446a.getEndFrameTimeUS() / 1000, 1.0d) + bVar.mo93356g().f107120m < a) && bVar.f117448c) {
                bVar.f117448c = false;
                bVar.f117450e = true;
                bVar.mo93356g().f107096av = ((Integer) pair.second).intValue();
                jVar.mo93339a(pair);
            }
        }
    }
}
