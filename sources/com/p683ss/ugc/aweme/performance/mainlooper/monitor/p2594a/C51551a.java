package com.p683ss.ugc.aweme.performance.mainlooper.monitor.p2594a;

import android.app.Activity;
import android.view.View;
import com.p683ss.android.ugc.aweme.p1397az.p1399b.C23336a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51534c;
import com.p683ss.ugc.aweme.performance.core.monitor.p2589c.C51536a;
import com.p683ss.ugc.aweme.performance.mainlooper.monitor.work.C51552a;
import com.p683ss.ugc.aweme.performance.mainlooper.monitor.work.C51552a.C51553a;
import com.p683ss.ugc.aweme.performance.mainlooper.p2593a.C51550a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.a.a */
public final class C51551a implements Runnable {

    /* renamed from: a */
    public String f128768a;

    /* renamed from: b */
    public String f128769b;

    public C51551a() {
        this(null, 1, null);
    }

    public final void run() {
        C51552a a = C51553a.m110681a();
        String str = this.f128769b;
        C52711k.m112240b(str, "jankName");
        C51534c cVar = (C51534c) a.f128752a.get(str);
        if (cVar == null) {
            C51550a.f128765a.mo103732a(this);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (C51553a.m110681a().f128755d) {
            Activity activity = (Activity) C51536a.f128745a.get();
            if (activity != null) {
                sb.append("\nlayer info : \n");
                View decorView = activity.getWindow().getDecorView();
                C52711k.m112236a((Object) decorView, "activity.getWindow().getDecorView()");
                C52711k.m112240b(decorView, "view");
                sb.append(null);
                sb.append("\n");
            }
            synchronized (C23336a.f62340a) {
                for (String str2 : C23336a.m57394a()) {
                    sb.append("绘制泄漏stack：\n");
                    sb.append(str2);
                    sb.append("\n");
                }
                C23336a.m57394a().clear();
            }
            String sb2 = sb.toString();
            C52711k.m112236a((Object) sb2, "sb.toString()");
            cVar.f128738g = sb2;
        }
        C51550a.f128765a.mo103732a(this);
    }

    private C51551a(String str) {
        C52711k.m112240b(str, "jankName");
        this.f128769b = str;
        this.f128768a = "";
    }

    public /* synthetic */ C51551a(String str, int i, C52707g gVar) {
        this("");
    }
}
