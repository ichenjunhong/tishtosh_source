package com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.internal.p718b.p719a.C11409r;
import com.bytedance.p702im.core.internal.p718b.p719a.C11426w;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11198g;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11242v;
import com.bytedance.p702im.core.proto.MarkStrangerAllConversationReadRequestBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34624i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.p1867a.C34680a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.p1868b.C34683a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.p1869c.C34688a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53755c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity */
public class StrangerListActivity extends AmeActivity implements C26846a {

    /* renamed from: d */
    private static final String f89333d = "StrangerListActivity";

    /* renamed from: a */
    public C34688a f89334a;

    /* renamed from: b */
    public DmtStatusView f89335b;

    /* renamed from: c */
    public ImTextTitleBar f89336c;

    /* renamed from: e */
    private RecyclerView f89337e;

    /* renamed from: f */
    private C34624i f89338f;

    /* renamed from: g */
    private C34683a f89339g;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public final void ar_() {
        if (!this.f89339g.mo54804o()) {
            this.f89339g.mo44934a_(Integer.valueOf(4));
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onResume", true);
        super.onResume();
        if (this.f89339g != null) {
            mo72738b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onResume", false);
    }

    /* renamed from: b */
    public final void mo72738b() {
        if (C34682b.m78663a(this)) {
            if (this.f89338f.getItemCount() == 0) {
                this.f89335b.mo19212f();
            }
            this.f89339g.mo44934a_(Integer.valueOf(1));
            return;
        }
        if (this.f89338f.getItemCount() == 0) {
            C18842a.m45933a(new Runnable() {
                public final void run() {
                    if (StrangerListActivity.this.isViewValid()) {
                        StrangerListActivity.this.f89334a.mo72748b();
                        StrangerListActivity.this.f89335b.mo19214h();
                        C10691a.m21542b((Context) StrangerListActivity.this, (int) R.string.cg1).mo19066a();
                    }
                }
            }, 100);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f89339g != null) {
            this.f89339g.mo46991S_();
        }
        if (this.f89334a != null) {
            C34688a aVar = this.f89334a;
            if (C53755c.m114319a().mo112958b((Object) aVar)) {
                C53755c.m114319a().mo112959c((Object) aVar);
            }
            C11182d.m22641a().mo20669b((C11198g) aVar.f89363d);
        }
        if (this.f89337e != null) {
            this.f89337e.setAdapter(null);
        }
    }

    public void onCreate(Bundle bundle) {
        View view;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bcd);
        C34004b.m77718b().setupStatusBar(this);
        C34004b.m77717a().mo71950g();
        this.f89336c = (ImTextTitleBar) findViewById(R.id.d10);
        if (!C35279p.m79763a()) {
            this.f89336c.setRightTextSize(C9432q.m18687b((Context) this, 15.0f));
            this.f89336c.setRightText((int) R.string.bkh);
        }
        this.f89336c.setOnTitlebarClickListener(new C35356a() {
            /* renamed from: c */
            public final void mo70671c() {
            }

            /* renamed from: a */
            public final void mo70669a() {
                StrangerListActivity.this.onBackPressed();
            }

            /* renamed from: b */
            public final void mo70670b() {
                StrangerListActivity strangerListActivity = StrangerListActivity.this;
                C1160b b = new C1161a(strangerListActivity, R.style.mp).mo3768b((int) R.string.bki).mo3766a(false).mo3759a((int) R.string.bg2, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C11242v a = C11242v.m22830a();
                        C346781 r5 = new C11162b<Boolean>() {
                            /* renamed from: a */
                            public final /* synthetic */ void mo20506a(Object obj) {
                                Boolean bool = (Boolean) obj;
                                StrangerListActivity.this.mo72738b();
                            }

                            /* renamed from: a */
                            public final void mo20508a(C11202k kVar) {
                                C9432q.m18676a(C11010c.m22280a(), StrangerListActivity.this.getResources().getString(R.string.bl6));
                            }
                        };
                        C11409r.m23292a();
                        new C11426w(new C11162b<Boolean>(r5) {

                            /* renamed from: a */
                            final /* synthetic */ C11162b f30290a;

                            /* renamed from: a */
                            public final void mo20508a(C11202k kVar) {
                                if (this.f30290a != null) {
                                    this.f30290a.mo20508a(kVar);
                                }
                            }

                            /* renamed from: a */
                            public final /* synthetic */ void mo20506a(Object obj) {
                                Boolean bool = (Boolean) obj;
                                if (this.f30290a != null) {
                                    this.f30290a.mo20506a(bool);
                                }
                                C11242v.this.mo20939b();
                            }

                            {
                                this.f30290a = r2;
                            }
                        }).mo21053a(0, new Builder().mark_stranger_all_conversation_read_body(new MarkStrangerAllConversationReadRequestBody.Builder().build()).build(), null, new Object[0]);
                    }
                }).mo3769b((int) R.string.bf_, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).mo3772b();
                if (!b.isShowing()) {
                    b.show();
                }
            }
        });
        this.f89337e = (RecyclerView) findViewById(R.id.ctk);
        this.f89337e.setLayoutManager(new LinearLayoutManager(this));
        this.f89338f = new C34624i(this);
        this.f89338f.f89202a = true;
        this.f89337e.setAdapter(this.f89338f);
        this.f89337e.mo4801a((C1340m) new C32461a(this));
        this.f89338f.mo54788a((C26846a) this);
        this.f89338f.mo54798c(C34004b.m77718b().needSessionListShowMore());
        this.f89335b = (DmtStatusView) findViewById(R.id.csv);
        C10723a c = new C10723a(this).mo19280b((int) R.string.bnl).mo19282c(R.string.bnk);
        if (C35279p.m79763a()) {
            view = MtEmptyView.m21697a((Context) this);
            ((MtEmptyView) view).setStatus(c.mo19277a((int) R.drawable.dah).f28711a);
        } else {
            view = new DmtDefaultView(this);
            ((DmtDefaultView) view).setStatus(c.mo19277a((int) R.drawable.dag).f28711a);
        }
        this.f89335b.setBuilder(C10719a.m21676a((Context) this).mo19231b(view).mo19223a().mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                StrangerListActivity.this.mo72738b();
            }
        }));
        this.f89339g = new C34683a();
        this.f89339g.mo54799a(new C34680a());
        this.f89334a = new C34688a(this, this.f89338f, this.f89335b);
        this.f89339g.mo54800a(this.f89334a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onCreate", false);
    }
}
