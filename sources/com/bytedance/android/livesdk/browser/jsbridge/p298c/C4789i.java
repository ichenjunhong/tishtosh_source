package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.p675g.p676a.C10762d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.i */
public class C4789i implements C10762d {

    /* renamed from: a */
    protected WeakReference<Context> f13008a;

    public C4789i(WeakReference<Context> weakReference) {
        this.f13008a = weakReference;
    }

    /* renamed from: a */
    private static Bundle m11354a(JSONObject jSONObject) throws Exception {
        Bundle bundle = new Bundle();
        if (jSONObject == null) {
            return bundle;
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                bundle.putString(str, String.valueOf(obj));
            }
        }
        return bundle;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v6, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r6v10, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r6v11, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r6v13, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r11v3, types: [int] */
    /* JADX WARNING: type inference failed for: r4v10, types: [int] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r6v25 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.content.Context, org.json.JSONObject]
      uses: [org.json.JSONObject, android.content.Context]
      mth insns count: 550
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
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x038d  */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void call(com.bytedance.ies.p675g.p676a.C10766h r17, org.json.JSONObject r18) throws java.lang.Exception {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "code"
            r4 = 0
            r2.put(r3, r4)
            org.json.JSONObject r3 = r1.f28947d
            java.lang.String r5 = "type"
            java.lang.String r3 = r3.optString(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x0020
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            return
        L_0x0020:
            org.json.JSONObject r5 = r1.f28947d
            java.lang.String r6 = "args"
            boolean r5 = r5.has(r6)
            r6 = 0
            if (r5 == 0) goto L_0x0034
            org.json.JSONObject r5 = r1.f28947d
            java.lang.String r7 = "args"
            org.json.JSONObject r5 = r5.getJSONObject(r7)
            goto L_0x0035
        L_0x0034:
            r5 = r6
        L_0x0035:
            int r7 = r3.hashCode()
            r9 = -1
            r10 = 1
            switch(r7) {
                case -1949693950: goto L_0x00e4;
                case -1932693274: goto L_0x00da;
                case -1361632588: goto L_0x00cf;
                case -907987547: goto L_0x00c4;
                case -309425751: goto L_0x00ba;
                case -191501435: goto L_0x00b0;
                case 98260: goto L_0x00a5;
                case 3322092: goto L_0x009a;
                case 3506395: goto L_0x0090;
                case 65209337: goto L_0x0086;
                case 112202875: goto L_0x007a;
                case 505229877: goto L_0x006f;
                case 845427215: goto L_0x0063;
                case 1152538955: goto L_0x0057;
                case 1224424441: goto L_0x004b;
                case 1654221230: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x00ee
        L_0x0040:
            java.lang.String r7 = "login_panel"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 4
            goto L_0x00ef
        L_0x004b:
            java.lang.String r7 = "webview"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 8
            goto L_0x00ef
        L_0x0057:
            java.lang.String r7 = "upload_poster"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 11
            goto L_0x00ef
        L_0x0063:
            java.lang.String r7 = "broadcast_task_finish"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 15
            goto L_0x00ef
        L_0x006f:
            java.lang.String r7 = "gift_panel"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 1
            goto L_0x00ef
        L_0x007a:
            java.lang.String r7 = "video"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 12
            goto L_0x00ef
        L_0x0086:
            java.lang.String r7 = "comments_panel"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 2
            goto L_0x00ef
        L_0x0090:
            java.lang.String r7 = "room"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 3
            goto L_0x00ef
        L_0x009a:
            java.lang.String r7 = "live"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 10
            goto L_0x00ef
        L_0x00a5:
            java.lang.String r7 = "car"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 14
            goto L_0x00ef
        L_0x00b0:
            java.lang.String r7 = "feedback"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 5
            goto L_0x00ef
        L_0x00ba:
            java.lang.String r7 = "profile"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 0
            goto L_0x00ef
        L_0x00c4:
            java.lang.String r7 = "scheme"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 13
            goto L_0x00ef
        L_0x00cf:
            java.lang.String r7 = "charge"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 9
            goto L_0x00ef
        L_0x00da:
            java.lang.String r7 = "webview_popup"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 7
            goto L_0x00ef
        L_0x00e4:
            java.lang.String r7 = "feedback_send"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00ee
            r3 = 6
            goto L_0x00ef
        L_0x00ee:
            r3 = -1
        L_0x00ef:
            switch(r3) {
                case 0: goto L_0x05ce;
                case 1: goto L_0x05ad;
                case 2: goto L_0x0572;
                case 3: goto L_0x0473;
                case 4: goto L_0x042b;
                case 5: goto L_0x03f5;
                case 6: goto L_0x03c4;
                case 7: goto L_0x0267;
                case 8: goto L_0x01f8;
                case 9: goto L_0x01d9;
                case 10: goto L_0x01ca;
                case 11: goto L_0x01bb;
                case 12: goto L_0x0162;
                case 13: goto L_0x012e;
                case 14: goto L_0x011f;
                case 15: goto L_0x00f9;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            java.lang.String r1 = "code"
            r2.put(r1, r10)
            goto L_0x061a
        L_0x00f9:
            if (r5 != 0) goto L_0x0102
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            goto L_0x061a
        L_0x0102:
            java.lang.String r1 = "title"
            java.lang.String r1 = r5.optString(r1)
            java.lang.String r2 = "content"
            java.lang.String r2 = r5.optString(r2)
            com.bytedance.android.live.broadcast.api.model.a r3 = new com.bytedance.android.live.broadcast.api.model.a
            r3.<init>()
            r3.f8931a = r1
            r3.f8932b = r2
            com.bytedance.android.livesdk.aa.a r1 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            r1.mo10301a(r3)
            return
        L_0x011f:
            com.bytedance.android.livesdk.aa.a r1 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            com.bytedance.android.livesdk.k.d r2 = new com.bytedance.android.livesdk.k.d
            java.lang.String r3 = "H5"
            r2.<init>(r3)
            r1.mo10301a(r2)
            return
        L_0x012e:
            if (r5 != 0) goto L_0x0137
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            goto L_0x061a
        L_0x0137:
            java.lang.String r1 = "url"
            java.lang.String r1 = r5.getString(r1)
            java.lang.ref.WeakReference<android.content.Context> r3 = r0.f13008a
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            if (r3 == 0) goto L_0x015c
            com.bytedance.android.livesdk.ab.f r5 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.livesdk.schema.interfaces.a r5 = r5.mo10328i()
            boolean r1 = r5.handle(r3, r1)
            if (r1 == 0) goto L_0x015c
            java.lang.String r1 = "code"
            r2.put(r1, r10)
            goto L_0x061a
        L_0x015c:
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            return
        L_0x0162:
            if (r5 != 0) goto L_0x016b
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            goto L_0x061a
        L_0x016b:
            java.lang.String r1 = "item_id"
            java.lang.String r1 = r5.optString(r1)
            com.bytedance.android.livesdkapi.l.a.e r2 = new com.bytedance.android.livesdkapi.l.a.e
            java.lang.String r3 = "sslocal://detail/video"
            r2.<init>(r3)
            java.lang.String r3 = "groupid"
            r2.mo15827a(r3, r1)
            java.lang.String r3 = "item_id"
            r2.mo15827a(r3, r1)
            java.lang.String r1 = "aggr_type"
            java.lang.String r3 = "2"
            r2.mo15827a(r1, r3)
            java.lang.String r1 = "enter_from"
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "click_live_room"
            java.lang.String r3 = r5.optString(r3, r4)
            r2.mo15827a(r1, r3)
            java.lang.String r1 = "category_name"
            java.lang.String r3 = "category_name"
            java.lang.String r4 = "live_room"
            java.lang.String r3 = r5.optString(r3, r4)
            r2.mo15827a(r1, r3)
            com.bytedance.android.livesdk.ab.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.schema.b r1 = r1.mo10313f()
            java.lang.ref.WeakReference<android.content.Context> r3 = r0.f13008a
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r2 = r2.mo15824a()
            r1.mo14429a(r3, r2)
            return
        L_0x01bb:
            com.bytedance.android.livesdk.k.f r1 = new com.bytedance.android.livesdk.k.f
            r1.<init>()
            r1.f21220a = r10
            com.bytedance.android.livesdk.aa.a r2 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            r2.mo10301a(r1)
            return
        L_0x01ca:
            com.bytedance.android.livesdk.k.f r1 = new com.bytedance.android.livesdk.k.f
            r1.<init>()
            r1.f21220a = r4
            com.bytedance.android.livesdk.aa.a r2 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            r2.mo10301a(r1)
            return
        L_0x01d9:
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.f13008a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L_0x01f2
            com.bytedance.android.livesdk.ab.e r3 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdkapi.host.IHostApp r3 = r3.mo10310c()
            android.app.Activity r1 = (android.app.Activity) r1
            r3.openWallet(r1)
        L_0x01f2:
            java.lang.String r1 = "code"
            r2.put(r1, r10)
            return
        L_0x01f8:
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.f13008a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r5 == 0) goto L_0x0260
            java.lang.ref.WeakReference<android.content.Context> r3 = r0.f13008a
            if (r3 != 0) goto L_0x0207
            goto L_0x0260
        L_0x0207:
            java.lang.String r3 = "url"
            java.lang.String r3 = r5.optString(r3)
            java.lang.String r4 = "title"
            java.lang.String r4 = r5.optString(r4)
            java.lang.String r6 = "hide_nav_bar"
            java.lang.String r6 = r5.optString(r6)
            java.lang.String r7 = "hide_status_bar"
            java.lang.String r7 = r5.optString(r7)
            com.bytedance.android.livesdk.ab.f r8 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.livesdk.browser.c.b r8 = r8.mo10322c()
            com.bytedance.android.livesdk.browser.c.b$a r3 = com.bytedance.android.livesdk.browser.p289c.C4704c.m11227b(r3)
            com.bytedance.android.livesdk.browser.c.b$a r3 = r3.mo10505a(r4)
            java.lang.String r4 = "1"
            boolean r4 = android.text.TextUtils.equals(r7, r4)
            com.bytedance.android.livesdk.browser.c.b$a r3 = r3.mo10508b(r4)
            java.lang.String r4 = "status_bar_color"
            java.lang.String r4 = r5.optString(r4)
            com.bytedance.android.livesdk.browser.c.b$a r3 = r3.mo10507b(r4)
            java.lang.String r4 = "status_bar_bg_color"
            java.lang.String r4 = r5.optString(r4)
            com.bytedance.android.livesdk.browser.c.b$a r3 = r3.mo10509c(r4)
            java.lang.String r4 = "1"
            boolean r4 = android.text.TextUtils.equals(r6, r4)
            com.bytedance.android.livesdk.browser.c.b$a r3 = r3.mo10506a(r4)
            r8.mo10490a(r1, r3)
            java.lang.String r1 = "code"
            r2.put(r1, r10)
            return
        L_0x0260:
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            goto L_0x061a
        L_0x0267:
            if (r5 == 0) goto L_0x03bd
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.f13008a
            if (r1 == 0) goto L_0x03bd
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.f13008a
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x03bd
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.f13008a
            java.lang.Object r1 = r1.get()
            boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
            if (r1 != 0) goto L_0x0281
            goto L_0x03bd
        L_0x0281:
            boolean r1 = com.bytedance.android.live.core.p230g.C3922z.m9916f()
            java.lang.String r3 = "width"
            if (r1 == 0) goto L_0x028e
            int r6 = com.bytedance.android.live.core.p230g.C3922z.m9910c()
            goto L_0x0292
        L_0x028e:
            int r6 = com.bytedance.android.live.core.p230g.C3922z.m9908b()
        L_0x0292:
            float r6 = com.bytedance.android.live.core.p230g.C3922z.m9914e(r6)
            int r6 = (int) r6
            int r3 = r5.optInt(r3, r6)
            if (r3 > 0) goto L_0x02ad
            if (r1 == 0) goto L_0x02a4
            int r1 = com.bytedance.android.live.core.p230g.C3922z.m9910c()
            goto L_0x02a8
        L_0x02a4:
            int r1 = com.bytedance.android.live.core.p230g.C3922z.m9908b()
        L_0x02a8:
            float r1 = com.bytedance.android.live.core.p230g.C3922z.m9914e(r1)
            int r3 = (int) r1
        L_0x02ad:
            java.lang.String r1 = "height"
            r6 = 400(0x190, float:5.6E-43)
            int r1 = r5.optInt(r1, r6)
            java.lang.String r6 = "radius"
            int r6 = r5.optInt(r6, r4)
            java.lang.String r7 = "radius_top_left"
            int r7 = r5.optInt(r7, r4)
            java.lang.String r9 = "radius_top_right"
            int r9 = r5.optInt(r9, r4)
            java.lang.String r11 = "radius_bottom_right"
            int r11 = r5.optInt(r11, r4)
            java.lang.String r12 = "radius_bottom_left"
            int r12 = r5.optInt(r12, r4)
            java.lang.String r13 = "margin"
            int r13 = r5.optInt(r13, r4)
            java.lang.String r14 = "gravity"
            boolean r14 = r5.has(r14)
            r15 = 80
            if (r14 == 0) goto L_0x0334
            java.lang.String r14 = "gravity"
            java.lang.String r14 = r5.optString(r14)
            java.lang.String r8 = "right"
            boolean r8 = android.text.TextUtils.equals(r14, r8)
            if (r8 != 0) goto L_0x0330
            java.lang.String r8 = "end"
            boolean r8 = android.text.TextUtils.equals(r14, r8)
            if (r8 == 0) goto L_0x02fa
            goto L_0x0330
        L_0x02fa:
            java.lang.String r8 = "left"
            boolean r8 = android.text.TextUtils.equals(r14, r8)
            if (r8 != 0) goto L_0x032c
            java.lang.String r8 = "start"
            boolean r8 = android.text.TextUtils.equals(r14, r8)
            if (r8 == 0) goto L_0x030b
            goto L_0x032c
        L_0x030b:
            java.lang.String r8 = "top"
            boolean r8 = android.text.TextUtils.equals(r14, r8)
            if (r8 == 0) goto L_0x0316
            r8 = 48
            goto L_0x0335
        L_0x0316:
            java.lang.String r8 = "bottom"
            boolean r8 = android.text.TextUtils.equals(r14, r8)
            if (r8 == 0) goto L_0x0321
            r8 = 80
            goto L_0x0335
        L_0x0321:
            java.lang.String r8 = "center"
            boolean r8 = android.text.TextUtils.equals(r14, r8)
            if (r8 == 0) goto L_0x0334
            r8 = 17
            goto L_0x0335
        L_0x032c:
            r8 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x0335
        L_0x0330:
            r8 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x0335
        L_0x0334:
            r8 = 0
        L_0x0335:
            if (r8 != r15) goto L_0x034d
            java.lang.String r14 = "radius_top_left"
            boolean r14 = r5.has(r14)
            if (r14 != 0) goto L_0x034d
            java.lang.String r14 = "radius_top_right"
            boolean r14 = r5.has(r14)
            if (r14 != 0) goto L_0x034d
            r7 = 8
            r9 = 8
            r12 = 0
            goto L_0x034e
        L_0x034d:
            r4 = r11
        L_0x034e:
            java.lang.String r11 = "from_label"
            java.lang.String r11 = r5.optString(r11)
            java.lang.String r14 = "url"
            java.lang.String r14 = r5.getString(r14)
            com.bytedance.android.livesdk.browser.c.b$b r14 = com.bytedance.android.livesdk.browser.p289c.C4704c.m11226a(r14)
            com.bytedance.android.livesdk.browser.c.b$b r3 = r14.mo10510a(r3)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r3.mo10514b(r1)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r1.mo10520e(r8)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r1.mo10512a(r11)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r1.mo10516c(r13)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r1.mo10515b(r10)
            java.lang.String r3 = "radius"
            boolean r3 = r5.has(r3)
            if (r3 == 0) goto L_0x0382
            r1.mo10518d(r6)
            goto L_0x0385
        L_0x0382:
            r1.mo10511a(r7, r9, r4, r12)
        L_0x0385:
            java.lang.String r3 = "monitor"
            boolean r3 = r5.has(r3)
            if (r3 == 0) goto L_0x03a0
            java.lang.String r3 = "monitor"
            org.json.JSONObject r3 = r5.optJSONObject(r3)
            java.lang.String r4 = "service"
            java.lang.String r3 = r3.optString(r4)
            com.bytedance.android.livesdk.ag.a.a$1 r4 = new com.bytedance.android.livesdk.ag.a.a$1
            r4.<init>(r3)
            r1.f12810r = r4
        L_0x03a0:
            com.bytedance.android.livesdk.ab.f r3 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.livesdk.browser.c.b r3 = r3.mo10322c()
            com.bytedance.android.live.core.widget.a r1 = r3.mo10487a(r1)
            java.lang.ref.WeakReference<android.content.Context> r3 = r0.f13008a
            java.lang.Object r3 = r3.get()
            android.support.v4.app.FragmentActivity r3 = (android.support.p030v4.app.FragmentActivity) r3
            com.bytedance.android.live.core.widget.C4104a.m10232a(r3, r1)
            java.lang.String r1 = "code"
            r2.put(r1, r10)
            return
        L_0x03bd:
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            goto L_0x061a
        L_0x03c4:
            if (r5 != 0) goto L_0x03cd
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            goto L_0x061a
        L_0x03cd:
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.f13008a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.bytedance.android.livesdk.ab.e r3 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.schema.b r3 = r3.mo10313f()
            java.lang.String r4 = "source"
            java.lang.String r4 = r5.optString(r4)
            r3.mo14426a(r4, r1)
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L_0x03ef
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
        L_0x03ef:
            java.lang.String r1 = "code"
            r2.put(r1, r10)
            return
        L_0x03f5:
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x0406
            java.lang.String r1 = "feedback_id"
            r5.optInt(r1, r9)
            java.lang.String r1 = "source"
            java.lang.String r3 = ""
            java.lang.String r1 = r5.optString(r1, r3)
        L_0x0406:
            java.lang.ref.WeakReference<android.content.Context> r3 = r0.f13008a
            if (r3 == 0) goto L_0x042a
            java.lang.ref.WeakReference<android.content.Context> r3 = r0.f13008a
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L_0x042a
            java.lang.ref.WeakReference<android.content.Context> r3 = r0.f13008a
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            com.bytedance.android.livesdk.ab.e r4 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.schema.b r4 = r4.mo10313f()
            r4.mo14426a(r1, r3)
            java.lang.String r1 = "code"
            r2.put(r1, r10)
        L_0x042a:
            return
        L_0x042b:
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.f13008a
            if (r1 == 0) goto L_0x0438
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.f13008a
            java.lang.Object r1 = r1.get()
            r6 = r1
            android.content.Context r6 = (android.content.Context) r6
        L_0x0438:
            com.bytedance.android.livesdk.ab.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r1 = r1.mo10315h()
            boolean r3 = r1.mo14532c()
            if (r3 != 0) goto L_0x0472
            com.bytedance.android.livesdk.user.i$a r3 = com.bytedance.android.livesdk.user.C8337i.m16520a()
            r4 = 2132551118(0x7f1c25ce, float:2.0755586E38)
            java.lang.String r4 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r4)
            com.bytedance.android.livesdk.user.i$a r3 = r3.mo14540a(r4)
            com.bytedance.android.livesdk.user.i$a r3 = r3.mo14539a(r9)
            com.bytedance.android.livesdk.user.i r3 = r3.mo14541a()
            c.a.v r1 = r1.mo14516a(r6, r3)
            com.bytedance.android.livesdk.user.g r3 = new com.bytedance.android.livesdk.user.g
            r3.<init>()
            r1.mo6314a(r3)
            if (r2 == 0) goto L_0x0472
            java.lang.String r1 = "code"
            r2.put(r1, r10)     // Catch:{ JSONException -> 0x0472 }
            goto L_0x061a
        L_0x0472:
            return
        L_0x0473:
            if (r5 == 0) goto L_0x056b
            java.lang.String r1 = "room_id"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto L_0x047f
            goto L_0x056b
        L_0x047f:
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.f13008a
            if (r1 == 0) goto L_0x048c
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.f13008a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            goto L_0x048d
        L_0x048c:
            r1 = r6
        L_0x048d:
            if (r1 != 0) goto L_0x0496
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            goto L_0x061a
        L_0x0496:
            java.lang.String r3 = "room_id"
            java.lang.String r3 = r5.getString(r3)
            long r7 = java.lang.Long.parseLong(r3)
            r11 = 0
            java.lang.String r3 = "portal_id"
            java.lang.String r3 = r5.optString(r3)     // Catch:{ NumberFormatException -> 0x04ad }
            long r13 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x04ad }
            goto L_0x04ae
        L_0x04ad:
            r13 = r11
        L_0x04ae:
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x04c8
            com.bytedance.android.livesdk.p399o.C8064d.m16005b()
            java.lang.String r3 = "ttlive_portal"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "openRoom portalId="
            r9.<init>(r11)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            com.bytedance.android.livesdk.p399o.C8064d.m9719a(r3, r9)
        L_0x04c8:
            java.lang.String r3 = "log_extra"
            boolean r3 = r5.has(r3)
            if (r3 == 0) goto L_0x04d6
            java.lang.String r3 = "log_extra"
            org.json.JSONObject r6 = r5.getJSONObject(r3)
        L_0x04d6:
            android.os.Bundle r3 = m11354a(r6)
            java.lang.String r6 = "enter_method"
            java.lang.String r9 = "h5"
            r3.putString(r6, r9)
            com.bytedance.android.livesdk.ab.f r6 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.livesdk.schema.interfaces.a r6 = r6.mo10328i()
            com.bytedance.android.livesdk.schema.interfaces.b$a r9 = new com.bytedance.android.livesdk.schema.interfaces.b$a
            r9.<init>()
            com.bytedance.android.livesdk.schema.interfaces.b$a r7 = r9.mo14437a(r7)
            java.lang.String r8 = "enter_from"
            java.lang.String r9 = "web"
            java.lang.String r8 = r5.optString(r8, r9)
            com.bytedance.android.livesdk.schema.interfaces.b$a r7 = r7.mo14441b(r8)
            java.lang.String r8 = "enter_from"
            java.lang.String r9 = "web"
            java.lang.String r8 = r5.optString(r8, r9)
            com.bytedance.android.livesdk.schema.interfaces.b$a r7 = r7.mo14438a(r8)
            java.lang.String r8 = "enter_from"
            java.lang.String r9 = "web"
            java.lang.String r8 = r5.optString(r8, r9)
            com.bytedance.android.livesdk.schema.interfaces.b$a r7 = r7.mo14442c(r8)
            java.lang.String r8 = "enter_from_merge"
            java.lang.String r9 = "h5"
            java.lang.String r8 = r5.optString(r8, r9)
            com.bytedance.android.livesdk.schema.interfaces.b$a r7 = r7.mo14449j(r8)
            r7.f22607x = r13
            java.lang.String r8 = "gift_panel"
            boolean r8 = r5.optBoolean(r8, r4)
            r7.f22594k = r8
            java.lang.String r8 = "prop_panel"
            boolean r8 = r5.optBoolean(r8, r4)
            r7.f22595l = r8
            java.lang.String r8 = "enter_method"
            java.lang.String r9 = "h5"
            java.lang.String r8 = r5.optString(r8, r9)
            com.bytedance.android.livesdk.schema.interfaces.b$a r7 = r7.mo14450k(r8)
            java.lang.String r8 = "is_open_profile_panel"
            boolean r8 = r5.optBoolean(r8, r4)
            java.lang.String r9 = "is_pick3"
            boolean r5 = r5.optBoolean(r9, r4)
            r7.f22608y = r8
            r7.f22609z = r5
            java.lang.String r5 = "false"
            com.bytedance.android.livesdk.schema.interfaces.b$a r5 = r7.mo14451l(r5)
            r5.f22596m = r3
            boolean r1 = r6.openRoom(r1, r5)
            if (r1 == 0) goto L_0x0565
            java.lang.String r1 = "code"
            r2.put(r1, r10)
            goto L_0x061a
        L_0x0565:
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            return
        L_0x056b:
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            goto L_0x061a
        L_0x0572:
            org.json.JSONObject r3 = r1.f28947d
            java.lang.String r5 = "args"
            boolean r3 = r3.has(r5)
            if (r3 == 0) goto L_0x05a0
            org.json.JSONObject r3 = r1.f28947d
            java.lang.String r5 = "args"
            org.json.JSONObject r3 = r3.getJSONObject(r5)
            java.lang.String r5 = "enableDanmaku"
            boolean r3 = r3.has(r5)
            if (r3 == 0) goto L_0x05a0
            org.json.JSONObject r1 = r1.f28947d
            java.lang.String r3 = "args"
            org.json.JSONObject r1 = r1.getJSONObject(r3)
            java.lang.String r3 = "enableDanmaku"
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "1"
            boolean r4 = android.text.TextUtils.equals(r1, r3)
        L_0x05a0:
            com.bytedance.android.livesdkapi.service.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getLiveService()
            r1.mo15044a(r4)
            java.lang.String r1 = "code"
            r2.put(r1, r10)
            return
        L_0x05ad:
            java.lang.String r3 = "gift"
            org.json.JSONObject r5 = r1.f28947d
            java.lang.String r6 = "panel_type"
            boolean r5 = r5.has(r6)
            if (r5 == 0) goto L_0x05c1
            org.json.JSONObject r1 = r1.f28947d
            java.lang.String r3 = "panel_type"
            java.lang.String r3 = r1.getString(r3)
        L_0x05c1:
            com.bytedance.android.livesdkapi.service.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getLiveService()
            r1.mo15042a(r3, r4)
            java.lang.String r1 = "code"
            r2.put(r1, r10)
            return
        L_0x05ce:
            if (r5 != 0) goto L_0x05d6
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            goto L_0x061a
        L_0x05d6:
            java.lang.String r1 = "user_id"
            java.lang.String r1 = r5.optString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x05e8
            java.lang.String r1 = "code"
            r2.put(r1, r4)
            goto L_0x061a
        L_0x05e8:
            java.lang.String r3 = "sec_user_id"
            java.lang.String r3 = r5.optString(r3)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x05fe
            java.lang.String r6 = "sec_user_id"
            r4.put(r6, r3)
        L_0x05fe:
            com.bytedance.android.livesdk.ab.f r3 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.livesdk.schema.interfaces.a r3 = r3.mo10328i()
            long r6 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = "type"
            java.lang.String r1 = r5.optString(r1)
            boolean r1 = r3.showUserProfile(r6, r1, r4)
            java.lang.String r3 = "code"
            r2.put(r3, r1)
            return
        L_0x061a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.p298c.C4789i.call(com.bytedance.ies.g.a.h, org.json.JSONObject):void");
    }
}
