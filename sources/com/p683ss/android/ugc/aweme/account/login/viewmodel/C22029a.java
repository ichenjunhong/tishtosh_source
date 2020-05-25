package com.p683ss.android.ugc.aweme.account.login.viewmodel;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.lobby.internal.C12347d;
import com.p683ss.android.ugc.aweme.account.login.C21053aa;
import com.p683ss.android.ugc.aweme.account.login.view.LoginItemView;
import com.p683ss.android.ugc.aweme.account.utils.C22301h;
import com.p683ss.android.ugc.aweme.base.mvvm.impl.C23564b;
import com.p683ss.android.ugc.aweme.base.p1409b.C23476a;
import com.p683ss.android.ugc.aweme.base.p1409b.C23478b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.login.viewmodel.a */
public final class C22029a extends C23564b<LoginItemView> {

    /* renamed from: a */
    public int f59521a;

    /* renamed from: b */
    public OnClickListener f59522b;

    /* renamed from: c */
    public int f59523c;

    /* renamed from: com.ss.android.ugc.aweme.account.login.viewmodel.a$a */
    public static class C22031a {
        /* renamed from: a */
        public static C23476a m54767a(String str) {
            return new C23476a("login", str);
        }

        /* renamed from: a */
        private static boolean m54769a(C21053aa aaVar) {
            if (aaVar == C21053aa.GOOGLE) {
                return C12347d.m24857a().mo23348a("google");
            }
            return true;
        }

        /* renamed from: a */
        public static List<C22029a> m54768a(final C23478b bVar) {
            C21053aa[] a = C22301h.m55191a();
            ArrayList arrayList = new ArrayList(a.length);
            C22029a aVar = null;
            for (C21053aa aaVar : a) {
                if (m54769a(aaVar)) {
                    switch (aaVar) {
                        case FACEBOOK:
                            aVar = new C22029a(R.drawable.cen, new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    bVar.mo45069a(C22031a.m54767a("facebook"));
                                }
                            }, R.string.af1);
                            break;
                        case TWITTER:
                            aVar = new C22029a(R.drawable.ces, new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    bVar.mo45069a(C22031a.m54767a("twitter"));
                                }
                            }, R.string.af8);
                            break;
                        case GOOGLE:
                            aVar = new C22029a(R.drawable.ceo, new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    bVar.mo45069a(C22031a.m54767a("google"));
                                }
                            }, R.string.af2);
                            break;
                        case LINE:
                            aVar = new C22029a(R.drawable.cer, new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    bVar.mo45069a(C22031a.m54767a("line"));
                                }
                            }, R.string.af5);
                            break;
                        case KAKAOTALK:
                            aVar = new C22029a(R.drawable.ceq, new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    bVar.mo45069a(C22031a.m54767a("kakaotalk"));
                                }
                            }, R.string.af4);
                            break;
                        case INSTAGRAM:
                            aVar = new C22029a(R.drawable.cep, new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    bVar.mo45069a(C22031a.m54767a("instagram"));
                                }
                            }, R.string.af3);
                            break;
                        case VK:
                            aVar = new C22029a(R.drawable.cet, new C22038b(bVar), R.string.af9);
                            break;
                    }
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
    }

    public C22029a(int i, OnClickListener onClickListener, int i2) {
        this.f59521a = i;
        this.f59522b = onClickListener;
        this.f59523c = i2;
    }
}
