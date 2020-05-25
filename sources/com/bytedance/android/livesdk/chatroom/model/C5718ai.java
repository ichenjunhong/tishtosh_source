package com.bytedance.android.livesdk.chatroom.model;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ai */
public final class C5718ai {
    /* renamed from: a */
    public static final C5757m m12615a(C5757m mVar, C5757m mVar2) {
        C52711k.m112240b(mVar, "curState");
        C52711k.m112240b(mVar2, "input");
        if (mVar instanceof C5719aj) {
            if ((mVar2 instanceof C5721al) || (mVar2 instanceof C5720ak) || (mVar2 instanceof C5726ao)) {
                return mVar2;
            }
            return mVar;
        } else if (mVar instanceof C5721al) {
            if (mVar2 instanceof C5719aj) {
                return mVar2;
            }
            return mVar;
        } else if (mVar instanceof C5720ak) {
            if (mVar2 instanceof C5719aj) {
                return mVar2;
            }
            return mVar;
        } else if (mVar instanceof C5726ao) {
            if ((mVar2 instanceof C5719aj) || (mVar2 instanceof C5722am)) {
                return mVar2;
            }
            return mVar;
        } else if (!(mVar instanceof C5722am)) {
            throw new IllegalStateException();
        } else if (mVar2 instanceof C5719aj) {
            return mVar2;
        } else {
            return mVar;
        }
    }
}
