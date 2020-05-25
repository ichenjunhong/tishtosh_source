package com.p683ss.android.ugc.aweme.forward.p1779vh;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30828c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31756c;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31816x;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedCommentLayout;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31837a;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31840c;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31845g;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32379c.C32380a;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32379c.C32381b;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32390c;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32394e;
import com.p683ss.android.ugc.aweme.forward.p1778f.C32404a;
import com.p683ss.android.ugc.aweme.forward.p1778f.C32409b;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.live.feedpage.C36083b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.utils.C47724bl;
import com.p683ss.android.ugc.aweme.utils.C47789cu;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder */
public abstract class BaseForwardViewHolder extends C1352v implements OnAttachStateChangeListener, C9382a, C31756c, C31816x, C32381b {

    /* renamed from: A */
    TextView f84357A;

    /* renamed from: B */
    protected ImageView f84358B;

    /* renamed from: C */
    protected C47724bl f84359C = new C47724bl(1);

    /* renamed from: D */
    protected C31758e f84360D;

    /* renamed from: E */
    public C37859b f84361E;

    /* renamed from: F */
    public Aweme f84362F;

    /* renamed from: G */
    protected C9381g f84363G;

    /* renamed from: H */
    protected List<User> f84364H;

    /* renamed from: I */
    public boolean f84365I;

    /* renamed from: J */
    protected C32404a f84366J;

    /* renamed from: K */
    public String f84367K;

    /* renamed from: L */
    protected C23279d f84368L;

    /* renamed from: M */
    public C32380a f84369M = new C32394e();

    /* renamed from: N */
    public boolean f84370N = false;

    /* renamed from: O */
    public MotionEvent f84371O;

    /* renamed from: P */
    public MotionEvent f84372P;

    /* renamed from: Q */
    protected OnTouchListener f84373Q = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    if (BaseForwardViewHolder.this.f84363G.hasMessages(0)) {
                        BaseForwardViewHolder.this.f84363G.removeMessages(0);
                    }
                    if (C31845g.m74213a(BaseForwardViewHolder.this.f84371O, BaseForwardViewHolder.this.f84372P, motionEvent, BaseForwardViewHolder.this.mo65546b())) {
                        BaseForwardViewHolder.this.f84370N = true;
                        BaseForwardViewHolder.this.mo65656a(BaseForwardViewHolder.this.f84362F);
                    } else {
                        BaseForwardViewHolder.this.f84370N = false;
                    }
                    if (BaseForwardViewHolder.this.f84371O != null) {
                        BaseForwardViewHolder.this.f84371O.recycle();
                    }
                    BaseForwardViewHolder.this.f84371O = MotionEvent.obtain(motionEvent);
                    break;
                case 1:
                    if (!BaseForwardViewHolder.this.f84370N && BaseForwardViewHolder.this.f84371O != null && !C31845g.m74212a(0, BaseForwardViewHolder.this.f84371O, motionEvent, BaseForwardViewHolder.this.mo65546b())) {
                        BaseForwardViewHolder.this.f84363G.sendMessageDelayed(BaseForwardViewHolder.this.f84363G.obtainMessage(0), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + BaseForwardViewHolder.this.f84371O.getEventTime());
                    }
                    if (BaseForwardViewHolder.this.f84372P != null) {
                        BaseForwardViewHolder.this.f84372P.recycle();
                    }
                    BaseForwardViewHolder.this.f84372P = MotionEvent.obtain(motionEvent);
                    break;
                case 2:
                    if (C31845g.m74212a(0, BaseForwardViewHolder.this.f84371O, motionEvent, BaseForwardViewHolder.this.mo65546b())) {
                        BaseForwardViewHolder.this.f84363G.removeMessages(0);
                        break;
                    }
                    break;
            }
            return false;
        }
    };

    /* renamed from: R */
    private Context f84374R;

    /* renamed from: S */
    private Rect f84375S = new Rect();

    /* renamed from: T */
    private int[] f84376T = new int[2];

    /* renamed from: U */
    private C30828c f84377U;

    /* renamed from: V */
    private List<Comment> f84378V;

    /* renamed from: W */
    private boolean f84379W;

    /* renamed from: X */
    private C31755b f84380X;

    /* renamed from: Y */
    private boolean f84381Y = true;

    /* renamed from: Z */
    private C31980a f84382Z;

    /* renamed from: a */
    protected ViewGroup f84383a;

    /* renamed from: aa */
    private C1710e<C36083b> f84384aa;

    /* renamed from: b */
    ViewGroup f84385b;

    /* renamed from: c */
    protected AvatarImageView f84386c;

    /* renamed from: d */
    protected TextView f84387d;

    /* renamed from: e */
    DiggLayout f84388e;

    /* renamed from: f */
    LongPressLayout f84389f;

    /* renamed from: g */
    AnimationImageView f84390g;

    /* renamed from: h */
    AvatarImageView f84391h;

    /* renamed from: i */
    LiveCircleView f84392i;

    /* renamed from: j */
    protected TextView f84393j;

    /* renamed from: k */
    TextView f84394k;

    /* renamed from: l */
    MentionTextView f84395l;

    /* renamed from: m */
    protected TextView f84396m;

    /* renamed from: n */
    ImageView f84397n;

    /* renamed from: o */
    TextView f84398o;

    /* renamed from: p */
    ImageView f84399p;

    /* renamed from: q */
    TextView f84400q;

    /* renamed from: r */
    protected ViewGroup f84401r;

    /* renamed from: s */
    ImageView f84402s;

    /* renamed from: t */
    TextView f84403t;

    /* renamed from: u */
    public ImageView f84404u;

    /* renamed from: v */
    protected TextView f84405v;

    /* renamed from: w */
    public FollowFeedCommentLayout f84406w;

    /* renamed from: x */
    FollowUserBtn f84407x;

    /* renamed from: y */
    protected View f84408y;

    /* renamed from: z */
    int f84409z;

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo65647C();

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo65648D() {
    }

    /* renamed from: a */
    public final C31755b mo65545a() {
        return this.f84380X;
    }

    /* renamed from: b */
    public final Context mo65546b() {
        return this.f84374R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65661b(View view) {
    }

    /* renamed from: i */
    public void mo65552i() {
    }

    /* renamed from: n */
    public final C47724bl mo65554n() {
        return this.f84359C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo65668o() {
        return false;
    }

    /* renamed from: r */
    public String mo65673r() {
        return this.f84367K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo65679v() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo65682y() {
    }

    public final void ba_() {
        this.f84369M.mo65539a();
    }

    public final void bb_() {
        this.f84369M.mo65541b();
    }

    /* renamed from: d */
    public final boolean mo65548d() {
        return this.f84380X.mo64655b();
    }

    public void clickExtra() {
        List E = mo65649E();
        if (this.f84360D != null) {
            this.f84360D.mo64665a(this.f84362F, E);
        }
    }

    /* renamed from: f */
    public final void mo65550f() {
        if (this.f84359C.mo95019c(1)) {
            this.f84406w.mo64906a();
        }
    }

    /* renamed from: h */
    public void mo65551h() {
        if (this.f84377U != null) {
            this.f84377U.mo63566c();
        }
    }

    /* renamed from: m */
    public void mo65553m() {
        if (this.f84377U != null) {
            this.f84377U.mo63567d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo65677t() {
        if (this.f84358B != null) {
            this.f84358B.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final /* synthetic */ boolean mo65650F() {
        this.f84360D.mo64668b(this.f84393j, this.itemView, this.f84362F, this.f84362F.getAuthor());
        return false;
    }

    /* renamed from: q */
    public final void mo64801q() {
        if (mo65668o() && this.f84406w != null) {
            this.f84406w.mo64911c();
        }
        mo65683z();
    }

    /* renamed from: u */
    public void mo65678u() {
        mo65683z();
        if (!mo65668o()) {
            mo65646B();
            mo64800p();
        }
        mo65645A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo65680w() {
        if (!this.f84359C.mo95019c(1) || !this.f84381Y) {
            this.f84408y.setVisibility(8);
        } else {
            this.f84408y.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo65683z() {
        if (this.f84388e != null) {
            this.f84388e.removeAllViews();
        }
        this.f84366J.mo65599a(this.f84362F);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public List<String> mo65649E() {
        ArrayList arrayList = new ArrayList();
        if (mo65668o()) {
            arrayList.add(mo65546b().getString(R.string.dhj));
        }
        if (!C31190f.m72831a(this.f84362F) && C47915gg.m103646a(this.f84362F)) {
            arrayList.add(mo65546b().getString(R.string.f9m));
        }
        return arrayList;
    }

    public void addComment() {
        if (this.f84360D != null) {
            if (C23794bh.m58390d().mo47103a()) {
                C10691a.m21548c(mo65546b(), (int) R.string.dvz).mo19066a();
                return;
            }
            this.f84360D.mo64703a(this.itemView, this.f84362F);
        }
    }

    /* renamed from: c */
    public final boolean mo65547c() {
        if (!this.f84365I || !this.f84380X.mo64654a()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final Rect mo65549e() {
        this.itemView.getLocationOnScreen(this.f84376T);
        this.f84375S.set(this.f84376T[0], this.f84376T[1], this.f84376T[0] + this.itemView.getWidth(), this.f84376T[1] + this.itemView.getHeight());
        return this.f84375S;
    }

    /* renamed from: p */
    public final void mo64800p() {
        if (!mo65668o()) {
            String d = C31753a.m73744d(this.f84362F);
            if (!TextUtils.isEmpty(d)) {
                this.f84400q.setText(d);
            }
        } else if (this.f84406w != null) {
            this.f84406w.mo64909b();
        }
    }

    /* renamed from: G */
    private String mo65686G() {
        String str;
        if (this.f84362F.getForwardItem() == null || this.f84362F.getForwardItem().getAuthor() == null) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f84362F.getForwardItem().getAuthor().getRemarkName())) {
            StringBuilder sb = new StringBuilder("@");
            sb.append(this.f84362F.getForwardItem().getAuthor().getRemarkName());
            sb.append(": ");
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("@");
            sb2.append(this.f84362F.getForwardItem().getAuthor().getNickname());
            sb2.append(": ");
            str = sb2.toString();
        }
        return str;
    }

    /* renamed from: A */
    public void mo65645A() {
        String str;
        if (C31190f.m72840h(this.f84362F)) {
            this.f84401r.setVisibility(0);
            TextView textView = this.f84403t;
            Aweme aweme = this.f84362F;
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null && aweme.getAuthor() != null && statistics.getForwardCount() > 0) {
                str = C33095b.m76068a(statistics.getForwardCount());
            } else if (!C47789cu.m103418a()) {
                str = "0";
            } else {
                str = C11010c.m22280a().getString(R.string.b5x);
            }
            textView.setText(str);
            return;
        }
        this.f84401r.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo65646B() {
        if (this.f84404u != null && this.f84362F.getAuthor() != null) {
            if (C31753a.m73743c(this.f84362F)) {
                this.f84404u.setImageResource(R.drawable.dge);
            } else {
                this.f84404u.setImageResource(R.drawable.dfc);
            }
            if (C31753a.m73741b(this.f84362F)) {
                this.f84404u.setAlpha(0.5f);
                this.f84404u.setEnabled(false);
            } else {
                this.f84404u.setAlpha(1.0f);
                this.f84404u.setEnabled(true);
            }
            switch (C31753a.m73747g(this.f84362F)) {
                case 2:
                    this.f84405v.setVisibility(0);
                    this.f84405v.setTextSize(1, 10.0f);
                    this.f84405v.setText(R.string.fbv);
                    return;
                case 3:
                    this.f84405v.setVisibility(0);
                    this.f84405v.setTextSize(1, 12.0f);
                    this.f84405v.setText(C31753a.m73746f(this.f84362F));
                    return;
                default:
                    this.f84405v.setVisibility(8);
                    return;
            }
        }
    }

    public final void bc_() {
        if (this.f84357A != null) {
            if (this.f84362F.getAwemeType() != 13 || this.f84362F.getForwardItem() == null) {
                this.f84357A.setVisibility(8);
            } else if (C31753a.m73743c(this.f84362F.getForwardItem())) {
                if (C47950q.m103755d(this.f84362F.getForwardItem())) {
                    this.f84357A.setVisibility(0);
                    this.f84357A.setText(mo65546b().getString(R.string.dx2));
                } else if (C47950q.m103754c(this.f84362F.getForwardItem())) {
                    this.f84357A.setVisibility(0);
                    this.f84357A.setText(mo65546b().getString(R.string.b73));
                } else {
                    this.f84357A.setVisibility(8);
                }
            } else if (!C47950q.m103754c(this.f84362F.getForwardItem()) || !C47950q.m103756e(this.f84362F.getForwardItem())) {
                this.f84357A.setVisibility(8);
            } else {
                this.f84357A.setVisibility(0);
                this.f84357A.setText(mo65546b().getString(R.string.b73));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo65674s() {
        String str;
        TextView textView = this.f84396m;
        Context context = this.f84374R;
        long createTime = this.f84362F.getCreateTime() * 1000;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(createTime);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            str = C47903fw.f120495a.format(instance.getTime());
        } else {
            long currentTimeMillis = System.currentTimeMillis() - createTime;
            if (currentTimeMillis <= 60000) {
                str = context.getString(R.string.bu6);
            } else if (currentTimeMillis <= 3600000) {
                str = context.getString(R.string.c6l, new Object[]{Long.valueOf(currentTimeMillis / 60000)});
            } else if (currentTimeMillis <= FbUploadTokenTime.group0) {
                str = context.getString(R.string.bcs, new Object[]{Long.valueOf(currentTimeMillis / 3600000)});
            } else if (currentTimeMillis <= 259200000) {
                str = context.getString(R.string.ant, new Object[]{Long.valueOf(currentTimeMillis / FbUploadTokenTime.group0)});
            } else {
                str = C47903fw.f120496b.format(instance.getTime());
            }
        }
        textView.setText(str);
        if (this.f84359C.mo95019c(1)) {
            this.f84406w.setVisibility(0);
            this.f84406w.setEventType(this.f84367K);
            this.f84406w.mo64908a(this.f84362F, this.f84378V, this.f84364H, this.f84360D);
        } else {
            this.f84406w.setVisibility(8);
        }
        if (this.f84366J != null) {
            this.f84366J.f84320b = this.f84406w.getLayoutLikes();
        }
        mo65681x();
        if (this.f84362F == null || this.f84362F.getAuthor() == null || TextUtils.isEmpty(this.f84362F.getAuthor().getRelationLabel())) {
            this.f84387d.setVisibility(8);
        } else {
            this.f84387d.setVisibility(0);
            this.f84387d.setText(this.f84362F.getAuthor().getRelationLabel());
        }
        mo65677t();
        mo65682y();
        mo65678u();
        bc_();
        mo65680w();
        if (!(this.f84407x == null || this.f84407x.getVisibility() != 0 || this.f84362F == null || this.f84362F.getAuthor() == null)) {
            this.f84382Z.mo65173a(this.f84362F.getAuthor());
        }
        mo65679v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo65681x() {
        boolean z = true;
        if (this.f84359C.mo95019c(1)) {
            this.f84385b.setVisibility(0);
            if (this.f84377U == null) {
                if (this.f84362F.getAuthor() == null || !this.f84362F.getAuthor().isLive()) {
                    z = false;
                }
                this.f84377U = new C30828c(z, this.f84391h, this.f84386c, this.f84392i);
            }
            if (C31753a.m73739a(this.f84362F)) {
                if (this.f84362F.getAuthor() != null) {
                    C23515d.m57670a((RemoteImageView) this.f84391h, this.f84362F.getAuthor().getAvatarThumb(), this.f84409z, this.f84409z);
                }
                C23794bh.m58392f().mo64985a(this.f84362F);
            } else if (this.f84362F.getAuthor() != null) {
                C23515d.m57670a((RemoteImageView) this.f84386c, this.f84362F.getAuthor().getAvatarThumb(), this.f84409z, this.f84409z);
            }
            if (this.f84384aa == null) {
                this.f84384aa = new C1710e<C36083b>() {
                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        C36083b bVar = (C36083b) obj;
                        if (TextUtils.equals(BaseForwardViewHolder.this.f84362F.getAuthor().getUid(), String.valueOf(bVar.f92446a))) {
                            BaseForwardViewHolder.this.f84362F.getAuthor().roomId = bVar.f92447b;
                            if (!BaseForwardViewHolder.this.f84362F.getAuthor().isLive()) {
                                BaseForwardViewHolder.this.mo65681x();
                            }
                        }
                    }
                };
            }
            this.f84377U.mo63563a(this.f84362F.getAuthor(), getClass(), this.f84384aa);
            if (this.f84362F.getAuthor() != null) {
                if (TextUtils.isEmpty(this.f84362F.getAuthor().getRemarkName())) {
                    this.f84393j.setText(this.f84362F.getAuthor().getNickname());
                } else {
                    this.f84393j.setText(this.f84362F.getAuthor().getRemarkName());
                }
                if (TextUtils.equals(mo65673r(), "homepage_follow")) {
                    new C32429b(this);
                    if (this.f84362F.getAuthor() != null) {
                        C31781d.m73922a();
                        this.f84362F.getAuthor().getStarBillboardRank();
                        mo65673r();
                    }
                }
            }
        } else {
            this.f84383a.setVisibility(8);
        }
        m74940b(this.f84395l, this.f84362F);
    }

    /* renamed from: b */
    public final void mo65660b(int i) {
        this.f84359C.mo95017a(2);
    }

    /* renamed from: f */
    public final void mo65667f(int i) {
        this.f84359C.mo95018b(1);
    }

    public void handleMsg(Message message) {
        if (message.what == 0) {
            mo65648D();
        }
    }

    /* renamed from: c */
    public final void mo64772c(int i) {
        this.f84406w.mo64907a(0);
        this.f84379W = true;
    }

    /* renamed from: d */
    public final void mo64776d(int i) {
        this.f84406w.mo64910b(i);
        this.f84379W = true;
    }

    /* renamed from: e */
    public final void mo64779e(int i) {
        this.f84406w.mo64912c(i);
        this.f84379W = true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f84365I = true;
        this.f84369M.mo65542c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo65663c(View view) {
        this.f84363G.sendMessage(this.f84363G.obtainMessage(0));
    }

    public void onClickAuthorAvatar(View view) {
        if (this.f84360D != null && this.f84362F != null) {
            this.f84360D.mo64660a(view, this.itemView, this.f84362F, this.f84362F.getAuthor());
        }
    }

    public void onClickAuthorName(View view) {
        if (this.f84360D != null && this.f84362F != null) {
            this.f84360D.mo64668b(view, this.itemView, this.f84362F, this.f84362F.getAuthor());
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f84365I = false;
        this.f84369M.mo65543d();
        if (this.f84388e != null) {
            this.f84388e.removeAllViews();
        }
    }

    public void showCreateForward(View view) {
        C31837a.m74196a(this.f84402s);
        if (this.f84360D != null) {
            this.f84360D.mo64664a(this.f84362F);
        }
    }

    public void showShare(View view) {
        C31837a.m74196a(this.f84404u);
        if (this.f84360D != null) {
            this.f84360D.mo64659a(view, this.itemView, this.f84362F);
        }
    }

    /* renamed from: b */
    public final void mo64768b(Aweme aweme) {
        this.f84366J.mo65602b(aweme);
    }

    public void clickLike(View view) {
        C32380a aVar = this.f84369M;
        long currentTimeMillis = System.currentTimeMillis();
        if (aVar instanceof C32390c) {
            currentTimeMillis = ((C32390c) aVar).mo65570i().f83205f;
        }
        this.f84366J.mo65600a(mo65673r(), System.currentTimeMillis() - currentTimeMillis);
    }

    public void expandComment(View view) {
        if (this.f84362F != null) {
            if (view.getId() == R.id.b77) {
                C31837a.m74196a(this.f84399p);
            }
            if (this.f84360D != null) {
                this.f84360D.mo64704a(this.itemView, this.f84362F, this.f84364H, this.f84379W, "click_comment_icon");
            }
        }
    }

    /* renamed from: a */
    public final void mo65656a(Aweme aweme) {
        if (aweme != null && aweme.getStatus() != null) {
            if (!C20854a.m53167g().isLogin()) {
                C27965f.m66719a(C11016e.m22312g(), this.f84367K, "click_like");
                return;
            }
            C32380a aVar = this.f84369M;
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar instanceof C32390c) {
                currentTimeMillis = ((C32390c) aVar).mo65570i().f83205f;
            }
            C32404a aVar2 = this.f84366J;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (!(aweme == null || aweme.getForwardItem() == null || aweme.getStatus() == null || !C32409b.m74937a(aVar2.f84325g) || ((aweme.getUserDigg() != 0 && aweme.getForwardItem().getUserDigg() != 0) || !aweme.isCanPlay() || aweme.getStatus().isDelete() || aweme.getStatus().getPrivateStatus() == 1 || aVar2.f84324f))) {
                if (aVar2.f84323e != null) {
                    aVar2.f84323e.mo64653b(aVar2.f84326h, 1, "click_double_like", currentTimeMillis2);
                }
                aVar2.mo65601a(true);
                aVar2.mo65598a();
            }
            if (!(this.f84388e == null || aweme.getStatus().getPrivateStatus() == 1)) {
                this.f84388e.mo54895a(this.f84371O.getX(), this.f84371O.getY());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65651a(View view) {
        this.f84383a = (ViewGroup) view.findViewById(R.id.b7t);
        this.f84385b = (ViewGroup) view.findViewById(R.id.b6z);
        this.f84386c = (AvatarImageView) view.findViewById(R.id.dm3);
        this.f84387d = (TextView) view.findViewById(R.id.dh1);
        this.f84388e = (DiggLayout) view.findViewById(R.id.a5q);
        this.f84389f = (LongPressLayout) view.findViewById(R.id.bji);
        this.f84390g = (AnimationImageView) view.findViewById(R.id.i4);
        this.f84391h = (AvatarImageView) view.findViewById(R.id.dm9);
        this.f84392i = (LiveCircleView) view.findViewById(R.id.dn0);
        this.f84393j = (TextView) view.findViewById(R.id.dic);
        this.f84394k = (TextView) view.findViewById(R.id.deg);
        this.f84395l = (MentionTextView) view.findViewById(R.id.d98);
        this.f84396m = (TextView) view.findViewById(R.id.d92);
        this.f84397n = (ImageView) view.findViewById(R.id.a5m);
        this.f84398o = (TextView) view.findViewById(R.id.d9h);
        this.f84399p = (ImageView) view.findViewById(R.id.azd);
        this.f84400q = (TextView) view.findViewById(R.id.d8_);
        this.f84401r = (ViewGroup) view.findViewById(R.id.b7s);
        this.f84402s = (ImageView) view.findViewById(R.id.b0u);
        this.f84403t = (TextView) view.findViewById(R.id.d_p);
        this.f84404u = (ImageView) view.findViewById(R.id.cn8);
        this.f84405v = (TextView) view.findViewById(R.id.dfu);
        this.f84406w = (FollowFeedCommentLayout) view.findViewById(R.id.b7o);
        this.f84407x = (FollowUserBtn) view.findViewById(R.id.ai0);
        this.f84408y = view.findViewById(R.id.bay);
        this.f84357A = (TextView) view.findViewById(R.id.d6z);
        this.f84358B = (ImageView) view.findViewById(R.id.b0g);
        this.f84409z = view.getContext().getResources().getDimensionPixelSize(R.dimen.zt);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65652a(View view, float f) {
        mo65653a(view, f, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo65655a(View view, TextExtraStruct textExtraStruct) {
        if (this.f84360D != null) {
            this.f84360D.mo64663a(view, textExtraStruct, this.itemView, this.f84362F);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo65662b(View view, TextExtraStruct textExtraStruct) {
        if (this.f84360D != null) {
            this.f84360D.mo64663a(view, textExtraStruct, this.itemView, this.f84362F);
        }
    }

    /* renamed from: b */
    private void m74940b(MentionTextView mentionTextView, Aweme aweme) {
        if (aweme != null) {
            if (!TextUtils.isEmpty(aweme.getDesc())) {
                mentionTextView.setText(aweme.getDesc());
                mentionTextView.setVisibility(0);
                C31781d.m73922a().mo64689a((TextView) mentionTextView);
                mentionTextView.setSpanSize(C9432q.m18669a(this.f84374R, 15.0f));
                mentionTextView.setSpanStyle(1);
                mentionTextView.setHighlightColor(mentionTextView.getResources().getColor(R.color.a8w));
                mentionTextView.setOnSpanClickListener(new C32430c(this));
                mentionTextView.mo95551a(C31840c.m74198a(this.f84362F), (C48160d) new C45549f(true));
                mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            mentionTextView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo64763a(AwemeStatus awemeStatus, UrlModel urlModel) {
        if (this.f84362F.getAwemeType() == 13 && this.f84362F.getForwardItem() != null) {
            if (this.f84362F.getForwardItem().getStatus() != null) {
                this.f84362F.getForwardItem().getStatus().setPrivateStatus(awemeStatus.getPrivateStatus());
            }
            this.f84362F.getForwardItem().setLabelPrivate(urlModel);
            AwemeLabelModel awemeLabelModel = null;
            if (urlModel != null) {
                awemeLabelModel = new AwemeLabelModel();
                awemeLabelModel.setLabelType(1);
                awemeLabelModel.setUrlModels(urlModel);
            }
            Aweme forwardItem = this.f84362F.getForwardItem();
            if (!(forwardItem == null || forwardItem.videoLabels == null)) {
                if (forwardItem.videoLabels.size() == 0) {
                    forwardItem.videoLabels.add(0, awemeLabelModel);
                    return;
                }
                forwardItem.videoLabels.set(0, awemeLabelModel);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65658a(MentionTextView mentionTextView, Aweme aweme) {
        List list;
        if (aweme != null) {
            if (C23794bh.m58393g().mo75754a(aweme)) {
                Aweme aweme2 = aweme;
                mentionTextView.setText(C23794bh.m58393g().mo75751a(this.f84374R, C2240a.m6772a("%s%s", new Object[]{mo65686G(), aweme.getDesc()}), aweme2, this.f84367K, 0));
            } else {
                mentionTextView.setText(C2240a.m6772a("%s%s", new Object[]{mo65686G(), aweme.getDesc()}));
            }
            mentionTextView.setVisibility(0);
            C31781d.m73922a().mo64689a((TextView) mentionTextView);
            mentionTextView.setSpanSize(C9432q.m18669a(this.f84374R, 15.0f));
            mentionTextView.setSpanStyle(1);
            mentionTextView.setOnSpanClickListener(new C32431d(this));
            if (aweme == null) {
                list = null;
            } else {
                int length = mo65686G().length();
                ArrayList arrayList = new ArrayList();
                List<TextExtraStruct> a = C31840c.m74198a(aweme);
                if (!C9376b.m18558a((Collection<T>) a)) {
                    for (TextExtraStruct textExtraStruct : a) {
                        TextExtraStruct clone = textExtraStruct.clone();
                        clone.setStart(textExtraStruct.getStart() + length);
                        clone.setEnd(textExtraStruct.getEnd() + length);
                        arrayList.add(clone);
                    }
                }
                TextExtraStruct textExtraStruct2 = new TextExtraStruct();
                textExtraStruct2.setStart(0);
                textExtraStruct2.setEnd(length);
                textExtraStruct2.setType(2);
                textExtraStruct2.setUserId(aweme.getAuthorUid());
                arrayList.add(0, textExtraStruct2);
                list = arrayList;
            }
            mentionTextView.mo95551a(list, (C48160d) new C45549f(true));
            mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
            C23794bh.m58395i().mo76331a(this.f84374R, this.f84362F.getForwardItem(), (TextView) mentionTextView);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65653a(View view, float f, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) C9432q.m18687b(mo65546b(), f);
        layoutParams.bottomMargin = (int) C9432q.m18687b(mo65546b(), f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65654a(View view, int i, int i2) {
        int[] iArr = new int[2];
        float f = ((float) i) / ((float) i2);
        int a = C9432q.m18670a(this.f84374R);
        float b = C9432q.m18687b(this.f84374R, 16.0f);
        if (i > i2) {
            iArr[0] = (int) (((float) a) - (b * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) / f);
        } else {
            iArr[0] = (int) (((float) a) - (b * 2.0f));
            iArr[1] = iArr[0];
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = iArr[0];
        marginLayoutParams.height = iArr[1];
        marginLayoutParams.setMargins(0, 0, 0, 0);
        view.setLayoutParams(marginLayoutParams);
    }

    public BaseForwardViewHolder(FollowFeedLayout followFeedLayout, C31755b bVar, C31758e eVar, C31754a aVar) {
        super(followFeedLayout);
        this.f84380X = bVar;
        this.f84374R = bVar.mo64656c();
        this.f84360D = eVar;
        this.f84363G = new C9381g(Looper.getMainLooper(), this);
        mo65661b((View) followFeedLayout);
        ButterKnife.bind((Object) this, (View) followFeedLayout);
        mo65651a((View) followFeedLayout);
        followFeedLayout.setOnAttachStateChangeListener(this);
        mo65647C();
        C32404a aVar2 = new C32404a(this.f84374R, this.f84397n, this.f84398o, aVar, mo65668o());
        this.f84366J = aVar2;
        if (this.f84389f != null) {
            this.f84389f.setTapListener(this.f84373Q);
            this.f84389f.setDisabilityOnClickListener(new C32428a(this));
        }
        this.f84382Z = new C31980a(this.f84407x, new C31988e() {
            /* renamed from: a */
            public final String mo56221a() {
                return BaseForwardViewHolder.this.mo65673r();
            }

            /* renamed from: a */
            public final void mo49741a(int i, User user) {
                if (BaseForwardViewHolder.this.f84360D != null) {
                    BaseForwardViewHolder.this.f84360D.mo64669b(BaseForwardViewHolder.this.f84362F);
                }
            }
        });
        this.f84368L = C23279d.m57258a((FragmentActivity) mo65546b(), this.itemView);
    }

    /* renamed from: a */
    public void mo65657a(Aweme aweme, List<Comment> list, List<User> list2, String str, String str2) {
        if (aweme != null && !TextUtils.isEmpty(str)) {
            this.f84367K = str;
            this.f84362F = aweme;
            this.f84378V = list;
            this.f84364H = list2;
            this.f84369M.mo65540a(aweme, str, str2);
            mo65674s();
            this.f84379W = false;
        }
    }
}
