package com.bytedance.android.livesdk.gift.dialog.view;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.h */
final /* synthetic */ class C7266h implements C0199s {

    /* renamed from: a */
    private final LiveGiftListWidget f19757a;

    C7266h(LiveGiftListWidget liveGiftListWidget) {
        this.f19757a = liveGiftListWidget;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.List<com.bytedance.android.livesdk.gift.model.a.h>] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v11, types: [android.support.v7.widget.RecyclerView$v] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /*  JADX ERROR: UnsupportedOperationException in pass: LoopRegionVisitor
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:438)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:334)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:270)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:75)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:59)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:57)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:57)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:57)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1083)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:57)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:57)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:57)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:57)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1083)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:57)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:57)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:57)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:57)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1083)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:57)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:57)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:57)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:57)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1083)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:57)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:57)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:57)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:53)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onChanged(java.lang.Object r15) {
        /*
            r14 = this;
            com.bytedance.android.livesdk.gift.dialog.view.LiveGiftListWidget r0 = r14.f19757a
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r15 = (com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b) r15
            if (r15 == 0) goto L_0x01fd
            int r1 = r15.f19851a
            r2 = 0
            r3 = 8
            r4 = 1
            r5 = 0
            switch(r1) {
                case 1: goto L_0x00ef;
                case 2: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x01fd
        L_0x0012:
            com.bytedance.android.livesdk.gift.model.a.b r1 = r15.f19852b
            if (r1 == 0) goto L_0x01fd
            long r6 = r1.mo13919p()
            long r8 = r0.f19734i
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x00e2
            android.support.v7.widget.RecyclerView r6 = r0.f19727b
            if (r6 == 0) goto L_0x0076
            com.bytedance.android.livesdk.gift.dialog.view.f r6 = r0.f19728c
            if (r6 == 0) goto L_0x0076
            if (r1 != 0) goto L_0x002b
            goto L_0x0076
        L_0x002b:
            com.bytedance.android.livesdk.gift.dialog.view.f r6 = r0.f19728c
            long r7 = r1.mo13919p()
            java.util.List<com.bytedance.android.livesdk.gift.model.a.b> r6 = r6.f19753a
            java.util.Iterator r6 = r6.iterator()
        L_0x0037:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x004e
            java.lang.Object r9 = r6.next()
            com.bytedance.android.livesdk.gift.model.a.b r9 = (com.bytedance.android.livesdk.gift.model.p379a.C7491b) r9
            if (r9 == 0) goto L_0x0037
            long r10 = r9.mo13919p()
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x0037
            goto L_0x004f
        L_0x004e:
            r9 = r2
        L_0x004f:
            if (r9 != 0) goto L_0x0052
            goto L_0x0076
        L_0x0052:
            com.bytedance.android.livesdk.gift.dialog.view.f r2 = r0.f19728c
            r6 = 0
        L_0x0055:
            java.util.List<com.bytedance.android.livesdk.gift.model.a.b> r7 = r2.f19753a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x006f
            java.util.List<com.bytedance.android.livesdk.gift.model.a.b> r7 = r2.f19753a
            java.lang.Object r7 = r7.get(r6)
            com.bytedance.android.livesdk.gift.model.a.b r7 = (com.bytedance.android.livesdk.gift.model.p379a.C7491b) r7
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            int r6 = r6 + 1
            goto L_0x0055
        L_0x006f:
            r6 = -1
        L_0x0070:
            android.support.v7.widget.RecyclerView r0 = r0.f19727b
            android.support.v7.widget.RecyclerView$v r2 = r0.mo4847f(r6)
        L_0x0076:
            boolean r0 = r2 instanceof com.bytedance.android.livesdk.gift.dialog.view.C7267i
            if (r0 == 0) goto L_0x00e1
            T r0 = r1.f20516d
            boolean r0 = r0 instanceof com.bytedance.android.livesdk.gift.model.C7505d
            if (r0 == 0) goto L_0x0087
            T r0 = r1.f20516d
            com.bytedance.android.livesdk.gift.model.d r0 = (com.bytedance.android.livesdk.gift.model.C7505d) r0
            int r0 = r0.f20545f
            goto L_0x0099
        L_0x0087:
            T r0 = r1.f20516d
            boolean r0 = r0 instanceof com.bytedance.android.livesdk.gift.model.Prop
            if (r0 == 0) goto L_0x0098
            T r0 = r1.f20516d
            com.bytedance.android.livesdk.gift.model.Prop r0 = (com.bytedance.android.livesdk.gift.model.Prop) r0
            com.bytedance.android.livesdk.gift.model.d r0 = r0.gift
            if (r0 == 0) goto L_0x0098
            int r0 = r0.f20545f
            goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            int r15 = r15.mo13544b()
            int r0 = r0 * r15
            if (r0 <= 0) goto L_0x00e1
            com.bytedance.android.livesdk.gift.dialog.view.i r2 = (com.bytedance.android.livesdk.gift.dialog.view.C7267i) r2
            android.view.View r15 = r2.itemView
            android.content.Context r15 = r15.getContext()
            if (r15 == 0) goto L_0x01fd
            com.bytedance.android.livesdk.gift.dialog.view.LiveSendGiftAnimationView r1 = r2.f19767j
            if (r1 != 0) goto L_0x00b1
            goto L_0x01fd
        L_0x00b1:
            com.bytedance.android.livesdk.gift.dialog.view.LiveGiftComboView r1 = r2.f19770m
            if (r1 == 0) goto L_0x00c7
            com.bytedance.android.livesdk.gift.dialog.view.LiveGiftComboView r1 = r2.f19770m
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x00c7
            com.bytedance.android.livesdk.gift.dialog.view.LiveGiftComboView r1 = r2.f19770m
            r1.setVisibility(r3)
            com.bytedance.android.livesdk.gift.dialog.view.LiveSendGiftAnimationView r1 = r2.f19767j
            r1.setVisibility(r5)
        L_0x00c7:
            com.bytedance.android.livesdk.gift.dialog.view.LiveSendGiftAnimationView r1 = r2.f19767j
            android.content.res.Resources r15 = r15.getResources()
            r2 = 2132550198(0x7f1c2236, float:2.075372E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r5] = r0
            java.lang.String r15 = r15.getString(r2, r3)
            android.widget.TextView r0 = r1.f19742b
            r0.setText(r15)
        L_0x00e1:
            return
        L_0x00e2:
            com.bytedance.android.livesdk.gift.dialog.view.f r15 = r0.f19728c
            r15.notifyDataSetChanged()
            long r1 = r1.mo13919p()
            r0.f19734i = r1
            goto L_0x01fd
        L_0x00ef:
            int r1 = r15.f19857g
            r6 = 5
            if (r1 != r6) goto L_0x00f7
            java.util.List<com.bytedance.android.livesdk.gift.model.a.h> r2 = r15.f19854d
            goto L_0x011a
        L_0x00f7:
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftPage> r1 = r15.f19853c
            java.util.Iterator r1 = r1.iterator()
        L_0x00fd:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x011a
            java.lang.Object r6 = r1.next()
            com.bytedance.android.livesdk.gift.model.GiftPage r6 = (com.bytedance.android.livesdk.gift.model.GiftPage) r6
            if (r6 == 0) goto L_0x00fd
            int r7 = r15.f19857g
            int r8 = r6.pageType
            if (r7 != r8) goto L_0x00fd
            java.util.Map<com.bytedance.android.livesdk.gift.model.GiftPage, java.util.List<com.bytedance.android.livesdk.gift.model.a.b>> r1 = r15.f19856f
            java.lang.Object r1 = r1.get(r6)
            r2 = r1
            java.util.List r2 = (java.util.List) r2
        L_0x011a:
            if (r2 == 0) goto L_0x01e5
            com.bytedance.android.livesdk.gift.dialog.view.f r1 = r0.f19728c
            java.util.List<com.bytedance.android.livesdk.gift.model.a.b> r1 = r1.f19753a
            java.util.Iterator r1 = r1.iterator()
        L_0x0124:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0135
            java.lang.Object r6 = r1.next()
            com.bytedance.android.livesdk.gift.model.a.b r6 = (com.bytedance.android.livesdk.gift.model.p379a.C7491b) r6
            if (r6 == 0) goto L_0x0124
            r6.f20514b = r5
            goto L_0x0124
        L_0x0135:
            com.bytedance.android.livesdk.gift.dialog.view.f r1 = r0.f19728c
            java.util.List<com.bytedance.android.livesdk.gift.model.a.b> r1 = r1.f19753a
            r1.clear()
            com.bytedance.android.livesdk.gift.dialog.view.f r1 = r0.f19728c
            if (r2 == 0) goto L_0x0193
            java.util.List<com.bytedance.android.livesdk.gift.model.a.b> r6 = r1.f19753a
            r6.clear()
            java.util.List<com.bytedance.android.livesdk.gift.model.a.b> r1 = r1.f19753a
            int r6 = r2.size()
            int r6 = r6 - r4
            int r6 = r6 / r3
            int r6 = r6 + r4
            int r6 = r6 * 8
            com.bytedance.android.livesdk.gift.model.a.b[] r7 = new com.bytedance.android.livesdk.gift.model.p379a.C7491b[r6]
            r8 = 0
        L_0x0153:
            if (r8 >= r6) goto L_0x015f
            com.bytedance.android.livesdk.gift.model.a.d r9 = new com.bytedance.android.livesdk.gift.model.a.d
            r9.<init>()
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x0153
        L_0x015f:
            java.util.Iterator r8 = r2.iterator()
            r9 = 0
        L_0x0164:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x018c
            java.lang.Object r10 = r8.next()
            com.bytedance.android.livesdk.gift.model.a.b r10 = (com.bytedance.android.livesdk.gift.model.p379a.C7491b) r10
            int r11 = r9 / 8
            int r12 = r9 % 8
            r13 = 4
            if (r12 >= r13) goto L_0x017d
            int r12 = r12 * 2
            int r11 = r11 * 8
            int r12 = r12 + r11
            goto L_0x0185
        L_0x017d:
            int r12 = r12 + -4
            int r12 = r12 * 2
            int r12 = r12 + r4
            int r11 = r11 * 8
            int r12 = r12 + r11
        L_0x0185:
            int r9 = r9 + 1
            if (r12 >= r6) goto L_0x0164
            r7[r12] = r10
            goto L_0x0164
        L_0x018c:
            java.util.List r6 = java.util.Arrays.asList(r7)
            r1.addAll(r6)
        L_0x0193:
            com.bytedance.android.livesdk.gift.dialog.view.f r1 = r0.f19728c
            r1.notifyDataSetChanged()
            java.util.List<com.bytedance.android.livesdk.gift.model.a.b> r1 = r0.f19726a
            r1.clear()
            java.util.List<com.bytedance.android.livesdk.gift.model.a.b> r1 = r0.f19726a
            r1.addAll(r2)
            boolean r1 = com.bytedance.common.utility.C9414h.m18630a(r2)
            if (r1 != 0) goto L_0x01d6
            r0.f19731f = r5
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r1 = r0.f19729d
            r1.setVisibility(r5)
            int r1 = r2.size()
            int r1 = r1 - r4
            int r1 = r1 / r3
            int r1 = r1 + r4
            r0.f19733h = r1
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r1 = r0.f19729d
            int r2 = r0.f19733h
            int r6 = r0.f19731f
            r1.mo11847a(r2, r6)
            android.view.View r1 = r0.f19730e
            r1.setVisibility(r3)
            android.support.v7.widget.RecyclerView r1 = r0.f19727b
            r1.setVisibility(r5)
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r1 = r0.f19729d
            int r2 = r0.f19733h
            if (r2 <= r4) goto L_0x01d2
            r3 = 0
        L_0x01d2:
            r1.setVisibility(r3)
            goto L_0x01e5
        L_0x01d6:
            android.view.View r1 = r0.f19730e
            r1.setVisibility(r5)
            android.support.v7.widget.RecyclerView r1 = r0.f19727b
            r1.setVisibility(r3)
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r1 = r0.f19729d
            r1.setVisibility(r3)
        L_0x01e5:
            com.bytedance.android.livesdk.gift.model.GiftPage r15 = r15.mo13540a()
            if (r15 == 0) goto L_0x01ee
            int r15 = r15.pageType
            goto L_0x01ef
        L_0x01ee:
            r15 = 1
        L_0x01ef:
            int r1 = r0.f19735j
            if (r15 == r1) goto L_0x01fd
            r1 = 0
            r0.f19734i = r1
            r0.f19735j = r15
            r0.mo13503b(r4)
            return
        L_0x01fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.view.C7266h.onChanged(java.lang.Object):void");
    }
}
