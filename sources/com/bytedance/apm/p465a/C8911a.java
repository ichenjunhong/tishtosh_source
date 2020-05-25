package com.bytedance.apm.p465a;

import android.text.TextUtils;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p465a.p466a.C8912a;
import com.bytedance.apm.p465a.p467b.C8914a;
import com.bytedance.apm.p465a.p468c.C8917b;
import com.bytedance.apm.p501q.C9183e;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.a */
public final class C8911a {

    /* renamed from: a */
    public static volatile C8920e f24279a;

    /* renamed from: a */
    private static String m17634a(List<String> list) {
        String str;
        File file = new File((String) list.get(0));
        String parent = file.getParent();
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            str = "";
        } else {
            int lastIndexOf = name.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
            if (lastIndexOf == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".zip");
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name.substring(0, lastIndexOf));
                sb2.append(".zip");
                str = sb2.toString();
            }
        }
        File file2 = new File(parent, str);
        if (file2.exists()) {
            file2.delete();
        }
        try {
            C9183e.m18229a(list, file2.getAbsolutePath());
            return file2.getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m17635a(String str, long j, long j2, String str2, C8915c cVar) {
        List<String> list;
        String str3;
        String str4 = str;
        if (f24279a != null) {
            list = f24279a.mo15951a(C8976c.m17736a(), str, j, j2);
        } else {
            list = null;
        }
        int i = 0;
        if (!C9190h.m18253a(list)) {
            C8912a aVar = new C8912a();
            JSONObject i2 = C8976c.m17753i();
            if (i2 != null) {
                aVar.f24281b = i2.optString("aid");
                aVar.f24280a = i2.optString("device_id");
            }
            if (C8917b.m17641a(C8976c.m17736a()).contains(":")) {
                str3 = C8917b.m17641a(C8976c.m17736a());
            } else {
                str3 = "main";
            }
            aVar.f24282c = str3;
            aVar.f24283d = list;
            aVar.f24284e = i2;
            if (!TextUtils.isEmpty(aVar.f24281b) && !TextUtils.isEmpty(aVar.f24280a) && !TextUtils.isEmpty(aVar.f24282c) && aVar.f24283d != null && aVar.f24283d.size() != 0) {
                i = 1;
            }
            if (i == 0) {
                C8936b.m17651a("apm_event_stats_alog_fail", 5, (JSONObject) null);
                return;
            }
            String a = m17634a(aVar.f24283d);
            if (TextUtils.isEmpty(a)) {
                C8914a.m17638a(aVar.f24281b, aVar.f24280a, aVar.f24282c, aVar.f24283d, str2, aVar.f24284e);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a);
            C8914a.m17638a(aVar.f24281b, aVar.f24280a, aVar.f24282c, arrayList, str2, aVar.f24284e);
            new File(a).delete();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("e_dir", str);
            jSONObject.put("e_start_time", j);
            jSONObject.put("e_end_time", j2);
            File file = new File(str);
            if (!file.exists() || file.listFiles() == null) {
                jSONObject.put("e_file", TEVideoRecorder.FACE_BEAUTY_NULL);
                C8936b.m17651a("apm_event_stats_alog_fail", 4, jSONObject);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            while (i < length) {
                sb.append(listFiles[i].getName());
                sb.append(",");
                i++;
            }
            sb.append("]");
            jSONObject.put("e_file", sb.toString());
            C8936b.m17651a("apm_event_stats_alog_fail", 4, jSONObject);
        } catch (Exception unused) {
        }
    }
}
