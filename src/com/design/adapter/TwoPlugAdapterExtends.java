package com.design.adapter;

/**
 * Created by yunfei on 2017/3/20.
 */
public class TwoPlugAdapterExtends extends TwoPlug implements ThreePlugIf {
    @Override
    public void powerWithThree() {
        this.powerWithTwo();
    }
}
