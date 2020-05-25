package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.EllipsizeCallback;
import android.text.TextUtils.TruncateAt;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.digg.C27689c.C27690a;
import com.p683ss.android.ugc.aweme.digg.p1634b.C27688a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.C31836d;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.CommentLikeListView.C31823b;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.CommentLikeListView.C31824c;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView */
public class InsBoldTextCommentLikeListView extends InsCommentLikeListView {

    /* renamed from: a */
    public static final C37904a f96517a = new C37904a(null);

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView$BoldTextForegroundSpan */
    final class BoldTextForegroundSpan extends ForegroundColorSpan {
        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "textPaint");
            super.updateDrawState(textPaint);
            textPaint.setFakeBoldText(true);
        }

        public BoldTextForegroundSpan(int i) {
            super(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView$a */
    public static final class C37904a {
        private C37904a() {
        }

        public /* synthetic */ C37904a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView$b */
    static final class C37905b implements C31823b {

        /* renamed from: a */
        final /* synthetic */ InsBoldTextCommentLikeListView f96519a;

        /* renamed from: b */
        final /* synthetic */ User f96520b;

        C37905b(InsBoldTextCommentLikeListView insBoldTextCommentLikeListView, User user) {
            this.f96519a = insBoldTextCommentLikeListView;
            this.f96520b = user;
        }

        /* renamed from: a */
        public final void mo51826a(View view, User user) {
            String str;
            if (this.f96520b.getUid() != null) {
                C41302w a = C41302w.m91042a();
                Context context = this.f96519a.getContext();
                if (context != null) {
                    Activity activity = (Activity) context;
                    StringBuilder sb = new StringBuilder("aweme://user/profile/");
                    sb.append(this.f96520b.getUid());
                    Aweme aweme = this.f96519a.f83153e;
                    C52711k.m112236a((Object) aweme, "mAweme");
                    a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("enter_from_request_id", aweme.getRequestId()).mo83870a("enter_from", this.f96519a.f83154f).mo83870a("sec_user_id", this.f96520b.getSecUid()).mo83871a());
                    String str2 = "enter_personal_detail";
                    Aweme aweme2 = this.f96519a.f83153e;
                    C52711k.m112236a((Object) aweme2, "mAweme");
                    Aweme aweme3 = this.f96519a.f83153e;
                    C52711k.m112236a((Object) aweme3, "mAweme");
                    C23089d a2 = C23089d.m56640a().mo47829a("group_id", aweme2.getAid()).mo47829a("to_user_id", this.f96520b.getUid()).mo47829a("enter_from", this.f96519a.f83154f).mo47829a("author_id", aweme3.getAuthorUid()).mo47829a("enter_method", "click_like_name");
                    String str3 = "relation_type";
                    if (C47915gg.m103663l(this.f96520b)) {
                        str = "follow";
                    } else {
                        str = "unfollow";
                    }
                    C26890h.m65011a(str2, a2.mo47829a(str3, str).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(this.f96519a.f83153e))).mo47829a("video_type", C23198ae.m56886v(this.f96519a.f83153e)).mo47829a("rec_uid", C23198ae.m56887w(this.f96519a.f83153e)).f61491a);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView$c */
    static final class C37906c implements EllipsizeCallback {

        /* renamed from: a */
        final /* synthetic */ int[] f96521a;

        /* renamed from: b */
        final /* synthetic */ int f96522b;

        C37906c(int[] iArr, int i) {
            this.f96521a = iArr;
            this.f96522b = i;
        }

        public final void ellipsized(int i, int i2) {
            if (i2 - i <= 0) {
                this.f96521a[0] = -1;
            } else {
                this.f96521a[0] = this.f96522b + i;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView$d */
    static final class C37907d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsBoldTextCommentLikeListView f96523a;

        C37907d(InsBoldTextCommentLikeListView insBoldTextCommentLikeListView) {
            this.f96523a = insBoldTextCommentLikeListView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Activity g = C11016e.m22312g();
            if (!(g instanceof FragmentActivity)) {
                g = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) g;
            if (fragmentActivity != null) {
                Aweme aweme = this.f96523a.f83153e;
                C52711k.m112236a((Object) aweme, "mAweme");
                String aid = aweme.getAid();
                Aweme aweme2 = this.f96523a.f83153e;
                C52711k.m112236a((Object) aweme2, "mAweme");
                int awemeType = aweme2.getAwemeType();
                String a = C47760cd.m103385a(this.f96523a.f83152d);
                String str = this.f96523a.f83154f;
                C52711k.m112236a((Object) str, "mEventType");
                C27690a.m66356a(aid, awemeType, a, false, 0, str, "video_like_list").show(fragmentActivity.getSupportFragmentManager(), "LikeUsersFragment");
                InsBoldTextCommentLikeListView insBoldTextCommentLikeListView = this.f96523a;
                if (insBoldTextCommentLikeListView.f83153e != null) {
                    Aweme aweme3 = insBoldTextCommentLikeListView.f83153e;
                    C52711k.m112236a((Object) aweme3, "mAweme");
                    String aid2 = aweme3.getAid();
                    Aweme aweme4 = insBoldTextCommentLikeListView.f83153e;
                    C52711k.m112236a((Object) aweme4, "mAweme");
                    C27688a.m66334a(insBoldTextCommentLikeListView.f83154f, aweme4.getAuthorUid(), aid2, C23198ae.m56887w(insBoldTextCommentLikeListView.f83153e));
                }
            }
        }
    }

    public InsBoldTextCommentLikeListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public InsBoldTextCommentLikeListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private final void m84732a(SpannableStringBuilder spannableStringBuilder, int i) {
        spannableStringBuilder.setSpan(new BoldTextForegroundSpan(C0726c.m2098c(getContext(), R.color.a15)), i, spannableStringBuilder.toString().length(), 17);
    }

    public InsBoldTextCommentLikeListView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo51821a(List<? extends User> list, long j, Aweme aweme) {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        List<? extends User> list2 = list;
        long j2 = j;
        this.f83152d = list2;
        this.f83153e = aweme;
        mo51820a();
        OnClickListener dVar = new C37907d(this);
        this.mHeadViews.setOnClickListener(dVar);
        this.mTvContent.setOnClickListener(dVar);
        if (this.f83157i != null) {
            this.f83157i.mo64903a(j2);
        }
        if (j2 <= 0) {
            setVisibility(8);
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        DmtTextView dmtTextView = this.mTvContent;
        C52711k.m112236a((Object) dmtTextView, "mTvContent");
        TextPaint paint = dmtTextView.getPaint();
        DmtTextView dmtTextView2 = this.mTvContent;
        C52711k.m112236a((Object) dmtTextView2, "mTvContent");
        int paddingLeft = dmtTextView2.getPaddingLeft();
        DmtTextView dmtTextView3 = this.mTvContent;
        C52711k.m112236a((Object) dmtTextView3, "mTvContent");
        int paddingRight = dmtTextView3.getPaddingRight();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = 1;
        if (C9376b.m18558a((Collection<T>) list2)) {
            mo64898b();
            spannableStringBuilder.append(getContext().getString(R.string.b4a, new Object[]{C33095b.m76068a(j)}));
            m84732a(spannableStringBuilder, 0);
            DmtTextView dmtTextView4 = this.mTvContent;
            C52711k.m112236a((Object) dmtTextView4, "mTvContent");
            dmtTextView4.setText(spannableStringBuilder);
            return;
        }
        if (list2 == null) {
            C52711k.m112234a();
        }
        if (((long) list.size()) < j2) {
            spannableStringBuilder.append(" ").append(getContext().getString(R.string.b4b, new Object[]{C33095b.m76068a(j)}));
        } else {
            spannableStringBuilder.append(" ").append(getContext().getString(R.string.b4_));
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (list.size() > 3) {
            i = 3;
        } else {
            i = list.size();
        }
        for (int i4 = 0; i4 <= 2; i4++) {
            if (i4 < i) {
                AvatarWithBorderView avatarWithBorderView = this.f83151c[i4];
                if (avatarWithBorderView == null) {
                    C52711k.m112234a();
                }
                C23515d.m57669a((RemoteImageView) avatarWithBorderView, ((User) list2.get(i4)).getAvatarThumb());
                AvatarWithBorderView avatarWithBorderView2 = this.f83151c[i4];
                C52711k.m112236a((Object) avatarWithBorderView2, "mAvatar[i]");
                avatarWithBorderView2.setVisibility(0);
            } else {
                AvatarWithBorderView avatarWithBorderView3 = this.f83151c[i4];
                C52711k.m112236a((Object) avatarWithBorderView3, "mAvatar[i]");
                avatarWithBorderView3.setVisibility(8);
            }
        }
        String str4 = "...";
        StringBuilder sb = new StringBuilder();
        sb.append(spannableStringBuilder.toString());
        sb.append(str4);
        float measureText = paint.measureText(sb.toString());
        float a = ((((float) C9432q.m18670a(getContext())) - C9432q.m18687b(getContext(), 32.0f)) - ((float) paddingLeft)) - ((float) paddingRight);
        for (int i5 = 0; i5 < i; i5++) {
            User user = (User) list2.get(i5);
            if (TextUtils.isEmpty(user.getRemarkName())) {
                str2 = user.getNickname();
            } else {
                str2 = user.getRemarkName();
            }
            spannableStringBuilder2.append(str2);
            if (i5 < i - 1) {
                str3 = "、";
            } else {
                str3 = "";
            }
            spannableStringBuilder2.append(str3);
        }
        if (i > 0) {
            int b = (int) C9432q.m18687b(getContext(), (float) (((i - 1) * 12) + 24));
            spannableStringBuilder2.setSpan(new Standard(b, 0), 0, spannableStringBuilder2.length(), 17);
            i2 = b;
        } else {
            i2 = 0;
        }
        C52711k.m112236a((Object) paint, "paint");
        CharSequence charSequence = spannableStringBuilder2;
        CharSequence charSequence2 = charSequence;
        int a2 = mo51819a(paint, charSequence, 2, (int) a, (int) (a - measureText));
        if (a2 != -1) {
            spannableStringBuilder2.delete(a2, spannableStringBuilder2.length());
            spannableStringBuilder2.append(str4);
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < i) {
            User user2 = (User) list2.get(i6);
            if (TextUtils.isEmpty(user2.getRemarkName())) {
                str = user2.getNickname();
            } else {
                str = user2.getRemarkName();
            }
            int length = str.length() + i7 + i3;
            if (length > spannableStringBuilder2.length()) {
                length = spannableStringBuilder2.length();
            }
            C31823b bVar = new C37905b(this, user2);
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            spannableStringBuilder2.setSpan(new C31824c(user2, bVar, context.getResources().getColor(R.color.jg)), i7, length, 17);
            if (length >= spannableStringBuilder2.length()) {
                break;
            }
            i6++;
            i7 = length;
            i3 = 1;
        }
        int length2 = spannableStringBuilder2.length();
        SpannableStringBuilder append = spannableStringBuilder2.append(spannableStringBuilder);
        C52711k.m112236a((Object) append, "spanBuilder.append(likeStringBuilder)");
        m84732a(append, length2);
        DmtTextView dmtTextView5 = this.mTvContent;
        C52711k.m112236a((Object) dmtTextView5, "mTvContent");
        dmtTextView5.setText(charSequence2);
        if (VERSION.SDK_INT >= 23) {
            DmtTextView dmtTextView6 = this.mTvContent;
            C52711k.m112236a((Object) dmtTextView6, "mTvContent");
            dmtTextView6.setBreakStrategy(0);
        }
        DmtTextView dmtTextView7 = this.mTvContent;
        C52711k.m112236a((Object) dmtTextView7, "mTvContent");
        dmtTextView7.setMovementMethod(C31836d.m74193a(i2));
    }

    public /* synthetic */ InsBoldTextCommentLikeListView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public final int mo51819a(TextPaint textPaint, CharSequence charSequence, int i, int i2, int i3) {
        C52711k.m112240b(textPaint, "tp");
        C52711k.m112240b(charSequence, "cs");
        DynamicLayout dynamicLayout = new DynamicLayout(charSequence, textPaint, i2, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int[] iArr = {-1};
        if (dynamicLayout.getLineCount() >= 2) {
            int lineStart = dynamicLayout.getLineStart(1);
            TextUtils.ellipsize(charSequence.subSequence(lineStart, charSequence.length()), textPaint, (float) i3, TruncateAt.END, false, new C37906c(iArr, lineStart));
        }
        return iArr[0];
    }
}
