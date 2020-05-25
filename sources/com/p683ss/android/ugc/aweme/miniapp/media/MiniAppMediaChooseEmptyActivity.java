package com.p683ss.android.ugc.aweme.miniapp.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36954b.C36956b;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity */
public class MiniAppMediaChooseEmptyActivity extends FragmentActivity {

    /* renamed from: a */
    private Fragment f94293a;

    /* renamed from: b */
    private C36912a f94294b;

    /* renamed from: c */
    private int f94295c;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.cq);
        this.f94293a = getSupportFragmentManager().mo2222a((int) R.id.ajj);
        this.f94294b = new C36912a(this, this.f94293a);
        this.f94295c = getIntent().getIntExtra("key_choose_type", 1);
        int intExtra = getIntent().getIntExtra("key_choose_num", 1);
        switch (this.f94295c) {
            case 1:
                this.f94294b.f94296a.mo82838f(6);
                break;
            case 2:
                C36912a aVar = this.f94294b;
                aVar.f94296a.f103489i = intExtra;
                aVar.f94296a.mo82834c(6);
                break;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap bitmap;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        setResult(i3, intent2);
        if (intent2 == null) {
            intent2 = new Intent();
        }
        ArrayList arrayList = new ArrayList();
        switch (this.f94295c) {
            case 1:
                if (i4 != 0) {
                    C36912a aVar = this.f94294b;
                    Activity activity = aVar.f94297b;
                    String e = aVar.f94296a.mo82836e();
                    Bitmap decodeFile = BitmapFactory.decodeFile(e);
                    if (decodeFile == null) {
                        bitmap = null;
                    } else {
                        Matrix matrix = new Matrix();
                        matrix.postRotate((float) C36912a.m83047a(e));
                        bitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                    }
                    C36956b bVar = new C36956b(aVar.mo76173a(activity, bitmap), "", 0, 0, 0, 0, "");
                    arrayList.add(bVar);
                    break;
                }
                break;
            case 2:
                arrayList.addAll(C36912a.m83048a(intent2));
                break;
        }
        setResult(11, intent2);
        intent2.putExtra("key_media_list", arrayList);
        C36983a.m83185b().mo76294a().handleActivityImageResult(i3, i4, intent2);
        finish();
    }
}
