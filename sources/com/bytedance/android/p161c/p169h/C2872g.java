package com.bytedance.android.p161c.p169h;

import android.os.Handler;
import com.bytedance.android.p161c.p164c.C2846a;
import com.bytedance.android.p161c.p167f.C2852b;
import com.bytedance.android.p161c.p168g.C2854a;
import com.bytedance.android.p161c.p168g.C2855b;
import com.bytedance.android.p161c.p169h.p170a.C2859b;
import com.bytedance.android.p161c.p172j.C2886h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.c.h.g */
public final class C2872g {
    /* renamed from: a */
    public static C2859b m8171a(C2854a aVar, File file, Handler handler) {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : aVar.f8492f.entrySet()) {
            String str = (String) entry.getKey();
            long longValue = ((Long) ((C2855b) entry.getValue()).f8499a).longValue();
            entry.getValue();
            File file2 = new File(file, str.replace("lib/", "").replace("assets/", ""));
            try {
                File parentFile = file2.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file2.createNewFile();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("ensure file ");
                sb.append(file2);
                sb.append(" error. stack trace: ");
                sb.append(C2886h.m8189a((Throwable) e));
                C2852b.m8150d("MultiStreamHelper", sb.toString());
            }
            arrayList.add(new C2855b(Long.valueOf(longValue), file2));
        }
        return new C2859b(aVar, arrayList, handler, file);
    }

    /* renamed from: a */
    public static C2857a m8172a(C2865c cVar, C2854a aVar, C2859b bVar) throws C2846a {
        if (cVar == null) {
            C2852b.m8147a("MultiStreamHelper", "InputStreamProvider is null!");
            return null;
        }
        C2857a aVar2 = new C2857a(bVar, 0);
        aVar2.f8504a = new C2866d(((Long) aVar.f8490d.get(0)).longValue(), cVar.mo7475a());
        aVar2.f8506c = null;
        StringBuilder sb = new StringBuilder("new data block and index of0!start point: 0, limitCount: ");
        sb.append(aVar.f8490d.get(0));
        C2852b.m8149c("MultiStreamHelper", sb.toString());
        int i = 1;
        C2857a aVar3 = aVar2;
        while (i < aVar.f8488b) {
            int i2 = i - 1;
            C2857a aVar4 = new C2857a(bVar, ((Long) aVar.f8491e.get(i2)).longValue());
            long longValue = ((Long) aVar.f8490d.get(i)).longValue() - ((Long) aVar.f8490d.get(i2)).longValue();
            aVar4.f8504a = new C2866d(longValue, cVar.mo7475a());
            StringBuilder sb2 = new StringBuilder("new data block and index of");
            sb2.append(i);
            sb2.append("!start point: ");
            sb2.append(aVar.f8491e.get(i2));
            sb2.append(", limitCount: ");
            sb2.append(longValue);
            C2852b.m8149c("MultiStreamHelper", sb2.toString());
            try {
                aVar4.f8504a.skip(((Long) aVar.f8490d.get(i2)).longValue());
                aVar3.f8505b = aVar4;
                aVar4.f8506c = aVar3;
                i++;
                aVar3 = aVar4;
            } catch (IOException e) {
                throw new C2846a((Throwable) e);
            }
        }
        return aVar2;
    }
}
