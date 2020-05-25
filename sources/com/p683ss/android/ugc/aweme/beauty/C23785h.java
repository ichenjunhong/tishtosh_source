package com.p683ss.android.ugc.aweme.beauty;

import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.File;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.beauty.h */
public final class C23785h {

    /* renamed from: a */
    public static ArrayList<UlikeBeautyData> f63389a = new ArrayList<>();

    /* renamed from: b */
    public static final C23785h f63390b = new C23785h();

    private C23785h() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0102 A[EDGE_INSN: B:83:0x0102->B:49:0x0102 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0134 A[EDGE_INSN: B:86:0x0134->B:65:0x0134 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData> m58372a(java.util.ArrayList<com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData> r10) {
        /*
            java.lang.String r0 = "dataList"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.property.h r1 = r1.mo58583n()
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UlikeBeautyAbGroup
            com.ss.android.ugc.aweme.property.aa$a r2 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r2
            int r1 = r1.mo83104b(r2)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r10 = r10.iterator()
        L_0x0027:
            boolean r3 = r10.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = r10.next()
            r5 = r3
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r5 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r5
            if (r5 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r5 = r5.getUlikeBeautyExtra()
            if (r5 == 0) goto L_0x0041
            java.lang.String r4 = r5.getResourceType()
        L_0x0041:
            java.lang.Object r5 = r2.get(r4)
            if (r5 != 0) goto L_0x004f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.put(r4, r5)
        L_0x004f:
            java.util.List r5 = (java.util.List) r5
            r5.add(r3)
            goto L_0x0027
        L_0x0055:
            java.util.Set r10 = r2.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x005d:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x013d
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r3 = com.p683ss.android.ugc.aweme.beauty.C23777a.m58348a()
            r5 = 1
            if (r3 == 0) goto L_0x007f
            java.lang.String r3 = "1"
            java.lang.Object r6 = r2.getKey()
            java.lang.String r6 = (java.lang.String) r6
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r6)
            r3 = r3 ^ r5
            if (r3 != 0) goto L_0x005d
        L_0x007f:
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Map r3 = (java.util.Map) r3
            java.util.Iterator r2 = r2.iterator()
        L_0x0090:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00bf
            java.lang.Object r6 = r2.next()
            r7 = r6
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r7 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r7
            if (r7 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r7 = r7.getUlikeBeautyExtra()
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.getGender()
            goto L_0x00ab
        L_0x00aa:
            r7 = r4
        L_0x00ab:
            java.lang.Object r8 = r3.get(r7)
            if (r8 != 0) goto L_0x00b9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r3.put(r7, r8)
        L_0x00b9:
            java.util.List r8 = (java.util.List) r8
            r8.add(r6)
            goto L_0x0090
        L_0x00bf:
            java.util.Set r2 = r3.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00c7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getValue()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x00dd:
            boolean r7 = r6.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x0101
            java.lang.Object r7 = r6.next()
            r9 = r7
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r9 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r9
            if (r9 == 0) goto L_0x00f8
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r9 = r9.getUlikeBeautyExtra()
            if (r9 == 0) goto L_0x00f8
            int r9 = r9.getAbGroup()
            goto L_0x00f9
        L_0x00f8:
            r9 = 0
        L_0x00f9:
            if (r9 != r1) goto L_0x00fd
            r9 = 1
            goto L_0x00fe
        L_0x00fd:
            r9 = 0
        L_0x00fe:
            if (r9 == 0) goto L_0x00dd
            goto L_0x0102
        L_0x0101:
            r7 = r4
        L_0x0102:
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r7 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r7
            if (r7 != 0) goto L_0x0137
            java.lang.Object r3 = r3.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0110:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0133
            java.lang.Object r6 = r3.next()
            r7 = r6
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r7 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r7
            if (r7 == 0) goto L_0x012a
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r7 = r7.getUlikeBeautyExtra()
            if (r7 == 0) goto L_0x012a
            int r7 = r7.getAbGroup()
            goto L_0x012b
        L_0x012a:
            r7 = 0
        L_0x012b:
            if (r7 != 0) goto L_0x012f
            r7 = 1
            goto L_0x0130
        L_0x012f:
            r7 = 0
        L_0x0130:
            if (r7 == 0) goto L_0x0110
            goto L_0x0134
        L_0x0133:
            r6 = r4
        L_0x0134:
            r7 = r6
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r7 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r7
        L_0x0137:
            if (r7 == 0) goto L_0x00c7
            r0.add(r7)
            goto L_0x00c7
        L_0x013d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.beauty.C23785h.m58372a(java.util.ArrayList):java.util.ArrayList");
    }

    /* renamed from: a */
    public static final boolean m58373a(String str, String str2) {
        C52711k.m112240b(str, "gender");
        C52711k.m112240b(str2, "resType");
        if (!C39629l.m88232a().mo58574e().mo83117a(C40796a.UlikeBeautyDownloadEnable)) {
            return false;
        }
        String b = m58374b(str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(File.separator);
        sb.append(FilterModel.CONFIG_FILE);
        return C50200d.m108346a(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0079 A[EDGE_INSN: B:52:0x0079->B:33:0x0079 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9 A[EDGE_INSN: B:56:0x00a9->B:47:0x00a9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m58374b(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "gender"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "resType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.util.ArrayList<com.ss.android.ugc.aweme.beauty.UlikeBeautyData> r0 = f63389a
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r0 == 0) goto L_0x001c
            java.util.ArrayList r0 = com.p683ss.android.ugc.aweme.beauty.C23781e.m58370a()
            if (r0 == 0) goto L_0x001c
            f63389a = r0
        L_0x001c:
            java.util.ArrayList<com.ss.android.ugc.aweme.beauty.UlikeBeautyData> r0 = f63389a
            r1 = 0
            if (r0 != 0) goto L_0x0022
            return r1
        L_0x0022:
            java.util.ArrayList<com.ss.android.ugc.aweme.beauty.UlikeBeautyData> r0 = f63389a
            if (r0 != 0) goto L_0x0029
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0029:
            java.util.ArrayList r0 = m58372a(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x0033:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0078
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r4 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r4
            if (r4 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r5 = r4.getUlikeBeautyExtra()
            if (r5 == 0) goto L_0x004d
            java.lang.String r5 = r5.getResourceType()
            goto L_0x004e
        L_0x004d:
            r5 = r1
        L_0x004e:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = r8
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L_0x0074
            if (r4 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r4 = r4.getUlikeBeautyExtra()
            if (r4 == 0) goto L_0x0066
            java.lang.String r4 = r4.getGender()
            goto L_0x0067
        L_0x0066:
            r4 = r1
        L_0x0067:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = r7
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x0074
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x0033
            goto L_0x0079
        L_0x0078:
            r3 = r1
        L_0x0079:
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r3 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r3
            if (r3 != 0) goto L_0x00ac
            java.util.Iterator r7 = r0.iterator()
        L_0x0081:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r7.next()
            r2 = r0
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r2 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r2
            if (r2 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r2 = r2.getUlikeBeautyExtra()
            if (r2 == 0) goto L_0x009b
            java.lang.String r2 = r2.getResourceType()
            goto L_0x009c
        L_0x009b:
            r2 = r1
        L_0x009c:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = r8
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0081
            goto L_0x00a9
        L_0x00a8:
            r0 = r1
        L_0x00a9:
            r3 = r0
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r3 = (com.p683ss.android.ugc.aweme.beauty.UlikeBeautyData) r3
        L_0x00ac:
            if (r3 == 0) goto L_0x00b3
            java.lang.String r7 = r3.getUnzipPath()
            return r7
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.beauty.C23785h.m58374b(java.lang.String, java.lang.String):java.lang.String");
    }
}
