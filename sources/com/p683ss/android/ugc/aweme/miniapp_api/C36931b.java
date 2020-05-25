package com.p683ss.android.ugc.aweme.miniapp_api;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.dfbase.C27532a;
import com.p683ss.android.ugc.aweme.dfbase.C27559n;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27540a;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27548d;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.b */
public final class C36931b {

    /* renamed from: a */
    public static C36934a f94306a;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.b$a */
    public interface C36934a {
        /* renamed from: a */
        void mo76184a();
    }

    /* renamed from: a */
    public static C36934a m83141a() {
        return f94306a;
    }

    /* renamed from: a */
    public static boolean m83142a(Context context, boolean z) {
        C27540a a = new C27540a().mo55989a("df_miniapp").mo55991b(false).mo55990a(true).mo55988a(2);
        if (z) {
            a.f72425l = Arrays.asList(new String[]{"df_miniapp_so"});
        }
        C27532a aVar = new C27532a(a);
        if (C27532a.m66172c()) {
            aVar.mo55967a(new C27559n() {
                /* renamed from: b */
                public final void mo50034b(boolean z) {
                }

                /* renamed from: a */
                public final void mo50033a(boolean z) {
                    C27548d.m66217a(C11010c.m22280a());
                    if (!z && C36931b.m83141a() != null) {
                        C36931b.m83141a().mo76184a();
                    }
                }
            });
            aVar.mo55969b();
        }
        return false;
    }
}
