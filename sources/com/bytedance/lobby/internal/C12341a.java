package com.bytedance.lobby.internal;

import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p038f.C0794k;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12316a;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.lobby.internal.a */
final class C12341a {

    /* renamed from: b */
    private static volatile C12341a f32535b;

    /* renamed from: a */
    final Map<C0794k<String, Integer>, List<C12316a>> f32536a = new C0777a();

    private C12341a() {
    }

    /* renamed from: a */
    static C12341a m24846a() {
        if (f32535b == null) {
            synchronized (C12341a.class) {
                if (f32535b == null) {
                    f32535b = new C12341a();
                }
            }
        }
        return f32535b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23342a(String str, int i, AuthResult authResult) {
        synchronized (this.f32536a) {
            List<C12316a> list = (List) this.f32536a.get(new C0794k(str, Integer.valueOf(i)));
            if (!(list == null || authResult == null)) {
                for (C12316a a : list) {
                    a.mo23306a(authResult);
                }
                list.clear();
            }
        }
    }
}
