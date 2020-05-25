package com.p683ss.android.ugc.aweme.tools.beauty.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29189a;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44703b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44713i;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a;
import com.p683ss.android.ugc.aweme.themechange.base.C46786a;
import com.p683ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p683ss.android.ugc.aweme.tools.beauty.C46821b;
import com.p683ss.android.ugc.aweme.tools.beauty.C46870d;
import com.p683ss.android.ugc.aweme.tools.beauty.C46871e;
import com.p683ss.android.ugc.aweme.tools.beauty.C46874h;
import com.p683ss.android.ugc.aweme.tools.beauty.C46874h.C46875a;
import com.p683ss.android.ugc.aweme.tools.beauty.p2349a.C46815a;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46829a;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46832b;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46864f;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46867g;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46869h;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46893b;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46898f;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46898f.C46899a;
import com.p683ss.android.ugc.tools.view.widget.AVTextView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl */
public final class ComposerBeautyViewImpl extends FrameLayout implements C0183j, C46898f {

    /* renamed from: A */
    private final View f118478A;

    /* renamed from: B */
    private final View f118479B;

    /* renamed from: C */
    private final RelativeLayout f118480C;

    /* renamed from: D */
    private final ImageView f118481D;

    /* renamed from: E */
    private final RelativeLayout f118482E;

    /* renamed from: F */
    private C46923a f118483F;

    /* renamed from: G */
    private ViewGroup f118484G;

    /* renamed from: H */
    private C46899a f118485H;

    /* renamed from: a */
    C46893b f118486a;

    /* renamed from: b */
    public final RelativeLayout f118487b;

    /* renamed from: c */
    final AVDmtTabLayout f118488c;

    /* renamed from: d */
    final AVDmtPanelRecyleView f118489d;

    /* renamed from: e */
    public final RelativeLayout f118490e;

    /* renamed from: f */
    final FrameLayout f118491f;

    /* renamed from: g */
    public final TextView f118492g;

    /* renamed from: h */
    final AVDmtPanelRecyleView f118493h;

    /* renamed from: i */
    final AVTextView f118494i;

    /* renamed from: j */
    public final BeautyProgressBar f118495j;

    /* renamed from: k */
    final RelativeLayout f118496k;

    /* renamed from: l */
    final ImageView f118497l;

    /* renamed from: m */
    public final C46815a f118498m;

    /* renamed from: n */
    public final C46815a f118499n;

    /* renamed from: o */
    public ComposerBeauty f118500o;

    /* renamed from: p */
    public ComposerBeauty f118501p;

    /* renamed from: q */
    public boolean f118502q;

    /* renamed from: r */
    ComposerBeauty f118503r;

    /* renamed from: s */
    public Map<BeautyCategory, List<ComposerBeauty>> f118504s;

    /* renamed from: t */
    final C52682m<ComposerBeauty, Integer, C52860x> f118505t;

    /* renamed from: u */
    final C52682m<ComposerBeauty, Integer, C52860x> f118506u;

    /* renamed from: v */
    public final HashMap<C46870d, C29189a<C46870d, Void>> f118507v;

    /* renamed from: w */
    public final C46910e f118508w;

    /* renamed from: x */
    public boolean f118509x;

    /* renamed from: y */
    final C46867g f118510y;

    /* renamed from: z */
    private C46899a f118511z;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$a */
    public static final class C46906a {

        /* renamed from: a */
        public C46899a f118513a;

        /* renamed from: b */
        public C46893b f118514b;

        /* renamed from: c */
        public final Context f118515c;

        /* renamed from: d */
        public final ViewGroup f118516d;

        /* renamed from: e */
        public final C46867g f118517e;

        public C46906a(Context context, ViewGroup viewGroup, C46867g gVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(viewGroup, "container");
            C52711k.m112240b(gVar, "source");
            this.f118515c = context;
            this.f118516d = viewGroup;
            this.f118517e = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$b */
    static final class C46907b<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118518a;

        C46907b(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f118518a = composerBeautyViewImpl;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Object obj2;
            Boolean bool = (Boolean) obj;
            for (BeautyCategory beautyCategory : this.f118518a.getSource().mo94084a()) {
                this.f118518a.f118504s.put(beautyCategory, beautyCategory.getBeautyList());
            }
            ComposerBeautyViewImpl composerBeautyViewImpl = this.f118518a;
            C46921m mVar = new C46921m(composerBeautyViewImpl);
            Iterator it = composerBeautyViewImpl.f118504s.entrySet().iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                for (ComposerBeauty composerBeauty : (Iterable) ((Entry) it.next()).getValue()) {
                    if (composerBeauty.isCollectionType()) {
                        List<ComposerBeauty> childList = composerBeauty.getChildList();
                        if (childList != null) {
                            for (ComposerBeauty dVar : childList) {
                                mVar.mo94211a(new C46870d(dVar, null, 2, null));
                            }
                        }
                    } else {
                        mVar.mo94211a(new C46870d(composerBeauty, null, 2, null));
                    }
                }
            }
            ComposerBeautyViewImpl composerBeautyViewImpl2 = this.f118518a;
            List a = this.f118518a.getSource().mo94084a();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(composerBeautyViewImpl2.getContext());
            linearLayoutManager.mo4731b(0);
            AVDmtPanelRecyleView aVDmtPanelRecyleView = composerBeautyViewImpl2.f118489d;
            C52711k.m112236a((Object) aVDmtPanelRecyleView, "rvCategoryContent");
            aVDmtPanelRecyleView.setLayoutManager(linearLayoutManager);
            AVDmtPanelRecyleView aVDmtPanelRecyleView2 = composerBeautyViewImpl2.f118489d;
            C52711k.m112236a((Object) aVDmtPanelRecyleView2, "rvCategoryContent");
            aVDmtPanelRecyleView2.setAdapter(composerBeautyViewImpl2.f118498m);
            AVDmtPanelRecyleView aVDmtPanelRecyleView3 = composerBeautyViewImpl2.f118489d;
            C52711k.m112236a((Object) aVDmtPanelRecyleView3, "rvCategoryContent");
            C1327f itemAnimator = aVDmtPanelRecyleView3.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.f4731l = 0;
            }
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(composerBeautyViewImpl2.getContext());
            linearLayoutManager2.mo4731b(0);
            AVDmtPanelRecyleView aVDmtPanelRecyleView4 = composerBeautyViewImpl2.f118493h;
            C52711k.m112236a((Object) aVDmtPanelRecyleView4, "rvAlbumContent");
            aVDmtPanelRecyleView4.setLayoutManager(linearLayoutManager2);
            AVDmtPanelRecyleView aVDmtPanelRecyleView5 = composerBeautyViewImpl2.f118493h;
            C52711k.m112236a((Object) aVDmtPanelRecyleView5, "rvAlbumContent");
            aVDmtPanelRecyleView5.setAdapter(composerBeautyViewImpl2.f118499n);
            AVDmtPanelRecyleView aVDmtPanelRecyleView6 = composerBeautyViewImpl2.f118489d;
            C52711k.m112236a((Object) aVDmtPanelRecyleView6, "rvCategoryContent");
            C1327f itemAnimator2 = aVDmtPanelRecyleView6.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.f4731l = 0;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterable<BeautyCategory> iterable = a;
            for (BeautyCategory beautyCategory2 : iterable) {
                arrayList2.add(beautyCategory2.getCategoryResponse().getId());
                arrayList.add(beautyCategory2.getCategoryResponse().getName());
            }
            composerBeautyViewImpl2.f118488c.mo93995a(a.size(), arrayList);
            composerBeautyViewImpl2.f118488c.mo90692b();
            AVDmtTabLayout aVDmtTabLayout = composerBeautyViewImpl2.f118488c;
            C52711k.m112236a((Object) aVDmtTabLayout, "tbCategoryTab");
            aVDmtTabLayout.setTabMode(1);
            for (BeautyCategory beautyCategory3 : iterable) {
                Context context = composerBeautyViewImpl2.getContext();
                C52711k.m112236a((Object) context, "context");
                AVDmtTabItemView a2 = C46784a.m101614a(context);
                if (TextUtils.isEmpty(beautyCategory3.getCategoryResponse().getIcon_normal_url())) {
                    a2.setText(beautyCategory3.getCategoryResponse().getName());
                } else {
                    a2.mo93987a(beautyCategory3.getCategoryResponse().getIcon_normal_url(), 0);
                }
                C44709f a3 = composerBeautyViewImpl2.f118488c.mo90678a().mo90742a((View) a2);
                C52711k.m112236a((Object) a3, "tbCategoryTab.newTab().setCustomView(itemView)");
                C44713i iVar = a3.f113164h;
                if (iVar != null) {
                    iVar.setBackgroundColor(C0726c.m2098c(iVar.getContext(), R.color.a8w));
                }
                composerBeautyViewImpl2.f118488c.mo90685a(a3, false);
            }
            composerBeautyViewImpl2.f118488c.setOnTabClickListener(new C46918j(composerBeautyViewImpl2, a, arrayList2));
            composerBeautyViewImpl2.f118488c.mo90683a(new C46919k(composerBeautyViewImpl2, a, arrayList2));
            Iterator it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((BeautyCategory) next).getSelected()) {
                    obj2 = next;
                    break;
                }
            }
            BeautyCategory beautyCategory4 = (BeautyCategory) obj2;
            if (beautyCategory4 != null) {
                C44709f a4 = composerBeautyViewImpl2.f118488c.mo90679a(a.indexOf(beautyCategory4));
                if (a4 != null) {
                    a4.mo90744a();
                }
            }
            if (composerBeautyViewImpl2.f118510y.mo94115n().getHasTitle()) {
                AVDmtTabLayout aVDmtTabLayout2 = composerBeautyViewImpl2.f118488c;
                C52711k.m112236a((Object) aVDmtTabLayout2, "tbCategoryTab");
                aVDmtTabLayout2.setVisibility(0);
            } else {
                AVDmtTabLayout aVDmtTabLayout3 = composerBeautyViewImpl2.f118488c;
                C52711k.m112236a((Object) aVDmtTabLayout3, "tbCategoryTab");
                aVDmtTabLayout3.setVisibility(8);
            }
            composerBeautyViewImpl2.f118498m.f118278b = composerBeautyViewImpl2.f118505t;
            composerBeautyViewImpl2.f118499n.f118278b = composerBeautyViewImpl2.f118506u;
            if (composerBeautyViewImpl2.f118502q) {
                ComposerBeautyViewImpl.m101911a(composerBeautyViewImpl2, composerBeautyViewImpl2.f118501p, true, false, false, null, 20, null);
            } else {
                ComposerBeautyViewImpl.m101911a(composerBeautyViewImpl2, composerBeautyViewImpl2.f118500o, false, false, false, null, 22, null);
            }
            ComposerBeautyViewImpl composerBeautyViewImpl3 = this.f118518a;
            composerBeautyViewImpl3.f118495j.setOnSeekBarChangeListener(new C46913h(composerBeautyViewImpl3));
            AVTextView aVTextView = composerBeautyViewImpl3.f118494i;
            C52711k.m112236a((Object) aVTextView, "tvSeekClear");
            aVTextView.setVisibility(8);
            composerBeautyViewImpl3.f118497l.setImageResource(R.drawable.d4f);
            composerBeautyViewImpl3.f118496k.setOnClickListener(new C46916i(composerBeautyViewImpl3));
            ComposerBeautyViewImpl composerBeautyViewImpl4 = this.f118518a;
            composerBeautyViewImpl4.f118491f.setOnClickListener(new C46912g(composerBeautyViewImpl4));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$c */
    static final class C46908c extends C52712l implements C52682m<ComposerBeauty, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118519a;

        C46908c(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f118519a = composerBeautyViewImpl;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ComposerBeauty composerBeauty = (ComposerBeauty) obj;
            ((Number) obj2).intValue();
            C52711k.m112240b(composerBeauty, "beautyBean");
            ComposerBeautyViewImpl.m101911a(this.f118519a, composerBeauty, true, true, false, null, 24, null);
            this.f118519a.getSource().mo94105e(composerBeauty);
            this.f118519a.getSource().mo94086a(composerBeauty);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$d */
    static final class C46909d extends C52712l implements C52682m<ComposerBeauty, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118520a;

        C46909d(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f118520a = composerBeautyViewImpl;
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3 */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
            if (r11 == null) goto L_0x0093;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.beauty.ComposerBeauty r10 = (com.p683ss.android.ugc.aweme.beauty.ComposerBeauty) r10
                java.lang.Number r11 = (java.lang.Number) r11
                r11.intValue()
                java.lang.String r11 = "composerBeauty"
                p2628d.p2639f.p2641b.C52711k.m112240b(r10, r11)
                boolean r11 = r10.isCollectionType()
                r0 = 0
                if (r11 == 0) goto L_0x0015
                r11 = r10
                goto L_0x0016
            L_0x0015:
                r11 = r0
            L_0x0016:
                if (r11 == 0) goto L_0x0093
                com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl r1 = r9.f118520a
                r1.f118500o = r11
                com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl r1 = r9.f118520a
                com.ss.android.ugc.aweme.tools.beauty.service.b r1 = r1.getBeautyBuried()
                if (r1 == 0) goto L_0x0027
                r1.mo94166a(r11)
            L_0x0027:
                com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl r1 = r9.f118520a
                android.widget.TextView r1 = r1.f118492g
                java.lang.String r2 = "tvAlbumTitleName"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r11.getEffect()
                java.lang.String r2 = r2.getName()
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r1.setText(r2)
                com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl r1 = r9.f118520a
                android.widget.RelativeLayout r2 = r1.f118490e
                java.lang.String r3 = "rlAlbumContainer"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                r3 = 0
                r2.setVisibility(r3)
                r1.mo94186a(r3)
                r2 = 1
                r1.f118502q = r2
                com.ss.android.ugc.aweme.tools.beauty.service.b r2 = r1.f118486a
                if (r2 == 0) goto L_0x0059
                com.ss.android.ugc.aweme.beauty.ComposerBeauty r3 = r1.f118503r
                r2.mo94168b(r3)
            L_0x0059:
                r1.f118503r = r0
                java.util.List r1 = r11.getChildList()
                if (r1 == 0) goto L_0x0091
                com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl r2 = r9.f118520a
                com.ss.android.ugc.aweme.tools.beauty.a.a r2 = r2.f118499n
                r2.mo94058a(r1)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x006e:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0082
                java.lang.Object r2 = r1.next()
                r3 = r2
                com.ss.android.ugc.aweme.beauty.ComposerBeauty r3 = (com.p683ss.android.ugc.aweme.beauty.ComposerBeauty) r3
                boolean r3 = r3.getSelected()
                if (r3 == 0) goto L_0x006e
                r0 = r2
            L_0x0082:
                r2 = r0
                com.ss.android.ugc.aweme.beauty.ComposerBeauty r2 = (com.p683ss.android.ugc.aweme.beauty.ComposerBeauty) r2
                com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl r1 = r9.f118520a
                r3 = 1
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 28
                r8 = 0
                com.p683ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl.m101911a(r1, r2, r3, r4, r5, r6, r7, r8)
            L_0x0091:
                if (r11 != 0) goto L_0x00bd
            L_0x0093:
                com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl r11 = r9.f118520a
                com.ss.android.ugc.aweme.tools.beauty.service.b r11 = r11.getBeautyBuried()
                if (r11 == 0) goto L_0x009e
                r11.mo94166a(r10)
            L_0x009e:
                com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl r0 = r9.f118520a
                r2 = 0
                r3 = 1
                r4 = 0
                r5 = 0
                r6 = 26
                r7 = 0
                r1 = r10
                com.p683ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl.m101911a(r0, r1, r2, r3, r4, r5, r6, r7)
                com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl r11 = r9.f118520a
                com.ss.android.ugc.aweme.tools.beauty.c.g r11 = r11.getSource()
                r11.mo94103d(r10)
                com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl r11 = r9.f118520a
                com.ss.android.ugc.aweme.tools.beauty.c.g r11 = r11.getSource()
                r11.mo94086a(r10)
            L_0x00bd:
                d.x r10 = p2628d.C52860x.f131107a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl.C46909d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$e */
    public static final class C46910e implements C29189a<C46870d, Void> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118521a;

        C46910e(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f118521a = composerBeautyViewImpl;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo59076a(Object obj) {
            C46870d dVar = (C46870d) obj;
            C52711k.m112240b(dVar, "param");
            this.f118521a.mo94185a(this.f118521a.f118498m, dVar, false);
            this.f118521a.mo94185a(this.f118521a.f118499n, dVar, false);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo59078a(Object obj, Object obj2) {
            C46870d dVar = (C46870d) obj;
            Void voidR = (Void) obj2;
            C52711k.m112240b(dVar, "param");
            this.f118521a.mo94185a(this.f118521a.f118498m, dVar, true);
            this.f118521a.mo94185a(this.f118521a.f118499n, dVar, true);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo59077a(Object obj, Integer num, String str, Exception exc) {
            C46870d dVar = (C46870d) obj;
            C52711k.m112240b(dVar, "param");
            this.f118521a.mo94185a(this.f118521a.f118498m, dVar, false);
            this.f118521a.mo94185a(this.f118521a.f118499n, dVar, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$f */
    public static final class C46911f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118522a;

        /* renamed from: b */
        final /* synthetic */ boolean f118523b;

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f118523b) {
                RelativeLayout relativeLayout = this.f118522a.f118490e;
                C52711k.m112236a((Object) relativeLayout, "rlAlbumContainer");
                relativeLayout.setVisibility(8);
                return;
            }
            RelativeLayout relativeLayout2 = this.f118522a.f118487b;
            C52711k.m112236a((Object) relativeLayout2, "rlCategoryContainer");
            relativeLayout2.setVisibility(8);
        }

        C46911f(ComposerBeautyViewImpl composerBeautyViewImpl, boolean z) {
            this.f118522a = composerBeautyViewImpl;
            this.f118523b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$g */
    static final class C46912g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118524a;

        C46912g(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f118524a = composerBeautyViewImpl;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ComposerBeauty composerBeauty = this.f118524a.f118501p;
            if (composerBeauty != null) {
                this.f118524a.getSource().mo94086a(composerBeauty);
            }
            ComposerBeautyViewImpl composerBeautyViewImpl = this.f118524a;
            RelativeLayout relativeLayout = composerBeautyViewImpl.f118487b;
            C52711k.m112236a((Object) relativeLayout, "rlCategoryContainer");
            relativeLayout.setVisibility(0);
            composerBeautyViewImpl.f118498m.notifyDataSetChanged();
            composerBeautyViewImpl.mo94186a(true);
            composerBeautyViewImpl.f118502q = false;
            ComposerBeautyViewImpl.m101911a(composerBeautyViewImpl, composerBeautyViewImpl.f118500o, false, false, false, null, 22, null);
            C46893b bVar = composerBeautyViewImpl.f118486a;
            if (bVar != null) {
                bVar.mo94168b(composerBeautyViewImpl.f118503r);
            }
            composerBeautyViewImpl.f118503r = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$h */
    public static final class C46913h implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118525a;

        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$h$a */
        static final class C46914a extends C52712l implements C52671b<ComposerBeauty, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C46913h f118526a;

            /* renamed from: b */
            final /* synthetic */ SeekBar f118527b;

            /* renamed from: c */
            final /* synthetic */ int f118528c;

            C46914a(C46913h hVar, SeekBar seekBar, int i) {
                this.f118526a = hVar;
                this.f118527b = seekBar;
                this.f118528c = i;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mo94206a((ComposerBeauty) obj);
                return C52860x.f131107a;
            }

            /* renamed from: a */
            public final void mo94206a(ComposerBeauty composerBeauty) {
                boolean z;
                ComposerBeauty composerBeauty2 = composerBeauty;
                C52711k.m112240b(composerBeauty2, "composerBeauty");
                List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                Collection collection = items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    items = null;
                }
                if (items != null) {
                    for (ItemsBean itemsBean : items) {
                        C46875a aVar = new C46875a(itemsBean.getDoubleDirection(), this.f118527b.getMax(), 0, 0, itemsBean.getMax(), itemsBean.getMin(), 0, this.f118528c, false, 332, null);
                        float a = C46874h.m101796a(aVar);
                        if (C46871e.m101795e(composerBeauty)) {
                            C46899a beautyViewListener = this.f118526a.f118525a.getBeautyViewListener();
                            if (beautyViewListener != null) {
                                String unzipPath = composerBeauty.getEffect().getUnzipPath();
                                C52711k.m112236a((Object) unzipPath, "effect.unzipPath");
                                beautyViewListener.mo94067a(unzipPath, itemsBean.getTag(), a / 100.0f);
                            }
                        }
                    }
                    composerBeauty2.setProgressValue(this.f118528c);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$h$b */
        static final class C46915b extends C52712l implements C52671b<ComposerBeauty, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C46913h f118529a;

            /* renamed from: b */
            final /* synthetic */ SeekBar f118530b;

            C46915b(C46913h hVar, SeekBar seekBar) {
                this.f118529a = hVar;
                this.f118530b = seekBar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mo94207a((ComposerBeauty) obj);
                return C52860x.f131107a;
            }

            /* renamed from: a */
            public final void mo94207a(ComposerBeauty composerBeauty) {
                boolean z;
                ComposerBeauty composerBeauty2 = composerBeauty;
                C52711k.m112240b(composerBeauty2, "composerBeauty");
                List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                Collection collection = items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    items = null;
                }
                if (items != null) {
                    for (ItemsBean itemsBean : items) {
                        C46875a aVar = new C46875a(itemsBean.getDoubleDirection(), this.f118530b.getMax(), 0, 0, itemsBean.getMax(), itemsBean.getMin(), 0, this.f118530b.getProgress(), false, 332, null);
                        float a = C46874h.m101796a(aVar);
                        this.f118529a.f118525a.getSource().mo94095b(composerBeauty2, itemsBean.getTag(), (int) a);
                        C46869h d = this.f118529a.f118525a.getSource().mo94101d();
                        StringBuilder sb = new StringBuilder();
                        sb.append(composerBeauty.getEffect().getUnzipPath());
                        sb.append(':');
                        sb.append(itemsBean.getTag());
                        sb.append(':');
                        sb.append(a / 100.0f);
                        String sb2 = sb.toString();
                        String extra = composerBeauty.getEffect().getExtra();
                        if (extra == null) {
                            extra = "";
                        }
                        String effectId = composerBeauty.getEffect().getEffectId();
                        C52711k.m112236a((Object) effectId, "effect.effectId");
                        d.add(new ComposerInfo(sb2, extra, effectId));
                        if (C46871e.m101789a(composerBeauty)) {
                            this.f118529a.f118525a.getSource().mo94105e(composerBeauty2);
                        } else {
                            this.f118529a.f118525a.getSource().mo94103d(composerBeauty2);
                        }
                    }
                }
            }
        }

        C46913h(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f118525a = composerBeautyViewImpl;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            boolean z = this.f118525a.f118502q;
            Object obj = null;
            if (z) {
                Iterator it = this.f118525a.f118499n.f118277a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (C52711k.m112239a((Object) (ComposerBeauty) next, (Object) this.f118525a.f118501p)) {
                        obj = next;
                        break;
                    }
                }
                ComposerBeauty composerBeauty = (ComposerBeauty) obj;
                if (composerBeauty != null) {
                    this.f118525a.mo94184a(composerBeauty, true, false);
                }
            } else if (!z) {
                Iterator it2 = this.f118525a.f118498m.f118277a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (C52711k.m112239a((Object) (ComposerBeauty) next2, (Object) this.f118525a.f118500o)) {
                        obj = next2;
                        break;
                    }
                }
                ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                if (composerBeauty2 != null) {
                    this.f118525a.mo94184a(composerBeauty2, true, false);
                }
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            Object obj;
            Object obj2;
            if (seekBar != null) {
                C46915b bVar = new C46915b(this, seekBar);
                boolean z = this.f118525a.f118502q;
                if (z) {
                    Iterator it = this.f118525a.f118499n.f118277a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (C52711k.m112239a((Object) (ComposerBeauty) obj2, (Object) this.f118525a.f118501p)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty = (ComposerBeauty) obj2;
                    if (composerBeauty != null) {
                        bVar.mo94207a(composerBeauty);
                        this.f118525a.getSource().mo94086a(composerBeauty);
                    }
                } else if (!z) {
                    Iterator it2 = this.f118525a.f118498m.f118277a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (C52711k.m112239a((Object) (ComposerBeauty) obj, (Object) this.f118525a.f118500o)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                    if (composerBeauty2 != null) {
                        bVar.mo94207a(composerBeauty2);
                        this.f118525a.getSource().mo94086a(composerBeauty2);
                        int indexOf = this.f118525a.f118498m.f118277a.indexOf(composerBeauty2);
                        if (indexOf >= 0 && indexOf < this.f118525a.f118498m.f118277a.size()) {
                            this.f118525a.f118498m.notifyItemChanged(indexOf);
                        }
                    }
                }
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Object obj;
            Object obj2;
            if (seekBar != null) {
                C46914a aVar = new C46914a(this, seekBar, i);
                boolean z2 = this.f118525a.f118502q;
                if (z2) {
                    Iterator it = this.f118525a.f118499n.f118277a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (C52711k.m112239a((Object) (ComposerBeauty) obj2, (Object) this.f118525a.f118501p)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty = (ComposerBeauty) obj2;
                    if (composerBeauty != null) {
                        aVar.mo94206a(composerBeauty);
                    }
                } else if (!z2) {
                    Iterator it2 = this.f118525a.f118498m.f118277a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (C52711k.m112239a((Object) (ComposerBeauty) obj, (Object) this.f118525a.f118500o)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                    if (composerBeauty2 != null) {
                        aVar.mo94206a(composerBeauty2);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$i */
    static final class C46916i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118531a;

        C46916i(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f118531a = composerBeautyViewImpl;
        }

        public final void onClick(View view) {
            Object obj;
            Object obj2;
            ClickInstrumentation.onClick(view);
            if (this.f118531a.f118500o != null || this.f118531a.f118501p != null) {
                C469171 r6 = new C52671b<ComposerBeauty, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C46916i f118532a;

                    {
                        this.f118532a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        mo94209a((ComposerBeauty) obj);
                        return C52860x.f131107a;
                    }

                    /* renamed from: a */
                    public final void mo94209a(ComposerBeauty composerBeauty) {
                        ComposerBeauty composerBeauty2 = composerBeauty;
                        C52711k.m112240b(composerBeauty2, "composerBeauty");
                        boolean z = false;
                        this.f118532a.f118531a.mo94184a(composerBeauty2, true, false);
                        List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                        Collection collection = items;
                        if (collection == null || collection.isEmpty()) {
                            z = true;
                        }
                        if (!(!z)) {
                            items = null;
                        }
                        if (items != null) {
                            for (ItemsBean itemsBean : items) {
                                C46875a aVar = new C46875a(itemsBean.getDoubleDirection(), 100, 0, 0, itemsBean.getMax(), itemsBean.getMin(), itemsBean.getValue(), 0, false, 396, null);
                                C46875a b = C46874h.m101797b(aVar);
                                BeautyProgressBar beautyProgressBar = this.f118532a.f118531a.f118495j;
                                C52711k.m112236a((Object) beautyProgressBar, "pbProgressBar");
                                beautyProgressBar.setProgress(b.f118420h);
                                this.f118532a.f118531a.getSource().mo94095b(composerBeauty2, itemsBean.getTag(), itemsBean.getValue());
                                if (C46871e.m101795e(composerBeauty)) {
                                    C46899a beautyViewListener = this.f118532a.f118531a.getBeautyViewListener();
                                    if (beautyViewListener != null) {
                                        String unzipPath = composerBeauty.getEffect().getUnzipPath();
                                        C52711k.m112236a((Object) unzipPath, "effect.unzipPath");
                                        beautyViewListener.mo94067a(unzipPath, itemsBean.getTag(), ((float) itemsBean.getValue()) / 100.0f);
                                    }
                                }
                                composerBeauty2.setProgressValue(b.f118420h);
                            }
                        }
                    }
                };
                boolean z = this.f118531a.f118502q;
                if (z) {
                    Iterator it = this.f118531a.f118499n.f118277a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (C52711k.m112239a((Object) (ComposerBeauty) obj2, (Object) this.f118531a.f118501p)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty = (ComposerBeauty) obj2;
                    if (composerBeauty != null) {
                        r6.mo94209a(composerBeauty);
                        C46893b beautyBuried = this.f118531a.getBeautyBuried();
                        if (beautyBuried != null) {
                            beautyBuried.mo94169c(composerBeauty);
                        }
                        this.f118531a.getSource().mo94086a(composerBeauty);
                    }
                } else if (!z) {
                    Iterator it2 = this.f118531a.f118498m.f118277a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (C52711k.m112239a((Object) (ComposerBeauty) obj, (Object) this.f118531a.f118500o)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                    if (composerBeauty2 != null) {
                        r6.mo94209a(composerBeauty2);
                        C46893b beautyBuried2 = this.f118531a.getBeautyBuried();
                        if (beautyBuried2 != null) {
                            beautyBuried2.mo94169c(composerBeauty2);
                        }
                        this.f118531a.getSource().mo94086a(composerBeauty2);
                        int indexOf = this.f118531a.f118498m.f118277a.indexOf(composerBeauty2);
                        if (indexOf >= 0 && indexOf < this.f118531a.f118498m.f118277a.size()) {
                            this.f118531a.f118498m.notifyItemChanged(indexOf);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$j */
    static final class C46918j implements C44703b {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118533a;

        /* renamed from: b */
        final /* synthetic */ List f118534b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f118535c;

        C46918j(ComposerBeautyViewImpl composerBeautyViewImpl, List list, ArrayList arrayList) {
            this.f118533a = composerBeautyViewImpl;
            this.f118534b = list;
            this.f118535c = arrayList;
        }

        /* renamed from: a */
        public final void mo64479a(C44709f fVar) {
            Object obj;
            fVar.mo90744a();
            Iterator it = this.f118534b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                BeautyCategory beautyCategory = (BeautyCategory) obj;
                ArrayList arrayList = this.f118535c;
                C52711k.m112236a((Object) fVar, "it");
                if (C52711k.m112239a((Object) (String) arrayList.get(fVar.f113161e), (Object) beautyCategory.getCategoryResponse().getId())) {
                    break;
                }
            }
            BeautyCategory beautyCategory2 = (BeautyCategory) obj;
            if (beautyCategory2 != null) {
                C46893b beautyBuried = this.f118533a.getBeautyBuried();
                if (beautyBuried != null) {
                    beautyBuried.mo94167a(beautyCategory2);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$k */
    public static final class C46919k implements C44704c {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118536a;

        /* renamed from: b */
        final /* synthetic */ List f118537b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f118538c;

        /* renamed from: b */
        public final void mo64264b(C44709f fVar) {
        }

        /* renamed from: c */
        public final void mo64265c(C44709f fVar) {
        }

        /* renamed from: a */
        public final void mo64263a(C44709f fVar) {
            Object obj;
            Object obj2;
            if (fVar != null) {
                Iterator it = this.f118537b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C52711k.m112239a((Object) (String) this.f118538c.get(fVar.f113161e), (Object) ((BeautyCategory) obj).getCategoryResponse().getId())) {
                        break;
                    }
                }
                BeautyCategory beautyCategory = (BeautyCategory) obj;
                if (beautyCategory != null) {
                    this.f118536a.getSource().mo94089a(beautyCategory.getCategoryResponse().getId());
                    this.f118536a.f118498m.mo94058a(beautyCategory.getBeautyList());
                    Iterator it2 = this.f118536a.f118498m.f118277a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (((ComposerBeauty) obj2).getSelected()) {
                            break;
                        }
                    }
                    ComposerBeautyViewImpl.m101911a(this.f118536a, (ComposerBeauty) obj2, false, false, false, null, 30, null);
                }
            }
        }

        C46919k(ComposerBeautyViewImpl composerBeautyViewImpl, List list, ArrayList arrayList) {
            this.f118536a = composerBeautyViewImpl;
            this.f118537b = list;
            this.f118538c = arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$l */
    static final class C46920l extends C52712l implements C52671b<ComposerBeauty, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118539a;

        /* renamed from: b */
        final /* synthetic */ C46870d f118540b;

        C46920l(ComposerBeautyViewImpl composerBeautyViewImpl, C46870d dVar) {
            this.f118539a = composerBeautyViewImpl;
            this.f118540b = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo94210a((ComposerBeauty) obj);
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo94210a(ComposerBeauty composerBeauty) {
            C52711k.m112240b(composerBeauty, "$this$updateWhenDownloaded");
            if (C52711k.m112239a((Object) this.f118540b.f118407b, (Object) composerBeauty.getEffect().getUnzipPath()) && !this.f118539a.getSource().mo94100c(composerBeauty)) {
                this.f118539a.mo94184a(composerBeauty, true, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$m */
    static final class C46921m extends C52712l implements C52671b<C46870d, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118541a;

        C46921m(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f118541a = composerBeautyViewImpl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo94211a((C46870d) obj);
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo94211a(C46870d dVar) {
            C52711k.m112240b(dVar, "beautyDownload");
            if (!this.f118541a.f118507v.containsKey(dVar)) {
                C46829a.f118310b.mo94073a(dVar, this.f118541a.f118508w);
                this.f118541a.f118507v.put(dVar, this.f118541a.f118508w);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$n */
    static final class C46922n extends C52712l implements C52671b<ComposerBeauty, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f118542a;

        C46922n(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f118542a = composerBeautyViewImpl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo94212a((ComposerBeauty) obj);
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo94212a(ComposerBeauty composerBeauty) {
            boolean z;
            C52711k.m112240b(composerBeauty, "$this$checkExclusiveData");
            boolean z2 = true;
            if (composerBeauty.getExtra().isNone()) {
                C46899a beautyViewListener = this.f118542a.getBeautyViewListener();
                if (beautyViewListener != null) {
                    String unzipPath = composerBeauty.getEffect().getUnzipPath();
                    C52711k.m112236a((Object) unzipPath, "effect.unzipPath");
                    int[] a = beautyViewListener.mo94070a(unzipPath, "");
                    if (a != null) {
                        if (!(a.length == 2 && a[0] == 0 && a[1] == C46832b.EXCLUDE.getFlag())) {
                            z2 = false;
                        }
                        if (!z2) {
                            a = null;
                        }
                        if (a != null) {
                            composerBeauty.setEnable(false);
                        }
                    }
                }
                return;
            }
            List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null) {
                for (ItemsBean itemsBean : items) {
                    C46899a beautyViewListener2 = this.f118542a.getBeautyViewListener();
                    if (beautyViewListener2 != null) {
                        String unzipPath2 = composerBeauty.getEffect().getUnzipPath();
                        C52711k.m112236a((Object) unzipPath2, "effect.unzipPath");
                        int[] a2 = beautyViewListener2.mo94070a(unzipPath2, itemsBean.getTag());
                        if (a2 != null) {
                            if (a2.length == 2 && a2[0] == 0 && a2[1] == C46832b.EXCLUDE.getFlag()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                a2 = null;
                            }
                            if (a2 != null) {
                                composerBeauty.setEnable(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final C46893b getBeautyBuried() {
        return this.f118486a;
    }

    public final C46899a getBeautyViewListener() {
        return this.f118511z;
    }

    public final ViewGroup getContainer() {
        return this.f118484G;
    }

    public final C46899a getOnBeautyViewListener() {
        return this.f118485H;
    }

    public final C46867g getSource() {
        return this.f118510y;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    private final void unregisterDownloadCallbacks() {
        for (Entry entry : this.f118507v.entrySet()) {
            C46829a.f118310b.mo94075b((C46870d) entry.getKey(), (C29189a) entry.getValue());
        }
    }

    /* renamed from: b */
    public final void mo94172b() {
        if (this.f118509x) {
            this.f118509x = false;
            C46923a aVar = this.f118483F;
            if (aVar != null) {
                aVar.mo50223b(new C24453c());
            }
            C46893b bVar = this.f118486a;
            if (bVar != null) {
                bVar.mo94168b(this.f118503r);
            }
            C46899a aVar2 = this.f118485H;
            if (aVar2 != null) {
                aVar2.mo94071b();
            }
            C46899a aVar3 = this.f118511z;
            if (aVar3 != null) {
                aVar3.mo94071b();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        if (((com.p683ss.android.ugc.aweme.beauty.ComposerBeauty) r8) == null) goto L_0x00ca;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94171a() {
        /*
            r10 = this;
            boolean r0 = r10.f118509x
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r10.f118509x = r0
            com.ss.android.ugc.aweme.tools.beauty.views.a r1 = r10.f118483F
            if (r1 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.bx.c r2 = new com.ss.android.ugc.aweme.bx.c
            r2.<init>()
            com.ss.android.ugc.aweme.bx.d r2 = (com.p683ss.android.ugc.aweme.p1484bx.C24454d) r2
            r1.mo50219a(r2)
        L_0x0016:
            com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$n r1 = new com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$n
            r1.<init>(r10)
            java.util.Map<com.ss.android.ugc.aweme.tools.beauty.BeautyCategory, java.util.List<com.ss.android.ugc.aweme.beauty.ComposerBeauty>> r2 = r10.f118504s
            if (r2 == 0) goto L_0x0111
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0027:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0111
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x003d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0027
            java.lang.Object r4 = r3.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r4 = (com.p683ss.android.ugc.aweme.beauty.ComposerBeauty) r4
            r4.setEnable(r0)
            boolean r5 = r4.isCollectionType()
            r6 = 0
            if (r5 != 0) goto L_0x0065
            boolean r5 = com.p683ss.android.ugc.aweme.tools.beauty.C46871e.m101795e(r4)
            if (r5 == 0) goto L_0x005a
            r6 = r4
        L_0x005a:
            if (r6 == 0) goto L_0x005f
            r1.mo94212a(r6)
        L_0x005f:
            com.ss.android.ugc.aweme.tools.beauty.c.g r5 = r10.f118510y
            r5.mo94086a(r4)
            goto L_0x003d
        L_0x0065:
            java.util.List r5 = r4.getChildList()
            r7 = 0
            if (r5 == 0) goto L_0x00a5
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            if (r8 == 0) goto L_0x007a
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r8 = 0
            goto L_0x007b
        L_0x007a:
            r8 = 1
        L_0x007b:
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r5 = r6
        L_0x0080:
            if (r5 == 0) goto L_0x00a5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0088:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00a5
            java.lang.Object r8 = r5.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r8 = (com.p683ss.android.ugc.aweme.beauty.ComposerBeauty) r8
            r8.setEnable(r0)
            boolean r9 = com.p683ss.android.ugc.aweme.tools.beauty.C46871e.m101795e(r8)
            if (r9 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r8 = r6
        L_0x009f:
            if (r8 == 0) goto L_0x0088
            r1.mo94212a(r8)
            goto L_0x0088
        L_0x00a5:
            java.util.List r5 = r4.getChildList()
            if (r5 == 0) goto L_0x00ca
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x00b1:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00c5
            java.lang.Object r8 = r5.next()
            r9 = r8
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r9 = (com.p683ss.android.ugc.aweme.beauty.ComposerBeauty) r9
            boolean r9 = r9.getEnable()
            if (r9 == 0) goto L_0x00b1
            goto L_0x00c6
        L_0x00c5:
            r8 = r6
        L_0x00c6:
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r8 = (com.p683ss.android.ugc.aweme.beauty.ComposerBeauty) r8
            if (r8 != 0) goto L_0x00d2
        L_0x00ca:
            r4.setEnable(r7)
            com.ss.android.ugc.aweme.tools.beauty.c.g r5 = r10.f118510y
            r5.mo94086a(r4)
        L_0x00d2:
            java.util.List r4 = r4.getChildList()
            if (r4 == 0) goto L_0x003d
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00de:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r4.next()
            r8 = r5
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r8 = (com.p683ss.android.ugc.aweme.beauty.ComposerBeauty) r8
            boolean r9 = r8.getEnable()
            if (r9 == 0) goto L_0x0101
            boolean r9 = r8.getSelected()
            if (r9 == 0) goto L_0x0101
            com.ss.android.ugc.aweme.tools.beauty.c.g r9 = r10.f118510y
            boolean r8 = r9.mo94100c(r8)
            if (r8 != 0) goto L_0x0101
            r8 = 1
            goto L_0x0102
        L_0x0101:
            r8 = 0
        L_0x0102:
            if (r8 == 0) goto L_0x00de
            goto L_0x0106
        L_0x0105:
            r5 = r6
        L_0x0106:
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r5 = (com.p683ss.android.ugc.aweme.beauty.ComposerBeauty) r5
            if (r5 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.tools.beauty.c.g r4 = r10.f118510y
            r4.mo94086a(r5)
            goto L_0x003d
        L_0x0111:
            boolean r0 = r10.f118502q
            if (r0 == 0) goto L_0x011b
            com.ss.android.ugc.aweme.tools.beauty.a.a r0 = r10.f118499n
            r0.notifyDataSetChanged()
            goto L_0x0120
        L_0x011b:
            com.ss.android.ugc.aweme.tools.beauty.a.a r0 = r10.f118498m
            r0.notifyDataSetChanged()
        L_0x0120:
            com.ss.android.ugc.aweme.tools.beauty.service.f$a r0 = r10.f118485H
            if (r0 == 0) goto L_0x0127
            r0.mo94065a()
        L_0x0127:
            com.ss.android.ugc.aweme.tools.beauty.service.f$a r0 = r10.f118511z
            if (r0 == 0) goto L_0x012f
            r0.mo94065a()
            return
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl.mo94171a():void");
    }

    public final void setBeautyBuried(C46893b bVar) {
        this.f118486a = bVar;
    }

    public final void setBeautyViewListener(C46899a aVar) {
        this.f118511z = aVar;
    }

    public final void setListener(C46899a aVar) {
        this.f118485H = aVar;
    }

    public final void setOnBeautyViewListener(C46899a aVar) {
        this.f118485H = aVar;
    }

    public final void setShow(boolean z) {
        this.f118509x = z;
    }

    public final void setProgressbarColor(int i) {
        this.f118495j.setTextColor(i);
    }

    public final void setBorderColor(int i) {
        this.f118498m.f118280d = i;
        this.f118499n.f118280d = i;
    }

    public final void setProgressbarDrawable(Drawable drawable) {
        C52711k.m112240b(drawable, "drawable");
        BeautyProgressBar beautyProgressBar = this.f118495j;
        C52711k.m112236a((Object) beautyProgressBar, "pbProgressBar");
        beautyProgressBar.setProgressDrawable(drawable);
    }

    /* renamed from: b */
    private final void m101912b(boolean z) {
        if (z) {
            RelativeLayout relativeLayout = this.f118482E;
            C52711k.m112236a((Object) relativeLayout, "rlSeekBarContainer");
            relativeLayout.setVisibility(0);
            return;
        }
        RelativeLayout relativeLayout2 = this.f118482E;
        C52711k.m112236a((Object) relativeLayout2, "rlSeekBarContainer");
        relativeLayout2.setVisibility(8);
    }

    public final void setContainer(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "value");
        this.f118484G = viewGroup;
        this.f118483F = new C46923a(this.f118484G, this, this.f118478A);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo94186a(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        RelativeLayout relativeLayout = this.f118487b;
        String str = "translationX";
        float[] fArr = new float[2];
        float f8 = 0.0f;
        if (z) {
            f = -C46786a.m101626d();
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = -C46786a.m101626d();
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, str, fArr);
        RelativeLayout relativeLayout2 = this.f118487b;
        String str2 = "alpha";
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout2, str2, fArr2);
        RelativeLayout relativeLayout3 = this.f118490e;
        String str3 = "translationX";
        float[] fArr3 = new float[2];
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = C46786a.m101626d();
        }
        fArr3[0] = f5;
        if (z) {
            f6 = C46786a.m101626d();
        } else {
            f6 = 0.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(relativeLayout3, str3, fArr3);
        RelativeLayout relativeLayout4 = this.f118490e;
        String str4 = "alpha";
        float[] fArr4 = new float[2];
        if (z) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        fArr4[0] = f7;
        if (!z) {
            f8 = 1.0f;
        }
        fArr4[1] = f8;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(relativeLayout4, str4, fArr4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        animatorSet.addListener(new C46911f(this, z));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300);
        animatorSet.start();
    }

    private ComposerBeautyViewImpl(Context context, C46867g gVar) {
        super(context);
        this.f118510y = gVar;
        this.f118478A = LayoutInflater.from(context).inflate(R.layout.axw, this, true);
        this.f118479B = this.f118478A.findViewById(R.id.f64);
        this.f118487b = (RelativeLayout) this.f118478A.findViewById(R.id.esr);
        this.f118488c = (AVDmtTabLayout) this.f118478A.findViewById(R.id.f0f);
        this.f118489d = (AVDmtPanelRecyleView) this.f118478A.findViewById(R.id.etj);
        this.f118490e = (RelativeLayout) this.f118478A.findViewById(R.id.esp);
        this.f118480C = (RelativeLayout) this.f118478A.findViewById(R.id.esq);
        this.f118481D = (ImageView) this.f118478A.findViewById(R.id.eed);
        this.f118491f = (FrameLayout) this.f118478A.findViewById(R.id.e91);
        this.f118492g = (TextView) this.f118478A.findViewById(R.id.f1x);
        this.f118493h = (AVDmtPanelRecyleView) this.f118478A.findViewById(R.id.eti);
        this.f118494i = (AVTextView) this.f118478A.findViewById(R.id.f1y);
        this.f118495j = (BeautyProgressBar) this.f118478A.findViewById(R.id.eo2);
        this.f118482E = (RelativeLayout) this.f118478A.findViewById(R.id.esu);
        this.f118496k = (RelativeLayout) this.f118478A.findViewById(R.id.ess);
        this.f118497l = (ImageView) this.f118478A.findViewById(R.id.eee);
        this.f118498m = new C46815a();
        this.f118499n = new C46815a();
        this.f118484G = new FrameLayout(context);
        this.f118504s = new LinkedHashMap();
        this.f118505t = new C46909d(this);
        this.f118506u = new C46908c(this);
        this.f118507v = new HashMap<>();
        this.f118508w = new C46910e(this);
        if (context instanceof AppCompatActivity) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) context;
            appCompatActivity.getLifecycle().mo324a(this);
            this.f118510y.mo94094b().mo95074a(appCompatActivity, new C46907b(this));
        }
        RelativeLayout relativeLayout = this.f118490e;
        C52711k.m112236a((Object) relativeLayout, "rlAlbumContainer");
        relativeLayout.setAlpha(0.0f);
        RelativeLayout relativeLayout2 = this.f118490e;
        C52711k.m112236a((Object) relativeLayout2, "rlAlbumContainer");
        relativeLayout2.setTranslationX(C46786a.m101626d());
        this.f118479B.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ ComposerBeautyViewImpl f118512a;

            {
                this.f118512a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f118512a.mo94172b();
            }
        });
    }

    public /* synthetic */ ComposerBeautyViewImpl(Context context, C46867g gVar, C52707g gVar2) {
        this(context, gVar);
    }

    /* renamed from: a */
    public final void mo94184a(ComposerBeauty composerBeauty, boolean z, boolean z2) {
        boolean z3;
        Object obj;
        boolean z4;
        ComposerBeauty composerBeauty2 = composerBeauty;
        if (z && C46871e.m101795e(composerBeauty)) {
            if (C46871e.m101794d(composerBeauty)) {
                z3 = composerBeauty.getSelected();
            } else {
                z3 = true;
            }
            if (z3) {
                List a = this.f118510y.mo94085a(composerBeauty, false, false);
                if (C46871e.m101794d(composerBeauty)) {
                    List a2 = C46871e.m101787a(composerBeauty2, this.f118510y.mo94084a());
                    if (!(!a2.isEmpty())) {
                        a2 = null;
                    }
                    if (a2 != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = a2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            ComposerBeauty composerBeauty3 = (ComposerBeauty) obj;
                            if (!composerBeauty3.getAdd2Nodes() || !(!C52711k.m112239a((Object) composerBeauty3, (Object) composerBeauty2))) {
                                z4 = false;
                                continue;
                            } else {
                                z4 = true;
                                continue;
                            }
                            if (z4) {
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty4 = (ComposerBeauty) obj;
                        if (composerBeauty4 != null) {
                            composerBeauty4.setAdd2Nodes(false);
                            C46867g gVar = this.f118510y;
                            String effectId = composerBeauty.getEffect().getEffectId();
                            C52711k.m112236a((Object) effectId, "effect.effectId");
                            gVar.mo94096b(new C46821b(effectId, 1));
                            arrayList.addAll(this.f118510y.mo94085a(composerBeauty4, false, false));
                        }
                        composerBeauty2.setAdd2Nodes(true);
                        C46867g gVar2 = this.f118510y;
                        String effectId2 = composerBeauty.getEffect().getEffectId();
                        C52711k.m112236a((Object) effectId2, "effect.effectId");
                        gVar2.mo94088a(new C46821b(effectId2, 1));
                        C46899a aVar = this.f118511z;
                        if (aVar != null) {
                            aVar.mo94069a((List<ComposerInfo>) arrayList, a, 10000);
                        }
                        this.f118510y.mo94101d().removeAll(arrayList);
                        this.f118510y.mo94101d().addAll(a);
                        new C46864f("").mo94126a(composerBeauty.needFaceDetect());
                    }
                } else {
                    composerBeauty2.setAdd2Nodes(true);
                    C46867g gVar3 = this.f118510y;
                    String effectId3 = composerBeauty.getEffect().getEffectId();
                    C52711k.m112236a((Object) effectId3, "effect.effectId");
                    gVar3.mo94088a(new C46821b(effectId3, 1));
                    C46899a aVar2 = this.f118511z;
                    if (aVar2 != null) {
                        aVar2.mo94068a(a, 10000);
                    }
                    this.f118510y.mo94101d().addAll(a);
                    new C46864f("").mo94126a(composerBeauty.needFaceDetect());
                }
            }
        }
        if (z2) {
            List items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null) {
                if (!(!items.isEmpty())) {
                    items = null;
                }
                if (items != null) {
                    this.f118495j.setDoubleDirection(((ItemsBean) items.get(0)).getDoubleDirection());
                    C46875a aVar3 = new C46875a(((ItemsBean) items.get(0)).getDoubleDirection(), 100, 0, 0, ((ItemsBean) items.get(0)).getMax(), ((ItemsBean) items.get(0)).getMin(), this.f118510y.mo94082a(composerBeauty2, ((ItemsBean) items.get(0)).getTag(), ((ItemsBean) items.get(0)).getValue()), 0, false, 396, null);
                    C46875a b = C46874h.m101797b(aVar3);
                    this.f118495j.setMaxValue(b.f118415c);
                    this.f118495j.setMinValue(b.f118416d);
                    BeautyProgressBar beautyProgressBar = this.f118495j;
                    C52711k.m112236a((Object) beautyProgressBar, "pbProgressBar");
                    beautyProgressBar.setProgress(b.f118420h);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo94185a(C46815a aVar, C46870d dVar, boolean z) {
        Iterable<ComposerBeauty> iterable = aVar.f118277a;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ComposerBeauty dVar2 : iterable) {
            arrayList.add(new C46870d(dVar2, null, 2, null));
        }
        Iterable iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable2) {
            if (C52711k.m112239a((Object) (C46870d) next, (Object) dVar)) {
                arrayList2.add(next);
            }
        }
        List list = (List) arrayList2;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            aVar.notifyDataSetChanged();
        }
        if (z) {
            C46920l lVar = new C46920l(this, dVar);
            for (List<ComposerBeauty> it : this.f118504s.values()) {
                for (ComposerBeauty composerBeauty : it) {
                    if (composerBeauty.isCollectionType()) {
                        List<ComposerBeauty> childList = composerBeauty.getChildList();
                        if (childList != null) {
                            for (ComposerBeauty a : childList) {
                                lVar.mo94210a(a);
                            }
                        }
                    } else {
                        lVar.mo94210a(composerBeauty);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m101910a(ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3, ComposerBeauty composerBeauty2) {
        boolean z4;
        boolean z5;
        if (z3) {
            C46893b bVar = this.f118486a;
            if (bVar != null) {
                bVar.mo94168b(this.f118503r);
            }
            this.f118503r = composerBeauty2;
        }
        if (composerBeauty == null) {
            m101912b(false);
            return;
        }
        if (z) {
            for (ComposerBeauty composerBeauty3 : this.f118499n.f118277a) {
                if (!C52711k.m112239a((Object) composerBeauty3, (Object) composerBeauty) || !composerBeauty3.getEnable()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                composerBeauty3.setSelected(z5);
            }
        } else {
            for (ComposerBeauty composerBeauty4 : this.f118498m.f118277a) {
                if (!C52711k.m112239a((Object) composerBeauty4, (Object) composerBeauty) || !composerBeauty4.getEnable()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                composerBeauty4.setSelected(z4);
            }
        }
        if (composerBeauty.isCollectionType()) {
            m101912b(false);
            return;
        }
        if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
            m101912b(false);
        } else {
            m101912b(true);
        }
        if (C46871e.m101789a(composerBeauty)) {
            this.f118501p = composerBeauty;
        } else {
            this.f118500o = composerBeauty;
        }
        mo94184a(composerBeauty, z2, true);
    }

    /* renamed from: a */
    static /* synthetic */ void m101911a(ComposerBeautyViewImpl composerBeautyViewImpl, ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3, ComposerBeauty composerBeauty2, int i, Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        ComposerBeauty composerBeauty3;
        if ((i & 2) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 4) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 8) != 0) {
            z6 = true;
        } else {
            z6 = z3;
        }
        if ((i & 16) != 0) {
            composerBeauty3 = composerBeauty;
        } else {
            composerBeauty3 = composerBeauty2;
        }
        composerBeautyViewImpl.m101910a(composerBeauty, z4, z5, z6, composerBeauty3);
    }
}
