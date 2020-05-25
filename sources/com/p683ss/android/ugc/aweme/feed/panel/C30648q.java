package com.p683ss.android.ugc.aweme.feed.panel;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p030v4.view.ViewPager.C1000h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.PopupWindow;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.C27978o;
import com.p683ss.android.ugc.aweme.app.C23045ba;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25880al;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c;
import com.p683ss.android.ugc.aweme.commercialize.settings.AdGapInteractiveDuration;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26880f;
import com.p683ss.android.ugc.aweme.common.widget.BaseCustomViewPager;
import com.p683ss.android.ugc.aweme.experiment.C29509j;
import com.p683ss.android.ugc.aweme.experiment.DownloadMaskExperiment;
import com.p683ss.android.ugc.aweme.experiment.FeedRefreshViewModel;
import com.p683ss.android.ugc.aweme.experiment.FeedRefreshViewModel.C29491a;
import com.p683ss.android.ugc.aweme.experiment.LiveStatusRefreshExperiment;
import com.p683ss.android.ugc.aweme.experiment.SharePanelGuideConditionExperiment;
import com.p683ss.android.ugc.aweme.feed.C30130ag;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.feed.C31257z;
import com.p683ss.android.ugc.aweme.feed.adapter.C30013ad;
import com.p683ss.android.ugc.aweme.feed.adapter.C30015af;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.adapter.C30019aj;
import com.p683ss.android.ugc.aweme.feed.adapter.C30056b;
import com.p683ss.android.ugc.aweme.feed.adapter.C30126z;
import com.p683ss.android.ugc.aweme.feed.api.C30148f;
import com.p683ss.android.ugc.aweme.feed.experiment.C30223c;
import com.p683ss.android.ugc.aweme.feed.experiment.C30227g;
import com.p683ss.android.ugc.aweme.feed.experiment.EnableFeedLiveRefresh;
import com.p683ss.android.ugc.aweme.feed.guide.C30286i;
import com.p683ss.android.ugc.aweme.feed.interest.viewmodel.InterestViewModel.C30432a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1720f.C30230b;
import com.p683ss.android.ugc.aweme.feed.p1720f.C30230b.C30234c;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30315ag;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30324ao;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30327ar;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30331av;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30334c;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30337f;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30338g;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30343l;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30348q;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30350s;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30356x;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30450g;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30450g.C30451a;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.p1736ui.AbstractUnReadSunRoofTouchEventFrameLayout;
import com.p683ss.android.ugc.aweme.feed.p1736ui.AbstractUnReadSunRoofView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30741a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30780ax;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30781ay;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30786ba;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31121a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31123b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.p1738a.C31122a;
import com.p683ss.android.ugc.aweme.feed.unread.UnReadFeedViewModel;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.utils.C31203o;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31865b;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31866c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.journey.C35781s;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.main.C36603dv;
import com.p683ss.android.ugc.aweme.main.C36663h;
import com.p683ss.android.ugc.aweme.main.C36664i;
import com.p683ss.android.ugc.aweme.main.TabChangeManager;
import com.p683ss.android.ugc.aweme.main.dialogmanager.C36590b;
import com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;
import com.p683ss.android.ugc.aweme.main.guide.C36660e;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C36674a;
import com.p683ss.android.ugc.aweme.newfollow.util.C37934d;
import com.p683ss.android.ugc.aweme.p1462bq.C23957c.C23958a;
import com.p683ss.android.ugc.aweme.p1462bq.C23962d;
import com.p683ss.android.ugc.aweme.p1462bq.C23962d.C23963a;
import com.p683ss.android.ugc.aweme.p1493cb.C24516b;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47445a;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47450c;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47461g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.push.C40886c;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41598d;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.p683ss.android.ugc.aweme.shortvideo.C42423an;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.unread.C47496d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47725bm;
import com.p683ss.android.ugc.aweme.utils.C47729bp;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.video.C48039k;
import com.p683ss.android.ugc.aweme.video.C48069o;
import com.p683ss.android.ugc.aweme.video.experiment.PreloadProcessDataExperiment;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.q */
public class C30648q extends C30616b implements C26877c<Aweme>, C30450g, C30504w, C30780ax {

    /* renamed from: d */
    public static boolean f80089d;

    /* renamed from: a */
    private ViewGroup f80090a;

    /* renamed from: aL */
    private C36660e f80091aL;

    /* renamed from: aM */
    private AbstractUnReadSunRoofView f80092aM;

    /* renamed from: aN */
    private boolean f80093aN;

    /* renamed from: aO */
    private PopupWindow f80094aO;

    /* renamed from: aP */
    private C47461g f80095aP;

    /* renamed from: aQ */
    private C30781ay f80096aQ;

    /* renamed from: aR */
    private boolean f80097aR = false;

    /* renamed from: aS */
    private boolean f80098aS = true;

    /* renamed from: aT */
    private final List<C0794k<Aweme, Integer>> f80099aT = new ArrayList();

    /* renamed from: aU */
    private boolean f80100aU = false;

    /* renamed from: aV */
    private boolean f80101aV = false;

    /* renamed from: aW */
    private int f80102aW = 0;

    /* renamed from: aX */
    private boolean f80103aX = false;

    /* renamed from: b */
    private ViewStub f80104b;

    /* renamed from: c */
    private ViewStub f80105c;

    /* renamed from: e */
    public C30607ao f80106e;

    /* renamed from: f */
    public int f80107f;

    /* renamed from: g */
    public boolean f80108g = true;

    /* renamed from: h */
    C30786ba f80109h;

    /* renamed from: i */
    AbstractUnReadSunRoofTouchEventFrameLayout f80110i;

    /* renamed from: j */
    public int f80111j = -1;

    /* renamed from: k */
    public int f80112k;

    /* renamed from: l */
    DataSetObserver f80113l = new DataSetObserver() {
        public final void onChanged() {
            C30648q.this.f80107f++;
            C23794bh.m58408v();
            C30648q.this.mo55829q();
        }
    };

    /* renamed from: m */
    public int f80114m = 0;

    /* renamed from: n */
    public int f80115n = 0;

    /* renamed from: o */
    int f80116o = -1;

    /* renamed from: p */
    String f80117p = null;

    /* renamed from: q */
    int f80118q = 0;

    /* renamed from: r */
    boolean f80119r = false;

    /* renamed from: s */
    private C30741a f80120s;

    /* renamed from: t */
    private boolean f80121t;

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final ViewGroup mo55773B() {
        return this.f80090a;
    }

    public final boolean ax_() {
        return false;
    }

    @C53771m(mo112976b = true)
    public void onSettingSyncDone(C41598d dVar) {
    }

    /* renamed from: v */
    public final boolean mo55834v() {
        return false;
    }

    /* renamed from: a */
    public final void mo62966a(C30019aj ajVar) {
        if (this.f80029x != null) {
            this.f80029x.setLoadMoreListener(ajVar);
        }
    }

    /* renamed from: a */
    public void mo47018a(List<Aweme> list, boolean z) {
        boolean z2;
        if (mo62868bh()) {
            boolean z3 = false;
            this.f80111j = 0;
            if (this.f79994al) {
                Context bw = mo96010bw();
                if (bw != null) {
                    try {
                        C25280a.m61493a().hideCommentListImmediately(bw);
                    } catch (Throwable th) {
                        C32458a.m75148a(th);
                    }
                }
            }
            this.f80114m = 0;
            m71875bA();
            this.f80001as = true;
            DmtStatusView o = mo62895o(false);
            if (o != null) {
                o.setVisibility(8);
            }
            if (this.f79945E == null || this.f79945E.getCount() != 1 || (!C26503d.m64070m(this.f79945E.mo60285c(0)) && !C26235d.m63570a(this.f79945E.mo60285c(0)))) {
                z2 = false;
            } else {
                list.add(0, this.f79945E.mo60285c(0));
                this.f80029x.mo64052d();
                z2 = true;
            }
            this.f79984ab.setRefreshing(false);
            if (!(this.f79945E == null || this.f80030y == null || z2)) {
                C25945k.m62917h().mo52103b(this.f79945E.mo60285c(this.f80030y.getCurrentItem()));
            }
            if (!this.f80097aR) {
                if (C9414h.m18630a(list)) {
                    mo55828p();
                } else {
                    this.f80097aR = true;
                    if (o != null) {
                        o.mo19209d();
                    }
                }
            } else if (o != null) {
                o.mo19209d();
            }
            C30016ag aj = mo60518aj();
            if (aj != null && !z2) {
                aj.mo54003i();
            }
            this.f79988af.mo60541f((String) null);
            if (!this.f79990ah && this.f79946F == 0 && !z2) {
                this.f79990ah = true;
            }
            this.f79945E.f78454e = z;
            this.f79945E.mo60331a(list);
            if (this.f80098aS && mo62835aJ() && C29509j.f77296a.mo59620a()) {
                this.f80098aS = false;
                C30148f.m70757a(m71877bC()).mo63498a(true, (C52682m<? super Boolean, ? super List<? extends User>, C52860x>) new C30593aa<Object,Object,C52860x>(this, list));
            }
            if (!this.f80098aS && mo62835aJ() && this.f79975aH && this.f80004av && !this.f80006ax && !this.f80100aU && mo62963bx() && C29509j.f77296a.mo59620a()) {
                C30148f.m70757a(m71877bC()).mo63497a(false);
            }
            if (mo62963bx()) {
                mo62874bn();
            }
            C30286i a = C30286i.m71202a();
            if (!C9376b.m18558a((Collection<T>) list) && list.size() >= 3 && !a.f79121a.getBoolean("sp_cached_first_three_video", false)) {
                for (Aweme aid : list.subList(0, 3)) {
                    a.mo60689b(aid.getAid());
                }
                a.f79121a.edit().putBoolean("sp_cached_first_three_video", true).apply();
            }
            if (!(this.f80030y == null || this.f79946F == 0)) {
                this.f79946F = 0;
                this.f80030y.mo55004a(0, false);
            }
            mo62822a("", true);
            C47718bf.m103288a(new C30343l());
            m71868E();
            mo62834aI();
            if (!z2) {
                C23794bh.m58408v().mo49243b(mo96010bw());
            }
            C47718bf.m103288a(new C36590b());
            if (C10181b.m20511a().mo18172a(PreloadProcessDataExperiment.class, true, "is_preload_process_data", 31744, false)) {
                mo62781ar().mo95285a(list);
            }
            this.f80001as = false;
            if (this.f80116o == 0) {
                this.f79977aJ.mo94751e();
            } else {
                boolean z4 = this.f80116o == 1;
                if (this.f80116o == 2) {
                    z3 = true;
                }
                if (z4 || z3) {
                    this.f79977aJ.mo94751e();
                }
            }
            this.f80116o = -1;
            m71873a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo55787a(C30332aw awVar) {
        Aweme aweme;
        if (awVar.f79228a != 0 || (mo55803d() && aB_())) {
            int i = awVar.f79228a;
            boolean z = false;
            if (i == 5) {
                SharePanelGuideConditionExperiment sharePanelGuideConditionExperiment = SharePanelGuideConditionExperiment.INSTANCE;
                if (SharePanelGuideConditionExperiment.m69626b() > 0) {
                    z = true;
                }
                if (z) {
                    this.f80095aP.mo94737a(true, mo60519ak());
                }
                super.mo60714a(awVar);
            } else if (i != 44) {
                super.mo60714a(awVar);
                if (mo62835aJ()) {
                    try {
                        aweme = (Aweme) awVar.f79229b;
                    } catch (Exception unused) {
                        aweme = null;
                    }
                    int i2 = awVar.f79228a;
                    if (i2 != 3) {
                        if (i2 != 35) {
                            switch (i2) {
                                case 5:
                                    if (aweme != null) {
                                        C30230b a = C30230b.m70993a();
                                        String aid = aweme.getAid();
                                        if (C30230b.m70994c()) {
                                            C30234c cVar = (C30234c) a.f78968g.mo60571a(aid);
                                            if (cVar == null) {
                                                cVar = new C30234c();
                                                a.f78968g.mo60572a(aid, cVar);
                                            }
                                            cVar.f78979d = 1;
                                        }
                                        return;
                                    }
                                    break;
                                case 6:
                                    if (aweme != null) {
                                        C30230b a2 = C30230b.m70993a();
                                        String aid2 = aweme.getAid();
                                        if (C30230b.m70994c()) {
                                            C30234c cVar2 = (C30234c) a2.f78968g.mo60571a(aid2);
                                            if (cVar2 != null) {
                                                cVar2.f78979d = 0;
                                            }
                                        }
                                        return;
                                    }
                                    break;
                                case 7:
                                    if (aweme != null) {
                                        C30230b a3 = C30230b.m70993a();
                                        String aid3 = aweme.getAid();
                                        if (C30230b.m70994c()) {
                                            a3.f78963b++;
                                            C30234c cVar3 = (C30234c) a3.f78968g.mo60571a(aid3);
                                            if (cVar3 == null) {
                                                cVar3 = new C30234c();
                                                a3.f78968g.mo60572a(aid3, cVar3);
                                            }
                                            cVar3.f78977b = 1;
                                            C23963a a4 = C23962d.m58765a().mo49547a(aid3, C23958a.COMMENT);
                                            if (a4 != null) {
                                                a4.f63631a.mo49552a();
                                            }
                                        }
                                        return;
                                    }
                                    break;
                            }
                        } else if (aweme != null) {
                            C30230b a5 = C30230b.m70993a();
                            String aid4 = aweme.getAid();
                            if (C30230b.m70994c()) {
                                C30234c cVar4 = (C30234c) a5.f78968g.mo60571a(aid4);
                                if (cVar4 == null) {
                                    cVar4 = new C30234c();
                                    a5.f78968g.mo60572a(aid4, cVar4);
                                }
                                a5.f78967f++;
                                cVar4.f78981f = 1;
                            }
                        }
                    } else if (aweme != null) {
                        C30230b a6 = C30230b.m70993a();
                        String aid5 = aweme.getAid();
                        if (C30230b.m70994c()) {
                            a6.f78966e++;
                            C30234c cVar5 = (C30234c) a6.f78968g.mo60571a(aid5);
                            if (cVar5 == null) {
                                cVar5 = new C30234c();
                                a6.f78968g.mo60572a(aid5, cVar5);
                            }
                            cVar5.f78980e = 1;
                        }
                    }
                }
            } else {
                mo62843aR();
            }
        }
    }

    /* renamed from: a */
    public final void mo55792a(String str) {
        if (mo62868bh()) {
            boolean z = true;
            if (TextUtils.equals(this.f80117p, str)) {
                this.f80118q++;
                if (this.f80118q == 2) {
                    SharePanelGuideConditionExperiment sharePanelGuideConditionExperiment = SharePanelGuideConditionExperiment.INSTANCE;
                    if ((SharePanelGuideConditionExperiment.m69626b() == 2) && this.f80095aP.mo94737a(false, mo60519ak())) {
                        C30286i.m71202a().mo60689b(str);
                        return;
                    }
                }
                if (C30223c.m70962c() != 0 && C30130ag.m70701a()) {
                    if (!this.f80101aV && this.f80118q >= C30223c.m70961b() && !C30286i.m71202a().mo60688a(str)) {
                        if (this.f80100aU) {
                            this.f80119r = true;
                        } else {
                            m71879c(str);
                        }
                        if (this.f80118q == 2) {
                            C23131p.m57779a("awe_share_guide_type_log", C23088c.m56631a().mo47824a("awe_share_guide_type", C30130ag.m70703c()).mo47825b());
                        }
                    } else if (this.f80118q == 2) {
                        C23131p.m57779a("awe_share_guide_type_log", C23088c.m56631a().mo47824a("awe_share_guide_type", "none").mo47825b());
                    }
                }
            } else {
                this.f80118q = 1;
                this.f80117p = str;
                SharePanelGuideConditionExperiment sharePanelGuideConditionExperiment2 = SharePanelGuideConditionExperiment.INSTANCE;
                if (!(SharePanelGuideConditionExperiment.m69626b() == 1 || SharePanelGuideConditionExperiment.m69626b() == 3)) {
                    z = false;
                }
                if (z) {
                    this.f80095aP.mo94737a(false, mo60519ak());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60877a(List<? extends Aweme> list, int i, int i2, final C30451a aVar) {
        Fragment aC_ = aC_();
        if (aC_ instanceof C30450g) {
            ((C30450g) aC_).mo60877a(list, i, i2, new C30451a() {
                /* renamed from: a */
                public final void mo54115a(String str, Exception exc) {
                    if (aVar != null) {
                        aVar.mo54115a(str, exc);
                    }
                }
            });
        } else {
            aVar.mo54115a("unsupported", null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo49942a(Aweme aweme) {
        Integer insertIndex = C30148f.m70756a().getInsertIndex(mo60520al(), aweme);
        if (insertIndex != null) {
            String str = f79940u;
            StringBuilder sb = new StringBuilder("start to insert at ");
            sb.append(insertIndex);
            sb.append("thread: ");
            sb.append(Thread.currentThread());
            C32458a.m75141a(4, str, sb.toString());
            try {
                m71872a(aweme, insertIndex.intValue());
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
    }

    /* renamed from: k */
    public final void mo55811k() {
        this.f79943C.setViewPager(this.f80030y);
    }

    /* renamed from: E */
    private void m71868E() {
        if (mo62852ap()) {
            C37934d.m84797a(this.f80002at).mo77399d();
        }
    }

    /* renamed from: F */
    private boolean m71869F() {
        mo62829aD();
        this.f79945E.notifyDataSetChanged();
        m71870G();
        mo55836x();
        return false;
    }

    /* renamed from: bB */
    private boolean m71876bB() {
        if (this.f79962V == null || !this.f79962V.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: bC */
    private FragmentActivity m71877bC() {
        if (this.f121964aK instanceof FragmentActivity) {
            return (FragmentActivity) this.f121964aK;
        }
        return null;
    }

    public final void aS_() {
        if (mo62868bh() && !this.f80121t) {
        }
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (mo62868bh()) {
            this.f80029x.mo64048a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo55828p() {
        DmtStatusView o = mo62895o(true);
        if (o != null) {
            o.mo19213g();
        }
    }

    /* renamed from: q */
    public final void mo55829q() {
        if (this.f80106e != null) {
            this.f80106e.mo62800a();
            this.f80106e = null;
        }
    }

    /* renamed from: u */
    public final void mo55833u() {
        if (!m71882z()) {
            super.mo55833u();
        }
    }

    /* renamed from: G */
    private void m71870G() {
        if (this.f79945E.getCount() == 3) {
            C47718bf.m103288a(new C30350s("from_full_recommend"));
        }
        this.f80030y.post(new C30659t(this));
    }

    /* renamed from: aE */
    public final void mo62830aE() {
        super.mo62830aE();
        if (this.f80120s != null && this.f80120s.f80564b) {
            this.f80120s.mo63431e();
        }
    }

    /* renamed from: aP */
    public final void mo62841aP() {
        if (this.f121964aK != null && mo55803d() && aB_()) {
            super.mo62841aP();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bq */
    public final boolean mo62875bq() {
        if (super.mo62875bq() || (this.f80106e != null && this.f80106e.mo62802b())) {
            return true;
        }
        return false;
    }

    /* renamed from: bv */
    public final boolean mo62784bv() {
        if (mo62836aK() == null || mo62836aK().mo60188M() == null) {
            return false;
        }
        mo62836aK();
        ay_();
        mo60519ak();
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public C36664i mo55830r() {
        Fragment aC_ = aC_();
        if (aC_ == null || !(aC_.getParentFragment() instanceof C36664i)) {
            return null;
        }
        return (C36664i) aC_.getParentFragment();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo55836x() {
        super.mo55836x();
        Aweme ak = mo60519ak();
        if (this.f80091aL != null) {
            this.f80091aL.mo75773a(ak);
        }
        m71871K();
        m71881j(ak);
        this.f80102aW = this.f79946F;
    }

    /* renamed from: K */
    private void m71871K() {
        if (this.f80096aQ == null) {
            this.f80096aQ = C23794bh.m58387a(this.f121964aK);
        }
        this.f80096aQ.mo63494a(mo60525an());
        if (!m71876bB() && !C26503d.m64061d(this.f79945E.mo60285c(this.f80030y.getCurrentItem()))) {
            this.f80096aQ.mo63493a();
        }
    }

    /* renamed from: bA */
    private void m71875bA() {
        this.f80093aN = false;
        if (this.f80120s != null && this.f80120s.f80564b && "homepage_hot".equals(ay_()) && mo60502X() == 0) {
            this.f80120s.mo63428b();
            mo62874bn();
        }
    }

    /* renamed from: bz */
    private void m71878bz() {
        if (this.f80105c != null) {
            this.f80105c.inflate();
            this.f80105c = null;
            ViewGroup viewGroup = (ViewGroup) this.f80090a.findViewById(R.id.dxm);
            if (viewGroup != null) {
                this.f80120s = new C30741a(viewGroup);
            }
        }
    }

    /* renamed from: z */
    private boolean m71882z() {
        if (this.f121964aK != null && mo55803d() && aB_() && ScrollSwitchStateManager.m75876a((FragmentActivity) this.f121964aK).mo69868b("page_feed")) {
            BusinessComponentServiceUtils.getBusinessBridgeService().mo49724b();
            if (C30148f.m70758b()) {
                return false;
            }
        }
        return true;
    }

    public void aJ_() {
        if (mo62868bh()) {
            m71875bA();
            this.f79984ab.setRefreshing(false);
            if (!this.f80097aR) {
                mo55828p();
            }
            if (mo62835aJ()) {
                C47718bf.m103288a(new C36590b());
            }
        }
    }

    /* renamed from: ah */
    public final void mo60516ah() {
        if (this.f80094aO == null || !this.f80094aO.isShowing()) {
            C30015af aM = mo62838aM();
            if (!(aM == null || aM.mo60196X() == null)) {
                this.f80094aO = C41979aq.m91946a().showSharePanelGuide(this.f121964aK, aM.mo60196X().findViewById(R.id.cn9), new C30595ac(this));
                aM.mo60187L();
            }
        }
    }

    /* renamed from: ai */
    public final void mo60517ai() {
        if (this.f80094aO != null && this.f80094aO.isShowing()) {
            C30596ad.m71612a(this.f80094aO);
            this.f80094aO = null;
        }
        C30015af aM = mo62838aM();
        if (aM != null && aM.mo60196X() != null) {
            aM.mo60189Q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final void mo62869bi() {
        if (mo62835aJ() && MainTabStripSwipeSwitchExperiment.m82550a() && this.f80091aL != null && this.f80091aL.mo75774a() && !this.f79994al && !this.f79995am) {
            this.f80091aL.mo75772a(this.f80090a);
        }
    }

    /* renamed from: m */
    public final void mo55813m() {
        this.f79945E.unregisterDataSetObserver(this.f80113l);
        mo55829q();
        if (this.f80096aQ != null) {
            this.f80096aQ.mo63495b();
            this.f80096aQ = null;
        }
        C25945k.m62931v().mo54113d();
        super.mo55813m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo55814n() {
        if ((this.f79946F == this.f79945E.getCount() - 3 || (this.f79946F == this.f79945E.getCount() - 1 && this.f79945E.getCount() <= 3)) && this.f79957Q != null && (!C35781s.f91909n.mo74441e() || C35781s.f91897b)) {
            this.f79957Q.mo55941g();
        }
    }

    /* renamed from: w */
    public final void mo55835w() {
        if (this.f79969aB != 4) {
            this.f80093aN = true;
            m71875bA();
            return;
        }
        if (this.f80120s == null) {
            m71878bz();
        }
        if (this.f80120s != null) {
            mo60507Z();
            mo62829aD();
            this.f80120s.mo63427a();
            this.f80093aN = false;
            mo62874bn();
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        boolean z;
        if (mo62868bh()) {
            C30013ad V = mo60500V();
            if (V == null || V.getCount() != 1 || (!C26503d.m64070m(V.mo60285c(0)) && !C26235d.m63570a(V.mo60285c(0)))) {
                z = false;
            } else {
                z = true;
            }
            if (this.f80120s != null && this.f80120s.f80564b) {
                this.f79984ab.setRefreshing(true);
            } else if (z) {
                aS_();
            } else if (!this.f80097aR) {
                this.f79984ab.setRefreshing(false);
                DmtStatusView o = mo62895o(true);
                if (o != null) {
                    o.setVisibility(0);
                    o.mo19212f();
                }
            } else if (this.f80103aX) {
                this.f80103aX = false;
            } else {
                this.f79984ab.setRefreshing(true);
            }
        }
    }

    /* renamed from: aZ */
    public final void mo62851aZ() {
        super.mo62851aZ();
        if (mo62963bx()) {
            if (mo60518aj() != null) {
                mo60518aj().mo53997c();
            }
            if (!(this.f79945E == null || this.f80030y == null)) {
                this.f79945E.mo60329a(this.f79946F, false);
                if (!C48069o.m104087I()) {
                    mo62781ar().mo95284a((C38871j) this.f79988af);
                    C48039k.m104036a();
                } else {
                    C50158g aN = mo62839aN();
                    if (aN != null) {
                        aN.mo60207a((C38871j) this.f79988af);
                    }
                }
                Aweme c = this.f79945E.mo60285c(this.f80030y.getCurrentItem());
                if ((this.f121964aK instanceof FragmentActivity) && mo62864bd()) {
                    C47718bf.m103288a(new C30315ag(c));
                    AwemeChangeCallBack.m82603a((FragmentActivity) this.f121964aK, c);
                }
                C30016ag aK = mo62836aK();
                if (m71659bp() && aK != null) {
                    aK.mo60227c(1);
                }
                C31203o.m72862b(C31190f.m72838f(c), "handlePageResume");
                C31203o.m72863c("tryPlay", mo55795b(c));
            }
            if (this.f80120s != null && this.f80120s.f80564b) {
                this.f80120s.mo63430d();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: au */
    public final void mo62853au() {
        if (((Boolean) C36173w.m81665a().getLive().mo15033a("enable_refresh_foru_avatar_live_status", Boolean.valueOf(false))).booleanValue() && this.f79946F <= this.f79945E.getCount() - 2) {
            int i = this.f79946F + 2;
            Aweme c = this.f79945E.mo60285c(i);
            if (c != null) {
                User author = c.getAuthor();
                if (author != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int max = Math.max(this.f79946F - 5, 0); max <= i + 5; max++) {
                        if (max != this.f79946F) {
                            if (max >= this.f79945E.getCount() - 1) {
                                break;
                            }
                            Aweme c2 = this.f79945E.mo60285c(max);
                            if (c2 == null) {
                                break;
                            } else if (c2.getAuthor() != null) {
                                arrayList.add(c2.getAuthor());
                            }
                        }
                    }
                    if (C10193n.m20607a().mo18204a(EnableFeedLiveRefresh.class, "enable_feed_live_refresh", C10181b.m20511a().mo18175c().getEnableFeedLiveRefresh(), true)) {
                        if (C10181b.m20511a().mo18172a(LiveStatusRefreshExperiment.class, true, "allow_checking_noLive_room", 31744, false) || author.roomId != 0) {
                            BusinessComponentServiceUtils.getLiveStateManager().mo74800a(author, (List<User>) arrayList, (C1710e<Long>) new C30594ab<Long>(this, c, i, author));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo55803d() {
        Activity activity = this.f121964aK;
        if (!(activity instanceof C36663h) || !((C36663h) activity).isUnderMainTab()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void mo55812l() {
        boolean z;
        super.mo55812l();
        if (mo62963bx()) {
            if ((this.f121964aK instanceof FragmentActivity) && mo62864bd()) {
                try {
                    FragmentActivity fragmentActivity = (FragmentActivity) this.f121964aK;
                    if (fragmentActivity.getSupportFragmentManager() != null) {
                        C36664i iVar = (C36664i) TabChangeManager.m82396a(fragmentActivity).mo75619c("HOME");
                        if (!(iVar == null || aC_() == null || !aC_().equals(iVar.mo75499c()))) {
                            if (this.f80120s != null && this.f80120s.f80564b && ScrollSwitchStateManager.m75876a((FragmentActivity) this.f121964aK).mo69868b("page_feed")) {
                                this.f80120s.mo63430d();
                            }
                            if (!C48069o.m104087I()) {
                                mo62781ar().mo95284a((C38871j) this.f79988af);
                                C48039k.m104036a();
                            } else {
                                C50158g aN = mo62839aN();
                                if (aN != null) {
                                    aN.mo60207a((C38871j) this.f79988af);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (!mo55803d() || this.f79945E == null || this.f79945E.getCount() <= 0 || !ScrollSwitchStateManager.m75876a((FragmentActivity) this.f121964aK).mo69868b("page_feed") || (f80089d && !C10181b.m20511a().mo18172a(DownloadMaskExperiment.class, false, "downloading_no_mask", 31744, false))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                mo62892l(false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final /* synthetic */ void mo62983y() {
        boolean z;
        if (mo62868bh()) {
            C30016ag aO = mo62840aO();
            if (aO != null) {
                aO.mo53996a(aO.mo53999e());
                if ((this.f121964aK instanceof FragmentActivity) && mo62864bd()) {
                    C47718bf.m103288a(new C30315ag(aO.mo53999e()));
                    AwemeChangeCallBack.m82603a((FragmentActivity) this.f121964aK, aO.mo53999e());
                }
                C47718bf.m103288a(new C31121a(aO.mo53999e(), this.f79987ae.getEventType(), this.f79987ae.getPageType(), this));
            }
            C30016ag aK = mo62836aK();
            boolean z2 = true;
            if (C30227g.m70973a(this.f79987ae.getEventType())) {
                if (aK == null || aK.mo53997c() != 101) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (this.f79988af != null) {
                        this.f79988af.mo60545m();
                    }
                    if (this.f121964aK instanceof FragmentActivity) {
                        AwemeChangeCallBack.m82603a((FragmentActivity) this.f121964aK, aK.mo53999e());
                    }
                }
            }
            if (aO == null || aO.mo53997c() != 2) {
                z2 = false;
            }
            if (!z2) {
                mo60507Z();
                C48039k.m104036a().mo95304b();
                mo62841aP();
                if (m71659bp() && aO != null) {
                    aO.mo60246p();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo55806d(boolean z) {
        this.f80121t = z;
    }

    @C53771m
    public void onRefreshEvent(C47450c cVar) {
        this.f80116o = cVar.f119701a;
    }

    /* renamed from: j */
    private static void m71881j(Aweme aweme) {
        String str;
        if (aweme == null) {
            str = "";
        } else {
            str = aweme.getAid();
        }
        C42423an.m93186a(str);
    }

    /* renamed from: d */
    public final void mo62879d(Aweme aweme) {
        if (!m71882z()) {
            super.mo62879d(aweme);
        }
    }

    /* renamed from: l */
    public final void mo62892l(boolean z) {
        if (!m71882z()) {
            super.mo62892l(z);
        }
    }

    @C53771m
    public void onFollowBubbleShowEvent(C30327ar arVar) {
        this.f80115n = 0;
        this.f80114m = this.f80030y.getCurrentItem();
    }

    @C53771m
    public void onMaskLayerCancelFollowEvent(C31865b bVar) {
        if (bVar.f83246a != null) {
            mo62860b(bVar.f83246a, bVar.f83247b);
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onPushPauseVideoEvent(C23045ba baVar) {
        C32458a.m75141a(4, f79940u, "rev onPushPauseVideoEvent");
        mo62843aR();
    }

    /* renamed from: a */
    private void m71873a(boolean z) {
        if (mo62835aJ()) {
            FeedRefreshViewModel a = FeedRefreshViewModel.m69591a(this.f121964aK);
            if (a != null) {
                a.mo59600a().postValue(Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: i */
    private boolean m71880i(Aweme aweme) {
        if (aweme == null || this.f79958R == null || !this.f79958R.mo55934a(aweme)) {
            return true;
        }
        return m71869F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo55795b(Aweme aweme) {
        if (!mo55803d() || !aB_()) {
            return "23";
        }
        return super.mo55795b(aweme);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo62878d(int i) {
        super.mo62878d(i);
        if (C31257z.m72970a(ay_())) {
            C25945k.m62931v().mo54110a(this, i, mo60519ak());
        }
    }

    /* renamed from: f */
    public final void mo55808f(boolean z) {
        super.mo55808f(z);
        if (z && this.f80120s != null && this.f80120s.f80564b) {
            this.f80120s.mo63430d();
        }
    }

    @C53771m
    public void onBackupUpdateEvent(C30334c cVar) {
        Map<String, AwemeStatisticsBackup> map = cVar.f79241a;
        if (mo62835aJ() && map != null && map.size() != 0) {
            m71874b((C1710e<C30016ag>) new C30658s<C30016ag>(map, cVar));
        }
    }

    @C53771m
    public void onShareDialogEvent(C30324ao aoVar) {
        if (mo62835aJ()) {
            boolean z = true;
            if (aoVar.f79221a != 1) {
                z = false;
            }
            this.f80101aV = z;
            if (this.f80101aV) {
                this.f80118q = 0;
                this.f80117p = null;
            }
        }
    }

    @C53771m
    public void onVisionSearchSwitchEvent(C24516b bVar) {
        if (mo62835aJ() && this.f80030y != null) {
            m71874b((C1710e<C30016ag>) new C30660u<C30016ag>(bVar));
        }
    }

    /* renamed from: b */
    private void m71874b(C1710e<C30016ag> eVar) {
        if (this.f80030y != null) {
            int childCount = this.f80030y.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C30016ag agVar = (C30016ag) this.f80030y.getChildAt(i).getTag(R.id.aeh);
                if (agVar != null) {
                    try {
                        eVar.accept(agVar);
                    } catch (Exception unused) {
                    }
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
                return;
            }
            C10691a.m21542b((Context) this.f121964aK, (int) R.string.c0a).mo19066a();
        }
    }

    /* renamed from: d */
    public final void mo55804d(Exception exc) {
        if (mo62868bh()) {
            C22971a.m56494a(this.f121964aK, exc, R.string.aod);
        }
    }

    public void onAwesomeSplashEvent(C26216b bVar) {
        super.onAwesomeSplashEvent(bVar);
        if (bVar.f69221a == 4 && this.f80093aN && "homepage_hot".equals(ay_()) && mo60502X() == 0 && C23794bh.m58381G().mo47243d() && C23794bh.m58381G().mo47242c() != null) {
            mo55835w();
        }
    }

    @C53771m
    public void onDeleteAwemeEvent(C30338g gVar) {
        if (TextUtils.equals(ay_(), gVar.f79249b)) {
            if (gVar.f79248a != null) {
                String str = f79940u;
                StringBuilder sb = new StringBuilder("onDeleteAwemeEvent");
                sb.append(gVar.f79248a.getAid());
                C32458a.m75151c(4, str, sb.toString());
            }
            m71880i(gVar.f79248a);
        }
    }

    @C53771m
    public void onDislikeAwemeEvent(C30340i iVar) {
        if (iVar.f79254e == this.f121964aK.hashCode()) {
            if (m71877bC() != null) {
                C42245a.m92680a((Context) m71877bC()).mo86206a("long_press_layer", iVar.f79250a);
            }
            mo62823a(iVar.f79250a, iVar.mo60717a());
        }
    }

    @C53771m
    public void onFakeLikeEvent(C30348q qVar) {
        if (this.f79944D != null && qVar != null && TextUtils.equals(ay_(), qVar.f79261a)) {
            this.f79944D.mo54895a((float) (C9432q.m18670a(mo96010bw()) / 2), (float) (C9432q.m18688b(mo96010bw()) / 2));
        }
    }

    @C53771m
    public void onVideoCleanModeEvent(C31122a aVar) {
        C30016ag aO = mo62840aO();
        if (aO != null && aVar.f81466b != null && aO.mo53999e() != null && aVar.f81466b.getAid().equals(aO.mo53999e().getAid())) {
            aO.mo60237f(aVar.f81465a);
        }
    }

    /* renamed from: c */
    private void m71879c(String str) {
        String str2;
        try {
            MobClick value = new MobClick().setEventName("share_highlight").setLabelName("homepage_hot").setValue(str);
            JSONObject jSONObject = new JSONObject();
            String str3 = "repeat";
            if (C30223c.m70962c() == 1) {
                str2 = "double";
            } else {
                str2 = "triple";
            }
            C26890h.onEvent(value.setJsonObject(jSONObject.put(str3, str2)));
        } catch (JSONException unused) {
        }
        C30286i.m71202a().mo60689b(str);
        C30015af aM = mo62838aM();
        if (aM != null) {
            aM.mo60186K();
            C30130ag.m70702b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62967b(String str) {
        if (!C9376b.m18558a((Collection<T>) this.f79945E.mo60286c()) && !TextUtils.isEmpty(str) && this.f79945E.mo60333a(str)) {
            mo62833aH();
            mo62848aW();
            m71870G();
            mo62878d(this.f80030y.getCurrentItem());
        }
    }

    /* renamed from: d */
    public final void mo55805d(String str) {
        boolean z;
        if (mo62868bh()) {
            if (this.f79958R == null || !this.f79958R.mo55935a(str)) {
                z = true;
            } else {
                z = m71869F();
            }
            if (!z) {
                super.mo55805d(str);
            }
        }
    }

    /* renamed from: n */
    public final void mo62894n(boolean z) {
        super.mo62894n(z);
        mo62884f((String) null);
        C31203o.m72859a("handlePageStop");
        mo62844aS();
        C48039k.m104036a().mo95304b();
        mo62862bb();
        mo55829q();
        mo60517ai();
        if (this.f80120s != null && this.f80120s.f80564b) {
            this.f80120s.mo63431e();
        }
    }

    @C53771m
    public void onCommentDialogEvent(C30337f fVar) {
        boolean z;
        boolean z2 = true;
        if (fVar.f79244a == 1) {
            z = true;
        } else {
            z = false;
        }
        mo62891k(z);
        if (fVar.f79244a != 1) {
            z2 = false;
        }
        this.f80100aU = z2;
        mo62887h(this.f80100aU);
        if (mo62835aJ()) {
            mo62888i(this.f80100aU);
            if (!this.f80100aU && this.f80119r) {
                C30016ag aK = mo62836aK();
                if (aK != null) {
                    C25880al r = aK.mo60248r();
                    if (r != null) {
                        r.mo53091x();
                    }
                }
                m71879c(this.f80117p);
                this.f80119r = false;
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onUnReadVideoChange(C47496d dVar) {
        if (!TextUtils.equals(ay_(), "homepage_hot") && !TextUtils.equals(ay_(), "homepage_follow") && m71877bC() != null) {
            FragmentActivity bC = m71877bC();
            String ay_ = ay_();
            C52711k.m112240b(bC, "activity");
            C52711k.m112240b(ay_, "tag");
            C0209x a = C0214z.m440a(bC).mo360a(ay_, UnReadFeedViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…eedViewModel::class.java)");
            UnReadFeedViewModel unReadFeedViewModel = (UnReadFeedViewModel) a;
            Aweme ak = mo60519ak();
            if (ak != null && TextUtils.equals(ak.getAuthorUid(), dVar.f119793a)) {
                ak.getAuthor().setUnReadVideoCount(dVar.f119794b);
                mo62836aK();
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onVPAOptOutEvent(C30331av avVar) {
        if (TextUtils.equals(ay_(), "homepage_hot")) {
            boolean z = false;
            ArrayList arrayList = new ArrayList();
            for (int i = this.f79946F + 1; i < this.f79945E.getCount(); i++) {
                if (this.f79945E.mo60285c(i).getUploadMiscInfoStruct().vpaInfo.getInfoBarType() != 0) {
                    arrayList.add(this.f79945E.mo60285c(i).getAid());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (this.f79958R != null && this.f79958R.mo55935a(str)) {
                    z = true;
                }
            }
            if (z) {
                this.f79945E.notifyDataSetChanged();
            }
            arrayList.clear();
            if (this.f79945E.getCount() > this.f79946F + 1) {
                C47718bf.m103288a(new C47445a());
            }
        }
    }

    /* renamed from: c */
    public void mo47028c(Exception exc) {
        if (mo62868bh()) {
            if (!"homepage_hot".equals(ay_()) || mo60502X() != 0 || !(exc instanceof C23459a) || ((C23459a) exc).getErrorCode() != 13315) {
                m71875bA();
                this.f80029x.mo64050b();
                return;
            }
            if (C47915gg.m103651b()) {
                C23131p.m56692a("ftc_show_algo_free", "", null);
            }
            C23794bh.m58381G().mo47238a((C27978o) new C27978o() {
                /* renamed from: a */
                public final void mo56375a() {
                    if (!C23794bh.m58381G().mo47243d() || C23794bh.m58381G().mo47242c() == null) {
                        mo56376a(0);
                        return;
                    }
                    C30648q.this.f80029x.mo64052d();
                    C30648q.this.f79945E.mo60331a((List<? extends Aweme>) new ArrayList<Object>());
                    C23131p.m56692a("compliance_api_status", "", C23088c.m56631a().mo47824a("type", "/aweme/v1/algo/free/settings/").mo47822a("status", Integer.valueOf(0)).mo47825b());
                    C30648q.this.mo55835w();
                }

                /* renamed from: a */
                public final void mo56376a(int i) {
                    C23131p.m56692a("compliance_api_status", "", C23088c.m56631a().mo47822a("error_message", Integer.valueOf(i)).mo47824a("type", "/aweme/v1/algo/free/settings/").mo47822a("status", Integer.valueOf(1)).mo47825b());
                    C30648q.this.f80029x.mo64050b();
                }
            });
        }
    }

    @C53771m
    public void onMaskLayerLiveFollowEvent(C31866c cVar) {
        int i;
        if (!C23718g.m58207b().mo49153d()) {
            C10691a.m21542b((Context) this.f121964aK, (int) R.string.cg1).mo19066a();
            return;
        }
        Aweme aweme = cVar.f83248a;
        if (aweme != null && aweme.getAuthor() != null) {
            String uid = aweme.getAuthor().getUid();
            String secUid = aweme.getAuthor().getSecUid();
            int followerStatus = aweme.getAuthor().getFollowerStatus();
            C32772s sVar = this.f79961U;
            C39970a e = new C39970a().mo81871a(uid).mo81874b(secUid).mo81869a(1).mo81876c(ay_()).mo81878d(C31190f.m72838f(mo60519ak())).mo81870a(aweme).mo81879e(cVar.f83249b);
            if (TextUtils.equals(ay_(), "homepage_hot")) {
                i = -1;
            } else {
                i = C47725bm.m103320a(this.f79987ae.getEventType());
            }
            sVar.mo66349a(e.mo81875c(i).mo81873b(C47725bm.m103321a(this.f79987ae.getEventType(), aweme.getRelationLabel())).mo81877d(followerStatus).mo81872a());
        }
    }

    /* renamed from: a */
    public final void mo58361a(Bundle bundle) {
        super.mo58361a(bundle);
        if (this.f80091aL == null) {
            this.f80091aL = new C36660e();
        }
        Activity activity = this.f121964aK;
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            ((C0198r) C29491a.m69593a(fragmentActivity).f77246b.getValue()).observe(fragmentActivity, new C30657r(this));
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        boolean z;
        if (mo62868bh()) {
            C30013ad V = mo60500V();
            if (V == null || V.getCount() != 1 || (!C26503d.m64070m(V.mo60285c(0)) && !C26235d.m63570a(V.mo60285c(0)))) {
                z = false;
            } else {
                z = true;
            }
            if (!TextUtils.isEmpty(C30436k.f79567k)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("timestamp", System.currentTimeMillis());
                    jSONObject.put("URL", C30436k.f79567k);
                    jSONObject.put("DNS", C30436k.f79570n.f26760j);
                    jSONObject.put("Connect", C30436k.f79570n.f26761k);
                    jSONObject.put("SSL", C30436k.f79570n.f26762l);
                    jSONObject.put("Request", C30436k.f79570n.f26764n);
                    jSONObject.put("Response", C30436k.f79570n.f26765o);
                    jSONObject.put("ttfbMs", C30436k.f79570n.f26767q);
                    jSONObject.put("total", C30436k.f79570n.f26768r);
                    jSONObject.put("extra", C30436k.f79571o);
                    jSONObject.put("exception", C30436k.f79568l);
                    jSONObject.put("requestInfo", C30436k.f79570n);
                    jSONObject.put("eTime", C30436k.f79569m);
                    jSONObject.put("network", NetworkUtils.getNetworkAccessType(C11010c.m22280a()));
                } catch (JSONException unused) {
                }
                C23131p.m57779a("feed_retry_e", jSONObject);
            }
            if (!"homepage_hot".equals(ay_()) || mo60502X() != 0 || !(exc instanceof C23459a) || ((C23459a) exc).getErrorCode() != 13315) {
                this.f79984ab.setRefreshing(false);
                m71875bA();
                if (this.f80097aR || z) {
                    mo62835aJ();
                    C10691a.m21542b((Context) this.f121964aK, (int) R.string.cg1).mo19066a();
                    C47718bf.m103288a(new C36590b());
                } else {
                    DmtStatusView o = mo62895o(true);
                    if (o != null) {
                        try {
                            o.mo19214h();
                        } catch (RuntimeException e) {
                            C32458a.m75143a((Exception) e);
                            C10691a.m21542b((Context) this.f121964aK, (int) R.string.cg1).mo19066a();
                        }
                    }
                }
                if (this.f80000ar != null && this.f80000ar.mo86222f()) {
                    if (this.f79977aJ != null) {
                        this.f79977aJ.mo94749c();
                    }
                    if (this.f79976aI != null) {
                        this.f79976aI.dismiss();
                    }
                    this.f80000ar.mo86217d(false);
                }
                m71873a(false);
                return;
            }
            if (C47915gg.m103651b()) {
                C23131p.m56692a("ftc_show_algo_free", "", null);
            }
            C23794bh.m58381G().mo47238a((C27978o) new C27978o() {
                /* renamed from: a */
                public final void mo56375a() {
                    if (!C23794bh.m58381G().mo47243d() || C23794bh.m58381G().mo47242c() == null) {
                        mo56376a(0);
                        return;
                    }
                    C30648q.this.f79984ab.setRefreshing(false);
                    C30648q.this.f79945E.mo60331a((List<? extends Aweme>) new ArrayList<Object>());
                    DmtStatusView o = C30648q.this.mo62895o(false);
                    if (o != null) {
                        o.mo19209d();
                    }
                    C23131p.m56692a("compliance_api_status", "", C23088c.m56631a().mo47824a("type", "/aweme/v1/algo/free/settings/").mo47822a("status", Integer.valueOf(0)).mo47825b());
                    C30648q.this.mo55835w();
                }

                /* renamed from: a */
                public final void mo56376a(int i) {
                    C23131p.m56692a("compliance_api_status", "", C23088c.m56631a().mo47822a("error_message", Integer.valueOf(i)).mo47824a("type", "/aweme/v1/algo/free/settings/").mo47822a("status", Integer.valueOf(1)).mo47825b());
                    C30648q.this.aJ_();
                }
            });
        }
    }

    public C30648q(String str, int i) {
        super(str, i);
    }

    /* renamed from: a */
    public final void mo62813a(int i, Aweme aweme) {
        super.mo62813a(i, aweme);
        if (this.f79958R != null && aweme != null) {
            this.f79958R.mo55935a(aweme.getAid());
        }
    }

    /* renamed from: a */
    private void m71872a(Aweme aweme, int i) {
        try {
            mo62859b(aweme, i);
            String str = f79940u;
            StringBuilder sb = new StringBuilder("insertItemAllowNextTimeOk insert success aid:");
            sb.append(aweme.getAid());
            sb.append(",pos:");
            sb.append(i);
            C32458a.m75141a(4, str, sb.toString());
        } catch (C26880f unused) {
            String str2 = f79940u;
            StringBuilder sb2 = new StringBuilder("insertItemAllowNextTimeOk insert fail,wait, aid:");
            sb2.append(aweme.getAid());
            sb2.append(",pos:");
            sb2.append(i);
            C32458a.m75141a(4, str2, sb2.toString());
            this.f80099aT.add(new C0794k(aweme, Integer.valueOf(i)));
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<Aweme> list, boolean z) {
        if (!mo62868bh()) {
            C32458a.m75141a(4, "FeedFetchModel", "FullFeedFragmentPanel receive onLoadMoreResult,but invalid");
            return;
        }
        m71875bA();
        this.f79984ab.setRefreshing(false);
        this.f79945E.f78454e = z;
        if (z || this.f80121t) {
            this.f80029x.mo64052d();
        } else {
            this.f80029x.mo64051c();
        }
        final Aweme c = this.f79945E.mo60285c(this.f80030y.getCurrentItem());
        final int a = C31190f.m72829a(list, c);
        if (C30148f.m70756a().enableOptimize() && this.f80030y.getCurrentItem() != a && mo62835aJ()) {
            this.f79965Y = true;
            C32458a.m75141a(4, f79940u, "triggerPageSelectedByLoadMorePosChanged");
        }
        this.f79945E.mo60331a(list);
        this.f79965Y = false;
        if (!this.f80099aT.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f80099aT);
            this.f80099aT.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0794k kVar = (C0794k) it.next();
                Aweme aweme = (Aweme) kVar.f2711a;
                Integer num = (Integer) kVar.f2712b;
                String str = f79940u;
                StringBuilder sb = new StringBuilder("pendingAddAwemeList insert aid:");
                sb.append(aweme.getAid());
                sb.append(",pos:");
                sb.append(num);
                C32458a.m75141a(4, str, sb.toString());
                m71872a(aweme, num.intValue());
            }
        }
        if (!this.f80121t) {
            this.f80030y.post(new Runnable() {
                public final void run() {
                    if (a < C30648q.this.f79945E.getCount() - 1 && C30648q.this.f80030y != null && !C26503d.m64070m(c) && !C26235d.m63570a(c)) {
                        C30648q.this.f79946F = a + 1;
                        C30648q.this.f79948H = true;
                        C30648q.this.f80030y.setCurrentItemWithDefaultVelocity(C30648q.this.f79946F);
                    }
                }
            });
        }
        m71868E();
        if (C10181b.m20511a().mo18172a(PreloadProcessDataExperiment.class, true, "is_preload_process_data", 31744, false)) {
            mo62781ar().mo95285a(list);
        }
    }

    /* renamed from: c */
    public final void mo47029c(List<Aweme> list, boolean z) {
        if (mo62868bh()) {
            this.f79984ab.setRefreshing(false);
            boolean z2 = true;
            if (z || this.f80121t) {
                if (!this.f80121t || C9376b.m18558a((Collection<T>) list) || this.f79945E.getCount() == list.size()) {
                    z2 = false;
                }
                this.f79963W = z2;
                this.f79945E.mo60331a(list);
                if (!this.f80121t) {
                    this.f80030y.post(new Runnable() {
                        public final void run() {
                            if (C30648q.this.f80030y != null) {
                                C30648q.this.f79946F = 0;
                                C30648q.this.f79948H = true;
                                C30648q.this.f80030y.mo55004a(0, false);
                            }
                        }
                    });
                }
            } else if (mo62963bx() && this.f121964aK != null && mo55803d()) {
                C10691a.m21548c((Context) this.f121964aK, (int) R.string.an1).mo19066a();
                if (this.f80030y.getCurrentItem() > 1) {
                    this.f80030y.mo55004a(0, false);
                } else {
                    this.f80030y.setCurrentItemWithDefaultVelocity(0);
                }
            }
            m71868E();
        }
    }

    /* renamed from: a */
    public final void mo55784a(View view, Bundle bundle) {
        super.mo55784a(view, bundle);
        this.f80090a = (ViewGroup) view.findViewById(R.id.aem);
        this.f80104b = (ViewStub) view.findViewById(R.id.cu9);
        this.f80105c = (ViewStub) view.findViewById(R.id.dxn);
        if (mo62835aJ() && C29509j.f77296a.mo59620a()) {
            this.f80110i = (AbstractUnReadSunRoofTouchEventFrameLayout) view.findViewById(R.id.f7k);
            this.f80110i.setScrollPredicate(new C30662w(this));
            this.f80110i.setCallBack(new C30663x(this));
            C30148f.m70757a(m71877bC()).mo63496a((C0184k) m71877bC(), (C52682m<? super Boolean, ? super Boolean, C52860x>) new C30664y<Object,Object,C52860x>(this));
            this.f80092aM = (AbstractUnReadSunRoofView) ((ViewStub) view.findViewById(R.id.eyp)).inflate().findViewById(R.id.f7f);
            this.f80109h = C30148f.m70756a().createUnReadSunRoofViewDelegate(m71877bC(), this.f80092aM, this.f80110i);
        }
        this.f80090a.setOnClickListener(C30661v.f80140a);
        Activity activity = this.f121964aK;
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            AwemeChangeCallBack.m82602a(fragmentActivity, fragmentActivity, new C36674a() {
                /* renamed from: a */
                public final void mo49729a(Aweme aweme) {
                    if ((C30648q.this.f121964aK instanceof AmeActivity) && !C30648q.this.f80108g) {
                        ((AmeActivity) C30648q.this.f121964aK).tryRemoveDeeplinkBackView();
                    }
                    C30648q.this.f80108g = false;
                    if (aweme != null) {
                        C30648q qVar = C30648q.this;
                        if (C31357a.m73095a()) {
                            C36664i r = qVar.mo55830r();
                            if (r != null) {
                                if (C26503d.m64061d(aweme)) {
                                    r.mo75493a(false);
                                } else if (!C31357a.m73102d()) {
                                    r.mo75491a();
                                } else {
                                    r.mo75493a(true);
                                }
                            }
                        }
                    }
                }
            });
        }
        this.f79984ab = new C36603dv(this.f79943C);
        this.f80030y.mo54890a((C0997e) new C1000h() {

            /* renamed from: a */
            boolean f80124a;

            /* renamed from: b */
            int f80125b = -1;

            public final void onPageScrollStateChanged(int i) {
                C30648q.this.f80112k = i;
                if (i == 1) {
                    this.f80124a = false;
                }
            }

            public final void onPageSelected(int i) {
                C43893g gVar = new C43893g(10);
                gVar.f111164e = 1;
                C47718bf.m103288a(gVar);
                Aweme c = C30648q.this.f79945E.mo60285c(C30648q.this.f80030y.getCurrentItem());
                C30648q qVar = C30648q.this;
                int i2 = this.f80125b;
                if (C31357a.m73095a() && qVar.mo55830r() != null && !C26503d.m64061d(c) && !C31357a.m73102d() && i > i2 && C31357a.f82125c <= 6) {
                    C31357a.f82125c++;
                }
                this.f80125b = i;
                if (i > C30648q.this.f80114m && C30648q.this.f80115n < 50) {
                    C30648q.this.f80115n++;
                    if (C30648q.this.f80115n == 50) {
                        C47718bf.m103288a(new C30356x());
                    }
                }
                if (C26503d.m64061d(c)) {
                    C47718bf.m103288a(new C40886c());
                }
                C30648q.this.f80111j = Math.max(C30648q.this.f80111j, i);
            }

            public final void onPageScrolled(int i, float f, int i2) {
                if (i == C30648q.this.f79946F) {
                    if (C30648q.this.f80106e != null) {
                        C30648q.this.f80106e.mo62801a((float) (-i2));
                    }
                } else if (C30648q.this.f80106e != null) {
                    C30648q.this.f80106e.mo62801a((float) (C9432q.m18688b(C30648q.this.mo96010bw()) - i2));
                }
                if (!this.f80124a) {
                    this.f80124a = true;
                    C47718bf.m103288a(new C31123b(C30648q.this.mo60519ak(), C30648q.this.ay_(), C30648q.this.mo60502X(), C30648q.this));
                }
            }
        });
        C47729bp.m103326a(this.f79987ae.getEventType()).mo95021a((BaseCustomViewPager) this.f80030y);
        this.f79945E.registerDataSetObserver(this.f80113l);
        this.f80029x.mo64052d();
        this.f80029x.mo64049a(this.f80030y, this.f79943C);
        this.f80029x.setLabel("main_feed");
        if ("homepage_hot".equals(ay_()) && mo60502X() == 0 && C23794bh.m58381G().mo47243d() && C23794bh.m58381G().mo47242c() != null) {
            mo55835w();
        }
        FragmentActivity bC = m71877bC();
        if (bC == null) {
            C32458a.m75143a((Exception) new RuntimeException("bindLiveData fail"));
        } else if (mo62835aJ()) {
            C30432a.m71352a(bC).f79550a.observe(bC, new C30665z(this));
        }
        if (AdGapInteractiveDuration.isEnable()) {
            BusinessComponentServiceUtils.getAppStateReporter().mo47071a(C25593c.f67757i);
        }
        this.f80095aP = new C47461g(this, this.f80000ar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo62965a(List list, Boolean bool, List list2) {
        if (bool.booleanValue() && !C9376b.m18558a((Collection<T>) list2) && mo62835aJ() && !this.f80100aU && this.f80004av && mo62963bx() && !this.f80006ax && this.f79975aH && this.f79946F == 0 && C29509j.f77296a.mo59620a() && !C9376b.m18558a((Collection<T>) list) && !((Aweme) list.get(0)).isAd()) {
            C30148f.m70757a(m71877bC()).mo63497a(true);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo55783a(MotionEvent motionEvent, C30016ag agVar, Aweme aweme) {
        if (!mo62835aJ() || !C30148f.m70756a().isInterestAweme(aweme)) {
            super.mo55783a(motionEvent, agVar, aweme);
        }
    }

    /* renamed from: a */
    public final C30056b mo55779a(Context context, LayoutInflater layoutInflater, C30313ae<C30332aw> aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar) {
        C30126z zVar = new C30126z(context, layoutInflater, aeVar, fragment, onTouchListener, baseFeedPageParams, mVar);
        return zVar;
    }
}
