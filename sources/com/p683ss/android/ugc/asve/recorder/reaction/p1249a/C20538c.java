package com.p683ss.android.ugc.asve.recorder.reaction.p1249a;

import android.content.Context;
import android.content.res.TypedArray;
import com.p683ss.android.ugc.asve.recorder.reaction.model.C20545b;
import com.p683ss.android.ugc.asve.recorder.reaction.model.C20546c;
import com.p683ss.android.ugc.asve.recorder.reaction.model.C20547d;
import java.io.File;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.c */
public final class C20538c {

    /* renamed from: a */
    private final String f56257a = "ReactionWindowFactory";

    /* renamed from: b */
    private final ArrayList<C20547d> f56258b = new ArrayList<>();

    /* renamed from: c */
    private int f56259c;

    /* renamed from: d */
    private int f56260d;

    /* renamed from: e */
    private int f56261e;

    /* renamed from: a */
    public final C20547d mo43589a() {
        Object obj = this.f56258b.get(this.f56261e);
        C52711k.m112236a(obj, "reactionWindowShapes[currentIndex]");
        return (C20547d) obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070 A[SYNTHETIC, Splitter:B:20:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077 A[SYNTHETIC, Splitter:B:26:0x0077] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.File m51536a(android.content.Context r5, java.lang.String r6, android.content.res.TypedArray r7, int r8) {
        /*
            r4 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.io.File r2 = r5.getFilesDir()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r3.<init>()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r3.append(r6)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r3.append(r8)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.lang.String r6 = ".png"
            r3.append(r6)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.lang.String r6 = r3.toString()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r1.<init>(r2, r6)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x004d }
            if (r2 == 0) goto L_0x002c
            r1.createNewFile()     // Catch:{ IOException -> 0x004d }
        L_0x002c:
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ IOException -> 0x004d }
            r2 = 0
            int r7 = r7.getResourceId(r8, r2)     // Catch:{ IOException -> 0x004d }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeResource(r5, r7)     // Catch:{ IOException -> 0x004d }
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x004d }
            r8 = 100
            r2 = r6
            java.io.OutputStream r2 = (java.io.OutputStream) r2     // Catch:{ IOException -> 0x004d }
            r5.compress(r7, r8, r2)     // Catch:{ IOException -> 0x004d }
            r6.flush()     // Catch:{ IOException -> 0x004d }
            r6.close()     // Catch:{ IOException -> 0x004d }
            r6.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            return r1
        L_0x004d:
            r5 = move-exception
            goto L_0x0054
        L_0x004f:
            r5 = move-exception
            r6 = r0
            goto L_0x0075
        L_0x0052:
            r5 = move-exception
            r6 = r0
        L_0x0054:
            com.ss.android.ugc.asve.b r7 = com.p683ss.android.ugc.asve.C20317b.f55815a     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r8.<init>()     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r4.f56257a     // Catch:{ all -> 0x0074 }
            r8.append(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0074 }
            r8.append(r5)     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0074 }
            r7.mo42961b(r5)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0073
            r6.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            return r0
        L_0x0074:
            r5 = move-exception
        L_0x0075:
            if (r6 == 0) goto L_0x007a
            r6.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.recorder.reaction.p1249a.C20538c.m51536a(android.content.Context, java.lang.String, android.content.res.TypedArray, int):java.io.File");
    }

    /* renamed from: b */
    private final void m51538b(Context context, int i, int i2, int i3) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i);
        this.f56259c = obtainTypedArray.length();
        int i4 = this.f56259c;
        int i5 = 0;
        while (i5 < i4) {
            C52711k.m112236a((Object) obtainTypedArray, "typedArray");
            File a = m51536a(context, "reaction_mask_circle", obtainTypedArray, i5);
            if (a != null) {
                String absolutePath = a.getAbsolutePath();
                C52711k.m112236a((Object) absolutePath, "res.absolutePath");
                C20545b bVar = new C20545b(absolutePath, i2, i3, 120, 120, 100, 100);
                this.f56258b.add(bVar);
                i5++;
            } else {
                return;
            }
        }
        obtainTypedArray.recycle();
    }

    /* renamed from: a */
    private final void m51537a(Context context, int i, int i2, int i3) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i);
        this.f56260d = obtainTypedArray.length();
        int i4 = this.f56260d;
        int i5 = 0;
        while (i5 < i4) {
            C52711k.m112236a((Object) obtainTypedArray, "typedArray");
            File a = m51536a(context, "reaction_mask_rectangular", obtainTypedArray, i5);
            if (a != null) {
                String absolutePath = a.getAbsolutePath();
                C52711k.m112236a((Object) absolutePath, "res.absolutePath");
                C20546c cVar = new C20546c(absolutePath, i2, i3, 120, 213, 100, 178);
                this.f56258b.add(cVar);
                i5++;
            } else {
                return;
            }
        }
        obtainTypedArray.recycle();
    }

    public C20538c(Context context, int i, int i2, int i3, int i4) {
        C52711k.m112240b(context, "context");
        m51537a(context, i3, i, i2);
        m51538b(context, i4, i, i2);
    }
}
