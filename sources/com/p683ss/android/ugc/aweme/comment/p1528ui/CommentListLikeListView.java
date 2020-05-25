package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
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
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.comment.api.C25139b;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.digg.C27689c.C27690a;
import com.p683ss.android.ugc.aweme.digg.p1634b.C27688a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.C31836d;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.CommentLikeListView;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.CommentLikeListView.C31823b;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView */
public final class CommentListLikeListView extends CommentLikeListView {

    /* renamed from: b */
    public static final C25299a f66917b = new C25299a(null);

    /* renamed from: a */
    public int f66918a;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView$a */
    public static final class C25299a {
        private C25299a() {
        }

        public /* synthetic */ C25299a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView$b */
    public final class C25300b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ CommentListLikeListView f66919a;

        /* renamed from: b */
        private final User f66920b;

        /* renamed from: c */
        private final int f66921c;

        /* renamed from: d */
        private final C31823b f66922d;

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.f66921c);
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            if (!C32800a.m75679a(view)) {
                C31823b bVar = this.f66922d;
                if (bVar != null) {
                    bVar.mo51826a(view, this.f66920b);
                }
            }
        }

        public C25300b(CommentListLikeListView commentListLikeListView, User user, int i, C31823b bVar) {
            C52711k.m112240b(user, "mUser");
            this.f66919a = commentListLikeListView;
            this.f66920b = user;
            this.f66921c = i;
            this.f66922d = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView$c */
    static final class C25301c implements C31823b {

        /* renamed from: a */
        final /* synthetic */ CommentListLikeListView f66923a;

        /* renamed from: b */
        final /* synthetic */ User f66924b;

        C25301c(CommentListLikeListView commentListLikeListView, User user) {
            this.f66923a = commentListLikeListView;
            this.f66924b = user;
        }

        /* renamed from: a */
        public final void mo51826a(View view, User user) {
            String str;
            if (C24678b.m60182a(this.f66924b.getUid())) {
                Aweme aweme = this.f66923a.f83153e;
                C52711k.m112236a((Object) aweme, "mAweme");
                SmartRouter.buildRoute(this.f66923a.getContext(), "aweme://user/profile/").withParam("uid", this.f66924b.getUid()).withParam("enter_from_request_id", aweme.getRequestId()).withParam("enter_from", this.f66923a.f83154f).withParam("sec_user_id", this.f66924b.getSecUid()).open();
                String str2 = "enter_personal_detail";
                Aweme aweme2 = this.f66923a.f83153e;
                C52711k.m112236a((Object) aweme2, "mAweme");
                Aweme aweme3 = this.f66923a.f83153e;
                C52711k.m112236a((Object) aweme3, "mAweme");
                C23089d a = C23089d.m56640a().mo47829a("group_id", aweme2.getAid()).mo47829a("to_user_id", this.f66924b.getUid()).mo47829a("enter_from", this.f66923a.f83154f).mo47829a("author_id", aweme3.getAuthorUid()).mo47829a("enter_method", "click_like_name");
                String str3 = "relation_type";
                if (C47915gg.m103663l(this.f66924b)) {
                    str = "follow";
                } else {
                    str = "unfollow";
                }
                C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(this.f66923a.f83153e))).mo47829a("video_type", C23198ae.m56886v(this.f66923a.f83153e)).mo47829a("rec_uid", C23198ae.m56887w(this.f66923a.f83153e)).f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView$d */
    static final class C25302d implements EllipsizeCallback {

        /* renamed from: a */
        final /* synthetic */ int[] f66925a;

        /* renamed from: b */
        final /* synthetic */ int f66926b;

        C25302d(int[] iArr, int i) {
            this.f66925a = iArr;
            this.f66926b = i;
        }

        public final void ellipsized(int i, int i2) {
            if (i2 - i <= 0) {
                this.f66925a[0] = -1;
            } else {
                this.f66925a[0] = this.f66926b + i;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView$e */
    static final class C25303e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentListLikeListView f66927a;

        C25303e(CommentListLikeListView commentListLikeListView) {
            this.f66927a = commentListLikeListView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Activity g = C11016e.m22312g();
            if (!(g instanceof FragmentActivity)) {
                g = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) g;
            if (fragmentActivity != null) {
                Aweme aweme = this.f66927a.f83153e;
                C52711k.m112236a((Object) aweme, "mAweme");
                String aid = aweme.getAid();
                Aweme aweme2 = this.f66927a.f83153e;
                C52711k.m112236a((Object) aweme2, "mAweme");
                int awemeType = aweme2.getAwemeType();
                String a = C47760cd.m103385a(this.f66927a.f83152d);
                int i = this.f66927a.f66918a;
                String str = this.f66927a.f83154f;
                C52711k.m112236a((Object) str, "mEventType");
                C27690a.m66356a(aid, awemeType, a, true, i, str, "video_like_list").show(fragmentActivity.getSupportFragmentManager(), "LikeUsersFragment");
                CommentListLikeListView commentListLikeListView = this.f66927a;
                if (commentListLikeListView.f83153e != null) {
                    Aweme aweme3 = commentListLikeListView.f83153e;
                    C52711k.m112236a((Object) aweme3, "mAweme");
                    String aid2 = aweme3.getAid();
                    Aweme aweme4 = commentListLikeListView.f83153e;
                    C52711k.m112236a((Object) aweme4, "mAweme");
                    C27688a.m66334a(commentListLikeListView.f83154f, aweme4.getAuthorUid(), aid2, C23198ae.m56887w(commentListLikeListView.f83153e));
                }
            }
        }
    }

    public CommentListLikeListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentListLikeListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getLayoutId() {
        return R.layout.bjl;
    }

    private final float getAvatarSize() {
        boolean z;
        Collection collection = this.f83152d;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f83152d.size() != 1) {
            return getResources().getDimension(R.dimen.yf);
        }
        return getResources().getDimension(R.dimen.yb);
    }

    /* renamed from: a */
    public final void mo51820a() {
        AvatarWithBorderView[] avatarWithBorderViewArr;
        int i;
        for (AvatarWithBorderView avatarWithBorderView : this.f83151c) {
            C52711k.m112236a((Object) avatarWithBorderView, "avatarWithBorderView");
            LayoutParams layoutParams = avatarWithBorderView.getLayoutParams();
            int avatarSize = (int) getAvatarSize();
            layoutParams.width = avatarSize;
            layoutParams.height = avatarSize;
            avatarWithBorderView.setLayoutParams(layoutParams);
            if (m74155c()) {
                i = R.color.dj;
            } else {
                i = R.color.aso;
            }
            avatarWithBorderView.setBorderColor(i);
            avatarWithBorderView.setBorderWidth(2);
        }
    }

    public final void setLikeUsersDialogHeight(int i) {
        this.f66918a = i;
    }

    /* renamed from: a */
    private final void m61548a(SpannableStringBuilder spannableStringBuilder, int i) {
        int i2;
        if (m74155c()) {
            C25139b provideCommentBlackModeColorHelper = C25280a.m61493a().provideCommentBlackModeColorHelper();
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            i2 = provideCommentBlackModeColorHelper.mo51197a(context);
        } else {
            i2 = C0726c.m2098c(getContext(), R.color.aoi);
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i2), i, spannableStringBuilder.toString().length(), 33);
    }

    public CommentListLikeListView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo51821a(List<? extends User> list, long j, Aweme aweme) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        String str2;
        String str3;
        int i5;
        List<? extends User> list2 = list;
        long j2 = j;
        this.f83152d = list2;
        this.f83153e = aweme;
        if (m74155c()) {
            i = R.color.a1l;
        } else {
            i = R.color.aoi;
        }
        DmtTextView dmtTextView = this.mTvContent;
        if (dmtTextView != null) {
            dmtTextView.setTextColor(C0726c.m2098c(getContext(), i));
        }
        mo51820a();
        if (C9376b.m18558a((Collection<T>) this.f83152d)) {
            Context context = getContext();
            if (m74155c()) {
                i5 = R.drawable.d1w;
            } else {
                i5 = R.drawable.d1v;
            }
            Drawable a = C0726c.m2091a(context, i5);
            if (a != null) {
                a.setBounds(0, 0, a.getMinimumWidth(), a.getMinimumHeight());
            }
            this.mTvContent.setCompoundDrawables(a, null, null, null);
            DmtTextView dmtTextView2 = this.mTvContent;
            C52711k.m112236a((Object) dmtTextView2, "mTvContent");
            dmtTextView2.setCompoundDrawablePadding((int) C9432q.m18687b(getContext(), 14.0f));
            ViewGroup viewGroup = this.mHeadViews;
            C52711k.m112236a((Object) viewGroup, "mHeadViews");
            viewGroup.setVisibility(8);
        } else {
            this.mTvContent.setCompoundDrawables(null, null, null, null);
            DmtTextView dmtTextView3 = this.mTvContent;
            C52711k.m112236a((Object) dmtTextView3, "mTvContent");
            dmtTextView3.setCompoundDrawablePadding(0);
            ViewGroup viewGroup2 = this.mHeadViews;
            C52711k.m112236a((Object) viewGroup2, "mHeadViews");
            viewGroup2.setVisibility(0);
        }
        OnClickListener eVar = new C25303e(this);
        setBackgroundResource(R.drawable.ik);
        this.mTvContent.setOnClickListener(eVar);
        setOnClickListener(eVar);
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
        DmtTextView dmtTextView4 = this.mTvContent;
        C52711k.m112236a((Object) dmtTextView4, "mTvContent");
        TextPaint paint = dmtTextView4.getPaint();
        DmtTextView dmtTextView5 = this.mTvContent;
        C52711k.m112236a((Object) dmtTextView5, "mTvContent");
        int paddingLeft = dmtTextView5.getPaddingLeft();
        DmtTextView dmtTextView6 = this.mTvContent;
        C52711k.m112236a((Object) dmtTextView6, "mTvContent");
        int paddingRight = dmtTextView6.getPaddingRight();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (C9376b.m18558a((Collection<T>) list2)) {
            mo64898b();
            spannableStringBuilder.append(getContext().getString(R.string.b4a, new Object[]{C33095b.m76068a(j)}));
            m61548a(spannableStringBuilder, 0);
            DmtTextView dmtTextView7 = this.mTvContent;
            C52711k.m112236a((Object) dmtTextView7, "mTvContent");
            dmtTextView7.setText(spannableStringBuilder);
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
            i2 = 3;
        } else {
            i2 = list.size();
        }
        for (int i6 = 0; i6 < 2; i6++) {
            if (i6 < i2) {
                C23515d.m57669a((RemoteImageView) this.f83151c[i6], ((User) list2.get(i6)).getAvatarThumb());
                AvatarWithBorderView avatarWithBorderView = this.f83151c[i6];
                C52711k.m112236a((Object) avatarWithBorderView, "mAvatar[i]");
                avatarWithBorderView.setVisibility(0);
            } else {
                AvatarWithBorderView avatarWithBorderView2 = this.f83151c[i6];
                C52711k.m112236a((Object) avatarWithBorderView2, "mAvatar[i]");
                avatarWithBorderView2.setVisibility(8);
            }
        }
        String str4 = "...";
        StringBuilder sb = new StringBuilder();
        sb.append(spannableStringBuilder.toString());
        sb.append(str4);
        float measureText = paint.measureText(sb.toString());
        float a2 = (float) C9432q.m18670a(getContext());
        Context context2 = getContext();
        C52711k.m112236a((Object) context2, "context");
        Resources resources = context2.getResources();
        float dimension = resources.getDimension(R.dimen.yg);
        resources.getDimension(R.dimen.yc);
        resources.getDimension(R.dimen.ye);
        if (i2 > 0) {
            dimension += (float) ((int) (getAvatarSize() + (((float) (i2 - 1)) * resources.getDimension(R.dimen.yd))));
        }
        float f = ((a2 - dimension) - ((float) paddingLeft)) - ((float) paddingRight);
        for (int i7 = 0; i7 < i2; i7++) {
            User user = (User) list2.get(i7);
            if (TextUtils.isEmpty(user.getRemarkName())) {
                str2 = user.getNickname();
            } else {
                str2 = user.getRemarkName();
            }
            spannableStringBuilder2.append(str2);
            if (i7 < i2 - 1) {
                str3 = "、";
            } else {
                str3 = "";
            }
            spannableStringBuilder2.append(str3);
        }
        C52711k.m112236a((Object) paint, "paint");
        CharSequence charSequence = spannableStringBuilder2;
        int a3 = mo51819a(paint, charSequence, 2, (int) f, (int) (f - measureText));
        if (a3 != -1) {
            spannableStringBuilder2.delete(a3, spannableStringBuilder2.length());
            spannableStringBuilder2.append(str4);
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < i2) {
            User user2 = (User) list2.get(i8);
            if (TextUtils.isEmpty(user2.getRemarkName())) {
                str = user2.getNickname();
            } else {
                str = user2.getRemarkName();
            }
            int length = str.length() + i9 + 1;
            if (length > spannableStringBuilder2.length()) {
                length = spannableStringBuilder2.length();
            }
            Context context3 = getContext();
            if (m74155c()) {
                i4 = R.color.a1l;
            } else {
                i4 = R.color.aoi;
            }
            spannableStringBuilder2.setSpan(new C25300b(this, user2, C0726c.m2098c(context3, i4), new C25301c(this, user2)), i9, length, 17);
            if (length >= spannableStringBuilder2.length()) {
                break;
            }
            i8++;
            i9 = length;
        }
        int length2 = spannableStringBuilder2.toString().length();
        SpannableStringBuilder append = spannableStringBuilder2.append(spannableStringBuilder);
        C52711k.m112236a((Object) append, "spanBuilder.append(likeStringBuilder)");
        m61548a(append, length2);
        DmtTextView dmtTextView8 = this.mTvContent;
        C52711k.m112236a((Object) dmtTextView8, "mTvContent");
        dmtTextView8.setText(charSequence);
        if (VERSION.SDK_INT >= 23) {
            DmtTextView dmtTextView9 = this.mTvContent;
            C52711k.m112236a((Object) dmtTextView9, "mTvContent");
            i3 = 0;
            dmtTextView9.setBreakStrategy(0);
        } else {
            i3 = 0;
        }
        DmtTextView dmtTextView10 = this.mTvContent;
        C52711k.m112236a((Object) dmtTextView10, "mTvContent");
        dmtTextView10.setMovementMethod(C31836d.m74193a(i3));
    }

    public /* synthetic */ CommentListLikeListView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
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
            TextUtils.ellipsize(charSequence.subSequence(lineStart, charSequence.length()), textPaint, (float) i3, TruncateAt.END, false, new C25302d(iArr, lineStart));
        }
        return iArr[0];
    }
}
