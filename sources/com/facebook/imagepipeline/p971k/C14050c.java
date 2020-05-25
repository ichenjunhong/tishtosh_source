package com.facebook.imagepipeline.p971k;

import com.facebook.imagepipeline.p974n.C14142ap;
import com.facebook.imagepipeline.p975o.C14229b;

/* renamed from: com.facebook.imagepipeline.k.c */
public interface C14050c extends C14142ap {
    void onRequestCancellation(String str);

    void onRequestFailure(C14229b bVar, String str, Throwable th, boolean z);

    void onRequestStart(C14229b bVar, Object obj, String str, boolean z);

    void onRequestSuccess(C14229b bVar, String str, boolean z);
}
