package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.AnimatorListenerAdapter;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.view.View;
import android.view.View.OnClickListener;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43690b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a */
public interface C43744a {
    /* renamed from: a */
    AbstractVideoEditView mo89206a();

    /* renamed from: a */
    void mo89207a(int i, int i2);

    /* renamed from: a */
    void mo89208a(FragmentActivity fragmentActivity, int i, AnimatorListenerAdapter animatorListenerAdapter);

    /* renamed from: a */
    void mo89209a(FragmentActivity fragmentActivity, int i, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter);

    /* renamed from: a */
    void mo89210a(FragmentActivity fragmentActivity, View view);

    /* renamed from: a */
    void mo89211a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends MediaModel> list, boolean z);

    /* renamed from: a */
    void mo89212a(FragmentActivity fragmentActivity, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list);

    /* renamed from: a */
    void mo89213a(C0794k<Float, Float> kVar);

    /* renamed from: a */
    void mo89214a(OnClickListener onClickListener);

    /* renamed from: a */
    void mo89215a(VideoSegment videoSegment);

    /* renamed from: a */
    void mo89216a(C43690b bVar);

    /* renamed from: a */
    void mo89217a(List<? extends VideoSegment> list);

    /* renamed from: a */
    void mo89218a(boolean z);

    /* renamed from: a */
    void mo89219a(boolean z, int i);

    /* renamed from: b */
    void mo89220b(C0794k<Float, Float> kVar);

    /* renamed from: b */
    void mo89221b(VideoSegment videoSegment);

    /* renamed from: b */
    void mo89222b(boolean z);

    /* renamed from: b */
    boolean mo89223b();

    /* renamed from: c */
    void mo89224c();

    /* renamed from: d */
    C0794k<Float, Float> mo89225d();

    /* renamed from: e */
    boolean mo89226e();

    /* renamed from: f */
    void mo89227f();

    /* renamed from: g */
    void mo89228g();

    /* renamed from: h */
    void mo89229h();

    /* renamed from: i */
    void mo89230i();

    /* renamed from: j */
    void mo89231j();

    /* renamed from: k */
    View mo89232k();

    /* renamed from: l */
    void mo89233l();
}
