package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.d */
public interface C43120d {
    /* renamed from: a */
    void mo87538a();

    /* renamed from: a */
    void mo87543a(C0794k<Float, Float> kVar, boolean z);

    /* renamed from: a */
    void mo87516a(List<VideoSegment> list);

    /* renamed from: a */
    void mo87517a(boolean z);

    /* renamed from: a */
    void mo87546a(boolean z, C0794k<Float, Float> kVar);

    /* renamed from: a */
    boolean mo87551a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, String str);

    /* renamed from: a */
    boolean mo87552a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list);

    /* renamed from: a */
    boolean mo87553a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list, boolean z);

    /* renamed from: b */
    void mo87554b();

    /* renamed from: c */
    void mo87556c();

    /* renamed from: d */
    boolean mo87519d();

    /* renamed from: e */
    void mo87520e();

    /* renamed from: f */
    void mo87521f();

    /* renamed from: g */
    boolean mo87559g();

    int getCurrentRotate();

    float getCurrentSpeed();

    int getEditState();

    long getLeftSeekingValue();

    long getMaxCutDuration();

    long getMultiPlayingPosition();

    long getMultiSeekTime();

    C0794k<Long, Long> getPlayBoundary();

    long getPlayingPosition();

    long getRightSeekingValue();

    float getSelectedTime();

    long getSinglePlayingPosition();

    long getSingleSeekTime();

    C0794k<Float, Float> getSlideX();

    void setExtractFramesInRoughMode(boolean z);

    void setLoadThumbnailDirectly(boolean z);

    void setMaxVideoLength(long j);

    void setMinVideoLength(long j);
}
