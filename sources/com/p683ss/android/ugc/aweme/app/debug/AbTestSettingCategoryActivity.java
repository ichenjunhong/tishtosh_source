package com.p683ss.android.ugc.aweme.app.debug;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41565b;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41576h;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41577i;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41578j;
import com.p683ss.android.ugc.aweme.setting.p2148ui.AbStateView;
import com.p683ss.android.ugc.aweme.setting.p2148ui.AbSwitchView;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.ss.android.ugc.aweme.app.debug.AbTestSettingCategoryActivity */
public class AbTestSettingCategoryActivity extends AbsABActivity {
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingCategoryActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingCategoryActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingCategoryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingCategoryActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingCategoryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo47790c() {
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        Iterator it = this.f61450e.getExtraInfoDelegates().iterator();
        while (it.hasNext()) {
            Field field = ((C41576h) it.next()).f105293d;
            if (((C41565b) field.getAnnotation(C41565b.class)) != null && field.getType().equals(Boolean.TYPE)) {
                treeMap2.put(field.getName(), field);
            } else if (((C41578j) field.getAnnotation(C41578j.class)) != null && field.getType().equals(Integer.TYPE)) {
                treeMap.put(new C41577i(field, this.f61449d).mo85356b(), field);
            }
        }
        for (Field field2 : treeMap2.values()) {
            AbSwitchView abSwitchView = new AbSwitchView(this);
            abSwitchView.mo85563a(field2, this.f61449d);
            this.f61448c.addView(abSwitchView);
        }
        for (Field field3 : treeMap.values()) {
            AbStateView abStateView = new AbStateView(this);
            abStateView.mo85561a(field3, this.f61449d);
            this.f61448c.addView(abStateView);
        }
    }
}
