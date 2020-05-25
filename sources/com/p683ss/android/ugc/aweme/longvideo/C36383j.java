package com.p683ss.android.ugc.aweme.longvideo;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.j */
public final class C36383j implements C36350b {

    /* renamed from: a */
    public OnSeekBarChangeListener f93155a;

    /* renamed from: b */
    public boolean f93156b;

    /* renamed from: c */
    public VideoPlaySeekBar f93157c;

    /* renamed from: d */
    public C36348a f93158d;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.j$a */
    public static final class C36384a implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C36383j f93159a;

        C36384a(C36383j jVar) {
            this.f93159a = jVar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.f93159a.f93156b = true;
            C36349a aVar = new C36349a();
            aVar.f93058a = true;
            C47718bf.m103288a(aVar);
            OnSeekBarChangeListener onSeekBarChangeListener = this.f93159a.f93155a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f93159a.f93156b = false;
            if (seekBar != null) {
                int progress = seekBar.getProgress();
                C36348a aVar = this.f93159a.f93158d;
                if (aVar != null) {
                    aVar.mo75259b(((float) progress) / 100.0f);
                }
            }
            C36349a aVar2 = new C36349a();
            aVar2.f93059b = true;
            C47718bf.m103288a(aVar2);
            OnSeekBarChangeListener onSeekBarChangeListener = this.f93159a.f93155a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            OnSeekBarChangeListener onSeekBarChangeListener = this.f93159a.f93155a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo75267a(int i) {
        this.f93157c.setSecondaryProgress(i);
    }

    /* renamed from: a */
    public final void mo75266a(float f) {
        if (!this.f93156b) {
            this.f93157c.setProgress(f);
        }
    }

    public C36383j(VideoPlaySeekBar videoPlaySeekBar, C36348a aVar) {
        C52711k.m112240b(videoPlaySeekBar, "seekBar");
        this.f93157c = videoPlaySeekBar;
        this.f93158d = aVar;
    }
}
