package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerState */
public final class EditDonationStickerState implements C11932s {
    private final C49561h hideHelpBoxEvent;
    private final boolean inTimeEditView;

    public EditDonationStickerState() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ EditDonationStickerState copy$default(EditDonationStickerState editDonationStickerState, C49561h hVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = editDonationStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            z = editDonationStickerState.inTimeEditView;
        }
        return editDonationStickerState.copy(hVar, z);
    }

    public final C49561h component1() {
        return this.hideHelpBoxEvent;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final EditDonationStickerState copy(C49561h hVar, boolean z) {
        return new EditDonationStickerState(hVar, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditDonationStickerState) {
                EditDonationStickerState editDonationStickerState = (EditDonationStickerState) obj;
                if (C52711k.m112239a((Object) this.hideHelpBoxEvent, (Object) editDonationStickerState.hideHelpBoxEvent)) {
                    if (this.inTimeEditView == editDonationStickerState.inTimeEditView) {
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
        StringBuilder sb = new StringBuilder("EditDonationStickerState(hideHelpBoxEvent=");
        sb.append(this.hideHelpBoxEvent);
        sb.append(", inTimeEditView=");
        sb.append(this.inTimeEditView);
        sb.append(")");
        return sb.toString();
    }

    public EditDonationStickerState(C49561h hVar, boolean z) {
        this.hideHelpBoxEvent = hVar;
        this.inTimeEditView = z;
    }

    public /* synthetic */ EditDonationStickerState(C49561h hVar, boolean z, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            hVar = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        this(hVar, z);
    }
}
