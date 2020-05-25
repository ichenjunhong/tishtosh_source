package com.p683ss.android.ugc.aweme.main;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.db */
final /* synthetic */ class C36579db implements Callable {

    /* renamed from: a */
    private final MainPageFragment f93671a;

    /* renamed from: b */
    private final String f93672b;

    /* renamed from: c */
    private final String f93673c;

    /* renamed from: d */
    private final String f93674d;

    C36579db(MainPageFragment mainPageFragment, String str, String str2, String str3) {
        this.f93671a = mainPageFragment;
        this.f93672b = str;
        this.f93673c = str2;
        this.f93674d = str3;
    }

    public final Object call() {
        return this.f93671a.mo75538a(this.f93672b, this.f93673c, this.f93674d);
    }
}
