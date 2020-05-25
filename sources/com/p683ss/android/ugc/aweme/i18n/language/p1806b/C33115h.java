package com.p683ss.android.ugc.aweme.i18n.language.p1806b;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.main.C36617e;
import com.p683ss.android.ugc.aweme.main.C36663h;
import com.p683ss.android.ugc.aweme.main.C36664i;
import java.lang.ref.SoftReference;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b.h */
public final class C33115h {

    /* renamed from: a */
    public boolean f85949a;

    /* renamed from: b */
    public boolean f85950b;

    /* renamed from: c */
    public SoftReference<Context> f85951c;

    /* renamed from: d */
    public boolean f85952d;

    /* renamed from: e */
    C33107a f85953e;

    /* renamed from: f */
    private Context f85954f;

    /* renamed from: g */
    private String f85955g;

    /* renamed from: com.ss.android.ugc.aweme.i18n.language.b.h$a */
    static class C33117a {

        /* renamed from: a */
        static final C33115h f85956a = new C33115h();
    }

    /* renamed from: a */
    public static C33115h m76117a() {
        return C33117a.f85956a;
    }

    /* renamed from: b */
    public final void mo70144b() {
        this.f85950b = false;
    }

    /* renamed from: c */
    private boolean m76120c() {
        String[] strArr = {"MY"};
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (TextUtils.equals(str, C35837h.m80980e())) {
                this.f85955g = str;
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r3 == 1) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C33115h() {
        /*
            r4 = this;
            r4.<init>()
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r4.f85954f = r0
            android.content.Context r0 = r4.f85954f
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "en"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x0026
            r0 = 0
            goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x0030
            boolean r3 = r4.m76120c()
            if (r3 == 0) goto L_0x0030
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.journey.s r3 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            boolean r3 = r3.mo74441e()
            if (r3 == 0) goto L_0x003b
            r0 = 0
        L_0x003b:
            r3 = 2
            if (r0 != 0) goto L_0x0042
            com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33121l.m76125b(r3)
            goto L_0x005b
        L_0x0042:
            int r0 = com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33121l.m76123a(r2)
            switch(r0) {
                case 0: goto L_0x004a;
                case 1: goto L_0x005c;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x005b
        L_0x004a:
            java.lang.Boolean r0 = com.p683ss.android.ugc.aweme.feed.C30578o.m71565a()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0055
            r3 = 1
        L_0x0055:
            com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33121l.m76125b(r3)
            if (r3 != r1) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            r4.f85949a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33115h.<init>():void");
    }

    /* renamed from: a */
    private static String[] m76118a(String str) {
        if (!TextUtils.equals(str, "MY")) {
            return null;
        }
        return new String[]{"ms-MY", "zh-Hant-TW", "en"};
    }

    /* renamed from: b */
    private static boolean m76119b(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity instanceof C36663h) {
                Fragment curFragment = ((C36663h) activity).getCurFragment();
                if (curFragment instanceof C36664i) {
                    C23526a c = ((C36664i) curFragment).mo75499c();
                    if ((c instanceof C36617e) && ((C36617e) c).mo63459s().equals("FeedRecommendFragment")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo70143a(Context context) {
        if (this.f85952d) {
            if (context == null && this.f85951c != null) {
                context = (Context) this.f85951c.get();
            }
            if (context != null && !C25945k.m62915f().mo53877a()) {
                String[] a = m76118a(this.f85955g);
                if (this.f85949a && m76119b(context) && this.f85950b && a != null) {
                    C0013i.m18a((Callable<TResult>) new C33118i<TResult>(this, context, a), C0013i.f25b);
                }
            }
        }
    }
}
