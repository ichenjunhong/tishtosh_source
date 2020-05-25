package com.p683ss.android.ugc.aweme.sticker.p2301k;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.util.HashMap;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.k.b */
public final class C46051b extends Fragment {

    /* renamed from: c */
    public static final C46052a f116189c = new C46052a(null);

    /* renamed from: a */
    public Intent f116190a;

    /* renamed from: b */
    public C52686q<? super Integer, ? super Integer, ? super Intent, C52860x> f116191b;

    /* renamed from: d */
    private HashMap f116192d;

    /* renamed from: com.ss.android.ugc.aweme.sticker.k.b$a */
    public static final class C46052a {
        private C46052a() {
        }

        public /* synthetic */ C46052a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C46051b m100044a(Intent intent, int i, C52686q<? super Integer, ? super Integer, ? super Intent, C52860x> qVar) {
            C52711k.m112240b(intent, "intent");
            C52711k.m112240b(qVar, "callback");
            C46051b bVar = new C46051b();
            bVar.f116190a = intent;
            Bundle bundle = new Bundle();
            bundle.putInt("extra_request_code", i);
            bVar.setArguments(bundle);
            bVar.f116191b = qVar;
            return bVar;
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f116192d != null) {
            this.f116192d.clear();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Intent intent = this.f116190a;
            if (intent != null) {
                startActivityForResult(intent, arguments.getInt("extra_request_code"));
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C52686q<? super Integer, ? super Integer, ? super Intent, C52860x> qVar = this.f116191b;
        if (qVar != null) {
            qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
