package com.p683ss.android.ugc.aweme.p1462bq;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1462bq.C23957c.C23958a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.bq.d */
public class C23962d {

    /* renamed from: a */
    private static volatile C23962d f63628a;

    /* renamed from: b */
    private List<C23963a> f63629b = new ArrayList();

    /* renamed from: c */
    private Handler f63630c = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.bq.d$a */
    public static class C23963a implements Runnable {

        /* renamed from: a */
        public C23965f f63631a;

        /* renamed from: b */
        private volatile boolean f63632b;

        public final void run() {
            C0013i.m16a((Callable<TResult>) new C23964e<TResult>(this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo49549a() throws Exception {
            if (!this.f63632b) {
                C23965f fVar = this.f63631a;
                try {
                    fVar.mo49553a(1);
                    fVar.f63637d.getPreloader().mo49545a(fVar.f63635b, fVar.f63636c);
                    fVar.mo49553a(4);
                } catch (Exception unused) {
                    fVar.mo49553a(3);
                }
            }
            return null;
        }

        C23963a(C23965f fVar) {
            this.f63631a = fVar;
        }
    }

    private C23962d() {
    }

    /* renamed from: a */
    public static C23962d m58765a() {
        if (f63628a == null) {
            synchronized (C23962d.class) {
                if (f63628a == null) {
                    f63628a = new C23962d();
                }
            }
        }
        return f63628a;
    }

    /* renamed from: a */
    public final void mo49548a(C23965f fVar) {
        if (fVar.f63635b != null && !TextUtils.isEmpty(fVar.f63635b.getAid()) && fVar.f63637d != null) {
            C23963a aVar = new C23963a(fVar);
            this.f63629b.add(aVar);
            this.f63630c.postDelayed(aVar, (long) fVar.f63634a);
        }
    }

    /* renamed from: a */
    public final C23963a mo49547a(String str, C23958a aVar) {
        for (C23963a aVar2 : this.f63629b) {
            if (aVar2 != null && aVar2.f63631a != null && aVar2.f63631a.f63635b != null && aVar2.f63631a.f63635b.getAid() != null && aVar2.f63631a.f63635b.getAid().equals(str) && aVar2.f63631a.f63637d == aVar) {
                return aVar2;
            }
        }
        return null;
    }
}
