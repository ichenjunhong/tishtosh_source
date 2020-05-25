package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class CommonToastLayout extends FrameLayout {

    /* renamed from: a */
    private C6622a f17987a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout$a */
    public interface C6622a {
        /* renamed from: a */
        void mo12664a(CommonToastLayout commonToastLayout);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f17987a != null) {
            this.f17987a.mo12664a(this);
        }
    }

    public void setOnDetachListener(C6622a aVar) {
        this.f17987a = aVar;
    }

    public CommonToastLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
