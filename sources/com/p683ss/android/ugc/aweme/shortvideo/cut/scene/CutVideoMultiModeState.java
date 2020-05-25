package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.C49556c;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState */
public final class CutVideoMultiModeState implements C11932s {
    private final C49556c dismissAnimateEvent;
    private final C49556c showAnimateEvent;
    private final Integer value;

    public CutVideoMultiModeState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CutVideoMultiModeState copy$default(CutVideoMultiModeState cutVideoMultiModeState, Integer num, C49556c cVar, C49556c cVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = cutVideoMultiModeState.value;
        }
        if ((i & 2) != 0) {
            cVar = cutVideoMultiModeState.showAnimateEvent;
        }
        if ((i & 4) != 0) {
            cVar2 = cutVideoMultiModeState.dismissAnimateEvent;
        }
        return cutVideoMultiModeState.copy(num, cVar, cVar2);
    }

    public final Integer component1() {
        return this.value;
    }

    public final C49556c component2() {
        return this.showAnimateEvent;
    }

    public final C49556c component3() {
        return this.dismissAnimateEvent;
    }

    public final CutVideoMultiModeState copy(Integer num, C49556c cVar, C49556c cVar2) {
        return new CutVideoMultiModeState(num, cVar, cVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.dismissAnimateEvent, (java.lang.Object) r3.dismissAnimateEvent) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState r3 = (com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState) r3
            java.lang.Integer r0 = r2.value
            java.lang.Integer r1 = r3.value
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.jedi.c r0 = r2.showAnimateEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.showAnimateEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.jedi.c r0 = r2.dismissAnimateEvent
            com.ss.android.ugc.gamora.jedi.c r3 = r3.dismissAnimateEvent
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState.equals(java.lang.Object):boolean");
    }

    public final C49556c getDismissAnimateEvent() {
        return this.dismissAnimateEvent;
    }

    public final C49556c getShowAnimateEvent() {
        return this.showAnimateEvent;
    }

    public final Integer getValue() {
        return this.value;
    }

    public final int hashCode() {
        Integer num = this.value;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        C49556c cVar = this.showAnimateEvent;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C49556c cVar2 = this.dismissAnimateEvent;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoMultiModeState(value=");
        sb.append(this.value);
        sb.append(", showAnimateEvent=");
        sb.append(this.showAnimateEvent);
        sb.append(", dismissAnimateEvent=");
        sb.append(this.dismissAnimateEvent);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoMultiModeState(Integer num, C49556c cVar, C49556c cVar2) {
        this.value = num;
        this.showAnimateEvent = cVar;
        this.dismissAnimateEvent = cVar2;
    }

    public /* synthetic */ CutVideoMultiModeState(Integer num, C49556c cVar, C49556c cVar2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            cVar = null;
        }
        if ((i & 4) != 0) {
            cVar2 = null;
        }
        this(num, cVar, cVar2);
    }
}
