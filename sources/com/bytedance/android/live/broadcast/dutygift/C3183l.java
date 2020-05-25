package com.bytedance.android.live.broadcast.dutygift;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.event.C5161ag;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.widget.C8543d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.dutygift.l */
public final class C3183l extends C8543d implements OnClickListener {

    /* renamed from: a */
    private OnClickListener f9231a;

    /* renamed from: a */
    public final int mo8344a() {
        return R.layout.ahu;
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.b0y) {
            C4495a.m10823a().mo10301a((Object) new C5161ag("https://webcast.huoshan.com/falcon/webcast_huoshan/page/gift_task_intro/", ""));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.akx).setOnClickListener(this.f9231a);
        findViewById(R.id.b0y).setOnClickListener(this);
    }

    public C3183l(Context context, OnClickListener onClickListener) {
        super(context);
        this.f9231a = onClickListener;
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
