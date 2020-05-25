package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.p1382aq.C23245o;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.dd */
final /* synthetic */ class C36581dd implements Callable {

    /* renamed from: a */
    private final MainPageFragment f93676a;

    /* renamed from: b */
    private final String f93677b;

    C36581dd(MainPageFragment mainPageFragment, String str) {
        this.f93676a = mainPageFragment;
        this.f93677b = str;
    }

    public final Object call() {
        MainPageFragment mainPageFragment = this.f93676a;
        C23245o c = new C23245o("enter_homepage_follow").mo48116b("publish").mo48115a("publish").mo48117c(this.f93677b);
        if (mainPageFragment.mo75554g() != null) {
            c.mo48118e(mainPageFragment.mo75554g());
        }
        c.mo48076e();
        return null;
    }
}
