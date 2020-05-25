package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.cz */
final /* synthetic */ class C36575cz implements Callable {

    /* renamed from: a */
    private final String f93665a;

    /* renamed from: b */
    private final String f93666b;

    /* renamed from: c */
    private final String f93667c;

    /* renamed from: d */
    private final String f93668d;

    C36575cz(String str, String str2, String str3, String str4) {
        this.f93665a = str;
        this.f93666b = str2;
        this.f93667c = str3;
        this.f93668d = str4;
    }

    public final Object call() {
        return C26890h.m65011a(this.f93665a, C23089d.m56640a().mo47829a("previous_page", "homepage_hot").mo47829a("enter_method", this.f93666b).mo47829a("group_id", this.f93667c).mo47829a("author_id", this.f93668d).f61491a);
    }
}
