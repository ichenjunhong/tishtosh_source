package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import android.graphics.drawable.Drawable;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.editor.C49359cf.C49360a;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel */
public final class EditToolbarViewModel extends BaseJediViewModel<EditToolbarState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123207d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditToolbarViewModel.class), "toolbarItemVisibleMap", "getToolbarItemVisibleMap()Ljava/util/Map;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditToolbarViewModel.class), "toolbarItemEnableMap", "getToolbarItemEnableMap()Ljava/util/Map;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditToolbarViewModel.class), "toolbarItemSelectedMap", "getToolbarItemSelectedMap()Ljava/util/Map;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditToolbarViewModel.class), "toolbarItemGuideMap", "getToolbarItemGuideMap()Ljava/util/Map;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditToolbarViewModel.class), "titleBarVisibleLiveData", "getTitleBarVisibleLiveData()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    public final C49338c f123208e = new C49338c();

    /* renamed from: f */
    private final C52668f f123209f = C52732g.m112285a(C49009q.f123230a);

    /* renamed from: g */
    private final C52668f f123210g = C52732g.m112285a(C49006n.f123227a);

    /* renamed from: h */
    private final C52668f f123211h = C52732g.m112285a(C49008p.f123229a);

    /* renamed from: i */
    private final C52668f f123212i = C52732g.m112285a(C49007o.f123228a);

    /* renamed from: j */
    private final C52668f f123213j = C52732g.m112285a(C49005m.f123226a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$a */
    static final class C48993a extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        public static final C48993a f123214a = new C48993a();

        C48993a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, null, null, null, null, null, null, null, null, null, null, new C49561h(), 2047, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$b */
    static final class C48994b extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        public static final C48994b f123215a = new C48994b();

        C48994b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, null, null, null, null, new C49561h(), null, null, null, null, null, null, 4063, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$c */
    static final class C48995c extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ Drawable f123216a;

        C48995c(Drawable drawable) {
            this.f123216a = drawable;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, null, null, null, null, null, null, null, null, null, this.f123216a, null, 3071, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$d */
    static final class C48996d extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123217a;

        C48996d(boolean z) {
            this.f123217a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, Boolean.valueOf(this.f123217a), null, null, null, null, null, null, null, null, null, null, 4093, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$e */
    public static final class C48997e extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123218a;

        public C48997e(boolean z) {
            this.f123218a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, Boolean.valueOf(this.f123218a), null, null, null, null, null, null, null, null, null, null, null, 4094, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$f */
    static final class C48998f extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ List f123219a;

        C48998f(List list) {
            this.f123219a = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, null, null, null, this.f123219a, null, null, null, null, null, null, null, 4079, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$g */
    public static final class C48999g extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f123220a;

        public C48999g(int i) {
            this.f123220a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.f123220a), null, null, 3583, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$h */
    static final class C49000h extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ Drawable f123221a;

        C49000h(Drawable drawable) {
            this.f123221a = drawable;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, null, null, null, null, null, null, this.f123221a, null, null, null, null, 3967, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$i */
    static final class C49001i extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ String f123222a;

        C49001i(String str) {
            this.f123222a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, null, null, null, null, null, this.f123222a, null, null, null, null, null, 4031, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$j */
    public static final class C49002j extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123223a;

        public C49002j(boolean z) {
            this.f123223a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, null, Boolean.valueOf(this.f123223a), null, null, null, null, null, null, null, null, null, 4091, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$k */
    static final class C49003k extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ List f123224a;

        C49003k(List list) {
            this.f123224a = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, null, null, this.f123224a, null, null, null, null, null, null, null, null, 4087, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$l */
    public static final class C49004l extends C52712l implements C52671b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f123225a;

        public C49004l(int i) {
            this.f123225a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditToolbarState editToolbarState = (EditToolbarState) obj;
            C52711k.m112240b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState, null, null, null, null, null, null, null, null, Integer.valueOf(this.f123225a), null, null, null, 3839, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$m */
    static final class C49005m extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C49005m f123226a = new C49005m();

        C49005m() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$n */
    static final class C49006n extends C52712l implements C52670a<Map<Integer, ? extends C0198r<Boolean>>> {

        /* renamed from: a */
        public static final C49006n f123227a = new C49006n();

        C49006n() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : C49360a.m106441a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new C0198r());
            }
            return C52550ab.m112055b(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$o */
    static final class C49007o extends C52712l implements C52670a<Map<Integer, ? extends C0198r<Boolean>>> {

        /* renamed from: a */
        public static final C49007o f123228a = new C49007o();

        C49007o() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : C49360a.m106441a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new C0198r());
            }
            return C52550ab.m112055b(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$p */
    static final class C49008p extends C52712l implements C52670a<Map<Integer, ? extends C0198r<Boolean>>> {

        /* renamed from: a */
        public static final C49008p f123229a = new C49008p();

        C49008p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : C49360a.m106441a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new C0198r());
            }
            return C52550ab.m112055b(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$q */
    static final class C49009q extends C52712l implements C52670a<Map<Integer, ? extends C0198r<Boolean>>> {

        /* renamed from: a */
        public static final C49009q f123230a = new C49009q();

        C49009q() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : C49360a.m106441a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new C0198r());
            }
            return C52550ab.m112055b(linkedHashMap);
        }
    }

    /* renamed from: g */
    private final Map<Integer, C0198r<Boolean>> m105799g() {
        return (Map) this.f123209f.getValue();
    }

    /* renamed from: h */
    private final Map<Integer, C0198r<Boolean>> m105800h() {
        return (Map) this.f123210g.getValue();
    }

    /* renamed from: i */
    private final Map<Integer, C0198r<Boolean>> m105801i() {
        return (Map) this.f123211h.getValue();
    }

    /* renamed from: j */
    private final Map<Integer, C0198r<Boolean>> m105802j() {
        return (Map) this.f123212i.getValue();
    }

    /* renamed from: f */
    public final C0198r<Boolean> mo97020f() {
        return (C0198r) this.f123213j.getValue();
    }

    /* renamed from: e */
    public final void mo97018e() {
        mo22530c(C48994b.f123215a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        EditToolbarState editToolbarState = new EditToolbarState(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        return editToolbarState;
    }

    /* renamed from: a */
    public final LiveData<Boolean> mo97007a(int i) {
        return (LiveData) m105800h().get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final LiveData<Boolean> mo97011b(int i) {
        return (LiveData) m105802j().get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public final LiveData<Boolean> mo97014c(int i) {
        return (LiveData) m105801i().get(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final LiveData<Boolean> mo97016d(int i) {
        return (LiveData) m105799g().get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo97009a(Drawable drawable) {
        C52711k.m112240b(drawable, "value");
        mo22530c(new C49000h(drawable));
    }

    /* renamed from: b */
    public final void mo97013b(Drawable drawable) {
        C52711k.m112240b(drawable, "value");
        mo22530c(new C48995c(drawable));
    }

    /* renamed from: a */
    public final void mo97010a(boolean z) {
        mo22530c(new C48996d(z));
    }

    /* renamed from: a */
    public final void mo97008a(int i, boolean z) {
        C0198r rVar = (C0198r) m105800h().get(Integer.valueOf(i));
        if (rVar != null) {
            rVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    public final void mo97012b(int i, boolean z) {
        C0198r rVar = (C0198r) m105802j().get(Integer.valueOf(i));
        if (rVar != null) {
            rVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: d */
    public final void mo97017d(int i, boolean z) {
        C0198r rVar = (C0198r) m105801i().get(Integer.valueOf(i));
        if (rVar != null) {
            rVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: e */
    public final void mo97019e(int i, boolean z) {
        C0198r rVar = (C0198r) m105799g().get(Integer.valueOf(i));
        if (rVar != null) {
            rVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: c */
    public final void mo97015c(int i, boolean z) {
        C0198r rVar = (C0198r) m105802j().get(Integer.valueOf(i));
        if (rVar != null) {
            rVar.postValue(Boolean.valueOf(z));
        }
    }
}
