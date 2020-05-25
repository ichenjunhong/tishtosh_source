package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.setting.C4098q;
import com.google.gson.C18091u;
import com.google.gson.p1076a.C17952c;

public class Game {
    @C17952c(mo34828a = "game_id")
    public long gameId;
    @C17952c(mo34828a = "icon")
    public ImageModel icon;
    @C17952c(mo34828a = "name")
    public String name;

    public String toJsonString() {
        if (C4098q.m10222c() != null) {
            return C4098q.m10222c().mo34889b(this);
        }
        return C2942b.m8369a().mo34889b(this);
    }

    public static Game fromJson(String str) {
        try {
            if (C4098q.m10222c() != null) {
                return (Game) C4098q.m10222c().mo34884a(str, Game.class);
            }
            return (Game) C2942b.m8369a().mo34884a(str, Game.class);
        } catch (C18091u unused) {
            return null;
        }
    }
}
