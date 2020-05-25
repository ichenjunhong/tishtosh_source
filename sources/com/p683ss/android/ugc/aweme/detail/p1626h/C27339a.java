package com.p683ss.android.ugc.aweme.detail.p1626h;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p030v4.view.ViewPager.C1000h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.browserecord.BrowseRecordWidget;
import com.p683ss.android.ugc.aweme.browserecord.C23982a;
import com.p683ss.android.ugc.aweme.browserecord.C24032i;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25144a;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25149c;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25164b.C25165a;
import com.p683ss.android.ugc.aweme.comment.services.C25283b;
import com.p683ss.android.ugc.aweme.comment.services.C25284c;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25880al;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25719i;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.p1554a.C25709a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.detail.C27327d;
import com.p683ss.android.ugc.aweme.detail.C27330e;
import com.p683ss.android.ugc.aweme.detail.C27333f;
import com.p683ss.android.ugc.aweme.detail.p1620b.C27320a;
import com.p683ss.android.ugc.aweme.detail.p1621c.C27326a;
import com.p683ss.android.ugc.aweme.detail.p1623e.C27332a;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27379l;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27381n;
import com.p683ss.android.ugc.aweme.detail.p1628ui.C27497g;
import com.p683ss.android.ugc.aweme.discover.model.SearchAggregateCommodity;
import com.p683ss.android.ugc.aweme.familiar.C29633a;
import com.p683ss.android.ugc.aweme.familiar.service.C29650b;
import com.p683ss.android.ugc.aweme.feed.C30130ag;
import com.p683ss.android.ugc.aweme.feed.adapter.C30015af;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.adapter.C30019aj;
import com.p683ss.android.ugc.aweme.feed.adapter.C30056b;
import com.p683ss.android.ugc.aweme.feed.adapter.C30121v;
import com.p683ss.android.ugc.aweme.feed.api.C30148f;
import com.p683ss.android.ugc.aweme.feed.experiment.C30223c;
import com.p683ss.android.ugc.aweme.feed.guide.C30286i;
import com.p683ss.android.ugc.aweme.feed.guide.C30289j;
import com.p683ss.android.ugc.aweme.feed.helper.C30386j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.model.StreamUrlModel;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30181a;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30326aq;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30336e;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30337f;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30338g;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30341j;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30343l;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30350s;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30444a;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30445b;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.detailvideo.C31127a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.detailvideo.C31128b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.detailvideo.C31129c;
import com.p683ss.android.ugc.aweme.feed.panel.C30607ao;
import com.p683ss.android.ugc.aweme.feed.panel.C30616b;
import com.p683ss.android.ugc.aweme.feed.utils.C31186b;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31864a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.C36670n;
import com.p683ss.android.ugc.aweme.main.p1937a.C36484a;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.newfollow.util.C37934d;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.p1382aq.C23200ag;
import com.p683ss.android.ugc.aweme.p1382aq.C23212ar;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.service.C41488a;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43888b;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47935p;
import com.p683ss.android.ugc.aweme.video.C47981ac;
import com.p683ss.android.ugc.aweme.video.C48039k;
import com.p683ss.android.ugc.aweme.video.C48069o;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.detail.h.a */
public class C27339a extends C30616b implements C25149c, C25284c, C26877c<Aweme>, C27362h, C27381n, C30504w {

    /* renamed from: aL */
    private boolean f72090aL;

    /* renamed from: aM */
    private View f72091aM;

    /* renamed from: aN */
    private boolean f72092aN;

    /* renamed from: aO */
    private boolean f72093aO = false;

    /* renamed from: aP */
    private boolean f72094aP = false;

    /* renamed from: b */
    protected View f72095b;

    /* renamed from: c */
    protected C25144a f72096c;

    /* renamed from: d */
    protected C31129c f72097d;

    /* renamed from: d_ */
    public boolean f72098d_;

    /* renamed from: e */
    protected C23982a f72099e;

    /* renamed from: f */
    protected C30607ao f72100f;

    /* renamed from: g */
    protected C30445b f72101g;

    /* renamed from: h */
    public C30444a f72102h;

    /* renamed from: i */
    public C30019aj f72103i;

    /* renamed from: j */
    public boolean f72104j = true;

    /* renamed from: k */
    public C27320a f72105k;

    /* renamed from: l */
    public HashSet<String> f72106l = new HashSet<>();

    /* renamed from: m */
    public HashSet<String> f72107m = new HashSet<>();

    /* renamed from: n */
    int f72108n = 0;

    /* renamed from: o */
    public boolean f72109o = true;

    /* renamed from: p */
    public boolean f72110p;

    /* renamed from: q */
    protected int f72111q;

    /* renamed from: r */
    public C27355a f72112r;

    /* renamed from: s */
    private boolean f72113s;

    /* renamed from: t */
    private String f72114t;

    /* renamed from: com.ss.android.ugc.aweme.detail.h.a$a */
    public interface C27355a {
        /* renamed from: c */
        void mo55850c();
    }

    /* renamed from: v */
    public final boolean mo55834v() {
        return true;
    }

    /* renamed from: a */
    public final void mo55788a(C30445b bVar) {
        this.f72101g = bVar;
    }

    /* renamed from: a */
    public final void mo55792a(String str) {
        if (mo62868bh() && C30223c.m70962c() != 0 && C30130ag.m70701a()) {
            if (TextUtils.equals(this.f72114t, str)) {
                this.f72108n++;
                if (this.f72108n >= C30223c.m70961b() && !C30286i.m71202a().mo60688a(str)) {
                    try {
                        C26890h.onEvent(new MobClick().setEventName("share_highlight").setLabelName(C22858c.f61208d).setValue(str).setJsonObject(new JSONObject().put("repeat", C30223c.m70962c() == 1 ? "double" : "triple")));
                    } catch (JSONException unused) {
                    }
                    C30286i.m71202a().mo60689b(str);
                    C30015af aM = mo62838aM();
                    if (aM != null) {
                        aM.mo60186K();
                        C30130ag.m70702b();
                    }
                    if (this.f72108n == 2) {
                        C23131p.m57779a("awe_share_guide_type_log", C23088c.m56631a().mo47824a("awe_share_guide_type", C30130ag.m70703c()).mo47825b());
                    }
                } else if (this.f72108n == 2) {
                    C23131p.m57779a("awe_share_guide_type_log", C23088c.m56631a().mo47824a("awe_share_guide_type", "none").mo47825b());
                }
            } else {
                this.f72108n = 1;
                this.f72114t = str;
            }
        }
    }

    /* renamed from: a */
    public void mo47018a(List list, boolean z) {
        int i;
        if (mo62868bh()) {
            this.f80001as = true;
            if (this.f72096c != null) {
                this.f72096c.mo51233d();
            }
            DmtStatusView o = mo62895o(false);
            if (!this.f72093aO) {
                if (C9414h.m18630a(list)) {
                    DmtStatusView o2 = mo62895o(true);
                    if (o2 != null) {
                        o2.mo19213g();
                    }
                } else {
                    this.f72093aO = true;
                    if (o != null) {
                        o.mo19209d();
                    }
                    C18842a.m45934b(new Runnable() {
                        public final void run() {
                            if (C27339a.this.f79987ae.isShowShareAfterOpen()) {
                                C27339a.this.mo62881e(C27339a.this.mo55830r());
                            }
                            if (C27339a.this.f79987ae.isShowCommentAfterOpen()) {
                                C27339a.this.mo62883f(C27339a.this.mo55828p());
                            }
                        }
                    });
                }
            } else if (o != null) {
                o.mo19209d();
            }
            if (list == null || list.isEmpty() || !(list.get(0) instanceof Aweme)) {
                list = null;
            }
            List e = m65888e(list);
            this.f79984ab.setRefreshing(false);
            this.f79945E.f78454e = z;
            mo55798b(e);
            if (!C9376b.m18558a((Collection<T>) e)) {
                i = 0;
                while (true) {
                    if (i >= e.size()) {
                        break;
                    }
                    Aweme aweme = (Aweme) e.get(i);
                    if (aweme != null && TextUtils.equals(aweme.getAid(), m65880bB())) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && i < this.f79945E.getCount()) {
                    if (!(this.f79945E == null || this.f80030y.getExpectedAdapterCount() == this.f79945E.getCount())) {
                        this.f79945E.notifyDataSetChanged();
                    }
                    this.f80030y.mo55004a(i, false);
                }
                mo62822a("", true);
                C47718bf.m103288a(new C30343l());
                mo58360K();
                this.f80005aw = true;
                mo55810j();
                this.f80001as = false;
            }
            i = -1;
            this.f79945E.notifyDataSetChanged();
            this.f80030y.mo55004a(i, false);
            mo62822a("", true);
            C47718bf.m103288a(new C30343l());
            mo58360K();
            this.f80005aw = true;
            mo55810j();
            this.f80001as = false;
        }
    }

    /* renamed from: a */
    public final void mo49942a(Aweme aweme) {
        if (mo62868bh()) {
            DmtStatusView o = mo62895o(false);
            if (o != null) {
                o.setVisibility(8);
            }
            if (aweme == null) {
                C10691a.m21542b(mo96010bw(), (int) R.string.hvq).mo19066a();
            } else if (!C27333f.m65866b(mo62871bk()) || !aweme.isForwardAweme() || aweme.getForwardItem() != null) {
                if (aweme.getStatus() != null && aweme.getStatus().isDelete()) {
                    this.f72095b.postDelayed(new Runnable() {
                        public final void run() {
                            if (C27339a.this.f121964aK != null && !C27339a.this.f121964aK.isFinishing()) {
                                C27339a.this.f121964aK.finish();
                            }
                        }
                    }, 600);
                }
                if (C47915gg.m103652b(aweme.getAuthor(), C47915gg.m103664m(aweme.getAuthor()))) {
                    if (this.f72096c != null) {
                        this.f72096c.mo51228a(false);
                    }
                    if (this.f72112r != null) {
                        this.f72112r.mo55850c();
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C23324d.m57378a().updateAweme(aweme));
                    mo55798b((List<Aweme>) arrayList);
                    if (this.f72096c != null) {
                        this.f72096c.mo51229b();
                    }
                }
                if (("message".equals(ay_()) || "chat".equals(ay_()) || "push".equals(ay_()) || "like_list".equals(ay_()) || "click_comment_chain".equals(ay_()) || "click_comment_bubble".equals(ay_())) && !TextUtils.isEmpty(m65881bC()) && m65882bD() == 0) {
                    boolean z = true;
                    if (m65882bD() == 0 && this.f79987ae.getLevel1CommentDeleted() == 1) {
                        C10691a.m21548c(C11010c.m22280a(), (int) R.string.cix).mo19066a();
                    } else {
                        z = false;
                    }
                    if (!z && !C47935p.m103712e(aweme)) {
                        mo55790a(mo55830r(), m65881bC(), 0);
                    }
                }
                if (this.f79987ae.isShowShareAfterOpen()) {
                    mo62881e(mo55830r());
                }
                if (this.f79987ae.getNeedShowDonation()) {
                    mo55789a(mo55830r(), 0);
                }
            } else {
                C10691a.m21542b(mo96010bw(), (int) R.string.b5z).mo19066a();
            }
        }
    }

    /* renamed from: a */
    public final void mo55790a(final Aweme aweme, final String str, final int i) {
        if (mo60518aj() != null || i >= 3) {
            mo62819a(mo55830r(), m65881bC(), m65883bE(), false, null);
            return;
        }
        mo60508a((Runnable) new Runnable() {
            public final void run() {
                C27339a.this.mo55790a(aweme, str, i + 1);
            }
        }, 50);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo55789a(Aweme aweme, int i) {
        if (mo60518aj() != null || i >= 3) {
            SmartRouter.buildRoute(mo96010bw(), "aweme://donation/pannel").withParam("enter_method", mo62872bl()).withParam("enter_from", mo60874g(true)).withParam("page_type", mo60502X()).withParam("aweme_id", aweme.getAid()).open();
        } else {
            mo60508a((Runnable) new C27358d(this, aweme, i), 50);
        }
    }

    /* renamed from: a */
    public final void mo51276a(boolean z) {
        if (this.f72097d != null) {
            C31128b bVar = this.f72097d.f81489d;
            if (bVar != null) {
                bVar.mo75375c();
            }
        }
    }

    /* renamed from: a */
    public final void mo55793a(List<Aweme> list) {
        int i;
        if (mo62868bh()) {
            this.f79946F = 0;
            if (list == null) {
                i = 0;
            } else {
                i = list.size();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Aweme updateAweme = C23324d.m57378a().updateAweme((Aweme) list.get(i3));
                list.set(i3, updateAweme);
                if (updateAweme != null && C9431p.m18665a(updateAweme.getAid(), m65880bB())) {
                    i2 = i3;
                }
            }
            mo55798b(list);
            this.f79946F = i2;
            if (this.f72099e != null) {
                this.f72099e.f63663d = this.f79946F;
            }
            this.f80030y.mo55004a(this.f79946F, false);
            this.f80030y.post(new Runnable() {
                public final void run() {
                    if (C27339a.this.f72096c != null) {
                        C27339a.this.f72096c.mo51229b();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo55791a(Exception exc) {
        if (mo62868bh()) {
            C22971a.m56494a(this.f121964aK, exc, R.string.c0a);
            DmtStatusView o = mo62895o(false);
            if (o != null) {
                o.setVisibility(8);
            }
        }
    }

    /* renamed from: bB */
    private String m65880bB() {
        return this.f79987ae.getAid();
    }

    /* renamed from: bC */
    private String m65881bC() {
        return this.f79987ae.getCid();
    }

    /* renamed from: bD */
    private int m65882bD() {
        return this.f79987ae.getCommentDeleted();
    }

    /* renamed from: bE */
    private boolean m65883bE() {
        return this.f79987ae.isCommentForceOpenReply();
    }

    /* renamed from: A */
    public final String mo55772A() {
        return this.f79987ae.getTabName();
    }

    /* renamed from: B */
    public final ViewGroup mo55773B() {
        return (ViewGroup) this.f72095b;
    }

    /* renamed from: C */
    public final String mo55774C() {
        return this.f79987ae.getTracker();
    }

    /* renamed from: b */
    public final Aweme mo51778b() {
        return mo55830r();
    }

    /* renamed from: c */
    public final void mo55800c() {
        Activity activity = this.f121964aK;
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: K */
    private void mo58360K() {
        if (mo62852ap()) {
            C37934d.m84797a(this.f80002at).mo77399d();
        }
    }

    /* renamed from: d */
    public final void mo55803d() {
        if (this.f72100f != null) {
            this.f72100f.mo62800a();
            this.f72100f = null;
        }
    }

    /* renamed from: s */
    public final boolean mo55831s() {
        boolean s = super.mo55831s();
        if (this.f72096c != null) {
            this.f72096c.mo51228a(!s);
        }
        return s;
    }

    /* renamed from: t */
    public final void mo55832t() {
        super.mo55832t();
        if (this.f72096c != null) {
            this.f72096c.mo51228a(true);
        }
    }

    /* renamed from: w */
    public final void mo55835w() {
        if (this.f72096c != null) {
            this.f72096c.mo51235e();
        }
    }

    /* renamed from: y */
    public final long mo55837y() {
        if (this.f79988af != null) {
            return this.f79988af.f78841j;
        }
        return -1;
    }

    public C27339a() {
        super("");
    }

    /* renamed from: bz */
    private void m65885bz() {
        if (this.f79945E.getCount() == 0) {
            mo55800c();
        } else {
            this.f80030y.post(new C27359e(this));
        }
    }

    /* renamed from: D */
    public final void mo55775D() {
        if (!C27497g.f72290w.containsKey(this.f79987ae.getEventType())) {
            super.mo55775D();
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (mo62868bh()) {
            if (this.f72096c != null) {
                this.f72096c.mo51231c();
            }
            DmtStatusView o = mo62895o(true);
            if (o != null) {
                o.setVisibility(0);
                o.mo19212f();
            }
        }
    }

    public void aJ_() {
        if (this.f72096c != null) {
            this.f72096c.mo51231c();
        }
        if (this.f79987ae.isShowVideoRank()) {
            DmtStatusView o = mo62895o(true);
            if (o != null) {
                o.setVisibility(0);
                o.mo19213g();
            }
        }
    }

    public final void aS_() {
        if (mo62868bh() && !this.f72092aN) {
            this.f79984ab.setRefreshing(true);
        }
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (mo62868bh() && !this.f72092aN) {
            this.f80029x.mo64048a();
        }
    }

    /* renamed from: j */
    public final void mo55810j() {
        if (C22453b.m55513e() > 0 && this.f80005aw && this.f72091aM != null) {
            this.f72091aM.setVisibility(0);
            this.f72091aM.setOnClickListener(new C27357c(this));
        }
    }

    /* renamed from: o */
    public final void mo55815o() {
        if (mo62868bh() && this.f79945E.f78455f && this.f79946F == 2 && this.f72102h != null) {
            this.f72102h.mo55942h();
        }
    }

    /* renamed from: q */
    public final List<Aweme> mo55829q() {
        if (this.f79945E == null || this.f80030y == null) {
            return null;
        }
        return this.f79945E.mo60286c();
    }

    /* renamed from: u */
    public final void mo55833u() {
        if (aB_() && this.f72104j) {
            if (this.f121964aK != null) {
                BusinessComponentServiceUtils.getBusinessBridgeService().mo49724b();
            }
            if (!this.f72090aL) {
                super.mo55833u();
            }
        }
    }

    /* renamed from: bA */
    private void m65879bA() {
        if (!this.f79987ae.isShowVideoRank() && this.f121964aK != null && !this.f121964aK.isFinishing() && aC_() != null) {
            this.f72096c = C25280a.m61493a().showInputFragment(aC_().getView(), mo62964by(), mo60874g(true), this, this);
        }
    }

    /* renamed from: bF */
    private void m65884bF() {
        Aweme aweme;
        if (mo60519ak() != null) {
            aweme = mo60519ak();
        } else {
            aweme = this.f79945E.mo60285c(this.f79946F);
        }
        if (!(aweme == null || this.f72096c == null)) {
            this.f72096c.mo51234d(C47935p.m103712e(aweme));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public final /* synthetic */ void mo55776E() {
        boolean z;
        if (mo62868bh()) {
            C30016ag aK = mo62836aK();
            if (aK != null) {
                aK.mo53996a(aK.mo53999e());
                AwemeChangeCallBack.m82603a((FragmentActivity) this.f121964aK, aK.mo53999e());
            }
            if (aK == null || aK.mo53997c() != 2) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                mo60507Z();
                mo62841aP();
                if (m71659bp() && aK != null) {
                    aK.mo60246p();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final /* synthetic */ void mo55777F() {
        if (mo62868bh()) {
            C30016ag aK = mo62836aK();
            if (C31186b.m72817e(aK)) {
                aK.mo53996a(aK.mo53999e());
                mo55795b(aK.mo53999e());
                if (m71659bp()) {
                    aK.mo60246p();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final /* synthetic */ void mo55778G() {
        if (mo62868bh()) {
            C30016ag aO = mo62840aO();
            if (aO != null) {
                aO.mo53996a(aO.mo53999e());
                if (aO.mo53997c() != 2) {
                    mo60507Z();
                    mo62841aP();
                }
                if (m71659bp()) {
                    aO.mo60246p();
                }
            }
        }
    }

    /* renamed from: m */
    public void mo55813m() {
        super.mo55813m();
        mo55803d();
        if (C48069o.f120792a) {
            C47981ac.m103815a().mo95143d();
        }
        try {
            if (TextUtils.equals("commerce_general", this.f79987ae.getFrom())) {
                mo62781ar().mo95267D();
            }
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
    }

    /* renamed from: p */
    public final Aweme mo55828p() {
        C30016ag aO = mo62840aO();
        if (aO != null) {
            return aO.mo60289E();
        }
        if (this.f79945E == null || this.f80030y == null) {
            return null;
        }
        return this.f79945E.mo60335d(this.f80030y.getCurrentItem());
    }

    /* renamed from: r */
    public final Aweme mo55830r() {
        C30016ag aO = mo62840aO();
        if (aO != null) {
            return aO.mo53999e();
        }
        if (this.f79945E == null || this.f80030y == null) {
            return null;
        }
        return this.f79945E.mo60285c(this.f80030y.getCurrentItem());
    }

    public final boolean ax_() {
        boolean z;
        if (!C27326a.m65855a(true) || this.f80030y.getCurrentItem() == this.f79945E.getCount() - 1 || (!TextUtils.equals("hot_search_video_board", ay_()) && !TextUtils.equals("discovery_hot_search_video", ay_()))) {
            z = false;
        } else {
            if (this.f80030y != null) {
                this.f80030y.mo54890a((C0997e) new C1000h() {
                    public final void onPageScrolled(int i, float f, int i2) {
                        if (i == C27339a.this.f79946F) {
                            if (C27339a.this.f72100f != null) {
                                C27339a.this.f72100f.mo62801a((float) (-i2));
                            }
                        } else if (C27339a.this.f72100f != null) {
                            C27339a.this.f72100f.mo62801a((float) (C9432q.m18688b(C27339a.this.mo96010bw()) - i2));
                        }
                    }
                });
            }
            z = true;
        }
        if (!z) {
            return false;
        }
        ViewStub viewStub = (ViewStub) this.f72095b.findViewById(R.id.cu8);
        if (this.f72100f == null || viewStub != null) {
            this.f72100f = new C30607ao(this.f80030y, viewStub);
        }
        C30607ao aoVar = this.f72100f;
        aoVar.f79918f = System.currentTimeMillis();
        aoVar.f79916c.postDelayed(aoVar.f79920h, 500);
        return true;
    }

    /* renamed from: i */
    public final void mo55809i() {
        boolean z = true;
        if (!"from_tutorial_detail".equals(mo62871bk()) || C27327d.m65857a().getBoolean("hasShowGuide", false) || C27327d.m65857a().getBoolean("hasSwipeUp", false) || mo60500V() == null || mo60500V().getCount() <= 1) {
            z = false;
        } else {
            C27327d.m65857a().storeBoolean("hasShowGuide", true);
        }
        if (z) {
            mo60515ag();
        }
    }

    /* renamed from: n */
    public final void mo55814n() {
        boolean z;
        if (mo62868bh()) {
            super.mo55814n();
            if (!this.f79945E.f78454e) {
                this.f80029x.mo64051c();
                return;
            }
            boolean z2 = false;
            if ("discovery".equals(ay_()) || this.f79987ae.isHotSpot()) {
                z = true;
            } else {
                z = false;
            }
            if (!z ? this.f79946F == this.f79945E.getCount() - 3 : this.f79946F >= this.f79945E.getCount() - 3) {
                z2 = true;
            }
            if (z2 && this.f72101g != null) {
                this.f72101g.mo55941g();
            }
        }
    }

    /* renamed from: x */
    public final void mo55836x() {
        String str;
        int i;
        super.mo55836x();
        this.f79988af.mo60543h();
        if (this.f72096c != null) {
            this.f72096c.mo51236f();
        }
        if (TextUtils.equals(ay_(), "homepage_familiar")) {
            Aweme ak = mo60519ak();
            if (!(ak == null || ak.getAuthor() == null)) {
                if (TextUtils.isEmpty(ak.getRepostFromGroupId())) {
                    str = "item";
                } else {
                    str = "repost";
                }
                String str2 = str;
                String str3 = (String) C29650b.f77509a.getRecommendReasonMap().get(ak.getAuthorUid());
                Integer num = (Integer) C29650b.f77509a.getAwemeImprIdMap().get(ak.getAid());
                C29650b bVar = C29650b.f77509a;
                String str4 = "impression";
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                bVar.mobFollowCardBind(ak, str4, str3, str2, i);
            }
        }
        m65884bF();
    }

    /* renamed from: z */
    public final void mo55838z() {
        boolean z;
        boolean z2;
        float f;
        Aweme c = this.f79945E.mo60285c(this.f79946F);
        if (c != null) {
            boolean z3 = false;
            if (c.getAwemeType() == 101) {
                z = true;
            } else {
                z = false;
            }
            if (c.getAwemeType() == 4000) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                z3 = true;
            }
            if (z3 || !C47935p.m103712e(c)) {
                float f2 = 1.0f;
                if (this.f72096c != null) {
                    this.f72096c.mo51230b(z3);
                    C25144a aVar = this.f72096c;
                    if (z3) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    aVar.mo51227a(f);
                }
                if (this.f72105k != null) {
                    C27320a aVar2 = this.f72105k;
                    if (z) {
                        f2 = 0.0f;
                    }
                    aVar2.mo55766a(f2);
                }
                if (this.f72097d != null) {
                    this.f72097d.mo63957a(z);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r0.isLive() != false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55812l() {
        /*
            r5 = this;
            super.mo55812l()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 29
            if (r0 != r3) goto L_0x0023
            com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.c r0 = r5.f72097d
            if (r0 == 0) goto L_0x0023
            boolean r0 = r5.mo62963bx()
            if (r0 != 0) goto L_0x0016
            goto L_0x0024
        L_0x0016:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mo55830r()
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.isLive()
            if (r0 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.c r0 = r5.f72097d
            android.view.View r1 = r0.f81490e
            if (r1 == 0) goto L_0x002f
            r1.setVisibility(r2)
        L_0x002f:
            android.view.View r1 = r0.f81490e
            if (r1 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.c$b r2 = new com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.c$b
            r2.<init>(r0)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r3 = 20
            r1.postDelayed(r2, r3)
        L_0x003f:
            boolean r0 = r5.mo62963bx()
            if (r0 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.feed.adapter.b r0 = r5.f79945E
            if (r0 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.feed.adapter.b r0 = r5.f79945E
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x00a3
            com.ss.android.ugc.aweme.video.h r0 = r5.mo62781ar()
            com.ss.android.ugc.aweme.feed.e.o r1 = r5.f79988af
            boolean r0 = r0.mo95287b(r1)
            if (r0 == 0) goto L_0x0065
            boolean r0 = r5.f72104j
            if (r0 == 0) goto L_0x00a3
            r5.mo55833u()
            return
        L_0x0065:
            com.ss.android.ugc.aweme.feed.adapter.ag r0 = r5.mo62836aK()
            boolean r1 = com.p683ss.android.ugc.aweme.video.C48069o.m104087I()
            if (r1 != 0) goto L_0x0079
            com.ss.android.ugc.aweme.video.h r1 = r5.mo62781ar()
            com.ss.android.ugc.aweme.feed.e.o r2 = r5.f79988af
            r1.mo95284a(r2)
            goto L_0x0086
        L_0x0079:
            if (r0 == 0) goto L_0x0086
            com.ss.android.ugc.playerkit.videoview.g r1 = r0.mo60242m()
            if (r1 == 0) goto L_0x0086
            com.ss.android.ugc.aweme.feed.e.o r2 = r5.f79988af
            r1.mo60207a(r2)
        L_0x0086:
            boolean r1 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72817e(r0)
            if (r1 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.feed.adapter.ae r1 = r0.mo54004j()
            boolean r1 = r1.mo60252v()
            if (r1 != 0) goto L_0x009c
            boolean r1 = m71659bp()
            if (r1 == 0) goto L_0x00a3
        L_0x009c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.mo53999e()
            r5.mo55795b(r0)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.detail.p1626h.C27339a.mo55812l():void");
    }

    /* renamed from: k */
    public final void mo55811k() {
        boolean z;
        int i = 0;
        this.f79946F = 0;
        C26875a a = C31213v.m72894a();
        List list = null;
        if (a instanceof C27379l) {
            list = "poi_page".equalsIgnoreCase(ay_()) ? m65887d(((C27379l) a).mo55861a()) : ((C27379l) a).mo55861a();
        } else if ("homepage_fresh".equalsIgnoreCase(ay_())) {
            if (a != null) {
                list = m65886c(a.getItems());
            }
        } else if (a != null) {
            list = a.getItems();
        }
        if (this.f79987ae.isShowVideoRank() && !C9376b.m18558a((Collection<T>) list)) {
            this.f80005aw = true;
        }
        if (a == null || !a.isHasMore()) {
            z = false;
        } else {
            z = true;
        }
        if (!C9376b.m18558a((Collection<T>) list)) {
            list = m65888e(list);
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                Aweme aweme = (Aweme) list.get(i);
                if (aweme == null || !C9431p.m18665a(aweme.getAid(), m65880bB())) {
                    i++;
                } else {
                    this.f79946F = i;
                    if (this.f72099e != null) {
                        this.f72099e.f63663d = this.f79946F;
                    }
                }
            }
            mo55798b(list);
            this.f79945E.f78454e = z;
            this.f80030y.setCurrentItem(this.f79946F);
            m65884bF();
            mo55838z();
        }
        if (z || mo60502X() != -1) {
            this.f80029x.mo64052d();
        } else {
            this.f80029x.mo64051c();
        }
        this.f80030y.postDelayed(new Runnable() {
            public final void run() {
                if (C27339a.this.f72096c != null) {
                    C27339a.this.f72096c.mo51229b();
                }
            }
        }, 150);
        this.f80029x.mo64049a(this.f80030y, this.f79943C);
        this.f80029x.setLoadMoreListener(new C30019aj() {
            public final void aG_() {
                if (C27339a.this.f79945E.f78454e || C27339a.this.f80029x == null) {
                    if (C27339a.this.f72103i != null) {
                        C27339a.this.f72098d_ = true;
                        C27339a.this.f72103i.aG_();
                    }
                    return;
                }
                C27339a.this.f80029x.mo64051c();
            }
        });
        if (this.f79987ae.isShowVideoRank() && !C9376b.m18558a((Collection<T>) list) && list.size() > 1) {
            this.f80030y.setCurrentItem(list.size() * 1000);
        }
    }

    /* renamed from: a */
    public final void mo51776a(int i) {
        this.f72111q = i;
    }

    /* renamed from: d */
    public final void mo55806d(boolean z) {
        this.f72092aN = z;
    }

    @C53771m
    public void onCancelVideoCoverMaskEvent(C30336e eVar) {
        m65884bF();
    }

    /* renamed from: a */
    public final void mo55782a(long j) {
        this.f79988af.f78841j = j;
    }

    /* renamed from: c */
    private List<Aweme> m65886c(List<Aweme> list) {
        if (C30148f.m70756a().fullscreenShowLive()) {
            return m65887d(list);
        }
        return list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo55798b(List<Aweme> list) {
        if (this.f79945E != null) {
            this.f79945E.mo60331a(list);
        }
    }

    /* renamed from: f */
    public final void mo55808f(boolean z) {
        super.mo55808f(z);
        if (z) {
            m65879bA();
        }
    }

    /* renamed from: r */
    private void m65890r(boolean z) {
        if (!(this.f79945E.mo60285c(this.f79946F) == null || this.f72096c == null)) {
            this.f72096c.mo51232c(z);
        }
    }

    /* renamed from: b */
    public final String mo55795b(Aweme aweme) {
        if (!this.f72104j) {
            return "25";
        }
        if (this.f121964aK != null) {
            BusinessComponentServiceUtils.getBusinessBridgeService().mo49724b();
        }
        return super.mo55795b(aweme);
    }

    /* renamed from: b_ */
    public final void mo49943b_(Exception exc) {
        if (mo62868bh()) {
            C22971a.m56494a(this.f121964aK, exc, R.string.c0a);
            DmtStatusView o = mo62895o(false);
            if (o != null) {
                o.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (mo62868bh()) {
            this.f80029x.mo64050b();
            this.f72092aN = false;
            this.f72098d_ = false;
            C22971a.m56493a(C11010c.m22280a(), (Throwable) exc);
        }
    }

    @C53771m
    public void onCommerceDialogEvent(C30326aq aqVar) {
        this.f72094aP = aqVar.f79222a;
        if (aqVar.f79222a) {
            if (this.f72096c != null) {
                this.f72096c.mo51231c();
            }
        } else if (this.f72096c != null) {
            this.f72096c.mo51233d();
        }
    }

    /* renamed from: i */
    private void m65889i(String str) {
        if (str != null && this.f79945E != null && this.f79945E.mo60286c() != null) {
            List c = this.f79945E.mo60286c();
            int i = 0;
            while (i < c.size()) {
                Aweme aweme = (Aweme) c.get(i);
                if (aweme == null || !str.equals(aweme.getAid())) {
                    i++;
                } else {
                    mo50466c_(i);
                    m65885bz();
                    return;
                }
            }
        }
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
        if (mo62868bh()) {
            this.f79984ab.setRefreshing(false);
            if (this.f79945E.getCount() == 0) {
                DmtStatusView o = mo62895o(true);
                if (o != null) {
                    o.setVisibility(0);
                    o.mo19214h();
                }
            } else {
                C22971a.m56494a(C11010c.m22280a(), exc, R.string.c0a);
            }
            this.f72092aN = false;
        }
    }

    /* renamed from: c */
    public final void mo55801c(String str) {
        ((DmtTextView) this.f72095b.findViewById(R.id.e9w)).setText(str);
    }

    /* renamed from: e */
    public final void mo55807e(boolean z) {
        this.f79987ae.setMyProfile(z);
        for (C30181a aVar : this.f79989ag.f78780a) {
            aVar.f78764i = z;
        }
    }

    @C53771m
    public void onCommentEvent(C25064a aVar) {
        if (aVar != null) {
            Aweme aweme = aVar.f66396d;
            if (aweme != null) {
                for (Aweme aweme2 : this.f79945E.mo60286c()) {
                    if (aweme2.getAid().equals(aweme.getAid())) {
                        aweme2.setCommentSetting(aweme.getCommentSetting());
                    }
                }
            }
        }
    }

    @C53771m
    public void onDuetSettingEvent(C43888b bVar) {
        if (bVar != null) {
            Aweme aweme = bVar.f111145a;
            if (aweme != null) {
                for (Aweme aweme2 : this.f79945E.mo60286c()) {
                    if (aweme2.getAid().equals(aweme.getAid())) {
                        aweme2.setDuetSetting(aweme.getDuetSetting());
                        aweme2.setReactSetting(aweme.getReactSetting());
                    }
                }
            }
        }
    }

    @C53771m
    public void onHideCommentInputFragmentEvent(C25719i iVar) {
        Activity activity = this.f121964aK;
        if (activity != null && iVar.f68030b == activity.hashCode()) {
            if (iVar.f68029a) {
                if (this.f72097d != null) {
                    this.f72097d.dismissAllowingStateLoss();
                }
                if (this.f72096c != null) {
                    this.f72096c.mo51237g();
                }
            } else {
                Fragment aC_ = aC_();
                if (aC_ != null && aC_.getUserVisibleHint()) {
                    m65879bA();
                }
            }
        }
    }

    @C53771m
    public void onShowAdLayoutEvent(C25709a aVar) {
        if (this.f79945E.mo60285c(this.f79946F) != null && TextUtils.equals(aVar.f68018b, this.f79945E.mo60285c(this.f79946F).getAid())) {
            if (aVar.f68017a) {
                m65890r(true);
            } else {
                m65890r(false);
            }
        }
    }

    @C53771m
    public void onVideoCleanModeEvent(C31127a aVar) {
        if (this == aVar.f81484c) {
            C30016ag aO = mo62840aO();
            if (aO != null && aVar.f81483b != null && aO.mo53999e() != null && aVar.f81483b.getAid().equals(aO.mo53999e().getAid())) {
                aO.mo60231d(aVar.f81482a);
            }
        }
    }

    /* renamed from: d */
    private static List<Aweme> m65887d(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Aweme aweme : list) {
                if (aweme.isLive()) {
                    StreamUrlModel streamUrlModel = aweme.getStreamUrlModel();
                    if (!(aweme.getRoom() == null || streamUrlModel == null || TextUtils.isEmpty(streamUrlModel.f79733id))) {
                        C48039k.m104036a().f120722b.put(streamUrlModel.f79733id, RoomStruct.fromAweme(aweme));
                    }
                }
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private List<Aweme> m65888e(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        for (Aweme aweme : list) {
            if (!aweme.isPoiRank() && !aweme.isPoiOperate() && !aweme.isPoiRegion()) {
                if (!mo62865be() || !aweme.isLive()) {
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo55796b(int i) {
        if (this.f72097d != null) {
            C31129c cVar = this.f72097d;
            if (i == 0) {
                View view = cVar.f81490e;
                if (view != null) {
                    view.setVisibility(0);
                }
                return;
            }
            View view2 = cVar.f81490e;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final void mo55802c(boolean z) {
        if (this.f72096c != null) {
            this.f72096c.mo51228a(z);
            if (z) {
                mo55832t();
            }
        }
    }

    @C53771m
    public void onAwemeDeleteEvent(C30338g gVar) {
        if (TextUtils.equals(ay_(), gVar.f79249b)) {
            Aweme aweme = gVar.f79248a;
            if (aweme != null && this.f79958R != null && this.f79958R.mo55934a(aweme)) {
                mo62829aD();
                this.f79945E.notifyDataSetChanged();
                if (this.f79945E.getCount() == 3) {
                    C47718bf.m103288a(new C30350s("from_full_recommend"));
                }
                this.f80030y.post(new C27360f(this));
                mo55836x();
            }
        }
    }

    @C53771m
    public void onCommentDialogEvent(C30337f fVar) {
        boolean z;
        boolean z2;
        Activity activity = this.f121964aK;
        if (activity != null && !activity.isFinishing() && fVar.f79247d == activity.hashCode()) {
            boolean z3 = false;
            if (fVar.f79244a == 1) {
                z = true;
            } else {
                z = false;
            }
            mo62891k(z);
            if (fVar.f79244a == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mo62887h(z2);
            if (fVar.f79244a == 1) {
                z3 = true;
            }
            mo62888i(z3);
            if (fVar.f79244a == 1) {
                if (this.f72097d != null) {
                    this.f72097d.dismissAllowingStateLoss();
                }
                if (this.f72096c != null) {
                    this.f72096c.mo51237g();
                }
            } else {
                Fragment aC_ = aC_();
                if (aC_ != null && aC_.getUserVisibleHint()) {
                    m65879bA();
                }
            }
        }
    }

    @C53771m
    public void onDislikeAwemeEvent(C30340i iVar) {
        int i;
        if (iVar.f79254e == this.f121964aK.hashCode()) {
            mo62823a(iVar.f79250a, iVar.mo60717a());
            if (this.f72099e != null) {
                C23982a aVar = this.f72099e;
                boolean z = iVar.f79250a;
                if (aVar.f63664e != null) {
                    BrowseRecordWidget browseRecordWidget = aVar.f63664e;
                    if (browseRecordWidget == null) {
                        C52711k.m112237a("mBrowseRecordWidget");
                    }
                    if (browseRecordWidget.f63657a != null) {
                        C24032i iVar2 = browseRecordWidget.f63657a;
                        if (iVar2 == null) {
                            C52711k.m112237a("mView");
                        }
                        View view = iVar2.f63775a;
                        if (view == null) {
                            C52711k.m112237a("mRootLayout");
                        }
                        if (z) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        view.setVisibility(i);
                    }
                }
            }
        }
    }

    @C53771m
    public void onFamiliarScrollToProfileEvent(C29633a aVar) {
        String str;
        int i;
        Aweme ak = mo60519ak();
        if (ak != null && ak.getAuthor() != null) {
            if (TextUtils.isEmpty(ak.getRepostFromGroupId())) {
                str = "item";
            } else {
                str = "repost";
            }
            String str2 = str;
            String str3 = (String) C29650b.f77509a.getRecommendReasonMap().get(ak.getAuthorUid());
            Integer num = (Integer) C29650b.f77509a.getAwemeImprIdMap().get(ak.getAid());
            C29650b bVar = C29650b.f77509a;
            String str4 = "enter_profile";
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            bVar.mobFollowCardBind(ak, str4, str3, str2, i);
        }
    }

    /* renamed from: b */
    public void mo47025b(Exception exc) {
        if (this.f72096c != null) {
            this.f72096c.mo51231c();
        }
        C22971a.m56493a(C11010c.m22280a(), (Throwable) exc);
        if (this.f79987ae.isShowVideoRank()) {
            DmtStatusView o = mo62895o(true);
            if (o != null) {
                o.setVisibility(0);
                o.mo19214h();
            }
        }
    }

    /* renamed from: d */
    public final void mo55804d(Exception exc) {
        boolean z;
        if (mo62868bh()) {
            if (exc instanceof C23459a) {
                C23459a aVar = (C23459a) exc;
                if (aVar.getErrorCode() == 2130) {
                    C22971a.m56494a(this.f121964aK, exc, R.string.fb4);
                    return;
                }
                if (aVar.getErrorCode() == 2752) {
                    if (mo60519ak() == null || mo60519ak().getCommerceVideoAuthInfo() == null || mo60519ak().getCommerceVideoAuthInfo().getAuthStatus() != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        C22971a.m56492a(mo96010bw(), exc, R.string.c4h, R.string.c4g);
                    }
                    C23196ad.m56841a("promote_layer_show").mo47957b("enter_from", ay_()).mo47957b(C42311c.f106865i, "delete_fail").mo47957b("group_id", m65880bB()).mo48076e();
                }
                return;
            }
            C22971a.m56494a(this.f121964aK, exc, R.string.aod);
        }
    }

    @C53771m
    public void onDislikeUserEvent(C30341j jVar) {
        String str;
        int i;
        if (jVar != null && jVar.f79256a != null) {
            if (TextUtils.equals(ay_(), "homepage_familiar")) {
                Aweme ak = mo60519ak();
                if (!(ak == null || ak.getAuthor() == null)) {
                    if (TextUtils.isEmpty(ak.getRepostFromGroupId())) {
                        str = "item";
                    } else {
                        str = "repost";
                    }
                    String str2 = str;
                    String str3 = (String) C29650b.f77509a.getRecommendReasonMap().get(ak.getAuthorUid());
                    Integer num = (Integer) C29650b.f77509a.getAwemeImprIdMap().get(ak.getAid());
                    C29650b bVar = C29650b.f77509a;
                    String str4 = "delete";
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    bVar.mobFollowCardBind(ak, str4, str3, str2, i);
                }
            }
            String uid = jVar.f79256a.getUid();
            if (mo62868bh() && !C9376b.m18558a((Collection<T>) this.f79945E.mo60286c())) {
                if (C31186b.m72817e(mo62836aK())) {
                    mo62843aR();
                }
                if (this.f79945E.mo60333a(uid)) {
                    mo62833aH();
                    mo62848aW();
                    if (this.f79945E.getCount() == 0) {
                        mo55800c();
                    } else {
                        this.f80030y.post(new C27356b(this));
                    }
                    mo62878d(this.f80030y.getCurrentItem());
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo55797b(String str) {
        ViewStub viewStub = (ViewStub) this.f72095b.findViewById(R.id.e9x);
        if (viewStub != null) {
            viewStub.inflate();
            mo55801c(str);
        }
    }

    /* renamed from: d */
    public final void mo55805d(String str) {
        if (mo62868bh()) {
            if (mo62868bh()) {
                if (C31186b.m72817e(mo62836aK())) {
                    mo62843aR();
                }
                if (this.f79958R == null || !this.f79958R.mo55935a(str)) {
                    StringBuilder sb = new StringBuilder("mDeleteItemListener.deleteItem ");
                    sb.append(str);
                    sb.append(" failed");
                    C32458a.m75141a(6, "DeleteAweme", sb.toString());
                    m65889i(str);
                } else {
                    m65885bz();
                }
            }
            super.mo55805d(str);
        }
    }

    /* renamed from: a */
    public final void mo55787a(C30332aw awVar) {
        String str;
        int i;
        int i2;
        C50158g gVar;
        C30332aw awVar2 = awVar;
        switch (awVar2.f79228a) {
            case 8:
                if (mo62868bh()) {
                    this.f80030y.setCanTouch(false);
                    this.f79943C.setCanTouch(false);
                    C30016ag aK = mo62836aK();
                    if (aK != null) {
                        C25880al r = aK.mo60248r();
                        if (r != null) {
                            r.mo53056a(false);
                        }
                        aK.mo60231d(true);
                    }
                    C30016ag j = mo62890j(this.f79949I);
                    if (j != null) {
                        C25880al r2 = j.mo60248r();
                        if (r2 != null) {
                            C0654k by = mo62964by();
                            if (aK == null) {
                                gVar = null;
                            } else {
                                gVar = aK.mo60242m();
                            }
                            r2.mo53047a(by, false, gVar);
                            r2.mo53078l();
                            break;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 9:
                if (mo60518aj() == null || !mo60518aj().mo60181F()) {
                    this.f80030y.setCanTouch(true);
                    this.f79943C.setCanTouch(true);
                    C30016ag aK2 = mo62836aK();
                    if (aK2 != null) {
                        if (!this.f72094aP) {
                            aK2.mo60231d(false);
                            break;
                        } else {
                            aK2.mo60231d(true);
                            break;
                        }
                    }
                }
                break;
            case 10:
                Activity activity = this.f121964aK;
                if (activity != null) {
                    activity.onBackPressed();
                    break;
                }
                break;
            case 11:
                if (C27361g.m65961a(mo96010bw())) {
                    C30016ag aO = mo62840aO();
                    if (!(aO == null || aO.mo53999e() == null)) {
                        if (!ay_().equals("opus")) {
                            C26890h.m65005a(mo96010bw(), "comment", ay_(), m65880bB(), 0);
                        } else if (this.f79987ae.isMyProfile()) {
                            C26890h.m65005a(mo96010bw(), "comment", "personal_homepage", m65880bB(), 0);
                        } else {
                            C26890h.m65005a(mo96010bw(), "comment", "others_homepage", m65880bB(), 0);
                        }
                        mo55786a(aO, mo60874g(true));
                        break;
                    }
                } else {
                    C10691a.m21542b((Context) this.f121964aK, (int) R.string.cg1).mo19066a();
                    return;
                }
            default:
                super.mo60714a(awVar);
                break;
        }
        int i3 = awVar2.f79228a;
        if (TextUtils.equals(ay_(), "homepage_familiar")) {
            Aweme ak = mo60519ak();
            if (!(ak == null || ak.getAuthor() == null)) {
                if (TextUtils.isEmpty(ak.getRepostFromGroupId())) {
                    str = "item";
                } else {
                    str = "repost";
                }
                String str2 = str;
                String str3 = (String) C29650b.f77509a.getRecommendReasonMap().get(ak.getAuthorUid());
                Integer num = (Integer) C29650b.f77509a.getAwemeImprIdMap().get(ak.getAid());
                if (i3 != 12) {
                    switch (i3) {
                        case 18:
                        case 19:
                            C29650b bVar = C29650b.f77509a;
                            String str4 = "enter_profile";
                            if (num != null) {
                                i2 = num.intValue();
                            } else {
                                i2 = 0;
                            }
                            bVar.mobFollowCardBind(ak, str4, str3, str2, i2);
                            return;
                    }
                } else {
                    C29650b bVar2 = C29650b.f77509a;
                    String str5 = "follow";
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    bVar2.mobFollowCardBind(ak, str5, str3, str2, i);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo55799b(boolean z) {
        this.f72113s = z;
        this.f79988af.f78847p = z;
    }

    /* renamed from: b */
    private int m65878b(List<Aweme> list, int i) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return -1;
        }
        List d = this.f79945E.mo60336d();
        if (C9376b.m18558a((Collection<T>) d)) {
            return -1;
        }
        Aweme aweme = (Aweme) d.get(this.f79946F);
        if (aweme == null) {
            return -1;
        }
        int indexOf = list.indexOf(aweme) - i;
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo55785a(C25165a aVar, Aweme aweme) {
        C25283b.f66879a.disposeCommentDialogParams(aVar, this.f80007ay, aweme);
        if (this.f72099e != null) {
            C23982a aVar2 = this.f72099e;
            C52711k.m112240b(aVar, "builder");
            if (aVar2.f63664e != null) {
                BrowseRecordWidget browseRecordWidget = aVar2.f63664e;
                if (browseRecordWidget == null) {
                    C52711k.m112237a("mBrowseRecordWidget");
                }
                C52711k.m112240b(aVar, "builder");
                C24032i iVar = browseRecordWidget.f63657a;
                if (iVar == null) {
                    C52711k.m112237a("mView");
                }
                C52711k.m112240b(aVar, "builder");
                Aweme aweme2 = iVar.f81192l;
                if (aweme2 != null) {
                    String aid = aweme2.getAid();
                    if (aid != null) {
                        aVar.mo51342e(true).mo51335b(iVar.f63780f.mo49791a(aid));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo55780a(int i, float f) {
        boolean z;
        Aweme aweme;
        float f2;
        float f3;
        if (f != 0.0f && this.f79945E.getCount() > this.f79946F + 1) {
            if (this.f79946F == i) {
                z = true;
            } else {
                z = false;
            }
            Aweme c = this.f79945E.mo60285c(this.f79946F);
            if (z) {
                aweme = this.f79945E.mo60285c(this.f79946F + 1);
            } else {
                aweme = this.f79945E.mo60285c(i);
            }
            if (c.getAwemeType() != aweme.getAwemeType() && (c.getAwemeType() == 101 || aweme.getAwemeType() == 101)) {
                if (c.getAwemeType() == 101) {
                    if (z) {
                        f3 = Math.max(f - 0.5f, 0.0f);
                    } else {
                        f3 = Math.max(0.5f - f, 0.0f);
                    }
                    if (this.f72105k != null) {
                        this.f72105k.mo55766a(f3 * 2.0f);
                    }
                    if (this.f72096c != null) {
                        this.f72096c.mo51227a(f3 * 2.0f);
                    }
                } else if (aweme.getAwemeType() == 101) {
                    if (z) {
                        f2 = Math.max(0.5f - f, 0.0f);
                    } else {
                        f2 = Math.max(f - 0.5f, 0.0f);
                    }
                    if (this.f72105k != null) {
                        this.f72105k.mo55766a(f2 * 2.0f);
                    }
                    if (this.f72096c != null) {
                        this.f72096c.mo51227a(f2 * 2.0f);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo47029c(List list, boolean z) {
        boolean z2;
        final int i;
        if (mo62868bh()) {
            this.f79984ab.setRefreshing(false);
            this.f79945E.f78455f = z;
            String from = this.f79987ae.getFrom();
            if (z || this.f72092aN || TextUtils.equals("from_mix_detail", from)) {
                if (!this.f72092aN || C9376b.m18558a((Collection<T>) list) || this.f79945E.getCount() == list.size()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f79963W = z2;
                if (TextUtils.equals("from_rn_search", from) || TextUtils.equals("from_visual_search_result", from)) {
                    i = m65878b(list, 0);
                } else if (TextUtils.equals("from_chat", from)) {
                    i = m65878b(list, 1);
                } else if (TextUtils.equals("from_following_sky_light", from)) {
                    i = m65878b(list, 1);
                } else if (TextUtils.equals("from_mix_detail", from)) {
                    i = m65878b(list, 1);
                } else {
                    i = -1;
                }
                mo55798b(list);
                if (!this.f72092aN) {
                    this.f80030y.post(new Runnable() {
                        public final void run() {
                            if (C27339a.this.f80030y != null) {
                                C27339a.this.f79948H = true;
                                if (i > 0) {
                                    C27339a.this.f79946F = i;
                                    C27339a.this.f80030y.setCurrentItemWithDefaultVelocity(C27339a.this.f79946F);
                                    return;
                                }
                                C27339a.this.f79946F = 0;
                                C27339a.this.f80030y.mo55004a(C27339a.this.f79946F, false);
                            }
                        }
                    });
                }
            } else if (mo62963bx()) {
                C10691a.m21548c((Context) this.f121964aK, (int) R.string.an1).mo19066a();
                if (this.f80030y.getCurrentItem() > 1) {
                    this.f80030y.mo55004a(0, false);
                } else {
                    this.f80030y.setCurrentItemWithDefaultVelocity(0);
                }
            }
            this.f72092aN = false;
            mo58360K();
        }
    }

    /* renamed from: a */
    public void mo55784a(View view, Bundle bundle) {
        super.mo55784a(view, bundle);
        this.f72095b = view.findViewById(R.id.cfg);
        this.f72091aM = view.findViewById(R.id.c1k);
        if (!C27361g.m65961a(mo96010bw())) {
            C10691a.m21542b((Context) this.f121964aK, (int) R.string.cg1).mo19066a();
        } else {
            if (!this.f79987ae.isShowVideoRank()) {
                mo62895o(true).setBuilder(C10719a.m21676a((Context) this.f121964aK).mo19230b((int) R.string.f5o).mo19224a((int) R.string.bx4));
            }
            this.f72095b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C27339a.this.mo55835w();
                }
            });
            m65879bA();
            this.f79984ab = this.f79943C;
            if (C27326a.m65855a(true)) {
                this.f80030y.mo54890a((C0997e) new C1000h() {

                    /* renamed from: a */
                    int f72133a = -2;

                    public final void onPageSelected(int i) {
                        if (Math.abs(this.f72133a - i) == 1 && this.f72133a < i && C30289j.m71208b(true)) {
                            C30289j.m71209c(false);
                            C27339a.this.mo55803d();
                        }
                        if ((Math.abs(this.f72133a - i) == 1 && C30289j.m71208b(true)) || (C27339a.this.f72100f != null && C27339a.this.f72100f.mo62802b())) {
                            C27326a.m65856b(false);
                            C27339a.this.mo55803d();
                        }
                        this.f72133a = i;
                    }

                    public final void onPageScrolled(int i, float f, int i2) {
                        if (i == C27339a.this.f79946F) {
                            if (C27339a.this.f72100f != null) {
                                C27339a.this.f72100f.mo62801a((float) (-i2));
                            }
                        } else if (C27339a.this.f72100f != null) {
                            C27339a.this.f72100f.mo62801a((float) (C9432q.m18688b(C27339a.this.mo96010bw()) - i2));
                        }
                    }
                });
            }
            this.f80030y.mo54890a((C0997e) new C1000h() {
                public final void onPageScrollStateChanged(int i) {
                    if (i == 0) {
                        C27339a.this.mo55838z();
                    }
                }

                public final void onPageSelected(int i) {
                    boolean z;
                    C43893g gVar = new C43893g(10);
                    gVar.f111164e = 2;
                    C47718bf.m103288a(gVar);
                    boolean z2 = false;
                    if (!C27339a.this.f79990ah) {
                        CharSequence from = C27339a.this.f79987ae.getFrom();
                        if (TextUtils.equals(from, "from_follow_page") || TextUtils.equals(from, "from_familiar_tab") || TextUtils.equals(from, "from_nearby") || TextUtils.equals("poi_grid", from) || TextUtils.equals("poi_rate_list", from) || TextUtils.equals("poi_map", from) || TextUtils.equals("from_search_live", from)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            C27332a.f72080a.mo55770a(C27339a.this.mo55828p(), C27339a.this.f79987ae.getFrom(), C27339a.this.f79987ae.getVideoType(), C27339a.this.f79987ae.getEventType(), C27339a.this.mo55837y(), true, -1);
                        }
                    }
                    if (C27339a.this.f72099e != null) {
                        C23982a aVar = C27339a.this.f72099e;
                        if (aVar.f63664e != null) {
                            BrowseRecordWidget browseRecordWidget = aVar.f63664e;
                            if (browseRecordWidget == null) {
                                C52711k.m112237a("mBrowseRecordWidget");
                            }
                            if (browseRecordWidget.f63657a != null) {
                                C24032i iVar = browseRecordWidget.f63657a;
                                if (iVar == null) {
                                    C52711k.m112237a("mView");
                                }
                                iVar.f63784j = i;
                            }
                        }
                    }
                    if (C27339a.this.f79987ae.isfollowSkyLight().booleanValue()) {
                        Aweme ak = C27339a.this.mo60519ak();
                        if (ak == null) {
                            ak = ((C30056b) C27339a.this.mo62782av().getAdapter()).mo60285c(i);
                        }
                        if (ak != null) {
                            User author = ak.getAuthor();
                            if (author.getUniqueId() == null) {
                                C27339a.this.mo55801c("");
                            } else {
                                C27339a.this.mo55801c(author.getUniqueId());
                            }
                            C27339a.this.f79945E.f78455f = C27339a.this.f79987ae.isHasLatestFollowingUser();
                            String uid = author.getUid();
                            String aid = ak.getAid();
                            C27339a.this.f72109o = TextUtils.equals((CharSequence) C30386j.m71306a().get(uid), aid);
                            C27339a.this.f72110p = TextUtils.equals((CharSequence) C30386j.m71307b().get(uid), aid);
                            if (!C27339a.this.f72107m.contains(uid)) {
                                C27339a.this.f72107m.add(uid);
                                List uidList = C27339a.this.f79987ae.getUidList();
                                List blueDotList = C27339a.this.f79987ae.getBlueDotList();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= uidList.size()) {
                                        break;
                                    } else if (((String) uidList.get(i2)).equalsIgnoreCase(uid)) {
                                        z2 = ((String) blueDotList.get(i2)).equalsIgnoreCase("true");
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                if (z2) {
                                    C47718bf.m103288a(new C31864a(uid));
                                }
                            }
                            C27339a.this.f72106l.add(aid);
                        }
                    }
                }

                public final void onPageScrolled(int i, float f, int i2) {
                    boolean z;
                    C27339a.this.mo55780a(i, f);
                    if (C27339a.this.f72097d != null) {
                        C27339a.this.f72097d.mo63956a(i, f, i2);
                    }
                    if (C27339a.this.f72099e != null) {
                        C23982a aVar = C27339a.this.f72099e;
                        if (aVar.f63664e != null) {
                            BrowseRecordWidget browseRecordWidget = aVar.f63664e;
                            if (browseRecordWidget == null) {
                                C52711k.m112237a("mBrowseRecordWidget");
                            }
                            if (browseRecordWidget.f63657a != null) {
                                C24032i iVar = browseRecordWidget.f63657a;
                                if (iVar == null) {
                                    C52711k.m112237a("mView");
                                }
                                if (iVar.f63781g != 3 && iVar.f63784j != -1) {
                                    ViewPropertyAnimator viewPropertyAnimator = iVar.f63783i;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                    }
                                    ViewPropertyAnimator viewPropertyAnimator2 = iVar.f63782h;
                                    if (viewPropertyAnimator2 != null) {
                                        viewPropertyAnimator2.cancel();
                                    }
                                    if (iVar.f63784j == i) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        View view = iVar.f63776b;
                                        if (view == null) {
                                            C52711k.m112237a("mContentLayout");
                                        }
                                        view.setAlpha(C52753d.m112314a((0.5f - f) / 0.5f, 0.0f));
                                        return;
                                    }
                                    View view2 = iVar.f63776b;
                                    if (view2 == null) {
                                        C52711k.m112237a("mContentLayout");
                                    }
                                    view2.setAlpha(C52753d.m112314a((f - 0.5f) / 0.5f, 0.0f));
                                }
                            }
                        }
                    }
                }
            });
        }
        this.f80030y.mo54890a((C0997e) new C0997e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (C27339a.this.f72096c != null) {
                    C27339a.this.f72096c.mo51226a();
                }
                if (C27339a.this.f79945E != null) {
                    C23212ar c = new C23212ar().mo47997a(C27339a.this.f79987ae.getEventType()).mo47999c(C27339a.this.f79945E.mo60285c(i), C27339a.this.mo60502X());
                    c.f61789a = C27339a.this.f79987ae.getTabName();
                    c.mo48002e("full").mo48076e();
                }
            }
        });
        C36670n a = C36484a.m82417a((FragmentActivity) this.f121964aK);
        if (a != null) {
            a.mo75732a((C0997e) new C0997e() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageSelected(int i) {
                    if (i == 0) {
                        AwemeChangeCallBack.m82603a((FragmentActivity) C27339a.this.f121964aK, C27339a.this.f79945E.mo60285c(C27339a.this.f80030y.getCurrentItem()));
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55786a(C30016ag agVar, String str) {
        new C23200ag().mo47960a(str).mo47962b(str).mo47954f(agVar.mo53999e()).mo47967e(String.valueOf(this.f72111q)).mo48076e();
    }

    /* renamed from: b */
    public final void mo47026b(List list, boolean z) {
        if (mo62868bh() && !C9376b.m18558a((Collection<T>) list)) {
            DmtStatusView a = this.f80029x.mo64047a(false);
            if (a != null) {
                boolean e = a.mo19211e();
            }
            if (!z) {
                this.f80029x.mo64051c();
            } else {
                this.f80029x.mo64052d();
            }
            if (list.get(0) instanceof FollowFeed) {
                list = C41488a.f105155a.getAwemes(list);
            } else if ("homepage_fresh".equalsIgnoreCase(ay_())) {
                list = m65886c(list);
            } else if (list.get(0) instanceof SearchAggregateCommodity) {
                if (this.f80007ay instanceof C27379l) {
                    list = ((C27379l) this.f80007ay).mo55861a();
                } else {
                    list = new ArrayList();
                }
            }
            List e2 = m65888e(list);
            this.f79945E.f78454e = z;
            mo55798b(e2);
            final int a2 = C31190f.m72829a(e2, this.f79945E.mo60285c(this.f80030y.getCurrentItem()));
            if (!this.f72092aN && this.f72098d_) {
                this.f80030y.post(new Runnable() {
                    public final void run() {
                        if (a2 < C27339a.this.f79945E.getCount() - 1 && C27339a.this.f80030y != null) {
                            C27339a.this.f79946F = a2 + 1;
                            C27339a.this.f79948H = true;
                            C27339a.this.f80030y.setCurrentItemWithDefaultVelocity(C27339a.this.f79946F);
                        }
                    }
                });
            }
            this.f72092aN = false;
            this.f72098d_ = false;
            mo58360K();
        }
    }

    /* renamed from: a */
    public final void mo55781a(int i, float f, int i2) {
        if (this.f72097d != null) {
            this.f72097d.mo63956a(i, f, i2);
        }
    }

    /* renamed from: a */
    public final void mo55783a(MotionEvent motionEvent, C30016ag agVar, Aweme aweme) {
        if (!this.f79987ae.isVideoFromDcd()) {
            super.mo55783a(motionEvent, agVar, aweme);
        }
    }

    /* renamed from: a */
    public C30056b mo55779a(Context context, LayoutInflater layoutInflater, C30313ae<C30332aw> aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar) {
        if (C27333f.m65866b(mo62871bk())) {
            C30121v vVar = new C30121v(context, layoutInflater, aeVar, fragment, onTouchListener, baseFeedPageParams, mVar);
            return vVar;
        }
        C27330e eVar = new C27330e(context, layoutInflater, aeVar, fragment, onTouchListener, baseFeedPageParams, mVar);
        return eVar;
    }
}
