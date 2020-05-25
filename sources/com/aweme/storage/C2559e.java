package com.aweme.storage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.aweme.storage.e */
final class C2559e {

    /* renamed from: a */
    static long f7945a;

    /* renamed from: b */
    static long f7946b;

    /* renamed from: c */
    static List<String> f7947c;

    /* renamed from: com.aweme.storage.e$a */
    static class C2560a {

        /* renamed from: a */
        public long f7948a;

        /* renamed from: b */
        public List<C2560a> f7949b = new ArrayList();

        /* renamed from: c */
        private String f7950c;

        /* renamed from: d */
        private C2560a f7951d;

        /* renamed from: e */
        private String f7952e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo7068a() {
            if (this.f7948a > C2559e.f7945a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final String mo7069b() {
            if (this.f7952e != null) {
                return this.f7952e;
            }
            if (this.f7951d == null) {
                this.f7952e = this.f7950c;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f7951d.mo7069b());
                sb.append(File.separator);
                sb.append(this.f7950c);
                this.f7952e = sb.toString();
            }
            return this.f7952e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final JSONObject mo7070c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(LeakCanaryFileProvider.f132049i, this.f7950c);
                jSONObject.put("size", this.f7948a);
                if (this.f7949b != null && this.f7949b.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C2560a aVar : this.f7949b) {
                        if (aVar != null) {
                            jSONArray.put(aVar.mo7070c());
                        }
                    }
                    jSONObject.put("child", jSONArray);
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo7067a(C2560a aVar) {
            this.f7949b.add(aVar);
        }

        /* renamed from: a */
        static C2560a m7485a(JSONObject jSONObject, C2560a aVar) {
            if (jSONObject == null) {
                return null;
            }
            try {
                String optString = jSONObject.optString(LeakCanaryFileProvider.f132049i);
                long optLong = jSONObject.optLong("size", 0);
                if (optString == null) {
                    return null;
                }
                C2560a aVar2 = new C2560a(optString, optLong, aVar);
                if (aVar != null) {
                    aVar.mo7067a(aVar2);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("child");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            m7485a(jSONObject2, aVar2);
                        }
                    }
                }
                return aVar2;
            } catch (Exception unused) {
                return null;
            }
        }

        C2560a(String str, long j, C2560a aVar) {
            this.f7950c = str;
            this.f7948a = j;
            this.f7951d = aVar;
        }
    }

    /* renamed from: com.aweme.storage.e$b */
    enum C2561b {
        p,
        e
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0038 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.aweme.storage.C2559e.C2560a m7482a(java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.exists()
            r1 = 0
            if (r4 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0037, all -> 0x0031 }
            r4.<init>(r0)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0037, all -> 0x0031 }
            int r0 = r4.available()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            byte[] r0 = new byte[r0]     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            r4.read(r0)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            java.lang.String r3 = "utf-8"
            r2.<init>(r0, r3)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            r0.<init>(r2)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            com.aweme.storage.e$a r0 = com.aweme.storage.C2559e.C2560a.m7485a(r0, r1)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            r4.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            return r0
        L_0x002f:
            r0 = move-exception
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            r4 = r1
        L_0x0033:
            r4.close()     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            throw r0
        L_0x0037:
            r4 = r1
        L_0x0038:
            r4.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.C2559e.m7482a(java.lang.String):com.aweme.storage.e$a");
    }

    /* renamed from: a */
    static void m7484a(File file, List<File> list) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isFile() && file2.length() > f7946b && !list.contains(file2)) {
                        list.add(file2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static C2560a m7481a(File file, C2560a aVar, C2561b bVar) {
        String str;
        if (file == null || !file.exists()) {
            return null;
        }
        boolean z = true;
        if (file != null && !file.isFile() && (f7947c == null || !f7947c.contains(file.getName()))) {
            z = false;
        }
        if (z) {
            return null;
        }
        if (aVar == null) {
            str = bVar.name();
        } else {
            str = file.getName();
        }
        C2560a aVar2 = new C2560a(str, C2562f.m7491a(file), aVar);
        if (aVar != null) {
            aVar.mo7067a(aVar2);
        }
        if (file.isFile()) {
            return null;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File a : listFiles) {
                    m7481a(a, aVar2, bVar);
                }
            }
        }
        return aVar2;
    }

    /* renamed from: a */
    static void m7483a(C2560a aVar, C2560a aVar2, List<C2560a> list) {
        boolean z;
        if (aVar != null && aVar2 != null && list != null) {
            if (aVar == null || aVar2.f7948a - aVar.f7948a <= f7945a) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                list.add(aVar2);
            }
            List<C2560a> list2 = aVar2.f7949b;
            if (list2 != null && !list2.isEmpty()) {
                List<C2560a> list3 = aVar.f7949b;
                if (list3 == null || list3.isEmpty()) {
                    for (C2560a aVar3 : list2) {
                        if (aVar3 != null && aVar3.mo7068a()) {
                            list.add(aVar3);
                        }
                    }
                    return;
                }
                for (C2560a aVar4 : list2) {
                    if (aVar4 != null) {
                        Iterator it = list3.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C2560a aVar5 = (C2560a) it.next();
                            if (aVar5 != null && aVar4.mo7069b().equals(aVar5.mo7069b())) {
                                m7483a(aVar5, aVar4, list);
                                break;
                            }
                            i++;
                        }
                        if (i >= list3.size() && aVar4 != null && aVar4.mo7068a()) {
                            list.add(aVar4);
                        }
                    }
                }
            }
        }
    }
}
