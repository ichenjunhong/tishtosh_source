package com.bytedance.ies.bullet.p653ui.common;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.bullet.p628b.C10244c.C10245a;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.C10292k;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10276j;
import com.bytedance.ies.bullet.p628b.p637g.C10324a;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.ui.common.e */
public interface C10604e extends C10245a, C10292k, C10324a {

    /* renamed from: com.bytedance.ies.bullet.ui.common.e$a */
    public static final class C10605a {
        /* renamed from: a */
        public static /* synthetic */ void m21368a(C10604e eVar, Uri uri, Bundle bundle, C10606b bVar, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            if ((i & 4) != 0) {
                bVar = null;
            }
            eVar.mo18730a(uri, bundle, bVar);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.e$b */
    public interface C10606b {
        /* renamed from: a */
        void mo18695a(Uri uri);

        /* renamed from: a */
        void mo18696a(Uri uri, Throwable th);

        /* renamed from: a */
        void mo18697a(View view, Uri uri, C10290i iVar);

        /* renamed from: a */
        void mo18698a(C10290i iVar, Uri uri, C10423r rVar);

        /* renamed from: a */
        void mo18699a(List<? extends C10575d<? extends View>> list, Uri uri, C10290i iVar, boolean z);
    }

    /* renamed from: a */
    void mo18730a(Uri uri, Bundle bundle, C10606b bVar);

    /* renamed from: a */
    void mo18731a(View view, int i, int i2, int i3, int i4, int i5);

    void onEvent(C10276j jVar);
}
