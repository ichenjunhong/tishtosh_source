package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter.C5773a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ca */
final /* synthetic */ class C5850ca implements C1710e {

    /* renamed from: a */
    private final RadioViewPresenter f15318a;

    C5850ca(RadioViewPresenter radioViewPresenter) {
        this.f15318a = radioViewPresenter;
    }

    public final void accept(Object obj) {
        RadioViewPresenter radioViewPresenter = this.f15318a;
        C4177d dVar = (C4177d) obj;
        if (radioViewPresenter.mo8518c() != null) {
            if (dVar.statusCode == 0) {
                ((C5773a) radioViewPresenter.mo8518c()).mo11661e();
                return;
            }
            ((C5773a) radioViewPresenter.mo8518c()).mo11662f();
        }
    }
}
