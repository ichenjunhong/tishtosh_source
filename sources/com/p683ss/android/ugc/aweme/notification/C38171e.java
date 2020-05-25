package com.p683ss.android.ugc.aweme.notification;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.facebook.common.p927k.C13731f;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.LegacyServiceImpl;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.message.p1949b.C36779a;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f.C37922a;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f.C37923b;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38032a;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTTutorialVideoExperiment;
import com.p683ss.android.ugc.aweme.notice.api.p2007c.C38044a;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38053d;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38055e;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.bridgeservice.C38153a;
import com.p683ss.android.ugc.aweme.notification.bridgeservice.I18nNoticeBridgeService;
import com.p683ss.android.ugc.aweme.notification.followrequest.p2017a.C38199a;
import com.p683ss.android.ugc.aweme.notification.followrequest.p2017a.C38201b;
import com.p683ss.android.ugc.aweme.notification.followrequest.p2017a.C38202c;
import com.p683ss.android.ugc.aweme.notification.p2014d.C38163a;
import com.p683ss.android.ugc.aweme.notification.p2018g.C38206a;
import com.p683ss.android.ugc.aweme.notification.tutorialvideo.TutorialVideoViewModel;
import com.p683ss.android.ugc.aweme.notification.util.C38433e;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.utils.C38455d;
import com.p683ss.android.ugc.aweme.notification.view.C38462b;
import com.p683ss.android.ugc.aweme.notification.view.C38462b.C38463a;
import com.p683ss.android.ugc.aweme.notification.view.NoticeView;
import com.p683ss.android.ugc.aweme.notification.view.p2032a.C38460a;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.NoticeStructureSimplify;
import com.p683ss.android.ugc.aweme.p1807im.service.p1903e.C35437a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1903e.C35438b;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.e */
public final class C38171e extends C23526a implements C0199s<TutorialVideoResp>, C38044a, C38202c, C38462b {

    /* renamed from: q */
    public static String f97210q = "";

    /* renamed from: A */
    private DmtStatusView f97211A;

    /* renamed from: B */
    private boolean f97212B = true;

    /* renamed from: C */
    private Fragment f97213C;

    /* renamed from: a */
    public DmtTextView f97214a;

    /* renamed from: b */
    public View f97215b;

    /* renamed from: c */
    public View f97216c;

    /* renamed from: d */
    public View f97217d;

    /* renamed from: e */
    public AvatarImageView f97218e;

    /* renamed from: j */
    public DmtTextView f97219j;

    /* renamed from: k */
    public DmtButton f97220k;

    /* renamed from: l */
    public C38154c f97221l;

    /* renamed from: m */
    public TutorialVideoViewModel f97222m;

    /* renamed from: n */
    public C38153a f97223n;

    /* renamed from: o */
    public RecyclerView f97224o;

    /* renamed from: p */
    public C26840g<BaseNotice> f97225p;

    /* renamed from: r */
    public String f97226r;

    /* renamed from: s */
    private NoticeView f97227s;

    /* renamed from: t */
    private View f97228t;

    /* renamed from: u */
    private com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView f97229u;

    /* renamed from: v */
    private boolean f97230v;

    /* renamed from: w */
    private C38163a f97231w;

    /* renamed from: x */
    private C38201b f97232x;

    /* renamed from: y */
    private C38177a f97233y;

    /* renamed from: z */
    private C37920f f97234z;

    /* renamed from: com.ss.android.ugc.aweme.notification.e$a */
    class C38177a implements OnClickListener {
        C38177a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C38171e.this.f97217d.getVisibility() == 0 && C38171e.this.f97222m != null) {
                C38171e.this.f97222m.mo78321a(2);
                if (!TextUtils.isEmpty(C38171e.this.f97226r)) {
                    C41302w a = C41302w.m91042a();
                    StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                    sb.append(C38171e.this.f97226r);
                    a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "fans").mo83871a());
                    C38171e.m85318a("enter_teach_video", C38171e.this.f97226r);
                }
            }
        }
    }

    /* renamed from: a */
    public final Fragment mo77567a() {
        return this;
    }

    /* renamed from: k */
    private void m85322k() {
        if (this.f97213C instanceof C35437a) {
            ((C35437a) this.f97213C).mo72683a(f97210q);
        }
    }

    /* renamed from: e */
    public final void mo78176e() {
        this.f97216c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C38171e eVar = C38171e.this;
                eVar.f97215b.setVisibility(8);
                if (eVar.getActivity() != null) {
                    eVar.startActivityForResult(SmartRouter.buildRoute(eVar.getContext(), "aweme://follow_request").buildIntent(), PreloadTask.BYTE_UNIT_NUMBER);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo77568b() {
        if (C41049a.m90716b()) {
            Fragment a = getChildFragmentManager().mo2224a("session");
            if (a instanceof C35437a) {
                ((C35437a) a).mo72689i();
            }
        }
    }

    /* renamed from: d */
    public final void mo77570d() {
        if (this.f97213C != null) {
            this.f97213C.onPause();
            if (this.f97213C instanceof C35437a) {
                ((C35437a) this.f97213C).mo72684a(true);
            }
        }
    }

    /* renamed from: g */
    public final void mo78178g() {
        if (isViewValid()) {
            m85321j();
            if (this.f97216c.getVisibility() == 0) {
                this.f97215b.setVisibility(0);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        LegacyServiceImpl.createILegacyServicebyMonsterPlugin().getUgAllService().mo49249d(getContext());
    }

    /* renamed from: j */
    private void m85321j() {
        if (!C47915gg.m103651b()) {
            if (this.f97232x == null) {
                this.f97232x = new C38201b();
                this.f97232x.mo54799a(new C38199a());
                this.f97232x.mo54800a(this);
                this.f97232x.mo44934a_(new Object[0]);
                return;
            }
            this.f97232x.mo44934a_(new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo77569c() {
        onResume();
        if (this.f97213C != null) {
            this.f97213C.onResume();
            if (this.f97213C instanceof C35437a) {
                ((C35437a) this.f97213C).mo72684a(false);
            }
        }
        if (this.f97221l != null) {
            this.f97221l.mo78138a();
        }
        m85322k();
        if (C38206a.f97273b.getEnablePushGuide() != 0 && this.f97234z != null) {
            this.f97234z.mo77382a();
        }
    }

    /* renamed from: f */
    public final void mo78177f() {
        C38446k.m85764a(this.f97218e);
        C38446k.m85764a(this.f97220k);
        this.f97233y = new C38177a();
        this.f97217d.setOnClickListener(this.f97233y);
        this.f97218e.setOnClickListener(this.f97233y);
        this.f97220k.setOnClickListener(this.f97233y);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f97231w != null) {
            C38163a aVar = this.f97231w;
            C47718bf.m103291d(aVar);
            C36782d.m82775a().mo75931a(2);
            aVar.f97201a = null;
            C38433e.m85749a().f97822a.clear();
        }
        if (this.f97221l != null) {
            C38154c cVar = this.f97221l;
            if (cVar.f97167b != null) {
                cVar.f97167b.f97157a = null;
            }
            cVar.f97167b = null;
        }
        I18nNoticeBridgeService.createINoticeBridgeServicebyMonsterPlugin().recordGuideBundle(null, 0);
    }

    /* renamed from: h */
    private void m85319h() {
        Fragment a = getChildFragmentManager().mo2224a("notice");
        if (a == null) {
            a = new C38218l();
            Bundle bundle = new Bundle();
            bundle.putInt("from_where", 10);
            a.setArguments(bundle);
        }
        if (!a.isAdded()) {
            C0679r a2 = getChildFragmentManager().mo2225a();
            a2.mo2176a(R.id.bql, a, "session");
            a2.mo2195c();
        } else {
            C0679r a3 = getChildFragmentManager().mo2225a();
            a3.mo2196c(a);
            a3.mo2195c();
        }
        m85320i();
    }

    /* renamed from: i */
    private void m85320i() {
        if (this.f97230v && this.f97228t != null) {
            this.f97230v = false;
            this.f97228t.findViewById(R.id.u).setVisibility(0);
            this.f97216c = this.f97228t.findViewById(R.id.b8n);
            this.f97214a = (DmtTextView) this.f97228t.findViewById(R.id.dcx);
            this.f97215b = this.f97228t.findViewById(R.id.bru);
            RecyclerView recyclerView = (RecyclerView) this.f97228t.findViewById(R.id.cg_);
            mo78176e();
            this.f97221l.mo78140a(recyclerView, getContext());
            this.f97217d = this.f97228t.findViewById(R.id.d64);
            this.f97217d.setVisibility(8);
            this.f97218e = (AvatarImageView) this.f97228t.findViewById(R.id.bt7);
            this.f97219j = (DmtTextView) this.f97228t.findViewById(R.id.bsc);
            this.f97220k = (DmtButton) this.f97228t.findViewById(R.id.bs3);
            mo78177f();
        }
    }

    public final void onResume() {
        super.onResume();
        Intent intent = getActivity().getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("label");
            String stringExtra2 = intent.getStringExtra("uid");
            intent.putExtra("label", "");
            if (TextUtils.equals(stringExtra, "follow_request")) {
                startActivityForResult(SmartRouter.buildRoute(getContext(), "aweme://follow_request").withParam("label", stringExtra).withParam("uid", stringExtra2).buildIntent(), PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
        m85321j();
        if (!C38455d.m85779a() && C10181b.m20511a().mo18172a(MTTutorialVideoExperiment.class, true, "mt_tutorial_video", 31744, false)) {
            this.f97222m.mo78321a(1);
        }
        C18842a.m45933a(new Runnable() {
            public final void run() {
                if (C38171e.this.isAdded()) {
                    C38046d.m85103c(0, 1000);
                }
            }
        }, 1000);
        if (!this.f97212B && this.f97221l != null) {
            this.f97221l.mo78138a();
        }
        this.f97212B = false;
    }

    /* renamed from: a */
    public final void mo78174a(Exception exc) {
        C38460a.m85792a(getContext(), exc);
    }

    /* renamed from: a */
    public final void mo78172a(int i) {
        String str;
        if (isViewValid() && this.f97216c != null) {
            if (this.f97232x == null || i <= 0) {
                this.f97216c.setVisibility(8);
                return;
            }
            if (this.f97216c.getVisibility() == 8) {
                this.f97215b.setVisibility(0);
            }
            this.f97216c.setVisibility(0);
            if (i > 99) {
                str = "99+";
            } else {
                str = String.valueOf(i);
            }
            this.f97214a.setFontType(C10751d.f28908g);
            this.f97214a.setText(getString(R.string.b4x, str));
        }
    }

    /* renamed from: a */
    public final void mo78175a(List<C38463a> list) {
        if (isViewValid()) {
            C38154c cVar = this.f97221l;
            if (cVar.f97166a != null && list != null && list.size() != 0) {
                int i = 0;
                for (C38463a aVar : list) {
                    if (cVar.f97166a.f97168a.size() > i) {
                        int i2 = i + 1;
                        ((C38032a) cVar.f97166a.f97168a.get(i)).f96794a = aVar.f97870b;
                        i = i2;
                    }
                }
                cVar.f97166a.notifyDataSetChanged();
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        String str2;
        String str3;
        TutorialVideoResp tutorialVideoResp = (TutorialVideoResp) obj;
        if (isViewValid() && this.f97217d != null) {
            try {
                this.f97226r = ((C38055e) C38053d.m85113a(C38055e.class)).mo48439a("");
            } catch (Exception unused) {
                this.f97226r = "";
            }
            if (!TextUtils.isEmpty(this.f97226r)) {
                try {
                    C38055e eVar = (C38055e) C38053d.m85113a(C38055e.class);
                    str2 = eVar.mo48441c(getString(R.string.cgb));
                    str = eVar.mo48443e(getString(R.string.cgc));
                    str3 = eVar.mo48445g(getString(R.string.cgd));
                } catch (Exception unused2) {
                    str2 = getString(R.string.cgb);
                    str = getString(R.string.cgc);
                    str3 = getString(R.string.cgd);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(str2);
                spannableStringBuilder.setSpan(new NewsFragment$5(this, C11010c.m22280a().getResources().getColor(R.color.a1k)), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append(" ");
                spannableStringBuilder.append(str);
                this.f97219j.setText(spannableStringBuilder);
                this.f97219j.setTextColor(getResources().getColor(R.color.a4h));
                this.f97218e.setImageURI(C13731f.m27775a((int) R.drawable.clt));
                this.f97220k.setText(str3);
                this.f97217d.setVisibility(0);
                m85318a("show_teach_video", this.f97226r);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C38455d.m85779a()) {
            this.f97211A.setVisibility(0);
            this.f97211A.mo19213g();
            return;
        }
        if (C41049a.m90716b()) {
            IIMService a = C41049a.m90714a();
            if (a != null) {
                this.f97213C = getChildFragmentManager().mo2224a("session");
                if (this.f97213C == null && a.getSessionListFragment() != null) {
                    this.f97213C = a.getSessionListFragment().mo72686f();
                    m85322k();
                }
                if (this.f97213C != null) {
                    if (this.f97230v && (this.f97213C instanceof C35437a)) {
                        this.f97230v = false;
                        ((C35437a) this.f97213C).mo72682a((C35438b) new C35438b() {
                            /* renamed from: a */
                            public final void mo73736a(RecyclerView recyclerView, View view, View view2, ViewStub viewStub) {
                                NoticeStructureSimplify.m80100a();
                                if (recyclerView != null) {
                                    C38171e.this.f97221l.mo78140a(recyclerView, C38171e.this.getContext());
                                    C38171e.this.f97221l.mo78138a();
                                }
                                C38171e.this.f97216c = view;
                                if (C38171e.this.f97216c != null) {
                                    C38171e.this.mo78176e();
                                    C38171e.this.f97214a = (DmtTextView) C38171e.this.f97216c.findViewWithTag("tag_msg_follow_request_count");
                                    C38171e.this.f97215b = C38171e.this.f97216c.findViewWithTag("tag_msg_follow_request_unread_dot");
                                }
                                C38171e.this.f97217d = view2;
                                if (C38171e.this.f97217d != null) {
                                    C38171e.this.f97218e = (AvatarImageView) C38171e.this.f97217d.findViewWithTag("tag_msg_tutorial_video_head");
                                    C38171e.this.f97219j = (DmtTextView) C38171e.this.f97217d.findViewWithTag("tag_msg_tutorial_video_content");
                                    C38171e.this.f97220k = (DmtButton) C38171e.this.f97217d.findViewWithTag("tag_msg_tutorial_video_watch");
                                    C38171e.this.mo78177f();
                                }
                                if (viewStub != null) {
                                    viewStub.setLayoutResource(R.layout.b2l);
                                    C38171e.this.f97224o = (RecyclerView) viewStub.inflate();
                                    C38171e.this.f97224o.setLayoutManager(new WrapLinearLayoutManager(C38171e.this.getContext()) {
                                        /* renamed from: f */
                                        public final boolean mo4745f() {
                                            return false;
                                        }
                                    });
                                    C38171e.this.f97225p = I18nNoticeBridgeService.createINoticeBridgeServicebyMonsterPlugin().getMsgHeadExtraAdapter(C38171e.this, new C38184f(this));
                                    if (C38171e.this.f97225p != null) {
                                        C38171e.this.f97225p.mo54798c(false);
                                        C38171e.this.f97224o.setAdapter(C38171e.this.f97225p);
                                        C38171e.this.f97224o.setFocusable(false);
                                        if (C38171e.this.f97223n != null) {
                                            C38171e.this.f97223n.mo78137a(C38171e.this.f97225p);
                                        }
                                    }
                                }
                                C38171e eVar = C38171e.this;
                                NoticeStructureSimplify.m80100a();
                            }
                        });
                    }
                    if (!this.f97213C.isAdded()) {
                        C0679r a2 = getChildFragmentManager().mo2225a();
                        a2.mo2176a(R.id.bql, this.f97213C, "session");
                        a2.mo2195c();
                    } else {
                        C0679r a3 = getChildFragmentManager().mo2225a();
                        a3.mo2196c(this.f97213C);
                        a3.mo2195c();
                    }
                }
            }
            m85319h();
        } else {
            m85319h();
        }
        if (this.f97231w == null) {
            this.f97231w = new C38163a();
        }
        C38163a aVar = this.f97231w;
        aVar.f97201a = this;
        C47718bf.m103290c(aVar);
        int c = C36782d.m82775a().mo75940c(3);
        int c2 = C36782d.m82775a().mo75940c(44);
        int c3 = C36782d.m82775a().mo75940c(6);
        int c4 = C36782d.m82775a().mo75940c(7);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C38463a(0, c4));
        arrayList.add(new C38463a(1, c));
        arrayList.add(new C38463a(2, c3));
        arrayList.add(new C38463a(3, c2));
        aVar.f97201a.mo78175a(arrayList);
        C36782d.m82775a().mo75933a(2, (C36779a) aVar);
    }

    /* renamed from: a */
    public static void m85318a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            C26890h.m65011a(str, C23089d.m56640a().mo47829a("group_id", str2).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo78173a(int i, int i2) {
        if (isViewValid()) {
            C38154c cVar = this.f97221l;
            if (cVar.f97166a != null) {
                for (C38032a aVar : cVar.f97166a.f97168a) {
                    if (i == aVar.f96796c) {
                        aVar.f96794a = i2;
                        cVar.f97166a.notifyItemChanged(aVar.f96795b);
                    }
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f97230v = true;
        this.f97221l = new C38154c(view.getContext());
        if (C38206a.f97273b.getEnablePushGuide() != 0) {
            this.f97229u.setIconImage((int) R.drawable.ckm);
            SpannableString spannableString = new SpannableString(C23723j.m58219b(R.string.br0));
            String b = C23723j.m58219b(R.string.br1);
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(" ");
            String sb2 = sb.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString2 = new SpannableString(sb2);
            spannableString2.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.b0a)), 0, spannableString2.length(), 34);
            spannableStringBuilder.append(spannableString2);
            if (getContext() != null) {
                spannableString.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.b0b)), 0, spannableString.length(), 34);
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
                spannableStringBuilder.append(spannableString);
            }
            this.f97229u.setTitleText((CharSequence) spannableStringBuilder);
            this.f97234z = new C37920f(this.f97229u, new C37923b() {
                /* renamed from: a */
                public final void mo65249a(Context context) {
                    C23794bh.m58408v().mo49251e(context);
                }

                /* renamed from: b */
                public final boolean mo65250b(Context context) {
                    return C23794bh.m58408v().mo49252f(context);
                }
            });
            this.f97234z.f96571f = C37922a.Message;
            this.f97234z.mo77382a();
        }
        this.f97222m = (TutorialVideoViewModel) C0214z.m438a((Fragment) this).mo359a(TutorialVideoViewModel.class);
        this.f97222m.f97795a.observe(this, this);
        this.f97211A.setBuilder(C10719a.m21676a((Context) getActivity()).mo19229a(new C10723a(getActivity()).mo19280b((int) R.string.goh).mo19281b("").f28711a));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1024) {
            m85321j();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f97228t = layoutInflater.inflate(R.layout.b27, viewGroup, false);
        this.f97227s = (NoticeView) this.f97228t.findViewById(R.id.brv);
        this.f97229u = (com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView) this.f97228t.findViewById(R.id.e_z);
        this.f97211A = (DmtStatusView) this.f97228t.findViewById(R.id.csv);
        return this.f97228t;
    }
}
