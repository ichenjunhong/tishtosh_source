package com.p683ss.android.ugc.aweme.global.config.settings._default;

import com.bytedance.ies.p659c.C10617a;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings.Builder;
import com.squareup.wire.DefaultValueGroup;
import com.squareup.wire.Message;
import com.squareup.wire.WireDeserializeErrorListener;
import com.squareup.wire.WireTypeAdapterFactory;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings._default.AbstractSettingsGroup */
public abstract class AbstractSettingsGroup implements DefaultValueGroup<IESSettings, Builder> {
    protected WireTypeAdapterFactory mFactory;
    protected WireDeserializeErrorListener mListener;

    /* access modifiers changed from: protected */
    public abstract void addOptionalObjectDefaultValue();

    /* access modifiers changed from: protected */
    public <T extends Message> void registerDefaultValue(T t) {
        C10617a.m21405a().f28145a.put(t.getClass(), t);
        this.mFactory.registerDefaultValue(t, this.mListener);
    }

    public void registerOptionalObjectDefaultValue(WireTypeAdapterFactory wireTypeAdapterFactory, WireDeserializeErrorListener wireDeserializeErrorListener) {
        this.mFactory = wireTypeAdapterFactory;
        this.mListener = wireDeserializeErrorListener;
        addOptionalObjectDefaultValue();
    }
}
