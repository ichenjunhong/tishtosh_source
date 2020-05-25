package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0199s;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.p030v4.p037e.C0761a;
import android.support.p030v4.view.C1056u;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25591a;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25594d;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.experiment.C30224d;
import com.p683ss.android.ugc.aweme.feed.experiment.HomeUIOptimizeTitleSize;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p683ss.android.ugc.aweme.feed.widget.C31242a;
import com.p683ss.android.ugc.aweme.feed.widget.C31243b;
import com.p683ss.android.ugc.aweme.feed.widget.C31245d;
import com.p683ss.android.ugc.aweme.feed.widget.C31247f;
import com.p683ss.android.ugc.aweme.feed.widget.C31251j;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.C35914e;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23250t;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bm */
public final class C30808bm extends C31009h implements C0199s<C23274a> {

    /* renamed from: A */
    private boolean f80705A;

    /* renamed from: B */
    private int f80706B;

    /* renamed from: a */
    public MentionTextView f80707a;

    /* renamed from: b */
    public TextView f80708b;

    /* renamed from: c */
    public TranslationStatusView f80709c;

    /* renamed from: d */
    LinearLayout f80710d;

    /* renamed from: e */
    public C30879cr f80711e;

    /* renamed from: f */
    public SpannableStringBuilder f80712f;

    /* renamed from: g */
    public int f80713g;

    /* renamed from: h */
    public SpannableStringBuilder f80714h;

    /* renamed from: i */
    public int f80715i;

    /* renamed from: j */
    private C25908e f80716j;

    /* renamed from: k */
    private C25735b f80717k;

    /* renamed from: w */
    private C30787bb f80718w;

    /* renamed from: x */
    private boolean f80719x;

    /* renamed from: y */
    private boolean f80720y;

    /* renamed from: z */
    private boolean f80721z;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bm$a */
    static class C30811a extends ClickableSpan {

        /* renamed from: a */
        private WeakReference<C30808bm> f80726a;

        /* renamed from: b */
        private SpannableStringBuilder f80727b;

        /* renamed from: c */
        private boolean f80728c;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(-1);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C30808bm bmVar = (C30808bm) this.f80726a.get();
            if (bmVar != null) {
                bmVar.mo63530a(this.f80727b, this.f80728c);
            }
        }

        C30811a(C30808bm bmVar, SpannableStringBuilder spannableStringBuilder, boolean z) {
            this.f80726a = new WeakReference<>(bmVar);
            this.f80727b = spannableStringBuilder;
            this.f80728c = z;
        }
    }

    /* renamed from: j */
    public static String m72214j() {
        return " [sponsor]";
    }

    /* renamed from: a */
    public final void mo49781a() {
    }

    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b6q);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f80707a = (MentionTextView) view2.findViewById(R.id.a4e);
        if (this.f80707a == null) {
            view2 = C35914e.m81075a(getClass().getName(), view2, this.f81198r, R.layout.b6q);
        }
        this.f80708b = (TextView) view2.findViewById(R.id.dhm);
        this.f80708b.setTypeface(Typeface.defaultFromStyle(1));
        this.f80708b.setOnClickListener(new C30812bn(this));
        this.f80709c = (TranslationStatusView) view2.findViewById(R.id.d4a);
        this.f80710d = (LinearLayout) view2.findViewById(R.id.a4n);
        FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.a4h);
        if (HomeUIOptimizeTitleSize.m70950b() && frameLayout != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) frameLayout.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, C23728o.m58241a(90.0d), 0);
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginEnd(C23728o.m58241a(90.0d));
            }
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        SpannableString spannableString;
        super.mo58323a(videoItemParams);
        this.f80719x = false;
        this.f80708b.setVisibility(4);
        this.f80708b.setText(this.f81198r.getString(R.string.b1o));
        this.f80707a.setMaxLines(4);
        mo63532a((CharSequence) "");
        C32458a.m75151c(4, "OriginVideoDescView", "start to bind aweme des");
        boolean z = true;
        if (this.f80707a != null) {
            InputFilter[] filters = this.f80707a.getFilters();
            InputFilter[] inputFilterArr = null;
            int length = filters.length;
            if (filters.length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (filters[i2] instanceof LengthFilter) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                StringBuilder sb = new StringBuilder("descView,InputFilter size:");
                sb.append(length);
                C32458a.m75141a(4, "OriginVideoDescView", sb.toString());
                if (i >= 0) {
                    int i3 = length - 1;
                    Object newInstance = Array.newInstance(InputFilter.class, i3);
                    System.arraycopy(filters, 0, newInstance, 0, i);
                    if (i < i3) {
                        System.arraycopy(filters, i + 1, newInstance, i, (length - i) - 1);
                    }
                    inputFilterArr = (InputFilter[]) newInstance;
                }
            }
            if (inputFilterArr == null) {
                StringBuilder sb2 = new StringBuilder("not find InputFilter.LengthFilter,size:");
                sb2.append(length);
                C32458a.m75141a(4, "OriginVideoDescView", sb2.toString());
                inputFilterArr = new InputFilter[0];
            }
            this.f80707a.setFilters(inputFilterArr);
        }
        if (this.f81192l.isAd() && !this.f81192l.getAwemeRawAd().isDisableAdLink() && (!TextUtils.isEmpty(this.f81192l.getAwemeRawAd().getWebUrl()) || this.f81192l.getAwemeRawAd().isRightStyle()) && this.f81192l.isCanPlay()) {
            C32458a.m75151c(4, "OriginVideoDescView", "shouldShowLinkLogo");
            this.f81199s.setVisibility(0);
            if (TextUtils.isEmpty(this.f81192l.getDesc())) {
                this.f81192l.setDesc("");
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f81192l.getDesc());
            sb3.append(m72214j());
            SpannableString spannableString2 = new SpannableString(sb3.toString());
            AwemeTextLabelModel label = this.f81192l.getAwemeRawAd().getLabel();
            if (this.f81192l.isAd() && this.f81192l.getAwemeRawAd().isRightStyle() && label != null) {
                C31242a aVar = new C31242a(this.f81198r, label.getBgColor(), label.getLabelName(), label.getTextColor());
                aVar.f81792a = label.isAdHollowText();
                spannableString2.setSpan(aVar, this.f81192l.getDesc().length() + 1, this.f81192l.getDesc().length() + m72214j().length(), 17);
            } else if (TextUtils.isEmpty(this.f81192l.getAwemeRawAd().getAdMoreTextual())) {
                spannableString2.setSpan(new C25591a(this.f81198r, R.drawable.cse), this.f81192l.getDesc().length() + 1, this.f81192l.getDesc().length() + m72214j().length(), 17);
            } else {
                spannableString2.setSpan(new C31247f(this.f81198r, R.color.cg, this.f81192l.getAwemeRawAd().getAdMoreTextual(), R.drawable.dg7), this.f81192l.getDesc().length() + 1, this.f81192l.getDesc().length() + m72214j().length(), 17);
            }
            mo63532a((CharSequence) spannableString2);
            this.f80707a.setSpanColor(this.f80707a.getCurrentTextColor());
            C47795d.m103429a(this.f80710d);
            m72216o();
        } else {
            if (TextUtils.isEmpty(this.f81192l.getDesc()) || C47915gg.m103651b() || C36330a.m81964a(this.f81192l)) {
                z = false;
            }
            if (z) {
                this.f81199s.setVisibility(0);
                CharSequence desc = this.f81192l.getDesc();
                try {
                    if (mo63538k()) {
                        String desc2 = this.f81192l.getDesc();
                        if (desc2 != null) {
                            if (desc2.length() > m72217p() - m72214j().length()) {
                                desc2 = this.f81192l.getDesc().substring(0, (m72217p() - m72214j().length()) - mo63536d().length());
                            }
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(desc2);
                        sb4.append(m72214j());
                        desc = mo63527a((CharSequence) sb4.toString(), desc2.length());
                    }
                } catch (Exception e) {
                    C32458a.m75145a("init ad label", e);
                }
                mo63532a(desc);
                this.f80707a.setSpanColor(this.f80707a.getCurrentTextColor());
                m72216o();
            } else {
                StringBuilder sb5 = new StringBuilder("don't show desc,empty?");
                sb5.append(TextUtils.isEmpty(this.f81192l.getDesc()));
                C32458a.m75141a(4, "OriginVideoDescView", sb5.toString());
                this.f81199s.setVisibility(8);
            }
        }
        if (m72215n()) {
            this.f81199s.setVisibility(0);
            if (TextUtils.isEmpty(this.f81192l.getDesc())) {
                this.f81192l.setDesc("");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f80707a.getText() == null || TextUtils.isEmpty(this.f80707a.getText().toString().trim())) {
                spannableString = C23794bh.m58393g().mo75751a(this.f81198r, this.f81192l.getDesc(), this.f81192l, this.f81193m, this.f81196p);
            } else {
                spannableStringBuilder.append(this.f80707a.getText());
                spannableString = C23794bh.m58393g().mo75751a(this.f81198r, "", this.f81192l, this.f81193m, this.f81196p);
            }
            if (TextUtils.equals(Build.BRAND.toLowerCase(), "gionee")) {
                try {
                    spannableStringBuilder.append(spannableString);
                } catch (Exception e2) {
                    C32458a.m75148a((Throwable) e2);
                }
            } else {
                spannableStringBuilder.append(spannableString);
            }
            mo63532a((CharSequence) spannableStringBuilder);
            this.f80707a.setSpanColor(this.f80707a.getCurrentTextColor());
            m72216o();
        }
        if (this.f80711e == null) {
            this.f80711e = new C30879cr(this.f81198r, this.f80709c, this.f80707a, this.f80708b);
            this.f80711e.mo63629a(this.f81193m, this.f81196p);
        }
        this.f80711e.mo63622a(this.f81192l);
        this.f80711e.f80870l = false;
        this.f80710d.setOnClickListener(new C30813bo(this));
        if (!FeedParamProvider.m71941a(this.f81198r).isHotSpot() && C23794bh.m58395i().mo76333a(this.f81192l, this.f81202v, this.f81193m)) {
            if (TextUtils.isEmpty(this.f81192l.getDesc())) {
                m72216o();
            }
            C23794bh.m58395i().mo76331a(this.f81198r, this.f81192l, (TextView) this.f80707a);
            this.f81199s.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63531a(View view, TextExtraStruct textExtraStruct) {
        if (textExtraStruct.isClickable() && textExtraStruct != null) {
            if (textExtraStruct.getType() == 1) {
                C26403au.m63863a(textExtraStruct);
                String uuid = UUID.randomUUID().toString();
                SmartRouter.buildRoute(this.f81198r, "//challenge/detail").withParam("aweme_id", this.f81192l.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("process_id", uuid).withParam("extra_challenge_from", this.f81193m).open(10086);
                C26890h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(this.f81193m).setValue(this.f81192l.getAid()).setExtValueString(textExtraStruct.getCid()));
                C25945k.m62911b().mo53139d(this.f81198r, this.f81192l);
                ((C23250t) ((C23250t) ((C23250t) ((C23250t) new C23250t().mo48150f(this.f81193m).mo47940a(this.f81198r)).mo48153s(this.f81192l.getAuthor() != null ? this.f81192l.getAuthor().getUid() : "").mo48151g(this.f81192l.getAid()).mo47954f(this.f81192l).mo48155u(uuid).mo48146c((String) this.f81197q.mo48230b("playlist_type", "")).mo48149e((String) this.f81197q.mo48230b("playlist_id", "")).mo48147d((String) this.f81197q.mo48230b("playlist_id_key", "")).mo48100j((String) this.f81197q.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(this.f81192l, this.f81196p))).mo48154t(textExtraStruct.getCid()).mo47941a("click_in_video_name")).mo48156v(C23198ae.m56847a(this.f81192l, this.f81196p)).mo48076e();
                C30578o.m71566a(C29988ad.CHALLENGE);
            } else if (textExtraStruct.getType() != 0 || ((TextUtils.isEmpty(textExtraStruct.getAwemeId()) && 2 != textExtraStruct.getSubtype()) || !m72212a(textExtraStruct) || this.f81192l.getDesc().charAt(textExtraStruct.getStart()) != '@')) {
                C26890h.m65007a(this.f81198r, LeakCanaryFileProvider.f132049i, "video_at", this.f81192l.getAid(), textExtraStruct.getUserId());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("group_id", "");
                    jSONObject.put("request_id", this.f81194n.get("request_id"));
                    jSONObject.put("enter_from", this.f81193m);
                    jSONObject.put("enter_method", "click_head");
                } catch (Exception unused) {
                }
                if (this.f81192l.getAuthor() != null) {
                    C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(this.f81192l.getAuthor().getUid()).setJsonObject(jSONObject));
                    C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("to_user_id", textExtraStruct.getUserId()).mo47829a("group_id", this.f81192l.getAid()).mo47829a("author_id", this.f81192l.getAuthorUid()).mo47829a("enter_method", "video_at").f61491a);
                }
                SmartRouter.buildRoute(this.f81198r, "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("sec_user_id", textExtraStruct.getSecUid()).withParam("profile_from", "video_at").withParam("enter_from", this.f81193m).withParam("video_id", this.f81192l.getAid()).open();
            } else {
                String str = "";
                String str2 = "";
                String str3 = "";
                if (2 == textExtraStruct.getSubtype()) {
                    if (this.f81192l.getVideoReplyStruct() != null) {
                        VideoReplyStruct videoReplyStruct = this.f81192l.getVideoReplyStruct();
                        String awemeId = videoReplyStruct.getAwemeId() != null ? videoReplyStruct.getAwemeId() : "";
                        String commentId = videoReplyStruct.getCommentId() != null ? videoReplyStruct.getCommentId() : "";
                        str3 = videoReplyStruct.getAliasCommentId() != null ? videoReplyStruct.getAliasCommentId() : "";
                        str = awemeId;
                        str2 = commentId;
                    }
                    C26890h.m65011a("click_comment_chain", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", this.f81192l.getAid()).mo47829a("author_id", this.f81192l.getAuthorUid()).mo47829a("to_group_id", str).mo47829a("reply_comment_id", str2).mo47829a("reply_user_id", textExtraStruct.getUserId()).f61491a);
                } else if (this.f81192l.getAwemeType() == 51) {
                    C26890h.m65011a("click_duet_icon", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", this.f81192l.getAid()).mo47829a("author_id", this.f81192l.getAuthorUid()).mo47829a("to_group_id", textExtraStruct.getAwemeId()).mo47829a("chain_type", "duet").f61491a);
                } else if (this.f81192l.getAwemeType() == 52) {
                    C26890h.m65011a("click_react_icon", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", this.f81192l.getAid()).mo47829a("author_id", this.f81192l.getAuthorUid()).mo47829a("to_group_id", textExtraStruct.getAwemeId()).f61491a);
                } else if (this.f81192l.getAwemeType() == 58) {
                    C26890h.m65011a("click_duet_icon", C23089d.m56640a().mo47829a("chain_type", "stitch").mo47829a("enter_from", this.f81193m).mo47829a("group_id", this.f81192l.getAid()).mo47829a("author_id", this.f81192l.getAuthorUid()).mo47829a("to_group_id", textExtraStruct.getAwemeId()).f61491a);
                }
                if (!C30823by.m72240a(this.f81198r)) {
                    C10691a.m21542b(this.f81198r, (int) R.string.cg1).mo19066a();
                } else if (2 == textExtraStruct.getSubtype()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(",");
                    sb.append(str3);
                    SmartRouter.buildRoute(this.f81198r, "aweme://aweme/detail/").withParam("id", str).withParam("refer", "click_comment_chain").withParam("cid", sb.toString()).withParam("video_from", this.f81193m).open();
                } else {
                    SmartRouter.buildRoute(this.f81198r, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", this.f81193m).withParam("isChain", true).open();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63533a(boolean z) {
        if (this.f81198r != null && this.f81192l != null && this.f81192l.getDesc() != null) {
            boolean a = C47918gj.m103682a(this.f81198r);
            boolean a2 = C0761a.m2155a().mo2427a(this.f81192l.getDesc());
            boolean z2 = false;
            boolean z3 = a != a2;
            try {
                LayoutParams layoutParams = (LayoutParams) this.f80707a.getLayoutParams();
                if (z) {
                    if (!this.f80705A && (!z3 || this.f80721z)) {
                        if (z3 || !this.f80721z) {
                            return;
                        }
                    }
                    this.f80705A = false;
                    this.f80721z = !this.f80721z;
                    C1056u.m3049c((View) this.f80707a, a2 ? 1 : 0);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f80708b.getLayoutParams();
                    layoutParams2.gravity = a2 ? 83 : 85;
                    layoutParams2.leftMargin = C23728o.m58241a(15.0d);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams2.setMarginStart((int) C9432q.m18687b(this.f81198r, 15.0f));
                    }
                    this.f80708b.setLayoutParams(layoutParams2);
                    z2 = z3;
                } else if (C1056u.m3055f(this.f80707a) != a) {
                    this.f80705A = true;
                    C1056u.m3049c((View) this.f80707a, a ? 1 : 0);
                } else {
                    return;
                }
                if (z2) {
                    layoutParams.rightMargin = C23728o.m58241a(15.0d);
                    layoutParams.leftMargin = C23728o.m58241a((double) ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginEnd((int) C9432q.m18687b(this.f81198r, 15.0f));
                        layoutParams.setMarginStart((int) C9432q.m18687b(this.f81198r, 0.0f));
                    }
                } else {
                    layoutParams.leftMargin = C23728o.m58241a(15.0d);
                    layoutParams.rightMargin = C23728o.m58241a((double) ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginStart((int) C9432q.m18687b(this.f81198r, 15.0f));
                        layoutParams.setMarginEnd((int) C9432q.m18687b(this.f81198r, 0.0f));
                    }
                }
                this.f80707a.setLayoutParams(layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo63530a(SpannableStringBuilder spannableStringBuilder, final boolean z) {
        final int i;
        ValueAnimator valueAnimator;
        int i2 = this.f80713g;
        if (!(this.f81192l == null || this.f80709c == null || this.f80709c.getVisibility() != 0)) {
            if (this.f80709c.getStatus() == 2 && this.f81192l.getTransDesc() != null) {
                i2 = (this.f80715i * this.f81192l.getTransDescLines()) / mo63537e();
                if (z) {
                    spannableStringBuilder = new SpannableStringBuilder(this.f81192l.getTransDesc());
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(this.f81192l.getEllipsizeTransDesc());
                }
            } else if (this.f80709c.getStatus() == 0 && this.f81192l.getTransDesc() != null && (TextUtils.equals(this.f81192l.getTransDesc(), this.f80712f) || TextUtils.equals(this.f81192l.getDesc(), this.f81192l.getEllipsizeDesc()))) {
                if (z) {
                    spannableStringBuilder = new SpannableStringBuilder(this.f81192l.getProcessedDesc());
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(this.f81192l.getEllipsizeDesc());
                }
            }
        }
        C26890h.m65011a("video_title", m72211a(z ? "spread" : "fold"));
        if (z) {
            i = 12;
        } else {
            i = mo63537e();
        }
        mo63532a((CharSequence) spannableStringBuilder);
        if (z) {
            valueAnimator = ValueAnimator.ofInt(new int[]{this.f80715i, i2});
        } else {
            valueAnimator = ValueAnimator.ofInt(new int[]{i2, this.f80715i});
        }
        valueAnimator.addUpdateListener(new C30818bt(this));
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    C30808bm.this.f80708b.setText(R.string.b1n);
                } else {
                    C30808bm.this.f80708b.setText(R.string.b1o);
                }
                C30808bm.this.f80708b.setVisibility(4);
            }

            public final void onAnimationEnd(Animator animator) {
                if (z) {
                    if (C30808bm.this.f81192l.getTransDescLines() != 0 && C30808bm.this.f80709c.getVisibility() == 0 && C30808bm.this.f80709c.getStatus() == 2) {
                        C30808bm.this.f80707a.setLines(C30808bm.this.f81192l.getTransDescLines());
                    } else {
                        C30808bm.this.f80707a.post(new C30822bx(this));
                    }
                } else if (C30808bm.this.f80707a.getText().length() > 0) {
                    C30808bm.this.f80707a.setLines(C30808bm.this.mo63537e());
                } else {
                    C30808bm.this.f80707a.setMaxLines(i);
                }
                C30808bm.this.f80708b.setVisibility(0);
            }
        });
        if (this.f80706B == 0) {
            this.f80706B = this.f80708b.getHeight();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, this.f80706B});
        ofInt.addUpdateListener(new C30819bu(this));
        ofInt.setDuration(100);
        ofInt.setStartDelay(150);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{valueAnimator, ofInt});
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo63532a(CharSequence charSequence) {
        try {
            if (C30224d.m70966a()) {
                StringBuilder sb = new StringBuilder("VideoDescView_setDescSafely desc:");
                sb.append(charSequence);
                C32458a.m75141a(4, "OriginVideoDescView", sb.toString());
            }
            this.f80707a.setText(charSequence);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }

    /* renamed from: n */
    private boolean m72215n() {
        return C23794bh.m58393g().mo75754a(this.f81192l);
    }

    /* renamed from: p */
    private int m72217p() {
        return C26503d.m64061d(this.f81192l) ? 200 : 200;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ Object mo63539l() throws Exception {
        C26890h.m65011a("video_title", m72211a("show"));
        return null;
    }

    /* renamed from: d */
    public final String mo63536d() {
        StringBuilder sb = new StringBuilder("... ");
        sb.append(this.f81198r.getString(R.string.b1o));
        return sb.toString();
    }

    /* renamed from: e */
    public final int mo63537e() {
        if (C26503d.m64061d(this.f81192l)) {
            return this.f81192l.getAdDescMaxLines();
        }
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo63524f() {
        if (super.mo63524f() || (C26469cc.m63997a(this.f81192l, 3) && TextUtils.isEmpty(this.f81192l.getAwemeRawAd().getWebUrl()))) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo63538k() {
        if (!this.f81192l.isAd() || this.f81192l.getAwemeRawAd().getLabel() == null || !this.f81192l.getAwemeRawAd().isRightStyle()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ Object mo63540m() throws Exception {
        if (this.f81192l != null && this.f80711e.f80866h == 2) {
            C26890h.m65011a("see_original_show", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", this.f81192l.getAid()).f61491a);
        } else if (this.f81192l != null && this.f80711e.f80866h == 0) {
            C26890h.m65011a("see_translation_show", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", this.f81192l.getAid()).f61491a);
        }
        return null;
    }

    /* renamed from: o */
    private void m72216o() {
        if (VERSION.SDK_INT < 21) {
            this.f80710d.post(new C30814bp(this));
        }
        if (this.f81192l.getTextExtra() != null && this.f81192l.getTextExtra().size() > 0) {
            for (TextExtraStruct textExtraStruct : this.f81192l.getTextExtra()) {
                if (textExtraStruct != null) {
                    if (textExtraStruct.getStart() < 0) {
                        textExtraStruct.setStart(0);
                    }
                    if (textExtraStruct.getEnd() > this.f81192l.getDesc().length()) {
                        textExtraStruct.setEnd(this.f81192l.getDesc().length());
                    }
                }
            }
        }
        if (this.f81198r != null) {
            this.f80707a.setMaxSize(m72217p());
            this.f80707a.setSpanSize((float) C23728o.m58246c(15.0d));
            this.f80707a.setSpanColor(this.f80707a.getCurrentTextColor());
            this.f80707a.setSpanStyle(1);
            this.f80707a.setOnSpanClickListener(new C30815bq(this));
            this.f80707a.mo95551a(this.f81192l.getTextExtra(), (C48160d) new C45549f(true));
            if (this.f81192l != null && this.f81192l.getTextExtra() != null && !TextUtils.isEmpty(this.f81192l.getDesc())) {
                Iterator it = this.f81192l.getTextExtra().iterator();
                while (true) {
                    if (it.hasNext()) {
                        TextExtraStruct textExtraStruct2 = (TextExtraStruct) it.next();
                        if (m72212a(textExtraStruct2) && textExtraStruct2.getType() == 0) {
                            if ((!TextUtils.isEmpty(textExtraStruct2.getAwemeId()) || 2 == textExtraStruct2.getSubtype()) && this.f81192l.getDesc().charAt(textExtraStruct2.getStart()) == '@') {
                                C25594d dVar = new C25594d(this.f81198r, (float) Math.round(((float) C9432q.m18670a(this.f81198r)) - (C9432q.m18687b(this.f81198r, 100.0f) + this.f81198r.getResources().getDimension(R.dimen.yy))), this.f81198r.getResources().getColor(R.color.j2), -1, textExtraStruct2);
                                dVar.f67759b = C9432q.m18687b(this.f81198r, 12.0f);
                                dVar.f67760c = C9432q.m18687b(this.f81198r, 2.0f);
                                dVar.f67758a = C9432q.m18687b(this.f81198r, 13.0f);
                                this.f80707a.mo95550a(textExtraStruct2.getStart(), textExtraStruct2.getEnd(), dVar);
                                break;
                            }
                        }
                    }
                }
            }
            try {
                if (C47918gj.m103682a(this.f81198r)) {
                    this.f80707a.setMovementMethod(C31251j.m72964a());
                } else if (m72215n()) {
                    this.f80707a.setMovementMethod(C31245d.m72956a());
                } else {
                    this.f80707a.setMovementMethod(C31243b.m72951a());
                }
            } catch (IndexOutOfBoundsException e) {
                C32458a.m75143a((Exception) e);
            }
            this.f80707a.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                /* JADX WARNING: type inference failed for: r5v4, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r5v5, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r5v7, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r8v19, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r5v9, types: [android.text.SpannableStringBuilder] */
                /* JADX WARNING: type inference failed for: r8v20 */
                /* JADX WARNING: type inference failed for: r8v21 */
                /* JADX WARNING: type inference failed for: r8v26 */
                /* JADX WARNING: type inference failed for: r8v27, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r10v13, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r8v28 */
                /* JADX WARNING: type inference failed for: r8v33 */
                /* JADX WARNING: type inference failed for: r17v0 */
                /* JADX WARNING: type inference failed for: r8v42 */
                /* JADX WARNING: type inference failed for: r9v21, types: [android.text.SpannableStringBuilder] */
                /* JADX WARNING: type inference failed for: r9v22, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r0v48, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r0v53 */
                /* JADX WARNING: type inference failed for: r0v55, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r9v23, types: [android.text.SpannableStringBuilder] */
                /* JADX WARNING: type inference failed for: r5v29 */
                /* JADX WARNING: type inference failed for: r5v30 */
                /* JADX WARNING: type inference failed for: r8v61 */
                /* JADX WARNING: type inference failed for: r8v62 */
                /* JADX WARNING: type inference failed for: r8v63 */
                /* JADX WARNING: type inference failed for: r9v27 */
                /* JADX WARNING: type inference failed for: r0v77 */
                /* JADX WARNING: type inference failed for: r9v28 */
                /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v20
                  assigns: []
                  uses: []
                  mth insns count: 536
                	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.ProcessClass.process(ProcessClass.java:30)
                	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
                	at jadx.core.ProcessClass.process(ProcessClass.java:35)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
                 */
                /* JADX WARNING: Removed duplicated region for block: B:104:0x0437 A[SYNTHETIC, Splitter:B:104:0x0437] */
                /* JADX WARNING: Removed duplicated region for block: B:120:0x04a8  */
                /* JADX WARNING: Removed duplicated region for block: B:130:0x04fa  */
                /* JADX WARNING: Removed duplicated region for block: B:133:0x052a  */
                /* JADX WARNING: Removed duplicated region for block: B:141:0x04a2 A[EDGE_INSN: B:141:0x04a2->B:118:0x04a2 ?: BREAK  
                EDGE_INSN: B:141:0x04a2->B:118:0x04a2 ?: BREAK  , SYNTHETIC] */
                /* JADX WARNING: Removed duplicated region for block: B:73:0x02fb  */
                /* JADX WARNING: Removed duplicated region for block: B:76:0x032f  */
                /* JADX WARNING: Removed duplicated region for block: B:77:0x0342  */
                /* JADX WARNING: Removed duplicated region for block: B:80:0x0359  */
                /* JADX WARNING: Removed duplicated region for block: B:89:0x03a4  */
                /* JADX WARNING: Removed duplicated region for block: B:92:0x03bb  */
                /* JADX WARNING: Removed duplicated region for block: B:94:0x03c2  */
                /* JADX WARNING: Unknown variable types count: 13 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onGlobalLayout() {
                    /*
                        r18 = this;
                        r1 = r18
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r0 = r0.mo63537e()
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f80707a
                        android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                        com.ss.android.ugc.aweme.feed.ui.bm r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f81192l
                        boolean r3 = r3.isAd()
                        r4 = 4
                        r5 = 1
                        r6 = 0
                        if (r3 == 0) goto L_0x0120
                        com.ss.android.ugc.aweme.feed.ui.bm r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f80707a
                        int r3 = r3.getLineCount()
                        if (r3 <= r0) goto L_0x0120
                        com.ss.android.ugc.aweme.feed.ui.bm r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f81192l
                        boolean r3 = r3.isAdDescHandle()
                        if (r3 == 0) goto L_0x0120
                        com.ss.android.ugc.aweme.feed.ui.bm r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f80707a
                        java.lang.CharSequence r3 = r3.getText()
                        com.ss.android.ugc.aweme.feed.ui.bm r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r7 = r7.f81192l
                        java.lang.String r7 = r7.getDesc()
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r8.mo63532a(r7)
                        com.ss.android.ugc.aweme.feed.ui.bm r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f80707a
                        android.text.Layout r7 = r7.getLayout()
                        if (r7 != 0) goto L_0x0093
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f81192l
                        r0.setAdDescHandle(r6)
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r0.mo63532a(r3)
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r2 = "VideoDescView_onGlobalLayout_null + aid = "
                        r0.<init>(r2)
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f81192l
                        java.lang.String r2 = r2.getAid()
                        r0.append(r2)
                        java.lang.String r2 = "desc = "
                        r0.append(r2)
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f81192l
                        java.lang.String r2 = r2.getDesc()
                        r0.append(r2)
                        java.lang.String r0 = r0.toString()
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r0)
                        com.ss.android.ugc.aweme.lancet.c r0 = new com.ss.android.ugc.aweme.lancet.c
                        java.lang.Throwable r2 = new java.lang.Throwable
                        r2.<init>()
                        r0.<init>(r2)
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r0)
                        return
                    L_0x0093:
                        com.ss.android.ugc.aweme.feed.ui.bm r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f80707a
                        android.text.Layout r7 = r7.getLayout()
                        if (r7 == 0) goto L_0x00b5
                        com.ss.android.ugc.aweme.feed.ui.bm r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f80707a
                        android.text.Layout r7 = r7.getLayout()
                        int r7 = r7.getLineCount()
                        if (r7 > r0) goto L_0x00b5
                        int r0 = r0 + r5
                        com.ss.android.ugc.aweme.feed.ui.bm r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r3.mo63528a(r0)
                        r2.removeOnGlobalLayoutListener(r1)
                        return
                    L_0x00b5:
                        int r7 = r3.length()
                        java.lang.String r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.m72214j()
                        int r8 = r8.length()
                        int r7 = r7 - r8
                        com.ss.android.ugc.aweme.main.g r8 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
                        com.ss.android.ugc.aweme.feed.ui.bm r9 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r9 = r9.f81192l
                        boolean r8 = r8.mo75754a(r9)
                        if (r8 == 0) goto L_0x00d2
                        r8 = 4
                        goto L_0x00d3
                    L_0x00d2:
                        r8 = 0
                    L_0x00d3:
                        int r7 = r7 - r8
                        r8 = 100
                        if (r7 >= r8) goto L_0x00e0
                        int r0 = r0 + 1
                        com.ss.android.ugc.aweme.feed.ui.bm r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r3.mo63528a(r0)
                        goto L_0x0120
                    L_0x00e0:
                        com.ss.android.ugc.aweme.feed.ui.bm r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r7.mo63532a(r3)
                        boolean r7 = r3 instanceof android.text.SpannableString
                        if (r7 == 0) goto L_0x0120
                        com.ss.android.ugc.aweme.feed.ui.bm r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f80707a
                        android.text.Layout r7 = r7.getLayout()
                        if (r7 == 0) goto L_0x0120
                        com.ss.android.ugc.aweme.feed.ui.bm r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f80707a
                        android.text.Layout r7 = r7.getLayout()
                        int r9 = r0 + -2
                        int r7 = r7.getLineEnd(r9)
                        java.lang.CharSequence r3 = r3.subSequence(r6, r7)
                        com.ss.android.ugc.aweme.feed.ui.bm r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r7 = r7.f81192l
                        java.lang.String r7 = r7.getDesc()
                        int r7 = r7.length()
                        if (r7 <= r8) goto L_0x0120
                        int r3 = r3.length()
                        if (r3 >= r8) goto L_0x0120
                        int r0 = r0 + 1
                        com.ss.android.ugc.aweme.feed.ui.bm r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r3.mo63528a(r0)
                    L_0x0120:
                        r3 = r0
                        r2.removeOnGlobalLayoutListener(r1)
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        java.lang.String r0 = r0.mo63536d()
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        boolean r2 = r2.mo63538k()
                        if (r2 == 0) goto L_0x0145
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.m72214j()
                        r2.append(r7)
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                    L_0x0145:
                        int r2 = r0.length()
                        int r7 = r2 + 1
                        com.ss.android.ugc.aweme.main.g r8 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
                        com.ss.android.ugc.aweme.feed.ui.bm r9 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r9 = r9.f81192l
                        boolean r8 = r8.mo75754a(r9)
                        if (r8 == 0) goto L_0x023e
                        java.lang.String r2 = "OriginVideoDescView"
                        java.lang.String r5 = "long video set desc"
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r4, r2, r5)
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f80707a
                        int r2 = r2.getLineCount()
                        if (r2 <= r3) goto L_0x023d
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f80707a
                        java.lang.CharSequence r2 = r2.getText()
                        boolean r4 = r2 instanceof android.text.SpannableString
                        if (r4 == 0) goto L_0x023d
                        com.ss.android.ugc.aweme.feed.ui.bm r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r4 = r4.f80707a
                        android.text.Layout r4 = r4.getLayout()
                        int r3 = r3 + -2
                        int r3 = r4.getLineEnd(r3)
                        java.lang.CharSequence r3 = r2.subSequence(r6, r3)
                        android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
                        r9.<init>(r3)
                        com.ss.android.ugc.aweme.feed.ui.bm r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.f81192l
                        boolean r4 = r4.isAd()
                        if (r4 == 0) goto L_0x01ac
                        java.lang.String r4 = r3.toString()
                        java.lang.String r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.m72214j()
                        boolean r4 = r4.contains(r5)
                        if (r4 != 0) goto L_0x01ac
                        java.lang.String r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.m72214j()
                        r9.append(r4)
                    L_0x01ac:
                        java.lang.String r4 = r3.toString()
                        java.lang.String r5 = " [r]"
                        boolean r4 = r4.contains(r5)
                        if (r4 != 0) goto L_0x0205
                        java.lang.String r0 = " [r]"
                        r9.append(r0)
                        com.ss.android.ugc.aweme.main.g r4 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        android.content.Context r5 = r0.f81198r
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.f81192l
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        java.lang.String r7 = r0.f81193m
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r8 = r0.f81196p
                        android.text.SpannableStringBuilder r0 = r4.mo75752a(r5, r6, r7, r8, r9)
                        java.lang.String r4 = "..."
                        android.text.SpannableStringBuilder r9 = r0.append(r4)
                        com.ss.android.ugc.aweme.main.g r10 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        android.content.Context r11 = r0.f81198r
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r12 = r0.f81192l
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        java.lang.String r13 = r0.f81193m
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r14 = r0.f81196p
                        android.text.SpannableStringBuilder r15 = android.text.SpannableStringBuilder.valueOf(r2)
                        android.text.SpannableStringBuilder r0 = r10.mo75752a(r11, r12, r13, r14, r15)
                        com.ss.android.ugc.aweme.feed.ui.bm r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.ui.bm r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.f81192l
                        boolean r5 = r5.isAd()
                        r4.mo63529a(r9, r0, r5)
                        goto L_0x0208
                    L_0x0205:
                        r9.append(r0)
                    L_0x0208:
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        boolean r0 = r0.mo63538k()
                        if (r0 == 0) goto L_0x021b
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r3 = r3.length()
                        java.lang.CharSequence r0 = r0.mo63527a(r9, r3)
                        goto L_0x021c
                    L_0x021b:
                        r0 = r9
                    L_0x021c:
                        com.ss.android.ugc.aweme.feed.ui.bm r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r3.mo63532a(r0)
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80707a
                        com.ss.android.ugc.aweme.feed.ui.bm r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f80707a
                        int r3 = r3.getCurrentTextColor()
                        r0.setSpanColor(r3)
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r0.f80714h = r9
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
                        r3.<init>(r2)
                        r0.f80712f = r3
                    L_0x023d:
                        return
                    L_0x023e:
                        com.ss.android.ugc.aweme.feed.ui.bm r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r4 = r4.f80707a
                        int r4 = r4.getLineCount()
                        if (r4 != 0) goto L_0x024a
                        r4 = r3
                        goto L_0x0252
                    L_0x024a:
                        com.ss.android.ugc.aweme.feed.ui.bm r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r4 = r4.f80707a
                        int r4 = r4.getLineCount()
                    L_0x0252:
                        if (r4 <= r3) goto L_0x056c
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        java.lang.String r9 = " "
                        r8.<init>(r9)
                        com.ss.android.ugc.aweme.feed.ui.bm r9 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        android.content.Context r9 = r9.f81198r
                        r10 = 2132544593(0x7f1c0c51, float:2.0742352E38)
                        java.lang.String r9 = r9.getString(r10)
                        r8.append(r9)
                        java.lang.String r8 = r8.toString()
                        com.ss.android.ugc.aweme.feed.ui.bm r9 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f80707a
                        android.text.Layout r9 = r9.getLayout()
                        if (r9 == 0) goto L_0x0286
                        com.ss.android.ugc.aweme.feed.ui.bm r9 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f80707a
                        android.text.Layout r9 = r9.getLayout()
                        int r10 = r3 + -1
                        int r9 = r9.getLineEnd(r10)
                        goto L_0x0287
                    L_0x0286:
                        r9 = 0
                    L_0x0287:
                        com.ss.android.ugc.aweme.feed.ui.bm r10 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r10 = r10.f80707a
                        java.lang.CharSequence r10 = r10.getText()
                        r11 = 3
                        java.lang.String r12 = "OriginVideoDescView"
                        java.lang.StringBuilder r13 = new java.lang.StringBuilder
                        java.lang.String r14 = "Desc more than 4 lines, lineCount is "
                        r13.<init>(r14)
                        com.ss.android.ugc.aweme.feed.ui.bm r14 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f80707a
                        int r14 = r14.getLineCount()
                        r13.append(r14)
                        java.lang.String r14 = "content is "
                        r13.append(r14)
                        r13.append(r10)
                        java.lang.String r13 = r13.toString()
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r11, r12, r13)
                        com.ss.android.ugc.aweme.feed.ui.bm r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.ui.bm r12 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f80707a
                        int r12 = r12.getHeight()
                        r11.f80713g = r12
                        com.ss.android.ugc.aweme.feed.ui.bm r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f80707a
                        android.text.TextPaint r11 = r11.getPaint()
                        float r8 = r11.measureText(r8)
                        r11 = 12
                        if (r4 < r11) goto L_0x02ef
                        r4 = 11
                        com.ss.android.ugc.aweme.feed.ui.bm r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f80707a
                        android.text.Layout r11 = r11.getLayout()
                        if (r11 == 0) goto L_0x02ef
                        com.ss.android.ugc.aweme.feed.ui.bm r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f80707a
                        android.text.Layout r11 = r11.getLayout()
                        r12 = 10
                        int r11 = r11.getLineEnd(r12)
                        java.lang.CharSequence r10 = r10.subSequence(r6, r11)
                        r11 = 1
                        goto L_0x02f0
                    L_0x02ef:
                        r11 = 0
                    L_0x02f0:
                        r12 = 0
                        com.ss.android.ugc.aweme.feed.ui.bm r13 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f80707a
                        android.text.Layout r13 = r13.getLayout()
                        if (r13 == 0) goto L_0x032b
                        com.ss.android.ugc.aweme.feed.ui.bm r12 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f80707a
                        int r12 = r12.getWidth()
                        float r12 = (float) r12
                        com.ss.android.ugc.aweme.feed.ui.bm r13 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f80707a
                        android.text.TextPaint r13 = r13.getPaint()
                        com.ss.android.ugc.aweme.feed.ui.bm r14 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f80707a
                        android.text.Layout r14 = r14.getLayout()
                        int r15 = r4 + -1
                        int r14 = r14.getLineStart(r15)
                        com.ss.android.ugc.aweme.feed.ui.bm r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r5 = r5.f80707a
                        android.text.Layout r5 = r5.getLayout()
                        int r5 = r5.getLineEnd(r15)
                        float r5 = r13.measureText(r10, r14, r5)
                        float r12 = r12 - r5
                    L_0x032b:
                        int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                        if (r5 >= 0) goto L_0x0342
                        com.ss.android.ugc.aweme.feed.ui.bm r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r8 = r8.f80713g
                        com.ss.android.ugc.aweme.feed.ui.bm r12 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r12 = r12.f80713g
                        int r12 = r12 / r4
                        int r8 = r8 + r12
                        r5.f80713g = r8
                        int r4 = r4 + 1
                        r16 = 1
                        goto L_0x0344
                    L_0x0342:
                        r16 = 0
                    L_0x0344:
                        com.ss.android.ugc.aweme.feed.ui.bm r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r8 = r8.mo63537e()
                        com.ss.android.ugc.aweme.feed.ui.bm r12 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r12 = r12.f80713g
                        int r8 = r8 * r12
                        int r8 = r8 / r4
                        r5.f80715i = r8
                        boolean r5 = r10 instanceof android.text.SpannableString
                        if (r5 == 0) goto L_0x056b
                        if (r9 != 0) goto L_0x0361
                        int r5 = r10.length()
                        int r9 = r5 / 2
                    L_0x0361:
                        if (r9 < r7) goto L_0x0388
                        com.ss.android.ugc.aweme.services.IExternalService r5 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
                        com.ss.android.ugc.aweme.services.IExternalService r5 = (com.p683ss.android.ugc.aweme.services.IExternalService) r5
                        com.ss.android.ugc.aweme.services.video.IAVPublishService r5 = r5.publishService()
                        int r7 = r9 - r7
                        int r8 = r7 + 2
                        java.lang.CharSequence r8 = r10.subSequence(r7, r8)
                        java.lang.String r8 = r8.toString()
                        boolean r5 = r5.containEmoji(r8)
                        if (r5 == 0) goto L_0x0388
                        int r2 = java.lang.Math.max(r6, r7)
                        java.lang.CharSequence r2 = r10.subSequence(r6, r2)
                        goto L_0x0397
                    L_0x0388:
                        com.ss.android.ugc.aweme.feed.ui.bm r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r2 = r5.mo63526a(r10, r0, r2, r9)
                        int r9 = r9 - r2
                        int r2 = java.lang.Math.max(r6, r9)
                        java.lang.CharSequence r2 = r10.subSequence(r6, r2)
                    L_0x0397:
                        android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
                        r5.<init>(r2)
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        boolean r2 = r2.mo63538k()
                        if (r2 == 0) goto L_0x03ab
                        java.lang.String r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.m72214j()
                        r5.append(r2)
                    L_0x03ab:
                        java.lang.String r2 = "..."
                        r5.append(r2)
                        android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
                        android.text.SpannableString r8 = android.text.SpannableString.valueOf(r10)
                        r7.<init>(r8)
                        if (r16 == 0) goto L_0x03c0
                        java.lang.String r8 = "\n"
                        r7.append(r8)
                    L_0x03c0:
                        if (r11 == 0) goto L_0x03c7
                        java.lang.String r8 = "..."
                        r7.append(r8)
                    L_0x03c7:
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80707a
                        com.ss.android.ugc.aweme.feed.ui.bm r9 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r9 = r9.mo63537e()
                        r8.setLines(r9)
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r8.mo63532a(r5)
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80707a
                        int r8 = r8.getLineCount()
                        if (r8 != r3) goto L_0x04b3
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r8 = r8.f81192l
                        boolean r8 = r8.isAd()
                        if (r8 != 0) goto L_0x04b3
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x049d }
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80707a     // Catch:{ Exception -> 0x049d }
                        android.text.Layout r8 = r8.getLayout()     // Catch:{ Exception -> 0x049d }
                        int r9 = r3 + -1
                        int r8 = r8.getLineEnd(r9)     // Catch:{ Exception -> 0x049d }
                        com.ss.android.ugc.aweme.feed.ui.bm r10 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x049d }
                        com.ss.android.ugc.aweme.views.MentionTextView r10 = r10.f80707a     // Catch:{ Exception -> 0x049d }
                        int r10 = r10.getWidth()     // Catch:{ Exception -> 0x049d }
                        float r10 = (float) r10     // Catch:{ Exception -> 0x049d }
                        com.ss.android.ugc.aweme.feed.ui.bm r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x049d }
                        com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f80707a     // Catch:{ Exception -> 0x049d }
                        android.text.TextPaint r11 = r11.getPaint()     // Catch:{ Exception -> 0x049d }
                        com.ss.android.ugc.aweme.feed.ui.bm r12 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x049d }
                        com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f80707a     // Catch:{ Exception -> 0x049d }
                        java.lang.CharSequence r12 = r12.getText()     // Catch:{ Exception -> 0x049d }
                        com.ss.android.ugc.aweme.feed.ui.bm r13 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x049d }
                        com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f80707a     // Catch:{ Exception -> 0x049d }
                        android.text.Layout r13 = r13.getLayout()     // Catch:{ Exception -> 0x049d }
                        int r13 = r13.getLineStart(r9)     // Catch:{ Exception -> 0x049d }
                        float r11 = r11.measureText(r12, r13, r8)     // Catch:{ Exception -> 0x049d }
                        float r10 = r10 - r11
                        com.ss.android.ugc.aweme.feed.ui.bm r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x049d }
                        com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f80707a     // Catch:{ Exception -> 0x049d }
                        android.text.TextPaint r11 = r11.getPaint()     // Catch:{ Exception -> 0x049d }
                        float r11 = r11.measureText(r0)     // Catch:{ Exception -> 0x049d }
                        r12 = r8
                        r8 = r5
                    L_0x0433:
                        int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                        if (r10 >= 0) goto L_0x04a2
                        int r10 = r0.length()     // Catch:{ Exception -> 0x049b }
                        int r12 = r12 - r10
                        java.lang.CharSequence r10 = r8.subSequence(r6, r12)     // Catch:{ Exception -> 0x049b }
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x0498 }
                        android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x0498 }
                        r12.<init>(r10)     // Catch:{ Exception -> 0x0498 }
                        java.lang.String r13 = "..."
                        android.text.SpannableStringBuilder r12 = r12.append(r13)     // Catch:{ Exception -> 0x0498 }
                        r8.mo63532a(r12)     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80707a     // Catch:{ Exception -> 0x0498 }
                        int r8 = r8.getLineCount()     // Catch:{ Exception -> 0x0498 }
                        if (r8 != r3) goto L_0x0496
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80707a     // Catch:{ Exception -> 0x0498 }
                        android.text.Layout r8 = r8.getLayout()     // Catch:{ Exception -> 0x0498 }
                        int r12 = r8.getLineEnd(r9)     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.feed.ui.bm r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80707a     // Catch:{ Exception -> 0x0498 }
                        int r8 = r8.getWidth()     // Catch:{ Exception -> 0x0498 }
                        float r8 = (float) r8     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.feed.ui.bm r13 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f80707a     // Catch:{ Exception -> 0x0498 }
                        android.text.TextPaint r13 = r13.getPaint()     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.feed.ui.bm r14 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f80707a     // Catch:{ Exception -> 0x0498 }
                        java.lang.CharSequence r14 = r14.getText()     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.feed.ui.bm r15 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this     // Catch:{ Exception -> 0x0498 }
                        com.ss.android.ugc.aweme.views.MentionTextView r15 = r15.f80707a     // Catch:{ Exception -> 0x0498 }
                        android.text.Layout r15 = r15.getLayout()     // Catch:{ Exception -> 0x0498 }
                        int r15 = r15.getLineStart(r9)     // Catch:{ Exception -> 0x0498 }
                        float r13 = r13.measureText(r14, r15, r12)     // Catch:{ Exception -> 0x0498 }
                        float r8 = r8 - r13
                        r17 = r10
                        r10 = r8
                        r8 = r17
                        goto L_0x0433
                    L_0x0496:
                        r8 = r10
                        goto L_0x04a2
                    L_0x0498:
                        r0 = move-exception
                        r8 = r10
                        goto L_0x049f
                    L_0x049b:
                        r0 = move-exception
                        goto L_0x049f
                    L_0x049d:
                        r0 = move-exception
                        r8 = r5
                    L_0x049f:
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r0)
                    L_0x04a2:
                        boolean r0 = android.text.TextUtils.equals(r8, r5)
                        if (r0 != 0) goto L_0x04b3
                        android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                        r0.<init>(r8)
                        java.lang.String r5 = "..."
                        android.text.SpannableStringBuilder r5 = r0.append(r5)
                    L_0x04b3:
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.ui.bm r6 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r6 = r6.f81192l
                        boolean r6 = r6.isAd()
                        r0.mo63529a(r5, r7, r6)
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r0.f80714h = r5
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r0.f80712f = r7
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.ui.cr r0 = r0.f80711e
                        if (r0 == 0) goto L_0x04f2
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.ui.cr r0 = r0.f80711e
                        int r0 = r0.f80866h
                        if (r0 != 0) goto L_0x04f2
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f81192l
                        java.lang.CharSequence r0 = r0.getTransDesc()
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 == 0) goto L_0x04f2
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f81192l
                        r0.setEllipsizeDesc(r5)
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f81192l
                        r0.setProcessedDesc(r7)
                    L_0x04f2:
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        boolean r0 = r0.mo63538k()
                        if (r0 == 0) goto L_0x051b
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        int r6 = r5.length()
                        java.lang.String r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.m72214j()
                        int r7 = r7.length()
                        int r6 = r6 - r7
                        int r2 = r2.length()
                        int r6 = r6 - r2
                        java.lang.CharSequence r5 = r0.mo63527a(r5, r6)
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                        r2.<init>(r5)
                        r0.f80714h = r2
                    L_0x051b:
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        r0.mo63532a(r5)
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80707a
                        android.text.Layout r0 = r0.getLayout()
                        if (r0 == 0) goto L_0x0550
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80707a
                        android.text.Layout r0 = r0.getLayout()
                        int r0 = r0.getLineCount()
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f81192l
                        boolean r2 = r2.isAd()
                        if (r2 == 0) goto L_0x0550
                        if (r0 <= r3) goto L_0x0550
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f80707a
                        r2.setLines(r0)
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f81192l
                        r2.setAdDescMaxLines(r0)
                    L_0x0550:
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80707a
                        com.ss.android.ugc.aweme.feed.ui.bm r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f80707a
                        int r2 = r2.getCurrentTextColor()
                        r0.setSpanColor(r2)
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80707a
                        com.ss.android.ugc.aweme.feed.ui.bv r2 = new com.ss.android.ugc.aweme.feed.ui.bv
                        r2.<init>(r1, r4)
                        r0.post(r2)
                    L_0x056b:
                        return
                    L_0x056c:
                        com.ss.android.ugc.aweme.feed.ui.bm r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80707a
                        com.ss.android.ugc.aweme.feed.ui.bw r2 = new com.ss.android.ugc.aweme.feed.ui.bw
                        r2.<init>(r1)
                        r0.post(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.C308091.onGlobalLayout():void");
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("on_page_selected", (C0199s<C23274a>) this);
            dataCenter.mo48226a("on_page_unselected", (C0199s<C23274a>) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63521b(VideoItemParams videoItemParams) {
        super.mo63521b(videoItemParams);
        if (videoItemParams != null) {
            this.f80717k = videoItemParams.mAdOpenCallBack;
            this.f80716j = videoItemParams.mAdViewController;
        }
    }

    /* renamed from: a */
    private Map<String, String> m72211a(String str) {
        return C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", this.f81192l.getAid()).mo47829a("author_id", this.f81192l.getAuthorUid()).mo47829a("action_type", str).f61491a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo63534b(View view) {
        if (!(mo63785c() || this.f80717k == null || this.f80716j == null)) {
            C26503d.m64058a(this.f81193m);
            C25945k.m62914e().mo53191a(this.f81198r, this.f81192l, this.f80716j, 1, this.f80717k);
        }
    }

    /* renamed from: a */
    private boolean m72212a(TextExtraStruct textExtraStruct) {
        if (this.f81192l == null || this.f81192l.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > this.f81192l.getDesc().length() || textExtraStruct.getStart() >= this.f81192l.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo63535c(View view) {
        if (TextUtils.isEmpty(this.f80712f) || TextUtils.isEmpty(this.f80714h)) {
            this.f80712f = new SpannableStringBuilder(this.f81192l.getProcessedDesc());
            this.f80714h = new SpannableStringBuilder(this.f81192l.getEllipsizeDesc());
        }
        boolean equals = this.f80708b.getText().equals(this.f81198r.getString(R.string.b1o));
        if (equals) {
            mo63530a(this.f80712f, equals);
        } else {
            mo63530a(this.f80714h, equals);
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 350216171) {
                if (hashCode == 1628582276 && str.equals("on_page_unselected")) {
                    c = 1;
                }
            } else if (str.equals("on_page_selected")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if (this.f80711e != null) {
                        this.f80711e.f80870l = true;
                        C0013i.m18a((Callable<TResult>) new C30816br<TResult>(this), (Executor) C26890h.m65003a());
                    }
                    this.f80720y = true;
                    if (this.f80719x) {
                        C0013i.m18a((Callable<TResult>) new C30817bs<TResult>(this), (Executor) C26890h.m65003a());
                        return;
                    }
                    break;
                case 1:
                    if (this.f80711e != null) {
                        this.f80711e.f80870l = false;
                    }
                    this.f80720y = false;
                    break;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63528a(int r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.f80707a
            r0.setMaxLines(r8)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.f80707a
            r0.setLines(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            r0.setAdDescMaxLines(r8)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f81192l
            java.lang.String r8 = r8.getDesc()
            r6.<init>(r8)
            boolean r8 = r7.mo63538k()
            if (r8 == 0) goto L_0x0027
            java.lang.String r8 = m72214j()
            r6.append(r8)
        L_0x0027:
            com.ss.android.ugc.aweme.main.g r8 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            boolean r8 = r8.mo75754a(r0)
            if (r8 == 0) goto L_0x0048
            java.lang.String r8 = " [r]"
            r6.append(r8)
            com.ss.android.ugc.aweme.main.g r1 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
            android.content.Context r2 = r7.f81198r
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f81192l
            java.lang.String r4 = r7.f81193m
            int r5 = r7.f81196p
            android.text.SpannableStringBuilder r6 = r1.mo75752a(r2, r3, r4, r5, r6)
        L_0x0048:
            boolean r8 = r7.mo63538k()
            if (r8 == 0) goto L_0x006f
            int r8 = r6.length()
            com.ss.android.ugc.aweme.main.g r0 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f81192l
            boolean r0 = r0.mo75754a(r1)
            if (r0 == 0) goto L_0x0060
            r0 = 4
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            int r8 = r8 - r0
            java.lang.String r0 = m72214j()
            int r0 = r0.length()
            int r8 = r8 - r0
            java.lang.CharSequence r6 = r7.mo63527a(r6, r8)
        L_0x006f:
            r7.mo63532a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30808bm.mo63528a(int):void");
    }

    public C30808bm(View view, C30787bb bbVar) {
        super(view);
        this.f80718w = bbVar;
    }

    /* renamed from: a */
    public final CharSequence mo63527a(CharSequence charSequence, int i) {
        SpannableStringBuilder spannableStringBuilder;
        int length = m72214j().length() + i;
        if (charSequence == null || i < 0 || charSequence.length() < length || !TextUtils.equals(charSequence.subSequence(i, length).toString(), m72214j())) {
            return charSequence;
        }
        AwemeTextLabelModel label = this.f81192l.getAwemeRawAd().getLabel();
        if (label == null) {
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        C31242a aVar = new C31242a(this.f81198r, label.getBgColor(), label.getLabelName(), label.getTextColor());
        aVar.f81792a = label.isAdHollowText();
        spannableStringBuilder.setSpan(aVar, i + 1, i + m72214j().length(), 17);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    private void m72213b(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z) {
        spannableStringBuilder.setSpan(new C30811a(this, spannableStringBuilder2, z), 0, spannableStringBuilder.length(), 33);
    }

    /* renamed from: a */
    public final void mo63529a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z) {
        this.f80719x = true;
        this.f80708b.setVisibility(0);
        this.f80706B = this.f80708b.getHeight();
        if (this.f80720y) {
            C26890h.m65011a("video_title", m72211a("show"));
        }
        if (!z) {
            m72213b(spannableStringBuilder, spannableStringBuilder2, true);
            m72213b(spannableStringBuilder2, spannableStringBuilder, false);
        }
    }

    /* renamed from: a */
    public final int mo63526a(CharSequence charSequence, String str, int i, int i2) {
        try {
            float measureText = this.f80707a.getPaint().measureText(str);
            int i3 = i;
            while (i3 >= 3) {
                if (this.f80707a.getPaint().measureText(charSequence, i2 - i3, i2) < measureText) {
                    return i3 + 1;
                }
                i3--;
            }
            return i3 + 1;
        } catch (Exception unused) {
            return i;
        }
    }
}
