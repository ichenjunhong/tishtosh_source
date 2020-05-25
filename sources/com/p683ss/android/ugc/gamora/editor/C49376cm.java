package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.cm */
final /* synthetic */ class C49376cm extends C52720t {

    /* renamed from: a */
    public static final C52771j f123943a = new C49376cm();

    C49376cm() {
    }

    public final String getName() {
        return "voiceTitle";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditVolumeState.class);
    }

    public final String getSignature() {
        return "getVoiceTitle()Ljava/lang/String;";
    }

    public final Object get(Object obj) {
        return ((EditVolumeState) obj).getVoiceTitle();
    }
}
