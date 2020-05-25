package com.p683ss.android.ugc.gamora.recorder.filter.filter_panel;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.h */
final /* synthetic */ class C49782h extends C52720t {

    /* renamed from: a */
    public static final C52771j f124802a = new C49782h();

    C49782h() {
    }

    public final String getName() {
        return "enterFilterBoxEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(FilterPanelState.class);
    }

    public final String getSignature() {
        return "getEnterFilterBoxEvent()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((FilterPanelState) obj).getEnterFilterBoxEvent();
    }
}
