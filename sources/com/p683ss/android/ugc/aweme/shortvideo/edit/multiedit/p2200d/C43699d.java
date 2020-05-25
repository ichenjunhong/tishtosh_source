package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d;

import android.util.Pair;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C43738a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43683c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43689a;
import com.p683ss.android.ugc.aweme.utils.C47807de;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o.C50742c;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.VERecordData;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.d */
public final class C43699d {

    /* renamed from: a */
    public C20347c f110646a;

    /* renamed from: b */
    public C43689a f110647b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.d$a */
    public static final class C43700a implements C50711k {

        /* renamed from: a */
        final /* synthetic */ C43699d f110648a;

        public C43700a(C43699d dVar) {
            this.f110648a = dVar;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4101) {
                C43689a aVar = this.f110648a.f110647b;
                if (aVar != null) {
                    aVar.mo89118c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo89138a() {
        C20347c cVar = this.f110646a;
        if (cVar != null) {
            cVar.mo43085r();
        }
        C43689a aVar = this.f110647b;
        if (aVar != null) {
            aVar.mo89116a();
        }
    }

    /* renamed from: b */
    public final void mo89145b() {
        C20347c cVar = this.f110646a;
        if (cVar != null) {
            cVar.mo43087s();
        }
        C43689a aVar = this.f110647b;
        if (aVar != null) {
            aVar.mo89117b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo89147c() {
        C20347c cVar = this.f110646a;
        if (cVar != null) {
            cVar.mo42995a(C50742c.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
        }
        if (C43683c.f110614a.mo89111k()) {
            C20347c cVar2 = this.f110646a;
            if (cVar2 != null) {
                cVar2.mo43047c(C43683c.m95962e(), C43683c.m95963f());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo89148d() {
        if (C43683c.f110614a.mo89112l()) {
            C20347c cVar = this.f110646a;
            if (cVar != null) {
                cVar.mo43015a(C43683c.m95957a(), C43683c.m95959b(), C43683c.m95960c(), C43683c.m95961d());
            }
        }
    }

    /* renamed from: a */
    public final void mo89140a(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            C20347c cVar = this.f110646a;
            if (cVar != null) {
                cVar.mo43080o();
            }
            VERecordData a = C43738a.m96063a(multiEditVideoRecordData);
            Pair playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
            a.mo98589a(((long) ((Integer) playInOutTime.first).intValue()) * 1000, ((long) ((Integer) playInOutTime.second).intValue()) * 1000);
            C20347c cVar2 = this.f110646a;
            if (cVar2 != null) {
                cVar2.mo42992a(a, false);
            }
            mo89146b(multiEditVideoRecordData);
            C20347c cVar3 = this.f110646a;
            if (cVar3 != null) {
                cVar3.mo43019a(true);
            }
            mo89147c();
            C20347c cVar4 = this.f110646a;
            if (cVar4 != null) {
                cVar4.mo43077n();
            }
            mo89148d();
            C20347c cVar5 = this.f110646a;
            if (cVar5 != null) {
                cVar5.mo42983a(0, C50743d.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo89146b(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            if (!C48016e.m103944b(multiEditVideoRecordData.musicPath)) {
                C20347c cVar = this.f110646a;
                if (cVar != null) {
                    cVar.mo43021a(0, 0, multiEditVideoRecordData.originVolume);
                    return;
                }
                return;
            }
            multiEditVideoRecordData.musicDuration = C47807de.m103443a(multiEditVideoRecordData.musicPath, true);
            C20347c cVar2 = this.f110646a;
            if (cVar2 != null) {
                String str = multiEditVideoRecordData.musicPath;
                C52711k.m112236a((Object) str, "recordData.musicPath");
                int a = cVar2.mo43001a(str, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicDuration, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
                C20347c cVar3 = this.f110646a;
                if (cVar3 != null) {
                    cVar3.mo43021a(a, 1, multiEditVideoRecordData.musicVolume);
                }
                if (a > 0) {
                    C20347c cVar4 = this.f110646a;
                    if (cVar4 != null) {
                        cVar4.mo43021a(0, 0, multiEditVideoRecordData.originVolume);
                    }
                }
                multiEditVideoRecordData.musicIndex = a;
            }
        }
    }

    /* renamed from: a */
    public final void mo89139a(long j, C50743d dVar) {
        C52711k.m112240b(dVar, "seekMode");
        C20347c cVar = this.f110646a;
        if (cVar != null) {
            cVar.mo42983a((int) j, dVar);
        }
    }

    /* renamed from: a */
    public final void mo89144a(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData2 != null) {
            Pair playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
            Integer num = (Integer) playInOutTime.first;
            Integer num2 = (Integer) playInOutTime.second;
            C20347c cVar = this.f110646a;
            if (cVar != null) {
                cVar.mo43080o();
            }
            C20347c cVar2 = this.f110646a;
            if (cVar2 != null) {
                cVar2.mo42992a(C43738a.m96063a(multiEditVideoRecordData2), false);
            }
            mo89146b(multiEditVideoRecordData);
            int intValue = num.intValue();
            C52711k.m112236a((Object) num2, "endTime");
            mo89141a(multiEditVideoRecordData, intValue, num2.intValue());
            C20347c cVar3 = this.f110646a;
            if (cVar3 != null) {
                cVar3.mo43019a(true);
            }
            mo89147c();
            C20347c cVar4 = this.f110646a;
            if (cVar4 != null) {
                cVar4.mo43077n();
            }
            mo89148d();
            C20347c cVar5 = this.f110646a;
            if (cVar5 != null) {
                cVar5.mo43028b(num.intValue(), num2.intValue());
            }
            C20347c cVar6 = this.f110646a;
            if (cVar6 != null) {
                cVar6.mo43087s();
            }
            mo89139a((long) num.intValue(), C50743d.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    /* renamed from: a */
    public final void mo89141a(MultiEditVideoRecordData multiEditVideoRecordData, int i, int i2) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.musicIndex != -1) {
            int i3 = i2 - i;
            if (i3 > multiEditVideoRecordData.musicDuration) {
                i3 = multiEditVideoRecordData.musicDuration;
            }
            C20347c cVar = this.f110646a;
            if (cVar != null) {
                cVar.mo42971a(multiEditVideoRecordData.musicIndex, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicTrimIn + i3, i, i + i3, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
            }
        }
    }

    /* renamed from: a */
    public final void mo89142a(MultiEditVideoRecordData multiEditVideoRecordData, int i, int i2, int i3) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.musicIndex != -1) {
            int i4 = i + multiEditVideoRecordData.musicTrimIn;
            if (i4 > multiEditVideoRecordData.musicDuration) {
                i4 %= multiEditVideoRecordData.musicDuration;
            }
            int i5 = i4;
            C20347c cVar = this.f110646a;
            if (cVar != null) {
                cVar.mo42971a(multiEditVideoRecordData.musicIndex, i5, i5 + i3, i2, i2 + i3, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
            }
        }
    }

    /* renamed from: a */
    public final void mo89143a(MultiEditVideoRecordData multiEditVideoRecordData, VideoSegment videoSegment, Pair<Integer, Integer> pair, boolean z, boolean z2) {
        boolean z3;
        C52711k.m112240b(pair, "pair");
        if (multiEditVideoRecordData != null && videoSegment != null && !C9190h.m18253a(multiEditVideoRecordData.segmentDataList)) {
            if (z || z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (multiEditVideoRecordData != null) {
                C20347c cVar = this.f110646a;
                if (cVar != null) {
                    cVar.mo43080o();
                }
                VERecordData a = C43738a.m96063a(multiEditVideoRecordData);
                Integer num = (Integer) pair.first;
                Integer num2 = (Integer) pair.second;
                if (!z3) {
                    a.mo98589a(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
                }
                C20347c cVar2 = this.f110646a;
                if (cVar2 != null) {
                    cVar2.mo42992a(a, false);
                }
                mo89146b(multiEditVideoRecordData);
                C20347c cVar3 = this.f110646a;
                if (cVar3 != null) {
                    cVar3.mo43019a(true);
                }
                mo89147c();
                C20347c cVar4 = this.f110646a;
                if (cVar4 != null) {
                    cVar4.mo43077n();
                }
                mo89148d();
                if (z3) {
                    C20347c cVar5 = this.f110646a;
                    if (cVar5 != null) {
                        C52711k.m112236a((Object) num, "startTime");
                        int intValue = num.intValue();
                        C52711k.m112236a((Object) num2, "endTime");
                        cVar5.mo43028b(intValue, num2.intValue());
                    }
                    C20347c cVar6 = this.f110646a;
                    if (cVar6 != null) {
                        C52711k.m112236a((Object) num, "startTime");
                        cVar6.mo42983a(num.intValue(), C50743d.EDITOR_SEEK_FLAG_LastSeek);
                    }
                } else {
                    C20347c cVar7 = this.f110646a;
                    if (cVar7 != null) {
                        cVar7.mo42983a(0, C50743d.EDITOR_SEEK_FLAG_LastSeek);
                    }
                }
            }
        }
    }
}
