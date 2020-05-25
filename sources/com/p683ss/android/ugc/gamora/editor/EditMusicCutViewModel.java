package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import p2628d.C52855s;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditMusicCutViewModel */
public final class EditMusicCutViewModel extends BaseJediViewModel<EditMusicCutState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicCutViewModel$a */
    static final class C48965a extends C52712l implements C52671b<EditMusicCutState, EditMusicCutState> {

        /* renamed from: a */
        final /* synthetic */ int f123154a;

        C48965a(int i) {
            this.f123154a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditMusicCutState editMusicCutState = (EditMusicCutState) obj;
            C52711k.m112240b(editMusicCutState, "$receiver");
            return EditMusicCutState.copy$default(editMusicCutState, null, Integer.valueOf(this.f123154a), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicCutViewModel$b */
    static final class C48966b extends C52712l implements C52671b<EditMusicCutState, EditMusicCutState> {

        /* renamed from: a */
        final /* synthetic */ C43203d f123155a;

        /* renamed from: b */
        final /* synthetic */ int f123156b;

        /* renamed from: c */
        final /* synthetic */ int f123157c;

        C48966b(C43203d dVar, int i, int i2) {
            this.f123155a = dVar;
            this.f123156b = i;
            this.f123157c = i2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditMusicCutState editMusicCutState = (EditMusicCutState) obj;
            C52711k.m112240b(editMusicCutState, "$receiver");
            return EditMusicCutState.copy$default(editMusicCutState, new C52855s(this.f123155a, Integer.valueOf(this.f123156b), Integer.valueOf(this.f123157c)), null, 2, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditMusicCutState(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo96890a(int i) {
        mo22530c(new C48965a(i));
    }

    /* renamed from: a */
    public final void mo96891a(C43203d dVar, int i, int i2) {
        mo22530c(new C48966b(dVar, i, 0));
    }
}
