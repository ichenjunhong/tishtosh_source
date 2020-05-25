package com.p683ss.android.ugc.aweme.shortvideo.cover;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.medialib.jni.EffectThumb;
import com.p683ss.android.medialib.player.EffectConfig;
import com.p683ss.android.ugc.aweme.effect.C29205j;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c.C42543a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52855s;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.EffectVideoCoverGeneratorImpl */
public class EffectVideoCoverGeneratorImpl implements C0183j, C42542c {

    /* renamed from: a */
    EffectThumb f107570a;

    /* renamed from: b */
    Handler f107571b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private int f107572c;

    /* renamed from: d */
    private List<EffectPointModel> f107573d;

    /* renamed from: e */
    private String f107574e;

    /* renamed from: f */
    private float f107575f;

    /* renamed from: g */
    private boolean f107576g;

    /* renamed from: h */
    private long f107577h;

    /* renamed from: i */
    private EditPreviewInfo f107578i;

    /* renamed from: a */
    public final int mo78726a() {
        return this.f107572c;
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.f107570a != null) {
            this.f107570a.stopRender();
        }
    }

    /* renamed from: a */
    public final void mo78727a(int i, int i2, C42543a aVar) {
        for (int i3 = 0; i3 < this.f107572c; i3++) {
            C52855s a = C43668b.m95934a(this.f107578i, this.f107576g, (long) i3);
            EditVideoSegment editVideoSegment = (EditVideoSegment) a.getFirst();
            if (this.f107570a == null) {
                this.f107570a = new C42544d();
                if (this.f107570a.init(editVideoSegment.getVideoPath()) < 0) {
                    this.f107570a = null;
                } else {
                    this.f107577h = this.f107570a.getDuration();
                    EffectConfig filter = C29205j.m68772a(this.f107573d, editVideoSegment.getVideoCutInfo(), this.f107576g, (long[]) a.getThird()).setFilter(this.f107574e);
                    filter.setFilterIntensity(this.f107575f);
                    EffectThumb effectThumb = this.f107570a;
                    long j = this.f107577h;
                    int i4 = this.f107572c;
                    long[] jArr = new long[i4];
                    long j2 = j / ((long) i4);
                    for (int i5 = 0; i5 < i4; i5++) {
                        jArr[i5] = ((long) i5) * j2;
                    }
                    effectThumb.renderVideo(jArr, filter, i, i2);
                }
            }
            C0013i.m16a((Callable<TResult>) new C42540a<TResult>(this, editVideoSegment, i3, aVar));
        }
    }

    public EffectVideoCoverGeneratorImpl(C0184k kVar, List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo) {
        kVar.getLifecycle().mo324a(this);
        this.f107572c = i;
        this.f107573d = list;
        this.f107574e = str;
        this.f107575f = f;
        this.f107576g = z;
        this.f107578i = editPreviewInfo;
    }
}
