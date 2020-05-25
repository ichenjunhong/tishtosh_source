package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.C1028c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.widgets.Widget.WidgetCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class WidgetManager extends Fragment {
    public static final String TAG = WidgetManager.class.getCanonicalName();
    public C1028c asyncLayoutInflater;
    public boolean configured;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public C0655a parentDestroyedCallback = new C0655a() {
        public void onFragmentViewDestroyed(C0654k kVar, Fragment fragment) {
            if (fragment == WidgetManager.this.parentFragment) {
                kVar.mo2228a(WidgetManager.this.parentDestroyedCallback);
                fragment.getChildFragmentManager().mo2225a().mo2177a((Fragment) WidgetManager.this).mo2200e();
            }
        }
    };
    public Fragment parentFragment;
    public LayoutInflater syncLayoutInflater;
    public WidgetCallback widgetCallback = new WidgetCallback() {
        public Fragment getFragment() {
            return WidgetManager.this;
        }

        public void startActivity(Intent intent) {
            WidgetManager.this.startActivity(intent);
        }

        public <T extends C0209x> T getViewModel(Class<T> cls) {
            if (WidgetManager.this.parentFragment != null) {
                return C0214z.m438a(WidgetManager.this.parentFragment).mo359a(cls);
            }
            return C0214z.m440a(WidgetManager.this.getActivity()).mo359a(cls);
        }

        public void startActivityForResult(Intent intent, int i) {
            WidgetManager.this.startActivityForResult(intent, i);
        }

        public void startActivity(Intent intent, Bundle bundle) {
            WidgetManager.this.startActivity(intent, bundle);
        }

        public <T extends C0209x> T getViewModel(Class<T> cls, C0212b bVar) {
            if (WidgetManager.this.parentFragment != null) {
                return C0214z.m439a(WidgetManager.this.parentFragment, bVar).mo359a(cls);
            }
            return C0214z.m441a(WidgetManager.this.getActivity(), bVar).mo359a(cls);
        }

        public void startActivityForResult(Intent intent, int i, Bundle bundle) {
            WidgetManager.this.startActivityForResult(intent, i, bundle);
        }
    };
    public Map<Widget, ViewGroup> widgetViewGroupHashMap = new HashMap();
    public List<Widget> widgets = new CopyOnWriteArrayList();

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    public void onDestroy() {
        super.onDestroy();
        this.parentFragment = null;
        this.widgets.clear();
        this.widgetViewGroupHashMap.clear();
        this.dataCenter = null;
    }

    public WidgetManager load(Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.dataCenter = this.dataCenter;
        this.widgets.add(widget);
        getLifecycle().mo324a(widget);
        return this;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (Widget onConfigurationChanged : this.widgets) {
            onConfigurationChanged.onConfigurationChanged(configuration);
        }
    }

    public WidgetManager setDataCenter(DataCenter dataCenter2) {
        this.dataCenter = dataCenter2;
        for (Widget widget : this.widgets) {
            widget.dataCenter = dataCenter2;
        }
        return this;
    }

    public WidgetManager unload(Widget widget) {
        if (widget == null) {
            return this;
        }
        getLifecycle().mo325b(widget);
        if (widget.isViewValid) {
            switch (getLifecycle().mo323a()) {
                case DESTROYED:
                    if (!widget.isDestroyed) {
                        widget.onDestroy();
                        break;
                    }
                    break;
                case CREATED:
                    widget.onDestroy();
                    break;
                case STARTED:
                    widget.onStop();
                    widget.onDestroy();
                    break;
                case RESUMED:
                    widget.onPause();
                    widget.onStop();
                    widget.onDestroy();
                    break;
            }
        }
        widget.containerView = null;
        widget.context = null;
        widget.widgetCallback = null;
        widget.dataCenter = null;
        this.widgets.remove(widget);
        if (this.widgetViewGroupHashMap.containsKey(widget)) {
            ((ViewGroup) this.widgetViewGroupHashMap.get(widget)).removeAllViews();
            this.widgetViewGroupHashMap.remove(widget);
        }
        return this;
    }

    public WidgetManager load(int i, Widget widget) {
        return load(i, widget, true);
    }

    /* renamed from: of */
    public static WidgetManager m22273of(Fragment fragment, View view) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(null, fragment, view, fragment.getContext());
        return widgetManager;
    }

    /* renamed from: of */
    public static WidgetManager m22274of(FragmentActivity fragmentActivity, View view) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(fragmentActivity, null, view, fragmentActivity);
        return widgetManager;
    }

    public void continueLoad(Widget widget, ViewGroup viewGroup, View view) {
        if (widget.containerView != null) {
            widget.contentView = view;
            if (!(viewGroup == null || view == null)) {
                viewGroup.addView(view);
            }
            this.widgets.add(widget);
            getLifecycle().mo324a(widget);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (Widget onActivityResult : this.widgets) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public WidgetManager load(int i, Widget widget, boolean z) {
        if (widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.dataCenter = this.dataCenter;
        ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(i);
        widget.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(widget, viewGroup);
        if (widget.getLayoutId() == 0) {
            continueLoad(widget, viewGroup, null);
            return this;
        } else if (z) {
            this.asyncLayoutInflater.mo3205a(widget.getLayoutId(), viewGroup, new WidgetManager$$Lambda$0(this, widget, viewGroup));
            return this;
        } else {
            continueLoad(widget, viewGroup, this.syncLayoutInflater.inflate(widget.getLayoutId(), viewGroup, false));
            return this;
        }
    }

    public void config(FragmentActivity fragmentActivity, Fragment fragment, View view, Context context2) {
        C0654k kVar;
        if (!this.configured) {
            if (fragmentActivity != null) {
                kVar = fragmentActivity.getSupportFragmentManager();
            } else if (fragment != null) {
                kVar = fragment.getChildFragmentManager();
            } else {
                return;
            }
            this.parentFragment = fragment;
            this.contentView = view;
            this.context = context2;
            this.asyncLayoutInflater = new C1028c(context2);
            this.syncLayoutInflater = LayoutInflater.from(context2);
            if (!(fragment == null || fragment.getFragmentManager() == null)) {
                fragment.getFragmentManager().mo2229a(this.parentDestroyedCallback, false);
            }
            kVar.mo2225a().mo2178a((Fragment) this, TAG).mo2200e();
            this.configured = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$load$0$WidgetManager(Widget widget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (!isRemoving() && !isDetached() && getLifecycle().mo323a() != C0178b.DESTROYED) {
            continueLoad(widget, viewGroup, view);
        }
    }
}
