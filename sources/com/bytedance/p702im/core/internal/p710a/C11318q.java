package com.bytedance.p702im.core.internal.p710a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p713c.C11302f;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11207p;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.q */
public final class C11318q {

    /* renamed from: a */
    private static C11318q f30467a;

    private C11318q() {
    }

    /* renamed from: a */
    public static C11318q m23074a() {
        if (f30467a == null) {
            synchronized (C11318q.class) {
                if (f30467a == null) {
                    f30467a = new C11318q();
                }
            }
        }
        return f30467a;
    }

    /* renamed from: b */
    public static String m23077b() {
        C11304e[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS mention(");
        for (C11304e eVar : C11304e.values()) {
            sb.append(eVar.f30417f);
            sb.append(" ");
            sb.append(eVar.f30418g);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: a */
    public static boolean m23076a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11266d.m22878a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11304e.COLUMN_UUID.f30417f);
        sb.append("=?");
        return C11266d.m22882a("mention", sb.toString(), new String[]{str});
    }

    /* renamed from: b */
    public static boolean m23078b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11266d.m22878a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11304e.COLUMN_CONVERSATION_ID.f30417f);
        sb.append("=?");
        return C11266d.m22882a("mention", sb.toString(), new String[]{str});
    }

    /* renamed from: a */
    public final boolean mo21020a(C11207p pVar) {
        Boolean bool;
        boolean z = true;
        if (pVar.isSelf()) {
            return true;
        }
        List mentionIds = pVar.getMentionIds();
        if (mentionIds == null || mentionIds.isEmpty() || (!mentionIds.contains(Long.valueOf(C11165c.m22588a().f30108c.mo20490a())) && !mentionIds.contains(Long.valueOf(0)))) {
            return true;
        }
        Boolean valueOf = Boolean.valueOf(false);
        C11302f fVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(" replace into mention(");
            for (C11304e eVar : C11304e.values()) {
                sb.append(eVar.f30417f);
                sb.append(",");
                sb2.append("?,");
            }
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb3.substring(0, sb3.length() - 1));
            sb5.append(") values (");
            sb5.append(sb4.substring(0, sb4.length() - 1));
            sb5.append(");");
            String sb6 = sb5.toString();
            C11266d.m22878a();
            C11302f d = C11266d.m22884d(sb6);
            if (!(d == null || pVar == null)) {
                try {
                    d.mo21011a(C11304e.COLUMN_UUID.ordinal() + 1, C11323v.m23121a(pVar.getUuid()));
                    d.mo21011a(C11304e.COLUMN_CONVERSATION_ID.ordinal() + 1, C11323v.m23121a(pVar.getConversationId()));
                    d.mo21011a(C11304e.COLUMN_IDS_STR.ordinal() + 1, C11322u.m23120a(mentionIds, ","));
                    d.mo21010a(C11304e.COLUMN_SENDER_ID.ordinal() + 1, pVar.getSender());
                    d.mo21010a(C11304e.COLUMN_CREATED_TIME.ordinal() + 1, pVar.getCreatedAt());
                } catch (Exception e) {
                    e = e;
                    fVar = d;
                    try {
                        C11467e.m23465a("IMMentionDao.upsert", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23123a(fVar);
                        bool = valueOf;
                        return bool.booleanValue();
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23123a(fVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fVar = d;
                    C11323v.m23123a(fVar);
                    throw th;
                }
            }
            if (d.mo21009a() <= 0) {
                z = false;
            }
            bool = Boolean.valueOf(z);
            C11323v.m23123a(d);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("IMMentionDao.upsert", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23123a(fVar);
            bool = valueOf;
            return bool.booleanValue();
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.p702im.core.p706c.C11207p> m23075a(java.lang.String r5, long r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "select * from mention where "
            r2.<init>(r3)
            com.bytedance.im.core.internal.a.e r3 = com.bytedance.p702im.core.internal.p710a.C11304e.COLUMN_CONVERSATION_ID
            java.lang.String r3 = r3.f30417f
            r2.append(r3)
            java.lang.String r3 = "=? order by "
            r2.append(r3)
            com.bytedance.im.core.internal.a.e r3 = com.bytedance.p702im.core.internal.p710a.C11304e.COLUMN_CREATED_TIME
            java.lang.String r3 = r3.f30417f
            r2.append(r3)
            java.lang.String r3 = " desc"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
            r4 = 0
            r3[r4] = r5     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
            com.bytedance.im.core.internal.a.c.b r5 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22879a(r2, r3)     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
        L_0x003d:
            boolean r2 = r5.mo20994d()     // Catch:{ Exception -> 0x0053 }
            if (r2 == 0) goto L_0x0062
            com.bytedance.im.core.internal.a.e r2 = com.bytedance.p702im.core.internal.p710a.C11304e.COLUMN_UUID     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = r2.f30417f     // Catch:{ Exception -> 0x0053 }
            int r2 = r5.mo20988a(r2)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = r5.mo20992c(r2)     // Catch:{ Exception -> 0x0053 }
            r0.add(r2)     // Catch:{ Exception -> 0x0053 }
            goto L_0x003d
        L_0x0053:
            r2 = move-exception
            goto L_0x005a
        L_0x0055:
            r6 = move-exception
            r5 = r1
            goto L_0x0075
        L_0x0058:
            r2 = move-exception
            r5 = r1
        L_0x005a:
            java.lang.String r3 = "getMentionSender"
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r3, r2)     // Catch:{ all -> 0x0074 }
            com.bytedance.p702im.core.p705b.C11176d.m22632a(r2)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r5)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x006c
            return r1
        L_0x006c:
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()
            java.util.List r5 = com.bytedance.p702im.core.internal.p710a.C11319r.m23089a(r0, r6)
            return r5
        L_0x0074:
            r6 = move-exception
        L_0x0075:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p710a.C11318q.m23075a(java.lang.String, long):java.util.List");
    }
}
