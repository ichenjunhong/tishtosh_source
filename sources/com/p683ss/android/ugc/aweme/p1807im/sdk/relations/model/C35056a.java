package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.a */
public final class C35056a implements Serializable {

    /* renamed from: a */
    private int f90191a;

    /* renamed from: b */
    private List<String> f90192b;

    public final int getRelationType() {
        return this.f90191a;
    }

    public final List<String> getSecUserIds() {
        return this.f90192b;
    }

    public final void setRelationType(int i) {
        this.f90191a = i;
    }

    public final void setSecUserIds(List<String> list) {
        this.f90192b = list;
    }

    public C35056a(int i, List<String> list) {
        this.f90191a = i;
        this.f90192b = list;
    }
}
