package com.bytedance.lobby.internal;

import android.arch.lifecycle.C0199s;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.lobby.C12311a;
import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.AuthResult.C12315a;
import com.bytedance.lobby.auth.C12321d;
import com.ss.android.ugc.trill.R;

public class LobbyInvisibleActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final boolean f32528a = C12311a.f32450a;

    /* renamed from: b */
    public int f32529b;

    /* renamed from: c */
    private boolean f32530c;

    /* renamed from: d */
    private boolean f32531d;

    /* renamed from: e */
    private C12321d f32532e;

    public void onDestroy() {
        super.onDestroy();
        if (this.f32532e != null) {
            this.f32532e.mo23311a();
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f32530c || this.f32531d) {
            this.f32530c = true;
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.cc);
        Intent intent = getIntent();
        final String stringExtra = intent.getStringExtra("provider_id");
        this.f32529b = intent.getIntExtra("action_type", 0);
        this.f32532e = C12343c.m24851a().mo23349b(stringExtra);
        if (this.f32532e == null) {
            C12341a a = C12341a.m24846a();
            int i = this.f32529b;
            C12315a a2 = new C12315a(stringExtra, this.f32529b).mo23302a(false);
            StringBuilder sb = new StringBuilder("No provider found for ");
            sb.append(stringExtra);
            a.mo23342a(stringExtra, i, a2.mo23300a(new C12322b(1, sb.toString())).mo23303a());
            finish();
            return;
        }
        LobbyViewModel.m24844a(this).mo23341g().observe(this, new C0199s<AuthResult>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C12341a.m24846a().mo23342a(stringExtra, LobbyInvisibleActivity.this.f32529b, (AuthResult) obj);
                LobbyInvisibleActivity.this.finish();
            }
        });
        this.f32531d = true;
        switch (this.f32529b) {
            case 1:
                this.f32532e.mo23313a(this, intent.getExtras());
                return;
            case 2:
                this.f32532e.mo23315b(this, intent.getExtras());
                return;
            default:
                C12341a a3 = C12341a.m24846a();
                int i2 = this.f32529b;
                C12315a a4 = new C12315a(stringExtra, this.f32529b).mo23302a(false);
                StringBuilder sb2 = new StringBuilder("Unknown action type: ");
                sb2.append(this.f32529b);
                a3.mo23342a(stringExtra, i2, a4.mo23300a(new C12322b(1, sb2.toString())).mo23303a());
                finish();
                return;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f32532e != null) {
            this.f32532e.mo23312a(this, i, i2, intent);
        }
    }
}
