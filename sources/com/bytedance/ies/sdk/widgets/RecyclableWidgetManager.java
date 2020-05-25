package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0176h.C0178b;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.common.utility.C9415i;
import java.util.List;

public class RecyclableWidgetManager extends WidgetManager {
    private static final IWidgetProvider DEFAULT_WIDGET_PROVIDER = new IWidgetProvider() {
        public final <T extends IRecyclableWidget> T provide(Class<T> cls) {
            try {
                return (IRecyclableWidget) cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        }
    };
    private IWidgetProvider mWidgetProvider = DEFAULT_WIDGET_PROVIDER;

    public List<Widget> getWidgetList() {
        return this.widgets;
    }

    public void setWidgetProvider(IWidgetProvider iWidgetProvider) {
        this.mWidgetProvider = iWidgetProvider;
    }

    public <T extends LiveRecyclableWidget> T load(Class<T> cls) {
        T t = (LiveRecyclableWidget) this.mWidgetProvider.provide(cls);
        t.setWidgetCallback(this.widgetCallback);
        t.context = this.context;
        t.dataCenter = this.dataCenter;
        this.widgets.add(t);
        getLifecycle().mo324a(t);
        return t;
    }

    /* renamed from: of */
    public static RecyclableWidgetManager m22271of(Fragment fragment, View view) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager();
        recyclableWidgetManager.config(null, fragment, view, fragment.getContext());
        return recyclableWidgetManager;
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls) {
        return load(i, cls, true);
    }

    private void continueLoadForMergeTag(Widget widget, View view) {
        if (widget.containerView != null) {
            widget.contentView = view;
            this.widgets.add(widget);
            getLifecycle().mo324a(widget);
        }
    }

    /* renamed from: of */
    public static RecyclableWidgetManager m22272of(FragmentActivity fragmentActivity, View view) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager();
        recyclableWidgetManager.config(fragmentActivity, null, view, fragmentActivity);
        return recyclableWidgetManager;
    }

    public <T extends LiveRecyclableWidget> T load(ViewGroup viewGroup, Class<T> cls) {
        return load(viewGroup, cls, true);
    }

    private <T extends LiveRecyclableWidget> T load(ViewGroup viewGroup, Class<T> cls, boolean z) {
        return load(viewGroup, cls, z, (Object[]) null);
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z) {
        return load(i, cls, z, (Object[]) null);
    }

    public void continueLoad(Widget widget, ViewGroup viewGroup, View view) {
        if (widget.containerView != null) {
            if (!(view == null || view == null || view.getParent() == null)) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    try {
                        ((ViewGroup) parent).removeView(view);
                    } catch (Exception e) {
                        C9415i.m18634a((Throwable) e);
                    }
                }
            }
            super.continueLoad(widget, viewGroup, view);
        }
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z, Object[] objArr) {
        return load((ViewGroup) this.contentView.findViewById(i), cls, z, objArr);
    }

    public <T extends LiveRecyclableWidget> T load(ViewGroup viewGroup, Class<T> cls, boolean z, Object[] objArr) {
        T t = (LiveRecyclableWidget) this.mWidgetProvider.provide(cls);
        t.setArgs(objArr);
        t.setWidgetCallback(this.widgetCallback);
        t.context = this.context;
        t.dataCenter = this.dataCenter;
        t.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(t, viewGroup);
        if (t.isInitialized()) {
            if (t.startWithMergeTag()) {
                continueLoadForMergeTag(t, t.contentView);
            } else {
                try {
                    continueLoad(t, viewGroup, t.contentView);
                } catch (Exception e) {
                    throw new RuntimeException(this.syncLayoutInflater.getContext().getResources().getClass().getName(), e);
                }
            }
            return t;
        } else if (t.getLayoutId() == 0) {
            continueLoad(t, viewGroup, null);
            return t;
        } else if (z) {
            this.asyncLayoutInflater.mo3205a(t.getLayoutId(), viewGroup, new RecyclableWidgetManager$$Lambda$0(this, t, viewGroup));
            return t;
        } else if (t.startWithMergeTag()) {
            continueLoadForMergeTag(t, this.syncLayoutInflater.inflate(t.getLayoutId(), viewGroup, true));
            return t;
        } else {
            continueLoad(t, viewGroup, this.syncLayoutInflater.inflate(t.getLayoutId(), viewGroup, false));
            return t;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$load$0$RecyclableWidgetManager(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (!isRemoving() && !isDetached() && getLifecycle().mo323a() != C0178b.DESTROYED) {
            continueLoad(liveRecyclableWidget, viewGroup, view);
        }
    }
}
