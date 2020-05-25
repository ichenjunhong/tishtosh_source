package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.C23829bj;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.util.ArrayList;
import org.greenrobot.eventbus.C53759d;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InstallEventBus */
public class InstallEventBus implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        try {
            C53759d dVar = new C53759d();
            C23829bj bjVar = new C23829bj();
            if (dVar.f133346j == null) {
                dVar.f133346j = new ArrayList();
            }
            dVar.f133346j.add(bjVar);
            dVar.f133345i = C0013i.f24a;
            dVar.mo112966b();
        } catch (Exception unused) {
        }
    }
}
