package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.p683ss.android.ugc.gamora.editor.EditAudioEffectState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.j */
final /* synthetic */ class C43393j extends C52720t {

    /* renamed from: a */
    public static final C52771j f109698a = new C43393j();

    C43393j() {
    }

    public final String getName() {
        return "audioEffectVisible";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditAudioEffectState.class);
    }

    public final String getSignature() {
        return "getAudioEffectVisible()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((EditAudioEffectState) obj).getAudioEffectVisible();
    }
}
