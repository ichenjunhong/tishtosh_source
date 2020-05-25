package com.p683ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap */
public final class TextStickerTextWrap implements Parcelable, Cloneable {
    public static final Creator CREATOR = new C46711a();
    private final int selectionStart;
    private final Map<TextStickerString, List<InteractTextStructWrap>> strMap;
    private final C52847n<String, List<InteractTextStructWrap>> strPair;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap$a */
    public static class C46711a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (readInt != 0) {
                TextStickerString textStickerString = (TextStickerString) TextStickerString.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add((InteractTextStructWrap) InteractTextStructWrap.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
                linkedHashMap.put(textStickerString, arrayList);
                readInt--;
            }
            return new TextStickerTextWrap(linkedHashMap, (C52847n) parcel.readSerializable(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new TextStickerTextWrap[i];
        }
    }

    public TextStickerTextWrap() {
        this(null, null, 0, 7, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=d.n, code=d.n<java.lang.String, java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap>>, for r2v0, types: [d.n] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString, java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap>>, for r1v0, types: [java.util.Map] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap copy$default(com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap r0, java.util.Map<com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString, java.util.List<com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap>> r1, p2628d.C52847n<java.lang.String, java.util.List<com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap>> r2, int r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.util.Map<com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString, java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap>> r1 = r0.strMap
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            d.n<java.lang.String, java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap>> r2 = r0.strPair
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            int r3 = r0.selectionStart
        L_0x0012:
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap.copy$default(com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap, java.util.Map, d.n, int, int, java.lang.Object):com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap");
    }

    public final Map<TextStickerString, List<InteractTextStructWrap>> component1() {
        return this.strMap;
    }

    public final C52847n<String, List<InteractTextStructWrap>> component2() {
        return this.strPair;
    }

    public final int component3() {
        return this.selectionStart;
    }

    public final TextStickerTextWrap copy(Map<TextStickerString, ? extends List<InteractTextStructWrap>> map, C52847n<String, ? extends List<InteractTextStructWrap>> nVar, int i) {
        C52711k.m112240b(map, "strMap");
        C52711k.m112240b(nVar, "strPair");
        return new TextStickerTextWrap(map, nVar, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextStickerTextWrap) {
                TextStickerTextWrap textStickerTextWrap = (TextStickerTextWrap) obj;
                if (C52711k.m112239a((Object) this.strMap, (Object) textStickerTextWrap.strMap) && C52711k.m112239a((Object) this.strPair, (Object) textStickerTextWrap.strPair)) {
                    if (this.selectionStart == textStickerTextWrap.selectionStart) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final Map<TextStickerString, List<InteractTextStructWrap>> getStrMap() {
        return this.strMap;
    }

    public final C52847n<String, List<InteractTextStructWrap>> getStrPair() {
        return this.strPair;
    }

    public final int hashCode() {
        Map<TextStickerString, List<InteractTextStructWrap>> map = this.strMap;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        C52847n<String, List<InteractTextStructWrap>> nVar = this.strPair;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return ((hashCode + i) * 31) + this.selectionStart;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStickerTextWrap(strMap=");
        sb.append(this.strMap);
        sb.append(", strPair=");
        sb.append(this.strPair);
        sb.append(", selectionStart=");
        sb.append(this.selectionStart);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [java.util.Map$Entry, java.lang.Object]
      assigns: [java.lang.Object]
      uses: [java.util.Map$Entry]
      mth insns count: 28
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            java.lang.String r5 = "parcel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            java.util.Map<com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString, java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap>> r5 = r3.strMap
            int r0 = r5.size()
            r4.writeInt(r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0016:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r5.next()
            java.lang.Object r1 = r0.getKey()
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString r1 = (com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString) r1
            r2 = 0
            r1.writeToParcel(r4, r2)
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            r4.writeInt(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x003b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap r1 = (com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap) r1
            r1.writeToParcel(r4, r2)
            goto L_0x003b
        L_0x004b:
            d.n<java.lang.String, java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap>> r5 = r3.strPair
            r4.writeSerializable(r5)
            int r5 = r3.selectionStart
            r4.writeInt(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap.writeToParcel(android.os.Parcel, int):void");
    }

    public final TextStickerString[] getStickerStringArray() {
        Object[] array = this.strMap.keySet().toArray(new TextStickerString[0]);
        if (array != null) {
            return (TextStickerString[]) array;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final List<CreateAnchorInfo> getAnchorInfoList() {
        Iterable<InteractTextStructWrap> iterable = (Iterable) this.strPair.getSecond();
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (InteractTextStructWrap struct : iterable) {
            arrayList.add(struct.getStruct());
        }
        return (List) arrayList;
    }

    public final String[] getStrArray() {
        Iterable<TextStickerString> keySet = this.strMap.keySet();
        Collection arrayList = new ArrayList(C52575l.m112104a(keySet, 10));
        for (TextStickerString str : keySet) {
            arrayList.add(str.getStr());
        }
        Object[] array = ((List) arrayList).toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean isValid() {
        boolean z;
        boolean z2;
        if (this.strMap.isEmpty()) {
            return false;
        }
        TextStickerString[] stickerStringArray = getStickerStringArray();
        if (stickerStringArray == null) {
            return false;
        }
        for (TextStickerString textStickerString : stickerStringArray) {
            if (textStickerString.getStr().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String str = textStickerString.getStr();
                if (str != null) {
                    if (C52830p.m112447b(str).toString().length() > 0) {
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

    public final TextStickerTextWrap clone() {
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : this.strMap.entrySet()) {
            List arrayList = new ArrayList();
            for (InteractTextStructWrap copy$default : (Iterable) entry.getValue()) {
                arrayList.add(InteractTextStructWrap.copy$default(copy$default, null, null, 3, null));
            }
            linkedHashMap.put(new TextStickerString(((TextStickerString) entry.getKey()).getStr()), arrayList);
        }
        List arrayList2 = new ArrayList();
        for (InteractTextStructWrap copy$default2 : (Iterable) this.strPair.getSecond()) {
            arrayList2.add(InteractTextStructWrap.copy$default(copy$default2, null, null, 3, null));
        }
        return new TextStickerTextWrap(linkedHashMap, new C52847n(this.strPair.getFirst(), arrayList2), this.selectionStart);
    }

    public TextStickerTextWrap(Map<TextStickerString, ? extends List<InteractTextStructWrap>> map, C52847n<String, ? extends List<InteractTextStructWrap>> nVar, int i) {
        C52711k.m112240b(map, "strMap");
        C52711k.m112240b(nVar, "strPair");
        this.strMap = map;
        this.strPair = nVar;
        this.selectionStart = i;
    }

    public /* synthetic */ TextStickerTextWrap(Map map, C52847n nVar, int i, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            map = new HashMap();
        }
        if ((i2 & 2) != 0) {
            nVar = new C52847n("", new ArrayList());
        }
        if ((i2 & 4) != 0) {
            i = ((String) nVar.getFirst()).length();
        }
        this(map, nVar, i);
    }
}
