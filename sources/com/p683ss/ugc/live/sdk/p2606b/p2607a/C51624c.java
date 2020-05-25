package com.p683ss.ugc.live.sdk.p2606b.p2607a;

import android.content.Context;
import android.util.SparseIntArray;
import com.p683ss.ttm.player.TTMediaPlayer;
import com.p683ss.ttm.player.TTPlayerConfiger;
import com.p683ss.ugc.live.sdk.p2606b.C51626b;
import com.p683ss.ugc.live.sdk.p2606b.C51627c;
import org.json.JSONObject;

/* renamed from: com.ss.ugc.live.sdk.b.a.c */
public final class C51624c {

    /* renamed from: a */
    final Context f128935a;

    /* renamed from: b */
    public boolean f128936b;

    /* renamed from: c */
    public C51626b f128937c;

    /* renamed from: d */
    public SparseIntArray f128938d = new SparseIntArray();

    /* renamed from: b */
    private TTMediaPlayer m110832b() {
        TTPlayerConfiger.setValue(2, this.f128936b);
        TTPlayerConfiger.setValue(1, true);
        TTPlayerConfiger.setValue(11, true);
        return TTMediaPlayer.create(this.f128935a);
    }

    /* renamed from: a */
    public final C51627c mo105574a() throws Exception {
        TTMediaPlayer b = m110832b();
        if (b == null) {
            b = m110832b();
            if (b == null || b.isOSPlayer()) {
                if (this.f128937c != null) {
                    new JSONObject().put("body_type", "init").put("fail_code", 1).put("error_msg", "ttplayer init failed");
                }
                throw new Exception("create ttplayer fail");
            }
        }
        if (this.f128937c != null) {
            new JSONObject().put("body_type", "init").put("fail_code", 0);
        }
        for (int i = 0; i < this.f128938d.size(); i++) {
            b.setIntOption(this.f128938d.keyAt(i), this.f128938d.valueAt(i));
        }
        return new C51623b(this, b);
    }

    public C51624c(Context context) {
        this.f128935a = context;
    }
}
