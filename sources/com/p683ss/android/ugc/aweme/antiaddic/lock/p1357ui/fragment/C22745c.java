package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment;

import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.protection.api.p2097a.C40856a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.c */
public final class C22745c extends C22747d {

    /* renamed from: d */
    public static final C22746a f60964d = new C22746a(null);

    /* renamed from: e */
    private HashMap f60965e;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.c$a */
    public static final class C22746a {
        private C22746a() {
        }

        public /* synthetic */ C22746a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: f */
    public final void mo47199f() {
        if (this.f60965e != null) {
            this.f60965e.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo47199f();
    }

    public final void onDestroy() {
        super.onDestroy();
        if (C22722h.f60933a) {
            C22722h.f60933a = false;
        }
    }

    /* renamed from: e */
    public final void mo47184e() {
        mo47187a((View) this.f60947a);
        C10691a.m21533a(C11010c.m22280a(), (int) R.string.dzp).mo19066a();
        C23183v a = C23183v.m56778a();
        C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
        C23051bf M = a.mo47902M();
        C52711k.m112236a((Object) M, "CommonSharePrefCache.ins…hownAntiAddictionTipToday");
        M.mo47776a(Boolean.valueOf(true));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onCloseAntiAddictionEvent(C40856a aVar) {
        C52711k.m112240b(aVar, "event");
        mo47187a((View) this.f60947a);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47183b(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g.m55965e()
            if (r0 == 0) goto L_0x000a
            r2.mo47201c(r3)
            return
        L_0x000a:
            com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting r0 = com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.getUserSetting()
            if (r0 == 0) goto L_0x0029
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting r0 = com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.getUserSetting()
            java.lang.String r1 = "TimeLockRuler.getUserSetting()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r0 = r0.getPassword()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r3 = android.text.TextUtils.equals(r3, r0)
            if (r3 == 0) goto L_0x0029
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r3 == 0) goto L_0x0030
            r2.mo47184e()
            return
        L_0x0030:
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r0 = 2132552031(0x7f1c295f, float:2.0757438E38)
            com.bytedance.ies.dmt.ui.d.a r3 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r3, r0)
            r3.mo19066a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.C22745c.mo47183b(java.lang.String):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ml, viewGroup, false);
    }
}
