package com.p683ss.android.ugc.aweme.comment.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.comment.model.GifEmoji;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiState */
public final class GifEmojiState implements C11932s {
    private final GifEmoji gifEmoji;

    public GifEmojiState() {
        this(null, 1, null);
    }

    public static /* synthetic */ GifEmojiState copy$default(GifEmojiState gifEmojiState, GifEmoji gifEmoji2, int i, Object obj) {
        if ((i & 1) != 0) {
            gifEmoji2 = gifEmojiState.gifEmoji;
        }
        return gifEmojiState.copy(gifEmoji2);
    }

    public final GifEmoji component1() {
        return this.gifEmoji;
    }

    public final GifEmojiState copy(GifEmoji gifEmoji2) {
        C52711k.m112240b(gifEmoji2, "gifEmoji");
        return new GifEmojiState(gifEmoji2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.gifEmoji, (java.lang.Object) ((com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiState) r2).gifEmoji) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiState r2 = (com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiState) r2
            com.ss.android.ugc.aweme.comment.model.GifEmoji r0 = r1.gifEmoji
            com.ss.android.ugc.aweme.comment.model.GifEmoji r2 = r2.gifEmoji
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiState.equals(java.lang.Object):boolean");
    }

    public final GifEmoji getGifEmoji() {
        return this.gifEmoji;
    }

    public final int hashCode() {
        GifEmoji gifEmoji2 = this.gifEmoji;
        if (gifEmoji2 != null) {
            return gifEmoji2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifEmojiState(gifEmoji=");
        sb.append(this.gifEmoji);
        sb.append(")");
        return sb.toString();
    }

    public GifEmojiState(GifEmoji gifEmoji2) {
        C52711k.m112240b(gifEmoji2, "gifEmoji");
        this.gifEmoji = gifEmoji2;
    }

    public /* synthetic */ GifEmojiState(GifEmoji gifEmoji2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            gifEmoji2 = new GifEmoji();
        }
        this(gifEmoji2);
    }
}
