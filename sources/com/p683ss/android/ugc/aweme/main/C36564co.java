package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.p1382aq.C23245o;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.co */
final /* synthetic */ class C36564co implements Callable {

    /* renamed from: a */
    private final MainPageFragment f93652a;

    /* renamed from: b */
    private final String f93653b;

    /* renamed from: c */
    private final String f93654c;

    C36564co(MainPageFragment mainPageFragment, String str, String str2) {
        this.f93652a = mainPageFragment;
        this.f93653b = str;
        this.f93654c = str2;
    }

    public final Object call() {
        MainPageFragment mainPageFragment = this.f93652a;
        C23245o c = new C23245o(mainPageFragment.f93509r.f85658l == 0 ? "enter_homepage_follow" : "enter_homepage_hot").mo48116b("click_button_icon").mo48115a(this.f93653b).mo48117c(this.f93654c);
        if (mainPageFragment.mo75554g() != null) {
            c.mo48118e(mainPageFragment.mo75554g());
        }
        c.mo48076e();
        return null;
    }
}
