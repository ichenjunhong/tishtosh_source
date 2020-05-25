package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.bl */
final /* synthetic */ class C49299bl extends C52720t {

    /* renamed from: a */
    public static final C52771j f123813a = new C49299bl();

    C49299bl() {
    }

    public final String getName() {
        return "curLyricEffect";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditLyricStickerState.class);
    }

    public final String getSignature() {
        return "getCurLyricEffect()Lcom/ss/android/ugc/gamora/editor/LyricStyleModel;";
    }

    public final Object get(Object obj) {
        return ((EditLyricStickerState) obj).getCurLyricEffect();
    }
}
