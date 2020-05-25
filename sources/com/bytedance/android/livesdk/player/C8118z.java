package com.bytedance.android.livesdk.player;

import com.bytedance.android.live.base.model.C2977g;
import com.p683ss.p2568f.p2569a.C51311c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.player.z */
public final class C8118z implements C51311c {
    /* renamed from: a */
    private static String m16191a(List<C2977g> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (C2977g gVar : list) {
            sb.append(gVar.getName());
            sb.append(": ");
            sb.append(gVar.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX INFO: used method not loaded: com.ss.f.a.c.a.a.a(java.lang.Exception):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r4 = r0;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        return com.p683ss.p2568f.p2569a.C51311c.C51313a.m110357a().mo101856a(r6).mo101858a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r0 = null;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        return com.p683ss.p2568f.p2569a.C51311c.C51313a.m110357a().mo101856a((java.lang.Exception) r6).mo101858a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[ExcHandler: Exception (r6v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078 A[ExcHandler: IOException (r6v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0018] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.p2568f.p2569a.C51311c.C51313a mo14312a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Class<com.bytedance.android.live.network.api.INetworkService> r0 = com.bytedance.android.live.network.api.INetworkService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.livesdkapi.host.IHostNetwork r0 = (com.bytedance.android.livesdkapi.host.IHostNetwork) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.bytedance.android.live.base.model.g r2 = new com.bytedance.android.live.base.model.g
            java.lang.String r3 = "host"
            r2.<init>(r3, r7)
            r1.add(r2)
            r7 = 0
            com.bytedance.android.livesdkapi.i.g r6 = r0.get(r6, r1)     // Catch:{ IOException -> 0x0078, JSONException -> 0x0063, Exception -> 0x0055 }
            java.lang.Object r6 = r6.mo15805a()     // Catch:{ IOException -> 0x0078, JSONException -> 0x0063, Exception -> 0x0055 }
            com.bytedance.android.livesdkapi.i.e r6 = (com.bytedance.android.livesdkapi.p455i.C8815e) r6     // Catch:{ IOException -> 0x0078, JSONException -> 0x0063, Exception -> 0x0055 }
            if (r6 == 0) goto L_0x0045
            byte[] r0 = r6.f24066e     // Catch:{ IOException -> 0x0078, JSONException -> 0x0063, Exception -> 0x0055 }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0078, JSONException -> 0x0063, Exception -> 0x0055 }
            byte[] r1 = r6.f24066e     // Catch:{ IOException -> 0x0078, JSONException -> 0x0063, Exception -> 0x0055 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0078, JSONException -> 0x0063, Exception -> 0x0055 }
            java.util.List<com.bytedance.android.live.base.model.g> r6 = r6.f24064c     // Catch:{ IOException -> 0x0078, JSONException -> 0x0040, Exception -> 0x0055 }
            java.lang.String r6 = m16191a(r6)     // Catch:{ IOException -> 0x0078, JSONException -> 0x0040, Exception -> 0x0055 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ IOException -> 0x0078, JSONException -> 0x003b, Exception -> 0x0055 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0078, JSONException -> 0x003b, Exception -> 0x0055 }
            goto L_0x0046
        L_0x003b:
            r7 = move-exception
            r4 = r0
            r0 = r6
            r6 = r7
            goto L_0x0043
        L_0x0040:
            r6 = move-exception
            r4 = r0
            r0 = r7
        L_0x0043:
            r7 = r4
            goto L_0x0065
        L_0x0045:
            r0 = r7
        L_0x0046:
            com.ss.f.a.c$a$a r6 = com.p683ss.p2568f.p2569a.C51311c.C51313a.m110357a()
            r6.f128233a = r7
            com.ss.f.a.c$a$a r6 = r6.mo101857a(r0)
            com.ss.f.a.c$a r6 = r6.mo101858a()
            return r6
        L_0x0055:
            r6 = move-exception
            com.ss.f.a.c$a$a r7 = com.p683ss.p2568f.p2569a.C51311c.C51313a.m110357a()
            com.ss.f.a.c$a$a r6 = r7.mo101856a(r6)
            com.ss.f.a.c$a r6 = r6.mo101858a()
            return r6
        L_0x0063:
            r6 = move-exception
            r0 = r7
        L_0x0065:
            com.ss.f.a.c$a$a r1 = com.p683ss.p2568f.p2569a.C51311c.C51313a.m110357a()
            com.ss.f.a.c$a$a r7 = r1.mo101857a(r7)
            r7.f128235c = r0
            com.ss.f.a.c$a$a r6 = r7.mo101856a(r6)
            com.ss.f.a.c$a r6 = r6.mo101858a()
            return r6
        L_0x0078:
            r6 = move-exception
            com.ss.f.a.c$a$a r7 = com.p683ss.p2568f.p2569a.C51311c.C51313a.m110357a()
            com.ss.f.a.c$a$a r6 = r7.mo101856a(r6)
            com.ss.f.a.c$a r6 = r6.mo101858a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.player.C8118z.mo14312a(java.lang.String, java.lang.String):com.ss.f.a.c$a");
    }
}
