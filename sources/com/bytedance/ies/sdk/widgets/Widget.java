package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;

public abstract class Widget implements C0183j, C0184k {
    public ViewGroup containerView;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public boolean isDestroyed;
    public boolean isViewValid;
    public C0185l lifecycleRegistry = new C0185l(this);
    public WidgetManager subWidgetManager;
    public WidgetCallback widgetCallback;

    public interface WidgetCallback {
        Fragment getFragment();

        <T extends C0209x> T getViewModel(Class<T> cls);

        <T extends C0209x> T getViewModel(Class<T> cls, C0212b bVar);

        void startActivity(Intent intent);

        void startActivity(Intent intent, Bundle bundle);

        void startActivityForResult(Intent intent, int i);

        void startActivityForResult(Intent intent, int i, Bundle bundle);
    }

    public int getLayoutId() {
        return 0;
    }

    public C0176h getLifecycle() {
        return this.lifecycleRegistry;
    }

    public boolean isViewValid() {
        return this.isViewValid;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        this.lifecycleRegistry.mo332a(C0177a.ON_PAUSE);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        this.lifecycleRegistry.mo332a(C0177a.ON_RESUME);
    }

    @C0200t(mo345a = C0177a.ON_START)
    public void onStart() {
        this.lifecycleRegistry.mo332a(C0177a.ON_START);
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
        this.lifecycleRegistry.mo332a(C0177a.ON_STOP);
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
        this.isViewValid = true;
        this.isDestroyed = false;
        this.lifecycleRegistry.mo332a(C0177a.ON_CREATE);
    }

    public void enableSubWidgetManager() {
        if (this.subWidgetManager == null) {
            this.subWidgetManager = WidgetManager.m22273of(this.widgetCallback.getFragment(), this.contentView);
            this.subWidgetManager.setDataCenter(this.dataCenter);
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.lifecycleRegistry.mo332a(C0177a.ON_DESTROY);
        if (this.subWidgetManager != null) {
            this.widgetCallback.getFragment().getChildFragmentManager().mo2225a().mo2177a((Fragment) this.subWidgetManager).mo2200e();
        }
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    public void setWidgetCallback(WidgetCallback widgetCallback2) {
        this.widgetCallback = widgetCallback2;
    }

    public <T extends C0209x> T getViewModel(Class<T> cls) {
        return this.widgetCallback.getViewModel(cls);
    }

    public void startActivity(Intent intent) {
        this.widgetCallback.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        this.widgetCallback.startActivityForResult(intent, i);
    }

    public <T extends C0209x> T getViewModel(Class<T> cls, C0212b bVar) {
        return this.widgetCallback.getViewModel(cls, bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        this.widgetCallback.startActivity(intent, bundle);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.widgetCallback.startActivityForResult(intent, i, bundle);
    }
}
