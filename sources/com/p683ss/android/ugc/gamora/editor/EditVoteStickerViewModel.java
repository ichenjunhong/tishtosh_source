package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
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

/* renamed from: com.ss.android.ugc.gamora.editor.EditVoteStickerViewModel */
public final class EditVoteStickerViewModel extends JediViewModel<EditVoteStickerState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123263d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditVoteStickerViewModel.class), "viewAlpha", "getViewAlpha()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f123264e = C52732g.m112285a(C49031c.f123267a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVoteStickerViewModel$a */
    static final class C49029a extends C52712l implements C52671b<EditVoteStickerState, EditVoteStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123265a;

        C49029a(boolean z) {
            this.f123265a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditVoteStickerState editVoteStickerState = (EditVoteStickerState) obj;
            C52711k.m112240b(editVoteStickerState, "$receiver");
            return EditVoteStickerState.copy$default(editVoteStickerState, null, Boolean.valueOf(this.f123265a), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVoteStickerViewModel$b */
    static final class C49030b extends C52712l implements C52671b<EditVoteStickerState, EditVoteStickerState> {

        /* renamed from: a */
        public static final C49030b f123266a = new C49030b();

        C49030b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditVoteStickerState editVoteStickerState = (EditVoteStickerState) obj;
            C52711k.m112240b(editVoteStickerState, "$receiver");
            return EditVoteStickerState.copy$default(editVoteStickerState, new C49561h(), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVoteStickerViewModel$c */
    static final class C49031c extends C52712l implements C52670a<C0198r<Float>> {

        /* renamed from: a */
        public static final C49031c f123267a = new C49031c();

        C49031c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: f */
    public final C0198r<Float> mo97079f() {
        return (C0198r) this.f123264e.getValue();
    }

    /* renamed from: e */
    public final void mo97078e() {
        mo22530c(C49030b.f123266a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditVoteStickerState(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo97077a(float f) {
        mo97079f().setValue(Float.valueOf(f));
    }
}
