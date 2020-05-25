package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel */
public final class RecordMVViewModel extends BaseJediViewModel<RecordMVState> {

    /* renamed from: d */
    public Effect f119250d;

    /* renamed from: e */
    public ShortVideoContext f119251e;

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new RecordMVState(null, null, 3, null);
    }

    /* renamed from: e */
    public final ShortVideoContext mo94494e() {
        ShortVideoContext shortVideoContext = this.f119251e;
        if (shortVideoContext == null) {
            C52711k.m112237a("shortVideoContext");
        }
        return shortVideoContext;
    }
}
