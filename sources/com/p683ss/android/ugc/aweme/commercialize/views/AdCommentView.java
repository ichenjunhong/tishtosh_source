package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25708a;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.comment.C22349c;
import com.p683ss.android.ugc.aweme.p1308ad.common.C22381a;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.C22324a;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22434b;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22442i;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdCommentView */
public class AdCommentView extends LinearLayout {

    /* renamed from: a */
    protected String f69896a;

    /* renamed from: b */
    protected Aweme f69897b;

    /* renamed from: c */
    protected WeakReference<C22324a> f69898c;
    @BindView(2131492992)
    LinearLayout contentll;

    /* renamed from: d */
    C25735b f69899d;

    /* renamed from: e */
    private C26129j f69900e;

    /* renamed from: f */
    private C25908e f69901f;

    /* renamed from: g */
    private C52670a<C52860x> f69902g;

    /* renamed from: h */
    private C52670a<C52860x> f69903h;
    @BindView(2131492927)
    CircleImageView mAvatarView;
    @BindView(2131492982)
    View mCommentContainer;
    @BindView(2131492984)
    TextView mCommentStyleView;
    @BindView(2131492985)
    TextView mCommentTimeView;
    @BindView(2131492990)
    MentionTextView mContentView;
    @BindView(2131493185)
    RelativeLayout mDiggLayout;
    @BindView(2131493163)
    ImageView mDiggView;
    @BindView(2131493066)
    ImageView mMenuItem;
    @BindView(2131493346)
    TextView mReplyCommentStyleView;
    @BindView(2131493347)
    View mReplyContainer;
    @BindView(2131493348)
    MentionTextView mReplyContentView;
    @BindView(2131493349)
    View mReplyDivider;
    @BindView(2131493350)
    TextView mReplyTitleView;
    @BindView(2131493504)
    DmtTextView mTitleView;
    @BindDimen(2131230811)
    int size;

    public C26129j getData() {
        return this.f69900e;
    }

    public String getEventType() {
        return this.f69896a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo54240a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo54244e() {
        return C22317a.m55223a().f60114a.mo46447a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo54245f() {
        C22434b.m55466c(getEventType());
        m64294a(4);
    }

    /* renamed from: j */
    private void m64297j() {
        if (this.f69898c.get() != null) {
            ((C22324a) this.f69898c.get()).mo46458a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ C52860x mo54246g() {
        if (this.f69897b == null || !this.f69897b.isAd()) {
            return null;
        }
        m64295a("title");
        mo54245f();
        m64296i();
        return null;
    }

    /* access modifiers changed from: protected */
    public String getDiggSpKey() {
        StringBuilder sb = new StringBuilder("COMMENT_DIGG");
        sb.append(this.f69900e.getAwemeId());
        return sb.toString();
    }

    /* renamed from: i */
    private void m64296i() {
        if (this.f69900e != null && this.f69897b != null && this.f69897b.getAdCommentStruct() == null) {
            C22317a.m55223a().f60114a.mo46446a(getContext(), this.f69897b);
            m64297j();
            C22317a.m55223a().f60116c.mo46432a(this.f69896a, "click_comment_link", this.f69897b, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo54243d() {
        boolean e = mo54244e();
        if (this.f69900e.getUserDigged() == 1) {
            this.mDiggView.setSelected(true);
            this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a2p));
            return;
        }
        this.mDiggView.setSelected(false);
        if (e) {
            this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a2r));
        } else {
            this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a2q));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (com.p683ss.android.common.util.C18920g.m46052b(r2, r4) != false) goto L_0x003f;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ p2628d.C52860x mo54250h() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.commercialize.model.j r0 = r6.f69900e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f69897b
            if (r0 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f69897b
            boolean r0 = r0.isAd()
            if (r0 != 0) goto L_0x0013
            goto L_0x0050
        L_0x0013:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f69897b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f69897b
            boolean r2 = r2.isAppAd()
            if (r2 == 0) goto L_0x003f
            android.content.Context r2 = r6.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f69897b
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0039
            boolean r5 = r3.isAd()
            if (r5 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            java.lang.String r4 = r3.getPackageName()
        L_0x0039:
            boolean r2 = com.p683ss.android.common.util.C18920g.m46052b(r2, r4)
            if (r2 == 0) goto L_0x004c
        L_0x003f:
            com.ss.android.ugc.aweme.ad.a.a r2 = com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a.m55223a()
            com.ss.android.ugc.aweme.ad.a.c r2 = r2.f60116c
            android.content.Context r3 = r6.getContext()
            r2.mo46426a(r3, r0)
        L_0x004c:
            r6.mo54245f()
            return r1
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.AdCommentView.mo54250h():d.x");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54240a() {
        if (this.f69897b != null && this.f69897b.isAd()) {
            if (this.f69900e.getCommentStyle() == 1) {
                C22317a.m55223a().f60116c.mo46442e(getContext(), this.f69897b.getAwemeRawAd());
            } else if (this.f69900e.getCommentStyle() == 0) {
                C22317a.m55223a().f60116c.mo46440d(getContext(), this.f69897b.getAwemeRawAd());
            }
        }
        C22317a.m55223a().f60116c.mo46432a(this.f69896a, "show_comment_link", this.f69897b, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo54242c() {
        boolean z;
        String commentInfo = this.f69900e.getCommentInfo();
        if (this.f69897b != null && !TextUtils.isEmpty(commentInfo)) {
            boolean isAd = this.f69897b.isAd();
            if (this.f69897b.getAdCommentStruct() != null) {
                z = true;
            } else {
                z = false;
            }
            if (isAd && z) {
                C22434b.m55466c(getEventType());
                List a = C22349c.f60208a.mo46452a(this.f69900e, this.f69897b.getAwemeRawAd(), this.f69903h);
                this.mContentView.setText(C22317a.m55223a().f60114a.mo46451b(this.f69900e));
                this.mContentView.mo95551a(a, (C48160d) new C45549f(true));
                this.mContentView.setMovementMethod(LinkMovementMethod.getInstance());
                C47795d.m103429a(this.contentll);
                return;
            }
            List a2 = C22317a.m55223a().f60114a.mo46443a(getContext(), this.f69897b, this.f69900e);
            this.mContentView.setText(C22317a.m55223a().f60114a.mo46451b(this.f69900e));
            if (a2 != null) {
                this.mContentView.mo95551a(a2, (C48160d) new C45549f(true));
                this.mContentView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo54241b() {
        String str;
        C13952d dVar;
        Context context;
        if (((C13833a) this.mAvatarView.getHierarchy()).f36079a != null) {
            ((C13833a) this.mAvatarView.getHierarchy()).f36079a.mo25939c((float) C23728o.m58241a(0.5d));
            ((C13833a) this.mAvatarView.getHierarchy()).f36079a.mo25938b(this.mAvatarView.getResources().getColor(R.color.j5));
        }
        User user = this.f69900e.getUser();
        if (user != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                C23515d.m57668a((RemoteImageView) this.mAvatarView, 2131953301);
            } else {
                CircleImageView circleImageView = this.mAvatarView;
                int i = this.size;
                int i2 = this.size;
                C13791d controllerListener = this.mAvatarView.getControllerListener();
                if (!(circleImageView == null || avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0)) {
                    if (i <= 0 || i2 <= 0) {
                        dVar = null;
                    } else {
                        dVar = new C13952d(i, i2);
                    }
                    if (circleImageView.getContext() != null) {
                        context = circleImageView.getContext().getApplicationContext();
                    } else {
                        context = null;
                    }
                    C14229b[] a = C23515d.m57684a(avatarThumb, dVar, (C14234d) null);
                    if (!(a == null || a.length == 0)) {
                        C13773e eVar = (C13773e) ((C13773e) C13771c.m27870a().mo25759b(circleImageView.getController())).mo25755a((REQUEST[]) a);
                        eVar.mo25751a(C23515d.m57662a(controllerListener, a[0].mSourceUri, context, avatarThumb));
                        circleImageView.setController(eVar.mo25763d());
                    }
                }
            }
        }
        mo54242c();
        this.mCommentTimeView.setVisibility(8);
        this.mDiggLayout.setVisibility(0);
        int a2 = C22381a.m55385a().mo46604a(getDiggSpKey(), -1);
        if (a2 != -1) {
            this.f69900e.setUserDigged(a2);
        }
        mo54243d();
        this.mCommentStyleView.setVisibility(8);
        this.mCommentStyleView.setText(getResources().getText(R.string.ma));
        this.mCommentStyleView.setBackgroundResource(R.drawable.vg);
        DmtTextView dmtTextView = this.mTitleView;
        if (TextUtils.isEmpty(this.f69900e.getCommentNickName())) {
            str = "";
        } else {
            str = this.f69900e.getCommentNickName();
        }
        dmtTextView.setText(str);
        this.mTitleView.setFontType(C10751d.f28903b);
        this.mTitleView.getPaint().setFakeBoldText(true);
        if (mo54244e()) {
            this.mTitleView.setTextColor(this.mContentView.getResources().getColor(R.color.a1o));
            this.mContentView.setTextColor(this.mContentView.getResources().getColor(R.color.a1l));
        }
    }

    public void setEventType(String str) {
        this.f69896a = str;
    }

    public AdCommentView(Context context) {
        this(context, null);
    }

    public void setOnInternalEventListener(C22324a aVar) {
        this.f69898c = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    private void m64294a(int i) {
        if (this.f69900e != null && this.f69897b != null && this.f69897b.isAd()) {
            if (!this.f69901f.mo53244a()) {
                this.f69901f.mo53240a(getContext(), this.f69897b);
            }
            C22317a.m55223a().f60114a.mo46448a(getContext(), this.f69897b, this.f69901f, i, this.f69899d);
        }
    }

    public void setData(C26129j jVar) {
        this.f69900e = jVar;
        String aid = jVar.getAid();
        IAwemeService a = C23324d.m57378a();
        Aweme rawAdAwemeById = a.getRawAdAwemeById(aid);
        Aweme awemeById = a.getAwemeById(aid);
        Aweme profileSelfSeeAweme = a.getProfileSelfSeeAweme(aid);
        if (rawAdAwemeById != null) {
            profileSelfSeeAweme = rawAdAwemeById;
        } else if (awemeById != null) {
            profileSelfSeeAweme = awemeById;
        }
        this.f69897b = profileSelfSeeAweme;
        mo54241b();
    }

    /* renamed from: a */
    private void m64295a(String str) {
        AwemeRawAd awemeRawAd = this.f69897b.getAwemeRawAd();
        if (awemeRawAd != null) {
            String openUrl = awemeRawAd.getOpenUrl();
            C22434b.m55466c(getEventType());
            C22317a.m55223a().f60116c.mo46427a(getContext(), awemeRawAd, str);
            if (C22317a.m55223a().f60114a.mo46450a(openUrl)) {
                C22317a.m55223a().f60116c.mo46433b(getContext(), this.f69897b);
            } else {
                C22317a.m55223a().f60116c.mo46438c(getContext(), awemeRawAd);
            }
        }
    }

    @OnClick({2131493185, 2131492927, 2131493504, 2131492983, 2131492992, 2131492990, 2131492982, 2131492984})
    public void onClick(View view) {
        String str;
        String str2;
        if (this.f69900e != null && this.f69897b != null) {
            int id = view.getId();
            if (id == R.id.b7f) {
                C26129j jVar = this.f69900e;
                int i = 1;
                if (this.f69900e.getUserDigged() == 1) {
                    i = 0;
                }
                jVar.setUserDigged(i);
                mo54243d();
                C22381a.m55385a().mo46605b(getDiggSpKey(), this.f69900e.getUserDigged());
                C47718bf.m103288a(new C25708a());
                return;
            }
            if (id == R.id.title || id == R.id.hi) {
                if (id == R.id.title) {
                    str = LeakCanaryFileProvider.f132049i;
                } else {
                    str = "photo";
                }
                AwemeRawAd awemeRawAd = this.f69897b.getAwemeRawAd();
                if (awemeRawAd != null) {
                    String openUrl = awemeRawAd.getOpenUrl();
                    C22434b.m55466c(getEventType());
                    C22317a.m55223a().f60116c.mo46427a(getContext(), this.f69897b.getAwemeRawAd(), str);
                    if (C22317a.m55223a().f60114a.mo46450a(openUrl)) {
                        C22317a.m55223a().f60116c.mo46425a(getContext(), this.f69897b);
                    } else {
                        C22317a.m55223a().f60116c.mo46434b(getContext(), awemeRawAd);
                    }
                }
                C22434b.m55466c(getEventType());
                m64294a(35);
                if (this.f69897b != null && this.f69897b.getAdCommentStruct() == null && C22317a.m55223a().f60114a.mo46449a(this.f69897b)) {
                    C22317a.m55223a().f60117d.mo46455a(getContext(), this.f69897b.getAuthor());
                }
            } else if (id != R.id.zw) {
                C22434b.m55466c(getEventType());
                if (id == R.id.xl) {
                    m64296i();
                }
            } else {
                if (id == R.id.zw) {
                    str2 = "title";
                } else {
                    str2 = null;
                }
                m64295a(str2);
                mo54245f();
                m64296i();
            }
        }
    }

    public AdCommentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69896a = "";
        this.f69901f = new C25908e();
        this.f69899d = new C25735b() {
        };
        this.f69902g = new C26650a(this);
        this.f69903h = new C26651b(this);
        LayoutInflater.from(context).inflate(R.layout.rs, this);
        setLayoutParams(new LayoutParams(-1, -2));
        ButterKnife.bind((View) this);
        setOrientation(1);
        C22442i.m55472a(this.mContentView);
        C22442i.m55472a(this.mReplyContentView);
    }
}
