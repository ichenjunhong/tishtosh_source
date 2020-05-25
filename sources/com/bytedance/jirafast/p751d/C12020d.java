package com.bytedance.jirafast.p751d;

import android.app.Activity;
import android.content.Intent;
import android.support.p030v4.app.C0636b;
import android.widget.Toast;
import com.bytedance.jirafast.C11991a;
import com.bytedance.jirafast.p749b.C11997a;
import com.bytedance.jirafast.p749b.C12000d;
import com.bytedance.jirafast.p749b.C12001e;
import com.bytedance.jirafast.p749b.C12003g;
import com.bytedance.jirafast.p750c.C12004a;
import com.bytedance.jirafast.p750c.C12004a.C12007a;
import com.bytedance.jirafast.p752ui.JIRAReportEntryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.jirafast.d.d */
public class C12020d {

    /* renamed from: c */
    private static C12020d f31794c;

    /* renamed from: a */
    public C12003g f31795a;

    /* renamed from: b */
    public C11997a f31796b;

    private C12020d() {
    }

    /* renamed from: a */
    public static C12020d m24434a() {
        if (f31794c == null) {
            synchronized (C12020d.class) {
                if (f31794c == null) {
                    f31794c = new C12020d();
                }
            }
        }
        return f31794c;
    }

    /* renamed from: a */
    public final void mo22765a(C12000d dVar) {
        m24435a(dVar, false);
    }

    /* renamed from: a */
    public final void mo22764a(Activity activity) {
        if (C11991a.m24390a() != null) {
            if (activity == null) {
                activity = C12048o.m24505a();
            }
            if (activity != null) {
                if (C0636b.m2090a(C11991a.m24390a(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    C12004a.m24410a(activity, new C12007a<Boolean>() {
                    });
                }
            } else if (C0636b.m2090a(C11991a.m24390a(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                C12024e.m24438a(Toast.makeText(C11991a.m24390a(), "请开通存储权限，否则有些功能无法使用！(Please open storage permissions, otherwise some functions can not be used!)", 0));
            }
        }
    }

    /* renamed from: a */
    private void m24435a(C12000d dVar, boolean z) {
        if (C11991a.m24390a() != null) {
            final String c = C12019c.m24433c(C11991a.m24390a());
            final String b = C12019c.m24432b(C11991a.m24390a());
            m24434a().mo22764a((Activity) null);
            final C12000d dVar2 = dVar;
            C120222 r0 = new Runnable(false) {
                public final void run() {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    ArrayList<String> arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    if (!(dVar2 == null || dVar2.f31744a == null)) {
                        arrayList2.addAll(dVar2.f31744a);
                    }
                    if (C12020d.this.f31795a != null) {
                        List a = C12020d.this.f31795a.mo22748a();
                        if (a != null) {
                            arrayList2.addAll(a);
                        }
                    }
                    final ArrayList a2 = C12042l.m24499a((List<C12001e>) arrayList2);
                    final ArrayList b = C12042l.m24500b(arrayList2);
                    if (dVar2 == null) {
                        str = "";
                    } else {
                        str = dVar2.f31747d;
                    }
                    final String str6 = str;
                    if (dVar2 == null) {
                        str2 = "";
                    } else {
                        str2 = dVar2.f31748e;
                    }
                    final String str7 = str2;
                    if (dVar2 == null) {
                        str3 = "";
                    } else {
                        str3 = dVar2.f31745b;
                    }
                    final String str8 = str3;
                    if (dVar2 == null) {
                        str4 = "";
                    } else {
                        str4 = dVar2.f31746c;
                    }
                    final String str9 = str4;
                    if (dVar2 == null) {
                        str5 = "";
                    } else {
                        str5 = dVar2.f31749f;
                    }
                    final String str10 = str5;
                    if (dVar2 == null) {
                        arrayList = null;
                    } else {
                        arrayList = dVar2.f31750g;
                    }
                    final ArrayList<String> arrayList3 = arrayList;
                    C120231 r2 = new Runnable() {
                        public final void run() {
                            Intent intent = new Intent(C11991a.m24390a(), JIRAReportEntryActivity.class);
                            intent.putStringArrayListExtra("imgfilepath", a2);
                            intent.putStringArrayListExtra("txtfilepath", b);
                            intent.putExtra("des", str7);
                            intent.putExtra("email", str10);
                            intent.putExtra("title", str6);
                            intent.putExtra("Reporter", str9);
                            intent.putExtra("Assignee", str8);
                            intent.putExtra("momorydes", c);
                            intent.putExtra("isFromLeakCanary", false);
                            intent.putExtra("sddes", b);
                            intent.putExtra("Components", arrayList3);
                            intent.setFlags(268435456);
                            C11991a.m24390a().startActivity(intent);
                        }
                    };
                    C12049p.m24509b(r2);
                }
            };
            C12049p.m24508a(r0);
        }
    }
}
