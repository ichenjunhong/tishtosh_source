package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditAudioRecordModel */
public final class EditAudioRecordModel extends JediViewModel<EditAudioRecordState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditAudioRecordModel$a */
    static final class C48933a extends C52712l implements C52671b<EditAudioRecordState, EditAudioRecordState> {

        /* renamed from: a */
        final /* synthetic */ Boolean f123104a;

        C48933a(Boolean bool) {
            this.f123104a = bool;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditAudioRecordState editAudioRecordState = (EditAudioRecordState) obj;
            C52711k.m112240b(editAudioRecordState, "$receiver");
            return editAudioRecordState.copy(this.f123104a);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditAudioRecordState(null, 1, null);
    }

    /* renamed from: a */
    public final void mo96771a(Boolean bool) {
        mo22530c(new C48933a(bool));
    }
}
