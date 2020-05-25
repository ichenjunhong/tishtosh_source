package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Build.VERSION;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.p1736ui.experiment.LocationPopupExperiment;
import com.p683ss.android.ugc.aweme.main.C36634ec;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.MainFragment;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bi */
public final class C30797bi implements C30781ay {

    /* renamed from: a */
    public final Activity f80676a;

    /* renamed from: b */
    public final C36634ec f80677b = new C36634ec();

    /* renamed from: c */
    public C30794bh f80678c;

    /* renamed from: d */
    private final int f80679d = 1;

    /* renamed from: e */
    private final int f80680e = 3;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bi$a */
    static final class C30798a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C30797bi f80681a;

        /* renamed from: b */
        final /* synthetic */ int f80682b;

        C30798a(C30797bi biVar, int i) {
            this.f80681a = biVar;
            this.f80682b = i;
        }

        public final /* synthetic */ Object call() {
            boolean z = false;
            if (C52830p.m112452b(this.f80681a.f80677b.mo75731f(), new String[]{","}, false, 0, 6, (Object) null).size() >= this.f80682b) {
                if (this.f80681a.f80678c == null) {
                    this.f80681a.f80678c = new C30794bh(this.f80681a.f80676a);
                    C30794bh bhVar = this.f80681a.f80678c;
                    if (bhVar != null) {
                        bhVar.setOnShowListener(new OnShowListener(this) {

                            /* renamed from: a */
                            final /* synthetic */ C30798a f80683a;

                            {
                                this.f80683a = r1;
                            }

                            public final void onShow(DialogInterface dialogInterface) {
                                this.f80683a.f80681a.f80677b.mo75728c(true);
                                C26890h.m65011a("location_permission_show", (Map<String, String>) new HashMap<String,String>());
                            }
                        });
                    }
                }
                C30794bh bhVar2 = this.f80681a.f80678c;
                if (bhVar2 == null) {
                    C52711k.m112234a();
                }
                if (!bhVar2.isShowing()) {
                    C30797bi biVar = this.f80681a;
                    if (biVar.f80676a instanceof MainActivity) {
                        Fragment curFragment = ((MainActivity) biVar.f80676a).getCurFragment();
                        if (curFragment instanceof MainFragment) {
                            C30750af k = ((MainFragment) curFragment).mo75499c();
                            if (k instanceof C30753ai) {
                                C30753ai aiVar = (C30753ai) k;
                                if (aiVar.isResumed() && aiVar.getUserVisibleHint()) {
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        this.f80681a.f80677b.mo75728c(true);
                        C30794bh bhVar3 = this.f80681a.f80678c;
                        if (bhVar3 != null) {
                            bhVar3.mo63507e();
                        }
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public final void mo63495b() {
        C30794bh bhVar = this.f80678c;
        if (bhVar != null) {
            bhVar.dismiss();
        }
        this.f80678c = null;
    }

    /* renamed from: a */
    public final void mo63493a() {
        if (!this.f80677b.mo75730e()) {
            int a = C10181b.m20511a().mo18168a(LocationPopupExperiment.class, true, "location_permission_system_popup", 31744, 0);
            if (a > 0 && VERSION.SDK_INT >= 23 && !C47915gg.m103651b()) {
                C0013i.m18a((Callable<TResult>) new C30798a<TResult>(this, a), C0013i.f25b);
            }
        }
    }

    public C30797bi(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f80676a = activity;
    }

    /* renamed from: a */
    public final void mo63494a(String str) {
        C52711k.m112240b(str, "aid");
        if (!this.f80677b.mo75730e() && C10181b.m20511a().mo18168a(LocationPopupExperiment.class, true, "location_permission_system_popup", 31744, 0) > 0 && VERSION.SDK_INT >= 23 && !C47915gg.m103651b()) {
            String f = this.f80677b.mo75731f();
            CharSequence charSequence = f;
            if (!C52830p.m112452b(charSequence, new String[]{","}, false, 0, 6, (Object) null).contains(str)) {
                C36634ec ecVar = this.f80677b;
                if (!TextUtils.isEmpty(charSequence)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    sb.append(',');
                    sb.append(str);
                    str = sb.toString();
                }
                C52711k.m112240b(str, "feedsCount");
                try {
                    ecVar.mo75722a().mo48526g(str);
                } catch (Throwable th) {
                    C9220a.m18312a(th, "MainTabPreferences AbstractMethodError");
                }
            }
        }
    }
}
