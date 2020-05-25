package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22974c;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.List;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.m */
public class C28334m extends SearchApiResult implements C22974c {
    @C17952c(mo34828a = "cursor")

    /* renamed from: b */
    public int f74374b;
    @C17952c(mo34828a = "has_more")

    /* renamed from: c */
    public boolean f74375c;
    @C17952c(mo34828a = "data")

    /* renamed from: d */
    public List<C28333l> f74376d;
    @C17952c(mo34828a = "tab_hide")

    /* renamed from: e */
    public long f74377e;

    /* renamed from: f */
    public String f74378f;

    /* renamed from: g */
    public C0013i<C28334m> f74379g;

    /* renamed from: a */
    public final void mo47748a(String str) {
        this.f74378f = str;
    }

    public void setRequestId(String str) {
        super.setRequestId(str);
        for (C28333l requestId : this.f74376d) {
            requestId.setRequestId(str);
        }
    }
}
