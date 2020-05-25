package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49556c;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditStickerPanelViewModel */
public final class EditStickerPanelViewModel extends JediViewModel<EditStickerPanelState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerPanelViewModel$a */
    static final class C48982a extends C52712l implements C52671b<EditStickerPanelState, EditStickerPanelState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123183a;

        C48982a(boolean z) {
            this.f123183a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditStickerPanelState editStickerPanelState = (EditStickerPanelState) obj;
            C52711k.m112240b(editStickerPanelState, "$receiver");
            return editStickerPanelState.copy(new C49556c(this.f123183a));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditStickerPanelState(null, 1, null);
    }

    /* renamed from: a */
    public final void mo96953a(boolean z) {
        mo22530c(new C48982a(z));
    }
}
