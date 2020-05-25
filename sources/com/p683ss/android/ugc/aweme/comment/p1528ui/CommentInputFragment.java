package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.livedata.SlideData;
import com.p683ss.android.ugc.aweme.base.p1411c.C23484c;
import com.p683ss.android.ugc.aweme.base.p1411c.C23488g;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.C25156f;
import com.p683ss.android.ugc.aweme.comment.api.C25137a;
import com.p683ss.android.ugc.aweme.comment.experiment.HomeUIOptimizeDetailComment;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25144a;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25149c;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25207a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25219b;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25230h;
import com.p683ss.android.ugc.aweme.comment.services.C25284c;
import com.p683ss.android.ugc.aweme.comment.services.C25285d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.detail.p1628ui.FadeImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30491n;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30493o;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30500t;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1402b.C23344b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.CommentDependServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45427bj;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentInputFragment */
public class CommentInputFragment extends C11079a implements C25144a, C25285d {

    /* renamed from: a */
    public C30500t f66902a;

    /* renamed from: b */
    public C25284c f66903b;

    /* renamed from: c */
    public C25156f f66904c;

    /* renamed from: d */
    public C25149c f66905d;

    /* renamed from: e */
    public String f66906e;
    FadeImageView ivAt;
    FadeImageView ivEmoji;

    /* renamed from: j */
    private View f66907j;

    /* renamed from: k */
    private boolean f66908k;

    /* renamed from: l */
    private boolean f66909l;
    AppCompatCheckBox mCbForward;
    MentionEditText mEditText;
    View mLayout;
    ImageView mSendCommentView;
    ViewGroup mVgCommentContainer;
    FadeImageView report;
    View tabDivider;

    /* renamed from: c */
    public final void mo51783c(Comment comment) {
    }

    /* renamed from: i */
    public final Comment mo51788i() {
        return null;
    }

    /* renamed from: e */
    public final void mo51235e() {
        if (isViewValid()) {
        }
    }

    /* renamed from: h */
    public final Aweme mo51787h() {
        return mo51811n();
    }

    /* renamed from: m */
    public final boolean mo51792m() {
        return C47718bf.m103292e(this);
    }

    public void onPause() {
        super.onPause();
        this.f29769b_ = false;
    }

    public boolean isViewValid() {
        if (!super.isViewValid() || getContext() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final String mo51789j() {
        if (this.f66903b != null) {
            return this.f66903b.ay_();
        }
        return "";
    }

    /* renamed from: n */
    public final Aweme mo51811n() {
        if (this.f66903b != null) {
            return this.f66903b.mo51778b();
        }
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f66903b = null;
        C47718bf.m103291d(this);
    }

    public void onResume() {
        super.onResume();
        mo51229b();
        m61516a(9);
    }

    /* renamed from: p */
    private String m61519p() {
        if (this.f66903b == null || this.f66903b.mo51778b() == null) {
            return "";
        }
        return this.f66903b.mo51778b().getAid();
    }

    /* renamed from: a */
    public final void mo51226a() {
        if (this.mEditText != null) {
            mo51235e();
            if (this.f66904c != null) {
                this.f66904c.mo51279a();
                this.f66904c.mo51250o();
            }
        }
    }

    /* renamed from: c */
    public final void mo51231c() {
        this.f66908k = true;
        if (this.mLayout != null) {
            this.mLayout.setVisibility(4);
            this.mLayout.setEnabled(false);
        }
    }

    /* renamed from: d */
    public final void mo51233d() {
        int i = 0;
        this.f66908k = false;
        if (this.mLayout != null) {
            View view = this.mLayout;
            if (this.f66909l) {
                i = 4;
            }
            view.setVisibility(i);
            this.mLayout.setEnabled(true);
        }
    }

    /* renamed from: g */
    public final void mo51237g() {
        C0654k fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            Fragment a = fragmentManager.mo2224a("comment_input_tag");
            if (a != null) {
                fragmentManager.mo2225a().mo2177a(a).mo2195c();
            }
        }
    }

    /* renamed from: k */
    public final int mo51790k() {
        Aweme n = mo51811n();
        if (n != null && n.isAwemeFromXiGua()) {
            return 5;
        }
        if (n == null || !n.isAwemeFromDongCheDi()) {
            return 1;
        }
        return 6;
    }

    /* renamed from: b */
    public final void mo51229b() {
        if (isViewValid()) {
            if (!C20854a.m53167g().isLogin()) {
                this.mEditText.setFocusable(false);
            } else {
                this.mEditText.setFocusable(true);
                this.mEditText.setFocusableInTouchMode(true);
                this.mEditText.requestFocus();
            }
            if (this.f66904c != null) {
                this.f66904c.mo51279a();
            }
        }
    }

    /* renamed from: f */
    public final void mo51236f() {
        if (this.f66907j != null && this.mEditText != null && this.f66907j.getVisibility() == 0) {
            this.f66907j.setVisibility(8);
            this.mEditText.setEnabled(true);
            this.mEditText.setFocusable(true);
        }
    }

    /* renamed from: o */
    private boolean m61518o() {
        if (this.f66903b == null || this.f66903b.mo51778b() == null) {
            return false;
        }
        Aweme b = this.f66903b.mo51778b();
        if (b == null || b.getStatus() == null || b.getStatus().getPrivateStatus() != 1 || b.getAuthor() == null || !TextUtils.equals(b.getAuthor().getUid(), C20854a.m53167g().getCurUser().getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo51791l() {
        if (!isViewValid()) {
            return false;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || !C20854a.m53167g().isLogin()) {
            return false;
        }
        Aweme n = mo51811n();
        if (C36330a.m81964a(n)) {
            C10691a.m21545b(getContext(), C36330a.m81963a(n, R.string.fc_)).mo19066a();
            return false;
        } else if (n != null && !n.isCanPlay()) {
            if (n.isImage()) {
                C9432q.m18672a(getContext(), (int) R.string.bqo);
            } else {
                C9432q.m18672a(getContext(), (int) R.string.fc_);
            }
            return false;
        } else if (n != null && n.getStatus() != null && n.getStatus().isDelete()) {
            C9432q.m18672a((Context) activity, (int) R.string.fax);
            return false;
        } else if (n != null && n.getStatus() != null && !n.getStatus().isAllowComment()) {
            C9432q.m18672a((Context) activity, (int) R.string.wa);
            return false;
        } else if (C47950q.m103754c(n) && !C47950q.m103756e(n) && (n.getAuthor() == null || !TextUtils.equals(n.getAuthor().getUid(), C20854a.m53167g().getCurUser().getUid()))) {
            C9432q.m18672a((Context) activity, (int) R.string.b6v);
            return false;
        } else if (m61518o()) {
            m61517a(n);
            return false;
        } else if (n == null || !n.isAwemeFromXiGua()) {
            return true;
        } else {
            return false;
        }
    }

    @C53771m
    public void onAfterLoginInEvent(C23488g gVar) {
        if (this.mVgCommentContainer != null) {
        }
    }

    @C53771m
    public void onEvent(C23484c cVar) {
        if (this.mVgCommentContainer != null) {
        }
    }

    /* renamed from: a */
    private void m61516a(int i) {
        if (this.f66903b != null) {
            this.f66903b.mo60714a(new C30332aw(i));
        }
    }

    /* renamed from: d */
    public final void mo51234d(boolean z) {
        if (this.mLayout != null) {
            this.mLayout.post(new C25364d(this, z));
        }
    }

    /* renamed from: f */
    public final void mo51786f(boolean z) {
        this.mLayout.setVisibility(0);
        m61516a(9);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f66904c = new C25156f(this, hashCode(), this);
    }

    /* renamed from: b */
    public final void mo51782b(String str) {
        String str2;
        String str3;
        Aweme n = mo51811n();
        String str4 = this.f66906e;
        if (n == null) {
            str2 = "";
        } else {
            str2 = n.getAid();
        }
        if (n == null) {
            str3 = "";
        } else {
            str3 = n.getAuthorUid();
        }
        C25207a.m61289a(str, str4, str2, str3);
    }

    /* renamed from: e */
    public final void mo51784e(boolean z) {
        this.mLayout.setVisibility(4);
        m61516a(8);
        if (this.f66905d != null) {
            this.f66905d.mo51276a(z);
        }
    }

    /* renamed from: e_ */
    public final void mo51785e_(boolean z) {
        if (z) {
            C23794bh.m58391e().mo65597b(mo51789j(), mo51811n(), C22858c.f61208d, "click_original");
        }
    }

    /* renamed from: a */
    private void m61517a(final Aweme aweme) {
        if (aweme != null) {
            this.f66902a.mo60917a(aweme, 0);
            new C10643a(getContext()).mo18899b((int) R.string.cxi).mo18900b((int) R.string.wf, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C26890h.onEvent(new MobClick().setEventName("private_permission").setLabelName("cancel").setValue(aweme.getAid()));
                }
            }).mo18886a((int) R.string.buu, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CommentInputFragment.this.f66902a.mo44934a_(aweme.getAid(), Integer.valueOf(1));
                    C26890h.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(aweme.getAid()));
                }
            }).mo18897a().mo18882b();
        }
    }

    /* renamed from: c */
    public final void mo51232c(boolean z) {
        int i;
        if (!(this.f66907j == null || this.mEditText == null)) {
            View view = this.f66907j;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            this.mEditText.setEnabled(!z);
            this.mEditText.setFocusable(!z);
            Aweme n = mo51811n();
            if (n != null && this.f66907j.getVisibility() == 0) {
                this.f66907j.setOnClickListener(new C25365e(this, n));
            }
        }
    }

    @C53771m
    public void onCommentEvent(C25064a aVar) {
        if (aVar.f66393a == 8) {
            String str = (String) aVar.f66394b;
            Aweme n = mo51811n();
            if (n != null && n.getAid() != null && n.getAid().equals(str) && this.f66904c != null) {
                this.f66904c.mo51279a();
            }
        }
    }

    @C53771m
    public void onDislikeAwemeEvent(C30340i iVar) {
        float f;
        if (getActivity() != null && iVar.f79254e == getActivity().hashCode() && iVar.f79251b == 2) {
            if (iVar.f79250a) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C45427bj.m98998a(this.mVgCommentContainer, this.mVgCommentContainer.getAlpha(), f);
            C45427bj.m98998a(this.tabDivider, this.tabDivider.getAlpha(), f);
        }
    }

    /* renamed from: a */
    public final void mo51227a(float f) {
        int i;
        if (this.mLayout != null) {
            this.mLayout.setAlpha(f);
            View view = this.mLayout;
            boolean z = false;
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
            if (f > 0.0f) {
                z = true;
            }
            mo51228a(z);
        }
    }

    /* renamed from: b */
    public final void mo51230b(boolean z) {
        float f;
        if (this.mLayout == null) {
            this.f66909l = z;
            return;
        }
        View view = this.mLayout;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
        if (z) {
            this.mLayout.setVisibility(4);
        }
        this.mLayout.post(new C25363c(this, z));
    }

    @C53771m
    public void onEvent(C32385a aVar) {
        if (!(!isViewValid() || getActivity() == null || aVar == null || aVar.f84279d != 1 || aVar.f84276a == null)) {
            if (aVar.f84280e == hashCode()) {
                C23794bh.m58391e().mo65594a(mo51789j(), aVar.f84278c, C22858c.f61208d, "click_comment", true);
            }
            if (isViewValid() && getActivity() != null) {
                mo51226a();
                C23324d.m57378a().increaseCommentCount(m61519p());
            }
        }
    }

    /* renamed from: b */
    public final void mo51781b(Comment comment) {
        if (isViewValid() && getActivity() != null) {
            C9432q.m18672a((Context) getActivity(), (int) R.string.a9l);
            mo51226a();
            C23324d.m57378a().increaseCommentCount(m61519p());
            Aweme n = mo51811n();
            if (n != null && n.isAd()) {
                CommentDependServiceImpl.provideCommentDependService_Monster().logFeedRawAdComment(getContext(), n, "comment_sign");
            }
            List<TextExtraStruct> textExtra = comment.getTextExtra();
            if (!(textExtra == null || this.f66904c == null)) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    Iterator it = this.f66904c.f66587c.iterator();
                    while (it.hasNext()) {
                        User user = (User) it.next();
                        if (TextUtils.equals(user.getUid(), textExtraStruct.getUserId())) {
                            int atType = user.getAtType();
                            if (atType == 3) {
                                C26890h.m65007a(getContext(), "comment_at", "follow", m61519p(), user.getUid());
                            } else if (atType == 1) {
                                C26890h.m65007a(getContext(), "comment_at", "search", m61519p(), user.getUid());
                            } else if (atType == 4) {
                                C26890h.m65007a(getContext(), "comment_at", "recent", m61519p(), user.getUid());
                            }
                        }
                    }
                }
            }
            C47718bf.m103288a(new C25064a(3, new Object[]{m61519p(), comment.clone()}));
        }
    }

    /* renamed from: a */
    public final void mo51228a(boolean z) {
        if (isViewValid()) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mLayout.getLayoutParams();
            if (!z || this.mVgCommentContainer.getVisibility() != 8) {
                if (!z && this.mVgCommentContainer.getVisibility() == 0) {
                    this.mVgCommentContainer.setVisibility(8);
                    this.tabDivider.setVisibility(8);
                    marginLayoutParams.height = 1;
                    this.mLayout.setLayoutParams(marginLayoutParams);
                    mo51235e();
                }
                return;
            }
            this.mVgCommentContainer.setVisibility(0);
            C23729p.m58257a(this.tabDivider, 0);
            marginLayoutParams.height = getContext().getResources().getDimensionPixelOffset(R.dimen.xr);
            if (C22453b.m55510c()) {
                marginLayoutParams.height += C22453b.f60461a;
            }
            this.mLayout.setLayoutParams(marginLayoutParams);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        if (this.f66904c != null) {
            C25156f fVar = this.f66904c;
            MentionEditText mentionEditText = this.mEditText;
            FadeImageView fadeImageView = this.ivAt;
            FadeImageView fadeImageView2 = this.ivEmoji;
            Aweme n = mo51811n();
            if (n != null) {
                str = n.getAid();
            } else {
                str = "";
            }
            String str2 = str;
            String str3 = this.f66906e;
            fVar.f66596l = this.report;
            fVar.mo51242a(mentionEditText, (View) fadeImageView, (View) fadeImageView2, str2, str3);
        }
        this.mEditText.setCursorVisible(false);
        this.mSendCommentView.setVisibility(8);
        this.mCbForward.setVisibility(8);
        this.mSendCommentView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                Aweme n = CommentInputFragment.this.mo51811n();
                if (n == null || n.getAwemeControl().canComment()) {
                    C25230h.m61352a(CommentInputFragment.this.getContext(), new C25219b() {
                        /* renamed from: a */
                        public final void mo51480a(boolean z) {
                            CommentInputFragment.this.f66904c.mo51286a(CommentInputFragment.this.mEditText.getText(), CommentInputFragment.this.mEditText.getTextExtraStructList(), CommentInputFragment.this.f66904c.f66594j, false);
                        }
                    });
                } else {
                    C10691a.m21548c(CommentInputFragment.this.getContext(), (int) R.string.aij).mo19066a();
                }
            }
        });
        this.mVgCommentContainer.setBackgroundResource(R.drawable.dhm);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mEditText.getLayoutParams();
        marginLayoutParams.leftMargin = C23728o.m58241a(10.0d);
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(C23728o.m58241a(10.0d));
        }
        this.mEditText.setTextColor(this.mEditText.getResources().getColor(R.color.v6));
        this.mEditText.setHintTextColor(this.mEditText.getResources().getColor(R.color.vg));
        this.mEditText.setPadding(0, 0, C23728o.m58241a(10.0d), 0);
        if (VERSION.SDK_INT >= 17) {
            this.mEditText.setTextDirection(3);
            this.mEditText.setTextAlignment(5);
        }
        this.ivAt.setVisibility(8);
        this.ivEmoji.setVisibility(8);
        this.mVgCommentContainer.setPadding(0, this.mVgCommentContainer.getPaddingTop(), 0, this.mVgCommentContainer.getPaddingBottom());
        C22453b.m55505a().mo46744a(2, this.mVgCommentContainer, this.tabDivider, this.f66907j, null);
        this.ivAt.setVisibility(8);
        this.ivEmoji.setVisibility(8);
        if (this.f66908k) {
            mo51231c();
        }
        mo51230b(this.f66909l);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            SlideData slideData = (SlideData) C0214z.m440a(activity).mo359a(SlideData.class);
            slideData.mo48721a().observe(this, new C25329a(this));
            slideData.mo48722b().observe(this, new C25358b(this));
        }
        if (C10181b.m20511a().mo18172a(HomeUIOptimizeDetailComment.class, true, "home_ui_optimize_detail_icon", 31744, false)) {
            this.ivAt.setVisibility(0);
            this.ivEmoji.setVisibility(0);
            this.mEditText.setTextColor(this.mEditText.getResources().getColor(R.color.v6));
            this.mEditText.setHintTextColor(this.mEditText.getResources().getColor(R.color.vg));
            this.ivAt.setImageResource(R.drawable.cie);
            this.ivEmoji.setImageResource(R.drawable.cic);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C23344b.f62351a.mo48400a(getActivity(), R.layout.b1k, layoutInflater, viewGroup);
        if (viewGroup instanceof RelativeLayout) {
            LayoutParams layoutParams = new LayoutParams(C9432q.m18670a((Context) getActivity()), -2);
            layoutParams.addRule(12);
            a.setLayoutParams(layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C9432q.m18670a((Context) getActivity()), -2);
            layoutParams2.gravity = 80;
            a.setLayoutParams(layoutParams2);
        } else {
            a.setLayoutParams(new ViewGroup.LayoutParams(C9432q.m18670a((Context) getActivity()), -2));
        }
        this.f66907j = a.findViewById(R.id.c4);
        C47718bf.m103290c(this);
        ButterKnife.bind((Object) this, a);
        this.f66902a = new C30493o(getContext());
        this.f66902a.mo54799a(new C30491n());
        return a;
    }

    /* renamed from: a */
    public final void mo51780a(Exception exc, int i, Comment comment) {
        int i2;
        Context context = this.mEditText.getContext();
        if (i == 3) {
            i2 = R.string.b65;
        } else {
            i2 = R.string.a8l;
        }
        C25137a.m61051a(context, exc, i2);
        if (i == 3) {
            C23794bh.m58391e().mo65594a(mo51789j(), mo51811n(), C22858c.f61208d, "click_comment", false);
        }
    }

    /* renamed from: a */
    public final void mo51779a(int i, int i2, String str, String str2, String str3) {
        if (this.f66903b != null) {
            this.f66903b.mo51776a(i2);
        }
        m61516a(11);
    }
}
