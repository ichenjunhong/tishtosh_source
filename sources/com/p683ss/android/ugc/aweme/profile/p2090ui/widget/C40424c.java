package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView.C28448a;
import com.p683ss.android.ugc.aweme.p1797h.p1798a.C32939a;
import com.p683ss.android.ugc.aweme.p1797h.p1798a.C32942b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.c */
public final class C40424c {

    /* renamed from: a */
    public static boolean f103204a;

    /* renamed from: b */
    public Context f103205b;

    /* renamed from: c */
    private NoticeView f103206c;

    /* renamed from: a */
    public final void mo82732a() {
        this.f103206c.setVisibility(8);
    }

    public C40424c(NoticeView noticeView, Context context) {
        this.f103206c = noticeView;
        this.f103205b = context;
        C32942b b = C32939a.m75837a().mo69832b();
        if (!C32939a.m75837a().mo69831a(true) || b == null) {
            this.f103206c.setVisibility(8);
            return;
        }
        this.f103206c.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(b.f85609b);
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(this.f103205b.getString(R.string.rm));
        spannableString.setSpan(new ForegroundColorSpan(C0726c.m2098c(this.f103205b, R.color.a10)), 0, spannableString.length(), 33);
        spannableStringBuilder.append(spannableString);
        this.f103206c.setTitleText((CharSequence) spannableStringBuilder);
        this.f103206c.setOnInternalClickListener(new C28448a() {
            /* renamed from: b */
            public final void mo51946b() {
                C40424c.this.mo82732a();
            }

            /* renamed from: a */
            public final void mo51945a() {
                if (C40424c.this.f103205b != null) {
                    C26890h.m65011a("bond_phone_alert_bond", C23089d.m56640a().mo47829a("notify_type", "personal_home").f61491a);
                    C20854a.m53165e().bindMobile((Activity) C40424c.this.f103205b, "personal_home", null, null);
                    C40424c.this.mo82732a();
                }
            }
        });
    }
}
