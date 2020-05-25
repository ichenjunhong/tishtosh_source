package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.p522b.C9379e;
import com.p683ss.android.common.applog.TeaAgent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.utils.ActivityStack */
public final class ActivityStack {
    public static ActivityLifecycleCallbacks lifecycleCallbacks = new ActivityLifecycleCallbacks() {
        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            synchronized (ActivityStack.class) {
                ActivityStack.sActivityStack.remove(activity);
            }
        }

        public final void onActivityStarted(Activity activity) {
            synchronized (ActivityStack.class) {
                ActivityStack.sStartedActivities.mo17005a(activity);
            }
        }

        public final void onActivityResumed(Activity activity) {
            synchronized (ActivityStack.class) {
                if (ActivityStack.sAppBackGround) {
                    ActivityStack.sAppBackGround = false;
                    if (!ActivityStack.sAppBackgroundListeners.mo17007b()) {
                        Iterator it = ActivityStack.sAppBackgroundListeners.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
            }
        }

        public final void onActivityStopped(Activity activity) {
            synchronized (ActivityStack.class) {
                ActivityStack.sStartedActivities.mo17006b(activity);
                if (!ActivityStack.sAppBackGround && ActivityStack.sStartedActivities.mo17007b()) {
                    ActivityStack.sAppBackGround = true;
                    if (!ActivityStack.sAppBackgroundListeners.mo17007b()) {
                        Iterator it = ActivityStack.sAppBackgroundListeners.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            synchronized (ActivityStack.class) {
                ActivityStack.sActivityStack.remove(activity);
                ActivityStack.sActivityStack.add(activity);
            }
            TeaAgent.onActivityCreate((Context) activity);
        }
    };
    static LinkedList<Activity> sActivityStack = new LinkedList<>();
    static boolean sAppBackGround = true;
    static C9379e<C47646b> sAppBackgroundListeners = new C9379e<>();
    static C9379e<Activity> sStartedActivities = new C9379e<>();

    /* renamed from: com.ss.android.ugc.aweme.utils.ActivityStack$a */
    public interface C47645a {
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ActivityStack$b */
    public interface C47646b {
    }

    public static boolean isAppBackGround() {
        return sAppBackGround;
    }

    public static synchronized Activity[] getActivityStack() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            activityArr = (Activity[]) sActivityStack.toArray(new Activity[sActivityStack.size()]);
        }
        return activityArr;
    }

    public static synchronized Activity getTopActivity() {
        synchronized (ActivityStack.class) {
            if (sActivityStack.isEmpty()) {
                return null;
            }
            Activity activity = (Activity) sActivityStack.getLast();
            return activity;
        }
    }

    public static synchronized Activity getValidTopActivity() {
        Activity topActivity;
        synchronized (ActivityStack.class) {
            topActivity = getTopActivity();
            if (topActivity != null && topActivity.isFinishing()) {
                sActivityStack.removeLast();
                topActivity = getValidTopActivity();
            }
        }
        return topActivity;
    }

    public static synchronized Activity getPreviousActivity() {
        synchronized (ActivityStack.class) {
            if (sActivityStack.size() < 2) {
                return null;
            }
            LinkedList<Activity> linkedList = sActivityStack;
            Activity activity = (Activity) linkedList.get(linkedList.size() - 2);
            return activity;
        }
    }

    public static synchronized Activity[] getStartedActivitys() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            ArrayList arrayList = new ArrayList();
            Iterator it = sStartedActivities.iterator();
            while (it != null && it.hasNext()) {
                Activity activity = (Activity) it.next();
                if (activity != null) {
                    arrayList.add(activity);
                }
            }
            activityArr = (Activity[]) arrayList.toArray(new Activity[arrayList.size()]);
        }
        return activityArr;
    }

    public static synchronized void removeAppBackGroundListener(C47646b bVar) {
        synchronized (ActivityStack.class) {
            if (bVar != null) {
                sAppBackgroundListeners.mo17006b(bVar);
            }
        }
    }

    public static synchronized void addAppBackGroundListener(C47646b bVar) {
        synchronized (ActivityStack.class) {
            if (bVar != null) {
                if (!sAppBackgroundListeners.f25609a.containsKey(bVar)) {
                    sAppBackgroundListeners.mo17005a(bVar);
                }
            }
        }
    }

    public static void finishAllFlipChatActivity(Class<?> cls) {
        Iterator it = sActivityStack.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (cls.isInstance(activity) && !(activity instanceof C47645a)) {
                activity.finish();
            }
        }
    }

    public static synchronized Activity getPreviousActivity(Activity activity) {
        Activity activity2;
        synchronized (ActivityStack.class) {
            LinkedList<Activity> linkedList = sActivityStack;
            activity2 = null;
            int size = linkedList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Activity activity3 = (Activity) linkedList.get(size);
                if (activity3 == activity || activity3.getTaskId() != activity.getTaskId()) {
                    int i = size - 1;
                    if (i >= 0) {
                        activity2 = (Activity) linkedList.get(i);
                        break;
                    }
                }
                size--;
            }
        }
        return activity2;
    }
}
