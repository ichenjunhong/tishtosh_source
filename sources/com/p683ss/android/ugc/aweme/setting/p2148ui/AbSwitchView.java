package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase.C10731a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41565b;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41595a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AbSwitchView */
public class AbSwitchView extends FrameLayout {

    /* renamed from: a */
    public SettingItemSwitch f105586a;

    /* renamed from: b */
    private Field f105587b;

    public AbSwitchView(Context context) {
        this(context, null);
    }

    public AbSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo85563a(final Field field, final Object obj) {
        if (field.getType().equals(Boolean.TYPE)) {
            this.f105587b = field;
            this.f105587b.setAccessible(true);
            try {
                mo85564b(field, obj);
                this.f105586a.setOnSettingItemClickListener(new C10731a() {
                    public final void OnSettingItemClick(View view) {
                        try {
                            if (AbSwitchView.this.f105586a.mo19319a()) {
                                field.set(obj, Boolean.valueOf(false));
                            } else {
                                field.set(obj, Boolean.valueOf(true));
                            }
                            AbSwitchView.this.mo85564b(field, obj);
                            C47718bf.m103288a(new C41595a());
                        } catch (IllegalAccessException unused) {
                        }
                    }
                });
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo85564b(Field field, Object obj) throws IllegalAccessException {
        String str;
        SettingItemSwitch settingItemSwitch;
        boolean booleanValue = ((Boolean) field.get(obj)).booleanValue();
        C41565b bVar = (C41565b) field.getAnnotation(C41565b.class);
        this.f105586a.setChecked(booleanValue);
        if (!TextUtils.isEmpty(bVar.mo85351b()) || !TextUtils.isEmpty(bVar.mo85350a())) {
            settingItemSwitch = this.f105586a;
            if (booleanValue) {
                str = bVar.mo85350a();
            } else {
                str = bVar.mo85351b();
            }
        } else {
            SettingItemSwitch settingItemSwitch2 = this.f105586a;
            str = field.getName();
            settingItemSwitch = settingItemSwitch2;
        }
        settingItemSwitch.setStartText(str);
    }

    public AbSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a1e, this, true);
        this.f105586a = (SettingItemSwitch) findViewById(R.id.av9);
    }
}
