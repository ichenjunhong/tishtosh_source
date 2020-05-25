package com.p683ss.android.ugc.aweme.p2377ug.amplify;

import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.amplify.b */
public final class C47427b {

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.b$a */
    public static final class C47428a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C52671b f119658a;

        /* renamed from: b */
        final /* synthetic */ URLSpan f119659b;

        public final void onClick(View view) {
            String str;
            C52711k.m112240b(view, "widget");
            C52671b bVar = this.f119658a;
            URLSpan uRLSpan = this.f119659b;
            if (uRLSpan != null) {
                str = uRLSpan.getURL();
            } else {
                str = null;
            }
            bVar.invoke(str);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C0726c.m2098c(C11010c.m22280a(), R.color.avn));
        }

        public C47428a(C52671b bVar, URLSpan uRLSpan) {
            this.f119658a = bVar;
            this.f119659b = uRLSpan;
        }
    }
}
