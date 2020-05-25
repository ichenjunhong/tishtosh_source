package com.bytedance.p702im.core.internal.p710a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.utils.C11466d;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11240t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.o */
public final class C11314o {

    /* renamed from: com.bytedance.im.core.internal.a.o$a */
    static class C11316a {

        /* renamed from: a */
        public static C11314o f30465a = new C11314o();
    }

    private C11314o() {
    }

    /* renamed from: a */
    public static C11314o m23063a() {
        return C11316a.f30465a;
    }

    /* renamed from: b */
    public static String m23065b() {
        C11308i[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS participant_read(");
        for (C11308i iVar : C11308i.values()) {
            sb.append(iVar.f30436f);
            sb.append(" ");
            sb.append(iVar.f30437g);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: a */
    private static List<C11240t> m23064a(String str) {
        C11287b bVar;
        Exception e;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from participant_read where ");
            sb.append(C11308i.COLUMN_CONVERSATION_ID.f30436f);
            sb.append("=? ");
            bVar = C11266d.m22879a(sb.toString(), new String[]{str});
            while (bVar.mo20994d()) {
                try {
                    C11240t tVar = new C11240t();
                    tVar.f30273a = bVar.mo20992c(bVar.mo20988a(C11308i.COLUMN_CONVERSATION_ID.f30436f));
                    tVar.f30274b = bVar.mo20991b(bVar.mo20988a(C11308i.COLUMN_USER_ID.f30436f));
                    tVar.mo20872a(bVar.mo20991b(bVar.mo20988a(C11308i.COLUMN_MIN_INDEX.f30436f)));
                    tVar.mo20873b(bVar.mo20991b(bVar.mo20988a(C11308i.COLUMN_READ_INDEX.f30436f)));
                    tVar.mo20876c(bVar.mo20991b(bVar.mo20988a(C11308i.COLUMN_READ_ORDER.f30436f)));
                    arrayList.add(tVar);
                } catch (Exception e2) {
                    e = e2;
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
                }
            }
        } catch (Exception e3) {
            e = e3;
            bVar = null;
            C11467e.m23465a("getMemberList", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            C11323v.m23122a(bVar);
            throw th;
        }
        C11323v.m23122a(bVar);
        return arrayList;
    }

    /* renamed from: b */
    private static List<Long> m23066b(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from participant_read where ");
            sb.append(C11308i.COLUMN_CONVERSATION_ID.f30436f);
            sb.append("=? ");
            C11287b a = C11266d.m22879a(sb.toString(), new String[]{str});
            int i = -1;
            while (a.mo20994d()) {
                try {
                    if (i < 0) {
                        i = a.mo20988a(C11308i.COLUMN_USER_ID.f30436f);
                    }
                    arrayList.add(Long.valueOf(a.mo20991b(i)));
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11467e.m23465a("getMemberIdList", (Throwable) e);
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
            C11467e.m23465a("getMemberIdList", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    private static int m23062a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Long l : list) {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder();
            sb.append(C11308i.COLUMN_CONVERSATION_ID.f30436f);
            sb.append("=? AND ");
            sb.append(C11308i.COLUMN_USER_ID.f30436f);
            sb.append("=?");
            if (C11266d.m22882a("participant_read", sb.toString(), new String[]{str, String.valueOf(l)})) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final boolean mo21018a(String str, Map<Long, C11240t> map) {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet(m23066b(str));
        HashSet hashSet3 = new HashSet(hashSet);
        hashSet3.addAll(hashSet2);
        hashSet3.removeAll(hashSet);
        ArrayList arrayList = new ArrayList(hashSet3);
        ArrayList<C11240t> arrayList2 = new ArrayList<>(map.values());
        HashSet<C11240t> hashSet4 = new HashSet<>();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C11266d.m22878a();
        C11266d.m22880a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)");
        for (C11240t tVar : arrayList2) {
            if (tVar != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C11308i.COLUMN_MIN_INDEX.f30436f, Long.valueOf(tVar.f30275c));
                contentValues.put(C11308i.COLUMN_READ_INDEX.f30436f, Long.valueOf(tVar.f30276d));
                contentValues.put(C11308i.COLUMN_READ_ORDER.f30436f, Long.valueOf(tVar.f30277e));
                C11266d.m22878a();
                StringBuilder sb = new StringBuilder();
                sb.append(C11308i.COLUMN_USER_ID.f30436f);
                sb.append("=? AND ");
                sb.append(C11308i.COLUMN_CONVERSATION_ID.f30436f);
                sb.append("=?");
                if (C11266d.m22876a("participant_read", contentValues, sb.toString(), new String[]{String.valueOf(tVar.f30274b), str}) <= 0) {
                    hashSet4.add(tVar);
                    arrayList4.add(Long.valueOf(tVar.f30274b));
                } else {
                    arrayList3.add(Long.valueOf(tVar.f30274b));
                }
            }
        }
        for (C11240t tVar2 : hashSet4) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(C11308i.COLUMN_CONVERSATION_ID.f30436f, tVar2.f30273a);
            contentValues2.put(C11308i.COLUMN_USER_ID.f30436f, Long.valueOf(tVar2.f30274b));
            contentValues2.put(C11308i.COLUMN_MIN_INDEX.f30436f, Long.valueOf(tVar2.f30275c));
            contentValues2.put(C11308i.COLUMN_READ_INDEX.f30436f, Long.valueOf(tVar2.f30276d));
            contentValues2.put(C11308i.COLUMN_READ_ORDER.f30436f, Long.valueOf(tVar2.f30277e));
            C11266d.m22878a();
            C11266d.m22877a("participant_read", (String) null, contentValues2);
        }
        m23062a(str, (List<Long>) arrayList);
        C11467e.m23462a(C2240a.m6772a("IMConversationMemberReadDao.insertOrUpdateMemberRead updateList=%s, insertList=%s, deleteList=%s", new Object[]{C11466d.f30773a.mo34889b(arrayList3), C11466d.f30773a.mo34889b(arrayList4), C11466d.f30773a.mo34889b(arrayList)}));
        C11266d.m22878a().mo20960b("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)");
        return true;
    }

    /* renamed from: b */
    public final Map<Long, C11240t> mo21019b(String str, Map<Long, C11240t> map) {
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        List a = m23064a(str);
        if (!a.isEmpty()) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C11240t tVar = (C11240t) a.get(i);
                if (tVar != null) {
                    long j = tVar.f30274b;
                    if (map == null) {
                        map = new HashMap<>();
                        map.put(Long.valueOf(j), tVar.clone());
                    } else {
                        C11240t tVar2 = (C11240t) map.get(Long.valueOf(j));
                        if (tVar2 == null) {
                            tVar2 = new C11240t();
                        }
                        if (tVar != null) {
                            tVar2.f30273a = tVar.f30273a;
                            tVar2.f30274b = tVar.f30274b;
                            tVar2.mo20872a(tVar.f30275c);
                            tVar2.mo20873b(tVar.f30276d);
                            tVar2.mo20876c(tVar.f30277e);
                        }
                        map.put(Long.valueOf(j), tVar2);
                    }
                }
            }
        }
        return map;
    }
}
