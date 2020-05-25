package com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.detailvideo;

import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31121a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31124c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31125d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31134e;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31137g;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.VideoSeekBar;
import com.p683ss.android.ugc.aweme.feed.panel.C30597ae;
import com.p683ss.android.ugc.aweme.longvideonew.C36436l;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.b */
public final class C31128b extends C36436l {
    @C53771m
    public final void onVideoProgressVolumeKeyEvent(C31137g gVar) {
        C52711k.m112240b(gVar, "event");
        super.onVideoProgressVolumeKeyEvent(gVar);
    }

    /* renamed from: b */
    public final void mo63943b(SeekBar seekBar) {
        super.mo63943b(seekBar);
        C47718bf.m103288a(new C31127a(false, this.f93332a, this.f93340i));
    }

    @C53771m
    public final void onPlayerControllerRenderFirstFrameEvent(C31124c cVar) {
        C52711k.m112240b(cVar, "event");
        if (C52711k.m112239a((Object) this.f93340i, (Object) cVar.f81475e)) {
            super.onPlayerControllerRenderFirstFrameEvent(cVar);
        }
    }

    @C53771m
    public final void onPlayerControllerVideoPlayProgressChange(C31125d dVar) {
        C52711k.m112240b(dVar, "event");
        if (C52711k.m112239a((Object) this.f93340i, (Object) dVar.f81480e)) {
            super.onPlayerControllerVideoPlayProgressChange(dVar);
        }
    }

    @C53771m
    public final void onPlayerControllerVideoStatusEvent(C31134e eVar) {
        C52711k.m112240b(eVar, "event");
        if (C52711k.m112239a((Object) this.f93340i, (Object) eVar.f81505e)) {
            super.onPlayerControllerVideoStatusEvent(eVar);
        }
    }

    /* renamed from: a */
    public final void mo63940a(MotionEvent motionEvent) {
        Integer num;
        super.mo63940a(motionEvent);
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            C47718bf.m103288a(new C31127a(true, this.f93332a, this.f93340i));
        }
    }

    @C53771m
    public final void onFullFeedVideoChangeEvent(C31121a aVar) {
        C52711k.m112240b(aVar, "event");
        if (C52711k.m112239a((Object) this.f93340i, (Object) aVar.f81464d)) {
            super.onFullFeedVideoChangeEvent(aVar);
            mo75373a();
        } else {
            this.f93350s.setVisibility(8);
            this.f93351t.setVisibility(8);
        }
        this.f93350s.removeCallbacks(this.f93349r);
    }

    public C31128b(VideoSeekBar videoSeekBar, LinearLayout linearLayout, C30597ae aeVar) {
        C52711k.m112240b(videoSeekBar, "videoSeekBar");
        C52711k.m112240b(linearLayout, "videoSeekDuration");
        super(videoSeekBar, linearLayout);
        C47718bf.m103290c(this);
        this.f93340i = aeVar;
    }
}
