package com.p683ss.android.ugc.aweme.tools.music.p2362b;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p683ss.android.ugc.aweme.tools.music.p2362b.C47160a.C47161a;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.b.b */
public final class C47163b extends Fragment {

    /* renamed from: a */
    public final HashMap<Integer, List<C47161a>> f119068a = new HashMap<>();

    /* renamed from: b */
    private HashMap f119069b;

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f119069b != null) {
            this.f119069b.clear();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        Set<Integer> keySet = this.f119068a.keySet();
        C52711k.m112236a((Object) keySet, "mCallbacks.keys");
        for (Integer remove : keySet) {
            this.f119068a.remove(remove);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47161a aVar;
        super.onActivityResult(i, i2, intent);
        List list = (List) this.f119068a.get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            this.f119068a.remove(Integer.valueOf(i));
            aVar = null;
        } else {
            aVar = (C47161a) list.remove(list.size() - 1);
            if (list.isEmpty()) {
                this.f119068a.remove(Integer.valueOf(i));
            }
        }
        if (aVar != null) {
            aVar.mo94375a(i2, intent);
        }
    }
}
