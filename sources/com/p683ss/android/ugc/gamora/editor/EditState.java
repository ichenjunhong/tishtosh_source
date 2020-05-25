package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.C49556c;
import com.p683ss.android.ugc.gamora.jedi.C49558e;
import com.p683ss.android.ugc.gamora.jedi.C49559f;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.gamora.editor.EditState */
public final class EditState implements C11932s {
    private final C49561h nextStepEvent;
    private final C49561h quitEvent;
    private final C49559f<Boolean, Boolean> showSettingEvent;
    private final C49558e toolBarClickEvent;
    private final C49556c updateLayout;
    private final C49561h updateStickerLayoutEvent;
    private final Integer viewStubTopMargin;

    public EditState() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.f, code=com.ss.android.ugc.gamora.jedi.f<java.lang.Boolean, java.lang.Boolean>, for r9v0, types: [com.ss.android.ugc.gamora.jedi.f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.gamora.editor.EditState copy$default(com.p683ss.android.ugc.gamora.editor.EditState r5, com.p683ss.android.ugc.gamora.jedi.C49561h r6, com.p683ss.android.ugc.gamora.jedi.C49561h r7, com.p683ss.android.ugc.gamora.jedi.C49558e r8, com.p683ss.android.ugc.gamora.jedi.C49559f<java.lang.Boolean, java.lang.Boolean> r9, java.lang.Integer r10, com.p683ss.android.ugc.gamora.jedi.C49556c r11, com.p683ss.android.ugc.gamora.jedi.C49561h r12, int r13, java.lang.Object r14) {
        /*
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            com.ss.android.ugc.gamora.jedi.h r6 = r5.quitEvent
        L_0x0006:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000c
            com.ss.android.ugc.gamora.jedi.h r7 = r5.nextStepEvent
        L_0x000c:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.jedi.e r8 = r5.toolBarClickEvent
        L_0x0013:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001a
            com.ss.android.ugc.gamora.jedi.f<java.lang.Boolean, java.lang.Boolean> r9 = r5.showSettingEvent
        L_0x001a:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0021
            java.lang.Integer r10 = r5.viewStubTopMargin
        L_0x0021:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0028
            com.ss.android.ugc.gamora.jedi.c r11 = r5.updateLayout
        L_0x0028:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x002f
            com.ss.android.ugc.gamora.jedi.h r12 = r5.updateStickerLayoutEvent
        L_0x002f:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            com.ss.android.ugc.gamora.editor.EditState r5 = r7.copy(r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditState.copy$default(com.ss.android.ugc.gamora.editor.EditState, com.ss.android.ugc.gamora.jedi.h, com.ss.android.ugc.gamora.jedi.h, com.ss.android.ugc.gamora.jedi.e, com.ss.android.ugc.gamora.jedi.f, java.lang.Integer, com.ss.android.ugc.gamora.jedi.c, com.ss.android.ugc.gamora.jedi.h, int, java.lang.Object):com.ss.android.ugc.gamora.editor.EditState");
    }

    public final C49561h component1() {
        return this.quitEvent;
    }

    public final C49561h component2() {
        return this.nextStepEvent;
    }

    public final C49558e component3() {
        return this.toolBarClickEvent;
    }

    public final C49559f<Boolean, Boolean> component4() {
        return this.showSettingEvent;
    }

    public final Integer component5() {
        return this.viewStubTopMargin;
    }

    public final C49556c component6() {
        return this.updateLayout;
    }

    public final C49561h component7() {
        return this.updateStickerLayoutEvent;
    }

    public final EditState copy(C49561h hVar, C49561h hVar2, C49558e eVar, C49559f<Boolean, Boolean> fVar, Integer num, C49556c cVar, C49561h hVar3) {
        EditState editState = new EditState(hVar, hVar2, eVar, fVar, num, cVar, hVar3);
        return editState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.updateStickerLayoutEvent, (java.lang.Object) r3.updateStickerLayoutEvent) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.p683ss.android.ugc.gamora.editor.EditState
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.gamora.editor.EditState r3 = (com.p683ss.android.ugc.gamora.editor.EditState) r3
            com.ss.android.ugc.gamora.jedi.h r0 = r2.quitEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.quitEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.gamora.jedi.h r0 = r2.nextStepEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.nextStepEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.gamora.jedi.e r0 = r2.toolBarClickEvent
            com.ss.android.ugc.gamora.jedi.e r1 = r3.toolBarClickEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.gamora.jedi.f<java.lang.Boolean, java.lang.Boolean> r0 = r2.showSettingEvent
            com.ss.android.ugc.gamora.jedi.f<java.lang.Boolean, java.lang.Boolean> r1 = r3.showSettingEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r2.viewStubTopMargin
            java.lang.Integer r1 = r3.viewStubTopMargin
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.gamora.jedi.c r0 = r2.updateLayout
            com.ss.android.ugc.gamora.jedi.c r1 = r3.updateLayout
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.gamora.jedi.h r0 = r2.updateStickerLayoutEvent
            com.ss.android.ugc.gamora.jedi.h r3 = r3.updateStickerLayoutEvent
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditState.equals(java.lang.Object):boolean");
    }

    public final C49561h getNextStepEvent() {
        return this.nextStepEvent;
    }

    public final C49561h getQuitEvent() {
        return this.quitEvent;
    }

    public final C49559f<Boolean, Boolean> getShowSettingEvent() {
        return this.showSettingEvent;
    }

    public final C49558e getToolBarClickEvent() {
        return this.toolBarClickEvent;
    }

    public final C49556c getUpdateLayout() {
        return this.updateLayout;
    }

    public final C49561h getUpdateStickerLayoutEvent() {
        return this.updateStickerLayoutEvent;
    }

    public final Integer getViewStubTopMargin() {
        return this.viewStubTopMargin;
    }

    public final int hashCode() {
        C49561h hVar = this.quitEvent;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C49561h hVar2 = this.nextStepEvent;
        int hashCode2 = (hashCode + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        C49558e eVar = this.toolBarClickEvent;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C49559f<Boolean, Boolean> fVar = this.showSettingEvent;
        int hashCode4 = (hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        Integer num = this.viewStubTopMargin;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        C49556c cVar = this.updateLayout;
        int hashCode6 = (hashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C49561h hVar3 = this.updateStickerLayoutEvent;
        if (hVar3 != null) {
            i = hVar3.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditState(quitEvent=");
        sb.append(this.quitEvent);
        sb.append(", nextStepEvent=");
        sb.append(this.nextStepEvent);
        sb.append(", toolBarClickEvent=");
        sb.append(this.toolBarClickEvent);
        sb.append(", showSettingEvent=");
        sb.append(this.showSettingEvent);
        sb.append(", viewStubTopMargin=");
        sb.append(this.viewStubTopMargin);
        sb.append(", updateLayout=");
        sb.append(this.updateLayout);
        sb.append(", updateStickerLayoutEvent=");
        sb.append(this.updateStickerLayoutEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditState(C49561h hVar, C49561h hVar2, C49558e eVar, C49559f<Boolean, Boolean> fVar, Integer num, C49556c cVar, C49561h hVar3) {
        this.quitEvent = hVar;
        this.nextStepEvent = hVar2;
        this.toolBarClickEvent = eVar;
        this.showSettingEvent = fVar;
        this.viewStubTopMargin = num;
        this.updateLayout = cVar;
        this.updateStickerLayoutEvent = hVar3;
    }

    public /* synthetic */ EditState(C49561h hVar, C49561h hVar2, C49558e eVar, C49559f fVar, Integer num, C49556c cVar, C49561h hVar3, int i, C52707g gVar) {
        C49561h hVar4;
        C49561h hVar5;
        C49558e eVar2;
        C49559f fVar2;
        Integer num2;
        C49556c cVar2;
        C49561h hVar6;
        if ((i & 1) != 0) {
            hVar4 = null;
        } else {
            hVar4 = hVar;
        }
        if ((i & 2) != 0) {
            hVar5 = null;
        } else {
            hVar5 = hVar2;
        }
        if ((i & 4) != 0) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        if ((i & 8) != 0) {
            fVar2 = null;
        } else {
            fVar2 = fVar;
        }
        if ((i & 16) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 32) != 0) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        if ((i & 64) != 0) {
            hVar6 = null;
        } else {
            hVar6 = hVar3;
        }
        this(hVar4, hVar5, eVar2, fVar2, num2, cVar2, hVar6);
    }
}
