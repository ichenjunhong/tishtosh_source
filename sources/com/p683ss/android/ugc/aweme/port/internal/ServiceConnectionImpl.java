package com.p683ss.android.ugc.aweme.port.internal;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.p030v4.app.FragmentActivity;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.live.C36096i;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.photo.publish.C38704c;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43856fy;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;
import com.p683ss.android.ugc.aweme.story.shootvideo.publish.upload.model.CreateStoryResponse;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.port.internal.ServiceConnectionImpl */
public class ServiceConnectionImpl implements C0183j, ServiceConnection, C44334o<C42421al> {

    /* renamed from: a */
    C44371e f101215a;

    /* renamed from: b */
    private FragmentActivity f101216b;

    /* renamed from: c */
    private C39651a f101217c;

    public void onProgressUpdate(int i, boolean z) {
    }

    public void onSynthetiseSuccess(String str) {
    }

    /* renamed from: a */
    private void m88323a() {
        try {
            this.f101215a.mo80720b(this);
            this.f101216b.unbindService(this);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        Class videoPublishActivityClass = AVExternalServiceImpl.getAVServiceImpl_Monster().classnameService().getVideoPublishActivityClass();
        if ((this.f101216b instanceof C36096i) || this.f101216b.getClass().equals(videoPublishActivityClass)) {
            try {
                this.f101216b.unbindService(this);
            } catch (Exception unused) {
            }
        } else {
            m88323a();
        }
    }

    public ServiceConnectionImpl(FragmentActivity fragmentActivity) {
        this.f101216b = fragmentActivity;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f101215a != null) {
            this.f101215a.mo80720b(this);
            this.f101215a = null;
        }
        this.f101217c = null;
    }

    public void onError(C43856fy fyVar) {
        if (this.f101217c != null) {
            this.f101217c.mo80727a(fyVar, this.f101215a.mo80719b(), this.f101215a.mo80717a());
        }
        m88323a();
        this.f101215a = null;
        this.f101217c = null;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f101215a = (C44371e) iBinder;
            this.f101216b.getLifecycle().mo324a(this);
            this.f101215a.mo80718a(this);
            if (!C38704c.m86062c(this.f101215a.mo80719b())) {
                this.f101217c = new C39651a(this.f101216b);
                C39651a.m88325a();
                StringBuilder sb = new StringBuilder("args is ");
                sb.append(this.f101215a.mo80717a());
                sb.append(" when construct");
                C32458a.m75144a(sb.toString());
            } else {
                this.f101217c = null;
            }
            if (!C38704c.m86062c(this.f101215a.mo80719b()) && (this.f101216b instanceof MainActivity)) {
                ((MainActivity) this.f101216b).onPublishServiceConnected(this.f101215a, this, this.f101215a.mo80717a());
            }
        } catch (ClassCastException e) {
            C32458a.m75143a((Exception) e);
            Toast makeText = Toast.makeText(this.f101216b, R.string.b0f, 0);
            if (VERSION.SDK_INT == 25) {
                C47905fy.m103630a(makeText);
            }
            makeText.show();
        }
    }

    public void onSuccess(C42421al alVar, boolean z) {
        int i;
        if (alVar instanceof CreateStoryResponse) {
            if (this.f101215a != null) {
                i = this.f101215a.mo80719b();
            } else {
                i = -1;
            }
            StringBuilder sb = new StringBuilder("CreateStoryResponse cannot be cast to CreateAwemeResponse, and type is ");
            sb.append(i);
            C32458a.m75148a((Throwable) new Exception(sb.toString()));
        }
        if (this.f101217c != null && (alVar instanceof CreateAwemeResponse)) {
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
            this.f101217c.mo80726a(createAwemeResponse, this.f101215a.mo80719b(), this.f101215a.mo80717a());
        }
        m88323a();
        this.f101215a = null;
        this.f101217c = null;
    }
}
