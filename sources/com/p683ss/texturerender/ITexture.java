package com.p683ss.texturerender;

/* renamed from: com.ss.texturerender.ITexture */
public interface ITexture extends IRef {
    int lock();

    int tryLock(int i);

    void unlock();
}
