package com.p683ss.android.ugc.aweme.shortvideo.record;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.util.SparseIntArray;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.camera.C20463c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.CameraModuleForStory */
public class CameraModuleForStory implements C0183j, C20463c {

    /* renamed from: b */
    public static SparseIntArray f112419b;

    /* renamed from: a */
    public final C20457b f112420a;

    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
        this.f112420a.mo43354b(0);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f112419b = sparseIntArray;
        sparseIntArray.put(0, R.drawable.ak9);
        f112419b.put(1, R.drawable.ak_);
        f112419b.put(2, R.drawable.ak_);
        f112419b.put(3, R.drawable.ak8);
    }

    /* renamed from: a */
    public final void mo43414a(int i, float f, boolean z) {
        StringBuilder sb = new StringBuilder(" size = ");
        sb.append(f);
        C23569o.m57779a("zoom_info_log", new C42437ay().mo86521a("camera_zoom_size", sb.toString()).mo86522b());
    }

    /* renamed from: a */
    public final void mo43415a(int i, boolean z, boolean z2, float f, List<Integer> list) {
        String str;
        String str2 = "zoom_info_log";
        C42437ay a = new C42437ay().mo86519a("cameraType", Integer.valueOf(i)).mo86517a("supportZoom", Boolean.valueOf(z)).mo86517a("supportSmooth", Boolean.valueOf(z2)).mo86518a("maxZoom", Float.valueOf(f));
        String str3 = "ratios";
        if (C9414h.m18631b(list)) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(0));
            str = sb.toString();
        } else {
            str = " ";
        }
        C23569o.m57779a(str2, a.mo86521a(str3, str).mo86522b());
    }
}
