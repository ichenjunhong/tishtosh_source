package com.p683ss.android.ugc.aweme.p1807im.sdk.module.msghelper;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34624i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1863b.C34601a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity */
public class MessageHelperActivity extends AmeActivity implements C34601a<C35456b> {

    /* renamed from: a */
    private RecyclerView f89083a;

    /* renamed from: b */
    private C34624i f89084b;

    /* renamed from: c */
    private DmtStatusView f89085c;

    /* renamed from: a */
    public final void mo72620a(List<C35456b> list) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onDestroy() {
        super.onDestroy();
        C34032k.m77795a().mo71985b(this);
        if (this.f89083a != null) {
            this.f89083a.setAdapter(null);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bcc);
        C34004b.m77718b().setupStatusBar(this);
        ImTextTitleBar imTextTitleBar = (ImTextTitleBar) findViewById(R.id.d10);
        imTextTitleBar.setOnTitlebarClickListener(new C35356a() {
            /* renamed from: b */
            public final void mo70670b() {
            }

            /* renamed from: c */
            public final void mo70671c() {
            }

            /* renamed from: a */
            public final void mo70669a() {
                MessageHelperActivity.this.finish();
            }
        });
        imTextTitleBar.setTitle((int) R.string.bnp);
        this.f89083a = (RecyclerView) findViewById(R.id.cg7);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.mo4731b(1);
        this.f89083a.setLayoutManager(linearLayoutManager);
        this.f89084b = new C34624i(this);
        this.f89083a.setAdapter(this.f89084b);
        this.f89085c = (DmtStatusView) findViewById(R.id.csv);
        this.f89085c.setBuilder(C10719a.m21676a((Context) this).mo19229a(new C10723a(this).mo19277a((int) R.drawable.dag).mo19280b((int) R.string.bnl).mo19282c(R.string.bnk).f28711a).mo19223a().mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C34032k.m77795a().mo71988e();
            }
        }));
        C34032k.m77795a().mo71980a((C34601a<C35456b>) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onCreate", false);
    }
}
