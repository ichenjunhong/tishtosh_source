package com.bytedance.android.livesdk.chatroom;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.p310f.C5234s;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.live.model.C7757a;
import com.bytedance.android.livesdkapi.C8608c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.b */
public class C4995b implements C8608c {

    /* renamed from: a */
    public static int f13378a;

    /* renamed from: f */
    private static C4995b f13379f;

    /* renamed from: b */
    public boolean f13380b;

    /* renamed from: c */
    public C4996a f13381c;

    /* renamed from: d */
    public int f13382d;

    /* renamed from: e */
    public GenericLifecycleObserver f13383e;

    /* renamed from: com.bytedance.android.livesdk.chatroom.b$a */
    public class C4996a {

        /* renamed from: a */
        public String f13384a;

        /* renamed from: b */
        public String f13385b;

        /* renamed from: c */
        public String f13386c;

        /* renamed from: d */
        public C7757a f13387d;

        /* renamed from: e */
        public Map<Long, Integer> f13388e;

        /* renamed from: f */
        public String f13389f;

        /* renamed from: a */
        public final String mo10875a() {
            if (this.f13387d != null) {
                return this.f13387d.f21323d;
            }
            return null;
        }

        /* renamed from: a */
        private static C7757a m11484a(String str) {
            List<C7757a> list = (List) LiveConfigSettingKeys.LIVE_DRAWER_URL.mo9431a();
            C7757a aVar = null;
            if (list == null || TextUtils.isEmpty(str)) {
                return null;
            }
            for (C7757a aVar2 : list) {
                if (!(aVar2 == null || aVar2.f21320a == null)) {
                    if (TextUtils.equals(aVar2.f21320a, str)) {
                        return aVar2;
                    }
                    if ((aVar2.f21320a.startsWith("*") && str.endsWith(aVar2.f21320a.replace("*", ""))) || (aVar2.f21320a.endsWith("*") && str.startsWith(aVar2.f21320a.replace("*", "")))) {
                        aVar = aVar2;
                    }
                }
            }
            return aVar;
        }

        public C4996a(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
                this.f13385b = bundle.getString("enter_from_merge");
                this.f13384a = bundle.getString("enter_method");
                if (TextUtils.isEmpty(this.f13385b) && bundle2 != null) {
                    this.f13385b = bundle2.getString("enter_from_merge");
                }
                if (TextUtils.isEmpty(this.f13384a) && bundle2 != null) {
                    this.f13384a = bundle2.getString("enter_method");
                }
                if (!TextUtils.isEmpty(this.f13385b) && !TextUtils.isEmpty(this.f13384a)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f13385b);
                    sb.append("_");
                    sb.append(this.f13384a);
                    this.f13386c = sb.toString();
                }
                this.f13388e = new HashMap();
                this.f13387d = m11484a(this.f13386c);
                this.f13389f = C5234s.m11851b(bundle);
            }
        }
    }

    private C4995b() {
    }

    /* renamed from: b */
    public final String mo10870b() {
        if (!this.f13380b || this.f13381c == null) {
            return null;
        }
        return this.f13381c.f13385b;
    }

    /* renamed from: f */
    public final String mo10874f() {
        if (!this.f13380b || this.f13381c == null) {
            return null;
        }
        return this.f13381c.f13389f;
    }

    /* renamed from: a */
    public static C4995b m11478a() {
        if (f13379f == null) {
            synchronized (C4995b.class) {
                if (f13379f == null) {
                    f13379f = new C4995b();
                }
            }
        }
        return f13379f;
    }

    /* renamed from: c */
    public final String mo10871c() {
        if (!this.f13380b || this.f13381c == null) {
            return null;
        }
        return this.f13381c.mo10875a();
    }

    /* renamed from: d */
    public final String mo10872d() {
        if (!this.f13380b || this.f13381c == null) {
            return null;
        }
        C4996a aVar = this.f13381c;
        if (aVar.f13387d != null) {
            return aVar.f13387d.f21322c;
        }
        return null;
    }

    /* renamed from: e */
    public final String mo10873e() {
        if (!this.f13380b || this.f13381c == null) {
            return null;
        }
        C4996a aVar = this.f13381c;
        if (aVar.f13387d != null) {
            return aVar.f13387d.f21321b;
        }
        return null;
    }
}
