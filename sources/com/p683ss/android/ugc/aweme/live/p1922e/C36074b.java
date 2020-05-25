package com.p683ss.android.ugc.aweme.live.p1922e;

import android.util.Pair;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.e.b */
public final class C36074b {
    /* renamed from: a */
    private static int m81443a(int i) {
        return i + 1;
    }

    /* renamed from: a */
    private static String m81444a(String str) {
        File[] listFiles;
        File[] listFiles2;
        if (str == null || str.isEmpty()) {
            return "";
        }
        File file = new File(str);
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    for (File file3 : file2.listFiles()) {
                        if (file3.getName().endsWith(".png")) {
                            return file3.getAbsolutePath();
                        }
                    }
                    continue;
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static List<C31459g> m81445a(List<Pair<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) ((Pair) list.get(i)).first;
            String str2 = (String) ((Pair) list.get(i)).second;
            C31459g gVar = new C31459g();
            gVar.f82324a = m81443a(i);
            gVar.f82325b = str;
            gVar.f82331h = m81444a(str2);
            AVExternalServiceImpl.getAVServiceImpl_Monster().filterService().setFilterFolder(gVar, str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("/thumbnail.jpg");
            gVar.f82330g = sb.toString();
            arrayList.add(gVar);
        }
        return arrayList;
    }
}
