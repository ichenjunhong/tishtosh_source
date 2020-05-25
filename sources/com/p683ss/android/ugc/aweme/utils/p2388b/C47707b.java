package com.p683ss.android.ugc.aweme.utils.p2388b;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.utils.p2388b.C47705a.C47706a;

/* renamed from: com.ss.android.ugc.aweme.utils.b.b */
public final class C47707b extends Fragment {

    /* renamed from: a */
    private SparseArray<C47706a> f120196a = new SparseArray<>();

    public final void onDestroy() {
        super.onDestroy();
        if (this.f120196a != null) {
            this.f120196a.clear();
            this.f120196a = null;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    /* renamed from: a */
    public final void mo94989a(Intent intent, int i, C47706a aVar) {
        this.f120196a.put(i, aVar);
        startActivityForResult(intent, i);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f120196a != null) {
            C47706a aVar = (C47706a) this.f120196a.get(i);
            if (aVar != null) {
                aVar.mo44816a(i, i2, intent);
                this.f120196a.remove(i);
            }
        }
    }
}
