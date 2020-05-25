package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.ci */
public final /* synthetic */ class C49366ci extends C52720t {
    public static final C52771j INSTANCE = new C49366ci();

    C49366ci() {
    }

    public final String getName() {
        return "quitEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditState.class);
    }

    public final String getSignature() {
        return "getQuitEvent()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((EditState) obj).getQuitEvent();
    }
}
