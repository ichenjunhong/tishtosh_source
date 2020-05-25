package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49559f;
import com.p683ss.android.ugc.gamora.jedi.C49560g;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.C52847n;
import p2628d.C52855s;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel */
public final class EditInfoStickerViewModel extends JediViewModel<EditInfoStickerState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel$a */
    public static final class C48950a extends C52712l implements C52671b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f123134a;

        /* renamed from: b */
        final /* synthetic */ long f123135b;

        public C48950a(float f, long j) {
            this.f123134a = f;
            this.f123135b = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditInfoStickerState editInfoStickerState = (EditInfoStickerState) obj;
            C52711k.m112240b(editInfoStickerState, "$receiver");
            return EditInfoStickerState.copy$default(editInfoStickerState, null, null, null, new C49559f(new C52847n(Float.valueOf(this.f123134a), Long.valueOf(this.f123135b))), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel$b */
    public static final class C48951b extends C52712l implements C52671b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ StickerItemModel f123136a;

        public C48951b(StickerItemModel stickerItemModel) {
            this.f123136a = stickerItemModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditInfoStickerState editInfoStickerState = (EditInfoStickerState) obj;
            C52711k.m112240b(editInfoStickerState, "$receiver");
            return EditInfoStickerState.copy$default(editInfoStickerState, null, null, new C49555b(this.f123136a), null, null, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel$c */
    static final class C48952c extends C52712l implements C52671b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        public static final C48952c f123137a = new C48952c();

        C48952c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditInfoStickerState editInfoStickerState = (EditInfoStickerState) obj;
            C52711k.m112240b(editInfoStickerState, "$receiver");
            return EditInfoStickerState.copy$default(editInfoStickerState, new C49561h(), null, null, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel$d */
    static final class C48953d extends C52712l implements C52671b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ C52847n f123138a;

        C48953d(C52847n nVar) {
            this.f123138a = nVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditInfoStickerState editInfoStickerState = (EditInfoStickerState) obj;
            C52711k.m112240b(editInfoStickerState, "$receiver");
            return EditInfoStickerState.copy$default(editInfoStickerState, null, new C49559f(this.f123138a), null, null, null, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel$e */
    public static final class C48954e extends C52712l implements C52671b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f123139a;

        /* renamed from: b */
        final /* synthetic */ float f123140b;

        /* renamed from: c */
        final /* synthetic */ float f123141c;

        public C48954e(float f, float f2, float f3) {
            this.f123139a = f;
            this.f123140b = f2;
            this.f123141c = f3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditInfoStickerState editInfoStickerState = (EditInfoStickerState) obj;
            C52711k.m112240b(editInfoStickerState, "$receiver");
            return EditInfoStickerState.copy$default(editInfoStickerState, null, null, null, null, new C49560g(new C52855s(Float.valueOf(this.f123139a), Float.valueOf(this.f123140b), Float.valueOf(this.f123141c))), 15, null);
        }
    }

    /* renamed from: e */
    public final void mo96855e() {
        mo22530c(C48952c.f123137a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        EditInfoStickerState editInfoStickerState = new EditInfoStickerState(null, null, null, null, null, 31, null);
        return editInfoStickerState;
    }

    /* renamed from: a */
    public final void mo96854a(C52847n<Integer, Integer> nVar) {
        C52711k.m112240b(nVar, "value");
        mo22530c(new C48953d(nVar));
    }
}
