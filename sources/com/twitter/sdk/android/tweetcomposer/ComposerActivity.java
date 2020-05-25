package com.twitter.sdk.android.tweetcomposer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.TwitterAuthToken;

public class ComposerActivity extends Activity {

    /* renamed from: a */
    private C52239a f130068a;

    /* renamed from: com.twitter.sdk.android.tweetcomposer.ComposerActivity$a */
    interface C52233a {
        /* renamed from: a */
        void mo108974a();
    }

    /* renamed from: com.twitter.sdk.android.tweetcomposer.ComposerActivity$b */
    class C52234b implements C52233a {
        /* renamed from: a */
        public final void mo108974a() {
            ComposerActivity.this.finish();
        }

        C52234b() {
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.f130068a.mo108989a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        C52231v vVar = new C52231v((TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN"), -1, "");
        Uri uri = (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI");
        String stringExtra = intent.getStringExtra("EXTRA_TEXT");
        String stringExtra2 = intent.getStringExtra("EXTRA_HASHTAGS");
        setTheme(intent.getIntExtra("EXTRA_THEME", R.style.gd));
        setContentView(R.layout.aso);
        C52239a aVar = new C52239a((ComposerView) findViewById(R.id.dja), vVar, uri, stringExtra, stringExtra2, new C52234b());
        this.f130068a = aVar;
    }
}
