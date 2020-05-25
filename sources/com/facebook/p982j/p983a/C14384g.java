package com.facebook.p982j.p983a;

import com.facebook.p982j.p984b.C14418f;

/* renamed from: com.facebook.j.a.g */
public final class C14384g {

    /* renamed from: a */
    static final C14370a<C14418f> f37382a = new C14370a<C14418f>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object mo26577b(android.util.JsonReader r19) throws java.io.IOException {
            /*
                r18 = this;
                r0 = r19
                r19.beginObject()
                com.facebook.j.b.f$a r1 = new com.facebook.j.b.f$a
                r1.<init>()
            L_0x000a:
                boolean r2 = r19.hasNext()
                if (r2 == 0) goto L_0x016e
                java.lang.String r2 = r19.nextName()
                int r3 = r2.hashCode()
                r4 = 0
                r5 = -1
                switch(r3) {
                    case -1923169788: goto L_0x009e;
                    case -1833928446: goto L_0x0093;
                    case -1806353256: goto L_0x0089;
                    case -1530780935: goto L_0x007f;
                    case -1446309207: goto L_0x0075;
                    case -259686756: goto L_0x006b;
                    case -247981657: goto L_0x0061;
                    case -241402625: goto L_0x0057;
                    case 3373707: goto L_0x004d;
                    case 94742904: goto L_0x0042;
                    case 152226438: goto L_0x0037;
                    case 574151256: goto L_0x002b;
                    case 725843758: goto L_0x001f;
                    default: goto L_0x001d;
                }
            L_0x001d:
                goto L_0x00a9
            L_0x001f:
                java.lang.String r3 = "stroke_line_cap"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 11
                goto L_0x00aa
            L_0x002b:
                java.lang.String r3 = "feature_animations"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 9
                goto L_0x00aa
            L_0x0037:
                java.lang.String r3 = "key_frames"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 6
                goto L_0x00aa
            L_0x0042:
                java.lang.String r3 = "class"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 12
                goto L_0x00aa
            L_0x004d:
                java.lang.String r3 = "name"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 0
                goto L_0x00aa
            L_0x0057:
                java.lang.String r3 = "stroke_width"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 3
                goto L_0x00aa
            L_0x0061:
                java.lang.String r3 = "fill_color"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 1
                goto L_0x00aa
            L_0x006b:
                java.lang.String r3 = "stroke_color"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 2
                goto L_0x00aa
            L_0x0075:
                java.lang.String r3 = "to_frame"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 5
                goto L_0x00aa
            L_0x007f:
                java.lang.String r3 = "timing_curves"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 7
                goto L_0x00aa
            L_0x0089:
                java.lang.String r3 = "from_frame"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 4
                goto L_0x00aa
            L_0x0093:
                java.lang.String r3 = "effects"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 10
                goto L_0x00aa
            L_0x009e:
                java.lang.String r3 = "animation_group"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 8
                goto L_0x00aa
            L_0x00a9:
                r2 = -1
            L_0x00aa:
                switch(r2) {
                    case 0: goto L_0x0166;
                    case 1: goto L_0x015a;
                    case 2: goto L_0x014e;
                    case 3: goto L_0x0145;
                    case 4: goto L_0x013c;
                    case 5: goto L_0x0133;
                    case 6: goto L_0x0129;
                    case 7: goto L_0x0121;
                    case 8: goto L_0x0119;
                    case 9: goto L_0x010f;
                    case 10: goto L_0x00cc;
                    case 11: goto L_0x00ba;
                    case 12: goto L_0x00b2;
                    default: goto L_0x00ad;
                }
            L_0x00ad:
                r19.skipValue()
                goto L_0x000a
            L_0x00b2:
                java.lang.String r2 = r19.nextString()
                r1.f37457n = r2
                goto L_0x000a
            L_0x00ba:
                java.lang.String r2 = r19.nextString()
                java.util.Locale r3 = java.util.Locale.US
                java.lang.String r2 = r2.toUpperCase(r3)
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.valueOf(r2)
                r1.f37453j = r2
                goto L_0x000a
            L_0x00cc:
                r19.beginObject()
                com.facebook.j.b.g$a r2 = new com.facebook.j.b.g$a
                r2.<init>()
            L_0x00d4:
                boolean r3 = r19.hasNext()
                if (r3 == 0) goto L_0x0100
                java.lang.String r3 = r19.nextName()
                int r6 = r3.hashCode()
                r7 = 89650992(0x557f730, float:1.01546526E-35)
                if (r6 == r7) goto L_0x00e8
                goto L_0x00f2
            L_0x00e8:
                java.lang.String r6 = "gradient"
                boolean r3 = r3.equals(r6)
                if (r3 == 0) goto L_0x00f2
                r3 = 0
                goto L_0x00f3
            L_0x00f2:
                r3 = -1
            L_0x00f3:
                if (r3 == 0) goto L_0x00f9
                r19.skipValue()
                goto L_0x00d4
            L_0x00f9:
                com.facebook.j.b.i r3 = com.facebook.p982j.p983a.C14389j.m29498a(r19)
                r2.f37459a = r3
                goto L_0x00d4
            L_0x0100:
                r19.endObject()
                com.facebook.j.b.g r3 = new com.facebook.j.b.g
                com.facebook.j.b.i r2 = r2.f37459a
                r4 = 0
                r3.<init>(r2)
                r1.f37456m = r3
                goto L_0x000a
            L_0x010f:
                com.facebook.j.a.a<com.facebook.j.b.b> r2 = com.facebook.p982j.p983a.C14376c.f37378a
                java.util.List r2 = r2.mo26576a(r0)
                r1.f37454k = r2
                goto L_0x000a
            L_0x0119:
                int r2 = r19.nextInt()
                r1.f37452i = r2
                goto L_0x000a
            L_0x0121:
                float[][][] r2 = com.facebook.p982j.p983a.C14371b.m29486b(r19)
                r1.f37451h = r2
                goto L_0x000a
            L_0x0129:
                com.facebook.j.a.a<com.facebook.j.b.h> r2 = com.facebook.p982j.p983a.C14386h.f37383a
                java.util.List r2 = r2.mo26576a(r0)
                r1.f37450g = r2
                goto L_0x000a
            L_0x0133:
                double r2 = r19.nextDouble()
                float r2 = (float) r2
                r1.f37449f = r2
                goto L_0x000a
            L_0x013c:
                double r2 = r19.nextDouble()
                float r2 = (float) r2
                r1.f37448e = r2
                goto L_0x000a
            L_0x0145:
                double r2 = r19.nextDouble()
                float r2 = (float) r2
                r1.f37447d = r2
                goto L_0x000a
            L_0x014e:
                java.lang.String r2 = r19.nextString()
                int r2 = android.graphics.Color.parseColor(r2)
                r1.f37446c = r2
                goto L_0x000a
            L_0x015a:
                java.lang.String r2 = r19.nextString()
                int r2 = android.graphics.Color.parseColor(r2)
                r1.f37445b = r2
                goto L_0x000a
            L_0x0166:
                java.lang.String r2 = r19.nextString()
                r1.f37444a = r2
                goto L_0x000a
            L_0x016e:
                r19.endObject()
                com.facebook.j.b.f r0 = new com.facebook.j.b.f
                java.lang.String r4 = r1.f37444a
                int r5 = r1.f37445b
                int r6 = r1.f37446c
                float r7 = r1.f37447d
                float r8 = r1.f37448e
                float r9 = r1.f37449f
                java.util.List<com.facebook.j.b.h> r10 = r1.f37450g
                float[][][] r11 = r1.f37451h
                int r12 = r1.f37452i
                android.graphics.Paint$Cap r13 = r1.f37453j
                java.util.List<com.facebook.j.b.b> r14 = r1.f37454k
                float[] r15 = r1.f37455l
                com.facebook.j.b.g r2 = r1.f37456m
                java.lang.String r1 = r1.f37457n
                r3 = r0
                r16 = r2
                r17 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p982j.p983a.C14384g.C143851.mo26577b(android.util.JsonReader):java.lang.Object");
        }
    };
}
