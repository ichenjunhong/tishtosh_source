package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12932b;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.navigation.C12961g;
import com.bytedance.scene.p837a.p838a.C12833c;
import com.bytedance.scene.p840b.C12858e.C12860a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel.C44016a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel.C44018c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewGestureViewPager.C44205a;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtAutoRTLImageView;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l */
public final class C44251l extends C12896b implements C44211e {

    /* renamed from: o */
    public static C44213g f112037o;

    /* renamed from: p */
    public static final C44252a f112038p = new C44252a(null);

    /* renamed from: k */
    public int f112039k = -1;

    /* renamed from: l */
    public PreviewGestureViewPager f112040l;

    /* renamed from: m */
    public ChooseMediaViewModel f112041m;

    /* renamed from: n */
    public boolean f112042n = true;

    /* renamed from: q */
    private boolean f112043q = true;

    /* renamed from: r */
    private DmtTextView f112044r;

    /* renamed from: s */
    private AVDmtAutoRTLImageView f112045s;

    /* renamed from: t */
    private DmtTextView f112046t;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l$a */
    public static final class C44252a {
        private C44252a() {
        }

        public /* synthetic */ C44252a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m96940a(C44213g gVar) {
            C52711k.m112240b(gVar, "callback");
            C44251l.f112037o = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l$b */
    static final class C44253b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f112047a;

        /* renamed from: b */
        final /* synthetic */ int f112048b;

        C44253b(View view, int i) {
            this.f112047a = view;
            this.f112048b = i;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f112047a.setEnabled(true);
            this.f112047a.getHitRect(rect);
            rect.top -= this.f112048b;
            rect.bottom += this.f112048b;
            rect.left -= this.f112048b;
            rect.right += this.f112048b;
            ViewParent parent = this.f112047a.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            View view = (View) parent;
            if (view != null) {
                view.setTouchDelegate(new TouchDelegate(rect, this.f112047a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l$c */
    static final class C44254c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44251l f112049a;

        C44254c(C44251l lVar) {
            this.f112049a = lVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            C44251l lVar = this.f112049a;
            PreviewGestureViewPager previewGestureViewPager = lVar.f112040l;
            if (previewGestureViewPager == null) {
                C52711k.m112237a("viewPager");
            }
            PagerAdapter adapter = previewGestureViewPager.getAdapter();
            if (!(adapter instanceof C44262n)) {
                adapter = null;
            }
            C44262n nVar = (C44262n) adapter;
            if (nVar != null) {
                List<? extends MyMediaModel> list = nVar.f112060a;
                if (list != null) {
                    Collection collection = list;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        PreviewGestureViewPager previewGestureViewPager2 = lVar.f112040l;
                        if (previewGestureViewPager2 == null) {
                            C52711k.m112237a("viewPager");
                        }
                        MyMediaModel myMediaModel = (MyMediaModel) C52575l.m112118a(list, previewGestureViewPager2.getCurrentItem());
                        if (myMediaModel != null) {
                            C44213g gVar = C44251l.f112037o;
                            if (gVar == null || gVar.mo89937a(myMediaModel)) {
                                if (myMediaModel.f111662r >= 0) {
                                    ChooseMediaViewModel chooseMediaViewModel = lVar.f112041m;
                                    if (chooseMediaViewModel == null) {
                                        C52711k.m112237a("chooseMediaViewModel");
                                    }
                                    chooseMediaViewModel.mo89860a(myMediaModel);
                                    return;
                                }
                                ChooseMediaViewModel chooseMediaViewModel2 = lVar.f112041m;
                                if (chooseMediaViewModel2 == null) {
                                    C52711k.m112237a("chooseMediaViewModel");
                                }
                                C52711k.m112240b(myMediaModel, "media");
                                chooseMediaViewModel2.mo22530c(new C44018c(myMediaModel));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l$d */
    public static final class C44255d implements C0997e {

        /* renamed from: a */
        final /* synthetic */ C44251l f112050a;

        /* renamed from: b */
        final /* synthetic */ C44262n f112051b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l$d$a */
        static final class C44256a extends C52712l implements C52671b<Boolean, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C44255d f112052a;

            C44256a(C44255d dVar) {
                this.f112052a = dVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                MyMediaModel myMediaModel = (MyMediaModel) C52575l.m112118a(this.f112052a.f112051b.f112060a, C44251l.m96929a(this.f112052a.f112050a).getCurrentItem());
                if (myMediaModel != null && !booleanValue && myMediaModel.f111662r >= 0) {
                    C44251l.m96930b(this.f112052a.f112050a).mo89860a(myMediaModel);
                }
                return C52860x.f131107a;
            }
        }

        public final void onPageScrollStateChanged(int i) {
            if (i == 1) {
                this.f112050a.f112039k = C44251l.m96929a(this.f112050a).getCurrentItem();
                return;
            }
            if (C44251l.m96929a(this.f112050a).getCurrentItem() == this.f112050a.f112039k && i == 0) {
                C44212f b = this.f112051b.mo90158b(this.f112050a.f112039k);
                if (b != null) {
                    b.mo90136a();
                }
            }
        }

        public final void onPageSelected(int i) {
            if (!this.f112050a.mo90133a()) {
                this.f112050a.mo90153a(this.f112051b.f112060a, new C44256a(this));
                MyMediaModel myMediaModel = (MyMediaModel) C52575l.m112118a(this.f112051b.f112060a, i);
                if (myMediaModel != null) {
                    ChooseMediaViewModel b = C44251l.m96930b(this.f112050a);
                    C52711k.m112240b(myMediaModel, "media");
                    b.mo22530c(new C44016a(myMediaModel));
                }
            }
        }

        C44255d(C44251l lVar, C44262n nVar) {
            this.f112050a = lVar;
            this.f112051b = nVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (C44251l.m96929a(this.f112050a).getCurrentItem() == this.f112050a.f112039k && i2 > 0) {
                C44212f b = this.f112051b.mo90158b(this.f112050a.f112039k);
                if (b != null) {
                    b.cg_();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l$e */
    public static final class C44257e implements C44205a {

        /* renamed from: a */
        final /* synthetic */ C44251l f112053a;

        C44257e(C44251l lVar) {
            this.f112053a = lVar;
        }

        /* renamed from: a */
        public final void mo90118a(boolean z) {
            int i = 0;
            Integer num = null;
            if (z) {
                C44213g gVar = C44251l.f112037o;
                if (gVar != null) {
                    num = Integer.valueOf(gVar.mo89940d());
                }
                if (num != null && num.intValue() == 1) {
                    i = R.string.ggo;
                } else if (num != null && num.intValue() == 2) {
                    i = R.string.ggn;
                } else if (num != null && num.intValue() == 3) {
                    i = R.string.ggm;
                }
                if (i > 0) {
                    this.f112053a.mo90154e(i);
                }
            } else {
                C44213g gVar2 = C44251l.f112037o;
                if (gVar2 != null) {
                    num = Integer.valueOf(gVar2.mo89940d());
                }
                if (num != null && num.intValue() == 1) {
                    i = R.string.ggr;
                } else if (num != null && num.intValue() == 2) {
                    i = R.string.ggq;
                } else if (num != null && num.intValue() == 3) {
                    i = R.string.ggp;
                }
                if (i > 0) {
                    this.f112053a.mo90154e(i);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l$f */
    static final class C44258f extends C52712l implements C52671b<MediaListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44251l f112054a;

        /* renamed from: b */
        final /* synthetic */ C44262n f112055b;

        C44258f(C44251l lVar, C44262n nVar) {
            this.f112054a = lVar;
            this.f112055b = nVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int i;
            MediaListState mediaListState = (MediaListState) obj;
            C52711k.m112240b(mediaListState, "it");
            List<? extends MyMediaModel> e = C52575l.m112138e((Iterable<? extends T>) mediaListState.getMediaList());
            C44262n nVar = this.f112055b;
            C52711k.m112240b(e, "<set-?>");
            nVar.f112060a = e;
            this.f112055b.notifyDataSetChanged();
            if (this.f112054a.mo90133a()) {
                PreviewGestureViewPager a = C44251l.m96929a(this.f112054a);
                C44213g gVar = C44251l.f112037o;
                if (gVar != null) {
                    i = gVar.mo89939c();
                } else {
                    i = 0;
                }
                a.setCurrentItem(i);
            }
            this.f112054a.mo90153a(e, null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l$g */
    public static final class C44259g implements C12961g {

        /* renamed from: a */
        final /* synthetic */ C44251l f112056a;

        /* renamed from: b */
        final /* synthetic */ C44262n f112057b;

        /* renamed from: a */
        public final boolean mo24532a() {
            C44212f b = this.f112057b.mo90158b(C44251l.m96929a(this.f112056a).getCurrentItem());
            if (b != null) {
                b.mo90139c();
            }
            return true;
        }

        C44259g(C44251l lVar, C44262n nVar) {
            this.f112056a = lVar;
            this.f112057b = nVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l$h */
    static final class C44260h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44251l f112058a;

        C44260h(C44251l lVar) {
            this.f112058a = lVar;
        }

        public final void run() {
            this.f112058a.f112042n = true;
        }
    }

    public final View ch_() {
        C44213g gVar = f112037o;
        if (gVar != null) {
            return gVar.mo89938b();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo90133a() {
        return this.f112043q;
    }

    /* renamed from: c */
    public final void mo86790c() {
        C12942d dVar = this.f33837e;
        if (dVar != null) {
            C12860a aVar = new C12860a();
            aVar.mo24321a(new C12833c());
            dVar.mo24520a(aVar.mo24322a());
        }
    }

    /* renamed from: a */
    public final void mo90132a(boolean z) {
        this.f112043q = false;
    }

    /* renamed from: a */
    public static final /* synthetic */ PreviewGestureViewPager m96929a(C44251l lVar) {
        PreviewGestureViewPager previewGestureViewPager = lVar.f112040l;
        if (previewGestureViewPager == null) {
            C52711k.m112237a("viewPager");
        }
        return previewGestureViewPager;
    }

    /* renamed from: b */
    public static final /* synthetic */ ChooseMediaViewModel m96930b(C44251l lVar) {
        ChooseMediaViewModel chooseMediaViewModel = lVar.f112041m;
        if (chooseMediaViewModel == null) {
            C52711k.m112237a("chooseMediaViewModel");
        }
        return chooseMediaViewModel;
    }

    /* renamed from: e */
    public final void mo90154e(int i) {
        if (this.f112042n) {
            this.f112042n = false;
            C10691a.m21549c((Context) mo24477v(), i, 0).mo19066a();
            C12932b.m25978a(this, new C44260h(this), 2000);
        }
    }

    /* renamed from: a */
    public final void mo90131a(float f) {
        int max = Math.max(0, (int) (255.0f * f));
        PreviewGestureViewPager previewGestureViewPager = this.f112040l;
        if (previewGestureViewPager == null) {
            C52711k.m112237a("viewPager");
        }
        previewGestureViewPager.setBackgroundColor(Color.argb(max, 0, 0, 0));
        if (f == 1.0f) {
            AVDmtAutoRTLImageView aVDmtAutoRTLImageView = this.f112045s;
            if (aVDmtAutoRTLImageView == null) {
                C52711k.m112237a("backBtn");
            }
            aVDmtAutoRTLImageView.setVisibility(0);
            DmtTextView dmtTextView = this.f112044r;
            if (dmtTextView == null) {
                C52711k.m112237a("indexTxt");
            }
            dmtTextView.setVisibility(0);
            DmtTextView dmtTextView2 = this.f112046t;
            if (dmtTextView2 == null) {
                C52711k.m112237a("tipTxt");
            }
            dmtTextView2.setVisibility(0);
            return;
        }
        AVDmtAutoRTLImageView aVDmtAutoRTLImageView2 = this.f112045s;
        if (aVDmtAutoRTLImageView2 == null) {
            C52711k.m112237a("backBtn");
        }
        aVDmtAutoRTLImageView2.setVisibility(4);
        DmtTextView dmtTextView3 = this.f112044r;
        if (dmtTextView3 == null) {
            C52711k.m112237a("indexTxt");
        }
        dmtTextView3.setVisibility(4);
        DmtTextView dmtTextView4 = this.f112046t;
        if (dmtTextView4 == null) {
            C52711k.m112237a("tipTxt");
        }
        dmtTextView4.setVisibility(4);
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        View j_ = mo24467j_(R.id.ec4);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.index_txt)");
        this.f112044r = (DmtTextView) j_;
        View j_2 = mo24467j_(R.id.f05);
        C52711k.m112236a((Object) j_2, "requireViewById(R.id.tip_txt)");
        this.f112046t = (DmtTextView) j_2;
        View j_3 = mo24467j_(R.id.ik);
        C52711k.m112236a((Object) j_3, "requireViewById(R.id.back_btn)");
        this.f112045s = (AVDmtAutoRTLImageView) j_3;
        DmtTextView dmtTextView = this.f112044r;
        if (dmtTextView == null) {
            C52711k.m112237a("indexTxt");
        }
        View view = dmtTextView;
        int b = (int) C9432q.m18687b((Context) mo24477v(), 20.0f);
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view2 = (View) parent;
        if (view2 != null) {
            view2.post(new C44253b(view, b));
        }
        DmtTextView dmtTextView2 = this.f112044r;
        if (dmtTextView2 == null) {
            C52711k.m112237a("indexTxt");
        }
        dmtTextView2.setOnClickListener(new C44254c(this));
        C44262n nVar = new C44262n(this, this);
        View j_4 = mo24467j_(R.id.drk);
        C52711k.m112236a((Object) j_4, "requireViewById<PreviewG…ewPager>(R.id.view_pager)");
        this.f112040l = (PreviewGestureViewPager) j_4;
        PreviewGestureViewPager previewGestureViewPager = this.f112040l;
        if (previewGestureViewPager == null) {
            C52711k.m112237a("viewPager");
        }
        previewGestureViewPager.addOnPageChangeListener(new C44255d(this, nVar));
        PreviewGestureViewPager previewGestureViewPager2 = this.f112040l;
        if (previewGestureViewPager2 == null) {
            C52711k.m112237a("viewPager");
        }
        previewGestureViewPager2.setGestureCallback(new C44257e(this));
        PreviewGestureViewPager previewGestureViewPager3 = this.f112040l;
        if (previewGestureViewPager3 == null) {
            C52711k.m112237a("viewPager");
        }
        previewGestureViewPager3.setAdapter(nVar);
        Activity v = mo24477v();
        if (v != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) v).mo96760a(ChooseMediaViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…diaViewModel::class.java)");
            this.f112041m = (ChooseMediaViewModel) a;
            ChooseMediaViewModel chooseMediaViewModel = this.f112041m;
            if (chooseMediaViewModel == null) {
                C52711k.m112237a("chooseMediaViewModel");
            }
            C0184k kVar = this;
            chooseMediaViewModel.m106895a(kVar, C44261m.f112059a, new C11934u(), new C44258f(this, nVar));
            mo24479x().mo24517a(kVar, (C12961g) new C44259g(this, nVar));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1.mo89941e() == true) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90153a(java.util.List<? extends com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel> r11, p2628d.p2639f.p2640a.C52671b<? super java.lang.Boolean, p2628d.C52860x> r12) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewGestureViewPager r0 = r10.f112040l
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "viewPager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            int r0 = r0.getCurrentItem()
            java.lang.Object r11 = p2628d.p2629a.C52575l.m112118a(r11, r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r11 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel) r11
            if (r11 != 0) goto L_0x0016
            return
        L_0x0016:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r11.f95383b
            r0.<init>(r1)
            boolean r0 = r0.exists()
            java.lang.String r1 = r11.f95383b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0032
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r1 = 0
            goto L_0x0033
        L_0x0032:
            r1 = 1
        L_0x0033:
            if (r1 != 0) goto L_0x0082
            if (r0 == 0) goto L_0x0082
            int r1 = r11.f111662r
            if (r1 >= 0) goto L_0x0045
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.g r1 = f112037o
            if (r1 == 0) goto L_0x0045
            boolean r1 = r1.mo89941e()
            if (r1 == r3) goto L_0x0082
        L_0x0045:
            boolean r1 = r11.mo76676c()
            if (r1 == 0) goto L_0x0053
            long r4 = r11.f95386e
            r6 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0082
        L_0x0053:
            int r1 = r11.f95390i
            double r4 = (double) r1
            int r1 = r11.f95391j
            double r6 = (double) r1
            r8 = 4612586738352862003(0x4003333333333333, double:2.4)
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0082
            int r1 = r11.f95391j
            double r4 = (double) r1
            int r1 = r11.f95390i
            double r6 = (double) r1
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0082
            r1 = r11
            com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel r1 = (com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel) r1
            boolean r1 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44263o.m96946a(r1)
            if (r1 == 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r1 = 0
            goto L_0x0083
        L_0x0082:
            r1 = 1
        L_0x0083:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r10.f112044r
            if (r4 != 0) goto L_0x008c
            java.lang.String r5 = "indexTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x008c:
            r5 = 2131953396(0x7f1306f4, float:1.9543262E38)
            r4.setBackgroundResource(r5)
            r4 = 0
            r5 = 2132544918(0x7f1c0d96, float:2.074301E38)
            if (r1 == 0) goto L_0x010b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f112044r
            if (r11 != 0) goto L_0x00a1
            java.lang.String r1 = "indexTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00a1:
            r1 = 1051595899(0x3eae147b, float:0.34)
            r11.setAlpha(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f112044r
            if (r11 != 0) goto L_0x00b0
            java.lang.String r3 = "indexTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00b0:
            r11.setSelected(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f112044r
            if (r11 != 0) goto L_0x00bc
            java.lang.String r2 = "indexTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00bc:
            java.lang.String r2 = ""
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r11.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f112046t
            if (r11 != 0) goto L_0x00cc
            java.lang.String r2 = "tipTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00cc:
            r11.setAlpha(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f112046t
            if (r11 != 0) goto L_0x00d8
            java.lang.String r1 = "tipTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00d8:
            android.app.Activity r1 = r10.f33840g_
            if (r1 == 0) goto L_0x00e0
            java.lang.String r4 = r1.getString(r5)
        L_0x00e0:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r11.setText(r4)
            if (r0 != 0) goto L_0x00f0
            if (r12 == 0) goto L_0x00f0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r12.invoke(r11)
        L_0x00f0:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.g r11 = f112037o
            if (r11 == 0) goto L_0x010a
            boolean r11 = r11.mo89936a()
            if (r11 != 0) goto L_0x0196
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f112044r
            if (r11 != 0) goto L_0x0103
            java.lang.String r12 = "indexTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0103:
            r12 = 2131952357(0x7f1302e5, float:1.9541154E38)
            r11.setBackgroundResource(r12)
            return
        L_0x010a:
            return
        L_0x010b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f112044r
            if (r12 != 0) goto L_0x0114
            java.lang.String r0 = "indexTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0114:
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.setAlpha(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f112044r
            if (r12 != 0) goto L_0x0122
            java.lang.String r1 = "indexTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0122:
            int r1 = r11.f111662r
            if (r1 < 0) goto L_0x0127
            r2 = 1
        L_0x0127:
            r12.setSelected(r2)
            int r12 = r11.f111662r
            if (r12 < 0) goto L_0x015d
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.g r12 = f112037o
            if (r12 == 0) goto L_0x0148
            boolean r12 = r12.mo89936a()
            if (r12 != 0) goto L_0x0148
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f112044r
            if (r12 != 0) goto L_0x0141
            java.lang.String r1 = "indexTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0141:
            r1 = 2131951824(0x7f1300d0, float:1.9540073E38)
            r12.setBackgroundResource(r1)
            goto L_0x016d
        L_0x0148:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f112044r
            if (r12 != 0) goto L_0x0151
            java.lang.String r1 = "indexTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0151:
            int r1 = r11.f111662r
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r12.setText(r1)
            goto L_0x016d
        L_0x015d:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f112044r
            if (r12 != 0) goto L_0x0166
            java.lang.String r1 = "indexTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0166:
            java.lang.String r1 = ""
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r12.setText(r1)
        L_0x016d:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f112046t
            if (r12 != 0) goto L_0x0176
            java.lang.String r1 = "tipTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0176:
            r12.setAlpha(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f112046t
            if (r12 != 0) goto L_0x0182
            java.lang.String r0 = "tipTxt"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0182:
            android.app.Activity r0 = r10.f33840g_
            if (r0 == 0) goto L_0x0191
            int r11 = r11.f111662r
            if (r11 < 0) goto L_0x018d
            r5 = 2132544919(0x7f1c0d97, float:2.0743013E38)
        L_0x018d:
            java.lang.String r4 = r0.getString(r5)
        L_0x0191:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r12.setText(r4)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44251l.mo90153a(java.util.List, d.f.a.b):void");
    }

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        Activity v = mo24477v();
        C52711k.m112236a((Object) v, "requireActivity()");
        View inflate = v.getLayoutInflater().inflate(R.layout.brd, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
