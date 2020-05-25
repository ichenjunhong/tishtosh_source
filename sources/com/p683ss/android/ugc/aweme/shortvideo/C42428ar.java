package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.als.ApiCenter;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43236a;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43244d;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46448b;
import com.p683ss.android.ugc.aweme.tools.C46938d;
import com.p683ss.android.ugc.aweme.tools.C47067l;
import com.p683ss.android.ugc.aweme.tools.C47337r;
import com.p683ss.android.ugc.aweme.tools.C47347v;
import com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar */
public final class C42428ar {

    /* renamed from: a */
    private AppCompatActivity f107321a;

    /* renamed from: b */
    private C45017b f107322b;

    public final void onEvent(C47067l lVar) {
        long j;
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) this.f107321a).mo359a(ShortVideoContextViewModel.class);
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.f107134a;
        C43789em p = shortVideoContext.mo86375p();
        if (!p.isEmpty()) {
            C46066a aVar = shortVideoContext.f107126s;
            C52711k.m112240b(p, "segments");
            if (!p.isEmpty()) {
                Object obj = p.get(p.size() - 1);
                C52711k.m112236a(obj, "segments[segments.size - 1]");
                C46066a backgroundVideo = ((TimeSpeedModelExtension) obj).getBackgroundVideo();
                if (backgroundVideo != null) {
                    C52711k.m112236a((Object) backgroundVideo, "segments[segments.size -…backgroundVideo ?: return");
                    if (!C52711k.m112239a((Object) backgroundVideo, (Object) aVar)) {
                        Iterator it = C52575l.m112129b((Iterable<? extends T>) p, p.size() - 1).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                C46448b.m100836a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                                break;
                            }
                            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                            C52711k.m112236a((Object) timeSpeedModelExtension, "it");
                            if (C52711k.m112239a((Object) timeSpeedModelExtension.getBackgroundVideo(), (Object) backgroundVideo)) {
                                break;
                            }
                        }
                    }
                }
            }
            p.removeLast();
            C45017b bVar = this.f107322b;
            bVar.f113988F = false;
            bVar.f114040r.mo43641f();
            this.f107322b.mo91309O().mo94322c();
            shortVideoContext.mo86357a((long) TimeSpeedModelExtension.calculateRealTime(p));
            shortVideoContext.f107082ah.removeLastArray();
            shortVideoContext.f107083ai.removeLastArray();
            shortVideoContext.f107084aj.removeLast();
            shortVideoContext.f107085ak.removeLast();
            shortVideoContext.f107087am.removeLast();
            shortVideoContext.f107086al.removeLast();
            if (shortVideoContext.f107035N != null) {
                shortVideoContext.f107035N.removeReactionWindowInfo();
            }
            if (shortVideoContext.f107039R.size() > 0) {
                shortVideoContext.f107039R.remove(shortVideoContext.f107039R.size() - 1);
            }
            if (shortVideoContext.f107071aW.size() > 0) {
                shortVideoContext.f107071aW.remove(shortVideoContext.f107071aW.size() - 1);
            }
            this.f107322b.f114029g.mo7350a(C47337r.m102707a((List<TimeSpeedModelExtension>) p, shortVideoContext.mo86372m(), true));
            this.f107322b.mo91333a(new C47347v(4));
            this.f107322b.mo91338a(true);
        }
        if (p.isEmpty()) {
            C43306a.m94978a();
            if (shortVideoContext.mo86366g() || shortVideoContext.mo86362d()) {
                this.f107322b.mo91333a(new C47347v(3));
            } else if (C43236a.m94873a(shortVideoContext)) {
                this.f107322b.mo91333a(new C47347v(3));
                C43244d dVar = (C43244d) ApiCenter.m7844a((FragmentActivity) this.f107321a).mo7341b(C43244d.class);
                if (dVar != null) {
                    dVar.mo87915b(false);
                }
            } else if (!shortVideoContext.mo86365f()) {
                this.f107322b.f114036n.mo7350a(C52860x.f131107a);
            }
        }
        if (shortVideoContext.f107103bb.size() > 0) {
            shortVideoContext.f107103bb.remove(shortVideoContext.f107103bb.size() - 1);
        }
        this.f107322b.mo91384a(new C46938d());
        if (shortVideoContext.mo86375p().isEmpty() && C43214dh.m94817a().mo50201b() != null) {
            C42482c b = C43214dh.m94817a().mo50201b();
            if (shortVideoContext.f107089ao) {
                j = C45325v.f114600e;
            } else {
                j = 15000;
            }
            C49850a aVar2 = (C49850a) ApiCenter.m7844a((FragmentActivity) this.f107321a).mo7341b(C49850a.class);
            if (aVar2 != null) {
                if (b == null || (((long) b.shootDuration) <= j && Math.abs(b.shootDuration - b.duration) < 1000)) {
                    aVar2.mo97680a(false);
                } else {
                    aVar2.mo97680a(true);
                }
            }
        }
        shortVideoContextViewModel.mo86396f().setValue(null);
    }

    public C42428ar(AppCompatActivity appCompatActivity, ASCameraView aSCameraView, C45017b bVar) {
        this.f107321a = appCompatActivity;
        this.f107322b = bVar;
    }
}
