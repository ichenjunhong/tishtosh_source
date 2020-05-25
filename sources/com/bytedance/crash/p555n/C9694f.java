package com.bytedance.crash.p555n;

import android.os.Process;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9610j;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p554m.C9679g;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.n.f */
public final class C9694f {
    /* renamed from: b */
    public static int m19344b() {
        int myPid = Process.myPid();
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(myPid);
            sb.append("/fd");
            return new File(sb.toString()).listFiles().length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static void m19345c() {
        StringBuilder sb = new StringBuilder("/proc/");
        sb.append(String.valueOf(Process.myPid()));
        sb.append("/maps");
        File file = new File(sb.toString());
        String format = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
        File d = C9705m.m19398d(C9616k.m19154f());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(format);
        sb2.append('_');
        sb2.append(file.getName());
        C9695g.m19351a(file, new File(d, sb2.toString()));
    }

    /* renamed from: d */
    public static void m19346d() {
        File d = C9705m.m19398d(C9616k.m19154f());
        File[] listFiles = d.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (File absolutePath : listFiles) {
                arrayList.add(absolutePath.getAbsolutePath());
            }
            if (m19343a(C9616k.m19147a().mo17449d(), C9616k.m19151c().mo17507a(), "externalFiles", arrayList, "npth", C9685a.m19318c(C9616k.m19154f()))) {
                C9695g.m19357a(d);
            }
        }
    }

    /* renamed from: a */
    public static List<String> m19342a() {
        ArrayList arrayList = new ArrayList();
        int myPid = Process.myPid();
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(myPid);
            sb.append("/fd");
            File[] listFiles = new File(sb.toString()).listFiles();
            if (listFiles != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File name : listFiles) {
                    try {
                        arrayList2.add(Integer.valueOf(Integer.decode(name.getName()).intValue()));
                    } catch (Throwable unused) {
                    }
                }
                int[] iArr = new int[arrayList2.size()];
                for (int i = 0; i < iArr.length; i++) {
                    iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                }
                String[] a = NativeImpl.m19470a(myPid, iArr, new String[iArr.length]);
                if (a == null) {
                    for (File file : listFiles) {
                        StringBuilder sb2 = new StringBuilder("fd ");
                        sb2.append(file.getName());
                        sb2.append(": ");
                        sb2.append(file.getCanonicalPath());
                        arrayList.add(sb2.toString());
                    }
                } else {
                    arrayList.addAll(Arrays.asList(a));
                }
            }
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m19343a(String str, String str2, String str3, List<String> list, String str4, String str5) {
        try {
            C9679g gVar = new C9679g(C9610j.m19137b().f26292e, "UTF-8", false);
            gVar.mo17528a("aid", str);
            gVar.mo17528a("device_id", str2);
            gVar.mo17528a("os", "Android");
            gVar.mo17528a("process_name", "main");
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", str3);
                    hashMap.put("scene", str4);
                    hashMap.put("env", "params.txt");
                    gVar.mo17527a(file2.getName(), file2, hashMap);
                }
            }
            try {
                if (new JSONObject(gVar.mo17526a()).optInt("errno", -1) == 200) {
                    return true;
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }
}
