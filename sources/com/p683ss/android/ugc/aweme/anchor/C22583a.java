package com.p683ss.android.ugc.aweme.anchor;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.anchor.a */
public class C22583a extends Fragment {

    /* renamed from: b */
    public static C25600a f60724b = C25600a.NO_TYPE;

    /* renamed from: c */
    public static final C22584a f60725c = new C22584a(null);

    /* renamed from: a */
    public C22678i f60726a;

    /* renamed from: d */
    private HashMap f60727d;

    /* renamed from: com.ss.android.ugc.aweme.anchor.a$a */
    public static final class C22584a {
        private C22584a() {
        }

        /* renamed from: a */
        public static C25600a m55780a() {
            return C22583a.f60724b;
        }

        public /* synthetic */ C22584a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public View mo46973a(int i) {
        if (this.f60727d == null) {
            this.f60727d = new HashMap();
        }
        View view = (View) this.f60727d.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f60727d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public void mo46974b() {
        if (this.f60727d != null) {
            this.f60727d.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo46974b();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (!(activity instanceof C22678i)) {
                activity = null;
            }
            this.f60726a = (C22678i) activity;
        }
    }
}
