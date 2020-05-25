package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.bytedance.liko.p771a.C12267c;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.memory.C36766a;
import com.p683ss.android.ugc.aweme.memory.C36771b;
import com.ss.android.ugc.trill.R;
import java.io.PrintStream;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity */
public final class MemoryTestActivity extends AppCompatActivity {

    /* renamed from: a */
    public SettingItemSwitch f105705a;

    /* renamed from: b */
    public SettingItemSwitch f105706b;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity$a */
    static final class C41765a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MemoryTestActivity f105707a;

        C41765a(MemoryTestActivity memoryTestActivity) {
            this.f105707a = memoryTestActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SettingItemSwitch settingItemSwitch = this.f105707a.f105705a;
            if (settingItemSwitch == null) {
                C52711k.m112234a();
            }
            SettingItemSwitch settingItemSwitch2 = this.f105707a.f105705a;
            if (settingItemSwitch2 == null) {
                C52711k.m112234a();
            }
            settingItemSwitch.setChecked(!settingItemSwitch2.mo19319a());
            Context context = this.f105707a;
            SettingItemSwitch settingItemSwitch3 = this.f105707a.f105705a;
            if (settingItemSwitch3 == null) {
                C52711k.m112234a();
            }
            boolean a = settingItemSwitch3.mo19319a();
            if (context != null) {
                SharedPreferences a2 = C35807d.m80935a(context, "LeakDetectorSp", 0);
                if (a2 != null) {
                    Editor edit = a2.edit();
                    if (edit != null) {
                        Editor putBoolean = edit.putBoolean("open_leak_detector_on_local_test", a);
                        if (putBoolean != null) {
                            putBoolean.commit();
                        }
                    }
                }
            }
            SettingItemSwitch settingItemSwitch4 = this.f105707a.f105705a;
            if (settingItemSwitch4 == null) {
                C52711k.m112234a();
            }
            C12267c.m24746a(settingItemSwitch4.mo19319a());
            C10691a.m21537a((Context) this.f105707a, "冷启后配置生效").mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity$b */
    static final class C41766b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MemoryTestActivity f105708a;

        C41766b(MemoryTestActivity memoryTestActivity) {
            this.f105708a = memoryTestActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SettingItemSwitch settingItemSwitch = this.f105708a.f105706b;
            if (settingItemSwitch == null) {
                C52711k.m112234a();
            }
            SettingItemSwitch settingItemSwitch2 = this.f105708a.f105706b;
            if (settingItemSwitch2 == null) {
                C52711k.m112234a();
            }
            settingItemSwitch.setChecked(!settingItemSwitch2.mo19319a());
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder("nativeMemoryItem");
            SettingItemSwitch settingItemSwitch3 = this.f105708a.f105706b;
            if (settingItemSwitch3 == null) {
                C52711k.m112234a();
            }
            sb.append(settingItemSwitch3.isChecked());
            printStream.println(sb.toString());
            C36771b bVar = (C36771b) C23540d.m57713a(this.f105708a, C36771b.class);
            SettingItemSwitch settingItemSwitch4 = this.f105708a.f105706b;
            if (settingItemSwitch4 == null) {
                C52711k.m112234a();
            }
            bVar.mo48536b(Boolean.valueOf(settingItemSwitch4.mo19319a()));
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void configFdLeak(View view) {
        C52711k.m112240b(view, "v");
        new C36766a(this).show();
    }

    public final void startLeakActivity(View view) {
        C52711k.m112240b(view, "v");
        startActivity(new Intent(this, LeakTestActivity.class));
    }

    public final void triggerOOM(View view) {
        C52711k.m112240b(view, "v");
        startActivity(new Intent(this, OOMTestActivity.class));
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cp);
        SettingItemSwitch settingItemSwitch = (SettingItemSwitch) findViewById(R.id.b_m);
        settingItemSwitch.setChecked(C12267c.m24747a());
        this.f105705a = settingItemSwitch;
        SettingItemSwitch settingItemSwitch2 = this.f105705a;
        if (settingItemSwitch2 != null) {
            settingItemSwitch2.setOnClickListener(new C41765a(this));
        }
        SettingItemSwitch settingItemSwitch3 = (SettingItemSwitch) findViewById(R.id.bpx);
        Boolean a = ((C36771b) C23540d.m57713a(this, C36771b.class)).mo48535a(Boolean.valueOf(true));
        C52711k.m112236a((Object) a, "SharedPreferencesHelper.…NativeMemoryMonitor(true)");
        settingItemSwitch3.setChecked(a.booleanValue());
        this.f105706b = settingItemSwitch3;
        SettingItemSwitch settingItemSwitch4 = this.f105706b;
        if (settingItemSwitch4 != null) {
            settingItemSwitch4.setOnClickListener(new C41766b(this));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity", "onCreate", false);
    }
}
