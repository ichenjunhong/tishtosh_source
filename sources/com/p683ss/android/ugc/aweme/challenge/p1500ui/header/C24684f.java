package com.p683ss.android.ugc.aweme.challenge.p1500ui.header;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47836dy;
import com.ss.android.ugc.trill.R;
import java.util.regex.Matcher;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.f */
public final class C24684f extends ClickableSpan {

    /* renamed from: a */
    private String f65332a;

    /* renamed from: b */
    private String f65333b;

    /* renamed from: c */
    private String f65334c;

    /* renamed from: d */
    private Context f65335d;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(C23723j.m58216a(R.color.su));
    }

    public final void onClick(View view) {
        C26890h.m65011a("click_tag_link", C23089d.m56640a().mo47829a("tag_id", this.f65333b).f61491a);
        Activity g = C11016e.m22312g();
        if (g != null) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(this.f65334c);
            SmartRouter.buildRoute((Context) g, "aweme://ame/webview/").withParam(Uri.parse(this.f65332a)).withParam("show_load_dialog", false).withParam("hide_nav_bar", false).withParam("title", sb.toString()).open();
        }
    }

    private C24684f(Context context, String str, String str2, String str3) {
        this.f65335d = context;
        this.f65332a = str;
        this.f65333b = str2;
        this.f65334c = str3;
    }

    /* renamed from: a */
    public static SpannableString m60189a(Context context, String str, String str2, String str3) {
        SpannableString spannableString = new SpannableString(str);
        Matcher matcher = C47836dy.f120395a.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String charSequence = str.subSequence(start, end).toString();
            if (C19547d.m47842a(charSequence)) {
                spannableString.setSpan(new C24684f(context, charSequence, str2, str3), start, end, 17);
            }
        }
        return spannableString;
    }
}
