package com.bytedance.jirafast.p751d;

import com.bytedance.jirafast.models.C12053c;

/* renamed from: com.bytedance.jirafast.d.b */
public final class C12016b {

    /* renamed from: a */
    private static String f31786a = "JIRA_COMPONENT_LIST";

    /* renamed from: b */
    private static String f31787b = "JIRA_VERSION_LIST";

    /* renamed from: d */
    private static String f31788d = "AME";

    /* renamed from: c */
    private String f31789c;

    /* renamed from: e */
    private String f31790e;

    /* renamed from: f */
    private String f31791f;

    /* renamed from: com.bytedance.jirafast.d.b$a */
    static class C12018a {

        /* renamed from: a */
        public static C12016b f31792a = new C12016b();
    }

    /* renamed from: a */
    public static C12016b m24423a() {
        return C12018a.f31792a;
    }

    private C12016b() {
        this.f31789c = C12015a.m24416a().mo22755a(C12015a.f31768i);
        this.f31790e = C12015a.m24416a().mo22755a(C12015a.f31770k);
        this.f31791f = C12015a.m24416a().mo22755a(C12015a.f31771l);
        String a = C12015a.m24416a().mo22755a(C12015a.f31769j);
        f31788d = a;
        C12053c.f31858a = a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bd, code lost:
        if (r0 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cb, code lost:
        if (r0 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cd, code lost:
        r0.mo22777d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d4, code lost:
        if (r2.size() <= 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d6, code lost:
        com.bytedance.jirafast.p751d.C12025f.m24440a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return com.bytedance.jirafast.p751d.C12025f.m24441b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c6  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bytedance.jirafast.models.C12057g> mo22763c() {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r14.f31789c
            r0.append(r1)
            java.lang.String r1 = "/project/"
            r0.append(r1)
            java.lang.String r1 = f31788d
            r0.append(r1)
            java.lang.String r1 = "/versions"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = f31787b
            r1.append(r2)
            java.lang.String r2 = f31788d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ d -> 0x00ca, all -> 0x00c2 }
            r6 = 1
            com.bytedance.jirafast.d.h r0 = com.bytedance.jirafast.p751d.C12028h.m24447a(r0, r6, r5)     // Catch:{ d -> 0x00ca, all -> 0x00c2 }
            com.bytedance.jirafast.d.h r0 = r0.mo22779f()     // Catch:{ d -> 0x00ca, all -> 0x00c2 }
            java.lang.String r5 = r14.f31790e     // Catch:{ d -> 0x00ca, all -> 0x00c2 }
            java.lang.String r6 = r14.f31791f     // Catch:{ d -> 0x00ca, all -> 0x00c2 }
            com.bytedance.jirafast.d.h r0 = r0.mo22773b(r5, r6)     // Catch:{ d -> 0x00ca, all -> 0x00c2 }
            java.lang.String r4 = r0.mo22778e()     // Catch:{ d -> 0x00cb, all -> 0x00c0 }
            boolean r5 = r0.mo22776c()     // Catch:{ d -> 0x00cb, all -> 0x00c0 }
            if (r5 == 0) goto L_0x00bd
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00bc }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x00bc }
            com.bytedance.jirafast.d.a r4 = com.bytedance.jirafast.p751d.C12015a.m24416a()     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r6 = com.bytedance.jirafast.p751d.C12015a.f31778s     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r4 = r4.mo22755a(r6)     // Catch:{ JSONException -> 0x00bc }
        L_0x0063:
            int r6 = r5.length()     // Catch:{ JSONException -> 0x00bc }
            if (r3 >= r6) goto L_0x00bd
            org.json.JSONObject r6 = r5.optJSONObject(r3)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r7 = "id"
            java.lang.String r7 = r6.optString(r7)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r8 = "name"
            java.lang.String r8 = r6.optString(r8)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r9 = "archived"
            boolean r9 = r6.getBoolean(r9)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r10 = "released"
            boolean r10 = r6.getBoolean(r10)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r11 = "projectId"
            long r11 = r6.getLong(r11)     // Catch:{ JSONException -> 0x00bc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00bc }
            r6.<init>()     // Catch:{ JSONException -> 0x00bc }
            r6.append(r4)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r13 = " "
            r6.append(r13)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x00bc }
            boolean r6 = r8.startsWith(r6)     // Catch:{ JSONException -> 0x00bc }
            if (r6 == 0) goto L_0x00b9
            com.bytedance.jirafast.models.g r6 = new com.bytedance.jirafast.models.g     // Catch:{ JSONException -> 0x00bc }
            r6.<init>()     // Catch:{ JSONException -> 0x00bc }
            r6.setId(r7)     // Catch:{ JSONException -> 0x00bc }
            r6.setName(r8)     // Catch:{ JSONException -> 0x00bc }
            r6.setArchived(r9)     // Catch:{ JSONException -> 0x00bc }
            r6.setReleased(r10)     // Catch:{ JSONException -> 0x00bc }
            r6.setProjectId(r11)     // Catch:{ JSONException -> 0x00bc }
            r2.add(r6)     // Catch:{ JSONException -> 0x00bc }
        L_0x00b9:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x00bc:
        L_0x00bd:
            if (r0 == 0) goto L_0x00d0
            goto L_0x00cd
        L_0x00c0:
            r1 = move-exception
            goto L_0x00c4
        L_0x00c2:
            r1 = move-exception
            r0 = r4
        L_0x00c4:
            if (r0 == 0) goto L_0x00c9
            r0.mo22777d()
        L_0x00c9:
            throw r1
        L_0x00ca:
            r0 = r4
        L_0x00cb:
            if (r0 == 0) goto L_0x00d0
        L_0x00cd:
            r0.mo22777d()
        L_0x00d0:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00da
            com.bytedance.jirafast.p751d.C12025f.m24440a(r1, r2)
            goto L_0x00de
        L_0x00da:
            java.util.List r2 = com.bytedance.jirafast.p751d.C12025f.m24441b(r1)
        L_0x00de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12016b.mo22763c():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r1 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        r1.mo22777d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r2.size() <= 0) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        com.bytedance.jirafast.p751d.C12025f.m24442b(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return com.bytedance.jirafast.p751d.C12025f.m24439a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo22762b() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f31786a
            r0.append(r1)
            java.lang.String r1 = f31788d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.f31789c
            r1.append(r2)
            java.lang.String r2 = "/project/"
            r1.append(r2)
            java.lang.String r2 = f31788d
            r1.append(r2)
            java.lang.String r2 = "/components"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            com.bytedance.jirafast.d.h r1 = com.bytedance.jirafast.p751d.C12028h.m24446a(r1)     // Catch:{ d -> 0x0082, all -> 0x007a }
            com.bytedance.jirafast.d.h r1 = r1.mo22779f()     // Catch:{ d -> 0x0082, all -> 0x007a }
            java.lang.String r4 = r7.f31790e     // Catch:{ d -> 0x0082, all -> 0x007a }
            java.lang.String r5 = r7.f31791f     // Catch:{ d -> 0x0082, all -> 0x007a }
            com.bytedance.jirafast.d.h r1 = r1.mo22773b(r4, r5)     // Catch:{ d -> 0x0082, all -> 0x007a }
            java.lang.String r3 = r1.mo22778e()     // Catch:{ d -> 0x0083, all -> 0x0078 }
            boolean r4 = r1.mo22776c()     // Catch:{ d -> 0x0083, all -> 0x0078 }
            if (r4 == 0) goto L_0x0075
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0074 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0074 }
            r3 = 0
        L_0x0056:
            int r5 = r4.length()     // Catch:{ JSONException -> 0x0074 }
            if (r3 >= r5) goto L_0x0075
            org.json.JSONObject r5 = r4.optJSONObject(r3)     // Catch:{ JSONException -> 0x0074 }
            if (r5 == 0) goto L_0x0071
            java.lang.String r6 = "name"
            java.lang.String r5 = r5.optString(r6)     // Catch:{ JSONException -> 0x0074 }
            boolean r6 = r5.isEmpty()     // Catch:{ JSONException -> 0x0074 }
            if (r6 != 0) goto L_0x0071
            r2.add(r5)     // Catch:{ JSONException -> 0x0074 }
        L_0x0071:
            int r3 = r3 + 1
            goto L_0x0056
        L_0x0074:
        L_0x0075:
            if (r1 == 0) goto L_0x0088
            goto L_0x0085
        L_0x0078:
            r0 = move-exception
            goto L_0x007c
        L_0x007a:
            r0 = move-exception
            r1 = r3
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r1.mo22777d()
        L_0x0081:
            throw r0
        L_0x0082:
            r1 = r3
        L_0x0083:
            if (r1 == 0) goto L_0x0088
        L_0x0085:
            r1.mo22777d()
        L_0x0088:
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x0092
            com.bytedance.jirafast.p751d.C12025f.m24442b(r0, r2)
            goto L_0x0096
        L_0x0092:
            java.util.List r2 = com.bytedance.jirafast.p751d.C12025f.m24439a(r0)
        L_0x0096:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12016b.mo22762b():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m24424b(com.bytedance.jirafast.models.C12053c r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.f31789c
            r0.append(r1)
            java.lang.String r1 = "/issue/"
            r0.append(r1)
            java.lang.String r1 = r8.f31869l
            r0.append(r1)
            java.lang.String r1 = "/attachments"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.bytedance.jirafast.d.h r0 = com.bytedance.jirafast.p751d.C12028h.m24452b(r0)     // Catch:{ d -> 0x00bd, all -> 0x00b5 }
            java.lang.String r2 = "X-Atlassian-Token"
            java.lang.String r3 = "no-check"
            com.bytedance.jirafast.d.h r0 = r0.mo22769a(r2, r3)     // Catch:{ d -> 0x00bd, all -> 0x00b5 }
            java.lang.String r2 = r7.f31790e     // Catch:{ d -> 0x00bd, all -> 0x00b5 }
            java.lang.String r3 = r7.f31791f     // Catch:{ d -> 0x00bd, all -> 0x00b5 }
            com.bytedance.jirafast.d.h r0 = r0.mo22773b(r2, r3)     // Catch:{ d -> 0x00bd, all -> 0x00b5 }
            java.util.List<java.lang.String> r8 = r8.f31870m     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            if (r8 == 0) goto L_0x009b
            r1 = 0
        L_0x0037:
            int r2 = r8.size()     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            if (r1 >= r2) goto L_0x009b
            java.lang.Object r2 = r8.get(r1)     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            java.io.File r3 = new java.io.File     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            r3.<init>(r2)     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            java.lang.String r2 = r3.getName()     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            java.lang.String r4 = "\\."
            java.lang.String[] r4 = r2.split(r4)     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            int r5 = r4.length     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            int r5 = r5 + -1
            r4 = r4[r5]     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            java.lang.String r5 = ""
            java.lang.String r6 = "png"
            boolean r6 = r4.equals(r6)     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            if (r6 == 0) goto L_0x0064
            java.lang.String r5 = "image/png"
            goto L_0x008d
        L_0x0064:
            java.lang.String r6 = "jpg"
            boolean r6 = r4.equals(r6)     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            if (r6 != 0) goto L_0x008b
            java.lang.String r6 = "jpeg"
            boolean r6 = r4.equals(r6)     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            if (r6 == 0) goto L_0x0075
            goto L_0x008b
        L_0x0075:
            java.lang.String r6 = "gif"
            boolean r6 = r4.equals(r6)     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            if (r6 == 0) goto L_0x0080
            java.lang.String r5 = "image/gif"
            goto L_0x008d
        L_0x0080:
            java.lang.String r6 = "txt"
            boolean r4 = r4.equals(r6)     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            if (r4 == 0) goto L_0x008d
            java.lang.String r5 = "text/xml"
            goto L_0x008d
        L_0x008b:
            java.lang.String r5 = "image/jpeg"
        L_0x008d:
            boolean r4 = r5.isEmpty()     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            if (r4 != 0) goto L_0x0098
            java.lang.String r4 = "file"
            r0.mo22770a(r4, r2, r5, r3)     // Catch:{ d -> 0x00be, all -> 0x00b3 }
        L_0x0098:
            int r1 = r1 + 1
            goto L_0x0037
        L_0x009b:
            boolean r8 = r0.mo22776c()     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            if (r8 == 0) goto L_0x00a9
            if (r0 == 0) goto L_0x00a6
            r0.mo22777d()
        L_0x00a6:
            r8 = 200(0xc8, float:2.8E-43)
            return r8
        L_0x00a9:
            int r8 = r0.mo22772b()     // Catch:{ d -> 0x00be, all -> 0x00b3 }
            if (r0 == 0) goto L_0x00b2
            r0.mo22777d()
        L_0x00b2:
            return r8
        L_0x00b3:
            r8 = move-exception
            goto L_0x00b7
        L_0x00b5:
            r8 = move-exception
            r0 = r1
        L_0x00b7:
            if (r0 == 0) goto L_0x00bc
            r0.mo22777d()
        L_0x00bc:
            throw r8
        L_0x00bd:
            r0 = r1
        L_0x00be:
            if (r0 == 0) goto L_0x00c3
            r0.mo22777d()
        L_0x00c3:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12016b.m24424b(com.bytedance.jirafast.models.c):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r8 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r8 != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r8.mo22777d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.bytedance.jirafast.models.C12056f> mo22760a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.f31789c
            r0.append(r1)
            java.lang.String r1 = "/user/assignable/multiProjectSearch"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 4
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ d -> 0x008a, all -> 0x0082 }
            java.lang.String r4 = "username"
            r5 = 0
            r2[r5] = r4     // Catch:{ d -> 0x008a, all -> 0x0082 }
            r4 = 1
            r2[r4] = r8     // Catch:{ d -> 0x008a, all -> 0x0082 }
            r8 = 2
            java.lang.String r6 = "projectKeys"
            r2[r8] = r6     // Catch:{ d -> 0x008a, all -> 0x0082 }
            r8 = 3
            java.lang.String r6 = f31788d     // Catch:{ d -> 0x008a, all -> 0x0082 }
            r2[r8] = r6     // Catch:{ d -> 0x008a, all -> 0x0082 }
            com.bytedance.jirafast.d.h r8 = com.bytedance.jirafast.p751d.C12028h.m24447a(r0, r4, r2)     // Catch:{ d -> 0x008a, all -> 0x0082 }
            com.bytedance.jirafast.d.h r8 = r8.mo22779f()     // Catch:{ d -> 0x008a, all -> 0x0082 }
            java.lang.String r0 = r7.f31790e     // Catch:{ d -> 0x008a, all -> 0x0082 }
            java.lang.String r2 = r7.f31791f     // Catch:{ d -> 0x008a, all -> 0x0082 }
            com.bytedance.jirafast.d.h r8 = r8.mo22773b(r0, r2)     // Catch:{ d -> 0x008a, all -> 0x0082 }
            java.lang.String r0 = r8.mo22778e()     // Catch:{ d -> 0x008b, all -> 0x0080 }
            boolean r2 = r8.mo22776c()     // Catch:{ d -> 0x008b, all -> 0x0080 }
            if (r2 == 0) goto L_0x007d
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007c }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x007c }
        L_0x004d:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x007c }
            if (r5 >= r0) goto L_0x007d
            org.json.JSONObject r0 = r2.optJSONObject(r5)     // Catch:{ JSONException -> 0x007c }
            if (r0 == 0) goto L_0x0079
            java.lang.String r3 = "name"
            java.lang.String r3 = r0.optString(r3)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r4 = "emailAddress"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r6 = "displayName"
            java.lang.String r0 = r0.optString(r6)     // Catch:{ JSONException -> 0x007c }
            boolean r6 = r3.isEmpty()     // Catch:{ JSONException -> 0x007c }
            if (r6 != 0) goto L_0x0079
            com.bytedance.jirafast.models.f r6 = new com.bytedance.jirafast.models.f     // Catch:{ JSONException -> 0x007c }
            r6.<init>(r3, r4, r0)     // Catch:{ JSONException -> 0x007c }
            r1.add(r6)     // Catch:{ JSONException -> 0x007c }
        L_0x0079:
            int r5 = r5 + 1
            goto L_0x004d
        L_0x007c:
        L_0x007d:
            if (r8 == 0) goto L_0x0090
            goto L_0x008d
        L_0x0080:
            r0 = move-exception
            goto L_0x0084
        L_0x0082:
            r0 = move-exception
            r8 = r3
        L_0x0084:
            if (r8 == 0) goto L_0x0089
            r8.mo22777d()
        L_0x0089:
            throw r0
        L_0x008a:
            r8 = r3
        L_0x008b:
            if (r8 == 0) goto L_0x0090
        L_0x008d:
            r8.mo22777d()
        L_0x0090:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12016b.mo22760a(java.lang.String):java.util.ArrayList");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|(1:11)(1:12)|(7:14|15|16|(2:18|(4:22|(2:24|(1:26)(1:30))(1:31)|(1:35)|36))|32|(0)|36)(5:37|38|39|(1:41)(1:42)|(6:44|45|46|(3:48|(3:51|52|49)|71)|(1:55)|56)(0))|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0133, code lost:
        if (r0 != null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0141, code lost:
        if (r0 != null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0143, code lost:
        r0.mo22777d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0148, code lost:
        return "问题创建失败";
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053 A[Catch:{ d -> 0x0141, all -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055 A[Catch:{ d -> 0x0141, all -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058 A[Catch:{ d -> 0x0141, all -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo22759a(com.bytedance.jirafast.models.C12053c r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.f31789c
            r0.append(r1)
            java.lang.String r1 = "/issue"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.bytedance.jirafast.d.h r0 = com.bytedance.jirafast.p751d.C12028h.m24452b(r0)     // Catch:{ d -> 0x0140, all -> 0x0138 }
            com.bytedance.jirafast.d.h r0 = r0.mo22779f()     // Catch:{ d -> 0x0140, all -> 0x0138 }
            java.lang.String r2 = "application/json"
            java.lang.String r3 = "UTF-8"
            com.bytedance.jirafast.d.h r0 = r0.mo22775c(r2, r3)     // Catch:{ d -> 0x0140, all -> 0x0138 }
            java.lang.String r2 = r9.f31790e     // Catch:{ d -> 0x0140, all -> 0x0138 }
            java.lang.String r3 = r9.f31791f     // Catch:{ d -> 0x0140, all -> 0x0138 }
            com.bytedance.jirafast.d.h r0 = r0.mo22773b(r2, r3)     // Catch:{ d -> 0x0140, all -> 0x0138 }
            org.json.JSONObject r1 = r10.mo22805a()     // Catch:{ d -> 0x0141, all -> 0x0136 }
            java.lang.String r1 = r1.toString()     // Catch:{ d -> 0x0141, all -> 0x0136 }
            java.lang.String r2 = "UTF-8"
            byte[] r2 = r1.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x0042 }
            int r2 = r2.length     // Catch:{ UnsupportedEncodingException -> 0x0042 }
            java.net.HttpURLConnection r3 = r0.mo22771a()     // Catch:{ UnsupportedEncodingException -> 0x0042 }
            r3.setFixedLengthStreamingMode(r2)     // Catch:{ UnsupportedEncodingException -> 0x0042 }
        L_0x0042:
            r0.mo22774c(r1)     // Catch:{ d -> 0x0141, all -> 0x0136 }
            java.lang.String r1 = r0.mo22778e()     // Catch:{ d -> 0x0141, all -> 0x0136 }
            r2 = 201(0xc9, float:2.82E-43)
            int r3 = r0.mo22772b()     // Catch:{ d -> 0x0141, all -> 0x0136 }
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x00ea
            java.lang.String r2 = "问题创建成功"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e3 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r1 = "key"
            java.lang.String r1 = r3.optString(r1)     // Catch:{ JSONException -> 0x00e3 }
            boolean r3 = r1.isEmpty()     // Catch:{ JSONException -> 0x00e3 }
            if (r3 != 0) goto L_0x00e3
            r10.f31869l = r1     // Catch:{ JSONException -> 0x00e3 }
            java.util.List<java.lang.String> r1 = r10.f31870m     // Catch:{ JSONException -> 0x00e3 }
            if (r1 == 0) goto L_0x00e3
            java.util.List<java.lang.String> r1 = r10.f31870m     // Catch:{ JSONException -> 0x00e3 }
            int r1 = r1.size()     // Catch:{ JSONException -> 0x00e3 }
            if (r1 <= 0) goto L_0x00e3
            int r10 = r9.m24424b(r10)     // Catch:{ JSONException -> 0x00e3 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r10 == r1) goto L_0x00d1
            r1 = 413(0x19d, float:5.79E-43)
            if (r10 == r1) goto L_0x00bf
            switch(r10) {
                case 403: goto L_0x00ad;
                case 404: goto L_0x009b;
                default: goto L_0x0088;
            }     // Catch:{ JSONException -> 0x00e3 }
        L_0x0088:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00e3 }
            r10.<init>()     // Catch:{ JSONException -> 0x00e3 }
            r10.append(r2)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r1 = "\n图片或文件上传失败"
            r10.append(r1)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x00e3 }
            r2 = r10
            goto L_0x00e3
        L_0x009b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00e3 }
            r10.<init>()     // Catch:{ JSONException -> 0x00e3 }
            r10.append(r2)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r1 = "\n图片或文件关联失败"
            r10.append(r1)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x00e3 }
            goto L_0x00e4
        L_0x00ad:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00e3 }
            r10.<init>()     // Catch:{ JSONException -> 0x00e3 }
            r10.append(r2)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r1 = "\n上传权限问题"
            r10.append(r1)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x00e3 }
            goto L_0x00e4
        L_0x00bf:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00e3 }
            r10.<init>()     // Catch:{ JSONException -> 0x00e3 }
            r10.append(r2)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r1 = "\n图片或文件大小超限"
            r10.append(r1)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x00e3 }
            goto L_0x00e4
        L_0x00d1:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00e3 }
            r10.<init>()     // Catch:{ JSONException -> 0x00e3 }
            r10.append(r2)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r1 = "\n图片或文件上传成功"
            r10.append(r1)     // Catch:{ JSONException -> 0x00e3 }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x00e3 }
            goto L_0x00e4
        L_0x00e3:
            r10 = r2
        L_0x00e4:
            if (r0 == 0) goto L_0x00e9
            r0.mo22777d()
        L_0x00e9:
            return r10
        L_0x00ea:
            r10 = 400(0x190, float:5.6E-43)
            int r2 = r0.mo22772b()     // Catch:{ d -> 0x0141, all -> 0x0136 }
            if (r10 != r2) goto L_0x00f4
            r10 = 1
            goto L_0x00f5
        L_0x00f4:
            r10 = 0
        L_0x00f5:
            if (r10 == 0) goto L_0x0133
            java.lang.String r10 = ""
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x012d }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x012d }
            java.lang.String r1 = "errors"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch:{ JSONException -> 0x012d }
            if (r1 == 0) goto L_0x012d
            java.util.Iterator r2 = r1.keys()     // Catch:{ JSONException -> 0x012d }
        L_0x010a:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x012d }
            if (r3 == 0) goto L_0x012d
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x012d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x012d }
            java.lang.String r6 = r1.getString(r3)     // Catch:{ JSONException -> 0x012d }
            java.lang.String r7 = "\"%s\": %s\n"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ JSONException -> 0x012d }
            r8[r4] = r3     // Catch:{ JSONException -> 0x012d }
            r8[r5] = r6     // Catch:{ JSONException -> 0x012d }
            java.lang.String r3 = com.C2240a.m6772a(r7, r8)     // Catch:{ JSONException -> 0x012d }
            java.lang.String r3 = r10.concat(r3)     // Catch:{ JSONException -> 0x012d }
            r10 = r3
            goto L_0x010a
        L_0x012d:
            if (r0 == 0) goto L_0x0132
            r0.mo22777d()
        L_0x0132:
            return r10
        L_0x0133:
            if (r0 == 0) goto L_0x0146
            goto L_0x0143
        L_0x0136:
            r10 = move-exception
            goto L_0x013a
        L_0x0138:
            r10 = move-exception
            r0 = r1
        L_0x013a:
            if (r0 == 0) goto L_0x013f
            r0.mo22777d()
        L_0x013f:
            throw r10
        L_0x0140:
            r0 = r1
        L_0x0141:
            if (r0 == 0) goto L_0x0146
        L_0x0143:
            r0.mo22777d()
        L_0x0146:
            java.lang.String r10 = "问题创建失败"
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12016b.mo22759a(com.bytedance.jirafast.models.c):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        if (r11 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        if (r11 != null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r11.mo22777d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.bytedance.jirafast.models.C12051a> mo22761b(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://jira.bytedance.com/rest/greenhopper/1.0/epics?searchQuery="
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = "&projectKey="
            r0.append(r11)
            java.lang.String r11 = f31788d
            r0.append(r11)
            java.lang.String r11 = "&maxResults=100&hideDone=true&_="
            r0.append(r11)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r11 = r0.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ d -> 0x00a8, all -> 0x00a0 }
            r4 = 1
            com.bytedance.jirafast.d.h r11 = com.bytedance.jirafast.p751d.C12028h.m24447a(r11, r4, r3)     // Catch:{ d -> 0x00a8, all -> 0x00a0 }
            com.bytedance.jirafast.d.h r11 = r11.mo22779f()     // Catch:{ d -> 0x00a8, all -> 0x00a0 }
            java.lang.String r3 = r10.f31790e     // Catch:{ d -> 0x00a8, all -> 0x00a0 }
            java.lang.String r4 = r10.f31791f     // Catch:{ d -> 0x00a8, all -> 0x00a0 }
            com.bytedance.jirafast.d.h r11 = r11.mo22773b(r3, r4)     // Catch:{ d -> 0x00a8, all -> 0x00a0 }
            java.lang.String r2 = r11.mo22778e()     // Catch:{ d -> 0x00a9, all -> 0x009e }
            boolean r3 = r11.mo22776c()     // Catch:{ d -> 0x00a9, all -> 0x009e }
            if (r3 == 0) goto L_0x009b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r2 = "epicLists"
            org.json.JSONArray r2 = r3.getJSONArray(r2)     // Catch:{ JSONException -> 0x009a }
            r3 = 0
        L_0x0054:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x009a }
            if (r3 >= r4) goto L_0x009b
            org.json.JSONObject r4 = r2.optJSONObject(r3)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r5 = "epicNames"
            org.json.JSONArray r4 = r4.getJSONArray(r5)     // Catch:{ JSONException -> 0x009a }
            r5 = 0
        L_0x0065:
            int r6 = r4.length()     // Catch:{ JSONException -> 0x009a }
            if (r5 >= r6) goto L_0x0097
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x009a }
            if (r6 == 0) goto L_0x0094
            java.lang.String r7 = "name"
            java.lang.String r7 = r6.getString(r7)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r8 = "key"
            java.lang.String r8 = r6.getString(r8)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r9 = "isDone"
            boolean r6 = r6.getBoolean(r9)     // Catch:{ JSONException -> 0x009a }
            com.bytedance.jirafast.models.a r9 = new com.bytedance.jirafast.models.a     // Catch:{ JSONException -> 0x009a }
            r9.<init>()     // Catch:{ JSONException -> 0x009a }
            r9.setName(r7)     // Catch:{ JSONException -> 0x009a }
            r9.setKey(r8)     // Catch:{ JSONException -> 0x009a }
            r9.setDone(r6)     // Catch:{ JSONException -> 0x009a }
            r0.add(r9)     // Catch:{ JSONException -> 0x009a }
        L_0x0094:
            int r5 = r5 + 1
            goto L_0x0065
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x0054
        L_0x009a:
        L_0x009b:
            if (r11 == 0) goto L_0x00ae
            goto L_0x00ab
        L_0x009e:
            r0 = move-exception
            goto L_0x00a2
        L_0x00a0:
            r0 = move-exception
            r11 = r2
        L_0x00a2:
            if (r11 == 0) goto L_0x00a7
            r11.mo22777d()
        L_0x00a7:
            throw r0
        L_0x00a8:
            r11 = r2
        L_0x00a9:
            if (r11 == 0) goto L_0x00ae
        L_0x00ab:
            r11.mo22777d()
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12016b.mo22761b(java.lang.String):java.util.ArrayList");
    }
}
