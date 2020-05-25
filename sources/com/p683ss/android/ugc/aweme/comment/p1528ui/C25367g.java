package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.view.C1221d;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.bytedance.p125a.C2667b;
import com.bytedance.p125a.C2668c;
import com.bytedance.router.SmartRouter;
import com.p100a.p102b.C2281a;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22713c;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23484c;
import com.p683ss.android.ugc.aweme.base.p1411c.C23488g;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.C25156f;
import com.p683ss.android.ugc.aweme.comment.C25273o;
import com.p683ss.android.ugc.aweme.comment.CommentViewModelImpl;
import com.p683ss.android.ugc.aweme.comment.abtest.C25069a;
import com.p683ss.android.ugc.aweme.comment.abtest.CommentAutoAddLayoutExperiment;
import com.p683ss.android.ugc.aweme.comment.abtest.MTReplyWithVideoSettings;
import com.p683ss.android.ugc.aweme.comment.adapter.C25102a;
import com.p683ss.android.ugc.aweme.comment.adapter.C25112e;
import com.p683ss.android.ugc.aweme.comment.api.C25137a;
import com.p683ss.android.ugc.aweme.comment.list.C25252a;
import com.p683ss.android.ugc.aweme.comment.list.C25254c;
import com.p683ss.android.ugc.aweme.comment.list.C25257f;
import com.p683ss.android.ugc.aweme.comment.list.C25259h;
import com.p683ss.android.ugc.aweme.comment.list.C25261j;
import com.p683ss.android.ugc.aweme.comment.list.C25263l;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;
import com.p683ss.android.ugc.aweme.comment.list.ICommerceComtEggLayout;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p683ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct;
import com.p683ss.android.ugc.aweme.comment.model.CommentPrompt;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25065b;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25068e;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25148b;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25171f;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25175c;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25176d;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25178e;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25179f;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25181g;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25182h;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25184j;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25189o;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25190p;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25191q;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25193s;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25197v;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25207a;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25208b;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25209c;
import com.p683ss.android.ugc.aweme.comment.p1525j.C25212a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25219b;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25224d;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25228f;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25229g;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25230h;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25239k;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25243n;
import com.p683ss.android.ugc.aweme.comment.services.C25281a;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.comment.services.C25285d;
import com.p683ss.android.ugc.aweme.comment.services.C25286e;
import com.p683ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25780a;
import com.p683ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25710b;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.C27021a;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27718c;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.experiment.ShrinkVideoWhenCommentShowExperiment;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C29984ac;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.p1720f.C30230b;
import com.p683ss.android.ugc.aweme.feed.p1720f.C30230b.C30234c;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30322am;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30337f;
import com.p683ss.android.ugc.aweme.follow.p1764c.C31870a;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32403c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.main.p1942e.C36620c;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1436bi.C23827a.C23828a;
import com.p683ss.android.ugc.aweme.p1462bq.C23955a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;
import com.p683ss.android.ugc.aweme.services.CommentDependServiceImpl;
import com.p683ss.android.ugc.aweme.unread.C47496d;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47709bb;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47729bp;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p683ss.android.ugc.vcd.C50503c;
import com.p683ss.android.ugc.vcd.C50510i;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.g */
public class C25367g extends C23526a implements C25147a, C25197v, C25252a, C25254c, C25257f, C25259h, C25263l, C25285d, C25333ac, C26846a, C26877c<Comment>, C50503c {

    /* renamed from: an */
    private static long f67062an;

    /* renamed from: w */
    public static boolean f67063w;

    /* renamed from: x */
    public static long f67064x;

    /* renamed from: A */
    public String f67065A;

    /* renamed from: B */
    C29984ac f67066B;

    /* renamed from: C */
    long f67067C;

    /* renamed from: D */
    private Comment f67068D;

    /* renamed from: E */
    private RecyclerView f67069E;

    /* renamed from: F */
    private CommentNestedLayout f67070F;

    /* renamed from: G */
    private TextView f67071G;

    /* renamed from: H */
    private ImageView f67072H;

    /* renamed from: I */
    private View f67073I;

    /* renamed from: J */
    private ImageView f67074J;

    /* renamed from: K */
    private ImageView f67075K;

    /* renamed from: L */
    private ImageView f67076L;

    /* renamed from: M */
    private ImageView f67077M;

    /* renamed from: O */
    private View f67078O;

    /* renamed from: P */
    private View f67079P;

    /* renamed from: Q */
    private ViewGroup f67080Q;

    /* renamed from: R */
    private View f67081R;

    /* renamed from: S */
    private ICommerceComtEggLayout f67082S;

    /* renamed from: T */
    private TextView f67083T;

    /* renamed from: U */
    private CommerceEggLayout f67084U;

    /* renamed from: V */
    private C25780a f67085V;

    /* renamed from: W */
    private LinearLayout f67086W;

    /* renamed from: X */
    private C25181g f67087X;

    /* renamed from: Y */
    private C25175c f67088Y;

    /* renamed from: Z */
    private C25190p f67089Z;

    /* renamed from: a */
    final int f67090a = ((int) C9432q.m18687b(C11010c.m22280a(), 30.0f));

    /* renamed from: aa */
    private C30313ae<C30332aw> f67091aa;

    /* renamed from: ab */
    private String f67092ab;

    /* renamed from: ac */
    private String f67093ac;

    /* renamed from: ad */
    private boolean f67094ad = false;

    /* renamed from: ae */
    private boolean f67095ae;

    /* renamed from: af */
    private boolean f67096af;

    /* renamed from: ag */
    private boolean f67097ag;

    /* renamed from: ah */
    private long f67098ah;

    /* renamed from: ai */
    private long f67099ai;

    /* renamed from: aj */
    private C23279d f67100aj;

    /* renamed from: ak */
    private Widget f67101ak;

    /* renamed from: al */
    private Widget f67102al;

    /* renamed from: am */
    private ViewGroup f67103am;

    /* renamed from: ao */
    private boolean f67104ao = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: ap */
    private C10719a f67105ap;

    /* renamed from: aq */
    private int f67106aq = 0;

    /* renamed from: ar */
    private String f67107ar;

    /* renamed from: as */
    private Set<String> f67108as = new HashSet();

    /* renamed from: at */
    private boolean f67109at = false;

    /* renamed from: b */
    public C25171f f67110b = new C25171f("");

    /* renamed from: c */
    public Aweme f67111c;

    /* renamed from: d */
    Comment f67112d;

    /* renamed from: e */
    public Comment f67113e;

    /* renamed from: j */
    public Comment f67114j;

    /* renamed from: k */
    Comment f67115k;

    /* renamed from: l */
    DmtStatusView f67116l;

    /* renamed from: m */
    public MentionEditText f67117m;

    /* renamed from: n */
    public WrapLinearLayoutManager f67118n;

    /* renamed from: o */
    public C27718c f67119o;

    /* renamed from: p */
    public C25102a f67120p;

    /* renamed from: q */
    public C25184j f67121q;

    /* renamed from: r */
    C25178e f67122r;

    /* renamed from: s */
    public C25193s f67123s;

    /* renamed from: t */
    public C25393z f67124t;

    /* renamed from: u */
    public C25156f f67125u;

    /* renamed from: v */
    C25243n f67126v;

    /* renamed from: y */
    public DataCenter f67127y;

    /* renamed from: z */
    FrameLayout f67128z;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo51252a(View view, boolean z, String str) {
    }

    /* renamed from: d */
    public final void mo51262d() {
        mo51943u();
    }

    /* renamed from: h */
    public final Aweme mo51787h() {
        return this.f67111c;
    }

    /* renamed from: i */
    public final Comment mo51788i() {
        return this.f67114j;
    }

    /* renamed from: m */
    public final boolean mo51792m() {
        return C25286e.m61511a(this);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onUnReadVideoChanged(C47496d dVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo51913a(Boolean bool) {
        if (bool.booleanValue()) {
            m61655K();
        } else {
            m61657M();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo51922d(List<Comment> list, boolean z) {
        int i;
        if (this.f67121q == null || this.f67121q.mo54803n() == null || ((C25182h) this.f67121q.mo54803n()).getData() == null) {
            C32458a.m75141a(4, "comment", "onRefreshResult() with return");
            return;
        }
        String str = "comment";
        StringBuilder sb = new StringBuilder("onRefreshResult(): aid = ");
        sb.append(this.f67111c == null ? null : this.f67111c.getAid());
        sb.append(" load size = ");
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        sb.append(i);
        C32458a.m75141a(4, str, sb.toString());
        if (f67064x > 0) {
            C0013i.m16a((Callable<TResult>) new C25388u<TResult>(this, f67064x));
            f67064x = 0;
        }
        if (this.f67070F != null) {
            CommentNestedLayout commentNestedLayout = this.f67070F;
            if (commentNestedLayout.f67211c != null && commentNestedLayout.f67214f) {
                C32458a.m75141a(4, "comment", "onRefreshResult() => postDelay onRefreshResult() because mCommentNestedLayout.needBlockDataLoading()");
                this.f67070F.postDelayed(new C25389v(this, list, z), 100);
                return;
            }
        }
        if (!(this.f67111c != null && this.f67111c.getAwemeControl().canShowComment())) {
            C32458a.m75141a(4, "comment", "onRefreshResult() => showLoadEmpty() because canCommentShow == false");
            list.clear();
            aJ_();
        }
        if (this.f67125u != null) {
            this.f67125u.mo51246c();
        }
        if (this.f67094ad && !C9376b.m18558a((Collection<T>) list)) {
            C26129j adCommentStruct = this.f67110b.getAdCommentStruct();
            if (adCommentStruct != null) {
                if (!(list.get(0) instanceof C26129j)) {
                    list.add(0, adCommentStruct);
                }
                this.f67127y.mo48228a("comment_ad_struct", (Object) adCommentStruct);
            }
        }
        m61675a(list);
        long i2 = m61690i(true);
        if (this.f67125u != null) {
            this.f67125u.mo51238a(((CommentItemList) ((C25182h) this.f67121q.mo54803n()).getData()).replyStyle);
        }
        m61679c(list);
        m61684d(list);
        this.f67124t.mo47018a(list, z);
        m61687e(i2);
        C25171f fVar = this.f67110b;
        C25184j jVar = this.f67121q;
        fVar.setInsertCids(jVar.f70700f == null ? "" : ((C25182h) jVar.f70700f).f66739d, this.f67110b.showReplyWithInsertCid(), this.f67110b.isForceOpenReply());
        m61663S();
        if (this.f67067C > 0) {
            m61673a(((CommentItemList) ((C25182h) this.f67121q.mo54803n()).getData()).commentPrompt);
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<Comment> list, boolean z) {
        this.f67124t.mo47026b(list, z);
        m61687e(m61690i(false));
    }

    /* renamed from: a */
    public final void mo51535a(String str) {
        mo51914a((long) (-m61682d(str)));
        this.f67124t.mo51535a(str);
        C47718bf.m103288a(new C25064a(4, new Object[]{mo51940q(), str}));
        if (this.f67111c != null && this.f67112d != null) {
            C27021a.f71325a.tryShowCommentFilterGuide(getActivity(), this.f67111c, this.f67112d);
        }
    }

    /* renamed from: a */
    public final void mo51538a(String str, Exception exc) {
        this.f67124t.mo51538a(str, exc);
        if (!TextUtils.isEmpty(this.f67092ab)) {
            C25207a.m61286a(this.f67110b.getEnterFrom(), this.f67111c, (String) null, false, "list", this.f67093ac, this.f67110b.isHotPlayer());
        }
    }

    /* renamed from: a */
    public final void mo51539a(Object... objArr) {
        this.f67124t.mo51539a(objArr[0]);
        if (!TextUtils.isEmpty(this.f67092ab)) {
            if (objArr.length == 4) {
                String enterFrom = this.f67110b.getEnterFrom();
                Aweme aweme = this.f67111c;
                String str = objArr[0];
                String str2 = this.f67093ac;
                String str3 = objArr[1];
                String str4 = objArr[2];
                String str5 = objArr[3];
                C23089d a = C25207a.m61276a(enterFrom, aweme, str, true, "list");
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                    if (!TextUtils.equals(str5, "0")) {
                        a.mo47829a("parent_id", str5);
                        a.mo47829a("comment_category", "reply_to_reply");
                    } else if (!TextUtils.equals(str4, "0")) {
                        a.mo47829a("parent_id", str4);
                        a.mo47829a("comment_category", "reply");
                    } else {
                        a.mo47829a("parent_id", str);
                        a.mo47829a("comment_category", "original");
                    }
                }
                String str6 = TextUtils.equals("2", str3) ? "cancel_like_comment" : "like_comment";
                if (C23198ae.m56860d(enterFrom)) {
                    a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
                    String str7 = "comment_user_id";
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    a.mo47829a(str7, str2);
                    C26890h.m65012a(str6, C23198ae.m56851a(a.f61491a));
                } else {
                    C26890h.m65011a(str6, a.f61491a);
                }
            } else {
                C25207a.m61286a(this.f67110b.getEnterFrom(), this.f67111c, (String) objArr[0], true, "list", this.f67093ac, this.f67110b.isHotPlayer());
            }
        }
    }

    /* renamed from: a */
    public final void mo51533a(String str, String str2, String str3, String str4) {
        this.f67124t.mo51533a(str, str2, str3, str4);
        C25207a.m61285a(this.f67110b.getEnterFrom(), this.f67111c, str, true, "list", this.f67093ac, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo51258a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            SmartRouter.buildRoute((Context) getActivity(), "aweme://user/profile/").withParam("uid", str).withParam("enter_from", mo51789j()).withParam(C22835a.f61196a, str2).open();
            String j = mo51789j();
            String q = mo51940q();
            mo51941r();
            String requestId = this.f67110b.getRequestId();
            Aweme aweme = this.f67111c;
            C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str).setJsonObject(C23088c.m56631a().mo47824a("group_id", q).mo47824a("request_id", requestId).mo47824a("enter_from", j).mo47824a("enter_method", "click_comment_head").mo47824a("enter_type", "normal_way").mo47825b()));
            C26890h.m65011a("enter_personal_detail_backup", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("to_user_id", str).mo47829a("group_id", q).mo47829a("request_id", requestId).mo47829a("enter_method", "click_comment_head").mo47829a("enter_type", "normal_way").f61491a);
            if (aweme != null) {
                C26890h.onEvent(MobClick.obtain().setEventName("head").setLabelName(j).setValue(aweme.getAuthorUid()).setJsonObject(C23088c.m56631a().mo47824a("request_id", aweme.getRequestId()).mo47824a("group_id", aweme.getAid()).mo47825b()));
            }
            ((C23249s) new C23249s().mo48137c(j).mo47941a("click_comment_head")).mo47954f(aweme).mo48144s(str).mo48076e();
            C30578o.m71566a(C29988ad.PROFILE);
            C47718bf.m103288a(new C30332aw(36));
            if (!TextUtils.isEmpty(this.f67065A)) {
                m61667W();
            }
        }
    }

    /* renamed from: a */
    public final void mo51255a(Comment comment, int i) {
        if (!C25391x.m61782a(getActivity())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
        } else if (!C20854a.m53167g().isLogin()) {
            C27965f.m66723a((Fragment) this, mo51789j(), "like_comment");
        } else if (comment != null) {
            String str = comment.getUserDigged() == 0 ? "1" : "2";
            if (this.f67087X != null && this.f67087X.av_()) {
                this.f67087X.mo44934a_(comment.getCid(), comment.getAwemeId(), str, this.f67110b.getCommentTag(), comment.getReplyId(), comment.getReplyToReplyCommentId());
            }
            if (comment.getUser() != null) {
                this.f67093ac = comment.getUser().getUid();
            }
            this.f67092ab = comment.getCid();
            if (TextUtils.equals("1", str)) {
                String j = mo51789j();
                String valueOf = String.valueOf(comment.getLabelType());
                String str2 = this.f67092ab;
                String q = mo51940q();
                String authorUid = Comment.getAuthorUid(comment);
                String str3 = "common";
                if ("1".equals(valueOf)) {
                    str3 = "author";
                } else if ("2".equals(valueOf)) {
                    str3 = "following";
                }
                C26890h.onEvent(MobClick.obtain().setEventName("like_comment").setLabelName(j).setValue(q).setExtValueString(authorUid).setJsonObject(C23088c.m56631a().mo47824a("attribute", str3).mo47824a("reply_uid", authorUid).mo47824a("reply_comment_id", str2).mo47825b()));
            }
        }
    }

    /* renamed from: a */
    public final void mo51257a(C29366a aVar) {
        if (isViewValid() && aVar != null) {
            Context context = getContext();
            if (context != null) {
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66720a(C11016e.m22312g(), this.f67110b.getEnterFrom(), "like_comment", C47661ab.m103163a().mo94972a("group_id", this.f67110b.getAid()).mo94972a("log_pb", C23198ae.m56874k(this.f67110b.getAid())).f120139a);
                } else if (C29368b.m69241a().mo59389a(aVar)) {
                    C10691a.m21548c(context, (int) R.string.ax7).mo19066a();
                } else {
                    UrlModel animateUrl = aVar.getAnimateUrl();
                    C25207a.m61279a();
                    C29368b.m69241a().mo59383a(aVar.getId(), animateUrl.getUri(), (String) animateUrl.getUrlList().get(0), aVar.getResourcesId(), aVar.getStickerType());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51253a(C25265n nVar, Comment comment) {
        if (comment != null && mo51543c()) {
            String enterFrom = this.f67110b.getEnterFrom();
            String q = mo51940q();
            C26890h.m65011a("tap_comment", C25207a.m61277a(enterFrom, q).mo47829a("comment_id", comment.getCid()).f61491a);
            if (!C25273o.f66859b.mo51547a(comment)) {
                Aweme aliasAweme = comment.getAliasAweme();
                if (aliasAweme != null) {
                    Context context = getContext();
                    if (context != null && !TextUtils.isEmpty(aliasAweme.getAid())) {
                        SmartRouter.buildRoute(context, "aweme://aweme/detail/").withParam("id", aliasAweme.getAid()).withParam("refer", "comment").open();
                        String enterFrom2 = this.f67110b.getEnterFrom();
                        String q2 = mo51940q();
                        String cid = comment.getCid();
                        C26890h.m65011a("click_video_comment", C25207a.m61277a(enterFrom2, q2).mo47829a("comment_id", cid).mo47829a("to_group_id", aliasAweme.getAid()).f61491a);
                    }
                } else if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66725a((Fragment) this, mo51789j(), "reply_comment", C47661ab.m103163a().mo94972a("login_title", C11010c.m22280a().getString(R.string.a7w)).mo94972a("group_id", mo51940q()).mo94972a("log_pb", C23198ae.m56874k(mo51940q())).f120139a, (C23505g) new C25390w(this, nVar, comment));
                } else if (C22713c.m55949a().mo47103a()) {
                    C10691a.m21548c(C11010c.m22280a(), (int) R.string.dw4).mo19066a();
                } else {
                    mo51924f(comment);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51915a(Comment comment, String str) {
        if (this.f67120p != null) {
            this.f67120p.mo51184a(comment, "reply_via_video", TextUtils.equals("comment_press", str) ? "press" : "click_button");
        }
    }

    /* renamed from: a */
    public final void mo51256a(CommentReplyButtonStruct commentReplyButtonStruct, C25261j jVar) {
        if (this.f67089Z == null) {
            this.f67089Z = new C25190p(mo51940q(), mo51789j());
            C25190p pVar = this.f67089Z;
            C25243n nVar = this.f67126v;
            pVar.f66758a = nVar;
            ((C25189o) pVar.mo54803n()).f66740e = nVar;
            this.f67089Z.f66759b = this.f67110b.getInsertCids();
            this.f67089Z.mo51445a((C25263l) this);
        }
        this.f67089Z.mo51447a(commentReplyButtonStruct, jVar);
    }

    /* renamed from: a */
    public final void mo51254a(Comment comment) {
        String text = comment.getText();
        m61672a(C25273o.f66859b.mo51556k(comment), C25273o.f66859b.mo51554i(comment), C29408b.m69341a(text), text, true);
        if (this.f67125u != null) {
            this.f67125u.mo51244b(comment);
        }
    }

    /* renamed from: a */
    public final void mo51542a(C30313ae<C30332aw> aeVar) {
        this.f67091aa = aeVar;
    }

    /* renamed from: a */
    public final void mo51779a(int i, int i2, String str, String str2, String str3) {
        m61672a(this.f67114j, i, i2, str, false);
    }

    /* renamed from: a */
    public final void mo51780a(Exception exc, int i, Comment comment) {
        if (i == 3) {
            C23794bh.m58391e().mo65594a(this.f67110b.getEnterFrom(), mo51787h(), "list", this.f67095ae ? "click_reply_comment" : "click_comment", false);
        }
        int[] t = mo51942t();
        C25393z zVar = this.f67124t;
        int i2 = t[0];
        int i3 = t[1];
        boolean z = i == 3;
        if (!C25273o.f66859b.mo51547a(comment)) {
            zVar.mo51969b(comment);
        }
        C25273o.f66859b.mo51548c(comment);
        boolean a = C25137a.m61052a(zVar.f67170c.getContext(), exc, z ? R.string.b65 : R.string.a9f, C25393z.m61788b(comment, i2, i3));
        if (a) {
            C25273o.f66859b.mo51552g(comment);
        } else {
            zVar.mo51962a(comment);
        }
        if (a) {
            String fakeId = comment.getFakeId();
            C25243n nVar = this.f67126v;
            long j = 0;
            if (!C9376b.m18558a((Collection<T>) nVar.f66845a)) {
                Iterator it = nVar.f66845a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Comment comment2 = (Comment) it.next();
                    if (TextUtils.equals(comment2.getFakeId(), fakeId)) {
                        j = 1 + comment2.getReplyCommentTotal();
                        break;
                    }
                }
            }
            mo51914a(-j);
            C25393z zVar2 = this.f67124t;
            C25102a aVar = (C25102a) zVar2.mo51968b();
            if (aVar != null) {
                int c = zVar2.f67171d.mo51524c(fakeId);
                int c2 = aVar.mo48636c();
                if (c2 != 0 && !TextUtils.isEmpty(fakeId)) {
                    int i4 = -1;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= c2) {
                            break;
                        }
                        Comment comment3 = (Comment) aVar.f70670n.get(i5);
                        if (comment3 != null && C9431p.m18665a(comment3.getFakeId(), fakeId)) {
                            i4 = i5;
                            break;
                        }
                        i5++;
                    }
                    aVar.mo51181a(i4, c);
                }
                if (aVar.mo48636c() == 0) {
                    aVar.mo54798c(false);
                    aVar.notifyItemRemoved(0);
                    zVar2.f67169b.mo19213g();
                }
                C47718bf.m103288a(new C25064a(4, zVar2.f67168a));
            }
            C47718bf.m103288a(new C25064a(4, new Object[]{mo51940q()}));
        }
    }

    /* renamed from: b */
    public final void mo51782b(String str) {
        C25207a.m61289a(str, this.f67110b.getEnterFrom(), mo51940q(), mo51941r());
    }

    /* renamed from: a */
    public final void mo51557a(String str, List<Comment> list) {
        String str2;
        int i;
        C25393z zVar = this.f67124t;
        if (TextUtils.isEmpty(str) || C9376b.m18558a((Collection<T>) list)) {
            str2 = "";
        } else {
            C25102a aVar = (C25102a) zVar.mo51968b();
            if (aVar == null) {
                i = -1;
            } else {
                i = aVar.mo51180a(str, 11);
            }
            str2 = "";
            if (i >= 0 && zVar.f67171d != null) {
                Comment comment = (Comment) aVar.mo50673a().get(i);
                if (comment instanceof CommentReplyButtonStruct) {
                    str2 = ((CommentReplyButtonStruct) comment).getCommentId();
                }
                List a = C25393z.m61787a(aVar);
                zVar.f67171d.mo51515a(i, list);
                C47709bb.m103255a(aVar, a, aVar.mo50673a());
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            C25207a.m61296c(this.f67110b.getEnterFrom(), mo51940q(), str2);
        }
    }

    /* renamed from: b */
    public final void mo51558b(String str, List<Comment> list) {
        String str2;
        int i;
        C25393z zVar = this.f67124t;
        if (TextUtils.isEmpty(str) || C9376b.m18558a((Collection<T>) list)) {
            str2 = "";
        } else {
            C25102a aVar = (C25102a) zVar.mo51968b();
            if (aVar == null) {
                i = -1;
            } else {
                i = aVar.mo51180a(str, 11);
            }
            str2 = "";
            if (i - list.size() >= 0) {
                Comment comment = (Comment) aVar.mo50673a().get(i);
                if (comment instanceof CommentReplyButtonStruct) {
                    str2 = ((CommentReplyButtonStruct) comment).getCommentId();
                }
                List a = C25393z.m61787a(aVar);
                zVar.f67171d.mo51523b(list);
                C47709bb.m103255a(aVar, a, aVar.mo50673a());
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            C25207a.m61294b(this.f67110b.getEnterFrom(), mo51940q(), str2);
        }
    }

    /* renamed from: a */
    public void mo51916a(boolean z) {
        if (this.f67070F != null) {
            this.f67070F.mo51987a(z);
        }
    }

    /* renamed from: b */
    public final void mo51919b(boolean z) {
        if (this.f67070F != null) {
            this.f67070F.setBackFromVideo(true);
        }
    }

    /* renamed from: a */
    public final void mo51450a(Integer num, String str, Boolean bool) {
        if (!TextUtils.isEmpty(str)) {
            C10691a.m21545b((Context) getActivity(), str).mo19066a();
        }
        if (num != null) {
            num.intValue();
        }
        this.f67068D = null;
        this.f67113e = null;
    }

    /* renamed from: a */
    public final void mo51917a(boolean z, int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f67107ar = str;
        }
        if (C50510i.m108853a(i)) {
            this.f67106aq = i;
            this.f67120p.mo54790b(this.f67107ar == null ? getString(R.string.fvu) : this.f67107ar);
        }
    }

    /* renamed from: O */
    private boolean m61659O() {
        return this.f67110b.isCommentClose();
    }

    public final void aS_() {
        this.f67124t.aS_();
    }

    /* renamed from: j */
    public final String mo51789j() {
        return this.f67110b.getEventType();
    }

    /* renamed from: q */
    public final String mo51940q() {
        return this.f67110b.getAid();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public String mo51941r() {
        return this.f67110b.getAuthorUid();
    }

    /* renamed from: H */
    private boolean m61652H() {
        return C25282a.m61494a().isShowBarrageStyle(this.f67110b, this.f67111c);
    }

    /* renamed from: I */
    private boolean m61653I() {
        return C25282a.m61494a().isPersonalAweme(this.f67110b, this.f67111c);
    }

    /* renamed from: Q */
    private void m61661Q() {
        this.f67114j = null;
        this.f67095ae = false;
        if (this.f67125u != null) {
            this.f67125u.mo51312p();
        }
    }

    /* renamed from: x */
    private void m61694x() {
        this.f67120p.f66511h = new C25375h(this);
    }

    /* renamed from: e */
    public final void mo47031e() {
        C2667b.m7663a("comment", "info", 0);
        this.f67124t.mo47031e();
    }

    /* renamed from: k */
    public final int mo51790k() {
        if (this.f67095ae) {
            return 4;
        }
        if (this.f67114j != null) {
            return 3;
        }
        return 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo51925n() {
        this.f67067C = 0;
        m61648D();
        m61650F();
    }

    public void onStop() {
        if (mo51543c()) {
            m61691j(false);
        }
        super.onStop();
    }

    /* renamed from: s */
    public final void mo51889s() {
        this.f67127y.mo48228a("comment_ad_view_state", (Object) Integer.valueOf(1));
    }

    /* renamed from: A */
    private long m61646A() {
        if (this.f67111c == null || this.f67111c.getStatistics() == null) {
            return 0;
        }
        return this.f67111c.getStatistics().getDiggCount();
    }

    /* renamed from: N */
    private boolean m61658N() {
        if (!this.f67110b.isEnableComment() || C26503d.m64060c(this.f67111c)) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    private boolean m61660P() {
        if (this.f67111c == null || !this.f67111c.getAwemeControl().canComment()) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    private void m61662R() {
        if (this.f67099ai > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f67099ai;
            this.f67099ai = 0;
            C25207a.m61281a(this.f67110b.getEnterFrom(), this.f67111c, currentTimeMillis, "list");
        }
    }

    /* renamed from: V */
    private void m61666V() {
        if (this.f67070F != null) {
            this.f67066B = this.f67110b.getOnShowHeightChangeListener();
            this.f67070F.setMOnShowHeightChangeListener(this.f67066B);
            this.f67070F.mo51989b();
        }
    }

    /* renamed from: y */
    private void m61695y() {
        int i;
        if (getContext() != null) {
            ViewGroup viewGroup = this.f67103am;
            if (m61652H() || m61653I()) {
                i = 8;
            } else {
                i = 0;
            }
            viewGroup.setVisibility(i);
        }
    }

    /* renamed from: c */
    public final boolean mo51543c() {
        if (!isVisible() || this.f67070F == null || !this.f67070F.mo51988a()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo51791l() {
        if (!C20854a.m53167g().isLogin()) {
            return false;
        }
        if (this.f67091aa != null) {
            this.f67091aa.mo60714a(new C30332aw(20));
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        this.f67127y.mo48228a("comment_dialog_state", (Object) Integer.valueOf(8));
        C2667b.m7668c("comment", "info", 0);
    }

    /* renamed from: t */
    public int[] mo51942t() {
        int i;
        int i2 = -1;
        if (mo51543c()) {
            i2 = this.f67118n.mo4749j();
            i = this.f67118n.mo4751l();
        } else {
            i = -1;
        }
        return new int[]{i2, i};
    }

    /* renamed from: u */
    public void mo51943u() {
        if (this.f67070F != null) {
            this.f67070F.mo51990c();
            if (C26503d.m64071n(this.f67111c)) {
                this.f67127y.mo48228a("comment_dialog_state", (Object) Integer.valueOf(5));
            }
        }
    }

    /* renamed from: C */
    private void m61647C() {
        this.f67127y.mo48228a("comment_aweme_and_params", (Object) new C52847n(this.f67111c, this.f67110b));
        this.f67127y.mo48228a("comment_aweme_and_link", (Object) new C52847n(this.f67111c, C26428bm.m63902a(this.f67111c)));
    }

    /* renamed from: E */
    private Long m61649E() {
        Aweme aweme = this.f67111c;
        if (aweme == null) {
            aweme = C23324d.m57378a().getRawAdAwemeById(mo51940q());
        }
        if (aweme == null || aweme.getAwemeRawAd() == null || C26503d.m64064g(aweme)) {
            return null;
        }
        return aweme.getAwemeRawAd().getCreativeId();
    }

    /* renamed from: G */
    private void m61651G() {
        if (this.f67111c != null) {
            if (!this.f67111c.isAd() || this.f67110b.getAdCommentStruct() == null) {
                if (C26503d.m64071n(this.f67111c)) {
                    m61694x();
                }
                C26129j a = C25228f.m61349a(this.f67111c);
                if (a != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a);
                    this.f67120p.mo50303a(arrayList);
                }
            }
        }
    }

    /* renamed from: J */
    private boolean m61654J() {
        if (this.f67121q == null || this.f67121q.mo54803n() == null || ((C25182h) this.f67121q.mo54803n()).getData() == null || ((CommentItemList) ((C25182h) this.f67121q.mo54803n()).getData()).replyStyle != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    private void m61656L() {
        if (C26503d.m64071n(this.f67111c)) {
            C25281a provideCommentDependService_Monster = CommentDependServiceImpl.provideCommentDependService_Monster();
            Context context = getContext();
            C26138s a = C26428bm.m63902a(this.f67111c);
            if (provideCommentDependService_Monster != null && context != null && a != null) {
                provideCommentDependService_Monster.logAdLink(context, "show", a, this.f67111c, "");
            }
        }
    }

    /* renamed from: W */
    private void m61667W() {
        if (this.f67120p != null && !TextUtils.isEmpty(this.f67065A)) {
            List a = this.f67120p.mo50673a();
            if (a != null) {
                for (int i = 0; i < a.size(); i++) {
                    if (TextUtils.equals(this.f67065A, ((Comment) a.get(i)).getCid())) {
                        this.f67120p.notifyItemRangeChanged(i, 1);
                        this.f67065A = "";
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: v */
    private void m61692v() {
        if (C50510i.m108853a(this.f67106aq)) {
            this.f67106aq = 0;
            m61670a(m61686e(getString(R.string.a8z)));
            this.f67120p.mo54792d(R.string.fvt);
        }
        this.f67107ar = null;
    }

    /* renamed from: w */
    private void m61693w() {
        long j = 0;
        if (m61658N() && !m61659O() && this.f67111c != null) {
            AwemeStatistics statistics = this.f67111c.getStatistics();
            if (statistics != null) {
                long commentCount = statistics.getCommentCount();
                if (commentCount > 0) {
                    if (this.f67110b.getAdCommentStruct() != null) {
                        j = 1;
                    }
                    j += commentCount;
                } else {
                    j = commentCount;
                }
            }
        }
        m61687e(j);
        if (!this.f67110b.isForceHideKeyboard()) {
            m61683d(j);
        }
    }

    /* renamed from: o */
    public final boolean mo51926o() {
        if (!MTReplyWithVideoSettings.isEnable() || !m61654J() || this.f67114j == null || this.f67110b == null || !TextUtils.equals(this.f67110b.getAuthorUid(), C20854a.m53167g().getCurUserId())) {
            return false;
        }
        return true;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f67125u != null) {
            this.f67125u.mo51251r();
        }
        m61665U();
        if (this.f67100aj != null) {
            this.f67100aj.mo48256b(this.f67101ak).mo48256b(this.f67102al);
        }
        this.f67070F.setVisibleChangedListener(null);
    }

    public void onResume() {
        super.onResume();
        if (this.f67096af) {
            this.f67096af = false;
        } else if (mo51543c()) {
            m61691j(true);
        }
        this.f67127y.mo48228a("comment_dialog_state", (Object) Integer.valueOf(7));
    }

    /* renamed from: D */
    private void m61648D() {
        m61692v();
        if (m61658N() && !m61659O()) {
            this.f67121q.mo44934a_(Integer.valueOf(1), mo51940q(), Integer.valueOf(2), "", this.f67110b.getInsertCids(), m61649E(), Integer.valueOf(C23064c.m56602a(mo51789j())), C30228f.m70983g());
        }
    }

    /* renamed from: F */
    private void m61650F() {
        this.f67078O.setVisibility(8);
        this.f67079P.setVisibility(8);
        this.f67117m.setVisibility(8);
        this.f67116l.setVisibility(8);
        this.f67080Q.setVisibility(8);
        if (!m61658N()) {
            this.f67078O.setVisibility(0);
        } else if (m61659O()) {
            this.f67079P.setVisibility(0);
        } else {
            this.f67117m.setVisibility(0);
            this.f67116l.setVisibility(0);
            this.f67080Q.setVisibility(0);
        }
        if (this.f67125u != null) {
            this.f67125u.mo51279a();
        }
        m61695y();
    }

    /* renamed from: K */
    private void m61655K() {
        if (!this.f67097ag) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C47718bf.m103288a(new C30337f(1).mo60716a(activity.hashCode()));
                ((CommentViewModelImpl) C0214z.m440a(m61676b(getContext())).mo359a(CommentViewModelImpl.class)).f66375a.mo51737a();
                C23828a.f63480d = "1";
                this.f67097ag = true;
                m61656L();
            } else {
                return;
            }
        }
        m61691j(true);
    }

    /* renamed from: U */
    private void m61665U() {
        this.f67122r.mo46991S_();
        this.f67122r.aq_();
        this.f67121q.mo46991S_();
        this.f67121q.aq_();
        this.f67087X.mo46991S_();
        this.f67087X.aq_();
        this.f67088Y.mo51424e();
        this.f67123s.aq_();
        this.f67123s.mo46991S_();
        if (this.f67089Z != null) {
            this.f67089Z.mo46991S_();
            this.f67089Z.aq_();
            this.f67089Z = null;
        }
        this.f67095ae = false;
    }

    /* renamed from: z */
    private boolean m61696z() {
        if ((m61653I() || m61652H() || TextUtils.equals(this.f67110b.getEventType(), "homepage_familiar") || this.f67110b.isShowLikeUsers()) && ((this.f67111c != null && this.f67108as.contains(this.f67111c.getAid())) || m61646A() > 0 || !C9376b.m18558a((Collection<T>) this.f67110b.getLikeUsers()))) {
            return true;
        }
        return false;
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        String str;
        String str2 = "comment";
        String str3 = "info";
        if (C2667b.f8109a && C2667b.m7665a(str2, str3)) {
            if (TextUtils.isEmpty(str3)) {
                str = str2;
            } else {
                str = str3;
            }
            if (C2667b.f8110b.get(str) == null) {
                C2668c cVar = new C2668c();
                cVar.f8115a = str2;
                cVar.f8116b = str3;
                cVar.f8118d = -1;
                cVar.f8117c = 1;
                cVar.f8119e = System.currentTimeMillis();
                C2667b.f8110b.put(str, cVar);
            }
        }
        this.f67124t.mo47017R_();
        if (this.f67125u != null) {
            this.f67125u.mo51247d();
        }
        this.f67127y.mo48228a("comment_ad_view_state", (Object) Integer.valueOf(0));
    }

    public final void aJ_() {
        String str;
        if (this.f67120p != null) {
            List a = this.f67120p.mo50673a();
            if (m61678b(a)) {
                m61687e(1);
                m61675a((List<Comment>) new ArrayList<Comment>());
                this.f67124t.mo47018a(a, false);
                if (this.f67125u != null) {
                    this.f67125u.mo51246c();
                }
            } else {
                if (this.f67125u != null) {
                    this.f67125u.mo51246c();
                }
                ArrayList arrayList = new ArrayList();
                m61679c((List<Comment>) arrayList);
                m61684d((List<Comment>) arrayList);
                if (!C50510i.m108853a(this.f67106aq)) {
                    m61687e(0);
                }
                if (C50510i.m108853a(this.f67106aq)) {
                    if (this.f67107ar == null) {
                        str = getString(R.string.fvv);
                    } else {
                        str = this.f67107ar;
                    }
                    m61670a(m61686e(str));
                }
                this.f67124t.mo51966a((List<Comment>) arrayList);
            }
        }
    }

    public final void ar_() {
        if (this.f67121q != null) {
            this.f67121q.mo44934a_(Integer.valueOf(4), mo51940q(), Integer.valueOf(2), "", "", m61649E(), Integer.valueOf(C23064c.m56602a(mo51789j())), C30228f.m70983g());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo51939p() {
        String insertCids;
        String enterFrom = this.f67110b.getEnterFrom();
        Aweme aweme = this.f67111c;
        String str = "list";
        int isLongItem = C25282a.m61494a().getIsLongItem(getActivity());
        if (TextUtils.isEmpty(this.f67110b.getInsertCids())) {
            insertCids = null;
        } else {
            insertCids = this.f67110b.getInsertCids();
        }
        C25207a.m61282a(enterFrom, aweme, str, isLongItem, insertCids, this.f67110b.getEnterMethod(), this.f67110b.getPlayListType(), this.f67110b.getPlayListIdKey(), this.f67110b.getPlayListId(), this.f67110b.getPreviousPage(), this.f67110b.getTabName(), C23198ae.m56854b(this.f67111c, this.f67110b.getPageType()), this.f67110b.getPoiObjectId(), this.f67110b.getPoiRegionType(), this.f67110b.getCreationId(), this.f67110b.getHotPlayerMap());
    }

    /* renamed from: M */
    private void m61657M() {
        long j;
        this.f67097ag = false;
        if (C25945k.m62930u().booleanValue()) {
            if (this.f67085V != null) {
                this.f67085V.mo52992a();
            }
        } else if (C25945k.m62929t().booleanValue()) {
            if (this.f67084U != null) {
                this.f67084U.mo52923a();
            }
        } else if (this.f67082S != null) {
            this.f67082S.mo51531a();
        }
        if (C26503d.m64071n(this.f67111c)) {
            this.f67127y.mo48228a("comment_dialog_state", (Object) Integer.valueOf(5));
        }
        C23828a.f63480d = "0";
        if (this.f67094ad && this.f67069E != null) {
            C26129j adCommentStruct = this.f67110b.getAdCommentStruct();
            if (adCommentStruct != null) {
                List a = this.f67120p.mo50673a();
                if (!C9376b.m18558a((Collection<T>) a) && !(a.get(0) instanceof C26129j)) {
                    a.add(0, adCommentStruct);
                }
            }
        }
        m61691j(false);
        if (C10181b.m20511a().mo18172a(ShrinkVideoWhenCommentShowExperiment.class, true, "enable_comment_video_shrink", 31744, false)) {
            j = 300;
        } else {
            j = 150;
        }
        this.f67069E.postDelayed(new C25379l(this), j - 30);
        if (!TextUtils.isEmpty(this.f67065A)) {
            m61667W();
        }
        if (this.f67125u != null) {
            this.f67125u.mo51249j();
        }
    }

    /* renamed from: S */
    private void m61663S() {
        String insertCids = this.f67110b.getInsertCids();
        if (!TextUtils.isEmpty(insertCids)) {
            int i = 0;
            String str = insertCids.split(",")[0];
            List a = this.f67120p.mo50673a();
            int size = a.size();
            int i2 = 0;
            while (true) {
                int i3 = -1;
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                Comment comment = (Comment) a.get(i2);
                if (!TextUtils.equals(comment.getCid(), str) || comment.getStatus() == 0) {
                    i2++;
                } else {
                    C25243n nVar = this.f67126v;
                    if (nVar.f66845a != null && comment != null) {
                        int size2 = nVar.f66845a.size();
                        while (true) {
                            if (i >= size2) {
                                break;
                            } else if (TextUtils.equals(comment.getCid(), ((Comment) nVar.f66845a.get(i)).getCid())) {
                                i3 = i;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    this.f67069E.post(new C25380m(this, i3, comment));
                }
            }
            if (i2 < 0) {
                C10691a.m21548c(C11010c.m22280a(), (int) R.string.h_x).mo19066a();
            }
        }
    }

    /* renamed from: T */
    private void m61664T() {
        long j;
        this.f67122r = new C25178e();
        this.f67122r.mo54799a(new C25176d());
        this.f67122r.mo54800a(this);
        this.f67121q = new C25184j();
        C25182h hVar = new C25182h();
        if (this.f67111c != null) {
            AwemeStatistics statistics = this.f67111c.getStatistics();
            if (statistics != null) {
                j = statistics.getCommentCount();
                hVar.f66741f = j;
                this.f67121q.mo54799a(hVar);
                this.f67126v.mo51516a(this.f67110b.getInsertCids());
                ((C25182h) this.f67121q.mo54803n()).f66740e = this.f67126v;
                this.f67121q.mo54800a(this);
                this.f67087X = new C25181g();
                this.f67087X.mo54800a(this);
                this.f67087X.mo54799a(new C25179f());
                this.f67088Y = new C25175c();
                this.f67088Y.mo54800a(this);
                this.f67088Y.mo54799a(new C25179f());
                this.f67123s = new C25193s();
                this.f67123s.mo54800a(this);
                this.f67123s.mo54799a(new C25191q());
            }
        }
        j = 0;
        hVar.f66741f = j;
        this.f67121q.mo54799a(hVar);
        this.f67126v.mo51516a(this.f67110b.getInsertCids());
        ((C25182h) this.f67121q.mo54803n()).f66740e = this.f67126v;
        this.f67121q.mo54800a(this);
        this.f67087X = new C25181g();
        this.f67087X.mo54800a(this);
        this.f67087X.mo54799a(new C25179f());
        this.f67088Y = new C25175c();
        this.f67088Y.mo54800a(this);
        this.f67088Y.mo54799a(new C25179f());
        this.f67123s = new C25193s();
        this.f67123s.mo54800a(this);
        this.f67123s.mo54799a(new C25191q());
    }

    /* renamed from: a */
    public void mo51914a(long j) {
        m61687e(this.f67067C + j);
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
        this.f67124t.mo47024a_(exc);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo51918b(long j) throws Exception {
        m61688f(j);
        return null;
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        this.f67124t.mo47028c(exc);
    }

    /* renamed from: e */
    public final void mo51451e(Exception exc) {
        this.f67068D = null;
        this.f67113e = null;
    }

    @C53771m
    public void onAfterLoginInEvent(C23488g gVar) {
        if (this.f67080Q != null) {
        }
    }

    @C53771m
    public void onEvent(C36620c cVar) {
        mo51916a(true);
    }

    /* renamed from: a */
    private void m61670a(View view) {
        this.f67105ap.mo19231b(view);
        this.f67116l.setBuilder(this.f67105ap);
    }

    /* renamed from: d */
    private void m61685d(boolean z) {
        this.f67067C = 0;
        m61648D();
        m61650F();
        if (z) {
            m61661Q();
        }
    }

    @C53771m
    public void onAwesomeSplashEvent(C26216b bVar) {
        if (bVar.f69221a != 4) {
            mo51916a(true);
        }
    }

    @C53771m
    public void onEvent(C23484c cVar) {
        if (!(this.f67080Q == null || this.f67120p == null)) {
            this.f67120p.notifyDataSetChanged();
        }
    }

    public void onHiddenChanged(boolean z) {
        if (z) {
            m61657M();
        } else {
            m61655K();
        }
        super.onHiddenChanged(z);
    }

    /* renamed from: a */
    public static C25367g m61669a(Context context) {
        FragmentActivity b = m61676b(context);
        if (b == null) {
            return null;
        }
        Fragment a = b.getSupportFragmentManager().mo2224a("comment");
        if (a instanceof C25367g) {
            return (C25367g) a;
        }
        return null;
    }

    /* renamed from: b */
    static FragmentActivity m61676b(Context context) {
        while (context != null) {
            if (context instanceof FragmentActivity) {
                return (FragmentActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: d */
    public final void mo51921d(Comment comment) {
        this.f67068D = comment;
        this.f67123s.mo44934a_(comment.getAwemeId(), comment.getCid(), Boolean.valueOf(true));
    }

    /* renamed from: e_ */
    public final void mo51785e_(boolean z) {
        String str;
        if (z) {
            C32403c e = C23794bh.m58391e();
            String enterFrom = this.f67110b.getEnterFrom();
            Aweme h = mo51787h();
            String str2 = "list";
            if (this.f67114j != null) {
                str = "click_reply";
            } else {
                str = "click_original";
            }
            e.mo65597b(enterFrom, h, str2, str);
        }
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str == null) {
            return;
        }
        if (str.contains("/aweme/v1/comment/list/?") || str.contains("/aweme/v2/comment/list/?")) {
            C47718bf.m103293f(aVar);
            mo51925n();
        }
    }

    @C53771m
    public void onEvent(C25065b bVar) {
        if (this.f67069E != null && TextUtils.equals(bVar.f66397a, mo51940q())) {
            this.f67069E.mo4814b(0);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C25069a.m60927a("CommentListFragment onSaveInstanceState");
        bundle.putBoolean("should_hide", true);
        bundle.putSerializable("page_param", this.f67110b);
    }

    /* renamed from: a */
    private void m61674a(Aweme aweme) {
        this.f67111c = aweme;
        this.f67094ad = false;
        if (this.f67111c != null && this.f67111c.isAd()) {
            AwemeRawAd awemeRawAd = this.f67111c.getAwemeRawAd();
            if (awemeRawAd != null) {
                this.f67094ad = awemeRawAd.isCommentAreaSwitch();
            }
        }
        if (aweme.getUserDigg() == 1) {
            this.f67108as.add(aweme.getAid());
        }
    }

    /* renamed from: b */
    private static C25367g m61677b(C25171f fVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("id", fVar);
        C25367g gVar = new C25367g();
        gVar.setArguments(bundle);
        return gVar;
    }

    /* renamed from: c */
    private CommentLikeUsersStruct m61679c(List<Comment> list) {
        if (!m61696z()) {
            return null;
        }
        CommentLikeUsersStruct commentLikeUsersStruct = new CommentLikeUsersStruct();
        commentLikeUsersStruct.setCommentType(220);
        commentLikeUsersStruct.setDialogHeight(this.f67128z.getHeight());
        commentLikeUsersStruct.setEventType(this.f67110b.getEventType());
        commentLikeUsersStruct.setLikeUsers(this.f67110b.getLikeUsers());
        commentLikeUsersStruct.setLikeUsersCount(m61646A());
        commentLikeUsersStruct.setAweme(this.f67111c);
        if (list != null) {
            list.add(0, commentLikeUsersStruct);
        }
        return commentLikeUsersStruct;
    }

    /* renamed from: d */
    private int m61682d(String str) {
        C25243n nVar = this.f67126v;
        if (!C9376b.m18558a((Collection<T>) nVar.f66845a)) {
            for (Comment comment : nVar.f66845a) {
                if (TextUtils.equals(comment.getCid(), str)) {
                    return (int) (comment.getReplyCommentTotal() + 1);
                }
            }
        }
        return 1;
    }

    /* renamed from: e */
    private static View m61686e(String str) {
        int i;
        Context a = C11010c.m22280a();
        if (C25112e.m61020a()) {
            i = R.color.axd;
        } else {
            i = R.color.a8g;
        }
        int c = C0726c.m2098c(a, i);
        DmtTextView dmtTextView = new DmtTextView(new C1221d(a, R.style.tf));
        dmtTextView.setTextColor(c);
        dmtTextView.setText(str);
        return dmtTextView;
    }

    /* renamed from: i */
    private long m61690i(boolean z) {
        long f = this.f67121q.mo51442f();
        if (!this.f67094ad) {
            return f;
        }
        List a = this.f67120p.mo50673a();
        if (!C9376b.m18558a((Collection<T>) a)) {
            if (z) {
                f++;
            } else if (!(a.get(0) instanceof C26129j)) {
                f++;
            }
        }
        if (this.f67111c == null || this.f67111c.getAdCommentStruct() == null || f <= 0) {
            return f;
        }
        return f + 1;
    }

    /* renamed from: f */
    public final void mo51924f(Comment comment) {
        if (isAdded()) {
            if (this.f67114j == null || !this.f67114j.equals(comment)) {
                this.f67114j = comment;
                if (this.f67125u != null) {
                    this.f67125u.mo51241a(comment.getUser());
                }
            } else {
                this.f67114j = comment;
                this.f67117m.performClick();
            }
            if (mo51926o()) {
                this.f67074J.setVisibility(0);
                this.f67073I.setVisibility(8);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        FragmentInstrumentation.onCreate("com.ss.android.ugc.aweme.comment.ui.CommentListFragment");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f67110b = (C25171f) arguments.getSerializable("id");
        }
        this.f67125u = new C25156f(this, hashCode(), this);
    }

    @C53771m
    public void onEvent(C25710b bVar) {
        if (bVar != null) {
            if (bVar.f68020a == 1) {
                mo51943u();
                return;
            }
            if (this.f67109at) {
                this.f67109at = false;
                m61666V();
            }
        }
    }

    /* renamed from: a */
    private void m61673a(CommentPrompt commentPrompt) {
        if (commentPrompt.getType() > 0) {
            this.f67083T.setVisibility(0);
            this.f67083T.setText(commentPrompt.getContent());
            LayoutParams layoutParams = (LayoutParams) this.f67071G.getLayoutParams();
            layoutParams.setMargins(0, C23728o.m58241a(12.0d), 0, C23728o.m58241a(4.0d));
            this.f67071G.setLayoutParams(layoutParams);
            return;
        }
        this.f67083T.setVisibility(8);
        LayoutParams layoutParams2 = (LayoutParams) this.f67071G.getLayoutParams();
        layoutParams2.setMargins(0, C23728o.m58241a(12.0d), 0, C23728o.m58241a(12.0d));
        this.f67071G.setLayoutParams(layoutParams2);
    }

    /* renamed from: b */
    private static boolean m61678b(List<Comment> list) {
        if (C9376b.m18558a((Collection<T>) list) || !(list.get(0) instanceof C26129j)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m61680c(String str) {
        if (getView() != null) {
            View findViewById = getView().findViewById(R.id.e5n);
            if (findViewById != null) {
                Aweme awemeById = C23324d.m57378a().getAwemeById(str);
                List donationAnchor = C25282a.m61494a().getDonationAnchor(awemeById);
                if (donationAnchor == null || donationAnchor.size() <= 0) {
                    findViewById.setVisibility(8);
                    return;
                }
                findViewById.setVisibility(0);
                C25239k.f66838a.mo51508a(C29981aa.m70153a().mo60161a(this.f67110b.getRequestId()), this.f67110b.getEnterFrom(), findViewById, awemeById, this.f67128z);
            }
        }
    }

    /* renamed from: d */
    private void m61683d(long j) {
        boolean z;
        if (!TextUtils.equals("click_comment_chain", this.f67110b.getEventType()) && !TextUtils.equals("click_comment_bubble", this.f67110b.getEventType())) {
            if (j != 0 || !m61660P()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.f67125u != null && !this.f67125u.mo51305f()) {
                    this.f67125u.mo51287a(this.f67117m.getHint(), false);
                }
                C26890h.m65011a("keyboard_open", C23089d.m56640a().mo47829a("keyboard_open", "1").mo47827a("comment_cnt", j).f61491a);
                return;
            }
            C26890h.m65011a("keyboard_open", C23089d.m56640a().mo47829a("keyboard_open", "0").mo47827a("comment_cnt", j).f61491a);
        }
    }

    /* renamed from: e */
    private void m61687e(long j) {
        int i;
        this.f67067C = j;
        if (j == 0) {
            this.f67071G.setText(C11010c.m22280a().getString(R.string.de));
        } else {
            TextView textView = this.f67071G;
            Context a = C11010c.m22280a();
            if (j > 1) {
                i = R.string.a9n;
            } else {
                i = R.string.a9o;
            }
            textView.setText(a.getString(i, new Object[]{C33095b.m76068a(j)}));
        }
        C25224d.m61330a(mo51940q(), j);
    }

    /* renamed from: j */
    private void m61691j(boolean z) {
        if (z) {
            if (this.f67098ah == 0) {
                if (this.f67104ao) {
                    C0013i.m18a((Callable<TResult>) new C25377j<TResult>(this), (Executor) C24076h.m58904e());
                } else {
                    mo51939p();
                }
                this.f67098ah = System.currentTimeMillis();
            }
        } else if (this.f67098ah != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f67098ah;
            this.f67098ah = 0;
            if (currentTimeMillis >= 0) {
                if (this.f67104ao) {
                    C0013i.m18a((Callable<TResult>) new C25378k<TResult>(this, currentTimeMillis), (Executor) C24076h.m58904e());
                } else {
                    m61688f(currentTimeMillis);
                }
            } else {
                return;
            }
        }
        if (this.f67120p != null) {
            this.f67120p.mo51188a(z);
        }
        if (f67063w && this.f67120p != null && !C9376b.m18558a((Collection<T>) this.f67120p.mo50673a())) {
            this.f67069E.mo4814b(0);
        }
        f67063w = false;
    }

    /* renamed from: f */
    public final void mo51786f(boolean z) {
        if (z) {
            this.f67114j = null;
            this.f67095ae = false;
        }
        m61662R();
        this.f67124t.mo51967a(false, (Comment) null);
        if (this.f67070F != null && this.f67070F.getBackFromVideo()) {
            this.f67070F.setBackFromVideo(false);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m61647C();
        this.f67117m.setKeyListener(null);
        this.f67118n = new WrapLinearLayoutManager(getActivity());
        this.f67069E.setLayoutManager(this.f67118n);
        m61664T();
        if (bundle != null) {
            this.f67096af = bundle.getBoolean("should_hide", false);
            if (this.f67096af) {
                mo51916a(false);
            }
            Serializable serializable = bundle.getSerializable("page_param");
            if (serializable instanceof C25171f) {
                this.f67110b = (C25171f) serializable;
                this.f67111c = C23324d.m57378a().getAwemeById(mo51940q());
            }
        }
        m61681c(true);
    }

    @C53771m
    public void onEvent(C30322am amVar) {
        this.f67109at = mo51543c();
        mo51916a(true);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onUsernameUpdatedEvent(C25068e eVar) {
        if (this.f67120p != null) {
            List a = this.f67120p.mo50673a();
            if (a != null) {
                User curUser = C20854a.m53167g().getCurUser();
                int[] iArr = {-1, -1};
                for (int i = 0; i < a.size(); i++) {
                    User user = ((Comment) a.get(i)).getUser();
                    if (user != null && TextUtils.equals(user.getUid(), curUser.getUid())) {
                        user.setUniqueId(curUser.getUniqueId());
                        if (iArr[0] == -1) {
                            iArr[0] = i;
                        }
                        iArr[1] = i;
                    }
                }
                if (iArr[0] >= 0) {
                    this.f67120p.notifyItemRangeChanged(iArr[0], (iArr[1] - iArr[0]) + 1);
                }
            }
        }
    }

    /* renamed from: a */
    private void m61675a(List<Comment> list) {
        if (this.f67111c != null) {
            if (!this.f67111c.isAd() || this.f67110b.getAdCommentStruct() == null) {
                List a = this.f67120p.mo50673a();
                if (m61678b(a)) {
                    list.addAll(0, a);
                }
            }
        }
    }

    /* renamed from: c */
    private void m61681c(boolean z) {
        this.f67120p = new C25102a(this, this.f67110b);
        this.f67120p.mo50303a(new ArrayList());
        this.f67120p.mo51185a(this.f67111c);
        this.f67120p.f66506c = this;
        this.f67120p.f66505b = this.f67110b.getCommentTag();
        this.f67120p.mo54788a((C26846a) this);
        this.f67120p.f66508e = this.f67110b.getRequestId();
        this.f67120p.f70682s = C0726c.m2098c(C11010c.m22280a(), R.color.jl);
        this.f67120p.f66509f = this.f67126v;
        if (this.f67111c != null) {
            User author = this.f67111c.getAuthor();
            if (author != null && author.getCommentFilterStatus() == 1) {
                this.f67120p.mo54792d(R.string.bwr);
                this.f67120p.f66510g = true;
            }
        }
        if (this.f67125u != null) {
            this.f67125u.mo51313q();
        }
        this.f67119o = new C27718c(this.f67120p);
        this.f67069E.setAdapter(this.f67119o);
        m61651G();
        this.f67120p.f66512i = this.f67127y;
        this.f67124t.f67168a = mo51940q();
        m61685d(z);
    }

    /* renamed from: d */
    private void m61684d(List<Comment> list) {
        if (m61652H() || m61653I()) {
            CommentLikeUsersStruct commentLikeUsersStruct = new CommentLikeUsersStruct();
            commentLikeUsersStruct.setCommentType(221);
            if (this.f67111c != null) {
                commentLikeUsersStruct.setAwemeId(this.f67111c.getAid());
                if (TextUtils.isEmpty(this.f67111c.getDesc())) {
                    commentLikeUsersStruct.setText(getString(R.string.fqf));
                } else {
                    commentLikeUsersStruct.setText(this.f67111c.getDesc());
                }
                commentLikeUsersStruct.setTextExtra(this.f67111c.getTextExtra());
                commentLikeUsersStruct.setCreateTime((int) this.f67111c.getCreateTime());
                commentLikeUsersStruct.setUser(this.f67111c.getAuthor());
                commentLikeUsersStruct.setAweme(this.f67111c);
            }
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    i = -1;
                    break;
                }
                Comment comment = (Comment) list.get(i);
                if (((Comment) list.get(i)).getCommentType() != 10 && ((Comment) list.get(i)).getCommentType() != 12 && comment.getCommentType() != 220) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                list.add(commentLikeUsersStruct);
                return;
            }
            list.add(i, commentLikeUsersStruct);
        }
    }

    /* renamed from: f */
    private void m61688f(long j) {
        String str;
        String enterFrom = this.f67110b.getEnterFrom();
        String q = mo51940q();
        boolean isHotPlayer = this.f67110b.isHotPlayer();
        C52711k.m112240b(enterFrom, "enterFrom");
        C52711k.m112240b(q, "aid");
        C23089d a = C25208b.m61297a(enterFrom, q).mo47827a("duration", j);
        String str2 = "is_fullscreen";
        if (isHotPlayer) {
            str = "0";
        } else {
            str = "1";
        }
        C23089d a2 = a.mo47829a(str2, str);
        if (TextUtils.equals(enterFrom, "homepage_fresh_topic")) {
            a2.mo47829a("enter_from", "homepage_fresh_topic");
        } else {
            String str3 = "enter_from";
            if (isHotPlayer) {
                enterFrom = "trending_page";
            }
            a2.mo47829a(str3, enterFrom);
        }
        C26890h.m65011a("close_comment", a2.f61491a);
        C26890h.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName("comment_page").setExtValueString(q).setValue(String.valueOf(j)));
        C26890h.m65004a(C11010c.m22280a(), "close_comment", "click_shadow", 0, 0);
        C2667b.m7668c("comment", "info", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m61689h(boolean r10) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.comment.adapter.a r0 = r9.f67120p
            java.util.List r1 = r0.f70670n
            r2 = 0
            if (r1 == 0) goto L_0x0036
            java.util.List r1 = r0.f70670n
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0036
            r1 = 0
        L_0x0010:
            java.util.List r3 = r0.f70670n
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0036
            java.util.List r3 = r0.f70670n
            java.lang.Object r3 = r3.get(r1)
            com.ss.android.ugc.aweme.comment.model.Comment r3 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r3
            int r4 = r3.getCommentType()
            r5 = 10
            if (r4 == r5) goto L_0x0034
            int r3 = r3.getCommentType()
            r4 = 12
            if (r3 != r4) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            int r1 = r1 + 1
            goto L_0x0010
        L_0x0034:
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x00c8
            com.ss.android.ugc.aweme.familiar.service.b r0 = com.p683ss.android.ugc.aweme.familiar.service.C29650b.f77509a
            boolean r0 = r0.isShowPushNotificationInComment()
            if (r0 == 0) goto L_0x00c8
            android.support.v4.app.FragmentActivity r0 = r9.getActivity()
            if (r0 == 0) goto L_0x00c8
            com.ss.android.ugc.aweme.familiar.service.b r0 = com.p683ss.android.ugc.aweme.familiar.service.C29650b.f77509a
            android.support.v4.app.FragmentActivity r1 = r9.getActivity()
            boolean r0 = r0.checkShowPushNotificationGuide(r1)
            if (r0 == 0) goto L_0x00c8
            com.ss.android.ugc.aweme.discover.a.c r0 = r9.f67119o
            java.util.List r0 = r0.mo56147b()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c8
            com.ss.android.ugc.aweme.familiar.service.b r0 = com.p683ss.android.ugc.aweme.familiar.service.C29650b.f77509a
            android.support.v4.app.FragmentActivity r1 = r9.getActivity()
            com.ss.android.ugc.aweme.familiar.a.b r0 = r0.getPushNotificationGuide(r1)
            if (r0 == 0) goto L_0x00c8
            com.ss.android.ugc.aweme.familiar.a.f r1 = new com.ss.android.ugc.aweme.familiar.a.f
            com.ss.android.ugc.aweme.comment.f.f r3 = r9.f67110b
            java.lang.String r4 = r3.getEventType()
            java.lang.String r5 = ""
            com.ss.android.ugc.aweme.comment.f.f r3 = r9.f67110b
            java.lang.String r6 = r3.getAid()
            com.ss.android.ugc.aweme.comment.f.f r3 = r9.f67110b
            java.lang.String r7 = r3.getAuthorUid()
            java.lang.String r8 = ""
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r0.setPushNotificationParams(r1)
            com.ss.android.ugc.aweme.comment.ui.g$3 r1 = new com.ss.android.ugc.aweme.comment.ui.g$3
            r1.<init>(r0)
            r0.setInternalClickerListener(r1)
            if (r10 == 0) goto L_0x0099
            android.support.v7.widget.RecyclerView r10 = r9.f67069E
            r10.mo4833d(r2)
        L_0x0099:
            com.ss.android.ugc.aweme.discover.a.c r10 = r9.f67119o
            java.util.ArrayList<com.ss.android.ugc.aweme.discover.a.k> r1 = r10.f72749a
            int r1 = r1.size()
            if (r1 < 0) goto L_0x00c7
            java.util.ArrayList<com.ss.android.ugc.aweme.discover.a.k> r2 = r10.f72749a
            int r2 = r2.size()
            if (r1 <= r2) goto L_0x00ac
            goto L_0x00c7
        L_0x00ac:
            if (r0 == 0) goto L_0x00c8
            com.ss.android.ugc.aweme.discover.a.l r2 = r10.f72751c
            int r2 = r2.mo56168a()
            com.ss.android.ugc.aweme.discover.a.k r3 = new com.ss.android.ugc.aweme.discover.a.k
            r3.<init>(r2, r0)
            java.util.ArrayList<com.ss.android.ugc.aweme.discover.a.k> r0 = r10.f72749a
            r0.add(r3)
            android.support.v4.f.o<com.ss.android.ugc.aweme.discover.a.k> r0 = r10.f72750b
            r0.mo2595b(r2, r3)
            r10.notifyItemInserted(r1)
            goto L_0x00c8
        L_0x00c7:
            return
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.m61689h(boolean):void");
    }

    /* renamed from: e */
    public final void mo51923e(Comment comment) {
        if (isAdded() && this.f67125u != null) {
            this.f67095ae = true;
            this.f67114j = comment;
            this.f67125u.mo51248h();
            C23794bh.m58391e().mo65593a(this.f67110b.getEnterFrom(), mo51787h(), "list", "click_reply_comment");
        }
    }

    @C53771m
    public void onDiggUpdateEvent(C30332aw awVar) {
        if (awVar.f79228a == 13 && (awVar.f79229b instanceof String)) {
            String str = (String) awVar.f79229b;
            if (this.f67108as.contains(str)) {
                this.f67108as.remove(str);
                if (m61646A() < 1) {
                    C25102a aVar = (C25102a) this.f67124t.mo51968b();
                    if (!(aVar == null || aVar.mo50673a() == null)) {
                        Iterator it = aVar.mo50673a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Comment comment = (Comment) it.next();
                            if (comment.getCommentType() == 220) {
                                aVar.mo50673a().remove(comment);
                                break;
                            }
                        }
                        aVar.notifyDataSetChanged();
                    }
                }
            } else {
                this.f67108as.add(str);
                C25393z zVar = this.f67124t;
                CommentLikeUsersStruct c = m61679c(null);
                if (c != null) {
                    C25102a aVar2 = (C25102a) zVar.mo51968b();
                    if (aVar2 != null && aVar2.mo50673a() != null) {
                        List a = aVar2.mo50673a();
                        int i = 0;
                        while (true) {
                            if (i >= a.size() || ((Comment) a.get(i)).getCommentType() == 220) {
                                break;
                            } else if (((Comment) a.get(i)).getCommentType() == 221) {
                                a.add(i, c);
                                break;
                            } else if (((Comment) a.get(i)).getCommentType() == 1) {
                                a.add(i, c);
                                break;
                            } else {
                                i++;
                            }
                        }
                        aVar2.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    @C53771m
    public void onEvent(C32385a aVar) {
        String str;
        if (aVar != null) {
            boolean z = true;
            if (aVar.f84279d == 1) {
                if (aVar.f84276a != null) {
                    if (hashCode() == aVar.f84280e) {
                        int[] t = mo51942t();
                        Comment comment = aVar.f84276a.getComment();
                        this.f67124t.mo51964a(comment, t[0], t[1], true);
                        if (comment.getCommentType() == 2) {
                            z = false;
                        }
                        m61689h(z);
                    }
                    m61661Q();
                    mo51914a(1);
                }
                if (aVar.f84280e == hashCode()) {
                    C32403c e = C23794bh.m58391e();
                    String enterFrom = this.f67110b.getEnterFrom();
                    Aweme aweme = aVar.f84278c;
                    String str2 = "list";
                    if (this.f67095ae) {
                        str = "click_reply_comment";
                    } else {
                        str = "click_comment";
                    }
                    e.mo65594a(enterFrom, aweme, str2, str, true);
                }
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onReportCommentEvent(C29906l lVar) {
        try {
            if (TextUtils.equals("commentReportSuccess", lVar.f78045b.getString("eventName"))) {
                String string = lVar.f78045b.getJSONObject("data").getString("object_id");
                mo51914a((long) (-m61682d(string)));
                this.f67124t.mo51535a(string);
                C47718bf.m103288a(new C25064a(4, new Object[]{mo51940q(), string}));
                C25182h hVar = (C25182h) this.f67121q.mo54803n();
                if (hVar != null) {
                    CommentItemList commentItemList = (CommentItemList) hVar.getData();
                    if (!(commentItemList == null || commentItemList.replyStyle == 2)) {
                        C25393z zVar = this.f67124t;
                        if (zVar.mo51968b() instanceof C25102a) {
                            C25102a aVar = (C25102a) zVar.mo51968b();
                            if (aVar.mo48636c() != 0) {
                                if (!TextUtils.isEmpty(string)) {
                                    Iterator it = aVar.f70670n.iterator();
                                    boolean z = false;
                                    while (it.hasNext()) {
                                        Comment comment = (Comment) it.next();
                                        if (!C9376b.m18558a((Collection<T>) comment.getReplyComments())) {
                                            Comment comment2 = (Comment) comment.getReplyComments().get(0);
                                            if (comment2 != null && TextUtils.equals(comment2.getCid(), string)) {
                                                it.remove();
                                                z = true;
                                            }
                                        }
                                    }
                                    if (z) {
                                        aVar.notifyDataSetChanged();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo51920c(long j) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            String q = mo51940q();
            String str = "group_id";
            if (q == null) {
                q = "";
            }
            jSONObject.put(str, q);
            C23955a.f63625b = SystemClock.uptimeMillis() - j;
            jSONObject.put("duration", String.valueOf(C23955a.f63625b));
            jSONObject.put("when", C48121w.m104249M().mo95256n() + (((long) C25209c.f66789c) * C25209c.f66790d));
            jSONObject.put("repeat", C25209c.f66789c);
        } catch (JSONException unused) {
        }
        C18894a.m46006a("comment_list", jSONObject);
        return null;
    }

    /* renamed from: d */
    public final void mo51534d(Exception exc) {
        C25207a.m61285a(this.f67110b.getEnterFrom(), this.f67111c, null, false, "list", this.f67093ac, null, null, null);
    }

    /* renamed from: e */
    public final void mo51784e(boolean z) {
        this.f67099ai = System.currentTimeMillis();
        C25207a.m61283a(this.f67110b.getEnterFrom(), this.f67111c, C25207a.m61278a(this.f67114j), "list");
        if (this.f67114j != null) {
            this.f67124t.mo51967a(true, this.f67114j);
        }
    }

    /* renamed from: a */
    private void m61671a(C25171f fVar) {
        Aweme aweme;
        boolean z;
        boolean z2;
        int i = 0;
        boolean z3 = true;
        if (TextUtils.equals(fVar.getAid(), mo51940q()) && fVar.isCommentClose() == this.f67110b.isCommentClose() && fVar.isCommentLimited() == this.f67110b.isCommentLimited() && fVar.isEnableComment() == this.f67110b.isEnableComment()) {
            if (fVar == null || fVar.getAdCommentStruct() == null) {
                aweme = null;
            } else {
                aweme = C23324d.m57378a().getRawAdAwemeById(fVar.getAdCommentStruct().getAid());
            }
            if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null || !aweme.getAwemeRawAd().isCommentAreaSwitch()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f67094ad != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
            }
        }
        this.f67110b = fVar;
        m61693w();
        m61680c(this.f67110b.getAid());
        if (z3 || this.f67069E.getChildCount() == 0 || this.f67094ad) {
            m61665U();
            m61664T();
            if (this.f67126v != null) {
                this.f67126v.mo51527d();
                this.f67124t.aJ_();
            }
            m61681c(z3);
            C25212a.m61315a().mo51475b();
            m61647C();
            m61673a(new CommentPrompt());
            return;
        }
        if (this.f67110b.isForceRefresh()) {
            m61648D();
        }
        m61650F();
        m61647C();
        C25102a aVar = (C25102a) this.f67124t.mo51968b();
        if (aVar != null && aVar.mo50673a() != null) {
            List a = aVar.mo50673a();
            while (true) {
                if (i >= a.size()) {
                    i = -1;
                    break;
                } else if (((Comment) a.get(i)).getCommentType() == 221) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                aVar.notifyItemChanged(i);
            }
        }
    }

    /* renamed from: b */
    public final void mo51781b(Comment comment) {
        boolean z;
        String str;
        String str2;
        Comment comment2 = null;
        if (this.f67111c != null && this.f67111c.isAd()) {
            if (TextUtils.equals(mo51789j(), "general_search")) {
                C25281a a = C25282a.m61494a();
                Context context = getContext();
                Aweme aweme = this.f67111c;
                if (!C26503d.m64061d(this.f67111c) || this.f67110b == null || !this.f67110b.isEnterFullScreen()) {
                    str2 = "result_ad";
                } else {
                    str2 = "draw_ad";
                }
                a.sendAdLog(context, aweme, str2, "comment");
            } else {
                C25282a.m61494a().logFeedRawAdComment(getContext(), this.f67111c, null);
                ReportFeedAdAction.f69464a.mo54011a(this.f67111c, 1, this.f67110b.getEnterFrom());
            }
        }
        if (!(comment == null || comment.getReplyComments() == null)) {
            List<TextExtraStruct> textExtra = comment.getTextExtra();
            if (!(textExtra == null || this.f67125u == null)) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    Iterator it = this.f67125u.f66587c.iterator();
                    while (it.hasNext()) {
                        User user = (User) it.next();
                        if (TextUtils.equals(user.getUid(), textExtraStruct.getUserId())) {
                            if (user.getAtType() == 3) {
                                str = "follow";
                            } else if (user.getAtType() == 1) {
                                str = "search";
                            } else if (user.getAtType() == 4) {
                                str = "recent";
                            } else {
                                str = null;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                C25207a.m61287a(str, mo51940q(), user.getUid());
                            }
                        }
                    }
                }
            }
        }
        int[] t = mo51942t();
        this.f67124t.mo51963a(comment, t[0], t[1]);
        if (this.f67111c != null) {
            C30230b a2 = C30230b.m70993a();
            String q = mo51940q();
            if (C30230b.m70994c()) {
                C30234c cVar = (C30234c) a2.f78968g.mo60571a(q);
                if (cVar != null) {
                    a2.f78964c++;
                    cVar.f78978c = 1;
                }
            }
        }
        mo51914a(1);
        if (comment.getCommentType() != 2) {
            z = true;
        } else {
            z = false;
        }
        m61689h(z);
        Object[] objArr = new Object[2];
        objArr[0] = mo51940q();
        if (comment != null) {
            comment2 = comment.clone();
        }
        objArr[1] = comment2;
        C47718bf.m103288a(new C25064a(3, objArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0135, code lost:
        if (r9 == null) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014c, code lost:
        if (r9 == null) goto L_0x014e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51783c(com.p683ss.android.ugc.aweme.comment.model.Comment r9) {
        /*
            r8 = this;
            int[] r0 = r8.mo51942t()
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r8.f67114j
            if (r1 == 0) goto L_0x0070
            boolean r1 = r8.f67095ae
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r9.getReplyId()
            java.lang.String r2 = r9.getReplyToReplyCommentId()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0020
            int r1 = r9.getCommentType()
            if (r1 != 0) goto L_0x0070
        L_0x0020:
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r8.f67114j
            java.lang.String r1 = com.p683ss.android.ugc.aweme.comment.model.Comment.getAuthorUid(r1)
            r9.setReplyToUserId(r1)
            boolean r1 = r8.f67095ae
            if (r1 == 0) goto L_0x0041
            int r1 = r9.getCommentType()
            if (r1 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r8.f67114j
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103650b(r1)
            r9.setReplyToUserName(r1)
            goto L_0x0063
        L_0x0041:
            int r1 = r9.getCommentType()
            r2 = 2
            if (r1 != r2) goto L_0x0063
            java.lang.String r1 = r9.getReplyId()
            java.lang.String r2 = r9.getReplyToReplyCommentId()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0063
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r8.f67114j
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103650b(r1)
            r9.setReplyToUserName(r1)
        L_0x0063:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.ss.android.ugc.aweme.comment.model.Comment r2 = r8.f67114j
            r1.add(r2)
            r9.setReplyComments(r1)
        L_0x0070:
            com.ss.android.ugc.aweme.comment.o r1 = com.p683ss.android.ugc.aweme.comment.C25273o.f66859b
            boolean r1 = r1.mo51550e(r9)
            if (r1 != 0) goto L_0x007f
            com.ss.android.ugc.aweme.comment.o r1 = com.p683ss.android.ugc.aweme.comment.C25273o.f66859b
            com.ss.android.ugc.aweme.comment.model.Comment r2 = r8.f67114j
            r1.mo51546a(r9, r2)
        L_0x007f:
            com.ss.android.ugc.aweme.comment.ui.z r1 = r8.f67124t
            r2 = 0
            r2 = r0[r2]
            r2 = 1
            r0 = r0[r2]
            com.ss.android.ugc.aweme.comment.o r0 = com.p683ss.android.ugc.aweme.comment.C25273o.f66859b
            boolean r0 = r0.mo51547a(r9)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0093
            r1.mo51969b(r9)
        L_0x0093:
            com.ss.android.ugc.aweme.comment.o r2 = com.p683ss.android.ugc.aweme.comment.C25273o.f66859b
            boolean r2 = r2.mo51550e(r9)
            if (r2 != 0) goto L_0x00a0
            com.ss.android.ugc.aweme.comment.o r2 = com.p683ss.android.ugc.aweme.comment.C25273o.f66859b
            r2.mo51549d(r9)
        L_0x00a0:
            if (r0 != 0) goto L_0x00a5
            r1.mo51962a(r9)
        L_0x00a5:
            r8.m61661Q()
            java.lang.Boolean r0 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62930u()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.commercialize.egg.f.a r0 = r8.f67085V
            if (r0 == 0) goto L_0x0185
            com.ss.android.ugc.aweme.commercialize.egg.f.a r0 = r8.f67085V
            com.ss.android.ugc.aweme.commercialize.egg.e.d r1 = new com.ss.android.ugc.aweme.commercialize.egg.e.d
            java.lang.String r2 = "comment"
            java.lang.String r9 = r9.getText()
            java.lang.String r3 = r8.mo51789j()
            r1.<init>(r2, r9, r3)
            r0.mo52993a(r1)
            android.widget.ImageView r9 = r8.f67072H
            r9.bringToFront()
            return
        L_0x00d0:
            java.lang.Boolean r0 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62929t()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x016d
            com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout r0 = r8.f67084U
            if (r0 == 0) goto L_0x0185
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f67111c
            if (r0 == 0) goto L_0x0185
            java.lang.String r9 = r9.getText()
            com.ss.android.ugc.aweme.commercialize.egg.b r0 = com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.m62388a(r9)
            com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout r1 = r8.f67084U
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f67111c
            java.lang.String r3 = r8.mo51789j()
            com.ss.android.ugc.aweme.commercialize.egg.a.a r4 = new com.ss.android.ugc.aweme.commercialize.egg.a.a
            r4.<init>()
            if (r0 == 0) goto L_0x0124
            com.ss.android.ugc.aweme.commercialize.egg.a r5 = r0.f68096c
            if (r5 == 0) goto L_0x0124
            java.lang.String r6 = r5.f68078a
            if (r6 != 0) goto L_0x0103
            java.lang.String r6 = ""
        L_0x0103:
            java.lang.String r7 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r7)
            r4.f68083a = r6
            java.lang.String r6 = r5.f68080c
            if (r6 != 0) goto L_0x0110
            java.lang.String r6 = ""
        L_0x0110:
            java.lang.String r7 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r7)
            r4.f68085c = r6
            java.lang.String r5 = r5.f68081d
            if (r5 != 0) goto L_0x011d
            java.lang.String r5 = ""
        L_0x011d:
            java.lang.String r6 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)
            r4.f68086d = r5
        L_0x0124:
            if (r9 != 0) goto L_0x0128
            java.lang.String r9 = ""
        L_0x0128:
            java.lang.String r5 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r5)
            r4.f68084b = r9
            if (r2 == 0) goto L_0x0137
            java.lang.String r9 = r2.getAid()
            if (r9 != 0) goto L_0x0139
        L_0x0137:
            java.lang.String r9 = ""
        L_0x0139:
            java.lang.String r5 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r5)
            r4.f68087e = r9
            if (r2 == 0) goto L_0x014e
            com.ss.android.ugc.aweme.profile.model.User r9 = r2.getAuthor()
            if (r9 == 0) goto L_0x014e
            java.lang.String r9 = r9.getUid()
            if (r9 != 0) goto L_0x0150
        L_0x014e:
            java.lang.String r9 = ""
        L_0x0150:
            java.lang.String r2 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r2)
            r4.f68088f = r9
            if (r3 != 0) goto L_0x015b
            java.lang.String r3 = ""
        L_0x015b:
            java.lang.String r9 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r9)
            r4.f68089g = r3
            com.ss.android.ugc.aweme.commercialize.egg.a.b r4 = (com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b) r4
            r1.mo52924a(r0, r4)
            android.widget.ImageView r9 = r8.f67072H
            r9.bringToFront()
            return
        L_0x016d:
            com.ss.android.ugc.aweme.comment.list.ICommerceComtEggLayout r0 = r8.f67082S
            if (r0 == 0) goto L_0x0185
            com.ss.android.ugc.aweme.comment.list.ICommerceComtEggLayout r0 = r8.f67082S
            java.lang.String r9 = r9.getText()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f67111c
            java.lang.String r2 = r8.mo51789j()
            r0.mo51532a(r9, r1, r2)
            android.widget.ImageView r9 = r8.f67072H
            r9.bringToFront()
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.mo51783c(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        ArrayList arrayList = new ArrayList();
        m61679c((List<Comment>) arrayList);
        m61684d((List<Comment>) arrayList);
        this.f67124t.mo51965a(exc, (List<Comment>) arrayList);
        if (this.f67125u != null) {
            this.f67125u.mo51246c();
        }
        if ((exc instanceof C23459a) && C9376b.m18558a((Collection<T>) this.f67126v.mo51511a())) {
            m61687e(0);
        }
    }

    /* renamed from: b */
    public final void mo51261b(String str, String str2) {
        C25282a.m61494a().startUserProfileActivity(getContext(), str, str2, "like_banner");
    }

    /* renamed from: c */
    public final void mo47029c(List<Comment> list, boolean z) {
        this.f67124t.mo47029c(list, z);
    }

    /* renamed from: b */
    public final void mo51260b(Comment comment, int i) {
        String str;
        if (!C25391x.m61782a(getActivity())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
        } else if (!C20854a.m53167g().isLogin()) {
            C27965f.m66723a((Fragment) this, mo51789j(), "dislike_comment");
        } else if (comment != null) {
            if (comment.getUserBuried()) {
                str = "4";
            } else {
                str = "3";
            }
            if (comment.getUser() != null) {
                this.f67093ac = comment.getUser().getUid();
            }
            if (this.f67088Y != null && this.f67088Y.av_()) {
                this.f67088Y.mo44934a_(comment.getCid(), comment.getAwemeId(), str, this.f67110b.getCommentTag(), comment.getReplyId(), comment.getReplyToReplyCommentId());
            }
        }
    }

    /* renamed from: b */
    public final void mo51259b(C25265n nVar, Comment comment) {
        String str;
        boolean z;
        String str2;
        boolean z2;
        Comment comment2 = comment;
        if (comment2 != null && mo51543c() && comment.getAliasAweme() == null) {
            boolean equals = TextUtils.equals(Comment.getAuthorUid(comment), C20854a.m53167g().getCurUserId());
            boolean equals2 = TextUtils.equals(this.f67110b.getAuthorUid(), C20854a.m53167g().getCurUserId());
            String enterFrom = this.f67110b.getEnterFrom();
            Aweme aweme = this.f67111c;
            String cid = comment.getCid();
            if (aweme == null) {
                str = "";
            } else {
                str = aweme.getAid();
            }
            C26890h.m65011a("press_comment", C25207a.m61277a(enterFrom, str).mo47829a("comment_id", cid).f61491a);
            if (!C25273o.f66859b.mo51547a(comment2)) {
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66724a((Fragment) this, mo51789j(), "reply_comment", C47661ab.m103163a().mo94972a("login_title", C11010c.m22280a().getString(R.string.a7w)).mo94972a("group_id", mo51940q()).mo94972a("log_pb", C23198ae.m56874k(mo51940q())).f120139a);
                    return;
                }
                boolean equals3 = TextUtils.equals(Comment.getAuthorUid(comment), C20854a.m53167g().getCurUserId());
                if (!equals3) {
                    String str3 = "reply_comment";
                    String j = mo51789j();
                    String q = mo51940q();
                    if (this.f67114j != null) {
                        str2 = this.f67114j.getCid();
                    } else {
                        str2 = "";
                    }
                    String str4 = str2;
                    String r = mo51941r();
                    boolean isMyProfile = this.f67110b.isMyProfile();
                    if (this.f67111c == null || this.f67111c.getAwemeType() != 2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    C25207a.m61292a(str3, j, q, str4, r, isMyProfile, z2);
                }
                boolean equals4 = TextUtils.equals(this.f67110b.getAuthorUid(), C20854a.m53167g().getCurUserId());
                if (comment.getStickPosition() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f67125u != null) {
                    C25156f fVar = this.f67125u;
                    String eventType = this.f67110b.getEventType();
                    Aweme aweme2 = this.f67111c;
                    int commentType = comment.getCommentType();
                    boolean z3 = !comment.isTranslated();
                    final Comment comment3 = comment;
                    final C25265n nVar2 = nVar;
                    final boolean z4 = equals4;
                    final boolean z5 = equals3;
                    C253724 r0 = new C25148b() {
                        /* renamed from: c */
                        public final void mo51265c() {
                            C25367g.this.mo51924f(comment3);
                        }

                        /* renamed from: d */
                        public final void mo51266d() {
                            C25367g.this.mo51923e(comment3);
                        }

                        /* renamed from: i */
                        public final void mo51271i() {
                            C25265n nVar = nVar2;
                            if (nVar != null) {
                                nVar.mo51559a();
                            }
                        }

                        /* renamed from: j */
                        public final void mo51272j() {
                            C25265n nVar = nVar2;
                            if (nVar != null) {
                                nVar.mo51560b();
                            }
                        }

                        /* renamed from: h */
                        public final void mo51270h() {
                            C25207a.m61280a(C25367g.this.f67110b.getEnterFrom());
                        }

                        /* renamed from: m */
                        public final void mo51275m() {
                            C25367g.this.f67114j = comment3;
                            C25367g.this.f67125u.mo51289a("comment_press");
                        }

                        /* renamed from: g */
                        public final void mo51269g() {
                            C25367g.this.f67125u.mo51240a(comment3, C25367g.this.f67110b.getEnterFrom());
                        }

                        /* renamed from: f */
                        public final void mo51268f() {
                            C25367g.this.f67125u.mo51239a(comment3);
                            C25207a.m61288a(C25367g.this.f67110b.getEnterFrom(), Comment.getAuthorUid(comment3), comment3.getCid(), C25367g.this.f67111c);
                        }

                        /* renamed from: a */
                        public final void mo51263a() {
                            C25367g gVar = C25367g.this;
                            Comment comment = comment3;
                            FragmentActivity activity = gVar.getActivity();
                            if (activity != null && comment != null) {
                                if (!C25391x.m61782a(activity)) {
                                    C10691a.m21548c((Context) activity, (int) R.string.cg1).mo19066a();
                                    return;
                                }
                                C26890h.m65011a("click_share_comment_offsite", C23089d.m56640a().mo47829a("author_id", gVar.f67111c.getAuthorUid()).mo47829a("group_id", gVar.mo51940q()).mo47829a("enter_from", gVar.mo51789j()).mo47829a("comment_id", comment.getCid()).f61491a);
                                gVar.f67115k = comment;
                                gVar.f67116l.mo19212f();
                            }
                        }

                        /* renamed from: e */
                        public final void mo51267e() {
                            String str;
                            String str2;
                            C25367g gVar = C25367g.this;
                            Comment comment = comment3;
                            C25207a.m61284a(gVar.f67110b.getEnterFrom(), gVar.f67111c, comment.getCid(), "list", "click_report_button");
                            FragmentActivity activity = gVar.getActivity();
                            if (activity != null) {
                                C25282a.m61494a().report(activity, comment, gVar.mo51941r());
                                String enterFrom = gVar.f67110b.getEnterFrom();
                                Aweme aweme = gVar.f67111c;
                                String cid = comment.getCid();
                                User user = comment.getUser();
                                C23089d dVar = new C23089d();
                                String str3 = "author_id";
                                if (user != null) {
                                    str = user.getUid();
                                } else {
                                    str = "";
                                }
                                C23089d a = dVar.mo47829a(str3, str).mo47829a("object_id", cid).mo47829a("object_type", "comment").mo47829a("enter_from", enterFrom).mo47829a("enter_method", "click_comment_button");
                                String str4 = "group_id";
                                if (aweme != null) {
                                    str2 = aweme.getAid();
                                } else {
                                    str2 = "";
                                }
                                C26890h.m65011a("click_report", a.mo47829a(str4, str2).f61491a);
                            }
                        }

                        /* renamed from: l */
                        public final void mo51274l() {
                            String str;
                            String str2;
                            C25367g.this.f67113e = comment3;
                            C25367g.this.f67123s.mo44934a_(comment3.getAwemeId(), comment3.getCid(), Boolean.valueOf(false));
                            String eventType = C25367g.this.f67110b.getEventType();
                            if (C25367g.this.f67111c == null) {
                                str = "";
                            } else {
                                str = C25367g.this.f67111c.getAid();
                            }
                            if (C25367g.this.f67111c == null) {
                                str2 = "";
                            } else {
                                str2 = C25367g.this.f67111c.getAuthorUid();
                            }
                            C52711k.m112240b(eventType, "enterFrom");
                            C52711k.m112240b(str, "groupId");
                            C52711k.m112240b(str2, "authorId");
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:19:0x0099  */
                        /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
                        /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa  */
                        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
                        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b9  */
                        /* renamed from: k */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void mo51273k() {
                            /*
                                r7 = this;
                                java.lang.String r0 = "COMMENT_ALERT_DIALOG"
                                com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
                                java.lang.String r1 = "COMMENT_TOP_ALERT_DIALOG_HAS_SHOWN"
                                r2 = 0
                                boolean r0 = r0.getBoolean(r1, r2)
                                if (r0 != 0) goto L_0x0084
                                com.ss.android.ugc.aweme.comment.ui.g r0 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                com.ss.android.ugc.aweme.comment.adapter.a r1 = r0.f67120p
                                r3 = 1
                                if (r1 == 0) goto L_0x0035
                                com.ss.android.ugc.aweme.comment.adapter.a r0 = r0.f67120p
                                java.util.List r0 = r0.mo50673a()
                                java.util.Iterator r0 = r0.iterator()
                            L_0x0020:
                                boolean r1 = r0.hasNext()
                                if (r1 == 0) goto L_0x0035
                                java.lang.Object r1 = r0.next()
                                com.ss.android.ugc.aweme.comment.model.Comment r1 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r1
                                if (r1 == 0) goto L_0x0020
                                int r1 = r1.getStickPosition()
                                if (r1 != r3) goto L_0x0020
                                r2 = 1
                            L_0x0035:
                                if (r2 == 0) goto L_0x0084
                                com.ss.android.ugc.aweme.comment.ui.g r0 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                                if (r0 == 0) goto L_0x0084
                                com.ss.android.ugc.aweme.comment.ui.g r0 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                com.ss.android.ugc.aweme.comment.model.Comment r1 = r2
                                com.ss.android.ugc.aweme.comment.ui.g r2 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                android.support.v4.app.FragmentActivity r2 = r2.getActivity()
                                java.lang.String r4 = "COMMENT_ALERT_DIALOG"
                                com.bytedance.keva.Keva r4 = com.bytedance.keva.Keva.getRepo(r4)
                                com.bytedance.ies.dmt.ui.b.a$a r5 = new com.bytedance.ies.dmt.ui.b.a$a
                                r5.<init>(r2)
                                r6 = 2132543076(0x7f1c0664, float:2.0739275E38)
                                java.lang.String r2 = r2.getString(r6)
                                com.bytedance.ies.dmt.ui.b.a$a r2 = r5.mo18902b(r2)
                                r5 = 2132543359(0x7f1c077f, float:2.0739849E38)
                                com.ss.android.ugc.aweme.comment.ui.g$6 r6 = new com.ss.android.ugc.aweme.comment.ui.g$6
                                r6.<init>(r1)
                                com.bytedance.ies.dmt.ui.b.a$a r1 = r2.mo18886a(r5, r6)
                                r2 = 2132542529(0x7f1c0441, float:2.0738165E38)
                                com.ss.android.ugc.aweme.comment.ui.g$5 r5 = new com.ss.android.ugc.aweme.comment.ui.g$5
                                r5.<init>()
                                com.bytedance.ies.dmt.ui.b.a$a r0 = r1.mo18900b(r2, r5)
                                com.bytedance.ies.dmt.ui.b.a r0 = r0.mo18897a()
                                r0.mo18882b()
                                java.lang.String r0 = "COMMENT_TOP_ALERT_DIALOG_HAS_SHOWN"
                                r4.storeBoolean(r0, r3)
                                goto L_0x008b
                            L_0x0084:
                                com.ss.android.ugc.aweme.comment.ui.g r0 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                com.ss.android.ugc.aweme.comment.model.Comment r1 = r2
                                r0.mo51921d(r1)
                            L_0x008b:
                                com.ss.android.ugc.aweme.comment.ui.g r0 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                com.ss.android.ugc.aweme.comment.f.f r0 = r0.f67110b
                                java.lang.String r0 = r0.getEventType()
                                com.ss.android.ugc.aweme.comment.ui.g r1 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.f67111c
                                if (r1 != 0) goto L_0x009c
                                java.lang.String r1 = ""
                                goto L_0x00a4
                            L_0x009c:
                                com.ss.android.ugc.aweme.comment.ui.g r1 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.f67111c
                                java.lang.String r1 = r1.getAid()
                            L_0x00a4:
                                com.ss.android.ugc.aweme.comment.ui.g r2 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f67111c
                                if (r2 != 0) goto L_0x00ad
                                java.lang.String r2 = ""
                                goto L_0x00b5
                            L_0x00ad:
                                com.ss.android.ugc.aweme.comment.ui.g r2 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f67111c
                                java.lang.String r2 = r2.getAuthorUid()
                            L_0x00b5:
                                boolean r3 = r4
                                if (r3 == 0) goto L_0x00bb
                                boolean r3 = r5
                            L_0x00bb:
                                java.lang.String r3 = "enterFrom"
                                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
                                java.lang.String r0 = "groupId"
                                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r0)
                                java.lang.String r0 = "authorId"
                                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.C253724.mo51273k():void");
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
                        /* renamed from: b */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void mo51264b() {
                            /*
                                r16 = this;
                                r0 = r16
                                com.ss.android.ugc.aweme.comment.ui.g r1 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.this
                                com.ss.android.ugc.aweme.comment.model.Comment r2 = r2
                                android.support.v4.app.FragmentActivity r3 = r1.getActivity()
                                if (r3 == 0) goto L_0x0129
                                if (r2 != 0) goto L_0x0010
                                goto L_0x0129
                            L_0x0010:
                                boolean r4 = com.p683ss.android.ugc.aweme.comment.p1528ui.C25391x.m61782a(r3)
                                if (r4 != 0) goto L_0x0021
                                r1 = 2132546921(0x7f1c1569, float:2.0747074E38)
                                com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r3, r1)
                                r1.mo19066a()
                                return
                            L_0x0021:
                                java.lang.String r3 = r2.getCid()
                                java.lang.String r4 = "original"
                                int r5 = r2.getCommentType()
                                r6 = 2
                                r7 = 1
                                r8 = -1
                                if (r5 != r6) goto L_0x0063
                                java.lang.String r3 = r2.getReplyToReplyCommentId()
                                if (r3 == 0) goto L_0x0045
                                java.lang.String r3 = r2.getReplyToReplyCommentId()
                                java.lang.String r4 = "0"
                                boolean r3 = r3.equals(r4)
                                if (r3 == 0) goto L_0x0045
                                java.lang.String r3 = "reply"
                                goto L_0x0047
                            L_0x0045:
                                java.lang.String r3 = "reply_to_reply"
                            L_0x0047:
                                r4 = r3
                                java.lang.String r3 = r2.getReplyId()
                                com.ss.android.ugc.aweme.comment.k.n r5 = r1.f67126v
                                int r5 = r5.mo51528e(r3)
                                com.ss.android.ugc.aweme.comment.k.n r6 = r1.f67126v
                                java.lang.String r9 = java.lang.String.valueOf(r5)
                                java.util.List r6 = r6.mo51521b(r9)
                                if (r6 == 0) goto L_0x0077
                                int r6 = r6.indexOf(r2)
                                goto L_0x0078
                            L_0x0063:
                                int r5 = r2.getCommentType()
                                if (r5 != r7) goto L_0x0076
                                java.lang.String r4 = "original"
                                java.lang.String r3 = r2.getCid()
                                com.ss.android.ugc.aweme.comment.k.n r5 = r1.f67126v
                                int r5 = r5.mo51528e(r3)
                                goto L_0x0077
                            L_0x0076:
                                r5 = -1
                            L_0x0077:
                                r6 = -1
                            L_0x0078:
                                com.ss.android.ugc.aweme.comment.f.f r9 = r1.f67110b
                                int r9 = r9.getSource()
                                if (r9 != 0) goto L_0x00fb
                                java.lang.String r9 = "video_page"
                                java.lang.String r10 = r1.mo51940q()
                                com.ss.android.ugc.aweme.comment.f.f r11 = r1.f67110b
                                java.lang.String r11 = r11.getEnterFrom()
                                java.lang.String r12 = r2.getCid()
                                com.ss.android.ugc.aweme.feed.model.Aweme r13 = r1.f67111c
                                java.lang.String r13 = r13.getAuthorUid()
                                com.ss.android.ugc.aweme.profile.model.User r14 = r2.getUser()
                                if (r14 == 0) goto L_0x00a5
                                com.ss.android.ugc.aweme.profile.model.User r14 = r2.getUser()
                                java.lang.String r14 = r14.getUid()
                                goto L_0x00a7
                            L_0x00a5:
                                java.lang.String r14 = ""
                            L_0x00a7:
                                com.ss.android.ugc.aweme.common.MobClick r15 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
                                java.lang.String r7 = "delete_comment"
                                com.ss.android.ugc.aweme.common.MobClick r7 = r15.setEventName(r7)
                                com.ss.android.ugc.aweme.common.MobClick r7 = r7.setLabelName(r9)
                                com.ss.android.ugc.aweme.common.MobClick r7 = r7.setValue(r10)
                                com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r7)
                                com.ss.android.ugc.aweme.app.f.d r7 = com.p683ss.android.ugc.aweme.comment.p1524i.C25207a.m61277a(r11, r10)
                                java.lang.String r9 = "comment_id"
                                com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r9, r12)
                                if (r6 == r8) goto L_0x00ce
                                java.lang.String r8 = "secondary_position"
                                com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47826a(r8, r6)
                            L_0x00ce:
                                java.lang.String r6 = "delete_comment"
                                java.lang.String r8 = "author_id"
                                com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r13)
                                java.lang.String r8 = "comment_user_id"
                                boolean r9 = android.text.TextUtils.isEmpty(r14)
                                if (r9 == 0) goto L_0x00e0
                                java.lang.String r14 = ""
                            L_0x00e0:
                                com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r14)
                                java.lang.String r8 = "parent_position"
                                com.ss.android.ugc.aweme.app.f.d r5 = r7.mo47826a(r8, r5)
                                java.lang.String r7 = "parent_comment_id"
                                com.ss.android.ugc.aweme.app.f.d r3 = r5.mo47829a(r7, r3)
                                java.lang.String r5 = "comment_category"
                                com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r5, r4)
                                java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
                                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r3)
                            L_0x00fb:
                                com.ss.android.ugc.aweme.comment.g.e r3 = r1.f67122r
                                if (r3 == 0) goto L_0x0128
                                java.lang.String r3 = r2.getCid()
                                boolean r3 = android.text.TextUtils.isEmpty(r3)
                                if (r3 != 0) goto L_0x0128
                                com.ss.android.ugc.aweme.comment.g.e r3 = r1.f67122r
                                com.ss.android.ugc.aweme.common.a r3 = r3.mo54803n()
                                com.ss.android.ugc.aweme.comment.g.d r3 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25176d) r3
                                java.lang.String r4 = r1.mo51940q()
                                r3.f66727c = r4
                                com.ss.android.ugc.aweme.comment.g.e r3 = r1.f67122r
                                r4 = 1
                                java.lang.Object[] r4 = new java.lang.Object[r4]
                                r5 = 0
                                java.lang.String r6 = r2.getCid()
                                r4[r5] = r6
                                r3.mo44934a_(r4)
                                r1.f67112d = r2
                            L_0x0128:
                                return
                            L_0x0129:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g.C253724.mo51264b():void");
                        }
                    };
                    fVar.mo51243a(eventType, aweme2, commentType, true, z, equals3, equals4, z3, comment, r0);
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f67116l = (DmtStatusView) view.findViewById(R.id.csv);
        this.f67069E = (RecyclerView) view.findViewById(R.id.ca3);
        this.f67070F = (CommentNestedLayout) view.findViewById(R.id.cfg);
        this.f67071G = (TextView) view.findViewById(R.id.title);
        this.f67072H = (ImageView) view.findViewById(R.id.ik);
        this.f67117m = (MentionEditText) view.findViewById(R.id.x4);
        this.f67073I = view.findViewById(R.id.e6n);
        this.f67074J = (ImageView) view.findViewById(R.id.erw);
        this.f67075K = (ImageView) view.findViewById(R.id.gg);
        this.f67076L = (ImageView) view.findViewById(R.id.b0c);
        this.f67077M = (ImageView) view.findViewById(R.id.xi);
        this.f67078O = view.findViewById(R.id.aix);
        this.f67079P = view.findViewById(R.id.x1);
        this.f67080Q = (ViewGroup) view.findViewById(R.id.x2);
        this.f67081R = view.findViewById(R.id.e2t);
        this.f67086W = (LinearLayout) view.findViewById(R.id.bw2);
        this.f67082S = (ICommerceComtEggLayout) view.findViewById(R.id.yl);
        this.f67084U = (CommerceEggLayout) view.findViewById(R.id.e3c);
        this.f67128z = (FrameLayout) view.findViewById(R.id.ags);
        this.f67103am = (ViewGroup) view.findViewById(R.id.z7);
        this.f67083T = (TextView) view.findViewById(R.id.e2w);
        if (!this.f67104ao) {
            m61695y();
        }
        if (C25945k.m62930u().booleanValue()) {
            ICommerceEggService createICommerceEggServicebyMonsterPlugin = CommerceEggServiceImpl.createICommerceEggServicebyMonsterPlugin();
            if (createICommerceEggServicebyMonsterPlugin != null) {
                this.f67085V = createICommerceEggServicebyMonsterPlugin.getCommerceEggView((ViewStub) view.findViewById(R.id.e38));
            }
        }
        if (C25112e.m61020a()) {
            FragmentActivity activity = getActivity();
            FrameLayout frameLayout = this.f67128z;
            TextView textView = this.f67071G;
            ImageView imageView = this.f67072H;
            ViewGroup viewGroup = this.f67080Q;
            MentionEditText mentionEditText = this.f67117m;
            ImageView imageView2 = this.f67075K;
            ImageView imageView3 = this.f67076L;
            View view2 = this.f67081R;
            if (C25112e.m61020a()) {
                textView.setTextColor(textView.getResources().getColor(R.color.axh));
                frameLayout.setBackground(frameLayout.getResources().getDrawable(R.drawable.chq));
                imageView.setImageDrawable(imageView.getResources().getDrawable(R.drawable.afp));
                viewGroup.setBackground(viewGroup.getResources().getDrawable(R.drawable.cmc));
                mentionEditText.setHintTextColor(activity.getResources().getColor(R.color.a1r));
                mentionEditText.setTextColor(activity.getResources().getColor(R.color.a2d));
                imageView2.setImageDrawable(activity.getResources().getDrawable(R.drawable.ciy));
                imageView3.setImageDrawable(activity.getResources().getDrawable(R.drawable.d3d));
                view2.setBackgroundColor(activity.getResources().getColor(R.color.av0));
            }
        }
        Context context = view.getContext();
        int c = C0726c.m2098c(context, R.color.a8g);
        DmtTextView dmtTextView = new DmtTextView(new C1221d(context, R.style.tf));
        dmtTextView.setTextColor(c);
        dmtTextView.setText(R.string.c0c);
        dmtTextView.setOnClickListener(new C25376i(this));
        this.f67105ap = C10719a.m21676a(context).mo19231b(m61686e(getString(R.string.a8z))).mo19234c((View) dmtTextView).mo19233c(0);
        this.f67116l.setBuilder(this.f67105ap);
        if (this.f67069E instanceof FpsRecyclerView) {
            ((FpsRecyclerView) this.f67069E).setLabel("comment_list");
        }
        C47729bp.m103326a("comment_list").mo95020a(this.f67069E);
        this.f67070F.setVisibleChangedListener(new C25383p(this));
        this.f67070F.setPreScrollChangeListener(new C25384q(this));
        this.f67072H.setOnClickListener(new C25385r(this));
        this.f67126v = new C25243n();
        C25393z zVar = new C25393z(getActivity(), this.f67116l, this.f67069E, this.f67126v, this.f67070F);
        this.f67124t = zVar;
        if (TextUtils.equals("Meizu", Build.BRAND) && TextUtils.equals("m1note", Build.BOARD) && TextUtils.equals("M463C", Build.MODEL) && TextUtils.equals("m1 note", Build.PRODUCT) && VERSION.SDK_INT == 19) {
            this.f67080Q.setPadding(this.f67080Q.getPaddingLeft(), this.f67080Q.getPaddingTop(), this.f67080Q.getPaddingRight(), C23724k.m58228d(C11010c.m22280a()));
        }
        this.f67069E.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                int l = C25367g.this.f67118n.mo4751l();
                int A = C25367g.this.f67118n.mo5013A();
                if (l >= 8 && A - l < 8 && ((C25182h) C25367g.this.f67121q.mo54803n()).isHasMore()) {
                    C25367g.this.ar_();
                }
                if (C26503d.m64071n(C25367g.this.f67111c)) {
                    C25367g.this.f67127y.mo48228a("comment_dialog_state", (Object) Integer.valueOf(3));
                }
            }
        });
        this.f67117m.setFocusable(false);
        this.f67125u.mo51242a(this.f67117m, (View) this.f67075K, (View) this.f67076L, mo51940q(), this.f67110b.getEnterFrom());
        C25156f fVar = this.f67125u;
        ImageView imageView4 = this.f67074J;
        View view3 = this.f67073I;
        fVar.f66597m = imageView4;
        fVar.f66598n = view3;
        this.f67117m.setTextSize(2, 15.0f);
        this.f67127y = DataCenter.m57235a(C0214z.m438a((Fragment) this), (C0184k) this);
        this.f67100aj = C23279d.m57256a((Fragment) this, view);
        this.f67100aj.mo48252a(this.f67127y);
        C25387t tVar = new C25387t(this);
        this.f67101ak = C25282a.m61494a().getCommentAdWidget(this.f67110b.getAdCommentStruct(), tVar);
        this.f67102al = C25282a.m61494a().getCommentHeaderWidget(tVar);
        this.f67100aj.mo48250a((int) R.id.yx, this.f67101ak).mo48250a((int) R.id.z7, this.f67102al);
        this.f67125u.f66599o = this.f67127y;
        this.f67125u.f66593i = new C25386s(this);
        m61666V();
        this.f67077M.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C25367g.this.f67111c == null || C25367g.this.f67111c.getAwemeControl().canComment()) {
                    C25230h.m61352a(C25367g.this.getContext(), new C25219b() {
                        /* renamed from: a */
                        public final void mo51480a(boolean z) {
                            C25367g.this.f67125u.mo51286a(C25367g.this.f67117m.getText(), C25367g.this.f67117m.getTextExtraStructList(), C25367g.this.f67125u.f66594j, false);
                        }
                    });
                } else {
                    C10691a.m21548c(C25367g.this.getContext(), (int) R.string.aij).mo19066a();
                }
            }
        });
        m61693w();
        if (this.f67111c != null) {
            m61680c(this.f67111c.getAid());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f67104ao) {
            return C2281a.m6814a(getContext(), R.layout.b1i, viewGroup, false);
        }
        View inflate = layoutInflater.inflate(R.layout.b1i, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    /* renamed from: a */
    public static C25367g m61668a(Activity activity, Aweme aweme, C25171f fVar) {
        Aweme aweme2 = aweme;
        C25171f fVar2 = fVar;
        if (activity == null || aweme2 == null || activity.isFinishing()) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f67062an <= 300) {
            return null;
        }
        f67062an = elapsedRealtime;
        try {
            if (C10181b.m20511a().mo18172a(CommentAutoAddLayoutExperiment.class, true, "comment_auto_add_layout", 31744, false)) {
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                C0654k supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                C25367g gVar = (C25367g) supportFragmentManager.mo2224a("comment");
                View findViewById = fragmentActivity.findViewById(R.id.e2v);
                if (gVar == null || findViewById == null) {
                    C25229g.m61351a(true, fVar.getEventType());
                    if (gVar != null) {
                        supportFragmentManager.mo2225a().mo2177a((Fragment) gVar).mo2195c();
                    }
                    if (findViewById == null) {
                        FrameLayout frameLayout = new FrameLayout(fragmentActivity);
                        frameLayout.setId(R.id.e2v);
                        ((ViewGroup) fragmentActivity.findViewById(16908290)).addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                    }
                    C25367g b = m61677b(fVar);
                    b.m61674a(aweme2);
                    supportFragmentManager.mo2225a().mo2176a(R.id.e2v, b, "comment").mo2195c();
                    return b;
                }
                C25229g.m61351a(false, fVar.getEventType());
                gVar.m61674a(aweme2);
                gVar.m61671a(fVar2);
                if (fVar.isScrollToTop() && gVar.f67069E != null) {
                    gVar.f67069E.mo4814b(0);
                }
                gVar.m61666V();
                return gVar;
            }
            C0654k supportFragmentManager2 = ((FragmentActivity) activity).getSupportFragmentManager();
            C25367g gVar2 = (C25367g) supportFragmentManager2.mo2224a("comment");
            if (gVar2 == null) {
                C25229g.m61351a(true, fVar.getEventType());
                gVar2 = m61677b(fVar);
                gVar2.m61674a(aweme2);
                supportFragmentManager2.mo2225a().mo2176a(R.id.am3, gVar2, "comment").mo2195c();
            } else {
                C25229g.m61351a(false, fVar.getEventType());
                gVar2.m61674a(aweme2);
                gVar2.m61671a(fVar2);
                if (fVar.isScrollToTop() && gVar2.f67069E != null) {
                    gVar2.f67069E.mo4814b(0);
                }
                gVar2.m61666V();
            }
            return gVar2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("CommentListFragment.showCommentList() error in try/catch. ErrorMessage: ");
            sb.append(e.getMessage());
            C25069a.m60927a(sb.toString());
            C32458a.m75143a(e);
            return null;
        }
    }

    /* renamed from: a */
    private void m61672a(Comment comment, int i, int i2, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        SecApiImpl.createISecApibyMonsterPlugin().reportData("comment");
        if (i == 2) {
            String str7 = "post_reply_comment";
            String j = mo51789j();
            String q = mo51940q();
            if (comment != null) {
                str6 = comment.getCid();
            } else {
                str6 = "";
            }
            String r = mo51941r();
            boolean isMyProfile = this.f67110b.isMyProfile();
            if (this.f67111c == null || this.f67111c.getAwemeType() != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            C25207a.m61292a(str7, j, q, str6, r, isMyProfile, z2);
        }
        if (TextUtils.equals(this.f67110b.getEventType(), "homepage_follow")) {
            C31870a f = C23794bh.m58392f();
            Aweme aweme = this.f67111c;
            String str8 = "homepage_follow";
            String str9 = "list";
            if (comment != null) {
                str5 = comment.getCid();
            } else {
                str5 = "";
            }
            f.mo65006c(aweme, str8, str9, str5);
        }
        if (comment == null || TextUtils.isEmpty(comment.getLabelText())) {
            str2 = "";
        } else {
            str2 = String.valueOf(comment.getLabelType());
        }
        String str10 = str2;
        if (comment == null || comment.getRelationLabel() == null) {
            str3 = "";
        } else {
            str3 = String.valueOf(comment.getRelationLabel().getType());
        }
        String str11 = str3;
        Aweme aweme2 = this.f67111c;
        String enterFrom = this.f67110b.getEnterFrom();
        String a = C25207a.m61278a(comment);
        if (comment != null) {
            str4 = comment.getCid();
        } else {
            str4 = "";
        }
        C25208b.m61299a(aweme2, str, enterFrom, a, str4, "list", String.valueOf(i2), this.f67110b.getIsLongItem(), this.f67110b.getEnterMethod(), this.f67110b.getPlayListType(), this.f67110b.getPlayListIdKey(), this.f67110b.getPlayListId(), z, this.f67110b.isEnterFullScreen(), this.f67110b.getTabName(), C23198ae.m56854b(this.f67111c, this.f67110b.getPageType()), this.f67110b.getPoiObjectId(), this.f67110b.getPoiRegionType(), this.f67110b.getPreviousPage(), str10, str11, this.f67110b.getCreationId(), this.f67110b.isHotPlayer());
        if (this.f67091aa != null) {
            this.f67091aa.mo60714a(new C30332aw(7));
        }
    }
}
