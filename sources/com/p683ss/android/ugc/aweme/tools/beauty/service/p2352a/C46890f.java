package com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.LiveData;
import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.C18091u;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData;
import com.p683ss.android.ugc.aweme.infoSticker.InfoStickerRepository;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a.f */
public final class C46890f {

    /* renamed from: a */
    public LiveData<C37721a<CategoryPageModel>> f118465a;

    /* renamed from: b */
    public final InfoStickerRepository f118466b;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a.f$a */
    public static final class C46891a<T> implements C0199s<C37721a<CategoryPageModel>> {

        /* renamed from: a */
        final /* synthetic */ C46890f f118467a;

        public C46891a(C46890f fVar) {
            this.f118467a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            final C37721a aVar = (C37721a) obj;
            if (aVar != null && C37722a.SUCCESS == aVar.f96126b) {
                C0013i.m16a((Callable<TResult>) new Callable<TResult>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C46891a f118468a;

                    {
                        this.f118468a = r1;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[LOOP:0: B:10:0x0022->B:12:0x0028, LOOP_END] */
                    /* JADX WARNING: Removed duplicated region for block: B:15:0x0087  */
                    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb  */
                    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e9  */
                    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f7  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ java.lang.Object call() {
                        /*
                            r14 = this;
                            com.ss.android.ugc.aweme.mvp.b.a r0 = r3
                            M r0 = r0.f96125a
                            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r0 = (com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r0
                            r1 = 0
                            if (r0 == 0) goto L_0x0014
                            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r2 = r0.getCategoryEffects()
                            if (r2 == 0) goto L_0x0014
                            java.util.List r2 = r2.getEffects()
                            goto L_0x0015
                        L_0x0014:
                            r2 = r1
                        L_0x0015:
                            if (r2 == 0) goto L_0x0080
                            boolean r3 = r2.isEmpty()
                            if (r3 == 0) goto L_0x001e
                            goto L_0x0080
                        L_0x001e:
                            java.util.Iterator r2 = r2.iterator()
                        L_0x0022:
                            boolean r3 = r2.hasNext()
                            if (r3 == 0) goto L_0x0080
                            java.lang.Object r3 = r2.next()
                            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r3
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder
                            r4.<init>()
                            java.io.File r5 = com.p683ss.android.ugc.aweme.effectplatform.EffectPlatform.f76569a
                            java.lang.String r6 = "EffectPlatform.LOCAL_CACHEDIR"
                            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
                            java.lang.String r5 = r5.getAbsolutePath()
                            r4.append(r5)
                            java.lang.String r5 = java.io.File.separator
                            r4.append(r5)
                            java.lang.String r5 = r3.getId()
                            r4.append(r5)
                            java.lang.String r5 = ".zip"
                            r4.append(r5)
                            java.lang.String r4 = r4.toString()
                            r3.setZipPath(r4)
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder
                            r4.<init>()
                            java.io.File r5 = com.p683ss.android.ugc.aweme.effectplatform.EffectPlatform.f76569a
                            java.lang.String r6 = "EffectPlatform.LOCAL_CACHEDIR"
                            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
                            java.lang.String r5 = r5.getAbsolutePath()
                            r4.append(r5)
                            java.lang.String r5 = java.io.File.separator
                            r4.append(r5)
                            java.lang.String r5 = r3.getId()
                            r4.append(r5)
                            java.lang.String r4 = r4.toString()
                            r3.setUnzipPath(r4)
                            goto L_0x0022
                        L_0x0080:
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            if (r0 == 0) goto L_0x00a9
                            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r3 = r0.getCategoryEffects()
                            if (r3 == 0) goto L_0x00a9
                            java.util.List r3 = r3.getEffects()
                            if (r3 == 0) goto L_0x00a9
                            java.lang.Iterable r3 = (java.lang.Iterable) r3
                            java.util.Iterator r3 = r3.iterator()
                        L_0x0099:
                            boolean r4 = r3.hasNext()
                            if (r4 == 0) goto L_0x00a9
                            java.lang.Object r4 = r3.next()
                            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r4
                            com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a.C46890f.m101846a(r4, r2)
                            goto L_0x0099
                        L_0x00a9:
                            java.util.ArrayList r3 = com.p683ss.android.ugc.aweme.beauty.C23785h.m58372a(r2)
                            java.lang.Iterable r3 = (java.lang.Iterable) r3
                            java.util.Iterator r4 = r3.iterator()
                        L_0x00b3:
                            boolean r5 = r4.hasNext()
                            r6 = 0
                            r7 = 1
                            if (r5 == 0) goto L_0x01e7
                            java.lang.Object r5 = r4.next()
                            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r5 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r5
                            if (r5 == 0) goto L_0x00c8
                            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r5 = r5.getUlikeBeautyExtra()
                            goto L_0x00c9
                        L_0x00c8:
                            r5 = r1
                        L_0x00c9:
                            if (r5 == 0) goto L_0x00d0
                            java.lang.String r8 = r5.getResourceType()
                            goto L_0x00d1
                        L_0x00d0:
                            r8 = r1
                        L_0x00d1:
                            if (r8 != 0) goto L_0x00d4
                            goto L_0x00b3
                        L_0x00d4:
                            int r9 = r8.hashCode()
                            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
                            switch(r9) {
                                case 49: goto L_0x018f;
                                case 50: goto L_0x0137;
                                case 51: goto L_0x00de;
                                default: goto L_0x00dd;
                            }
                        L_0x00dd:
                            goto L_0x00b3
                        L_0x00de:
                            java.lang.String r6 = "3"
                            boolean r6 = r8.equals(r6)
                            if (r6 == 0) goto L_0x00b3
                            java.lang.String r6 = r5.getGender()
                            java.lang.Float r7 = r5.getLipstickDefault()
                            if (r7 == 0) goto L_0x00f5
                            float r7 = r7.floatValue()
                            goto L_0x00f7
                        L_0x00f5:
                            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
                        L_0x00f7:
                            r8 = 3
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58359a(r8, r6, r7)
                            java.lang.String r6 = r5.getGender()
                            java.lang.Float r7 = r5.getLipstickMax()
                            if (r7 == 0) goto L_0x010a
                            float r7 = r7.floatValue()
                            goto L_0x010c
                        L_0x010a:
                            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
                        L_0x010c:
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58361b(r8, r6, r7)
                            java.lang.String r6 = r5.getGender()
                            java.lang.Float r7 = r5.getBlushDefault()
                            if (r7 == 0) goto L_0x011e
                            float r7 = r7.floatValue()
                            goto L_0x0120
                        L_0x011e:
                            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
                        L_0x0120:
                            r8 = 4
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58359a(r8, r6, r7)
                            java.lang.String r6 = r5.getGender()
                            java.lang.Float r5 = r5.getBlushMax()
                            if (r5 == 0) goto L_0x0132
                            float r10 = r5.floatValue()
                        L_0x0132:
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58361b(r8, r6, r10)
                            goto L_0x00b3
                        L_0x0137:
                            java.lang.String r6 = "2"
                            boolean r6 = r8.equals(r6)
                            if (r6 == 0) goto L_0x00b3
                            java.lang.String r6 = r5.getGender()
                            java.lang.Float r8 = r5.getEyeDefault()
                            if (r8 == 0) goto L_0x014e
                            float r8 = r8.floatValue()
                            goto L_0x0150
                        L_0x014e:
                            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
                        L_0x0150:
                            r9 = 2
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58359a(r9, r6, r8)
                            java.lang.String r6 = r5.getGender()
                            java.lang.Float r8 = r5.getEyeMax()
                            if (r8 == 0) goto L_0x0163
                            float r8 = r8.floatValue()
                            goto L_0x0165
                        L_0x0163:
                            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
                        L_0x0165:
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58361b(r9, r6, r8)
                            java.lang.String r6 = r5.getGender()
                            java.lang.Float r8 = r5.getFaceDefault()
                            if (r8 == 0) goto L_0x0177
                            float r8 = r8.floatValue()
                            goto L_0x0179
                        L_0x0177:
                            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
                        L_0x0179:
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58359a(r7, r6, r8)
                            java.lang.String r6 = r5.getGender()
                            java.lang.Float r5 = r5.getFaceMax()
                            if (r5 == 0) goto L_0x018a
                            float r10 = r5.floatValue()
                        L_0x018a:
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58361b(r7, r6, r10)
                            goto L_0x00b3
                        L_0x018f:
                            java.lang.String r7 = "1"
                            boolean r7 = r8.equals(r7)
                            if (r7 == 0) goto L_0x00b3
                            java.lang.String r7 = r5.getGender()
                            java.lang.Float r8 = r5.getSkinDefault()
                            if (r8 == 0) goto L_0x01a6
                            float r8 = r8.floatValue()
                            goto L_0x01a8
                        L_0x01a6:
                            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
                        L_0x01a8:
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58359a(r6, r7, r8)
                            java.lang.String r7 = r5.getGender()
                            java.lang.Float r8 = r5.getSkinMax()
                            if (r8 == 0) goto L_0x01ba
                            float r8 = r8.floatValue()
                            goto L_0x01bc
                        L_0x01ba:
                            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
                        L_0x01bc:
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58361b(r6, r7, r8)
                            java.lang.String r6 = r5.getGender()
                            java.lang.Float r7 = r5.getSharpDefault()
                            if (r7 == 0) goto L_0x01ce
                            float r7 = r7.floatValue()
                            goto L_0x01d0
                        L_0x01ce:
                            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
                        L_0x01d0:
                            r8 = 5
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58359a(r8, r6, r7)
                            java.lang.String r6 = r5.getGender()
                            java.lang.Float r5 = r5.getSharpMax()
                            if (r5 == 0) goto L_0x01e2
                            float r10 = r5.floatValue()
                        L_0x01e2:
                            com.p683ss.android.ugc.aweme.beauty.C23779c.m58361b(r8, r6, r10)
                            goto L_0x00b3
                        L_0x01e7:
                            if (r0 == 0) goto L_0x01f4
                            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r4 = r0.getCategoryEffects()
                            if (r4 == 0) goto L_0x01f4
                            java.util.List r4 = r4.getEffects()
                            goto L_0x01f5
                        L_0x01f4:
                            r4 = r1
                        L_0x01f5:
                            if (r4 == 0) goto L_0x0279
                            com.ss.android.ugc.aweme.tools.beauty.service.a.f$a r4 = r14.f118468a
                            com.ss.android.ugc.aweme.tools.beauty.service.a.f r4 = r4.f118467a
                            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r0.getCategoryEffects()
                            if (r0 == 0) goto L_0x025d
                            java.util.List r0 = r0.getEffects()
                            if (r0 == 0) goto L_0x025d
                            java.lang.Iterable r0 = (java.lang.Iterable) r0
                            java.util.ArrayList r5 = new java.util.ArrayList
                            r5.<init>()
                            java.util.Collection r5 = (java.util.Collection) r5
                            java.util.Iterator r0 = r0.iterator()
                        L_0x0214:
                            boolean r8 = r0.hasNext()
                            if (r8 == 0) goto L_0x025a
                            java.lang.Object r8 = r0.next()
                            r9 = r8
                            com.ss.android.ugc.effectmanager.effect.model.Effect r9 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r9
                            java.util.Iterator r10 = r3.iterator()
                        L_0x0225:
                            boolean r11 = r10.hasNext()
                            if (r11 == 0) goto L_0x024e
                            java.lang.Object r11 = r10.next()
                            r12 = r11
                            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r12 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r12
                            if (r12 == 0) goto L_0x0239
                            java.lang.String r12 = r12.getEffectId()
                            goto L_0x023a
                        L_0x0239:
                            r12 = r1
                        L_0x023a:
                            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                            java.lang.String r13 = "effect"
                            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r13)
                            java.lang.String r13 = r9.getEffectId()
                            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                            boolean r12 = android.text.TextUtils.equals(r12, r13)
                            if (r12 == 0) goto L_0x0225
                            goto L_0x024f
                        L_0x024e:
                            r11 = r1
                        L_0x024f:
                            if (r11 == 0) goto L_0x0253
                            r9 = 1
                            goto L_0x0254
                        L_0x0253:
                            r9 = 0
                        L_0x0254:
                            if (r9 == 0) goto L_0x0214
                            r5.add(r8)
                            goto L_0x0214
                        L_0x025a:
                            r1 = r5
                            java.util.List r1 = (java.util.List) r1
                        L_0x025d:
                            if (r1 == 0) goto L_0x0266
                            boolean r0 = r1.isEmpty()
                            if (r0 != r7) goto L_0x0266
                            goto L_0x0270
                        L_0x0266:
                            com.ss.android.ugc.aweme.infoSticker.InfoStickerRepository r0 = r4.f118466b
                            if (r1 != 0) goto L_0x026d
                            p2628d.p2639f.p2641b.C52711k.m112234a()
                        L_0x026d:
                            r0.mo73917a(r1, r7)
                        L_0x0270:
                            com.ss.android.ugc.aweme.tools.beauty.service.a.f$a r0 = r14.f118468a
                            com.ss.android.ugc.aweme.tools.beauty.service.a.f r0 = r0.f118467a
                            com.ss.android.ugc.aweme.infoSticker.InfoStickerRepository r0 = r0.f118466b
                            r0.mo73918a(r7)
                        L_0x0279:
                            com.bytedance.keva.Keva r0 = com.p683ss.android.ugc.aweme.beauty.C23781e.f63375a
                            java.lang.String r1 = "ulike_download_config"
                            com.ss.android.ugc.aweme.port.in.u r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                            com.google.gson.f r3 = r3.mo58566D()
                            java.lang.String r3 = r3.mo34889b(r2)
                            r0.storeString(r1, r3)
                            com.p683ss.android.ugc.aweme.beauty.C23785h.f63389a = r2
                            d.x r0 = p2628d.C52860x.f131107a
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a.C46890f.C46891a.C468921.call():java.lang.Object");
                    }
                });
            }
        }
    }

    public C46890f(InfoStickerRepository infoStickerRepository) {
        C52711k.m112240b(infoStickerRepository, "repository");
        this.f118466b = infoStickerRepository;
    }

    /* renamed from: a */
    public static void m101846a(Effect effect, ArrayList<UlikeBeautyData> arrayList) {
        CharSequence charSequence;
        String str;
        String str2;
        String str3 = null;
        if (effect != null) {
            charSequence = effect.getExtra();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                C17971f D = C39629l.m88232a().mo58566D();
                if (effect != null) {
                    str = effect.getExtra();
                } else {
                    str = null;
                }
                ComposerBeautyExtra composerBeautyExtra = (ComposerBeautyExtra) D.mo34884a(str, ComposerBeautyExtra.class);
                if (effect != null) {
                    str2 = effect.getUnzipPath();
                } else {
                    str2 = null;
                }
                if (effect != null) {
                    str3 = effect.getEffectId();
                }
                arrayList.add(new UlikeBeautyData(composerBeautyExtra, str2, str3));
            } catch (C18091u unused) {
            }
        }
    }
}
