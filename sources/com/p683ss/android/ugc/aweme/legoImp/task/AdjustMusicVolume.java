package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.audio.AudioUtils;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume */
public class AdjustMusicVolume implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    static final /* synthetic */ Void lambda$run$0$AdjustMusicVolume(C0013i iVar) throws Exception {
        Context a = C11010c.m22280a();
        float a2 = (float) AudioUtils.m57294a(a);
        int b = AudioUtils.m57297b(a);
        if (!(a2 == -1.0f || b == -1 || ((float) b) / a2 <= 0.2f)) {
            AudioUtils.m57296a(a, (int) (((float) AudioUtils.m57294a(a)) * 0.2f), 16);
        }
        return null;
    }

    public void run(Context context) {
        if (!((Boolean) C23183v.m56778a().mo47927w().mo47782d()).booleanValue()) {
            C0013i.m12a(500).mo19a(C35974a.f92203a);
            C23183v.m56778a().mo47927w().mo47776a(Boolean.valueOf(true));
        }
    }
}
