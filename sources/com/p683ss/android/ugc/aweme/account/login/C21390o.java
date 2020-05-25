package com.p683ss.android.ugc.aweme.account.login;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.o */
public final class C21390o extends Dialog {

    /* renamed from: a */
    public C21391a f58047a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.o$a */
    public interface C21391a {
        /* renamed from: e */
        void mo45120e();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (this.f58047a != null) {
            this.f58047a.mo45120e();
        }
    }

    public C21390o(Context context) {
        super(context, R.style.a3h);
        setContentView(LayoutInflater.from(context).inflate(R.layout.aym, null));
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.height = (int) C9432q.m18687b(context, 57.0f);
        attributes.width = (int) C9432q.m18687b(context, 57.0f);
        window.setAttributes(attributes);
    }
}
