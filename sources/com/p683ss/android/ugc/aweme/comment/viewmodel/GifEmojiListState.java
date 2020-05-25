package com.p683ss.android.ugc.aweme.comment.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.comment.model.GifEmoji;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState */
public final class GifEmojiListState implements C11932s {
    private final String awemeId;
    private final String keyword;
    private final ListState<GifEmoji, C11865l> listState;

    public GifEmojiListState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.comment.model.GifEmoji, com.bytedance.jedi.arch.ext.list.l>, for r3v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState copy$default(com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState r0, java.lang.String r1, java.lang.String r2, com.bytedance.jedi.arch.ext.list.ListState<com.p683ss.android.ugc.aweme.comment.model.GifEmoji, com.bytedance.jedi.arch.ext.list.C11865l> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.String r1 = r0.keyword
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            java.lang.String r2 = r0.awemeId
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.comment.model.GifEmoji, com.bytedance.jedi.arch.ext.list.l> r3 = r0.listState
        L_0x0012:
            com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState.copy$default(com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState, java.lang.String, java.lang.String, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState");
    }

    public final String component1() {
        return this.keyword;
    }

    public final String component2() {
        return this.awemeId;
    }

    public final ListState<GifEmoji, C11865l> component3() {
        return this.listState;
    }

    public final GifEmojiListState copy(String str, String str2, ListState<GifEmoji, C11865l> listState2) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str2, "awemeId");
        C52711k.m112240b(listState2, "listState");
        return new GifEmojiListState(str, str2, listState2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.listState, (java.lang.Object) r3.listState) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState r3 = (com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState) r3
            java.lang.String r0 = r2.keyword
            java.lang.String r1 = r3.keyword
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.awemeId
            java.lang.String r1 = r3.awemeId
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.comment.model.GifEmoji, com.bytedance.jedi.arch.ext.list.l> r0 = r2.listState
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.comment.model.GifEmoji, com.bytedance.jedi.arch.ext.list.l> r3 = r3.listState
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState.equals(java.lang.Object):boolean");
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final ListState<GifEmoji, C11865l> getListState() {
        return this.listState;
    }

    public final int hashCode() {
        String str = this.keyword;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.awemeId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ListState<GifEmoji, C11865l> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifEmojiListState(keyword=");
        sb.append(this.keyword);
        sb.append(", awemeId=");
        sb.append(this.awemeId);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public GifEmojiListState(String str, String str2, ListState<GifEmoji, C11865l> listState2) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str2, "awemeId");
        C52711k.m112240b(listState2, "listState");
        this.keyword = str;
        this.awemeId = str2;
        this.listState = listState2;
    }

    public /* synthetic */ GifEmojiListState(String str, String str2, ListState listState2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            listState2 = new ListState(new C11865l(false, 0, 3, null), null, null, null, null, 30, null);
        }
        this(str, str2, listState2);
    }
}
