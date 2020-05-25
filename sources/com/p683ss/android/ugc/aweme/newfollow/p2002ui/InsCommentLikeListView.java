package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.CommentLikeListView;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.CommentLikeListView.C31824c;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsCommentLikeListView */
public class InsCommentLikeListView extends CommentLikeListView {
    public int getLayoutId() {
        return R.layout.a4h;
    }

    /* renamed from: a */
    public final void mo51820a() {
        for (AvatarWithBorderView borderColor : this.f83151c) {
            borderColor.setBorderColor(R.color.pq);
        }
    }

    public InsCommentLikeListView(Context context) {
        this(context, null);
    }

    public InsCommentLikeListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InsCommentLikeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo77363b(User user, View view, User user2) {
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
            spannableStringBuilder.setSpan(new C31824c(user2, new C37919e(this, user2), getContext().getResources().getColor(R.color.jg)), i5, length, 17);
            i4++;
            i5 = length;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.a15));
        int length2 = spannableStringBuilder.toString().length();
        spannableStringBuilder.append(sb);
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.toString().length(), 33);
        if (i > 0) {
            spannableStringBuilder.setSpan(new Standard((int) C9432q.m18687b(getContext(), (float) (((i - 1) * 12) + 24)), 0), 0, spannableStringBuilder.length(), 17);
        }
        this.mTvContent.setText(spannableStringBuilder);
        this.mTvContent.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
