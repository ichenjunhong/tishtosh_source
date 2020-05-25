package com.p683ss.android.ugc.aweme.update;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.sdk.activity.SSActivity;
import com.p683ss.android.ugc.aweme.common.C26883g;
import com.ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.update.UpdateActivity */
public class UpdateActivity extends SSActivity implements C9382a {

    /* renamed from: a */
    UpdateHelper f119795a;

    /* renamed from: b */
    Handler f119796b;

    /* renamed from: c */
    C47502a f119797c;

    /* renamed from: d */
    String f119798d;

    /* renamed from: e */
    Button f119799e;

    /* renamed from: f */
    Button f119800f;

    /* renamed from: g */
    Button f119801g;

    /* renamed from: h */
    Button f119802h;

    /* renamed from: i */
    Button f119803i;

    /* renamed from: j */
    TextView f119804j;

    /* renamed from: m */
    View f119805m;

    /* renamed from: n */
    ProgressBar f119806n;

    /* renamed from: o */
    TextView f119807o;

    /* renamed from: p */
    View f119808p;

    /* renamed from: q */
    View f119809q;

    /* renamed from: r */
    TextView f119810r;

    /* renamed from: s */
    String f119811s = "";

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateActivity$a */
    class C47502a extends Thread {

        /* renamed from: a */
        C47513b f119817a = new C47513b();

        /* renamed from: b */
        volatile boolean f119818b = false;

        /* renamed from: a */
        public final synchronized void mo94788a() {
            this.f119818b = true;
        }

        public final void run() {
            while (true) {
                try {
                    Thread.sleep(1500);
                } catch (Exception unused) {
                }
                if (!UpdateActivity.this.f119795a.mo94800g()) {
                    break;
                }
                UpdateActivity.this.f119795a.mo94792a(this.f119817a);
                Message obtainMessage = UpdateActivity.this.f119796b.obtainMessage(1);
                obtainMessage.obj = this.f119817a;
                synchronized (this) {
                    if (!this.f119818b) {
                        UpdateActivity.this.f119796b.sendMessage(obtainMessage);
                    }
                }
            }
            if (!this.f119818b) {
                UpdateActivity.this.f119796b.sendEmptyMessage(2);
            }
        }

        C47502a() {
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f119797c != null) {
            this.f119797c.mo94788a();
        }
    }

    /* renamed from: c */
    private void m102893c() {
        this.f119801g.setVisibility(8);
        this.f119802h.setVisibility(8);
        this.f119803i.setVisibility(8);
        this.f119800f.setVisibility(8);
        this.f119799e.setVisibility(8);
    }

    /* renamed from: d */
    private void m102894d() {
        String a = UpdateHelper.m102903a(this.f119795a.mo94799f());
        if (a == null) {
            a = "";
        }
        this.f119810r.setText(a);
    }

    /* renamed from: b */
    private void m102892b() {
        if (this.f119795a.mo94800g()) {
            if (this.f119797c != null) {
                this.f119797c.mo94788a();
            }
            this.f119797c = new C47502a();
            this.f119797c.start();
            m102898h();
        } else if (!this.f119795a.mo94802i()) {
            m102896f();
        } else if (this.f119795a.mo94811r() != null) {
            m102897g();
        } else {
            m102895e();
        }
    }

    /* renamed from: f */
    private void m102896f() {
        String string = getString(R.string.dpf);
        this.f119804j.setText(C2240a.m6772a(string, new Object[]{this.f119798d}));
        this.f119808p.setVisibility(8);
        this.f119805m.setVisibility(8);
        this.f119809q.setVisibility(4);
        m102893c();
        this.f119799e.setVisibility(0);
    }

    /* renamed from: e */
    private void m102895e() {
        String e = this.f119795a.mo94798e();
        if (e == null) {
            e = "";
        }
        String string = getString(R.string.dpb);
        this.f119804j.setText(C2240a.m6772a(string, new Object[]{this.f119798d, e}));
        this.f119808p.setVisibility(0);
        this.f119805m.setVisibility(8);
        this.f119809q.setVisibility(0);
        m102894d();
        m102893c();
        this.f119801g.setVisibility(0);
        this.f119800f.setVisibility(0);
    }

    /* renamed from: g */
    private void m102897g() {
        String e = this.f119795a.mo94798e();
        String string = getString(R.string.dpg);
        this.f119804j.setText(C2240a.m6772a(string, new Object[]{this.f119798d, e}));
        this.f119808p.setVisibility(0);
        this.f119805m.setVisibility(8);
        this.f119809q.setVisibility(0);
        m102894d();
        m102893c();
        this.f119802h.setVisibility(0);
        this.f119800f.setVisibility(0);
    }

    /* renamed from: h */
    private void m102898h() {
        String e = this.f119795a.mo94798e();
        String string = getString(R.string.dpb);
        this.f119804j.setText(C2240a.m6772a(string, new Object[]{this.f119798d, e}));
        this.f119809q.setVisibility(0);
        m102894d();
        m102893c();
        this.f119803i.setVisibility(0);
        this.f119799e.setVisibility(0);
        this.f119808p.setVisibility(0);
        this.f119805m.setVisibility(0);
        this.f119806n.setProgress(0);
        this.f119807o.setText(" ");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47309a() {
        if (!this.f119795a.mo94802i()) {
            m102896f();
            return;
        }
        this.f119795a.mo94795b();
        File r = this.f119795a.mo94811r();
        if (r != null) {
            this.f119795a.mo94796c();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(1);
            intent.setDataAndType(C19547d.m47838a((Context) this, r), "application/vnd.android.package-archive");
            startActivity(intent);
            finish();
            return;
        }
        this.f119795a.mo94815w();
        if (this.f119797c != null) {
            this.f119797c.mo94788a();
        }
        this.f119797c = new C47502a();
        this.f119797c.start();
        m102898h();
    }

    /* renamed from: a */
    private static String m102891a(long j) {
        if (j >= 1048576) {
            return C2240a.m6772a("%.2f MB", new Object[]{Float.valueOf(((float) j) / 1048576.0f)});
        } else if (j >= 1024) {
            return C2240a.m6772a("%.2f KB", new Object[]{Float.valueOf(((float) j) / 1024.0f)});
        } else {
            return C2240a.m6772a("%d B", new Object[]{Long.valueOf(j)});
        }
    }

    public void handleMsg(Message message) {
        C47513b bVar;
        if (isViewValid()) {
            switch (message.what) {
                case 1:
                    if (message.obj == null || !(message.obj instanceof C47513b)) {
                        bVar = new C47513b();
                    } else {
                        bVar = (C47513b) message.obj;
                    }
                    long j = bVar.f119891a;
                    long j2 = bVar.f119892b;
                    String str = this.f119811s;
                    int i = 0;
                    if (j > 0) {
                        i = 10;
                    }
                    if (j2 > 0) {
                        str = m102891a(j2);
                        i = (int) ((100 * j) / j2);
                        if (i > 99) {
                            i = 99;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(m102891a(j));
                    sb.append(" / ");
                    sb.append(str);
                    this.f119806n.setProgress(i);
                    this.f119807o.setText(sb.toString());
                    break;
                case 2:
                    m102892b();
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.ss.android.ugc.aweme.R.layout.update_activity);
        this.f119795a = UpdateHelper.m102902a();
        this.f119796b = new C9381g(this);
        this.f119798d = C11010c.f29572u.mo19896c();
        this.f119811s = getString(R.string.dpk);
        this.f119804j = (TextView) findViewById(com.ss.android.ugc.aweme.R.id.update_title);
        this.f119808p = findViewById(com.ss.android.ugc.aweme.R.id.parting_line);
        this.f119805m = findViewById(com.ss.android.ugc.aweme.R.id.progress_container);
        this.f119806n = (ProgressBar) findViewById(R.id.c62);
        this.f119807o = (TextView) findViewById(R.id.c6e);
        this.f119809q = findViewById(com.ss.android.ugc.aweme.R.id.whatsnew_container);
        this.f119810r = (TextView) findViewById(com.ss.android.ugc.aweme.R.id.whatsnew);
        this.f119799e = (Button) findViewById(R.id.ik);
        this.f119799e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.finish();
            }
        });
        this.f119800f = (Button) findViewById(R.id.qa);
        this.f119800f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.f119795a.mo94795b();
                UpdateActivity.this.f119795a.mo94796c();
                UpdateActivity.this.finish();
            }
        });
        this.f119801g = (Button) findViewById(com.ss.android.ugc.aweme.R.id.update_btn);
        this.f119801g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.mo47309a();
            }
        });
        this.f119803i = (Button) findViewById(R.id.eya);
        this.f119803i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (UpdateActivity.this.f119797c != null) {
                    UpdateActivity.this.f119797c.mo94788a();
                }
                UpdateActivity.this.f119797c = null;
                UpdateHelper updateHelper = UpdateActivity.this.f119795a;
                synchronized (updateHelper.f119832L) {
                    if (updateHelper.f119834N != null) {
                        updateHelper.f119834N.f119886a = true;
                    }
                    if (updateHelper.f119833M != null) {
                        C47509c cVar = updateHelper.f119833M;
                        cVar.f119880a = true;
                        cVar.f119881b.f119895c = true;
                    }
                    updateHelper.f119846g.sendEmptyMessage(13);
                }
                UpdateActivity.this.finish();
            }
        });
        this.f119802h = (Button) findViewById(com.ss.android.ugc.aweme.R.id.install_btn);
        this.f119802h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.mo47309a();
            }
        });
        m102892b();
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.getBoolean("from_update_avail")) {
                C26883g.m64991a(this, "more_tab", "notify_version_click");
            }
        }
    }
}
