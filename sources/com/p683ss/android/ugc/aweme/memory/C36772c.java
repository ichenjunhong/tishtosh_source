package com.p683ss.android.ugc.aweme.memory;

import android.os.Environment;
import com.bytedance.apm.C8976c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.liko.p772b.C12269a;
import com.p683ss.android.monitor.C19524a;
import com.p683ss.android.ugc.tools.utils.C50205i;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.memory.c */
public final class C36772c {
    /* renamed from: b */
    private static void m82763b() {
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m82760a() throws Exception {
        try {
            String absolutePath = C19524a.m47804a().getAbsolutePath();
            if (!new File(absolutePath, "reports").exists()) {
                return Boolean.valueOf(true);
            }
            ArrayList arrayList = new ArrayList(4);
            StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append("/.maps");
            arrayList.add(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/.fds");
            arrayList.add(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(absolutePath);
            sb3.append("/.threads");
            arrayList.add(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(absolutePath);
            sb4.append("/reports");
            arrayList.add(sb4.toString());
            C50205i.m108366a(absolutePath, "raphael.zip", (List<String>) arrayList);
            JSONObject jSONObject = new JSONObject();
            for (Entry entry : C8976c.m17752h().entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            File file = new File(absolutePath, "raphael.zip");
            boolean booleanValue = ((Boolean) Class.forName("com.bytedance.crash.m.b").getMethod("uploadRaphealFile", new Class[]{File.class}).invoke(null, new Object[]{file})).booleanValue();
            file.exists();
            if (booleanValue) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(absolutePath);
                sb5.append("/raphael.zip");
                arrayList.add(sb5.toString());
                m82762a((List<String>) arrayList);
            }
            return Boolean.valueOf(true);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m82762a(List<String> list) {
        for (String file : list) {
            try {
                new File(file).delete();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m82761a(String str) {
        File a = C19524a.m47804a();
        C12269a.m24753a(a, ".maps");
        C12269a.m24751a(C11010c.m22280a(), a, ".fds");
        C12269a.m24754b(C11010c.m22280a(), a, ".threads");
        m82763b();
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        sb.append("/.raphael/reports");
        File file = new File(sb.toString());
        if (file.exists()) {
            file.renameTo(new File(a, "reports"));
        }
    }
}
