package com.p683ss.android.ugc.trill.abtest.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.main.C36543bx;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.trill.abtest.C50294a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.abtest.impl.a */
public final class C50297a extends C50294a<Boolean> {
    /* renamed from: a */
    public final /* synthetic */ Object mo98200a() {
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public static void m108565a(String str) {
        C26890h.onEvent(MobClick.obtain().setLabelName(str).setEventName("recall_popup"));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo98201a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!C20902b.m53242a().isLogin() && !((Boolean) C23183v.m56778a().mo47928x().mo47782d()).booleanValue() && bool.booleanValue()) {
            final Activity g = C11016e.m22312g();
            if (g != null) {
                new C10643a(g).mo18892a(g.getString(R.string.l1)).mo18903b(g.getString(R.string.bw4), (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (g != null && (g instanceof MainActivity)) {
                            C36543bx mainHelper = ((MainActivity) g).getMainHelper();
                            if (mainHelper != null) {
                                mainHelper.mo75620b();
                            }
                            C50297a.m108565a("cancel");
                        }
                    }
                }).mo18893a(g.getString(R.string.c1u), (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (g != null && (g instanceof MainActivity)) {
                            C27965f.m66719a(g, "recall_popup", "click");
                            C50297a.m108565a("confirm");
                        }
                    }
                }).mo18897a().mo18882b();
                m108565a("show");
                C23183v.m56778a().mo47928x().mo47776a(Boolean.valueOf(true));
                return true;
            }
        }
        return false;
    }
}
