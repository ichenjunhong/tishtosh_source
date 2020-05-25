package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.y */
final /* synthetic */ class C49541y extends C52720t {

    /* renamed from: a */
    public static final C52771j f124294a = new C49541y();

    C49541y() {
    }

    public final String getName() {
        return "gestureAnimEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditGestureState.class);
    }

    public final String getSignature() {
        return "getGestureAnimEvent()Lcom/ss/android/ugc/gamora/jedi/JediPairEvent;";
    }

    public final Object get(Object obj) {
        return ((EditGestureState) obj).getGestureAnimEvent();
    }
}
