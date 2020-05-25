package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditAudioEffectViewModel */
public final class EditAudioEffectViewModel extends JediViewModel<EditAudioEffectState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditAudioEffectViewModel$a */
    static final class C48931a extends C52712l implements C52671b<EditAudioEffectState, EditAudioEffectState> {

        /* renamed from: a */
        final /* synthetic */ Object f123102a;

        C48931a(Object obj) {
            this.f123102a = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditAudioEffectState editAudioEffectState = (EditAudioEffectState) obj;
            C52711k.m112240b(editAudioEffectState, "$receiver");
            return EditAudioEffectState.copy$default(editAudioEffectState, null, this.f123102a, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditAudioEffectViewModel$b */
    static final class C48932b extends C52712l implements C52671b<EditAudioEffectState, EditAudioEffectState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123103a;

        C48932b(boolean z) {
            this.f123103a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditAudioEffectState editAudioEffectState = (EditAudioEffectState) obj;
            C52711k.m112240b(editAudioEffectState, "$receiver");
            return EditAudioEffectState.copy$default(editAudioEffectState, Boolean.valueOf(this.f123103a), null, 2, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditAudioEffectState(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo96769a(Object obj) {
        mo22530c(new C48931a(obj));
    }

    /* renamed from: a */
    public final void mo96770a(boolean z) {
        mo22530c(new C48932b(z));
    }
}
