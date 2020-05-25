package dmt.p2652av.video.p2653a;

import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.effect.C29207l;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.p2345t.C46781i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43504ap;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43440a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43443c;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43954a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.C50720o.C50745f;
import com.p683ss.android.vesdk.C50720o.C50747h;
import com.p683ss.android.vesdk.C50751p;
import com.p683ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p683ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.p683ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import com.p683ss.android.vesdk.runtime.C50765b;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52906ab;
import dmt.p2652av.video.C52977l;
import dmt.p2652av.video.C53026u;
import dmt.p2652av.video.C53028w;
import dmt.p2652av.video.C53029x;
import dmt.p2652av.video.C53030y;
import dmt.p2652av.video.VEEditorAutoStartStopArbiter;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEPreviewParams;
import java.io.File;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.a.a */
public abstract class C52885a {

    /* renamed from: q */
    public static int f131169q = 1;

    /* renamed from: r */
    public static int f131170r = 2;

    /* renamed from: t */
    private static final String f131171t = "a";

    /* renamed from: a */
    public C0198r<Boolean> f131172a;

    /* renamed from: b */
    public C0198r<AudioEffectParam> f131173b;

    /* renamed from: c */
    public ArrayList<EffectPointModel> f131174c;

    /* renamed from: d */
    public VEEditorAutoStartStopArbiter f131175d;

    /* renamed from: e */
    public Context f131176e;

    /* renamed from: f */
    protected C20347c f131177f;

    /* renamed from: g */
    protected VEPreviewParams f131178g;

    /* renamed from: h */
    public int f131179h = -1;

    /* renamed from: i */
    public int f131180i = -1;

    /* renamed from: j */
    public int f131181j = -1;

    /* renamed from: k */
    public C52977l f131182k;

    /* renamed from: l */
    C53028w f131183l;

    /* renamed from: m */
    protected List<String> f131184m;

    /* renamed from: n */
    public C31405ah f131185n;

    /* renamed from: o */
    public boolean f131186o = true;

    /* renamed from: p */
    public int f131187p;

    /* renamed from: s */
    public int f131188s;

    /* renamed from: u */
    private Executor f131189u;

    /* renamed from: v */
    private String f131190v;

    /* renamed from: a */
    public void mo110486a(SurfaceView surfaceView) {
    }

    /* renamed from: a */
    public final boolean mo110499a(C53030y yVar) {
        if (yVar.f131507a == 0 && this.f131175d != null) {
            if (this.f131175d.f131122a) {
                this.f131175d.mo110432a(false);
            } else {
                this.f131175d.mo110434b();
            }
        }
        if (yVar.f131507a == 1 && this.f131175d != null) {
            this.f131175d.mo110432a(true);
        }
        if (yVar.f131507a == 2) {
            int a = this.f131177f.mo42983a((int) yVar.f131508b, C50743d.EDITOR_SEEK_FLAG_OnGoing);
            if (a != 0) {
                StringBuilder sb = new StringBuilder("Seek failed. ret = ");
                sb.append(a);
                sb.append(" See logs for more details.");
                C32458a.m75144a(sb.toString());
            }
        }
        if (yVar.f131507a == 3) {
            final C0027j jVar = new C0027j();
            this.f131177f.mo43039b((C50711k) new C50711k() {
                public final void onCallback(int i, int i2, float f, String str) {
                    if (i == 4101) {
                        jVar.mo44a(null);
                        C52885a.this.f131177f.mo43048c((C50711k) this);
                    }
                }
            });
            int a2 = this.f131177f.mo42983a((int) yVar.f131508b, C50743d.EDITOR_SEEK_FLAG_LastSeek);
            if (a2 == 0) {
                try {
                    jVar.f77a.mo36g();
                } catch (InterruptedException unused) {
                }
            } else {
                try {
                    C50747h g = this.f131177f.mo43063g();
                    StringBuilder sb2 = new StringBuilder("Seek failed. ret = ");
                    sb2.append(a2);
                    sb2.append(" state = ");
                    sb2.append(g.ordinal());
                    C32458a.m75144a(sb2.toString());
                } catch (C50751p e) {
                    C32458a.m75148a((Throwable) e);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo110494a(VEVolumeChangeOp vEVolumeChangeOp) {
        if (vEVolumeChangeOp.mType == 0) {
            this.f131177f.mo43021a(this.f131177f.mo43013a().f127518i, this.f131177f.mo43013a().f127519j, vEVolumeChangeOp.mVolume);
        } else if (vEVolumeChangeOp.mType == 1) {
            this.f131177f.mo43021a(this.f131179h, 1, vEVolumeChangeOp.mVolume);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo110498a(C53029x xVar) {
        this.f131177f.mo42972a(this.f131179h, xVar.f131505a, xVar.f131505a + xVar.f131506b, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
        if (this.f131183l != null) {
            this.f131183l.f131502b = xVar.f131505a;
            this.f131183l.f131503c = xVar.f131505a + xVar.f131506b;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo110495a(VEPreviewMusicParams vEPreviewMusicParams) {
        if (this.f131179h != -1) {
            this.f131177f.mo43049d(this.f131179h);
        }
        if (vEPreviewMusicParams.f131134a == null) {
            return false;
        }
        this.f131183l = new C53028w();
        this.f131183l.f131502b = vEPreviewMusicParams.f131135b;
        this.f131183l.f131504d = C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop);
        if (vEPreviewMusicParams.f131137d <= 0 || Math.abs(vEPreviewMusicParams.f131136c - vEPreviewMusicParams.f131137d) < 1000) {
            int i = vEPreviewMusicParams.f131135b + vEPreviewMusicParams.f131136c;
            this.f131179h = this.f131177f.mo43001a(vEPreviewMusicParams.f131134a, vEPreviewMusicParams.f131135b, i, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
            this.f131183l.f131503c = i;
        } else {
            int i2 = vEPreviewMusicParams.f131135b + vEPreviewMusicParams.f131137d;
            this.f131179h = this.f131177f.mo43001a(vEPreviewMusicParams.f131134a, vEPreviewMusicParams.f131135b, i2, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
            this.f131183l.f131503c = i2;
        }
        this.f131183l.f131501a = this.f131179h;
        this.f131177f.mo43021a(this.f131179h, 1, vEPreviewMusicParams.f131138e);
        return false;
    }

    /* renamed from: a */
    public final void mo110487a(C43954a aVar) {
        this.f131177f.mo43030b(aVar.f111304a, this.f131179h, aVar.f111305b, aVar.f111306c, aVar.f111307d, aVar.f111308e);
    }

    /* renamed from: a */
    public void mo110489a(boolean z) {
        this.f131177f.mo42996a(z ? this.f131190v : "");
        StringBuilder sb = new StringBuilder("apply hdr enhance ");
        sb.append(z);
        C43443c.m95217a(this.f131176e, sb.toString());
    }

    /* renamed from: a */
    public void mo110490a(boolean z, boolean z2) {
        if (z2) {
            this.f131177f.mo43061f(z);
        } else {
            this.f131177f.mo43056e(z);
        }
        StringBuilder sb = new StringBuilder("apply light enhance ");
        sb.append(z);
        sb.append(z2 ? "is" : "is not");
        sb.append(" preview");
        C43443c.m95217a(this.f131176e, sb.toString());
    }

    /* renamed from: a */
    public final boolean mo110497a(C53026u uVar) {
        ArrayList<EffectPointModel> arrayList = this.f131174c;
        long j = uVar.f131488b;
        if (uVar.f131492f == 0) {
            C20347c cVar = this.f131177f;
            C52711k.m112240b(cVar, "editor");
            C52711k.m112240b(uVar, "op");
            uVar.f131487a = new int[]{cVar.mo42985a((int) uVar.f131488b, uVar.f131495i)};
            EffectPointModel effectPointModel = new EffectPointModel();
            effectPointModel.setType(1);
            effectPointModel.setSelectedColor(uVar.f131494h);
            effectPointModel.setIndex(uVar.f131487a[0]);
            effectPointModel.setResDir(uVar.f131495i);
            effectPointModel.setKey(uVar.f131496j);
            effectPointModel.setFromEnd(uVar.f131493g);
            effectPointModel.setStartPoint((int) j);
            effectPointModel.setUiStartPoint((int) uVar.f131490d);
            effectPointModel.setUiEndPoint((int) uVar.f131491e);
            effectPointModel.setName(uVar.f131497k);
            effectPointModel.setDuration(uVar.f131498l);
            effectPointModel.setCategory(uVar.f131499m);
            effectPointModel.setExtra(uVar.f131500n);
            arrayList.add(effectPointModel);
            return true;
        } else if (uVar.f131492f == 5) {
            m112522a(uVar, arrayList);
            return true;
        } else {
            if (uVar.f131492f == 6) {
                if (arrayList.isEmpty()) {
                    return false;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (C29207l.m68793b(((EffectPointModel) arrayList.get(size)).getCategory())) {
                        this.f131177f.mo43035b(new int[]{((EffectPointModel) arrayList.get(size)).getIndex()});
                        ((EffectPointModel) arrayList.get(size)).setFromEnd(uVar.f131493g);
                        ((EffectPointModel) arrayList.get(size)).setStartPoint((int) uVar.f131488b);
                        ((EffectPointModel) arrayList.get(size)).setEndPoint((int) uVar.f131489c);
                        ((EffectPointModel) arrayList.get(size)).setUiStartPoint((int) uVar.f131490d);
                        ((EffectPointModel) arrayList.get(size)).setUiEndPoint((int) uVar.f131491e);
                        C20347c cVar2 = this.f131177f;
                        EffectPointModel effectPointModel2 = (EffectPointModel) arrayList.get(size);
                        C52711k.m112240b(cVar2, "editor");
                        C52711k.m112240b(effectPointModel2, "model");
                        uVar.f131487a = cVar2.mo43024a(new int[]{effectPointModel2.getStartPoint()}, new int[]{effectPointModel2.getEndPoint()}, new String[]{effectPointModel2.getResDir()});
                        ((EffectPointModel) arrayList.get(size)).setIndex(uVar.f131487a[0]);
                        return true;
                    }
                }
            } else if (uVar.f131492f == 1) {
                EffectPointModel effectPointModel3 = (EffectPointModel) arrayList.get(arrayList.size() - 1);
                this.f131177f.mo43059f(effectPointModel3.getIndex(), (int) uVar.f131488b);
                effectPointModel3.setEndPoint((int) j);
                effectPointModel3.setUiEndPoint((int) uVar.f131491e);
            } else if (uVar.f131492f == 2 || uVar.f131492f == 7) {
                m112521a(uVar.f131487a[0], arrayList);
            } else if (uVar.f131492f == 3) {
                this.f131177f.mo43035b(uVar.f131487a);
                arrayList.clear();
            } else if (uVar.f131492f == 4) {
                this.f131177f.mo43035b(uVar.f131487a);
                for (int i = 0; i < uVar.f131487a.length; i++) {
                    arrayList.remove(arrayList.size() - 1);
                }
            } else if (uVar.f131492f == 8) {
                m112521a(uVar.f131487a[0], arrayList);
                m112522a(uVar, arrayList);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo110488a(C52977l lVar, C52977l lVar2) {
        boolean z = lVar2.f131390e;
        boolean z2 = lVar2.f131391f;
        if ("apply".equals(lVar2.f131389d)) {
            this.f131182k = lVar2;
            if (lVar2.f131392g != null) {
                Callable d = m112525d(lVar, lVar2, z, z2);
                C0011g a = m112520a(lVar2);
                if (this.f131186o) {
                    C0013i.m18a(d, m112523b()).mo20a(a, C0013i.f25b);
                } else {
                    C0013i.m22b(d).mo20a(a, C0013i.f25b);
                }
            }
        } else if ("clear".equals(lVar2.f131389d)) {
            this.f131182k = null;
            C52887b bVar = new C52887b(this, lVar, lVar2, z, z2);
            C0013i.m18a((Callable<TResult>) bVar, m112523b()).mo20a((C0011g<TResult, TContinuationResult>) new C52888c<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final boolean mo110496a(C52906ab abVar, C52906ab abVar2) {
        boolean z;
        boolean z2 = true;
        if (this.f131175d != null) {
            z = this.f131175d.f131122a;
            if (!z) {
                this.f131175d.mo110432a(true);
            }
        } else {
            z = false;
        }
        if (abVar != null) {
            if ("1".equals(abVar.f131241a)) {
                this.f131172a.setValue(Boolean.valueOf(false));
            } else if ("2".equals(abVar.f131241a)) {
                this.f131177f.mo43090t(abVar.f131245e);
            } else if ("3".equals(abVar.f131241a)) {
                this.f131177f.mo43090t(abVar.f131245e);
            }
        }
        if (abVar2 != null && "1".equals(abVar2.f131241a)) {
            this.f131172a.setValue(Boolean.valueOf(true));
        } else {
            if (abVar2 != null && "2".equals(abVar2.f131241a)) {
                int i = (int) abVar2.f131242b;
                int i2 = (int) (abVar2.f131243c - abVar2.f131242b);
                VERepeatFilterParam vERepeatFilterParam = new VERepeatFilterParam();
                vERepeatFilterParam.seqIn = i;
                vERepeatFilterParam.repeatTime = abVar2.f131244d;
                vERepeatFilterParam.repeatDuration = i2;
                vERepeatFilterParam.timeMode = C50745f.EDITOR_SLOMO_MODE.ordinal();
                int a = this.f131177f.mo42974a(0, 0, (VEBaseFilterParam) vERepeatFilterParam);
                if (a >= 0) {
                    abVar2.f131245e = a;
                }
            } else {
                if (abVar2 == null || !"3".equals(abVar2.f131241a)) {
                    z2 = false;
                }
                if (z2) {
                    int i3 = (int) abVar2.f131242b;
                    int i4 = (int) (abVar2.f131243c - abVar2.f131242b);
                    VESlowMotionFilterParam vESlowMotionFilterParam = new VESlowMotionFilterParam();
                    vESlowMotionFilterParam.seqIn = i3;
                    vESlowMotionFilterParam.slowMotionDuration = i4;
                    vESlowMotionFilterParam.slowMotionSpeed = 0.5f;
                    vESlowMotionFilterParam.timeMode = C50745f.EDITOR_SLOMO_MODE.ordinal();
                    int a2 = this.f131177f.mo42974a(0, 0, (VEBaseFilterParam) vESlowMotionFilterParam);
                    if (a2 >= 0) {
                        abVar2.f131245e = a2;
                    }
                }
            }
        }
        if (this.f131183l != null && this.f131183l.f131501a >= 0) {
            this.f131177f.mo42972a(this.f131183l.f131501a, this.f131183l.f131502b, this.f131183l.f131503c, this.f131183l.f131504d);
        }
        if (!z && this.f131175d != null) {
            this.f131175d.mo110432a(false);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo110492a(InfoStickerModel infoStickerModel) {
        String sb;
        int a;
        if (infoStickerModel == null || C9414h.m18630a(infoStickerModel.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            if (stickerItemModel != null && !stickerItemModel.isSubtitle() && !stickerItemModel.isSubtitleRule()) {
                if (C48016e.m103944b(stickerItemModel.path)) {
                    sb = stickerItemModel.path;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(infoStickerModel.infoStickerDraftDir);
                    sb2.append(File.separator);
                    sb2.append(new File(stickerItemModel.path).getName());
                    sb = sb2.toString();
                }
                String str = sb;
                if (!C48016e.m103944b(str)) {
                    StringBuilder sb3 = new StringBuilder("infoSticker not exist ");
                    sb3.append(stickerItemModel);
                    C32458a.m75148a((Throwable) new Exception(sb3.toString()));
                } else {
                    if (!stickerItemModel.isImageStickerLayer) {
                        a = this.f131177f.mo43006a(str, TextUtils.isEmpty(stickerItemModel.extra) ? null : new String[]{stickerItemModel.extra});
                    } else if (this.f131178g == null || this.f131178g.canvasWidth <= 0 || this.f131178g.canvasHeight <= 0) {
                        a = this.f131177f.mo42998a(str, 0.0f, 0.0f, 1.0f, 1.0f);
                    } else {
                        a = this.f131177f.mo43034b(str, 0.0f, 0.0f, 1.0f, new BigDecimal((double) ((((float) this.f131178g.canvasHeight) * 1.0f) / ((float) this.f131178g.canvasWidth))).setScale(4, 4).floatValue());
                    }
                    int i = a;
                    StringBuilder sb4 = new StringBuilder("changeInfoSticker id = ");
                    sb4.append(i);
                    C50203g.m108363d(sb4.toString());
                    if (i != -1) {
                        if (!stickerItemModel.isPin() || !C50200d.m108346a(stickerItemModel.pinAlgorithmFile)) {
                            this.f131177f.mo42969a(i, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                            this.f131177f.mo43026b(i, stickerItemModel.scale);
                            this.f131177f.mo42968a(i, -stickerItemModel.rotateAngle);
                            this.f131177f.mo43029b(i, stickerItemModel.startTime, stickerItemModel.endTime);
                            this.f131177f.mo43055e(i, stickerItemModel.layerWeight);
                        } else {
                            this.f131177f.mo43029b(i, stickerItemModel.startTime, stickerItemModel.endTime);
                            this.f131177f.mo43055e(i, stickerItemModel.layerWeight);
                            ByteBuffer a2 = C43504ap.m95365a(stickerItemModel.pinAlgorithmFile);
                            if (a2 != null) {
                                this.f131177f.mo42986a(i, a2);
                                if (this.f131187p == f131169q) {
                                    this.f131177f.mo43078n(this.f131188s);
                                } else if (this.f131187p == f131170r) {
                                    this.f131177f.mo43078n(1);
                                }
                            }
                        }
                        if (stickerItemModel.isLyric()) {
                            this.f131177f.mo42977a(i, 0, stickerItemModel.mLyricInfo);
                            if (!TextUtils.isEmpty(stickerItemModel.mLyricFontPath)) {
                                this.f131177f.mo43031b(i, stickerItemModel.mLyricFontPath);
                            }
                            this.f131177f.mo43062g(i, stickerItemModel.mLyricColor);
                            this.f131177f.mo43030b(i, this.f131179h, stickerItemModel.mLyricInPoint, stickerItemModel.mLyricStartTime, stickerItemModel.mLyricOutPoint, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo110493a(InfoStickerModel infoStickerModel, HashMap<Integer, StickerItemModel> hashMap) {
        boolean z = false;
        if (infoStickerModel == null || C9414h.m18630a(infoStickerModel.stickers)) {
            return false;
        }
        hashMap.clear();
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            if (stickerItemModel != null && (stickerItemModel.isSubtitle() || stickerItemModel.isSubtitleRule())) {
                z = true;
                int u = this.f131177f.mo43091u();
                if (u != -1) {
                    stickerItemModel.f91605id = u;
                    hashMap.put(Integer.valueOf(u), stickerItemModel);
                    this.f131177f.mo42969a(u, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                    this.f131177f.mo43026b(u, stickerItemModel.scale);
                    this.f131177f.mo42968a(u, -stickerItemModel.rotateAngle);
                    this.f131177f.mo43029b(u, stickerItemModel.startTime, stickerItemModel.endTime);
                    this.f131177f.mo43055e(u, stickerItemModel.layerWeight);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo110491a(C31459g gVar) {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableFilterIntensityJust)) {
            C31405ah ahVar = this.f131185n;
            C20347c cVar = this.f131177f;
            cVar.getClass();
            float a = C31460h.m73279a(gVar, ahVar, (C31406ai) new C52891f(cVar));
            if (a == -1.0f) {
                a = 0.8f;
            }
            this.f131177f.mo43033b(C31460h.m73281a(gVar), a);
        } else {
            this.f131177f.mo42997a(C31460h.m73281a(gVar), 1.0f);
        }
        return false;
    }

    /* renamed from: b */
    private Executor m112523b() {
        if (this.f131189u == null) {
            this.f131189u = C52894i.m112550a();
        }
        return this.f131189u;
    }

    /* renamed from: a */
    public final int mo110481a() {
        if (this.f131177f != null) {
            this.f131177f.mo42966A();
        }
        return 0;
    }

    public C52885a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C43440a.f109827b);
        sb.append(File.separator);
        this.f131190v = sb.toString();
    }

    /* renamed from: a */
    private C0011g<Boolean, Void> m112520a(C52977l lVar) {
        return new C52889d(this, lVar);
    }

    /* renamed from: a */
    public final float mo110480a(String str) {
        return this.f131177f.mo43025b(str);
    }

    /* renamed from: a */
    public final int mo110483a(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam.getNeedDel()) {
            this.f131177f.mo43049d(audioRecorderParam.getAudioRecordIndex());
            audioRecorderParam.setNeedDel(false);
            audioRecorderParam.setAudioRecordIndex(-2);
            this.f131181j = -1;
            return -2;
        } else if (!audioRecorderParam.hasRecord()) {
            return -1;
        } else {
            if (audioRecorderParam.getAudioRecordIndex() >= 0) {
                this.f131180i = audioRecorderParam.getAudioRecordIndex();
                return this.f131180i;
            }
            this.f131180i = this.f131177f.mo43001a(audioRecorderParam.getAudioUrl(), 0, this.f131177f.mo43071k(), false);
            if (this.f131182k != null && this.f131181j == -1) {
                mo110488a(this.f131182k, this.f131182k);
            }
            audioRecorderParam.setAudioRecordIndex(this.f131180i);
            return this.f131180i;
        }
    }

    /* renamed from: a */
    private void m112521a(int i, ArrayList<EffectPointModel> arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((EffectPointModel) arrayList.get(i2)).getIndex() == i) {
                this.f131177f.mo43035b(new int[]{i});
                arrayList.remove(i2);
                return;
            }
        }
    }

    /* renamed from: a */
    private void m112522a(C53026u uVar, ArrayList<EffectPointModel> arrayList) {
        C46781i.m101591a(this.f131177f, uVar);
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setType(1);
        effectPointModel.setSelectedColor(uVar.f131494h);
        effectPointModel.setIndex(uVar.f131487a[0]);
        effectPointModel.setResDir(uVar.f131495i);
        effectPointModel.setKey(uVar.f131496j);
        effectPointModel.setFromEnd(uVar.f131493g);
        effectPointModel.setStartPoint((int) uVar.f131488b);
        effectPointModel.setEndPoint((int) uVar.f131489c);
        effectPointModel.setUiStartPoint((int) uVar.f131490d);
        effectPointModel.setUiEndPoint((int) uVar.f131491e);
        effectPointModel.setName(uVar.f131497k);
        effectPointModel.setCategory(uVar.f131499m);
        effectPointModel.setExtra(uVar.f131500n);
        arrayList.add(effectPointModel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo110485a(C52977l lVar, C0013i iVar) throws Exception {
        if (((Boolean) iVar.mo34e()).booleanValue()) {
            AudioEffectParam audioEffectParam = lVar.f131392g;
            if (audioEffectParam != null) {
                audioEffectParam.setPreprocessResult(null);
                this.f131173b.setValue(audioEffectParam);
            }
        } else if (lVar.f131392g.getShowErrorToast()) {
            C10691a.m21542b((Context) C39629l.m88233b(), (int) R.string.ou).mo19066a();
        }
        return null;
    }

    /* renamed from: a */
    public int mo110482a(Context context, C20347c cVar, VEPreviewParams vEPreviewParams) {
        this.f131176e = context;
        this.f131177f = cVar;
        this.f131178g = vEPreviewParams;
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo110500b(C52977l lVar, C52977l lVar2, boolean z, boolean z2) throws Exception {
        m112524c(lVar, lVar2, z, z2);
        return null;
    }

    /* renamed from: d */
    private Callable<Boolean> m112525d(C52977l lVar, C52977l lVar2, boolean z, boolean z2) {
        C52890e eVar = new C52890e(this, lVar, lVar2, z, z2);
        return eVar;
    }

    /* renamed from: c */
    private void m112524c(C52977l lVar, C52977l lVar2, boolean z, boolean z2) {
        int i;
        if (lVar != null) {
            if (z) {
                i = lVar.f131387b.get();
            } else {
                i = lVar.f131386a.get();
            }
            int[] iArr = z2 ? new int[]{lVar.f131388c.get()} : lVar.f131388c.get() > 0 ? new int[]{i, lVar.f131388c.get()} : new int[]{i};
            this.f131177f.mo43044c(iArr);
            if (z) {
                AtomicInteger atomicInteger = lVar.f131386a;
                C52711k.m112240b(atomicInteger, "<set-?>");
                lVar2.f131386a = atomicInteger;
            } else {
                AtomicInteger atomicInteger2 = lVar.f131387b;
                C52711k.m112240b(atomicInteger2, "<set-?>");
                lVar2.f131387b = atomicInteger2;
            }
        }
        if (z) {
            lVar2.f131387b.set(-1);
        } else {
            lVar2.f131386a.set(-1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo110484a(C52977l lVar, C52977l lVar2, boolean z, boolean z2) throws Exception {
        int i;
        int trackType;
        int trackIndex;
        m112524c(lVar, lVar2, z, z2);
        C50765b a = this.f131177f.mo43013a();
        AudioEffectParam audioEffectParam = lVar2.f131392g;
        boolean z3 = false;
        if (audioEffectParam == null || !C50200d.m108346a(audioEffectParam.getEffectPath())) {
            return Boolean.valueOf(false);
        }
        int i2 = -1;
        if (!z2) {
            if (z) {
                trackType = a.f127519j;
            } else {
                trackType = audioEffectParam.getTrackType();
            }
            int i3 = trackType;
            if (z) {
                trackIndex = a.f127518i;
            } else {
                trackIndex = audioEffectParam.getTrackIndex();
            }
            int i4 = trackIndex;
            C20347c cVar = this.f131177f;
            String effectPath = audioEffectParam.getEffectPath();
            C43359c.m95084a();
            i = cVar.mo42978a(i3, i4, effectPath, C43359c.m95087a(audioEffectParam.getEffectPath()), audioEffectParam.getSeqIn(), audioEffectParam.getSeqOut(), C52892g.f131207a);
            if (z) {
                lVar2.f131387b.set(i);
            } else {
                lVar2.f131386a.set(i);
            }
        } else {
            i = -1;
        }
        if (this.f131180i >= 0) {
            C20347c cVar2 = this.f131177f;
            int i5 = this.f131180i;
            String effectPath2 = audioEffectParam.getEffectPath();
            C43359c.m95084a();
            i2 = cVar2.mo42978a(1, i5, effectPath2, C43359c.m95087a(audioEffectParam.getEffectPath()), audioEffectParam.getSeqIn(), audioEffectParam.getSeqOut(), C52893h.f131208a);
            this.f131181j = i2;
            lVar2.f131388c.set(i2);
        }
        if (i >= 0 || (this.f131180i >= 0 && i2 >= 0)) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
