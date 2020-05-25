package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.aa */
public class C0159aa {

    /* renamed from: a */
    public final HashMap<String, C0209x> f410a = new HashMap<>();

    /* renamed from: a */
    public final void mo301a() {
        for (C0209x onCleared : this.f410a.values()) {
            onCleared.onCleared();
        }
        this.f410a.clear();
    }

    /* renamed from: a */
    public final C0209x mo300a(String str) {
        return (C0209x) this.f410a.get(str);
    }

    /* renamed from: a */
    public final void mo302a(String str, C0209x xVar) {
        C0209x xVar2 = (C0209x) this.f410a.put(str, xVar);
        if (xVar2 != null) {
            xVar2.onCleared();
        }
    }
}
