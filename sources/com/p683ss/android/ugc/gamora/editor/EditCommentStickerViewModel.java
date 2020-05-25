package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel */
public final class EditCommentStickerViewModel extends BaseJediViewModel<EditCommentStickerState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123107d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditCommentStickerViewModel.class), "viewAlpha", "getViewAlpha()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    C0198r<Boolean> f123108e;

    /* renamed from: f */
    private final C52668f f123109f = C52732g.m112285a(C48938c.f123112a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel$a */
    static final class C48936a extends C52712l implements C52671b<EditCommentStickerState, EditCommentStickerState> {

        /* renamed from: a */
        public static final C48936a f123110a = new C48936a();

        C48936a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditCommentStickerState editCommentStickerState = (EditCommentStickerState) obj;
            C52711k.m112240b(editCommentStickerState, "$receiver");
            return EditCommentStickerState.copy$default(editCommentStickerState, new C49561h(), false, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel$b */
    static final class C48937b extends C52712l implements C52671b<EditCommentStickerState, EditCommentStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123111a;

        C48937b(boolean z) {
            this.f123111a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditCommentStickerState editCommentStickerState = (EditCommentStickerState) obj;
            C52711k.m112240b(editCommentStickerState, "$receiver");
            return EditCommentStickerState.copy$default(editCommentStickerState, null, this.f123111a, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel$c */
    static final class C48938c extends C52712l implements C52670a<C0198r<Float>> {

        /* renamed from: a */
        public static final C48938c f123112a = new C48938c();

        C48938c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: f */
    public final C0198r<Float> mo96798f() {
        return (C0198r) this.f123109f.getValue();
    }

    /* renamed from: e */
    public final void mo96797e() {
        mo22530c(C48936a.f123110a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditCommentStickerState(null, false, 3, null);
    }

    /* renamed from: a */
    public final void mo96795a(float f) {
        mo96798f().setValue(Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo96796a(boolean z) {
        mo22530c(new C48937b(z));
        C0198r<Boolean> rVar = this.f123108e;
        if (rVar != null && (!C52711k.m112239a((Object) (Boolean) rVar.getValue(), (Object) Boolean.valueOf(z)))) {
            rVar.setValue(Boolean.valueOf(z));
        }
    }
}
