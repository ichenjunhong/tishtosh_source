package com.bytedance.android.livesdkapi.depend.model;

import com.bytedance.android.live.base.model.ImageModel;

public class TextImageModel extends ImageModel {

    /* renamed from: a */
    public String f23707a;

    /* renamed from: b */
    public int f23708b;

    /* renamed from: c */
    public int f23709c;

    /* renamed from: d */
    public int f23710d;

    public TextImageModel(int i) {
        this.f23709c = 2;
        this.f23710d = i;
    }

    public TextImageModel(ImageModel imageModel, int i) {
        setAvgColor(imageModel.getAvgColor());
        setUri(imageModel.getUri());
        setUrls(imageModel.getUrls());
        setWidth(imageModel.getWidth());
        setHeight(imageModel.getHeight());
        this.f23708b = 0;
        this.f23709c = i;
    }
}
