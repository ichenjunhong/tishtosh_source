package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.an */
final /* synthetic */ class C49128an extends C52720t {

    /* renamed from: a */
    public static final C52771j f123440a = new C49128an();

    C49128an() {
    }

    public final String getName() {
        return "enableCutMusic";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditMusicState.class);
    }

    public final String getSignature() {
        return "getEnableCutMusic()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((EditMusicState) obj).getEnableCutMusic();
    }
}
