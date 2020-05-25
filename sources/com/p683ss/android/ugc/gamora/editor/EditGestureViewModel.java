package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.gamora.jedi.C49559f;
import com.p683ss.android.ugc.gamora.jedi.C49560g;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52855s;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.editor.EditGestureViewModel */
public final class EditGestureViewModel extends JediViewModel<EditGestureState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123125d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditGestureViewModel.class), "curFilter", "getCurFilter()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f123126e = C52732g.m112285a(C48947b.f123129a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditGestureViewModel$a */
    public static final class C48946a extends C52712l implements C52671b<EditGestureState, EditGestureState> {

        /* renamed from: a */
        final /* synthetic */ float f123127a;

        /* renamed from: b */
        final /* synthetic */ long f123128b;

        public C48946a(float f, long j) {
            this.f123127a = f;
            this.f123128b = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditGestureState editGestureState = (EditGestureState) obj;
            C52711k.m112240b(editGestureState, "$receiver");
            return EditGestureState.copy$default(editGestureState, null, new C49559f(new C52847n(Float.valueOf(this.f123127a), Long.valueOf(this.f123128b))), null, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditGestureViewModel$b */
    static final class C48947b extends C52712l implements C52670a<C0198r<C31459g>> {

        /* renamed from: a */
        public static final C48947b f123129a = new C48947b();

        C48947b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditGestureViewModel$c */
    public static final class C48948c extends C52712l implements C52671b<EditGestureState, EditGestureState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123130a;

        public C48948c(boolean z) {
            this.f123130a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditGestureState editGestureState = (EditGestureState) obj;
            C52711k.m112240b(editGestureState, "$receiver");
            return EditGestureState.copy$default(editGestureState, Boolean.valueOf(this.f123130a), null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditGestureViewModel$d */
    public static final class C48949d extends C52712l implements C52671b<EditGestureState, EditGestureState> {

        /* renamed from: a */
        final /* synthetic */ float f123131a;

        /* renamed from: b */
        final /* synthetic */ float f123132b;

        /* renamed from: c */
        final /* synthetic */ float f123133c;

        public C48949d(float f, float f2, float f3) {
            this.f123131a = f;
            this.f123132b = f2;
            this.f123133c = f3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditGestureState editGestureState = (EditGestureState) obj;
            C52711k.m112240b(editGestureState, "$receiver");
            return EditGestureState.copy$default(editGestureState, null, null, new C49560g(new C52855s(Float.valueOf(this.f123131a), Float.valueOf(this.f123132b), Float.valueOf(this.f123133c))), 3, null);
        }
    }

    /* renamed from: e */
    public final C0198r<C31459g> mo96839e() {
        return (C0198r) this.f123126e.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        EditGestureState editGestureState = new EditGestureState(null, null, null, 7, null);
        return editGestureState;
    }
}
