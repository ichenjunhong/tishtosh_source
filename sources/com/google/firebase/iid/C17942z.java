package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.p038f.C0777a;
import android.util.Log;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.z */
final class C17942z {

    /* renamed from: a */
    private final SharedPreferences f49825a;

    /* renamed from: b */
    private final Context f49826b;

    /* renamed from: c */
    private final C17917ba f49827c;

    /* renamed from: d */
    private final Map<String, C17918bb> f49828d;

    public C17942z(Context context) {
        this(context, new C17917ba());
    }

    private C17942z(Context context, C17917ba baVar) {
        this.f49828d = new C0777a();
        this.f49826b = context;
        this.f49825a = C35807d.m80935a(context, "com.google.android.gms.appid", 0);
        this.f49827c = baVar;
        File file = new File(C0726c.m2092a(this.f49826b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m43975c()) {
                    mo34797b();
                    FirebaseInstanceId.m43841a().mo34722g();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                        return;
                    }
                    new String(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized String mo34793a() {
        return this.f49825a.getString("topic_operaion_queue", "");
    }

    /* renamed from: a */
    public final synchronized void mo34794a(String str) {
        this.f49825a.edit().putString("topic_operaion_queue", str).apply();
    }

    /* renamed from: c */
    private final synchronized boolean m43975c() {
        return this.f49825a.getAll().isEmpty();
    }

    /* renamed from: b */
    private static String m43974b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    static String m43973a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public final synchronized void mo34797b() {
        File[] listFiles;
        this.f49828d.clear();
        for (File file : C17917ba.m43911a(this.f49826b).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.f49825a.edit().clear().commit();
    }

    /* renamed from: a */
    public final synchronized C17890aa mo34792a(String str, String str2, String str3) {
        return C17890aa.m43865a(this.f49825a.getString(m43974b(str, str2, str3), null));
    }

    /* renamed from: a */
    public final synchronized void mo34795a(String str, String str2, String str3, String str4, String str5) {
        String a = C17890aa.m43867a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            Editor edit = this.f49825a.edit();
            edit.putString(m43974b(str, str2, str3), a);
            edit.commit();
        }
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.ba.a(android.content.Context, java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        com.google.firebase.iid.FirebaseInstanceId.m43841a().mo34722g();
        r2 = r3.f49827c.mo34758a(r3.f49826b, r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.firebase.iid.C17918bb mo34796b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, com.google.firebase.iid.bb> r0 = r3.f49828d     // Catch:{ all -> 0x0033 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0033 }
            com.google.firebase.iid.bb r0 = (com.google.firebase.iid.C17918bb) r0     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r3)
            return r0
        L_0x000d:
            com.google.firebase.iid.ba r0 = r3.f49827c     // Catch:{ d -> 0x001d }
            android.content.Context r1 = r3.f49826b     // Catch:{ d -> 0x001d }
            com.google.firebase.iid.bb r2 = r0.mo34759b(r1, r4)     // Catch:{ d -> 0x001d }
            if (r2 == 0) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            com.google.firebase.iid.bb r2 = r0.mo34758a(r1, r4)     // Catch:{ d -> 0x001d }
            goto L_0x002c
        L_0x001d:
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.m43841a()     // Catch:{ all -> 0x0033 }
            r0.mo34722g()     // Catch:{ all -> 0x0033 }
            com.google.firebase.iid.ba r0 = r3.f49827c     // Catch:{ all -> 0x0033 }
            android.content.Context r1 = r3.f49826b     // Catch:{ all -> 0x0033 }
            com.google.firebase.iid.bb r2 = r0.mo34758a(r1, r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            java.util.Map<java.lang.String, com.google.firebase.iid.bb> r0 = r3.f49828d     // Catch:{ all -> 0x0033 }
            r0.put(r4, r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)
            return r2
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17942z.mo34796b(java.lang.String):com.google.firebase.iid.bb");
    }

    /* renamed from: c */
    public final synchronized void mo34798c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.f49825a.edit();
        for (String str2 : this.f49825a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
