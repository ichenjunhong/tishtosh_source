package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.C49559f;
import com.p683ss.android.ugc.gamora.jedi.C49560g;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.gamora.editor.EditStickerState */
public final class EditStickerState implements C11932s {
    private final C49560g<Float, Float, Float> commentStickerLayoutEvent;
    private final C49559f<Float, Long> voteTextAnimEvent;
    private final C49560g<Float, Float, Float> voteTextLayoutEvent;
    private final Integer votingTopMargin;

    public EditStickerState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.f, code=com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long>, for r2v0, types: [com.ss.android.ugc.gamora.jedi.f] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.g, code=com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float>, for r3v0, types: [com.ss.android.ugc.gamora.jedi.g] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.g, code=com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float>, for r4v0, types: [com.ss.android.ugc.gamora.jedi.g] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.gamora.editor.EditStickerState copy$default(com.p683ss.android.ugc.gamora.editor.EditStickerState r0, java.lang.Integer r1, com.p683ss.android.ugc.gamora.jedi.C49559f<java.lang.Float, java.lang.Long> r2, com.p683ss.android.ugc.gamora.jedi.C49560g<java.lang.Float, java.lang.Float, java.lang.Float> r3, com.p683ss.android.ugc.gamora.jedi.C49560g<java.lang.Float, java.lang.Float, java.lang.Float> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.Integer r1 = r0.votingTopMargin
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r2 = r0.voteTextAnimEvent
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r3 = r0.voteTextLayoutEvent
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r4 = r0.commentStickerLayoutEvent
        L_0x0018:
            com.ss.android.ugc.gamora.editor.EditStickerState r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditStickerState.copy$default(com.ss.android.ugc.gamora.editor.EditStickerState, java.lang.Integer, com.ss.android.ugc.gamora.jedi.f, com.ss.android.ugc.gamora.jedi.g, com.ss.android.ugc.gamora.jedi.g, int, java.lang.Object):com.ss.android.ugc.gamora.editor.EditStickerState");
    }

    public final Integer component1() {
        return this.votingTopMargin;
    }

    public final C49559f<Float, Long> component2() {
        return this.voteTextAnimEvent;
    }

    public final C49560g<Float, Float, Float> component3() {
        return this.voteTextLayoutEvent;
    }

    public final C49560g<Float, Float, Float> component4() {
        return this.commentStickerLayoutEvent;
    }

    public final EditStickerState copy(Integer num, C49559f<Float, Long> fVar, C49560g<Float, Float, Float> gVar, C49560g<Float, Float, Float> gVar2) {
        return new EditStickerState(num, fVar, gVar, gVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.commentStickerLayoutEvent, (java.lang.Object) r3.commentStickerLayoutEvent) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.gamora.editor.EditStickerState
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.gamora.editor.EditStickerState r3 = (com.p683ss.android.ugc.gamora.editor.EditStickerState) r3
            java.lang.Integer r0 = r2.votingTopMargin
            java.lang.Integer r1 = r3.votingTopMargin
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r0 = r2.voteTextAnimEvent
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r1 = r3.voteTextAnimEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r0 = r2.voteTextLayoutEvent
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r1 = r3.voteTextLayoutEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r0 = r2.commentStickerLayoutEvent
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r3 = r3.commentStickerLayoutEvent
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditStickerState.equals(java.lang.Object):boolean");
    }

    public final C49560g<Float, Float, Float> getCommentStickerLayoutEvent() {
        return this.commentStickerLayoutEvent;
    }

    public final C49559f<Float, Long> getVoteTextAnimEvent() {
        return this.voteTextAnimEvent;
    }

    public final C49560g<Float, Float, Float> getVoteTextLayoutEvent() {
        return this.voteTextLayoutEvent;
    }

    public final Integer getVotingTopMargin() {
        return this.votingTopMargin;
    }

    public final int hashCode() {
        Integer num = this.votingTopMargin;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        C49559f<Float, Long> fVar = this.voteTextAnimEvent;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C49560g<Float, Float, Float> gVar = this.voteTextLayoutEvent;
        int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        C49560g<Float, Float, Float> gVar2 = this.commentStickerLayoutEvent;
        if (gVar2 != null) {
            i = gVar2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditStickerState(votingTopMargin=");
        sb.append(this.votingTopMargin);
        sb.append(", voteTextAnimEvent=");
        sb.append(this.voteTextAnimEvent);
        sb.append(", voteTextLayoutEvent=");
        sb.append(this.voteTextLayoutEvent);
        sb.append(", commentStickerLayoutEvent=");
        sb.append(this.commentStickerLayoutEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditStickerState(Integer num, C49559f<Float, Long> fVar, C49560g<Float, Float, Float> gVar, C49560g<Float, Float, Float> gVar2) {
        this.votingTopMargin = num;
        this.voteTextAnimEvent = fVar;
        this.voteTextLayoutEvent = gVar;
        this.commentStickerLayoutEvent = gVar2;
    }

    public /* synthetic */ EditStickerState(Integer num, C49559f fVar, C49560g gVar, C49560g gVar2, int i, C52707g gVar3) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            fVar = null;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        if ((i & 8) != 0) {
            gVar2 = null;
        }
        this(num, fVar, gVar, gVar2);
    }
}
