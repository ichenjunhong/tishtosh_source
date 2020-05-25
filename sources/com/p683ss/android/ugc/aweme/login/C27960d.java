package com.p683ss.android.ugc.aweme.login;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.login.d */
public final class C27960d extends Dialog {

    /* renamed from: a */
    public C27961a f73389a;

    /* renamed from: com.ss.android.ugc.aweme.login.d$a */
    public interface C27961a {
        /* renamed from: a */
        void mo56367a();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (this.f73389a != null) {
            this.f73389a.mo56367a();
        }
    }

    public C27960d(Context context) {
        super(context, R.style.a6l);
        setContentView(LayoutInflater.from(context).inflate(R.layout.bkp, null));
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.height = (int) C9432q.m18687b(context, 57.0f);
        attributes.width = (int) C9432q.m18687b(context, 57.0f);
        window.setAttributes(attributes);
    }
}
