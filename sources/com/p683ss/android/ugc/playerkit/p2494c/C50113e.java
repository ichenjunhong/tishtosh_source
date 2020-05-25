package com.p683ss.android.ugc.playerkit.p2494c;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.ies.ugc.aweme.network.C11030f;
import com.p683ss.android.ugc.playerkit.p2492a.C50102b;
import com.p683ss.android.ugc.playerkit.p2492a.C50103c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.playerkit.c.e */
public final class C50113e {

    /* renamed from: a */
    public Context f125530a;

    /* renamed from: b */
    public C50116c f125531b;

    /* renamed from: c */
    public boolean f125532c;

    /* renamed from: d */
    public C50102b f125533d;

    /* renamed from: e */
    public C50103c f125534e;

    /* renamed from: f */
    public SparseIntArray f125535f;

    /* renamed from: g */
    public SparseArray f125536g;

    /* renamed from: h */
    public C50114a f125537h;

    /* renamed from: i */
    public int f125538i;

    /* renamed from: j */
    public boolean f125539j;

    /* renamed from: k */
    public C50115b f125540k;

    /* renamed from: l */
    public boolean f125541l = true;

    /* renamed from: m */
    public int f125542m = 1;

    /* renamed from: n */
    public int f125543n;

    /* renamed from: o */
    public boolean f125544o = true;

    /* renamed from: p */
    public int f125545p;

    /* renamed from: q */
    public C11030f f125546q;

    /* renamed from: com.ss.android.ugc.playerkit.c.e$a */
    public static class C50114a {

        /* renamed from: a */
        public static int f125547a = 1048576;

        /* renamed from: b */
        public static int f125548b = 409600;

        /* renamed from: c */
        public int f125549c = f125547a;

        /* renamed from: d */
        public int f125550d = f125548b;

        /* renamed from: e */
        public int f125551e = 1;

        /* renamed from: f */
        public int f125552f = 1;

        /* renamed from: g */
        public int f125553g = 2;

        /* renamed from: h */
        public int f125554h;

        /* renamed from: i */
        public int f125555i;

        /* renamed from: j */
        public int f125556j = 2;

        /* renamed from: k */
        public int f125557k = 5000;

        /* renamed from: l */
        public int f125558l = 10000;
    }

    /* renamed from: com.ss.android.ugc.playerkit.c.e$b */
    public static class C50115b {

        /* renamed from: a */
        public String f125559a;

        /* renamed from: b */
        public Map<String, String> f125560b;
    }

    /* renamed from: com.ss.android.ugc.playerkit.c.e$c */
    public enum C50116c {
        Ijk,
        IjkHardware,
        TT,
        EXO,
        TT_IJK_ENGINE,
        TT_HARDWARE,
        LIVE
    }

    /* renamed from: b */
    public final void mo97888b() {
        this.f125538i |= 1;
    }

    /* renamed from: c */
    public final void mo97889c() {
        this.f125538i |= 2;
    }

    /* renamed from: a */
    public final boolean mo97887a() {
        if ((this.f125538i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C50113e mo97886a(SparseIntArray sparseIntArray) {
        this.f125535f = sparseIntArray;
        return this;
    }
}
