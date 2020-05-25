package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p179a.C2941a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.dialog.C4220b;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p392l.C7734a;
import java.util.Arrays;
import java.util.List;

@C2941a(mo7578a = 2)
public class InternalServiceInitTask extends C7734a {
    static final /* synthetic */ boolean lambda$run$0$InternalServiceInitTask() {
        return false;
    }

    public List<Integer> preTasks() {
        return Arrays.asList(new Integer[]{Integer.valueOf(1)});
    }

    public void run() {
        C4220b.f11523b = C7700a.f21195a;
        C4514j.m10883j().mo10323d().mo10331c().mo9253a();
        C4514j.m10883j().mo10323d().mo10333e();
        C4139d dVar = (C4139d) C4116c.m10249a(C4139d.class);
        if (dVar != null) {
            dVar.getDnsOptimizer().mo9576a(true);
        }
    }
}
