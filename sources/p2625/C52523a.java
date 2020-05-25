package p2625;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.opensdk.core.base.p809ui.p810a.C12511a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: a */
public final class C52523a extends C12511a {

    /* renamed from: a */
    public static final C52524a f130793a = new C52524a(null);

    /* renamed from: c */
    private final int f130794c = R.drawable.mn;

    /* renamed from: d */
    private HashMap f130795d;

    /* renamed from: a$a */
    public static final class C52524a {
        private C52524a() {
        }

        public /* synthetic */ C52524a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo23560a() {
        return this.f130794c;
    }

    /* renamed from: a */
    public final View mo23561a(int i) {
        if (this.f130795d == null) {
            this.f130795d = new HashMap();
        }
        View view = (View) this.f130795d.get(Integer.valueOf(R.id.a5c));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.a5c);
            this.f130795d.put(Integer.valueOf(R.id.a5c), view);
        }
        return view;
    }

    /* renamed from: b */
    public final void mo23563b() {
        if (this.f130795d != null) {
            this.f130795d.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo23563b();
    }

    public C52523a() {
        super(false, false, 3, null);
    }

    public final void dismissAllowingStateLoss() {
        try {
            C0654k fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.mo2234b();
            }
        } catch (Exception unused) {
        }
        if (isAdded()) {
            super.dismissAllowingStateLoss();
        }
    }

    /* renamed from: a */
    public final View mo23562a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "layoutInflater");
        View inflate = layoutInflater.inflate(R.layout.r2, viewGroup, false);
        C52711k.m112236a((Object) inflate, "layoutInflater.inflate(R…oading, container, false)");
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("hint");
        } else {
            str = null;
        }
        if (isAdded()) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TextView textView = (TextView) mo23561a(R.id.a5c);
                if (textView != null) {
                    textView.setVisibility(8);
                }
                return;
            }
            TextView textView2 = (TextView) mo23561a(R.id.a5c);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = (TextView) mo23561a(R.id.a5c);
            if (textView3 != null) {
                textView3.setText(charSequence);
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putString("hint", str);
            }
        }
    }
}
