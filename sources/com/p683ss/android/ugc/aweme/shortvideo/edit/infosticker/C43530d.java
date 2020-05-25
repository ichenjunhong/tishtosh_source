package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.StickerHintTextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.C44858b;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2341c.C46669a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.C50751p;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.d */
public final class C43530d {

    /* renamed from: a */
    public List<C43501am> f110107a = new ArrayList();

    /* renamed from: b */
    public C43501am f110108b;

    /* renamed from: c */
    public int f110109c;

    /* renamed from: d */
    InfoStickerEditView f110110d;

    /* renamed from: e */
    C20347c f110111e;

    /* renamed from: f */
    public C43510b f110112f;

    /* renamed from: g */
    public C46669a f110113g;

    /* renamed from: h */
    public C44858b f110114h;

    /* renamed from: i */
    StickerHintTextViewModel f110115i;

    /* renamed from: j */
    FragmentActivity f110116j;

    /* renamed from: k */
    public VideoPublishEditModel f110117k;

    /* renamed from: l */
    public float[] f110118l;

    /* renamed from: m */
    public C23522b<C43501am> f110119m;

    /* renamed from: n */
    private final float f110120n = 0.5f;

    /* renamed from: o */
    private final float f110121o = 0.5f;

    /* renamed from: p */
    private final float f110122p = 0.5f;

    /* renamed from: q */
    private final float f110123q = 0.75f;

    /* renamed from: a */
    public final void mo88598a(C43501am amVar, float f) {
        if (!amVar.f110020x && f != 0.0f) {
            amVar.f110003d.rotateAngle += f;
            this.f110111e.mo42968a(amVar.f110003d.f91605id, -amVar.f110003d.rotateAngle);
            amVar.mo88505a(f);
        }
    }

    /* renamed from: a */
    public final void mo88599a(C43501am amVar, float f, float f2) {
        if (amVar.f110020x) {
            if (!amVar.f110003d.isSubtitleRule()) {
                for (C43501am amVar2 : this.f110107a) {
                    if (amVar2.f110020x) {
                        amVar2.f110003d.currentOffsetY += f2 / ((float) this.f110110d.f109929d);
                        this.f110111e.mo42969a(amVar2.f110003d.f91605id, amVar2.f110003d.currentOffsetX, amVar2.f110003d.currentOffsetY);
                        amVar2.mo88506a(0.0f, f2);
                    }
                }
            }
        } else if (amVar.f110003d.isLyric()) {
            float f3 = f / ((float) this.f110110d.f109928c);
            float f4 = f2 / ((float) this.f110110d.f109929d);
            float[] fArr = new float[2];
            this.f110111e.mo43032b(amVar.f110003d.f91605id, fArr);
            amVar.f110003d.currentOffsetX = fArr[0];
            amVar.f110003d.currentOffsetY = fArr[1];
            this.f110111e.mo43027b(amVar.f110003d.f91605id, amVar.f110003d.currentOffsetX, amVar.f110003d.currentOffsetY);
            float[] fArr2 = this.f110118l;
            fArr2[0] = fArr2[0] + f3;
            float[] fArr3 = this.f110118l;
            fArr3[1] = fArr3[1] + f4;
            this.f110111e.mo42969a(amVar.f110003d.f91605id, this.f110118l[0], this.f110118l[1]);
            amVar.mo88506a(f, f2);
        } else {
            amVar.f110003d.currentOffsetX += f / ((float) this.f110110d.f109928c);
            amVar.f110003d.currentOffsetY += f2 / ((float) this.f110110d.f109929d);
            this.f110111e.mo42969a(amVar.f110003d.f91605id, amVar.f110003d.currentOffsetX, amVar.f110003d.currentOffsetY);
            amVar.mo88506a(f, f2);
        }
    }

    /* renamed from: a */
    public final boolean mo88603a(C43501am amVar, int i) {
        return amVar.f110020x ? i >= amVar.f110003d.startTime && i <= amVar.f110003d.endTime : (i >= amVar.f110003d.startTime && i <= amVar.f110003d.endTime) || amVar.equals(this.f110108b);
    }

    /* renamed from: a */
    public final void mo88602a(boolean z) {
        if (!C9414h.m18630a(this.f110107a)) {
            Iterator it = this.f110107a.iterator();
            while (it.hasNext()) {
                C43501am amVar = (C43501am) it.next();
                if ((z && amVar.f110020x) || (!z && amVar.f110003d.isSubtitle())) {
                    this.f110111e.mo43058f(amVar.f110003d.f91605id);
                    SubtitleModule.m97952aa().remove(Integer.valueOf(amVar.f110003d.f91605id));
                    it.remove();
                    if (this.f110112f != null) {
                        this.f110112f.mo88528b(amVar.f110003d);
                    }
                }
            }
            this.f110108b = null;
        }
    }

    /* renamed from: a */
    public final void mo88600a(C43501am amVar, int i, int i2, boolean z) {
        if (amVar != null) {
            amVar.f110003d.startTime = i;
            amVar.f110003d.endTime = i2;
            if (z) {
                int r = this.f110111e.mo43086r(i);
                int r2 = this.f110111e.mo43086r(i2);
                amVar.f110003d.uiStartTime = r;
                amVar.f110003d.uiEndTime = r2;
            }
            this.f110111e.mo43029b(amVar.f110003d.f91605id, i, i2);
        }
    }

    /* renamed from: c */
    public final void mo88607c() {
        for (C43501am amVar : this.f110107a) {
            this.f110111e.mo43041c(amVar.f110003d.f91605id, 0.3137255f);
        }
    }

    /* renamed from: e */
    public final void mo88611e() {
        for (C43501am amVar : this.f110107a) {
            this.f110111e.mo43041c(amVar.f110003d.f91605id, 1.0f);
        }
    }

    /* renamed from: a */
    public final void mo88595a() {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities) && this.f110115i != null) {
            this.f110115i.mo90441a().postValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: b */
    public final void mo88604b() {
        if (this.f110108b != null) {
            if (!this.f110108b.f110020x) {
                this.f110111e.mo43029b(this.f110108b.f110003d.f91605id, this.f110108b.mo88515d(), this.f110108b.mo88516e());
                this.f110108b.f110004e = false;
            }
            this.f110108b = null;
        }
    }

    /* renamed from: d */
    public final void mo88609d() {
        for (C43501am amVar : this.f110107a) {
            if (!amVar.f110020x) {
                this.f110111e.mo43041c(amVar.f110003d.f91605id, 0.3137255f);
            }
        }
    }

    /* renamed from: b */
    public final void mo88605b(C43501am amVar) {
        if (amVar != null && !amVar.f110020x) {
            this.f110111e.mo43029b(amVar.f110003d.f91605id, 0, this.f110109c);
        }
    }

    /* renamed from: c */
    public final void mo88608c(C43501am amVar) {
        if (amVar != null && this.f110107a.contains(amVar) && !amVar.f110020x) {
            this.f110111e.mo43029b(amVar.f110003d.f91605id, amVar.mo88515d(), amVar.mo88516e());
        }
    }

    /* renamed from: e */
    public final boolean mo88612e(C43501am amVar) {
        if (!amVar.f110003d.isPin() || this.f110111e.mo43084q(amVar.f110003d.f91605id)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo88610d(C43501am amVar) {
        if (!(amVar == null || amVar.f110003d.isSubtitleRule() || amVar.f110003d.layerWeight == C43502an.m95363c())) {
            amVar.f110003d.updateLayerWeight(C43502an.m95362b());
            this.f110111e.mo43055e(amVar.f110003d.f91605id, amVar.f110003d.layerWeight);
            if (this.f110119m != null) {
                this.f110119m.mo48682a(amVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88596a(com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r1 == 0) goto L_0x02d5
            java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r2 = r1.stickers
            boolean r2 = com.bytedance.common.utility.C9414h.m18630a(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x02d5
        L_0x0010:
            java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r2 = r1.stickers
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L_0x0018:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0292
            java.lang.Object r5 = r2.next()
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r5 = (com.p683ss.android.ugc.aweme.infosticker.StickerItemModel) r5
            int r6 = r5.layerWeight
            int r7 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43502an.f110023b
            if (r6 == r7) goto L_0x0032
            int r7 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43502an.f110022a
            int r6 = java.lang.Math.max(r6, r7)
            com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43502an.f110022a = r6
        L_0x0032:
            boolean r6 = r5.isInfoSticker()
            if (r6 == 0) goto L_0x0018
            java.lang.String r6 = r1.infoStickerDraftDir
            boolean r7 = r5.isSubtitle()
            r8 = 1
            r9 = 0
            if (r7 != 0) goto L_0x0152
            boolean r7 = r5.isSubtitleRule()
            if (r7 == 0) goto L_0x004a
            goto L_0x0152
        L_0x004a:
            java.lang.String r7 = r5.path
            boolean r10 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r7)
            if (r10 != 0) goto L_0x006f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = java.io.File.separator
            r10.append(r6)
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            java.lang.String r6 = r6.getName()
            r10.append(r6)
            java.lang.String r7 = r10.toString()
        L_0x006f:
            boolean r6 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r7)
            if (r6 != 0) goto L_0x0081
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = "infoSticker not exist in edit"
            r6.<init>(r7)
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r6)
            goto L_0x0184
        L_0x0081:
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            java.lang.String r10 = r5.extra
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x008d
            r10 = r3
            goto L_0x0093
        L_0x008d:
            java.lang.String[] r10 = new java.lang.String[r8]
            java.lang.String r11 = r5.extra
            r10[r9] = r11
        L_0x0093:
            int r6 = r6.mo43006a(r7, r10)
            r5.f91605id = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "veAddInfoSticker id = "
            r6.<init>(r10)
            int r10 = r5.f91605id
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98973d(r6)
            int r6 = r5.f91605id
            if (r6 >= 0) goto L_0x0106
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "restore infoSticker failed: "
            r6.<init>(r10)
            int r10 = r5.f91605id
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r6)
            java.lang.String r6 = "info_sticker"
            com.ss.android.ugc.aweme.app.f.c r10 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r11 = "event"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "restore_failed: "
            r12.<init>(r13)
            int r13 = r5.f91605id
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.ss.android.ugc.aweme.app.f.c r10 = r10.mo47824a(r11, r12)
            java.lang.String r11 = "user_info"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "path: "
            r12.<init>(r13)
            r12.append(r7)
            java.lang.String r7 = " extra: "
            r12.append(r7)
            java.lang.String r7 = r5.extra
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            com.ss.android.ugc.aweme.app.f.c r7 = r10.mo47824a(r11, r7)
            org.json.JSONObject r7 = r7.mo47825b()
            com.p683ss.android.ugc.aweme.base.C23569o.m57779a(r6, r7)
            goto L_0x0184
        L_0x0106:
            boolean r6 = r5.isPin()
            if (r6 == 0) goto L_0x011f
            java.lang.String r6 = r5.pinAlgorithmFile
            boolean r6 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r6)
            if (r6 == 0) goto L_0x011f
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.f r6 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.f
            r6.<init>(r0, r5)
            java.util.concurrent.ExecutorService r7 = p001a.C0013i.f24a
            p001a.C0013i.m18a(r6, r7)
            goto L_0x013d
        L_0x011f:
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r7 = r5.f91605id
            float r10 = r5.rotateAngle
            float r10 = -r10
            r6.mo42968a(r7, r10)
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r7 = r5.f91605id
            float r10 = r5.scale
            r6.mo43026b(r7, r10)
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r7 = r5.f91605id
            float r10 = r5.currentOffsetX
            float r11 = r5.currentOffsetY
            r6.mo42969a(r7, r10, r11)
        L_0x013d:
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r7 = r5.f91605id
            int r10 = r5.startTime
            int r11 = r5.endTime
            r6.mo43029b(r7, r10, r11)
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r7 = r5.f91605id
            int r10 = r5.layerWeight
            r6.mo43055e(r7, r10)
            goto L_0x01b8
        L_0x0152:
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r6 = r6.mo43091u()
            r5.f91605id = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "veAddInfoSticker subtitle id = "
            r6.<init>(r7)
            int r7 = r5.f91605id
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98973d(r6)
            int r6 = r5.f91605id
            if (r6 >= 0) goto L_0x0186
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "restore subtitle failed: "
            r6.<init>(r7)
            int r7 = r5.f91605id
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r6)
        L_0x0184:
            r6 = 0
            goto L_0x01b9
        L_0x0186:
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r7 = r5.f91605id
            float r10 = r5.currentOffsetX
            float r11 = r5.currentOffsetY
            r6.mo42969a(r7, r10, r11)
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r7 = r5.f91605id
            float r10 = r5.scale
            r6.mo43026b(r7, r10)
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r7 = r5.f91605id
            float r10 = r5.rotateAngle
            float r10 = -r10
            r6.mo42968a(r7, r10)
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r7 = r5.f91605id
            int r10 = r5.startTime
            int r11 = r5.endTime
            r6.mo43029b(r7, r10, r11)
            com.ss.android.ugc.asve.c.c r6 = r0.f110111e
            int r7 = r5.f91605id
            int r10 = r5.layerWeight
            r6.mo43055e(r7, r10)
        L_0x01b8:
            r6 = 1
        L_0x01b9:
            if (r6 != 0) goto L_0x01c7
            if (r4 != 0) goto L_0x01c2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01c2:
            r4.add(r5)
            goto L_0x0018
        L_0x01c7:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r6 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r0.f110110d
            android.content.Context r7 = r7.getContext()
            r6.<init>(r7, r5, r0)
            boolean r7 = r5.isSubtitle()
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r7 != 0) goto L_0x021d
            boolean r7 = r5.isSubtitleRule()
            if (r7 == 0) goto L_0x01e1
            goto L_0x021d
        L_0x01e1:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r0.f110110d
            int r11 = r7.f109928c
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r0.f110110d
            int r12 = r7.f109929d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r0.f110110d
            int r13 = r7.f109926a
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r0.f110110d
            int r14 = r7.f109927b
            r15 = 1056964608(0x3f000000, float:0.5)
            r16 = 1056964608(0x3f000000, float:0.5)
            r10 = r6
            r10.mo88509a(r11, r12, r13, r14, r15, r16)
            float r7 = r5.scale
            r6.mo88511b(r7)
            float r7 = r5.currentOffsetX
            float r7 = r7 - r17
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r8 = r0.f110110d
            int r8 = r8.f109928c
            float r8 = (float) r8
            float r7 = r7 * r8
            float r8 = r5.currentOffsetY
            float r8 = r8 - r17
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r10 = r0.f110110d
            int r10 = r10.f109929d
            float r10 = (float) r10
            float r8 = r8 * r10
            r6.mo88506a(r7, r8)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am> r7 = r0.f110107a
            r7.add(r6)
            goto L_0x025b
        L_0x021d:
            r6.f110020x = r8
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r0.f110110d
            int r11 = r7.f109928c
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r0.f110110d
            int r12 = r7.f109929d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r0.f110110d
            int r13 = r7.f109926a
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r0.f110110d
            int r14 = r7.f109927b
            r15 = 1056964608(0x3f000000, float:0.5)
            r16 = 1061158912(0x3f400000, float:0.75)
            r10 = r6
            r10.mo88509a(r11, r12, r13, r14, r15, r16)
            float r7 = r5.scale
            r6.mo88511b(r7)
            float r7 = r5.currentOffsetX
            float r7 = r7 - r17
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r8 = r0.f110110d
            int r8 = r8.f109928c
            float r8 = (float) r8
            float r7 = r7 * r8
            float r8 = r5.currentOffsetY
            r10 = 1061158912(0x3f400000, float:0.75)
            float r8 = r8 - r10
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r10 = r0.f110110d
            int r10 = r10.f109929d
            float r10 = (float) r10
            float r8 = r8 * r10
            r6.mo88506a(r7, r8)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am> r7 = r0.f110107a
            r7.add(r6)
        L_0x025b:
            boolean r7 = r5.isLyric()
            if (r7 == 0) goto L_0x0018
            com.ss.android.ugc.asve.c.c r7 = r0.f110111e
            int r8 = r5.f91605id
            java.lang.String r10 = r5.mLyricInfo
            r7.mo42977a(r8, r9, r10)
            java.lang.String r7 = r5.mLyricFontPath
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x027b
            com.ss.android.ugc.asve.c.c r7 = r0.f110111e
            int r8 = r5.f91605id
            java.lang.String r9 = r5.mLyricFontPath
            r7.mo43031b(r8, r9)
        L_0x027b:
            com.ss.android.ugc.asve.c.c r7 = r0.f110111e
            int r8 = r5.f91605id
            int r9 = r5.mLyricColor
            r7.mo43062g(r8, r9)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r0.f110110d
            r7.setLyricItem(r6)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r6 = r0.f110110d
            int r5 = r5.mLyricColor
            r6.setDefaultColor(r5)
            goto L_0x0018
        L_0x0292:
            boolean r2 = com.bytedance.common.utility.C9414h.m18631b(r4)
            if (r2 == 0) goto L_0x02d4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "restore info stickers error: "
            r2.<init>(r3)
            int r3 = r4.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98971b(r2)
            java.util.Iterator r2 = r4.iterator()
        L_0x02b1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02d4
            java.lang.Object r3 = r2.next()
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r3 = (com.p683ss.android.ugc.aweme.infosticker.StickerItemModel) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "remove error sticker "
            r4.<init>(r5)
            int r5 = r3.f91605id
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98971b(r4)
            r1.removeSticker(r3)
            goto L_0x02b1
        L_0x02d4:
            return
        L_0x02d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43530d.mo88596a(com.ss.android.ugc.aweme.infosticker.InfoStickerModel):void");
    }

    /* renamed from: a */
    public final void mo88597a(C43501am amVar) {
        if (amVar != null) {
            if (!amVar.f110020x) {
                this.f110111e.mo43058f(amVar.f110003d.f91605id);
                this.f110107a.remove(amVar);
                this.f110108b = null;
                if (this.f110112f != null) {
                    this.f110112f.mo88528b(amVar.f110003d);
                }
            } else if (!amVar.f110003d.isSubtitleRule()) {
                mo88602a(true);
            }
        }
    }

    /* renamed from: a */
    public static int m95498a(C43501am amVar, C43501am amVar2) {
        return amVar.f110003d.layerWeight - amVar2.f110003d.layerWeight;
    }

    /* renamed from: a */
    public final void mo88601a(C43501am amVar, boolean z) {
        amVar.f110004e = amVar.mo88508a();
        this.f110108b = amVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C43501am mo88593a(int i, StickerItemModel stickerItemModel) {
        C43501am amVar = new C43501am(this.f110110d.getContext(), stickerItemModel, this);
        amVar.f110020x = true;
        amVar.mo88509a(this.f110110d.f109928c, this.f110110d.f109929d, this.f110110d.f109926a, this.f110110d.f109927b, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
        this.f110111e.mo42969a(i, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
        this.f110111e.mo43055e(i, stickerItemModel.layerWeight);
        this.f110111e.mo43026b(i, stickerItemModel.scale);
        this.f110111e.mo42968a(i, -stickerItemModel.rotateAngle);
        this.f110108b = amVar;
        this.f110108b.f110004e = false;
        this.f110107a.add(amVar);
        if (this.f110112f != null) {
            this.f110112f.mo88527a(stickerItemModel);
        }
        SubtitleModule.m97952aa().put(Integer.valueOf(i), stickerItemModel);
        return amVar;
    }

    /* renamed from: b */
    public final void mo88606b(C43501am amVar, float f) {
        if (!amVar.f110020x) {
            float f2 = amVar.f110003d.scale * f;
            if (f2 >= amVar.f110001b || f >= 1.0f) {
                this.f110111e.mo43026b(amVar.f110003d.f91605id, f);
                amVar.f110003d.scale = f2;
                amVar.mo88511b(f);
            }
        } else if (!amVar.f110003d.isSubtitleRule()) {
            for (C43501am amVar2 : this.f110107a) {
                if (amVar2.f110020x) {
                    float f3 = amVar2.f110003d.scale * f;
                    if (f3 < amVar2.f110001b && f < 1.0f) {
                        return;
                    }
                    if (f3 <= amVar2.f110002c || f <= 1.0f) {
                        this.f110111e.mo43026b(amVar2.f110003d.f91605id, f);
                        amVar2.f110003d.scale = f3;
                        amVar2.mo88511b(f);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    C43530d(FragmentActivity fragmentActivity, InfoStickerEditView infoStickerEditView, C20347c cVar, View view) {
        this.f110110d = infoStickerEditView;
        this.f110111e = cVar;
        this.f110116j = fragmentActivity;
        this.f110109c = this.f110111e.mo43071k();
        Activity a = C18998a.m46169a(view.getContext());
        if (a != null) {
            this.f110115i = (StickerHintTextViewModel) C0214z.m440a((FragmentActivity) a).mo359a(StickerHintTextViewModel.class);
        }
    }

    /* renamed from: a */
    private StickerItemModel m95499a(int i, String str, String str2, String str3, int i2, int i3) {
        int i4 = i;
        String str4 = str;
        try {
            StickerItemModel stickerItemModel = new StickerItemModel(str, str2, str3, i3, this.f110111e.mo43057e(i), 0, this.f110109c, i2);
            stickerItemModel.uiStartTime = 0;
            stickerItemModel.uiEndTime = this.f110111e.mo42966A();
            float[] fArr = new float[2];
            this.f110111e.mo43032b(i, fArr);
            stickerItemModel.currentOffsetX = fArr[0];
            stickerItemModel.currentOffsetY = fArr[1];
            this.f110111e.mo43027b(i, fArr[0], fArr[1]);
            stickerItemModel.f91605id = i4;
            float[] g = this.f110111e.mo43064g(i);
            stickerItemModel.initWidth = (g[2] - g[0]) * ((float) this.f110110d.f109928c);
            stickerItemModel.initHeight = (g[1] - g[3]) * ((float) this.f110110d.f109929d);
            LinkedHashMap infoStickerCategoryMap = this.f110117k.infoStickerCategoryParams.getInfoStickerCategoryMap();
            if (infoStickerCategoryMap.containsKey(str)) {
                stickerItemModel.tabId = (String) infoStickerCategoryMap.get(str);
            }
            return stickerItemModel;
        } catch (C50751p e) {
            StringBuilder sb = new StringBuilder("add info sticker failed: ");
            sb.append(str);
            C32458a.m75148a((Throwable) new RuntimeException(sb.toString(), e));
            StringBuilder sb2 = new StringBuilder("initSticker failed : ");
            sb2.append(str);
            StringBuilder sb3 = new StringBuilder("initSticker size : ");
            sb3.append(this.f110107a.size());
            C23569o.m57779a("info_sticker", C23088c.m56631a().mo47824a("event", sb2.toString()).mo47824a("user_info", sb3.toString()).mo47825b());
            return null;
        }
    }

    /* renamed from: a */
    public final C43501am mo88594a(String str, String str2, String str3, int i, boolean z, boolean z2) {
        int b;
        long j;
        String str4 = str2;
        String str5 = str3;
        boolean z3 = z2;
        if (this.f110108b != null && this.f110108b.f110004e) {
            this.f110108b.f110004e = false;
        }
        int a = this.f110111e.mo43006a(str4, TextUtils.isEmpty(str3) ? null : new String[]{str5});
        StringBuilder sb = new StringBuilder("addInfoSticker1 id = ");
        sb.append(a);
        C45407ay.m98973d(sb.toString());
        if (a < 0) {
            boolean b2 = C48016e.m103944b(str2);
            if (b2) {
                j = new File(str4).length();
            } else {
                j = 0;
            }
            StringBuilder sb2 = new StringBuilder("add infoSticker failed: ");
            sb2.append(a);
            C32458a.m75144a(sb2.toString());
            StringBuilder sb3 = new StringBuilder("addFailed: ");
            sb3.append(a);
            StringBuilder sb4 = new StringBuilder("path: ");
            sb4.append(str4);
            sb4.append(" file exist ");
            sb4.append(b2);
            sb4.append(" size: ");
            sb4.append(j);
            sb4.append(" extra: ");
            sb4.append(str5);
            C23569o.m57779a("info_sticker", C23088c.m56631a().mo47824a("event", sb3.toString()).mo47824a("user_info", sb4.toString()).mo47825b());
            return null;
        }
        if (z) {
            b = C43502an.m95363c();
        } else {
            b = C43502an.m95362b();
        }
        StickerItemModel a2 = m95499a(a, str, str2, str3, i, b);
        if (a2 == null) {
            return null;
        }
        C43501am amVar = new C43501am(this.f110110d.getContext(), a2, this);
        amVar.mo88509a(this.f110110d.f109928c, this.f110110d.f109929d, this.f110110d.f109926a, this.f110110d.f109927b, 0.5f, 0.5f);
        this.f110111e.mo42969a(a2.f91605id, a2.currentOffsetX, a2.currentOffsetY);
        this.f110111e.mo43055e(a2.f91605id, amVar.f110003d.layerWeight);
        this.f110108b = amVar;
        this.f110108b.f110004e = false;
        this.f110107a.add(amVar);
        if (this.f110112f != null) {
            this.f110112f.mo88527a(a2);
        }
        if (z3 || (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities) && this.f110115i != null)) {
            this.f110110d.postDelayed(new C43531e(this, z3, amVar, a), 500);
        }
        return amVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public StickerItemModel mo88592a(int i, int i2, int i3, int i4, int i5, String str, String str2, float f, float f2) {
        int i6 = i;
        try {
            StickerItemModel stickerItemModel = new StickerItemModel("", str2, str, C43502an.m95362b(), false, i2, i3, 5);
            int i7 = i2;
            stickerItemModel.uiStartTime = this.f110111e.mo43086r(i2);
            int i8 = i3;
            stickerItemModel.uiEndTime = this.f110111e.mo43086r(i3);
            stickerItemModel.currentOffsetX = 0.5f;
            stickerItemModel.currentOffsetY = f2;
            stickerItemModel.scale = f;
            stickerItemModel.f91605id = i6;
            stickerItemModel.initWidth = (float) i4;
            stickerItemModel.initHeight = (float) i5;
            return stickerItemModel;
        } catch (C50751p e) {
            StringBuilder sb = new StringBuilder("add subtitle info sticker failed: ");
            sb.append(i);
            C32458a.m75148a((Throwable) new RuntimeException(sb.toString(), e));
            StringBuilder sb2 = new StringBuilder("subtitle initSticker failed : ");
            sb2.append(i);
            StringBuilder sb3 = new StringBuilder("initSticker size : ");
            sb3.append(this.f110107a.size());
            C23569o.m57779a("info_sticker", C23088c.m56631a().mo47824a("event", sb2.toString()).mo47824a("user_info", sb3.toString()).mo47825b());
            return null;
        }
    }
}
