package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.C8737f;
import com.bytedance.android.livesdkapi.C8737f.C8738a;
import com.bytedance.android.livesdkapi.C8737f.C8739b;
import com.bytedance.android.livesdkapi.host.C8777a;
import com.bytedance.android.livesdkapi.p448f.C8740a;
import com.bytedance.android.livesdkapi.p448f.C8741b;
import com.bytedance.ies.p672e.C10753b;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.g */
public final class C36109g implements C8777a {

    /* renamed from: a */
    private final C8741b f92495a = new C36111a();

    /* renamed from: b */
    private final C8737f f92496b;

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.g$a */
    static class C36111a implements C8741b {
        private C36111a() {
        }

        /* renamed from: a */
        public final boolean mo15412a() {
            return ((Boolean) SharePrefCache.inst().isEnableMessagePb2Json().mo47782d()).booleanValue();
        }

        /* renamed from: a */
        public final void mo15411a(boolean z) {
            C8740a.f24005c.mo10346a(Boolean.valueOf(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.g$b */
    static class C36112b implements C8737f {

        /* renamed from: a */
        private C10753b f92497a;

        /* renamed from: b */
        private Map<String, Object> f92498b = new HashMap();

        /* renamed from: a */
        private static void m81498a(boolean z) {
            if (!z) {
                throw new IllegalArgumentException();
            }
        }

        C36112b(Context context) {
            this.f92497a = C10753b.m21794a(context, "live-app-core-sdk");
            C4116c.m10251a(C8737f.class, this);
        }

        /* renamed from: b */
        public final int mo15410b(C8738a aVar) {
            boolean z;
            if (aVar.type() == C8739b.Integer) {
                z = true;
            } else {
                z = false;
            }
            m81498a(z);
            Integer num = (Integer) this.f92498b.get(aVar.key());
            if (num == null) {
                if (aVar.supportPersist()) {
                    num = Integer.valueOf(this.f92497a.mo19439a(aVar.key(), ((Integer) aVar.defValue()).intValue()));
                } else {
                    num = (Integer) aVar.defValue();
                }
                this.f92498b.put(aVar.key(), num);
            }
            return num.intValue();
        }

        /* renamed from: a */
        public final boolean mo15409a(C8738a aVar) {
            boolean z;
            if (aVar.type() == C8739b.Boolean) {
                z = true;
            } else {
                z = false;
            }
            m81498a(z);
            Boolean bool = (Boolean) this.f92498b.get(aVar.key());
            if (bool == null) {
                if (aVar.supportPersist()) {
                    bool = Boolean.valueOf(this.f92497a.mo19444a(aVar.key(), ((Boolean) aVar.defValue()).booleanValue()));
                } else {
                    bool = (Boolean) aVar.defValue();
                }
                this.f92498b.put(aVar.key(), bool);
            }
            return bool.booleanValue();
        }

        /* renamed from: a */
        public final void mo15406a(C8738a aVar, int i) {
            boolean z;
            if (aVar.type() == C8739b.Integer) {
                z = true;
            } else {
                z = false;
            }
            m81498a(z);
            this.f92498b.put(aVar.key(), Integer.valueOf(i));
            if (aVar.supportPersist()) {
                this.f92497a.f28916a.edit().putInt(aVar.key(), i).apply();
            }
        }

        /* renamed from: a */
        public final void mo15407a(C8738a aVar, String str) {
            boolean z;
            if (aVar.type() == C8739b.String) {
                z = true;
            } else {
                z = false;
            }
            m81498a(z);
            this.f92498b.put(aVar.key(), str);
            if (aVar.supportPersist()) {
                this.f92497a.f28916a.edit().putString(aVar.key(), str).apply();
            }
        }

        /* renamed from: a */
        public final void mo15408a(C8738a aVar, boolean z) {
            boolean z2;
            Boolean bool;
            if (aVar.type() == C8739b.Boolean) {
                z2 = true;
            } else {
                z2 = false;
            }
            m81498a(z2);
            Map<String, Object> map = this.f92498b;
            String key = aVar.key();
            if (z) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            map.put(key, bool);
            if (aVar.supportPersist()) {
                this.f92497a.f28916a.edit().putBoolean(aVar.key(), z).apply();
            }
        }
    }

    /* renamed from: a */
    public final C8741b mo15488a() {
        return this.f92495a;
    }

    /* renamed from: b */
    public final C8737f mo15489b() {
        return this.f92496b;
    }

    C36109g(Context context) {
        this.f92496b = new C36112b(context);
    }
}
