package com.bytedance.crash.p553l;

import android.content.Context;
import android.os.Handler;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p551k.C9617a;
import com.bytedance.crash.p551k.C9652h;
import java.util.Map;

/* renamed from: com.bytedance.crash.l.b */
public final class C9664b extends C9663a {

    /* renamed from: d */
    private Context f26374d;

    public final void run() {
        Map map;
        try {
            map = C9616k.m19147a().f26242a.mo17412a();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (!C9617a.m19161a(map)) {
                    C9652h.m19252a().mo17503a(map);
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        mo17513a(this.f26373c);
    }

    C9664b(Handler handler, long j, long j2, Context context) {
        super(handler, 0, 15000);
        this.f26374d = context;
    }
}
