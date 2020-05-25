package com.p683ss.android.ugc.aweme.main.page;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack */
public class AwemeChangeCallBack extends C0209x {

    /* renamed from: a */
    private C23275b<Aweme> f93823a = new C23275b<>();

    /* renamed from: com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack$a */
    public interface C36674a {
        /* renamed from: a */
        void mo49729a(Aweme aweme);
    }

    /* renamed from: a */
    public static Aweme m82601a(FragmentActivity fragmentActivity) {
        return (Aweme) m82604b(fragmentActivity).getValue();
    }

    /* renamed from: b */
    private static C23275b<Aweme> m82604b(FragmentActivity fragmentActivity) {
        return ((AwemeChangeCallBack) C0214z.m440a(fragmentActivity).mo359a(AwemeChangeCallBack.class)).f93823a;
    }

    /* renamed from: a */
    public static void m82603a(FragmentActivity fragmentActivity, Aweme aweme) {
        m82604b(fragmentActivity).setValue(aweme);
    }

    /* renamed from: a */
    public static void m82602a(FragmentActivity fragmentActivity, C0184k kVar, final C36674a aVar) {
        m82604b(fragmentActivity).observe(kVar, new C0199s<Aweme>() {
            public final /* synthetic */ void onChanged(Object obj) {
                Aweme aweme = (Aweme) obj;
                if (aVar != null) {
                    aVar.mo49729a(aweme);
                }
            }
        });
    }
}
