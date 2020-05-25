package androidx.work;

import androidx.work.C1538e.C1539a;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends C1540f {
    /* renamed from: a */
    public final C1538e mo5901a(List<C1538e> list) {
        C1539a aVar = new C1539a();
        HashMap hashMap = new HashMap();
        for (C1538e a : list) {
            hashMap.putAll(a.mo5920a());
        }
        aVar.mo5923a(hashMap);
        return aVar.mo5924a();
    }
}
