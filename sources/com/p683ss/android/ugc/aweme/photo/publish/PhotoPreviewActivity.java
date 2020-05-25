package com.p683ss.android.ugc.aweme.photo.publish;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.p038f.C0781c;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.photo.C38657e;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity */
public class PhotoPreviewActivity extends AmeActivity {
    @BindView(2131493779)
    ImageView mImageView;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131493779})
    public void onClick(View view) {
        C0636b.m1715a(this);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.d9);
        PhotoContext photoContext = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        C1056u.m3036a((View) this.mImageView, "photo_preview_transition");
        ImageView imageView = this.mImageView;
        C50181a.m108296a(C38657e.m85995a(photoContext.getTmpPhotoUri(C39618d.f101160a)), 0, 0, (C0781c<Bitmap>) new C0781c<Bitmap>(imageView, new C38702a(this, photoContext)) {

            /* renamed from: a */
            final /* synthetic */ ImageView f98339a;

            /* renamed from: b */
            final /* synthetic */ C52670a f98340b;

            public final /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null && this.f98339a != null) {
                    C0013i.m18a((Callable<TResult>) new C38675f<TResult>(this.f98339a, bitmap, this.f98340b), C0013i.f25b);
                }
            }

            {
                this.f98339a = r1;
                this.f98340b = r2;
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onCreate", false);
    }
}
