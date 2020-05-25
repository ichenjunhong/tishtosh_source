package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.detail.C27311a;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.c */
public abstract class C24637c extends C27311a implements C9382a {

    /* renamed from: a */
    protected List<Integer> f65201a;

    /* renamed from: b */
    protected C9381g f65202b = new C9381g(this);

    /* renamed from: c */
    protected C45547d f65203c;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo50499g() {
        return "";
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: e */
    public final void mo50498e() {
        if (this.f72042H != null) {
            this.f72042H.mo55755a(false);
        }
    }

    public void onStop() {
        super.onStop();
        this.f65202b.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f65203c != null && this.f65203c.isShowing()) {
            this.f65203c.dismiss();
        }
        this.f65203c = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
