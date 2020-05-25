package com.bytedance.p702im.core.internal.p710a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p705b.C11176d;

/* renamed from: com.bytedance.im.core.internal.a.t */
public class C11321t {

    /* renamed from: a */
    private static C11321t f30470a;

    private C11321t() {
    }

    /* renamed from: a */
    public static C11321t m23117a() {
        if (f30470a == null) {
            synchronized (C11321t.class) {
                if (f30470a == null) {
                    f30470a = new C11321t();
                }
            }
        }
        return f30470a;
    }

    /* renamed from: b */
    public static String m23118b() {
        C11309j[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg_property(");
        for (C11309j jVar : C11309j.values()) {
            sb.append(jVar.f30459u);
            sb.append(" ");
            sb.append(jVar.f30460v);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: a */
    private static long m23116a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select rowid from msg_property where ");
            sb.append(C11309j.COLUMN_MSG_ID.f30459u);
            sb.append("=?");
            C11287b a = C11266d.m22879a(sb.toString(), new String[]{str});
            if (a != null) {
                try {
                    if (a.mo20993c()) {
                        long b = a.mo20991b(a.mo20988a("rowid"));
                        C11323v.m23122a(a);
                        return b;
                    }
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11467e.m23465a("getRowid", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    bVar = a;
                    th = th3;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("getRowid", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return -1;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0222, code lost:
        if (r5.mo21009a() > 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x036e, code lost:
        if (r5.mo21012b() > 0) goto L_0x0224;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21027a(com.bytedance.p702im.core.p706c.C11241u r17) {
        /*
            r16 = this;
            r1 = 0
            if (r17 == 0) goto L_0x038a
            boolean r2 = r17.invalid()
            if (r2 == 0) goto L_0x000b
            goto L_0x038a
        L_0x000b:
            r2 = 0
            java.lang.String r3 = r17.getUuid()     // Catch:{ Exception -> 0x0379 }
            long r3 = m23116a(r3)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = r17.getUuid()     // Catch:{ Exception -> 0x0379 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
            r6.<init>()     // Catch:{ Exception -> 0x0379 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
            r7.<init>()     // Catch:{ Exception -> 0x0379 }
            r8 = 0
            r10 = 1
            int r11 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0088
            java.lang.String r7 = " update msg_property set "
            r6.append(r7)     // Catch:{ Exception -> 0x0379 }
            com.bytedance.im.core.internal.a.j[] r7 = com.bytedance.p702im.core.internal.p710a.C11309j.values()     // Catch:{ Exception -> 0x0379 }
            int r11 = r7.length     // Catch:{ Exception -> 0x0379 }
            r12 = 0
        L_0x0034:
            if (r12 >= r11) goto L_0x0051
            r13 = r7[r12]     // Catch:{ Exception -> 0x0379 }
            com.bytedance.im.core.internal.a.j r14 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_MSG_ID     // Catch:{ Exception -> 0x0379 }
            java.lang.String r14 = r14.f30459u     // Catch:{ Exception -> 0x0379 }
            java.lang.String r15 = r13.f30459u     // Catch:{ Exception -> 0x0379 }
            boolean r14 = r14.equals(r15)     // Catch:{ Exception -> 0x0379 }
            if (r14 != 0) goto L_0x004e
            java.lang.String r13 = r13.f30459u     // Catch:{ Exception -> 0x0379 }
            r6.append(r13)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r13 = "=?,"
            r6.append(r13)     // Catch:{ Exception -> 0x0379 }
        L_0x004e:
            int r12 = r12 + 1
            goto L_0x0034
        L_0x0051:
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0379 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
            r7.<init>()     // Catch:{ Exception -> 0x0379 }
            int r11 = r6.length()     // Catch:{ Exception -> 0x0379 }
            int r11 = r11 - r10
            java.lang.String r6 = r6.substring(r1, r11)     // Catch:{ Exception -> 0x0379 }
            r7.append(r6)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r6 = " where "
            r7.append(r6)     // Catch:{ Exception -> 0x0379 }
            com.bytedance.im.core.internal.a.j r6 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_MSG_ID     // Catch:{ Exception -> 0x0379 }
            java.lang.String r6 = r6.f30459u     // Catch:{ Exception -> 0x0379 }
            r7.append(r6)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r6 = "='"
            r7.append(r6)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r5)     // Catch:{ Exception -> 0x0379 }
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = "'"
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0379 }
            goto L_0x00dc
        L_0x0088:
            java.lang.String r5 = " insert into msg_property("
            r6.append(r5)     // Catch:{ Exception -> 0x0379 }
            com.bytedance.im.core.internal.a.j[] r5 = com.bytedance.p702im.core.internal.p710a.C11309j.values()     // Catch:{ Exception -> 0x0379 }
            int r11 = r5.length     // Catch:{ Exception -> 0x0379 }
            r12 = 0
        L_0x0093:
            if (r12 >= r11) goto L_0x00a9
            r13 = r5[r12]     // Catch:{ Exception -> 0x0379 }
            java.lang.String r13 = r13.f30459u     // Catch:{ Exception -> 0x0379 }
            r6.append(r13)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r13 = ","
            r6.append(r13)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r13 = "?,"
            r7.append(r13)     // Catch:{ Exception -> 0x0379 }
            int r12 = r12 + 1
            goto L_0x0093
        L_0x00a9:
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0379 }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x0379 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
            r7.<init>()     // Catch:{ Exception -> 0x0379 }
            int r11 = r5.length()     // Catch:{ Exception -> 0x0379 }
            int r11 = r11 - r10
            java.lang.String r5 = r5.substring(r1, r11)     // Catch:{ Exception -> 0x0379 }
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = ") values ("
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            int r5 = r6.length()     // Catch:{ Exception -> 0x0379 }
            int r5 = r5 - r10
            java.lang.String r5 = r6.substring(r1, r5)     // Catch:{ Exception -> 0x0379 }
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = ");"
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0379 }
        L_0x00dc:
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x0379 }
            com.bytedance.im.core.internal.a.c.f r5 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22884d(r5)     // Catch:{ Exception -> 0x0379 }
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0227
            if (r5 == 0) goto L_0x021e
            if (r17 != 0) goto L_0x00ed
            goto L_0x021e
        L_0x00ed:
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_SERVER_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getServerId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_CONVERSATION_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getConversationId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_TARGET_MSG_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getTargetUuid()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_PROPERTY_TYPE     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getPropertyType()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_MSG_TYPE     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getMsgType()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_INNER_INDEX     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getIndex()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_ORDER_INDEX     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getOrderIndex()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_NET_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getNetStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_VERSION     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getVersion()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_DELETED     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getDeleted()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_CREATE_TIME     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getCreatedTime()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_SENDER     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getSender()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_CONTENT     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getContent()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_EXT     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getExtStr()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_LOCAL_INFO     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getLocalExtStr()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_PRORERTY_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getPropertyId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_PRORERTY_NAME     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getPropertyName()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_REACTION_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r0 = r17.getReactionStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r0     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            goto L_0x021e
        L_0x0217:
            r0 = move-exception
            goto L_0x0386
        L_0x021a:
            r0 = move-exception
            r2 = r5
            goto L_0x037a
        L_0x021e:
            int r0 = r5.mo21009a()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            if (r0 <= 0) goto L_0x0372
        L_0x0224:
            r1 = 1
            goto L_0x0372
        L_0x0227:
            if (r5 == 0) goto L_0x0368
            if (r17 != 0) goto L_0x022d
            goto L_0x0368
        L_0x022d:
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_MSG_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getUuid()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_SERVER_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getServerId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_CONVERSATION_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getConversationId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_TARGET_MSG_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getTargetUuid()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_PROPERTY_TYPE     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getPropertyType()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_MSG_TYPE     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getMsgType()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_INNER_INDEX     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getIndex()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_ORDER_INDEX     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getOrderIndex()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_NET_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getNetStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_VERSION     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getVersion()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_DELETED     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getDeleted()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_CREATE_TIME     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getCreatedTime()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_SENDER     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getSender()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_CONTENT     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getContent()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_EXT     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getExtStr()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_LOCAL_INFO     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getLocalExtStr()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_PRORERTY_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getPropertyId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_PRORERTY_NAME     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getPropertyName()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21011a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.internal.a.j r2 = com.bytedance.p702im.core.internal.p710a.C11309j.COLUMN_REACTION_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r0 = r17.getReactionStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r0     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.mo21010a(r2, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
        L_0x0368:
            long r2 = r5.mo21012b()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0372
            goto L_0x0224
        L_0x0372:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r5)
            goto L_0x0385
        L_0x0376:
            r0 = move-exception
            r5 = r2
            goto L_0x0386
        L_0x0379:
            r0 = move-exception
        L_0x037a:
            java.lang.String r3 = "insertOrUpdatePropertyMsg"
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r3, r0)     // Catch:{ all -> 0x0376 }
            com.bytedance.p702im.core.p705b.C11176d.m22632a(r0)     // Catch:{ all -> 0x0376 }
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r2)
        L_0x0385:
            return r1
        L_0x0386:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r5)
            throw r0
        L_0x038a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p710a.C11321t.mo21027a(com.bytedance.im.core.c.u):boolean");
    }
}
