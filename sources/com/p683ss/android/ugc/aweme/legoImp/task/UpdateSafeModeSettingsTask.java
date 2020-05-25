package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.C52857u;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.UpdateSafeModeSettingsTask */
public final class UpdateSafeModeSettingsTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        if (!C35990q.f92222b.mo74664e()) {
            try {
                Object a = C10193n.m20607a().mo18202a(SafeModeSettings.class, "safe_mode_settings", C10181b.m20511a().mo18175c().getSafeModeSettings(), "com.ss.android.ugc.aweme.legoImp.task.SafeModeSettingModel", SafeModeSettingModel.class);
                if (a != null) {
                    C35990q.f92222b.mo74661a().storeString("setting_model", new C17971f().mo34890b((SafeModeSettingModel) a, SafeModeSettingModel.class));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.legoImp.task.SafeModeSettingModel");
            } catch (Throwable unused) {
            }
        }
    }
}
