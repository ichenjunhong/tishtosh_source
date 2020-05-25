package com.p683ss.android.ugc.aweme.profile.util;

import android.app.Activity;
import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg;
import com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgHighlight;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ae */
public final class C40530ae extends ClickableSpan {

    /* renamed from: a */
    private final SafeInfoNoticeMsgHighlight f103430a;

    /* renamed from: b */
    private final Activity f103431b;

    /* renamed from: c */
    private final NoticeView f103432c;

    /* renamed from: d */
    private final SafeInfoNoticeMsg f103433d;

    public final void onClick(View view) {
        C52711k.m112240b(view, "widget");
        C40531af.m89937a(this.f103430a.scheme, this.f103431b, this.f103432c, this.f103433d);
    }

    public final void updateDrawState(TextPaint textPaint) {
        C52711k.m112240b(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setColor(C0726c.m2098c(this.f103431b, R.color.a0y));
        textPaint.bgColor = 0;
        textPaint.setUnderlineText(false);
    }

    public C40530ae(SafeInfoNoticeMsgHighlight safeInfoNoticeMsgHighlight, Activity activity, NoticeView noticeView, SafeInfoNoticeMsg safeInfoNoticeMsg) {
        C52711k.m112240b(safeInfoNoticeMsgHighlight, "highlight");
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(noticeView, "noticeBar");
        C52711k.m112240b(safeInfoNoticeMsg, "noticeMsg");
        this.f103430a = safeInfoNoticeMsgHighlight;
        this.f103431b = activity;
        this.f103432c = noticeView;
        this.f103433d = safeInfoNoticeMsg;
    }
}
