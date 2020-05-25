package com.p683ss.android.ugc.aweme.app.debug;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.provider.Settings;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.LogListActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.app.debug.FlowWindowService */
public class FlowWindowService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        WindowManager windowManager = (WindowManager) getSystemService("window");
        DmtButton dmtButton = new DmtButton(getApplicationContext());
        dmtButton.setText("Log");
        dmtButton.setBackgroundDrawable(AwemeApplication.m56199a().getResources().getDrawable(R.drawable.bcy));
        dmtButton.setWidth((int) C9432q.m18687b((Context) AwemeApplication.m56199a(), 50.0f));
        dmtButton.setHeight((int) C9432q.m18687b((Context) AwemeApplication.m56199a(), 50.0f));
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.type = 2002;
        layoutParams.format = 1;
        layoutParams.gravity = 51;
        layoutParams.flags = 40;
        layoutParams.width = (int) C9432q.m18687b((Context) AwemeApplication.m56199a(), 50.0f);
        layoutParams.height = (int) C9432q.m18687b((Context) AwemeApplication.m56199a(), 50.0f);
        layoutParams.x = C9432q.m18670a((Context) AwemeApplication.m56199a()) - ((int) C9432q.m18687b((Context) AwemeApplication.m56199a(), 55.0f));
        layoutParams.y = (int) C9432q.m18687b((Context) AwemeApplication.m56199a(), 120.0f);
        windowManager.addView(dmtButton, layoutParams);
        dmtButton.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (VERSION.SDK_INT < 23) {
                    C10691a.m21546b((Context) FlowWindowService.this, "请使用Android 5.0以上系统手机", 1).mo19066a();
                } else if (Settings.canDrawOverlays(FlowWindowService.this)) {
                    Intent intent = new Intent(FlowWindowService.this, LogListActivity.class);
                    intent.addFlags(268435456);
                    FlowWindowService.this.startActivity(intent);
                } else {
                    C10691a.m21546b((Context) FlowWindowService.this, "请先授予抖音悬浮窗权限", 1).mo19066a();
                }
            }
        });
        return super.onStartCommand(intent, i, i2);
    }
}
