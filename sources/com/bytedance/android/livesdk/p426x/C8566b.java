package com.bytedance.android.livesdk.p426x;

import android.content.Context;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.live.C8647f;
import com.ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.x.b */
public class C8566b implements C8647f {

    /* renamed from: a */
    private static volatile C8647f f23499a;

    private C8566b() {
    }

    /* renamed from: a */
    public static C8647f m16908a() {
        if (f23499a == null) {
            synchronized (C8566b.class) {
                if (f23499a == null) {
                    f23499a = new C8566b();
                }
            }
        }
        return f23499a;
    }

    /* renamed from: a */
    public final String mo15022a(Context context) {
        return m16909a(context, R.string.gzt);
    }

    /* renamed from: a */
    private static String m16909a(Context context, int i) {
        try {
            return context.getResources().getString(R.string.gzt);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo15023a(String str, Map<String, String> map, Object... objArr) {
        C8049c.m15979a().mo14202a(str, map, objArr);
    }
}
