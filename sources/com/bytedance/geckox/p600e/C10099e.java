package com.bytedance.geckox.p600e;

import android.util.Pair;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.utils.C10166m;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.geckox.e.e */
public class C10099e extends C12382d<List<String>, List<Pair<String, Long>>> {

    /* renamed from: g */
    private File f27387g;

    /* renamed from: h */
    private String f27388h;

    /* renamed from: a */
    public final void mo18064a(Object... objArr) {
        super.mo18064a(objArr);
        this.f27387g = objArr[0];
        this.f27388h = objArr[1];
    }

    /* renamed from: a_ */
    public final /* synthetic */ Object mo18063a_(C12378b bVar, Object obj) throws Throwable {
        long j;
        List<String> list = (List) obj;
        C10117b.m20388a("gecko-debug-tag", "开始获取本地版本号:", list);
        File file = new File(this.f27387g, this.f27388h);
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Long a = C10166m.m20492a(new File(file, str));
            if (a == null) {
                j = 0;
            } else {
                j = a.longValue();
            }
            arrayList.add(new Pair(str, Long.valueOf(j)));
        }
        return bVar.mo23391a(arrayList);
    }
}
