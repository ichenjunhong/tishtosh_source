package com.p683ss.android.ugc.awemepushlib.widget;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.awemepushlib.p2406a.C48428b;
import com.p683ss.android.ugc.awemepushlib.widget.C48486a.C48492a;

/* renamed from: com.ss.android.ugc.awemepushlib.widget.PushNotifyActivity */
public class PushNotifyActivity extends Activity implements C48492a {

    /* renamed from: a */
    private FrameLayout f121908a;

    /* renamed from: a */
    public final void mo95965a() {
        this.f121908a.removeAllViews();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            finish();
            return true;
        } catch (Throwable unused) {
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.addFlags(32);
        window.addFlags(262144);
        LayoutParams attributes = window.getAttributes();
        attributes.gravity |= 48;
        window.setAttributes(attributes);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        int intExtra = intent.getIntExtra(CustomActionPushReceiver.f104058c, -1);
        C48428b bVar = (C48428b) intent.getSerializableExtra(CustomActionPushReceiver.f104057b);
        if (bVar == null) {
            finish();
            return;
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("__targetIntent__");
        if (intent2 == null) {
            finish();
            return;
        }
        C48486a aVar = new C48486a(this, intExtra, bVar, (Bitmap) intent.getParcelableExtra("__bitmap__"), intent2, intent.getLongExtra("__showTime__", 6000), false, 11);
        aVar.setDismissListener(this);
        this.f121908a = new FrameLayout(this);
        this.f121908a.addView(aVar, new FrameLayout.LayoutParams(-1, -2));
        setContentView(this.f121908a, new ViewGroup.LayoutParams(-1, -1));
    }
}
