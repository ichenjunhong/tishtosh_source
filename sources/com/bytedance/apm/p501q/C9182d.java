package com.bytedance.apm.p501q;

/* renamed from: com.bytedance.apm.q.d */
public final class C9182d {
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.services.apm.api.C13219b m18227a(java.lang.String r4, java.util.List<java.io.File> r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            com.bytedance.apm.net.b r0 = new com.bytedance.apm.net.b     // Catch:{  }
            java.lang.String r1 = "UTF-8"
            r2 = 0
            r0.<init>(r4, r1, r2)     // Catch:{  }
            if (r5 == 0) goto L_0x0033
            boolean r4 = r5.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x0033
            java.util.Iterator r4 = r5.iterator()     // Catch:{  }
        L_0x0014:
            boolean r5 = r4.hasNext()     // Catch:{  }
            if (r5 == 0) goto L_0x0033
            java.lang.Object r5 = r4.next()     // Catch:{  }
            java.io.File r5 = (java.io.File) r5     // Catch:{  }
            boolean r1 = r5.exists()     // Catch:{  }
            if (r1 == 0) goto L_0x0014
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{  }
            r1.<init>()     // Catch:{  }
            java.lang.String r3 = r5.getName()     // Catch:{  }
            r0.mo16520a(r3, r5, r1)     // Catch:{  }
            goto L_0x0014
        L_0x0033:
            if (r6 == 0) goto L_0x005f
            boolean r4 = r6.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x005f
            java.util.Set r4 = r6.entrySet()     // Catch:{  }
            java.util.Iterator r4 = r4.iterator()     // Catch:{  }
        L_0x0043:
            boolean r5 = r4.hasNext()     // Catch:{  }
            if (r5 == 0) goto L_0x005f
            java.lang.Object r5 = r4.next()     // Catch:{  }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{  }
            java.lang.Object r6 = r5.getKey()     // Catch:{  }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{  }
            java.lang.Object r5 = r5.getValue()     // Catch:{  }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{  }
            r0.mo16521a(r6, r5)     // Catch:{  }
            goto L_0x0043
        L_0x005f:
            java.lang.String r4 = r0.mo16519a()     // Catch:{  }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{  }
            if (r5 != 0) goto L_0x0086
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ IOException -> 0x0086 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0086 }
            java.lang.String r4 = "error_code"
            int r4 = r5.optInt(r4, r2)     // Catch:{ IOException -> 0x0086 }
            java.lang.String r6 = "message"
            java.lang.String r0 = ""
            java.lang.String r5 = r5.optString(r6, r0)     // Catch:{ IOException -> 0x0086 }
            com.bytedance.services.apm.api.b r6 = new com.bytedance.services.apm.api.b     // Catch:{ IOException -> 0x0086 }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x0086 }
            r6.<init>(r4, r5)     // Catch:{ IOException -> 0x0086 }
            return r6
        L_0x0086:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p501q.C9182d.m18227a(java.lang.String, java.util.List, java.util.Map):com.bytedance.services.apm.api.b");
    }
}
