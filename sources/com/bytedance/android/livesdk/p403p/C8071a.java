package com.bytedance.android.livesdk.p403p;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.common.utility.p522b.C9381g.C9382a;

/* renamed from: com.bytedance.android.livesdk.p.a */
public final class C8071a implements OnCancelListener, C9382a {

    /* renamed from: a */
    public boolean f22050a;

    /* renamed from: b */
    private Handler f22051b;

    /* renamed from: c */
    private boolean f22052c;

    /* renamed from: b */
    public final void mo14232b() {
        this.f22051b.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo14231a() {
        this.f22051b.removeCallbacksAndMessages(null);
        if (!this.f22050a && !TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            this.f22051b.sendEmptyMessageDelayed(1, 180000);
            this.f22052c = true;
        }
    }

    public final void handleMsg(Message message) {
        int i = message.what;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo14231a();
    }
}
