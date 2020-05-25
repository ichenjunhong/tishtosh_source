package com.p683ss.android.ugc.aweme.global.config.settings;

import android.content.SharedPreferences;
import com.bytedance.ies.C10616c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.g */
final class C32815g implements C10616c {

    /* renamed from: a */
    boolean f85424a = false;

    /* renamed from: b */
    Map<String, Object> f85425b = new HashMap();

    /* renamed from: c */
    private boolean f85426c;

    /* renamed from: d */
    private SharedPreferences f85427d;

    /* renamed from: e */
    private C32810c f85428e;

    C32815g() {
        mo66397b();
        this.f85428e = new C32810c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public SharedPreferences mo66396a() {
        if (this.f85427d == null) {
            this.f85427d = C35807d.m80935a(C11010c.m22280a(), "settings-mock", 0);
        }
        return this.f85427d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo66397b() {
        if (!this.f85426c && this.f85424a) {
            this.f85426c = true;
            this.f85425b.putAll(mo66396a().getAll());
        }
    }

    /* renamed from: a */
    public final <T> T mo18837a(String str, Class<T> cls, T t) {
        if (!this.f85424a) {
            return this.f85428e.mo18837a(str, cls, t);
        }
        T t2 = this.f85425b.get(str);
        if (t2 == null) {
            return this.f85428e.mo18837a(str, cls, t);
        }
        return t2;
    }

    /* renamed from: a */
    public final <T> List<T> mo18838a(String str, Class<T> cls, List<T> list) {
        if (!this.f85424a) {
            return this.f85428e.mo18838a(str, cls, list);
        }
        Object obj = this.f85425b.get(str);
        if (obj == null) {
            return this.f85428e.mo18838a(str, cls, list);
        }
        return (List) obj;
    }
}
