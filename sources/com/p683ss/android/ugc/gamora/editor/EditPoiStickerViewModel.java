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

/* renamed from: com.ss.android.ugc.gamora.editor.EditPoiStickerViewModel */
public final class EditPoiStickerViewModel extends JediViewModel<EditPoiStickerState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123165d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditPoiStickerViewModel.class), "viewAlpha", "getViewAlpha()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f123166e = C52732g.m112285a(C48973b.f123168a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPoiStickerViewModel$a */
    static final class C48972a extends C52712l implements C52671b<EditPoiStickerState, EditPoiStickerState> {

        /* renamed from: a */
        public static final C48972a f123167a = new C48972a();

        C48972a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditPoiStickerState editPoiStickerState = (EditPoiStickerState) obj;
            C52711k.m112240b(editPoiStickerState, "$receiver");
            return editPoiStickerState.copy(new C49561h());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPoiStickerViewModel$b */
    static final class C48973b extends C52712l implements C52670a<C0198r<Float>> {

        /* renamed from: a */
        public static final C48973b f123168a = new C48973b();

        C48973b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: f */
    public final C0198r<Float> mo96911f() {
        return (C0198r) this.f123166e.getValue();
    }

    /* renamed from: e */
    public final void mo96910e() {
        mo22530c(C48972a.f123167a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditPoiStickerState(null, 1, null);
    }

    /* renamed from: a */
    public final void mo96909a(float f) {
        mo96911f().setValue(Float.valueOf(f));
    }
}
