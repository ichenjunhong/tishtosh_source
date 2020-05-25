package com.bytedance.p702im.core.internal.p710a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.p710a.p713c.C11302f;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11205n;
import com.bytedance.p702im.core.p706c.C11207p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.s */
public class C11320s {

    /* renamed from: a */
    private static C11320s f30469a;

    private C11320s() {
    }

    /* renamed from: a */
    public static C11320s m23105a() {
        if (f30469a == null) {
            synchronized (C11320s.class) {
                if (f30469a == null) {
                    f30469a = new C11320s();
                }
            }
        }
        return f30469a;
    }

    /* renamed from: c */
    public static String m23110c() {
        StringBuilder sb = new StringBuilder();
        sb.append(C11306g.COLUMN_MSG_UUID.key);
        sb.append("=? and ");
        sb.append(C11306g.COLUMN_KEY.key);
        sb.append("=? and ");
        sb.append(C11306g.COLUMN_IDEMPOTENT_ID.key);
        sb.append("=?");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m23111d() {
        StringBuffer stringBuffer = new StringBuffer();
        int length = C11306g.values().length;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            if (i > i2) {
                return stringBuffer.toString();
            }
            stringBuffer.append("?");
            if (i != i2) {
                stringBuffer.append(",");
            }
            i++;
        }
    }

    /* renamed from: b */
    public static String m23108b() {
        C11306g[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg_property_new(");
        for (C11306g gVar : C11306g.values()) {
            sb.append(gVar.key);
            sb.append(" ");
            sb.append(gVar.type);
            sb.append(",");
        }
        sb.append("PRIMARY KEY(");
        sb.append(C11306g.COLUMN_MSG_UUID.key);
        sb.append(",");
        sb.append(C11306g.COLUMN_KEY.key);
        sb.append(",");
        sb.append(C11306g.COLUMN_IDEMPOTENT_ID.key);
        sb.append("));");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo21025a(C11207p pVar) {
        if (pVar != null) {
            pVar.setPropertyItemListMap(m23109b(pVar.getUuid()));
        }
    }

    /* renamed from: a */
    public static void m23107a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder();
            sb.append(C11309j.COLUMN_CONVERSATION_ID.f30459u);
            sb.append("=?");
            C11266d.m22882a("msg_property_new", sb.toString(), new String[]{str});
        }
    }

    /* renamed from: a */
    private static C11205n m23104a(C11287b bVar) {
        if (bVar == null) {
            return null;
        }
        C11205n nVar = new C11205n();
        nVar.msgUuid = bVar.mo20992c(bVar.mo20988a(C11306g.COLUMN_MSG_UUID.key));
        nVar.conversationId = bVar.mo20992c(bVar.mo20988a(C11306g.COLUMN_CONVERSATION_ID.key));
        nVar.uid = Long.valueOf(bVar.mo20991b(bVar.mo20988a(C11306g.COLUMN_SENDER.key)));
        nVar.sec_uid = bVar.mo20992c(bVar.mo20988a(C11306g.COLUMN_SENDER_SEC.key));
        nVar.create_time = Long.valueOf(bVar.mo20991b(bVar.mo20988a(C11306g.COLUMN_CREATE_TIME.key)));
        nVar.idempotent_id = bVar.mo20992c(bVar.mo20988a(C11306g.COLUMN_IDEMPOTENT_ID.key));
        nVar.key = bVar.mo20992c(bVar.mo20988a(C11306g.COLUMN_KEY.key));
        nVar.value = bVar.mo20992c(bVar.mo20988a(C11306g.COLUMN_VALUE.key));
        nVar.version = bVar.mo20991b(bVar.mo20988a(C11306g.COLUMN_VERSION.key));
        nVar.status = bVar.mo20987a(bVar.mo20988a(C11306g.COLUMN_STATUS.key));
        nVar.deleted = bVar.mo20987a(bVar.mo20988a(C11306g.COLUMN_DELETED.key));
        return nVar;
    }

    /* renamed from: b */
    private static Map<String, List<C11205n>> m23109b(String str) {
        Throwable th;
        C11287b bVar;
        C11287b bVar2 = null;
        try {
            StringBuilder sb = new StringBuilder("select * from msg_property_new where ");
            sb.append(C11306g.COLUMN_MSG_UUID.key);
            sb.append("=? order by ");
            sb.append(C11306g.COLUMN_CREATE_TIME.key);
            sb.append(" asc");
            String sb2 = sb.toString();
            C11266d.m22878a();
            bVar = C11266d.m22879a(sb2, new String[]{str});
            Map<String, List<C11205n>> map = null;
            while (bVar.mo20994d()) {
                try {
                    C11205n a = m23104a(bVar);
                    if (!(a == null || a.deleted == 1)) {
                        if (map == null) {
                            map = new HashMap<>();
                        }
                        List list = (List) map.get(a.key);
                        if (list == null) {
                            list = new ArrayList();
                            map.put(a.key, list);
                        }
                        list.add(a);
                    }
                } catch (Exception e) {
                    e = e;
                    try {
                        C11467e.m23465a("IMMsgPropertyDao-getMessageProperties", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return null;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        bVar2 = bVar;
                        th = th3;
                        C11323v.m23122a(bVar2);
                        throw th;
                    }
                }
            }
            C11323v.m23122a(bVar);
            return map;
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11467e.m23465a("IMMsgPropertyDao-getMessageProperties", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return null;
        } catch (Throwable th4) {
            th = th4;
            C11323v.m23122a(bVar2);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x011e A[Catch:{ all -> 0x0111 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21026b(com.bytedance.p702im.core.p706c.C11207p r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x012c
            java.lang.String r0 = r10.getUuid()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000e
            goto L_0x012c
        L_0x000e:
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()
            com.bytedance.p702im.core.internal.utils.C11500m.m23560b()
            com.bytedance.im.core.internal.a.c.d r0 = com.bytedance.p702im.core.internal.p710a.p711a.C11265c.m22875a()
            r1 = 0
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.mo21004c()
            if (r0 == 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            java.lang.String r2 = "IMMsgPropertyDao.updateMessageProperty"
            if (r0 != 0) goto L_0x002e
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22880a(r2)
        L_0x002e:
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = "delete from msg_property_new where "
            r4.<init>(r5)     // Catch:{ Exception -> 0x0113 }
            com.bytedance.im.core.internal.a.g r5 = com.bytedance.p702im.core.internal.p710a.C11306g.COLUMN_MSG_UUID     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x0113 }
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = "='"
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = r10.getUuid()     // Catch:{ Exception -> 0x0113 }
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = "' and "
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            com.bytedance.im.core.internal.a.g r5 = com.bytedance.p702im.core.internal.p710a.C11306g.COLUMN_STATUS     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x0113 }
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = "<>1"
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = " and "
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            com.bytedance.im.core.internal.a.g r5 = com.bytedance.p702im.core.internal.p710a.C11306g.COLUMN_STATUS     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x0113 }
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = "<>4"
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = " and "
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            com.bytedance.im.core.internal.a.g r5 = com.bytedance.p702im.core.internal.p710a.C11306g.COLUMN_STATUS     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x0113 }
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = "<>3"
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0113 }
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x0113 }
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22883c(r4)     // Catch:{ Exception -> 0x0113 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = "insert or ignore into msg_property_new values("
            r4.<init>(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = m23111d()     // Catch:{ Exception -> 0x0113 }
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0113 }
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x0113 }
            com.bytedance.im.core.internal.a.c.f r4 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22884d(r4)     // Catch:{ Exception -> 0x0113 }
            java.util.Map r3 = r10.getPropertyItemListMap()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            if (r3 == 0) goto L_0x00fb
            boolean r5 = r3.isEmpty()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            if (r5 != 0) goto L_0x00fb
            java.util.Set r3 = r3.entrySet()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
        L_0x00b8:
            boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            if (r5 == 0) goto L_0x00fb
            java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            java.lang.Object r6 = r5.getKey()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            if (r6 == 0) goto L_0x00b8
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            java.util.List r5 = (java.util.List) r5     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            if (r5 == 0) goto L_0x00b8
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
        L_0x00d8:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            if (r7 == 0) goto L_0x00b8
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            com.bytedance.im.core.c.n r7 = (com.bytedance.p702im.core.p706c.C11205n) r7     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            if (r7 == 0) goto L_0x00d8
            java.lang.String r8 = r10.getUuid()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            r7.msgUuid = r8     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            java.lang.String r8 = r10.getConversationId()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            r7.conversationId = r8     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            r7.key = r6     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            m23106a(r4, r7)     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            r4.mo21012b()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            goto L_0x00d8
        L_0x00fb:
            r9.mo21025a(r10)     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            if (r0 != 0) goto L_0x0107
            com.bytedance.im.core.internal.a.a.d r10 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x010e, all -> 0x010b }
            r10.mo20960b(r2)     // Catch:{ Exception -> 0x010e, all -> 0x010b }
        L_0x0107:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r4)
            return
        L_0x010b:
            r10 = move-exception
            r3 = r4
            goto L_0x0128
        L_0x010e:
            r10 = move-exception
            r3 = r4
            goto L_0x0114
        L_0x0111:
            r10 = move-exception
            goto L_0x0128
        L_0x0113:
            r10 = move-exception
        L_0x0114:
            java.lang.String r4 = "IMMsgPropertyDao-updateMessageProperty"
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r4, r10)     // Catch:{ all -> 0x0111 }
            com.bytedance.p702im.core.p705b.C11176d.m22632a(r10)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x0124
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ all -> 0x0111 }
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22881a(r2, r1)     // Catch:{ all -> 0x0111 }
        L_0x0124:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r3)
            return
        L_0x0128:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r3)
            throw r10
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p710a.C11320s.mo21026b(com.bytedance.im.core.c.p):void");
    }

    /* renamed from: a */
    public final C11205n mo21023a(C11205n nVar, boolean z) {
        int i;
        if (nVar == null) {
            return null;
        }
        C11205n a = mo21024a(nVar.msgUuid, nVar.key, nVar.idempotent_id);
        if (a == null) {
            return null;
        }
        if (a.status != 4) {
            a = null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            String str = C11306g.COLUMN_STATUS.key;
            if (z) {
                i = 2;
            } else {
                i = 3;
            }
            contentValues.put(str, Integer.valueOf(i));
            C11266d.m22878a();
            C11266d.m22876a("msg_property_new", contentValues, m23110c(), new String[]{nVar.msgUuid, nVar.key, nVar.idempotent_id});
            return a;
        } catch (Exception e) {
            C11467e.m23465a("IMMsgPropertyDao-updateSendingProperty", (Throwable) e);
            C11176d.m22632a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m23106a(C11302f fVar, C11205n nVar) {
        if (fVar != null && nVar != null && !TextUtils.isEmpty(nVar.msgUuid)) {
            fVar.mo21011a(C11306g.COLUMN_MSG_UUID.ordinal() + 1, C11323v.m23121a(nVar.msgUuid));
            fVar.mo21011a(C11306g.COLUMN_CONVERSATION_ID.ordinal() + 1, C11323v.m23121a(nVar.conversationId));
            fVar.mo21011a(C11306g.COLUMN_KEY.ordinal() + 1, C11323v.m23121a(nVar.key));
            fVar.mo21011a(C11306g.COLUMN_IDEMPOTENT_ID.ordinal() + 1, C11323v.m23121a(nVar.idempotent_id));
            fVar.mo21010a(C11306g.COLUMN_SENDER.ordinal() + 1, nVar.uid.longValue());
            fVar.mo21011a(C11306g.COLUMN_SENDER_SEC.ordinal() + 1, C11323v.m23121a(nVar.sec_uid));
            fVar.mo21010a(C11306g.COLUMN_CREATE_TIME.ordinal() + 1, nVar.create_time.longValue());
            fVar.mo21011a(C11306g.COLUMN_VALUE.ordinal() + 1, C11323v.m23121a(nVar.value));
            fVar.mo21010a(C11306g.COLUMN_DELETED.ordinal() + 1, (long) nVar.deleted);
            fVar.mo21010a(C11306g.COLUMN_VERSION.ordinal() + 1, nVar.version);
            fVar.mo21010a(C11306g.COLUMN_STATUS.ordinal() + 1, (long) nVar.status);
        }
    }

    /* renamed from: a */
    public final C11205n mo21024a(String str, String str2, String str3) {
        C11287b bVar;
        C11287b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from msg_property_new where ");
            sb.append(m23110c());
            bVar = C11266d.m22879a(sb.toString(), new String[]{str, str2, str3});
            if (bVar != null) {
                try {
                    if (bVar.mo20994d()) {
                        C11205n a = m23104a(bVar);
                        C11323v.m23122a(bVar);
                        return a;
                    }
                } catch (Exception e) {
                    e = e;
                    try {
                        C11467e.m23465a("IMMsgPropertyDao-getMessageProperty", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        bVar2 = bVar;
                        C11323v.m23122a(bVar2);
                        throw th;
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11467e.m23465a("IMMsgPropertyDao-getMessageProperty", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11323v.m23122a(bVar2);
            throw th;
        }
        C11323v.m23122a(bVar);
        return null;
    }
}
