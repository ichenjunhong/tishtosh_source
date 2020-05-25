package com.p683ss.android.ugc.aweme.p1437bj;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.ApiCenter.C2755a;
import com.p683ss.android.ugc.aweme.comment_sticker.C25465a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C45329y;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.aweme.tools.C46807aa;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49576a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49579d;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j.C49606a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.p2480n.C49912d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bj.b */
public final class C23831b implements C49576a {

    /* renamed from: a */
    public RecordStatusViewModel f63485a;

    /* renamed from: b */
    public C45004a f63486b;

    /* renamed from: c */
    private final String f63487c;

    /* renamed from: d */
    private final String f63488d;

    /* renamed from: e */
    private final String f63489e;

    /* renamed from: f */
    private final boolean f63490f;

    /* renamed from: com.ss.android.ugc.aweme.bj.b$a */
    public static final class C23832a implements C49605j {

        /* renamed from: a */
        final /* synthetic */ C23831b f63491a;

        /* renamed from: b */
        final /* synthetic */ C48923a f63492b;

        /* renamed from: b */
        public final boolean mo49420b(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            return false;
        }

        C23832a(C23831b bVar, C48923a aVar) {
            this.f63491a = bVar;
            this.f63492b = aVar;
        }

        /* renamed from: a */
        public final boolean mo49419a(C49579d dVar, C49606a aVar) {
            int i;
            int i2;
            int i3;
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            this.f63492b.mo96757h().mo86555a("record");
            String str = dVar.f124360c;
            C52711k.m112240b(str, "tag");
            if (C52711k.m112239a((Object) str, (Object) C45329y.f114610a)) {
                i = 10;
            } else if (C52711k.m112239a((Object) str, (Object) C45329y.f114611b)) {
                i = 11;
            } else {
                i = 8;
            }
            this.f63492b.mo96752c().f107081ag = i;
            ApiCenter a = C2755a.m7851a(this.f63492b.mo96751b());
            ((C43859a) a.mo7339a(C43859a.class)).mo89400c(true);
            C49860a aVar2 = (C49860a) a.mo7339a(C49860a.class);
            aVar2.mo97694d();
            aVar2.mo97685a(3, false);
            C45004a aVar3 = this.f63491a.f63486b;
            if (aVar3 == null) {
                C52711k.m112237a("cameraApiComponent");
            }
            aVar3.mo91323a(0);
            ((C49860a) a.mo7339a(C49860a.class)).mo97693c(true);
            if (C39618d.f101151O.mo83117a(C40796a.SpeedPanelOpen)) {
                ((C49912d) a.mo7339a(C49912d.class)).mo97721a(true);
            }
            C48923a aVar4 = this.f63492b;
            String str2 = dVar.f124360c;
            ShortVideoContext c = this.f63492b.mo96752c();
            boolean z = aVar.f124439b;
            if ((C52711k.m112239a((Object) C45329y.m98810b(), (Object) str2) || C52711k.m112239a((Object) C45329y.m98809a(), (Object) str2)) && !c.mo86365f() && !c.mo86366g()) {
                C46807aa aaVar = new C46807aa(!C52711k.m112239a((Object) C45329y.m98810b(), (Object) str2), true);
                aaVar.f118272d = z;
                aaVar.f118271c = 2;
                aVar4.mo96755f().mo91327a(aaVar);
            }
            C48923a aVar5 = this.f63492b;
            String str3 = dVar.f124360c;
            ShortVideoContext c2 = this.f63492b.mo96752c();
            if ((C52711k.m112239a((Object) C45329y.m98810b(), (Object) str3) || C52711k.m112239a((Object) C45329y.m98809a(), (Object) str3)) && c2.mo86361c()) {
                if (c2.mo86364e()) {
                    StitchParams stitchParams = c2.f107036O;
                    if (stitchParams == null) {
                        i2 = 0;
                    } else {
                        EditVideoSegment videoSegment = stitchParams.getVideoSegment();
                        if (videoSegment != null) {
                            VideoFileInfo videoFileInfo = videoSegment.getVideoFileInfo();
                            if (videoFileInfo != null) {
                                i3 = (int) videoFileInfo.getDuration();
                                i2 = Math.max(stitchParams.getMusicStart(), 0) + i3;
                            }
                        }
                        i3 = 0;
                        i2 = Math.max(stitchParams.getMusicStart(), 0) + i3;
                    }
                    c2.f107113f = i2;
                } else {
                    c2.f107113f = 0;
                }
                C43306a.m94986a(c2.f107112e, C43214dh.m94817a().mo50201b(), c2.f107113f);
                aVar5.mo96753d().mo43297a(c2.f107112e, (long) c2.f107113f, c2.f107120m);
            }
            C43306a.m94994c(i);
            RecordStatusViewModel recordStatusViewModel = this.f63491a.f63485a;
            if (recordStatusViewModel == null) {
                C52711k.m112237a("recordStatusViewModel");
            }
            recordStatusViewModel.mo92167l().setValue(Boolean.valueOf(false));
            if (this.f63492b.mo96752c().f107119l.isEmpty()) {
                C25465a aVar6 = (C25465a) a.mo7341b(C25465a.class);
                if (aVar6 != null) {
                    aVar6.mo52059a(true);
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final C49604i mo49416a() {
        return null;
    }

    /* renamed from: b */
    public final C49579d mo49418b(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        C49579d dVar = new C49579d(this.f63487c, this.f63488d, this.f63489e, this.f63490f, new C23832a(this, aVar));
        return dVar;
    }

    /* renamed from: a */
    public final void mo49417a(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        this.f63486b = aVar.mo96755f();
        C0209x a = C0214z.m440a(aVar.mo96751b()).mo359a(RecordStatusViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f63485a = (RecordStatusViewModel) a;
    }

    public C23831b(String str, String str2, String str3, boolean z) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "tag");
        C52711k.m112240b(str3, "shootMode");
        this.f63487c = str;
        this.f63488d = str2;
        this.f63489e = str3;
        this.f63490f = z;
    }
}
