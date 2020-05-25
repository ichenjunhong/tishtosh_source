package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.av */
final /* synthetic */ class C49158av extends C52720t {

    /* renamed from: a */
    public static final C52771j f123493a = new C49158av();

    C49158av() {
    }

    public final String getName() {
        return "autoStartStopArbiterEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditPreviewState.class);
    }

    public final String getSignature() {
        return "getAutoStartStopArbiterEvent()Lcom/ss/android/ugc/gamora/jedi/JediBooleanEvent;";
    }

    public final Object get(Object obj) {
        return ((EditPreviewState) obj).getAutoStartStopArbiterEvent();
    }
}
