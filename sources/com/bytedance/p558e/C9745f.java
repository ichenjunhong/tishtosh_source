package com.bytedance.p558e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.p558e.p559a.C9735a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.e.f */
final class C9745f {

    /* renamed from: a */
    private Context f26535a;

    /* renamed from: b */
    private C9746g f26536b;

    /* renamed from: c */
    private Set<String> f26537c;

    /* renamed from: d */
    private Set<String> f26538d = new HashSet();

    /* renamed from: e */
    private String f26539e;

    /* renamed from: f */
    private SharedPreferences f26540f;

    /* renamed from: g */
    private Set<String> f26541g;

    /* renamed from: a */
    private synchronized void m19516a() {
        String str;
        if (!this.f26537c.isEmpty() || !this.f26538d.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            if (!this.f26537c.isEmpty()) {
                Iterator it = this.f26537c.iterator();
                sb.append((String) it.next());
                while (it.hasNext()) {
                    sb.append(',');
                    sb.append((String) it.next());
                }
            }
            if (!this.f26538d.isEmpty()) {
                if (!this.f26537c.isEmpty()) {
                    sb.append(',');
                }
                Iterator it2 = this.f26538d.iterator();
                sb.append((String) it2.next());
                while (it2.hasNext()) {
                    sb.append(',');
                    sb.append((String) it2.next());
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, this.f26539e)) {
            this.f26539e = str;
            if (this.f26536b != null) {
                this.f26536b.mo17575a(this.f26539e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo17572a(String str) {
        if (this.f26540f.contains(str)) {
            String string = this.f26540f.getString(str, "");
            if (!this.f26537c.contains(string)) {
                if (!TextUtils.isEmpty(string)) {
                    this.f26537c.add(string);
                    C35807d.m80935a(this.f26535a, "SP_EXPERIMENT_CACHE", 0).edit().putStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", this.f26537c).apply();
                    m19516a();
                }
            }
        }
    }

    C9745f(Context context, C9746g gVar) {
        this.f26535a = context;
        this.f26536b = gVar;
        this.f26537c = new HashSet(C35807d.m80935a(context, "SP_EXPERIMENT_CACHE", 0).getStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", new HashSet()));
        this.f26540f = C35807d.m80935a(context, "SP_EXPERIMENT_EXPOSURE_CACHE", 0);
        this.f26541g = new HashSet(C35807d.m80935a(context, "SP_EXPERIMENT_CACHE", 0).getStringSet("SP_CLIENT_EXPOSURE_CACHE", new HashSet()));
        for (String str : this.f26541g) {
            StringBuilder sb = new StringBuilder("SP_CLIENT_EXPOSURE_CACHE$$$");
            sb.append(str);
            for (Object next : C35807d.m80935a(context, sb.toString(), 0).getAll().values()) {
                if (next instanceof String) {
                    String str2 = (String) next;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f26538d.add(str2);
                    }
                }
            }
        }
        m19516a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo17574a(Map<String, String> map, Map<String, Long> map2) {
        Editor edit = this.f26540f.edit();
        edit.clear().apply();
        for (String str : map.keySet()) {
            edit.putString(str, (String) map.get(str));
        }
        edit.apply();
        this.f26537c.retainAll(map.values());
        C35807d.m80935a(this.f26535a, "SP_EXPERIMENT_CACHE", 0).edit().putStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", this.f26537c).apply();
        m19516a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized <T> void mo17573a(String str, C9735a<T> aVar, String str2) {
        if (aVar != null) {
            String str3 = aVar.f26504d;
            if (!this.f26541g.contains(str3)) {
                this.f26541g.add(str3);
                C35807d.m80935a(this.f26535a, "SP_EXPERIMENT_CACHE", 0).edit().putStringSet("SP_CLIENT_EXPOSURE_CACHE", this.f26541g).apply();
            }
            List asList = Arrays.asList(aVar.f26505e);
            Context context = this.f26535a;
            StringBuilder sb = new StringBuilder("SP_CLIENT_EXPOSURE_CACHE$$$");
            sb.append(str3);
            SharedPreferences a = C35807d.m80935a(context, sb.toString(), 0);
            for (String str4 : a.getAll().keySet()) {
                if (!asList.contains(str4)) {
                    this.f26538d.remove(a.getString(str4, ""));
                    a.edit().remove(str4).apply();
                }
            }
            this.f26538d.add(str2);
            a.edit().putString(str, str2).apply();
            m19516a();
        }
    }
}
