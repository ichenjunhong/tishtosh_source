package com.bytedance.android.livesdk.p426x;

import android.support.p030v4.app.C0654k;
import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.bytedance.android.live.room.C4194m;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b.C4511a;
import com.bytedance.android.livesdkapi.host.C8806j;

/* renamed from: com.bytedance.android.livesdk.x.l */
public final class C8578l implements C4194m {

    /* renamed from: com.bytedance.android.livesdk.x.l$a */
    public static final class C8579a implements C4510b<C4194m> {
        /* renamed from: a */
        public final C4511a<C4194m> mo10307a(C4511a<C4194m> aVar) {
            return aVar.mo10337a(new C8578l()).mo10336a();
        }
    }

    /* renamed from: a */
    public final void mo9642a() {
        TTLiveSDKContext.getHostService().mo10310c().hideStickerView();
    }

    /* renamed from: b */
    public final boolean mo9644b() {
        return TTLiveSDKContext.getHostService().mo10310c().isShowStickerView();
    }

    /* renamed from: a */
    public final void mo9643a(AppCompatActivity appCompatActivity, C0654k kVar, String str, FrameLayout frameLayout, C8806j jVar) {
        TTLiveSDKContext.getHostService().mo10310c().showStickerView(appCompatActivity, kVar, str, frameLayout, jVar);
    }
}
