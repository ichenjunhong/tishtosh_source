package com.p683ss.android.ugc.aweme.sdk.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.app.C1160b.C1161a;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.sdk.iap.C41367e.C41369b;
import com.p683ss.android.ugc.aweme.sdk.iap.C41367e.C41370c;
import com.p683ss.android.ugc.aweme.sdk.iap.p2120a.C41346a;
import com.p683ss.android.ugc.aweme.sdk.iap.p2120a.C41346a.C41347a;
import com.p683ss.android.ugc.aweme.sdk.iap.p2120a.C41349b;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41393g;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity */
public class IapWalletActivity extends AmeActivity implements OnClickListener, C41370c {

    /* renamed from: a */
    public C41369b f104820a;

    /* renamed from: b */
    private View f104821b;

    /* renamed from: c */
    private View f104822c;

    /* renamed from: d */
    private TextView f104823d;

    /* renamed from: e */
    private TextView f104824e;

    /* renamed from: f */
    private RecyclerView f104825f;

    /* renamed from: g */
    private C41346a f104826g;

    /* renamed from: h */
    private TextView f104827h;

    /* renamed from: b */
    public final Activity mo83913b() {
        return this;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    /* renamed from: a */
    public final boolean mo83912a() {
        return isViewValid();
    }

    /* renamed from: d */
    public final void mo83915d() {
        if (isViewValid()) {
            dismissProgressDialog();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f104820a != null) {
            this.f104820a.mo83953e();
        }
    }

    /* renamed from: c */
    public final void mo83914c() {
        if (isViewValid()) {
            showProgressDialog(getString(R.string.bym));
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity", "onResume", true);
        super.onResume();
        if (this.f104820a != null) {
            this.f104820a.mo83952d();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity", "onResume", false);
    }

    /* renamed from: a */
    public final void mo83911a(List<C41349b> list) {
        C41346a aVar = this.f104826g;
        aVar.f104840a.clear();
        if (list != null && list.size() > 0) {
            aVar.f104840a.addAll(list);
        }
        aVar.notifyDataSetChanged();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.ay9) {
            finish();
        } else if (view.getId() == R.id.b8k) {
            this.f104820a.mo83950b();
        } else {
            if (view.equals(this.f104822c)) {
                this.f104820a.mo83951c();
            }
        }
    }

    /* renamed from: a */
    public final void mo83910a(C41345a aVar) {
        C1161a aVar2 = new C1161a(this, R.style.s8);
        Context a = aVar2.mo3757a();
        aVar2.mo3764a((CharSequence) C41345a.m91119a(a, aVar.f104834e, aVar.f104830a));
        aVar2.mo3770b((CharSequence) C41345a.m91119a(a, aVar.f104835f, aVar.f104831b));
        aVar2.mo3765a((CharSequence) C41345a.m91119a(a, aVar.f104836g, aVar.f104832c), aVar.f104838i);
        aVar2.mo3771b((CharSequence) C41345a.m91119a(a, aVar.f104837h, aVar.f104833d), aVar.f104839j);
        aVar2.mo3775c();
    }

    public void onCreate(Bundle bundle) {
        URLSpan[] uRLSpanArr;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cu);
        ((TextView) findViewById(R.id.dhb)).getPaint().setFakeBoldText(true);
        this.f104823d = (TextView) findViewById(R.id.d86);
        this.f104823d.getPaint().setFakeBoldText(true);
        this.f104827h = (TextView) findViewById(R.id.d8h);
        SpannableString spannableString = new SpannableString(this.f104827h.getText());
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            spannableString.setSpan(new UnderlineSpan() {
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            }, spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 0);
        }
        this.f104824e = (TextView) findViewById(R.id.dey);
        this.f104821b = findViewById(R.id.b8k);
        this.f104821b.setVisibility(8);
        this.f104825f = (RecyclerView) findViewById(R.id.cag);
        this.f104822c = findViewById(R.id.b8l);
        this.f104822c.setVisibility(8);
        findViewById(R.id.ay9).setOnClickListener(this);
        this.f104821b.setOnClickListener(this);
        this.f104822c.setOnClickListener(this);
        if (VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | VideoCacheReadBuffersizeExperiment.DEFAULT);
        }
        this.f104826g = new C41346a();
        this.f104826g.f104841b = new C41347a() {
            /* renamed from: a */
            public final void mo83919a(View view, C41349b bVar) {
                IapWalletActivity.this.f104820a.mo83949a(bVar.f104846b, bVar.f104845a);
            }
        };
        this.f104825f.setLayoutManager(new LinearLayoutManager(this));
        this.f104825f.setHasFixedSize(true);
        this.f104825f.setAdapter(this.f104826g);
        String stringExtra = getIntent().getStringExtra("extra_iap_key");
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
        } else {
            this.f104820a = new C41371f((C41370c) this, stringExtra);
            this.f104820a.mo83947a();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f104820a != null) {
            this.f104820a.mo83948a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo83909a(long j, long j2, boolean z, boolean z2) {
        this.f104823d.setText(C41393g.m91211a(j));
        int i = 0;
        if (j2 <= 0 || !z) {
            this.f104821b.setVisibility(8);
        } else {
            this.f104821b.setVisibility(0);
            this.f104824e.setText(C41393g.m91211a(j2));
        }
        View view = this.f104822c;
        if (!z2) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
