package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifpanel;

import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.C33600a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33605c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1824a.C33593a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.ListViewModel;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel */
public final class GifSearchViewModel extends ListViewModel<C29285a> {

    /* renamed from: d */
    public static final C33579a f87034d = new C33579a(null);

    /* renamed from: a */
    public Integer f87035a = Integer.valueOf(0);

    /* renamed from: b */
    public boolean f87036b;

    /* renamed from: c */
    public Boolean f87037c = Boolean.valueOf(false);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel$a */
    public static final class C33579a {
        private C33579a() {
        }

        public /* synthetic */ C33579a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel$b */
    public static final class C33580b implements C33593a<C33605c> {

        /* renamed from: a */
        final /* synthetic */ GifSearchViewModel f87038a;

        /* renamed from: a */
        public final void mo70990a() {
            this.f87038a.f87036b = false;
            Integer num = this.f87038a.f87035a;
            if (num != null && num.intValue() == 0) {
                this.f87038a.mo71921a_(null);
            }
            Integer num2 = this.f87038a.f87035a;
            if (num2 == null) {
                C52711k.m112234a();
            }
            if (num2.intValue() > 0) {
                this.f87038a.mo71923b_(null);
            }
        }

        C33580b(GifSearchViewModel gifSearchViewModel) {
            this.f87038a = gifSearchViewModel;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo70992b(Object obj) {
            C52711k.m112240b((C33605c) obj, "response");
            this.f87038a.f87036b = false;
        }

        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
        /* JADX WARNING: type inference failed for: r3v4, types: [java.util.List] */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.util.List, java.lang.Integer]
          uses: [java.lang.Integer, java.util.List]
          mth insns count: 107
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo70991a(java.lang.Object r8) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.c r8 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33605c) r8
                java.lang.String r0 = "response"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel r0 = r7.f87038a
                r1 = 0
                r0.f87036b = r1
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r0 = r8.f87099c
                if (r0 == 0) goto L_0x010b
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r0 = r8.f87099c
                if (r0 != 0) goto L_0x0017
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0017:
                java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b> r0 = r0.f87104a
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
                if (r0 != 0) goto L_0x010b
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r1 = r8.f87099c
                if (r1 != 0) goto L_0x002f
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x002f:
                java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b> r1 = r1.f87104a
                if (r1 != 0) goto L_0x0036
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0036:
                java.util.Iterator r1 = r1.iterator()
            L_0x003a:
                boolean r2 = r1.hasNext()
                r3 = 0
                if (r2 == 0) goto L_0x00af
                java.lang.Object r2 = r1.next()
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33604b) r2
                com.ss.android.ugc.aweme.emoji.f.a r4 = new com.ss.android.ugc.aweme.emoji.f.a
                r4.<init>()
                java.lang.String r5 = r2.f87094a
                r4.setAnimateType(r5)
                r5 = 3
                r4.setStickerType(r5)
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.d r5 = r2.f87095b
                if (r5 == 0) goto L_0x0068
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b r5 = r5.f87100a
                if (r5 == 0) goto L_0x0068
                java.lang.String r5 = r5.f87074b
                if (r5 == 0) goto L_0x0068
                int r5 = java.lang.Integer.parseInt(r5)
                r4.setWidth(r5)
            L_0x0068:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.d r5 = r2.f87095b
                if (r5 == 0) goto L_0x007b
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b r5 = r5.f87100a
                if (r5 == 0) goto L_0x007b
                java.lang.String r5 = r5.f87075c
                if (r5 == 0) goto L_0x007b
                int r5 = java.lang.Integer.parseInt(r5)
                r4.setHeight(r5)
            L_0x007b:
                android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r6 = 2132545431(0x7f1c0f97, float:2.0744051E38)
                java.lang.String r5 = r5.getString(r6)
                r4.setDisplayName(r5)
                com.ss.android.ugc.aweme.base.model.UrlModel r5 = new com.ss.android.ugc.aweme.base.model.UrlModel
                r5.<init>()
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.d r2 = r2.f87095b
                if (r2 == 0) goto L_0x009e
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b r2 = r2.f87100a
                if (r2 == 0) goto L_0x009e
                java.lang.String r2 = r2.f87073a
                if (r2 == 0) goto L_0x009e
                java.util.List r3 = p2628d.p2629a.C52575l.m112092a(r2)
            L_0x009e:
                r5.setUrlList(r3)
                r4.setAnimateUrl(r5)
                com.ss.android.ugc.aweme.emoji.a.a r2 = new com.ss.android.ugc.aweme.emoji.a.a
                r2.<init>()
                r2.f76668d = r4
                r0.add(r2)
                goto L_0x003a
            L_0x00af:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel r1 = r7.f87038a
                java.lang.Integer r1 = r1.f87035a
                if (r1 != 0) goto L_0x00b8
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00b8:
                int r1 = r1.intValue()
                if (r1 <= 0) goto L_0x00df
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel r1 = r7.f87038a
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r2 = r8.f87099c
                if (r2 != 0) goto L_0x00c7
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00c7:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.f r2 = r2.f87105b
                if (r2 == 0) goto L_0x00d2
                boolean r2 = r2.f87102a
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L_0x00d3
            L_0x00d2:
                r2 = r3
            L_0x00d3:
                if (r2 != 0) goto L_0x00d8
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00d8:
                boolean r2 = r2.booleanValue()
                r1.mo71927e(r0, r2)
            L_0x00df:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel r0 = r7.f87038a
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r1 = r8.f87099c
                if (r1 != 0) goto L_0x00e8
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00e8:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.f r1 = r1.f87105b
                if (r1 == 0) goto L_0x00f3
                boolean r1 = r1.f87102a
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L_0x00f4
            L_0x00f3:
                r1 = r3
            L_0x00f4:
                r0.f87037c = r1
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel r0 = r7.f87038a
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r8 = r8.f87099c
                if (r8 != 0) goto L_0x00ff
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00ff:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.f r8 = r8.f87105b
                if (r8 == 0) goto L_0x0109
                int r8 = r8.f87103b
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            L_0x0109:
                r0.f87035a = r3
            L_0x010b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifpanel.GifSearchViewModel.C33580b.mo70991a(java.lang.Object):void");
        }

        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
        /* JADX WARNING: type inference failed for: r3v4, types: [java.util.List] */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.util.List, java.lang.Integer]
          uses: [java.lang.Integer, java.util.List]
          mth insns count: 106
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo70993c(java.lang.Object r8) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.c r8 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33605c) r8
                java.lang.String r0 = "response"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel r0 = r7.f87038a
                r1 = 0
                r0.f87036b = r1
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r0 = r8.f87099c
                if (r0 == 0) goto L_0x0109
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r0 = r8.f87099c
                if (r0 != 0) goto L_0x0017
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0017:
                java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b> r0 = r0.f87104a
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
                if (r0 != 0) goto L_0x0109
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r1 = r8.f87099c
                if (r1 != 0) goto L_0x002f
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x002f:
                java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b> r1 = r1.f87104a
                if (r1 != 0) goto L_0x0036
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0036:
                java.util.Iterator r1 = r1.iterator()
            L_0x003a:
                boolean r2 = r1.hasNext()
                r3 = 0
                if (r2 == 0) goto L_0x00af
                java.lang.Object r2 = r1.next()
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33604b) r2
                com.ss.android.ugc.aweme.emoji.f.a r4 = new com.ss.android.ugc.aweme.emoji.f.a
                r4.<init>()
                java.lang.String r5 = r2.f87094a
                r4.setAnimateType(r5)
                r5 = 3
                r4.setStickerType(r5)
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.d r5 = r2.f87095b
                if (r5 == 0) goto L_0x0068
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b r5 = r5.f87100a
                if (r5 == 0) goto L_0x0068
                java.lang.String r5 = r5.f87074b
                if (r5 == 0) goto L_0x0068
                int r5 = java.lang.Integer.parseInt(r5)
                r4.setWidth(r5)
            L_0x0068:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.d r5 = r2.f87095b
                if (r5 == 0) goto L_0x007b
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b r5 = r5.f87100a
                if (r5 == 0) goto L_0x007b
                java.lang.String r5 = r5.f87075c
                if (r5 == 0) goto L_0x007b
                int r5 = java.lang.Integer.parseInt(r5)
                r4.setHeight(r5)
            L_0x007b:
                android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r6 = 2132545431(0x7f1c0f97, float:2.0744051E38)
                java.lang.String r5 = r5.getString(r6)
                r4.setDisplayName(r5)
                com.ss.android.ugc.aweme.base.model.UrlModel r5 = new com.ss.android.ugc.aweme.base.model.UrlModel
                r5.<init>()
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.d r2 = r2.f87095b
                if (r2 == 0) goto L_0x009e
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b r2 = r2.f87100a
                if (r2 == 0) goto L_0x009e
                java.lang.String r2 = r2.f87073a
                if (r2 == 0) goto L_0x009e
                java.util.List r3 = p2628d.p2629a.C52575l.m112092a(r2)
            L_0x009e:
                r5.setUrlList(r3)
                r4.setAnimateUrl(r5)
                com.ss.android.ugc.aweme.emoji.a.a r2 = new com.ss.android.ugc.aweme.emoji.a.a
                r2.<init>()
                r2.f76668d = r4
                r0.add(r2)
                goto L_0x003a
            L_0x00af:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel r1 = r7.f87038a
                java.lang.Integer r1 = r1.f87035a
                if (r1 != 0) goto L_0x00b6
                goto L_0x00dd
            L_0x00b6:
                int r1 = r1.intValue()
                if (r1 != 0) goto L_0x00dd
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel r1 = r7.f87038a
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r2 = r8.f87099c
                if (r2 != 0) goto L_0x00c5
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00c5:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.f r2 = r2.f87105b
                if (r2 == 0) goto L_0x00d0
                boolean r2 = r2.f87102a
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L_0x00d1
            L_0x00d0:
                r2 = r3
            L_0x00d1:
                if (r2 != 0) goto L_0x00d6
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00d6:
                boolean r2 = r2.booleanValue()
                r1.mo71926d(r0, r2)
            L_0x00dd:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel r0 = r7.f87038a
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r1 = r8.f87099c
                if (r1 != 0) goto L_0x00e6
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00e6:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.f r1 = r1.f87105b
                if (r1 == 0) goto L_0x00f1
                boolean r1 = r1.f87102a
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L_0x00f2
            L_0x00f1:
                r1 = r3
            L_0x00f2:
                r0.f87037c = r1
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.GifSearchViewModel r0 = r7.f87038a
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g r8 = r8.f87099c
                if (r8 != 0) goto L_0x00fd
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00fd:
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.f r8 = r8.f87105b
                if (r8 == 0) goto L_0x0107
                int r8 = r8.f87103b
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            L_0x0107:
                r0.f87035a = r3
            L_0x0109:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifpanel.GifSearchViewModel.C33580b.mo70993c(java.lang.Object):void");
        }
    }

    /* renamed from: a */
    public final void mo71032a() {
        if (!this.f87036b) {
            this.f87036b = true;
            Integer num = this.f87035a;
            if (num == null) {
                C52711k.m112234a();
            }
            if (num.intValue() <= 0) {
                mo71930j();
            }
            Integer num2 = this.f87035a;
            if (num2 == null) {
                C52711k.m112234a();
            }
            C33600a.m76995a(num2.intValue(), new C33580b(this));
        }
    }
}
