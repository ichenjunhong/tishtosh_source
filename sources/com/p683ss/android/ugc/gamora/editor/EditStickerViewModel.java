package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
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

/* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel */
public final class EditStickerViewModel extends JediViewModel<EditStickerState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123184d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditStickerViewModel.class), "stickerEditableInTimeEdit", "getStickerEditableInTimeEdit()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditStickerViewModel.class), "stickerEditableInPinEdit", "getStickerEditableInPinEdit()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditStickerViewModel.class), "stickerEditable", "getStickerEditable()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f123185e = C52732g.m112285a(C48987e.f123193a);

    /* renamed from: f */
    private final C52668f f123186f = C52732g.m112285a(C48986d.f123192a);

    /* renamed from: g */
    private final C52668f f123187g = C52732g.m112285a(C48985c.f123191a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$a */
    public static final class C48983a extends C52712l implements C52671b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f123188a;

        /* renamed from: b */
        final /* synthetic */ long f123189b;

        public C48983a(float f, long j) {
            this.f123188a = f;
            this.f123189b = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditStickerState editStickerState = (EditStickerState) obj;
            C52711k.m112240b(editStickerState, "$receiver");
            return EditStickerState.copy$default(editStickerState, null, new C49559f(new C52847n(Float.valueOf(this.f123188a), Long.valueOf(this.f123189b))), null, null, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$b */
    public static final class C48984b extends C52712l implements C52671b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ Integer f123190a;

        public C48984b(Integer num) {
            this.f123190a = num;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditStickerState editStickerState = (EditStickerState) obj;
            C52711k.m112240b(editStickerState, "$receiver");
            return EditStickerState.copy$default(editStickerState, this.f123190a, null, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$c */
    static final class C48985c extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C48985c f123191a = new C48985c();

        C48985c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$d */
    static final class C48986d extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C48986d f123192a = new C48986d();

        C48986d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$e */
    static final class C48987e extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C48987e f123193a = new C48987e();

        C48987e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$f */
    public static final class C48988f extends C52712l implements C52671b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f123194a;

        /* renamed from: b */
        final /* synthetic */ float f123195b;

        /* renamed from: c */
        final /* synthetic */ float f123196c;

        public C48988f(float f, float f2, float f3) {
            this.f123194a = f;
            this.f123195b = f2;
            this.f123196c = f3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditStickerState editStickerState = (EditStickerState) obj;
            C52711k.m112240b(editStickerState, "$receiver");
            return EditStickerState.copy$default(editStickerState, null, null, null, new C49560g(new C52855s(Float.valueOf(this.f123194a), Float.valueOf(this.f123195b), Float.valueOf(this.f123196c))), 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerViewModel$g */
    public static final class C48989g extends C52712l implements C52671b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f123197a;

        /* renamed from: b */
        final /* synthetic */ float f123198b;

        /* renamed from: c */
        final /* synthetic */ float f123199c;

        public C48989g(float f, float f2, float f3) {
            this.f123197a = f;
            this.f123198b = f2;
            this.f123199c = f3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditStickerState editStickerState = (EditStickerState) obj;
            C52711k.m112240b(editStickerState, "$receiver");
            return EditStickerState.copy$default(editStickerState, null, null, new C49560g(new C52855s(Float.valueOf(this.f123197a), Float.valueOf(this.f123198b), Float.valueOf(this.f123199c))), null, 11, null);
        }
    }

    /* renamed from: e */
    public final C0198r<Boolean> mo96966e() {
        return (C0198r) this.f123185e.getValue();
    }

    /* renamed from: f */
    public final C0198r<Boolean> mo96967f() {
        return (C0198r) this.f123186f.getValue();
    }

    /* renamed from: g */
    public final C0198r<Boolean> mo96968g() {
        return (C0198r) this.f123187g.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        EditStickerState editStickerState = new EditStickerState(null, null, null, null, 15, null);
        return editStickerState;
    }
}
