package com.bytedance.apm.agent.instrumentation.okhttp3;

import okhttp3.C53524e;
import okhttp3.C53664p;
import okhttp3.C53664p.C53667a;

public class OkHttpEventFactory implements C53667a {
    public C53667a originFactory;

    public OkHttpEventFactory(C53667a aVar) {
        this.originFactory = aVar;
    }

    public C53664p create(C53524e eVar) {
        C53664p pVar;
        if (this.originFactory != null) {
            pVar = this.originFactory.create(eVar);
        } else {
            pVar = null;
        }
        return new OkHttpEventListener(pVar);
    }
}
