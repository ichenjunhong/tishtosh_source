package com.bytedance.p702im.core.internal.p710a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.p710a.p713c.C11302f;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11181c;

/* renamed from: com.bytedance.im.core.internal.a.l */
public class C11311l {

    /* renamed from: a */
    private static C11311l f30462a;

    private C11311l() {
    }

    /* renamed from: a */
    public static C11311l m23032a() {
        if (f30462a == null) {
            synchronized (C11311l.class) {
                if (f30462a == null) {
                    f30462a = new C11311l();
                }
            }
        }
        return f30462a;
    }

    /* renamed from: b */
    public static String m23034b() {
        C11274c[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_core (");
        for (C11274c cVar : C11274c.values()) {
            sb.append(cVar.f30373j);
            sb.append(" ");
            sb.append(cVar.f30374k);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: b */
    public static boolean m23035b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11266d.m22878a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11274c.COLUMN_ID.f30373j);
        sb.append("=?");
        return C11266d.m22882a("conversation_core", sb.toString(), new String[]{str});
    }

    /* renamed from: a */
    public static C11181c m23031a(String str) {
        C11287b bVar;
        C11181c cVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from conversation_core where ");
            sb.append(C11274c.COLUMN_ID.f30373j);
            sb.append("=?");
            bVar = C11266d.m22879a(sb.toString(), new String[]{str});
            try {
                if (bVar.mo20993c()) {
                    if (bVar != null) {
                        C11181c cVar2 = new C11181c();
                        cVar2.setConversationId(bVar.mo20992c(bVar.mo20988a(C11274c.COLUMN_ID.f30373j)));
                        cVar2.setVersion(bVar.mo20991b(bVar.mo20988a(C11274c.COLUMN_VERSION.f30373j)));
                        cVar2.setName(bVar.mo20992c(bVar.mo20988a(C11274c.COLUMN_NAME.f30373j)));
                        cVar2.setIcon(bVar.mo20992c(bVar.mo20988a(C11274c.COLUMN_ICON.f30373j)));
                        cVar2.setDesc(bVar.mo20992c(bVar.mo20988a(C11274c.COLUMN_DESC.f30373j)));
                        cVar2.setNotice(bVar.mo20992c(bVar.mo20988a(C11274c.COLUMN_NOTICE.f30373j)));
                        cVar2.setOwner(bVar.mo20991b(bVar.mo20988a(C11274c.COLUMN_OWNER_ID.f30373j)));
                        cVar2.setSecOwner(bVar.mo20992c(bVar.mo20988a(C11274c.COLUMN_SEC_OWNER.f30373j)));
                        cVar2.setExtStr(bVar.mo20992c(bVar.mo20988a(C11274c.COLUMN_EXT.f30373j)));
                        cVar = cVar2;
                    }
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11467e.m23465a("get ", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return cVar;
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
            return cVar;
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            C11323v.m23122a(bVar);
            throw th;
        }
        C11323v.m23122a(bVar);
        return cVar;
    }

    /* renamed from: a */
    public static boolean m23033a(C11181c cVar) {
        Boolean bool;
        boolean z = false;
        if (cVar == null || TextUtils.isEmpty(cVar.getConversationId())) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(false);
        C11302f fVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(" replace into conversation_core(");
            for (C11274c cVar2 : C11274c.values()) {
                sb.append(cVar2.f30373j);
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
            C11302f fVar2 = C11266d.m22884d(sb6);
            if (!(fVar2 == null || cVar == null)) {
                try {
                    fVar2.mo21014d();
                    fVar2.mo21011a(C11274c.COLUMN_ID.ordinal() + 1, C11323v.m23121a(cVar.getConversationId()));
                    fVar2.mo21010a(C11274c.COLUMN_VERSION.ordinal() + 1, cVar.getVersion());
                    fVar2.mo21011a(C11274c.COLUMN_NAME.ordinal() + 1, C11323v.m23121a(cVar.getName()));
                    fVar2.mo21011a(C11274c.COLUMN_ICON.ordinal() + 1, C11323v.m23121a(cVar.getIcon()));
                    fVar2.mo21011a(C11274c.COLUMN_DESC.ordinal() + 1, C11323v.m23121a(cVar.getDesc()));
                    fVar2.mo21011a(C11274c.COLUMN_NOTICE.ordinal() + 1, C11323v.m23121a(cVar.getNotice()));
                    fVar2.mo21010a(C11274c.COLUMN_OWNER_ID.ordinal() + 1, cVar.getOwner());
                    fVar2.mo21011a(C11274c.COLUMN_SEC_OWNER.ordinal() + 1, C11323v.m23121a(cVar.getSecOwner()));
                    fVar2.mo21011a(C11274c.COLUMN_EXT.ordinal() + 1, C11323v.m23121a(cVar.getExtStr()));
                } catch (Exception e) {
                    e = e;
                    fVar = fVar2;
                    try {
                        C11467e.m23465a("insertOrUpdate ", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23123a(fVar);
                        bool = valueOf;
                        return bool.booleanValue();
                    } catch (Throwable th) {
                        th = th;
                        fVar2 = fVar;
                        C11323v.m23123a(fVar2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C11323v.m23123a(fVar2);
                    throw th;
                }
            }
            if (fVar2.mo21009a() > 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            C11323v.m23123a(fVar2);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("insertOrUpdate ", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23123a(fVar);
            bool = valueOf;
            return bool.booleanValue();
        }
        return bool.booleanValue();
    }
}
