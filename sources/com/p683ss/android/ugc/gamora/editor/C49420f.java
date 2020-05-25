package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.f */
final /* synthetic */ class C49420f extends C52720t {

    /* renamed from: a */
    public static final C52771j f124031a = new C49420f();

    C49420f() {
    }

    public final String getName() {
        return "enableAutoEnhance";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditAutoEnhanceState.class);
    }

    public final String getSignature() {
        return "getEnableAutoEnhance()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((EditAutoEnhanceState) obj).getEnableAutoEnhance();
    }
}
