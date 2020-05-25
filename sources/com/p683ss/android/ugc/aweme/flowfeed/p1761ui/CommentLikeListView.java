package com.p683ss.android.ugc.aweme.flowfeed.p1761ui;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.CommentLikeListView */
public class CommentLikeListView extends FrameLayout {

    /* renamed from: c */
    protected AvatarWithBorderView[] f83151c;

    /* renamed from: d */
    public List<User> f83152d;

    /* renamed from: e */
    public Aweme f83153e;

    /* renamed from: f */
    public String f83154f;

    /* renamed from: g */
    protected String f83155g;

    /* renamed from: h */
    protected String f83156h;

    /* renamed from: i */
    protected C31822a f83157i;
    protected ViewGroup mHeadViews;
    protected ViewGroup mLikeListLayout;
    protected DmtTextView mTvContent;

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.CommentLikeListView$a */
    public interface C31822a {
        /* renamed from: a */
        void mo64903a(long j);
    }

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.CommentLikeListView$b */
    public interface C31823b {
        /* renamed from: a */
        void mo51826a(View view, User user);
    }

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.CommentLikeListView$c */
    public class C31824c extends ClickableSpan {

        /* renamed from: b */
        private User f83159b;

        /* renamed from: c */
        private C31823b f83160c;

        /* renamed from: d */
        private int f83161d;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f83161d);
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public final void onClick(View view) {
            if (!C32800a.m75679a(view) && this.f83160c != null) {
                this.f83160c.mo51826a(view, this.f83159b);
            }
        }

        public C31824c(User user, C31823b bVar, int i) {
            this.f83159b = user;
            this.f83160c = bVar;
            this.f83161d = i;
        }
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return R.layout.b_v;
    }

    /* renamed from: c */
    protected static boolean m74155c() {
        return C25280a.m61493a().isBlackMode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51820a() {
        for (AvatarWithBorderView borderColor : this.f83151c) {
            borderColor.setBorderColor(R.color.aso);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo64898b() {
        for (int i = 0; i < 3; i++) {
            this.f83151c[i].setVisibility(8);
        }
    }

    public void setAuthorId(String str) {
        this.f83156h = str;
    }

    public void setAwemeId(String str) {
        this.f83155g = str;
    }

    public void setDiggCountCallback(C31822a aVar) {
        this.f83157i = aVar;
    }

    public void setEventType(String str) {
        this.f83154f = str;
    }

    public CommentLikeListView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo64896a(long j) {
        mo51821a(this.f83152d, j, this.f83153e);
    }

    public CommentLikeListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommentLikeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f83151c = new AvatarWithBorderView[3];
        View inflate = LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        ButterKnife.bind((Object) this, inflate);
        this.mTvContent.setHighlightColor(C0726c.m2098c(context, 17170445));
        this.f83151c[0] = (AvatarWithBorderView) inflate.findViewById(R.id.bag);
        this.f83151c[1] = (AvatarWithBorderView) inflate.findViewById(R.id.bah);
        this.f83151c[2] = (AvatarWithBorderView) inflate.findViewById(R.id.bai);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64897a(User user, View view, User user2) {
        if (user.getUid() != null) {
            C41302w a = C41302w.m91042a();
            Activity activity = (Activity) getContext();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(user.getUid());
            a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("enter_from", "homepage_follow").mo83870a("sec_user_id", user.getSecUid()).mo83871a());
            C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("group_id", this.f83155g).mo47829a("enter_from", this.f83154f).mo47829a("to_user_id", user.getUid()).mo47829a("author_id", this.f83156h).mo47829a("enter_method", "click_like_name").f61491a);
        }
    }

    /* renamed from: a */
    public void mo51821a(List<User> list, long j, Aweme aweme) {
        int i;
        String str;
        String str2;
        String str3;
        this.f83152d = list;
        this.f83153e = aweme;
        mo51820a();
        if (this.f83157i != null) {
            this.f83157i.mo64903a(j);
        }
        if (j <= 0) {
            setVisibility(8);
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        StringBuilder sb = new StringBuilder();
        if (C9376b.m18558a((Collection<T>) list)) {
            mo64898b();
            sb.append(getContext().getString(R.string.b4a, new Object[]{C33095b.m76068a(j)}));
            this.mTvContent.setText(sb.toString());
            return;
        }
        if (((long) list.size()) < j) {
            sb.append(" ");
            sb.append(getContext().getString(R.string.b4b, new Object[]{C33095b.m76068a(j)}));
        } else {
            sb.append(" ");
            sb.append(getContext().getString(R.string.b4_));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (list.size() > 3) {
            i = 3;
        } else {
            i = list.size();
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 < i) {
                this.f83151c[i2].setVisibility(0);
                C23515d.m57669a((RemoteImageView) this.f83151c[i2], ((User) list.get(i2)).getAvatarThumb());
            } else {
                this.f83151c[i2].setVisibility(8);
            }
        }
        TextPaint paint = this.mTvContent.getPaint();
        float measureText = paint.measureText(sb.toString()) + (paint.getTextSize() * 3.0f);
        int a = (int) ((((((float) C9432q.m18670a(getContext())) - C9432q.m18687b(getContext(), 56.0f)) - ((float) this.mTvContent.getPaddingLeft())) - ((float) this.mTvContent.getPaddingRight())) - measureText);
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < i; i3++) {
            User user = (User) list.get(i3);
            if (TextUtils.isEmpty(user.getRemarkName())) {
                str2 = user.getNickname();
            } else {
                str2 = user.getRemarkName();
            }
            sb2.append(str2);
            if (i3 < i - 1) {
                str3 = "、";
            } else {
                str3 = "";
            }
            sb2.append(str3);
        }
        int a2 = mo51819a(paint, sb2.toString(), 2, a, (int) (((float) a) + measureText));
        if (a2 != -1) {
            spannableStringBuilder.append((String) sb2.subSequence(0, a2)).append("...");
        } else {
            spannableStringBuilder.append(sb2.toString());
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            User user2 = (User) list.get(i4);
            if (TextUtils.isEmpty(user2.getRemarkName())) {
                str = user2.getNickname();
            } else {
                str = user2.getRemarkName();
            }
            int length = str.length() + i5 + 2;
            if (length > spannableStringBuilder.length()) {
                length = spannableStringBuilder.length();
            }
            spannableStringBuilder.setSpan(new C31824c(user2, new C31833a(this, user2), getContext().getResources().getColor(R.color.jg)), i5, length, 17);
            i4++;
            i5 = length;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.bv));
        int length2 = spannableStringBuilder.toString().length();
        spannableStringBuilder.append(sb);
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.toString().length(), 33);
        if (i > 0) {
            spannableStringBuilder.setSpan(new Standard((int) C9432q.m18687b(getContext(), (float) (((i - 1) * 12) + 24)), 0), 0, spannableStringBuilder.length(), 17);
        }
        this.mTvContent.setText(spannableStringBuilder);
        this.mTvContent.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo51819a(TextPaint textPaint, CharSequence charSequence, int i, int i2, int i3) {
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i3, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int[] iArr = {-1};
        if (staticLayout.getLineCount() >= 2) {
            int lineStart = staticLayout.getLineStart(1);
            TextUtils.ellipsize(charSequence.subSequence(lineStart, charSequence.length()), textPaint, (float) i2, TruncateAt.END, false, new C31834b(iArr, lineStart));
        }
        return iArr[0];
    }
}
