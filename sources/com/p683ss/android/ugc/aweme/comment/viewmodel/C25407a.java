package com.p683ss.android.ugc.aweme.comment.viewmodel;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.a */
final /* synthetic */ class C25407a extends C52720t {

    /* renamed from: a */
    public static final C52771j f67195a = new C25407a();

    C25407a() {
    }

    public final String getName() {
        return "listState";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(GifEmojiListState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((GifEmojiListState) obj).getListState();
    }
}
