package dmt.p2652av.video;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import java.util.ArrayList;

/* renamed from: dmt.av.video.f */
public final class C52967f<T> extends C0198r<T> {

    /* renamed from: a */
    public final ArrayList<T> f131372a = new ArrayList<>();

    public final void setValue(T t) {
        super.setValue(t);
        this.f131372a.add(t);
    }

    public final void observe(C0184k kVar, final C0199s<T> sVar) {
        super.observe(kVar, new C0199s<T>() {

            /* renamed from: a */
            boolean f131373a;

            public final void onChanged(T t) {
                if (this.f131373a || C52967f.this.f131372a.isEmpty()) {
                    sVar.onChanged(t);
                } else {
                    for (int i = 0; i < C52967f.this.f131372a.size(); i++) {
                        sVar.onChanged(C52967f.this.f131372a.get(i));
                    }
                }
                this.f131373a = true;
            }
        });
    }
}
