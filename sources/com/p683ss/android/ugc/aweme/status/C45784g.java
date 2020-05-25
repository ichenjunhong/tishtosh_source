package com.p683ss.android.ugc.aweme.status;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0520b;
import android.support.design.widget.TabLayout.C0526f;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.shortvideo.C42562ct;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.status.p2272a.C45736c;
import com.p683ss.android.ugc.aweme.tools.C47059f;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.status.g */
public final class C45784g extends C49604i implements OnClickListener {

    /* renamed from: k */
    public static final C45785a f115698k = new C45785a(null);

    /* renamed from: i */
    public DmtStatusView f115699i;

    /* renamed from: j */
    public RecordStatusViewModel f115700j;

    /* renamed from: l */
    private RelativeLayout f115701l;

    /* renamed from: m */
    private AutoRTLImageView f115702m;

    /* renamed from: n */
    private TabLayout f115703n;

    /* renamed from: o */
    private ViewPager f115704o;

    /* renamed from: p */
    private ViewStub f115705p;

    /* renamed from: q */
    private C45741c f115706q;

    /* renamed from: r */
    private ShortVideoContext f115707r;

    /* renamed from: s */
    private C45794j f115708s;

    /* renamed from: com.ss.android.ugc.aweme.status.g$a */
    public static final class C45785a {
        private C45785a() {
        }

        public /* synthetic */ C45785a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.g$b */
    static final class C45786b<T> implements C0199s<EffectChannelResponse> {

        /* renamed from: a */
        final /* synthetic */ C45784g f115709a;

        C45786b(C45784g gVar) {
            this.f115709a = gVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            DmtStatusView dmtStatusView = this.f115709a.f115699i;
            if (dmtStatusView == null) {
                C52711k.m112237a("statusLoadView");
            }
            dmtStatusView.mo19208c(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.g$c */
    public static final class C45787c implements C0520b<C0526f> {

        /* renamed from: a */
        final /* synthetic */ C45784g f115710a;

        /* renamed from: b */
        public final void mo1578b(C0526f fVar) {
        }

        C45787c(C45784g gVar) {
            this.f115710a = gVar;
        }

        /* renamed from: a */
        public final void mo1577a(C0526f fVar) {
            if (fVar != null) {
                RecordStatusViewModel recordStatusViewModel = this.f115710a.f115700j;
                if (recordStatusViewModel == null) {
                    C52711k.m112237a("statusViewModel");
                }
                recordStatusViewModel.mo92171p().setValue(String.valueOf(fVar.f1802c));
            }
        }
    }

    /* renamed from: F */
    public final String mo49446F() {
        return "status";
    }

    /* renamed from: H */
    public final void mo49448H() {
    }

    /* renamed from: n */
    public final void mo24421n() {
        super.mo24421n();
        Activity activity = this.f33840g_;
        if (activity != null) {
            C52711k.m112236a((Object) activity, "it");
            C45736c.m99544a(activity);
        }
    }

    /* renamed from: G */
    public final void mo49447G() {
        if (this.f115701l == null) {
            ViewStub viewStub = this.f115705p;
            if (viewStub == null) {
                C52711k.m112237a("viewStub");
            }
            this.f115701l = (RelativeLayout) viewStub.inflate().findViewById(R.id.ety);
            int c = C43303dy.m94972c(this.f33840g_);
            RelativeLayout relativeLayout = this.f115701l;
            if (relativeLayout != null) {
                relativeLayout.setPadding(0, c, 0, 0);
            }
            RelativeLayout relativeLayout2 = this.f115701l;
            if (relativeLayout2 == null) {
                C52711k.m112234a();
            }
            View findViewById = relativeLayout2.findViewById(R.id.ex2);
            C52711k.m112236a((Object) findViewById, "rootView!!.findViewById(R.id.status_back)");
            this.f115702m = (AutoRTLImageView) findViewById;
            AutoRTLImageView autoRTLImageView = this.f115702m;
            if (autoRTLImageView == null) {
                C52711k.m112237a("statusBackView");
            }
            autoRTLImageView.setOnClickListener(this);
            RelativeLayout relativeLayout3 = this.f115701l;
            if (relativeLayout3 == null) {
                C52711k.m112234a();
            }
            View findViewById2 = relativeLayout3.findViewById(R.id.etz);
            C52711k.m112236a((Object) findViewById2, "rootView!!.findViewById(…d.scene_status_tablayout)");
            this.f115703n = (TabLayout) findViewById2;
            RelativeLayout relativeLayout4 = this.f115701l;
            if (relativeLayout4 == null) {
                C52711k.m112234a();
            }
            View findViewById3 = relativeLayout4.findViewById(R.id.eu0);
            C52711k.m112236a((Object) findViewById3, "rootView!!.findViewById(R.id.scene_viewpager)");
            this.f115704o = (ViewPager) findViewById3;
            Activity activity = this.f33840g_;
            if (activity != null) {
                this.f115708s = new C45794j((FragmentActivity) activity);
                ViewPager viewPager = this.f115704o;
                if (viewPager == null) {
                    C52711k.m112237a("viewPager");
                }
                C45794j jVar = this.f115708s;
                if (jVar == null) {
                    C52711k.m112237a("pagerAdapter");
                }
                viewPager.setAdapter(jVar);
                RelativeLayout relativeLayout5 = this.f115701l;
                if (relativeLayout5 == null) {
                    C52711k.m112234a();
                }
                View findViewById4 = relativeLayout5.findViewById(R.id.csu);
                C52711k.m112236a((Object) findViewById4, "rootView!!.findViewById(R.id.status_loading)");
                this.f115699i = (DmtStatusView) findViewById4;
                DmtStatusView dmtStatusView = this.f115699i;
                if (dmtStatusView == null) {
                    C52711k.m112237a("statusLoadView");
                }
                dmtStatusView.setBuilder(null);
                DmtStatusView dmtStatusView2 = this.f115699i;
                if (dmtStatusView2 == null) {
                    C52711k.m112237a("statusLoadView");
                }
                dmtStatusView2.mo19212f();
                TabLayout tabLayout = this.f115703n;
                if (tabLayout == null) {
                    C52711k.m112237a("statusTablayout");
                }
                ViewPager viewPager2 = this.f115704o;
                if (viewPager2 == null) {
                    C52711k.m112237a("viewPager");
                }
                tabLayout.setupWithViewPager(viewPager2);
                TabLayout tabLayout2 = this.f115703n;
                if (tabLayout2 == null) {
                    C52711k.m112237a("statusTablayout");
                }
                tabLayout2.addOnTabSelectedListener(new C45787c(this));
                Activity activity2 = this.f33840g_;
                if (activity2 != null) {
                    C0209x a = C0214z.m440a((FragmentActivity) activity2).mo359a(ShortVideoContextViewModel.class);
                    C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
                    C52711k.m112236a((Object) shortVideoContext, "ViewModelProviders.of(ac…s.java).shortVideoContext");
                    this.f115707r = shortVideoContext;
                    Activity activity3 = this.f33840g_;
                    if (activity3 != null) {
                        C0209x a2 = C0214z.m440a((FragmentActivity) activity3).mo359a(RecordStatusViewModel.class);
                        C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…tusViewModel::class.java)");
                        this.f115700j = (RecordStatusViewModel) a2;
                        Activity activity4 = this.f33840g_;
                        if (activity4 != null) {
                            FragmentActivity fragmentActivity = (FragmentActivity) activity4;
                            ShortVideoContext shortVideoContext2 = this.f115707r;
                            if (shortVideoContext2 == null) {
                                C52711k.m112237a("shortVideoContext");
                            }
                            this.f115706q = new C45741c(fragmentActivity, shortVideoContext2);
                            RecordStatusViewModel recordStatusViewModel = this.f115700j;
                            if (recordStatusViewModel == null) {
                                C52711k.m112237a("statusViewModel");
                            }
                            C0198r b = recordStatusViewModel.mo92157b();
                            Activity activity5 = this.f33840g_;
                            if (activity5 != null) {
                                b.observe((FragmentActivity) activity5, new C45786b(this));
                                RecordStatusViewModel recordStatusViewModel2 = this.f115700j;
                                if (recordStatusViewModel2 == null) {
                                    C52711k.m112237a("statusViewModel");
                                }
                                recordStatusViewModel2.mo92156a().setValue(Boolean.valueOf(false));
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        AutoRTLImageView autoRTLImageView = this.f115702m;
        if (autoRTLImageView == null) {
            C52711k.m112237a("statusBackView");
        }
        if (C52711k.m112239a((Object) view, (Object) autoRTLImageView) && (this.f33840g_ instanceof VideoRecordNewActivity)) {
            Activity activity = this.f33840g_;
            if (activity != null) {
                C42562ct ctVar = ((VideoRecordNewActivity) activity).f113794t;
                C52711k.m112236a((Object) ctVar, "(activity as VideoRecordNewActivity).plan");
                ctVar.mo86791d().mo86531a(new C47059f("close_view"));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
        }
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.brj, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.etu);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.scenc_record_status_stub)");
        this.f115705p = (ViewStub) findViewById;
        C52711k.m112236a((Object) inflate, "view");
        return inflate;
    }
}
