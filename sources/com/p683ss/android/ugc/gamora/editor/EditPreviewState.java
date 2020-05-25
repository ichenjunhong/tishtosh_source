package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.C49556c;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewState */
public final class EditPreviewState implements C11932s {
    private final C49556c autoStartStopArbiterEvent;
    private final Integer backgroundColor;
    private final C49561h editPrepareDone;

    public EditPreviewState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EditPreviewState copy$default(EditPreviewState editPreviewState, C49561h hVar, Integer num, C49556c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = editPreviewState.editPrepareDone;
        }
        if ((i & 2) != 0) {
            num = editPreviewState.backgroundColor;
        }
        if ((i & 4) != 0) {
            cVar = editPreviewState.autoStartStopArbiterEvent;
        }
        return editPreviewState.copy(hVar, num, cVar);
    }

    public final C49561h component1() {
        return this.editPrepareDone;
    }

    public final Integer component2() {
        return this.backgroundColor;
    }

    public final C49556c component3() {
        return this.autoStartStopArbiterEvent;
    }

    public final EditPreviewState copy(C49561h hVar, Integer num, C49556c cVar) {
        return new EditPreviewState(hVar, num, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.autoStartStopArbiterEvent, (java.lang.Object) r3.autoStartStopArbiterEvent) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.gamora.editor.EditPreviewState
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.editor.EditPreviewState r3 = (com.p683ss.android.ugc.gamora.editor.EditPreviewState) r3
            com.ss.android.ugc.gamora.jedi.h r0 = r2.editPrepareDone
            com.ss.android.ugc.gamora.jedi.h r1 = r3.editPrepareDone
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.backgroundColor
            java.lang.Integer r1 = r3.backgroundColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.jedi.c r0 = r2.autoStartStopArbiterEvent
            com.ss.android.ugc.gamora.jedi.c r3 = r3.autoStartStopArbiterEvent
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditPreviewState.equals(java.lang.Object):boolean");
    }

    public final C49556c getAutoStartStopArbiterEvent() {
        return this.autoStartStopArbiterEvent;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final C49561h getEditPrepareDone() {
        return this.editPrepareDone;
    }

    public final int hashCode() {
        C49561h hVar = this.editPrepareDone;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        Integer num = this.backgroundColor;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        C49556c cVar = this.autoStartStopArbiterEvent;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditPreviewState(editPrepareDone=");
        sb.append(this.editPrepareDone);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", autoStartStopArbiterEvent=");
        sb.append(this.autoStartStopArbiterEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditPreviewState(C49561h hVar, Integer num, C49556c cVar) {
        this.editPrepareDone = hVar;
        this.backgroundColor = num;
        this.autoStartStopArbiterEvent = cVar;
    }

    public /* synthetic */ EditPreviewState(C49561h hVar, Integer num, C49556c cVar, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            hVar = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            cVar = null;
        }
        this(hVar, num, cVar);
    }
}
