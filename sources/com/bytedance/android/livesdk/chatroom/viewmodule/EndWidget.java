package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.model.C5745d;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;

public class EndWidget extends LiveWidget {
    public int getLayoutId() {
        return R.layout.asb;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_widget_loaded", new C5745d());
        }
    }
}
