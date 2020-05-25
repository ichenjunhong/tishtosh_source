package com.bytedance.p702im.core.internal.p710a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.p710a.p713c.C11302f;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11197f;

/* renamed from: com.bytedance.im.core.internal.a.p */
public class C11317p {

    /* renamed from: a */
    private static C11317p f30466a;

    private C11317p() {
    }

    /* renamed from: a */
    public static C11317p m23070a() {
        if (f30466a == null) {
            synchronized (C11317p.class) {
                if (f30466a == null) {
                    f30466a = new C11317p();
                }
            }
        }
        return f30466a;
    }

    /* renamed from: b */
    public static String m23072b() {
        C11303d[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_setting (");
        for (C11303d dVar : C11303d.values()) {
            sb.append(dVar.f30409g);
            sb.append(" ");
            sb.append(dVar.f30410h);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: b */
    public static boolean m23073b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11266d.m22878a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11303d.COLUMN_ID.f30409g);
        sb.append("=?");
        return C11266d.m22882a("conversation_setting", sb.toString(), new String[]{str});
    }

    /* renamed from: a */
    public static C11197f m23069a(String str) {
        C11287b bVar;
        C11197f fVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from conversation_setting where ");
            sb.append(C11303d.COLUMN_ID.f30409g);
            sb.append("=?");
            bVar = C11266d.m22879a(sb.toString(), new String[]{str});
            try {
                if (bVar.mo20993c()) {
                    if (bVar != null) {
                        C11197f fVar2 = new C11197f();
                        fVar2.setConversationId(bVar.mo20992c(bVar.mo20988a(C11303d.COLUMN_ID.f30409g)));
                        fVar2.setVersion(bVar.mo20991b(bVar.mo20988a(C11303d.COLUMN_VERSION.f30409g)));
                        fVar2.setStickTop(bVar.mo20987a(bVar.mo20988a(C11303d.COLUMN_STICK_TOP.f30409g)));
                        fVar2.setMute(bVar.mo20987a(bVar.mo20988a(C11303d.COLUMN_MUTE.f30409g)));
                        fVar2.setExtStr(bVar.mo20992c(bVar.mo20988a(C11303d.COLUMN_EXT.f30409g)));
                        fVar2.setFavor(bVar.mo20987a(bVar.mo20988a(C11303d.COLUMN_FAVORITE.f30409g)));
                        fVar = fVar2;
                    }
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11467e.m23465a("get ", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return fVar;
                } catch (Throwable th) {
                    th = th;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11467e.m23465a("get ", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return fVar;
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            C11323v.m23122a(bVar);
            throw th;
        }
        C11323v.m23122a(bVar);
        return fVar;
    }

    /* renamed from: a */
    public static boolean m23071a(C11197f fVar) {
        Boolean bool;
        boolean z = false;
        if (fVar == null || TextUtils.isEmpty(fVar.getConversationId())) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(false);
        C11302f fVar2 = null;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(" replace into conversation_setting(");
            for (C11303d dVar : C11303d.values()) {
                sb.append(dVar.f30409g);
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
            if (!(d == null || fVar == null)) {
                try {
                    d.mo21014d();
                    d.mo21011a(C11303d.COLUMN_ID.ordinal() + 1, C11323v.m23121a(fVar.getConversationId()));
                    d.mo21010a(C11303d.COLUMN_VERSION.ordinal() + 1, fVar.getVersion());
                    d.mo21010a(C11303d.COLUMN_STICK_TOP.ordinal() + 1, (long) fVar.getStickTop());
                    d.mo21010a(C11303d.COLUMN_MUTE.ordinal() + 1, (long) fVar.getMute());
                    d.mo21011a(C11303d.COLUMN_EXT.ordinal() + 1, C11323v.m23121a(fVar.getExtStr()));
                    d.mo21010a(C11303d.COLUMN_FAVORITE.ordinal() + 1, (long) fVar.getFavor());
                } catch (Exception e) {
                    e = e;
                    fVar2 = d;
                    try {
                        C11467e.m23465a("insertOrUpdate ", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23123a(fVar2);
                        bool = valueOf;
                        return bool.booleanValue();
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23123a(fVar2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fVar2 = d;
                    C11323v.m23123a(fVar2);
                    throw th;
                }
            }
            if (d.mo21009a() > 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            C11323v.m23123a(d);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("insertOrUpdate ", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23123a(fVar2);
            bool = valueOf;
            return bool.booleanValue();
        }
        return bool.booleanValue();
    }
}
