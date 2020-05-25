package com.p683ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.common.utility.C9432q;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.TextStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.e */
public final class C46717e {

    /* renamed from: a */
    public static int f117849a;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.e$a */
    public static final class C46718a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((InteractTextStructWrap) t).getRange().getStart()), Integer.valueOf(((InteractTextStructWrap) t2).getRange().getStart()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.e$b */
    public static final class C46719b extends C17956a<HashMap<String, String>> {
        C46719b() {
        }
    }

    /* renamed from: a */
    public static final float m101390a(float f) {
        return f * 0.7f;
    }

    /* renamed from: a */
    public static final boolean m101401a(List<InteractTextStructWrap> list, int i) {
        Object obj;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InteractTextStructWrap) obj).isValid(i)) {
                break;
            }
        }
        if (((InteractTextStructWrap) obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m101400a(List<TextStickerTextWrap> list) {
        Object obj;
        C52711k.m112240b(list, "$this$hasAnchor");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((Collection) ((TextStickerTextWrap) obj).getStrPair().getSecond()).isEmpty()) {
                break;
            }
        }
        return ((TextStickerTextWrap) obj) != null;
    }

    /* renamed from: a */
    public static final float m101391a(Context context) {
        C52711k.m112240b(context, "context");
        return C9432q.m18687b(context, 4.0f);
    }

    /* renamed from: a */
    public static final boolean m101398a(BaseShortVideoContext baseShortVideoContext) {
        C46715d b = m101402b(baseShortVideoContext);
        if (b != null) {
            return b.mo93787a();
        }
        return false;
    }

    /* renamed from: b */
    private static C46715d m101402b(BaseShortVideoContext baseShortVideoContext) {
        boolean z;
        C46715d dVar;
        if (baseShortVideoContext == null) {
            return null;
        }
        CharSequence charSequence = baseShortVideoContext.commerceData;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            dVar = (C46715d) new C17971f().mo34884a(baseShortVideoContext.commerceData, C46715d.class);
        } catch (Exception unused) {
            dVar = null;
        }
        return dVar;
    }

    /* renamed from: b */
    public static final boolean m101404b(List<TextStickerTextWrap> list) {
        Object obj;
        boolean z;
        C52711k.m112240b(list, "$this$hasText");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = (String) ((TextStickerTextWrap) obj).getStrPair().getFirst();
            if (str != null) {
                if (C52830p.m112447b(str).toString().length() > 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        if (((TextStickerTextWrap) obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final CreateAnchorInfo m101393a(AnchorTransData anchorTransData) {
        C46720f fVar;
        String str;
        C52711k.m112240b(anchorTransData, "$this$toWikiAnchorInfo");
        try {
            fVar = (C46720f) C39629l.m88232a().mo58566D().mo34884a(anchorTransData.getAnchorContent(), C46720f.class);
        } catch (Exception unused) {
            fVar = new C46720f("", "");
        }
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CreateAnchorInfo.KEY_ADD_FROM, 1);
            String jSONObject2 = jSONObject.toString();
            C52711k.m112236a((Object) jSONObject2, "jsonObject.toString()");
            str = jSONObject2;
        } catch (Exception unused2) {
            str = str2;
        }
        CreateAnchorInfo createAnchorInfo = new CreateAnchorInfo(anchorTransData.getBusinessType(), fVar.f117850a, "", fVar.f117851b, str);
        return createAnchorInfo;
    }

    /* renamed from: b */
    public static final List<TextStickerTextWrap> m101403b(VideoPublishEditModel videoPublishEditModel) {
        TextStickerData textStickerData;
        boolean z;
        if (videoPublishEditModel == null) {
            return new ArrayList<>();
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel != null) {
            List<StickerItemModel> list = infoStickerModel.stickers;
            if (list != null) {
                Iterable iterable = list;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (((StickerItemModel) next).type == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                Iterable<StickerItemModel> iterable2 = (List) arrayList;
                Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
                for (StickerItemModel stickerItemModel : iterable2) {
                    try {
                        textStickerData = (TextStickerData) C39629l.m88232a().mo58566D().mo34884a(stickerItemModel.extra, TextStickerData.class);
                    } catch (Exception unused) {
                        textStickerData = null;
                    }
                    arrayList2.add(textStickerData);
                }
                List b = C52575l.m112128b((Iterable<? extends T>) (List) arrayList2);
                if (b != null) {
                    Iterable<TextStickerData> iterable3 = b;
                    Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable3, 10));
                    for (TextStickerData textWrap : iterable3) {
                        arrayList3.add(textWrap.getTextWrap());
                    }
                    return (List) arrayList3;
                }
            }
        }
        return new ArrayList<>();
    }

    /* renamed from: c */
    public static final List<CreateAnchorInfo> m101406c(List<? extends InteractStickerStruct> list) {
        TextStruct textStruct;
        List list2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterable iterable = list;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            if (((InteractStickerStruct) next).getType() == 5) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        Iterable<InteractStickerStruct> iterable2 = (List) arrayList2;
        Collection arrayList3 = new ArrayList();
        for (InteractStickerStruct textStruct2 : iterable2) {
            try {
                textStruct = (TextStruct) C39629l.m88232a().mo58566D().mo34884a(textStruct2.getTextStruct(), TextStruct.class);
            } catch (Exception unused) {
                textStruct = null;
            }
            if (textStruct != null) {
                list2 = textStruct.getAnchors();
                if (list2 != null) {
                    C52575l.m112108a(arrayList3, (Iterable) list2);
                }
            }
            list2 = new ArrayList();
            C52575l.m112108a(arrayList3, (Iterable) list2);
        }
        arrayList.addAll((List) arrayList3);
        return arrayList;
    }

    /* renamed from: d */
    public static final List<CreateAnchorInfo> m101407d(List<? extends InteractStickerStruct> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CreateAnchorInfo.KEY_ADD_FROM, 1);
        String jSONObject2 = jSONObject.toString();
        C52711k.m112236a((Object) jSONObject2, "jsonObject.toString()");
        Iterable iterable = list;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            if (((InteractStickerStruct) next).getType() == 6) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        for (InteractStickerStruct attr : (List) arrayList2) {
            try {
                Object a = C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34885a(attr.getAttr(), new C46719b().f49843c);
                C52711k.m112236a(a, "CameraClient.getAPI().ne…ring, String>>() {}.type)");
                HashMap hashMap = (HashMap) a;
                String str = (String) hashMap.get("donation_name");
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                String str3 = (String) hashMap.get("donation_url");
                if (str3 == null) {
                    str3 = "";
                }
                CreateAnchorInfo createAnchorInfo = new CreateAnchorInfo(19, str2, str3, "", jSONObject2);
                arrayList.add(createAnchorInfo);
            } catch (Exception e) {
                C45407ay.m98971b(e.getMessage());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final TextStickerTextWrap m101394a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextStickerTextWrap textStickerTextWrap = new TextStickerTextWrap(null, null, 0, 7, null);
            return textStickerTextWrap;
        }
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(new TextStickerString(str), new ArrayList());
        TextStickerTextWrap textStickerTextWrap2 = new TextStickerTextWrap(linkedHashMap, new C52847n(str, new ArrayList()), 0, 4, null);
        return textStickerTextWrap2;
    }

    /* renamed from: b */
    public static final boolean m101405b(String[] strArr) {
        boolean z;
        boolean z2;
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            CharSequence charSequence = str;
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (str != null) {
                    if (C52830p.m112447b(charSequence).toString().length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final TextStickerTextWrap m101395a(String[] strArr) {
        boolean z;
        boolean z2 = true;
        if (strArr != null) {
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            TextStickerTextWrap textStickerTextWrap = new TextStickerTextWrap(null, null, 0, 7, null);
            return textStickerTextWrap;
        }
        Map linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            linkedHashMap.put(new TextStickerString(str), new ArrayList());
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "wholeStrBuilder.toString()");
        TextStickerTextWrap textStickerTextWrap2 = new TextStickerTextWrap(linkedHashMap, new C52847n(sb2, new ArrayList()), 0, 4, null);
        return textStickerTextWrap2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A[EDGE_INSN: B:37:0x008e->B:29:0x008e ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m101399a(com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            java.lang.String r0 = "$this$isHasEditPageWikiAnchor"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.g r7 = r7.getMainBusinessContext()
            r0 = 1
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.f[] r1 = new com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f[r0]
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.f r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f.TRACK_PAGE_EDIT
            r3 = 0
            r1[r3] = r2
            java.util.List r7 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d.m95727a(r7, r1)
            if (r7 != 0) goto L_0x0018
            return r3
        L_0x0018:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r7 = r7.iterator()
        L_0x0025:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r7.next()
            r4 = r2
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r4 = (com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r4
            java.lang.String r5 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            int r4 = r4.getType()
            r5 = 5
            if (r4 != r5) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            if (r4 == 0) goto L_0x0025
            r1.add(r2)
            goto L_0x0025
        L_0x0047:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r7 = r1.iterator()
        L_0x004f:
            boolean r1 = r7.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x008d
            java.lang.Object r1 = r7.next()
            r4 = r1
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r4 = (com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r4
            com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()     // Catch:{ Exception -> 0x0077 }
            com.google.gson.f r5 = r5.mo58566D()     // Catch:{ Exception -> 0x0077 }
            java.lang.String r6 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r4 = r4.getTextStruct()     // Catch:{ Exception -> 0x0077 }
            java.lang.Class<com.ss.android.ugc.aweme.sticker.data.TextStruct> r6 = com.p683ss.android.ugc.aweme.sticker.data.TextStruct.class
            java.lang.Object r4 = r5.mo34884a(r4, r6)     // Catch:{ Exception -> 0x0077 }
            com.ss.android.ugc.aweme.sticker.data.TextStruct r4 = (com.p683ss.android.ugc.aweme.sticker.data.TextStruct) r4     // Catch:{ Exception -> 0x0077 }
            r2 = r4
        L_0x0077:
            if (r2 == 0) goto L_0x0089
            java.util.List r2 = r2.getAnchors()
            if (r2 == 0) goto L_0x0089
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0089
            r2 = 1
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            if (r2 == 0) goto L_0x004f
            goto L_0x008e
        L_0x008d:
            r1 = r2
        L_0x008e:
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r1 = (com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r1
            if (r1 == 0) goto L_0x0093
            return r0
        L_0x0093:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e.m101399a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    /* renamed from: a */
    public static final void m101397a(List<InteractTextStructWrap> list, InteractTextStructWrap interactTextStructWrap) {
        if (list.remove(interactTextStructWrap)) {
            int end = interactTextStructWrap.getRange().getEnd() - interactTextStructWrap.getRange().getStart();
            for (InteractTextStructWrap interactTextStructWrap2 : list) {
                if (interactTextStructWrap2.getRange().getStart() >= interactTextStructWrap.getRange().getEnd()) {
                    TextStickerTextUnderlineIndexRange range = interactTextStructWrap2.getRange();
                    range.setStart(range.getStart() - end);
                    TextStickerTextUnderlineIndexRange range2 = interactTextStructWrap2.getRange();
                    range2.setEnd(range2.getEnd() - end);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m101396a(List<InteractTextStructWrap> list, int i, int i2) {
        if (list != null) {
            for (InteractTextStructWrap interactTextStructWrap : list) {
                if (interactTextStructWrap.getRange().getStart() >= i && i2 != 0) {
                    TextStickerTextUnderlineIndexRange range = interactTextStructWrap.getRange();
                    range.setStart(range.getStart() + i2);
                    TextStickerTextUnderlineIndexRange range2 = interactTextStructWrap.getRange();
                    range2.setEnd(range2.getEnd() + i2);
                }
            }
        }
    }

    /* renamed from: a */
    public static final int m101392a(Paint paint, String str, int i, int i2) {
        boolean z;
        C52711k.m112240b(paint, "$this$getTextWidthIncludeSpace");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || i < 0 || i2 > str.length() || i >= i2) {
            return 0;
        }
        if (str != null) {
            String substring = str.substring(i, i2);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            float[] fArr = new float[substring.length()];
            paint.getTextWidths(substring, fArr);
            int i3 = 0;
            for (float f : fArr) {
                i3 += (int) Math.ceil((double) f);
            }
            return i3;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }
}
