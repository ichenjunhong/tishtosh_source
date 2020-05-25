package com.p683ss.android.ugc.aweme.challenge;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47836dy;
import com.ss.android.ugc.trill.R;
import java.util.regex.Matcher;

/* renamed from: com.ss.android.ugc.aweme.challenge.b */
public final class C24554b extends C24526a {

    /* renamed from: b */
    String f65007b;

    /* renamed from: c */
    String f65008c;

    /* renamed from: d */
    public boolean f65009d;

    /* renamed from: e */
    private boolean f65010e = true;

    /* renamed from: a */
    public final SpannableString mo50296a(SpannableString spannableString) {
        String spannableString2 = spannableString.toString();
        Matcher matcher = C47836dy.f120395a.matcher(spannableString2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            final String charSequence = spannableString2.subSequence(start, end).toString();
            if (C19547d.m47842a(charSequence)) {
                this.f65009d = true;
                spannableString.setSpan(new StyleSpan(0), start, end, 17);
                spannableString.setSpan(new C22313c(C23723j.m58216a(R.color.su), C23723j.m58216a(R.color.up)) {
                    public final void onClick(View view) {
                        C24554b bVar = C24554b.this;
                        String str = charSequence;
                        C26890h.m65011a("click_tag_link", C23089d.m56640a().mo47829a("tag_id", bVar.f65007b).f61491a);
                        Activity g = C11016e.m22312g();
                        if (g != null) {
                            StringBuilder sb = new StringBuilder("#");
                            sb.append(bVar.f65008c);
                            SmartRouter.buildRoute((Context) g, "aweme://ame/webview/").withParam(Uri.parse(str)).withParam("show_load_dialog", false).withParam("hide_nav_bar", false).withParam("title", sb.toString()).open();
                        }
                    }
                }, start, end, 17);
            }
        }
        if (this.f65010e) {
            return this.f64945a.mo50296a(spannableString);
        }
        return spannableString;
    }

    public C24554b(String str, String str2, boolean z) {
        this.f65008c = str2;
        this.f65007b = str;
    }
}
