package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.bm */
final /* synthetic */ class C49300bm extends C52720t {

    /* renamed from: a */
    public static final C52771j f123814a = new C49300bm();

    C49300bm() {
    }

    public final String getName() {
        return "deleteLyric";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditLyricStickerState.class);
    }

    public final String getSignature() {
        return "getDeleteLyric()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((EditLyricStickerState) obj).getDeleteLyric();
    }
}
