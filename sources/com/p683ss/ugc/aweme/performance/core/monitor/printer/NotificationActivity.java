package com.p683ss.ugc.aweme.performance.core.monitor.printer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.printer.NotificationActivity */
public final class NotificationActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.axd);
        ((TextView) findViewById(R.id.e19)).setText(getIntent().getStringExtra("key"));
        ((TextView) findViewById(R.id.el8)).setText(getIntent().getStringExtra("stack"));
    }
}
