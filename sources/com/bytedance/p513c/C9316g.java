package com.bytedance.p513c;

/* renamed from: com.bytedance.c.g */
final class C9316g {

    /* renamed from: a */
    private int f25498a;

    C9316g() {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16923a(boolean r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            float r9 = r10.getPressure()
            float r0 = r10.getTouchMajor()
            int r1 = r10.getAction()
            float r2 = r10.getX()
            float r3 = r10.getY()
            long r4 = r10.getEventTime()
            r10 = 0
            r6 = 1
            r7 = 2
            if (r1 == r7) goto L_0x0020
            r8.f25498a = r10
            goto L_0x0034
        L_0x0020:
            int r7 = r8.f25498a
            switch(r7) {
                case 0: goto L_0x002f;
                case 1: goto L_0x0028;
                case 2: goto L_0x0028;
                case 3: goto L_0x0028;
                case 4: goto L_0x0028;
                default: goto L_0x0025;
            }
        L_0x0025:
            r8.f25498a = r6
            goto L_0x0034
        L_0x0028:
            int r7 = r8.f25498a
            int r7 = r7 + r6
            r8.f25498a = r7
            r6 = 0
            goto L_0x0034
        L_0x002f:
            int r10 = r8.f25498a
            int r10 = r10 + r6
            r8.f25498a = r10
        L_0x0034:
            if (r6 == 0) goto L_0x0079
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r6 = "timestamp"
            r10.put(r6, r4)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r4 = "force"
            double r5 = (double) r9     // Catch:{ JSONException -> 0x0079 }
            r10.put(r4, r5)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r9 = "majorRadius"
            double r4 = (double) r0     // Catch:{ JSONException -> 0x0079 }
            r10.put(r9, r4)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r9 = "phase"
            r10.put(r9, r1)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r9 = "x"
            double r4 = (double) r2     // Catch:{ JSONException -> 0x0079 }
            r10.put(r9, r4)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r9 = "y"
            double r2 = (double) r3     // Catch:{ JSONException -> 0x0079 }
            r10.put(r9, r2)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r9 = "touch_event"
            org.json.JSONObject r9 = com.bytedance.p513c.C9302d.m18446a(r9, r10)
            java.lang.String r9 = r9.toString()
            com.bytedance.p513c.C9302d.m18449a(r9)
            java.util.concurrent.locks.ReentrantLock r9 = com.bytedance.p513c.C9302d.f25476d     // Catch:{  }
            r9.lockInterruptibly()     // Catch:{  }
            java.util.List<org.json.JSONObject> r9 = com.bytedance.p513c.C9302d.f25477e     // Catch:{  }
            r9.add(r10)     // Catch:{  }
            java.util.concurrent.locks.ReentrantLock r9 = com.bytedance.p513c.C9302d.f25476d     // Catch:{  }
            r9.unlock()     // Catch:{  }
        L_0x0079:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "action = "
            r9.<init>(r10)
            r9.append(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p513c.C9316g.mo16923a(boolean, android.view.MotionEvent):void");
    }
}
