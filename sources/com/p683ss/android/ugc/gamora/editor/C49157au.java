package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.au */
final /* synthetic */ class C49157au extends C52720t {

    /* renamed from: a */
    public static final C52771j f123492a = new C49157au();

    C49157au() {
    }

    public final String getName() {
        return "backgroundColor";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditPreviewState.class);
    }

    public final String getSignature() {
        return "getBackgroundColor()Ljava/lang/Integer;";
    }

    public final Object get(Object obj) {
        return ((EditPreviewState) obj).getBackgroundColor();
    }
}
