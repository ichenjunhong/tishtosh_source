package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import p2628d.C52855s;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.gamora.editor.EditMusicCutState */
public final class EditMusicCutState implements C11932s {
    private final C52855s<C43203d, Integer, Integer> musicWaveData;
    private final Integer videoLength;

    public EditMusicCutState() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=d.s, code=d.s<com.ss.android.ugc.aweme.shortvideo.d, java.lang.Integer, java.lang.Integer>, for r1v0, types: [d.s] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.gamora.editor.EditMusicCutState copy$default(com.p683ss.android.ugc.gamora.editor.EditMusicCutState r0, p2628d.C52855s<com.p683ss.android.ugc.aweme.shortvideo.C43203d, java.lang.Integer, java.lang.Integer> r1, java.lang.Integer r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            d.s<com.ss.android.ugc.aweme.shortvideo.d, java.lang.Integer, java.lang.Integer> r1 = r0.musicWaveData
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.lang.Integer r2 = r0.videoLength
        L_0x000c:
            com.ss.android.ugc.gamora.editor.EditMusicCutState r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditMusicCutState.copy$default(com.ss.android.ugc.gamora.editor.EditMusicCutState, d.s, java.lang.Integer, int, java.lang.Object):com.ss.android.ugc.gamora.editor.EditMusicCutState");
    }

    public final C52855s<C43203d, Integer, Integer> component1() {
        return this.musicWaveData;
    }

    public final Integer component2() {
        return this.videoLength;
    }

    public final EditMusicCutState copy(C52855s<C43203d, Integer, Integer> sVar, Integer num) {
        return new EditMusicCutState(sVar, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.videoLength, (java.lang.Object) r3.videoLength) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.gamora.editor.EditMusicCutState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.gamora.editor.EditMusicCutState r3 = (com.p683ss.android.ugc.gamora.editor.EditMusicCutState) r3
            d.s<com.ss.android.ugc.aweme.shortvideo.d, java.lang.Integer, java.lang.Integer> r0 = r2.musicWaveData
            d.s<com.ss.android.ugc.aweme.shortvideo.d, java.lang.Integer, java.lang.Integer> r1 = r3.musicWaveData
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r0 = r2.videoLength
            java.lang.Integer r3 = r3.videoLength
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditMusicCutState.equals(java.lang.Object):boolean");
    }

    public final C52855s<C43203d, Integer, Integer> getMusicWaveData() {
        return this.musicWaveData;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    public final int hashCode() {
        C52855s<C43203d, Integer, Integer> sVar = this.musicWaveData;
        int i = 0;
        int hashCode = (sVar != null ? sVar.hashCode() : 0) * 31;
        Integer num = this.videoLength;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditMusicCutState(musicWaveData=");
        sb.append(this.musicWaveData);
        sb.append(", videoLength=");
        sb.append(this.videoLength);
        sb.append(")");
        return sb.toString();
    }

    public EditMusicCutState(C52855s<C43203d, Integer, Integer> sVar, Integer num) {
        this.musicWaveData = sVar;
        this.videoLength = num;
    }

    public /* synthetic */ EditMusicCutState(C52855s sVar, Integer num, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            sVar = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        this(sVar, num);
    }
}
