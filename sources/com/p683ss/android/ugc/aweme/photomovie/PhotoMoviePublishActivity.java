package com.p683ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.p038f.C0794k;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.services.photomovie.PhotoMovieServiceLoadCallback;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45420bf;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45421bg.C45422a;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity */
public class PhotoMoviePublishActivity extends AmeActivity {

    /* renamed from: a */
    public PhotoMovieContext f98549a;

    /* renamed from: b */
    TextView f98550b;

    /* renamed from: c */
    TextView f98551c;

    /* renamed from: d */
    TextView f98552d;

    /* renamed from: e */
    private C38805m f98553e;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        if (C45420bf.m98990a() < 3) {
            C45420bf.m98991a(0);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: b */
    public final void mo78689b() {
        PhotoMovieContext a = mo78688a();
        Intent intent = new Intent();
        intent.putExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE, a);
        setResult(-1, intent);
    }

    public void onBackPressed() {
        if (this.f98549a == null || this.f98549a.mIsFromDraft) {
            super.onBackPressed();
            return;
        }
        mo78689b();
        finish();
    }

    public void onResume() {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onResume", true);
        super.onResume();
        if (this.f98553e != null) {
            C38805m mVar = this.f98553e;
            if (mVar.f98745a == null || !mVar.f98745a.isPoiOrderRate()) {
                z = false;
            }
            if (z) {
                this.f98552d.setText(R.string.crz);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onResume", false);
    }

    /* renamed from: a */
    public final PhotoMovieContext mo78688a() {
        C38805m mVar = (C38805m) getSupportFragmentManager().mo2222a((int) R.id.ajf);
        mVar.f98748d.mo89377b();
        mVar.f98745a.title = mVar.f98748d.mo89380c();
        if (mVar.f98748d.mo89381d() != null) {
            mVar.f98745a.structList = mVar.f98748d.mo89381d();
        }
        mVar.f98745a.isPrivate = mVar.f98749e.mo86781a();
        if (mVar.f98747c.mo90230a() != null) {
            mVar.f98745a.challenges = Collections.singletonList(mVar.f98747c.f112277a);
        }
        PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(mVar.f98758n, PoiPublishModel.class);
        if (poiPublishModel != null) {
            mVar.f98745a.poiId = poiPublishModel.getPoiContext();
        }
        if (TextUtils.isEmpty(mVar.f98745a.mFinalVideoTmpPath)) {
            mVar.f98745a.mFinalVideoTmpPath = C43307ea.m94996a("-concat-v");
        }
        for (C0794k kVar : mVar.f98758n) {
            ((IAVPublishExtension) kVar.f2712b).onBackPressed(C38744b.m86100a(mVar.f98745a));
        }
        return mVar.f98745a;
    }

    /* renamed from: a */
    public static void m86089a(PhotoMovieContext photoMovieContext) {
        String str = "enter_video_edit_page";
        C23089d a = C23089d.m56640a().mo47829a("creation_id", photoMovieContext.creationId).mo47829a("shoot_way", photoMovieContext.mShootWay).mo47826a("draft_id", photoMovieContext.draftId).mo47829a("filter_list", photoMovieContext.mFilterName).mo47826a("filter_id_list", photoMovieContext.mFilterId).mo47829a("content_type", "slideshow").mo47829a("content_source", "upload").mo47826a("video_cnt", 0).mo47826a("pic_cnt", photoMovieContext.mRealImageCount).mo47829a("music_selected_from", photoMovieContext.musicOrigin);
        String str2 = "is_multi_content";
        int i = 1;
        if (photoMovieContext.mRealImageCount <= 1) {
            i = 0;
        }
        C26890h.m65011a(str, a.mo47826a(str2, i).mo47829a("mix_type", C45624b.m99356a(0, photoMovieContext.mRealImageCount)).f61491a);
    }

    public void onCreate(Bundle bundle) {
        int i = 1;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.d8);
        C39629l.m88232a().mo58586q();
        this.f98550b = (TextView) findViewById(R.id.ij);
        this.f98551c = (TextView) findViewById(R.id.q7);
        this.f98552d = (TextView) findViewById(R.id.title);
        this.f98549a = (PhotoMovieContext) getIntent().getParcelableExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE);
        final ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE_MUSIC_LIST);
        if (!this.f98549a.mIsFromDraft) {
            this.f98550b.setText(null);
            this.f98550b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    PhotoMoviePublishActivity.m86089a(PhotoMoviePublishActivity.this.f98549a);
                    PhotoMoviePublishActivity.this.mo78689b();
                    PhotoMoviePublishActivity.this.finish();
                }
            });
        } else {
            this.f98550b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    PhotoMoviePublishActivity photoMoviePublishActivity = PhotoMoviePublishActivity.this;
                    C39618d.m88208a(photoMoviePublishActivity, "from publish_edit_draft", new PhotoMovieServiceLoadCallback(arrayList, System.currentTimeMillis()) {

                        /* renamed from: a */
                        final /* synthetic */ ArrayList f98558a;

                        /* renamed from: b */
                        final /* synthetic */ long f98559b;

                        public final void onPhotoMovieServiceLoadFailed(int i, String str) {
                        }

                        public final void onPhotoMovieServiceLoadSuccess(IPhotoMovieService iPhotoMovieService) {
                            iPhotoMovieService.startPhotoMovieEditActivity(PhotoMoviePublishActivity.this, PhotoMoviePublishActivity.this.mo78688a(), this.f98558a, "edit_draft", this.f98559b);
                        }

                        {
                            this.f98558a = r2;
                            this.f98559b = r3;
                        }
                    });
                    PhotoMoviePublishActivity.m86089a(PhotoMoviePublishActivity.this.f98549a);
                    PhotoMoviePublishActivity.this.finish();
                }
            });
            this.f98551c.setVisibility(0);
            this.f98551c.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C46994b.m102064a().setPublishFormDraftCancel(true);
                    Intent intent = new Intent();
                    intent.setFlags(536870912);
                    C44403a.m97196a().mo48307c(PhotoMoviePublishActivity.this, intent);
                }
            });
        }
        C0654k supportFragmentManager = getSupportFragmentManager();
        this.f98553e = (C38805m) supportFragmentManager.mo2222a((int) R.id.ajf);
        if (this.f98553e == null) {
            PhotoMovieContext photoMovieContext = this.f98549a;
            C38805m mVar = new C38805m();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE, photoMovieContext);
            mVar.setArguments(bundle2);
            this.f98553e = mVar;
            supportFragmentManager.mo2225a().mo2175a((int) R.id.ajf, (Fragment) this.f98553e).mo2189b();
        }
        String str = "enter_video_post_page";
        C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f98549a.creationId).mo47829a("shoot_way", this.f98549a.mShootWay).mo47826a("draft_id", this.f98549a.draftId).mo47829a("filter_list", this.f98549a.mFilterName).mo47826a("filter_id_list", this.f98549a.mFilterId).mo47829a("content_type", "slideshow").mo47829a("content_source", "upload").mo47826a("location_gps_cnt", this.f98549a.getCoordinateCount()).mo47826a("video_cnt", 0).mo47826a("pic_cnt", this.f98549a.mRealImageCount).mo47829a("music_selected_from", this.f98549a.musicOrigin).mo47829a("mix_type", C45624b.m99356a(0, this.f98549a.mRealImageCount));
        String str2 = "is_multi_content";
        if (this.f98549a.mRealImageCount <= 1) {
            i = 0;
        }
        C26890h.m65011a(str, a.mo47826a(str2, i).f61491a);
        C45422a.m98993a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onCreate", false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47937a.m103720a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f98553e != null && this.f98553e.isAdded()) {
            this.f98553e.onActivityResult(i, i2, intent);
        }
    }
}
