package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.measurement.internal.C16980a;
import com.google.android.gms.measurement.internal.C16981aa;
import com.google.android.gms.measurement.internal.C17005ay;
import com.google.android.gms.measurement.internal.C17010bc;
import com.google.android.gms.measurement.internal.C17033bz;
import com.google.android.gms.measurement.internal.C17038cd;
import com.google.android.gms.measurement.internal.C17049co;
import com.google.android.gms.measurement.internal.C17128m;
import java.util.List;
import java.util.Map;

public class AppMeasurement {

    /* renamed from: a */
    public final C17005ay f47848a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            C15464q.m32123a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            if (conditionalUserProperty.mValue != null) {
                this.mValue = C17049co.m41391a(conditionalUserProperty.mValue);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public static final class C16978a extends C17033bz {
    }

    public static AppMeasurement getInstance(Context context) {
        return C17005ay.m41256a(context, (C17128m) null).f47969h;
    }

    public AppMeasurement(C17005ay ayVar) {
        C15464q.m32123a(ayVar);
        this.f47848a = ayVar;
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f47848a.mo32925d().mo32991a(str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo32790a(String str, String str2, Object obj) {
        C15464q.m32125a(str);
        this.f47848a.mo32925d().mo32994a(str, str2, obj, true);
    }

    public String getCurrentScreenName() {
        return this.f47848a.mo32925d().mo32999w();
    }

    public String getCurrentScreenClass() {
        return this.f47848a.mo32925d().mo33000x();
    }

    public String getAppInstanceId() {
        return (String) this.f47848a.mo32925d().f48076b.get();
    }

    public String getGmpAppId() {
        return this.f47848a.mo32925d().mo33001y();
    }

    public long generateEventId() {
        return this.f47848a.mo32926e().mo33153f();
    }

    public void beginAdUnitExposure(String str) {
        C16980a o = this.f47848a.mo32934o();
        long b = this.f47848a.mo32849l().mo28524b();
        if (str == null || str.length() == 0) {
            o.mo32854q().f48445b.mo33376a("Ad unit id must be a non-empty string");
        } else {
            o.mo32853p().mo32912a((Runnable) new C16981aa(o, str, b));
        }
    }

    public void endAdUnitExposure(String str) {
        C16980a o = this.f47848a.mo32934o();
        long b = this.f47848a.mo32849l().mo28524b();
        if (str == null || str.length() == 0) {
            o.mo32854q().f48445b.mo33376a("Ad unit id must be a non-empty string");
        } else {
            o.mo32853p().mo32912a((Runnable) new C17010bc(o, str, b));
        }
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C17038cd d = this.f47848a.mo32925d();
        C15464q.m32123a(conditionalUserProperty);
        ConditionalUserProperty conditionalUserProperty2 = new ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            d.mo32854q().f48448e.mo33376a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        d.mo32988a(conditionalUserProperty2);
    }

    /* access modifiers changed from: protected */
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        C17038cd d = this.f47848a.mo32925d();
        C15464q.m32123a(conditionalUserProperty);
        C15464q.m32125a(conditionalUserProperty.mAppId);
        d.mo32834a();
        d.mo32988a(new ConditionalUserProperty(conditionalUserProperty));
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f47848a.mo32925d().mo32995a((String) null, str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        C17038cd d = this.f47848a.mo32925d();
        C15464q.m32125a(str);
        d.mo32834a();
        d.mo32995a(str, str2, str3, bundle);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f47848a.mo32925d().mo32987a((String) null, str, str2, z);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        C17038cd d = this.f47848a.mo32925d();
        C15464q.m32125a(str);
        d.mo32834a();
        return d.mo32987a(str, str2, str3, z);
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.f47848a.mo32925d().mo32986a((String) null, str, str2);
    }

    /* access modifiers changed from: protected */
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        C17038cd d = this.f47848a.mo32925d();
        C15464q.m32125a(str);
        d.mo32834a();
        return d.mo32986a(str, str2, str3);
    }

    public int getMaxUserProperties(String str) {
        this.f47848a.mo32925d();
        C15464q.m32125a(str);
        return 25;
    }
}
