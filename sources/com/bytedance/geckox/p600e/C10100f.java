package com.bytedance.geckox.p600e;

import android.util.Pair;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.utils.C10166m;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.geckox.e.f */
public class C10100f extends C12382d<String, Map<String, List<Pair<String, Long>>>> {

    /* renamed from: g */
    private File f27389g;

    /* renamed from: h */
    private List<String> f27390h;

    /* renamed from: a */
    public final void mo18064a(Object... objArr) {
        super.mo18064a(objArr);
        this.f27389g = objArr[0];
        this.f27390h = objArr[1];
    }

    /* renamed from: a_ */
    public final /* synthetic */ Object mo18063a_(C12378b bVar, Object obj) throws Throwable {
        C10117b.m20388a("gecko-debug-tag", "开始获取本地版本号:", (String) obj);
        HashMap hashMap = new HashMap();
        for (String str : this.f27390h) {
            File file = new File(this.f27389g, str);
            String[] list = file.list();
            ArrayList arrayList = new ArrayList();
            if (list != null && list.length > 0) {
                for (String str2 : list) {
                    File file2 = new File(file, str2);
                    if (file2.isDirectory()) {
                        Long a = C10166m.m20492a(file2);
                        if (a != null) {
                            arrayList.add(new Pair(str2, a));
                        }
                    }
                }
            }
            hashMap.put(str, arrayList);
        }
        return bVar.mo23391a(hashMap);
    }
}
