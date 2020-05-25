package com.bytedance.p702im.core.internal.p710a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11178a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.k */
public class C11310k {

    /* renamed from: a */
    private static C11310k f30461a;

    private C11310k() {
    }

    /* renamed from: a */
    public static C11310k m23026a() {
        if (f30461a == null) {
            synchronized (C11310k.class) {
                if (f30461a == null) {
                    f30461a = new C11310k();
                }
            }
        }
        return f30461a;
    }

    /* renamed from: b */
    public static String m23029b() {
        C11262a[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists attchment (");
        for (C11262a aVar : C11262a.values()) {
            sb.append(aVar.f30346l);
            sb.append(" ");
            sb.append(aVar.f30347m);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: a */
    public static List<C11178a> m23027a(String str) {
        C11287b bVar;
        Exception e;
        C11178a aVar;
        ArrayList arrayList = new ArrayList();
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from attchment where ");
            sb.append(C11262a.COLUMN_UUID.f30346l);
            sb.append("=?");
            bVar = C11266d.m22879a(sb.toString(), new String[]{str});
            while (bVar.mo20994d()) {
                try {
                    if (bVar == null) {
                        aVar = null;
                    } else {
                        aVar = new C11178a();
                        aVar.setMsgUuid(bVar.mo20992c(bVar.mo20988a(C11262a.COLUMN_UUID.f30346l)));
                        aVar.setLocalPath(bVar.mo20992c(bVar.mo20988a(C11262a.COLUMN_LOCAL_URI.f30346l)));
                        aVar.setRemoteUrl(bVar.mo20992c(bVar.mo20988a(C11262a.COLUMN_REMOTE_URI.f30346l)));
                        aVar.setIndex(bVar.mo20987a(bVar.mo20988a(C11262a.COLUMN_INDEX.f30346l)));
                        aVar.setLength(bVar.mo20991b(bVar.mo20988a(C11262a.COLUMN_SIZE.f30346l)));
                        aVar.setType(bVar.mo20992c(bVar.mo20988a(C11262a.COLUMN_TYPE.f30346l)));
                        aVar.setExtStr(bVar.mo20992c(bVar.mo20988a(C11262a.COLUMN_EXT.f30346l)));
                        aVar.setStatus(bVar.mo20987a(bVar.mo20988a(C11262a.COLUMN_STATUS.f30346l)));
                        aVar.setHash(bVar.mo20992c(bVar.mo20988a(C11262a.COLUMN_HASH.f30346l)));
                        aVar.setDisplayType(bVar.mo20992c(bVar.mo20988a(C11262a.COLUMN_DISPLAY_TYPE.f30346l)));
                        aVar.setMimeType(bVar.mo20992c(bVar.mo20988a(C11262a.COLUMN_MIME_TYPE.f30346l)));
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C11467e.m23465a("get attachment ", (Throwable) e);
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
            C11467e.m23465a("get attachment ", (Throwable) e);
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
    public final boolean mo21017b(List<C11178a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (C11178a aVar : list) {
            if (aVar != null && !TextUtils.isEmpty(aVar.getMsgUuid())) {
                sb.append(",\"");
                sb.append(aVar.getMsgUuid());
                sb.append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            StringBuilder sb3 = new StringBuilder("(");
            sb3.append(sb2.substring(1));
            sb3.append(")");
            String sb4 = sb3.toString();
            C11266d.m22878a();
            StringBuilder sb5 = new StringBuilder("delete from attchment where ");
            sb5.append(C11262a.COLUMN_UUID.f30346l);
            sb5.append(" in ");
            sb5.append(sb4);
            if (C11266d.m22883c(sb5.toString())) {
                return m23028a(list);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m23028a(List<C11178a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i = 0;
        for (C11178a aVar : list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C11262a.COLUMN_UUID.f30346l, aVar.getMsgUuid());
            contentValues.put(C11262a.COLUMN_LOCAL_URI.f30346l, aVar.getLocalPath());
            contentValues.put(C11262a.COLUMN_REMOTE_URI.f30346l, aVar.getRemoteUrl());
            contentValues.put(C11262a.COLUMN_HASH.f30346l, aVar.getHash());
            contentValues.put(C11262a.COLUMN_INDEX.f30346l, Integer.valueOf(aVar.getIndex()));
            contentValues.put(C11262a.COLUMN_EXT.f30346l, aVar.getExtStr());
            contentValues.put(C11262a.COLUMN_STATUS.f30346l, Integer.valueOf(aVar.getStatus()));
            contentValues.put(C11262a.COLUMN_TYPE.f30346l, aVar.getType());
            contentValues.put(C11262a.COLUMN_SIZE.f30346l, Long.valueOf(aVar.getLength()));
            contentValues.put(C11262a.COLUMN_DISPLAY_TYPE.f30346l, aVar.getDisplayType());
            contentValues.put(C11262a.COLUMN_MIME_TYPE.f30346l, aVar.getMimeType());
            C11266d.m22878a();
            if (C11266d.m22877a("attchment", (String) null, contentValues) >= 0) {
                i++;
            }
        }
        if (i == list.size()) {
            return true;
        }
        return false;
    }
}
