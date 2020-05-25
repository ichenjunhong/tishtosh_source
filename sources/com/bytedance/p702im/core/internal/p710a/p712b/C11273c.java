package com.bytedance.p702im.core.internal.p710a.p712b;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.p706c.p707a.C11179a;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.b.c */
public class C11273c {

    /* renamed from: a */
    private static C11273c f30362a;

    private C11273c() {
    }

    /* renamed from: a */
    public static C11273c m22900a() {
        if (f30362a == null) {
            synchronized (C11273c.class) {
                if (f30362a == null) {
                    f30362a = new C11273c();
                }
            }
        }
        return f30362a;
    }

    /* renamed from: a */
    public final boolean mo20966a(List<C11179a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i = 0;
        for (C11179a a : list) {
            ContentValues a2 = m22899a(a);
            C11266d.m22878a();
            if (C11266d.m22877a("fts_entity", (String) null, a2) >= 0) {
                i++;
            }
        }
        if (i == list.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static ContentValues m22899a(C11179a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11269a.COLUMN_ID.key, aVar.mo20560a());
        contentValues.put(C11269a.COLUMN_TYPE.key, Integer.valueOf(aVar.f30170b));
        contentValues.put(C11269a.COLUMN_CONVERSATION_ID.key, aVar.f30171c);
        contentValues.put(C11269a.COLUMN_MESSAGE_UUID.key, aVar.f30172d);
        contentValues.put(C11269a.COLUMN_USER_ID.key, aVar.f30173e);
        contentValues.put(C11269a.COLUMN_ENTITY_ID.key, aVar.f30174f);
        contentValues.put(C11269a.COLUMN_SEARCH_CONTENT.key, aVar.f30175g);
        contentValues.put(C11269a.COLUMN_EXTRA.key, aVar.f30176h);
        return contentValues;
    }

    /* renamed from: a */
    public static String m22901a(boolean z) {
        C11269a[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create virtual table if not exists fts_entity using fts4 (");
        for (C11269a aVar : C11269a.values()) {
            sb.append(aVar.key);
            sb.append(" ");
            sb.append(aVar.type);
            sb.append(",");
        }
        sb.append(" notindexed=");
        sb.append(C11269a.COLUMN_EXTRA.key);
        sb.append(",");
        if (z) {
            sb.append(" tokenize=mmicu,");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: b */
    public static boolean m22905b(List<C11179a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (C11179a aVar : list) {
            if (aVar != null && !TextUtils.isEmpty(aVar.mo20560a())) {
                sb.append(",\"");
                sb.append(aVar.mo20560a());
                sb.append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(sb2.substring(1));
        sb3.append(")");
        String sb4 = sb3.toString();
        C11266d.m22878a();
        StringBuilder sb5 = new StringBuilder("delete from fts_entity where ");
        sb5.append(C11269a.COLUMN_ID.key);
        sb5.append(" in ");
        sb5.append(sb4);
        return C11266d.m22883c(sb5.toString());
    }

    /* renamed from: a */
    public static boolean m22902a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        C11266d.m22878a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11269a.COLUMN_CONVERSATION_ID.key);
        sb.append("=? AND ");
        sb.append(C11269a.COLUMN_USER_ID.key);
        sb.append("=?");
        return C11266d.m22882a("fts_entity", sb.toString(), new String[]{str, str2});
    }

    /* renamed from: a */
    public static boolean m22903a(List<String> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                sb.append(",\"");
                sb.append(str2);
                sb.append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(sb2.substring(1));
        sb3.append(")");
        String sb4 = sb3.toString();
        C11266d.m22878a();
        StringBuilder sb5 = new StringBuilder("delete from fts_entity where ");
        sb5.append(str);
        sb5.append(" in ");
        sb5.append(sb4);
        return C11266d.m22883c(sb5.toString());
    }

    /* renamed from: a */
    public static boolean m22904a(List<String> list, String str, int i) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                sb.append(",\"");
                sb.append(str2);
                sb.append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(sb2.substring(1));
        sb3.append(")");
        String sb4 = sb3.toString();
        C11266d.m22878a();
        StringBuilder sb5 = new StringBuilder("delete from fts_entity where ");
        sb5.append(str);
        sb5.append(" in ");
        sb5.append(sb4);
        sb5.append(" and ");
        sb5.append(C11269a.COLUMN_TYPE.key);
        sb5.append(" =");
        sb5.append(i);
        return C11266d.m22883c(sb5.toString());
    }
}
