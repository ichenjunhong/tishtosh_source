package com.bytedance.apm.agent.p470v2.instrumentation;

import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p497o.C9148a;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p498p.p500b.C9172a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.agent.v2.instrumentation.FragmentTimeAgent */
public class FragmentTimeAgent {
    private static final String TAG = "FragmentTimeAgent";
    public static long sCheckVisibilityStartTime = 0;
    public static String sFragmentName = null;
    public static long sMaxWaitTime = 60000;
    public static HashSet<String> sMethodSet = new HashSet<>(32);
    private static long sOnActivityCreatedEnd;
    private static long sOnActivityCreatedStart;
    private static long sOnCreateEnd;
    private static long sOnCreateStart;
    public static OnGlobalLayoutListener sOnGlobalLayoutListener;
    private static long sOnResumeEnd;
    private static long sOnResumeStart;
    private static long sOnViewCreatedEnd;
    private static long sOnViewCreatedStart;
    private static boolean sReported;
    public static WeakReference<View> sRootViewRef;
    public static Runnable sWaitViewTimeoutRunnable;

    private static boolean isValid(String str) {
        if (sReported || !TextUtils.equals(str, sFragmentName)) {
            return false;
        }
        return true;
    }

    public static void onHiddenChanged(Fragment fragment, boolean z) {
        if (!z) {
            try {
                String canonicalName = fragment.getClass().getCanonicalName();
                Integer a = C9172a.m18196a(canonicalName);
                if (a != null) {
                    if (a.intValue() > 0) {
                        registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a, System.currentTimeMillis(), "fragmentOnHiddenChangedToViewShow");
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void onResumeShow(Fragment fragment, String str) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            try {
                Integer a = C9172a.m18196a(str);
                if (a != null) {
                    if (a.intValue() > 0) {
                        registerOnGlobalLayoutListener(str, fragment.getView(), a, sOnCreateStart, "fragmentOnCreateToViewShow");
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (z && fragment.isResumed() && !fragment.isHidden()) {
            try {
                String canonicalName = fragment.getClass().getCanonicalName();
                Integer a = C9172a.m18196a(canonicalName);
                if (a != null) {
                    if (a.intValue() > 0) {
                        registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a, System.currentTimeMillis(), "fragmentUserVisibleToViewShow");
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void reportTraceTime(String str, String str2, long j, long j2) {
        C9149b a = C9149b.m18170a();
        final String str3 = str2;
        final long j3 = j;
        final long j4 = j2;
        C89332 r0 = new Runnable() {
            public final void run() {
                boolean contains = FragmentTimeAgent.sMethodSet.contains(FragmentTimeAgent.sFragmentName);
                FragmentTimeAgent.sMethodSet.add(FragmentTimeAgent.sFragmentName);
                FragmentTimeAgent.reportStats(contains, str3, j3, j4);
            }
        };
        a.mo16524a((Runnable) r0);
    }

    public static void onTrace(Fragment fragment, String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                sFragmentName = str;
                sOnCreateStart = System.currentTimeMillis();
                if (sMaxWaitTime == 0) {
                    sMaxWaitTime = ApmDelegate.m17947a().mo16436d().f24492c;
                }
                sReported = false;
            } else if (isValid(str)) {
                sOnCreateEnd = System.currentTimeMillis();
            }
        } else if (!TextUtils.equals("onViewCreated", str2) || !isValid(str)) {
            if (!TextUtils.equals("onActivityCreated", str2) || !isValid(str)) {
                if (TextUtils.equals("onResume", str2) && isValid(str)) {
                    if (z) {
                        if (sOnCreateStart > 0) {
                            sOnResumeStart = System.currentTimeMillis();
                            onResumeShow(fragment, str);
                        }
                    } else if (sOnCreateStart > 0) {
                        sOnResumeEnd = System.currentTimeMillis();
                        try {
                            Integer a = C9172a.m18196a(str);
                            if (a == null || a.intValue() <= 0) {
                                C9149b.m18170a().mo16524a((Runnable) new Runnable() {
                                    public final void run() {
                                        boolean contains = FragmentTimeAgent.sMethodSet.contains(FragmentTimeAgent.sFragmentName);
                                        FragmentTimeAgent.sMethodSet.add(FragmentTimeAgent.sFragmentName);
                                        FragmentTimeAgent.reportStats(contains, null, 0, 0);
                                    }
                                });
                            }
                        } catch (Exception unused) {
                        }
                        sReported = true;
                        sFragmentName = null;
                    }
                }
            } else if (z) {
                if (sOnCreateStart > 0) {
                    sOnActivityCreatedStart = System.currentTimeMillis();
                }
            } else if (sOnCreateStart > 0) {
                sOnActivityCreatedEnd = System.currentTimeMillis();
            }
        } else if (z) {
            if (sOnCreateStart > 0) {
                sOnViewCreatedStart = System.currentTimeMillis();
            }
        } else if (sOnCreateStart > 0) {
            sOnViewCreatedEnd = System.currentTimeMillis();
        }
    }

    public static void reportStats(boolean z, String str, long j, long j2) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LeakCanaryFileProvider.f132049i, "onCreate");
            jSONObject.put("start", sOnCreateStart);
            jSONObject.put("end", sOnCreateEnd);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(LeakCanaryFileProvider.f132049i, "onViewCreated");
            jSONObject2.put("start", sOnViewCreatedStart);
            jSONObject2.put("end", sOnViewCreatedEnd);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(LeakCanaryFileProvider.f132049i, "onActivityCreated");
            jSONObject3.put("start", sOnActivityCreatedStart);
            jSONObject3.put("end", sOnActivityCreatedEnd);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(LeakCanaryFileProvider.f132049i, "onResume");
            jSONObject4.put("start", sOnResumeStart);
            jSONObject4.put("end", sOnResumeEnd);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            jSONArray.put(jSONObject3);
            jSONArray.put(jSONObject4);
            if (str != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(LeakCanaryFileProvider.f132049i, str);
                jSONObject5.put("start", j);
                jSONObject5.put("end", j2);
                jSONArray.put(jSONObject5);
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(LeakCanaryFileProvider.f132049i, "page_load_stats");
            jSONObject6.put("page_type", "fragment");
            jSONObject6.put("start", sOnCreateStart);
            jSONObject6.put("spans", jSONArray);
            String str2 = "launch_mode";
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            jSONObject6.put(str2, i);
            jSONObject6.put("collect_from", 1);
            jSONObject6.put("page_name", sFragmentName);
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("trace", jSONObject6);
            MonitorTool.monitorPerformance("page_load_trace", null, null, jSONObject7);
        } catch (Exception unused) {
        }
    }

    private static void registerOnGlobalLayoutListener(String str, View view, final Integer num, final long j, final String str2) {
        if (num != null && num.intValue() > 0) {
            sFragmentName = str;
            if (!(sRootViewRef == null || sRootViewRef.get() == view)) {
                ViewTreeObserver viewTreeObserver = ((View) sRootViewRef.get()).getViewTreeObserver();
                if (viewTreeObserver.isAlive() && sOnGlobalLayoutListener != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(sOnGlobalLayoutListener);
                }
                if (sWaitViewTimeoutRunnable != null) {
                    C9148a.m18169a().removeCallbacks(sWaitViewTimeoutRunnable);
                }
            }
            sRootViewRef = new WeakReference<>(view);
            sCheckVisibilityStartTime = 0;
            sOnGlobalLayoutListener = new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    try {
                        if (FragmentTimeAgent.sRootViewRef != null) {
                            if (FragmentTimeAgent.sRootViewRef.get() != null) {
                                View findViewById = ((View) FragmentTimeAgent.sRootViewRef.get()).findViewById(num.intValue());
                                if (FragmentTimeAgent.sCheckVisibilityStartTime == 0) {
                                    FragmentTimeAgent.sCheckVisibilityStartTime = System.currentTimeMillis();
                                }
                                if (findViewById != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (((View) FragmentTimeAgent.sRootViewRef.get()).getViewTreeObserver().isAlive() && FragmentTimeAgent.sOnGlobalLayoutListener != null) {
                                        ((View) FragmentTimeAgent.sRootViewRef.get()).getViewTreeObserver().removeOnGlobalLayoutListener(FragmentTimeAgent.sOnGlobalLayoutListener);
                                    }
                                    FragmentTimeAgent.sOnGlobalLayoutListener = null;
                                    FragmentTimeAgent.sRootViewRef = null;
                                    if (FragmentTimeAgent.sWaitViewTimeoutRunnable != null) {
                                        C9148a.m18169a().removeCallbacks(FragmentTimeAgent.sWaitViewTimeoutRunnable);
                                    }
                                    long j = currentTimeMillis - j;
                                    if (currentTimeMillis - FragmentTimeAgent.sCheckVisibilityStartTime > 1 && j < FragmentTimeAgent.sMaxWaitTime) {
                                        FragmentTimeAgent.reportTraceTime(FragmentTimeAgent.sFragmentName, str2, j, currentTimeMillis);
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            view.getViewTreeObserver().addOnGlobalLayoutListener(sOnGlobalLayoutListener);
            sWaitViewTimeoutRunnable = new Runnable() {
                public final void run() {
                    try {
                        if (!(FragmentTimeAgent.sOnGlobalLayoutListener == null || FragmentTimeAgent.sRootViewRef == null || FragmentTimeAgent.sRootViewRef.get() == null)) {
                            ((View) FragmentTimeAgent.sRootViewRef.get()).getViewTreeObserver().removeOnGlobalLayoutListener(FragmentTimeAgent.sOnGlobalLayoutListener);
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            C9148a.m18169a().postDelayed(sWaitViewTimeoutRunnable, sMaxWaitTime);
        }
    }
}
