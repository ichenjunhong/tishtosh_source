package com.p683ss.android.ugc.aweme.tutorial;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p033b.C0703a;
import android.support.p030v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.C42562ct;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44986ar;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44710g;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44714j;
import com.p683ss.android.ugc.aweme.themechange.base.AVTabLayoutItemView;
import com.p683ss.android.ugc.aweme.tools.C47059f;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47376c;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.tutorial.a */
public final class C47368a extends C49604i implements C49548a {

    /* renamed from: l */
    public static final String[] f119536l = {"basic", C22858c.f61205a};

    /* renamed from: m */
    public static final C47369a f119537m = new C47369a(null);

    /* renamed from: i */
    public TabLayout f119538i;

    /* renamed from: j */
    public ViewPager f119539j;

    /* renamed from: k */
    public final C48923a f119540k;

    /* renamed from: n */
    private View f119541n;

    /* renamed from: o */
    private ViewStub f119542o;

    /* renamed from: p */
    private ImageView f119543p;

    /* renamed from: q */
    private View f119544q;

    /* renamed from: com.ss.android.ugc.aweme.tutorial.a$a */
    public static final class C47369a {
        private C47369a() {
        }

        public /* synthetic */ C47369a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.a$b */
    static final class C47370b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47368a f119545a;

        C47370b(C47368a aVar) {
            this.f119545a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f119545a.f33840g_ instanceof VideoRecordNewActivity) {
                Activity activity = this.f119545a.f33840g_;
                if (activity != null) {
                    C42562ct ctVar = ((VideoRecordNewActivity) activity).f113794t;
                    C52711k.m112236a((Object) ctVar, "(activity as VideoRecordNewActivity).plan");
                    ctVar.mo86791d().mo86531a(new C47059f("close_view"));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.a$c */
    public static final class C47371c implements C44704c {

        /* renamed from: a */
        final /* synthetic */ C47387d f119546a;

        /* renamed from: b */
        final /* synthetic */ C47368a f119547b;

        /* renamed from: b */
        public final void mo64264b(C44709f fVar) {
        }

        /* renamed from: c */
        public final void mo64265c(C44709f fVar) {
            C47387d dVar = this.f119546a;
            ViewPager viewPager = this.f119547b.f119539j;
            if (viewPager == null) {
                C52711k.m112237a("viewPager");
            }
            int currentItem = viewPager.getCurrentItem();
            if (dVar.f119593b.get(Integer.valueOf(currentItem)) != null) {
                Object obj = dVar.f119593b.get(Integer.valueOf(currentItem));
                if (obj != null) {
                    ((C47380b) obj).mo94680b();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.tutorial.TutorialCategoryFragment");
            }
        }

        /* renamed from: a */
        public final void mo64263a(C44709f fVar) {
            Keva.getRepo("CreationTutorialScene").storeInt("CreationTutorialScene", C47368a.m102737a(this.f119547b).getSelectedTabPosition());
            String str = C47368a.f119536l[C47368a.m102737a(this.f119547b).getSelectedTabPosition()];
            C52711k.m112240b(str, "tabName");
            C47386c.f119589c = str;
            C26890h.m65011a("enter_tutorial_tab", C23089d.m56640a().mo47829a("creation_id", C47386c.f119587a).mo47829a("shoot_way", C47386c.f119588b).mo47829a("enter_from", "video_tutorial_page").mo47829a("tab_name", str).f61491a);
        }

        C47371c(C47387d dVar, C47368a aVar) {
            this.f119546a = dVar;
            this.f119547b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.a$d */
    static final class C47372d implements OnClickListener {

        /* renamed from: a */
        public static final C47372d f119548a = new C47372d();

        C47372d() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: F */
    public final String mo49446F() {
        return "CreationTutorialScene";
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* renamed from: H */
    public final void mo49448H() {
        ObjectAnimator.ofFloat(this.f119541n, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
        C44986ar.m98332a(false);
    }

    /* renamed from: G */
    public final void mo49447G() {
        if (this.f119541n == null) {
            ViewStub viewStub = this.f119542o;
            if (viewStub == null) {
                C52711k.m112237a("viewStub");
            }
            this.f119541n = viewStub.inflate();
            View view = this.f119541n;
            if (view != null) {
                view.setOnClickListener(C47372d.f119548a);
                View findViewById = view.findViewById(R.id.e49);
                C52711k.m112236a((Object) findViewById, "findViewById(R.id.creation_tutorial_tab_layout)");
                this.f119538i = (TabLayout) findViewById;
                View findViewById2 = view.findViewById(R.id.e4b);
                C52711k.m112236a((Object) findViewById2, "findViewById(R.id.creation_tutorial_viewpager)");
                this.f119539j = (ViewPager) findViewById2;
                View findViewById3 = view.findViewById(R.id.e46);
                C52711k.m112236a((Object) findViewById3, "findViewById(R.id.creation_tutorial_close)");
                this.f119543p = (ImageView) findViewById3;
                View findViewById4 = view.findViewById(R.id.e4a);
                C52711k.m112236a((Object) findViewById4, "findViewById(R.id.creation_tutorial_title_rl)");
                this.f119544q = findViewById4;
                ImageView imageView = this.f119543p;
                if (imageView == null) {
                    C52711k.m112237a("closeView");
                }
                imageView.setOnClickListener(new C47370b(this));
                int c = C43303dy.m94972c(this.f33840g_);
                View view2 = this.f119544q;
                if (view2 == null) {
                    C52711k.m112237a("titleLayout");
                }
                LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = c;
                    View view3 = this.f119544q;
                    if (view3 == null) {
                        C52711k.m112237a("titleLayout");
                    }
                    view3.setLayoutParams(marginLayoutParams);
                    Activity activity = this.f33840g_;
                    if (activity != null) {
                        C47387d dVar = new C47387d((FragmentActivity) activity);
                        ViewPager viewPager = this.f119539j;
                        if (viewPager == null) {
                            C52711k.m112237a("viewPager");
                        }
                        viewPager.setAdapter(dVar);
                        int count = dVar.getCount();
                        for (int i = 0; i < count; i++) {
                            AVTabLayoutItemView aVTabLayoutItemView = new AVTabLayoutItemView(dVar.f119594c, null, 0, 6, null);
                            aVTabLayoutItemView.setText(((C47376c) dVar.f119592a.get(i)).f119555a);
                            View view4 = aVTabLayoutItemView;
                            TabLayout tabLayout = this.f119538i;
                            if (tabLayout == null) {
                                C52711k.m112237a("tabLayout");
                            }
                            TabLayout tabLayout2 = this.f119538i;
                            if (tabLayout2 == null) {
                                C52711k.m112237a("tabLayout");
                            }
                            tabLayout.mo90684a(tabLayout2.mo90678a().mo90742a(view4));
                            int count2 = dVar.getCount();
                            if (view4.getParent() instanceof ViewGroup) {
                                ViewParent parent = view4.getParent();
                                if (parent != null) {
                                    LayoutParams layoutParams2 = ((ViewGroup) parent).getLayoutParams();
                                    if (!(layoutParams2 instanceof MarginLayoutParams)) {
                                        continue;
                                    } else {
                                        if (i == 0) {
                                            ((MarginLayoutParams) layoutParams2).leftMargin = (int) C9432q.m18687b((Context) this.f33840g_, 16.0f);
                                        } else if (i == count2 - 1) {
                                            ((MarginLayoutParams) layoutParams2).rightMargin = (int) C9432q.m18687b((Context) this.f33840g_, 16.0f);
                                        }
                                        ViewParent parent2 = view4.getParent();
                                        if (parent2 != null) {
                                            ((ViewGroup) parent2).setLayoutParams(layoutParams2);
                                        } else {
                                            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                                        }
                                    }
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                                }
                            }
                        }
                        ViewPager viewPager2 = this.f119539j;
                        if (viewPager2 == null) {
                            C52711k.m112237a("viewPager");
                        }
                        TabLayout tabLayout3 = this.f119538i;
                        if (tabLayout3 == null) {
                            C52711k.m112237a("tabLayout");
                        }
                        viewPager2.addOnPageChangeListener(new C44710g(tabLayout3));
                        TabLayout tabLayout4 = this.f119538i;
                        if (tabLayout4 == null) {
                            C52711k.m112237a("tabLayout");
                        }
                        ViewPager viewPager3 = this.f119539j;
                        if (viewPager3 == null) {
                            C52711k.m112237a("viewPager");
                        }
                        tabLayout4.mo90683a((C44704c) new C44714j(viewPager3));
                        TabLayout tabLayout5 = this.f119538i;
                        if (tabLayout5 == null) {
                            C52711k.m112237a("tabLayout");
                        }
                        tabLayout5.mo90683a((C44704c) new C47371c(dVar, this));
                        int a = C0703a.m2034a(Keva.getRepo("CreationTutorialScene").getInt("CreationTutorialScene", 0), 0, dVar.getCount());
                        ViewPager viewPager4 = this.f119539j;
                        if (viewPager4 == null) {
                            C52711k.m112237a("viewPager");
                        }
                        viewPager4.setCurrentItem(a, false);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        ObjectAnimator.ofFloat(this.f119541n, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
        C44986ar.m98332a(true);
        ShortVideoContext c2 = this.f119540k.mo96752c();
        C52711k.m112240b(c2, "shortVideoContext");
        C47386c.f119587a = c2.f107131x;
        C47386c.f119588b = c2.f107132y;
    }

    public C47368a(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        this.f119540k = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ TabLayout m102737a(C47368a aVar) {
        TabLayout tabLayout = aVar.f119538i;
        if (tabLayout == null) {
            C52711k.m112237a("tabLayout");
        }
        return tabLayout;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.bqp, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.etw);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.scene_creation_tutorial)");
        this.f119542o = (ViewStub) findViewById;
        C52711k.m112236a((Object) inflate, "view");
        return inflate;
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
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
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
