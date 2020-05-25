package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.p1382aq.C23245o;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.bv */
final /* synthetic */ class C36541bv implements Callable {

    /* renamed from: a */
    private final MainFragment f93620a;

    /* renamed from: b */
    private final String f93621b;

    /* renamed from: c */
    private final String f93622c;

    /* renamed from: d */
    private final String f93623d;

    /* renamed from: e */
    private final String f93624e;

    C36541bv(MainFragment mainFragment, String str, String str2, String str3, String str4) {
        this.f93620a = mainFragment;
        this.f93621b = str;
        this.f93622c = str2;
        this.f93623d = str3;
        this.f93624e = str4;
    }

    public final Object call() {
        MainFragment mainFragment = this.f93620a;
        String str = this.f93621b;
        String str2 = this.f93622c;
        String str3 = this.f93623d;
        new C23245o(str).mo48116b(str2).mo48115a(str3).mo48117c(this.f93624e).mo48118e(AwemeChangeCallBack.m82601a(mainFragment.getActivity())).mo48076e();
        return null;
    }
}
