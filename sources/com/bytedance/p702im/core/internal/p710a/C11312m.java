package com.bytedance.p702im.core.internal.p710a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p712b.C11269a;
import com.bytedance.p702im.core.internal.p710a.p712b.C11270b;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.m */
public class C11312m {

    /* renamed from: a */
    private static C11312m f30463a;

    private C11312m() {
    }

    /* renamed from: a */
    public static C11312m m23038a() {
        if (f30463a == null) {
            synchronized (C11312m.class) {
                if (f30463a == null) {
                    f30463a = new C11312m();
                }
            }
        }
        return f30463a;
    }

    /* renamed from: b */
    public static List<C11180b> m23042b() {
        ArrayList arrayList = new ArrayList();
        C11287b bVar = null;
        try {
            StringBuilder sb = new StringBuilder("select * from conversation_list order by ");
            sb.append(C11268b.COLUMN_UPDATE_TIME.key);
            sb.append(" desc;");
            String sb2 = sb.toString();
            C11266d.m22878a();
            C11287b a = C11266d.m22879a(sb2, (String[]) null);
            if (a != null) {
                while (a.mo20994d()) {
                    try {
                        arrayList.add(m23036a(a));
                    } catch (Exception e) {
                        C11287b bVar2 = a;
                        e = e;
                        bVar = bVar2;
                        try {
                            StringBuilder sb3 = new StringBuilder("getAllConversation ");
                            sb3.append(e);
                            C11467e.m23472d(sb3.toString());
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
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            StringBuilder sb32 = new StringBuilder("getAllConversation ");
            sb32.append(e);
            C11467e.m23472d(sb32.toString());
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.bytedance.im.core.internal.a.c.b] */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.bytedance.im.core.internal.a.c.b] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.bytedance.im.core.c.b] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.bytedance.im.core.internal.a.c.b] */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.bytedance.im.core.c.b] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v4
      assigns: [?[OBJECT, ARRAY], ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.bytedance.im.core.c.b, com.bytedance.im.core.internal.a.c.b]
      mth insns count: 39
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
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.p702im.core.p706c.C11180b m23037a(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = "select * from conversation_list where "
            r0.<init>(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_ID     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r0.append(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = "=?"
            r0.append(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r3 = 0
            r2[r3] = r4     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            com.bytedance.im.core.internal.a.c.b r4 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22879a(r0, r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            boolean r0 = r4.mo20993c()     // Catch:{ Exception -> 0x0038 }
            if (r0 == 0) goto L_0x0046
            com.bytedance.im.core.c.b r0 = m23036a(r4)     // Catch:{ Exception -> 0x0038 }
            r1 = r0
            goto L_0x0046
        L_0x0038:
            r0 = move-exception
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            goto L_0x004c
        L_0x003c:
            r0 = move-exception
            r4 = r1
        L_0x003e:
            java.lang.String r2 = "getConversation "
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r2, r0)     // Catch:{ all -> 0x004a }
            com.bytedance.p702im.core.p705b.C11176d.m22632a(r0)     // Catch:{ all -> 0x004a }
        L_0x0046:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r4)
            return r1
        L_0x004a:
            r0 = move-exception
            r1 = r4
        L_0x004c:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p710a.C11312m.m23037a(java.lang.String):com.bytedance.im.core.c.b");
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.bytedance.im.core.internal.a.c.b] */
    /* JADX WARNING: type inference failed for: r5v3, types: [com.bytedance.im.core.internal.a.c.b] */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.bytedance.im.core.internal.a.c.b] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r4 = r0;
        r0 = r5;
        r5 = r4;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r4 = r0;
        r0 = r5;
        r5 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v12
      assigns: [?[OBJECT, ARRAY], ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.util.List<java.lang.String>, com.bytedance.im.core.internal.a.c.b]
      mth insns count: 54
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
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043 A[ExcHandler: all (r5v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x0021] */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m23039a(int r5) {
        /*
            r5 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = "select "
            r0.<init>(r1)     // Catch:{ Exception -> 0x0054 }
            com.bytedance.im.core.internal.a.b r1 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_ID     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = r1.key     // Catch:{ Exception -> 0x0054 }
            r0.append(r1)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = " from conversation_list"
            r0.append(r1)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0054 }
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x0054 }
            com.bytedance.im.core.internal.a.c.b r0 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22879a(r0, r5)     // Catch:{ Exception -> 0x0054 }
            if (r0 == 0) goto L_0x004e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0048, all -> 0x0043 }
            r1.<init>()     // Catch:{ Exception -> 0x0048, all -> 0x0043 }
        L_0x0026:
            boolean r5 = r0.mo20994d()     // Catch:{ Exception -> 0x003e, all -> 0x0043 }
            if (r5 == 0) goto L_0x003c
            com.bytedance.im.core.internal.a.b r5 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_ID     // Catch:{ Exception -> 0x003e, all -> 0x0043 }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x003e, all -> 0x0043 }
            int r5 = r0.mo20988a(r5)     // Catch:{ Exception -> 0x003e, all -> 0x0043 }
            java.lang.String r5 = r0.mo20992c(r5)     // Catch:{ Exception -> 0x003e, all -> 0x0043 }
            r1.add(r5)     // Catch:{ Exception -> 0x003e, all -> 0x0043 }
            goto L_0x0026
        L_0x003c:
            r5 = r1
            goto L_0x004e
        L_0x003e:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0056
        L_0x0043:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x006f
        L_0x0048:
            r1 = move-exception
            r4 = r1
            r1 = r5
            r5 = r0
            r0 = r4
            goto L_0x0056
        L_0x004e:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r0)
            goto L_0x006e
        L_0x0052:
            r0 = move-exception
            goto L_0x006f
        L_0x0054:
            r0 = move-exception
            r1 = r5
        L_0x0056:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = "getAllConversationShortId "
            r2.<init>(r3)     // Catch:{ all -> 0x0052 }
            r2.append(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0052 }
            com.bytedance.p702im.core.internal.utils.C11467e.m23472d(r2)     // Catch:{ all -> 0x0052 }
            com.bytedance.p702im.core.p705b.C11176d.m22632a(r0)     // Catch:{ all -> 0x0052 }
            com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r5)
            r5 = r1
        L_0x006e:
            return r5
        L_0x006f:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p710a.C11312m.m23039a(int):java.util.List");
    }

    /* renamed from: b */
    public static List<C11180b> m23043b(int i) {
        ArrayList arrayList = new ArrayList();
        C11287b bVar = null;
        try {
            StringBuilder sb = new StringBuilder("select * from conversation_list order by ");
            sb.append(C11268b.COLUMN_UPDATE_TIME.key);
            sb.append(" desc limit ");
            sb.append(i);
            sb.append(";");
            String sb2 = sb.toString();
            C11266d.m22878a();
            C11287b a = C11266d.m22879a(sb2, (String[]) null);
            if (a != null) {
                while (a.mo20994d()) {
                    try {
                        arrayList.add(m23036a(a));
                    } catch (Exception e) {
                        Exception exc = e;
                        bVar = a;
                        e = exc;
                        try {
                            StringBuilder sb3 = new StringBuilder("getConversationLimit ");
                            sb3.append(e);
                            C11467e.m23472d(sb3.toString());
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
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            StringBuilder sb32 = new StringBuilder("getConversationLimit ");
            sb32.append(e);
            C11467e.m23472d(sb32.toString());
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m23046c(C11180b bVar) {
        boolean z;
        if (bVar == null || TextUtils.isEmpty(bVar.getConversationId())) {
            return false;
        }
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder();
            sb.append(C11268b.COLUMN_ID.key);
            sb.append("=?");
            z = C11266d.m22882a("conversation_list", sb.toString(), new String[]{bVar.getConversationId()});
            if (z) {
                try {
                    C11266d.m22878a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C11305f.COLUMN_CONVERSATION_ID.key);
                    sb2.append("=?");
                    C11266d.m22882a("msg", sb2.toString(), new String[]{bVar.getConversationId()});
                    C11317p.m23070a();
                    C11317p.m23073b(bVar.getConversationId());
                    C11311l.m23032a();
                    C11311l.m23035b(bVar.getConversationId());
                    C11313n.m23051a();
                    C11313n.m23061d(bVar.getConversationId());
                    C11270b.m22889a().mo20962a(bVar.getConversationId(), C11269a.COLUMN_CONVERSATION_ID.key);
                } catch (Exception e) {
                    e = e;
                }
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
            C11467e.m23465a("deleteConversation", (Throwable) e);
            C11176d.m22632a(e);
            return z;
        }
        return z;
    }

    /* renamed from: a */
    private static C11180b m23036a(C11287b bVar) {
        boolean z;
        if (bVar == null) {
            return null;
        }
        C11180b bVar2 = new C11180b();
        bVar2.setConversationId(bVar.mo20992c(bVar.mo20988a(C11268b.COLUMN_ID.key)));
        bVar2.setConversationShortId(bVar.mo20991b(bVar.mo20988a(C11268b.COLUMN_SHORT_ID.key)));
        bVar2.setUpdatedTime(bVar.mo20991b(bVar.mo20988a(C11268b.COLUMN_UPDATE_TIME.key)));
        bVar2.setUnreadCount((long) bVar.mo20987a(bVar.mo20988a(C11268b.COLUMN_UNREAD_COUNT.key)));
        bVar2.setTicket(bVar.mo20992c(bVar.mo20988a(C11268b.COLUMN_COLUMN_TICKET.key)));
        bVar2.setConversationType(bVar.mo20987a(bVar.mo20988a(C11268b.COLUMN_CONVERSATION_TYPE.key)));
        bVar2.setDraftTime(bVar.mo20991b(bVar.mo20988a(C11268b.COLUMN_DRAFT_TIME.key)));
        bVar2.setDraftContent(bVar.mo20992c(bVar.mo20988a(C11268b.COLUMN_DRAFT_CONTENT.key)));
        bVar2.setMinIndex(bVar.mo20991b(bVar.mo20988a(C11268b.COLUMN_MIN_INDEX.key)));
        bVar2.setLocalExtStr(bVar.mo20992c(bVar.mo20988a(C11268b.COLUMN_LOCAL_INFO.key)));
        bVar2.setReadIndex(bVar.mo20991b(bVar.mo20988a(C11268b.COLUMN_READ_INDEX.key)));
        bVar2.setLastMessageIndex(bVar.mo20991b(bVar.mo20988a(C11268b.COLUMN_LAST_MSG_INDEX.key)));
        bVar2.setInboxType(bVar.mo20987a(bVar.mo20988a(C11268b.COLUMN_INBOX.key)));
        boolean z2 = false;
        if (bVar.mo20987a(bVar.mo20988a(C11268b.COLUMN_IS_MEMBER.key)) == 1) {
            z = true;
        } else {
            z = false;
        }
        bVar2.setIsMember(z);
        if (bVar.mo20987a(bVar.mo20988a(C11268b.COLUMN_HAS_MORE.key)) == 1) {
            z2 = true;
        }
        bVar2.setHasMore(z2);
        bVar2.setMemberCount(bVar.mo20987a(bVar.mo20988a(C11268b.COLUMN_MEMBER_COUNT.key)));
        bVar2.setStatus(bVar.mo20987a(bVar.mo20988a(C11268b.COLUMN_STATUS.key)));
        bVar2.setMemberStr(bVar.mo20992c(bVar.mo20988a(C11268b.COLUMN_PARTICIPANT.key)));
        C11313n.m23051a();
        bVar2.setMemberIds(C11313n.m23052a(bVar2.getConversationId()));
        if (bVar2.getConversationType() == C11170a.f30115a) {
            C11313n.m23051a();
            bVar2.setSingleChatMembers(C11313n.m23057b(bVar2.getConversationId()));
        }
        C11319r.m23086a();
        bVar2.setLastMessage(C11319r.m23098i(bVar2.getConversationId()));
        C11311l.m23032a();
        bVar2.setCoreInfo(C11311l.m23031a(bVar2.getConversationId()));
        C11317p.m23070a();
        bVar2.setSettingInfo(C11317p.m23069a(bVar2.getConversationId()));
        C11318q.m23074a();
        bVar2.setMentionMessages(C11318q.m23075a(bVar2.getConversationId(), bVar2.getReadIndex()));
        bVar2.setLastMessageOrderIndex(bVar.mo20991b(bVar.mo20988a(C11268b.COLUMN_LAST_MSG_ORDER_INDEX.key)));
        return bVar2;
    }

    /* renamed from: b */
    public static boolean m23045b(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from conversation_list where ");
            sb.append(C11268b.COLUMN_ID.key);
            sb.append("=?");
            C11287b a = C11266d.m22879a(sb.toString(), new String[]{str});
            try {
                if (a.mo20990b() > 0) {
                    z = true;
                }
                C11323v.m23122a(a);
                return z;
            } catch (Exception e) {
                Exception exc = e;
                bVar = a;
                e = exc;
                try {
                    C11467e.m23465a("getConversation ", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return false;
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
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("getConversation ", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m23047c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11266d.m22878a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11268b.COLUMN_ID.key);
        sb.append("=?");
        boolean a = C11266d.m22882a("conversation_list", sb.toString(), new String[]{str});
        if (a) {
            C11319r.m23086a();
            C11319r.m23093c(str);
            C11317p.m23070a();
            C11317p.m23073b(str);
            C11311l.m23032a();
            C11311l.m23035b(str);
            C11313n.m23051a();
            C11313n.m23061d(str);
            C11321t.m23117a();
            if (!TextUtils.isEmpty(str)) {
                C11266d.m22878a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C11309j.COLUMN_CONVERSATION_ID.f30459u);
                sb2.append("=?");
                C11266d.m22882a("msg_property", sb2.toString(), new String[]{str});
            }
            C11320s.m23105a();
            C11320s.m23107a(str);
            C11270b.m22889a().mo20962a(str, C11269a.COLUMN_CONVERSATION_ID.key);
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m23040a(C11180b bVar) {
        boolean z = false;
        if (bVar == null || TextUtils.isEmpty(bVar.getConversationId())) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11268b.COLUMN_ID.key, bVar.getConversationId());
        contentValues.put(C11268b.COLUMN_SHORT_ID.key, Long.valueOf(bVar.getConversationShortId()));
        contentValues.put(C11268b.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(bVar.getLastMessageIndex()));
        contentValues.put(C11268b.COLUMN_UPDATE_TIME.key, Long.valueOf(bVar.getUpdatedTime()));
        contentValues.put(C11268b.COLUMN_UNREAD_COUNT.key, Long.valueOf(bVar.getUnreadCount()));
        contentValues.put(C11268b.COLUMN_COLUMN_TICKET.key, bVar.getTicket());
        contentValues.put(C11268b.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(bVar.getConversationType()));
        contentValues.put(C11268b.COLUMN_DRAFT_TIME.key, Long.valueOf(bVar.getDraftTime()));
        contentValues.put(C11268b.COLUMN_DRAFT_CONTENT.key, bVar.getDraftContent());
        contentValues.put(C11268b.COLUMN_MIN_INDEX.key, Long.valueOf(bVar.getMinIndex()));
        contentValues.put(C11268b.COLUMN_LOCAL_INFO.key, bVar.getLocalExtStr());
        contentValues.put(C11268b.COLUMN_READ_INDEX.key, Long.valueOf(bVar.getReadIndex()));
        contentValues.put(C11268b.COLUMN_INBOX.key, Integer.valueOf(bVar.getInboxType()));
        contentValues.put(C11268b.COLUMN_IS_MEMBER.key, Integer.valueOf(bVar.isMember() ? 1 : 0));
        contentValues.put(C11268b.COLUMN_HAS_MORE.key, Integer.valueOf(bVar.hasMore() ? 1 : 0));
        contentValues.put(C11268b.COLUMN_MEMBER_COUNT.key, Integer.valueOf(bVar.getMemberCount()));
        contentValues.put(C11268b.COLUMN_STATUS.key, Integer.valueOf(bVar.getStatus()));
        contentValues.put(C11268b.COLUMN_PARTICIPANT.key, bVar.getMemberStr());
        contentValues.put(C11268b.COLUMN_LAST_MSG_ORDER_INDEX.key, Long.valueOf(bVar.getLastMessageOrderIndex()));
        if (bVar.getCoreInfo() != null) {
            C11311l.m23032a();
            C11311l.m23033a(bVar.getCoreInfo());
        }
        if (bVar.getSettingInfo() != null) {
            C11317p.m23070a();
            C11317p.m23071a(bVar.getSettingInfo());
        }
        C11266d.m22878a();
        if (C11266d.m22877a("conversation_list", (String) null, contentValues) >= 0) {
            z = true;
        }
        if (z) {
            C11270b.m22889a().mo20965a(true, (Object) bVar);
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01ae, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01b0, code lost:
        r12 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x01ae A[Catch:{ Exception -> 0x01b0, all -> 0x01ae }, ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0080] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m23044b(com.bytedance.p702im.core.p706c.C11180b r12) {
        /*
            r0 = 0
            if (r12 == 0) goto L_0x0206
            java.lang.String r1 = r12.getConversationId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x000f
            goto L_0x0206
        L_0x000f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f1 }
            r3.<init>()     // Catch:{ Exception -> 0x01f1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f1 }
            r4.<init>()     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r5 = " replace into conversation_list("
            r3.append(r5)     // Catch:{ Exception -> 0x01f1 }
            com.bytedance.im.core.internal.a.b[] r5 = com.bytedance.p702im.core.internal.p710a.C11268b.values()     // Catch:{ Exception -> 0x01f1 }
            int r6 = r5.length     // Catch:{ Exception -> 0x01f1 }
            r7 = 0
        L_0x0029:
            if (r7 >= r6) goto L_0x003f
            r8 = r5[r7]     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r8 = r8.key     // Catch:{ Exception -> 0x01f1 }
            r3.append(r8)     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r8 = ","
            r3.append(r8)     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r8 = "?,"
            r4.append(r8)     // Catch:{ Exception -> 0x01f1 }
            int r7 = r7 + 1
            goto L_0x0029
        L_0x003f:
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01f1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f1 }
            r5.<init>()     // Catch:{ Exception -> 0x01f1 }
            int r6 = r3.length()     // Catch:{ Exception -> 0x01f1 }
            r7 = 1
            int r6 = r6 - r7
            java.lang.String r3 = r3.substring(r0, r6)     // Catch:{ Exception -> 0x01f1 }
            r5.append(r3)     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r3 = ") values ("
            r5.append(r3)     // Catch:{ Exception -> 0x01f1 }
            int r3 = r4.length()     // Catch:{ Exception -> 0x01f1 }
            int r3 = r3 - r7
            java.lang.String r3 = r4.substring(r0, r3)     // Catch:{ Exception -> 0x01f1 }
            r5.append(r3)     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r3 = ");"
            r5.append(r3)     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x01f1 }
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x01f1 }
            com.bytedance.im.core.internal.a.c.f r3 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22884d(r3)     // Catch:{ Exception -> 0x01f1 }
            if (r3 == 0) goto L_0x01b3
            if (r12 != 0) goto L_0x0080
            goto L_0x01b3
        L_0x0080:
            r3.mo21014d()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_ID     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            java.lang.String r4 = r12.getConversationId()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            java.lang.String r4 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21011a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_SHORT_ID     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            long r4 = r12.getConversationShortId()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_CONVERSATION_TYPE     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            int r4 = r12.getConversationType()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            long r4 = (long) r4     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_LAST_MSG_INDEX     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            long r4 = r12.getLastMessageIndex()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_UPDATE_TIME     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            long r4 = r12.getUpdatedTime()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_UNREAD_COUNT     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            long r4 = r12.getUnreadCount()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_READ_INDEX     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            long r4 = r12.getReadIndex()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_MIN_INDEX     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            long r4 = r12.getMinIndex()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_DRAFT_TIME     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            long r4 = r12.getDraftTime()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_COLUMN_TICKET     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            java.lang.String r4 = r12.getTicket()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            java.lang.String r4 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21011a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_DRAFT_CONTENT     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            java.lang.String r4 = r12.getDraftContent()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            java.lang.String r4 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21011a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_LOCAL_INFO     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            java.lang.String r4 = r12.getLocalExtStr()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            java.lang.String r4 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21011a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_INBOX     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            int r4 = r12.getInboxType()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            long r4 = (long) r4     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_IS_MEMBER     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            boolean r4 = r12.isMember()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r5 = 0
            r8 = 1
            if (r4 == 0) goto L_0x015e
            r10 = r8
            goto L_0x015f
        L_0x015e:
            r10 = r5
        L_0x015f:
            r3.mo21010a(r2, r10)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_HAS_MORE     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            boolean r4 = r12.hasMore()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            if (r4 == 0) goto L_0x0170
            r5 = r8
        L_0x0170:
            r3.mo21010a(r2, r5)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_MEMBER_COUNT     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            int r4 = r12.getMemberCount()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            long r4 = (long) r4     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_STATUS     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            int r4 = r12.getStatus()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            long r4 = (long) r4     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_PARTICIPANT     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            java.lang.String r4 = r12.getMemberStr()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21011a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.internal.a.b r2 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_LAST_MSG_ORDER_INDEX     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            int r2 = r2 + r7
            long r4 = r12.getLastMessageOrderIndex()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r3.mo21010a(r2, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            goto L_0x01b3
        L_0x01ae:
            r12 = move-exception
            goto L_0x0202
        L_0x01b0:
            r12 = move-exception
        L_0x01b1:
            r2 = r3
            goto L_0x01f2
        L_0x01b3:
            int r2 = r3.mo21009a()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            if (r2 <= 0) goto L_0x01ba
            goto L_0x01bb
        L_0x01ba:
            r7 = 0
        L_0x01bb:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            com.bytedance.im.core.c.c r1 = r12.getCoreInfo()     // Catch:{ Exception -> 0x01eb, all -> 0x01ae }
            if (r1 == 0) goto L_0x01cf
            com.bytedance.p702im.core.internal.p710a.C11311l.m23032a()     // Catch:{ Exception -> 0x01eb, all -> 0x01ae }
            com.bytedance.im.core.c.c r1 = r12.getCoreInfo()     // Catch:{ Exception -> 0x01eb, all -> 0x01ae }
            com.bytedance.p702im.core.internal.p710a.C11311l.m23033a(r1)     // Catch:{ Exception -> 0x01eb, all -> 0x01ae }
        L_0x01cf:
            com.bytedance.im.core.c.f r1 = r12.getSettingInfo()     // Catch:{ Exception -> 0x01eb, all -> 0x01ae }
            if (r1 == 0) goto L_0x01df
            com.bytedance.p702im.core.internal.p710a.C11317p.m23070a()     // Catch:{ Exception -> 0x01eb, all -> 0x01ae }
            com.bytedance.im.core.c.f r1 = r12.getSettingInfo()     // Catch:{ Exception -> 0x01eb, all -> 0x01ae }
            com.bytedance.p702im.core.internal.p710a.C11317p.m23071a(r1)     // Catch:{ Exception -> 0x01eb, all -> 0x01ae }
        L_0x01df:
            com.bytedance.im.core.internal.a.b.b r1 = com.bytedance.p702im.core.internal.p710a.p712b.C11270b.m22889a()     // Catch:{ Exception -> 0x01eb, all -> 0x01ae }
            r1.mo20965a(r0, r12)     // Catch:{ Exception -> 0x01eb, all -> 0x01ae }
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r3)
            r1 = r2
            goto L_0x01fd
        L_0x01eb:
            r12 = move-exception
            r1 = r2
            goto L_0x01b1
        L_0x01ee:
            r12 = move-exception
            r3 = r2
            goto L_0x0202
        L_0x01f1:
            r12 = move-exception
        L_0x01f2:
            java.lang.String r0 = "updateConversation "
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r0, r12)     // Catch:{ all -> 0x01ee }
            com.bytedance.p702im.core.p705b.C11176d.m22632a(r12)     // Catch:{ all -> 0x01ee }
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r2)
        L_0x01fd:
            boolean r12 = r1.booleanValue()
            return r12
        L_0x0202:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r3)
            throw r12
        L_0x0206:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p710a.C11312m.m23044b(com.bytedance.im.core.c.b):boolean");
    }

    /* renamed from: a */
    public static boolean m23041a(List<String> list) {
        if (list.isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append('\"');
            sb.append(str);
            sb.append('\"');
            sb.append(",");
        }
        String sb2 = sb.toString();
        C11266d.m22878a();
        StringBuilder sb3 = new StringBuilder("delete from conversation_list where ");
        sb3.append(C11268b.COLUMN_ID.key);
        sb3.append(" in (");
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(")");
        boolean c = C11266d.m22883c(sb3.toString());
        if (c) {
            C11270b.m22889a().mo20964a(list, C11269a.COLUMN_CONVERSATION_ID.key);
        }
        return c;
    }
}
