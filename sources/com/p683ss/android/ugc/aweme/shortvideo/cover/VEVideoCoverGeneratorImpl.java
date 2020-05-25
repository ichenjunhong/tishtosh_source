package com.p683ss.android.ugc.aweme.shortvideo.cover;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c.C42543a;
import com.p683ss.android.ugc.aweme.shortvideo.mob.C43994a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl */
public class VEVideoCoverGeneratorImpl implements C0183j, C42542c {

    /* renamed from: a */
    private int[] f107581a;

    /* renamed from: b */
    int f107582b;

    /* renamed from: c */
    protected int f107583c;

    /* renamed from: d */
    C20347c f107584d;

    /* renamed from: e */
    List<Long> f107585e = new ArrayList();

    /* renamed from: f */
    private String f107586f;

    /* renamed from: g */
    private final String f107587g = "VEVideoCoverGeneratorImpl";

    /* renamed from: a */
    public final int mo78726a() {
        return this.f107582b;
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f107584d.mo43092v();
        C43994a.m96557a(this.f107585e, this.f107586f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int[] mo86760a(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3 * i4;
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo78727a(int i, int i2, C42543a aVar) {
        int i3;
        int i4;
        if (this.f107583c <= 0) {
            this.f107583c = this.f107584d.mo43071k();
        }
        if (this.f107581a == null) {
            this.f107581a = mo86760a(this.f107583c, this.f107582b);
        }
        int[] iArr = this.f107581a;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        if (i2 > i && i != -1) {
            i4 = i;
            i3 = -1;
        } else if (i2 != -1) {
            i3 = i2;
            i4 = -1;
        } else {
            i4 = i;
            i3 = i2;
        }
        C42555k kVar = new C42555k(this, iArr, i4, i3, aVar, atomicInteger, System.currentTimeMillis());
        C0013i.m16a((Callable<TResult>) kVar);
    }

    public VEVideoCoverGeneratorImpl(C20347c cVar, C0184k kVar, int i, String str) {
        kVar.getLifecycle().mo324a(this);
        this.f107584d = cVar;
        this.f107582b = i;
        this.f107586f = str;
    }
}
