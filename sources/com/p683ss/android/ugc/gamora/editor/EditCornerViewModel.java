package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditCornerViewModel */
public final class EditCornerViewModel extends JediViewModel<EditCornerState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCornerViewModel$a */
    static final class C48939a extends C52712l implements C52671b<EditCornerState, EditCornerState> {

        /* renamed from: a */
        final /* synthetic */ int f123113a;

        C48939a(int i) {
            this.f123113a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditCornerState editCornerState = (EditCornerState) obj;
            C52711k.m112240b(editCornerState, "$receiver");
            return EditCornerState.copy$default(editCornerState, null, null, Integer.valueOf(this.f123113a), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCornerViewModel$b */
    static final class C48940b extends C52712l implements C52671b<EditCornerState, EditCornerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123114a;

        C48940b(boolean z) {
            this.f123114a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditCornerState editCornerState = (EditCornerState) obj;
            C52711k.m112240b(editCornerState, "$receiver");
            return EditCornerState.copy$default(editCornerState, Boolean.valueOf(this.f123114a), null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCornerViewModel$c */
    static final class C48941c extends C52712l implements C52671b<EditCornerState, EditCornerState> {

        /* renamed from: a */
        final /* synthetic */ int f123115a;

        C48941c(int i) {
            this.f123115a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditCornerState editCornerState = (EditCornerState) obj;
            C52711k.m112240b(editCornerState, "$receiver");
            return EditCornerState.copy$default(editCornerState, null, Integer.valueOf(this.f123115a), null, 5, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        EditCornerState editCornerState = new EditCornerState(null, null, null, 7, null);
        return editCornerState;
    }

    /* renamed from: a */
    public final void mo96809a(int i) {
        mo22530c(new C48941c(i));
    }

    /* renamed from: b */
    public final void mo96811b(int i) {
        mo22530c(new C48939a(i));
    }

    /* renamed from: a */
    public final void mo96810a(boolean z) {
        mo22530c(new C48940b(z));
    }
}
