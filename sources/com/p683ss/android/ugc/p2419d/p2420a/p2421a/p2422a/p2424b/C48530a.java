package com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b;

import android.text.TextUtils;
import android.util.Pair;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.C48529b;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48523a;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48524b;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48526d;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48527e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.d.a.a.a.b.a */
public abstract class C48530a implements C48542e {

    /* renamed from: a */
    protected final C48526d f121974a;

    /* renamed from: b */
    protected List<? extends C48527e> f121975b;

    /* renamed from: c */
    protected List<? extends C48524b> f121976c;

    /* renamed from: d */
    protected C48523a f121977d;

    /* renamed from: com.ss.android.ugc.d.a.a.a.b.a$a */
    public static abstract class C48531a {

        /* renamed from: a */
        protected C48526d f121978a;

        /* renamed from: b */
        protected List<? extends C48527e> f121979b;

        /* renamed from: c */
        protected List<? extends C48524b> f121980c;

        /* renamed from: d */
        protected C48523a f121981d;

        /* renamed from: a */
        public abstract C48542e mo96023a();

        /* renamed from: a */
        public final C48531a mo96021a(C48523a aVar) {
            this.f121981d = aVar;
            return this;
        }

        /* renamed from: b */
        public final C48531a mo96024b(List<? extends C48524b> list) {
            this.f121980c = list;
            return this;
        }

        public C48531a(C48526d dVar) {
            this.f121978a = dVar;
        }

        /* renamed from: a */
        public final C48531a mo96022a(List<? extends C48527e> list) {
            this.f121979b = list;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo96016a(C48523a aVar) {
        this.f121977d = aVar;
    }

    /* renamed from: b */
    public final void mo96018b(List<? extends C48524b> list) {
        this.f121976c = list;
    }

    protected C48530a(C48526d dVar) {
        this.f121974a = dVar;
    }

    /* renamed from: a */
    public final void mo96017a(List<? extends C48527e> list) {
        this.f121975b = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final <T extends C48525c> T mo96020d(List<T> list) throws C48529b {
        String a = this.f121974a.mo95187a();
        double c = this.f121974a.mo95189c();
        if (c <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            for (T t : list) {
                if (TextUtils.equals(t.getGearName(), a)) {
                    return t;
                }
            }
            StringBuilder sb = new StringBuilder("defaultGearName = ");
            sb.append(a);
            sb.append(" bitrates = ");
            sb.append(list.toString());
            throw new C48529b(4, sb.toString());
        }
        double d = Double.MAX_VALUE;
        T t2 = null;
        for (T t3 : list) {
            double bitRate = (double) t3.getBitRate();
            Double.isNaN(bitRate);
            double abs = Math.abs(bitRate - c);
            if (d > abs) {
                t2 = t3;
                d = abs;
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final <T extends C48525c> List<T> mo96019c(List<T> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.f121974a == null || list.isEmpty()) {
            return arrayList;
        }
        Pair d = this.f121974a.mo95190d();
        Set b = this.f121974a.mo95188b();
        if (d == null || this.f121974a.mo95189c() <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            z = false;
        } else {
            z = true;
        }
        for (T t : list) {
            if (z) {
                double bitRate = (double) t.getBitRate();
                if (bitRate >= ((Double) d.first).doubleValue() && bitRate <= ((Double) d.second).doubleValue()) {
                    arrayList.add(t);
                }
            } else if (b != null && b.contains(t.getGearName())) {
                arrayList.add(t);
            }
        }
        if (arrayList.isEmpty()) {
            if (z) {
                C48525c cVar = null;
                for (T t2 : list) {
                    if (cVar != null) {
                        double bitRate2 = (double) t2.getBitRate();
                        double c = this.f121974a.mo95189c();
                        Double.isNaN(bitRate2);
                        double abs = Math.abs(bitRate2 - c);
                        double bitRate3 = (double) cVar.getBitRate();
                        double c2 = this.f121974a.mo95189c();
                        Double.isNaN(bitRate3);
                        if (abs >= Math.abs(bitRate3 - c2)) {
                        }
                    }
                    cVar = t2;
                }
                arrayList.add(cVar);
            } else {
                arrayList.add(list.get(0));
            }
        }
        return arrayList;
    }
}
