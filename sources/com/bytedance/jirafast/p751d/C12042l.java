package com.bytedance.jirafast.p751d;

import android.os.Build.VERSION;
import android.support.p030v4.app.C0636b;
import android.widget.Toast;
import com.bytedance.jirafast.C11991a;
import com.bytedance.jirafast.p749b.C12001e;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.jirafast.d.l */
public final class C12042l {
    /* renamed from: a */
    public static ArrayList<String> m24499a(List<C12001e> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (C12001e eVar : list) {
            if (eVar.getType() == 2) {
                arrayList.add(eVar.content);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0052 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m24498a(com.bytedance.jirafast.p749b.C12001e r3) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r2 = "mounted"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0016
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "/jirafast/"
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r1 = ".txt"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0052
            java.io.File r2 = r1.getParentFile()
            r2.mkdirs()
            r1.createNewFile()     // Catch:{ Exception -> 0x0052 }
        L_0x0052:
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ Exception -> 0x0062 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0062 }
            r1.flush()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r3 = r3.content     // Catch:{ Exception -> 0x0062 }
            r1.write(r3)     // Catch:{ Exception -> 0x0062 }
            r1.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12042l.m24498a(com.bytedance.jirafast.b.e):java.lang.String");
    }

    /* renamed from: b */
    public static ArrayList<String> m24500b(List<C12001e> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (list.size() <= 0 || C0636b.m2090a(C11991a.m24390a(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            for (C12001e eVar : list) {
                if (eVar.getType() == 1) {
                    arrayList.add(m24498a(eVar));
                } else if (eVar.getType() == 3) {
                    arrayList.add(eVar.getContent());
                }
            }
            return arrayList;
        }
        C12049p.m24509b(new Runnable() {
            public final void run() {
                Toast makeText = Toast.makeText(C11991a.m24390a(), "请开通存储权限，否则有些功能无法使用！(Please open storage permissions, otherwise some functions can not be used!)", 0);
                if (VERSION.SDK_INT == 25) {
                    C47905fy.m103630a(makeText);
                }
                makeText.show();
            }
        });
        return arrayList;
    }
}
