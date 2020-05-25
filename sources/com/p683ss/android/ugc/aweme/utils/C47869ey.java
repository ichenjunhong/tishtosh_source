package com.p683ss.android.ugc.aweme.utils;

import android.app.Dialog;
import android.support.p043v7.app.C1160b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.utils.C47865ew.C47867a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.ey */
final /* synthetic */ class C47869ey implements OnClickListener {

    /* renamed from: a */
    private final C47865ew f120453a;

    /* renamed from: b */
    private final EditText f120454b;

    /* renamed from: c */
    private final EditText f120455c;

    /* renamed from: d */
    private final ProgressBar f120456d;

    /* renamed from: e */
    private final C1160b f120457e;

    /* renamed from: f */
    private final JSONObject f120458f;

    C47869ey(C47865ew ewVar, EditText editText, EditText editText2, ProgressBar progressBar, C1160b bVar, JSONObject jSONObject) {
        this.f120453a = ewVar;
        this.f120454b = editText;
        this.f120455c = editText2;
        this.f120456d = progressBar;
        this.f120457e = bVar;
        this.f120458f = jSONObject;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C47865ew ewVar = this.f120453a;
        EditText editText = this.f120454b;
        EditText editText2 = this.f120455c;
        ProgressBar progressBar = this.f120456d;
        C1160b bVar = this.f120457e;
        JSONObject jSONObject = this.f120458f;
        String obj = editText.getText().toString();
        String obj2 = editText2.getText().toString();
        if (!TextUtils.isEmpty(ewVar.f120437c) && TextUtils.equals(obj, ewVar.f120437c)) {
            C47865ew.m103537a((Dialog) bVar, editText);
            ewVar.mo95079a(obj, obj2, jSONObject);
        } else if (!C47870ez.m103558a(view.getContext())) {
            editText.setError("Network error.");
        } else {
            progressBar.setVisibility(0);
            if (C47864ev.f120425a != null) {
                C47864ev evVar = C47864ev.f120425a;
                C478661 r0 = new C47867a(obj, progressBar, bVar, editText, obj2, jSONObject) {

                    /* renamed from: a */
                    final /* synthetic */ String f120444a;

                    /* renamed from: b */
                    final /* synthetic */ ProgressBar f120445b;

                    /* renamed from: c */
                    final /* synthetic */ C1160b f120446c;

                    /* renamed from: d */
                    final /* synthetic */ EditText f120447d;

                    /* renamed from: e */
                    final /* synthetic */ String f120448e;

                    /* renamed from: f */
                    final /* synthetic */ JSONObject f120449f;

                    /* renamed from: b */
                    public final void mo95085b() {
                        this.f120445b.setVisibility(8);
                        this.f120447d.setError("Your input is invalid.");
                    }

                    /* renamed from: a */
                    public final void mo95084a() {
                        C47865ew.this.f120437c = this.f120444a;
                        C47865ew.this.f120440f.storeString("lastInputEmailPrefix", C47865ew.this.f120437c);
                        this.f120445b.setVisibility(8);
                        C47865ew.m103537a((Dialog) this.f120446c, this.f120447d);
                        C47865ew.this.mo95079a(this.f120444a, this.f120448e, this.f120449f);
                    }

                    {
                        this.f120444a = r2;
                        this.f120445b = r3;
                        this.f120446c = r4;
                        this.f120447d = r5;
                        this.f120448e = r6;
                        this.f120449f = r7;
                    }
                };
                evVar.checkLarkEmail(obj, r0);
            }
        }
    }
}
