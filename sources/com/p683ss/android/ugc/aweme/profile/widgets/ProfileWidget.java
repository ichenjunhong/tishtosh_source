package com.p683ss.android.ugc.aweme.profile.widgets;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11791ad;
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
import com.bytedance.jedi.ext.adapter.C11941a;
import com.bytedance.widget.Widget;
import com.p683ss.android.ugc.aweme.base.arch.C23473i;
import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.ProfileWidget */
public class ProfileWidget extends Widget implements C11791ad<C23473i>, C11872h {

    /* renamed from: r */
    static final /* synthetic */ C52767h[] f103745r = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ProfileWidget.class), "profileViewModel", "getProfileViewModel()Lcom/ss/android/ugc/aweme/profile/viewmodel/ProfileViewModel;"))};

    /* renamed from: g */
    private final C52668f f103746g;

    /* renamed from: s */
    public C23473i f103747s = new C23473i();

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.ProfileWidget$a */
    public static final class C40717a extends C52712l implements C52670a<ProfileViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f103748a;

        /* renamed from: b */
        final /* synthetic */ C52760c f103749b;

        /* renamed from: c */
        final /* synthetic */ C52760c f103750c;

        public C40717a(Widget widget, C52760c cVar, C52760c cVar2) {
            this.f103748a = widget;
            this.f103749b = cVar;
            this.f103750c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel] */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v7, types: [com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel]
          mth insns count: 48
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel invoke() {
            /*
                r5 = this;
                com.bytedance.widget.Widget r0 = r5.f103748a
                java.lang.Object r0 = r0.mo25062n()
                d.k.c r1 = r5.f103750c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                boolean r2 = r0 instanceof android.support.p030v4.app.Fragment
                if (r2 == 0) goto L_0x0055
                android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
                r2 = r0
            L_0x001c:
                if (r2 == 0) goto L_0x0038
                android.arch.lifecycle.y$b r3 = com.bytedance.jedi.arch.C11793b.m24134a()     // Catch:{ ae -> 0x0033 }
                android.arch.lifecycle.y r3 = android.arch.lifecycle.C0214z.m439a(r2, r3)     // Catch:{ ae -> 0x0033 }
                d.k.c r4 = r5.f103749b     // Catch:{ ae -> 0x0033 }
                java.lang.Class r4 = p2628d.p2639f.C52669a.m112219a(r4)     // Catch:{ ae -> 0x0033 }
                android.arch.lifecycle.x r3 = r3.mo360a(r1, r4)     // Catch:{ ae -> 0x0033 }
                com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3     // Catch:{ ae -> 0x0033 }
                goto L_0x0039
            L_0x0033:
                android.support.v4.app.Fragment r2 = r2.getParentFragment()
                goto L_0x001c
            L_0x0038:
                r3 = 0
            L_0x0039:
                if (r3 != 0) goto L_0x0054
                android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                android.arch.lifecycle.y$b r2 = com.bytedance.jedi.arch.C11793b.m24134a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r2)
                d.k.c r2 = r5.f103749b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                r3 = r0
                com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3
            L_0x0054:
                return r3
            L_0x0055:
                boolean r2 = r0 instanceof android.support.p030v4.app.FragmentActivity
                if (r2 == 0) goto L_0x0075
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                android.arch.lifecycle.y$b r2 = com.bytedance.jedi.arch.C11793b.m24134a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r2)
                d.k.c r2 = r5.f103749b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                java.lang.String r1 = "ViewModelProviders\n     …key, viewModelClass.java)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            L_0x0075:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.ProfileWidget.C40717a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: g */
    public void mo25057g() {
        super.mo25057g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final ProfileViewModel mo83009x() {
        return (ProfileViewModel) this.f103746g.getValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0212b mo22542a() {
        return this.f103747s;
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C11873a.m24226a(this);
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

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Activity mo83008w() {
        return C11941a.m24315b(this);
    }

    public ProfileWidget() {
        C52760c a = C52728w.m112245a(ProfileViewModel.class);
        this.f103746g = C52732g.m112285a(new C40717a(this, a, a));
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
