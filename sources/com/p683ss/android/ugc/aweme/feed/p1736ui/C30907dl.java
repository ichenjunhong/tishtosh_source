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
import com.bytedance.ies.abmock.C10181b;
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
import com.p683ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget.C30236a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
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
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dl */
public final class C30907dl extends C30241a implements C30503v {

    /* renamed from: A */
    private View f80943A;

    /* renamed from: B */
    private String f80944B;

    /* renamed from: C */
    private String f80945C;

    /* renamed from: D */
    private C30236a f80946D;

    /* renamed from: E */
    private View f80947E;

    /* renamed from: F */
    private View f80948F;

    /* renamed from: p */
    DiggAnimationView f80949p;

    /* renamed from: q */
    TextView f80950q;

    /* renamed from: r */
    View f80951r;

    /* renamed from: s */
    public long f80952s;

    /* renamed from: t */
    public boolean f80953t;

    /* renamed from: u */
    public C30472aa f80954u;

    /* renamed from: v */
    Drawable f80955v;

    /* renamed from: w */
    public String f80956w;

    /* renamed from: x */
    public OnClickListener f80957x = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            int a = C30223c.m70960a();
            boolean z = false;
            if (a == 0) {
                z = !C20854a.m53167g().isLogin();
            } else if (a > 0 && !C20854a.m53167g().isLogin() && !C30907dl.this.f80953t && C30907dl.this.f79011d.getUserDigg() == 0 && C30133aj.m70708b() >= a) {
                z = true;
            }
            if (z) {
                new C23193aa().mo47947a(C30907dl.this.f80956w).mo47946a(C30907dl.this.f79015h).mo47950b(C30907dl.this.f79011d.getAid()).mo47954f(C30907dl.this.f79011d).mo47952c("click_like").mo47949b(C30133aj.m70710d() ^ true ? 1 : 0).mo47951c(1).mo48076e();
                if (!C30133aj.m70710d()) {
                    C30133aj.m70709c();
                }
                if (TextUtils.equals(C30907dl.this.f80956w, "homepage_hot")) {
                    str = "";
                } else {
                    str = C30907dl.this.f79017j.getString(R.string.bwi);
                }
                if (C30907dl.this.f79011d != null) {
                    str2 = C30907dl.this.f79011d.getAid();
                } else {
                    str2 = "";
                }
                C27965f.m66721a((Activity) C30907dl.this.f79017j, C30907dl.this.f80956w, "click_like", C47661ab.m103163a().mo94972a("login_title", str).mo94972a("group_id", str2).mo94972a("log_pb", C23198ae.m56874k(str2)).f120139a, (C23505g) new C30917dr(this, view));
            } else if (C36330a.m81964a(C30907dl.this.f79011d) && C30907dl.this.f79011d.getUserDigg() == 0) {
                C10691a.m21545b(C30907dl.this.f79017j, C36330a.m81963a(C30907dl.this.f79011d, R.string.fc_)).mo19066a();
            } else if (C30907dl.this.f79011d.isCanPlay() || C30907dl.this.f79011d.getUserDigg() != 0) {
                if (C30907dl.this.f79011d.isDelete() && C30907dl.this.f79011d.getUserDigg() == 0) {
                    C10691a.m21542b(C30907dl.this.f79017j, (int) R.string.fc_).mo19066a();
                } else if (C30907dl.this.f79011d.getVideoControl() != null && C30907dl.this.f79011d.getVideoControl().timerStatus == 0) {
                    C10691a.m21548c(C30907dl.this.f79017j, (int) R.string.fbb).mo19066a();
                } else if (C30907dl.this.f80953t || !C47950q.m103754c(C30907dl.this.f79011d) || !C47950q.m103752a(C30907dl.this.f79011d)) {
                    C30907dl.this.f80949p.mo64028a(view);
                    if (!C30918ds.m72405a(C30907dl.this.f79017j)) {
                        C10691a.m21542b(C30907dl.this.f79017j, (int) R.string.cg1).mo19066a();
                    } else {
                        C30907dl.this.mo63669a(C30907dl.this.f79011d);
                    }
                } else {
                    C10691a.m21548c(C30907dl.this.f79017j, (int) R.string.ffs).mo19066a();
                }
            } else if (C30907dl.this.f79011d.isImage()) {
                C10691a.m21542b(C30907dl.this.f79017j, (int) R.string.bqo).mo19066a();
            } else {
                C10691a.m21542b(C30907dl.this.f79017j, (int) R.string.fc_).mo19066a();
            }
        }
    };

    /* renamed from: y */
    private long f80958y;

    /* renamed from: z */
    private int f80959z;

    /* renamed from: e */
    public final void mo60599e() {
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    public final void mo63669a(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (this.f79017j == null || aweme2 == null) {
            StringBuilder sb = new StringBuilder("handleDiggClick:");
            sb.append(String.valueOf(this.f79017j));
            sb.append(",aweme:");
            sb.append(String.valueOf(aweme));
            C32458a.m75141a(6, "VideoDiggView", sb.toString());
            return;
        }
        C30385i.m71299a().mo60807b(this.f80949p, this.f80956w, C23198ae.m56877m(this.f79011d), C23198ae.m56846a(this.f79011d));
        this.f79016i.mo48228a("handle_digg_click", (Object) aweme2);
        boolean z = true;
        if (this.f80953t || aweme.getUserDigg() != 0) {
            if (!this.f80953t || aweme.getUserDigg() == 0) {
                if (aweme.getUserDigg() != 1) {
                    z = false;
                }
                this.f80953t = z;
                mo63671a(this.f80953t, aweme2);
                if (this.f80953t) {
                    this.f80952s++;
                    return;
                }
                this.f80952s--;
            } else {
                this.f79016i.mo48228a("video_digg", (Object) Integer.valueOf(6));
                this.f80952s--;
                mo63671a(false, aweme2);
                if (!C23718g.m58207b().mo49153d()) {
                    C10691a.m21542b(this.f79017j, (int) R.string.cg1).mo19066a();
                } else {
                    if (aweme2 != null) {
                        new C23256z("like_cancel").mo48189d(this.f80956w).mo48191e(this.f80944B).mo48185b(this.f79015h).mo47954f(aweme2).mo48193g(this.f80945C).mo48076e();
                        if (!TextUtils.equals("opus", this.f80956w)) {
                            C26890h.m65006a(this.f79017j, "like_cancel", this.f80956w, aweme.getAid(), 0, m72385k());
                        } else if (this.f79014g) {
                            C26890h.m65006a(this.f79017j, "like_cancel", "personal_homepage", aweme.getAid(), 0, m72385k());
                        } else {
                            C26890h.m65006a(this.f79017j, "like_cancel", "others_homepage", aweme.getAid(), 0, m72385k());
                        }
                        if (aweme.getAwemeType() != 34) {
                            m72379a(aweme.getAid(), 0, aweme2);
                        } else {
                            C25945k.m62911b().mo53143g(this.f79017j, aweme2);
                        }
                    }
                    return;
                }
            }
            return;
        }
        this.f79016i.mo48228a("video_digg", (Object) Integer.valueOf(5));
        this.f80952s++;
        mo63671a(true, aweme2);
        m72378a(aweme2, "click_like");
    }

    /* renamed from: a */
    public final void mo60588a(Map<String, Object> map) {
        if (map != null) {
            if (!((Boolean) map.get("isInActivityState")).booleanValue()) {
                C30255o.f79039a.mo60617a(new C30256p(false, new C30913dn(this)));
                return;
            }
        } else if (!C31357a.m73095a()) {
            C30255o.f79039a.mo60617a(new C30256p(false, new C30914do(this)));
            return;
        }
        C30255o.f79039a.mo60617a(new C30256p(false, new C30915dp(this)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63670a(Aweme aweme, Map map) {
        boolean z;
        this.f79016i.mo48228a("video_digg", (Object) Integer.valueOf(5));
        m72382b(true, aweme, map);
        Boolean bool = (Boolean) this.f80949p.getTag(C31357a.co7);
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        if (z) {
            C31199l.m72855a(this.f80949p);
        } else {
            this.f80949p.mo64027a();
        }
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("video_resume_play", (C0199s<C23274a>) this.f79009b).mo48226a("handle_double_click", (C0199s<C23274a>) this.f79009b).mo48226a("show_festival_activity_icon", (C0199s<C23274a>) this.f79009b);
        }
    }

    /* renamed from: a */
    public final void mo60920a(final Exception exc) {
        if (!C23794bh.m58389c().mo50264a(exc)) {
            mo63672b(exc);
        } else if (this.f79017j instanceof FragmentActivity) {
            C23794bh.m58389c().mo50263a(((FragmentActivity) this.f79017j).getSupportFragmentManager(), (C23459a) exc, new C24493b() {
                /* renamed from: a */
                public final void mo45353a() {
                    C30907dl.this.f80954u.mo44935c();
                }

                /* renamed from: b */
                public final void mo45354b() {
                    C30907dl.this.mo63672b(exc);
                }
            });
        }
    }

    /* renamed from: j */
    private static String m72384j() {
        if (VideoInteractionExperiment.NEED_SHOW_TEXT) {
            return VideoInteractionExperiment.DEFAULT_DIGG_TEXT;
        }
        return "0";
    }

    /* renamed from: k */
    private JSONObject m72385k() {
        return C31188d.m72825a(this.f79011d, this.f79015h, this.f79020m, this.f80956w);
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
    }

    /* renamed from: c */
    private void m72383c(final Aweme aweme) {
        if (this.f79017j != null && aweme != null) {
            C30255o.f79039a.mo60617a(new C30256p(this.f79008a, new Runnable() {
                public final void run() {
                    final boolean z;
                    if (!C30907dl.this.f80953t) {
                        C30907dl.this.f80952s++;
                        z = true;
                    } else {
                        if (C30907dl.this.f80953t) {
                            C30907dl.this.f80952s--;
                        }
                        z = false;
                    }
                    C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                        public final void run() {
                            C30907dl.this.mo63671a(z, aweme);
                        }
                    }));
                }
            }));
        }
    }

    /* renamed from: b */
    public final void mo63672b(Exception exc) {
        int i;
        m72383c(this.f79011d);
        Context context = this.f79017j;
        if (this.f80954u.mo60890e() == 1) {
            i = R.string.apn;
        } else {
            i = R.string.f6x;
        }
        C22971a.m56494a(context, exc, i);
    }

    @C53771m
    public final void onEventDiggUpdate(C30312ad adVar) {
        if (adVar != null && TextUtils.equals(adVar.f79200a, C23198ae.m56877m(this.f79011d))) {
            mo63671a(adVar.f79201b, this.f79011d);
        }
    }

    /* renamed from: b */
    private static void m72381b(Aweme aweme) {
        if (aweme != null) {
            C26890h.m65011a("unlogin_like_cancel", C23089d.m56640a().mo47829a("enter_from", "homepage_hot").mo47829a("group_id", aweme.getAid()).mo47829a("author_id", C23198ae.m56846a(aweme)).mo47829a("log_pb", C29981aa.m70153a().mo60161a(aweme.getRequestId())).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo60919a(C0794k<String, Integer> kVar) {
        this.f79016i.mo48228a("digg_success", (Object) kVar);
        C47718bf.m103288a(new C30332aw(13, kVar.f2711a));
        if (((Integer) kVar.f2712b).intValue() == 1) {
            C47717be.m103287a();
        }
        C28220g.f74083b.mo56651a(this.f79011d, 4);
    }

    /* renamed from: b */
    public final C23274a mo60590b(C23274a aVar) {
        long j;
        if (aVar == null) {
            return null;
        }
        super.mo60590b(aVar);
        if (!aVar.f62242a.equals("video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C23274a aVar2 = new C23274a("uistate", hashMap);
        Aweme aweme = this.f79011d;
        hashMap.put("aweme_state", aweme);
        boolean z = true;
        if (UnloginDiggShowInProfileExperiment.INSTANCE.mo59615a() && this.f79011d != null && C30134ak.f78654c.mo60386b(this.f79011d.getAid())) {
            this.f79011d.setUserDigg(1);
            AwemeStatistics statistics = this.f79011d.getStatistics();
            if (statistics != null) {
                statistics.setDiggCount(statistics.getDiggCount() + 1);
            }
        }
        if (this.f79011d.getStatistics() == null) {
            j = 0;
        } else {
            j = this.f79011d.getStatistics().getDiggCount();
        }
        this.f80952s = j;
        this.f80958y = this.f80952s;
        this.f80959z = this.f79011d.getUserDigg();
        hashMap.put("isInActivityState", Boolean.valueOf(C31357a.m73095a()));
        if (aweme.getUserDigg() != 1) {
            z = false;
        }
        m72380a(z, aweme, (Map<String, Object>) hashMap);
        this.f80951r.setOnClickListener(this.f80957x);
        this.f80950q.setOnClickListener(this.f80957x);
        this.f80943A.setOnClickListener(this.f80957x);
        return aVar2;
    }

    /* renamed from: e */
    public final void mo60600e(C23274a aVar) {
        boolean z;
        long j;
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1475411887:
                    if (str.equals("handle_double_click")) {
                        c = 1;
                        break;
                    }
                    break;
                case 281945252:
                    if (str.equals("show_festival_activity_icon")) {
                        c = 3;
                        break;
                    }
                    break;
                case 350216171:
                    if (str.equals("on_page_selected")) {
                        c = 2;
                        break;
                    }
                    break;
                case 651229933:
                    if (str.equals("awesome_update_backup_data")) {
                        c = 5;
                        break;
                    }
                    break;
                case 710615618:
                    if (str.equals("video_resume_play")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1759823748:
                    if (str.equals("awesome_update_data")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Aweme aweme = (Aweme) aVar.mo48246a();
                    if (aweme != null && aweme.isAd()) {
                        if (aweme.getUserDigg() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.f79011d != null) {
                            this.f80953t = z;
                            if (this.f79011d.getStatistics() == null) {
                                j = 0;
                            } else {
                                j = this.f79011d.getStatistics().getDiggCount();
                            }
                            this.f80952s = j;
                            if (this.f80952s < 0) {
                                this.f80952s = 0;
                            }
                            long j2 = this.f80952s;
                            Aweme aweme2 = this.f79011d;
                            C30255o oVar = C30255o.f79039a;
                            C30912dm dmVar = new C30912dm(this, z, j2, aweme2);
                            oVar.mo60617a(new C30256p(false, dmVar));
                        }
                        return;
                    }
                case 1:
                    Aweme aweme3 = (Aweme) aVar.mo48246a();
                    if (this.f79017j != null && aweme3 != null && !C23794bh.m58390d().mo47103a() && !this.f80953t && aweme3.getUserDigg() == 0) {
                        this.f80952s++;
                        HashMap hashMap = new HashMap();
                        m72380a(true, aweme3, (Map<String, Object>) hashMap);
                        C30255o.f79039a.mo60617a(new C30256p(false, new C30916dq(this, aweme3, hashMap)));
                        m72378a(aweme3, "click_double_like");
                    }
                    return;
                case 2:
                case 3:
                    mo60588a(null);
                    return;
                case 4:
                case 5:
                    onChanged(new C23274a("video_params", aVar.mo48246a()));
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        this.f80947E = view;
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b6r);
        this.f80948F = view2;
        this.f80949p = (DiggAnimationView) view2.findViewById(R.id.a5m);
        this.f80950q = (TextView) view2.findViewById(R.id.a5p);
        this.f80951r = view2.findViewById(R.id.a5o);
        this.f80943A = view2.findViewById(R.id.a5t);
        this.f80954u = new C30472aa();
        this.f80954u.mo54799a(new C30508z());
        this.f80954u.mo54800a(this);
        this.f80955v = this.f79017j.getResources().getDrawable(R.drawable.de4);
        C47718bf.m103290c(this);
    }

    /* renamed from: a */
    public final void mo63671a(boolean z, Aweme aweme) {
        HashMap hashMap = new HashMap();
        m72380a(z, aweme, (Map<String, Object>) hashMap);
        m72382b(z, aweme, hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo63668a(long j, Aweme aweme) {
        if (C36330a.m81964a(aweme)) {
            return "0";
        }
        if (j <= 0) {
            return m72384j();
        }
        return C33095b.m76068a(j);
    }

    /* renamed from: a */
    private void m72378a(Aweme aweme, String str) {
        Aweme aweme2 = aweme;
        String str2 = str;
        if (!TextUtils.equals("opus", this.f80956w)) {
            C26890h.m65006a(this.f79017j, "like", this.f80956w, aweme.getAid(), 0, m72385k());
        } else if (this.f79014g) {
            C26890h.m65006a(this.f79017j, "like", "personal_homepage", aweme.getAid(), 0, m72385k());
        } else {
            C26890h.m65006a(this.f79017j, "like", "others_homepage", aweme.getAid(), 0, m72385k());
        }
        String a = C30366f.m71279a(this.f79015h, this.f80956w, true);
        long j = 0;
        if (!C20854a.m53167g().isLogin()) {
            new C23193aa().mo47947a(this.f80956w).mo47946a(this.f79015h).mo47950b(aweme.getAid()).mo47954f(aweme2).mo47952c(str2).mo47949b(C30133aj.m70710d() ^ true ? 1 : 0).mo47951c(0).mo48076e();
            C23256z zVar = (C23256z) ((C23256z) ((C23256z) new C23256z().mo48182a(0).mo48192f(str2).mo48189d(a).mo48191e(this.f80944B).mo48184a((String) this.f79016i.mo48230b("playlist_type", "")).mo48188c((String) this.f79016i.mo48230b("playlist_id", "")).mo48186b((String) this.f79016i.mo48230b("playlist_id_key", "")).mo48100j((String) this.f79016i.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(this.f79011d, this.f79015h))).mo47954f(aweme2).mo48098a(Boolean.valueOf(C31190f.m72834b(aweme)));
            if (this.f80946D != null) {
                j = this.f80946D.mo60579a();
            }
            zVar.mo48183a(j).mo48193g(this.f80945C).mo48076e();
        } else {
            C23256z zVar2 = (C23256z) ((C23256z) ((C23256z) new C23256z().mo48182a(1).mo48192f(str2).mo48189d(a).mo48191e(this.f80944B).mo48184a((String) this.f79016i.mo48230b("playlist_type", "")).mo48188c((String) this.f79016i.mo48230b("playlist_id", "")).mo48186b((String) this.f79016i.mo48230b("playlist_id_key", "")).mo48100j((String) this.f79016i.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(this.f79011d, this.f79015h))).mo47954f(aweme2).mo48098a(Boolean.valueOf(C31190f.m72834b(aweme)));
            if (this.f80946D != null) {
                j = this.f80946D.mo60579a();
            }
            zVar2.mo48183a(j).mo48193g(this.f80945C).mo48076e();
        }
        if (aweme.getAwemeType() != 34) {
            m72379a(aweme.getAid(), 1, aweme2);
        } else {
            C25945k.m62911b().mo53142f(this.f79017j, aweme2);
        }
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        boolean z = true;
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f80947E instanceof FrameLayout) {
                ((FrameLayout) this.f80947E).addView(this.f80948F);
            }
        }
        if (aVar != null) {
            Map map = (Map) aVar.mo48246a();
            Aweme aweme = (Aweme) map.get("aweme_state");
            if (aweme == null) {
                StringBuilder sb = new StringBuilder("dig aweme is null content visible");
                sb.append(this.f80948F.getVisibility());
                C32458a.m75141a(6, "VideoDiggView", sb.toString());
                return;
            }
            C31208r.m72879a(aweme, this.f79018k, true, true);
            mo60588a(map);
            StringBuilder sb2 = new StringBuilder("dig visible");
            sb2.append(this.f80948F.getVisibility());
            sb2.append(" aweme ");
            sb2.append(aweme.getAid());
            C32458a.m75141a(6, "VideoDiggView", sb2.toString());
            if (aweme.getUserDigg() != 1) {
                z = false;
            }
            m72382b(z, aweme, map);
        }
    }

    /* renamed from: a */
    private void m72380a(boolean z, Aweme aweme, Map<String, Object> map) {
        long j;
        if (aweme != null) {
            this.f80953t = z;
            if (z) {
                if (this.f80959z == 1) {
                    if (this.f80958y < 1 && !aweme.isDelete()) {
                        this.f80958y = 1;
                    }
                    j = this.f80958y;
                } else {
                    j = this.f80958y + 1;
                }
            } else if (this.f80959z != 1 || aweme.isDelete()) {
                j = this.f80958y;
            } else {
                j = this.f80958y - 1;
            }
            map.put("digg_count_state", Long.valueOf(j));
            return;
        }
        StringBuilder sb = new StringBuilder("updateDiggView when aweme is null:");
        sb.append(Log.getStackTraceString(new Throwable()));
        C32458a.m75141a(6, "VideoDiggView", sb.toString());
    }

    /* renamed from: b */
    private void m72382b(boolean z, Aweme aweme, Map<String, Object> map) {
        long j;
        if (aweme != null) {
            this.f80949p.setSelected(z);
            j = ((Long) map.get("digg_count_state")).longValue();
            this.f79016i.mo48228a("update_diig_view", (Object) Boolean.valueOf(z));
        } else {
            StringBuilder sb = new StringBuilder("updateDiggView when aweme is null:");
            sb.append(Log.getStackTraceString(new Throwable()));
            C32458a.m75141a(6, "VideoDiggView", sb.toString());
            j = 0;
        }
        if (j < 0) {
            j = 0;
        }
        if (aweme != null) {
            try {
                if (aweme.isDelete() && j == 0) {
                    this.f80950q.setVisibility(4);
                    return;
                }
            } catch (NullPointerException e) {
                this.f80950q.setText(mo63668a(0, aweme));
                C32458a.m75148a((Throwable) e);
            }
        }
        this.f80950q.setVisibility(0);
        this.f80950q.setText(mo63668a(j, aweme));
    }

    /* renamed from: a */
    private void m72379a(String str, int i, Aweme aweme) {
        if (!C30133aj.m70710d()) {
            C30133aj.m70709c();
        }
        if (!TextUtils.isEmpty(this.f80956w) && C30396s.m71317a() && i == 1) {
            C30389m mVar = new C30389m(aweme.getAid(), 1, System.currentTimeMillis(), this.f80956w);
            C30396s.m71316a(mVar);
        }
        if (C30223c.m70960a() == 0 || C20854a.m53167g().isLogin()) {
            this.f80954u.mo44934a_(str, Integer.valueOf(i), this.f80956w);
        } else if (i == 1) {
            C30133aj.m70707a(C30133aj.m70708b() + 1);
            if (UnloginDiggShowInProfileExperiment.INSTANCE.mo59615a()) {
                C30134ak.f78654c.mo60385a(str, System.currentTimeMillis(), C23064c.m56602a(this.f80956w));
                C40504k.m89917a(str, C23064c.m56602a(this.f80956w), true);
            }
            aweme.setUserDigg(1);
        } else {
            if (i == 0) {
                C30133aj.m70707a(Math.max(C30133aj.m70708b() - 1, 0));
                if (UnloginDiggShowInProfileExperiment.INSTANCE.mo59615a()) {
                    C30134ak.f78654c.mo60384a(str);
                    C40504k.m89917a(str, C23064c.m56602a(this.f80956w), false);
                }
                m72381b(aweme);
                aweme.setUserDigg(0);
            }
        }
    }

    public C30907dl(View view, String str, String str2, String str3, C30236a aVar) {
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
        this.f80956w = str;
        this.f80944B = str2;
        this.f80946D = aVar;
        this.f80945C = str3;
    }
}
