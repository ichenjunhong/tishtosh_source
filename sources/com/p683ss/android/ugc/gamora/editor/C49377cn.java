package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.cn */
final /* synthetic */ class C49377cn extends C52720t {

    /* renamed from: a */
    public static final C52771j f123944a = new C49377cn();

    C49377cn() {
    }

    public final String getName() {
        return "musicVolume";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditVolumeState.class);
    }

    public final String getSignature() {
        return "getMusicVolume()Ljava/lang/Integer;";
    }

    public final Object get(Object obj) {
        return ((EditVolumeState) obj).getMusicVolume();
    }
}
