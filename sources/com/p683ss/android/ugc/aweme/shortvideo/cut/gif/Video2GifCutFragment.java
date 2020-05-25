package com.p683ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.p038f.C0794k;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.medialib.FFMpegManager;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.mediaplayer.C36756a;
import com.p683ss.android.ugc.aweme.mediaplayer.C36757b;
import com.p683ss.android.ugc.aweme.mediaplayer.C36763h;
import com.p683ss.android.ugc.aweme.mediaplayer.C36764i;
import com.p683ss.android.ugc.aweme.mediaplayer.C36765j;
import com.p683ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment */
public class Video2GifCutFragment extends Fragment {

    /* renamed from: h */
    private static final double f107851h = ((double) C47339t.FAST.value());

    /* renamed from: a */
    boolean f107852a;

    /* renamed from: b */
    public MediaPlayerModule f107853b;

    /* renamed from: c */
    public CutMultiVideoViewModel f107854c;

    /* renamed from: d */
    public VideoEditViewModel f107855d;

    /* renamed from: e */
    public VideoShare2GifEditContext f107856e;

    /* renamed from: f */
    public Handler f107857f = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            int i;
            super.handleMessage(message);
            if (message.what == 0) {
                CutMultiVideoViewModel cutMultiVideoViewModel = Video2GifCutFragment.this.f107854c;
                long longValue = ((Long) message.obj).longValue();
                List k = Video2GifCutFragment.this.f107855d.mo87633k();
                cutMultiVideoViewModel.f107668b.setValue(Long.valueOf(longValue));
                if (cutMultiVideoViewModel.f107667a.getValue() != null) {
                    i = ((Integer) ((C0794k) cutMultiVideoViewModel.f107667a.getValue()).f2712b).intValue();
                } else {
                    i = 0;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < k.size(); i2++) {
                    if (!((VideoSegment) k.get(i2)).f107911j) {
                        arrayList.add(k.get(i2));
                    }
                }
                long j = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        i3 = 0;
                        break;
                    }
                    j += ((VideoSegment) arrayList.get(i3)).f107904c;
                    if (j > longValue) {
                        break;
                    }
                    i3++;
                }
                if (longValue > 0) {
                    cutMultiVideoViewModel.f107667a.setValue(C0794k.m2265a(Integer.valueOf(i), Integer.valueOf(i3)));
                }
            }
        }
    };
    @BindView(2131493176)
    FrameLayout flVideoContainer;

    /* renamed from: g */
    public Runnable f107858g = new Runnable() {
        public final void run() {
            if (Video2GifCutFragment.this.f107853b != null) {
                Video2GifCutFragment.this.f107857f.obtainMessage(0, Long.valueOf(Video2GifCutFragment.this.f107853b.f93929b.mo75886f())).sendToTarget();
                Video2GifCutFragment.this.f107857f.postDelayed(Video2GifCutFragment.this.f107858g, 30);
            }
        }
    };

    /* renamed from: i */
    private C0199s<C36764i> f107859i = new C42635a(this);
    @BindView(2131493532)
    ImageView ivPlay;
    @BindView(2131493839)
    TextureView textureVideoView;
    @BindView(2131493986)
    TextView tvSelectedTime;
    @BindView(2131494021)
    VideoEditView videoEditView;

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo86900b() {
        if (getActivity() != null) {
            C9432q.m18672a((Context) getActivity(), (int) R.string.cph);
            getActivity().finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo86898a() {
        this.tvSelectedTime.setText(getString(R.string.c8j, C2240a.m6773a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(this.videoEditView.getSelectedTime())})));
        C0794k singleVideoPlayBoundary = this.videoEditView.getSingleVideoPlayBoundary();
        if (singleVideoPlayBoundary != null && singleVideoPlayBoundary.f2711a != null && singleVideoPlayBoundary.f2712b != null) {
            this.f107856e.f106366m = ((Long) singleVideoPlayBoundary.f2711a).longValue();
            this.f107856e.f106367n = ((Long) singleVideoPlayBoundary.f2712b).longValue();
        }
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131493839})
    public void resolveUiClick(View view) {
        if (view.getId() == R.id.czh) {
            MediaPlayerModule mediaPlayerModule = this.f107853b;
            if (mediaPlayerModule.f93931d) {
                mediaPlayerModule.f93930c = true;
                mediaPlayerModule.mo75864b();
                return;
            }
            mediaPlayerModule.f93930c = false;
            mediaPlayerModule.mo75863a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86899a(Boolean bool) {
        boolean z;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f107852a = z;
        if (bool == null || !bool.booleanValue()) {
            this.f107853b.mo75863a();
        } else {
            this.f107853b.mo75864b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            mo86900b();
            return;
        }
        this.f107854c = (CutMultiVideoViewModel) C0214z.m440a(getActivity()).mo359a(CutMultiVideoViewModel.class);
        this.f107855d = (VideoEditViewModel) C0214z.m440a(getActivity()).mo359a(VideoEditViewModel.class);
        this.f107856e = (VideoShare2GifEditContext) getArguments().getParcelable("extra_edit_context");
        if (this.f107856e == null) {
            mo86900b();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C36756a aVar;
        super.onViewCreated(view, bundle);
        ButterKnife.bind((Object) this, view);
        if (VERSION.SDK_INT >= 21) {
            this.textureVideoView.setClipToOutline(true);
            this.textureVideoView.setOutlineProvider(new C47856en(C23728o.m58241a(4.0d)));
        }
        this.flVideoContainer.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                int i;
                if (Video2GifCutFragment.this.f107856e != null) {
                    Video2GifCutFragment.this.flVideoContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int height = Video2GifCutFragment.this.flVideoContainer.getHeight();
                    int width = Video2GifCutFragment.this.flVideoContainer.getWidth();
                    int[] a = FFMpegManager.m46826a().mo39233a(Video2GifCutFragment.this.f107856e.f106354a);
                    if (a[0] == 0) {
                        int i2 = a[2];
                        int i3 = a[3];
                        Video2GifCutFragment.this.f107856e.f106360g = i2;
                        Video2GifCutFragment.this.f107856e.f106361h = i3;
                        LayoutParams layoutParams = new LayoutParams(-1, -1);
                        if (i2 < i3) {
                            layoutParams.width = (i2 * height) / i3;
                            layoutParams.height = height;
                            layoutParams.leftMargin = (width - layoutParams.width) / 2;
                            layoutParams.topMargin = 0;
                        } else {
                            layoutParams.width = width;
                            layoutParams.height = (i3 * width) / i2;
                            layoutParams.topMargin = (height - layoutParams.height) / 2;
                            if (layoutParams.topMargin >= 0) {
                                i = layoutParams.topMargin;
                            } else {
                                i = 0;
                            }
                            layoutParams.topMargin = i;
                            layoutParams.leftMargin = 0;
                        }
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams.setMarginStart(layoutParams.leftMargin);
                        }
                        Video2GifCutFragment.this.f107856e.f106362i = layoutParams.width;
                        Video2GifCutFragment.this.f107856e.f106363j = layoutParams.height;
                        Video2GifCutFragment.this.flVideoContainer.setLayoutParams(layoutParams);
                    }
                    FFMpegManager.m46826a().mo39234b();
                }
            }
        });
        this.videoEditView.setMinVideoLength(2000);
        this.videoEditView.setMaxVideoLength(15000);
        if (this.videoEditView.mo87551a(getActivity(), this.f107854c, this.f107856e.f106354a) || getActivity() == null) {
            this.f107855d.f108908c.observe(this, new C42642b(this));
            this.f107855d.f108910e.observe(this, new C42643c(this));
            this.f107855d.f108909d.observe(this, new C42644d(this));
            this.f107855d.f108911f.observe(this, new C42645e(this));
            this.f107855d.f108912g.observe(this, new C42646f(this));
            this.f107855d.f108917l.observe(this, new C42647g(this));
            try {
                if (C39629l.m88232a().mo58583n().mo83103a(C40790a.RemoveIESMediaPlayer)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C43308eb.f109492e);
                    sb.append("video2gif_workspace");
                    String sb2 = sb.toString();
                    C48016e.m103954e(sb2);
                    aVar = new C36765j(sb2, this.textureVideoView);
                } else {
                    aVar = new C36757b(getActivity());
                }
                C36763h hVar = new C36763h();
                hVar.f93946c = true;
                hVar.f93944a = (float) f107851h;
                hVar.f93945b = 0.0f;
                hVar.f93948e = this.videoEditView.getMaxCutDuration();
                this.f107853b = new MediaPlayerModule(aVar, hVar);
                this.f107853b.f93928a = this.f107856e.f106354a;
                this.f107853b.f93935h.observe(this, this.f107859i);
                MediaPlayerModule mediaPlayerModule = this.f107853b;
                TextureView textureView = this.textureVideoView;
                mediaPlayerModule.f93934g = textureView.getSurfaceTextureListener();
                textureView.setSurfaceTextureListener(mediaPlayerModule);
                getLifecycle().mo324a(this.f107853b);
            } catch (Exception unused) {
                mo86900b();
            }
        } else {
            getActivity().finish();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qy, viewGroup, false);
    }
}
