package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.widget.C8543d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.es */
public final class C6160es extends C8543d implements OnClickListener {

    /* renamed from: a */
    public C6161a f16533a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.es$a */
    public interface C6161a {
        /* renamed from: h */
        void mo12187h();

        /* renamed from: i */
        void mo12188i();
    }

    /* renamed from: a */
    public final int mo8344a() {
        return R.layout.aiw;
    }

    public C6160es(Context context) {
        super(context);
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.c81) {
            this.f16533a.mo12187h();
        } else if (id == R.id.c82) {
            this.f16533a.mo12188i();
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.c81).setOnClickListener(this);
        findViewById(R.id.c82).setOnClickListener(this);
        findViewById(R.id.c80).setOnClickListener(this);
    }
}
