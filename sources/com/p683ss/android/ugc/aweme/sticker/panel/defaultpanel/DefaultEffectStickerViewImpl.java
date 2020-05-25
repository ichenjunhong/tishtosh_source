package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.support.p030v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.aweme.filter.C31417ar;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44703b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44710g;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44713i;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45924b;
import com.p683ss.android.ugc.aweme.sticker.panel.C46191k.C46192a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46191k.C46193b;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.EffectStickerViewImpl;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2305a.C46125b;
import com.p683ss.android.ugc.aweme.sticker.panel.search.SearchStickerViewModel;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.tabguide.IStickerTabGuidePresenter;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.UrlPrefixViewModel;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl */
public final class DefaultEffectStickerViewImpl extends EffectStickerViewImpl {

    /* renamed from: A */
    private final C12361b f116357A;

    /* renamed from: y */
    public ViewPager f116358y;

    /* renamed from: z */
    private C46125b f116359z;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a */
    public static final class C46107a implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DefaultEffectStickerViewImpl f116360a;

        /* renamed from: b */
        final /* synthetic */ TabLayout f116361b;

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$a */
        static final class C46108a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C52727e f116362a;

            C46108a(C52727e eVar) {
                this.f116362a = eVar;
            }

            public final void run() {
                ((AVDmtTabItemView) this.f116362a.element).mo93986a(((AVDmtTabItemView) this.f116362a.element).getSelectColor());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$b */
        static final class C46109b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44709f f116363a;

            /* renamed from: b */
            final /* synthetic */ C52727e f116364b;

            C46109b(C44709f fVar, C52727e eVar) {
                this.f116363a = fVar;
                this.f116364b = eVar;
            }

            public final void run() {
                if (!this.f116363a.mo90745b()) {
                    this.f116363a.f113164h.post(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C46109b f116365a;

                        {
                            this.f116365a = r1;
                        }

                        public final void run() {
                            ((AVDmtTabItemView) this.f116365a.f116364b.element).mo93986a(((AVDmtTabItemView) this.f116365a.f116364b.element).getUnSelectColor());
                        }
                    });
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$c */
        static final class C46111c implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C44709f f116366a;

            C46111c(C44709f fVar) {
                this.f116366a = fVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C44713i iVar = this.f116366a.f113164h;
                C52711k.m112236a((Object) iVar, "it.view");
                C52711k.m112236a((Object) valueAnimator, "va");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    iVar.setTranslationY(((Float) animatedValue).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$d */
        static final class C46112d implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C44709f f116367a;

            C46112d(C44709f fVar) {
                this.f116367a = fVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C44713i iVar = this.f116367a.f113164h;
                C52711k.m112236a((Object) iVar, "it.view");
                C52711k.m112236a((Object) valueAnimator, "va");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    iVar.setTranslationY(((Float) animatedValue).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                if (r8 == 0) goto L_0x015f
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L_0x015f
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r8 = r7.f116361b
                com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl r0 = r7.f116360a
                com.ss.android.ugc.aweme.sticker.presenter.l r0 = r0.f116268n
                java.lang.String r1 = "stickerDataManager"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                java.lang.String r1 = "$this$findFavoriteTabIndex"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
                com.ss.android.ugc.aweme.sticker.presenter.m r1 = r0.mo92992j()
                boolean r1 = r1.f116952d
                r2 = 0
                if (r1 == 0) goto L_0x0052
                com.ss.android.ugc.aweme.sticker.i.a.p r0 = r0.mo92973a()
                com.ss.android.ugc.aweme.sticker.i.a.q r0 = r0.mo92537i()
                java.util.List r0 = com.p683ss.android.ugc.aweme.sticker.p2285i.C45924b.m99852a(r0)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L_0x0036:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0052
                java.lang.Object r3 = r0.next()
                int r4 = r1 + 1
                if (r1 >= 0) goto L_0x0047
                p2628d.p2629a.C52575l.m112100b()
            L_0x0047:
                com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r3 = (com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r3
                boolean r3 = com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2298a.C46024a.C46025a.m100011a(r3)
                if (r3 == 0) goto L_0x0050
                goto L_0x0053
            L_0x0050:
                r1 = r4
                goto L_0x0036
            L_0x0052:
                r1 = -1
            L_0x0053:
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r8 = r8.mo90679a(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r0 = r7.f116361b
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r0 = r0.getCurSelectedTab()
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r0)
                if (r0 != 0) goto L_0x015f
                com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.property.l r0 = r0.mo58574e()
                com.ss.android.ugc.aweme.property.l$a r1 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.StickerCollectionFirst
                boolean r0 = r0.mo83117a(r1)
                r1 = 1
                if (r0 == 0) goto L_0x0093
                com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl r0 = r7.f116360a
                r0.mo92801a(r8, r1)
                com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.property.l r0 = r0.mo58574e()
                com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.StickerCollectionFirstShown
                r0.mo83116a(r3, r1)
                com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.property.l r0 = r0.mo58574e()
                com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.StickerCollectionFirst
                r0.mo83116a(r3, r2)
            L_0x0093:
                com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl r0 = r7.f116360a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.aweme.sticker.a> r3 = com.p683ss.android.ugc.aweme.sticker.C45805a.class
                r4 = 0
                java.lang.Object r0 = r0.mo23375b(r3, r4)
                com.ss.android.ugc.aweme.sticker.a r0 = (com.p683ss.android.ugc.aweme.sticker.C45805a) r0
                if (r0 != 0) goto L_0x015e
                if (r8 == 0) goto L_0x015f
                d.f.b.v$e r0 = new d.f.b.v$e
                r0.<init>()
                android.view.View r3 = r8.f113162f
                if (r3 == 0) goto L_0x0156
                com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r3 = (com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView) r3
                r0.element = r3
                boolean r3 = r8.mo90745b()
                if (r3 != 0) goto L_0x00d3
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$i r3 = r8.f113164h
                com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$a r4 = new com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$a
                r4.<init>(r0)
                java.lang.Runnable r4 = (java.lang.Runnable) r4
                r3.post(r4)
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$i r3 = r8.f113164h
                com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$b r4 = new com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$b
                r4.<init>(r8, r0)
                java.lang.Runnable r4 = (java.lang.Runnable) r4
                r5 = 250(0xfa, double:1.235E-321)
                r3.postDelayed(r4, r5)
            L_0x00d3:
                r0 = 2
                float[] r0 = new float[r0]
                r3 = 0
                r0[r2] = r3
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r4 = r7.f116361b
                android.content.Context r4 = r4.getContext()
                java.lang.String r5 = "tabLayout.context"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131886283(0x7f1200cb, float:1.940714E38)
                float r4 = r4.getDimension(r5)
                float r4 = -r4
                r0[r1] = r4
                android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
                java.lang.String r4 = "ValueAnimator.ofFloat(0f…n.collect_tab_up_height))"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$i r4 = r8.f113164h
                r0.setTarget(r4)
                android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator
                r4.<init>()
                android.animation.TimeInterpolator r4 = (android.animation.TimeInterpolator) r4
                r0.setInterpolator(r4)
                com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$c r4 = new com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$c
                r4.<init>(r8)
                android.animation.ValueAnimator$AnimatorUpdateListener r4 = (android.animation.ValueAnimator.AnimatorUpdateListener) r4
                r0.addUpdateListener(r4)
                r4 = 150(0x96, double:7.4E-322)
                r0.setDuration(r4)
                float[] r1 = new float[r1]
                r1[r2] = r3
                android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
                java.lang.String r2 = "ValueAnimator.ofFloat(0f)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$i r2 = r8.f113164h
                r1.setTarget(r2)
                android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator
                r2.<init>()
                android.animation.TimeInterpolator r2 = (android.animation.TimeInterpolator) r2
                r1.setInterpolator(r2)
                com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$d r2 = new com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$a$d
                r2.<init>(r8)
                android.animation.ValueAnimator$AnimatorUpdateListener r2 = (android.animation.ValueAnimator.AnimatorUpdateListener) r2
                r1.addUpdateListener(r2)
                r1.setDuration(r4)
                android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
                r8.<init>()
                android.animation.Animator r0 = (android.animation.Animator) r0
                android.animation.AnimatorSet$Builder r0 = r8.play(r0)
                android.animation.Animator r1 = (android.animation.Animator) r1
                r0.before(r1)
                r8.start()
                return
            L_0x0156:
                d.u r8 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView"
                r8.<init>(r0)
                throw r8
            L_0x015e:
                return
            L_0x015f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl.C46107a.onChanged(java.lang.Object):void");
        }

        C46107a(DefaultEffectStickerViewImpl defaultEffectStickerViewImpl, TabLayout tabLayout) {
            this.f116360a = defaultEffectStickerViewImpl;
            this.f116361b = tabLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$b */
    public static final class C46113b implements C44704c {

        /* renamed from: a */
        final /* synthetic */ DefaultEffectStickerViewImpl f116368a;

        /* renamed from: b */
        final /* synthetic */ String f116369b;

        /* renamed from: b */
        public final void mo64264b(C44709f fVar) {
            C52711k.m112240b(fVar, "tab");
        }

        /* renamed from: c */
        public final void mo64265c(C44709f fVar) {
            C52711k.m112240b(fVar, "tab");
        }

        /* renamed from: a */
        public final void mo64263a(C44709f fVar) {
            C52711k.m112240b(fVar, "tab");
            this.f116368a.mo92801a(fVar, false);
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) C45924b.m99852a(this.f116368a.f116268n.mo92973a().mo92537i()).get(fVar.f113161e);
            if (this.f116368a.f116265k) {
                String name = effectCategoryModel.getName();
                FaceStickerBean.sCurPropSource = name;
                this.f116368a.f116270p.mo92484a(name);
                C0209x a = C0214z.m440a((FragmentActivity) this.f116368a.f116257c).mo359a(TabSelectViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(mA…ectViewModel::class.java)");
                TabSelectViewModel tabSelectViewModel = (TabSelectViewModel) a;
                tabSelectViewModel.mo93419a(this.f116369b, effectCategoryModel, fVar.f113161e);
                tabSelectViewModel.mo93420a(this.f116369b, name);
            }
            List<C46193b> list = this.f116368a.f116274t;
            C52711k.m112236a((Object) list, "mStickerListeners");
            for (C46193b bVar : list) {
                if (bVar != null && (bVar instanceof C46192a)) {
                    ((C46192a) bVar).mo92783a(this.f116369b, effectCategoryModel.getName(), effectCategoryModel.getKey());
                }
            }
        }

        C46113b(DefaultEffectStickerViewImpl defaultEffectStickerViewImpl, String str) {
            this.f116368a = defaultEffectStickerViewImpl;
            this.f116369b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$c */
    static final class C46114c implements C48715t {

        /* renamed from: a */
        public static final C46114c f116370a = new C46114c();

        C46114c() {
        }

        /* renamed from: a */
        public final void mo8708a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$d */
    static final class C46115d<T> implements C0199s<C37721a<PanelInfoModel>> {

        /* renamed from: a */
        final /* synthetic */ DefaultEffectStickerViewImpl f116371a;

        /* renamed from: b */
        final /* synthetic */ String f116372b;

        C46115d(DefaultEffectStickerViewImpl defaultEffectStickerViewImpl, String str) {
            this.f116371a = defaultEffectStickerViewImpl;
            this.f116372b = str;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C37722a aVar;
            C37721a aVar2 = (C37721a) obj;
            if (aVar2 != null) {
                aVar = aVar2.f96126b;
            } else {
                aVar = null;
            }
            if (aVar != null && C46158j.f116480a[aVar.ordinal()] == 1) {
                PanelInfoModel panelInfoModel = (PanelInfoModel) aVar2.f96125a;
                if (panelInfoModel != null) {
                    ViewPager viewPager = this.f116371a.f116358y;
                    if (viewPager != null) {
                        viewPager.setAdapter(null);
                    }
                    DefaultEffectStickerViewImpl defaultEffectStickerViewImpl = this.f116371a;
                    String str = this.f116372b;
                    C52711k.m112236a((Object) panelInfoModel, "data");
                    defaultEffectStickerViewImpl.mo92803a(str, panelInfoModel);
                    this.f116371a.f116256b = true;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$e */
    public static final class C46116e implements C0199s<EffectCategoryModel> {

        /* renamed from: a */
        final /* synthetic */ DefaultEffectStickerViewImpl f116373a;

        C46116e(DefaultEffectStickerViewImpl defaultEffectStickerViewImpl) {
            this.f116373a = defaultEffectStickerViewImpl;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) obj;
            if (effectCategoryModel != null) {
                this.f116373a.mo92802a(effectCategoryModel);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$f */
    static final class C46117f implements C44703b {

        /* renamed from: a */
        public static final C46117f f116374a = new C46117f();

        C46117f() {
        }

        /* renamed from: a */
        public final void mo64479a(C44709f fVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.DefaultEffectStickerViewImpl$g */
    static final class C46118g<T> implements C0199s<Effect> {

        /* renamed from: a */
        final /* synthetic */ DefaultEffectStickerViewImpl f116375a;

        C46118g(DefaultEffectStickerViewImpl defaultEffectStickerViewImpl) {
            this.f116375a = defaultEffectStickerViewImpl;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect = (Effect) obj;
            this.f116375a.f116273s.mo90693b(this.f116375a.f116273s.mo90679a(1));
            ViewPager viewPager = this.f116375a.f116358y;
            if (viewPager != null) {
                viewPager.setCurrentItem(1, true);
            }
        }
    }

    /* renamed from: c */
    public final int mo92757c() {
        return R.layout.a8y;
    }

    /* renamed from: e */
    public final void mo92759e() {
    }

    /* renamed from: f */
    public final void mo92760f() {
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f116357A;
    }

    public DefaultEffectStickerViewImpl(C12361b bVar) {
        C52711k.m112240b(bVar, "diContainer");
        super((C46255p) bVar.mo23373a(C46255p.class, (String) null), (C46354l) bVar.mo23373a(C46354l.class, (String) null), (C45814b) bVar.mo23373a(C45814b.class, (String) null), (C45889c) bVar.mo23373a(C45889c.class, (String) null));
        this.f116357A = bVar;
    }

    /* renamed from: a */
    public final void mo92802a(EffectCategoryModel effectCategoryModel) {
        Object obj;
        if (this.f116271q) {
            C31417ar arVar = (C31417ar) ((UrlPrefixViewModel) C0214z.m440a((FragmentActivity) this.f116257c).mo359a(UrlPrefixViewModel.class)).f117619a.getValue();
            if (arVar != null) {
                obj = arVar.get((Object) "default");
            } else {
                obj = null;
            }
            if (!(obj instanceof Object)) {
                obj = null;
            }
            C0794k kVar = new C0794k(effectCategoryModel, obj);
            IStickerTabGuidePresenter iStickerTabGuidePresenter = this.f116277w;
            if (iStickerTabGuidePresenter != null) {
                iStickerTabGuidePresenter.mo93131a(kVar);
            }
        }
    }

    /* renamed from: a */
    private final void m100192a(String str, C46125b bVar) {
        if (bVar != null) {
            this.f116273s.mo90692b();
            if (!C52711k.m112239a((Object) "livestreaming", (Object) str)) {
                this.f116273s.setMaxTabModeForCount(bVar.getCount());
            }
            int count = bVar.getCount();
            for (int i = 0; i < count; i++) {
                this.f116273s.mo90685a(this.f116273s.mo90678a().mo90742a(bVar.mo92828a(i)), false);
            }
        }
    }

    /* renamed from: a */
    public final void mo92747a(C0184k kVar, String str) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(str, "panel");
        this.f116268n.mo92973a().mo92537i().mo92542c().observe(this.f116257c, new C46115d(this, str));
    }

    /* renamed from: a */
    public final void mo92801a(C44709f fVar, boolean z) {
        if (fVar != null && fVar.f113162f != null) {
            C46354l lVar = this.f116268n;
            C52711k.m112236a((Object) lVar, "stickerDataManager");
            if (C45859b.m99698a(lVar, fVar.f113161e) && C39629l.m88232a().mo58574e().mo83117a(C40796a.StickerCollectionFirstShown)) {
                C39629l.m88232a().mo58574e().mo83116a(C40796a.StickerCollectionFirstShown, false);
            }
            View view = fVar.f113162f;
            if (view instanceof AVDmtTabItemView) {
                ((AVDmtTabItemView) view).mo93989b(z);
            }
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) C45924b.m99852a(this.f116268n.mo92973a().mo92537i()).get(fVar.f113161e);
            this.f116268n.mo92979a(effectCategoryModel.getId(), effectCategoryModel.getTagsUpdateTime(), (C48715t) C46114c.f116370a);
        }
    }

    /* renamed from: a */
    public final void mo92803a(String str, PanelInfoModel panelInfoModel) {
        int i;
        this.f116271q = true;
        C46125b bVar = this.f116359z;
        if (bVar != null) {
            bVar.mo92829a(C45924b.m99852a(this.f116268n.mo92973a().mo92537i()));
        }
        ViewPager viewPager = this.f116358y;
        if (viewPager != null) {
            viewPager.setAdapter(this.f116359z);
        }
        ViewPager viewPager2 = this.f116358y;
        if (viewPager2 != null) {
            i = viewPager2.getCurrentItem();
        } else {
            i = 0;
        }
        Collection a = C45924b.m99852a(this.f116268n.mo92973a().mo92537i());
        int size = a.size();
        int b = this.f116268n.mo92984b();
        if (b >= 0 && size > b) {
            i = this.f116268n.mo92984b();
        } else {
            C46354l lVar = this.f116268n;
            C52711k.m112236a((Object) lVar, "stickerDataManager");
            int a2 = C45859b.m99695a(lVar);
            int size2 = a.size();
            if (a2 >= 0 && size2 > a2) {
                i = a2;
            }
        }
        ViewPager viewPager3 = this.f116358y;
        if (viewPager3 != null) {
            viewPager3.setCurrentItem(i);
        }
        m100192a(str, this.f116359z);
        C44709f a3 = this.f116273s.mo90679a(i);
        if (a3 != null) {
            this.f116265k = true;
            a3.mo90744a();
        }
        C46256q qVar = this.f116276v;
        if (qVar != null) {
            qVar.cl_();
        }
        mo92758d();
    }

    /* renamed from: a */
    public final void mo92746a(C0184k kVar, C0654k kVar2, String str, View view) {
        LayoutParams layoutParams;
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(kVar2, "fragmentManager");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(view, "root");
        this.f116358y = (ViewPager) view.findViewById(R.id.ds6);
        ViewPager viewPager = this.f116358y;
        if (viewPager != null) {
            layoutParams = viewPager.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams == null || this.f116267m == null || this.f116267m.f116704e <= 0)) {
            layoutParams.height = (int) C9432q.m18687b((Context) this.f116257c, (float) this.f116267m.f116704e);
            ViewPager viewPager2 = this.f116358y;
            if (viewPager2 != null) {
                viewPager2.setLayoutParams(layoutParams);
            }
        }
        C46125b bVar = new C46125b(kVar2, this.f116257c, this.f116358y, mo23370j());
        bVar.mo92829a(C45924b.m99852a(this.f116268n.mo92973a().mo92537i()));
        this.f116359z = bVar;
        ViewPager viewPager3 = this.f116358y;
        if (viewPager3 != null) {
            viewPager3.setAdapter(this.f116359z);
        }
        ViewPager viewPager4 = this.f116358y;
        if (viewPager4 != null) {
            viewPager4.setOffscreenPageLimit(3);
        }
        this.f116273s.setOnTabClickListener(C46117f.f116374a);
        ((TabSelectViewModel) C0214z.m440a((FragmentActivity) this.f116257c).mo359a(TabSelectViewModel.class)).mo93418a(str).observe(this.f116257c, new C46116e(this));
        ViewPager viewPager5 = this.f116358y;
        if (viewPager5 != null) {
            viewPager5.addOnPageChangeListener(new C44710g(this.f116273s));
        }
        m100192a(str, this.f116359z);
        ViewPager viewPager6 = this.f116358y;
        if (viewPager6 != null) {
            C46354l lVar = this.f116268n;
            C52711k.m112236a((Object) lVar, "stickerDataManager");
            viewPager6.setCurrentItem(C45859b.m99695a(lVar));
        }
        this.f116273s.mo90683a(new C46113b(this, str));
        AVDmtTabLayout aVDmtTabLayout = this.f116273s;
        C52711k.m112236a((Object) aVDmtTabLayout, "tabLayout");
        this.f116268n.mo92973a().mo92533e().mo92500a().mo92504c().observe(this.f116257c, new C46107a(this, aVDmtTabLayout));
        ((SearchStickerViewModel) C0214z.m440a((FragmentActivity) this.f116257c).mo359a(SearchStickerViewModel.class)).f116710a.observe(this.f116257c, new C46118g(this));
    }
}
