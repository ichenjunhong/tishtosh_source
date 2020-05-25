package com.twitter.sdk.android.tweetui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.internal.scribe.C52144aa;
import com.twitter.sdk.android.core.models.C52203j;
import com.twitter.sdk.android.tweetui.internal.C52296f.C52297a;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class GalleryActivity extends Activity {

    /* renamed from: a */
    C52259a f130113a;

    /* renamed from: b */
    final C52265c f130114b = new C52266d(C52312r.m111747a());

    /* renamed from: com.twitter.sdk.android.tweetui.GalleryActivity$a */
    public static class C52259a implements Serializable {
        public final List<C52203j> mediaEntities;
        public final int mediaEntityIndex;
        public final long tweetId;

        public C52259a(int i, List<C52203j> list) {
            this(0, i, list);
        }

        public C52259a(long j, int i, List<C52203j> list) {
            this.tweetId = j;
            this.mediaEntityIndex = i;
            this.mediaEntities = list;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109005a() {
        this.f130114b.dismiss();
    }

    public void onBackPressed() {
        mo109005a();
        super.onBackPressed();
        overridePendingTransition(0, R.anim.d4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109006a(int i) {
        this.f130114b.mo109024a(C52144aa.fromMediaEntity(this.f130113a.tweetId, (C52203j) this.f130113a.mediaEntities.get(i)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C52259a aVar;
        super.onCreate(bundle);
        setContentView(R.layout.asr);
        C52203j jVar = (C52203j) getIntent().getSerializableExtra("MEDIA_ENTITY");
        if (jVar != null) {
            aVar = new C52259a(0, Collections.singletonList(jVar));
        } else {
            aVar = (C52259a) getIntent().getSerializableExtra("GALLERY_ITEM");
        }
        this.f130113a = aVar;
        if (bundle == null) {
            this.f130114b.mo109023a();
        }
        C52264b bVar = new C52264b(this, new C52297a() {
            /* renamed from: a */
            public final void mo109009a() {
                GalleryActivity.this.mo109005a();
                GalleryActivity.this.finish();
                GalleryActivity.this.overridePendingTransition(0, R.anim.d4);
            }
        });
        bVar.f130131a.addAll(this.f130113a.mediaEntities);
        bVar.notifyDataSetChanged();
        ViewPager viewPager = (ViewPager) findViewById(R.id.djx);
        viewPager.setPageMargin(getResources().getDimensionPixelSize(R.dimen.u7));
        viewPager.addOnPageChangeListener(new C0997e() {

            /* renamed from: a */
            int f130115a = -1;

            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageSelected(int i) {
                if (this.f130115a >= 0) {
                    GalleryActivity.this.f130114b.mo109025b();
                }
                this.f130115a++;
                GalleryActivity.this.mo109006a(i);
            }

            public final void onPageScrolled(int i, float f, int i2) {
                if (this.f130115a == -1 && i == 0 && ((double) f) == ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
                    GalleryActivity.this.mo109006a(i);
                    this.f130115a++;
                }
            }
        });
        viewPager.setAdapter(bVar);
        viewPager.setCurrentItem(this.f130113a.mediaEntityIndex);
    }
}
