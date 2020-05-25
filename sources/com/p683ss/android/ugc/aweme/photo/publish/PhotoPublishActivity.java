package com.p683ss.android.ugc.aweme.photo.publish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45421bg.C45422a;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity */
public class PhotoPublishActivity extends AmeActivity {

    /* renamed from: a */
    PhotoPublishFragment f98418a;

    /* renamed from: b */
    TextView f98419b;

    /* renamed from: c */
    private PhotoContext f98420c;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        m86048a();
        super.onBackPressed();
    }

    /* renamed from: a */
    private void m86048a() {
        PhotoContext b = ((PhotoPublishFragment) getSupportFragmentManager().mo2222a((int) R.id.ajf)).mo78633b();
        Intent intent = new Intent();
        intent.putExtra("photo_model", b);
        setResult(-1, intent);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
        C45412b.m98979a().leave(this, "image_publish");
    }

    public void onPause() {
        super.onPause();
        C45412b.m98979a().pause(this, "image_publish", this.f98420c.creationId, this.f98420c.mShootWay);
    }

    public void onResume() {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onResume", true);
        super.onResume();
        if (this.f98418a != null) {
            PhotoPublishFragment photoPublishFragment = this.f98418a;
            if (photoPublishFragment.f98427c == null || !photoPublishFragment.f98427c.isPoiOrderRate()) {
                z = false;
            }
            if (z) {
                this.f98419b.setText(R.string.crz);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onResume", false);
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131492947})
    public void onClick(View view) {
        String str;
        if (view.getId() == R.id.ij) {
            String str2 = "enter_video_edit_page";
            C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f98420c.creationId).mo47829a("shoot_way", this.f98420c.mShootWay).mo47826a("draft_id", this.f98420c.draftId).mo47829a("content_type", "photo").mo47829a("filter_list", this.f98420c.mFilterName).mo47826a("filter_id_list", this.f98420c.mFilterId);
            String str3 = "content_source";
            if (this.f98420c.mPhotoFrom == 0) {
                str = "upload";
            } else {
                str = "shoot";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).mo47826a("video_cnt", 0).mo47826a("pic_cnt", 1).mo47826a("is_multi_content", 0).mo47829a("mix_type", C45624b.m99356a(0, 1)).f61491a);
            m86048a();
            C0636b.m1715a(this);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onCreate", true);
        C45412b.m98979a().enter(this, "image_publish");
        super.onCreate(bundle);
        setContentView((int) R.layout.d_);
        this.f98419b = (TextView) findViewById(R.id.title);
        this.f98420c = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        C0654k supportFragmentManager = getSupportFragmentManager();
        this.f98418a = (PhotoPublishFragment) supportFragmentManager.mo2222a((int) R.id.ajf);
        if (this.f98418a == null) {
            PhotoContext photoContext = this.f98420c;
            PhotoPublishFragment photoPublishFragment = new PhotoPublishFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("photo_model", photoContext);
            photoPublishFragment.setArguments(bundle2);
            this.f98418a = photoPublishFragment;
            supportFragmentManager.mo2225a().mo2175a((int) R.id.ajf, (Fragment) this.f98418a).mo2189b();
        }
        String str2 = "enter_video_post_page";
        C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f98420c.creationId).mo47829a("shoot_way", this.f98420c.mShootWay).mo47826a("draft_id", this.f98420c.draftId).mo47829a("filter_list", this.f98420c.mFilterName).mo47826a("filter_id_list", this.f98420c.mFilterId).mo47829a("content_type", "photo");
        String str3 = "content_source";
        if (this.f98420c.mPhotoFrom == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).mo47826a("location_gps_cnt", this.f98420c.getCoordinateCount()).mo47826a("video_cnt", 0).mo47826a("pic_cnt", 1).mo47829a("mix_type", C45624b.m99356a(0, 1)).mo47826a("is_multi_content", 0).f61491a);
        C45422a.m98993a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onCreate", false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47937a.m103720a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
