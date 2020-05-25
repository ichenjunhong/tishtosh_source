package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p821a.C12566k;
import com.bytedance.polaris.p821a.C12566k.C12568a;
import com.bytedance.polaris.p821a.C12569l;
import com.bytedance.polaris.p821a.C12570m;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.money.growth.C37164d.C37165a;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.C47480c.C47481a;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.PolarisDependImpl.C47474a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PolarisInitTask */
public class PolarisInitTask implements LegoTask {
    private static volatile boolean sIsPolarisInit;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public static boolean isPolarisInit() {
        if (!C12563i.f32950h || !sIsPolarisInit) {
            return false;
        }
        return true;
    }

    public static synchronized void ensuareInit() {
        synchronized (PolarisInitTask.class) {
            if (!isPolarisInit()) {
                new PolarisInitTask().run(C11010c.m22280a());
            }
        }
    }

    public void run(Context context) {
        if (!isPolarisInit() && C37165a.m83405b().mo76489b()) {
            C12568a aVar = new C12568a((Application) C11010c.m22280a());
            aVar.f32961b = C47474a.m102871a();
            aVar.f32962c = C47474a.m102871a();
            aVar.f32963d = C47481a.m102878a();
            aVar.f32965f = C12569l.f32968b;
            C12566k.m25234a(aVar.f32960a, "context");
            C12566k.m25234a(aVar.f32961b, "foundationDepend");
            C12566k.m25234a(aVar.f32962c, "businessDepend");
            C12566k.m25234a(aVar.f32963d, "shareDepend");
            C12566k.m25234a(aVar.f32965f, "urlConfig");
            C12566k kVar = new C12566k(aVar.f32960a, aVar.f32961b, aVar.f32962c, aVar.f32963d, aVar.f32964e, aVar.f32966g, aVar.f32965f);
            C12566k.m25234a(kVar, "config");
            C12563i.f32950h = true;
            C12563i.f32943a = kVar.f32957e;
            C12563i.f32944b = kVar.f32956d;
            C12563i.f32945c = kVar.f32953a;
            C12563i.f32946d = kVar.f32954b;
            C12563i.f32949g = kVar.f32959g;
            C12563i.f32947e = kVar.f32955c;
            C12563i.f32948f = kVar.f32958f;
            if (C12563i.f32947e == null || C12563i.f32947e.mo23622a() > 0) {
                C12563i.f32943a.registerActivityLifecycleCallbacks(C12563i.f32952j);
                C12563i.m25229k();
                sIsPolarisInit = true;
                return;
            }
            throw new C12570m("polaris-reactnative versionCode mismatch");
        }
    }
}
