package com.p683ss.android.ugc.gamora.editor;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.bo */
final /* synthetic */ class C49302bo extends C52720t {

    /* renamed from: a */
    public static final C52771j f123816a = new C49302bo();

    C49302bo() {
    }

    public final String getName() {
        return "commentStickerLayoutEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(EditStickerState.class);
    }

    public final String getSignature() {
        return "getCommentStickerLayoutEvent()Lcom/ss/android/ugc/gamora/jedi/JediTripeEvent;";
    }

    public final Object get(Object obj) {
        return ((EditStickerState) obj).getCommentStickerLayoutEvent();
    }
}
