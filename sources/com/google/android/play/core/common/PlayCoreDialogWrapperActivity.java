package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a */
    private ResultReceiver f48779a;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        int i3;
        Bundle bundle;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && this.f48779a != null) {
            if (i2 == -1) {
                resultReceiver = this.f48779a;
                i3 = 1;
                bundle = new Bundle();
            } else if (i2 == 0) {
                resultReceiver = this.f48779a;
                i3 = 2;
                bundle = new Bundle();
            }
            resultReceiver.send(i3, bundle);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f48779a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            try {
                startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, null, 0, 0, 0);
            } catch (SendIntentException unused) {
                if (this.f48779a != null) {
                    this.f48779a.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.f48779a = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f48779a);
    }
}
