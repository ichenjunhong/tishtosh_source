package com.bytedance.liko.memoryexplorer.assemble;

public interface IAssembler<T> {
    void onAssemble(T t);

    void onFinish();
}
