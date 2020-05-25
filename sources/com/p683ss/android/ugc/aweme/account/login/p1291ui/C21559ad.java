package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13001b;
import com.bytedance.sdk.account.p844a.p848d.C13013b;
import com.bytedance.sdk.account.p859d.C13081d;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.ad */
public class C21559ad extends C21577f {

    /* renamed from: G */
    private String f58490G = "user_click";

    /* renamed from: H */
    private C13011d f58491H;

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo45828z() {
        return this.f58490G;
    }

    public void afterHandleRequest() {
        super.afterHandleRequest();
        if (isViewValid() && this.f58527u != null) {
            ((CheckButton) this.f58527u).mo45737c();
        }
    }

    public void beforeHandleRequest() {
        if (isViewValid() && this.f58527u != null) {
            ((CheckButton) this.f58527u).mo45735a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo45827r() {
        final String trim = this.f58524r.getText().toString().trim();
        this.f58491H.mo24609a(trim, (C13001b) new C13001b() {
            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C13013b bVar2 = (C13013b) bVar;
                C21559ad.this.mo45853a(C21559ad.this.f58523q.getText().toString(), trim, null);
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                C10691a.m21545b(C21559ad.this.getContext(), C22275o.m55130a((C12990b) (C13013b) bVar)).mo19066a();
            }
        });
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f58491H = C13081d.m26312a(getContext());
        this.f58538A = (TextView) view.findViewById(R.id.cpz);
        this.f58539B = (TextView) view.findViewById(R.id.aki);
        this.f58526t.setTextSize(26.0f);
        String str = "";
        if (!TextUtils.isEmpty(this.f58529w)) {
            str = this.f58529w;
        } else if (!TextUtils.isEmpty(this.f58528v)) {
            str = this.f58528v;
        }
        String a = C2240a.m6772a(getString(R.string.b3_), new Object[]{str});
        if (a != null) {
            i = a.indexOf(str);
        } else {
            i = 0;
        }
        SpannableString spannableString = new SpannableString(a);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a36)), i, str.length() + i, 17);
        this.f58522a.setText(spannableString);
        this.f58527u.setEnabled(false);
        super.mo45849q();
        this.f58490G = "auto_system";
        this.f58538A.performClick();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.az3, viewGroup, false);
        if (VERSION.SDK_INT >= 19) {
            View findViewById = inflate.findViewById(R.id.cso);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = C23724k.m58225c();
            findViewById.setLayoutParams(layoutParams);
        }
        return inflate;
    }
}
