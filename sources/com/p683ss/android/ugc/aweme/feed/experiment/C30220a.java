package com.p683ss.android.ugc.aweme.feed.experiment;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.a */
public final class C30220a {

    /* renamed from: a */
    public static final C30220a f78947a = new C30220a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Rect f78948b = new Rect();

    /* renamed from: com.ss.android.ugc.aweme.feed.experiment.a$a */
    public static final class C30221a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f78949a;

        public C30221a(ViewGroup viewGroup) {
            this.f78949a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            StringBuilder sb = new StringBuilder();
            Integer valueOf = Integer.valueOf(this.f78949a.getChildCount());
            if (valueOf.intValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                for (int i = 0; i < intValue; i++) {
                    View childAt = this.f78949a.getChildAt(i);
                    childAt.getGlobalVisibleRect(C30220a.f78948b);
                    StringBuilder sb2 = new StringBuilder("child:");
                    sb2.append(i);
                    sb2.append(",visible:");
                    C52711k.m112236a((Object) childAt, "child");
                    sb2.append(childAt.getVisibility());
                    sb2.append(",rect:");
                    sb2.append(C30220a.f78948b.toShortString());
                    sb.append(sb2.toString());
                }
                String sb3 = sb.toString();
                if (sb3 != null) {
                    return sb3;
                }
            }
            return "no child,print this line";
        }
    }

    private C30220a() {
    }

    /* renamed from: a */
    public final C52860x mo60568a(C52670a<String> aVar) {
        C52711k.m112240b(aVar, "logger");
        return m70955a(3, aVar);
    }

    /* renamed from: b */
    public final C52860x mo60569b(C52670a<String> aVar) {
        C52711k.m112240b(aVar, "logger");
        return m70955a(4, aVar);
    }

    /* renamed from: c */
    public final C52860x mo60570c(C52670a<String> aVar) {
        C52711k.m112240b(aVar, "logger");
        return m70955a(6, aVar);
    }

    /* renamed from: a */
    private static C52860x m70955a(int i, C52670a<String> aVar) {
        String str;
        if (C30224d.m70966a()) {
            String str2 = "BlackScreenIssueLogger";
            try {
                str = (String) aVar.invoke();
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("error:");
                sb.append(th);
                str = sb.toString();
            }
            C32458a.m75141a(i, str2, str);
        }
        return null;
    }
}
