package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.p621b.p622a.C10201a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.requestcombine.C41211a;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41256f;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41257g;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41258h;
import com.p683ss.android.ugc.aweme.requesttask.p2116a.C41238b;
import com.p683ss.android.ugc.aweme.requesttask.p2116a.C41241c;
import com.p683ss.android.ugc.aweme.requesttask.p2117b.C41244b;
import com.p683ss.android.ugc.aweme.requesttask.p2117b.C41245c;
import com.p683ss.android.ugc.aweme.requesttask.p2117b.C41246d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseFetchCombineSettingsTask */
public abstract class BaseFetchCombineSettingsTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public void run(Context context) {
        C52711k.m112240b(context, "context");
        if (C10201a.m20662a(context)) {
            C32458a.m75144a("FetchCombineSettingsTask");
            if (C41211a.f104656d.mo83705b()) {
                C35857a.m81005d().mo74519a(new C41246d()).mo74520a();
                return;
            }
            C35857a.m81005d().mo74519a(new C41245c()).mo74519a(new C41244b()).mo74519a(new C41258h()).mo74519a(new C41241c(1)).mo74519a(new C41238b()).mo74519a(new C41257g()).mo74519a(new C41256f()).mo74520a();
        }
    }
}
