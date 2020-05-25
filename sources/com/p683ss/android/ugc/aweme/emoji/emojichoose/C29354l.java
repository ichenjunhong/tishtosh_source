package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.view.View;
import com.p683ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.l */
final /* synthetic */ class C29354l implements Runnable {

    /* renamed from: a */
    private final C29351i f76881a;

    /* renamed from: b */
    private final List f76882b;

    /* renamed from: c */
    private final List f76883c;

    /* renamed from: d */
    private final View f76884d;

    /* renamed from: e */
    private final SwipeControlledViewPager f76885e;

    C29354l(C29351i iVar, List list, List list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        this.f76881a = iVar;
        this.f76882b = list;
        this.f76883c = list2;
        this.f76884d = view;
        this.f76885e = swipeControlledViewPager;
    }

    public final void run() {
        C29351i iVar = this.f76881a;
        iVar.mo59296a(iVar.f76866h, iVar.f76867i, this.f76882b, this.f76883c, this.f76884d, this.f76885e);
    }
}
