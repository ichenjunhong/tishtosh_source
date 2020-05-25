package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.ac */
final /* synthetic */ class C49079ac extends C52720t {

    /* renamed from: a */
    public static final C52771j f123338a = new C49079ac();

    C49079ac() {
    }

    public final String getName() {
        return "resetVideoLengthEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditInfoStickerState.class);
    }

    public final String getSignature() {
        return "getResetVideoLengthEvent()Lcom/ss/android/ugc/gamora/jedi/JediPairEvent;";
    }

    public final Object get(Object obj) {
        return ((EditInfoStickerState) obj).getResetVideoLengthEvent();
    }
}
