package com.ykb.training.dp.behavioral.strategy;

import com.ykb.training.dp.behavioral.strategy.inher.IAsker;

public class Asker implements IAsker {
    private IVurusKapasitesi vk;

    public Asker(final IVurusKapasitesi vk) {
        super();
        this.vk = vk;
    }

    @Override
    public void atesEt() {
        this.vk.atesEt();

    }

}
