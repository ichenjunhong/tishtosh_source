package com.p683ss.android.ugc.asve.sandbox;

import java.lang.reflect.InvocationHandler;

/* renamed from: com.ss.android.ugc.asve.sandbox.d */
public final class C20752d implements InvocationHandler {

    /* renamed from: a */
    private Object f56637a;

    public C20752d(Object obj) {
        this.f56637a = obj;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) {
        /*
            r2 = this;
            java.lang.Object r3 = r2.f56637a     // Catch:{ Exception -> 0x0007 }
            java.lang.Object r3 = r4.invoke(r3, r5)     // Catch:{ Exception -> 0x0007 }
            return r3
        L_0x0007:
            r3 = move-exception
            com.ss.android.ugc.asve.b r5 = com.p683ss.android.ugc.asve.C20317b.f55815a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ipc invoke: "
            r0.<init>(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "   "
            r0.append(r1)
            java.lang.String r1 = r4.getName()
            r0.append(r1)
            java.lang.String r1 = "  return type: "
            r0.append(r1)
            java.lang.reflect.Type r1 = r4.getGenericReturnType()
            r0.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.mo42962c(r0)
            com.ss.android.ugc.asve.context.e r5 = com.p683ss.android.ugc.asve.C20315a.m50092a()
            com.ss.android.ugc.asve.recorder.d r5 = r5.mo43150d()
            if (r5 == 0) goto L_0x0051
            java.lang.String r0 = "sandbox_ipc_exception"
            r5.mo43440a(r3, r0)
        L_0x0051:
            java.util.HashMap r5 = new java.util.HashMap
            r0 = 8
            r5.<init>(r0)
            java.lang.Object r0 = r2.f56637a
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "target_name"
            java.lang.Object r1 = r2.f56637a
            java.lang.String r1 = r1.toString()
            r5.put(r0, r1)
        L_0x0067:
            java.lang.String r0 = "method_name"
            java.lang.String r1 = r4.getName()
            r5.put(r0, r1)
            java.lang.String r0 = "return_name"
            java.lang.reflect.Type r1 = r4.getGenericReturnType()
            java.lang.String r1 = r1.toString()
            r5.put(r0, r1)
            java.lang.String r0 = "exception_detail"
            java.lang.String r3 = r3.toString()
            r5.put(r0, r3)
            com.ss.android.ugc.asve.context.e r3 = com.p683ss.android.ugc.asve.C20315a.m50092a()
            com.ss.android.ugc.asve.recorder.d r3 = r3.mo43150d()
            if (r3 == 0) goto L_0x0095
            java.lang.String r0 = "sandbox_ipc_invoke_exception"
            r3.mo43439a(r0, r5)
        L_0x0095:
            java.lang.reflect.Type r3 = r4.getGenericReturnType()
            java.lang.String r3 = r3.toString()
            int r4 = r3.hashCode()
            r5 = 0
            r0 = -1
            switch(r4) {
                case -1808118735: goto L_0x00ed;
                case -1325958191: goto L_0x00e3;
                case 104431: goto L_0x00d9;
                case 3039496: goto L_0x00cf;
                case 3327612: goto L_0x00c5;
                case 64711720: goto L_0x00bb;
                case 97526364: goto L_0x00b1;
                case 109413500: goto L_0x00a7;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            goto L_0x00f7
        L_0x00a7:
            java.lang.String r4 = "short"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f7
            r3 = 6
            goto L_0x00f8
        L_0x00b1:
            java.lang.String r4 = "float"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f7
            r3 = 2
            goto L_0x00f8
        L_0x00bb:
            java.lang.String r4 = "boolean"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f7
            r3 = 3
            goto L_0x00f8
        L_0x00c5:
            java.lang.String r4 = "long"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f7
            r3 = 1
            goto L_0x00f8
        L_0x00cf:
            java.lang.String r4 = "byte"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f7
            r3 = 7
            goto L_0x00f8
        L_0x00d9:
            java.lang.String r4 = "int"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f7
            r3 = 0
            goto L_0x00f8
        L_0x00e3:
            java.lang.String r4 = "double"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f7
            r3 = 5
            goto L_0x00f8
        L_0x00ed:
            java.lang.String r4 = "String"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f7
            r3 = 4
            goto L_0x00f8
        L_0x00f7:
            r3 = -1
        L_0x00f8:
            switch(r3) {
                case 0: goto L_0x0124;
                case 1: goto L_0x011d;
                case 2: goto L_0x0116;
                case 3: goto L_0x0111;
                case 4: goto L_0x010e;
                case 5: goto L_0x0107;
                case 6: goto L_0x0102;
                case 7: goto L_0x00fd;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            r3 = 0
            return r3
        L_0x00fd:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x0102:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x0107:
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            return r3
        L_0x010e:
            java.lang.String r3 = ""
            return r3
        L_0x0111:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            return r3
        L_0x0116:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L_0x011d:
            r3 = -1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L_0x0124:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.sandbox.C20752d.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
