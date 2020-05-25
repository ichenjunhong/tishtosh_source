package com.p683ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.C23057c;

/* renamed from: com.ss.android.ugc.aweme.feedback.q */
public final class C31288q extends ClickableSpan {

    /* renamed from: a */
    private String f82021a;

    public C31288q(String str) {
        this.f82021a = str;
    }

    public final void onClick(View view) {
        if (!C9431p.m18664a(this.f82021a)) {
            Uri parse = Uri.parse(this.f82021a);
            Context context = view.getContext();
            if (context != null && parse != null) {
                String scheme = parse.getScheme();
                if (C23057c.f61423a.equals(scheme)) {
                    StringBuilder sb = new StringBuilder(C23057c.f61424b);
                    sb.append(C11010c.m22289j());
                    String sb2 = sb.toString();
                    if (C23057c.f61423a.equals(scheme) || C23057c.f61425c.equals(scheme)) {
                        this.f82021a = this.f82021a.replaceFirst(C23057c.f61423a, sb2);
                    }
                    parse = Uri.parse(this.f82021a);
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.putExtra("com.android.browser.application_id", context.getPackageName());
                    context.startActivity(intent);
                } catch (Exception unused) {
                }
            }
        }
    }
}
