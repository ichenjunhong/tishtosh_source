package com.bytedance.ui_component;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.bytedance.ui_component.c */
final /* synthetic */ class C13370c extends C52720t {

    /* renamed from: a */
    public static final C52771j f34857a = new C13370c();

    C13370c() {
    }

    public final String getName() {
        return "ui";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(UiState.class);
    }

    public final String getSignature() {
        return "getUi()Lcom/bytedance/ui_component/UI;";
    }

    public final Object get(Object obj) {
        return ((UiState) obj).getUi();
    }
}
