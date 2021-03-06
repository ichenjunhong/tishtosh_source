package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.C49556c;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicState */
public final class CutVideoStickerPointMusicState implements C11932s {
    private final C49556c dismissAnimateEvent;
    private final C49556c musicDialogVisibleEvent;
    private final Boolean musicViewVisible;
    private final C49556c showAnimateEvent;
    private final C49556c startMusicEvent;

    public CutVideoStickerPointMusicState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CutVideoStickerPointMusicState copy$default(CutVideoStickerPointMusicState cutVideoStickerPointMusicState, C49556c cVar, C49556c cVar2, C49556c cVar3, C49556c cVar4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = cutVideoStickerPointMusicState.startMusicEvent;
        }
        if ((i & 2) != 0) {
            cVar2 = cutVideoStickerPointMusicState.showAnimateEvent;
        }
        C49556c cVar5 = cVar2;
        if ((i & 4) != 0) {
            cVar3 = cutVideoStickerPointMusicState.dismissAnimateEvent;
        }
        C49556c cVar6 = cVar3;
        if ((i & 8) != 0) {
            cVar4 = cutVideoStickerPointMusicState.musicDialogVisibleEvent;
        }
        C49556c cVar7 = cVar4;
        if ((i & 16) != 0) {
            bool = cutVideoStickerPointMusicState.musicViewVisible;
        }
        return cutVideoStickerPointMusicState.copy(cVar, cVar5, cVar6, cVar7, bool);
    }

    public final C49556c component1() {
        return this.startMusicEvent;
    }

    public final C49556c component2() {
        return this.showAnimateEvent;
    }

    public final C49556c component3() {
        return this.dismissAnimateEvent;
    }

    public final C49556c component4() {
        return this.musicDialogVisibleEvent;
    }

    public final Boolean component5() {
        return this.musicViewVisible;
    }

    public final CutVideoStickerPointMusicState copy(C49556c cVar, C49556c cVar2, C49556c cVar3, C49556c cVar4, Boolean bool) {
        CutVideoStickerPointMusicState cutVideoStickerPointMusicState = new CutVideoStickerPointMusicState(cVar, cVar2, cVar3, cVar4, bool);
        return cutVideoStickerPointMusicState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.musicViewVisible, (java.lang.Object) r3.musicViewVisible) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicState
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicState r3 = (com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicState) r3
            com.ss.android.ugc.gamora.jedi.c r0 = r2.startMusicEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.startMusicEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.c r0 = r2.showAnimateEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.showAnimateEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.c r0 = r2.dismissAnimateEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.dismissAnimateEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.c r0 = r2.musicDialogVisibleEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.musicDialogVisibleEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Boolean r0 = r2.musicViewVisible
            java.lang.Boolean r3 = r3.musicViewVisible
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicState.equals(java.lang.Object):boolean");
    }

    public final C49556c getDismissAnimateEvent() {
        return this.dismissAnimateEvent;
    }

    public final C49556c getMusicDialogVisibleEvent() {
        return this.musicDialogVisibleEvent;
    }

    public final Boolean getMusicViewVisible() {
        return this.musicViewVisible;
    }

    public final C49556c getShowAnimateEvent() {
        return this.showAnimateEvent;
    }

    public final C49556c getStartMusicEvent() {
        return this.startMusicEvent;
    }

    public final int hashCode() {
        C49556c cVar = this.startMusicEvent;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C49556c cVar2 = this.showAnimateEvent;
        int hashCode2 = (hashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        C49556c cVar3 = this.dismissAnimateEvent;
        int hashCode3 = (hashCode2 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31;
        C49556c cVar4 = this.musicDialogVisibleEvent;
        int hashCode4 = (hashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31;
        Boolean bool = this.musicViewVisible;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoStickerPointMusicState(startMusicEvent=");
        sb.append(this.startMusicEvent);
        sb.append(", showAnimateEvent=");
        sb.append(this.showAnimateEvent);
        sb.append(", dismissAnimateEvent=");
        sb.append(this.dismissAnimateEvent);
        sb.append(", musicDialogVisibleEvent=");
        sb.append(this.musicDialogVisibleEvent);
        sb.append(", musicViewVisible=");
        sb.append(this.musicViewVisible);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoStickerPointMusicState(C49556c cVar, C49556c cVar2, C49556c cVar3, C49556c cVar4, Boolean bool) {
        this.startMusicEvent = cVar;
        this.showAnimateEvent = cVar2;
        this.dismissAnimateEvent = cVar3;
        this.musicDialogVisibleEvent = cVar4;
        this.musicViewVisible = bool;
    }

    public /* synthetic */ CutVideoStickerPointMusicState(C49556c cVar, C49556c cVar2, C49556c cVar3, C49556c cVar4, Boolean bool, int i, C52707g gVar) {
        C49556c cVar5;
        C49556c cVar6;
        C49556c cVar7;
        C49556c cVar8;
        Boolean bool2;
        if ((i & 1) != 0) {
            cVar5 = null;
        } else {
            cVar5 = cVar;
        }
        if ((i & 2) != 0) {
            cVar6 = null;
        } else {
            cVar6 = cVar2;
        }
        if ((i & 4) != 0) {
            cVar7 = null;
        } else {
            cVar7 = cVar3;
        }
        if ((i & 8) != 0) {
            cVar8 = null;
        } else {
            cVar8 = cVar4;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        this(cVar5, cVar6, cVar7, cVar8, bool2);
    }
}
