package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.message.model.C7833bh;
import com.ss.android.ugc.trill.R;

public class TopLeftLuckyBoxWidget extends LuckyBoxWidget {
    public int getLayoutId() {
        return R.layout.aqm;
    }

    /* renamed from: a */
    public final void mo12540a(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            this.f17364c = viewGroup;
        }
    }

    public void onLoad(Object... objArr) {
        super.onLoad(objArr);
        this.f17363b = 60;
    }

    /* renamed from: a */
    public final void mo11714a(C7833bh bhVar) {
        if (this.f17364c != null) {
            super.mo11714a(bhVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo12471a(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60;
        long j3 = j - (60 * j2);
        sb.append(j2);
        sb.append(":");
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3);
        return sb.toString();
    }
}
