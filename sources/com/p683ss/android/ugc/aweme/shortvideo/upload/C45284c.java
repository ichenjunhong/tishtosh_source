package com.p683ss.android.ugc.aweme.shortvideo.upload;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45292c;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c */
public final class C45284c implements C0184k {

    /* renamed from: a */
    public C45311o f114501a;

    /* renamed from: b */
    public List<String> f114502b = new ArrayList();

    /* renamed from: c */
    public C45239a f114503c;

    /* renamed from: d */
    public int f114504d = -1;

    /* renamed from: e */
    public C50711k f114505e;

    /* renamed from: f */
    public C50711k f114506f;

    /* renamed from: g */
    public VEVideoEncodeSettings f114507g;

    /* renamed from: h */
    public String f114508h;

    /* renamed from: i */
    public boolean f114509i;

    /* renamed from: j */
    public C45292c f114510j;

    /* renamed from: k */
    private C0185l f114511k = new C0185l(this);

    public final C0176h getLifecycle() {
        return this.f114511k;
    }

    public C45284c(C45311o oVar, C45239a aVar, int i, String str, boolean z, C45292c cVar) {
        this.f114511k.mo333a(C0178b.STARTED);
        this.f114501a = oVar;
        this.f114503c = aVar;
        this.f114504d = 0;
        this.f114508h = str;
        this.f114509i = z;
        this.f114510j = cVar;
    }
}
