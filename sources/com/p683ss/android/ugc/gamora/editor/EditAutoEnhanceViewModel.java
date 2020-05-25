package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditAutoEnhanceViewModel */
public final class EditAutoEnhanceViewModel extends JediViewModel<EditAutoEnhanceState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditAutoEnhanceViewModel$a */
    static final class C48934a extends C52712l implements C52671b<EditAutoEnhanceState, EditAutoEnhanceState> {

        /* renamed from: a */
        public static final C48934a f123105a = new C48934a();

        C48934a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditAutoEnhanceState editAutoEnhanceState = (EditAutoEnhanceState) obj;
            C52711k.m112240b(editAutoEnhanceState, "$receiver");
            return EditAutoEnhanceState.copy$default(editAutoEnhanceState, null, new C49561h(), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditAutoEnhanceViewModel$b */
    static final class C48935b extends C52712l implements C52671b<EditAutoEnhanceState, EditAutoEnhanceState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123106a;

        C48935b(boolean z) {
            this.f123106a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditAutoEnhanceState editAutoEnhanceState = (EditAutoEnhanceState) obj;
            C52711k.m112240b(editAutoEnhanceState, "$receiver");
            return EditAutoEnhanceState.copy$default(editAutoEnhanceState, Boolean.valueOf(this.f123106a), null, 2, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditAutoEnhanceState(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo96786a(boolean z) {
        mo22530c(new C48935b(z));
    }
}
