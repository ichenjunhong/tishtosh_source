package com.p683ss.android.ugc.aweme.port.internal;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.widget.Toast;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.photo.publish.C38704c;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43856fy;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44386j;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.story.shootvideo.publish.upload.model.CreateStoryResponse;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.port.internal.MainActivityCallback */
public class MainActivityCallback implements C0183j, C44334o<C42421al> {

    /* renamed from: a */
    C44371e f101207a;

    /* renamed from: b */
    C39651a f101208b;

    /* renamed from: c */
    public IAVPublishService f101209c = AVExternalServiceImpl.getAVServiceImpl_Monster().publishService();

    /* renamed from: d */
    public C44386j f101210d;

    /* renamed from: e */
    public boolean f101211e;

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        m88315a();
    }

    public void onProgressUpdate(int i, boolean z) {
    }

    public void onSynthetiseSuccess(String str) {
    }

    /* renamed from: a */
    private void m88315a() {
        if (this.f101207a != null) {
            this.f101207a.mo80720b(this);
        }
        this.f101207a = null;
        this.f101208b = null;
    }

    public void onError(C43856fy fyVar) {
        if (!(this.f101208b == null || this.f101207a == null)) {
            this.f101208b.mo80727a(fyVar, this.f101207a.mo80719b(), this.f101207a.mo80717a());
        }
        m88315a();
    }

    public MainActivityCallback(FragmentActivity fragmentActivity, String str) {
        this.f101210d = this.f101209c.getPublishModel(str);
        if (this.f101210d == null) {
            Toast makeText = Toast.makeText(fragmentActivity, R.string.b0f, 0);
            if (VERSION.SDK_INT == 25) {
                C47905fy.m103630a(makeText);
            }
            makeText.show();
            StringBuilder sb = new StringBuilder("MainActivityCallback getPublishModelFailed publishId:");
            sb.append(str);
            String sb2 = sb.toString();
            C45407ay.m98971b(sb2);
            C9220a.m18310a(sb2);
        } else if (!C38704c.m86062c(this.f101210d.f112318g)) {
            this.f101211e = true;
            fragmentActivity.runOnUiThread(new C39659h(this, fragmentActivity, str));
        }
    }

    public void onSuccess(C42421al alVar, boolean z) {
        int i;
        if (alVar instanceof CreateStoryResponse) {
            if (this.f101207a != null) {
                i = this.f101207a.mo80719b();
            } else {
                i = -1;
            }
            StringBuilder sb = new StringBuilder("CreateStoryResponse cannot be cast to CreateAwemeResponse, and type is ");
            sb.append(i);
            C32458a.m75148a((Throwable) new Exception(sb.toString()));
        }
        if (!(this.f101208b == null || !(alVar instanceof CreateAwemeResponse) || this.f101207a == null)) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) alVar;
            if (!(createAwemeResponse == null || createAwemeResponse.aweme == null || createAwemeResponse.aweme.getVideo() == null)) {
                String videoCoverPath = createAwemeResponse.getVideoCoverPath();
                if (videoCoverPath != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Uri.fromFile(new File(videoCoverPath)).toString());
                    Video video = createAwemeResponse.aweme.getVideo();
                    if (video.getCover() != null) {
                        video.getCover().setUrlList(arrayList);
                    }
                    if (video.getDynamicCover() != null) {
                        video.getDynamicCover().setUrlList(arrayList);
                    }
                }
            }
            this.f101208b.mo80726a(createAwemeResponse, this.f101207a.mo80719b(), this.f101207a.mo80717a());
        }
        m88315a();
    }
}
