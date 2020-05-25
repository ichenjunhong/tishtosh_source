package com.p683ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchState */
public final class StitchState implements C11932s {
    private final C49561h hideIntroduceEvent;
    private final C49561h quitEvent;
    private final C49561h showIntroduceEvent;
    private final C49561h showTrimmingNextGuideEvent;
    private final C49561h showTrimmingViewGuideEvent;

    public StitchState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ StitchState copy$default(StitchState stitchState, C49561h hVar, C49561h hVar2, C49561h hVar3, C49561h hVar4, C49561h hVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = stitchState.showIntroduceEvent;
        }
        if ((i & 2) != 0) {
            hVar2 = stitchState.hideIntroduceEvent;
        }
        C49561h hVar6 = hVar2;
        if ((i & 4) != 0) {
            hVar3 = stitchState.showTrimmingViewGuideEvent;
        }
        C49561h hVar7 = hVar3;
        if ((i & 8) != 0) {
            hVar4 = stitchState.showTrimmingNextGuideEvent;
        }
        C49561h hVar8 = hVar4;
        if ((i & 16) != 0) {
            hVar5 = stitchState.quitEvent;
        }
        return stitchState.copy(hVar, hVar6, hVar7, hVar8, hVar5);
    }

    public final C49561h component1() {
        return this.showIntroduceEvent;
    }

    public final C49561h component2() {
        return this.hideIntroduceEvent;
    }

    public final C49561h component3() {
        return this.showTrimmingViewGuideEvent;
    }

    public final C49561h component4() {
        return this.showTrimmingNextGuideEvent;
    }

    public final C49561h component5() {
        return this.quitEvent;
    }

    public final StitchState copy(C49561h hVar, C49561h hVar2, C49561h hVar3, C49561h hVar4, C49561h hVar5) {
        StitchState stitchState = new StitchState(hVar, hVar2, hVar3, hVar4, hVar5);
        return stitchState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.quitEvent, (java.lang.Object) r3.quitEvent) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchState
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchState r3 = (com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchState) r3
            com.ss.android.ugc.gamora.jedi.h r0 = r2.showIntroduceEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.showIntroduceEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.h r0 = r2.hideIntroduceEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.hideIntroduceEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.h r0 = r2.showTrimmingViewGuideEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.showTrimmingViewGuideEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.h r0 = r2.showTrimmingNextGuideEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.showTrimmingNextGuideEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.h r0 = r2.quitEvent
            com.ss.android.ugc.gamora.jedi.h r3 = r3.quitEvent
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchState.equals(java.lang.Object):boolean");
    }

    public final C49561h getHideIntroduceEvent() {
        return this.hideIntroduceEvent;
    }

    public final C49561h getQuitEvent() {
        return this.quitEvent;
    }

    public final C49561h getShowIntroduceEvent() {
        return this.showIntroduceEvent;
    }

    public final C49561h getShowTrimmingNextGuideEvent() {
        return this.showTrimmingNextGuideEvent;
    }

    public final C49561h getShowTrimmingViewGuideEvent() {
        return this.showTrimmingViewGuideEvent;
    }

    public final int hashCode() {
        C49561h hVar = this.showIntroduceEvent;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C49561h hVar2 = this.hideIntroduceEvent;
        int hashCode2 = (hashCode + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        C49561h hVar3 = this.showTrimmingViewGuideEvent;
        int hashCode3 = (hashCode2 + (hVar3 != null ? hVar3.hashCode() : 0)) * 31;
        C49561h hVar4 = this.showTrimmingNextGuideEvent;
        int hashCode4 = (hashCode3 + (hVar4 != null ? hVar4.hashCode() : 0)) * 31;
        C49561h hVar5 = this.quitEvent;
        if (hVar5 != null) {
            i = hVar5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StitchState(showIntroduceEvent=");
        sb.append(this.showIntroduceEvent);
        sb.append(", hideIntroduceEvent=");
        sb.append(this.hideIntroduceEvent);
        sb.append(", showTrimmingViewGuideEvent=");
        sb.append(this.showTrimmingViewGuideEvent);
        sb.append(", showTrimmingNextGuideEvent=");
        sb.append(this.showTrimmingNextGuideEvent);
        sb.append(", quitEvent=");
        sb.append(this.quitEvent);
        sb.append(")");
        return sb.toString();
    }

    public StitchState(C49561h hVar, C49561h hVar2, C49561h hVar3, C49561h hVar4, C49561h hVar5) {
        this.showIntroduceEvent = hVar;
        this.hideIntroduceEvent = hVar2;
        this.showTrimmingViewGuideEvent = hVar3;
        this.showTrimmingNextGuideEvent = hVar4;
        this.quitEvent = hVar5;
    }

    public /* synthetic */ StitchState(C49561h hVar, C49561h hVar2, C49561h hVar3, C49561h hVar4, C49561h hVar5, int i, C52707g gVar) {
        C49561h hVar6;
        C49561h hVar7;
        C49561h hVar8;
        C49561h hVar9;
        C49561h hVar10;
        if ((i & 1) != 0) {
            hVar6 = null;
        } else {
            hVar6 = hVar;
        }
        if ((i & 2) != 0) {
            hVar7 = null;
        } else {
            hVar7 = hVar2;
        }
        if ((i & 4) != 0) {
            hVar8 = null;
        } else {
            hVar8 = hVar3;
        }
        if ((i & 8) != 0) {
            hVar9 = null;
        } else {
            hVar9 = hVar4;
        }
        if ((i & 16) != 0) {
            hVar10 = null;
        } else {
            hVar10 = hVar5;
        }
        this(hVar6, hVar7, hVar8, hVar9, hVar10);
    }
}
