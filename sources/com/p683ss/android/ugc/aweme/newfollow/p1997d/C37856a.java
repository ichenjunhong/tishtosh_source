package com.p683ss.android.ugc.aweme.newfollow.p1997d;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.newfollow.p1996c.C37855b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.d.a */
public final class C37856a {

    /* renamed from: a */
    public NoticeView f96369a;

    /* renamed from: b */
    public Context f96370b = this.f96369a.getContext();

    /* renamed from: c */
    public C37855b f96371c;

    /* renamed from: a */
    public final void mo77299a() {
        C35807d.m80935a(this.f96370b, "follow_tab_info", 0).edit().putLong("last_guide_close_time", System.currentTimeMillis()).apply();
    }

    public C37856a(NoticeView noticeView) {
        this.f96369a = noticeView;
        this.f96369a.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f96370b.getText(R.string.b35));
        spannableStringBuilder.append(" \n");
        SpannableString spannableString = new SpannableString(this.f96370b.getString(R.string.b30));
        spannableString.setSpan(new ForegroundColorSpan(C0726c.m2098c(this.f96370b, R.color.a10)), 0, spannableString.length(), 33);
        spannableStringBuilder.append(spannableString);
        this.f96369a.setTitleText((CharSequence) spannableStringBuilder);
    }
}
