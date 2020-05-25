package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView.ScaleType;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.DmtDialogTestActivity */
public final class DmtDialogTestActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final C41758a f105689a = new C41758a(null);

    /* renamed from: b */
    private HashMap f105690b;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DmtDialogTestActivity$a */
    public static final class C41758a {
        private C41758a() {
        }

        public /* synthetic */ C41758a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DmtDialogTestActivity$b */
    static final class C41759b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DmtDialogTestActivity f105691a;

        C41759b(DmtDialogTestActivity dmtDialogTestActivity) {
            this.f105691a = dmtDialogTestActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Toast makeText = Toast.makeText(this.f105691a, "This is second message", 0);
            if (VERSION.SDK_INT == 25) {
                C47905fy.m103630a(makeText);
            }
            makeText.show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DmtDialogTestActivity$c */
    static final class C41760c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DmtDialogTestActivity f105692a;

        C41760c(DmtDialogTestActivity dmtDialogTestActivity) {
            this.f105692a = dmtDialogTestActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105692a.mo85616a().mo18882b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DmtDialogTestActivity$d */
    static final class C41761d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DmtDialogTestActivity f105693a;

        C41761d(DmtDialogTestActivity dmtDialogTestActivity) {
            this.f105693a = dmtDialogTestActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105693a.mo85616a().mo18883c();
        }
    }

    /* renamed from: a */
    private View m91669a(int i) {
        if (this.f105690b == null) {
            this.f105690b = new HashMap();
        }
        View view = (View) this.f105690b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105690b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DmtDialogTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DmtDialogTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DmtDialogTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final C10641a mo85616a() {
        Context context = this;
        C10643a aVar = new C10643a(context);
        CheckBox checkBox = (CheckBox) m91669a(R.id.f06);
        C52711k.m112236a((Object) checkBox, "title1");
        if (checkBox.isChecked()) {
            aVar.mo18892a("Title");
        }
        CheckBox checkBox2 = (CheckBox) m91669a(R.id.bld);
        C52711k.m112236a((Object) checkBox2, "message");
        if (checkBox2.isChecked()) {
            aVar.mo18902b("What are we building? // （用精简的话描述）这个功能是什么？\nOptimize the design and implementation for dialogs on TikTok\n// 优化 TikTok app 里的弹窗样式\n\nWho’s it for? // 这个功能是为谁构建的？\nFor all TikTok users \n& save life for PMs, designers and engineers who work for TikTok\n\nWhy build it? // 为什么构建它？\nThe old dialogs are not well designed.\nToo much bad cases appears in recent projects, especially in Trust and Safety requirements:\n// 老弹窗的设计考虑不周全\n// 最近在合规项目中遇到太多不符合预期的弹窗样式，希望能尽快统一修复");
        }
        CheckBox checkBox3 = (CheckBox) m91669a(R.id.e78);
        C52711k.m112236a((Object) checkBox3, "enableClose");
        if (checkBox3.isChecked()) {
            aVar.mo18896a(true);
        }
        CheckBox checkBox4 = (CheckBox) m91669a(R.id.euf);
        C52711k.m112236a((Object) checkBox4, "second_message_click");
        if (checkBox4.isChecked()) {
            aVar.mo18895a("This is second message", (OnClickListener) new C41759b(this));
        } else {
            CheckBox checkBox5 = (CheckBox) m91669a(R.id.eue);
            C52711k.m112236a((Object) checkBox5, "second_message");
            if (checkBox5.isChecked()) {
                aVar.f28272c = "This is second message";
            }
        }
        CheckBox checkBox6 = (CheckBox) m91669a(R.id.eug);
        C52711k.m112236a((Object) checkBox6, "second_message_left");
        if (checkBox6.isChecked()) {
            aVar.f28278i = R.drawable.d57;
        }
        CheckBox checkBox7 = (CheckBox) m91669a(R.id.euh);
        C52711k.m112236a((Object) checkBox7, "second_message_right");
        if (checkBox7.isChecked()) {
            aVar.mo18912f(R.drawable.d57);
        }
        CheckBox checkBox8 = (CheckBox) m91669a(R.id.doj);
        C52711k.m112236a((Object) checkBox8, "vertical");
        if (checkBox8.isChecked()) {
            aVar.mo18906c();
        }
        CheckBox checkBox9 = (CheckBox) m91669a(R.id.eqj);
        C52711k.m112236a((Object) checkBox9, "positive");
        if (checkBox9.isChecked()) {
            aVar.mo18893a("Positive", (DialogInterface.OnClickListener) null);
        }
        CheckBox checkBox10 = (CheckBox) m91669a(R.id.emr);
        C52711k.m112236a((Object) checkBox10, "negative");
        if (checkBox10.isChecked()) {
            aVar.mo18903b("Negative", (DialogInterface.OnClickListener) null);
        }
        CheckBox checkBox11 = (CheckBox) m91669a(R.id.emv);
        C52711k.m112236a((Object) checkBox11, "neutral");
        if (checkBox11.isChecked()) {
            aVar.mo18908c("Netural", null);
        }
        CheckBox checkBox12 = (CheckBox) m91669a(R.id.eql);
        C52711k.m112236a((Object) checkBox12, "positive_highlight");
        if (checkBox12.isChecked()) {
            aVar.mo18898b();
        }
        CheckBox checkBox13 = (CheckBox) m91669a(R.id.aqa);
        C52711k.m112236a((Object) checkBox13, "icon");
        if (checkBox13.isChecked()) {
            aVar.mo18907c(R.drawable.b12);
        }
        CheckBox checkBox14 = (CheckBox) m91669a(R.id.f0j);
        C52711k.m112236a((Object) checkBox14, "top_background_color");
        if (checkBox14.isChecked()) {
            aVar.mo18910d(-3476230);
        }
        CheckBox checkBox15 = (CheckBox) m91669a(R.id.e79);
        C52711k.m112236a((Object) checkBox15, "enableColse_dark");
        if (checkBox15.isChecked()) {
            aVar.f28269N = true;
        }
        CheckBox checkBox16 = (CheckBox) m91669a(R.id.e4e);
        C52711k.m112236a((Object) checkBox16, "custom_image");
        if (checkBox16.isChecked()) {
            SmartImageView smartImageView = new SmartImageView(context);
            smartImageView.setScaleType(ScaleType.CENTER_CROP);
            smartImageView.setImageResource(R.drawable.d3h);
            View view = smartImageView;
            C52711k.m112240b(aVar, "builder");
            C52711k.m112240b(view, "image");
            aVar.mo18889a(view, 48, 48);
        }
        C10641a a = aVar.mo18897a();
        C52711k.m112236a((Object) a, "builder.create()");
        return a;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DmtDialogTestActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ax_);
        ((Button) m91669a(R.id.e4p)).setOnClickListener(new C41760c(this));
        ((Button) m91669a(R.id.e5h)).setOnClickListener(new C41761d(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DmtDialogTestActivity", "onCreate", false);
    }
}
