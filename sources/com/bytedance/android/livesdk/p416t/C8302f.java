package com.bytedance.android.livesdk.p416t;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.livesdk.p416t.p418b.C8286b;
import com.bytedance.android.livesdk.p416t.p418b.C8287c;
import com.bytedance.android.livesdk.p416t.p418b.C8288d;
import com.bytedance.android.livesdk.p416t.p419c.C8294e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.android.livesdk.t.f */
public final class C8302f {

    /* renamed from: a */
    private C8281b f22644a;

    /* renamed from: com.bytedance.android.livesdk.t.f$a */
    public static abstract class C8304a implements C8286b {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract String mo14481a(Activity activity, String... strArr);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo14482b(Activity activity, String... strArr);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo14480a(Activity activity) {
            return activity.getString(R.string.exh);
        }

        /* renamed from: a */
        public final void mo14471a(Activity activity, C8287c cVar, String[] strArr, String[] strArr2) {
            C4221a a = new C4221a(activity).mo9689a((CharSequence) mo14482b(activity, strArr)).mo9695b((CharSequence) mo14481a(activity, strArr)).mo9690a((CharSequence) mo14480a(activity), (OnClickListener) new C8308g(this, cVar));
            String string = activity.getString(R.string.e45);
            OnClickListener onClickListener = C8309h.f22652a;
            a.f11525a.f11494k = string;
            a.f11525a.f11495l = onClickListener;
            a.f11525a.f11501r = C8310i.f22653a;
            a.mo9691a(false).mo9686a((OnCancelListener) new C8311j(this, cVar)).mo9696b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.t.f$b */
    public static class C8305b {

        /* renamed from: a */
        Activity f22645a;

        /* renamed from: b */
        C8286b f22646b = new C8306c();

        /* renamed from: c */
        C8286b f22647c = new C8307d();

        /* renamed from: d */
        Runnable f22648d = C8312k.f22656a;

        /* renamed from: e */
        Runnable f22649e = C8313l.f22657a;

        /* renamed from: a */
        public final C8305b mo14483a(Runnable runnable) {
            this.f22648d = runnable;
            return this;
        }

        /* renamed from: b */
        public final C8305b mo14485b(Runnable runnable) {
            this.f22649e = runnable;
            return this;
        }

        public C8305b(Activity activity) {
            this.f22645a = activity;
        }

        /* renamed from: a */
        public final void mo14484a(C8288d dVar, String... strArr) {
            if (this.f22645a != null && !this.f22645a.isFinishing()) {
                try {
                    new C8302f(this.f22645a).mo14479a(dVar, this.f22648d, this.f22646b, this.f22647c, this.f22649e, strArr);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.t.f$c */
    public static class C8306c implements C8286b {
        /* renamed from: a */
        public final void mo14471a(Activity activity, C8287c cVar, String[] strArr, String[] strArr2) {
            cVar.mo14465a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.t.f$d */
    public static class C8307d extends C8304a {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo14480a(Activity activity) {
            return activity.getString(R.string.f15);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo14482b(Activity activity, String... strArr) {
            return activity.getString(R.string.eyc);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo14481a(Activity activity, String... strArr) {
            Object[] objArr = new Object[1];
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (String str : strArr) {
                if (C8299d.f22641a.containsKey(str)) {
                    Integer num = (Integer) C8299d.f22641a.get(str);
                    if (!arrayList.contains(num)) {
                        arrayList.add(num);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (Integer num2 : arrayList) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(activity.getString(num2.intValue()));
            }
            objArr[0] = sb.toString();
            return activity.getString(R.string.eyb, objArr);
        }
    }

    /* renamed from: a */
    public static C8305b m16453a(Activity activity) {
        return new C8305b(activity);
    }

    private C8302f(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        C8281b bVar = (C8281b) fragmentManager.findFragmentByTag("PermissionsRequest");
        if (bVar == null) {
            bVar = new C8281b();
            fragmentManager.beginTransaction().add(bVar, "PermissionsRequest").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        this.f22644a = bVar;
    }

    /* renamed from: a */
    public final void mo14479a(C8288d dVar, Runnable runnable, C8286b bVar, C8286b bVar2, Runnable runnable2, String... strArr) {
        C8281b bVar3 = this.f22644a;
        C8284a aVar = new C8284a(strArr, runnable, dVar, bVar, runnable2, bVar2);
        String[] a = C8299d.m16447a(bVar3.getActivity(), aVar.f22630a);
        if (a.length == 0) {
            aVar.mo14469a(false);
            return;
        }
        aVar.f22631b = a;
        aVar.f22633d.run();
        C8300e a2 = C8300e.m16448a();
        String[] strArr2 = aVar.f22630a;
        for (String a3 : aVar.f22631b) {
            Iterator it = a2.mo14475a(a3).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (VERSION.SDK_INT < 23 || C8294e.m16435c().mo14473a()) {
            bVar3.mo14461a(aVar);
            return;
        }
        aVar.f22632c.mo14471a(bVar3.getActivity(), new C8287c(aVar) {

            /* renamed from: a */
            final /* synthetic */ C8284a f22626a;

            /* renamed from: b */
            public final void mo14466b() {
                this.f22626a.mo14467a();
            }

            /* renamed from: a */
            public final void mo14465a() {
                C8281b bVar = C8281b.this;
                C8284a aVar = this.f22626a;
                int a = C8273a.m16389a(aVar.f22630a) & 65535;
                bVar.f22624a.mo2595b(a, aVar);
                bVar.requestPermissions(aVar.f22631b, a);
            }

            {
                this.f22626a = r2;
            }
        }, aVar.f22630a, aVar.f22631b);
    }
}
