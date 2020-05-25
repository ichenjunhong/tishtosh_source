package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.support.p030v4.p038f.C0794k;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42661d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel */
public class VideoEditViewModel extends C0209x {

    /* renamed from: a */
    public boolean f108906a;

    /* renamed from: b */
    public C0198r<Integer> f108907b = new C0198r<>();

    /* renamed from: c */
    public C0198r<Boolean> f108908c = new C0198r<>();

    /* renamed from: d */
    public C0198r<Float> f108909d = new C0198r<>();

    /* renamed from: e */
    public C0198r<Long> f108910e = new C0198r<>();

    /* renamed from: f */
    public C0198r<Void> f108911f = new C0198r<>();

    /* renamed from: g */
    public C0198r<Void> f108912g = new C0198r<>();

    /* renamed from: h */
    public C0198r<Void> f108913h = new C0198r<>();

    /* renamed from: i */
    public C0198r<Void> f108914i = new C0198r<>();

    /* renamed from: j */
    public C0198r<Void> f108915j = new C0198r<>();

    /* renamed from: k */
    public C0198r<Void> f108916k = new C0198r<>();

    /* renamed from: l */
    public C0198r<Void> f108917l = new C0198r<>();

    /* renamed from: m */
    public C0198r<Void> f108918m = new C0198r<>();

    /* renamed from: n */
    public C0198r<Float> f108919n = new C0198r<>();

    /* renamed from: o */
    public C0198r<C0794k<Integer, Integer>> f108920o = new C0198r<>();

    /* renamed from: p */
    public C0198r<Void> f108921p = new C0198r<>();

    /* renamed from: q */
    public C0198r<Void> f108922q = new C0198r<>();

    /* renamed from: r */
    public C0198r<VideoSegment> f108923r = new C0198r<>();

    /* renamed from: s */
    public C0198r<Boolean> f108924s = new C0198r<>();

    /* renamed from: t */
    public C0198r<Void> f108925t = new C0198r<>();

    /* renamed from: u */
    public C0198r<CutVideoContext> f108926u = new C0198r<>();

    /* renamed from: v */
    public C43112a f108927v;

    /* renamed from: w */
    private HashMap<String, Integer> f108928w = new HashMap<>();

    /* renamed from: x */
    private HashMap<String, Integer> f108929x = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel$a */
    public interface C43112a {
        /* renamed from: a */
        void mo87368a(VideoSegment videoSegment);

        /* renamed from: b */
        void mo87369b(VideoSegment videoSegment);
    }

    /* renamed from: a */
    public final void mo87613a(boolean z) {
        this.f108908c.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo87612a(List<MediaModel> list) {
        ArrayList arrayList = new ArrayList();
        if (C9414h.m18631b(list)) {
            int i = 0;
            if (list.size() == 1) {
                arrayList.add(m94528a((MediaModel) list.get(0)));
            } else {
                for (MediaModel videoSegment : list) {
                    VideoSegment videoSegment2 = new VideoSegment(videoSegment);
                    videoSegment2.f107902a = i;
                    arrayList.add(videoSegment2);
                    i++;
                }
            }
        }
        CutVideoContext cutVideoContext = new CutVideoContext();
        cutVideoContext.setVideoSegmentList(arrayList);
        cutVideoContext.totalSpeed = C47339t.NORMAL.value();
        m94529a(cutVideoContext);
    }

    /* renamed from: a */
    public final void mo87611a(C42661d dVar, int i) {
        VideoSegment videoSegment = (VideoSegment) ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList().get(i);
        videoSegment.mo86942a(dVar.f107943d);
        videoSegment.mo86943a(dVar.f107940a);
        videoSegment.mo86946b(dVar.f107941b);
        videoSegment.f107912k = dVar.f107942c;
        if (this.f108927v != null) {
            this.f108927v.mo87368a(videoSegment);
        }
    }

    /* renamed from: b */
    public final void mo87615b() {
        this.f108911f.setValue(null);
    }

    /* renamed from: c */
    public final void mo87621c() {
        this.f108913h.setValue(null);
    }

    /* renamed from: d */
    public final void mo87624d() {
        this.f108916k.setValue(null);
    }

    /* renamed from: e */
    public final void mo87627e() {
        this.f108925t.setValue(null);
    }

    /* renamed from: f */
    public final void mo87628f() {
        this.f108917l.setValue(null);
    }

    /* renamed from: g */
    public final void mo87629g() {
        this.f108918m.setValue(null);
    }

    /* renamed from: h */
    public final void mo87630h() {
        this.f108921p.setValue(null);
    }

    /* renamed from: i */
    public final void mo87631i() {
        this.f108922q.setValue(null);
    }

    /* renamed from: j */
    public final void mo87632j() {
        this.f108929x.clear();
    }

    /* renamed from: a */
    public final void mo87604a() {
        this.f108912g.setValue(null);
    }

    /* renamed from: k */
    public final List<VideoSegment> mo87633k() {
        return ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList();
    }

    /* renamed from: l */
    public final List<VideoSegment> mo87634l() {
        return ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList();
    }

    /* renamed from: m */
    public final float mo87635m() {
        return ((CutVideoContext) this.f108926u.getValue()).totalSpeed;
    }

    /* renamed from: n */
    public final boolean mo87636n() {
        for (VideoSegment h : ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList()) {
            if (h.mo86954h() != C47339t.NORMAL.value()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo87637o() {
        if (this.f108926u.getValue() == null || ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList() == null || ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList().isEmpty()) {
            return false;
        }
        VideoSegment videoSegment = (VideoSegment) ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList().get(0);
        if (videoSegment.f107908g <= 0 || videoSegment.f107909h <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m94529a(CutVideoContext cutVideoContext) {
        this.f108926u.setValue(cutVideoContext);
    }

    /* renamed from: b */
    public final void mo87616b(float f) {
        this.f108919n.setValue(Float.valueOf(f));
    }

    /* renamed from: c */
    public final void mo87622c(float f) {
        ((CutVideoContext) this.f108926u.getValue()).totalSpeed = f;
    }

    /* renamed from: a */
    public final void mo87605a(float f) {
        this.f108909d.setValue(Float.valueOf(f));
    }

    /* renamed from: d */
    public final boolean mo87625d(int i) {
        return this.f108929x.containsKey(((VideoSegment) ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList().get(i)).mo86950e());
    }

    /* renamed from: e */
    public final VideoSegment mo87626e(int i) {
        return (VideoSegment) ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList().get(i);
    }

    /* renamed from: a */
    private static VideoSegment m94528a(MediaModel mediaModel) {
        VideoSegment videoSegment = new VideoSegment(mediaModel);
        int[] iArr = new int[10];
        if (C46813b.m101656a(mediaModel.f95383b, iArr) == 0) {
            videoSegment.f107908g = iArr[0];
            videoSegment.f107909h = iArr[1];
            videoSegment.f107904c = (long) iArr[3];
            videoSegment.f107921t = iArr[7];
            videoSegment.f107922u = iArr[6];
            videoSegment.f107923v = iArr[9];
            videoSegment.f107924w = iArr[8];
        }
        return videoSegment;
    }

    /* renamed from: b */
    public final int mo87614b(int i) {
        VideoSegment videoSegment = (VideoSegment) ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList().get(i);
        if (this.f108928w.containsKey(videoSegment.mo86950e())) {
            return ((Integer) this.f108928w.get(videoSegment.mo86950e())).intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo87620c(int i) {
        VideoSegment videoSegment = (VideoSegment) ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList().get(i);
        if (this.f108929x.containsKey(videoSegment.mo86950e())) {
            return ((Integer) this.f108929x.get(videoSegment.mo86950e())).intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo87603a(String str) {
        int i = 0;
        for (VideoSegment e : ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList()) {
            if (e.mo86950e().equals(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo87618b(String str) {
        for (VideoSegment videoSegment : ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList()) {
            if (videoSegment.mo86950e().equals(str)) {
                videoSegment.f107911j = true;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo87623c(String str) {
        for (VideoSegment videoSegment : ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList()) {
            if (videoSegment.mo86950e().equals(str)) {
                if (this.f108927v != null) {
                    this.f108927v.mo87369b(videoSegment);
                }
                videoSegment.f107911j = true;
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo87606a(int i) {
        this.f108907b.setValue(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo87619b(List<VideoSegment> list) {
        if (list != null && !list.isEmpty()) {
            ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList().addAll(list);
            this.f108926u.postValue(this.f108926u.getValue());
        }
    }

    /* renamed from: a */
    public final void mo87608a(long j) {
        this.f108910e.setValue(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo87609a(C0794k<Integer, Integer> kVar) {
        this.f108920o.setValue(kVar);
    }

    /* renamed from: a */
    public final void mo87610a(VideoSegment videoSegment) {
        this.f108923r.setValue(videoSegment);
    }

    /* renamed from: b */
    public final void mo87617b(int i, int i2) {
        this.f108929x.put(((VideoSegment) ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList().get(i)).mo86950e(), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final void mo87607a(int i, int i2) {
        this.f108928w.put(((VideoSegment) ((CutVideoContext) this.f108926u.getValue()).getVideoSegmentList().get(i)).mo86950e(), Integer.valueOf(i2));
    }
}
