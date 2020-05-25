package com.bytedance.p702im.core.internal.p710a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p712b.C11269a;
import com.bytedance.p702im.core.internal.p710a.p712b.C11270b;
import com.bytedance.p702im.core.internal.p710a.p712b.C11273c;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11206o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.n */
public class C11313n {

    /* renamed from: a */
    private static C11313n f30464a;

    private C11313n() {
    }

    /* renamed from: a */
    public static boolean m23054a(String str, int i, List<C11206o> list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return false;
        }
        ArrayList<C11206o> arrayList = new ArrayList<>();
        C11266d.m22878a();
        C11266d.m22880a("IMConversationMemberDao.insertOrUpdateMember(String,List)");
        for (C11206o oVar : list) {
            if (oVar != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C11307h.COLUMN_SORT_ORDER.f30428g, Long.valueOf(oVar.getSortOrder()));
                contentValues.put(C11307h.COLUMN_ROLE.f30428g, Integer.valueOf(oVar.getRole()));
                contentValues.put(C11307h.COLUMN_ALIAS.f30428g, oVar.getAlias());
                contentValues.put(C11307h.COLUMN_SEC_UID.f30428g, oVar.getSecUid());
                C11266d.m22878a();
                StringBuilder sb = new StringBuilder();
                sb.append(C11307h.COLUMN_USER_ID.f30428g);
                sb.append("=? AND ");
                sb.append(C11307h.COLUMN_CONVERSATION_ID.f30428g);
                sb.append("=?");
                if (C11266d.m22876a("participant", contentValues, sb.toString(), new String[]{String.valueOf(oVar.getUid()), str}) <= 0) {
                    oVar.setConversationType(i);
                    arrayList.add(oVar);
                } else {
                    C11270b.m22889a().mo20965a(false, (Object) oVar);
                }
            }
        }
        for (C11206o oVar2 : arrayList) {
            ContentValues a = m23048a(oVar2);
            C11266d.m22878a();
            if (C11266d.m22877a("participant", (String) null, a) > 0) {
                C11270b.m22889a().mo20965a(true, (Object) oVar2);
            }
        }
        C11266d.m22878a().mo20960b("IMConversationMemberDao.insertOrUpdateMember(String,List)");
        C11472i.m23483a().mo20720g(list);
        return true;
    }

    /* renamed from: a */
    public static C11313n m23051a() {
        if (f30464a == null) {
            synchronized (C11313n.class) {
                if (f30464a == null) {
                    f30464a = new C11313n();
                }
            }
        }
        return f30464a;
    }

    /* renamed from: b */
    public static String m23056b() {
        C11307h[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS participant(");
        for (C11307h hVar : C11307h.values()) {
            sb.append(hVar.f30428g);
            sb.append(" ");
            sb.append(hVar.f30429h);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: d */
    public static boolean m23061d(String str) {
        C11266d.m22878a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11307h.COLUMN_CONVERSATION_ID.f30428g);
        sb.append("=?");
        boolean a = C11266d.m22882a("participant", sb.toString(), new String[]{str});
        if (a) {
            C11270b.m22889a().mo20963a(str, C11269a.COLUMN_CONVERSATION_ID.key, 3);
        }
        return a;
    }

    /* renamed from: a */
    private static ContentValues m23048a(C11206o oVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11307h.COLUMN_USER_ID.f30428g, Long.valueOf(oVar.getUid()));
        contentValues.put(C11307h.COLUMN_ALIAS.f30428g, oVar.getAlias());
        contentValues.put(C11307h.COLUMN_CONVERSATION_ID.f30428g, oVar.getConversationId());
        contentValues.put(C11307h.COLUMN_ROLE.f30428g, Integer.valueOf(oVar.getRole()));
        contentValues.put(C11307h.COLUMN_SORT_ORDER.f30428g, Long.valueOf(oVar.getSortOrder()));
        contentValues.put(C11307h.COLUMN_SEC_UID.f30428g, oVar.getSecUid());
        return contentValues;
    }

    /* renamed from: a */
    private static C11206o m23049a(C11287b bVar) {
        C11206o oVar = new C11206o();
        oVar.setAlias(bVar.mo20992c(bVar.mo20988a(C11307h.COLUMN_ALIAS.f30428g)));
        oVar.setConversationId(bVar.mo20992c(bVar.mo20988a(C11307h.COLUMN_CONVERSATION_ID.f30428g)));
        oVar.setRole(bVar.mo20987a(bVar.mo20988a(C11307h.COLUMN_ROLE.f30428g)));
        oVar.setSortOrder((long) bVar.mo20987a(bVar.mo20988a(C11307h.COLUMN_SORT_ORDER.f30428g)));
        oVar.setUid(bVar.mo20991b(bVar.mo20988a(C11307h.COLUMN_USER_ID.f30428g)));
        oVar.setSecUid(bVar.mo20992c(bVar.mo20988a(C11307h.COLUMN_SEC_UID.f30428g)));
        return oVar;
    }

    /* renamed from: c */
    public static long m23060c(String str) {
        StringBuilder sb = new StringBuilder("select * from participant where ");
        sb.append(C11307h.COLUMN_CONVERSATION_ID.f30428g);
        sb.append("=? order by ");
        sb.append(C11307h.COLUMN_SORT_ORDER.f30428g);
        sb.append(" desc limit 1");
        String sb2 = sb.toString();
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            C11287b a = C11266d.m22879a(sb2, new String[]{str});
            if (a != null) {
                try {
                    if (a.mo20993c()) {
                        long b = a.mo20991b(a.mo20988a(C11307h.COLUMN_SORT_ORDER.f30428g));
                        C11323v.m23122a(a);
                        return b;
                    }
                } catch (Exception e) {
                    e = e;
                    bVar = a;
                    try {
                        C11467e.m23465a("removeMemberOverOrder", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("removeMemberOverOrder", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return 0;
        }
        return 0;
    }

    /* renamed from: b */
    public static List<C11206o> m23057b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from participant where ");
            sb.append(C11307h.COLUMN_CONVERSATION_ID.f30428g);
            sb.append("=? order by ");
            sb.append(C11307h.COLUMN_SORT_ORDER.f30428g);
            C11287b a = C11266d.m22879a(sb.toString(), new String[]{str});
            while (a.mo20994d()) {
                try {
                    arrayList.add(m23049a(a));
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11467e.m23465a("getMemberList", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("getMemberList", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Long> m23052a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from participant where ");
            sb.append(C11307h.COLUMN_CONVERSATION_ID.f30428g);
            sb.append("=? order by ");
            sb.append(C11307h.COLUMN_SORT_ORDER.f30428g);
            C11287b a = C11266d.m22879a(sb.toString(), new String[]{str});
            int i = -1;
            while (a.mo20994d()) {
                try {
                    if (i < 0) {
                        i = a.mo20988a(C11307h.COLUMN_USER_ID.f30428g);
                    }
                    arrayList.add(Long.valueOf(a.mo20991b(i)));
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11467e.m23465a("getMemberId", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("getMemberId", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static int m23055b(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        C11266d.m22878a();
        C11266d.m22880a("IMConversationMemberDao.removeMember(String,List)");
        int i = 0;
        for (Long l : list) {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder();
            sb.append(C11307h.COLUMN_CONVERSATION_ID.f30428g);
            sb.append("=? AND ");
            sb.append(C11307h.COLUMN_USER_ID.f30428g);
            sb.append("=?");
            if (C11266d.m22882a("participant", sb.toString(), new String[]{str, String.valueOf(l)})) {
                i++;
                C11273c.m22900a();
                C11273c.m22902a(str, String.valueOf(l));
            }
        }
        C11266d.m22878a().mo20960b("IMConversationMemberDao.removeMember(String,List)");
        return i;
    }

    /* renamed from: c */
    public static int m23059c(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Long l : list) {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder();
            sb.append(C11307h.COLUMN_CONVERSATION_ID.f30428g);
            sb.append("=? AND ");
            sb.append(C11307h.COLUMN_USER_ID.f30428g);
            sb.append("=?");
            if (C11266d.m22882a("participant", sb.toString(), new String[]{str, String.valueOf(l)})) {
                i++;
                C11273c.m22900a();
                C11273c.m22902a(str, String.valueOf(l));
            }
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.bytedance.im.core.internal.a.c.b] */
    /* JADX WARNING: type inference failed for: r5v1, types: [com.bytedance.im.core.c.o] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.bytedance.im.core.internal.a.c.b] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.bytedance.im.core.internal.a.c.b] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r6v8, types: [com.bytedance.im.core.c.o] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2
      assigns: []
      uses: []
      mth insns count: 67
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.p702im.core.p706c.C11206o m23050a(java.lang.String r5, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L_0x0097
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x000f
            goto L_0x0097
        L_0x000f:
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "select * from participant where "
            r0.<init>(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.internal.a.h r2 = com.bytedance.p702im.core.internal.p710a.C11307h.COLUMN_CONVERSATION_ID     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.f30428g     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "=?  and "
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.internal.a.h r2 = com.bytedance.p702im.core.internal.p710a.C11307h.COLUMN_USER_ID     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.f30428g     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "=? and "
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.internal.a.h r2 = com.bytedance.p702im.core.internal.p710a.C11307h.COLUMN_ROLE     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.f30428g     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = " in ("
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.proto.GroupRole r2 = com.bytedance.p702im.core.proto.GroupRole.OWNER     // Catch:{ Exception -> 0x0085 }
            int r2 = r2.getValue()     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = ","
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.proto.GroupRole r2 = com.bytedance.p702im.core.proto.GroupRole.MANAGER     // Catch:{ Exception -> 0x0085 }
            int r2 = r2.getValue()     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = ") "
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0085 }
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0085 }
            r3 = 0
            r2[r3] = r5     // Catch:{ Exception -> 0x0085 }
            r5 = 1
            r2[r5] = r6     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.internal.a.c.b r5 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22879a(r0, r2)     // Catch:{ Exception -> 0x0085 }
        L_0x006a:
            boolean r6 = r5.mo20994d()     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            if (r6 == 0) goto L_0x0076
            com.bytedance.im.core.c.o r6 = m23049a(r5)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r1 = r6
            goto L_0x006a
        L_0x0076:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r5)
            r5 = r1
            goto L_0x0092
        L_0x007b:
            r6 = move-exception
            r1 = r5
            goto L_0x0093
        L_0x007e:
            r6 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
            goto L_0x0087
        L_0x0083:
            r6 = move-exception
            goto L_0x0093
        L_0x0085:
            r6 = move-exception
            r5 = r1
        L_0x0087:
            java.lang.String r0 = "queryMember"
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r0, r6)     // Catch:{ all -> 0x0083 }
            com.bytedance.p702im.core.p705b.C11176d.m22632a(r6)     // Catch:{ all -> 0x0083 }
            com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r1)
        L_0x0092:
            return r5
        L_0x0093:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r1)
            throw r6
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p710a.C11313n.m23050a(java.lang.String, java.lang.String):com.bytedance.im.core.c.o");
    }

    /* renamed from: a */
    public static List<C11206o> m23053a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from participant where ");
            sb.append(C11307h.COLUMN_CONVERSATION_ID.f30428g);
            sb.append("=? and ");
            sb.append(C11307h.COLUMN_USER_ID.f30428g);
            sb.append(" in (");
            sb.append(C11322u.m23120a(list, ","));
            sb.append(") order by ");
            sb.append(C11307h.COLUMN_SORT_ORDER.f30428g);
            C11287b a = C11266d.m22879a(sb.toString(), new String[]{str});
            while (a.mo20994d()) {
                try {
                    arrayList.add(m23049a(a));
                } catch (Exception e) {
                    e = e;
                    bVar = a;
                    try {
                        C11467e.m23465a("getMemberList", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("getMemberList", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m23058b(String str, int i, List<C11206o> list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return false;
        }
        ArrayList<C11206o> arrayList = new ArrayList<>();
        for (C11206o oVar : list) {
            if (oVar != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C11307h.COLUMN_SORT_ORDER.f30428g, Long.valueOf(oVar.getSortOrder()));
                contentValues.put(C11307h.COLUMN_ROLE.f30428g, Integer.valueOf(oVar.getRole()));
                contentValues.put(C11307h.COLUMN_ALIAS.f30428g, oVar.getAlias());
                contentValues.put(C11307h.COLUMN_SEC_UID.f30428g, oVar.getSecUid());
                C11266d.m22878a();
                StringBuilder sb = new StringBuilder();
                sb.append(C11307h.COLUMN_USER_ID.f30428g);
                sb.append("=? AND ");
                sb.append(C11307h.COLUMN_CONVERSATION_ID.f30428g);
                sb.append("=?");
                if (C11266d.m22876a("participant", contentValues, sb.toString(), new String[]{String.valueOf(oVar.getUid()), str}) <= 0) {
                    oVar.setConversationType(i);
                    arrayList.add(oVar);
                } else {
                    C11270b.m22889a().mo20965a(false, (Object) oVar);
                }
            }
        }
        for (C11206o oVar2 : arrayList) {
            ContentValues a = m23048a(oVar2);
            C11266d.m22878a();
            if (C11266d.m22877a("participant", (String) null, a) > 0) {
                C11270b.m22889a().mo20965a(true, (Object) oVar2);
            }
        }
        C11472i.m23483a().mo20720g(list);
        return true;
    }
}
