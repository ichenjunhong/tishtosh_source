package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.o */
public class C33631o implements OnClickListener, OnLongClickListener {
    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public boolean onLongClick(View view) {
        return false;
    }

    /* renamed from: a */
    public static void m77055a(OnLongClickListener onLongClickListener, View... viewArr) {
        for (int i = 0; i < 2; i++) {
            viewArr[i].setOnLongClickListener(onLongClickListener);
        }
    }

    /* renamed from: a */
    public static void m77054a(OnClickListener onClickListener, View... viewArr) {
        if (viewArr.length > 0) {
            for (View onClickListener2 : viewArr) {
                onClickListener2.setOnClickListener(onClickListener);
            }
        }
    }
}
