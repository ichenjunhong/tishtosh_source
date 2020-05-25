package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.gamora.editor.EditFilterState */
public final class EditFilterState implements C11932s {
    private final C49561h showFilterPanelEvent;

    public EditFilterState() {
        this(null, 1, null);
    }

    public static /* synthetic */ EditFilterState copy$default(EditFilterState editFilterState, C49561h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = editFilterState.showFilterPanelEvent;
        }
        return editFilterState.copy(hVar);
    }

    public final C49561h component1() {
        return this.showFilterPanelEvent;
    }

    public final EditFilterState copy(C49561h hVar) {
        return new EditFilterState(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.showFilterPanelEvent, (java.lang.Object) ((com.p683ss.android.ugc.gamora.editor.EditFilterState) r2).showFilterPanelEvent) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.gamora.editor.EditFilterState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.editor.EditFilterState r2 = (com.p683ss.android.ugc.gamora.editor.EditFilterState) r2
            com.ss.android.ugc.gamora.jedi.h r0 = r1.showFilterPanelEvent
            com.ss.android.ugc.gamora.jedi.h r2 = r2.showFilterPanelEvent
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditFilterState.equals(java.lang.Object):boolean");
    }

    public final C49561h getShowFilterPanelEvent() {
        return this.showFilterPanelEvent;
    }

    public final int hashCode() {
        C49561h hVar = this.showFilterPanelEvent;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditFilterState(showFilterPanelEvent=");
        sb.append(this.showFilterPanelEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditFilterState(C49561h hVar) {
        this.showFilterPanelEvent = hVar;
    }

    public /* synthetic */ EditFilterState(C49561h hVar, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            hVar = null;
        }
        this(hVar);
    }
}
