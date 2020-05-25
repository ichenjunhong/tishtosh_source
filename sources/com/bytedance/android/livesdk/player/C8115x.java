package com.bytedance.android.livesdk.player;

import android.content.Context;
import android.util.SparseIntArray;
import com.bytedance.android.live.core.setting.C4098q;
import com.bytedance.android.live.livepullstream.p250b.C4147d;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.player.p405b.C8078a;
import com.p683ss.p2549c.p2550a.p2551a.p2554b.C51201e;
import com.p683ss.p2568f.p2569a.C51300a;
import com.p683ss.p2568f.p2569a.C51306b;
import com.p683ss.p2568f.p2569a.C51311c;
import com.p683ss.p2568f.p2569a.C51334e;
import com.p683ss.p2568f.p2569a.C51334e.C51340a;

/* renamed from: com.bytedance.android.livesdk.player.x */
public final class C8115x {

    /* renamed from: a */
    final Context f22165a;

    /* renamed from: b */
    boolean f22166b;

    /* renamed from: c */
    boolean f22167c = true;

    /* renamed from: d */
    SparseIntArray f22168d;

    /* renamed from: e */
    C8078a f22169e;

    /* renamed from: f */
    C51334e f22170f;

    /* renamed from: g */
    C8117y f22171g;

    /* renamed from: a */
    public final C51334e mo14301a() {
        int i;
        this.f22171g = new C8117y(this.f22169e);
        C51340a b = C51334e.m110395a(this.f22165a.getApplicationContext()).mo101924b(300000).mo101921a((C51311c) new C8118z()).mo101922a(false).mo101925b(false);
        if (this.f22166b) {
            i = 2;
        } else {
            i = 1;
        }
        this.f22170f = b.mo101918a(i).mo101919a((C51300a) this.f22171g).mo101920a((C51306b) new C51306b() {
            /* renamed from: a */
            public final <T> T mo14302a(String str, T t) {
                return C4098q.m10215a("key_ttlive_sdk_setting", str, t.getClass(), t);
            }
        }).mo101923a();
        if (((Boolean) LiveSettingKeys.PLAYER_ENABLE_UPLOAD_TIME_LINE.mo9431a()).booleanValue()) {
            this.f22170f.mo101880a();
        }
        if (((Integer) LiveSettingKeys.DNS_OPT_METHOD.mo9431a()).intValue() == 1) {
            this.f22170f.mo101886a((C51201e) C4147d.m10295f().mo9530c().mo9574a());
        }
        if (((Boolean) LiveSettingKeys.ENABLE_LIVE_HTTPK_DEGRADE.mo9431a()).booleanValue()) {
            this.f22170f.mo101882a(39, 1);
        }
        return this.f22170f;
    }

    public C8115x(Context context) {
        this.f22165a = context;
        this.f22168d = new SparseIntArray();
    }
}
