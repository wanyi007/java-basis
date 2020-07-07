package com.huobi.designPatterns.prototypeMode;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns.prototypeMode
 * @date 2019-12-06 17:31
 */
public class ConcretePrototypel extends Prototype {
    public ConcretePrototypel(String id) {
        super(id);
    }

    @Override
    public Prototype Clone() {
        return (Prototype)this.Clone();
    }
}
