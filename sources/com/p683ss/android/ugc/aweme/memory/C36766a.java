package com.p683ss.android.ugc.aweme.memory;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.bytedance.liko.p771a.C12265a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.memory.a */
public final class C36766a extends Dialog {

    /* renamed from: com.ss.android.ugc.aweme.memory.a$a */
    static final class C36767a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f93955a;

        C36767a(SettingItemSwitch settingItemSwitch) {
            this.f93955a = settingItemSwitch;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SettingItemSwitch settingItemSwitch = this.f93955a;
            C52711k.m112236a((Object) settingItemSwitch, "itemSwitch");
            SettingItemSwitch settingItemSwitch2 = this.f93955a;
            C52711k.m112236a((Object) settingItemSwitch2, "itemSwitch");
            settingItemSwitch.setChecked(!settingItemSwitch2.mo19319a());
            SettingItemSwitch settingItemSwitch3 = this.f93955a;
            C52711k.m112236a((Object) settingItemSwitch3, "itemSwitch");
            C12265a.m24738a(settingItemSwitch3.mo19319a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.memory.a$b */
    static final class C36768b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36766a f93956a;

        /* renamed from: b */
        final /* synthetic */ DmtEditText f93957b;

        /* renamed from: c */
        final /* synthetic */ DmtEditText f93958c;

        /* renamed from: d */
        final /* synthetic */ DmtEditText f93959d;

        C36768b(C36766a aVar, DmtEditText dmtEditText, DmtEditText dmtEditText2, DmtEditText dmtEditText3) {
            this.f93956a = aVar;
            this.f93957b = dmtEditText;
            this.f93958c = dmtEditText2;
            this.f93959d = dmtEditText3;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            DmtEditText dmtEditText = this.f93957b;
            if (dmtEditText != null) {
                Editable text = dmtEditText.getText();
                if (text != null) {
                    try {
                        long parseLong = Long.parseLong(text.toString());
                        if (parseLong > 0) {
                            C12265a.m24737a(parseLong);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            DmtEditText dmtEditText2 = this.f93958c;
            if (dmtEditText2 != null) {
                Editable text2 = dmtEditText2.getText();
                if (text2 != null) {
                    try {
                        int parseInt = Integer.parseInt(text2.toString());
                        if (parseInt > 0) {
                            C12265a.m24736a(parseInt);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            DmtEditText dmtEditText3 = this.f93959d;
            if (dmtEditText3 != null) {
                Editable text3 = dmtEditText3.getText();
                if (text3 != null) {
                    try {
                        int parseInt2 = Integer.parseInt(text3.toString());
                        if (parseInt2 > 0) {
                            C12265a.m24741b(parseInt2);
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
            this.f93956a.dismiss();
        }
    }

    public C36766a(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        setContentView(R.layout.k0);
        SettingItemSwitch settingItemSwitch = (SettingItemSwitch) findViewById(R.id.aea);
        DmtEditText dmtEditText = (DmtEditText) findViewById(R.id.auq);
        DmtEditText dmtEditText2 = (DmtEditText) findViewById(R.id.d3v);
        DmtEditText dmtEditText3 = (DmtEditText) findViewById(R.id.coo);
        settingItemSwitch.setChecked(C12265a.m24739a());
        settingItemSwitch.setOnClickListener(new C36767a(settingItemSwitch));
        Button button = (Button) findViewById(R.id.yn);
        if (button != null) {
            button.setOnClickListener(new C36768b(this, dmtEditText, dmtEditText2, dmtEditText3));
        }
        setCanceledOnTouchOutside(true);
    }
}
