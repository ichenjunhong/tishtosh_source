package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.bg */
final /* synthetic */ class C49255bg extends C52720t {

    /* renamed from: a */
    public static final C52771j f123716a = new C49255bg();

    C49255bg() {
    }

    public final String getName() {
        return "stickerViewVisibleEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditStickerPanelState.class);
    }

    public final String getSignature() {
        return "getStickerViewVisibleEvent()Lcom/ss/android/ugc/gamora/jedi/JediBooleanEvent;";
    }

    public final Object get(Object obj) {
        return ((EditStickerPanelState) obj).getStickerViewVisibleEvent();
    }
}
