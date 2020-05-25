package com.bytedance.android.livesdk.player;

import android.content.Context;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.player.p405b.C8078a;

/* renamed from: com.bytedance.android.livesdk.player.j */
public final class C8096j implements C8085f {
    /* renamed from: a */
    public final C8086g mo14242a(Context context, C8078a aVar) throws Exception {
        C8115x xVar = new C8115x(context);
        xVar.f22166b = false;
        xVar.f22169e = aVar;
        if (((Boolean) LiveSettingKeys.ENABLE_SINGLE_LOOPER_PLAYER_PULL_STREAM.mo9431a()).booleanValue()) {
            return new C8112v(xVar);
        }
        return new C8111u(xVar);
    }
}
