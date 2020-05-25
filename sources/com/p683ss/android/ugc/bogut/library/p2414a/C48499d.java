package com.p683ss.android.ugc.bogut.library.p2414a;

import com.p683ss.android.ugc.bogut.library.p2415b.C48501a;
import com.p683ss.android.ugc.bogut.library.p2415b.C48501a.C48502a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.bogut.library.a.d */
public enum C48499d {
    INSTANCE;
    
    public HashMap<String, C48501a> idToPresenter;
    public HashMap<C48501a, String> presenterToId;

    public final void clear() {
        this.idToPresenter.clear();
        this.presenterToId.clear();
    }

    public final <P> P getPresenter(String str) {
        return this.idToPresenter.get(str);
    }

    public final String getId(C48501a aVar) {
        return (String) this.presenterToId.get(aVar);
    }

    public final void add(final C48501a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.getClass().getSimpleName());
        sb.append("/");
        sb.append(System.nanoTime());
        sb.append("/");
        sb.append((int) (Math.random() * 2.147483647E9d));
        String sb2 = sb.toString();
        this.idToPresenter.put(sb2, aVar);
        this.presenterToId.put(aVar, sb2);
        aVar.f121943b.add(new C48502a() {
            /* renamed from: a */
            public final void mo95990a() {
                C48499d.this.idToPresenter.remove(C48499d.this.presenterToId.remove(aVar));
            }
        });
    }
}
