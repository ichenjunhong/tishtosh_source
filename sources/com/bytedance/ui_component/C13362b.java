package com.bytedance.ui_component;

import android.app.Activity;
import android.arch.lifecycle.C0159aa;
import android.arch.lifecycle.C0161ac;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0212b;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.C11872h.C11873a;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.ui_component.C13359a.C13361b;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.bytedance.ui_component.b */
public abstract class C13362b<T extends LifecycleAwareViewModel<? extends UiState> & C2759d> extends C2764h<T> implements C11872h {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f34844a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C13362b.class), "_viewModelStore", "get_viewModelStore()Landroid/arch/lifecycle/ViewModelStore;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C13362b.class), "_vm", "get_vm()Lcom/bytedance/ui_component/LifecycleAwareViewModel;"))};

    /* renamed from: b */
    public static final Field f34845b;

    /* renamed from: c */
    public static final C13363a f34846c = new C13363a(null);

    /* renamed from: d */
    private final C11910j f34847d = new C13368d(this);

    /* renamed from: e */
    private final C52668f f34848e = C52732g.m112286a(C52757k.NONE, new C13364b(this));

    /* renamed from: f */
    private final C52668f f34849f = C52732g.m112286a(C52757k.NONE, new C13365c(this));

    /* renamed from: com.bytedance.ui_component.b$a */
    public static final class C13363a {
        private C13363a() {
        }

        public /* synthetic */ C13363a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ui_component.b$b */
    static final class C13364b extends C52712l implements C52670a<C0159aa> {

        /* renamed from: a */
        final /* synthetic */ C13362b f34850a;

        C13364b(C13362b bVar) {
            this.f34850a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Activity v = this.f34850a.mo24974k().mo24477v();
            if (v != null) {
                return C0161ac.m373a((FragmentActivity) v);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.ui_component.b$c */
    static final class C13365c extends C52712l implements C52670a<T> {

        /* renamed from: a */
        final /* synthetic */ C13362b f34851a;

        /* renamed from: com.bytedance.ui_component.b$c$a */
        public static final class C13366a implements C0212b {

            /* renamed from: a */
            final /* synthetic */ LifecycleAwareViewModel f34852a;

            /* renamed from: com.bytedance.ui_component.b$c$a$a */
            static final class C13367a extends C52712l implements C52671b<UiState, UiState> {

                /* renamed from: a */
                public static final C13367a f34853a = new C13367a();

                C13367a() {
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    UiState uiState = (UiState) obj;
                    C52711k.m112240b(uiState, "$receiver");
                    return uiState;
                }
            }

            C13366a(LifecycleAwareViewModel lifecycleAwareViewModel) {
                this.f34852a = lifecycleAwareViewModel;
            }

            /* renamed from: a */
            public final <VM extends C0209x> VM mo361a(Class<VM> cls) {
                C52711k.m112240b(cls, "modelClass");
                VM vm = this.f34852a;
                if (vm != null) {
                    VM vm2 = (JediViewModel) vm;
                    vm2.mo22526a((C52671b<? super S, ? extends S>) C13367a.f34853a);
                    return (C0209x) vm2;
                }
                throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.arch.JediViewModel<com.bytedance.ui_component.UiState>");
            }
        }

        C13365c(C13362b bVar) {
            this.f34851a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            LifecycleAwareViewModel lifecycleAwareViewModel = (LifecycleAwareViewModel) this.f34851a.mo24976m().invoke();
            C0176h lifecycle = this.f34851a.getLifecycle();
            C52711k.m112240b(lifecycle, "<set-?>");
            lifecycleAwareViewModel.f34842d = lifecycle;
            return (LifecycleAwareViewModel) new C0210y(this.f34851a.mo24977n(), new C13366a(lifecycleAwareViewModel)).mo359a(lifecycleAwareViewModel.getClass());
        }
    }

    /* renamed from: com.bytedance.ui_component.b$d */
    public static final class C13368d implements C11910j {

        /* renamed from: a */
        public final C13362b<T> f34854a;

        /* renamed from: b */
        final /* synthetic */ C13362b f34855b;

        /* renamed from: h */
        public final /* bridge */ /* synthetic */ C0184k mo22626h() {
            return this.f34854a;
        }

        C13368d(C13362b bVar) {
            this.f34855b = bVar;
            this.f34854a = bVar;
        }
    }

    /* renamed from: com.bytedance.ui_component.b$e */
    static final class C13369e extends C52712l implements C52682m<C11866f, C13359a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C13362b f34856a;

        C13369e(C13362b bVar) {
            this.f34856a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C13359a aVar = (C13359a) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(aVar, "it");
            if (aVar instanceof C13361b) {
                this.f34856a.mo24978o();
            } else {
                this.f34856a.mo24979p();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: j */
    private final T mo23370j() {
        return (LifecycleAwareViewModel) this.f34849f.getValue();
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return this.f34847d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C12896b mo24974k();

    /* renamed from: m */
    public abstract C52670a<T> mo24976m();

    /* renamed from: n */
    public final C0159aa mo24977n() {
        return (C0159aa) this.f34848e.getValue();
    }

    /* renamed from: o */
    public abstract void mo24978o();

    /* renamed from: p */
    public void mo24979p() {
    }

    /* renamed from: a */
    public final /* synthetic */ C2759d mo7353a() {
        return (C2759d) mo24975l();
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C11873a.m24228b(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C11873a.m24231e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C11873a.m24229c(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C11873a.m24230d(this);
    }

    /* renamed from: l */
    public final T mo24975l() {
        return mo23370j();
    }

    public void bO_() {
        super.bO_();
        LifecycleAwareViewModel j = mo23370j();
        if (j != null) {
            mo22547a(j, C13370c.f34857a, C11896i.m24255a(), new C13369e(this));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ui_component.LifecycleAwareViewModel<com.bytedance.ui_component.UiState>");
    }

    static {
        Field declaredField = C0159aa.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        f34845b = declaredField;
    }

    public final void bN_() {
        super.bN_();
        C0159aa n = mo24977n();
        C52711k.m112236a((Object) n, "_viewModelStore");
        StringBuilder sb = new StringBuilder("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
        sb.append(mo23370j().getClass().getCanonicalName());
        String sb2 = sb.toString();
        C52711k.m112240b(n, "$this$remove");
        C52711k.m112240b(sb2, "key");
        Object obj = f34845b.get(n);
        if (obj != null) {
            Map map = (HashMap) obj;
            if (map != null) {
                C52731z.m112270f(map).remove(sb2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.HashMap<*, *> /* = java.util.HashMap<*, *> */");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11873a.m24227a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24220a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24221a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C11873a.m24223a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C11873a.m24222a((C11872h) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C11873a.m24224a((C11872h) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C11873a.m24225a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
