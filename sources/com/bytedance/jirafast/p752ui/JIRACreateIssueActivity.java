package com.bytedance.jirafast.p752ui;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.jirafast.C11991a;
import com.bytedance.jirafast.p751d.C12015a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.jirafast.ui.JIRACreateIssueActivity */
public class JIRACreateIssueActivity extends AppCompatActivity {

    /* renamed from: a */
    private ArrayList<String> f31895a;

    /* renamed from: b */
    private ArrayList<String> f31896b;

    /* renamed from: c */
    private String f31897c;

    /* renamed from: d */
    private String f31898d;

    /* renamed from: e */
    private View f31899e;

    /* renamed from: f */
    private View f31900f;

    /* renamed from: g */
    private String f31901g;

    /* renamed from: h */
    private String f31902h;

    /* renamed from: i */
    private String f31903i;

    /* renamed from: j */
    private String f31904j;

    /* renamed from: k */
    private String f31905k;

    /* renamed from: l */
    private ArrayList<String> f31906l;

    /* renamed from: m */
    private boolean f31907m;

    public void onPause() {
        super.onPause();
        if (C12098e.m24527a()) {
            C12098e.f32003m.setVisibility(0);
        }
    }

    public void onResume() {
        super.onResume();
        if (C12098e.m24527a()) {
            C12098e.f32003m.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo22839a() {
        C0654k supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2224a("fragment_major");
        if (a == null) {
            a = new C12066a();
            a.setArguments(m24519c());
        }
        supportFragmentManager.mo2225a().mo2192b(R.id.e9u, a, "fragment_major").mo2195c();
        this.f31900f.setEnabled(false);
        this.f31899e.setEnabled(true);
    }

    /* renamed from: b */
    public final void mo22840b() {
        C0654k supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2224a("fragment_simple");
        if (a == null) {
            a = new C12093c();
            a.setArguments(m24519c());
        }
        supportFragmentManager.mo2225a().mo2192b(R.id.e9u, a, "fragment_simple").mo2195c();
        this.f31899e.setEnabled(false);
        this.f31900f.setEnabled(true);
    }

    /* renamed from: c */
    private Bundle m24519c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("imgfilepath", this.f31895a);
        bundle.putStringArrayList("txtfilepath", this.f31896b);
        bundle.putString("Assignee", this.f31903i);
        bundle.putString("Reporter", this.f31904j);
        bundle.putString("des", this.f31901g);
        bundle.putString("email", this.f31905k);
        bundle.putString("title", this.f31902h);
        bundle.putString("momorydes", this.f31897c);
        bundle.putString("sddes", this.f31898d);
        bundle.putStringArrayList("Components", this.f31906l);
        bundle.putBoolean("isFromLeakCanary", this.f31907m);
        return bundle;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C11991a.f31721a = getApplicationContext();
        setContentView((int) R.layout.bj7);
        this.f31895a = getIntent().getStringArrayListExtra("imgfilepath");
        this.f31896b = getIntent().getStringArrayListExtra("txtfilepath");
        this.f31903i = getIntent().getStringExtra("Assignee");
        this.f31904j = getIntent().getStringExtra("Reporter");
        this.f31897c = getIntent().getStringExtra("momorydes");
        this.f31898d = getIntent().getStringExtra("sddes");
        this.f31901g = getIntent().getStringExtra("des");
        this.f31905k = getIntent().getStringExtra("email");
        this.f31902h = getIntent().getStringExtra("title");
        this.f31906l = getIntent().getStringArrayListExtra("Components");
        this.f31907m = getIntent().getBooleanExtra("isFromLeakCanary", false);
        this.f31899e = findViewById(R.id.ehh);
        this.f31900f = findViewById(R.id.eh0);
        this.f31899e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                JIRACreateIssueActivity.this.mo22840b();
            }
        });
        this.f31900f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                JIRACreateIssueActivity.this.mo22839a();
            }
        });
        if (this.f31907m || C12015a.m24416a().mo22758c(C12015a.f31777r)) {
            mo22839a();
        } else {
            mo22840b();
        }
    }
}
