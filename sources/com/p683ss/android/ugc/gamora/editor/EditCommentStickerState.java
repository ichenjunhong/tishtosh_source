package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerState */
public final class EditCommentStickerState implements C11932s {
    private final C49561h hideHelpBoxEvent;
    private final boolean inTimeEditView;

    public EditCommentStickerState() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ EditCommentStickerState copy$default(EditCommentStickerState editCommentStickerState, C49561h hVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = editCommentStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            z = editCommentStickerState.inTimeEditView;
        }
        return editCommentStickerState.copy(hVar, z);
    }

    public final C49561h component1() {
        return this.hideHelpBoxEvent;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final EditCommentStickerState copy(C49561h hVar, boolean z) {
        return new EditCommentStickerState(hVar, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditCommentStickerState) {
                EditCommentStickerState editCommentStickerState = (EditCommentStickerState) obj;
                if (C52711k.m112239a((Object) this.hideHelpBoxEvent, (Object) editCommentStickerState.hideHelpBoxEvent)) {
                    if (this.inTimeEditView == editCommentStickerState.inTimeEditView) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C49561h getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final int hashCode() {
        C49561h hVar = this.hideHelpBoxEvent;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        boolean z = this.inTimeEditView;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditCommentStickerState(hideHelpBoxEvent=");
        sb.append(this.hideHelpBoxEvent);
        sb.append(", inTimeEditView=");
        sb.append(this.inTimeEditView);
        sb.append(")");
        return sb.toString();
    }

    public EditCommentStickerState(C49561h hVar, boolean z) {
        this.hideHelpBoxEvent = hVar;
        this.inTimeEditView = z;
    }

    public /* synthetic */ EditCommentStickerState(C49561h hVar, boolean z, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            hVar = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        this(hVar, z);
    }
}
