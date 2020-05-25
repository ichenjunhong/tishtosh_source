package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.EditFilterIndicatorState */
public final class EditFilterIndicatorState implements C11932s {
    private final C31459g currentFilter;
    private final boolean isAutoUse;

    public static /* synthetic */ EditFilterIndicatorState copy$default(EditFilterIndicatorState editFilterIndicatorState, boolean z, C31459g gVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = editFilterIndicatorState.isAutoUse;
        }
        if ((i & 2) != 0) {
            gVar = editFilterIndicatorState.currentFilter;
        }
        return editFilterIndicatorState.copy(z, gVar);
    }

    public final boolean component1() {
        return this.isAutoUse;
    }

    public final C31459g component2() {
        return this.currentFilter;
    }

    public final EditFilterIndicatorState copy(boolean z, C31459g gVar) {
        return new EditFilterIndicatorState(z, gVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditFilterIndicatorState) {
                EditFilterIndicatorState editFilterIndicatorState = (EditFilterIndicatorState) obj;
                if (!(this.isAutoUse == editFilterIndicatorState.isAutoUse) || !C52711k.m112239a((Object) this.currentFilter, (Object) editFilterIndicatorState.currentFilter)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C31459g getCurrentFilter() {
        return this.currentFilter;
    }

    public final int hashCode() {
        boolean z = this.isAutoUse;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        C31459g gVar = this.currentFilter;
        return i + (gVar != null ? gVar.hashCode() : 0);
    }

    public final boolean isAutoUse() {
        return this.isAutoUse;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditFilterIndicatorState(isAutoUse=");
        sb.append(this.isAutoUse);
        sb.append(", currentFilter=");
        sb.append(this.currentFilter);
        sb.append(")");
        return sb.toString();
    }

    public EditFilterIndicatorState(boolean z, C31459g gVar) {
        this.isAutoUse = z;
        this.currentFilter = gVar;
    }

    public /* synthetic */ EditFilterIndicatorState(boolean z, C31459g gVar, int i, C52707g gVar2) {
        if ((i & 2) != 0) {
            gVar = null;
        }
        this(z, gVar);
    }
}
