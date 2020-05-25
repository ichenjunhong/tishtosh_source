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
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
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
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.p683ss.android.ugc.aweme.feed.widget.C31242a;
import com.p683ss.android.ugc.aweme.feed.widget.C31243b;
import com.p683ss.android.ugc.aweme.feed.widget.C31245d;
import com.p683ss.android.ugc.aweme.feed.widget.C31251j;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.C35914e;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23250t;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cy */
public class C30890cy extends C30241a implements C0199s<C23274a> {

    /* renamed from: B */
    static final /* synthetic */ boolean f80894B = (!C30890cy.class.desiredAssertionStatus());

    /* renamed from: A */
    boolean f80895A;

    /* renamed from: C */
    private C30787bb f80896C;

    /* renamed from: D */
    private boolean f80897D;

    /* renamed from: E */
    private boolean f80898E;

    /* renamed from: F */
    private boolean f80899F;

    /* renamed from: G */
    private boolean f80900G;

    /* renamed from: H */
    private int f80901H;

    /* renamed from: I */
    private View f80902I;

    /* renamed from: J */
    private View f80903J;

    /* renamed from: p */
    public MentionTextView f80904p;

    /* renamed from: q */
    public TextView f80905q;

    /* renamed from: r */
    public TranslationStatusView f80906r;

    /* renamed from: s */
    LinearLayout f80907s;

    /* renamed from: t */
    public C30879cr f80908t;

    /* renamed from: u */
    C25908e f80909u;

    /* renamed from: v */
    C25735b f80910v;

    /* renamed from: w */
    public SpannableStringBuilder f80911w;

    /* renamed from: x */
    public int f80912x;

    /* renamed from: y */
    public SpannableStringBuilder f80913y;

    /* renamed from: z */
    public int f80914z;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cy$a */
    static class C30893a extends ClickableSpan {

        /* renamed from: a */
        private WeakReference<C30890cy> f80923a;

        /* renamed from: b */
        private SpannableStringBuilder f80924b;

        /* renamed from: c */
        private boolean f80925c;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(-1);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C30890cy cyVar = (C30890cy) this.f80923a.get();
            if (cyVar != null) {
                cyVar.mo63646a(this.f80924b, this.f80925c);
            }
        }

        C30893a(C30890cy cyVar, SpannableStringBuilder spannableStringBuilder, boolean z) {
            this.f80923a = new WeakReference<>(cyVar);
            this.f80924b = spannableStringBuilder;
            this.f80925c = z;
        }
    }

    /* renamed from: k */
    public static String m72349k() {
        return " [sponsor]";
    }

    /* renamed from: e */
    public final void mo60599e() {
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        this.f80902I = view;
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b6q);
        this.f80903J = view2;
        this.f80904p = (MentionTextView) view2.findViewById(R.id.a4e);
        if (this.f80904p == null) {
            view2 = C35914e.m81075a(getClass().getName(), view2, this.f79017j, R.layout.b6q);
        }
        this.f80905q = (TextView) view2.findViewById(R.id.dhm);
        this.f80905q.setTypeface(Typeface.defaultFromStyle(1));
        this.f80905q.setOnClickListener(new C30894cz(this));
        this.f80906r = (TranslationStatusView) view2.findViewById(R.id.d4a);
        this.f80907s = (LinearLayout) view2.findViewById(R.id.a4n);
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
    public final void mo60586a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("on_page_selected", (C0199s<C23274a>) this.f79009b);
            dataCenter.mo48226a("on_page_unselected", (C0199s<C23274a>) this.f79009b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63647a(View view, TextExtraStruct textExtraStruct) {
        if (textExtraStruct.isClickable() && textExtraStruct != null) {
            if (textExtraStruct.getType() == 1) {
                C26403au.m63863a(textExtraStruct);
                String uuid = UUID.randomUUID().toString();
                SmartRouter.buildRoute(this.f79017j, "//challenge/detail").withParam("aweme_id", this.f79011d.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("process_id", uuid).withParam("extra_challenge_from", this.f79012e).open(10086);
                C26890h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(this.f79012e).setValue(this.f79011d.getAid()).setExtValueString(textExtraStruct.getCid()));
                C25945k.m62911b().mo53139d(this.f79017j, this.f79011d);
                ((C23250t) ((C23250t) ((C23250t) ((C23250t) new C23250t().mo48150f(this.f79012e).mo47940a(this.f79017j)).mo48153s(this.f79011d.getAuthor() != null ? this.f79011d.getAuthor().getUid() : "").mo48151g(this.f79011d.getAid()).mo47954f(this.f79011d).mo48155u(uuid).mo48146c((String) this.f79016i.mo48230b("playlist_type", "")).mo48149e((String) this.f79016i.mo48230b("playlist_id", "")).mo48147d((String) this.f79016i.mo48230b("playlist_id_key", "")).mo48100j((String) this.f79016i.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(this.f79011d, this.f79015h))).mo48154t(textExtraStruct.getCid()).mo47941a("click_in_video_name")).mo48156v(C23198ae.m56847a(this.f79011d, this.f79015h)).mo48076e();
                C30578o.m71566a(C29988ad.CHALLENGE);
            } else if (textExtraStruct.getType() != 0 || ((TextUtils.isEmpty(textExtraStruct.getAwemeId()) && 2 != textExtraStruct.getSubtype()) || !m72343a(textExtraStruct) || this.f79011d.getDesc().charAt(textExtraStruct.getStart()) != '@')) {
                C26890h.m65007a(this.f79017j, LeakCanaryFileProvider.f132049i, "video_at", this.f79011d.getAid(), textExtraStruct.getUserId());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("group_id", "");
                    jSONObject.put("request_id", this.f79013f.get("request_id"));
                    jSONObject.put("enter_from", this.f79012e);
                    jSONObject.put("enter_method", "click_head");
                } catch (Exception unused) {
                }
                if (this.f79011d.getAuthor() != null) {
                    C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(this.f79011d.getAuthor().getUid()).setJsonObject(jSONObject));
                    C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", this.f79012e).mo47829a("to_user_id", textExtraStruct.getUserId()).mo47829a("group_id", this.f79011d.getAid()).mo47829a("author_id", this.f79011d.getAuthorUid()).mo47829a("enter_method", "video_at").f61491a);
                }
                SmartRouter.buildRoute(this.f79017j, "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("sec_user_id", textExtraStruct.getSecUid()).withParam("profile_from", "video_at").withParam("enter_from", this.f79012e).withParam("video_id", this.f79011d.getAid()).open();
            } else {
                String str = "";
                String str2 = "";
                String str3 = "";
                if (2 == textExtraStruct.getSubtype()) {
                    if (this.f79011d.getVideoReplyStruct() != null) {
                        VideoReplyStruct videoReplyStruct = this.f79011d.getVideoReplyStruct();
                        String awemeId = videoReplyStruct.getAwemeId() != null ? videoReplyStruct.getAwemeId() : "";
                        String commentId = videoReplyStruct.getCommentId() != null ? videoReplyStruct.getCommentId() : "";
                        str3 = videoReplyStruct.getAliasCommentId() != null ? videoReplyStruct.getAliasCommentId() : "";
                        str = awemeId;
                        str2 = commentId;
                    }
                    C26890h.m65011a("click_comment_chain", C23089d.m56640a().mo47829a("enter_from", this.f79012e).mo47829a("group_id", this.f79011d.getAid()).mo47829a("author_id", this.f79011d.getAuthorUid()).mo47829a("to_group_id", str).mo47829a("reply_comment_id", str2).mo47829a("reply_user_id", textExtraStruct.getUserId()).f61491a);
                } else if (this.f79011d.getAwemeType() == 51) {
                    C26890h.m65011a("click_duet_icon", C23089d.m56640a().mo47829a("enter_from", this.f79012e).mo47829a("group_id", this.f79011d.getAid()).mo47829a("author_id", this.f79011d.getAuthorUid()).mo47829a("to_group_id", textExtraStruct.getAwemeId()).mo47829a("chain_type", "duet").f61491a);
                } else if (this.f79011d.getAwemeType() == 52) {
                    C26890h.m65011a("click_react_icon", C23089d.m56640a().mo47829a("enter_from", this.f79012e).mo47829a("group_id", this.f79011d.getAid()).mo47829a("author_id", this.f79011d.getAuthorUid()).mo47829a("to_group_id", textExtraStruct.getAwemeId()).f61491a);
                } else if (this.f79011d.getAwemeType() == 58) {
                    C26890h.m65011a("click_duet_icon", C23089d.m56640a().mo47829a("chain_type", "stitch").mo47829a("enter_from", this.f79012e).mo47829a("group_id", this.f79011d.getAid()).mo47829a("author_id", this.f79011d.getAuthorUid()).mo47829a("to_group_id", textExtraStruct.getAwemeId()).f61491a);
                }
                if (!C30906dk.m72377a(this.f79017j)) {
                    C10691a.m21542b(this.f79017j, (int) R.string.cg1).mo19066a();
                } else if (2 == textExtraStruct.getSubtype()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(",");
                    sb.append(str3);
                    SmartRouter.buildRoute(this.f79017j, "aweme://aweme/detail/").withParam("id", str).withParam("refer", "click_comment_chain").withParam("cid", sb.toString()).withParam("video_from", this.f79012e).open();
                } else {
                    SmartRouter.buildRoute(this.f79017j, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", this.f79012e).withParam("isChain", true).open();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63644a(int r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x0021
            java.lang.String r0 = "aweme_state"
            java.lang.Object r0 = r10.get(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r1 = "event_type_state"
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "page_type_state"
            java.lang.Object r10 = r10.get(r2)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
        L_0x001e:
            r6 = r10
            r5 = r1
            goto L_0x0028
        L_0x0021:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f79011d
            java.lang.String r1 = r8.f79012e
            int r10 = r8.f79015h
            goto L_0x001e
        L_0x0028:
            com.ss.android.ugc.aweme.views.MentionTextView r10 = r8.f80904p
            r10.setMaxLines(r9)
            com.ss.android.ugc.aweme.views.MentionTextView r10 = r8.f80904p
            r10.setLines(r9)
            r0.setAdDescMaxLines(r9)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            java.lang.String r9 = r0.getDesc()
            r7.<init>(r9)
            boolean r9 = m72346b(r0)
            if (r9 == 0) goto L_0x004b
            java.lang.String r9 = m72349k()
            r7.append(r9)
        L_0x004b:
            com.ss.android.ugc.aweme.main.g r9 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
            boolean r9 = r9.mo75754a(r0)
            if (r9 == 0) goto L_0x0065
            java.lang.String r9 = " [r]"
            r7.append(r9)
            com.ss.android.ugc.aweme.main.g r2 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
            android.content.Context r3 = r8.f79017j
            r4 = r0
            android.text.SpannableStringBuilder r7 = r2.mo75752a(r3, r4, r5, r6, r7)
        L_0x0065:
            boolean r9 = m72346b(r0)
            if (r9 == 0) goto L_0x008a
            int r9 = r7.length()
            com.ss.android.ugc.aweme.main.g r10 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
            boolean r10 = r10.mo75754a(r0)
            if (r10 == 0) goto L_0x007b
            r10 = 4
            goto L_0x007c
        L_0x007b:
            r10 = 0
        L_0x007c:
            int r9 = r9 - r10
            java.lang.String r10 = m72349k()
            int r10 = r10.length()
            int r9 = r9 - r10
            java.lang.CharSequence r7 = r8.mo63643a(r7, r9, r0)
        L_0x008a:
            r8.mo63648a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.mo63644a(int, java.util.Map):void");
    }

    /* renamed from: a */
    public final void mo63649a(boolean z) {
        if (this.f79017j != null && this.f79011d != null && this.f79011d.getDesc() != null) {
            boolean a = C47918gj.m103682a(this.f79017j);
            boolean a2 = C0761a.m2155a().mo2427a(this.f79011d.getDesc());
            boolean z2 = false;
            boolean z3 = a != a2;
            try {
                LayoutParams layoutParams = (LayoutParams) this.f80904p.getLayoutParams();
                if (z) {
                    if (!this.f80900G && (!z3 || this.f80899F)) {
                        if (z3 || !this.f80899F) {
                            return;
                        }
                    }
                    this.f80900G = false;
                    this.f80899F = !this.f80899F;
                    C1056u.m3049c((View) this.f80904p, a2 ? 1 : 0);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f80905q.getLayoutParams();
                    layoutParams2.gravity = a2 ? 83 : 85;
                    layoutParams2.leftMargin = C23728o.m58241a(15.0d);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams2.setMarginStart((int) C9432q.m18687b(this.f79017j, 15.0f));
                    }
                    this.f80905q.setLayoutParams(layoutParams2);
                    z2 = z3;
                } else if (C1056u.m3055f(this.f80904p) != a) {
                    this.f80900G = true;
                    C1056u.m3049c((View) this.f80904p, a ? 1 : 0);
                } else {
                    return;
                }
                if (z2) {
                    layoutParams.rightMargin = C23728o.m58241a(15.0d);
                    layoutParams.leftMargin = C23728o.m58241a((double) ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginEnd((int) C9432q.m18687b(this.f79017j, 15.0f));
                        layoutParams.setMarginStart((int) C9432q.m18687b(this.f79017j, 0.0f));
                    }
                } else {
                    layoutParams.leftMargin = C23728o.m58241a(15.0d);
                    layoutParams.rightMargin = C23728o.m58241a((double) ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginStart((int) C9432q.m18687b(this.f79017j, 15.0f));
                        layoutParams.setMarginEnd((int) C9432q.m18687b(this.f79017j, 0.0f));
                    }
                }
                this.f80904p.setLayoutParams(layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo63645a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z) {
        this.f80897D = true;
        this.f80905q.setVisibility(0);
        this.f80901H = this.f80905q.getHeight();
        if (this.f80898E) {
            C26890h.m65011a("video_title", m72341a("show"));
        }
        if (!z) {
            m72345b(spannableStringBuilder, spannableStringBuilder2, true);
            m72345b(spannableStringBuilder2, spannableStringBuilder, false);
        }
    }

    /* renamed from: a */
    public final void mo63646a(SpannableStringBuilder spannableStringBuilder, final boolean z) {
        final int i;
        ValueAnimator valueAnimator;
        int i2 = this.f80912x;
        if (!(this.f79011d == null || this.f80906r == null || this.f80906r.getVisibility() != 0)) {
            if (this.f80906r.getStatus() == 2 && this.f79011d.getTransDesc() != null) {
                i2 = (this.f80914z * this.f79011d.getTransDescLines()) / m72340a(this.f79011d);
                if (z) {
                    spannableStringBuilder = new SpannableStringBuilder(this.f79011d.getTransDesc());
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(this.f79011d.getEllipsizeTransDesc());
                }
            } else if (this.f80906r.getStatus() == 0 && this.f79011d.getTransDesc() != null && (TextUtils.equals(this.f79011d.getTransDesc(), this.f80911w) || TextUtils.equals(this.f79011d.getDesc(), this.f79011d.getEllipsizeDesc()))) {
                if (z) {
                    spannableStringBuilder = new SpannableStringBuilder(this.f79011d.getProcessedDesc());
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(this.f79011d.getEllipsizeDesc());
                }
            }
        }
        C26890h.m65011a("video_title", m72341a(z ? "spread" : "fold"));
        if (z) {
            i = 12;
        } else {
            i = m72340a(this.f79011d);
        }
        mo63648a((CharSequence) spannableStringBuilder);
        if (z) {
            valueAnimator = ValueAnimator.ofInt(new int[]{this.f80914z, i2});
        } else {
            valueAnimator = ValueAnimator.ofInt(new int[]{i2, this.f80914z});
        }
        valueAnimator.addUpdateListener(new C30901df(this));
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    C30890cy.this.f80905q.setText(R.string.b1n);
                } else {
                    C30890cy.this.f80905q.setText(R.string.b1o);
                }
                C30890cy.this.f80905q.setVisibility(4);
            }

            public final void onAnimationEnd(Animator animator) {
                if (z) {
                    if (C30890cy.this.f79011d.getTransDescLines() != 0 && C30890cy.this.f80906r.getVisibility() == 0 && C30890cy.this.f80906r.getStatus() == 2) {
                        C30890cy.this.f80904p.setLines(C30890cy.this.f79011d.getTransDescLines());
                    } else {
                        C30890cy.this.f80904p.post(new C30905dj(this));
                    }
                } else if (C30890cy.this.f80904p.getText().length() > 0) {
                    C30890cy.this.f80904p.setLines(C30890cy.m72340a(C30890cy.this.f79011d));
                } else {
                    C30890cy.this.f80904p.setMaxLines(i);
                }
                C30890cy.this.f80905q.setVisibility(0);
            }
        });
        if (this.f80901H == 0) {
            this.f80901H = this.f80905q.getHeight();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, this.f80901H});
        ofInt.addUpdateListener(new C30902dg(this));
        ofInt.setDuration(100);
        ofInt.setStartDelay(150);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{valueAnimator, ofInt});
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo63648a(CharSequence charSequence) {
        try {
            if (C30224d.m70966a()) {
                StringBuilder sb = new StringBuilder("VideoDescView_setDescSafely desc:");
                sb.append(charSequence);
                C32458a.m75141a(4, "VideoDescView", sb.toString());
            }
            this.f80904p.setText(charSequence);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }

    /* renamed from: o */
    private boolean m72351o() {
        return C23794bh.m58393g().mo75754a(this.f79011d);
    }

    /* renamed from: r */
    private int m72354r() {
        return C26503d.m64061d(this.f79011d) ? 200 : 200;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ Object mo63651l() throws Exception {
        C26890h.m65011a("video_title", m72341a("show"));
        return null;
    }

    /* renamed from: j */
    public final String mo63650j() {
        StringBuilder sb = new StringBuilder("... ");
        sb.append(this.f79017j.getString(R.string.b1o));
        return sb.toString();
    }

    /* renamed from: q */
    private boolean m72353q() {
        if (!this.f79011d.isAd() || this.f79011d.getAwemeRawAd().isDisableAdLink() || ((TextUtils.isEmpty(this.f79011d.getAwemeRawAd().getWebUrl()) && !this.f79011d.getAwemeRawAd().isRightStyle()) || !this.f79011d.isCanPlay())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo60603g() {
        if (super.mo60603g() || (C26469cc.m63997a(this.f79011d, 3) && TextUtils.isEmpty(this.f79011d.getAwemeRawAd().getWebUrl()))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ Object mo63652m() throws Exception {
        if (this.f79011d != null && this.f80908t.f80866h == 2) {
            C26890h.m65011a("see_original_show", C23089d.m56640a().mo47829a("enter_from", this.f79012e).mo47829a("group_id", this.f79011d.getAid()).f61491a);
        } else if (this.f79011d != null && this.f80908t.f80866h == 0) {
            C26890h.m65011a("see_translation_show", C23089d.m56640a().mo47829a("enter_from", this.f79012e).mo47829a("group_id", this.f79011d.getAid()).f61491a);
        }
        return null;
    }

    /* renamed from: p */
    private void m72352p() {
        if (this.f79011d.getTextExtra() != null && this.f79011d.getTextExtra().size() > 0) {
            for (TextExtraStruct textExtraStruct : this.f79011d.getTextExtra()) {
                if (textExtraStruct != null) {
                    if (textExtraStruct.getStart() < 0) {
                        textExtraStruct.setStart(0);
                    }
                    if (textExtraStruct.getEnd() > this.f79011d.getDesc().length()) {
                        textExtraStruct.setEnd(this.f79011d.getDesc().length());
                    }
                }
            }
        }
        if (this.f79017j != null) {
            this.f80904p.setMaxSize(m72354r());
            this.f80904p.setSpanSize((float) C23728o.m58246c(15.0d));
            this.f80904p.setSpanColor(this.f80904p.getCurrentTextColor());
            this.f80904p.setSpanStyle(1);
            this.f80904p.setOnSpanClickListener(new C30897db(this));
        }
    }

    /* JADX WARNING: type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r1v27, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v27, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r3v50 */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r3v51 */
    /* JADX WARNING: type inference failed for: r3v52 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.lang.Object> m72350n() {
        /*
            r12 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.f79011d
            java.lang.String r2 = "aweme_state"
            r0.put(r2, r1)
            boolean r1 = r12.m72353q()
            java.lang.String r2 = "shouldShowLinkLogo"
            boolean r3 = r12.m72353q()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.put(r2, r3)
            java.lang.String r2 = "isShowVideoDesc"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f79011d
            java.lang.String r3 = r3.getDesc()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x003d
            boolean r3 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r3 != 0) goto L_0x003d
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f79011d
            boolean r3 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81964a(r3)
            if (r3 != 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.put(r2, r3)
            boolean r2 = r12.m72351o()
            java.lang.String r3 = "shouldShowLongVideoLogo"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r0.put(r3, r6)
            java.lang.String r3 = "event_type_state"
            java.lang.String r6 = r12.f79012e
            r0.put(r3, r6)
            java.lang.String r3 = "page_type_state"
            int r6 = r12.f79015h
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r3, r6)
            r12.f80897D = r4
            java.lang.String r3 = "VideoDescView"
            java.lang.String r6 = "start to bind aweme des"
            r7 = 4
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75151c(r7, r3, r6)
            com.ss.android.ugc.aweme.views.MentionTextView r3 = r12.f80904p
            if (r3 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.views.MentionTextView r3 = r12.f80904p
            android.text.InputFilter[] r3 = r3.getFilters()
            android.text.InputFilter[] r3 = m72344a(r3)
            com.ss.android.ugc.aweme.views.MentionTextView r6 = r12.f80904p
            r6.setFilters(r3)
        L_0x0081:
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0185
            java.lang.String r1 = "VideoDescView"
            java.lang.String r3 = "shouldShowLinkLogo"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75151c(r7, r1, r3)
            android.text.SpannableString r3 = new android.text.SpannableString
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r12.f79011d
            java.lang.String r6 = r6.getDesc()
            r1.append(r6)
            java.lang.String r6 = m72349k()
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r3.<init>(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.f79011d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r1 = r1.getLabel()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r12.f79011d
            boolean r6 = r6.isAd()
            r7 = 17
            if (r6 == 0) goto L_0x0107
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r12.f79011d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r6.getAwemeRawAd()
            boolean r6 = r6.isRightStyle()
            if (r6 == 0) goto L_0x0107
            if (r1 == 0) goto L_0x0107
            com.ss.android.ugc.aweme.feed.widget.a r6 = new com.ss.android.ugc.aweme.feed.widget.a
            android.content.Context r8 = r12.f79017j
            java.lang.String r9 = r1.getBgColor()
            java.lang.String r10 = r1.getLabelName()
            java.lang.String r11 = r1.getTextColor()
            r6.<init>(r8, r9, r10, r11)
            boolean r1 = r1.isAdHollowText()
            r6.f81792a = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.f79011d
            java.lang.String r1 = r1.getDesc()
            int r1 = r1.length()
            int r1 = r1 + r5
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r12.f79011d
            java.lang.String r8 = r8.getDesc()
            int r8 = r8.length()
            java.lang.String r9 = m72349k()
            int r9 = r9.length()
            int r8 = r8 + r9
            r3.setSpan(r6, r1, r8, r7)
            goto L_0x017b
        L_0x0107:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.f79011d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            java.lang.String r1 = r1.getAdMoreTextual()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0143
            com.ss.android.ugc.aweme.commercialize.ad.a r1 = new com.ss.android.ugc.aweme.commercialize.ad.a
            android.content.Context r6 = r12.f79017j
            r8 = 2131952716(0x7f13044c, float:1.9541883E38)
            r1.<init>(r6, r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r12.f79011d
            java.lang.String r6 = r6.getDesc()
            int r6 = r6.length()
            int r6 = r6 + r5
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r12.f79011d
            java.lang.String r8 = r8.getDesc()
            int r8 = r8.length()
            java.lang.String r9 = m72349k()
            int r9 = r9.length()
            int r8 = r8 + r9
            r3.setSpan(r1, r6, r8, r7)
            goto L_0x017b
        L_0x0143:
            com.ss.android.ugc.aweme.feed.widget.f r1 = new com.ss.android.ugc.aweme.feed.widget.f
            android.content.Context r6 = r12.f79017j
            r8 = 2131820751(0x7f1100cf, float:1.9274226E38)
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r12.f79011d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r9 = r9.getAwemeRawAd()
            java.lang.String r9 = r9.getAdMoreTextual()
            r10 = 2131954556(0x7f130b7c, float:1.9545615E38)
            r1.<init>(r6, r8, r9, r10)
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r12.f79011d
            java.lang.String r6 = r6.getDesc()
            int r6 = r6.length()
            int r6 = r6 + r5
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r12.f79011d
            java.lang.String r8 = r8.getDesc()
            int r8 = r8.length()
            java.lang.String r9 = m72349k()
            int r9 = r9.length()
            int r8 = r8 + r9
            r3.setSpan(r1, r6, r8, r7)
        L_0x017b:
            java.lang.String r1 = "spannableString"
            r0.put(r1, r3)
            r12.m72352p()
            goto L_0x0245
        L_0x0185:
            java.lang.String r1 = "isShowVideoDesc"
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0228
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.f79011d
            java.lang.String r1 = r1.getDesc()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f79011d     // Catch:{ Exception -> 0x0218 }
            boolean r3 = r3.isAd()     // Catch:{ Exception -> 0x0218 }
            if (r3 == 0) goto L_0x01bb
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f79011d     // Catch:{ Exception -> 0x0218 }
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()     // Catch:{ Exception -> 0x0218 }
            com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r3 = r3.getLabel()     // Catch:{ Exception -> 0x0218 }
            if (r3 == 0) goto L_0x01bb
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f79011d     // Catch:{ Exception -> 0x0218 }
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()     // Catch:{ Exception -> 0x0218 }
            boolean r3 = r3.isRightStyle()     // Catch:{ Exception -> 0x0218 }
            if (r3 == 0) goto L_0x01bb
            r3 = 1
            goto L_0x01bc
        L_0x01bb:
            r3 = 0
        L_0x01bc:
            if (r3 == 0) goto L_0x021e
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f79011d     // Catch:{ Exception -> 0x0218 }
            java.lang.String r3 = r3.getDesc()     // Catch:{ Exception -> 0x0218 }
            if (r3 == 0) goto L_0x01fa
            int r6 = r3.length()     // Catch:{ Exception -> 0x0218 }
            int r7 = r12.m72354r()     // Catch:{ Exception -> 0x0218 }
            java.lang.String r8 = m72349k()     // Catch:{ Exception -> 0x0218 }
            int r8 = r8.length()     // Catch:{ Exception -> 0x0218 }
            int r7 = r7 - r8
            if (r6 > r7) goto L_0x01da
            goto L_0x01fa
        L_0x01da:
            int r3 = r12.m72354r()     // Catch:{ Exception -> 0x0218 }
            java.lang.String r6 = m72349k()     // Catch:{ Exception -> 0x0218 }
            int r6 = r6.length()     // Catch:{ Exception -> 0x0218 }
            int r3 = r3 - r6
            java.lang.String r6 = r12.mo63650j()     // Catch:{ Exception -> 0x0218 }
            int r6 = r6.length()     // Catch:{ Exception -> 0x0218 }
            int r3 = r3 - r6
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r12.f79011d     // Catch:{ Exception -> 0x0218 }
            java.lang.String r6 = r6.getDesc()     // Catch:{ Exception -> 0x0218 }
            java.lang.String r3 = r6.substring(r4, r3)     // Catch:{ Exception -> 0x0218 }
        L_0x01fa:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0218 }
            r6.<init>()     // Catch:{ Exception -> 0x0218 }
            r6.append(r3)     // Catch:{ Exception -> 0x0218 }
            java.lang.String r7 = m72349k()     // Catch:{ Exception -> 0x0218 }
            r6.append(r7)     // Catch:{ Exception -> 0x0218 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0218 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x0218 }
            r7 = 0
            java.lang.CharSequence r3 = r12.mo63643a(r6, r3, r7)     // Catch:{ Exception -> 0x0218 }
            r1 = r3
            goto L_0x021e
        L_0x0218:
            r3 = move-exception
            java.lang.String r6 = "init ad label"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75145a(r6, r3)
        L_0x021e:
            r3 = r1
            r12.m72352p()
            java.lang.String r1 = "desc"
            r0.put(r1, r3)
            goto L_0x0245
        L_0x0228:
            java.lang.String r1 = "VideoDescView"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "don't show desc,empty?"
            r6.<init>(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r12.f79011d
            java.lang.String r8 = r8.getDesc()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r7, r1, r6)
        L_0x0245:
            if (r2 == 0) goto L_0x02a9
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.f79011d
            java.lang.String r1 = r1.getDesc()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x025a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.f79011d
            java.lang.String r2 = ""
            r1.setDesc(r2)
        L_0x025a:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            if (r3 == 0) goto L_0x0286
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r2.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0270
            goto L_0x0286
        L_0x0270:
            r1.append(r3)
            com.ss.android.ugc.aweme.main.g r6 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
            android.content.Context r7 = r12.f79017j
            java.lang.String r8 = ""
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r12.f79011d
            java.lang.String r10 = r12.f79012e
            int r11 = r12.f79015h
            android.text.SpannableString r2 = r6.mo75751a(r7, r8, r9, r10, r11)
            goto L_0x029c
        L_0x0286:
            com.ss.android.ugc.aweme.main.g r6 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
            android.content.Context r7 = r12.f79017j
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r12.f79011d
            java.lang.String r8 = r2.getDesc()
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r12.f79011d
            java.lang.String r10 = r12.f79012e
            int r11 = r12.f79015h
            android.text.SpannableString r2 = r6.mo75751a(r7, r8, r9, r10, r11)
        L_0x029c:
            r12.m72352p()
            java.lang.String r3 = "descSpanBuilder"
            r0.put(r3, r1)
            java.lang.String r1 = "descSpanString"
            r0.put(r1, r2)
        L_0x02a9:
            com.ss.android.ugc.aweme.feed.ui.cr r1 = r12.f80908t
            if (r1 != 0) goto L_0x02c5
            com.ss.android.ugc.aweme.feed.ui.cr r1 = new com.ss.android.ugc.aweme.feed.ui.cr
            android.content.Context r2 = r12.f79017j
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r3 = r12.f80906r
            com.ss.android.ugc.aweme.views.MentionTextView r6 = r12.f80904p
            android.widget.TextView r7 = r12.f80905q
            r1.<init>(r2, r3, r6, r7)
            r12.f80908t = r1
            com.ss.android.ugc.aweme.feed.ui.cr r1 = r12.f80908t
            java.lang.String r2 = r12.f79012e
            int r3 = r12.f79015h
            r1.mo63629a(r2, r3)
        L_0x02c5:
            android.widget.LinearLayout r1 = r12.f80907s
            com.ss.android.ugc.aweme.feed.ui.da r2 = new com.ss.android.ugc.aweme.feed.ui.da
            r2.<init>(r12)
            r1.setOnClickListener(r2)
            android.content.Context r1 = r12.f79017j
            com.ss.android.ugc.aweme.feed.param.b r1 = com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider.m71941a(r1)
            boolean r1 = r1.isHotSpot()
            if (r1 != 0) goto L_0x02ec
            com.ss.android.ugc.aweme.mix.e r1 = com.p683ss.android.ugc.aweme.C23794bh.m58395i()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r12.f79011d
            int r3 = r12.f79022o
            java.lang.String r6 = r12.f79012e
            boolean r1 = r1.mo76333a(r2, r3, r6)
            if (r1 == 0) goto L_0x02ec
            r4 = 1
        L_0x02ec:
            java.lang.String r1 = "isShowMixDesNumForFeed"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.put(r1, r2)
            if (r4 == 0) goto L_0x0306
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.f79011d
            java.lang.String r1 = r1.getDesc()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0306
            r12.m72352p()
        L_0x0306:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72350n():java.util.Map");
    }

    /* renamed from: c */
    private void m72347c(Map<String, Object> map) {
        m72348d(map);
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
    }

    /* renamed from: c */
    public final int mo60595c(C23274a aVar) {
        return super.mo60595c(aVar);
    }

    /* renamed from: a */
    public static int m72340a(Aweme aweme) {
        if (C26503d.m64061d(aweme)) {
            return aweme.getAdDescMaxLines();
        }
        return 4;
    }

    /* renamed from: b */
    public final C23274a mo60590b(C23274a aVar) {
        if (aVar == null) {
            return null;
        }
        super.mo60590b(aVar);
        if (!aVar.f62242a.equals("video_params")) {
            return null;
        }
        return new C23274a("uistate", m72350n());
    }

    /* renamed from: a */
    private Map<String, String> m72341a(String str) {
        return C23089d.m56640a().mo47829a("enter_from", this.f79012e).mo47829a("group_id", this.f79011d.getAid()).mo47829a("author_id", this.f79011d.getAuthorUid()).mo47829a("action_type", str).f61491a;
    }

    /* renamed from: b */
    public static boolean m72346b(Aweme aweme) {
        if (!f80894B && aweme.getAwemeRawAd() == null) {
            throw new AssertionError();
        } else if (!aweme.isAd() || aweme.getAwemeRawAd().getLabel() == null || !aweme.getAwemeRawAd().isRightStyle()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private boolean m72343a(TextExtraStruct textExtraStruct) {
        if (this.f79011d == null || this.f79011d.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > this.f79011d.getDesc().length() || textExtraStruct.getStart() >= this.f79011d.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo60593b(VideoItemParams videoItemParams) {
        super.mo60593b(videoItemParams);
        if (videoItemParams != null) {
            this.f80910v = videoItemParams.mAdOpenCallBack;
            this.f80909u = videoItemParams.mAdViewController;
        }
    }

    /* renamed from: e */
    public final void mo60600e(C23274a aVar) {
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
                    if (this.f80908t != null) {
                        this.f80908t.f80870l = true;
                        C0013i.m18a((Callable<TResult>) new C30899dd<TResult>(this), (Executor) C26890h.m65003a());
                    }
                    this.f80898E = true;
                    if (this.f80897D) {
                        C0013i.m18a((Callable<TResult>) new C30900de<TResult>(this), (Executor) C26890h.m65003a());
                        return;
                    }
                    break;
                case 1:
                    if (this.f80908t != null) {
                        this.f80908t.f80870l = false;
                    }
                    this.f80898E = false;
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.InputFilter[] m72344a(android.text.InputFilter[] r7) {
        /*
            int r0 = r7.length
            int r1 = r7.length
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L_0x0043
            r1 = -1
            r4 = 0
        L_0x0008:
            if (r4 >= r0) goto L_0x0015
            r5 = r7[r4]
            boolean r5 = r5 instanceof android.text.InputFilter.LengthFilter
            if (r5 == 0) goto L_0x0012
            r1 = r4
            goto L_0x0015
        L_0x0012:
            int r4 = r4 + 1
            goto L_0x0008
        L_0x0015:
            java.lang.String r4 = "VideoDescView"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "descView,InputFilter size:"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r2, r4, r5)
            if (r1 < 0) goto L_0x0043
            java.lang.Class<android.text.InputFilter> r4 = android.text.InputFilter.class
            int r5 = r0 + -1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
            java.lang.System.arraycopy(r7, r3, r4, r3, r1)
            if (r1 >= r5) goto L_0x0040
            int r5 = r1 + 1
            int r6 = r0 - r1
            int r6 = r6 + -1
            java.lang.System.arraycopy(r7, r5, r4, r1, r6)
        L_0x0040:
            android.text.InputFilter[] r4 = (android.text.InputFilter[]) r4
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            if (r4 != 0) goto L_0x005b
            java.lang.String r7 = "VideoDescView"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "not find InputFilter.LengthFilter,size:"
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r2, r7, r0)
            android.text.InputFilter[] r4 = new android.text.InputFilter[r3]
        L_0x005b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72344a(android.text.InputFilter[]):android.text.InputFilter[]");
    }

    /* renamed from: d */
    private void m72348d(Map<String, Object> map) {
        Aweme aweme;
        String str;
        int i;
        if (map != null) {
            aweme = (Aweme) map.get("aweme_state");
            str = (String) map.get("event_type_state");
            i = ((Integer) map.get("page_type_state")).intValue();
        } else {
            aweme = this.f79011d;
            str = this.f79012e;
            i = this.f79015h;
        }
        final Aweme aweme2 = aweme;
        final String str2 = str;
        final int i2 = i;
        if (VERSION.SDK_INT < 21) {
            this.f80907s.post(new C30898dc(this));
        }
        if (this.f79017j != null) {
            this.f80904p.mo95551a(aweme2.getTextExtra(), (C48160d) new C45549f(true));
            if (aweme2 != null && aweme2.getTextExtra() != null && !TextUtils.isEmpty(aweme2.getDesc())) {
                Iterator it = aweme2.getTextExtra().iterator();
                while (true) {
                    if (it.hasNext()) {
                        TextExtraStruct textExtraStruct = (TextExtraStruct) it.next();
                        if (m72343a(textExtraStruct) && textExtraStruct.getType() == 0) {
                            if ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype()) && aweme2.getDesc().charAt(textExtraStruct.getStart()) == '@') {
                                C25594d dVar = new C25594d(this.f79017j, (float) Math.round(((float) C9432q.m18670a(this.f79017j)) - (C9432q.m18687b(this.f79017j, 100.0f) + this.f79017j.getResources().getDimension(R.dimen.yy))), this.f79017j.getResources().getColor(R.color.j2), -1, textExtraStruct);
                                dVar.f67759b = C9432q.m18687b(this.f79017j, 12.0f);
                                dVar.f67760c = C9432q.m18687b(this.f79017j, 2.0f);
                                dVar.f67758a = C9432q.m18687b(this.f79017j, 13.0f);
                                this.f80904p.mo95550a(textExtraStruct.getStart(), textExtraStruct.getEnd(), dVar);
                                break;
                            }
                        }
                    }
                }
            }
            try {
                if (C47918gj.m103682a(this.f79017j)) {
                    this.f80904p.setMovementMethod(C31251j.m72964a());
                } else if (m72351o()) {
                    this.f80904p.setMovementMethod(C31245d.m72956a());
                } else {
                    this.f80904p.setMovementMethod(C31243b.m72951a());
                }
            } catch (IndexOutOfBoundsException e) {
                C32458a.m75143a((Exception) e);
            }
            ViewTreeObserver viewTreeObserver = this.f80904p.getViewTreeObserver();
            final Map<String, Object> map2 = map;
            C308911 r1 = new OnGlobalLayoutListener() {
                /* JADX WARNING: type inference failed for: r5v4, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r5v5, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r5v7, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r8v18, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r5v9, types: [android.text.SpannableStringBuilder] */
                /* JADX WARNING: type inference failed for: r8v19 */
                /* JADX WARNING: type inference failed for: r8v20 */
                /* JADX WARNING: type inference failed for: r8v25 */
                /* JADX WARNING: type inference failed for: r8v26, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r10v13, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r8v27 */
                /* JADX WARNING: type inference failed for: r8v32 */
                /* JADX WARNING: type inference failed for: r17v0 */
                /* JADX WARNING: type inference failed for: r8v41 */
                /* JADX WARNING: type inference failed for: r9v20, types: [android.text.SpannableStringBuilder] */
                /* JADX WARNING: type inference failed for: r9v21, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r0v45, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r0v50 */
                /* JADX WARNING: type inference failed for: r0v52, types: [java.lang.CharSequence] */
                /* JADX WARNING: type inference failed for: r9v22, types: [android.text.SpannableStringBuilder] */
                /* JADX WARNING: type inference failed for: r5v28 */
                /* JADX WARNING: type inference failed for: r5v29 */
                /* JADX WARNING: type inference failed for: r8v60 */
                /* JADX WARNING: type inference failed for: r8v61 */
                /* JADX WARNING: type inference failed for: r8v62 */
                /* JADX WARNING: type inference failed for: r9v25 */
                /* JADX WARNING: type inference failed for: r0v67 */
                /* JADX WARNING: type inference failed for: r9v26 */
                /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v19
                  assigns: []
                  uses: []
                  mth insns count: 518
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
                /* JADX WARNING: Removed duplicated region for block: B:104:0x041b A[SYNTHETIC, Splitter:B:104:0x041b] */
                /* JADX WARNING: Removed duplicated region for block: B:120:0x048c  */
                /* JADX WARNING: Removed duplicated region for block: B:130:0x04d6  */
                /* JADX WARNING: Removed duplicated region for block: B:133:0x0508  */
                /* JADX WARNING: Removed duplicated region for block: B:141:0x0486 A[EDGE_INSN: B:141:0x0486->B:118:0x0486 ?: BREAK  
                EDGE_INSN: B:141:0x0486->B:118:0x0486 ?: BREAK  , SYNTHETIC] */
                /* JADX WARNING: Removed duplicated region for block: B:73:0x02e1  */
                /* JADX WARNING: Removed duplicated region for block: B:76:0x0315  */
                /* JADX WARNING: Removed duplicated region for block: B:77:0x0328  */
                /* JADX WARNING: Removed duplicated region for block: B:80:0x033f  */
                /* JADX WARNING: Removed duplicated region for block: B:89:0x038a  */
                /* JADX WARNING: Removed duplicated region for block: B:92:0x03a1  */
                /* JADX WARNING: Removed duplicated region for block: B:94:0x03a8  */
                /* JADX WARNING: Unknown variable types count: 13 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onGlobalLayout() {
                    /*
                        r18 = this;
                        r1 = r18
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3
                        int r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72340a(r0)
                        com.ss.android.ugc.aweme.feed.ui.cy r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f80904p
                        android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                        com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3
                        boolean r3 = r3.isAd()
                        r4 = 4
                        r5 = 1
                        r6 = 0
                        if (r3 == 0) goto L_0x0116
                        com.ss.android.ugc.aweme.feed.ui.cy r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f80904p
                        int r3 = r3.getLineCount()
                        if (r3 <= r0) goto L_0x0116
                        com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3
                        boolean r3 = r3.isAdDescHandle()
                        if (r3 == 0) goto L_0x0116
                        com.ss.android.ugc.aweme.feed.ui.cy r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f80904p
                        java.lang.CharSequence r3 = r3.getText()
                        com.ss.android.ugc.aweme.feed.model.Aweme r7 = r3
                        java.lang.String r7 = r7.getDesc()
                        com.ss.android.ugc.aweme.feed.ui.cy r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        r8.mo63648a(r7)
                        com.ss.android.ugc.aweme.feed.ui.cy r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f80904p
                        android.text.Layout r7 = r7.getLayout()
                        if (r7 != 0) goto L_0x0087
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3
                        r0.setAdDescHandle(r6)
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        r0.mo63648a(r3)
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r2 = "VideoDescView_onGlobalLayout_null + aid = "
                        r0.<init>(r2)
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3
                        java.lang.String r2 = r2.getAid()
                        r0.append(r2)
                        java.lang.String r2 = "desc = "
                        r0.append(r2)
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3
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
                    L_0x0087:
                        com.ss.android.ugc.aweme.feed.ui.cy r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f80904p
                        android.text.Layout r7 = r7.getLayout()
                        if (r7 == 0) goto L_0x00ab
                        com.ss.android.ugc.aweme.feed.ui.cy r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f80904p
                        android.text.Layout r7 = r7.getLayout()
                        int r7 = r7.getLineCount()
                        if (r7 > r0) goto L_0x00ab
                        int r0 = r0 + r5
                        com.ss.android.ugc.aweme.feed.ui.cy r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        java.util.Map r4 = r4
                        r3.mo63644a(r0, r4)
                        r2.removeOnGlobalLayoutListener(r1)
                        return
                    L_0x00ab:
                        int r7 = r3.length()
                        java.lang.String r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72349k()
                        int r8 = r8.length()
                        int r7 = r7 - r8
                        com.ss.android.ugc.aweme.main.g r8 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
                        com.ss.android.ugc.aweme.feed.model.Aweme r9 = r3
                        boolean r8 = r8.mo75754a(r9)
                        if (r8 == 0) goto L_0x00c6
                        r8 = 4
                        goto L_0x00c7
                    L_0x00c6:
                        r8 = 0
                    L_0x00c7:
                        int r7 = r7 - r8
                        r8 = 100
                        if (r7 >= r8) goto L_0x00d6
                        int r0 = r0 + 1
                        com.ss.android.ugc.aweme.feed.ui.cy r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        java.util.Map r7 = r4
                        r3.mo63644a(r0, r7)
                        goto L_0x0116
                    L_0x00d6:
                        com.ss.android.ugc.aweme.feed.ui.cy r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        r7.mo63648a(r3)
                        boolean r7 = r3 instanceof android.text.SpannableString
                        if (r7 == 0) goto L_0x0116
                        com.ss.android.ugc.aweme.feed.ui.cy r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f80904p
                        android.text.Layout r7 = r7.getLayout()
                        if (r7 == 0) goto L_0x0116
                        com.ss.android.ugc.aweme.feed.ui.cy r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f80904p
                        android.text.Layout r7 = r7.getLayout()
                        int r9 = r0 + -2
                        int r7 = r7.getLineEnd(r9)
                        java.lang.CharSequence r3 = r3.subSequence(r6, r7)
                        com.ss.android.ugc.aweme.feed.model.Aweme r7 = r3
                        java.lang.String r7 = r7.getDesc()
                        int r7 = r7.length()
                        if (r7 <= r8) goto L_0x0116
                        int r3 = r3.length()
                        if (r3 >= r8) goto L_0x0116
                        int r0 = r0 + 1
                        com.ss.android.ugc.aweme.feed.ui.cy r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        java.util.Map r7 = r4
                        r3.mo63644a(r0, r7)
                    L_0x0116:
                        r3 = r0
                        r2.removeOnGlobalLayoutListener(r1)
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        java.lang.String r0 = r0.mo63650j()
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3
                        boolean r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72346b(r2)
                        if (r2 == 0) goto L_0x013b
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72349k()
                        r2.append(r7)
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                    L_0x013b:
                        int r2 = r0.length()
                        int r7 = r2 + 1
                        com.ss.android.ugc.aweme.main.g r8 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
                        com.ss.android.ugc.aweme.feed.model.Aweme r9 = r3
                        boolean r8 = r8.mo75754a(r9)
                        if (r8 == 0) goto L_0x0224
                        java.lang.String r2 = "VideoDescView"
                        java.lang.String r5 = "long video set desc"
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r4, r2, r5)
                        com.ss.android.ugc.aweme.feed.ui.cy r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f80904p
                        int r2 = r2.getLineCount()
                        if (r2 <= r3) goto L_0x0223
                        com.ss.android.ugc.aweme.feed.ui.cy r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f80904p
                        java.lang.CharSequence r2 = r2.getText()
                        boolean r4 = r2 instanceof android.text.SpannableString
                        if (r4 == 0) goto L_0x0223
                        com.ss.android.ugc.aweme.feed.ui.cy r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r4 = r4.f80904p
                        android.text.Layout r4 = r4.getLayout()
                        int r3 = r3 + -2
                        int r3 = r4.getLineEnd(r3)
                        java.lang.CharSequence r3 = r2.subSequence(r6, r3)
                        android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
                        r9.<init>(r3)
                        com.ss.android.ugc.aweme.feed.model.Aweme r4 = r3
                        boolean r4 = r4.isAd()
                        if (r4 == 0) goto L_0x019e
                        java.lang.String r4 = r3.toString()
                        java.lang.String r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72349k()
                        boolean r4 = r4.contains(r5)
                        if (r4 != 0) goto L_0x019e
                        java.lang.String r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72349k()
                        r9.append(r4)
                    L_0x019e:
                        java.lang.String r4 = r3.toString()
                        java.lang.String r5 = " [r]"
                        boolean r4 = r4.contains(r5)
                        if (r4 != 0) goto L_0x01e9
                        java.lang.String r0 = " [r]"
                        r9.append(r0)
                        com.ss.android.ugc.aweme.main.g r4 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        android.content.Context r5 = r0.f79017j
                        com.ss.android.ugc.aweme.feed.model.Aweme r6 = r3
                        java.lang.String r7 = r5
                        int r8 = r6
                        android.text.SpannableStringBuilder r0 = r4.mo75752a(r5, r6, r7, r8, r9)
                        java.lang.String r4 = "..."
                        android.text.SpannableStringBuilder r9 = r0.append(r4)
                        com.ss.android.ugc.aweme.main.g r10 = com.p683ss.android.ugc.aweme.C23794bh.m58393g()
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        android.content.Context r11 = r0.f79017j
                        com.ss.android.ugc.aweme.feed.model.Aweme r12 = r3
                        java.lang.String r13 = r5
                        int r14 = r6
                        android.text.SpannableStringBuilder r15 = android.text.SpannableStringBuilder.valueOf(r2)
                        android.text.SpannableStringBuilder r0 = r10.mo75752a(r11, r12, r13, r14, r15)
                        com.ss.android.ugc.aweme.feed.ui.cy r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3
                        boolean r5 = r5.isAd()
                        r4.mo63645a(r9, r0, r5)
                        goto L_0x01ec
                    L_0x01e9:
                        r9.append(r0)
                    L_0x01ec:
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3
                        boolean r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72346b(r0)
                        if (r0 == 0) goto L_0x0201
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        int r3 = r3.length()
                        com.ss.android.ugc.aweme.feed.model.Aweme r4 = r3
                        java.lang.CharSequence r0 = r0.mo63643a(r9, r3, r4)
                        goto L_0x0202
                    L_0x0201:
                        r0 = r9
                    L_0x0202:
                        com.ss.android.ugc.aweme.feed.ui.cy r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        r3.mo63648a(r0)
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80904p
                        com.ss.android.ugc.aweme.feed.ui.cy r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f80904p
                        int r3 = r3.getCurrentTextColor()
                        r0.setSpanColor(r3)
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        r0.f80913y = r9
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
                        r3.<init>(r2)
                        r0.f80911w = r3
                    L_0x0223:
                        return
                    L_0x0224:
                        com.ss.android.ugc.aweme.feed.ui.cy r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r4 = r4.f80904p
                        int r4 = r4.getLineCount()
                        if (r4 != 0) goto L_0x0230
                        r4 = r3
                        goto L_0x0238
                    L_0x0230:
                        com.ss.android.ugc.aweme.feed.ui.cy r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r4 = r4.f80904p
                        int r4 = r4.getLineCount()
                    L_0x0238:
                        if (r4 <= r3) goto L_0x0548
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        java.lang.String r9 = " "
                        r8.<init>(r9)
                        com.ss.android.ugc.aweme.feed.ui.cy r9 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        android.content.Context r9 = r9.f79017j
                        r10 = 2132544593(0x7f1c0c51, float:2.0742352E38)
                        java.lang.String r9 = r9.getString(r10)
                        r8.append(r9)
                        java.lang.String r8 = r8.toString()
                        com.ss.android.ugc.aweme.feed.ui.cy r9 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f80904p
                        android.text.Layout r9 = r9.getLayout()
                        if (r9 == 0) goto L_0x026c
                        com.ss.android.ugc.aweme.feed.ui.cy r9 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f80904p
                        android.text.Layout r9 = r9.getLayout()
                        int r10 = r3 + -1
                        int r9 = r9.getLineEnd(r10)
                        goto L_0x026d
                    L_0x026c:
                        r9 = 0
                    L_0x026d:
                        com.ss.android.ugc.aweme.feed.ui.cy r10 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r10 = r10.f80904p
                        java.lang.CharSequence r10 = r10.getText()
                        r11 = 3
                        java.lang.String r12 = "VideoDescView"
                        java.lang.StringBuilder r13 = new java.lang.StringBuilder
                        java.lang.String r14 = "Desc more than 4 lines, lineCount is "
                        r13.<init>(r14)
                        com.ss.android.ugc.aweme.feed.ui.cy r14 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f80904p
                        int r14 = r14.getLineCount()
                        r13.append(r14)
                        java.lang.String r14 = "content is "
                        r13.append(r14)
                        r13.append(r10)
                        java.lang.String r13 = r13.toString()
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r11, r12, r13)
                        com.ss.android.ugc.aweme.feed.ui.cy r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.feed.ui.cy r12 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f80904p
                        int r12 = r12.getHeight()
                        r11.f80912x = r12
                        com.ss.android.ugc.aweme.feed.ui.cy r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f80904p
                        android.text.TextPaint r11 = r11.getPaint()
                        float r8 = r11.measureText(r8)
                        r11 = 12
                        if (r4 < r11) goto L_0x02d5
                        r4 = 11
                        com.ss.android.ugc.aweme.feed.ui.cy r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f80904p
                        android.text.Layout r11 = r11.getLayout()
                        if (r11 == 0) goto L_0x02d5
                        com.ss.android.ugc.aweme.feed.ui.cy r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f80904p
                        android.text.Layout r11 = r11.getLayout()
                        r12 = 10
                        int r11 = r11.getLineEnd(r12)
                        java.lang.CharSequence r10 = r10.subSequence(r6, r11)
                        r11 = 1
                        goto L_0x02d6
                    L_0x02d5:
                        r11 = 0
                    L_0x02d6:
                        r12 = 0
                        com.ss.android.ugc.aweme.feed.ui.cy r13 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f80904p
                        android.text.Layout r13 = r13.getLayout()
                        if (r13 == 0) goto L_0x0311
                        com.ss.android.ugc.aweme.feed.ui.cy r12 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f80904p
                        int r12 = r12.getWidth()
                        float r12 = (float) r12
                        com.ss.android.ugc.aweme.feed.ui.cy r13 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f80904p
                        android.text.TextPaint r13 = r13.getPaint()
                        com.ss.android.ugc.aweme.feed.ui.cy r14 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f80904p
                        android.text.Layout r14 = r14.getLayout()
                        int r15 = r4 + -1
                        int r14 = r14.getLineStart(r15)
                        com.ss.android.ugc.aweme.feed.ui.cy r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r5 = r5.f80904p
                        android.text.Layout r5 = r5.getLayout()
                        int r5 = r5.getLineEnd(r15)
                        float r5 = r13.measureText(r10, r14, r5)
                        float r12 = r12 - r5
                    L_0x0311:
                        int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                        if (r5 >= 0) goto L_0x0328
                        com.ss.android.ugc.aweme.feed.ui.cy r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.feed.ui.cy r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        int r8 = r8.f80912x
                        com.ss.android.ugc.aweme.feed.ui.cy r12 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        int r12 = r12.f80912x
                        int r12 = r12 / r4
                        int r8 = r8 + r12
                        r5.f80912x = r8
                        int r4 = r4 + 1
                        r16 = 1
                        goto L_0x032a
                    L_0x0328:
                        r16 = 0
                    L_0x032a:
                        com.ss.android.ugc.aweme.feed.ui.cy r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r8 = r3
                        int r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72340a(r8)
                        com.ss.android.ugc.aweme.feed.ui.cy r12 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        int r12 = r12.f80912x
                        int r8 = r8 * r12
                        int r8 = r8 / r4
                        r5.f80914z = r8
                        boolean r5 = r10 instanceof android.text.SpannableString
                        if (r5 == 0) goto L_0x0547
                        if (r9 != 0) goto L_0x0347
                        int r5 = r10.length()
                        int r9 = r5 / 2
                    L_0x0347:
                        if (r9 < r7) goto L_0x036e
                        com.ss.android.ugc.aweme.services.IExternalService r5 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
                        com.ss.android.ugc.aweme.services.IExternalService r5 = (com.p683ss.android.ugc.aweme.services.IExternalService) r5
                        com.ss.android.ugc.aweme.services.video.IAVPublishService r5 = r5.publishService()
                        int r7 = r9 - r7
                        int r8 = r7 + 2
                        java.lang.CharSequence r8 = r10.subSequence(r7, r8)
                        java.lang.String r8 = r8.toString()
                        boolean r5 = r5.containEmoji(r8)
                        if (r5 == 0) goto L_0x036e
                        int r2 = java.lang.Math.max(r6, r7)
                        java.lang.CharSequence r2 = r10.subSequence(r6, r2)
                        goto L_0x037d
                    L_0x036e:
                        com.ss.android.ugc.aweme.feed.ui.cy r5 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        int r2 = r5.mo63642a(r10, r0, r2, r9)
                        int r9 = r9 - r2
                        int r2 = java.lang.Math.max(r6, r9)
                        java.lang.CharSequence r2 = r10.subSequence(r6, r2)
                    L_0x037d:
                        android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
                        r5.<init>(r2)
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3
                        boolean r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72346b(r2)
                        if (r2 == 0) goto L_0x0391
                        java.lang.String r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72349k()
                        r5.append(r2)
                    L_0x0391:
                        java.lang.String r2 = "..."
                        r5.append(r2)
                        android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
                        android.text.SpannableString r8 = android.text.SpannableString.valueOf(r10)
                        r7.<init>(r8)
                        if (r16 == 0) goto L_0x03a6
                        java.lang.String r8 = "\n"
                        r7.append(r8)
                    L_0x03a6:
                        if (r11 == 0) goto L_0x03ad
                        java.lang.String r8 = "..."
                        r7.append(r8)
                    L_0x03ad:
                        com.ss.android.ugc.aweme.feed.ui.cy r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80904p
                        com.ss.android.ugc.aweme.feed.model.Aweme r9 = r3
                        int r9 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72340a(r9)
                        r8.setLines(r9)
                        com.ss.android.ugc.aweme.feed.ui.cy r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        r8.mo63648a(r5)
                        com.ss.android.ugc.aweme.feed.ui.cy r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80904p
                        int r8 = r8.getLineCount()
                        if (r8 != r3) goto L_0x0497
                        com.ss.android.ugc.aweme.feed.model.Aweme r8 = r3
                        boolean r8 = r8.isAd()
                        if (r8 != 0) goto L_0x0497
                        com.ss.android.ugc.aweme.feed.ui.cy r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x0481 }
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80904p     // Catch:{ Exception -> 0x0481 }
                        android.text.Layout r8 = r8.getLayout()     // Catch:{ Exception -> 0x0481 }
                        int r9 = r3 + -1
                        int r8 = r8.getLineEnd(r9)     // Catch:{ Exception -> 0x0481 }
                        com.ss.android.ugc.aweme.feed.ui.cy r10 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x0481 }
                        com.ss.android.ugc.aweme.views.MentionTextView r10 = r10.f80904p     // Catch:{ Exception -> 0x0481 }
                        int r10 = r10.getWidth()     // Catch:{ Exception -> 0x0481 }
                        float r10 = (float) r10     // Catch:{ Exception -> 0x0481 }
                        com.ss.android.ugc.aweme.feed.ui.cy r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x0481 }
                        com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f80904p     // Catch:{ Exception -> 0x0481 }
                        android.text.TextPaint r11 = r11.getPaint()     // Catch:{ Exception -> 0x0481 }
                        com.ss.android.ugc.aweme.feed.ui.cy r12 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x0481 }
                        com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f80904p     // Catch:{ Exception -> 0x0481 }
                        java.lang.CharSequence r12 = r12.getText()     // Catch:{ Exception -> 0x0481 }
                        com.ss.android.ugc.aweme.feed.ui.cy r13 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x0481 }
                        com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f80904p     // Catch:{ Exception -> 0x0481 }
                        android.text.Layout r13 = r13.getLayout()     // Catch:{ Exception -> 0x0481 }
                        int r13 = r13.getLineStart(r9)     // Catch:{ Exception -> 0x0481 }
                        float r11 = r11.measureText(r12, r13, r8)     // Catch:{ Exception -> 0x0481 }
                        float r10 = r10 - r11
                        com.ss.android.ugc.aweme.feed.ui.cy r11 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x0481 }
                        com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f80904p     // Catch:{ Exception -> 0x0481 }
                        android.text.TextPaint r11 = r11.getPaint()     // Catch:{ Exception -> 0x0481 }
                        float r11 = r11.measureText(r0)     // Catch:{ Exception -> 0x0481 }
                        r12 = r8
                        r8 = r5
                    L_0x0417:
                        int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                        if (r10 >= 0) goto L_0x0486
                        int r10 = r0.length()     // Catch:{ Exception -> 0x047f }
                        int r12 = r12 - r10
                        java.lang.CharSequence r10 = r8.subSequence(r6, r12)     // Catch:{ Exception -> 0x047f }
                        com.ss.android.ugc.aweme.feed.ui.cy r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x047c }
                        android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x047c }
                        r12.<init>(r10)     // Catch:{ Exception -> 0x047c }
                        java.lang.String r13 = "..."
                        android.text.SpannableStringBuilder r12 = r12.append(r13)     // Catch:{ Exception -> 0x047c }
                        r8.mo63648a(r12)     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.feed.ui.cy r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80904p     // Catch:{ Exception -> 0x047c }
                        int r8 = r8.getLineCount()     // Catch:{ Exception -> 0x047c }
                        if (r8 != r3) goto L_0x047a
                        com.ss.android.ugc.aweme.feed.ui.cy r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80904p     // Catch:{ Exception -> 0x047c }
                        android.text.Layout r8 = r8.getLayout()     // Catch:{ Exception -> 0x047c }
                        int r12 = r8.getLineEnd(r9)     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.feed.ui.cy r8 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f80904p     // Catch:{ Exception -> 0x047c }
                        int r8 = r8.getWidth()     // Catch:{ Exception -> 0x047c }
                        float r8 = (float) r8     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.feed.ui.cy r13 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f80904p     // Catch:{ Exception -> 0x047c }
                        android.text.TextPaint r13 = r13.getPaint()     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.feed.ui.cy r14 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f80904p     // Catch:{ Exception -> 0x047c }
                        java.lang.CharSequence r14 = r14.getText()     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.feed.ui.cy r15 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this     // Catch:{ Exception -> 0x047c }
                        com.ss.android.ugc.aweme.views.MentionTextView r15 = r15.f80904p     // Catch:{ Exception -> 0x047c }
                        android.text.Layout r15 = r15.getLayout()     // Catch:{ Exception -> 0x047c }
                        int r15 = r15.getLineStart(r9)     // Catch:{ Exception -> 0x047c }
                        float r13 = r13.measureText(r14, r15, r12)     // Catch:{ Exception -> 0x047c }
                        float r8 = r8 - r13
                        r17 = r10
                        r10 = r8
                        r8 = r17
                        goto L_0x0417
                    L_0x047a:
                        r8 = r10
                        goto L_0x0486
                    L_0x047c:
                        r0 = move-exception
                        r8 = r10
                        goto L_0x0483
                    L_0x047f:
                        r0 = move-exception
                        goto L_0x0483
                    L_0x0481:
                        r0 = move-exception
                        r8 = r5
                    L_0x0483:
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r0)
                    L_0x0486:
                        boolean r0 = android.text.TextUtils.equals(r8, r5)
                        if (r0 != 0) goto L_0x0497
                        android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                        r0.<init>(r8)
                        java.lang.String r5 = "..."
                        android.text.SpannableStringBuilder r5 = r0.append(r5)
                    L_0x0497:
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r6 = r3
                        boolean r6 = r6.isAd()
                        r0.mo63645a(r5, r7, r6)
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        r0.f80913y = r5
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        r0.f80911w = r7
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.feed.ui.cr r0 = r0.f80908t
                        if (r0 == 0) goto L_0x04ce
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.feed.ui.cr r0 = r0.f80908t
                        int r0 = r0.f80866h
                        if (r0 != 0) goto L_0x04ce
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3
                        java.lang.CharSequence r0 = r0.getTransDesc()
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 == 0) goto L_0x04ce
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3
                        r0.setEllipsizeDesc(r5)
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3
                        r0.setProcessedDesc(r7)
                    L_0x04ce:
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3
                        boolean r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72346b(r0)
                        if (r0 == 0) goto L_0x04f9
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        int r6 = r5.length()
                        java.lang.String r7 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.m72349k()
                        int r7 = r7.length()
                        int r6 = r6 - r7
                        int r2 = r2.length()
                        int r6 = r6 - r2
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3
                        java.lang.CharSequence r5 = r0.mo63643a(r5, r6, r2)
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                        r2.<init>(r5)
                        r0.f80913y = r2
                    L_0x04f9:
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        r0.mo63648a(r5)
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80904p
                        android.text.Layout r0 = r0.getLayout()
                        if (r0 == 0) goto L_0x052a
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80904p
                        android.text.Layout r0 = r0.getLayout()
                        int r0 = r0.getLineCount()
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3
                        boolean r2 = r2.isAd()
                        if (r2 == 0) goto L_0x052a
                        if (r0 <= r3) goto L_0x052a
                        com.ss.android.ugc.aweme.feed.ui.cy r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f80904p
                        r2.setLines(r0)
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3
                        r2.setAdDescMaxLines(r0)
                    L_0x052a:
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80904p
                        com.ss.android.ugc.aweme.feed.ui.cy r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f80904p
                        int r2 = r2.getCurrentTextColor()
                        r0.setSpanColor(r2)
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80904p
                        com.ss.android.ugc.aweme.feed.ui.dh r2 = new com.ss.android.ugc.aweme.feed.ui.dh
                        com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3
                        r2.<init>(r1, r4, r3)
                        r0.post(r2)
                    L_0x0547:
                        return
                    L_0x0548:
                        com.ss.android.ugc.aweme.feed.ui.cy r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f80904p
                        com.ss.android.ugc.aweme.feed.ui.di r2 = new com.ss.android.ugc.aweme.feed.ui.di
                        r2.<init>(r1)
                        r0.post(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy.C308911.onGlobalLayout():void");
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(r1);
        }
    }

    /* renamed from: a */
    private static void m72342a(SpannableStringBuilder spannableStringBuilder, SpannableString spannableString) {
        if (TextUtils.equals(Build.BRAND.toLowerCase(), "gionee")) {
            try {
                spannableStringBuilder.append(spannableString);
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        } else {
            spannableStringBuilder.append(spannableString);
        }
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        if (!this.f80895A && (this.f80902I instanceof FrameLayout)) {
            ((FrameLayout) this.f80902I).addView(this.f80903J);
            this.f80895A = true;
        }
        if (aVar != null) {
            if (((Aweme) ((Map) aVar.mo48246a()).get("aweme_state")) == null) {
                StringBuilder sb = new StringBuilder("desc Aweme null and content visible ");
                sb.append(this.f80903J.getVisibility());
                C32458a.m75141a(6, "VideoDescView", sb.toString());
                return;
            }
            Map map = (Map) aVar.mo48246a();
            Aweme aweme = (Aweme) map.get("aweme_state");
            this.f80905q.setVisibility(4);
            this.f80905q.setText(this.f79017j.getString(R.string.b1o));
            this.f80904p.setMaxLines(m72340a(aweme));
            mo63648a((CharSequence) "");
            if (((Boolean) map.get("shouldShowLinkLogo")).booleanValue()) {
                this.f79018k.setVisibility(0);
                mo63648a((CharSequence) (SpannableString) map.get("spannableString"));
                this.f80904p.setSpanColor(this.f80904p.getCurrentTextColor());
                C47795d.m103429a(this.f80907s);
                m72347c(map);
            } else if (((Boolean) map.get("isShowVideoDesc")).booleanValue()) {
                this.f79018k.setVisibility(0);
                mo63648a((CharSequence) map.get("desc"));
                m72347c(map);
            } else {
                this.f79018k.setVisibility(8);
            }
            if (((Boolean) map.get("shouldShowLongVideoLogo")).booleanValue()) {
                this.f79018k.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) map.get("descSpanBuilder");
                m72342a(spannableStringBuilder, (SpannableString) map.get("descSpanString"));
                mo63648a((CharSequence) spannableStringBuilder);
                this.f80904p.setSpanColor(this.f80904p.getCurrentTextColor());
                m72347c(map);
            }
            this.f80908t.mo63622a(aweme);
            this.f80908t.f80870l = false;
            if (((Boolean) map.get("isShowMixDesNumForFeed")).booleanValue()) {
                if (TextUtils.isEmpty(aweme.getDesc())) {
                    m72347c(map);
                }
                C23794bh.m58395i().mo76331a(this.f79017j, aweme, (TextView) this.f80904p);
                this.f79018k.setVisibility(0);
            }
        }
    }

    public C30890cy(View view, C30787bb bbVar, boolean z) {
        super(view, z);
        this.f80896C = bbVar;
    }

    /* renamed from: b */
    private void m72345b(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z) {
        spannableStringBuilder.setSpan(new C30893a(this, spannableStringBuilder2, z), 0, spannableStringBuilder.length(), 33);
    }

    /* renamed from: a */
    public final CharSequence mo63643a(CharSequence charSequence, int i, Aweme aweme) {
        SpannableStringBuilder spannableStringBuilder;
        if (aweme == null) {
            aweme = this.f79011d;
        }
        int length = m72349k().length() + i;
        if (charSequence == null || i < 0 || charSequence.length() < length || !TextUtils.equals(charSequence.subSequence(i, length).toString(), m72349k())) {
            return charSequence;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return charSequence;
        }
        AwemeTextLabelModel label = awemeRawAd.getLabel();
        if (label == null) {
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        C31242a aVar = new C31242a(this.f79017j, label.getBgColor(), label.getLabelName(), label.getTextColor());
        aVar.f81792a = label.isAdHollowText();
        spannableStringBuilder.setSpan(aVar, i + 1, i + m72349k().length(), 17);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public final int mo63642a(CharSequence charSequence, String str, int i, int i2) {
        try {
            float measureText = this.f80904p.getPaint().measureText(str);
            int i3 = i;
            while (i3 >= 3) {
                if (this.f80904p.getPaint().measureText(charSequence, i2 - i3, i2) < measureText) {
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
