package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28220g;
import com.p683ss.android.ugc.aweme.experiment.UnloginDiggShowInProfileExperiment;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C30133aj;
import com.p683ss.android.ugc.aweme.feed.C30134ak;
import com.p683ss.android.ugc.aweme.feed.experiment.C30223c;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoInteractionExperiment;
import com.p683ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidgetV1.C30237a;
import com.p683ss.android.ugc.aweme.feed.helper.C30366f;
import com.p683ss.android.ugc.aweme.feed.helper.C30385i;
import com.p683ss.android.ugc.aweme.feed.helper.C30389m;
import com.p683ss.android.ugc.aweme.feed.helper.C30396s;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30312ad;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30472aa;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30503v;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30508z;
import com.p683ss.android.ugc.aweme.feed.utils.C31188d;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.utils.C31199l;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.p683ss.android.ugc.aweme.feed.widget.DiggAnimationView;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.p1382aq.C23193aa;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23256z;
import com.p683ss.android.ugc.aweme.profile.unlogin.C40504k;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47717be;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dt */
public final class C30919dt extends C31009h implements C0199s<C23274a>, C30503v {

    /* renamed from: a */
    DiggAnimationView f80979a;

    /* renamed from: b */
    TextView f80980b;

    /* renamed from: c */
    View f80981c;

    /* renamed from: d */
    public boolean f80982d;

    /* renamed from: e */
    public C30472aa f80983e;

    /* renamed from: f */
    public String f80984f;

    /* renamed from: g */
    public OnClickListener f80985g = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            int a = C30223c.m70960a();
            boolean z = false;
            if (a == 0) {
                z = !C20854a.m53167g().isLogin();
            } else if (a > 0 && !C20854a.m53167g().isLogin() && !C30919dt.this.f80982d && C30919dt.this.f81192l.getUserDigg() == 0 && C30133aj.m70708b() >= a) {
                z = true;
            }
            if (z) {
                new C23193aa().mo47947a(C30919dt.this.f80984f).mo47946a(C30919dt.this.f81196p).mo47950b(C30919dt.this.f81192l.getAid()).mo47954f(C30919dt.this.f81192l).mo47952c("click_like").mo47949b(C30133aj.m70710d() ^ true ? 1 : 0).mo47951c(1).mo48076e();
                if (!C30133aj.m70710d()) {
                    C30133aj.m70709c();
                }
                if (TextUtils.equals(C30919dt.this.f80984f, "homepage_hot")) {
                    str = "";
                } else {
                    str = C30919dt.this.f81198r.getString(R.string.bwi);
                }
                if (C30919dt.this.f81192l != null) {
                    str2 = C30919dt.this.f81192l.getAid();
                } else {
                    str2 = "";
                }
                C27965f.m66721a((Activity) C30919dt.this.f81198r, C30919dt.this.f80984f, "click_like", C47661ab.m103163a().mo94972a("login_title", str).mo94972a("group_id", str2).mo94972a("log_pb", C23198ae.m56874k(str2)).f120139a, (C23505g) new C30922du(this, view));
            } else if (C36330a.m81964a(C30919dt.this.f81192l) && C30919dt.this.f81192l.getUserDigg() == 0) {
                C10691a.m21545b(C30919dt.this.f81198r, C36330a.m81963a(C30919dt.this.f81192l, R.string.fc_)).mo19066a();
            } else if (C30919dt.this.f81192l.isCanPlay() || C30919dt.this.f81192l.getUserDigg() != 0) {
                if (C30919dt.this.f81192l.isDelete() && C30919dt.this.f81192l.getUserDigg() == 0) {
                    C10691a.m21542b(C30919dt.this.f81198r, (int) R.string.fc_).mo19066a();
                } else if (C30919dt.this.f81192l.getVideoControl() != null && C30919dt.this.f81192l.getVideoControl().timerStatus == 0) {
                    C10691a.m21548c(C30919dt.this.f81198r, (int) R.string.fbb).mo19066a();
                } else if (C30919dt.this.f80982d || !C47950q.m103754c(C30919dt.this.f81192l) || !C47950q.m103752a(C30919dt.this.f81192l)) {
                    C30919dt.this.f80979a.mo64028a(view);
                    if (!C30923dv.m72427a(C30919dt.this.f81198r)) {
                        C10691a.m21542b(C30919dt.this.f81198r, (int) R.string.cg1).mo19066a();
                    } else {
                        C30919dt.this.mo63682a(C30919dt.this.f81192l);
                    }
                } else {
                    C10691a.m21548c(C30919dt.this.f81198r, (int) R.string.ffs).mo19066a();
                }
            } else if (C30919dt.this.f81192l.isImage()) {
                C10691a.m21542b(C30919dt.this.f81198r, (int) R.string.bqo).mo19066a();
            } else {
                C10691a.m21542b(C30919dt.this.f81198r, (int) R.string.fc_).mo19066a();
            }
        }
    };

    /* renamed from: h */
    private long f80986h;

    /* renamed from: i */
    private long f80987i;

    /* renamed from: j */
    private int f80988j;

    /* renamed from: k */
    private View f80989k;

    /* renamed from: w */
    private Drawable f80990w;

    /* renamed from: x */
    private String f80991x;

    /* renamed from: y */
    private String f80992y;

    /* renamed from: z */
    private C30237a f80993z;

    /* renamed from: a */
    public final void mo49781a() {
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        boolean z = true;
        C31208r.m72879a(this.f81192l, this.f81199s, true, true);
        if (UnloginDiggShowInProfileExperiment.INSTANCE.mo59615a() && this.f81192l != null && C30134ak.f78654c.mo60386b(this.f81192l.getAid())) {
            this.f81192l.setUserDigg(1);
            AwemeStatistics statistics = this.f81192l.getStatistics();
            if (statistics != null) {
                statistics.setDiggCount(statistics.getDiggCount() + 1);
            }
        }
        this.f80986h = this.f81192l.getStatistics() == null ? 0 : this.f81192l.getStatistics().getDiggCount();
        this.f80987i = this.f80986h;
        this.f80988j = this.f81192l.getUserDigg();
        mo63420b();
        if (this.f81192l.getUserDigg() != 1) {
            z = false;
        }
        m72409a(z);
        this.f80981c.setOnClickListener(this.f80985g);
        this.f80980b.setOnClickListener(this.f80985g);
        this.f80989k.setOnClickListener(this.f80985g);
    }

    /* renamed from: a */
    public final void mo63682a(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (this.f81198r == null || aweme2 == null) {
            StringBuilder sb = new StringBuilder("handleDiggClick:");
            sb.append(String.valueOf(this.f81198r));
            sb.append(",aweme:");
            sb.append(String.valueOf(aweme));
            C32458a.m75141a(6, "VideoDiggView", sb.toString());
            return;
        }
        C30385i.m71299a().mo60807b(this.f80979a, this.f80984f, C23198ae.m56877m(this.f81192l), C23198ae.m56846a(this.f81192l));
        this.f81197q.mo48228a("handle_digg_click", (Object) aweme2);
        boolean z = true;
        if (this.f80982d || aweme.getUserDigg() != 0) {
            if (!this.f80982d || aweme.getUserDigg() == 0) {
                if (aweme.getUserDigg() != 1) {
                    z = false;
                }
                this.f80982d = z;
                m72409a(this.f80982d);
                if (this.f80982d) {
                    this.f80986h++;
                    return;
                }
                this.f80986h--;
            } else {
                this.f81197q.mo48228a("video_digg", (Object) Integer.valueOf(6));
                this.f80986h--;
                m72409a(false);
                if (!C23718g.m58207b().mo49153d()) {
                    C10691a.m21542b(this.f81198r, (int) R.string.cg1).mo19066a();
                } else {
                    if (aweme2 != null) {
                        new C23256z("like_cancel").mo48189d(this.f80984f).mo48191e(this.f80991x).mo48185b(this.f81196p).mo47954f(aweme2).mo48193g(this.f80992y).mo48076e();
                        if (!TextUtils.equals("opus", this.f80984f)) {
                            C26890h.m65006a(this.f81198r, "like_cancel", this.f80984f, aweme.getAid(), 0, m72413e());
                        } else if (this.f81195o) {
                            C26890h.m65006a(this.f81198r, "like_cancel", "personal_homepage", aweme.getAid(), 0, m72413e());
                        } else {
                            C26890h.m65006a(this.f81198r, "like_cancel", "others_homepage", aweme.getAid(), 0, m72413e());
                        }
                        if (aweme.getAwemeType() != 34) {
                            m72408a(aweme.getAid(), 0);
                        } else {
                            C25945k.m62911b().mo53143g(this.f81198r, aweme2);
                        }
                    }
                    return;
                }
            }
            return;
        }
        this.f81197q.mo48228a("video_digg", (Object) Integer.valueOf(5));
        this.f80986h++;
        m72409a(true);
        m72407a(aweme2, "click_like");
    }

    /* renamed from: a */
    public final void mo60920a(final Exception exc) {
        if (!C23794bh.m58389c().mo50264a(exc)) {
            mo63683b(exc);
        } else if (this.f81198r instanceof FragmentActivity) {
            C23794bh.m58389c().mo50263a(((FragmentActivity) this.f81198r).getSupportFragmentManager(), (C23459a) exc, new C24493b() {
                /* renamed from: a */
                public final void mo45353a() {
                    C30919dt.this.f80983e.mo44935c();
                }

                /* renamed from: b */
                public final void mo45354b() {
                    C30919dt.this.mo63683b(exc);
                }
            });
        }
    }

    /* renamed from: d */
    private static String m72412d() {
        if (VideoInteractionExperiment.NEED_SHOW_TEXT) {
            return VideoInteractionExperiment.DEFAULT_DIGG_TEXT;
        }
        return "0";
    }

    /* renamed from: e */
    private JSONObject m72413e() {
        return C31188d.m72825a(this.f81192l, this.f81196p, this.f81200t, this.f80984f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63420b() {
        if (!C31357a.m73095a()) {
            this.f80979a.setImageDrawable(this.f80990w);
            return;
        }
        this.f80979a.setTag(C31357a.co7, Boolean.valueOf(false));
        this.f80979a.setImageDrawable(this.f80990w);
    }

    /* renamed from: a */
    private String m72406a(long j) {
        if (C36330a.m81964a(this.f81192l)) {
            return "0";
        }
        if (j <= 0) {
            return m72412d();
        }
        return C33095b.m76068a(j);
    }

    /* renamed from: b */
    public final void mo63683b(Exception exc) {
        int i;
        m72411c(this.f81192l);
        Context context = this.f81198r;
        if (this.f80983e.mo60890e() == 1) {
            i = R.string.apn;
        } else {
            i = R.string.f6x;
        }
        C22971a.m56494a(context, exc, i);
    }

    @C53771m
    public final void onEventDiggUpdate(C30312ad adVar) {
        if (adVar != null && TextUtils.equals(adVar.f79200a, C23198ae.m56877m(this.f81192l))) {
            m72409a(adVar.f79201b);
        }
    }

    /* renamed from: b */
    private static void m72410b(Aweme aweme) {
        if (aweme != null) {
            C26890h.m65011a("unlogin_like_cancel", C23089d.m56640a().mo47829a("enter_from", "homepage_hot").mo47829a("group_id", aweme.getAid()).mo47829a("author_id", C23198ae.m56846a(aweme)).mo47829a("log_pb", C29981aa.m70153a().mo60161a(aweme.getRequestId())).f61491a);
        }
    }

    /* renamed from: c */
    private void m72411c(Aweme aweme) {
        if (this.f81198r != null && aweme != null) {
            if (!this.f80982d) {
                this.f80986h++;
                m72409a(true);
                return;
            }
            if (this.f80982d) {
                this.f80986h--;
                m72409a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo60919a(C0794k<String, Integer> kVar) {
        this.f81197q.mo48228a("digg_success", (Object) kVar);
        C47718bf.m103288a(new C30332aw(13, kVar.f2711a));
        if (((Integer) kVar.f2712b).intValue() == 1) {
            C47717be.m103287a();
        }
        C28220g.f74083b.mo56651a(this.f81192l, 4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b6r);
        this.f80979a = (DiggAnimationView) view2.findViewById(R.id.a5m);
        this.f80980b = (TextView) view2.findViewById(R.id.a5p);
        this.f80981c = view2.findViewById(R.id.a5o);
        this.f80989k = view2.findViewById(R.id.a5t);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f80983e = new C30472aa();
        this.f80983e.mo54799a(new C30508z());
        this.f80983e.mo54800a(this);
        this.f80990w = this.f81198r.getResources().getDrawable(R.drawable.de4);
        C47718bf.m103290c(this);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        long j;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            boolean z = false;
            if (hashCode != -1475411887) {
                if (hashCode != 281945252) {
                    if (hashCode != 350216171) {
                        if (hashCode == 710615618 && str.equals("video_resume_play")) {
                            c = 0;
                        }
                    } else if (str.equals("on_page_selected")) {
                        c = 2;
                    }
                } else if (str.equals("show_festival_activity_icon")) {
                    c = 3;
                }
            } else if (str.equals("handle_double_click")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    Aweme aweme = (Aweme) aVar.mo48246a();
                    if (aweme != null && aweme.isAd()) {
                        if (aweme.getUserDigg() == 1) {
                            z = true;
                        }
                        if (this.f81192l != null) {
                            this.f80982d = z;
                            this.f80979a.setSelected(z);
                            if (this.f81192l.getStatistics() == null) {
                                j = 0;
                            } else {
                                j = this.f81192l.getStatistics().getDiggCount();
                            }
                            this.f80986h = j;
                            if (this.f80986h < 0) {
                                this.f80986h = 0;
                            }
                            this.f80980b.setText(m72406a(this.f80986h));
                        }
                        return;
                    }
                case 1:
                    Aweme aweme2 = (Aweme) aVar.mo48246a();
                    if (this.f81198r != null && aweme2 != null && !C23794bh.m58390d().mo47103a() && !this.f80982d && aweme2.getUserDigg() == 0) {
                        this.f81197q.mo48228a("video_digg", (Object) Integer.valueOf(5));
                        this.f80986h++;
                        m72409a(true);
                        Boolean bool = (Boolean) this.f80979a.getTag(C31357a.co7);
                        if (bool != null) {
                            z = bool.booleanValue();
                        }
                        if (z) {
                            C31199l.m72855a(this.f80979a);
                        } else {
                            this.f80979a.mo64027a();
                        }
                        m72407a(aweme2, "click_double_like");
                    }
                    return;
                case 2:
                case 3:
                    mo63420b();
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m72409a(boolean z) {
        long j;
        long j2;
        if (this.f81192l != null) {
            this.f80982d = z;
            this.f80979a.setSelected(z);
            if (z) {
                if (this.f80988j == 1) {
                    if (this.f80987i < 1 && !this.f81192l.isDelete()) {
                        this.f80987i = 1;
                    }
                    j = this.f80987i;
                    this.f81197q.mo48228a("update_diig_view", (Object) Boolean.valueOf(z));
                } else {
                    j2 = this.f80987i + 1;
                }
            } else if (this.f80988j != 1 || this.f81192l.isDelete()) {
                j = this.f80987i;
                this.f81197q.mo48228a("update_diig_view", (Object) Boolean.valueOf(z));
            } else {
                j2 = this.f80987i - 1;
            }
            j = j2;
            this.f81197q.mo48228a("update_diig_view", (Object) Boolean.valueOf(z));
        } else {
            StringBuilder sb = new StringBuilder("updateDiggView when aweme is null:");
            sb.append(Log.getStackTraceString(new Throwable()));
            C32458a.m75141a(6, "VideoDiggView", sb.toString());
            j = 0;
        }
        if (j < 0) {
            j = 0;
        }
        try {
            if (this.f81192l == null || !this.f81192l.isDelete() || j != 0) {
                this.f80980b.setVisibility(0);
                this.f80980b.setText(m72406a(j));
                return;
            }
            this.f80980b.setVisibility(4);
        } catch (NullPointerException e) {
            this.f80980b.setText(m72406a(0));
            C32458a.m75148a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("video_resume_play", (C0199s<C23274a>) this).mo48226a("handle_double_click", (C0199s<C23274a>) this).mo48226a("show_festival_activity_icon", (C0199s<C23274a>) this);
        }
    }

    /* renamed from: a */
    private void m72408a(String str, int i) {
        if (!C30133aj.m70710d()) {
            C30133aj.m70709c();
        }
        if (!TextUtils.isEmpty(this.f80984f) && C30396s.m71317a() && i == 1) {
            C30389m mVar = new C30389m(this.f81192l.getAid(), 1, System.currentTimeMillis(), this.f80984f);
            C30396s.m71316a(mVar);
        }
        if (C30223c.m70960a() == 0 || C20854a.m53167g().isLogin()) {
            this.f80983e.mo44934a_(str, Integer.valueOf(i), this.f80984f);
        } else if (i == 1) {
            C30133aj.m70707a(C30133aj.m70708b() + 1);
            if (UnloginDiggShowInProfileExperiment.INSTANCE.mo59615a()) {
                C30134ak.f78654c.mo60385a(str, System.currentTimeMillis(), C23064c.m56602a(this.f80984f));
                C40504k.m89917a(str, C23064c.m56602a(this.f80984f), true);
            }
            this.f81192l.setUserDigg(1);
        } else {
            if (i == 0) {
                C30133aj.m70707a(Math.max(C30133aj.m70708b() - 1, 0));
                if (UnloginDiggShowInProfileExperiment.INSTANCE.mo59615a()) {
                    C30134ak.f78654c.mo60384a(str);
                    C40504k.m89917a(str, C23064c.m56602a(this.f80984f), false);
                }
                m72410b(this.f81192l);
                this.f81192l.setUserDigg(0);
            }
        }
    }

    /* renamed from: a */
    private void m72407a(Aweme aweme, String str) {
        Aweme aweme2 = aweme;
        String str2 = str;
        if (!TextUtils.equals("opus", this.f80984f)) {
            C26890h.m65006a(this.f81198r, "like", this.f80984f, aweme.getAid(), 0, m72413e());
        } else if (this.f81195o) {
            C26890h.m65006a(this.f81198r, "like", "personal_homepage", aweme.getAid(), 0, m72413e());
        } else {
            C26890h.m65006a(this.f81198r, "like", "others_homepage", aweme.getAid(), 0, m72413e());
        }
        String a = C30366f.m71279a(this.f81196p, this.f80984f, true);
        long j = 0;
        if (!C20854a.m53167g().isLogin()) {
            new C23193aa().mo47947a(this.f80984f).mo47946a(this.f81196p).mo47950b(aweme.getAid()).mo47954f(aweme2).mo47952c(str2).mo47949b(C30133aj.m70710d() ^ true ? 1 : 0).mo47951c(0).mo48076e();
            C23256z zVar = (C23256z) ((C23256z) ((C23256z) new C23256z().mo48182a(0).mo48192f(str2).mo48189d(a).mo48191e(this.f80991x).mo48184a((String) this.f81197q.mo48230b("playlist_type", "")).mo48188c((String) this.f81197q.mo48230b("playlist_id", "")).mo48186b((String) this.f81197q.mo48230b("playlist_id_key", "")).mo48100j((String) this.f81197q.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(this.f81192l, this.f81196p))).mo47954f(aweme2).mo48098a(Boolean.valueOf(C31190f.m72834b(aweme)));
            if (this.f80993z != null) {
                j = this.f80993z.mo60580a();
            }
            zVar.mo48183a(j).mo48193g(this.f80992y).mo48076e();
        } else {
            C23256z zVar2 = (C23256z) ((C23256z) ((C23256z) new C23256z().mo48182a(1).mo48192f(str2).mo48189d(a).mo48191e(this.f80991x).mo48184a((String) this.f81197q.mo48230b("playlist_type", "")).mo48188c((String) this.f81197q.mo48230b("playlist_id", "")).mo48186b((String) this.f81197q.mo48230b("playlist_id_key", "")).mo48100j((String) this.f81197q.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(this.f81192l, this.f81196p))).mo47954f(aweme2).mo48098a(Boolean.valueOf(C31190f.m72834b(aweme)));
            if (this.f80993z != null) {
                j = this.f80993z.mo60580a();
            }
            zVar2.mo48183a(j).mo48193g(this.f80992y).mo48076e();
        }
        if (aweme.getAwemeType() != 34) {
            m72408a(aweme.getAid(), 1);
        } else {
            C25945k.m62911b().mo53142f(this.f81198r, aweme2);
        }
    }

    public C30919dt(View view, String str, String str2, String str3, C30237a aVar) {
        super(view);
        this.f80984f = str;
        this.f80991x = str2;
        this.f80993z = aVar;
        this.f80992y = str3;
    }
}
