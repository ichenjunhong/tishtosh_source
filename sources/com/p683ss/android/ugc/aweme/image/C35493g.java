package com.p683ss.android.ugc.aweme.image;

import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p767a.C12156a;
import com.bytedance.lighten.p766a.p767a.C12157b;
import com.bytedance.lighten.p766a.p767a.C12157b.C12158a;
import com.p683ss.android.ugc.aweme.base.C23550k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.image.g */
public final class C35493g extends C12158a {

    /* renamed from: com.ss.android.ugc.aweme.image.g$a */
    public static final class C35494a implements C12157b<Object, C12156a> {

        /* renamed from: b */
        public static final C35494a f91235b = new C35494a();

        /* renamed from: c */
        public static final C35495a f91236c = new C35495a(null);

        /* renamed from: a */
        public final String f91237a = "ImageUrlModelConverter";

        /* renamed from: d */
        private final boolean f91238d = false;

        /* renamed from: e */
        private Pattern f91239e;

        /* renamed from: f */
        private String f91240f;

        /* renamed from: g */
        private boolean f91241g;

        /* renamed from: h */
        private boolean f91242h = true;

        /* renamed from: com.ss.android.ugc.aweme.image.g$a$a */
        public static final class C35495a {
            private C35495a() {
            }

            public /* synthetic */ C35495a(C52707g gVar) {
                this();
            }
        }

        public C35494a() {
            m80233a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x004c A[Catch:{ Throwable -> 0x006b }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x005e A[Catch:{ Throwable -> 0x006b }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x005f A[Catch:{ Throwable -> 0x006b }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.util.regex.Pattern m80233a() {
            /*
                r7 = this;
                java.util.regex.Pattern r0 = r7.f91239e
                if (r0 == 0) goto L_0x0007
                java.util.regex.Pattern r0 = r7.f91239e
                return r0
            L_0x0007:
                r0 = 0
                com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ Throwable -> 0x006b }
                java.lang.Class<com.ss.android.ugc.aweme.image.experiment.ImageCropConfigExperiment> r2 = com.p683ss.android.ugc.aweme.image.experiment.ImageCropConfigExperiment.class
                r3 = 1
                java.lang.String r4 = "image_crop_config_v3"
                r5 = 31744(0x7c00, float:4.4483E-41)
                java.lang.Class<com.ss.android.ugc.aweme.image.experiment.a> r6 = com.p683ss.android.ugc.aweme.image.experiment.C35490a.class
                java.lang.Object r1 = r1.mo18170a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x006b }
                com.ss.android.ugc.aweme.image.experiment.a r1 = (com.p683ss.android.ugc.aweme.image.experiment.C35490a) r1     // Catch:{ Throwable -> 0x006b }
                if (r1 == 0) goto L_0x0020
                int r2 = r1.f91227c     // Catch:{ Throwable -> 0x006b }
                goto L_0x0021
            L_0x0020:
                r2 = 0
            L_0x0021:
                r3 = 0
                if (r1 == 0) goto L_0x0027
                java.lang.String r4 = r1.f91225a     // Catch:{ Throwable -> 0x006b }
                goto L_0x0028
            L_0x0027:
                r4 = r3
            L_0x0028:
                if (r1 == 0) goto L_0x002d
                java.lang.String r1 = r1.f91226b     // Catch:{ Throwable -> 0x006b }
                goto L_0x002e
            L_0x002d:
                r1 = r3
            L_0x002e:
                r7.f91240f = r1     // Catch:{ Throwable -> 0x006b }
                r1 = 1
                if (r2 == 0) goto L_0x0035
                r5 = 1
                goto L_0x0036
            L_0x0035:
                r5 = 0
            L_0x0036:
                r7.f91242h = r5     // Catch:{ Throwable -> 0x006b }
                r5 = 2
                if (r2 != r5) goto L_0x0068
                r2 = r4
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Throwable -> 0x006b }
                if (r2 == 0) goto L_0x0049
                int r2 = r2.length()     // Catch:{ Throwable -> 0x006b }
                if (r2 != 0) goto L_0x0047
                goto L_0x0049
            L_0x0047:
                r2 = 0
                goto L_0x004a
            L_0x0049:
                r2 = 1
            L_0x004a:
                if (r2 != 0) goto L_0x0068
                java.lang.String r2 = r7.f91240f     // Catch:{ Throwable -> 0x006b }
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Throwable -> 0x006b }
                if (r2 == 0) goto L_0x005b
                int r2 = r2.length()     // Catch:{ Throwable -> 0x006b }
                if (r2 != 0) goto L_0x0059
                goto L_0x005b
            L_0x0059:
                r2 = 0
                goto L_0x005c
            L_0x005b:
                r2 = 1
            L_0x005c:
                if (r2 == 0) goto L_0x005f
                goto L_0x0068
            L_0x005f:
                r7.f91241g = r1     // Catch:{ Throwable -> 0x006b }
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r4)     // Catch:{ Throwable -> 0x006b }
                r7.f91239e = r1     // Catch:{ Throwable -> 0x006b }
                goto L_0x006d
            L_0x0068:
                r7.f91241g = r0     // Catch:{ Throwable -> 0x006b }
                return r3
            L_0x006b:
                r7.f91242h = r0
            L_0x006d:
                java.util.regex.Pattern r0 = r7.f91239e
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.image.C35493g.C35494a.m80233a():java.util.regex.Pattern");
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23068a(Object obj, C12208t tVar) {
            C52711k.m112240b(tVar, "builder");
            if (!(obj instanceof C23550k)) {
                return null;
            }
            return m80232a((C23550k) obj, tVar.f32247j, tVar.f32248k);
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0133  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.bytedance.lighten.p766a.p767a.C12156a m80232a(com.p683ss.android.ugc.aweme.base.C23550k r16, int r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                r1 = r16
                java.lang.String r2 = "imageUrlModel"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
                boolean r2 = r0.f91242h
                if (r2 != 0) goto L_0x0014
                com.bytedance.lighten.a.a.a r2 = new com.bytedance.lighten.a.a.a
                java.util.List<java.lang.String> r1 = r1.f62671b
                r2.<init>(r1)
                return r2
            L_0x0014:
                r2 = 3
                r3 = 0
                r4 = 1
                r5 = 2
                r6 = 0
                if (r17 <= 0) goto L_0x020e
                if (r18 > 0) goto L_0x001f
                goto L_0x020e
            L_0x001f:
                boolean r8 = r0.f91241g
                if (r8 != 0) goto L_0x0059
                m80234a(r1, r6, r6, r6)
                boolean r7 = r0.f91238d
                if (r7 == 0) goto L_0x0051
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r7 = r0.f91237a
                r2[r6] = r7
                java.lang.String r7 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:48)\n"
                r2[r4] = r7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = r1.f62670a
                r4.append(r7)
                java.lang.String r7 = " not open, return "
                r4.append(r7)
                java.util.List<java.lang.String> r7 = r1.f62671b
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r2[r5] = r4
                com.p683ss.android.ugc.aweme.utils.C47878fc.m103574a(r2, false)
            L_0x0051:
                com.bytedance.lighten.a.a.a r2 = new com.bytedance.lighten.a.a.a
                java.util.List<java.lang.String> r1 = r1.f62671b
                r2.<init>(r1)
                return r2
            L_0x0059:
                java.lang.String r8 = r1.f62670a
                r9 = r8
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                if (r9 == 0) goto L_0x0069
                int r9 = r9.length()
                if (r9 != 0) goto L_0x0067
                goto L_0x0069
            L_0x0067:
                r9 = 0
                goto L_0x006a
            L_0x0069:
                r9 = 1
            L_0x006a:
                if (r9 == 0) goto L_0x0097
                boolean r7 = r0.f91238d
                if (r7 == 0) goto L_0x008f
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r7 = r0.f91237a
                r2[r6] = r7
                java.lang.String r7 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n"
                r2[r4] = r7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r7 = "no uri error, return "
                r4.<init>(r7)
                java.util.List<java.lang.String> r7 = r1.f62671b
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r2[r5] = r4
                com.p683ss.android.ugc.aweme.utils.C47878fc.m103574a(r2, false)
            L_0x008f:
                com.bytedance.lighten.a.a.a r2 = new com.bytedance.lighten.a.a.a
                java.util.List<java.lang.String> r1 = r1.f62671b
                r2.<init>(r1)
                return r2
            L_0x0097:
                java.lang.String r9 = "large/"
                boolean r9 = p2628d.p2650m.C52830p.m112411b(r8, r9, r6, r5, r3)
                if (r9 == 0) goto L_0x00aa
                java.lang.String r9 = "large/"
                java.lang.String r10 = ""
                r11 = 0
                r12 = 4
                r13 = 0
                java.lang.String r8 = p2628d.p2650m.C52830p.m112409b(r8, r9, r10, r11, r12, r13)
            L_0x00aa:
                java.util.List<java.lang.String> r9 = r1.f62671b
                r10 = r9
                java.util.Collection r10 = (java.util.Collection) r10
                if (r10 == 0) goto L_0x00ba
                boolean r10 = r10.isEmpty()
                if (r10 == 0) goto L_0x00b8
                goto L_0x00ba
            L_0x00b8:
                r10 = 0
                goto L_0x00bb
            L_0x00ba:
                r10 = 1
            L_0x00bb:
                if (r10 == 0) goto L_0x00e8
                boolean r7 = r0.f91238d
                if (r7 == 0) goto L_0x00e0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r7 = r0.f91237a
                r2[r6] = r7
                java.lang.String r7 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n"
                r2[r4] = r7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r7 = "empty image list error, return "
                r4.<init>(r7)
                java.util.List<java.lang.String> r7 = r1.f62671b
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r2[r5] = r4
                com.p683ss.android.ugc.aweme.utils.C47878fc.m103574a(r2, false)
            L_0x00e0:
                com.bytedance.lighten.a.a.a r2 = new com.bytedance.lighten.a.a.a
                java.util.List<java.lang.String> r1 = r1.f62671b
                r2.<init>(r1)
                return r2
            L_0x00e8:
                java.util.regex.Pattern r10 = r15.m80233a()
                if (r10 == 0) goto L_0x00fc
                r11 = r8
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                java.util.regex.Matcher r10 = r10.matcher(r11)
                if (r10 == 0) goto L_0x00fc
                boolean r10 = r10.matches()
                goto L_0x00fd
            L_0x00fc:
                r10 = 0
            L_0x00fd:
                if (r10 != 0) goto L_0x0133
                m80234a(r1, r4, r4, r6)
                boolean r7 = r0.f91238d
                if (r7 == 0) goto L_0x012b
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r7 = r0.f91237a
                r2[r6] = r7
                java.lang.String r7 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n"
                r2[r4] = r7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r8)
                java.lang.String r7 = " not match error, return "
                r4.append(r7)
                java.util.List<java.lang.String> r7 = r1.f62671b
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r2[r5] = r4
                com.p683ss.android.ugc.aweme.utils.C47878fc.m103574a(r2, false)
            L_0x012b:
                com.bytedance.lighten.a.a.a r2 = new com.bytedance.lighten.a.a.a
                java.util.List<java.lang.String> r1 = r1.f62671b
                r2.<init>(r1)
                return r2
            L_0x0133:
                java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
                r10.<init>()
                r11 = r9
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.Iterator r11 = r11.iterator()
            L_0x013f:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x01cf
                java.lang.Object r12 = r11.next()
                java.lang.String r12 = (java.lang.String) r12
                android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ Exception -> 0x01c2 }
                java.util.Locale r13 = java.util.Locale.US     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r14 = "Locale.US"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r14 = r0.f91240f     // Catch:{ Exception -> 0x01c2 }
                if (r14 != 0) goto L_0x015d
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x01c2 }
            L_0x015d:
                r3 = 5
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r3 = "imageUri"
                p2628d.p2639f.p2641b.C52711k.m112236a(r12, r3)     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r3 = r12.getScheme()     // Catch:{ Exception -> 0x01c2 }
                r2[r6] = r3     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r3 = r12.getHost()     // Catch:{ Exception -> 0x01c2 }
                r2[r4] = r3     // Catch:{ Exception -> 0x01c2 }
                r2[r5] = r8     // Catch:{ Exception -> 0x01c2 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x01c2 }
                r12 = 3
                r2[r12] = r3     // Catch:{ Exception -> 0x01c2 }
                r3 = 4
                java.lang.Integer r12 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x01c2 }
                r2[r3] = r12     // Catch:{ Exception -> 0x01c2 }
                r3 = 5
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r2 = com.C2240a.m6773a(r13, r14, r2)     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r3 = "java.lang.String.format(locale, format, *args)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x01c2 }
                r3 = r2
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r12 = "?"
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x01c2 }
                r13 = 0
                boolean r3 = p2628d.p2650m.C52830p.m112456b(r3, r12, r6, r5, r13)     // Catch:{ Exception -> 0x01c2 }
                if (r3 == 0) goto L_0x01af
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c2 }
                r3.<init>()     // Catch:{ Exception -> 0x01c2 }
                r3.append(r2)     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r2 = "&ilog=shrink"
                r3.append(r2)     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x01c2 }
                goto L_0x01c0
            L_0x01af:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c2 }
                r3.<init>()     // Catch:{ Exception -> 0x01c2 }
                r3.append(r2)     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r2 = "?ilog=shrink"
                r3.append(r2)     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x01c2 }
            L_0x01c0:
                r3 = r2
                goto L_0x01c3
            L_0x01c2:
                r3 = 0
            L_0x01c3:
                if (r3 == 0) goto L_0x01cb
                r2 = r10
                java.util.Collection r2 = (java.util.Collection) r2
                r2.add(r3)
            L_0x01cb:
                r2 = 3
                r3 = 0
                goto L_0x013f
            L_0x01cf:
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r2 = r10.isEmpty()
                r2 = r2 ^ r4
                if (r2 == 0) goto L_0x01db
                r9.addAll(r6, r10)
            L_0x01db:
                boolean r2 = r0.f91238d
                if (r2 == 0) goto L_0x0206
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = r0.f91237a
                r2[r6] = r3
                java.lang.String r3 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:67)\n"
                r2[r4] = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r8)
                java.lang.String r4 = " match, return "
                r3.append(r4)
                java.util.List<java.lang.String> r4 = r1.f62671b
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2[r5] = r3
                r3 = 0
                com.p683ss.android.ugc.aweme.utils.C47878fc.m103574a(r2, false)
            L_0x0206:
                com.bytedance.lighten.a.a.a r2 = new com.bytedance.lighten.a.a.a
                java.util.List<java.lang.String> r1 = r1.f62671b
                r2.<init>(r1)
                return r2
            L_0x020e:
                boolean r2 = r0.f91238d
                if (r2 == 0) goto L_0x023b
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = r0.f91237a
                r2[r6] = r3
                java.lang.String r3 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:48)\n"
                r2[r4] = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r1.f62670a
                r3.append(r4)
                java.lang.String r4 = " no size error, return "
                r3.append(r4)
                java.util.List<java.lang.String> r4 = r1.f62671b
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2[r5] = r3
                r3 = 0
                com.p683ss.android.ugc.aweme.utils.C47878fc.m103574a(r2, false)
            L_0x023b:
                com.bytedance.lighten.a.a.a r2 = new com.bytedance.lighten.a.a.a
                java.util.List<java.lang.String> r1 = r1.f62671b
                r2.<init>(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.image.C35493g.C35494a.m80232a(com.ss.android.ugc.aweme.base.k, int, int):com.bytedance.lighten.a.a.a");
        }

        /* renamed from: a */
        private static void m80234a(C23550k kVar, boolean z, boolean z2, boolean z3) {
            String str;
            String str2;
            C52711k.m112240b(kVar, "imageUrlModel");
            if (!z || !z2) {
                str = "ilog=not_shrink";
            } else {
                str = "ilog=not_shrink_test";
            }
            List<String> list = kVar.f62671b;
            List<String> list2 = null;
            if (list != null) {
                Iterable<String> iterable = list;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (String str3 : iterable) {
                    C52711k.m112236a((Object) str3, "imageUrl");
                    if (C52830p.m112456b((CharSequence) str3, (CharSequence) "?", false, 2, (Object) null)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append('&');
                        sb.append(str);
                        str2 = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str3);
                        sb2.append('?');
                        sb2.append(str);
                        str2 = sb2.toString();
                    }
                    arrayList.add(str2);
                }
                list2 = (List) arrayList;
            }
            kVar.f62671b = list2;
        }
    }

    /* renamed from: a */
    public final C12157b<Object, C12156a> mo23069a() {
        return C35494a.f91235b;
    }
}
