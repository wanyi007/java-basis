package com.huobi.designPatterns.DecoratorMode;

/**
 * @author wanyi
 * @version V1.0
 * 服饰类
 * @Package com.huobi.designPatterns.DecoratorMode
 * @date 2019-12-06 16:03
 */
public class Finery_v2 extends Person_v2 {
    protected Person_v2 component;

    public void Decorate (Person_v2 component){
        this.component = component;
    }

    @Override
    public void Show() {
        if (component != null){
            component.Show();
        }
    }
}
