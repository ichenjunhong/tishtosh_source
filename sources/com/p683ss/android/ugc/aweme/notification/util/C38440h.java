package com.p683ss.android.ugc.aweme.notification.util;

import android.text.TextPaint;
import android.view.View;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38349a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.util.h */
public final class C38440h extends C22313c {

    /* renamed from: a */
    public static final C38441a f97837a = new C38441a(null);

    /* renamed from: b */
    private final User f97838b;

    /* renamed from: c */
    private final int f97839c;

    /* renamed from: e */
    private final C38349a f97840e;

    /* renamed from: com.ss.android.ugc.aweme.notification.util.h$a */
    public static final class C38441a {
        private C38441a() {
        }

        public /* synthetic */ C38441a(C52707g gVar) {
            this();
        }
    }

    public final void onClick(View view) {
        C52711k.m112240b(view, "widget");
        this.f97840e.mo78294a(view, this.f97838b, this.f97839c);
    }

    public final void updateDrawState(TextPaint textPaint) {
        C52711k.m112240b(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    public C38440h(User user, int i, int i2, int i3, C38349a aVar) {
        C52711k.m112240b(aVar, "callBack");
        super(i2, i3);
        this.f97838b = user;
        this.f97839c = i;
        this.f97840e = aVar;
    }
}
