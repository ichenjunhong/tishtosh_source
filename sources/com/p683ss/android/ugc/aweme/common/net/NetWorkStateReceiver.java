package com.p683ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.bytedance.common.utility.C9425l.C9426a;
import com.bytedance.common.wschannel.p538f.C9519a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.video.C48114q;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver */
public class NetWorkStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static boolean f70793a;

    /* renamed from: b */
    boolean f70794b;

    /* renamed from: c */
    private C9426a f70795c = C9426a.UNKNOWN;

    public NetWorkStateReceiver() {
        if (C9519a.m18891a(C11010c.m22280a())) {
            this.f70794b = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo54873a() throws Exception {
        C23718g.m58207b().mo49151a(C26921d.m65041a((ConnectivityManager) C11010c.m22280a().getSystemService("connectivity")));
        C9426a a = C23718g.m58207b().mo17067a();
        if (a != this.f70795c) {
            C48114q.m104225a();
        }
        if (this.f70795c != C9426a.UNKNOWN) {
            f70793a = true;
        }
        this.f70795c = a;
        return null;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                C0013i.m18a((Callable<TResult>) new C26919b<TResult>(this), (Executor) C24076h.m58902c()).mo20a((C0011g<TResult, TContinuationResult>) new C26920c<TResult,TContinuationResult>(this), C0013i.f25b);
            } catch (Exception unused) {
            }
        }
    }
}
