package com.appsflyer;

/* renamed from: com.appsflyer.p */
final class C2531p implements C2532b {

    /* renamed from: ˋ */
    private C2532b f7854 = this;

    /* renamed from: com.appsflyer.p$b */
    interface C2532b {
        /* renamed from: ˎ */
        Class<?> mo7036(String str) throws ClassNotFoundException;
    }

    /* renamed from: com.appsflyer.p$e */
    enum C2533e {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native");
        
        /* access modifiers changed from: private */

        /* renamed from: ʻ */
        public String f7862;
        /* access modifiers changed from: private */

        /* renamed from: ʼ */
        public String f7863;

        private C2533e(String str, String str2) {
            this.f7863 = str;
            this.f7862 = str2;
        }
    }

    C2531p() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final String mo7037() {
        C2533e[] values;
        for (C2533e eVar : C2533e.values()) {
            if (m7406(eVar.f7862)) {
                return eVar.f7863;
            }
        }
        return C2533e.DEFAULT.f7863;
    }

    /* renamed from: ˎ */
    public final Class<?> mo7036(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* renamed from: ˋ */
    private boolean m7406(String str) {
        try {
            this.f7854.mo7036(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }
}
