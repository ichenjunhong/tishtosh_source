package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.ao */
final /* synthetic */ class C49129ao extends C52720t {

    /* renamed from: a */
    public static final C52771j f123441a = new C49129ao();

    C49129ao() {
    }

    public final String getName() {
        return "cutMusic";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditMusicState.class);
    }

    public final String getSignature() {
        return "getCutMusic()Lcom/ss/android/ugc/gamora/jedi/JediIntEvent;";
    }

    public final Object get(Object obj) {
        return ((EditMusicState) obj).getCutMusic();
    }
}
