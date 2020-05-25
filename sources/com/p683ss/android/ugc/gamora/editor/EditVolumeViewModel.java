package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditVolumeViewModel */
public final class EditVolumeViewModel extends JediViewModel<EditVolumeState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVolumeViewModel$a */
    static final class C49026a extends C52712l implements C52671b<EditVolumeState, EditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ String f123260a;

        C49026a(String str) {
            this.f123260a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditVolumeState editVolumeState = (EditVolumeState) obj;
            C52711k.m112240b(editVolumeState, "$receiver");
            return EditVolumeState.copy$default(editVolumeState, this.f123260a, null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVolumeViewModel$b */
    static final class C49027b extends C52712l implements C52671b<EditVolumeState, EditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ int f123261a;

        C49027b(int i) {
            this.f123261a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditVolumeState editVolumeState = (EditVolumeState) obj;
            C52711k.m112240b(editVolumeState, "$receiver");
            return EditVolumeState.copy$default(editVolumeState, null, null, Integer.valueOf(this.f123261a), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVolumeViewModel$c */
    static final class C49028c extends C52712l implements C52671b<EditVolumeState, EditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ String f123262a;

        C49028c(String str) {
            this.f123262a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditVolumeState editVolumeState = (EditVolumeState) obj;
            C52711k.m112240b(editVolumeState, "$receiver");
            return EditVolumeState.copy$default(editVolumeState, null, this.f123262a, null, 5, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        EditVolumeState editVolumeState = new EditVolumeState(null, null, null, 7, null);
        return editVolumeState;
    }

    /* renamed from: a */
    public final void mo97066a(int i) {
        mo22530c(new C49027b(i));
    }

    /* renamed from: b */
    public final void mo97068b(String str) {
        C52711k.m112240b(str, "value");
        mo22530c(new C49028c(str));
    }

    /* renamed from: a */
    public final void mo97067a(String str) {
        C52711k.m112240b(str, "value");
        mo22530c(new C49026a(str));
    }
}
