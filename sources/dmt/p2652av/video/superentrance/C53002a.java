package dmt.p2652av.video.superentrance;

import android.content.Context;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.superentrance.a */
public final class C53002a {
    /* renamed from: a */
    public static final String m112724a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 463403621) {
            if (hashCode != 1365911975) {
                if (hashCode == 1831139720 && str.equals("android.permission.RECORD_AUDIO")) {
                    return "mic";
                }
            } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                return "storage";
            }
        } else if (str.equals("android.permission.CAMERA")) {
            return "camera";
        }
        return "";
    }

    /* renamed from: a */
    public static final void m112725a(Context context) {
        boolean z;
        boolean z2;
        C52711k.m112240b(context, "context");
        boolean z3 = true;
        if (C39618d.f101145I.mo58605c().mo49440c(context) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (C39618d.f101145I.mo58605c().mo49439b(context) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C39618d.f101145I.mo58605c().mo49434a(context) != 0) {
            z3 = false;
        }
        List arrayList = new ArrayList();
        if (!z) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (!z2) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!z3) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            for (String a : (String[]) array) {
                C26890h.m65011a("permission_toast_show", C23089d.m56640a().mo47829a("permission_type", m112724a(a)).mo47829a("enter_from", "video_shoot_page").f61491a);
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public static final void m112726a(String[] strArr, int[] iArr) {
        boolean z;
        String str;
        if (iArr != null) {
            boolean z2 = true;
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && strArr != null) {
                if (strArr.length != 0) {
                    z2 = false;
                }
                if (!z2 && strArr.length == iArr.length) {
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        String str2 = "permission_toast_result";
                        C23089d a = C23089d.m56640a().mo47829a("permission_type", m112724a(strArr[i]));
                        String str3 = "permission_result";
                        if (iArr[i] == 0) {
                            str = "confirm";
                        } else {
                            str = "deny";
                        }
                        C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("enter_from", "video_shoot_page").f61491a);
                    }
                }
            }
        }
    }
}
